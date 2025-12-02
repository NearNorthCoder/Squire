#!/bin/bash
# Patch the client JAR with bypassed authentication classes
# This modifies repository2/runelite-client-*.jar directly

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_DIR="$SCRIPT_DIR/../../repository2"
TARGET_DIR="$SCRIPT_DIR/target"
PATCHES_DIR="$SCRIPT_DIR/patches"

echo "==========================================="
echo "PATCHING CLIENT JAR - Auth Bypass"
echo "==========================================="

# Find the client JAR
CLIENT_JAR=$(ls "$REPO_DIR"/runelite-client-*.jar 2>/dev/null | head -1)
if [ -z "$CLIENT_JAR" ]; then
    echo "ERROR: Client JAR not found in $REPO_DIR"
    exit 1
fi

echo "Client JAR: $CLIENT_JAR"

# Create backup if not exists
BACKUP_JAR="${CLIENT_JAR}.original"
if [ ! -f "$BACKUP_JAR" ]; then
    echo "Creating backup: $BACKUP_JAR"
    cp "$CLIENT_JAR" "$BACKUP_JAR"
else
    echo "Backup already exists: $BACKUP_JAR"
fi

# Check if our compiled classes exist
if [ ! -f "$TARGET_DIR/classes/com/openosrs/client/ui/OpenOSRSSplashScreen.class" ]; then
    echo "ERROR: Bypassed classes not compiled. Run ./build.sh first"
    exit 1
fi

echo ""
echo "Patching JAR with bypassed classes..."

cd "$TARGET_DIR/classes"

# Update the JAR with our bypassed OpenOSRSSplashScreen (auth bypass)
jar uf "$CLIENT_JAR" com/openosrs/client/ui/OpenOSRSSplashScreen.class
echo "✓ Patched: com/openosrs/client/ui/OpenOSRSSplashScreen.class"

# Update the JAR with our bypassed SquirePluginManager (local plugin loading)
if [ -f "gg/squire/client/core/loader/SquirePluginManager.class" ]; then
    jar uf "$CLIENT_JAR" gg/squire/client/core/loader/SquirePluginManager.class
    echo "✓ Patched: gg/squire/client/core/loader/SquirePluginManager.class"
else
    echo "⚠ SquirePluginManager.class not found - skipping plugin loader patch"
fi

# Verify the patches
echo ""
echo "Verifying patches..."
unzip -l "$CLIENT_JAR" | grep -E "(OpenOSRSSplashScreen|SquirePluginManager).class"

echo ""
echo "==========================================="
echo "PATCH COMPLETE!"
echo ""
echo "The client JAR has been patched with bypassed auth."
echo "Original backup: $BACKUP_JAR"
echo ""
echo "To restore original: cp '$BACKUP_JAR' '$CLIENT_JAR'"
echo "==========================================="
