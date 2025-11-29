#!/usr/bin/env python3
"""
Static String Array Decryptor
Decrypts the static string arrays that are initialized via method calls

This identifies patterns like:
    lIllIlllllIll[i.lIllIlllllllI[0]] = i.llIIlIIllllllII("encrypted", "key");

And replaces them with decrypted values.
"""

import base64
import hashlib
import re
import os
import sys
from pathlib import Path

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    import subprocess
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


def decrypt_xor(encrypted_b64: str, key: str) -> str:
    try:
        decoded = base64.b64decode(encrypted_b64).decode('utf-8')
        result = []
        for i, char in enumerate(decoded):
            result.append(chr(ord(char) ^ ord(key[i % len(key)])))
        return ''.join(result)
    except:
        return None


def decrypt_des(encrypted_b64: str, key_string: str) -> str:
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


def decrypt_blowfish(encrypted_b64: str, key_string: str) -> str:
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


def decrypt_string(encrypted: str, key: str) -> str:
    """Try all decryption methods and return the first successful one"""
    # Try DES first (most common)
    result = decrypt_des(encrypted, key)
    if result and result.isprintable():
        return result

    # Try Blowfish
    result = decrypt_blowfish(encrypted, key)
    if result and result.isprintable():
        return result

    # Try XOR
    result = decrypt_xor(encrypted, key)
    if result and result.isprintable():
        return result

    return None


def process_file(filepath: str) -> tuple:
    """Process a single file and return (modified, decryption_count)"""
    try:
        with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()

        original = content
        decrypt_count = 0

        # Pattern for decrypt method calls with base64 and key
        # Matches: methodName("base64encoded==", "5charkey")
        pattern = r'[a-zA-Z_][a-zA-Z0-9_]*\.(l[lI]+)\s*\(\s*"([^"]+)"\s*,\s*"([^"]{4,6})"\s*\)'

        def replace_with_decrypted(match):
            nonlocal decrypt_count
            method = match.group(1)
            encrypted = match.group(2)
            key = match.group(3)

            decrypted = decrypt_string(encrypted, key)
            if decrypted:
                decrypt_count += 1
                # Escape special characters for Java string
                escaped = decrypted.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r')
                return f'"{escaped}"'
            return match.group(0)

        content = re.sub(pattern, replace_with_decrypted, content)

        # Also handle standalone calls without class prefix
        pattern2 = r'\b(l[lI]+)\s*\(\s*"([^"]+)"\s*,\s*"([^"]{4,6})"\s*\)'

        def replace_standalone(match):
            nonlocal decrypt_count
            method = match.group(1)
            encrypted = match.group(2)
            key = match.group(3)

            decrypted = decrypt_string(encrypted, key)
            if decrypted:
                decrypt_count += 1
                escaped = decrypted.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r')
                return f'"{escaped}"'
            return match.group(0)

        content = re.sub(pattern2, replace_standalone, content)

        if content != original:
            with open(filepath, 'w', encoding='utf-8') as f:
                f.write(content)
            return True, decrypt_count

        return False, 0

    except Exception as e:
        print(f"  Error processing {filepath}: {e}")
        return False, 0


def main():
    print("=" * 70)
    print("STATIC STRING ARRAY DECRYPTOR")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    deobfuscated_dir = base_dir / "plugins" / "deobfuscated_full"

    if not deobfuscated_dir.exists():
        print(f"ERROR: Directory not found: {deobfuscated_dir}")
        print("Run full_deobfuscator.py first!")
        sys.exit(1)

    total_files = 0
    total_decrypted = 0

    java_files = list(deobfuscated_dir.glob('**/*.java'))
    print(f"Processing {len(java_files)} Java files...")
    print("-" * 70)

    for i, filepath in enumerate(java_files):
        modified, count = process_file(str(filepath))
        if modified:
            total_files += 1
            total_decrypted += count
            if i % 100 == 0:
                print(f"  Progress: {i}/{len(java_files)} files, {total_decrypted} strings decrypted...")

    print("-" * 70)
    print(f"Total: {total_files} files modified")
    print(f"Total strings decrypted: {total_decrypted}")
    print("=" * 70)


if __name__ == "__main__":
    main()
