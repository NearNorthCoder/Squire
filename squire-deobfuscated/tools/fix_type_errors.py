#!/usr/bin/env python3
"""
Fix JADX Type Inference Errors

This script fixes the "??" type declaration errors from JADX decompilation.
All 48 errors follow the same pattern where `??` should be `int`.

Usage:
    python3 fix_type_errors.py [--dry-run] [--path plugins/]
"""

import os
import re
import sys
import argparse
from pathlib import Path


def fix_type_errors(file_path: Path, dry_run: bool = False) -> int:
    """Fix ?? type errors in a Java file. Returns count of fixes."""

    with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()

    original = content

    # Pattern: ?? followed by variable name and assignment from int array
    # Example: ?? r0 = lIlIllIIllIIl[1];
    pattern = r'\?\?\s+(\w+)\s*='

    # Replace ?? with int
    content = re.sub(pattern, r'int \1 =', content)

    # Count fixes
    fixes = len(re.findall(pattern, original))

    if fixes > 0 and not dry_run:
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(content)

    return fixes


def fix_dead_code(file_path: Path, dry_run: bool = False) -> int:
    """Remove obvious dead code patterns. Returns count of removals."""

    with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()

    original = content
    removals = 0

    # Pattern 1: Standalone "".length(); statements
    pattern1 = r'^\s*""\s*\.\s*length\s*\(\s*\)\s*;\s*$'
    content, count = re.subn(pattern1, '', content, flags=re.MULTILINE)
    removals += count

    # Pattern 2: " ".length(); statements
    pattern2 = r'^\s*" +"\s*\.\s*length\s*\(\s*\)\s*;\s*$'
    content, count = re.subn(pattern2, '', content, flags=re.MULTILINE)
    removals += count

    if removals > 0 and not dry_run:
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(content)

    return removals


def process_directory(directory: Path, dry_run: bool = False) -> dict:
    """Process all Java files in directory."""

    stats = {
        'files_processed': 0,
        'type_fixes': 0,
        'dead_code_removed': 0,
        'files_modified': [],
    }

    for java_file in directory.rglob('*.java'):
        stats['files_processed'] += 1

        type_fixes = fix_type_errors(java_file, dry_run)
        dead_code = fix_dead_code(java_file, dry_run)

        if type_fixes > 0 or dead_code > 0:
            stats['type_fixes'] += type_fixes
            stats['dead_code_removed'] += dead_code
            stats['files_modified'].append({
                'file': str(java_file),
                'type_fixes': type_fixes,
                'dead_code': dead_code,
            })

            action = "[DRY RUN]" if dry_run else "[FIXED]"
            print(f"  {action} {java_file.name}: {type_fixes} type fixes, {dead_code} dead code")

    return stats


def main():
    parser = argparse.ArgumentParser(description="Fix JADX decompilation errors")
    parser.add_argument("--path", "-p", default="plugins",
                        help="Path to plugins directory")
    parser.add_argument("--dry-run", "-n", action="store_true",
                        help="Show what would be fixed without making changes")

    args = parser.parse_args()

    script_dir = Path(__file__).parent.parent
    plugins_dir = script_dir / args.path

    if not plugins_dir.exists():
        print(f"[ERROR] Directory not found: {plugins_dir}")
        sys.exit(1)

    print("=" * 60)
    print("  JADX TYPE ERROR FIXER")
    print("=" * 60)
    print(f"  Directory: {plugins_dir}")
    print(f"  Dry run: {args.dry_run}")
    print("=" * 60 + "\n")

    stats = process_directory(plugins_dir, args.dry_run)

    print("\n" + "=" * 60)
    print("  RESULTS")
    print("=" * 60)
    print(f"  Files processed:    {stats['files_processed']}")
    print(f"  Files modified:     {len(stats['files_modified'])}")
    print(f"  Type fixes (??→int): {stats['type_fixes']}")
    print(f"  Dead code removed:  {stats['dead_code_removed']}")
    print("=" * 60)

    if args.dry_run:
        print("\n[INFO] This was a dry run. Run without --dry-run to apply fixes.")


if __name__ == "__main__":
    main()
