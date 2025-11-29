#!/usr/bin/env python3
"""
Squire String Decryptor - Extracts and decrypts all obfuscated strings

This script:
1. Finds all decrypt method calls in the decompiled source
2. Extracts the encrypted string and key parameters
3. Decrypts using the same algorithms (Blowfish/DES)
4. Outputs a mapping of encrypted -> decrypted strings

Usage:
    python3 scripts/extract_decrypt_strings.py
"""

import os
import re
import sys
import json
import base64
import hashlib
from pathlib import Path
from typing import Dict, List, Tuple, Optional
from collections import defaultdict

try:
    from Crypto.Cipher import Blowfish, DES
    from Crypto.Util.Padding import unpad
    HAS_CRYPTO = True
except ImportError:
    HAS_CRYPTO = False
    print("[ERROR] PyCryptodome required. Install with: pip install pycryptodome")
    sys.exit(1)


class SquireStringDecryptor:
    """Decrypts strings using Squire's encryption methods."""

    @staticmethod
    def blowfish_decrypt(encrypted_b64: str, key: str) -> Optional[str]:
        """Decrypt using Blowfish with MD5-hashed key."""
        try:
            # MD5 hash of the key
            key_bytes = hashlib.md5(key.encode('utf-8')).digest()
            cipher = Blowfish.new(key_bytes, Blowfish.MODE_ECB)
            encrypted = base64.b64decode(encrypted_b64)
            decrypted = cipher.decrypt(encrypted)
            # Remove PKCS5/7 padding
            return unpad(decrypted, 8).decode('utf-8')
        except Exception as e:
            return None

    @staticmethod
    def des_decrypt(encrypted_b64: str, key: str) -> Optional[str]:
        """Decrypt using DES with MD5-hashed key (first 8 bytes)."""
        try:
            # MD5 hash of the key, take first 8 bytes for DES
            key_bytes = hashlib.md5(key.encode('utf-8')).digest()[:8]
            cipher = DES.new(key_bytes, DES.MODE_ECB)
            encrypted = base64.b64decode(encrypted_b64)
            decrypted = cipher.decrypt(encrypted)
            return unpad(decrypted, 8).decode('utf-8')
        except Exception as e:
            return None

    @classmethod
    def try_decrypt(cls, encrypted_b64: str, key: str) -> Optional[str]:
        """Try both Blowfish and DES decryption."""
        # Try Blowfish first (more common)
        result = cls.blowfish_decrypt(encrypted_b64, key)
        if result and result.isprintable():
            return result

        # Try DES
        result = cls.des_decrypt(encrypted_b64, key)
        if result and result.isprintable():
            return result

        return None


class DecryptCallExtractor:
    """Extracts decrypt method calls from Java source files."""

    # Pattern to match decrypt calls: someMethod("encrypted_base64", "key")
    # This matches the obfuscated method names (lIIII... patterns)
    DECRYPT_CALL_PATTERN = re.compile(
        r'([lI]{5,})\s*\(\s*"([A-Za-z0-9+/=]{8,})"\s*,\s*"([^"]+)"\s*\)'
    )

    # Also match non-obfuscated decrypt patterns
    DECRYPT_PATTERN2 = re.compile(
        r'decrypt[A-Za-z]*\s*\(\s*"([A-Za-z0-9+/=]{8,})"\s*,\s*"([^"]+)"\s*\)'
    )

    def __init__(self, source_dir: Path):
        self.source_dir = source_dir
        self.encrypted_strings: Dict[str, Dict] = {}  # encrypted -> {key, decrypted, locations}
        self.stats = {
            'files_scanned': 0,
            'calls_found': 0,
            'decrypted': 0,
            'failed': 0,
        }

    def scan_file(self, file_path: Path) -> List[Tuple[str, str, str]]:
        """Scan a Java file for decrypt calls. Returns [(encrypted, key, method_name), ...]"""
        with open(file_path, 'r', errors='ignore') as f:
            content = f.read()

        results = []

        # Find obfuscated decrypt calls
        for match in self.DECRYPT_CALL_PATTERN.finditer(content):
            method_name = match.group(1)
            encrypted = match.group(2)
            key = match.group(3)
            results.append((encrypted, key, method_name))

        # Find named decrypt calls
        for match in self.DECRYPT_PATTERN2.finditer(content):
            encrypted = match.group(1)
            key = match.group(2)
            results.append((encrypted, key, 'decrypt'))

        return results

    def process_directory(self):
        """Process all Java files in the source directory."""
        java_files = list(self.source_dir.rglob('*.java'))
        total = len(java_files)

        print(f"\n[*] Scanning {total} Java files for encrypted strings...")
        print("-" * 60)

        for i, file_path in enumerate(java_files, 1):
            self.stats['files_scanned'] += 1

            try:
                calls = self.scan_file(file_path)
                for encrypted, key, method in calls:
                    self.stats['calls_found'] += 1

                    if encrypted not in self.encrypted_strings:
                        # Try to decrypt
                        decrypted = SquireStringDecryptor.try_decrypt(encrypted, key)

                        self.encrypted_strings[encrypted] = {
                            'key': key,
                            'decrypted': decrypted,
                            'method': method,
                            'locations': [str(file_path.relative_to(self.source_dir))],
                        }

                        if decrypted:
                            self.stats['decrypted'] += 1
                        else:
                            self.stats['failed'] += 1
                    else:
                        # Add location
                        loc = str(file_path.relative_to(self.source_dir))
                        if loc not in self.encrypted_strings[encrypted]['locations']:
                            self.encrypted_strings[encrypted]['locations'].append(loc)

                if i % 500 == 0 or i == total:
                    print(f"  [{i:4}/{total}] Scanned, found {self.stats['calls_found']} calls")

            except Exception as e:
                print(f"  [ERROR] {file_path.name}: {e}")

        print("-" * 60)

    def print_results(self):
        """Print decryption results."""
        print("\n" + "=" * 60)
        print("  STRING DECRYPTION RESULTS")
        print("=" * 60)
        print(f"  Files scanned:     {self.stats['files_scanned']}")
        print(f"  Decrypt calls:     {self.stats['calls_found']}")
        print(f"  Unique strings:    {len(self.encrypted_strings)}")
        print(f"  Successfully decrypted: {self.stats['decrypted']}")
        print(f"  Failed to decrypt: {self.stats['failed']}")
        print("=" * 60)

        # Print some example decryptions
        print("\n[+] Sample Decrypted Strings:")
        print("-" * 60)

        count = 0
        for encrypted, info in self.encrypted_strings.items():
            if info['decrypted'] and count < 30:
                print(f"  Key: {info['key']}")
                print(f"  Encrypted: {encrypted[:50]}...")
                print(f"  Decrypted: {info['decrypted']}")
                print()
                count += 1

    def save_results(self, output_path: Path):
        """Save all decryption results to JSON."""
        results = {
            'stats': self.stats,
            'strings': self.encrypted_strings,
        }

        with open(output_path, 'w') as f:
            json.dump(results, f, indent=2)

        print(f"\n[+] Full results saved to: {output_path}")

    def generate_replacement_map(self, output_path: Path):
        """Generate a simple encrypted -> decrypted map for use in deobfuscator."""
        mapping = {}
        for encrypted, info in self.encrypted_strings.items():
            if info['decrypted']:
                mapping[encrypted] = info['decrypted']

        with open(output_path, 'w') as f:
            json.dump(mapping, f, indent=2)

        print(f"[+] Replacement map saved to: {output_path}")
        return mapping


def main():
    source_dir = Path('decompiled_src')
    output_dir = Path('deobfuscated_src')

    if not source_dir.exists():
        print(f"[ERROR] Source directory not found: {source_dir}")
        sys.exit(1)

    output_dir.mkdir(exist_ok=True)

    print()
    print("=" * 60)
    print("  SQUIRE STRING DECRYPTOR")
    print("=" * 60)
    print(f"  Source: {source_dir}")

    extractor = DecryptCallExtractor(source_dir)
    extractor.process_directory()
    extractor.print_results()
    extractor.save_results(output_dir / 'decrypted_strings.json')
    extractor.generate_replacement_map(output_dir / 'string_mapping.json')

    print("\n[+] Done!")


if __name__ == '__main__':
    main()
