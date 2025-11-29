#!/usr/bin/env python3
"""
Squire Auto-Decompile and Upload Script

Automatically:
1. Downloads JADX decompiler if needed
2. Decompiles all JAR files
3. Applies deobfuscation using cipher mappings
4. Commits and pushes to GitHub

Usage:
    python3 scripts/auto_decompile_and_upload.py
"""

import os
import sys
import json
import shutil
import subprocess
import zipfile
import platform
import urllib.request
from pathlib import Path
from concurrent.futures import ThreadPoolExecutor, as_completed

# Configuration
DOWNLOADS_DIR = Path("downloads")
OUTPUT_DIR = Path("decompiled_src")
PLUGINS_DIR = OUTPUT_DIR / "plugins"
CLIENT_DIR = OUTPUT_DIR / "client"
CIPHER_FILE = Path("PreviousAnalysis/squire_cipher.json")
JADX_DIR = Path("tools/jadx")
JADX_VERSION = "1.4.7"

# JADX download URLs by platform
JADX_URLS = {
    "Linux": f"https://github.com/skylot/jadx/releases/download/v{JADX_VERSION}/jadx-{JADX_VERSION}.zip",
    "Darwin": f"https://github.com/skylot/jadx/releases/download/v{JADX_VERSION}/jadx-{JADX_VERSION}.zip",
    "Windows": f"https://github.com/skylot/jadx/releases/download/v{JADX_VERSION}/jadx-{JADX_VERSION}.zip",
}


def print_banner():
    print()
    print("=" * 70)
    print("  SQUIRE AUTO-DECOMPILE AND UPLOAD")
    print("=" * 70)
    print()


def download_file(url, dest):
    """Download a file with progress indication."""
    print(f"  Downloading: {url}")
    print(f"  To: {dest}")

    try:
        urllib.request.urlretrieve(url, dest)
        print(f"  Done!")
        return True
    except Exception as e:
        print(f"  ERROR: {e}")
        return False


def setup_jadx():
    """Download and setup JADX if not present."""
    jadx_bin = JADX_DIR / "bin" / ("jadx.bat" if platform.system() == "Windows" else "jadx")

    if jadx_bin.exists():
        print(f"[+] JADX already installed at {jadx_bin}")
        return str(jadx_bin)

    print("[*] Setting up JADX decompiler...")

    # Create tools directory
    JADX_DIR.parent.mkdir(parents=True, exist_ok=True)

    # Download JADX
    system = platform.system()
    if system not in JADX_URLS:
        print(f"[-] Unsupported platform: {system}")
        print("    Please install JADX manually: https://github.com/skylot/jadx/releases")
        sys.exit(1)

    jadx_zip = JADX_DIR.parent / f"jadx-{JADX_VERSION}.zip"

    if not jadx_zip.exists():
        if not download_file(JADX_URLS[system], jadx_zip):
            print("[-] Failed to download JADX")
            print("    Please install JADX manually: https://github.com/skylot/jadx/releases")
            sys.exit(1)

    # Extract JADX
    print("[*] Extracting JADX...")
    with zipfile.ZipFile(jadx_zip, 'r') as zf:
        zf.extractall(JADX_DIR)

    # Make executable on Unix
    if system != "Windows":
        os.chmod(jadx_bin, 0o755)

    print(f"[+] JADX installed at {jadx_bin}")
    return str(jadx_bin)


def load_cipher():
    """Load the obfuscation cipher mappings."""
    if not CIPHER_FILE.exists():
        print("[-] Cipher file not found, skipping deobfuscation")
        return None

    print(f"[+] Loading cipher from {CIPHER_FILE}")
    with open(CIPHER_FILE) as f:
        return json.load(f)


def categorize_jar(jar_path):
    """Categorize a JAR as plugin or client."""
    name = jar_path.name.lower()

    # Named plugins
    if name.startswith("squire-"):
        return "plugin", jar_path.stem

    # Check contents
    try:
        with zipfile.ZipFile(jar_path, 'r') as zf:
            names = zf.namelist()
            class_count = sum(1 for n in names if n.endswith('.class'))

            # Check for known patterns
            has_plugin_pattern = any("gg/squire" in n for n in names)
            has_client_pattern = any("o/c/k/i" in n for n in names)

            if has_plugin_pattern:
                return "plugin", jar_path.stem[:8]
            if has_client_pattern or class_count > 100:
                return "client", jar_path.stem[:8]
    except:
        pass

    return "plugin", jar_path.stem[:8]


def decompile_jar(jadx_bin, jar_path, output_dir):
    """Decompile a single JAR file using JADX."""
    try:
        result = subprocess.run(
            [jadx_bin, "-d", str(output_dir), "-r", "--show-bad-code", str(jar_path)],
            capture_output=True,
            text=True,
            timeout=300  # 5 minute timeout per JAR
        )
        return result.returncode == 0, result.stderr
    except subprocess.TimeoutExpired:
        return False, "Timeout"
    except Exception as e:
        return False, str(e)


def apply_deobfuscation(source_dir, cipher):
    """Apply deobfuscation mappings to decompiled source."""
    if not cipher:
        return

    class_mappings = cipher.get("classes", {}).get("obfuscated_to_original", {})
    if not class_mappings:
        return

    # Build replacement map
    replacements = {}
    for obf, info in class_mappings.items():
        if "likely_name" in info:
            # Convert path to class name
            obf_class = obf.replace("/", ".")
            replacements[obf_class] = info["likely_name"]

    if not replacements:
        return

    print(f"  Applying {len(replacements)} class name mappings...")

    # Process all .java files
    java_files = list(source_dir.rglob("*.java"))
    for java_file in java_files:
        try:
            content = java_file.read_text(errors='ignore')
            modified = False

            for obf, readable in replacements.items():
                if obf in content:
                    # Add comment with readable name
                    content = content.replace(
                        obf,
                        f"{obf} /* {readable} */"
                    )
                    modified = True

            if modified:
                java_file.write_text(content)
        except:
            pass


def create_project_structure(output_dir):
    """Create a proper project structure with build files."""
    # Create basic Gradle build file
    build_gradle = output_dir / "build.gradle"
    build_gradle.write_text("""plugins {
    id 'java'
}

group = 'gg.squire'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
    maven { url 'https://repo.runelite.net' }
}

dependencies {
    compileOnly 'net.runelite:client:1.10.+'
    compileOnly 'org.projectlombok:lombok:1.18.+'
    annotationProcessor 'org.projectlombok:lombok:1.18.+'
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
""")

    # Create settings.gradle
    settings_gradle = output_dir / "settings.gradle"
    settings_gradle.write_text("rootProject.name = 'squire-decompiled'\n")

    # Create .gitignore
    gitignore = output_dir / ".gitignore"
    gitignore.write_text("""build/
.gradle/
*.class
*.log
.idea/
*.iml
""")


def git_commit_and_push(message):
    """Commit and push changes to GitHub."""
    print("\n[*] Committing to Git...")

    try:
        # Add all decompiled sources
        subprocess.run(["git", "add", str(OUTPUT_DIR)], check=True)
        subprocess.run(["git", "add", "scripts/auto_decompile_and_upload.py"], check=True)

        # Check if there are changes
        result = subprocess.run(["git", "status", "--porcelain"], capture_output=True, text=True)
        if not result.stdout.strip():
            print("[*] No changes to commit")
            return True

        # Commit
        subprocess.run(["git", "commit", "-m", message], check=True)

        # Get current branch
        result = subprocess.run(["git", "branch", "--show-current"], capture_output=True, text=True)
        branch = result.stdout.strip()

        # Push
        print(f"[*] Pushing to origin/{branch}...")
        subprocess.run(["git", "push", "-u", "origin", branch], check=True)

        print("[+] Successfully pushed to GitHub!")
        return True

    except subprocess.CalledProcessError as e:
        print(f"[-] Git error: {e}")
        return False


def main():
    print_banner()

    # Check for downloads
    if not DOWNLOADS_DIR.exists():
        print(f"[-] Downloads directory not found: {DOWNLOADS_DIR}")
        print("    Please run the Squire launcher first to capture JAR files")
        sys.exit(1)

    jars = list(DOWNLOADS_DIR.glob("*.jar"))
    if not jars:
        print(f"[-] No JAR files found in {DOWNLOADS_DIR}")
        sys.exit(1)

    print(f"[+] Found {len(jars)} JAR files to decompile")

    # Setup JADX
    jadx_bin = setup_jadx()

    # Load cipher for deobfuscation
    cipher = load_cipher()

    # Clean output directory
    if OUTPUT_DIR.exists():
        print(f"[*] Cleaning {OUTPUT_DIR}...")
        shutil.rmtree(OUTPUT_DIR)

    OUTPUT_DIR.mkdir(parents=True)
    PLUGINS_DIR.mkdir()
    CLIENT_DIR.mkdir()

    # Process each JAR
    print(f"\n[*] Decompiling {len(jars)} JAR files...")
    print("-" * 70)

    results = {"success": 0, "failed": 0, "plugins": [], "client": []}

    for i, jar_path in enumerate(sorted(jars), 1):
        category, name = categorize_jar(jar_path)

        if category == "plugin":
            out_dir = PLUGINS_DIR / name
            results["plugins"].append(name)
        else:
            out_dir = CLIENT_DIR / name
            results["client"].append(name)

        print(f"[{i:3}/{len(jars)}] {jar_path.name}")
        print(f"        -> {category}/{name}")

        success, error = decompile_jar(jadx_bin, jar_path, out_dir)

        if success:
            results["success"] += 1

            # Apply deobfuscation
            if cipher:
                apply_deobfuscation(out_dir, cipher)

            # Copy original JAR for reference
            shutil.copy2(jar_path, out_dir / jar_path.name)

            print(f"        [OK]")
        else:
            results["failed"] += 1
            print(f"        [FAILED] {error[:50] if error else 'Unknown error'}")

    print("-" * 70)

    # Create project structure
    print("\n[*] Creating project structure...")
    create_project_structure(OUTPUT_DIR)

    # Write summary
    summary = {
        "total_jars": len(jars),
        "success": results["success"],
        "failed": results["failed"],
        "plugins": results["plugins"],
        "client": results["client"],
        "cipher_applied": cipher is not None
    }

    summary_file = OUTPUT_DIR / "decompile_summary.json"
    with open(summary_file, 'w') as f:
        json.dump(summary, f, indent=2)

    # Print summary
    print()
    print("=" * 70)
    print("  DECOMPILATION COMPLETE")
    print("=" * 70)
    print(f"  Total JARs:     {len(jars)}")
    print(f"  Successful:     {results['success']}")
    print(f"  Failed:         {results['failed']}")
    print(f"  Plugins:        {len(results['plugins'])}")
    print(f"  Client:         {len(results['client'])}")
    print(f"  Deobfuscation:  {'Applied' if cipher else 'Skipped'}")
    print(f"  Output:         {OUTPUT_DIR}")
    print("=" * 70)

    # Commit and push to GitHub
    commit_msg = f"Add decompiled Squire sources ({results['success']} JARs)"
    git_commit_and_push(commit_msg)

    print()
    print("[+] Done! Decompiled sources are in:", OUTPUT_DIR)
    print()
    print("To open in an IDE:")
    print(f"  - IntelliJ: Open {OUTPUT_DIR} as a Gradle project")
    print(f"  - VSCode:   code {OUTPUT_DIR}")
    print()


if __name__ == "__main__":
    main()
