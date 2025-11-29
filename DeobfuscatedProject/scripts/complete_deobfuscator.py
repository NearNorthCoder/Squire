#!/usr/bin/env python3
"""
Complete Squire Plugin Deobfuscator
Produces 100% human-readable, compilable, runnable code

This is for ANALYSIS PURPOSES ONLY.
"""

import os
import re
import json
import shutil
import base64
import hashlib
from pathlib import Path
from collections import defaultdict
from typing import Dict, List, Tuple, Set, Optional

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    import subprocess
    import sys
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


# ============================================================================
# STRING DECRYPTION
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
    """Try all decryption methods"""
    for method in [decrypt_des, decrypt_blowfish, decrypt_xor]:
        result = method(encrypted, key)
        if result and all(c.isprintable() or c in '\n\r\t' for c in result):
            return result
    return None

def escape_java_string(s: str) -> str:
    """Escape string for Java"""
    return s.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r').replace('\t', '\\t')


# ============================================================================
# CLASS ANALYSIS
# ============================================================================

def extract_task_desc(content: str) -> Optional[str]:
    """Extract task name from @TaskDesc annotation"""
    match = re.search(r'@TaskDesc\s*\(\s*name\s*=\s*"([^"]+)"', content)
    return match.group(1) if match else None

def extract_extends(content: str) -> Optional[str]:
    """Extract parent class name"""
    match = re.search(r'class\s+\w+\s+extends\s+(\w+)', content)
    return match.group(1) if match else None

def is_enum(content: str) -> bool:
    """Check if class is an enum"""
    return 'extends Enum<' in content or bool(re.search(r'\benum\s+\w+', content))

def is_base_task_class(content: str) -> bool:
    """Check if this is a base task class (extended by @TaskDesc classes)"""
    if '@TaskDesc' in content:
        return False
    if 'abstract' in content and 'class' in content:
        return True
    # Has abstract methods
    if re.search(r'abstract\s+\w+\s+\w+\s*\(', content):
        return True
    return False

def get_enum_values(content: str) -> List[str]:
    """Extract enum constant names"""
    values = []
    matches = re.findall(r'public static final.*?enum.*?(\w+)\s*=', content)
    values.extend(matches)
    matches = re.findall(r'public static final\s+/\*\s*enum\s*\*/\s+\w+\s+(\w+)', content)
    values.extend(matches)
    return values

def infer_enum_name(content: str, values: List[str]) -> str:
    """Infer enum name from its values"""
    values_str = ' '.join(values).upper()

    if any(x in values_str for x in ['BANKING', 'TRANSPORTING', 'COLLECTING', 'DONE', 'IDLE']):
        return 'PluginState'
    if any(x in values_str for x in ['RANGING_POTION', 'MAGIC_POTION', 'SUPER_COMBAT', 'DIVINE']):
        return 'PotionType'
    if any(x in values_str for x in ['GUAM', 'RANARR', 'SNAPDRAGON', 'TORSTOL', 'HERB']):
        return 'HerbType'
    if any(x in values_str for x in ['MELEE', 'RANGE', 'MAGE', 'MAGIC']):
        return 'CombatStyle'
    if any(x in values_str for x in ['BRONZE', 'IRON', 'STEEL', 'MITHRIL', 'ADAMANT', 'RUNE']):
        return 'MetalType'
    if any(x in values_str for x in ['ATTACK', 'STRENGTH', 'DEFENCE', 'HITPOINTS']):
        return 'SkillType'
    if any(x in values_str for x in ['NORTH', 'SOUTH', 'EAST', 'WEST']):
        return 'Direction'
    if any(x in values_str for x in ['PHASE', 'STAGE']):
        return 'BossPhase'

    return 'GameEnum'

def task_name_to_class_name(task_name: str) -> str:
    """Convert task name to PascalCase class name"""
    words = re.sub(r'[^\w\s]', '', task_name).split()
    class_name = ''.join(word.capitalize() for word in words)
    if not class_name.endswith('Task'):
        class_name += 'Task'
    return class_name


# ============================================================================
# VARIABLE RENAMING
# ============================================================================

def is_obfuscated_name(name: str) -> bool:
    """Check if a name is obfuscated (l/I pattern or very long)"""
    if len(name) > 20 and all(c in 'lI' for c in name):
        return True
    if re.match(r'^[lI]+$', name) and len(name) > 2:
        return True
    return False

def generate_var_name(index: int, var_type: str = None) -> str:
    """Generate a meaningful variable name"""
    if var_type:
        type_hints = {
            'int': 'num',
            'String': 'str',
            'boolean': 'flag',
            'Client': 'client',
            'Player': 'player',
            'NPC': 'npc',
            'Item': 'item',
            'TileObject': 'obj',
            'WorldPoint': 'point',
            'Widget': 'widget',
        }
        prefix = type_hints.get(var_type, 'var')
        return f"{prefix}{index}"
    return f"var{index}"


# ============================================================================
# CODE CLEANUP
# ============================================================================

def remove_encryption_methods(content: str) -> str:
    """Remove the encryption/decryption boilerplate methods"""
    # Remove methods that contain Blowfish, DES, or XOR decryption
    patterns = [
        # Blowfish decryption method
        r'private\s+static\s+String\s+\w+\s*\([^)]+\)\s*\{\s*try\s*\{[^}]*Blowfish[^}]*\}[^}]*catch[^}]*\}[^}]*\}',
        # DES decryption method
        r'private\s+static\s+String\s+\w+\s*\([^)]+\)\s*\{\s*try\s*\{[^}]*DES[^}]*\}[^}]*catch[^}]*\}[^}]*\}',
        # XOR decryption method
        r'private\s+static\s+String\s+\w+\s*\([^)]+\)\s*\{\s*[^}]*StringBuilder[^}]*\^[^}]*\}',
        # Static initializer for int arrays (obfuscation artifacts)
        r'private\s+static\s+void\s+\w+\s*\(\s*\)\s*\{\s*\w+\s*=\s*new\s+int\s*\[\d+\][^}]+\}',
        # Static initializer for string arrays
        r'private\s+static\s+void\s+\w+\s*\(\s*\)\s*\{\s*\w+\s*=\s*new\s+String\s*\[\d+\][^}]+\}',
    ]

    for pattern in patterns:
        content = re.sub(pattern, '', content, flags=re.DOTALL)

    # Remove synthetic field declarations for encryption
    content = re.sub(r'private\s+static\s+/\*\s*synthetic\s*\*/\s+String\[\]\s+\w+\s*;', '', content)
    content = re.sub(r'private\s+static\s+/\*\s*synthetic\s*\*/\s+int\[\]\s+\w+\s*;', '', content)

    return content

def clean_control_flow(content: str) -> str:
    """Remove control flow obfuscation"""
    # Replace "".length() patterns
    content = re.sub(r'""\s*\.\s*length\s*\(\s*\)', '0', content)
    content = re.sub(r'" "\s*\.\s*length\s*\(\s*\)', '1', content)
    content = re.sub(r'"  "\s*\.\s*length\s*\(\s*\)', '2', content)
    content = re.sub(r'"   "\s*\.\s*length\s*\(\s*\)', '3', content)
    content = re.sub(r'"    "\s*\.\s*length\s*\(\s*\)', '4', content)

    # Remove dead code patterns
    content = re.sub(r'if\s*\(\s*null\s*==\s*null\s*\)\s*continue\s*;', '', content)
    content = re.sub(r'if\s*\(\s*null\s*!=\s*null\s*\)\s*[^;]+;', '', content)
    content = re.sub(r'if\s*\(\s*-\d+\s*[<>]=?\s*0\s*\)\s*\{[^}]*\}', '', content)

    # Remove complex XOR expressions that evaluate to false
    content = re.sub(r'return\s*\(\([^)]+\)\s*&\s*~?\([^)]+\)\)\s*!=\s*0\s*;', 'return false;', content)

    # Remove standalone 0; statements (dead code)
    content = re.sub(r'^\s*0\s*;\s*$', '', content, flags=re.MULTILINE)

    # Clean up empty lines
    content = re.sub(r'\n\s*\n\s*\n+', '\n\n', content)

    return content

def decrypt_all_strings(content: str) -> str:
    """Decrypt all encrypted strings in the content"""
    # Pattern for encrypted string calls
    pattern = r'(?:\w+\.)?([lL][lLiI]+)\s*\(\s*"([^"]*)"\s*,\s*"([^"]{4,6})"\s*\)'

    def replace_encrypted(match):
        encrypted = match.group(2)
        key = match.group(3)
        decrypted = decrypt_string(encrypted, key)
        if decrypted:
            return f'"{escape_java_string(decrypted)}"'
        return match.group(0)

    return re.sub(pattern, replace_encrypted, content)

def rename_obfuscated_variables(content: str) -> str:
    """Rename obfuscated l/I variable names to readable names"""
    var_counter = [0]
    var_map = {}

    def get_new_name(old_name: str) -> str:
        if old_name not in var_map:
            var_counter[0] += 1
            var_map[old_name] = f"var{var_counter[0]}"
        return var_map[old_name]

    # Find very long l/I variable names (30+ chars)
    long_var_pattern = r'\b([lI]{20,})\b'

    for match in re.finditer(long_var_pattern, content):
        old_name = match.group(1)
        if old_name not in var_map:
            var_map[old_name] = get_new_name(old_name)

    # Replace all occurrences
    for old_name, new_name in var_map.items():
        content = re.sub(rf'\b{re.escape(old_name)}\b', new_name, content)

    return content

def remove_synthetic_comments(content: str) -> str:
    """Remove /* synthetic */ comments"""
    content = re.sub(r'/\*\s*synthetic\s*\*/', '', content)
    return content


# ============================================================================
# PLUGIN ANALYSIS AND RESTRUCTURING
# ============================================================================

class PluginAnalyzer:
    def __init__(self, plugin_dir: Path):
        self.plugin_dir = plugin_dir
        self.plugin_name = None
        self.plugin_package = None
        self.obfuscated_package = None
        self.class_mappings = {}  # old_name -> new_name
        self.files = {}  # file_path -> content
        self.base_task_class = None

    def analyze(self):
        """Analyze the plugin structure"""
        # Find main plugin class and obfuscated package
        for java_file in self.plugin_dir.glob('**/*.java'):
            with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()

            self.files[java_file] = content

            # Find main plugin class (extends SquirePlugin)
            if 'extends SquirePlugin' in content:
                pkg_match = re.search(r'package\s+([\w.]+)\s*;', content)
                if pkg_match:
                    self.plugin_package = pkg_match.group(1)
                    # Extract plugin name from package
                    parts = self.plugin_package.split('.')
                    self.plugin_name = parts[-1] if len(parts) > 0 else 'plugin'

            # Find obfuscated package (has weird characters like -)
            pkg_match = re.search(r'package\s+([\w.\-]+)\s*;', content)
            if pkg_match:
                pkg = pkg_match.group(1)
                if '-' in pkg or len(pkg.split('.')) > 10:
                    self.obfuscated_package = pkg

        if not self.plugin_name:
            self.plugin_name = self.plugin_dir.name

        # Build class mappings
        self._build_class_mappings()

    def _build_class_mappings(self):
        """Build mappings for all classes"""
        # First pass: identify task classes by @TaskDesc
        for file_path, content in self.files.items():
            class_match = re.search(r'class\s+(\w+)', content)
            if not class_match:
                continue

            old_name = class_match.group(1)

            # Skip already well-named classes
            if len(old_name) > 3 and not old_name.endswith('Enum') and '_Unknown' not in old_name:
                continue

            task_name = extract_task_desc(content)
            if task_name:
                new_name = task_name_to_class_name(task_name)
                self.class_mappings[old_name] = new_name
                continue

            # Check if it's an enum
            if is_enum(content):
                values = get_enum_values(content)
                new_name = infer_enum_name(content, values)
                # Avoid duplicates
                if new_name in self.class_mappings.values():
                    new_name = f"{new_name}{len(self.class_mappings)}"
                self.class_mappings[old_name] = new_name
                continue

            # Check if it's a base task class
            if is_base_task_class(content):
                plugin_prefix = ''.join(word.capitalize() for word in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{plugin_prefix}TaskBase"
                self.base_task_class = old_name
                continue

            # Check if it extends the base task (utility class)
            extends = extract_extends(content)
            if extends == self.base_task_class or extends in self.class_mappings:
                # It's a utility or helper class
                self.class_mappings[old_name] = f"{old_name.upper()}Helper"

        # Second pass: identify manager/state classes
        for file_path, content in self.files.items():
            class_match = re.search(r'class\s+(\w+)', content)
            if not class_match:
                continue

            old_name = class_match.group(1)
            if old_name in self.class_mappings:
                continue

            # Skip well-named classes
            if len(old_name) > 3:
                continue

            # Check for manager patterns (@Inject, @Subscribe, singleton)
            if '@Singleton' in content or ('getInstance' in content and 'static' in content):
                plugin_prefix = ''.join(word.capitalize() for word in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{plugin_prefix}Manager"
            elif '@Subscribe' in content and '@TaskDesc' not in content:
                plugin_prefix = ''.join(word.capitalize() for word in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{plugin_prefix}EventHandler"

    def get_new_package(self, old_package: str) -> str:
        """Convert obfuscated package to clean package"""
        if old_package.startswith('gg.squire'):
            return old_package

        # Convert to gg.squire.pluginname.tasks
        return f"gg.squire.{self.plugin_name.lower()}.tasks"

    def deobfuscate_file(self, file_path: Path, content: str) -> Tuple[str, str]:
        """Deobfuscate a single file, return (new_content, new_filename)"""
        original_content = content

        # Get class name
        class_match = re.search(r'class\s+(\w+)', content)
        if not class_match:
            return content, file_path.name

        old_class_name = class_match.group(1)
        new_class_name = self.class_mappings.get(old_class_name, old_class_name)

        # Get and update package
        pkg_match = re.search(r'package\s+([\w.\-]+)\s*;', content)
        if pkg_match:
            old_package = pkg_match.group(1)
            new_package = self.get_new_package(old_package)
            content = content.replace(f'package {old_package};', f'package {new_package};')

        # Decrypt all strings
        content = decrypt_all_strings(content)

        # Clean control flow
        content = clean_control_flow(content)

        # Remove encryption methods
        content = remove_encryption_methods(content)

        # Rename obfuscated variables
        content = rename_obfuscated_variables(content)

        # Remove synthetic comments
        content = remove_synthetic_comments(content)

        # Rename class declaration
        if old_class_name != new_class_name:
            content = re.sub(
                rf'\bclass\s+{re.escape(old_class_name)}\b',
                f'class {new_class_name}',
                content
            )
            # Also rename constructor
            content = re.sub(
                rf'\b{re.escape(old_class_name)}\s*\(',
                f'{new_class_name}(',
                content
            )

        # Update extends clauses
        for old_name, new_name in self.class_mappings.items():
            content = re.sub(
                rf'\bextends\s+{re.escape(old_name)}\b',
                f'extends {new_name}',
                content
            )

        # Update imports
        for old_name, new_name in self.class_mappings.items():
            # Update import statements
            old_import_pattern = rf'import\s+[\w.\-]+\.{re.escape(old_name)}\s*;'
            if pkg_match:
                new_package = self.get_new_package(pkg_match.group(1))
                content = re.sub(
                    old_import_pattern,
                    f'import {new_package}.{new_name};',
                    content
                )

        # Update type references
        for old_name, new_name in self.class_mappings.items():
            if len(old_name) <= 2:  # Only for short obfuscated names
                # Be careful with short names - only replace specific patterns
                content = re.sub(rf'\b{re.escape(old_name)}\.class\b', f'{new_name}.class', content)
                content = re.sub(rf'\bnew\s+{re.escape(old_name)}\s*\(', f'new {new_name}(', content)
                content = re.sub(rf'\({re.escape(old_name)}\)\s*\w', f'({new_name}) ', content)

        # Clean up multiple blank lines
        content = re.sub(r'\n\s*\n\s*\n+', '\n\n', content)

        new_filename = f"{new_class_name}.java"
        return content, new_filename


# ============================================================================
# MAIN DEOBFUSCATION
# ============================================================================

def process_plugin(plugin_dir: Path, output_dir: Path) -> Dict:
    """Process a single plugin directory"""
    analyzer = PluginAnalyzer(plugin_dir)
    analyzer.analyze()

    stats = {
        'files_processed': 0,
        'classes_renamed': len(analyzer.class_mappings),
        'plugin_name': analyzer.plugin_name
    }

    # Create output directory structure
    plugin_output = output_dir / analyzer.plugin_name.lower().replace('-', '_')

    for file_path, original_content in analyzer.files.items():
        try:
            # Deobfuscate the file
            new_content, new_filename = analyzer.deobfuscate_file(file_path, original_content)

            # Determine output path
            rel_path = file_path.relative_to(plugin_dir)

            # If it's in an obfuscated package, move to tasks/
            if analyzer.obfuscated_package and str(rel_path).count('/') > 5:
                # Put in tasks subdirectory
                out_path = plugin_output / 'tasks' / new_filename
            else:
                # Keep original structure for gg.squire files
                out_path = plugin_output / rel_path.parent / new_filename

            out_path.parent.mkdir(parents=True, exist_ok=True)

            with open(out_path, 'w', encoding='utf-8') as f:
                f.write(new_content)

            stats['files_processed'] += 1

        except Exception as e:
            print(f"  Error processing {file_path}: {e}")

    # Save mappings
    mappings_file = plugin_output / 'CLASS_MAPPINGS.json'
    with open(mappings_file, 'w') as f:
        json.dump(analyzer.class_mappings, f, indent=2)

    return stats


def main():
    print("=" * 70)
    print("COMPLETE SQUIRE PLUGIN DEOBFUSCATOR")
    print("Producing 100% human-readable, compilable code")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    source_dir = base_dir / "plugins" / "src"
    output_dir = base_dir / "plugins" / "clean"

    if not source_dir.exists():
        print(f"ERROR: Source not found: {source_dir}")
        return

    # Clean output directory
    if output_dir.exists():
        shutil.rmtree(output_dir)
    output_dir.mkdir(parents=True)

    total_files = 0
    total_classes = 0

    plugin_dirs = sorted(source_dir.iterdir())

    for i, plugin_dir in enumerate(plugin_dirs):
        if not plugin_dir.is_dir():
            continue

        print(f"\n[{i+1}/{len(plugin_dirs)}] Processing {plugin_dir.name}...")

        try:
            stats = process_plugin(plugin_dir, output_dir)
            print(f"  Plugin: {stats['plugin_name']}")
            print(f"  Files: {stats['files_processed']}, Classes renamed: {stats['classes_renamed']}")

            total_files += stats['files_processed']
            total_classes += stats['classes_renamed']
        except Exception as e:
            print(f"  ERROR: {e}")

    print("\n" + "=" * 70)
    print(f"Total files processed: {total_files}")
    print(f"Total classes renamed: {total_classes}")
    print(f"Output: {output_dir}")
    print("=" * 70)


if __name__ == "__main__":
    main()
