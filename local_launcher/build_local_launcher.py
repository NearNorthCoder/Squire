#!/usr/bin/env python3
"""
Build Script for Squire Local Launcher

This script:
1. Compiles the LocalLauncher.java
2. Extracts the original Squire JAR
3. Replaces/patches authentication
4. Creates a new JAR with local plugin support

Requirements:
- Java JDK 11+ (for compilation)
- Original Squire JAR

Usage:
    python3 build_local_launcher.py [--input squire.jar] [--output squire-local.jar]
"""

import os
import sys
import shutil
import subprocess
import zipfile
import tempfile
from pathlib import Path
import argparse


def find_java():
    """Find Java compiler and runtime."""
    javac = shutil.which("javac")
    java = shutil.which("java")

    if not javac:
        print("[ERROR] javac not found. Install JDK 11+")
        sys.exit(1)

    if not java:
        print("[ERROR] java not found. Install JDK 11+")
        sys.exit(1)

    # Check version
    result = subprocess.run([java, "-version"], capture_output=True, text=True)
    print(f"[*] Using Java: {result.stderr.split(chr(10))[0]}")

    return javac, java


def compile_launcher(javac, source_dir, output_dir, classpath=None):
    """Compile the LocalLauncher.java source."""
    java_file = source_dir / "net" / "runelite" / "launcher" / "LocalLauncher.java"

    if not java_file.exists():
        print(f"[ERROR] Source file not found: {java_file}")
        sys.exit(1)

    print(f"[*] Compiling {java_file.name}...")

    # Create output directory
    output_dir.mkdir(parents=True, exist_ok=True)

    # Build compile command
    cmd = [str(javac), "-d", str(output_dir)]
    if classpath:
        cmd.extend(["-cp", str(classpath)])
    cmd.append(str(java_file))

    result = subprocess.run(cmd, capture_output=True, text=True)

    if result.returncode != 0:
        print(f"[ERROR] Compilation failed:")
        print(result.stderr)
        sys.exit(1)

    print("[OK] Compilation successful")
    return True


def extract_jar(jar_path, extract_dir):
    """Extract JAR file contents."""
    print(f"[*] Extracting {jar_path.name}...")

    with zipfile.ZipFile(jar_path, 'r') as zf:
        zf.extractall(extract_dir)

    print(f"[OK] Extracted to {extract_dir}")


def patch_manifest(manifest_path):
    """Patch the MANIFEST.MF to use LocalLauncher as main class."""
    print("[*] Patching MANIFEST.MF...")

    if not manifest_path.exists():
        # Create new manifest
        content = """Manifest-Version: 1.0
Main-Class: net.runelite.launcher.LocalLauncher
"""
    else:
        with open(manifest_path, 'r') as f:
            content = f.read()

        # Replace Main-Class
        lines = content.split('\n')
        new_lines = []
        found_main = False
        for line in lines:
            if line.startswith('Main-Class:'):
                new_lines.append('Main-Class: net.runelite.launcher.LocalLauncher')
                found_main = True
            else:
                new_lines.append(line)

        if not found_main:
            new_lines.insert(1, 'Main-Class: net.runelite.launcher.LocalLauncher')

        content = '\n'.join(new_lines)

    with open(manifest_path, 'w') as f:
        f.write(content)

    print("[OK] Manifest patched")


def create_auth_bypass_class(output_dir):
    """
    Create a simple bytecode patch that sets aN = true at class load.
    This is done by creating a static initializer in a helper class.
    """
    print("[*] Creating auth bypass helper...")

    # We'll create a simple Java helper that can be called
    helper_code = '''package net.runelite.launcher;

/**
 * AuthBypass - Sets authentication flags via reflection
 */
public class AuthBypass {
    static {
        try {
            // This runs when the class is loaded
            java.lang.reflect.Field field = Launcher.class.getDeclaredField("aN");
            field.setAccessible(true);
            field.setBoolean(null, true);
            System.out.println("[AuthBypass] Authentication bypassed");
        } catch (Exception e) {
            System.err.println("[AuthBypass] Warning: " + e.getMessage());
        }
    }

    public static void init() {
        // Force class initialization
    }
}
'''

    helper_dir = output_dir / "net" / "runelite" / "launcher"
    helper_dir.mkdir(parents=True, exist_ok=True)

    helper_file = helper_dir / "AuthBypass.java"
    with open(helper_file, 'w') as f:
        f.write(helper_code)

    print(f"[OK] Created {helper_file}")
    return helper_file


def create_jar(source_dir, output_jar, manifest_path=None):
    """Create a JAR file from directory contents."""
    print(f"[*] Creating {output_jar.name}...")

    with zipfile.ZipFile(output_jar, 'w', zipfile.ZIP_DEFLATED) as zf:
        for root, dirs, files in os.walk(source_dir):
            for file in files:
                file_path = Path(root) / file
                arc_name = file_path.relative_to(source_dir)
                zf.write(file_path, arc_name)

    print(f"[OK] Created {output_jar}")


def main():
    parser = argparse.ArgumentParser(description="Build Squire Local Launcher")
    parser.add_argument("--input", "-i", default="../dist/squire-with-logging.jar",
                        help="Input Squire JAR file")
    parser.add_argument("--output", "-o", default="../dist/squire-local.jar",
                        help="Output JAR file")
    parser.add_argument("--clean", action="store_true",
                        help="Clean build directories before building")

    args = parser.parse_args()

    script_dir = Path(__file__).parent.resolve()
    input_jar = Path(args.input)
    if not input_jar.is_absolute():
        input_jar = script_dir / input_jar
    output_jar = Path(args.output)
    if not output_jar.is_absolute():
        output_jar = script_dir / output_jar

    print("=" * 60)
    print("  SQUIRE LOCAL LAUNCHER BUILD SCRIPT")
    print("=" * 60)
    print(f"  Input:  {input_jar}")
    print(f"  Output: {output_jar}")
    print("=" * 60 + "\n")

    # Check input exists
    if not input_jar.exists():
        print(f"[ERROR] Input JAR not found: {input_jar}")
        print("Make sure you have a Squire JAR in the dist/ directory")
        sys.exit(1)

    # Find Java tools
    javac, java = find_java()

    # Create temp directory for build
    build_dir = script_dir / "build"
    if args.clean and build_dir.exists():
        shutil.rmtree(build_dir)

    build_dir.mkdir(exist_ok=True)
    extract_dir = build_dir / "extracted"
    compiled_dir = build_dir / "compiled"

    # Step 1: Extract original JAR
    print("\n[Step 1/5] Extracting original JAR...")
    extract_jar(input_jar, extract_dir)

    # Step 2: Compile LocalLauncher
    print("\n[Step 2/5] Compiling LocalLauncher...")
    source_dir = script_dir / "src"
    compile_launcher(javac, source_dir, compiled_dir, classpath=input_jar)

    # Step 3: Copy compiled classes to extracted dir
    print("\n[Step 3/5] Merging compiled classes...")
    for root, dirs, files in os.walk(compiled_dir):
        for file in files:
            if file.endswith('.class'):
                src_path = Path(root) / file
                rel_path = src_path.relative_to(compiled_dir)
                dst_path = extract_dir / rel_path
                dst_path.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(src_path, dst_path)
                print(f"     [+] {rel_path}")

    # Step 4: Patch manifest
    print("\n[Step 4/5] Patching manifest...")
    manifest_dir = extract_dir / "META-INF"
    manifest_dir.mkdir(exist_ok=True)
    patch_manifest(manifest_dir / "MANIFEST.MF")

    # Step 5: Create new JAR
    print("\n[Step 5/5] Creating final JAR...")
    create_jar(extract_dir, output_jar)

    # Print summary
    print("\n" + "=" * 60)
    print("  BUILD COMPLETE")
    print("=" * 60)
    print(f"  Output: {output_jar}")
    print(f"  Size:   {output_jar.stat().st_size / 1024 / 1024:.2f} MB")
    print("\n  Run with:")
    print(f"    java -jar {output_jar.name}")
    print("\n  Or with local plugins:")
    print(f"    java -jar {output_jar.name} --plugins-dir ./local_plugins")
    print("=" * 60)


if __name__ == "__main__":
    main()
