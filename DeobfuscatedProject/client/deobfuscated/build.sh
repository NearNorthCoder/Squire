#!/bin/bash
# Build script for Squire Local Client
# Compiles the deobfuscated launcher using javac

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_DIR="$SCRIPT_DIR/../../repository2"
TARGET_DIR="$SCRIPT_DIR/target"
SRC_DIR="$SCRIPT_DIR/src/main/java"

echo "==================================================="
echo "Building Squire Local Client"
echo "==================================================="

# Check Java version
if ! command -v javac &> /dev/null; then
    echo "ERROR: javac not found. Please install JDK 17+."
    exit 1
fi

JAVA_VERSION=$(javac -version 2>&1 | awk '{print $2}' | cut -d'.' -f1)
echo "Java compiler version: $JAVA_VERSION"

# Check if repository exists
if [ ! -d "$REPO_DIR" ]; then
    echo "ERROR: Repository not found at: $REPO_DIR"
    echo "Please ensure the client JAR files are in place."
    exit 1
fi

# Build classpath
LIB_DIR="$SCRIPT_DIR/lib"
CLASSPATH="$REPO_DIR/slf4j-api-1.7.32.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/logback-classic-1.2.9.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/logback-core-1.2.9.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/guava-30.1.1-jre.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/okhttp-4.10.0.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/gson-2.8.5.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/okio-jvm-3.0.0.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/kotlin-stdlib-1.6.21.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/kotlin-stdlib-common-1.6.21.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/annotations-22.0.0.jar"
# Include original Squire launcher for AccountImporter
CLASSPATH="$CLASSPATH:$LIB_DIR/squire-with-logging.jar"

# Clean and create target directory
rm -rf "$TARGET_DIR/classes"
mkdir -p "$TARGET_DIR/classes"

echo "Compiling sources..."

# Find and compile all Java files
javac -d "$TARGET_DIR/classes" -cp "$CLASSPATH" $(find "$SRC_DIR" -name "*.java")

echo "Compilation successful!"

# Create manifest
mkdir -p "$TARGET_DIR/classes/META-INF"
cat > "$TARGET_DIR/classes/META-INF/MANIFEST.MF" << 'EOF'
Manifest-Version: 1.0
Main-Class: squire.launcher.SquireLauncher
EOF

# Create JAR
echo "Creating JAR..."
jar cfm "$TARGET_DIR/squire-launcher-local.jar" "$TARGET_DIR/classes/META-INF/MANIFEST.MF" -C "$TARGET_DIR/classes" .

echo ""
echo "==================================================="
echo "Build complete!"
echo "Output: $TARGET_DIR/squire-launcher-local.jar"
echo ""
echo "To run the client:"
echo "  ./run-local.sh"
echo "==================================================="
