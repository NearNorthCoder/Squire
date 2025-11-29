#!/usr/bin/env python3
"""
Plugin Deobfuscation Script
Deobfuscates all Squire plugin source files
"""

import base64
import hashlib
import re
import os
import sys
from pathlib import Path

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    import subprocess
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


def decrypt_xor(encrypted_b64: str, key: str) -> str:
    if not encrypted_b64:
        return '""'
    try:
        decoded = base64.b64decode(encrypted_b64).decode('utf-8')
        result = []
        for i, char in enumerate(decoded):
            result.append(chr(ord(char) ^ ord(key[i % len(key)])))
        return '"' + ''.join(result).replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n') + '"'
    except:
        return f'"{encrypted_b64[:20]}..."'


def decrypt_des(encrypted_b64: str, key_string: str) -> str:
    if not encrypted_b64:
        return '""'
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()[:8]
        cipher = DES.new(key, DES.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return '"' + decrypted.decode('utf-8').replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n') + '"'
    except:
        return f'"{encrypted_b64[:20]}..."'


def decrypt_blowfish(encrypted_b64: str, key_string: str) -> str:
    if not encrypted_b64:
        return '""'
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()
        cipher = Blowfish.new(key, Blowfish.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return '"' + decrypted.decode('utf-8').replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n') + '"'
    except:
        return f'"{encrypted_b64[:20]}..."'


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


def decrypt_strings_in_content(content: str) -> str:
    """Find and decrypt all encrypted strings"""

    # Build decrypt method map
    decrypt_methods = {}
    method_pattern = r'private\s+static\s+String\s+(l[lI]+)\s*\('
    for match in re.finditer(method_pattern, content):
        method_name = match.group(1)
        algo = identify_decrypt_method(method_name, content)
        if algo:
            decrypt_methods[method_name] = algo

    # Replace encrypted strings
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


def clean_obfuscation(content: str) -> str:
    """Remove obfuscation artifacts"""
    # Replace "".length() patterns
    content = re.sub(r'""\s*\.\s*length\s*\(\s*\)', '0', content)
    content = re.sub(r'" "\s*\.\s*length\s*\(\s*\)', '1', content)
    content = re.sub(r'"  "\s*\.\s*length\s*\(\s*\)', '2', content)
    content = re.sub(r'"   "\s*\.\s*length\s*\(\s*\)', '3', content)

    # Clean up empty lines
    content = re.sub(r'\n\s*\n\s*\n', '\n\n', content)

    return content


def process_file(input_path: str, output_path: str) -> bool:
    """Process a single Java file"""
    try:
        with open(input_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()

        # Skip if no encrypted strings
        if not re.search(r'l[lI]+\s*\(\s*"[^"]+"\s*,\s*"[^"]+"\s*\)', content):
            return False

        # Decrypt and clean
        content = decrypt_strings_in_content(content)
        content = clean_obfuscation(content)

        # Write output
        os.makedirs(os.path.dirname(output_path), exist_ok=True)
        with open(output_path, 'w', encoding='utf-8') as f:
            f.write(content)

        return True
    except Exception as e:
        print(f"  Error processing {input_path}: {e}")
        return False


def process_plugin(plugin_dir: str, output_dir: str) -> int:
    """Process all Java files in a plugin directory"""
    plugin_path = Path(plugin_dir)
    output_path = Path(output_dir)

    processed = 0
    for java_file in plugin_path.glob('**/*.java'):
        rel_path = java_file.relative_to(plugin_path)
        out_file = output_path / rel_path

        if process_file(str(java_file), str(out_file)):
            processed += 1

    return processed


def main():
    print("=" * 70)
    print("SQUIRE PLUGIN DEOBFUSCATOR")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    plugins_src = base_dir / "plugins" / "src"
    plugins_out = base_dir / "plugins" / "deobfuscated"

    if not plugins_src.exists():
        print(f"ERROR: Plugins source not found: {plugins_src}")
        sys.exit(1)

    print(f"\nInput:  {plugins_src}")
    print(f"Output: {plugins_out}")
    print("-" * 70)

    total_processed = 0
    plugin_dirs = sorted(plugins_src.iterdir())

    for i, plugin_dir in enumerate(plugin_dirs):
        if not plugin_dir.is_dir():
            continue

        plugin_name = plugin_dir.name
        out_dir = plugins_out / plugin_name

        processed = process_plugin(str(plugin_dir), str(out_dir))
        if processed > 0:
            print(f"[{i+1:2}/{len(plugin_dirs)}] {plugin_name}: {processed} files deobfuscated")
            total_processed += processed

    print("-" * 70)
    print(f"Total: {total_processed} files deobfuscated across {len(plugin_dirs)} plugins")
    print(f"Output: {plugins_out}")
    print("=" * 70)


if __name__ == "__main__":
    main()
