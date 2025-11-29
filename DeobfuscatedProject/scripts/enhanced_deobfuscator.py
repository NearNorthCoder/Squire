#!/usr/bin/env python3
"""
Enhanced Squire Plugin Deobfuscator
Produces truly human-readable, compilable code by:
1. Removing helper comparison methods and inlining logic
2. Evaluating static array accesses
3. Removing dead code with impossible conditions
4. Renaming all single-letter classes
5. Simplifying control flow

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
    for method in [decrypt_des, decrypt_blowfish, decrypt_xor]:
        result = method(encrypted, key)
        if result and all(c.isprintable() or c in '\n\r\t' for c in result):
            return result
    return None

def escape_java_string(s: str) -> str:
    return s.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r').replace('\t', '\\t')


# ============================================================================
# DEAD CODE REMOVAL
# ============================================================================

def remove_dead_code(content: str) -> str:
    """Remove dead code patterns that can never execute"""

    # Remove if (2 == 0) blocks
    content = re.sub(r'if\s*\(\s*\d+\s*==\s*0\s*\)\s*\{[^}]*\}', '', content)
    content = re.sub(r'if\s*\(\s*\d+\s*==\s*0\s*\)\s*return[^;]*;', '', content)
    content = re.sub(r'if\s*\(\s*\d+\s*==\s*0\s*\)\s*continue\s*;', '', content)

    # Remove if (2 >= -1) continue; patterns
    content = re.sub(r'if\s*\(\s*\d+\s*>=\s*-?\d+\s*\)\s*continue\s*;', '', content)

    # Remove always-true conditions resulting in continue
    content = re.sub(r'if\s*\(\s*null\s*==\s*null\s*\)\s*continue\s*;', '', content)

    # Remove always-false conditions
    content = re.sub(r'if\s*\(\s*null\s*!=\s*null\s*\)\s*[^;]+;', '', content)

    # Remove complex XOR expressions in return statements that evaluate to false/true
    # Pattern: ((0x.. ^ 0x..) & ...) != 0 - evaluate and simplify
    xor_pattern = r'\(\s*\(\s*0x[0-9A-Fa-f]+\s*\^\s*0x[0-9A-Fa-f]+[^)]*\)\s*&\s*[^)]+\)\s*!=\s*0'
    content = re.sub(xor_pattern, 'false', content)

    # Remove complex conditions in if statements that always evaluate to >= 0
    content = re.sub(
        r'if\s*\(\s*\(\s*\([^)]+\)\s*&\s*~?\s*\([^)]+\)\s*\)\s*>=?\s*[01]\s*\)\s*continue\s*;',
        '',
        content
    )

    # Remove return statements with complex XOR that evaluate to constants
    content = re.sub(
        r'return\s*\(\s*\([^)]+\)\s*&\s*\([^)]+\)\s*\)\s*!=\s*0\s*;',
        'return false;',
        content
    )

    # Remove standalone numeric statements
    content = re.sub(r'^\s*0\s*;\s*$', '', content, flags=re.MULTILINE)

    return content


# ============================================================================
# HELPER METHOD INLINING
# ============================================================================

# Known helper method patterns and their meanings
HELPER_PATTERNS = {
    # Null checks
    r'llIII[lI]+\s*\(\s*(\w+)\s*\)\s*\{\s*return\s+\1\s*!=\s*null\s*;\s*\}': 'isNotNull',
    r'llIII[lI]+\s*\(\s*(\w+)\s*\)\s*\{\s*return\s+\1\s*==\s*null\s*;\s*\}': 'isNull',

    # Boolean checks
    r'llIII[lI]+\s*\(\s*int\s+(\w+)\s*\)\s*\{\s*return\s+\1\s*!=\s*0\s*;\s*\}': 'isTrue',
    r'llIII[lI]+\s*\(\s*int\s+(\w+)\s*\)\s*\{\s*return\s+\1\s*==\s*0\s*;\s*\}': 'isFalse',

    # Comparisons
    r'llIII[lI]+\s*\(\s*int\s+\w+,\s*int\s+\w+\s*\)\s*\{\s*return\s+\w+\s*==\s*\w+\s*;\s*\}': 'equals',
    r'llIII[lI]+\s*\(\s*int\s+\w+,\s*int\s+\w+\s*\)\s*\{\s*return\s+\w+\s*!=\s*\w+\s*;\s*\}': 'notEquals',
    r'llIII[lI]+\s*\(\s*int\s+\w+,\s*int\s+\w+\s*\)\s*\{\s*return\s+\w+\s*<=\s*\w+\s*;\s*\}': 'lessOrEqual',
    r'llIII[lI]+\s*\(\s*int\s+\w+,\s*int\s+\w+\s*\)\s*\{\s*return\s+\w+\s*>=\s*\w+\s*;\s*\}': 'greaterOrEqual',
    r'llIII[lI]+\s*\(\s*int\s+\w+,\s*int\s+\w+\s*\)\s*\{\s*return\s+\w+\s*<\s*\w+\s*;\s*\}': 'lessThan',
    r'llIII[lI]+\s*\(\s*int\s+\w+,\s*int\s+\w+\s*\)\s*\{\s*return\s+\w+\s*>\s*\w+\s*;\s*\}': 'greaterThan',

    # Object equality
    r'llIII[lI]+\s*\(\s*Object\s+\w+,\s*Object\s+\w+\s*\)\s*\{\s*return\s+\w+\s*==\s*\w+\s*;\s*\}': 'objEquals',
}

def inline_helper_methods(content: str) -> str:
    """Replace helper method calls with their actual logic inline"""

    # Find all helper methods in the file
    helper_methods = {}

    # Pattern to find helper method definitions
    method_def_pattern = r'private\s+static\s+boolean\s+(ll[IlI]+)\s*\(\s*([^)]*)\s*\)\s*\{\s*return\s+([^;]+)\s*;\s*\}'

    for match in re.finditer(method_def_pattern, content):
        method_name = match.group(1)
        params = match.group(2)
        body = match.group(3).strip()

        # Parse parameters
        param_list = []
        if params.strip():
            for p in params.split(','):
                parts = p.strip().split()
                if len(parts) >= 2:
                    param_list.append(parts[-1])  # Variable name is last

        helper_methods[method_name] = {
            'params': param_list,
            'body': body
        }

    # Now inline calls to these methods
    for method_name, info in helper_methods.items():
        params = info['params']
        body = info['body']

        # Build pattern for method calls
        if len(params) == 1:
            # Single parameter method
            call_pattern = rf'\b(?:\w+\.)?{re.escape(method_name)}\s*\(\s*([^)]+)\s*\)'

            def replace_single(m):
                arg = m.group(1).strip()
                # Replace parameter with argument
                result = body.replace(params[0], arg)
                return f'({result})'

            content = re.sub(call_pattern, replace_single, content)

        elif len(params) == 2:
            # Two parameter method
            call_pattern = rf'\b(?:\w+\.)?{re.escape(method_name)}\s*\(\s*([^,]+)\s*,\s*([^)]+)\s*\)'

            def replace_double(m):
                arg1 = m.group(1).strip()
                arg2 = m.group(2).strip()
                result = body
                result = result.replace(params[0], arg1)
                result = result.replace(params[1], arg2)
                return f'({result})'

            content = re.sub(call_pattern, replace_double, content)

    # Remove the helper method definitions
    content = re.sub(
        r'\n\s*private\s+static\s+boolean\s+ll[IlI]+\s*\([^)]*\)\s*\{[^}]+\}\n',
        '\n',
        content
    )

    # Clean up double parentheses
    content = re.sub(r'\(\(([^()]+)\)\)', r'(\1)', content)

    # Simplify boolean expressions
    # Replace (x != null) with x != null
    content = re.sub(r'\(\s*(\w+)\s*!=\s*null\s*\)', r'\1 != null', content)
    content = re.sub(r'\(\s*(\w+)\s*==\s*null\s*\)', r'\1 == null', content)

    # Replace (x != 0) with direct boolean
    content = re.sub(r'\(\s*(\w+)\s*!=\s*0\s*\)', r'\1', content)

    return content


# ============================================================================
# STATIC ARRAY SIMPLIFICATION
# ============================================================================

def simplify_static_arrays(content: str) -> str:
    """Replace obfuscated array accesses with actual values"""

    # Find static initializer methods
    init_pattern = r'private\s+static\s+void\s+(ll[IlI]+)\s*\(\s*\)\s*\{\s*([^}]+)\s*\}'

    string_arrays = {}
    int_arrays = {}

    for match in re.finditer(init_pattern, content, re.DOTALL):
        method_body = match.group(2)

        # Parse string array initializations
        str_array_pattern = r'(\w+)\s*=\s*new\s+String\s*\[\s*\d+\s*\]\s*;'
        for array_match in re.finditer(str_array_pattern, method_body):
            array_name = array_match.group(1)
            string_arrays[array_name] = {}

            # Find assignments
            assign_pattern = rf'{re.escape(array_name)}\s*\[\s*(?:\w+\.)?\w+\s*\[\s*(\d+)\s*\]\s*\]\s*=\s*"([^"]*)"'
            for assign in re.finditer(assign_pattern, method_body):
                idx = int(assign.group(1))
                value = assign.group(2)
                string_arrays[array_name][idx] = value

        # Parse int array initializations
        int_array_pattern = r'(\w+)\s*=\s*new\s+int\s*\[\s*(\d+)\s*\]\s*;'
        for array_match in re.finditer(int_array_pattern, method_body):
            array_name = array_match.group(1)
            size = int(array_match.group(2))
            int_arrays[array_name] = list(range(size))

    # Replace array accesses with values
    for array_name, values in string_arrays.items():
        for idx, value in values.items():
            pattern = rf'{re.escape(array_name)}\s*\[\s*(?:\w+\.)?\w+\s*\[\s*{idx}\s*\]\s*\]'
            content = re.sub(pattern, f'"{value}"', content)

    # Replace int array accesses (commonly indices 0,1,2,3...)
    for array_name in int_arrays:
        for i in range(10):
            pattern = rf'(?:\w+\.)?{re.escape(array_name)}\s*\[\s*{i}\s*\]'
            content = re.sub(pattern, str(i), content)

    return content


# ============================================================================
# CONTROL FLOW CLEANUP
# ============================================================================

def clean_control_flow(content: str) -> str:
    """Remove control flow obfuscation"""

    # Replace "".length() patterns
    content = re.sub(r'""\s*\.\s*length\s*\(\s*\)', '0', content)
    content = re.sub(r'" "\s*\.\s*length\s*\(\s*\)', '1', content)
    content = re.sub(r'"  "\s*\.\s*length\s*\(\s*\)', '2', content)
    content = re.sub(r'"   "\s*\.\s*length\s*\(\s*\)', '3', content)
    content = re.sub(r'"    "\s*\.\s*length\s*\(\s*\)', '4', content)

    # Simplify ternary with boolean to int conversion
    content = re.sub(r'(\w+)\s*\?\s*1\s*:\s*0', r'\1', content)

    # Clean up empty lines
    content = re.sub(r'\n\s*\n\s*\n+', '\n\n', content)

    return content


# ============================================================================
# CLASS RENAMING
# ============================================================================

def extract_task_desc(content: str) -> Optional[str]:
    match = re.search(r'@TaskDesc\s*\(\s*name\s*=\s*"([^"]+)"', content)
    return match.group(1) if match else None

def task_name_to_class_name(task_name: str) -> str:
    words = re.sub(r'[^\w\s]', '', task_name).split()
    class_name = ''.join(word.capitalize() for word in words)
    if not class_name.endswith('Task'):
        class_name += 'Task'
    return class_name

def is_enum(content: str) -> bool:
    return 'extends Enum<' in content or bool(re.search(r'\benum\s+\w+', content))

def get_enum_values(content: str) -> List[str]:
    values = []
    values.extend(re.findall(r'public static final.*?enum.*?(\w+)\s*=', content))
    values.extend(re.findall(r'public static final\s+/\*\s*enum\s*\*/\s+\w+\s+(\w+)', content))
    return values

def infer_enum_name(content: str, values: List[str]) -> str:
    values_str = ' '.join(values).upper()

    if any(x in values_str for x in ['BANKING', 'TRANSPORTING', 'COLLECTING', 'DONE', 'IDLE']):
        return 'PluginState'
    if any(x in values_str for x in ['RANGING_POTION', 'MAGIC_POTION', 'SUPER_COMBAT']):
        return 'PotionType'
    if any(x in values_str for x in ['GUAM', 'RANARR', 'SNAPDRAGON', 'TORSTOL']):
        return 'HerbType'
    if any(x in values_str for x in ['MELEE', 'RANGE', 'MAGE', 'MAGIC']):
        return 'CombatStyle'
    if any(x in values_str for x in ['PHASE', 'STAGE']):
        return 'BossPhase'
    if any(x in values_str for x in ['NORTH', 'SOUTH', 'EAST', 'WEST']):
        return 'Direction'

    return 'GameEnum'


# ============================================================================
# VARIABLE RENAMING
# ============================================================================

def rename_obfuscated_variables(content: str) -> str:
    """Rename obfuscated l/I variable and field names"""

    var_counter = [0]
    var_map = {}

    # Find all obfuscated variable patterns
    obfuscated_pattern = r'\b([lI]{10,})\b'

    for match in re.finditer(obfuscated_pattern, content):
        old_name = match.group(1)
        if old_name not in var_map:
            var_counter[0] += 1
            var_map[old_name] = f"var{var_counter[0]}"

    # Replace all occurrences
    for old_name, new_name in var_map.items():
        content = re.sub(rf'\b{re.escape(old_name)}\b', new_name, content)

    return content


# ============================================================================
# ENCRYPTION BOILERPLATE REMOVAL
# ============================================================================

def remove_encryption_methods(content: str) -> str:
    """Remove encryption/decryption boilerplate"""

    # Remove static initializer blocks that set up encryption
    content = re.sub(
        r'static\s*\{\s*\w+\.ll[IlI]+\s*\(\s*\)\s*;\s*\w+\.ll[IlI]+\s*\(\s*\)\s*;\s*\}',
        '',
        content
    )

    # Remove encryption helper method calls in static blocks
    content = re.sub(
        r'static\s*\{\s*ll[IlI]+\s*\(\s*\)\s*;\s*ll[IlI]+\s*\(\s*\)\s*;\s*\}',
        '',
        content
    )

    # Remove private static void initializer methods
    content = re.sub(
        r'\n\s*private\s+static\s+void\s+ll[IlI]+\s*\(\s*\)\s*\{[^}]*\}\n',
        '\n',
        content,
        flags=re.DOTALL
    )

    # Remove obfuscated string array declarations
    content = re.sub(r'private\s+static\s+String\[\]\s+l[IlI]+\s*;', '', content)
    content = re.sub(r'private\s+static\s+int\[\]\s+l[IlI]+\s*;', '', content)

    # Remove /* synthetic */ comments
    content = re.sub(r'/\*\s*synthetic\s*\*/', '', content)

    # Remove crypto imports if no longer used
    if 'Cipher' not in content or 'encrypt' not in content.lower():
        content = re.sub(r'import\s+javax\.crypto\.[^;]+;\n', '', content)
        content = re.sub(r'import\s+java\.security\.MessageDigest;\n', '', content)
        content = re.sub(r'import\s+java\.util\.Base64;\n', '', content)

    return content


# ============================================================================
# STRING DECRYPTION
# ============================================================================

def decrypt_all_strings(content: str) -> str:
    """Decrypt all encrypted strings in content"""

    pattern = r'(?:\w+\.)?([lL][lLiI]+)\s*\(\s*"([^"]*)"\s*,\s*"([^"]{4,6})"\s*\)'

    def replace_encrypted(match):
        encrypted = match.group(2)
        key = match.group(3)
        decrypted = decrypt_string(encrypted, key)
        if decrypted:
            return f'"{escape_java_string(decrypted)}"'
        return match.group(0)

    return re.sub(pattern, replace_encrypted, content)


# ============================================================================
# PLUGIN ANALYZER
# ============================================================================

class PluginAnalyzer:
    def __init__(self, plugin_dir: Path):
        self.plugin_dir = plugin_dir
        self.plugin_name = None
        self.plugin_package = None
        self.obfuscated_package = None
        self.class_mappings = {}
        self.files = {}
        self.single_letter_classes = {}

    def analyze(self):
        """Analyze plugin structure and build class mappings"""

        for java_file in self.plugin_dir.glob('**/*.java'):
            with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()

            self.files[java_file] = content

            # Find main plugin class
            if 'extends SquirePlugin' in content:
                pkg_match = re.search(r'package\s+([\w.]+)\s*;', content)
                if pkg_match:
                    self.plugin_package = pkg_match.group(1)
                    parts = self.plugin_package.split('.')
                    self.plugin_name = parts[-1] if parts else 'plugin'

            # Find obfuscated package
            pkg_match = re.search(r'package\s+([\w.\-]+)\s*;', content)
            if pkg_match:
                pkg = pkg_match.group(1)
                if '-' in pkg or len(pkg.split('.')) > 10:
                    self.obfuscated_package = pkg

        if not self.plugin_name:
            self.plugin_name = self.plugin_dir.name

        self._build_class_mappings()
        self._map_single_letter_classes()

    def _build_class_mappings(self):
        """Build mappings based on @TaskDesc and class analysis"""

        for file_path, content in self.files.items():
            class_match = re.search(r'class\s+(\w+)', content)
            if not class_match:
                continue

            old_name = class_match.group(1)

            # Skip well-named classes
            if len(old_name) > 3 and not old_name.startswith('Game'):
                continue

            task_name = extract_task_desc(content)
            if task_name:
                self.class_mappings[old_name] = task_name_to_class_name(task_name)
                continue

            if is_enum(content):
                values = get_enum_values(content)
                new_name = infer_enum_name(content, values)
                count = sum(1 for n in self.class_mappings.values() if n.startswith(new_name))
                if count > 0:
                    new_name = f"{new_name}{count + 1}"
                self.class_mappings[old_name] = new_name
                continue

            # Check for manager/state patterns
            if '@Singleton' in content or 'getInstance' in content:
                prefix = ''.join(w.capitalize() for w in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{prefix}Manager"
            elif '@Subscribe' in content and '@TaskDesc' not in content:
                prefix = ''.join(w.capitalize() for w in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{prefix}EventHandler"

    def _map_single_letter_classes(self):
        """Map remaining single-letter classes based on usage"""

        for file_path, content in self.files.items():
            class_match = re.search(r'class\s+(\w+)', content)
            if not class_match:
                continue

            old_name = class_match.group(1)

            if len(old_name) > 1 or old_name in self.class_mappings:
                continue

            # Analyze content for hints
            if 'abstract' in content and 'class' in content:
                prefix = ''.join(w.capitalize() for w in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{prefix}TaskBase"
            elif 'interface' in content:
                self.class_mappings[old_name] = f"{old_name.upper()}Interface"
            else:
                # Generic helper class
                self.class_mappings[old_name] = f"{old_name.upper()}Helper"

    def get_new_package(self, old_package: str) -> str:
        if old_package.startswith('gg.squire'):
            return old_package
        return f"gg.squire.{self.plugin_name.lower()}.tasks"

    def deobfuscate_file(self, file_path: Path, content: str) -> Tuple[str, str]:
        """Full deobfuscation of a single file"""

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

        # Apply all deobfuscation steps
        content = decrypt_all_strings(content)
        content = simplify_static_arrays(content)
        content = inline_helper_methods(content)
        content = remove_dead_code(content)
        content = clean_control_flow(content)
        content = remove_encryption_methods(content)
        content = rename_obfuscated_variables(content)

        # Rename class
        if old_class_name != new_class_name:
            content = re.sub(
                rf'\bclass\s+{re.escape(old_class_name)}\b',
                f'class {new_class_name}',
                content
            )
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
            old_import = rf'import\s+[\w.\-]+\.{re.escape(old_name)}\s*;'
            if pkg_match:
                new_package = self.get_new_package(pkg_match.group(1))
                content = re.sub(old_import, f'import {new_package}.{new_name};', content)

        # Update type references
        for old_name, new_name in self.class_mappings.items():
            if len(old_name) <= 2:
                content = re.sub(rf'\b{re.escape(old_name)}\.class\b', f'{new_name}.class', content)
                content = re.sub(rf'\bnew\s+{re.escape(old_name)}\s*\(', f'new {new_name}(', content)

        # Final cleanup
        content = re.sub(r'\n\s*\n\s*\n+', '\n\n', content)

        return content, f"{new_class_name}.java"


# ============================================================================
# MAIN PROCESSING
# ============================================================================

def process_plugin(plugin_dir: Path, output_dir: Path) -> Dict:
    """Process a single plugin"""

    analyzer = PluginAnalyzer(plugin_dir)
    analyzer.analyze()

    stats = {
        'files_processed': 0,
        'classes_renamed': len(analyzer.class_mappings),
        'plugin_name': analyzer.plugin_name
    }

    plugin_output = output_dir / analyzer.plugin_name.lower().replace('-', '_')

    for file_path, original_content in analyzer.files.items():
        try:
            new_content, new_filename = analyzer.deobfuscate_file(file_path, original_content)

            rel_path = file_path.relative_to(plugin_dir)

            if analyzer.obfuscated_package and str(rel_path).count('/') > 5:
                out_path = plugin_output / 'tasks' / new_filename
            else:
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
    print("ENHANCED SQUIRE PLUGIN DEOBFUSCATOR")
    print("Producing truly human-readable, compilable code")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    source_dir = base_dir / "plugins" / "src"
    output_dir = base_dir / "plugins" / "clean_enhanced"

    if not source_dir.exists():
        print(f"ERROR: Source not found: {source_dir}")
        return

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
