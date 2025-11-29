#!/usr/bin/env python3
"""
Final cleanup script for Squire deobfuscation
Fixes remaining syntax issues and broken code patterns

This is for ANALYSIS PURPOSES ONLY.
"""

import os
import re
import json
import shutil
import base64
import hashlib
from pathlib import Path
from typing import Dict, List, Tuple, Optional

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    import subprocess
    import sys
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


# ============================================================================
# STRING DECRYPTION (Clean version)
# ============================================================================

def decrypt_xor(encrypted_b64: str, key: str) -> Optional[str]:
    try:
        decoded = base64.b64decode(encrypted_b64).decode('utf-8')
        result = []
        for i, char in enumerate(decoded):
            result.append(chr(ord(char) ^ ord(key[i % len(key)])))
        return ''.join(result)
    except:
        return None

def decrypt_des(encrypted_b64: str, key_string: str) -> Optional[str]:
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()[:8]
        cipher = DES.new(key, DES.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return decrypted.decode('utf-8')
    except:
        return None

def decrypt_blowfish(encrypted_b64: str, key_string: str) -> Optional[str]:
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()
        cipher = Blowfish.new(key, Blowfish.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return decrypted.decode('utf-8')
    except:
        return None

def decrypt_string(encrypted: str, key: str) -> Optional[str]:
    for method in [decrypt_des, decrypt_blowfish, decrypt_xor]:
        result = method(encrypted, key)
        if result and all(c.isprintable() or c in '\n\r\t' for c in result):
            return result
    return None


def escape_java_string(s: str) -> str:
    return s.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r').replace('\t', '\\t')


# ============================================================================
# COMPLETE FILE CLEANUP
# ============================================================================

def cleanup_file(content: str) -> str:
    """Apply all cleanup transformations"""

    # Step 1: Decrypt any remaining encrypted strings
    pattern = r'(?:\w+\.)?([lL][lLiI]+)\s*\(\s*"([^"]*)"\s*,\s*"([^"]{4,6})"\s*\)'
    def replace_encrypted(match):
        encrypted = match.group(2)
        key = match.group(3)
        decrypted = decrypt_string(encrypted, key)
        if decrypted:
            return f'"{escape_java_string(decrypted)}"'
        return match.group(0)
    content = re.sub(pattern, replace_encrypted, content)

    # Step 2: Remove broken method declarations from bad inlining
    # Pattern: private static boolean (Object object != null)
    content = re.sub(
        r'private\s+static\s+boolean\s+\([^)]+\)\s*\{[^}]+\}',
        '',
        content
    )

    # Step 3: Remove DES/Blowfish/crypto helper methods
    content = re.sub(
        r'private\s+static\s+String\s+\w+\s*\(\s*String\s+\w+\s*,\s*String\s+\w+\s*\)\s*\{[^}]*(?:DES|Blowfish|Cipher|SecretKeySpec)[^}]*\}',
        '',
        content,
        flags=re.DOTALL
    )

    # Step 4: Remove unused crypto imports
    content = re.sub(r'import\s+java\.security\.MessageDigest;\n', '', content)
    content = re.sub(r'import\s+javax\.crypto\.[^;]+;\n', '', content)
    content = re.sub(r'import\s+java\.util\.Base64;\n', '', content)
    content = re.sub(r'import\s+java\.util\.Arrays;\n', '', content)
    content = re.sub(r'import\s+java\.nio\.charset\.StandardCharsets;\n', '', content)

    # Step 5: Remove static array declarations
    content = re.sub(r'private\s+static\s+String\[\]\s+var\d+\s*;', '', content)
    content = re.sub(r'private\s+static\s+int\[\]\s+var\d+\s*;', '', content)

    # Step 6: Fix broken condition syntax from bad inlining
    # Replace ((thing != null) with (thing != null)
    content = re.sub(r'\(\((\w+)\s*!=\s*null\)', r'(\1 != null', content)
    content = re.sub(r'\(\((\w+)\s*==\s*null\)', r'(\1 == null', content)

    # Step 7: Fix weird cast syntax
    # llllll...2)k.INITIAL -> k.INITIAL
    content = re.sub(r'[lI]+\d*\)([a-zA-Z])', r'\1', content)

    # Step 8: Replace "".length() patterns
    content = re.sub(r'""\s*\.\s*length\s*\(\s*\)', '0', content)
    content = re.sub(r'" "\s*\.\s*length\s*\(\s*\)', '1', content)
    content = re.sub(r'"  "\s*\.\s*length\s*\(\s*\)', '2', content)

    # Step 9: Simplify boolean expressions
    content = re.sub(r'(\w+)\s*\?\s*1\s*:\s*0', r'\1', content)
    content = re.sub(r'\(\s*!\s*0\s*\)', 'true', content)
    content = re.sub(r'\(\s*!1\s*\)', 'false', content)

    # Step 10: Remove dead code
    content = re.sub(r'if\s*\(\s*\d+\s*==\s*0\s*\)\s*\{[^}]*\}', '', content)
    content = re.sub(r'if\s*\(\s*\d+\s*==\s*0\s*\)\s*return[^;]*;', '', content)
    content = re.sub(r'if\s*\(\s*\d+\s*>=\s*-?\d+\s*\)\s*continue\s*;', '', content)
    content = re.sub(r'if\s*\(\s*null\s*==\s*null\s*\)\s*continue\s*;', '', content)

    # Step 11: Clean up obfuscated imports with dashes
    content = re.sub(r'import\s+[a-zA-Z0-9\.\-]+\.-\.[a-zA-Z0-9\.\-]+\.\w+;\n', '', content)

    # Step 12: Remove static initializer blocks
    content = re.sub(r'static\s*\{[^}]*\w+\.[lIi]+[^}]*\}', '', content)

    # Step 13: Rename remaining short variable names to be more readable
    # This is conservative - only rename fields, not all variables
    var_counter = [0]
    var_map = {}

    # Find field declarations with short names
    field_pattern = r'(private|protected|public)\s+(?:final\s+)?(\w+)\s+([a-zA-Z]{1,2})\s*[;=]'
    def rename_field(match):
        access = match.group(1)
        field_type = match.group(2)
        old_name = match.group(3)

        # Generate meaningful name based on type
        type_hints = {
            'int': 'count',
            'boolean': 'flag',
            'String': 'text',
            'Client': 'client',
            'Player': 'player',
            'NPC': 'npc',
            'Item': 'item',
            'WorldPoint': 'location',
            'Widget': 'widget',
        }

        if old_name not in var_map:
            var_counter[0] += 1
            prefix = type_hints.get(field_type, 'field')
            var_map[old_name] = f"{prefix}{var_counter[0]}"

        new_name = var_map[old_name]
        return f'{access} {field_type} {new_name}'

    # Don't actually rename fields in this pass - too risky
    # content = re.sub(field_pattern, rename_field, content)

    # Step 14: Clean up multiple blank lines
    content = re.sub(r'\n\s*\n\s*\n+', '\n\n', content)

    # Step 15: Remove /* synthetic */ comments
    content = re.sub(r'/\*\s*synthetic\s*\*/', '', content)

    return content


def fix_obfuscated_package_imports(content: str, class_mappings: Dict) -> str:
    """Fix imports that still reference obfuscated packages"""

    # Remove imports with dashes (obfuscated packages)
    content = re.sub(r'import\s+[\w\.]+\.-\.[\w\.\-]+;\n', '', content)

    # Update class references based on mappings
    for old_name, new_name in class_mappings.items():
        if len(old_name) <= 2:
            # Only replace in specific contexts to avoid false positives
            content = re.sub(rf'\bextends\s+{re.escape(old_name)}\b', f'extends {new_name}', content)
            content = re.sub(rf'\b{re.escape(old_name)}\.class\b', f'{new_name}.class', content)
            content = re.sub(rf'\bnew\s+{re.escape(old_name)}\s*\(', f'new {new_name}(', content)

    return content


def process_file(file_path: Path, class_mappings: Dict) -> bool:
    """Process a single file"""
    try:
        with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()

        original = content

        # Apply cleanup
        content = cleanup_file(content)
        content = fix_obfuscated_package_imports(content, class_mappings)

        if content != original:
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write(content)
            return True

        return False

    except Exception as e:
        print(f"Error processing {file_path}: {e}")
        return False


def main():
    print("=" * 70)
    print("FINAL CLEANUP SCRIPT")
    print("Fixing remaining syntax issues and broken code")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    clean_dir = base_dir / "plugins" / "clean_enhanced"

    if not clean_dir.exists():
        print(f"ERROR: Directory not found: {clean_dir}")
        return

    total_fixed = 0
    total_files = 0

    for plugin_dir in sorted(clean_dir.iterdir()):
        if not plugin_dir.is_dir():
            continue

        plugin_name = plugin_dir.name

        # Load class mappings if available
        mappings_file = plugin_dir / "CLASS_MAPPINGS.json"
        class_mappings = {}
        if mappings_file.exists():
            with open(mappings_file) as f:
                class_mappings = json.load(f)

        fixed_count = 0
        file_count = 0

        for java_file in plugin_dir.glob('**/*.java'):
            file_count += 1
            if process_file(java_file, class_mappings):
                fixed_count += 1

        if fixed_count > 0:
            print(f"[{plugin_name}] Fixed {fixed_count}/{file_count} files")
            total_fixed += fixed_count

        total_files += file_count

    print("\n" + "=" * 70)
    print(f"Total files fixed: {total_fixed}/{total_files}")
    print("=" * 70)


if __name__ == "__main__":
    main()
