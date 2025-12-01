#!/usr/bin/env python3
"""
Squire Plugin Downloader
Extracts signed URLs from network log and downloads all JAR files.

Usage:
    python download_plugins.py <network_log_file> [output_directory]

Example:
    python download_plugins.py "Network log" ./downloaded_jars
"""

import os
import re
import sys
import urllib.request
import urllib.error
from pathlib import Path
from datetime import datetime

def extract_urls(log_content):
    """Extract unique signed S3 URLs from the network log."""
    # Pattern to match S3 signed URLs
    pattern = r'https://squire-bootload-storage\.s3\.amazonaws\.com/[^?\s]+\?[^║\s\n]+'

    urls = re.findall(pattern, log_content)

    # Deduplicate and organize by filename
    url_map = {}
    for url in urls:
        # Extract filename from URL
        match = re.search(r'/([^/?]+\.jar)', url)
        if match:
            filename = match.group(1)
            # Remove #runtime suffix if present
            clean_url = url.split('#')[0].strip()
            if filename not in url_map:
                url_map[filename] = clean_url

    return url_map

def check_expiration(url):
    """Check if URL has expired based on Expires parameter."""
    match = re.search(r'Expires=(\d+)', url)
    if match:
        expires = int(match.group(1))
        now = int(datetime.now().timestamp())
        return expires, expires > now
    return None, False

def download_file(url, output_path):
    """Download a file from URL."""
    try:
        req = urllib.request.Request(url, headers={
            'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36'
        })
        with urllib.request.urlopen(req, timeout=30) as response:
            content = response.read()
            with open(output_path, 'wb') as f:
                f.write(content)
            return True, len(content)
    except urllib.error.HTTPError as e:
        return False, f"HTTP {e.code}: {e.reason}"
    except Exception as e:
        return False, str(e)

def main():
    if len(sys.argv) < 2:
        print("Usage: python download_plugins.py <network_log_file> [output_directory]")
        print("\nExample:")
        print('  python download_plugins.py "Network log" ./downloaded_jars')
        sys.exit(1)

    log_file = sys.argv[1]
    output_dir = sys.argv[2] if len(sys.argv) > 2 else "./downloaded_jars"

    # Create output directories
    plugins_dir = Path(output_dir) / "plugins"
    deps_dir = Path(output_dir) / "dependencies"
    plugins_dir.mkdir(parents=True, exist_ok=True)
    deps_dir.mkdir(parents=True, exist_ok=True)

    # Read log file
    print(f"Reading log file: {log_file}")
    with open(log_file, 'r', encoding='utf-8', errors='ignore') as f:
        log_content = f.read()

    # Extract URLs
    url_map = extract_urls(log_content)
    print(f"Found {len(url_map)} unique JAR files\n")

    # Separate plugins from dependencies
    plugins = {k: v for k, v in url_map.items() if k.startswith('squire-')}
    deps = {k: v for k, v in url_map.items() if not k.startswith('squire-')}

    # Check expiration on first URL
    if url_map:
        first_url = list(url_map.values())[0]
        expires, valid = check_expiration(first_url)
        if expires:
            exp_time = datetime.fromtimestamp(expires)
            print(f"URL Expiration: {exp_time}")
            if not valid:
                print("⚠️  WARNING: URLs have EXPIRED! Downloads will fail.\n")
            else:
                remaining = expires - int(datetime.now().timestamp())
                print(f"Time remaining: {remaining // 60} minutes {remaining % 60} seconds\n")

    # Generate URL list file
    url_list_file = Path(output_dir) / "download_urls.txt"
    with open(url_list_file, 'w') as f:
        f.write("# Squire Plugin Download URLs\n")
        f.write(f"# Generated: {datetime.now()}\n")
        f.write(f"# Total files: {len(url_map)}\n\n")

        f.write("## PLUGINS ##\n")
        for filename, url in sorted(plugins.items()):
            f.write(f"\n# {filename}\n{url}\n")

        f.write("\n\n## DEPENDENCIES ##\n")
        for filename, url in sorted(deps.items()):
            f.write(f"\n# {filename}\n{url}\n")

    print(f"URL list saved to: {url_list_file}\n")

    # Print summary
    print("=" * 60)
    print("PLUGINS ({} files):".format(len(plugins)))
    print("=" * 60)
    for filename in sorted(plugins.keys()):
        print(f"  • {filename}")

    print("\n" + "=" * 60)
    print("DEPENDENCIES ({} files):".format(len(deps)))
    print("=" * 60)
    for filename in sorted(deps.keys()):
        print(f"  • {filename}")

    # Ask user if they want to download
    print("\n" + "=" * 60)
    response = input("\nDownload all files now? (y/n): ").strip().lower()

    if response == 'y':
        print("\nDownloading plugins...")
        for filename, url in sorted(plugins.items()):
            output_path = plugins_dir / filename
            print(f"  Downloading {filename}...", end=" ", flush=True)
            success, result = download_file(url, output_path)
            if success:
                print(f"✓ ({result:,} bytes)")
            else:
                print(f"✗ ({result})")

        print("\nDownloading dependencies...")
        for filename, url in sorted(deps.items()):
            output_path = deps_dir / filename
            print(f"  Downloading {filename}...", end=" ", flush=True)
            success, result = download_file(url, output_path)
            if success:
                print(f"✓ ({result:,} bytes)")
            else:
                print(f"✗ ({result})")

        print(f"\nDownload complete! Files saved to: {output_dir}")
    else:
        print(f"\nURLs saved to {url_list_file}")
        print("You can download manually using:")
        print('  curl -o <filename> "<url>"')

if __name__ == "__main__":
    main()
