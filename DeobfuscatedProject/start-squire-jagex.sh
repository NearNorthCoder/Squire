#!/bin/bash
# Squire Local Launcher with Jagex Account Support
# This script launches the deobfuscated Squire client with bypassed authentication
# and supports Jagex account import/selection

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_DIR="$SCRIPT_DIR/repository2"
LAUNCHER_JAR="$SCRIPT_DIR/client/deobfuscated/target/squire-launcher-local.jar"
LIB_DIR="$SCRIPT_DIR/client/deobfuscated/lib"
SQUIRE_HOME="$HOME/.squire"

echo "============================================================"
echo "      SQUIRE LOCAL LAUNCHER - JAGEX ACCOUNT SUPPORT"
echo "============================================================"
echo ""

# Ensure squire home exists
mkdir -p "$SQUIRE_HOME/logs"

# Link repository if needed
if [ ! -e "$SQUIRE_HOME/repository2" ]; then
    ln -sf "$REPO_DIR" "$SQUIRE_HOME/repository2"
    echo "Linked repository2 to $SQUIRE_HOME/repository2"
fi

# Check dependencies
if [ ! -f "$LAUNCHER_JAR" ]; then
    echo "ERROR: Launcher JAR not found: $LAUNCHER_JAR"
    echo "Please run: cd client/deobfuscated && ./build.sh"
    exit 1
fi

if [ ! -f "$LIB_DIR/squire-with-logging.jar" ]; then
    echo "ERROR: squire-with-logging.jar not found in lib/"
    exit 1
fi

if [ ! -d "$REPO_DIR" ]; then
    echo "ERROR: Repository not found: $REPO_DIR"
    exit 1
fi

# Build classpath
CLASSPATH="$LAUNCHER_JAR"
CLASSPATH="$CLASSPATH:$REPO_DIR/slf4j-api-1.7.32.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/logback-classic-1.2.9.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/logback-core-1.2.9.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/guava-30.1.1-jre.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/okhttp-4.10.0.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/gson-2.8.5.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/okio-jvm-3.0.0.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/kotlin-stdlib-1.6.21.jar"
CLASSPATH="$CLASSPATH:$REPO_DIR/kotlin-stdlib-common-1.6.21.jar"
# Include original Squire launcher for AccountImporter
CLASSPATH="$CLASSPATH:$LIB_DIR/squire-with-logging.jar"

# Java version check
JAVA_VERSION=$(java -version 2>&1 | head -1 | cut -d'"' -f2 | cut -d'.' -f1)
echo "Java version: $JAVA_VERSION"

# JVM arguments for Java 17+
if [ "$JAVA_VERSION" -ge 17 ]; then
    JVM_ARGS="--add-opens=java.base/java.lang=ALL-UNNAMED"
    JVM_ARGS="$JVM_ARGS --add-opens=java.base/java.lang.reflect=ALL-UNNAMED"
    JVM_ARGS="$JVM_ARGS --add-opens=java.base/java.util=ALL-UNNAMED"
    JVM_ARGS="$JVM_ARGS --add-opens=java.base/java.net=ALL-UNNAMED"
    JVM_ARGS="$JVM_ARGS --add-opens=java.base/java.io=ALL-UNNAMED"
    JVM_ARGS="$JVM_ARGS --add-opens=java.desktop/java.awt=ALL-UNNAMED"
    JVM_ARGS="$JVM_ARGS --add-opens=java.desktop/sun.awt=ALL-UNNAMED"
else
    JVM_ARGS=""
fi

# Additional JVM settings (matching original batch file)
JVM_ARGS="$JVM_ARGS -Xmx4G -Xss2m -XX:CompileThreshold=1500"
JVM_ARGS="$JVM_ARGS -Drunelite.insecure-skip-tls-verification=true"
JVM_ARGS="$JVM_ARGS -Drunelite.launcher.nojvm=true"

# Show help
show_help() {
    echo "Usage: $0 [OPTION]"
    echo ""
    echo "Options:"
    echo "  --import-accounts     Import Jagex accounts via OAuth2 browser flow"
    echo "  --list-accounts       List all saved Jagex accounts"
    echo "  --jagexlauncher       Show account selection dialog then launch"
    echo "  --account <name>      Launch with specific account"
    echo "  --help                Show this help message"
    echo ""
    echo "Examples:"
    echo "  $0 --import-accounts       # Import accounts first"
    echo "  $0 --list-accounts         # See what accounts you have"
    echo "  $0 --jagexlauncher         # Select account and launch"
    echo "  $0 --account MyPlayer      # Launch directly with account"
    echo ""
    echo "Account data stored in: $SQUIRE_HOME/launcher.dat"
    echo ""
}

# Parse arguments
if [ "$1" = "--help" ] || [ "$1" = "-h" ]; then
    show_help
    exit 0
fi

echo ""
echo "Squire Home: $SQUIRE_HOME"
echo "Repository:  $REPO_DIR"
echo "Launcher:    $LAUNCHER_JAR"
echo ""

# Check for existing accounts
if [ -f "$SQUIRE_HOME/launcher.dat" ]; then
    ACCOUNT_COUNT=$(wc -l < "$SQUIRE_HOME/launcher.dat" 2>/dev/null || echo "0")
    echo "Saved accounts: $ACCOUNT_COUNT"
else
    echo "No saved accounts found. Use --import-accounts to add some."
fi

echo ""
echo "============================================================"
echo "Starting Squire Launcher..."
echo "============================================================"
echo ""

# Run the launcher
java $JVM_ARGS -cp "$CLASSPATH" squire.launcher.SquireLauncher --local-repo "$REPO_DIR" "$@"
