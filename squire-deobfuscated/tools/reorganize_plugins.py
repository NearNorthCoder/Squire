#!/usr/bin/env python3
"""
Squire Plugin Reorganizer - Renames obfuscated file paths to human-readable names

This script:
1. Uses the plugin mapping to identify plugin names
2. Flattens deeply nested single-letter directories
3. Renames classes based on their content analysis
4. Creates a clean, navigable directory structure

Usage:
    python3 scripts/reorganize_plugins.py
"""

import os
import re
import sys
import json
import shutil
from pathlib import Path
from typing import Dict, List, Tuple, Optional, Set
from collections import defaultdict

# Plugin hash -> name mapping from our analysis
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


class ClassAnalyzer:
    """Analyzes Java class content to determine meaningful names."""

    # Patterns to identify class purpose
    PATTERNS = {
        'plugin': re.compile(r'@PluginDescriptor\s*\(\s*name\s*=\s*"([^"]+)"'),
        'config': re.compile(r'extends\s+Config|interface.*Config|@ConfigItem'),
        'overlay': re.compile(r'extends\s+(?:Overlay|InfoBox)|@Override\s+.*render\s*\('),
        'panel': re.compile(r'extends\s+PluginPanel|JPanel'),
        'state': re.compile(r'enum\s+\w*(?:State|Mode|Phase)'),
        'task': re.compile(r'extends\s+(?:Task|Action)|implements\s+(?:Task|Runnable)'),
        'util': re.compile(r'class\s+\w*(?:Util|Helper|Utils)'),
        'prayer': re.compile(r'Prayer\.|PrayerType|OverheadIcon'),
        'combat': re.compile(r'Attack|Defense|Hit|Damage|Weapon'),
        'inventory': re.compile(r'Inventory|InventoryID|Bank|Withdraw'),
        'movement': re.compile(r'Walk|Path|Movement|WorldPoint'),
        'npc': re.compile(r'NPC|NpcID|Monster|Actor'),
        'object': re.compile(r'TileObject|GameObject|ObjectID'),
        'widget': re.compile(r'Widget|WidgetInfo|WidgetID'),
    }

    @classmethod
    def analyze_class(cls, content: str, filename: str) -> Dict:
        """Analyze class content and return metadata."""
        result = {
            'class_name': None,
            'suggested_name': None,
            'type': 'unknown',
            'extends': None,
            'implements': [],
            'annotations': [],
            'keywords': set(),
        }

        # Extract class name
        class_match = re.search(r'(?:public\s+)?(?:abstract\s+)?(?:class|interface|enum)\s+(\w+)', content)
        if class_match:
            result['class_name'] = class_match.group(1)

        # Extract extends
        extends_match = re.search(r'extends\s+([\w.]+)', content)
        if extends_match:
            result['extends'] = extends_match.group(1)

        # Check for plugin descriptor
        plugin_match = cls.PATTERNS['plugin'].search(content)
        if plugin_match:
            result['type'] = 'plugin'
            result['suggested_name'] = cls._to_snake_case(plugin_match.group(1)) + '_plugin'
            return result

        # Check other patterns
        for ptype, pattern in cls.PATTERNS.items():
            if ptype != 'plugin' and pattern.search(content):
                result['keywords'].add(ptype)

        # Determine type based on patterns found
        if 'config' in result['keywords']:
            result['type'] = 'config'
        elif 'overlay' in result['keywords']:
            result['type'] = 'overlay'
        elif 'panel' in result['keywords']:
            result['type'] = 'panel'
        elif 'state' in result['keywords']:
            result['type'] = 'state'
        elif 'task' in result['keywords']:
            result['type'] = 'task'

        # Generate suggested name from class name if available
        if result['class_name']:
            name = result['class_name']
            # Handle obfuscated names
            if len(name) <= 2 or name.startswith('C0') or name.startswith('Enum'):
                if result['type'] != 'unknown':
                    result['suggested_name'] = result['type']
            else:
                result['suggested_name'] = cls._to_snake_case(name)

        return result

    @staticmethod
    def _to_snake_case(name: str) -> str:
        """Convert CamelCase to snake_case."""
        # Remove common prefixes
        name = re.sub(r'^(Squire|Abstract|Enum|Interface)', '', name)
        # Insert underscore before uppercase letters
        s1 = re.sub('(.)([A-Z][a-z]+)', r'\1_\2', name)
        return re.sub('([a-z0-9])([A-Z])', r'\1_\2', s1).lower().strip('_')


class PluginReorganizer:
    """Reorganizes plugin directories into human-readable structure."""

    def __init__(self, source_dir: Path, output_dir: Path):
        self.source_dir = source_dir
        self.output_dir = output_dir
        self.stats = {
            'plugins_processed': 0,
            'files_copied': 0,
            'files_renamed': 0,
            'dirs_flattened': 0,
        }
        self.file_mapping = {}  # old path -> new path

    def is_obfuscated_path(self, path: Path) -> bool:
        """Check if a path contains obfuscated single-letter directories."""
        parts = path.parts
        single_letter_count = sum(1 for p in parts if len(p) == 1 or p.startswith('p00'))
        return single_letter_count > 3

    def get_flattened_package(self, rel_path: Path) -> str:
        """Convert obfuscated path to flattened package name."""
        parts = list(rel_path.parts)

        # Remove 'sources' from the beginning if present
        if parts and parts[0] == 'sources':
            parts = parts[1:]

        # If it's a proper gg/squire path, keep it
        if len(parts) >= 2 and parts[0] == 'gg' and parts[1] == 'squire':
            return '/'.join(parts[:-1])  # Exclude filename

        # For obfuscated paths, flatten to 'internal'
        return 'internal'

    def process_plugin(self, plugin_hash: str, plugin_dir: Path):
        """Process a single plugin directory."""
        plugin_name = PLUGIN_MAP.get(plugin_hash, plugin_hash)
        output_plugin_dir = self.output_dir / plugin_name

        print(f"\n[*] Processing: {plugin_hash} -> {plugin_name}")

        sources_dir = plugin_dir / 'sources'
        if not sources_dir.exists():
            print(f"    [SKIP] No sources directory")
            return

        # Find all Java files
        java_files = list(sources_dir.rglob('*.java'))
        print(f"    Found {len(java_files)} Java files")

        # Analyze and categorize files
        categorized = defaultdict(list)

        for java_file in java_files:
            rel_path = java_file.relative_to(sources_dir)

            # Check if it's already in a proper package
            if str(rel_path).startswith('gg/squire'):
                # Keep the proper package structure
                new_rel_path = rel_path
            else:
                # Analyze the class to determine proper placement
                try:
                    with open(java_file, 'r', errors='ignore') as f:
                        content = f.read()

                    analysis = ClassAnalyzer.analyze_class(content, java_file.name)

                    # Create a new path based on analysis
                    if analysis['suggested_name']:
                        new_filename = analysis['suggested_name'] + '.java'
                    else:
                        new_filename = java_file.name

                    # Group by type
                    file_type = analysis['type']
                    new_rel_path = Path('internal') / file_type / new_filename

                except Exception as e:
                    new_rel_path = Path('internal') / 'unknown' / java_file.name

            categorized[str(new_rel_path.parent)].append((java_file, new_rel_path))

        # Handle duplicate filenames
        seen_names = defaultdict(int)
        final_files = []

        for category, files in categorized.items():
            for src_file, new_rel_path in files:
                base_name = new_rel_path.stem
                ext = new_rel_path.suffix
                parent = new_rel_path.parent

                if seen_names[str(new_rel_path)] > 0:
                    # Add number suffix for duplicates
                    new_name = f"{base_name}_{seen_names[str(new_rel_path)]}{ext}"
                    new_rel_path = parent / new_name

                seen_names[str(new_rel_path)] += 1
                final_files.append((src_file, new_rel_path))

        # Copy files to new structure
        for src_file, new_rel_path in final_files:
            dest_file = output_plugin_dir / new_rel_path
            dest_file.parent.mkdir(parents=True, exist_ok=True)

            shutil.copy2(src_file, dest_file)
            self.stats['files_copied'] += 1

            # Track mapping
            self.file_mapping[str(src_file)] = str(dest_file)

        self.stats['plugins_processed'] += 1
        print(f"    Copied {len(final_files)} files")

    def process_all(self):
        """Process all plugins."""
        plugins_dir = self.source_dir / 'plugins'

        if not plugins_dir.exists():
            print(f"[ERROR] Plugins directory not found: {plugins_dir}")
            return

        # Process each plugin directory
        plugin_dirs = [d for d in plugins_dir.iterdir() if d.is_dir()]
        print(f"\n[*] Found {len(plugin_dirs)} plugin directories")

        for plugin_dir in sorted(plugin_dirs):
            plugin_hash = plugin_dir.name
            self.process_plugin(plugin_hash, plugin_dir)

        # Also process named plugins (like squire-bank-stander, etc.)
        named_plugins = [d for d in self.source_dir.iterdir()
                        if d.is_dir() and d.name.startswith('squire-')]

        for plugin_dir in named_plugins:
            plugin_name = plugin_dir.name.replace('squire-', '').replace('-', '_')
            output_plugin_dir = self.output_dir / plugin_name

            sources_dir = plugin_dir / 'sources'
            if sources_dir.exists():
                print(f"\n[*] Processing named plugin: {plugin_dir.name}")
                shutil.copytree(sources_dir, output_plugin_dir, dirs_exist_ok=True)
                self.stats['plugins_processed'] += 1

    def save_mapping(self):
        """Save the file mapping to JSON."""
        mapping_file = self.output_dir / 'file_mapping.json'
        with open(mapping_file, 'w') as f:
            json.dump(self.file_mapping, f, indent=2)
        print(f"\n[+] File mapping saved to: {mapping_file}")

    def print_stats(self):
        """Print processing statistics."""
        print("\n" + "=" * 60)
        print("  REORGANIZATION COMPLETE")
        print("=" * 60)
        print(f"  Plugins processed: {self.stats['plugins_processed']}")
        print(f"  Files copied:      {self.stats['files_copied']}")
        print("=" * 60)


class SimpleReorganizer:
    """
    Simplified reorganizer that:
    1. Renames plugin directories to human-readable names
    2. Flattens deeply nested obfuscated directories
    3. Keeps files with reasonable names
    """

    def __init__(self, source_dir: Path, output_dir: Path):
        self.source_dir = source_dir
        self.output_dir = output_dir
        self.stats = {'plugins': 0, 'files': 0}

    def flatten_path(self, path: Path) -> Path:
        """Flatten deeply nested single-letter paths."""
        parts = list(path.parts)

        # Check if path is already well-named (gg/squire/...)
        if len(parts) >= 2 and parts[0] == 'gg':
            return path

        # For obfuscated paths, just keep the filename
        return Path(path.name)

    def process(self):
        """Process all plugins."""
        plugins_dir = self.source_dir / 'plugins'

        print("\n" + "=" * 60)
        print("  SQUIRE PLUGIN REORGANIZER")
        print("=" * 60)

        for plugin_dir in sorted(plugins_dir.iterdir()):
            if not plugin_dir.is_dir():
                continue

            plugin_hash = plugin_dir.name
            plugin_name = PLUGIN_MAP.get(plugin_hash, plugin_hash)

            print(f"\n[*] {plugin_hash} -> {plugin_name}")

            out_dir = self.output_dir / plugin_name
            out_dir.mkdir(parents=True, exist_ok=True)

            sources_dir = plugin_dir / 'sources'
            if not sources_dir.exists():
                continue

            # Group files by their target category
            proper_files = []  # gg/squire/... paths
            obfuscated_files = []  # single-letter paths

            for java_file in sources_dir.rglob('*.java'):
                rel_path = java_file.relative_to(sources_dir)

                if str(rel_path).startswith('gg/'):
                    proper_files.append((java_file, rel_path))
                else:
                    obfuscated_files.append((java_file, rel_path))

            # Copy proper files maintaining structure
            for src, rel in proper_files:
                dst = out_dir / rel
                dst.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(src, dst)
                self.stats['files'] += 1

            # Copy obfuscated files to flat 'obfuscated' directory
            if obfuscated_files:
                obf_dir = out_dir / 'obfuscated'
                obf_dir.mkdir(exist_ok=True)

                # Track names to avoid conflicts
                used_names = set()

                for src, rel in obfuscated_files:
                    name = src.name

                    # Handle duplicates
                    base, ext = os.path.splitext(name)
                    counter = 1
                    while name in used_names:
                        name = f"{base}_{counter}{ext}"
                        counter += 1
                    used_names.add(name)

                    dst = obf_dir / name
                    shutil.copy2(src, dst)
                    self.stats['files'] += 1

            self.stats['plugins'] += 1
            print(f"    Proper: {len(proper_files)}, Obfuscated: {len(obfuscated_files)}")

        # Handle named plugins
        for named_dir in self.source_dir.iterdir():
            if named_dir.is_dir() and named_dir.name.startswith('squire-'):
                plugin_name = named_dir.name.replace('squire-', '').replace('-', '_')
                out_dir = self.output_dir / plugin_name

                sources_dir = named_dir / 'sources'
                if sources_dir.exists():
                    print(f"\n[*] {named_dir.name} -> {plugin_name}")
                    shutil.copytree(sources_dir, out_dir, dirs_exist_ok=True)
                    file_count = sum(1 for _ in out_dir.rglob('*.java'))
                    print(f"    Files: {file_count}")
                    self.stats['plugins'] += 1
                    self.stats['files'] += file_count

        print("\n" + "=" * 60)
        print("  COMPLETE")
        print("=" * 60)
        print(f"  Plugins: {self.stats['plugins']}")
        print(f"  Files:   {self.stats['files']}")
        print(f"  Output:  {self.output_dir}")
        print("=" * 60)


def main():
    source_dir = Path('decompiled_src')
    output_dir = Path('reorganized_src')

    if not source_dir.exists():
        print(f"[ERROR] Source directory not found: {source_dir}")
        sys.exit(1)

    # Clean output directory
    if output_dir.exists():
        print(f"[*] Removing existing output directory: {output_dir}")
        shutil.rmtree(output_dir)

    output_dir.mkdir(parents=True)

    # Use simple reorganizer
    reorganizer = SimpleReorganizer(source_dir, output_dir)
    reorganizer.process()

    print("\n[+] Done! Browse reorganized code in: reorganized_src/")


if __name__ == '__main__':
    main()
