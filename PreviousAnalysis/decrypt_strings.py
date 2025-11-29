#!/usr/bin/env python3
"""
Squire Launcher String Decryption Tool

This tool decrypts obfuscated strings from the Squire launcher.
Based on reverse engineering of c/r/m/L.lIlIl (DES) and c/r/m/c.lllIllI (Blowfish).

Usage:
    python3 decrypt_strings.py --encrypted <base64_string> --key <key_string> --cipher [des|blowfish]
"""

import base64
import hashlib
import argparse
import sys
from typing import Optional

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    print("Installing pycryptodome...")
    import subprocess
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome", "-q"])
    from Crypto.Cipher import DES, Blowfish


def decrypt_des(encrypted_b64: str, key_string: str) -> Optional[str]:
    """
    Decrypt using DES with MD5-derived key (first 8 bytes).

    Based on c/r/m/L.lIlIl method:
    - MD5 hash of key string
    - Take first 8 bytes for DES key
    - Base64 decode encrypted string
    - DES decrypt in ECB mode
    """
    try:
        # MD5 hash of key, take first 8 bytes
        key = hashlib.md5(key_string.encode('utf-8')).digest()[:8]

        # Base64 decode the encrypted string
        encrypted_bytes = base64.b64decode(encrypted_b64)

        # DES decrypt
        cipher = DES.new(key, DES.MODE_ECB)
        decrypted = cipher.decrypt(encrypted_bytes)

        # Remove PKCS5/PKCS7 padding
        pad_len = decrypted[-1]
        if pad_len < 8:
            decrypted = decrypted[:-pad_len]

        return decrypted.decode('utf-8')
    except Exception as e:
        return f"Error: {e}"


def decrypt_blowfish(encrypted_b64: str, key_string: str) -> Optional[str]:
    """
    Decrypt using Blowfish with full MD5 hash as key.

    Based on c/r/m/c.lllIllI method:
    - MD5 hash of key string (full 16 bytes)
    - Base64 decode encrypted string
    - Blowfish decrypt in ECB mode
    """
    try:
        # Full MD5 hash as key
        key = hashlib.md5(key_string.encode('utf-8')).digest()

        # Base64 decode the encrypted string
        encrypted_bytes = base64.b64decode(encrypted_b64)

        # Blowfish decrypt
        cipher = Blowfish.new(key, Blowfish.MODE_ECB)
        decrypted = cipher.decrypt(encrypted_bytes)

        # Remove PKCS5/PKCS7 padding
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]

        return decrypted.decode('utf-8')
    except Exception as e:
        return f"Error: {e}"


def try_common_keys(encrypted_b64: str, cipher_type: str = 'both') -> dict:
    """
    Try decryption with common keys that might be used.
    """
    common_keys = [
        # Class names
        'c.r.m.a', 'c.r.m.L', 'c.r.m.c', 'c.r.m.z',
        'c/r/m/a', 'c/r/m/L', 'c/r/m/c', 'c/r/m/z',

        # Product names
        'squire', 'Squire', 'SQUIRE',
        'squire-launcher', 'Squire-Launcher',
        'runelite', 'RuneLite', 'RUNELITE',
        '1up', '1Up', '1UP', 'oneup', 'OneUp',

        # Version strings
        '2.7.1', 'v2.7.1',

        # AWS region
        'eu-west-1',

        # Common words
        'launcher', 'Launcher', 'LAUNCHER',
        'auth', 'Auth', 'AUTH',
        'license', 'License', 'LICENSE',
        'key', 'Key', 'KEY',
        'secret', 'Secret', 'SECRET',
        'password', 'Password', 'PASSWORD',

        # Possible static strings
        'BETA', 'beta', 'Beta',
        'alpha', 'Alpha', 'ALPHA',
    ]

    results = {}

    for key in common_keys:
        if cipher_type in ['des', 'both']:
            result = decrypt_des(encrypted_b64, key)
            if result and not result.startswith('Error') and result.isprintable():
                results[f'DES:{key}'] = result

        if cipher_type in ['blowfish', 'both']:
            result = decrypt_blowfish(encrypted_b64, key)
            if result and not result.startswith('Error') and result.isprintable():
                results[f'Blowfish:{key}'] = result

    return results


def extract_base64_from_class(class_path: str) -> list:
    """
    Extract potential Base64-encoded strings from a class file.
    """
    import re

    try:
        with open(class_path, 'rb') as f:
            content = f.read()

        # Find UTF-8 strings that look like Base64
        # Base64: A-Za-z0-9+/= with length >= 8
        pattern = rb'[A-Za-z0-9+/]{8,}={0,2}'
        matches = re.findall(pattern, content)

        base64_candidates = []
        for match in matches:
            try:
                decoded = match.decode('ascii')
                # Validate it's valid base64
                base64.b64decode(decoded)
                base64_candidates.append(decoded)
            except:
                pass

        return list(set(base64_candidates))
    except Exception as e:
        print(f"Error reading {class_path}: {e}")
        return []


def main():
    parser = argparse.ArgumentParser(description='Squire String Decryption Tool')
    parser.add_argument('--encrypted', '-e', help='Base64 encrypted string')
    parser.add_argument('--key', '-k', help='Decryption key string')
    parser.add_argument('--cipher', '-c', choices=['des', 'blowfish', 'both'],
                        default='both', help='Cipher to use')
    parser.add_argument('--bruteforce', '-b', action='store_true',
                        help='Try common keys')
    parser.add_argument('--extract', '-x', help='Extract Base64 strings from class file')

    args = parser.parse_args()

    if args.extract:
        print(f"Extracting Base64 strings from {args.extract}...")
        candidates = extract_base64_from_class(args.extract)
        print(f"Found {len(candidates)} potential Base64 strings:")
        for i, c in enumerate(candidates[:20]):  # Limit output
            print(f"  [{i}] {c[:50]}...")
        return

    if not args.encrypted:
        print("Please provide an encrypted string with --encrypted")
        parser.print_help()
        return

    if args.bruteforce:
        print(f"Trying common keys on: {args.encrypted[:50]}...")
        results = try_common_keys(args.encrypted, args.cipher)
        if results:
            print("\nSuccessful decryptions:")
            for key, value in results.items():
                print(f"  {key}: {value}")
        else:
            print("No successful decryption with common keys")
        return

    if not args.key:
        print("Please provide a key with --key, or use --bruteforce")
        return

    print(f"Encrypted: {args.encrypted}")
    print(f"Key: {args.key}")
    print(f"Cipher: {args.cipher}")
    print()

    if args.cipher in ['des', 'both']:
        result = decrypt_des(args.encrypted, args.key)
        print(f"DES Result: {result}")

    if args.cipher in ['blowfish', 'both']:
        result = decrypt_blowfish(args.encrypted, args.key)
        print(f"Blowfish Result: {result}")


if __name__ == '__main__':
    main()
