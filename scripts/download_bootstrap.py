#!/usr/bin/env python3
"""
Download all artifacts from a Squire bootstrap JSON file.
These URLs are direct (no signed authentication needed).
"""

import json
import os
import sys
import requests
from pathlib import Path
from concurrent.futures import ThreadPoolExecutor, as_completed

# Default output directory
OUTPUT_DIR = "G:/Squire_Copy/bootstrap"

def download_file(url, output_dir, name):
    """Download a single file."""
    output_path = Path(output_dir) / name

    # Skip if already exists
    if output_path.exists():
        return f"SKIP: {name} (already exists)"

    try:
        response = requests.get(url, stream=True, timeout=60)
        response.raise_for_status()

        output_path.parent.mkdir(parents=True, exist_ok=True)

        with open(output_path, 'wb') as f:
            for chunk in response.iter_content(chunk_size=8192):
                f.write(chunk)

        size = output_path.stat().st_size
        return f"OK: {name} ({size:,} bytes)"

    except Exception as e:
        return f"FAIL: {name} - {e}"

def main():
    # Check for bootstrap JSON file
    if len(sys.argv) < 2:
        print("Usage: python download_bootstrap.py <bootstrap.json> [output_dir]")
        print("\nExample:")
        print("  python download_bootstrap.py bootstrap-nightly.json")
        print("  python download_bootstrap.py bootstrap-nightly.json G:/Squire_Copy/bootstrap")
        sys.exit(1)

    bootstrap_file = sys.argv[1]
    output_dir = sys.argv[2] if len(sys.argv) > 2 else OUTPUT_DIR

    print(f"\n{'='*70}")
    print("SQUIRE BOOTSTRAP DOWNLOADER")
    print(f"{'='*70}")
    print(f"Bootstrap file: {bootstrap_file}")
    print(f"Output directory: {output_dir}")
    print(f"{'='*70}\n")

    # Load bootstrap JSON
    with open(bootstrap_file, 'r') as f:
        bootstrap = json.load(f)

    artifacts = bootstrap.get('artifacts', [])
    print(f"Found {len(artifacts)} artifacts to download\n")

    # Separate by source
    squire_artifacts = []
    maven_artifacts = []
    other_artifacts = []

    for artifact in artifacts:
        url = artifact['path']
        if 'squire-hosting' in url:
            squire_artifacts.append(artifact)
        elif 'maven' in url or 'runelite.net' in url:
            maven_artifacts.append(artifact)
        else:
            other_artifacts.append(artifact)

    print(f"Squire S3 files: {len(squire_artifacts)}")
    print(f"Maven/RuneLite files: {len(maven_artifacts)}")
    print(f"Other files: {len(other_artifacts)}")
    print()

    # Create output directories
    Path(output_dir).mkdir(parents=True, exist_ok=True)

    # Download Squire files first (most important)
    print("="*70)
    print("DOWNLOADING SQUIRE FILES")
    print("="*70)

    for artifact in squire_artifacts:
        result = download_file(artifact['path'], output_dir, artifact['name'])
        print(result)

    # Download Maven files
    print("\n" + "="*70)
    print("DOWNLOADING MAVEN/RUNELITE FILES")
    print("="*70)

    # Use thread pool for faster downloads
    with ThreadPoolExecutor(max_workers=5) as executor:
        futures = {
            executor.submit(download_file, a['path'], output_dir, a['name']): a['name']
            for a in maven_artifacts
        }

        for future in as_completed(futures):
            result = future.result()
            print(result)

    # Download other files
    if other_artifacts:
        print("\n" + "="*70)
        print("DOWNLOADING OTHER FILES")
        print("="*70)

        for artifact in other_artifacts:
            result = download_file(artifact['path'], output_dir, artifact['name'])
            print(result)

    print("\n" + "="*70)
    print("DOWNLOAD COMPLETE")
    print(f"Files saved to: {output_dir}")
    print("="*70)

    # Also save the bootstrap JSON for reference
    with open(Path(output_dir) / "bootstrap.json", 'w') as f:
        json.dump(bootstrap, f, indent=2)
    print(f"Bootstrap JSON saved to: {output_dir}/bootstrap.json")

if __name__ == "__main__":
    main()
