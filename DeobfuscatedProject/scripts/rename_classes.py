#!/usr/bin/env python3
"""
Class Renaming Deobfuscator
Renames obfuscated classes based on @TaskDesc annotations and updates all references

This is for ANALYSIS PURPOSES ONLY.
"""

import os
import re
import json
import shutil
from pathlib import Path
from collections import defaultdict
from typing import Dict, List, Tuple, Set

def extract_task_desc(content: str) -> str:
    """Extract task name from @TaskDesc annotation"""
    match = re.search(r'@TaskDesc\s*\(\s*name\s*=\s*"([^"]+)"', content)
    if match:
        return match.group(1)
    return None


def task_name_to_class_name(task_name: str) -> str:
    """Convert task name to PascalCase class name"""
    # Remove special characters and split on spaces
    words = re.sub(r'[^\w\s]', '', task_name).split()
    # PascalCase each word
    class_name = ''.join(word.capitalize() for word in words)
    # Add Task suffix if not present
    if not class_name.endswith('Task'):
        class_name += 'Task'
    return class_name


def detect_class_type(content: str, class_name: str) -> str:
    """Detect what type of class this is (enum, task, config, etc.)"""
    if 'extends Enum<' in content or f'enum {class_name}' in content.lower():
        return 'enum'
    if '@TaskDesc' in content:
        return 'task'
    if 'interface ' in content and 'Config' in content:
        return 'config'
    if 'extends SquirePlugin' in content:
        return 'plugin'
    if 'InfoBox' in content or 'Overlay' in content:
        return 'overlay'
    return 'unknown'


def analyze_plugin_directory(plugin_dir: Path) -> Dict:
    """Analyze a plugin directory and build class mappings"""
    mappings = {}

    # Find all Java files
    for java_file in plugin_dir.glob('**/*.java'):
        try:
            with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()

            # Get original class name from filename
            original_name = java_file.stem

            # Skip already-named classes (multi-word names)
            if len(original_name) > 2 and not original_name.startswith('a'):
                continue

            # Get package from file
            pkg_match = re.search(r'package\s+([\w.\-]+)\s*;', content)
            if not pkg_match:
                continue

            original_package = pkg_match.group(1)

            # Skip gg.squire packages (already deobfuscated)
            if original_package.startswith('gg.squire'):
                continue

            # Determine new class name
            task_name = extract_task_desc(content)
            class_type = detect_class_type(content, original_name)

            if task_name:
                new_name = task_name_to_class_name(task_name)
            elif class_type == 'enum':
                # Try to infer enum name from values
                enum_values = re.findall(r'public static final.*?enum.*?(\w+)\s*=', content)
                if 'BANKING' in content and 'DONE' in content:
                    new_name = 'PluginState'
                elif 'RANGING_POTION' in content:
                    new_name = 'PotionType'
                elif 'GUAM' in content or 'HERB' in content.upper():
                    new_name = 'HerbType'
                else:
                    new_name = f'{original_name.upper()}Enum'
            else:
                # Keep original name but mark as unknown
                new_name = f'{original_name}_Unknown'

            # Store mapping
            full_original = f"{original_package}.{original_name}"
            mappings[full_original] = {
                'original_name': original_name,
                'new_name': new_name,
                'original_package': original_package,
                'file_path': str(java_file),
                'task_name': task_name,
                'class_type': class_type
            }

        except Exception as e:
            print(f"Error analyzing {java_file}: {e}")

    return mappings


def apply_renames(plugin_dir: Path, output_dir: Path, mappings: Dict) -> int:
    """Apply class renames to all files in plugin directory"""
    changes_made = 0

    # Create reverse mapping for quick lookup
    name_to_new = {}
    for full_name, info in mappings.items():
        pkg = info['original_package']
        old_name = info['original_name']
        new_name = info['new_name']

        # Map both simple and fully-qualified names
        name_to_new[f"{pkg}.{old_name}"] = f"{pkg}.{new_name}"
        name_to_new[old_name] = new_name

    # Process all Java files
    for java_file in plugin_dir.glob('**/*.java'):
        try:
            with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()

            original_content = content

            # Rename imports
            for full_old, full_new in name_to_new.items():
                if '.' in full_old:
                    # Full package path import
                    content = content.replace(f'import {full_old};', f'import {full_new};')
                    content = content.replace(f'{full_old}.', f'{full_new}.')

            # Rename class declarations
            for info in mappings.values():
                old_name = info['original_name']
                new_name = info['new_name']

                # Class declaration
                content = re.sub(
                    rf'\bclass\s+{re.escape(old_name)}\b',
                    f'class {new_name}',
                    content
                )

                # Extends/implements
                content = re.sub(
                    rf'\bextends\s+{re.escape(old_name)}\b',
                    f'extends {new_name}',
                    content
                )

                # Type references (but be careful with single letters)
                if len(old_name) > 1:
                    content = re.sub(
                        rf'\b{re.escape(old_name)}\.class\b',
                        f'{new_name}.class',
                        content
                    )

            if content != original_content:
                changes_made += 1

            # Write to output directory
            rel_path = java_file.relative_to(plugin_dir)

            # Rename file if it's in the mappings
            for info in mappings.values():
                if java_file.stem == info['original_name']:
                    new_filename = info['new_name'] + '.java'
                    rel_path = rel_path.parent / new_filename
                    break

            out_file = output_dir / rel_path
            out_file.parent.mkdir(parents=True, exist_ok=True)

            with open(out_file, 'w', encoding='utf-8') as f:
                f.write(content)

        except Exception as e:
            print(f"Error processing {java_file}: {e}")

    return changes_made


def main():
    print("=" * 70)
    print("CLASS RENAMING DEOBFUSCATOR")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    source_dir = base_dir / "plugins" / "deobfuscated_full"
    output_dir = base_dir / "plugins" / "renamed"

    if not source_dir.exists():
        print(f"ERROR: Source not found: {source_dir}")
        return

    # Clean output directory
    if output_dir.exists():
        shutil.rmtree(output_dir)
    output_dir.mkdir(parents=True)

    total_mappings = 0
    total_changes = 0
    all_mappings = {}

    # Process each plugin directory
    plugin_dirs = sorted(source_dir.iterdir())

    for i, plugin_dir in enumerate(plugin_dirs):
        if not plugin_dir.is_dir():
            continue

        plugin_name = plugin_dir.name
        print(f"\n[{i+1}/{len(plugin_dirs)}] Analyzing {plugin_name}...")

        # Analyze and build mappings
        mappings = analyze_plugin_directory(plugin_dir)

        if mappings:
            print(f"  Found {len(mappings)} classes to rename")

            # Apply renames
            plugin_output = output_dir / plugin_name
            changes = apply_renames(plugin_dir, plugin_output, mappings)

            print(f"  Applied {changes} file changes")

            total_mappings += len(mappings)
            total_changes += changes
            all_mappings[plugin_name] = mappings
        else:
            # Copy unchanged
            shutil.copytree(plugin_dir, output_dir / plugin_name)

    # Save all mappings to JSON
    mappings_file = output_dir / "CLASS_MAPPINGS.json"
    with open(mappings_file, 'w') as f:
        json.dump(all_mappings, f, indent=2)

    print("\n" + "=" * 70)
    print(f"Total classes mapped: {total_mappings}")
    print(f"Total file changes: {total_changes}")
    print(f"Output: {output_dir}")
    print(f"Mappings saved to: {mappings_file}")
    print("=" * 70)


if __name__ == "__main__":
    main()
