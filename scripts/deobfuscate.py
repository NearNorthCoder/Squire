#!/usr/bin/env python3
"""
Squire Plugin Deobfuscator

Deobfuscates the heavily obfuscated Squire plugin source code by:
1. Decrypting XOR + Base64 encoded strings
2. Decrypting AES/DES encrypted strings
3. Removing dead code patterns
4. Simplifying obfuscated expressions
5. Renaming obfuscated identifiers

Usage:
    python3 scripts/deobfuscate.py [--input DIR] [--output DIR]
"""

import os
import re
import sys
import json
import base64
import hashlib
import argparse
from pathlib import Path
from typing import Dict, List, Tuple, Optional
from collections import defaultdict

# Cryptographic imports
try:
    from Crypto.Cipher import AES, DES, Blowfish
    from Crypto.Util.Padding import unpad
    HAS_CRYPTO = True
except ImportError:
    HAS_CRYPTO = False
    print("[Warning] PyCryptodome not installed. Install with: pip install pycryptodome")


class StringDecryptor:
    """Decrypts obfuscated strings found in the code."""

    # Known encryption keys from cipher analysis
    KNOWN_KEYS = [
        "squire",
        "runelite",
        "plugins",
        "client",
        "gg.squire",
    ]

    @staticmethod
    def xor_decrypt(encoded: str, key: str) -> Optional[str]:
        """XOR decrypt a Base64 encoded string."""
        try:
            decoded = base64.b64decode(encoded).decode('utf-8')
            result = []
            key_chars = list(key)
            for i, char in enumerate(decoded):
                result.append(chr(ord(char) ^ ord(key_chars[i % len(key_chars)])))
            return ''.join(result)
        except:
            return None

    @staticmethod
    def des_decrypt(encoded: str, key: str) -> Optional[str]:
        """DES/ECB decrypt a Base64 encoded string."""
        if not HAS_CRYPTO:
            return None
        try:
            # Derive 8-byte key using SHA-256
            key_bytes = hashlib.sha256(key.encode()).digest()[:8]
            cipher = DES.new(key_bytes, DES.MODE_ECB)
            decrypted = cipher.decrypt(base64.b64decode(encoded))
            return unpad(decrypted, 8).decode('utf-8')
        except:
            return None

    @staticmethod
    def blowfish_decrypt(encoded: str, key: str) -> Optional[str]:
        """Blowfish/ECB decrypt a Base64 encoded string."""
        if not HAS_CRYPTO:
            return None
        try:
            key_bytes = hashlib.sha256(key.encode()).digest()[:16]
            cipher = Blowfish.new(key_bytes, Blowfish.MODE_ECB)
            decrypted = cipher.decrypt(base64.b64decode(encoded))
            return unpad(decrypted, 8).decode('utf-8')
        except:
            return None

    @staticmethod
    def aes_decrypt(encoded: str, key: str) -> Optional[str]:
        """AES/ECB decrypt a Base64 encoded string."""
        if not HAS_CRYPTO:
            return None
        try:
            key_bytes = hashlib.sha256(key.encode()).digest()[:16]
            cipher = AES.new(key_bytes, AES.MODE_ECB)
            decrypted = cipher.decrypt(base64.b64decode(encoded))
            return unpad(decrypted, 16).decode('utf-8')
        except:
            return None

    @classmethod
    def try_decrypt(cls, encoded: str) -> Optional[str]:
        """Try all known decryption methods and keys."""
        for key in cls.KNOWN_KEYS:
            # Try XOR first (most common)
            result = cls.xor_decrypt(encoded, key)
            if result and result.isprintable():
                return result

            # Try DES
            result = cls.des_decrypt(encoded, key)
            if result and result.isprintable():
                return result

            # Try Blowfish
            result = cls.blowfish_decrypt(encoded, key)
            if result and result.isprintable():
                return result

            # Try AES
            result = cls.aes_decrypt(encoded, key)
            if result and result.isprintable():
                return result

        return None


class DeadCodeRemover:
    """Removes dead code patterns inserted by obfuscator."""

    # Patterns that are always dead code
    DEAD_PATTERNS = [
        # Empty string length calls (no-op)
        r'^\s*""\s*\.\s*length\s*\(\s*\)\s*;\s*$',

        # Always-false conditions
        r'if\s*\(\s*\(\s*true\s*\^\s*true\s*\)\s*&.*\)\s*\{[^}]*\}',
        r'if\s*\(\s*\(\s*\d+\s*\^\s*\d+\s*\)\s*<=\s*\(\s*-\s*"\s*"\s*\.\s*length\s*\(\s*\)\s*\)\s*\)',

        # Return null in unreachable code
        r'if\s*\(\s*\(\s*true\s*\^\s*true\s*\).*\)\s*\{\s*return\s+null\s*;\s*\}',
    ]

    # Inline patterns to remove
    INLINE_DEAD = [
        r'""\s*\.\s*length\s*\(\s*\)\s*;',
    ]

    @classmethod
    def remove_dead_code(cls, content: str) -> str:
        """Remove all dead code patterns from content."""
        # Remove multiline dead patterns
        for pattern in cls.DEAD_PATTERNS:
            content = re.sub(pattern, '', content, flags=re.MULTILINE | re.DOTALL)

        # Remove inline dead code
        for pattern in cls.INLINE_DEAD:
            content = re.sub(pattern, '', content)

        # Clean up resulting empty lines
        content = re.sub(r'\n\s*\n\s*\n', '\n\n', content)

        return content


class ExpressionSimplifier:
    """Simplifies obfuscated expressions to their actual values."""

    # Known constant patterns
    CONSTANTS = {
        r'" "\s*\.\s*length\s*\(\s*\)': '1',
        r'"  "\s*\.\s*length\s*\(\s*\)': '2',
        r'"   "\s*\.\s*length\s*\(\s*\)': '3',
        r'"    "\s*\.\s*length\s*\(\s*\)': '4',
        r'"     "\s*\.\s*length\s*\(\s*\)': '5',
        r'-\s*"\s*"\s*\.\s*length\s*\(\s*\)': '0',
        r'\(\s*-\s*"\s*"\s*\.\s*length\s*\(\s*\)\s*\)': '0',
    }

    # Complex expression patterns that evaluate to constants
    COMPLEX_EXPRESSIONS = [
        # (X ^ Y) patterns that can be computed
        (r'\(\s*(\d+)\s*\^\s*(\d+)\s*\)', lambda m: str(int(m.group(1)) ^ int(m.group(2)))),
        # (X + Y) patterns
        (r'\(\s*(\d+)\s*\+\s*(\d+)\s*\)', lambda m: str(int(m.group(1)) + int(m.group(2)))),
        # (X - Y) patterns
        (r'\(\s*(\d+)\s*-\s*(\d+)\s*\)', lambda m: str(int(m.group(1)) - int(m.group(2)))),
    ]

    @classmethod
    def simplify(cls, content: str) -> str:
        """Simplify all obfuscated expressions."""
        # Replace known constants
        for pattern, value in cls.CONSTANTS.items():
            content = re.sub(pattern, value, content)

        # Simplify complex expressions (multiple passes for nested)
        for _ in range(5):  # Multiple passes for nested expressions
            for pattern, replacer in cls.COMPLEX_EXPRESSIONS:
                content = re.sub(pattern, replacer, content)

        return content


class IdentifierRenamer:
    """Renames obfuscated identifiers to meaningful names."""

    # Pattern for obfuscated names (l/I combinations)
    OBFUSCATED_PATTERN = re.compile(r'\b([lI]{5,})\b')

    # Pattern for single-letter class names
    SINGLE_LETTER_CLASS = re.compile(r'(?:class|interface|enum)\s+([a-zA-Z])\s+')

    # Context-based naming hints
    NAMING_HINTS = {
        'Inject': 'injected',
        'Config': 'config',
        'Client': 'client',
        'Plugin': 'plugin',
        'Overlay': 'overlay',
        'Task': 'task',
        'Panel': 'panel',
        'Widget': 'widget',
        'Player': 'player',
        'NPC': 'npc',
        'Item': 'item',
        'Inventory': 'inventory',
        'Bank': 'bank',
        'Prayer': 'prayer',
        'Combat': 'combat',
    }

    def __init__(self):
        self.name_counter = defaultdict(int)
        self.name_cache = {}

    def generate_name(self, obfuscated: str, context: str = '') -> str:
        """Generate a readable name for an obfuscated identifier."""
        if obfuscated in self.name_cache:
            return self.name_cache[obfuscated]

        # Determine prefix based on context
        prefix = 'var'
        for hint, name in self.NAMING_HINTS.items():
            if hint.lower() in context.lower():
                prefix = name
                break

        # Generate unique name
        self.name_counter[prefix] += 1
        new_name = f"{prefix}{self.name_counter[prefix]}"
        self.name_cache[obfuscated] = new_name

        return new_name

    def rename_identifiers(self, content: str, filename: str = '') -> str:
        """Rename all obfuscated identifiers in content."""
        # Find all obfuscated names
        matches = self.OBFUSCATED_PATTERN.findall(content)

        for match in set(matches):
            if len(match) > 4:  # Only rename long obfuscated names
                new_name = self.generate_name(match, filename)
                # Use word boundaries to avoid partial replacements
                content = re.sub(rf'\b{re.escape(match)}\b', new_name, content)

        return content


class PluginMapper:
    """Maps hash-based plugin directories to their actual names."""

    # Comprehensive mapping of hash IDs to plugin names and descriptions
    HASH_TO_PLUGIN = {
        # Bosses
        '70c49992': ('Vorkath', 'Kills the big blue dragon'),
        'f9e8fbd0': ('Zulrah', 'Zulrah killing plugin'),
        'f9dee1ad': ('Hydra', 'Alchemical Hydra automation'),
        'a79d2820': ('CorporealBeast', 'Kills Corp beast'),
        'f13c63fa': ('Bandos', 'Kills General Graardor'),
        '9cc2ff9a': ('Saradomin', 'Kills Commander Zilyana'),
        'f8a8c131': ('Zamorak', 'Kills Kril Tsutsaroth'),
        '2266a50d': ('DukeSucellus', 'DT2 boss'),
        '861c713a': ('Vardorvis', 'DT2 boss'),
        '0e178634': ('Whisperer', 'DT2 boss'),
        '5c667a01': ('Scurrius', 'Rat King boss'),
        '29f97a50': ('Shamans', 'Kills Lizardman Shamans'),

        # Raids
        '778e0a57': ('ChambersOfXeric', 'COX raid automation'),
        '581bf999': ('AutoTOA', 'Full TOA automation'),

        # Minigames
        '3b638005': ('Barrows', 'Barrows runs'),
        'fabe4829': ('FightCaves', 'Fight Caves automation'),
        '2fcaa9ca': ('HallowedSepulchre', 'Sepulchre runs'),
        '146c6f65': ('Gauntlet', 'Normal/Corrupted Gauntlet'),
        'a295c4aa': ('GiantsFoundry', 'Giants Foundry minigame'),
        '37ff9308': ('Mixology', 'Mixology minigame'),
        '75784950': ('MoonsOfPeril', 'Moons of Peril'),
        '1242c893': ('NightmareZone', 'NMZ automation'),
        'd3ba43e2': ('PestControl', 'Pest Control'),
        '36afa564': ('SorceressGarden', 'Sorceress Garden'),
        '185d2d5a': ('Wintertodt', 'Wintertodt minigame'),

        # Skilling
        '29a54919': ('Agility', 'Agility courses'),
        '06deb524': ('BlastFurnace', 'Blast Furnace'),
        '99cb6034': ('Farmer', 'Farm runs'),
        '5d6a9183': ('Herblore', 'Herblore automation'),
        'e2a56d76': ('Hunter', 'Hunter skill'),
        '3f45ab50': ('Miner', 'Mining automation'),
        'afc9cf98': ('TitheFarm', 'Tithe Farm'),
        'f90b6cea': ('Woodcutter', 'Woodcutting'),
        '9bb83689': ('AerialFisher', 'Aerial fishing'),
        'df6d2a51': ('Herbiboar', 'Herbiboar hunting'),

        # Runecrafting
        'd11e2dee': ('ZeahRunecrafter', 'Zeah runecrafting'),

        # Slayer
        '2e35b2d3': ('TuraelSkipper', 'Turael task skipping'),

        # Account Building
        'd1f9e3af': ('EasyClueBuilder', 'Easy clue account builder'),
        '51c4371d': ('BarrowsBuilder', 'Barrows account builder'),
        '7ff08cb7': ('GWDBuilder', 'GWD account builder'),
        'fdd2f9b9': ('RoguesOutfitBuilder', 'Rogues outfit builder'),
        '57051692': ('ShamanBuilder', 'Shaman account builder'),
        '7c1d3521': ('SotfBuilder', 'SOTF account builder'),
        '3047f210': ('TempletrekBuilder', 'Temple Trekking builder'),
        '9e609a1b': ('RatKingBuilder', 'Rat King account builder'),

        # Questing
        '9740bba2': ('Quester', 'Quest automation'),
        '1a91e21b': ('TempleTrekking', 'Temple Trekking'),

        # Utility
        '4d97445a': ('Basics', 'Many utility sub-plugins'),
        '21e931a2': ('Leagues', 'Leagues mode tools'),
        'a162439f': ('CharterShips', 'Charter ship navigation'),
        'd1b70a7e': ('Tempoross', 'Tempoross fish barrel'),
    }

    # Known NPC IDs for content identification
    NPC_IDS = {
        # Warriors Guild Cyclops
        2463: 'Cyclops',
        2464: 'Cyclops',
        2465: 'Cyclops',
        2466: 'Cyclops',
        2467: 'Cyclops',
        2468: 'Cyclops',
        2137: 'Cyclops',
        2138: 'Cyclops',
        2139: 'Cyclops',
        2140: 'Cyclops',
        2141: 'Cyclops',
        2142: 'Cyclops',
        # Mahogany Homes
        3266: 'Norman',
        10414: 'Bob',
        10415: 'Jeff',
        10416: 'Sarah',
        10417: 'Tau',
        10418: 'Larry',
        10419: 'Noella',
        10420: 'Ross',
        10421: 'Jess',
        10422: 'Mariah',
        10423: 'Leela',
        10424: 'Barbara',
    }

    @classmethod
    def get_plugin_info(cls, hash_id: str) -> tuple:
        """Get plugin name and description from hash ID."""
        return cls.HASH_TO_PLUGIN.get(hash_id, (None, None))

    @classmethod
    def add_plugin_header(cls, content: str, hash_id: str) -> str:
        """Add a header comment with plugin information."""
        name, desc = cls.get_plugin_info(hash_id)
        if name:
            header = f"""/*
 * Squire Plugin: {name}
 * Description: {desc}
 * Original Hash: {hash_id}
 * Deobfuscated by Squire Deobfuscator
 */

"""
            # Add header after package declaration if present
            if 'package ' in content:
                parts = content.split('\n', 1)
                if parts[0].startswith('package '):
                    return parts[0] + '\n\n' + header + parts[1]
            return header + content
        return content


class PackageMapper:
    """Maps obfuscated package names to readable names."""

    # Known package mappings from cipher
    PACKAGE_MAP = {
        'g/r/r/-/t/q/i/u/o/e/s': 'squire/plugins/internal',
        'g.r.r.p000.t.q.i.u.o.e.s': 'squire.plugins.internal',
        'c/r/m': 'squire/launcher',
        'c.r.m': 'squire.launcher',
        'o/c/k/i/-/l/o/f/-/n/c/t/e/s': 'squire/client/core',
    }

    @classmethod
    def map_packages(cls, content: str) -> str:
        """Replace obfuscated package names with readable ones."""
        for obfuscated, readable in cls.PACKAGE_MAP.items():
            content = content.replace(obfuscated, readable)
        return content


class SquireDeobfuscator:
    """Main deobfuscator class that orchestrates all transformations."""

    def __init__(self, input_dir: Path, output_dir: Path):
        self.input_dir = input_dir
        self.output_dir = output_dir
        self.renamer = IdentifierRenamer()
        self.stats = {
            'files_processed': 0,
            'strings_decrypted': 0,
            'dead_code_removed': 0,
            'expressions_simplified': 0,
            'identifiers_renamed': 0,
        }

    def find_encrypted_strings(self, content: str) -> List[Tuple[str, str]]:
        """Find Base64 encoded strings that might be encrypted."""
        # Pattern for Base64 strings in method calls
        pattern = r'["\']([A-Za-z0-9+/]{20,}={0,2})["\']'
        matches = re.findall(pattern, content)

        decrypted = []
        for match in matches:
            result = StringDecryptor.try_decrypt(match)
            if result:
                decrypted.append((match, result))
                self.stats['strings_decrypted'] += 1

        return decrypted

    def process_file(self, file_path: Path) -> str:
        """Process a single Java file."""
        with open(file_path, 'r', errors='ignore') as f:
            content = f.read()

        original_len = len(content)

        # 0. Detect plugin hash from path and add header
        path_parts = file_path.parts
        for part in path_parts:
            if re.match(r'^[a-f0-9]{8}$', part):
                content = PluginMapper.add_plugin_header(content, part)
                break

        # 1. Decrypt strings
        encrypted_strings = self.find_encrypted_strings(content)
        for encrypted, decrypted in encrypted_strings:
            # Add comment showing original and decrypted
            content = content.replace(
                f'"{encrypted}"',
                f'"{decrypted}" /* decrypted from: {encrypted[:30]}... */'
            )

        # 2. Map package names
        content = PackageMapper.map_packages(content)

        # 3. Simplify expressions
        before = content
        content = ExpressionSimplifier.simplify(content)
        if content != before:
            self.stats['expressions_simplified'] += 1

        # 4. Remove dead code
        before = content
        content = DeadCodeRemover.remove_dead_code(content)
        if len(content) < len(before):
            self.stats['dead_code_removed'] += (len(before) - len(content))

        # 5. Rename identifiers
        before = content
        content = self.renamer.rename_identifiers(content, file_path.name)
        if content != before:
            self.stats['identifiers_renamed'] += 1

        return content

    def process_directory(self):
        """Process all Java files in the input directory."""
        java_files = list(self.input_dir.rglob('*.java'))
        total = len(java_files)

        print(f"\n[*] Processing {total} Java files...")
        print("-" * 60)

        for i, file_path in enumerate(java_files, 1):
            # Calculate relative path
            rel_path = file_path.relative_to(self.input_dir)
            output_path = self.output_dir / rel_path

            # Create output directory
            output_path.parent.mkdir(parents=True, exist_ok=True)

            # Process file
            try:
                content = self.process_file(file_path)

                # Write output
                with open(output_path, 'w') as f:
                    f.write(content)

                self.stats['files_processed'] += 1

                if i % 100 == 0 or i == total:
                    print(f"  [{i:4}/{total}] Processed {rel_path.name}")

            except Exception as e:
                print(f"  [ERROR] {rel_path}: {e}")

        print("-" * 60)

    def print_stats(self):
        """Print deobfuscation statistics."""
        print("\n" + "=" * 60)
        print("  DEOBFUSCATION COMPLETE")
        print("=" * 60)
        print(f"  Files processed:       {self.stats['files_processed']}")
        print(f"  Strings decrypted:     {self.stats['strings_decrypted']}")
        print(f"  Dead code removed:     {self.stats['dead_code_removed']} bytes")
        print(f"  Expressions simplified: {self.stats['expressions_simplified']}")
        print(f"  Identifiers renamed:   {self.stats['identifiers_renamed']}")
        print(f"  Output directory:      {self.output_dir}")
        print("=" * 60)

    def generate_cipher_report(self):
        """Generate a cipher mapping report."""
        # Convert plugin mappings to a more readable format
        plugin_map = {
            hash_id: {'name': name, 'description': desc}
            for hash_id, (name, desc) in PluginMapper.HASH_TO_PLUGIN.items()
        }

        report = {
            'identifier_mappings': dict(self.renamer.name_cache),
            'package_mappings': PackageMapper.PACKAGE_MAP,
            'plugin_mappings': plugin_map,
            'npc_ids': {str(k): v for k, v in PluginMapper.NPC_IDS.items()},
            'stats': self.stats,
        }

        report_path = self.output_dir / 'deobfuscation_cipher.json'
        with open(report_path, 'w') as f:
            json.dump(report, f, indent=2)

        print(f"\n[+] Cipher report saved to: {report_path}")
        print(f"[+] Plugin mappings: {len(PluginMapper.HASH_TO_PLUGIN)} plugins identified")


def main():
    parser = argparse.ArgumentParser(description='Squire Plugin Deobfuscator')
    parser.add_argument('--input', '-i', default='decompiled_src',
                       help='Input directory with decompiled sources')
    parser.add_argument('--output', '-o', default='deobfuscated_src',
                       help='Output directory for deobfuscated sources')
    args = parser.parse_args()

    input_dir = Path(args.input)
    output_dir = Path(args.output)

    if not input_dir.exists():
        print(f"[ERROR] Input directory not found: {input_dir}")
        sys.exit(1)

    print()
    print("=" * 60)
    print("  SQUIRE PLUGIN DEOBFUSCATOR")
    print("=" * 60)
    print(f"  Input:  {input_dir}")
    print(f"  Output: {output_dir}")

    # Create deobfuscator and run
    deobfuscator = SquireDeobfuscator(input_dir, output_dir)
    deobfuscator.process_directory()
    deobfuscator.print_stats()
    deobfuscator.generate_cipher_report()

    print("\n[+] Done!")


if __name__ == '__main__':
    main()
