#!/usr/bin/env python3
"""
Squire S3 Bucket Downloader with Resume Support
Downloads files by capturing signed URLs from Squire's network traffic.

Usage:
    1. Run Squire with the network logger
    2. Run this script
    3. Paste the URLs as they appear in the logger
    4. When URLs expire, get new ones from Squire and continue

Progress is saved automatically - safe to Ctrl+C or crash.
"""

import os
import sys
import re
import json
import time
import urllib.request
import urllib.error
import urllib.parse
from pathlib import Path
from datetime import datetime

# Configuration
FILE_LIST_URL = "https://raw.githubusercontent.com/NearNorthCoder/Squire/main/s3_complete_file_list.txt"
S3_BUCKET = "squire-bootload-storage.s3.amazonaws.com"

# Download location - change this to your preferred path
OUTPUT_DIR = Path("G:/Squire_Copy")

STATE_FILE = OUTPUT_DIR / ".download_state.json"
LOG_FILE = OUTPUT_DIR / "download.log"


class S3Downloader:
    def __init__(self):
        OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

        self.all_files = {}  # path -> size
        self.downloaded = set()
        self.failed = set()
        self.pending_urls = []  # URLs waiting to be downloaded

        self.load_state()
        self.load_file_list()

    def log(self, message):
        """Log to both console and file"""
        timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        line = f"[{timestamp}] {message}"
        print(line)
        with open(LOG_FILE, 'a') as f:
            f.write(line + "\n")

    def load_state(self):
        """Load previous download state"""
        if STATE_FILE.exists():
            try:
                with open(STATE_FILE) as f:
                    state = json.load(f)
                    self.downloaded = set(state.get("downloaded", []))
                    self.failed = set(state.get("failed", []))
                self.log(f"Resumed: {len(self.downloaded)} files already downloaded")
            except Exception as e:
                self.log(f"Warning: Could not load state: {e}")

    def save_state(self):
        """Save download state"""
        state = {
            "downloaded": list(self.downloaded),
            "failed": list(self.failed),
            "last_updated": datetime.now().isoformat()
        }
        with open(STATE_FILE, 'w') as f:
            json.dump(state, f, indent=2)

    def load_file_list(self):
        """Load the complete file list from GitHub"""
        self.log("Loading file list from GitHub...")
        try:
            req = urllib.request.Request(FILE_LIST_URL, headers={'User-Agent': 'Mozilla/5.0'})
            with urllib.request.urlopen(req, timeout=30) as response:
                content = response.read().decode('utf-8')

            for line in content.strip().split('\n'):
                if '\t' in line:
                    size_str, path = line.split('\t', 1)
                    try:
                        size = int(size_str)
                        self.all_files[path] = size
                    except ValueError:
                        pass

            total_size = sum(self.all_files.values())
            remaining = len(self.all_files) - len(self.downloaded)
            self.log(f"Total files: {len(self.all_files)} ({self.format_size(total_size)})")
            self.log(f"Already downloaded: {len(self.downloaded)}")
            self.log(f"Remaining: {remaining}")

        except Exception as e:
            self.log(f"Error loading file list: {e}")
            sys.exit(1)

    def extract_filepath(self, url):
        """Extract the file path from a signed URL"""
        try:
            parsed = urllib.parse.urlparse(url)
            # Path is everything after the bucket name
            path = parsed.path.lstrip('/')
            return urllib.parse.unquote(path)
        except:
            return None

    def parse_urls(self, text):
        """Extract signed URLs from pasted text"""
        pattern = r'https://squire-bootload-storage\.s3\.amazonaws\.com/[^\s\n\│\║]+'
        urls = re.findall(pattern, text)
        # Clean up URLs (remove trailing characters)
        cleaned = []
        for url in urls:
            # Remove any trailing box-drawing characters or whitespace
            url = re.sub(r'[│║\s]+$', '', url)
            if 'AWSAccessKeyId' in url:
                cleaned.append(url)
        return cleaned

    def download_file(self, url):
        """Download a single file from its signed URL"""
        filepath = self.extract_filepath(url)
        if not filepath:
            return False, "Could not extract filepath"

        if filepath in self.downloaded:
            return True, "already_downloaded"

        expected_size = self.all_files.get(filepath, 0)
        output_path = OUTPUT_DIR / filepath
        output_path.parent.mkdir(parents=True, exist_ok=True)

        # Skip if file exists with correct size
        if output_path.exists() and expected_size > 0:
            if output_path.stat().st_size == expected_size:
                self.downloaded.add(filepath)
                self.save_state()
                return True, "already_exists"

        try:
            req = urllib.request.Request(url, headers={'User-Agent': 'Mozilla/5.0'})
            with urllib.request.urlopen(req, timeout=120) as response:
                content = response.read()

            with open(output_path, 'wb') as f:
                f.write(content)

            self.downloaded.add(filepath)
            self.save_state()
            return True, len(content)

        except urllib.error.HTTPError as e:
            if e.code == 403:
                return False, "expired"
            return False, f"HTTP {e.code}"
        except Exception as e:
            return False, str(e)

    def format_size(self, bytes):
        """Format bytes as human readable"""
        if bytes < 1024:
            return f"{bytes} B"
        elif bytes < 1024 * 1024:
            return f"{bytes / 1024:.1f} KB"
        elif bytes < 1024 * 1024 * 1024:
            return f"{bytes / (1024 * 1024):.1f} MB"
        else:
            return f"{bytes / (1024 * 1024 * 1024):.2f} GB"

    def show_progress(self):
        """Show current progress"""
        total = len(self.all_files)
        done = len(self.downloaded)
        pct = (done / total * 100) if total > 0 else 0

        downloaded_size = sum(self.all_files.get(f, 0) for f in self.downloaded)
        total_size = sum(self.all_files.values())

        print(f"\n{'='*60}")
        print(f"  PROGRESS: {done}/{total} files ({pct:.1f}%)")
        print(f"  SIZE: {self.format_size(downloaded_size)} / {self.format_size(total_size)}")
        print(f"{'='*60}\n")

    def run(self):
        """Main download loop"""
        print("\n" + "=" * 60)
        print("  SQUIRE S3 BUCKET DOWNLOADER")
        print("=" * 60)
        print(f"\nOutput: {OUTPUT_DIR}")
        print(f"\nHow to use:")
        print("1. Run Squire with the network logger")
        print("2. Paste URLs here as they appear (or paste the summary)")
        print("3. Press Enter twice when done pasting")
        print("4. Repeat when you have more URLs")
        print("\nType 'status' to see progress, 'quit' to exit\n")

        self.show_progress()

        while True:
            print("Paste URLs (Enter twice when done, or 'quit'):")

            lines = []
            empty_count = 0

            while empty_count < 2:
                try:
                    line = input()

                    if line.strip().lower() == 'quit':
                        self.save_state()
                        self.print_summary()
                        return

                    if line.strip().lower() == 'status':
                        self.show_progress()
                        empty_count = 0
                        continue

                    if line.strip() == "":
                        empty_count += 1
                    else:
                        empty_count = 0
                        lines.append(line)

                except (EOFError, KeyboardInterrupt):
                    self.save_state()
                    self.print_summary()
                    return

            text = "\n".join(lines)
            urls = self.parse_urls(text)

            if not urls:
                print("No valid URLs found. Paste URLs from the network logger.\n")
                continue

            self.log(f"Processing {len(urls)} URLs...")

            success_count = 0
            skip_count = 0
            fail_count = 0

            for i, url in enumerate(urls, 1):
                filepath = self.extract_filepath(url)
                short_name = filepath[:50] + "..." if len(filepath) > 50 else filepath

                print(f"[{i}/{len(urls)}] {short_name}", end=" ", flush=True)

                success, result = self.download_file(url)

                if success:
                    if result in ("already_downloaded", "already_exists"):
                        print("(skip - already have)")
                        skip_count += 1
                    else:
                        print(f"✓ {self.format_size(result)}")
                        success_count += 1
                else:
                    if result == "expired":
                        print("✗ EXPIRED - need new URLs!")
                        fail_count += 1
                    else:
                        print(f"✗ {result}")
                        self.failed.add(filepath)
                        fail_count += 1

            self.log(f"Batch complete: {success_count} downloaded, {skip_count} skipped, {fail_count} failed")
            self.show_progress()

    def print_summary(self):
        """Print final summary"""
        print("\n" + "=" * 60)
        print("  DOWNLOAD SUMMARY")
        print("=" * 60)
        print(f"Total in bucket:  {len(self.all_files)}")
        print(f"Downloaded:       {len(self.downloaded)}")
        print(f"Failed:           {len(self.failed)}")
        print(f"Remaining:        {len(self.all_files) - len(self.downloaded)}")
        print(f"\nOutput:           {OUTPUT_DIR}")
        print(f"State file:       {STATE_FILE}")
        print(f"Log file:         {LOG_FILE}")
        print("\nRun again to continue!")
        print("=" * 60)


if __name__ == "__main__":
    downloader = S3Downloader()
    downloader.run()
