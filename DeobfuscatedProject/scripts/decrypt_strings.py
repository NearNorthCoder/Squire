#!/usr/bin/env python3
"""
Squire String Decryption Script
Decrypts obfuscated strings from Squire launcher/client

Three encryption methods are used:
1. XOR: Base64 decode -> XOR with key (cycling)
2. DES (ECB): MD5(key)[:8] as key -> DES decrypt -> Base64 decoded ciphertext
3. Blowfish (ECB): MD5(key) as key -> Blowfish decrypt -> Base64 decoded ciphertext

Keys are random 5-character strings, unique per encrypted string.
"""

import base64
import hashlib
import re
import sys
from pathlib import Path

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    print("Installing pycryptodome...")
    import subprocess
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


def decrypt_xor(encrypted_b64: str, key: str) -> str:
    """XOR decryption with cycling key"""
    if not encrypted_b64:
        return ""
    try:
        decoded = base64.b64decode(encrypted_b64).decode('utf-8')
        key_chars = list(key)
        result = []
        key_idx = 0
        for char in decoded:
            result.append(chr(ord(char) ^ ord(key_chars[key_idx % len(key_chars)])))
            key_idx += 1
        return ''.join(result)
    except Exception as e:
        return f"[XOR_ERROR: {e}]"


def decrypt_des(encrypted_b64: str, key_string: str) -> str:
    """DES decryption - MD5 hash first 8 bytes as key"""
    if not encrypted_b64:
        return ""
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()[:8]
        cipher = DES.new(key, DES.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        # Remove PKCS5/7 padding
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return decrypted.decode('utf-8')
    except Exception as e:
        return f"[DES_ERROR: {e}]"


def decrypt_blowfish(encrypted_b64: str, key_string: str) -> str:
    """Blowfish decryption - full MD5 hash as key"""
    if not encrypted_b64:
        return ""
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()
        cipher = Blowfish.new(key, Blowfish.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        # Remove PKCS5/7 padding
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return decrypted.decode('utf-8')
    except Exception as e:
        return f"[BLOWFISH_ERROR: {e}]"


def detect_and_decrypt(encrypted: str, key: str) -> tuple:
    """Try all decryption methods and return the best result"""
    results = []

    # Try XOR first (most common for short strings)
    xor_result = decrypt_xor(encrypted, key)
    if xor_result and not xor_result.startswith('[') and xor_result.isprintable():
        results.append(('XOR', xor_result))

    # Try DES
    des_result = decrypt_des(encrypted, key)
    if des_result and not des_result.startswith('[') and des_result.isprintable():
        results.append(('DES', des_result))

    # Try Blowfish
    bf_result = decrypt_blowfish(encrypted, key)
    if bf_result and not bf_result.startswith('[') and bf_result.isprintable():
        results.append(('Blowfish', bf_result))

    # Return best result (prefer longer readable strings)
    if results:
        return max(results, key=lambda x: len(x[1]) if x[1].isprintable() else 0)
    return ('FAILED', f"Could not decrypt: {encrypted[:30]}...")


def extract_encrypted_strings(java_file: str) -> list:
    """Extract encrypted strings and keys from Java source"""
    patterns = [
        # Pattern: methodName("encrypted", "key")
        r'(\w+)\("([^"]*)",\s*"([^"]+)"\)',
    ]

    results = []
    with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()

    for pattern in patterns:
        matches = re.findall(pattern, content)
        for match in matches:
            method, encrypted, key = match
            # Filter to likely decryption methods (obfuscated names)
            if re.match(r'^l[lI]+$', method) or method in ['lIlIl', 'lIllI', 'lIlII',
                'lllIllI', 'llllIII', 'lllIlll', 'lIIlIII', 'lIIlIlI', 'lllIlI']:
                results.append({
                    'method': method,
                    'encrypted': encrypted,
                    'key': key,
                    'file': java_file
                })

    return results


def decrypt_file(java_file: str, method_hints: dict = None) -> list:
    """Decrypt all strings in a Java file"""
    if method_hints is None:
        method_hints = {
            # From L.java
            'lIlIl': 'DES',      # DES decryption
            'lIllI': 'Blowfish', # Blowfish decryption
            'lIlII': 'XOR',      # XOR decryption
            # From c.java
            'lllIllI': 'Blowfish',
            'llllIII': 'DES',
            'lllIlll': 'XOR',
            # From a.java
            'lIIlIII': 'XOR',
            'lIIlIlI': 'Blowfish',
            'lllIlI': 'DES',
        }

    strings = extract_encrypted_strings(java_file)
    results = []

    for item in strings:
        method = item['method']
        encrypted = item['encrypted']
        key = item['key']

        if method in method_hints:
            hint = method_hints[method]
            if hint == 'XOR':
                decrypted = decrypt_xor(encrypted, key)
                algo = 'XOR'
            elif hint == 'DES':
                decrypted = decrypt_des(encrypted, key)
                algo = 'DES'
            elif hint == 'Blowfish':
                decrypted = decrypt_blowfish(encrypted, key)
                algo = 'Blowfish'
            else:
                algo, decrypted = detect_and_decrypt(encrypted, key)
        else:
            algo, decrypted = detect_and_decrypt(encrypted, key)

        results.append({
            'method': method,
            'encrypted': encrypted,
            'key': key,
            'algorithm': algo,
            'decrypted': decrypted
        })

    return results


def main():
    print("=" * 70)
    print("SQUIRE STRING DECRYPTION TOOL")
    print("=" * 70)

    # Test vectors from the code analysis
    test_cases = [
        # From L.java
        ('XOR', "JBYlChMS", "wgPca"),  # Title
        ('DES', "eUgYfGGFKBCBfUYweBfg5Q==", "NOiRS"),  # Icon path
        ('XOR', "BxcnCSYgGyULZTURKAMwOgY=", "TrKlE"),
        ('Blowfish', "LVT2ORCx8aU=", "KmakU"),  # "Center"
        ('DES', "dXRVM10FIM8=", "RTknS"),  # "North"
        ('DES', "jq/F7xCVu7o=", "SGKHx"),  # "South"

        # From c.java
        ('Blowfish', "U5Fl4qxrD6/XC0fBWPLUkQ==", "cbkdi"),
        ('XOR', "FSMNDwg6IhAEDCAz", "TVygm"),  # "Authenticate"
        ('XOR', "Ey84Jgki", "PJVRl"),  # "Center"

        # From a.java
        ('DES', "wVMhtPAASd/aLvIDmdYq+Nr0A8egNTYqwX8a96ddBb4=", "PtkBN"),
        ('XOR', "HzQgPiopZR82Pyk9dRY7L2UcOigjNyEyKg==", "LEUWX"),
        ('DES', "mIerJVv2ownBaABKJcsmow==", "aUtYT"),
        ('XOR', "BR8DP24=", "fpgZS"),
        ('DES', "ewPSu7Ga0BA=", "HuUVg"),
    ]

    print("\n[DECRYPTION RESULTS]")
    print("-" * 70)

    for algo, encrypted, key in test_cases:
        if algo == 'XOR':
            result = decrypt_xor(encrypted, key)
        elif algo == 'DES':
            result = decrypt_des(encrypted, key)
        elif algo == 'Blowfish':
            result = decrypt_blowfish(encrypted, key)

        print(f"[{algo:8}] Key={key:6} -> {result}")

    print("-" * 70)

    # Process files if provided
    if len(sys.argv) > 1:
        for filepath in sys.argv[1:]:
            if Path(filepath).exists():
                print(f"\n[Processing {filepath}]")
                results = decrypt_file(filepath)
                for r in results:
                    print(f"  {r['algorithm']:8} | {r['decrypted'][:50]}")

    print("\n" + "=" * 70)
    print("NOTE: Keys are per-string, not global like 'squire' or 'launcher'")
    print("=" * 70)


if __name__ == "__main__":
    main()
