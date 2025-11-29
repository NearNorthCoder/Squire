#!/usr/bin/env python3
"""
Squire Comprehensive Deobfuscation Script
Transforms obfuscated c/r/m package into clean, readable source code.

Features:
1. Decrypts all encrypted strings (XOR, DES, Blowfish)
2. Renames classes to meaningful names
3. Renames methods and fields
4. Cleans up obfuscation artifacts
5. Generates deobfuscated source files
"""

import base64
import hashlib
import re
import os
import sys
from pathlib import Path
from typing import Dict, List, Tuple, Optional

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    import subprocess
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


# ============================================================================
# CLASS MAPPINGS
# ============================================================================

CLASS_MAPPINGS = {
    'c.r.m.a': 'squire.auth.SquireAuthHandler',
    'c.r.m.A': 'squire.ui.ProgressBarUI',
    'c.r.m.b': 'squire.auth.AccountData',
    'c.r.m.B': 'squire.ui.ButtonHoverListener',
    'c.r.m.c': 'squire.ui.AuthPanel',
    'c.r.m.C': 'squire.ui.DeleteButtonListener',
    'c.r.m.d': 'squire.ui.AuthProgressBarUI',
    'c.r.m.D': 'squire.ui.RefreshButtonListener',
    'c.r.m.e': 'squire.ui.HtmlLabel',
    'c.r.m.E': 'squire.ui.ProgressHtmlLabel',
    'c.r.m.f': 'squire.ui.LogoPanel',
    'c.r.m.F': 'squire.util.PlatformDetector',
    'c.r.m.g': 'squire.ui.ComboBoxEditor',
    'c.r.m.G': 'squire.util.Platform',
    'c.r.m.h': 'squire.auth.SessionManager',
    'c.r.m.H': 'squire.auth.OAuthHandler',
    'c.r.m.i': 'squire.ui.ImagePanel',
    'c.r.m.I': 'squire.auth.TokenResponse',
    'c.r.m.j': 'squire.config.ConfigManager',
    'c.r.m.J': 'squire.auth.AuthResponse',
    'c.r.m.k': 'squire.ui.ThemeColors',
    'c.r.m.K': 'squire.auth.GameSession',
    'c.r.m.l': 'squire.ui.ScrollBarUI',
    'c.r.m.L': 'squire.ui.LoginFrame',
    'c.r.m.m': 'squire.ui.FontManager',
    'c.r.m.M': 'squire.auth.AccountImporter',
    'c.r.m.n': 'squire.util.HardwareAcceleration',
    'c.r.m.o': 'squire.util.SystemInfo',
    'c.r.m.p': 'squire.util.ImageLoader',
    'c.r.m.q': 'squire.ui.LogoSidePanel',
    'c.r.m.r': 'squire.auth.RequestBuilder',
    'c.r.m.s': 'squire.util.StringUtils',
    'c.r.m.t': 'squire.auth.TokenManager',
    'c.r.m.u': 'squire.util.UrlBuilder',
    'c.r.m.v': 'squire.util.ValidationUtil',
    'c.r.m.w': 'squire.auth.WebClient',
    'c.r.m.x': 'squire.util.CryptoUtil',
    'c.r.m.y': 'squire.util.FileUtil',
    'c.r.m.z': 'squire.ui.ProgressPanel',
}

# Method mappings (obfuscated -> meaningful name)
METHOD_MAPPINGS = {
    # Common obfuscated method patterns
    'lIIlll': 'isNotNull',
    'lIlIlI': 'isNull',
    'lIIllI': 'equals',
    'lIlIIl': 'lessThan',
    'lIlIll': 'greaterThan',
    'lIIIIl': 'notEquals',
    'lllll': 'equalsZero',
    'llllI': 'notEqualsZero',

    # Platform detection (F.java)
    'j': 'detectPlatform',
    'R': 'getCurrentPlatform',

    # Font manager (m.java)
    'j': 'getRegularFont',
    'o': 'getBoldFont',

    # Login frame (L.java)
    'S': 'getInstance',
    'K': 'showButtons',
    'h': 'showError',
    'a': 'updateProgress',
    'l': 'setStatus',
    'm': 'setMessage',
    'n': 'addButton',
    'k': 'show',
    'close': 'close',

    # Progress panel (z.java)
    'L': 'getTitleLabel',
    'M': 'getDescriptionLabel',
    'N': 'getStatusLabel',
    'O': 'getProgressLabel',
    'P': 'getProgressBar',
    'Q': 'getAccountModel',
    'g': 'getButtonPanel',
    'h': 'setDescription',
    'i': 'setTitle',
    'K': 'showButtons',
    'H': 'createAccountSelector',
    'I': 'deleteAccount',
    'J': 'refreshAccounts',
}

# Field mappings
FIELD_MAPPINGS = {
    # ThemeColors (k.java)
    'Z': 'PRIMARY_COLOR',
    'aa': 'SECONDARY_COLOR',
    'ab': 'BORDER_COLOR',
    'ac': 'BACKGROUND_COLOR',
    'ad': 'INPUT_BACKGROUND',
    'ae': 'HOVER_COLOR',
    'af': 'ERROR_COLOR',

    # LoginFrame (L.java)
    'bw': 'logger',
    'bx': 'WINDOW_SIZE',
    'by': 'instance',
    'bz': 'progressPanel',
    'bA': 'authPanel',
    'A': 'squireDir',

    # FontManager (m.java)
    'ai': 'regularFont',
    'aj': 'boldFont',

    # ProgressPanel (z.java)
    'aV': 'SQUIRE_DIR',
    'aW': 'PANEL_SIZE',
    'aX': 'PROGRESS_SIZE',
    'aY': 'MAX_ACCOUNTS',
    'aZ': 'titleLabel',
    'ba': 'descriptionLabel',
    'bb': 'statusLabel',
    'bc': 'progressLabel',
    'bd': 'progressBar',
    'be': 'scrollPane',
    'bf': 'buttonPanel',
    'bg': 'accountModel',

    # PlatformDetector (F.java)
    'bp': 'logger',
    'bq': 'currentPlatform',
}


# ============================================================================
# DECRYPTION FUNCTIONS
# ============================================================================

def decrypt_xor(encrypted_b64: str, key: str) -> str:
    """XOR decryption with cycling key"""
    if not encrypted_b64:
        return '""'
    try:
        decoded = base64.b64decode(encrypted_b64).decode('utf-8')
        key_chars = list(key)
        result = []
        key_idx = 0
        for char in decoded:
            result.append(chr(ord(char) ^ ord(key_chars[key_idx % len(key_chars)])))
            key_idx += 1
        return '"' + ''.join(result).replace('\\', '\\\\').replace('"', '\\"') + '"'
    except:
        return f'"[XOR_DECRYPT_FAILED:{encrypted_b64[:20]}]"'


def decrypt_des(encrypted_b64: str, key_string: str) -> str:
    """DES decryption"""
    if not encrypted_b64:
        return '""'
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()[:8]
        cipher = DES.new(key, DES.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        result = decrypted.decode('utf-8')
        return '"' + result.replace('\\', '\\\\').replace('"', '\\"') + '"'
    except:
        return f'"[DES_DECRYPT_FAILED:{encrypted_b64[:20]}]"'


def decrypt_blowfish(encrypted_b64: str, key_string: str) -> str:
    """Blowfish decryption"""
    if not encrypted_b64:
        return '""'
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()
        cipher = Blowfish.new(key, Blowfish.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        result = decrypted.decode('utf-8')
        return '"' + result.replace('\\', '\\\\').replace('"', '\\"') + '"'
    except:
        return f'"[BLOWFISH_DECRYPT_FAILED:{encrypted_b64[:20]}]"'


# ============================================================================
# OBFUSCATION ARTIFACT REMOVAL
# ============================================================================

def clean_obfuscation_artifacts(content: str) -> str:
    """Remove common obfuscation artifacts"""

    # Remove "".length() used as 0, " ".length() as 1, etc.
    content = re.sub(r'""\s*\.\s*length\s*\(\s*\)', '0', content)
    content = re.sub(r'" "\s*\.\s*length\s*\(\s*\)', '1', content)
    content = re.sub(r'"  "\s*\.\s*length\s*\(\s*\)', '2', content)
    content = re.sub(r'"   "\s*\.\s*length\s*\(\s*\)', '3', content)

    # Remove dead code patterns
    # if (0 != 0) { ... } or if (1 < 0) { ... }
    content = re.sub(r'if\s*\(\s*0\s*!=\s*0\s*\)\s*\{[^}]*\}', '', content)
    content = re.sub(r'if\s*\(\s*1\s*<\s*0\s*\)\s*\{[^}]*\}', '', content)
    content = re.sub(r'if\s*\(\s*-1\s*>\s*0\s*\)\s*\{[^}]*\}', '', content)
    content = re.sub(r'if\s*\(\s*-1\s*==\s*-1\s*\)\s*\{\s*return[^}]*\}', '', content)

    # Remove standalone "".length(); statements (NOPs)
    content = re.sub(r'^\s*""\s*\.\s*length\s*\(\s*\)\s*;?\s*$', '', content, flags=re.MULTILINE)
    content = re.sub(r'^\s*" "\s*\.\s*length\s*\(\s*\)\s*;?\s*$', '', content, flags=re.MULTILINE)

    # Remove complex obfuscated boolean expressions that always evaluate to true/false
    # Pattern: (X ^ Y ^ (A ^ B)) where result is always 0 or constant
    content = re.sub(r'\(\s*\d+\s*\+\s*\d+\s*-\s*\d+\s*\+\s*\d+\s*\^\s*\d+\s*\+\s*\d+\s*-\s*\d+\s*\+\s*\d+\s*\)',
                     lambda m: str(eval_xor_expr(m.group(0))), content)

    # Remove null comparisons that are always true
    content = re.sub(r'if\s*\(\s*null\s*!=\s*null\s*\)\s*\{[^}]*\}', '', content)
    content = re.sub(r'if\s*\(\s*null\s*==\s*null\s*\)\s*continue\s*;', 'continue;', content)

    # Clean up empty lines
    content = re.sub(r'\n\s*\n\s*\n', '\n\n', content)

    return content


def eval_xor_expr(expr: str) -> int:
    """Safely evaluate simple XOR expressions"""
    try:
        # Clean and evaluate
        clean = re.sub(r'[^\d\+\-\*\^\(\)\s]', '', expr)
        return eval(clean)
    except:
        return 0


# ============================================================================
# STRING DECRYPTION IN SOURCE
# ============================================================================

def identify_decrypt_method(method_name: str, content: str) -> Optional[str]:
    """Identify which decryption algorithm a method uses based on its implementation"""
    # Search for the method definition
    pattern = rf'private\s+static\s+String\s+{re.escape(method_name)}\s*\([^)]+\)\s*\{{'
    match = re.search(pattern, content)
    if not match:
        return None

    # Find the method body
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


def decrypt_strings_in_file(content: str) -> str:
    """Find and replace all encrypted strings with decrypted values"""

    # Build a map of decryption methods to their algorithms
    decrypt_methods = {}

    # Find all potential decryption method definitions
    method_pattern = r'private\s+static\s+String\s+(l[lI]+)\s*\('
    for match in re.finditer(method_pattern, content):
        method_name = match.group(1)
        algo = identify_decrypt_method(method_name, content)
        if algo:
            decrypt_methods[method_name] = algo

    # Find and replace all encrypted string calls
    # Pattern: methodName("encrypted", "key")
    call_pattern = r'(l[lI]+)\s*\(\s*"([^"]*)"\s*,\s*"([^"]+)"\s*\)'

    def replace_encrypted(match):
        method = match.group(1)
        encrypted = match.group(2)
        key = match.group(3)

        # Determine algorithm
        algo = decrypt_methods.get(method)
        if not algo:
            # Try to guess based on method name patterns
            if 'III' in method or method.count('I') > method.count('l'):
                algo = 'XOR'
            elif method.endswith('lI') or method.endswith('Il'):
                algo = 'Blowfish'
            else:
                algo = 'DES'

        # Decrypt
        if algo == 'XOR':
            return decrypt_xor(encrypted, key)
        elif algo == 'DES':
            return decrypt_des(encrypted, key)
        elif algo == 'Blowfish':
            return decrypt_blowfish(encrypted, key)

        return match.group(0)  # Return original if failed

    content = re.sub(call_pattern, replace_encrypted, content)
    return content


# ============================================================================
# CLASS/METHOD/FIELD RENAMING
# ============================================================================

def rename_class(content: str, old_name: str, new_name: str) -> str:
    """Rename a class throughout the content"""
    # Get just the class name (without package)
    old_simple = old_name.split('.')[-1]
    new_simple = new_name.split('.')[-1]

    # Replace class references
    content = re.sub(rf'\b{re.escape(old_simple)}\b(?!\s*=)', new_simple, content)

    return content


def rename_fields(content: str, mappings: Dict[str, str]) -> str:
    """Rename fields based on mappings"""
    for old, new in mappings.items():
        # Match field references
        content = re.sub(rf'(?<![a-zA-Z0-9_]){re.escape(old)}(?![a-zA-Z0-9_])', new, content)
    return content


def rename_methods(content: str, mappings: Dict[str, str]) -> str:
    """Rename methods based on mappings"""
    for old, new in mappings.items():
        # Match method calls and definitions
        content = re.sub(rf'(?<![a-zA-Z0-9_]){re.escape(old)}\s*\(', f'{new}(', content)
    return content


# ============================================================================
# MAIN DEOBFUSCATION
# ============================================================================

def deobfuscate_file(input_path: str, output_path: str) -> None:
    """Deobfuscate a single Java file"""

    with open(input_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()

    # Step 1: Decrypt all strings
    content = decrypt_strings_in_file(content)

    # Step 2: Clean obfuscation artifacts
    content = clean_obfuscation_artifacts(content)

    # Step 3: Rename fields
    content = rename_fields(content, FIELD_MAPPINGS)

    # Step 4: Update package declaration
    for old_class, new_class in CLASS_MAPPINGS.items():
        old_pkg = '.'.join(old_class.split('.')[:-1])
        new_pkg = '.'.join(new_class.split('.')[:-1])
        content = content.replace(f'package {old_pkg};', f'package {new_pkg};')

    # Step 5: Update class name in declaration
    filename = os.path.basename(input_path)
    class_letter = filename.replace('.java', '')
    full_old_class = f'c.r.m.{class_letter}'

    if full_old_class in CLASS_MAPPINGS:
        new_full = CLASS_MAPPINGS[full_old_class]
        new_class_name = new_full.split('.')[-1]
        old_class_name = class_letter

        # Update class declaration
        content = re.sub(
            rf'(public\s+(?:final\s+)?(?:abstract\s+)?class\s+){re.escape(old_class_name)}\b',
            rf'\1{new_class_name}',
            content
        )
        content = re.sub(
            rf'(class\s+){re.escape(old_class_name)}\b',
            rf'\1{new_class_name}',
            content
        )

    # Step 6: Update imports
    for old_class, new_class in CLASS_MAPPINGS.items():
        content = content.replace(f'import {old_class};', f'import {new_class};')

    # Write output
    os.makedirs(os.path.dirname(output_path), exist_ok=True)
    with open(output_path, 'w', encoding='utf-8') as f:
        f.write(content)

    print(f"  Deobfuscated: {input_path} -> {output_path}")


def deobfuscate_directory(input_dir: str, output_dir: str) -> None:
    """Deobfuscate all Java files in a directory"""

    input_path = Path(input_dir)
    output_path = Path(output_dir)

    for java_file in input_path.glob('**/*.java'):
        # Calculate relative path
        rel_path = java_file.relative_to(input_path)

        # Determine new filename based on class mapping
        filename = java_file.stem
        full_old_class = f'c.r.m.{filename}'

        if full_old_class in CLASS_MAPPINGS:
            new_full = CLASS_MAPPINGS[full_old_class]
            new_pkg_path = new_full.replace('.', '/').rsplit('/', 1)[0]
            new_filename = new_full.split('.')[-1] + '.java'
            out_file = output_path / new_pkg_path / new_filename
        else:
            out_file = output_path / rel_path

        deobfuscate_file(str(java_file), str(out_file))


def main():
    print("=" * 70)
    print("SQUIRE COMPREHENSIVE DEOBFUSCATOR")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    input_dir = base_dir / "client" / "src" / "c" / "r" / "m"
    output_dir = base_dir / "deobfuscated" / "src"

    if not input_dir.exists():
        print(f"ERROR: Input directory not found: {input_dir}")
        sys.exit(1)

    print(f"\nInput:  {input_dir}")
    print(f"Output: {output_dir}")
    print("-" * 70)

    # Deobfuscate all files
    deobfuscate_directory(str(input_dir), str(output_dir))

    print("-" * 70)
    print("Deobfuscation complete!")
    print(f"\nOutput files in: {output_dir}")
    print("=" * 70)


if __name__ == "__main__":
    main()
