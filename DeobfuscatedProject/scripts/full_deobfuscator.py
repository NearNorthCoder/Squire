#!/usr/bin/env python3
"""
Comprehensive Squire Plugin Deobfuscator
Combines string decryption, class renaming, and control flow cleanup

This script is for ANALYSIS PURPOSES ONLY - to understand the decompiled code.
"""

import base64
import hashlib
import re
import os
import sys
import json
import shutil
from pathlib import Path
from typing import Dict, Tuple, Optional

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    import subprocess
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


# ============================================================================
# STRING DECRYPTION
# ============================================================================

def decrypt_xor(encrypted_b64: str, key: str) -> str:
    """XOR decryption with cycling key"""
    if not encrypted_b64:
        return '""'
    try:
        decoded = base64.b64decode(encrypted_b64).decode('utf-8')
        result = []
        for i, char in enumerate(decoded):
            result.append(chr(ord(char) ^ ord(key[i % len(key)])))
        decrypted = ''.join(result)
        return '"' + decrypted.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r') + '"'
    except:
        return f'"{encrypted_b64[:20]}..."'


def decrypt_des(encrypted_b64: str, key_string: str) -> str:
    """DES ECB decryption with MD5 key derivation"""
    if not encrypted_b64:
        return '""'
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()[:8]
        cipher = DES.new(key, DES.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        text = decrypted.decode('utf-8')
        return '"' + text.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r') + '"'
    except:
        return f'"{encrypted_b64[:20]}..."'


def decrypt_blowfish(encrypted_b64: str, key_string: str) -> str:
    """Blowfish ECB decryption with MD5 key"""
    if not encrypted_b64:
        return '""'
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()
        cipher = Blowfish.new(key, Blowfish.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        text = decrypted.decode('utf-8')
        return '"' + text.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r') + '"'
    except:
        return f'"{encrypted_b64[:20]}..."'


def identify_decrypt_method(method_name: str, content: str) -> Optional[str]:
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


def decrypt_strings_in_content(content: str) -> str:
    """Find and decrypt all encrypted strings in Java content"""
    # Build decrypt method map from the file
    decrypt_methods = {}
    method_pattern = r'private\s+static\s+String\s+(l[lI]+)\s*\('
    for match in re.finditer(method_pattern, content):
        method_name = match.group(1)
        algo = identify_decrypt_method(method_name, content)
        if algo:
            decrypt_methods[method_name] = algo

    # Pattern for encrypted string calls: methodName("base64", "key")
    call_pattern = r'(l[lI]+)\s*\(\s*"([^"]*)"\s*,\s*"([^"]+)"\s*\)'

    def replace_encrypted(match):
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

        if algo == 'XOR':
            return decrypt_xor(encrypted, key)
        elif algo == 'DES':
            return decrypt_des(encrypted, key)
        elif algo == 'Blowfish':
            return decrypt_blowfish(encrypted, key)

        return match.group(0)

    return re.sub(call_pattern, replace_encrypted, content)


# ============================================================================
# CONTROL FLOW CLEANUP
# ============================================================================

def clean_control_flow(content: str) -> str:
    """Remove control flow obfuscation patterns"""
    # Replace "".length() patterns with their values
    content = re.sub(r'""\s*\.\s*length\s*\(\s*\)', '0', content)
    content = re.sub(r'" "\s*\.\s*length\s*\(\s*\)', '1', content)
    content = re.sub(r'"  "\s*\.\s*length\s*\(\s*\)', '2', content)
    content = re.sub(r'"   "\s*\.\s*length\s*\(\s*\)', '3', content)
    content = re.sub(r'"    "\s*\.\s*length\s*\(\s*\)', '4', content)

    # Remove dead code patterns like: if (null == null) continue;
    content = re.sub(r'if\s*\(\s*null\s*==\s*null\s*\)\s*continue\s*;', '', content)
    content = re.sub(r'if\s*\(\s*null\s*!=\s*null\s*\)\s*[^;]+;', '', content)

    # Remove complex XOR expressions that evaluate to constants
    # Pattern: ((0x.. ^ 0x..) & ~(0x.. ^ 0x..)) != 0
    content = re.sub(r'return\s*\(\([^)]+\)\s*&\s*~?\([^)]+\)\)\s*!=\s*0\s*;', 'return false;', content)

    # Clean up empty lines
    content = re.sub(r'\n\s*\n\s*\n+', '\n\n', content)

    return content


# ============================================================================
# VARIABLE NAME CLEANUP
# ============================================================================

def clean_variable_names(content: str) -> str:
    """Clean up obfuscated variable names (l/I patterns) where possible"""
    # This is conservative - only rename extremely long variable names
    # to avoid breaking references

    # Map long obfuscated names to shorter versions
    var_counter = [0]
    var_map = {}

    def get_short_name(long_name: str) -> str:
        if long_name not in var_map:
            var_counter[0] += 1
            var_map[long_name] = f"var{var_counter[0]}"
        return var_map[long_name]

    # Find extremely long variable names (30+ chars of l and I)
    long_var_pattern = r'\b(l[lI]{29,})\b'

    # Only rename if the variable appears multiple times (likely local)
    matches = re.findall(long_var_pattern, content)
    for var_name in set(matches):
        if matches.count(var_name) > 1:  # Only if used multiple times
            short_name = get_short_name(var_name)
            # Use word boundary replacement to avoid partial matches
            content = re.sub(rf'\b{re.escape(var_name)}\b', short_name, content)

    return content


# ============================================================================
# PACKAGE/CLASS RENAMING
# ============================================================================

# Known class mappings from analysis
CLASS_MAPPINGS = {
    # Zulrah plugin classes (a.u.i.-.l.r.h.z.s.r.u.q.e)
    "am": "ZulrahTaskBase",
    "u": "ZulrahGameStateManager",
    "aa": "PanicTeleportTask",
    "ab": "PrayerFlickingTask",
    "ac": "SwapGearTask",
    "ae": "DisablePrayersTask",
    "af": "LootingTask",
    "ah": "ReturnToZulAndraTask",
    "ai": "TeleportOutTask",
    "aj": "BoardBoatTask",
    "ak": "DrinkCombatPotionsTask",
    "al": "EquipMageGearTask",
    "an": "UseImbuedHeartTask",
    "ao": "TeleportToZulAndraTask2",
    "ap": "TraverseToZulAndraTask",

    # Herblore plugin classes (r.e.o.r.h.s.b.e.q.l.e.u.-.i.r)
    "a": "HerbloreTaskProgressEvent",
    "b": "Herb",
    "c": "HerbloreMethod",
    "d": "HerbloreTaskBase",
    "e": "Potion",
    "f": "BankingTask",
    "h": "CleanHerbsTask",
    "i": "MakePotionsTask",

    # Vorkath plugin classes (i.v.k.o.-.u.s.e.r.a.q.r.t.h)
    "w": "VorkathTaskBase",
    "f": "VorkathGameStateManager",
    "j": "VorkathAttackType",
}

# Task name mappings extracted from @TaskDesc annotations
TASK_MAPPINGS = {
    "Panic tping": "PanicTeleportTask",
    "Handling prayers": "PrayerFlickingTask",
    "Swapping gear": "SwapGearTask",
    "Disabling prayers": "DisablePrayersTask",
    "Looting items": "LootingTask",
    "Looting Items": "LootingTask",
    "Loot": "LootTask",
    "Returning to Zul'Andra": "ReturnToZulAndraTask",
    "Teleporting out": "TeleportOutTask",
    "Boarding boat": "BoardBoatTask",
    "Drinking potions": "DrinkPotionsTask",
    "Equipping mage gear": "EquipMageGearTask",
    "Using imbued heart": "UseImbuedHeartTask",
    "Teleporting to Zul-andra": "TeleportToZulAndraTask",
    "Traversing to Zul-andra": "TraverseToZulAndraTask",
    "Banking": "BankingTask",
    "Cleaning herbs": "CleanHerbsTask",
    "Making potions": "MakePotionsTask",
    "Eating": "EatingTask",
    "Eat": "EatingTask",
    "Attack": "AttackTask",
    "Attacking": "AttackTask",
    "Pray": "PrayerTask",
    "Dodge": "DodgeTask",
    "Dodging": "DodgeTask",
    "Spec": "SpecialAttackTask",
    "Walking to bank": "WalkToBankTask",
    "Opening bank": "OpenBankTask",
    "Entering portal": "EnterPortalTask",
    "Handling house": "HandlePOHTask",
    "Turning on run": "EnableRunTask",
    "Enabling run": "EnableRunTask",
    "Prayer pot": "DrinkPrayerPotionTask",
    "Venom": "CureVenomTask",
    "Curing venom": "CureVenomTask",
    "Curing poison": "CurePoisonTask",
    "Drinking Antifire Potion": "DrinkAntifireTask",
    "Drinking Combat Potion": "DrinkCombatPotionTask",
    "Swapping bolts": "SwapBoltsTask",
    "Tick eat": "TickEatTask",
    "Alching item": "AlchingTask",
    "High alching": "AlchingTask",
    "Alching items": "AlchingTask",
    "Flicking prayers": "PrayerFlickingTask",
    "Moving to next tile": "MoveToNextTileTask",
    "Killing minions": "KillMinionsTask",
    "Placing cannon base": "PlaceCannonTask",
}


def add_task_name_comments(content: str) -> str:
    """Add comments showing task names from @TaskDesc annotations"""
    # Find @TaskDesc annotations and add readable comments
    pattern = r'@TaskDesc\s*\(\s*name\s*=\s*"([^"]+)"'

    def add_comment(match):
        task_name = match.group(1)
        suggested = TASK_MAPPINGS.get(task_name, task_name.replace(" ", "").title() + "Task")
        return f'/* TASK: {task_name} -> {suggested} */\n{match.group(0)}'

    return re.sub(pattern, add_comment, content)


# ============================================================================
# MAIN DEOBFUSCATION
# ============================================================================

def process_file(input_path: str, output_path: str) -> Tuple[bool, int]:
    """Process a single Java file and return (success, changes_count)"""
    try:
        with open(input_path, 'r', encoding='utf-8', errors='ignore') as f:
            original = f.read()

        content = original

        # Step 1: Decrypt strings
        content = decrypt_strings_in_content(content)

        # Step 2: Clean control flow
        content = clean_control_flow(content)

        # Step 3: Clean very long variable names
        content = clean_variable_names(content)

        # Step 4: Add task name comments
        content = add_task_name_comments(content)

        # Count changes
        changes = 0
        if content != original:
            changes = len(content) - len(original)  # Rough change indicator

        # Only write if changes were made
        if content != original:
            os.makedirs(os.path.dirname(output_path), exist_ok=True)
            with open(output_path, 'w', encoding='utf-8') as f:
                f.write(content)
            return True, abs(changes)

        return False, 0

    except Exception as e:
        print(f"  Error: {e}")
        return False, 0


def process_plugin(plugin_dir: Path, output_dir: Path) -> Tuple[int, int]:
    """Process all files in a plugin directory"""
    processed = 0
    total_changes = 0

    for java_file in plugin_dir.glob('**/*.java'):
        rel_path = java_file.relative_to(plugin_dir)
        out_file = output_dir / rel_path

        success, changes = process_file(str(java_file), str(out_file))
        if success:
            processed += 1
            total_changes += changes

    return processed, total_changes


def main():
    print("=" * 70)
    print("SQUIRE COMPREHENSIVE DEOBFUSCATOR")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    plugins_src = base_dir / "plugins" / "src"
    plugins_out = base_dir / "plugins" / "deobfuscated_full"

    if not plugins_src.exists():
        print(f"ERROR: Source not found: {plugins_src}")
        sys.exit(1)

    # Load UUID mapping if available
    uuid_mapping = {}
    mapping_file = base_dir / "uuid_to_plugin_mapping.json"
    if mapping_file.exists():
        with open(mapping_file) as f:
            uuid_mapping = json.load(f)
        print(f"Loaded {len(uuid_mapping)} plugin mappings")

    print(f"\nInput:  {plugins_src}")
    print(f"Output: {plugins_out}")
    print("-" * 70)

    total_processed = 0
    total_changes = 0
    plugin_dirs = sorted(plugins_src.iterdir())

    for i, plugin_dir in enumerate(plugin_dirs):
        if not plugin_dir.is_dir():
            continue

        plugin_name = plugin_dir.name

        # Get readable name from mapping
        if plugin_name in uuid_mapping:
            readable_name = uuid_mapping[plugin_name].get('name', plugin_name)
        else:
            readable_name = plugin_name

        out_dir = plugins_out / readable_name

        processed, changes = process_plugin(plugin_dir, out_dir)

        if processed > 0:
            print(f"[{i+1:2}/{len(plugin_dirs)}] {readable_name}: {processed} files, ~{changes:,} chars changed")
            total_processed += processed
            total_changes += changes

    print("-" * 70)
    print(f"Total: {total_processed} files deobfuscated")
    print(f"Total changes: ~{total_changes:,} characters")
    print(f"Output: {plugins_out}")
    print("=" * 70)


if __name__ == "__main__":
    main()
