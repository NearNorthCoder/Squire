#!/usr/bin/env python3
"""
Live URL Downloader for Squire

This script watches a log file for new signed S3 URLs and downloads them immediately.
Run this WHILE the Squire launcher is running to capture and download files before URLs expire.

Usage:
  1. Start Squire with: java -jar dist/squire-with-plugin-logging.jar
  2. In another terminal: python scripts/live_download.py
  3. Files will be downloaded as URLs appear in the logs
"""

import os
import re
import sys
import time
import requests
from pathlib import Path
from datetime import datetime
import hashlib
import json

# Where to save downloaded files
OUTPUT_DIR = "downloaded_plugins"

# Pattern to match S3 signed URLs
S3_URL_PATTERN = re.compile(
    r'https://squire-bootload-storage\.s3\.amazonaws\.com/[^\s"\'<>]+\?[^\s"\'<>]+'
)

# Also match squire-hosting URLs (non-signed)
HOSTING_URL_PATTERN = re.compile(
    r'https://squire-hosting\.s3[^"\s\'<>]+\.jar[^\s"\'<>]*'
)

# Track downloaded files to avoid duplicates
downloaded = set()
download_log = []

def get_log_dir():
    """Get the Squire logs directory."""
    user_home = os.path.expanduser("~")
    return os.path.join(user_home, ".squire", "logs")

def find_latest_log():
    """Find the most recent log file."""
    log_dir = get_log_dir()
    if not os.path.exists(log_dir):
        return None

    # Look for network logs, URL logs, or plugin logs
    patterns = ["network_*.log", "urls_*.txt", "plugin_downloads_*.log", "api_calls_*.log"]
    latest = None
    latest_time = 0

    for pattern in patterns:
        for f in Path(log_dir).glob(pattern):
            mtime = f.stat().st_mtime
            if mtime > latest_time:
                latest_time = mtime
                latest = f

    return latest

def extract_filename(url):
    """Extract a reasonable filename from a URL."""
    # Try to get the JAR name
    match = re.search(r'/([^/]+\.jar)', url)
    if match:
        return match.group(1)

    # Try UUID pattern
    match = re.search(r'/([a-f0-9-]{36})\.jar', url)
    if match:
        return match.group(1) + ".jar"

    # Fallback to hash
    return hashlib.md5(url.encode()).hexdigest()[:16] + ".jar"

def download_url(url, output_dir):
    """Download a URL immediately."""
    filename = extract_filename(url)
    filepath = os.path.join(output_dir, filename)

    # Skip if already downloaded
    if url in downloaded or os.path.exists(filepath):
        return None

    downloaded.add(url)

    print(f"\n{'='*60}")
    print(f"[{datetime.now().strftime('%H:%M:%S')}] DOWNLOADING: {filename}")
    print(f"{'='*60}")

    try:
        response = requests.get(url, stream=True, timeout=60)

        if response.status_code == 200:
            # Check if it's an error response (XML)
            content_type = response.headers.get('Content-Type', '')
            if 'xml' in content_type.lower():
                # Likely an error
                text = response.text[:500]
                if 'AccessDenied' in text or 'expired' in text.lower():
                    print(f"  ERROR: URL has expired!")
                    print(f"  {text[:200]}")
                    return "expired"

            # Download the file
            total_size = int(response.headers.get('content-length', 0))
            with open(filepath, 'wb') as f:
                downloaded_size = 0
                for chunk in response.iter_content(chunk_size=8192):
                    f.write(chunk)
                    downloaded_size += len(chunk)
                    if total_size > 0:
                        pct = (downloaded_size / total_size) * 100
                        print(f"\r  Progress: {pct:.1f}% ({downloaded_size:,} / {total_size:,} bytes)", end='')

            print(f"\n  SUCCESS: Saved to {filepath}")
            download_log.append({
                "url": url,
                "file": filepath,
                "size": os.path.getsize(filepath),
                "time": datetime.now().isoformat()
            })
            return filepath

        else:
            print(f"  ERROR: HTTP {response.status_code}")
            print(f"  {response.text[:200]}")
            return None

    except Exception as e:
        print(f"  ERROR: {e}")
        return None

def watch_log_file(log_path, output_dir):
    """Watch a log file for new URLs and download them."""
    print(f"\nWatching: {log_path}")
    print(f"Output: {output_dir}")
    print("Press Ctrl+C to stop\n")

    # Create output directory
    os.makedirs(output_dir, exist_ok=True)

    # Start from end of file
    with open(log_path, 'r') as f:
        f.seek(0, 2)  # Go to end

        while True:
            line = f.readline()
            if line:
                # Check for S3 signed URLs
                for match in S3_URL_PATTERN.finditer(line):
                    url = match.group(0)
                    download_url(url, output_dir)

                # Check for hosting URLs
                for match in HOSTING_URL_PATTERN.finditer(line):
                    url = match.group(0)
                    download_url(url, output_dir)
            else:
                time.sleep(0.1)  # Brief pause before checking for more

def scan_existing_logs(output_dir):
    """Scan existing log files for URLs."""
    log_dir = get_log_dir()
    if not os.path.exists(log_dir):
        print(f"No log directory found at {log_dir}")
        return

    print(f"\nScanning logs in: {log_dir}")
    os.makedirs(output_dir, exist_ok=True)

    urls_found = set()

    for log_file in Path(log_dir).iterdir():
        if log_file.is_file():
            try:
                content = log_file.read_text(errors='ignore')

                for match in S3_URL_PATTERN.finditer(content):
                    urls_found.add(match.group(0))

                for match in HOSTING_URL_PATTERN.finditer(content):
                    urls_found.add(match.group(0))

            except Exception as e:
                print(f"Error reading {log_file}: {e}")

    print(f"Found {len(urls_found)} unique URLs")

    # Download each
    success = 0
    expired = 0
    failed = 0

    for url in sorted(urls_found):
        result = download_url(url, output_dir)
        if result == "expired":
            expired += 1
        elif result:
            success += 1
        else:
            failed += 1

    print(f"\n{'='*60}")
    print("DOWNLOAD SUMMARY")
    print(f"{'='*60}")
    print(f"  Successful: {success}")
    print(f"  Expired: {expired}")
    print(f"  Failed: {failed}")
    print(f"{'='*60}")

    # Save download log
    if download_log:
        log_file = os.path.join(output_dir, "download_log.json")
        with open(log_file, 'w') as f:
            json.dump(download_log, f, indent=2)
        print(f"\nDownload log saved to: {log_file}")

def main():
    output_dir = sys.argv[1] if len(sys.argv) > 1 else OUTPUT_DIR

    print("="*60)
    print("SQUIRE LIVE URL DOWNLOADER")
    print("="*60)
    print("\nOptions:")
    print("  1. Watch for new URLs (run while Squire is launching)")
    print("  2. Scan existing logs for URLs")
    print()

    choice = input("Enter choice (1 or 2): ").strip()

    if choice == "1":
        log_file = find_latest_log()
        if log_file:
            watch_log_file(str(log_file), output_dir)
        else:
            print("No log files found. Start Squire first, then run this script.")
    elif choice == "2":
        scan_existing_logs(output_dir)
    else:
        print("Invalid choice")

if __name__ == "__main__":
    main()
