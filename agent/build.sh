#!/bin/bash
#
# Build the Squire Cipher Capture Agent
#
# This script builds the agent JAR that intercepts all decryption at runtime.
#

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$SCRIPT_DIR"

echo "=============================================="
echo "  BUILDING SQUIRE CIPHER AGENT"
echo "=============================================="

# Check for Gradle
if command -v gradle &> /dev/null; then
    echo "[*] Building with Gradle..."
    gradle shadowJar
    cp build/libs/squire-cipher-agent.jar .
    echo "[OK] Built: squire-cipher-agent.jar"
else
    echo "[!] Gradle not found. Attempting manual build..."

    # Download ByteBuddy if not present
    BYTEBUDDY_VERSION="1.14.11"
    BYTEBUDDY_JAR="byte-buddy-${BYTEBUDDY_VERSION}.jar"
    BYTEBUDDY_AGENT_JAR="byte-buddy-agent-${BYTEBUDDY_VERSION}.jar"

    mkdir -p lib

    if [ ! -f "lib/${BYTEBUDDY_JAR}" ]; then
        echo "[*] Downloading ByteBuddy..."
        curl -L -o "lib/${BYTEBUDDY_JAR}" \
            "https://repo1.maven.org/maven2/net/bytebuddy/byte-buddy/${BYTEBUDDY_VERSION}/byte-buddy-${BYTEBUDDY_VERSION}.jar"
    fi

    if [ ! -f "lib/${BYTEBUDDY_AGENT_JAR}" ]; then
        echo "[*] Downloading ByteBuddy Agent..."
        curl -L -o "lib/${BYTEBUDDY_AGENT_JAR}" \
            "https://repo1.maven.org/maven2/net/bytebuddy/byte-buddy-agent/${BYTEBUDDY_VERSION}/byte-buddy-agent-${BYTEBUDDY_VERSION}.jar"
    fi

    # Compile
    echo "[*] Compiling..."
    mkdir -p build/classes
    javac -d build/classes \
          -cp "lib/${BYTEBUDDY_JAR}:lib/${BYTEBUDDY_AGENT_JAR}" \
          src/main/java/com/squire/agent/*.java

    # Create manifest
    echo "[*] Creating manifest..."
    cat > build/MANIFEST.MF << 'EOF'
Manifest-Version: 1.0
Premain-Class: com.squire.agent.SquireCipherAgent
Agent-Class: com.squire.agent.SquireCipherAgent
Can-Redefine-Classes: true
Can-Retransform-Classes: true
EOF

    # Package JAR with dependencies
    echo "[*] Packaging JAR..."
    mkdir -p build/staging
    cd build/staging
    cp -r ../classes/* .
    unzip -q "../../lib/${BYTEBUDDY_JAR}"
    unzip -q -o "../../lib/${BYTEBUDDY_AGENT_JAR}"
    rm -rf META-INF/MANIFEST.MF META-INF/*.SF META-INF/*.RSA META-INF/*.DSA 2>/dev/null || true
    cd ../..
    jar cfm squire-cipher-agent.jar build/MANIFEST.MF -C build/staging .

    echo "[OK] Built: squire-cipher-agent.jar"
fi

echo ""
echo "=============================================="
echo "  BUILD COMPLETE"
echo "=============================================="
echo ""
echo "Usage:"
echo "  java -javaagent:squire-cipher-agent.jar -jar squire-launcher.jar"
echo ""
echo "Output will be saved to: ~/.squire/captured/"
echo ""
