#!/usr/bin/env python3
"""
Squire Decompiler and Deobfuscator

Extracts, decompiles (via javap), and organizes Squire JAR files
using the cipher mapping for meaningful names.
"""

import os
import sys
import json
import subprocess
import zipfile
import shutil
from pathlib import Path
from collections import defaultdict

# Paths
DOWNLOADS_DIR = Path("downloads")
OUTPUT_DIR = Path("decompiled")
PLUGINS_DIR = OUTPUT_DIR / "plugins"
CLIENT_DIR = OUTPUT_DIR / "client"
CIPHER_FILE = Path("PreviousAnalysis/squire_cipher.json")

# Load cipher mapping
def load_cipher():
    if CIPHER_FILE.exists():
        with open(CIPHER_FILE) as f:
            return json.load(f)
    return {}

CIPHER = load_cipher()

# Map obfuscated paths to readable names
PATH_MAPPINGS = {
    "c/r/m": "squire/launcher/custom",
    "g/r/r/-/t/q/i/u/o/e/s": "squire/plugins/internal",
    "o/c/k/i/-/l/o/f/-/n/c/t/e/s": "squire/client/core",
    "gg/squire": "squire/plugins",
    "net/runelite/launcher": "net/runelite/launcher",
    "net/runelite/client": "net/runelite/client",
}

# Class name mappings from cipher
CLASS_MAPPINGS = {}
if CIPHER:
    for obf, info in CIPHER.get("classes", {}).get("obfuscated_to_original", {}).items():
        if "likely_name" in info:
            CLASS_MAPPINGS[obf.replace("/", ".")] = info["likely_name"]

def extract_jar(jar_path, output_dir):
    """Extract a JAR file to a directory."""
    with zipfile.ZipFile(jar_path, 'r') as zf:
        zf.extractall(output_dir)

def get_jar_info(jar_path):
    """Get information about classes in a JAR."""
    info = {
        "name": jar_path.name,
        "classes": [],
        "packages": set(),
        "manifest": None
    }

    with zipfile.ZipFile(jar_path, 'r') as zf:
        for name in zf.namelist():
            if name.endswith('.class'):
                info["classes"].append(name)
                pkg = "/".join(name.split("/")[:-1])
                if pkg:
                    info["packages"].add(pkg)
            elif name == "META-INF/MANIFEST.MF":
                info["manifest"] = zf.read(name).decode('utf-8', errors='ignore')

    return info

def decompile_class_javap(class_file):
    """Use javap to get class information."""
    try:
        result = subprocess.run(
            ["javap", "-p", "-c", str(class_file)],
            capture_output=True,
            text=True,
            timeout=30
        )
        return result.stdout
    except Exception as e:
        return f"// Error decompiling: {e}"

def map_path(original_path):
    """Map obfuscated path to readable path."""
    for obf, readable in PATH_MAPPINGS.items():
        if original_path.startswith(obf):
            return original_path.replace(obf, readable, 1)
    return original_path

def map_class_name(class_name):
    """Map obfuscated class name to readable name."""
    base = class_name.replace(".class", "")
    if base in CLASS_MAPPINGS:
        return CLASS_MAPPINGS[base]
    return base.split("/")[-1]

def categorize_jar(jar_info):
    """Categorize JAR as plugin, client, or other."""
    name = jar_info["name"].lower()

    # Named plugins
    if name.startswith("squire-"):
        return "plugin"

    # Check for plugin patterns
    packages = jar_info["packages"]
    if any("gg/squire" in p for p in packages):
        return "plugin"

    # Large JARs with core patterns are client
    if any("o/c/k/i" in p for p in packages):
        return "client"

    # Check size - large JARs are likely client components
    if len(jar_info["classes"]) > 50:
        return "client"

    return "library"

def process_jar(jar_path, output_base):
    """Process a single JAR file."""
    print(f"\nProcessing: {jar_path.name}")

    info = get_jar_info(jar_path)
    category = categorize_jar(info)
    print(f"  Category: {category}")
    print(f"  Classes: {len(info['classes'])}")
    print(f"  Packages: {len(info['packages'])}")

    # Determine output directory
    if category == "plugin":
        # Extract plugin name
        if jar_path.name.startswith("squire-"):
            plugin_name = jar_path.stem
        else:
            # Use UUID
            plugin_name = jar_path.stem[:8]
        out_dir = PLUGINS_DIR / plugin_name
    elif category == "client":
        out_dir = CLIENT_DIR / jar_path.stem[:8]
    else:
        out_dir = OUTPUT_DIR / "libraries" / jar_path.stem[:8]

    out_dir.mkdir(parents=True, exist_ok=True)

    # Extract JAR
    extract_dir = out_dir / "extracted"
    extract_dir.mkdir(exist_ok=True)
    extract_jar(jar_path, extract_dir)

    # Create source structure
    src_dir = out_dir / "src"
    src_dir.mkdir(exist_ok=True)

    # Process each class
    class_info = {}
    for class_file in info["classes"]:
        class_path = extract_dir / class_file
        if class_path.exists():
            # Map path
            mapped_path = map_path(class_file)
            mapped_name = map_class_name(class_file)

            # Get javap output
            javap_output = decompile_class_javap(class_path)

            # Save to source directory
            java_file = src_dir / mapped_path.replace(".class", ".java")
            java_file.parent.mkdir(parents=True, exist_ok=True)

            with open(java_file, 'w') as f:
                f.write(f"// Original: {class_file}\n")
                f.write(f"// Mapped: {mapped_path}\n")
                if mapped_name != class_file.split("/")[-1].replace(".class", ""):
                    f.write(f"// Likely name: {mapped_name}\n")
                f.write(f"// Decompiled with javap\n\n")
                f.write(javap_output)

            class_info[class_file] = {
                "mapped_path": mapped_path,
                "likely_name": mapped_name,
                "size": class_path.stat().st_size
            }

    # Write info file
    with open(out_dir / "info.json", 'w') as f:
        json.dump({
            "original_jar": jar_path.name,
            "category": category,
            "classes": class_info,
            "packages": list(info["packages"])
        }, f, indent=2)

    return category, out_dir

def main():
    print("=" * 60)
    print("Squire Decompiler and Deobfuscator")
    print("=" * 60)

    # Clean output
    if OUTPUT_DIR.exists():
        shutil.rmtree(OUTPUT_DIR)
    OUTPUT_DIR.mkdir()
    PLUGINS_DIR.mkdir()
    CLIENT_DIR.mkdir()

    # Find all JARs
    jars = list(DOWNLOADS_DIR.glob("*.jar"))
    print(f"\nFound {len(jars)} JAR files")

    # Process each JAR
    stats = defaultdict(int)
    results = []

    for jar_path in sorted(jars):
        try:
            category, out_dir = process_jar(jar_path, OUTPUT_DIR)
            stats[category] += 1
            results.append({
                "jar": jar_path.name,
                "category": category,
                "output": str(out_dir)
            })
        except Exception as e:
            print(f"  ERROR: {e}")
            stats["error"] += 1

    # Write summary
    print("\n" + "=" * 60)
    print("Summary:")
    print(f"  Plugins: {stats['plugin']}")
    print(f"  Client: {stats['client']}")
    print(f"  Libraries: {stats['library']}")
    print(f"  Errors: {stats['error']}")
    print("=" * 60)

    with open(OUTPUT_DIR / "summary.json", 'w') as f:
        json.dump({
            "stats": dict(stats),
            "results": results,
            "cipher_used": bool(CIPHER)
        }, f, indent=2)

    print(f"\nOutput written to: {OUTPUT_DIR}")
    print(f"  Plugins: {PLUGINS_DIR}")
    print(f"  Client: {CLIENT_DIR}")

if __name__ == "__main__":
    main()
