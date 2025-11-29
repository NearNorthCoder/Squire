#!/usr/bin/env python3
"""
Fast JAR extractor and organizer.
Extracts all JARs and organizes them into plugins/client folders.
Use JADX or CFR on your local machine for full decompilation.
"""

import os
import json
import zipfile
import shutil
from pathlib import Path
from collections import defaultdict

DOWNLOADS_DIR = Path("downloads")
OUTPUT_DIR = Path("decompiled")
PLUGINS_DIR = OUTPUT_DIR / "plugins"
CLIENT_DIR = OUTPUT_DIR / "client"

def get_jar_info(jar_path):
    """Quick JAR analysis."""
    info = {"name": jar_path.name, "classes": 0, "packages": set()}
    with zipfile.ZipFile(jar_path, 'r') as zf:
        for name in zf.namelist():
            if name.endswith('.class'):
                info["classes"] += 1
                pkg = "/".join(name.split("/")[:-1])
                if pkg:
                    info["packages"].add(pkg)
    return info

def categorize_jar(jar_path, info):
    """Categorize JAR type."""
    name = jar_path.name.lower()

    # Named plugins
    if name.startswith("squire-"):
        return "plugin", name.replace(".jar", "")

    # Check packages
    pkgs = info["packages"]
    if any("gg/squire" in p for p in pkgs):
        return "plugin", jar_path.stem[:8]
    if any("o/c/k/i" in p for p in pkgs):
        return "client", jar_path.stem[:8]
    if info["classes"] > 50:
        return "client", jar_path.stem[:8]

    return "plugin", jar_path.stem[:8]

def extract_jar(jar_path, output_dir):
    """Extract JAR contents."""
    with zipfile.ZipFile(jar_path, 'r') as zf:
        zf.extractall(output_dir)

def main():
    print("=" * 60)
    print("Squire JAR Extractor and Organizer")
    print("=" * 60)

    # Clean output
    if OUTPUT_DIR.exists():
        shutil.rmtree(OUTPUT_DIR)
    OUTPUT_DIR.mkdir()
    PLUGINS_DIR.mkdir()
    CLIENT_DIR.mkdir()

    jars = list(DOWNLOADS_DIR.glob("*.jar"))
    print(f"\nFound {len(jars)} JAR files\n")

    stats = defaultdict(int)
    all_results = []

    for jar_path in sorted(jars):
        info = get_jar_info(jar_path)
        category, name = categorize_jar(jar_path, info)
        stats[category] += 1

        print(f"[{category.upper():6}] {jar_path.name} ({info['classes']} classes)")

        # Determine output
        if category == "plugin":
            out_dir = PLUGINS_DIR / name
        else:
            out_dir = CLIENT_DIR / name

        out_dir.mkdir(parents=True, exist_ok=True)

        # Extract
        extract_jar(jar_path, out_dir)

        # Copy original JAR
        shutil.copy2(jar_path, out_dir / jar_path.name)

        # Write info
        with open(out_dir / "info.json", 'w') as f:
            json.dump({
                "original": jar_path.name,
                "category": category,
                "classes": info["classes"],
                "packages": list(info["packages"])
            }, f, indent=2)

        all_results.append({
            "jar": jar_path.name,
            "category": category,
            "output": str(out_dir),
            "classes": info["classes"]
        })

    # Write summary
    print("\n" + "=" * 60)
    print(f"Plugins: {stats['plugin']}")
    print(f"Client:  {stats['client']}")
    print("=" * 60)

    with open(OUTPUT_DIR / "summary.json", 'w') as f:
        json.dump({"stats": dict(stats), "results": all_results}, f, indent=2)

    # List output structure
    print(f"\nOutput structure:")
    print(f"  {OUTPUT_DIR}/")
    print(f"    plugins/ ({stats['plugin']} plugins)")
    for p in sorted(PLUGINS_DIR.iterdir())[:10]:
        print(f"      {p.name}/")
    if stats['plugin'] > 10:
        print(f"      ... and {stats['plugin'] - 10} more")
    print(f"    client/ ({stats['client']} components)")
    for c in sorted(CLIENT_DIR.iterdir()):
        print(f"      {c.name}/")

    print(f"\n✓ Done! Use JADX on your machine to decompile:")
    print(f"  jadx -d decompiled_src decompiled/plugins/*/")
    print(f"  jadx -d decompiled_src decompiled/client/*/")

if __name__ == "__main__":
    main()
