#!/usr/bin/env python3
"""
Squire Source Deobfuscator

This script produces ACTUAL DEOBFUSCATED SOURCE CODE by:
1. Reading the decompiled .java files
2. Finding all decrypt("encrypted", "key") calls
3. Replacing them with the actual decrypted string
4. Outputting clean, readable .java source files

This is the RIGHT approach - it gives you source code you can read and compile.

Usage:
    python3 deobfuscate_source.py --input decompiled_src/plugins --output clean_src
"""

import os
import re
import sys
import json
import base64
import hashlib
from pathlib import Path
from typing import Dict, Optional, Tuple
from Crypto.Cipher import Blowfish, DES


class StringDecryptor:
    """Handles all three encryption methods used by Squire."""

    @staticmethod
    def md5_hash(key: str) -> bytes:
        return hashlib.md5(key.encode('utf-8')).digest()

    @classmethod
    def blowfish_decrypt(cls, encrypted_b64: str, key: str) -> Optional[str]:
        try:
            encrypted = base64.b64decode(encrypted_b64)
            key_bytes = cls.md5_hash(key)
            cipher = Blowfish.new(key_bytes, Blowfish.MODE_ECB)
            decrypted = cipher.decrypt(encrypted)
            # Remove PKCS5 padding
            pad_len = decrypted[-1]
            if pad_len <= 8:
                decrypted = decrypted[:-pad_len]
            return decrypted.decode('utf-8')
        except:
            return None

    @classmethod
    def des_decrypt(cls, encrypted_b64: str, key: str) -> Optional[str]:
        try:
            encrypted = base64.b64decode(encrypted_b64)
            key_bytes = cls.md5_hash(key)[:8]
            cipher = DES.new(key_bytes, DES.MODE_ECB)
            decrypted = cipher.decrypt(encrypted)
            # Remove PKCS5 padding
            pad_len = decrypted[-1]
            if pad_len <= 8:
                decrypted = decrypted[:-pad_len]
            return decrypted.decode('utf-8')
        except:
            return None

    @classmethod
    def xor_decrypt(cls, encrypted_b64: str, key: str) -> Optional[str]:
        try:
            encrypted = base64.b64decode(encrypted_b64)
            key_bytes = key.encode('utf-8')
            decrypted = bytes(b ^ key_bytes[i % len(key_bytes)] for i, b in enumerate(encrypted))
            return decrypted.decode('utf-8')
        except:
            return None

    @classmethod
    def decrypt(cls, encrypted_b64: str, key: str) -> Optional[str]:
        """Try all decryption methods."""
        # Try XOR first (most common)
        result = cls.xor_decrypt(encrypted_b64, key)
        if result and cls._is_valid_string(result):
            return result

        # Try Blowfish
        result = cls.blowfish_decrypt(encrypted_b64, key)
        if result and cls._is_valid_string(result):
            return result

        # Try DES
        result = cls.des_decrypt(encrypted_b64, key)
        if result and cls._is_valid_string(result):
            return result

        return None

    @staticmethod
    def _is_valid_string(s: str) -> bool:
        """Check if decrypted string looks valid."""
        if not s:
            return False
        # Check if mostly printable ASCII
        printable = sum(1 for c in s if 32 <= ord(c) < 127 or c in '\n\r\t')
        return printable >= len(s) * 0.8


class SourceDeobfuscator:
    """Transforms obfuscated Java source into readable code."""

    # Pattern to match decrypt method calls
    # Matches: methodName("base64string", "key")
    DECRYPT_PATTERN = re.compile(
        r'([a-zA-Z_][a-zA-Z0-9_]*)\s*\(\s*"([^"]+)"\s*,\s*"([^"]+)"\s*\)'
    )

    # Pattern to match array access with decryption
    # Matches: arrayName[index]
    ARRAY_ACCESS_PATTERN = re.compile(
        r'([a-zA-Z_][a-zA-Z0-9_]*)\s*\[\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*\[\s*(\d+)\s*\]\s*\]'
    )

    # Common decrypt method names (obfuscated)
    DECRYPT_METHODS = {
        'lIlIl', 'lllIllI', 'llIIIIII', 'lIlIlIl', 'llllIIII',
        'lIIlIIlI', 'llIIllII', 'lllllIII', 'IlIlIlIl', 'IIllIIll'
    }

    def __init__(self, input_dir: Path, output_dir: Path):
        self.input_dir = input_dir
        self.output_dir = output_dir
        self.decryptor = StringDecryptor()
        self.stats = {
            'files_processed': 0,
            'strings_decrypted': 0,
            'strings_failed': 0,
            'dead_code_removed': 0,
        }
        self.cipher_cache: Dict[Tuple[str, str], str] = {}

    def process_all(self):
        """Process all Java files in input directory."""
        print("=" * 60)
        print("  SQUIRE SOURCE DEOBFUSCATOR")
        print("=" * 60)
        print(f"  Input:  {self.input_dir}")
        print(f"  Output: {self.output_dir}")
        print("=" * 60 + "\n")

        # Find all Java files
        java_files = list(self.input_dir.rglob("*.java"))
        print(f"[*] Found {len(java_files)} Java files\n")

        for java_file in java_files:
            self.process_file(java_file)

        self.print_stats()

    def process_file(self, file_path: Path):
        """Process a single Java file."""
        try:
            with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()

            original_content = content

            # Step 1: Replace decrypt calls with actual strings
            content, decrypt_count = self.replace_decrypt_calls(content)

            # Step 2: Remove dead code patterns
            content, dead_count = self.remove_dead_code(content)

            # Step 3: Clean up obvious obfuscation artifacts
            content = self.cleanup_artifacts(content)

            # Only write if changed
            if content != original_content:
                # Calculate output path
                rel_path = file_path.relative_to(self.input_dir)
                output_path = self.output_dir / rel_path
                output_path.parent.mkdir(parents=True, exist_ok=True)

                with open(output_path, 'w', encoding='utf-8') as f:
                    f.write(content)

                self.stats['files_processed'] += 1
                self.stats['strings_decrypted'] += decrypt_count
                self.stats['dead_code_removed'] += dead_count

                if decrypt_count > 0 or dead_count > 0:
                    print(f"  [OK] {rel_path}: {decrypt_count} strings, {dead_count} dead code")
            else:
                # Copy unchanged file
                rel_path = file_path.relative_to(self.input_dir)
                output_path = self.output_dir / rel_path
                output_path.parent.mkdir(parents=True, exist_ok=True)
                with open(output_path, 'w', encoding='utf-8') as f:
                    f.write(content)

        except Exception as e:
            print(f"  [ERR] {file_path}: {e}")

    def replace_decrypt_calls(self, content: str) -> Tuple[str, int]:
        """Replace decrypt("encrypted", "key") calls with actual strings."""
        count = 0

        def replacer(match):
            nonlocal count
            method_name = match.group(1)
            encrypted = match.group(2)
            key = match.group(3)

            # Check cache first
            cache_key = (encrypted, key)
            if cache_key in self.cipher_cache:
                count += 1
                return f'"{self.escape_java_string(self.cipher_cache[cache_key])}"'

            # Try to decrypt
            decrypted = self.decryptor.decrypt(encrypted, key)
            if decrypted:
                self.cipher_cache[cache_key] = decrypted
                count += 1
                return f'"{self.escape_java_string(decrypted)}"'

            # Return original if can't decrypt
            return match.group(0)

        # Replace all decrypt calls
        content = self.DECRYPT_PATTERN.sub(replacer, content)

        return content, count

    def remove_dead_code(self, content: str) -> Tuple[str, int]:
        """Remove obvious dead code patterns."""
        count = 0

        # Pattern 1: "".length(); standalone statements
        pattern1 = re.compile(r'^\s*""\s*\.\s*length\s*\(\s*\)\s*;\s*$', re.MULTILINE)
        content, n = pattern1.subn('', content)
        count += n

        # Pattern 2: " ".length(); etc.
        pattern2 = re.compile(r'^\s*" +"\s*\.\s*length\s*\(\s*\)\s*;\s*$', re.MULTILINE)
        content, n = pattern2.subn('', content)
        count += n

        # Pattern 3: if (0 != 0) - always false
        pattern3 = re.compile(r'if\s*\(\s*0\s*!=\s*0\s*\)\s*\{[^}]*\}', re.DOTALL)
        content, n = pattern3.subn('', content)
        count += n

        # Pattern 4: if (true ^ true) - always false
        pattern4 = re.compile(r'if\s*\(\s*true\s*\^\s*true\s*\)\s*\{[^}]*\}', re.DOTALL)
        content, n = pattern4.subn('', content)
        count += n

        return content, count

    def cleanup_artifacts(self, content: str) -> str:
        """Clean up remaining obfuscation artifacts."""

        # Replace ?? type errors with int
        content = re.sub(r'\?\?\s+(\w+)\s*=', r'int \1 =', content)

        # Remove multiple blank lines
        content = re.sub(r'\n{3,}', '\n\n', content)

        return content

    @staticmethod
    def escape_java_string(s: str) -> str:
        """Escape a string for Java source code."""
        return (s
            .replace('\\', '\\\\')
            .replace('"', '\\"')
            .replace('\n', '\\n')
            .replace('\r', '\\r')
            .replace('\t', '\\t'))

    def print_stats(self):
        """Print processing statistics."""
        print("\n" + "=" * 60)
        print("  DEOBFUSCATION COMPLETE")
        print("=" * 60)
        print(f"  Files processed:    {self.stats['files_processed']}")
        print(f"  Strings decrypted:  {self.stats['strings_decrypted']}")
        print(f"  Dead code removed:  {self.stats['dead_code_removed']}")
        print(f"  Output directory:   {self.output_dir}")
        print("=" * 60)


def main():
    import argparse

    parser = argparse.ArgumentParser(description="Deobfuscate Squire source code")
    parser.add_argument("--input", "-i", default="decompiled_src/plugins",
                        help="Input directory with obfuscated Java files")
    parser.add_argument("--output", "-o", default="clean_src",
                        help="Output directory for deobfuscated source")

    args = parser.parse_args()

    input_dir = Path(args.input)
    output_dir = Path(args.output)

    if not input_dir.exists():
        print(f"[ERROR] Input directory not found: {input_dir}")
        sys.exit(1)

    deobfuscator = SourceDeobfuscator(input_dir, output_dir)
    deobfuscator.process_all()


if __name__ == "__main__":
    main()
