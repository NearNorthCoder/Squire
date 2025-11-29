#!/usr/bin/env python3
"""
String Dictionary Builder
Collects all decrypted strings from Squire plugins
"""

import base64
import hashlib
import re
import json
from pathlib import Path
from collections import defaultdict, Counter

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    import subprocess
    import sys
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


def decrypt_xor(encrypted_b64: str, key: str) -> tuple:
    """Returns (success, decrypted_string)"""
    if not encrypted_b64:
        return (True, "")
    try:
        decoded = base64.b64decode(encrypted_b64).decode('utf-8')
        result = []
        for i, char in enumerate(decoded):
            result.append(chr(ord(char) ^ ord(key[i % len(key)])))
        return (True, ''.join(result))
    except Exception as e:
        return (False, str(e))


def decrypt_des(encrypted_b64: str, key_string: str) -> tuple:
    """Returns (success, decrypted_string)"""
    if not encrypted_b64:
        return (True, "")
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()[:8]
        cipher = DES.new(key, DES.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return (True, decrypted.decode('utf-8'))
    except Exception as e:
        return (False, str(e))


def decrypt_blowfish(encrypted_b64: str, key_string: str) -> tuple:
    """Returns (success, decrypted_string)"""
    if not encrypted_b64:
        return (True, "")
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()
        cipher = Blowfish.new(key, Blowfish.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return (True, decrypted.decode('utf-8'))
    except Exception as e:
        return (False, str(e))


def identify_decrypt_method(method_name: str, content: str) -> str:
    """Identify decryption algorithm from method implementation"""
    pattern = rf'private\s+static\s+String\s+{re.escape(method_name)}\s*\([^)]+\)\s*\{{'
    match = re.search(pattern, content)
    if not match:
        return None

    start = match.end()
    brace_count = 1
    end = start
    while brace_count > 0 and end < len(content):
        if content[end] == '{':
            brace_count += 1
        elif content[end] == '}':
            brace_count -= 1
        end += 1

    method_body = content[start:end]

    if 'Blowfish' in method_body:
        return 'Blowfish'
    elif 'DES' in method_body:
        return 'DES'
    elif 'StringBuilder' in method_body and '^' in method_body:
        return 'XOR'
    return None


def collect_strings_from_file(file_path: str, stats: dict) -> list:
    """Extract all encrypted strings and decrypt them"""
    results = []

    try:
        with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
    except Exception as e:
        stats['file_errors'] += 1
        return results

    # Build decrypt method map
    decrypt_methods = {}
    method_pattern = r'private\s+static\s+String\s+(l[lI]+)\s*\('
    for match in re.finditer(method_pattern, content):
        method_name = match.group(1)
        algo = identify_decrypt_method(method_name, content)
        if algo:
            decrypt_methods[method_name] = algo

    # Find all encrypted string calls
    call_pattern = r'(l[lI]+)\s*\(\s*"([^"]*)"\s*,\s*"([^"]+)"\s*\)'

    for match in re.finditer(call_pattern, content):
        method = match.group(1)
        encrypted = match.group(2)
        key = match.group(3)

        algo = decrypt_methods.get(method)
        if not algo:
            # Guess based on method name pattern
            if method.count('I') > method.count('l') * 2:
                algo = 'XOR'
            elif 'llI' in method or method.endswith('lI'):
                algo = 'Blowfish'
            else:
                algo = 'DES'

        # Decrypt
        if algo == 'XOR':
            success, decrypted = decrypt_xor(encrypted, key)
        elif algo == 'DES':
            success, decrypted = decrypt_des(encrypted, key)
        elif algo == 'Blowfish':
            success, decrypted = decrypt_blowfish(encrypted, key)
        else:
            success = False
            decrypted = "Unknown algorithm"

        results.append({
            'encrypted': encrypted,
            'key': key,
            'algorithm': algo,
            'decrypted': decrypted if success else None,
            'success': success,
            'error': None if success else decrypted,
            'file': file_path
        })

        if success:
            stats['decrypted'] += 1
        else:
            stats['failed'] += 1

    return results


def categorize_string(s: str) -> list:
    """Categorize a decrypted string"""
    categories = []

    if not s:
        return ['empty']

    # OSRS Item names (check for common item-related words)
    item_keywords = ['coin', 'gold', 'rune', 'weapon', 'armor', 'potion', 'food',
                     'ore', 'bar', 'log', 'bone', 'hide', 'seed', 'herb', 'gem',
                     'ring', 'amulet', 'arrow', 'bolt', 'staff', 'sword', 'axe',
                     'pickaxe', 'boots', 'gloves', 'helmet', 'platebody', 'shield']
    if any(keyword in s.lower() for keyword in item_keywords):
        categories.append('item')

    # NPC names (check for common NPC-related words)
    npc_keywords = ['goblin', 'guard', 'demon', 'dragon', 'zombie', 'skeleton',
                    'chicken', 'cow', 'rat', 'spider', 'wizard', 'monk', 'knight',
                    'king', 'queen', 'banker', 'shop', 'keeper']
    if any(keyword in s.lower() for keyword in npc_keywords):
        categories.append('npc')

    # Locations
    location_keywords = ['bank', 'varrock', 'lumbridge', 'falador', 'ardougne',
                         'grand exchange', 'ge', 'castle', 'mine', 'forest',
                         'wilderness', 'cave', 'dungeon', 'altar', 'agility']
    if any(keyword in s.lower() for keyword in location_keywords):
        categories.append('location')

    # Actions/Commands
    action_keywords = ['walk', 'attack', 'use', 'take', 'open', 'close', 'talk-to',
                      'trade', 'equip', 'wield', 'drink', 'eat', 'drop', 'bury',
                      'withdraw', 'deposit', 'buy', 'sell']
    if any(keyword in s.lower() for keyword in action_keywords):
        categories.append('action')

    # Messages/Notifications
    if s.startswith('[') or 'you' in s.lower() or 'cannot' in s.lower():
        categories.append('message')

    # Config keys (usually have _ or . or are all caps)
    if '_' in s or (s.isupper() and len(s) > 3):
        categories.append('config')

    # URLs
    if 'http' in s or 'www.' in s or '.com' in s:
        categories.append('url')

    # Numbers only
    if s.isdigit():
        categories.append('number')

    # Single character
    if len(s) == 1:
        categories.append('single_char')

    # SQL/Query
    if 'select' in s.lower() or 'where' in s.lower() or 'from' in s.lower():
        categories.append('sql')

    # JSON/Data
    if s.startswith('{') or s.startswith('['):
        categories.append('json')

    return categories if categories else ['uncategorized']


def main():
    print("=" * 70)
    print("STRING DICTIONARY BUILDER")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    plugins_src = base_dir / "plugins" / "src"
    output_dir = base_dir / "tools"

    if not plugins_src.exists():
        print(f"ERROR: Plugins source not found: {plugins_src}")
        return

    print(f"\nScanning: {plugins_src}")
    print("-" * 70)

    stats = {
        'files_processed': 0,
        'file_errors': 0,
        'decrypted': 0,
        'failed': 0
    }

    all_strings = []
    plugin_dirs = sorted(plugins_src.iterdir())

    for i, plugin_dir in enumerate(plugin_dirs):
        if not plugin_dir.is_dir():
            continue

        plugin_name = plugin_dir.name
        plugin_strings = 0

        for java_file in plugin_dir.glob('**/*.java'):
            strings = collect_strings_from_file(str(java_file), stats)
            all_strings.extend(strings)
            plugin_strings += len(strings)
            stats['files_processed'] += 1

        if plugin_strings > 0:
            print(f"[{i+1:2}/{len(plugin_dirs)}] {plugin_name}: {plugin_strings} strings")

    print("-" * 70)
    print(f"\nTotal strings found: {len(all_strings)}")
    print(f"Successfully decrypted: {stats['decrypted']}")
    print(f"Failed to decrypt: {stats['failed']}")
    print(f"Files processed: {stats['files_processed']}")
    print(f"File errors: {stats['file_errors']}")

    # Build string dictionary
    print("\n" + "=" * 70)
    print("BUILDING STRING DICTIONARY")
    print("=" * 70)

    string_dict = {}
    decrypted_counter = Counter()
    category_counter = defaultdict(int)

    for entry in all_strings:
        if entry['success']:
            key = f"{entry['encrypted']}:{entry['key']}"
            string_dict[key] = {
                'encrypted': entry['encrypted'],
                'key': entry['key'],
                'algorithm': entry['algorithm'],
                'decrypted': entry['decrypted']
            }
            decrypted_counter[entry['decrypted']] += 1

            categories = categorize_string(entry['decrypted'])
            for cat in categories:
                category_counter[cat] += 1

    # Save full dictionary
    output_file = output_dir / "string_dictionary.json"
    output_dir.mkdir(exist_ok=True)

    with open(output_file, 'w', encoding='utf-8') as f:
        json.dump(string_dict, f, indent=2, ensure_ascii=False)

    print(f"\nUnique encrypted strings: {len(string_dict)}")
    print(f"Unique decrypted values: {len(decrypted_counter)}")
    print(f"\nSaved dictionary to: {output_file}")

    # Category breakdown
    print("\n" + "-" * 70)
    print("STRING CATEGORIES:")
    print("-" * 70)
    for cat, count in sorted(category_counter.items(), key=lambda x: x[1], reverse=True):
        print(f"  {cat:20s}: {count:5d}")

    # Most common strings
    print("\n" + "-" * 70)
    print("TOP 30 MOST COMMON STRINGS:")
    print("-" * 70)
    for i, (string, count) in enumerate(decrypted_counter.most_common(30), 1):
        display = string[:60] + "..." if len(string) > 60 else string
        print(f"{i:2d}. [{count:3d}x] {display}")

    # Interesting strings
    print("\n" + "-" * 70)
    print("SAMPLE INTERESTING STRINGS:")
    print("-" * 70)

    interesting = []
    for entry in all_strings:
        if entry['success'] and entry['decrypted']:
            s = entry['decrypted']
            # Look for interesting patterns
            if (len(s) > 5 and len(s) < 100 and
                any(keyword in s.lower() for keyword in
                    ['bank', 'attack', 'player', 'inventory', 'withdraw', 'deposit',
                     'equip', 'combat', 'skill', 'quest', 'plugin', 'bot', 'script'])):
                interesting.append(s)

    # Remove duplicates and sort
    interesting = sorted(set(interesting))[:50]
    for i, s in enumerate(interesting, 1):
        print(f"{i:2d}. {s}")

    # Failed decryptions
    if stats['failed'] > 0:
        print("\n" + "-" * 70)
        print(f"FAILED DECRYPTIONS ({stats['failed']}):")
        print("-" * 70)
        failed = [e for e in all_strings if not e['success']][:20]
        for i, entry in enumerate(failed, 1):
            print(f"{i:2d}. {entry['encrypted'][:40]}... (key: {entry['key']}) - {entry['error']}")

    print("\n" + "=" * 70)


if __name__ == "__main__":
    main()
