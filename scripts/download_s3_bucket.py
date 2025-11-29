#!/usr/bin/env python3
"""
Squire S3 Bucket Downloader with Resume Support
Downloads all files from s3_complete_file_list.txt using signed URL credentials.

Usage:
    python download_s3_bucket.py

When URLs expire, the script pauses and waits for new credentials.
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
OUTPUT_DIR = Path("./squire_s3_mirror")
STATE_FILE = OUTPUT_DIR / ".download_state.json"
LOG_FILE = OUTPUT_DIR / "download.log"


class S3Downloader:
    def __init__(self):
        OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

        self.files = []  # List of (size, path) tuples
        self.downloaded = set()
        self.failed = set()
        self.current_index = 0
        self.credentials = {}

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
                    self.current_index = state.get("current_index", 0)
                    self.credentials = state.get("credentials", {})
                self.log(f"Resumed: {len(self.downloaded)} downloaded, index {self.current_index}")
            except Exception as e:
                self.log(f"Warning: Could not load state: {e}")

    def save_state(self):
        """Save download state"""
        state = {
            "downloaded": list(self.downloaded),
            "failed": list(self.failed),
            "current_index": self.current_index,
            "credentials": self.credentials,
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
                        self.files.append((size, path))
                    except ValueError:
                        pass

            total_size = sum(f[0] for f in self.files)
            self.log(f"Loaded {len(self.files)} files ({total_size / (1024**3):.2f} GB total)")

        except Exception as e:
            self.log(f"Error loading file list: {e}")
            sys.exit(1)

    def parse_credentials(self, url):
        """Extract AWS credentials from a signed URL"""
        try:
            parsed = urllib.parse.urlparse(url)
            params = urllib.parse.parse_qs(parsed.query)

            self.credentials = {
                "AWSAccessKeyId": params.get("AWSAccessKeyId", [""])[0],
                "Signature": params.get("Signature", [""])[0],
                "x-amz-security-token": params.get("x-amz-security-token", [""])[0],
                "Expires": params.get("Expires", [""])[0]
            }

            # Check expiration
            if self.credentials["Expires"]:
                exp_time = int(self.credentials["Expires"])
                exp_date = datetime.fromtimestamp(exp_time)
                remaining = exp_time - int(time.time())
                self.log(f"Credentials expire: {exp_date} ({remaining // 60} min remaining)")

            self.save_state()
            return True

        except Exception as e:
            self.log(f"Error parsing credentials: {e}")
            return False

    def build_signed_url(self, filepath):
        """Build a signed URL for a file using current credentials"""
        if not self.credentials.get("AWSAccessKeyId"):
            return None

        base_url = f"https://{S3_BUCKET}/{urllib.parse.quote(filepath, safe='/')}"
        params = urllib.parse.urlencode({
            "AWSAccessKeyId": self.credentials["AWSAccessKeyId"],
            "Signature": self.credentials["Signature"],
            "x-amz-security-token": self.credentials["x-amz-security-token"],
            "Expires": self.credentials["Expires"]
        })
        return f"{base_url}?{params}"

    def download_file(self, filepath, expected_size):
        """Download a single file"""
        if filepath in self.downloaded:
            return True, "already_downloaded"

        output_path = OUTPUT_DIR / filepath
        output_path.parent.mkdir(parents=True, exist_ok=True)

        # Skip if file exists with correct size
        if output_path.exists() and output_path.stat().st_size == expected_size:
            self.downloaded.add(filepath)
            return True, "already_exists"

        url = self.build_signed_url(filepath)
        if not url:
            return False, "no_credentials"

        try:
            req = urllib.request.Request(url, headers={'User-Agent': 'Mozilla/5.0'})
            with urllib.request.urlopen(req, timeout=120) as response:
                content = response.read()

            with open(output_path, 'wb') as f:
                f.write(content)

            self.downloaded.add(filepath)
            return True, len(content)

        except urllib.error.HTTPError as e:
            if e.code == 403:
                return False, "expired"
            return False, f"HTTP {e.code}"
        except Exception as e:
            return False, str(e)

    def prompt_for_credentials(self):
        """Prompt user to paste a new signed URL"""
        print("\n" + "=" * 70)
        print("  CREDENTIALS EXPIRED OR MISSING")
        print("=" * 70)
        print("\n1. Run Squire with the network logger")
        print("2. Wait for it to download any file")
        print("3. Copy one of the signed URLs and paste it here")
        print("\nPaste a signed URL (or 'quit' to exit):\n")

        try:
            url = input().strip()
            if url.lower() == 'quit':
                return False

            if "squire-bootload-storage" in url and "AWSAccessKeyId" in url:
                if self.parse_credentials(url):
                    self.log("Credentials updated successfully!")
                    return True

            print("Invalid URL. Must be a signed S3 URL from Squire.")
            return self.prompt_for_credentials()

        except (EOFError, KeyboardInterrupt):
            return False

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

    def run(self):
        """Main download loop"""
        print("\n" + "=" * 70)
        print("  SQUIRE S3 BUCKET DOWNLOADER")
        print("=" * 70)
        print(f"\nTotal files: {len(self.files)}")
        print(f"Already downloaded: {len(self.downloaded)}")
        print(f"Starting from index: {self.current_index}")
        print(f"Output directory: {OUTPUT_DIR.absolute()}")
        print(f"Log file: {LOG_FILE}")
        print("\nPress Ctrl+C to pause safely\n")

        # Check if we have credentials
        if not self.credentials.get("AWSAccessKeyId"):
            if not self.prompt_for_credentials():
                self.log("Exiting - no credentials provided")
                return

        try:
            while self.current_index < len(self.files):
                size, filepath = self.files[self.current_index]

                # Progress display
                pct = (self.current_index / len(self.files)) * 100
                downloaded_size = sum(self.files[i][0] for i in range(len(self.files))
                                     if self.files[i][1] in self.downloaded)

                print(f"\r[{self.current_index + 1}/{len(self.files)}] ({pct:.1f}%) "
                      f"{self.format_size(downloaded_size)} downloaded | "
                      f"{filepath[:50]}...", end="", flush=True)

                success, result = self.download_file(filepath, size)

                if success:
                    if result not in ("already_downloaded", "already_exists"):
                        print(f"\r[{self.current_index + 1}/{len(self.files)}] ✓ {filepath} "
                              f"({self.format_size(size)})" + " " * 20)
                    self.current_index += 1

                    # Save state periodically
                    if self.current_index % 100 == 0:
                        self.save_state()

                elif result == "expired" or result == "no_credentials":
                    print("\n")
                    self.log("Credentials expired!")
                    self.save_state()

                    if not self.prompt_for_credentials():
                        break
                else:
                    self.log(f"Failed: {filepath} - {result}")
                    self.failed.add(filepath)
                    self.current_index += 1

        except KeyboardInterrupt:
            print("\n\nPausing...")
        finally:
            self.save_state()
            self.print_summary()

    def print_summary(self):
        """Print final summary"""
        print("\n" + "=" * 70)
        print("  DOWNLOAD SUMMARY")
        print("=" * 70)
        print(f"Total files:      {len(self.files)}")
        print(f"Downloaded:       {len(self.downloaded)}")
        print(f"Failed:           {len(self.failed)}")
        print(f"Remaining:        {len(self.files) - self.current_index}")
        print(f"Current index:    {self.current_index}")
        print(f"\nOutput:           {OUTPUT_DIR.absolute()}")
        print(f"State file:       {STATE_FILE}")
        print(f"Log file:         {LOG_FILE}")
        print("\nRun again to resume from where you left off!")
        print("=" * 70)


if __name__ == "__main__":
    downloader = S3Downloader()
    downloader.run()
