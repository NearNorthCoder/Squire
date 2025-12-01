#!/usr/bin/env python3
"""
Real-time JAR capture script.
Monitors the launcher output and downloads JARs immediately as URLs appear.

Run this ALONGSIDE the launcher:
  Terminal 1: java -jar squire-with-download-capture.jar 2>&1 | tee launcher_output.log
  Terminal 2: python realtime_capture.py --watch launcher_output.log

Or pipe directly:
  java -jar squire-with-download-capture.jar 2>&1 | python realtime_capture.py --pipe
"""

import os
import re
import sys
import time
import requests
import argparse
from pathlib import Path
from datetime import datetime
from concurrent.futures import ThreadPoolExecutor
from urllib.parse import urlparse, parse_qs

# Output directory
OUTPUT_DIR = Path.home() / ".squire" / "captured_jars" / datetime.now().strftime("%Y-%m-%d_%H%M%S")

# Track downloaded files to avoid duplicates
downloaded_urls = set()
downloaded_files = set()

# Regex patterns for signed S3 URLs
S3_URL_PATTERN = re.compile(
    r'https://[^"\s]+\.s3[^"\s]*\.amazonaws\.com/[^"\s]+\?[^"\s]*X-Amz-[^"\s]+',
    re.IGNORECASE
)

# Pattern for direct S3 URLs (unsigned)
DIRECT_S3_PATTERN = re.compile(
    r'https://[^"\s]+\.s3[^"\s]*\.amazonaws\.com/[^"\s]+\.jar',
    re.IGNORECASE
)

# Pattern for squire-specific URLs
SQUIRE_URL_PATTERN = re.compile(
    r'https://[^"\s]*(squire-bootload|squire-hosting)[^"\s]+',
    re.IGNORECASE
)

def extract_filename(url):
    """Extract a reasonable filename from a URL."""
    parsed = urlparse(url)
    path = parsed.path

    # Try to get .jar filename from path
    jar_match = re.search(r'/([^/]+\.jar)', path, re.IGNORECASE)
    if jar_match:
        return jar_match.group(1)

    # Try to get last path component
    parts = [p for p in path.split('/') if p]
    if parts:
        name = parts[-1]
        if not name.endswith('.jar'):
            name += '.jar'
        return name

    # Fallback to hash
    return f"download_{abs(hash(url)) % 100000}.jar"

def download_url(url):
    """Download a URL and save it."""
    if url in downloaded_urls:
        return None

    downloaded_urls.add(url)
    filename = extract_filename(url)

    # Skip if we already have this file
    if filename in downloaded_files:
        print(f"  [SKIP] Already have: {filename}")
        return None

    try:
        print(f"\n{'='*60}")
        print(f"[DOWNLOADING] {filename}")
        print(f"  URL: {url[:80]}...")

        # Download with timeout
        response = requests.get(url, timeout=60, stream=True)

        if response.status_code != 200:
            print(f"  [ERROR] HTTP {response.status_code}")
            # Check if it's an XML error
            content = response.content[:500].decode('utf-8', errors='ignore')
            if 'AccessDenied' in content or 'expired' in content:
                print(f"  [EXPIRED] URL has expired")
            return None

        # Check content type
        content_type = response.headers.get('Content-Type', '')
        content_length = int(response.headers.get('Content-Length', 0))

        print(f"  Size: {content_length / 1024 / 1024:.2f} MB")

        # Read content
        content = response.content

        # Verify it's not an XML error
        if content[:5] == b'<?xml':
            print(f"  [ERROR] Got XML error response instead of JAR")
            return None

        # Verify it looks like a JAR (ZIP magic bytes)
        if content[:2] != b'PK':
            print(f"  [WARN] Doesn't look like a JAR/ZIP file")

        # Save file
        OUTPUT_DIR.mkdir(parents=True, exist_ok=True)
        outpath = OUTPUT_DIR / filename

        with open(outpath, 'wb') as f:
            f.write(content)

        downloaded_files.add(filename)
        print(f"  [SAVED] {outpath}")
        print(f"  Total captured: {len(downloaded_files)} files")

        # Also save the URL
        with open(outpath.with_suffix('.jar.url'), 'w') as f:
            f.write(url)

        return filename

    except requests.exceptions.Timeout:
        print(f"  [TIMEOUT] Download timed out")
        return None
    except Exception as e:
        print(f"  [ERROR] {e}")
        return None

def find_urls(text):
    """Find all downloadable URLs in text."""
    urls = set()

    # Find signed S3 URLs
    for match in S3_URL_PATTERN.finditer(text):
        url = match.group(0).rstrip('",\'>')
        if '.jar' in url.lower() or 'squire' in url.lower():
            urls.add(url)

    # Find direct S3 URLs
    for match in DIRECT_S3_PATTERN.finditer(text):
        url = match.group(0).rstrip('",\'>')
        urls.add(url)

    # Find squire-specific URLs
    for match in SQUIRE_URL_PATTERN.finditer(text):
        url = match.group(0).rstrip('",\'>')
        if '.jar' in url.lower():
            urls.add(url)

    return urls

def watch_file(filepath):
    """Watch a log file for new URLs."""
    print(f"Watching: {filepath}")
    print(f"Output: {OUTPUT_DIR}")
    print("="*60)

    # Start from end of file
    with open(filepath, 'r', errors='ignore') as f:
        # Read existing content first
        content = f.read()
        urls = find_urls(content)
        if urls:
            print(f"Found {len(urls)} URLs in existing content")
            with ThreadPoolExecutor(max_workers=4) as executor:
                executor.map(download_url, urls)

        # Now watch for new content
        print("\nWaiting for new URLs...")
        while True:
            line = f.readline()
            if line:
                urls = find_urls(line)
                for url in urls:
                    download_url(url)
            else:
                time.sleep(0.1)

def watch_pipe():
    """Read URLs from stdin pipe."""
    print(f"Reading from pipe...")
    print(f"Output: {OUTPUT_DIR}")
    print("="*60)

    buffer = ""
    while True:
        try:
            chunk = sys.stdin.read(4096)
            if not chunk:
                break

            # Also print to stdout so user sees launcher output
            sys.stdout.write(chunk)
            sys.stdout.flush()

            buffer += chunk

            # Process complete lines
            while '\n' in buffer:
                line, buffer = buffer.split('\n', 1)
                urls = find_urls(line)
                for url in urls:
                    download_url(url)

        except KeyboardInterrupt:
            break

    # Process remaining buffer
    urls = find_urls(buffer)
    for url in urls:
        download_url(url)

def scan_logs_dir(logs_dir):
    """Scan a directory of log files for URLs."""
    logs_path = Path(logs_dir)

    all_urls = set()

    for logfile in logs_path.glob("**/*.log"):
        print(f"Scanning: {logfile}")
        with open(logfile, 'r', errors='ignore') as f:
            content = f.read()
            urls = find_urls(content)
            all_urls.update(urls)

    for logfile in logs_path.glob("**/*.txt"):
        print(f"Scanning: {logfile}")
        with open(logfile, 'r', errors='ignore') as f:
            content = f.read()
            urls = find_urls(content)
            all_urls.update(urls)

    print(f"\nFound {len(all_urls)} unique URLs")

    if all_urls:
        print(f"\nDownloading to: {OUTPUT_DIR}")
        with ThreadPoolExecutor(max_workers=4) as executor:
            results = list(executor.map(download_url, all_urls))

        success = len([r for r in results if r])
        print(f"\n{'='*60}")
        print(f"Downloaded: {success} / {len(all_urls)} files")
        print(f"Saved to: {OUTPUT_DIR}")

def main():
    parser = argparse.ArgumentParser(description='Real-time JAR capture from Squire launcher')
    parser.add_argument('--watch', '-w', help='Watch a log file for new URLs')
    parser.add_argument('--pipe', '-p', action='store_true', help='Read from stdin pipe')
    parser.add_argument('--scan', '-s', help='Scan a directory of log files')
    parser.add_argument('--output', '-o', help='Output directory')

    args = parser.parse_args()

    global OUTPUT_DIR
    if args.output:
        OUTPUT_DIR = Path(args.output)

    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

    if args.watch:
        watch_file(args.watch)
    elif args.pipe:
        watch_pipe()
    elif args.scan:
        scan_logs_dir(args.scan)
    else:
        # Default: scan the logs directory you mentioned
        default_logs = Path.home() / ".squire" / "logs"
        if default_logs.exists():
            scan_logs_dir(default_logs)
        else:
            parser.print_help()
            print("\n\nUsage examples:")
            print("  # Watch launcher output in real-time:")
            print("  java -jar squire.jar 2>&1 | tee output.log &")
            print("  python realtime_capture.py --watch output.log")
            print("")
            print("  # Or pipe directly:")
            print("  java -jar squire.jar 2>&1 | python realtime_capture.py --pipe")
            print("")
            print("  # Scan existing logs:")
            print("  python realtime_capture.py --scan ~/.squire/logs/")

if __name__ == '__main__':
    main()
