#!/bin/bash
# Setup script for Squire local client
# This copies the client JARs to ~/.squire/repository2/

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_SOURCE="$SCRIPT_DIR/../../repository2"
SQUIRE_HOME="$HOME/.squire"
REPO_DEST="$SQUIRE_HOME/repository2"

echo "==================================================="
echo "Squire Local Client Setup"
echo "==================================================="

# Check if source repository exists
if [ ! -d "$REPO_SOURCE" ]; then
    echo "ERROR: Source repository not found at: $REPO_SOURCE"
    echo "Please ensure the repository2 folder exists with client JARs."
    exit 1
fi

# Count source JARs
JAR_COUNT=$(find "$REPO_SOURCE" -name "*.jar" | wc -l)
echo "Found $JAR_COUNT JAR files in source repository"

# Create Squire home directory
if [ ! -d "$SQUIRE_HOME" ]; then
    echo "Creating Squire home directory: $SQUIRE_HOME"
    mkdir -p "$SQUIRE_HOME"
fi

# Create repository directory
if [ ! -d "$REPO_DEST" ]; then
    echo "Creating repository directory: $REPO_DEST"
    mkdir -p "$REPO_DEST"
fi

# Copy JAR files
echo "Copying JAR files to: $REPO_DEST"
cp -v "$REPO_SOURCE"/*.jar "$REPO_DEST/"

# Copy DLL files if present (for JNativeHook)
if ls "$REPO_SOURCE"/*.dll >/dev/null 2>&1; then
    echo "Copying DLL files..."
    cp -v "$REPO_SOURCE"/*.dll "$REPO_DEST/"
fi

# Verify copy
DEST_JAR_COUNT=$(find "$REPO_DEST" -name "*.jar" | wc -l)
echo ""
echo "==================================================="
echo "Setup complete!"
echo "Copied $DEST_JAR_COUNT JAR files to $REPO_DEST"
echo ""
echo "To run the client:"
echo "  java -jar target/squire-launcher-1.0.0-SNAPSHOT.jar"
echo "==================================================="
