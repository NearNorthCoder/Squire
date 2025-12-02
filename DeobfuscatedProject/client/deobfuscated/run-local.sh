#!/bin/bash
# Run script for Squire Local Client
# This launches the deobfuscated client from local JAR files

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_DIR="$SCRIPT_DIR/../../repository2"
LAUNCHER_JAR="$SCRIPT_DIR/target/squire-launcher-local.jar"

echo "==================================================="
echo "Squire Local Client Launcher"
echo "==================================================="

# Check if launcher JAR exists
if [ ! -f "$LAUNCHER_JAR" ]; then
    echo "ERROR: Launcher JAR not found at: $LAUNCHER_JAR"
    echo "Please compile first:"
    echo "  ./build.sh"
    exit 1
fi

# Check if repository exists
if [ ! -d "$REPO_DIR" ]; then
    echo "ERROR: Repository not found at: $REPO_DIR"
    echo "Please run: ./setup-local-repo.sh"
    exit 1
fi

# Build classpath with all required dependencies
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

echo "Using repository: $REPO_DIR"
echo "Launcher JAR: $LAUNCHER_JAR"
echo ""

# Check Java version
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

echo "Starting client..."
echo "==================================================="

# Run the launcher with local repository
java $JVM_ARGS -cp "$CLASSPATH" squire.launcher.SquireLauncher --local-repo "$REPO_DIR" "$@"
