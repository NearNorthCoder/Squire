#!/usr/bin/env python3
"""
Prepare Local Plugins

This script prepares local plugins from the decompiled/reorganized source:
1. Copies plugin JARs from downloads directory
2. Creates a local_plugins directory structure
3. Optionally compiles deobfuscated source code

Usage:
    python3 prepare_local_plugins.py [--source downloads|reorganized] [--output local_plugins]
"""

import os
import sys
import shutil
import json
from pathlib import Path
import argparse

# Plugin name mapping
PLUGIN_MAP = {
    '70c49992': 'vorkath',
    'f9e8fbd0': 'zulrah',
    'f9dee1ad': 'hydra',
    'a79d2820': 'corporeal_beast',
    'f13c63fa': 'bandos',
    '9cc2ff9a': 'saradomin',
    'f8a8c131': 'zammy',
    '2266a50d': 'duke_sucellus',
    '861c713a': 'vardorvis',
    '0e178634': 'whisperer',
    '5c667a01': 'scurrius',
    '29f97a50': 'shamans',
    '778e0a57': 'chambers_of_xeric',
    '581bf999': 'auto_toa',
    '3b638005': 'barrows',
    'fabe4829': 'fight_caves',
    '2fcaa9ca': 'hallowed_sepulchre',
    '146c6f65': 'gauntlet',
    'a295c4aa': 'giants_foundry',
    '37ff9308': 'mixology',
    '75784950': 'moons_of_peril',
    '1242c893': 'nightmare_zone',
    'd3ba43e2': 'pest_control',
    '36afa564': 'sorceress_garden',
    '185d2d5a': 'wintertodt',
    '29a54919': 'agility',
    '06deb524': 'blast_furnace',
    '99cb6034': 'farmer',
    '5d6a9183': 'herblore',
    'e2a56d76': 'hunter',
    '3f45ab50': 'miner',
    'afc9cf98': 'tithe_farm',
    'f90b6cea': 'woodcutter',
    '9bb83689': 'aerial_fisher',
    'df6d2a51': 'herbiboar',
    'd11e2dee': 'zeah_runecrafter',
    '2e35b2d3': 'turael_skipper',
    'd1f9e3af': 'easy_clue_builder',
    '51c4371d': 'barrows_builder',
    '7ff08cb7': 'gwd_builder',
    'fdd2f9b9': 'rogues_outfit_builder',
    '57051692': 'shaman_builder',
    '7c1d3521': 'sotf_builder',
    '3047f210': 'templetrek_builder',
    '9e609a1b': 'rat_king_builder',
    '9740bba2': 'quester',
    '1a91e21b': 'temple_trekking',
    '4d97445a': 'basics',
    '21e931a2': 'leagues',
    'a162439f': 'charter_ships',
    'd1b70a7e': 'tempoross',
}


def get_plugin_name(jar_filename):
    """Extract plugin name from JAR filename."""
    # JAR files are named like: 70c49992-xxxx-xxxx-xxxx-xxxxxxxxxxxx.jar
    # or squire-plugin-name-version.jar

    name = jar_filename.replace('.jar', '')

    # Check if it's a hash-based name
    if '-' in name:
        hash_part = name.split('-')[0]
        if hash_part in PLUGIN_MAP:
            return PLUGIN_MAP[hash_part]

    # Check if it starts with 'squire-'
    if name.startswith('squire-'):
        return name.replace('squire-', '').replace('-', '_')

    # Return the original name
    return name


def copy_plugin_jars(downloads_dir, output_dir):
    """Copy plugin JARs from downloads directory with renamed filenames."""
    downloads_path = Path(downloads_dir)
    output_path = Path(output_dir)

    if not downloads_path.exists():
        print(f"[ERROR] Downloads directory not found: {downloads_path}")
        return []

    output_path.mkdir(parents=True, exist_ok=True)

    plugins = []
    for jar_file in downloads_path.glob("*.jar"):
        plugin_name = get_plugin_name(jar_file.name)
        new_name = f"squire-{plugin_name}.jar"
        dest_file = output_path / new_name

        shutil.copy2(jar_file, dest_file)
        plugins.append({
            'original': jar_file.name,
            'renamed': new_name,
            'plugin': plugin_name,
            'size': dest_file.stat().st_size
        })
        print(f"     [+] {jar_file.name} -> {new_name}")

    return plugins


def create_plugin_manifest(plugins, output_dir):
    """Create a manifest of all local plugins."""
    manifest = {
        'version': '1.0',
        'plugins': plugins,
        'total': len(plugins)
    }

    manifest_file = Path(output_dir) / 'plugins.json'
    with open(manifest_file, 'w') as f:
        json.dump(manifest, f, indent=2)

    print(f"\n[*] Plugin manifest saved to: {manifest_file}")
    return manifest_file


def create_readme(output_dir):
    """Create README for the local plugins directory."""
    readme = """# Local Plugins Directory

This directory contains Squire plugins for local loading.

## Directory Structure

```
local_plugins/
├── plugins.json           # Plugin manifest
├── squire-vorkath.jar     # Vorkath plugin
├── squire-zulrah.jar      # Zulrah plugin
├── squire-hydra.jar       # Hydra plugin
├── ... (more plugins)
└── README.md              # This file
```

## Usage

Run the local launcher with:
```bash
java -jar squire-local.jar --plugins-dir ./local_plugins
```

## Plugin Categories

### Bosses
- vorkath, zulrah, hydra, corporeal_beast
- bandos, saradomin, zammy
- duke_sucellus, vardorvis, whisperer
- scurrius, shamans

### Raids
- chambers_of_xeric, auto_toa

### Minigames
- barrows, fight_caves, hallowed_sepulchre
- gauntlet, giants_foundry, mixology
- moons_of_peril, nightmare_zone, pest_control
- sorceress_garden, wintertodt

### Skilling
- agility, blast_furnace, farmer, herblore
- hunter, miner, tithe_farm, woodcutter
- aerial_fisher, herbiboar

### Account Builders
- easy_clue_builder, barrows_builder, gwd_builder
- rogues_outfit_builder, shaman_builder, sotf_builder
- templetrek_builder, rat_king_builder

### Utility
- basics, leagues, charter_ships, tempoross
- quester, temple_trekking, turael_skipper, zeah_runecrafter
"""

    readme_file = Path(output_dir) / 'README.md'
    with open(readme_file, 'w') as f:
        f.write(readme)

    return readme_file


def main():
    parser = argparse.ArgumentParser(description="Prepare Local Plugins")
    parser.add_argument("--source", "-s", default="../downloads",
                        help="Source directory for plugin JARs")
    parser.add_argument("--output", "-o", default="./local_plugins",
                        help="Output directory for prepared plugins")
    parser.add_argument("--clean", action="store_true",
                        help="Clean output directory before copying")

    args = parser.parse_args()

    script_dir = Path(__file__).parent.resolve()
    source_dir = Path(args.source)
    if not source_dir.is_absolute():
        source_dir = script_dir / source_dir
    output_dir = Path(args.output)
    if not output_dir.is_absolute():
        output_dir = script_dir / output_dir

    print("=" * 60)
    print("  PREPARE LOCAL PLUGINS")
    print("=" * 60)
    print(f"  Source: {source_dir}")
    print(f"  Output: {output_dir}")
    print("=" * 60 + "\n")

    # Clean if requested
    if args.clean and output_dir.exists():
        shutil.rmtree(output_dir)
        print("[*] Cleaned output directory\n")

    # Copy plugin JARs
    print("[*] Copying plugin JARs...")
    plugins = copy_plugin_jars(source_dir, output_dir)

    if not plugins:
        print("\n[WARN] No plugins found!")
        print("Make sure you have downloaded plugin JARs to the downloads directory")
        sys.exit(1)

    # Create manifest
    print("\n[*] Creating plugin manifest...")
    create_plugin_manifest(plugins, output_dir)

    # Create README
    print("[*] Creating README...")
    create_readme(output_dir)

    # Print summary
    print("\n" + "=" * 60)
    print("  PREPARATION COMPLETE")
    print("=" * 60)
    print(f"  Plugins prepared: {len(plugins)}")
    print(f"  Output directory: {output_dir}")
    print("\n  Next steps:")
    print("    1. Build the local launcher:")
    print("       python3 build_local_launcher.py")
    print("    2. Run with local plugins:")
    print("       java -jar squire-local.jar --plugins-dir local_plugins")
    print("=" * 60)


if __name__ == "__main__":
    main()
