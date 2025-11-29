#!/usr/bin/env python3
"""
Squire JAR Downloader with Resume Support
Downloads all JARs, pauses when URLs expire, resumes with new URLs.

Usage:
    python download_with_resume.py

When URLs expire, paste the new URL list and press Enter twice to continue.
"""

import os
import sys
import re
import urllib.request
import urllib.error
import json
from pathlib import Path
from datetime import datetime

# Packages to extract from JARs
EXTRACT_PACKAGES = [
    "gg/squire",
    "net/unethicalite",
    "com/openosrs"
]

class SquireDownloader:
    def __init__(self):
        self.output_dir = Path("./squire_download")
        self.jars_dir = self.output_dir / "jars"
        self.extracted_dir = self.output_dir / "extracted"
        self.state_file = self.output_dir / "download_state.json"

        self.jars_dir.mkdir(parents=True, exist_ok=True)
        self.extracted_dir.mkdir(parents=True, exist_ok=True)

        # Track what's been downloaded
        self.downloaded = set()
        self.load_state()

    def load_state(self):
        """Load previously downloaded files"""
        if self.state_file.exists():
            with open(self.state_file) as f:
                data = json.load(f)
                self.downloaded = set(data.get("downloaded", []))
            print(f"Resuming: {len(self.downloaded)} files already downloaded")

    def save_state(self):
        """Save download progress"""
        with open(self.state_file, 'w') as f:
            json.dump({"downloaded": list(self.downloaded)}, f)

    def extract_filename(self, url):
        """Extract JAR filename from URL"""
        match = re.search(r'/([^/?]+\.jar)', url)
        return match.group(1) if match else None

    def download_jar(self, url):
        """Download a single JAR file"""
        filename = self.extract_filename(url)
        if not filename:
            return False, "Could not extract filename"

        if filename in self.downloaded:
            print(f"  ✓ Already have: {filename}")
            return True, "already_downloaded"

        output_path = self.jars_dir / filename

        try:
            req = urllib.request.Request(url, headers={
                'User-Agent': 'Mozilla/5.0'
            })
            with urllib.request.urlopen(req, timeout=60) as response:
                content = response.read()
                with open(output_path, 'wb') as f:
                    f.write(content)

                self.downloaded.add(filename)
                self.save_state()

                size_kb = len(content) / 1024
                print(f"  ✓ Downloaded: {filename} ({size_kb:.1f} KB)")
                return True, filename

        except urllib.error.HTTPError as e:
            if e.code == 403:
                return False, "expired"
            return False, f"HTTP {e.code}"
        except Exception as e:
            return False, str(e)

    def extract_packages(self, jar_path):
        """Extract specific packages from a JAR"""
        import zipfile

        filename = jar_path.name
        try:
            with zipfile.ZipFile(jar_path, 'r') as zf:
                for member in zf.namelist():
                    for pkg in EXTRACT_PACKAGES:
                        if member.startswith(pkg + "/"):
                            zf.extract(member, self.extracted_dir)
                            break
        except Exception as e:
            print(f"  Warning: Could not extract from {filename}: {e}")

    def parse_urls(self, text):
        """Extract URLs from pasted text"""
        pattern = r'https://squire-bootload-storage\.s3\.amazonaws\.com/[^\s\n]+'
        return re.findall(pattern, text)

    def run(self):
        print("=" * 60)
        print("  SQUIRE JAR DOWNLOADER WITH RESUME")
        print("=" * 60)
        print(f"\nOutput directory: {self.output_dir.absolute()}")
        print(f"Already downloaded: {len(self.downloaded)} files\n")

        while True:
            print("\n" + "=" * 60)
            print("Paste URLs from the network logger (press Enter twice when done):")
            print("=" * 60)

            lines = []
            empty_count = 0
            while empty_count < 2:
                try:
                    line = input()
                    if line.strip() == "":
                        empty_count += 1
                    else:
                        empty_count = 0
                        lines.append(line)
                except EOFError:
                    break

            text = "\n".join(lines)
            urls = self.parse_urls(text)

            if not urls:
                print("\nNo URLs found. Paste the output from the network logger.")
                continue

            print(f"\nFound {len(urls)} URLs")

            # Download each JAR
            expired = False
            for i, url in enumerate(urls, 1):
                filename = self.extract_filename(url)
                print(f"\n[{i}/{len(urls)}] {filename or 'unknown'}")

                success, result = self.download_jar(url)

                if not success and result == "expired":
                    expired = True
                    print("\n" + "!" * 60)
                    print("  URLs EXPIRED!")
                    print("  1. Run Squire again to get new URLs")
                    print("  2. Paste the new URL list here")
                    print("!" * 60)
                    break

            if not expired:
                print("\n" + "=" * 60)
                print(f"  Download batch complete!")
                print(f"  Total downloaded: {len(self.downloaded)} files")
                print("=" * 60)

                # Extract packages from all JARs
                print("\nExtracting packages...")
                for jar_path in self.jars_dir.glob("*.jar"):
                    self.extract_packages(jar_path)

                print(f"\nExtracted to: {self.extracted_dir}")

                response = input("\nDownload more? (y/n): ").strip().lower()
                if response != 'y':
                    break

        print("\n" + "=" * 60)
        print("  FINAL SUMMARY")
        print("=" * 60)
        print(f"Total JARs: {len(self.downloaded)}")
        print(f"JARs saved to: {self.jars_dir}")
        print(f"Extracted to: {self.extracted_dir}")
        print("\nPackages extracted:")
        for pkg in EXTRACT_PACKAGES:
            pkg_path = self.extracted_dir / pkg
            if pkg_path.exists():
                count = sum(1 for _ in pkg_path.rglob("*.class"))
                print(f"  {pkg}: {count} class files")


if __name__ == "__main__":
    downloader = SquireDownloader()
    downloader.run()
