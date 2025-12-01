#!/bin/bash

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$SCRIPT_DIR"

echo "========================================="
echo "Squire Deobfuscator - Build Script"
echo "========================================="
echo ""

# Check if gradle wrapper exists
if [ -f "./gradlew" ]; then
    echo "[INFO] Using Gradle Wrapper"
    GRADLE_CMD="./gradlew"
# Check if gradle is installed
elif command -v gradle &> /dev/null; then
    echo "[INFO] Using system Gradle"
    GRADLE_CMD="gradle"
else
    echo "[ERROR] Neither Gradle wrapper nor Gradle installation found!"
    echo "[INFO] Please install Gradle or run: gradle wrapper"
    exit 1
fi

echo "[INFO] Building Squire Deobfuscator..."
echo ""

# Run the build task (includes jar creation and copying)
$GRADLE_CMD clean build

echo ""
echo "[INFO] Build completed successfully!"
echo ""

# Copy the JAR to the root directory
JAR_SOURCE="build/libs/squire-deobfuscator.jar"
JAR_DEST="squire-deobfuscator.jar"

if [ -f "$JAR_SOURCE" ]; then
    cp "$JAR_SOURCE" "$JAR_DEST"
    echo "[INFO] JAR copied to: $SCRIPT_DIR/$JAR_DEST"
else
    echo "[ERROR] JAR file not found at: $JAR_SOURCE"
    exit 1
fi

echo ""
echo "========================================="
echo "Build Complete!"
echo "========================================="
echo ""
echo "Usage:"
echo "  java -jar squire-deobfuscator.jar <input-directory> <output-directory>"
echo ""
echo "Example:"
echo "  java -jar squire-deobfuscator.jar ./obfuscated ./deobfuscated"
echo ""
echo "The deobfuscator will:"
echo "  - Process all .java files in the input directory"
echo "  - Replace encrypted strings with decrypted values"
echo "  - Write deobfuscated files to the output directory"
echo ""
echo "========================================="
