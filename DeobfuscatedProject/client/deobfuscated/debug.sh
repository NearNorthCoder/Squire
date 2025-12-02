#!/bin/bash
# Debug script for Squire Local Client
# Identifies classpath issues and class loading conflicts

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_DIR="$SCRIPT_DIR/../../repository2"
LIB_DIR="$SCRIPT_DIR/lib"
TARGET_DIR="$SCRIPT_DIR/target"

echo "==========================================="
echo "SQUIRE LOCAL CLIENT - DEBUG DIAGNOSTICS"
echo "==========================================="
echo ""

# 1. Check if our JAR exists and contains bypassed classes
echo "=== 1. Checking our compiled JAR ==="
if [ -f "$TARGET_DIR/squire-launcher-local.jar" ]; then
    echo "✓ squire-launcher-local.jar exists"
    echo ""
    echo "Classes in our JAR related to auth:"
    jar tf "$TARGET_DIR/squire-launcher-local.jar" | grep -iE "(OpenOSRS|AuthenticationPanel|Squire)" || echo "  (none found)"
else
    echo "✗ squire-launcher-local.jar NOT FOUND - run ./build.sh first"
fi
echo ""

# 2. Check client JAR for conflicting classes
echo "=== 2. Checking client JAR for same classes ==="
if [ -f "$REPO_DIR/runelite-client-1.1.12-SNAPSHOT.jar" ]; then
    echo "Classes in client JAR we're trying to override:"
    jar tf "$REPO_DIR/runelite-client-1.1.12-SNAPSHOT.jar" | grep -E "OpenOSRSSplashScreen|com/openosrs/client/ui/components" | head -10
else
    echo "✗ Client JAR not found"
fi
echo ""

# 3. Check squire-with-logging.jar
echo "=== 3. Checking squire-with-logging.jar ==="
if [ -f "$LIB_DIR/squire-with-logging.jar" ]; then
    echo "Auth-related classes in squire-with-logging.jar:"
    jar tf "$LIB_DIR/squire-with-logging.jar" | grep -iE "(AuthenticationPanel|Launcher|MessagePanel)" | head -10
else
    echo "✗ squire-with-logging.jar not found"
fi
echo ""

# 4. Show classpath order (which JAR will be loaded first)
echo "=== 4. Classpath Order (first JAR wins for same class) ==="
echo "1. $TARGET_DIR/squire-launcher-local.jar (OUR JAR - should be first)"
echo "2. $REPO_DIR/*.jar (dependencies)"
echo "3. $LIB_DIR/squire-with-logging.jar"
echo "4. $REPO_DIR/runelite-client-1.1.12-SNAPSHOT.jar (client)"
echo ""

# 5. Check run-local.sh classpath
echo "=== 5. Checking run-local.sh classpath order ==="
if [ -f "$SCRIPT_DIR/run-local.sh" ]; then
    echo "Classpath in run-local.sh:"
    grep -A 50 "CLASSPATH=" "$SCRIPT_DIR/run-local.sh" | head -20
else
    echo "✗ run-local.sh not found"
fi
echo ""

# 6. Decompile our OpenOSRSSplashScreen to verify it's correct
echo "=== 6. Verifying our OpenOSRSSplashScreen.class ==="
if [ -f "$TARGET_DIR/squire-launcher-local.jar" ]; then
    echo "Methods in our OpenOSRSSplashScreen:"
    unzip -p "$TARGET_DIR/squire-launcher-local.jar" "com/openosrs/client/ui/OpenOSRSSplashScreen.class" 2>/dev/null | javap -p - 2>/dev/null | grep -E "(public|private|static)" | head -20 || echo "  (could not decompile)"
fi
echo ""

# 7. Check for the authenticate method specifically
echo "=== 7. Checking authenticate() method in our class ==="
if [ -f "$TARGET_DIR/classes/com/openosrs/client/ui/OpenOSRSSplashScreen.class" ]; then
    echo "Our compiled class exists at: $TARGET_DIR/classes/com/openosrs/client/ui/OpenOSRSSplashScreen.class"
    javap -c "$TARGET_DIR/classes/com/openosrs/client/ui/OpenOSRSSplashScreen.class" 2>/dev/null | grep -A 5 "authenticate" | head -20 || echo "  (could not analyze)"
else
    echo "✗ Compiled class not found in target/classes"
fi
echo ""

# 8. Check what error we get when running
echo "=== 8. Test run with verbose class loading ==="
echo "Run this command to see which classes are being loaded:"
echo ""
echo "java -verbose:class -cp \"$TARGET_DIR/squire-launcher-local.jar:$REPO_DIR/*:$LIB_DIR/squire-with-logging.jar\" squire.launcher.SquireLauncher 2>&1 | grep -i 'OpenOSRS\|authenticate' | head -20"
echo ""

# 9. Source file check
echo "=== 9. Source files we created ==="
echo "Checking source files exist:"
for f in \
    "src/main/java/com/openosrs/client/ui/OpenOSRSSplashScreen.java" \
    "src/main/java/net/runelite/launcher/AuthenticationPanel.java"; do
    if [ -f "$SCRIPT_DIR/$f" ]; then
        echo "✓ $f"
        echo "  First 5 lines:"
        head -5 "$SCRIPT_DIR/$f" | sed 's/^/    /'
    else
        echo "✗ $f NOT FOUND"
    fi
    echo ""
done

# 10. Show the actual error
echo "=== 10. What error are you seeing? ==="
echo "Please provide the exact error message you're getting."
echo "Common issues:"
echo "  - 'Invalid authentication key' = Our OpenOSRSSplashScreen isn't being loaded"
echo "  - ClassNotFoundException = Missing dependency"
echo "  - NoClassDefFoundError = Class found but dependency missing"
echo ""

echo "==========================================="
echo "DEBUG COMPLETE"
echo "==========================================="
