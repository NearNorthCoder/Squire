#!/bin/bash
#
# Build Script for Squire Local Launcher
# This builds everything needed to run Squire locally without authentication
#

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$SCRIPT_DIR"

echo "=============================================="
echo "  SQUIRE LOCAL LAUNCHER - BUILD ALL"
echo "=============================================="
echo ""

# Step 1: Prepare local plugins
echo "[Step 1/2] Preparing local plugins..."
python3 prepare_local_plugins.py --source ../downloads --output local_plugins --clean

# Step 2: Build local launcher JAR
echo ""
echo "[Step 2/2] Building local launcher..."
python3 build_local_launcher.py --input ../dist/squire-with-logging.jar --output ../dist/squire-local.jar --clean

echo ""
echo "=============================================="
echo "  BUILD COMPLETE!"
echo "=============================================="
echo ""
echo "To run Squire locally:"
echo "  cd dist"
echo "  java -jar squire-local.jar --plugins-dir ../local_launcher/local_plugins"
echo ""
echo "Or on Windows:"
echo "  cd dist"
echo "  java -jar squire-local.jar --plugins-dir ..\\local_launcher\\local_plugins"
echo ""
