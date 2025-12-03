#!/bin/bash
# Compile SOTF and Auto TOA plugins with all dependencies
cd /home/user/Squire/DeobfuscatedProject

# Build classpath from all JARs
CP=""
for jar in repository2/*.jar client/deobfuscated/lib/*.jar; do
    if [ -f "$jar" ]; then
        if [ -z "$CP" ]; then
            CP="$jar"
        else
            CP="$CP:$jar"
        fi
    fi
done

echo "Classpath has $(echo "$CP" | tr ':' '\n' | wc -l) JARs"

# Create output directory
rm -rf /tmp/plugin_compile
mkdir -p /tmp/plugin_compile

# Define source paths - need all inter-dependent plugins
SOTF_SRC="plugins/clean_enhanced/sotf"
AUTOTOA_SRC="plugins/clean_enhanced/autotoa"
ACCBUILDER_SRC="plugins/clean_enhanced/7c1d3521_d222_494e_8c51_697efca0674b"

echo ""
echo "=== Compiling SOTF + AccBuilder plugins together ==="

# Find all Java files in all three directories
find "$SOTF_SRC" "$ACCBUILDER_SRC" -name "*.java" > /tmp/plugin_sources.txt
SRCCOUNT=$(wc -l < /tmp/plugin_sources.txt)
echo "Found $SRCCOUNT Java source files"

# Compile all together
javac -proc:none -cp "$CP" -d /tmp/plugin_compile \
    -sourcepath "$SOTF_SRC:$ACCBUILDER_SRC" \
    @/tmp/plugin_sources.txt 2>&1

if [ $? -eq 0 ]; then
    echo "✓ SOTF + AccBuilder compilation successful!"
else
    echo "✗ SOTF compilation has errors"
fi

echo ""
echo "=== Compiling Auto TOA plugin ==="
find "$AUTOTOA_SRC" -name "*.java" > /tmp/autotoa_sources.txt
SRCCOUNT=$(wc -l < /tmp/autotoa_sources.txt)
echo "Found $SRCCOUNT Java source files"

javac -proc:none -cp "$CP:/tmp/plugin_compile" -d /tmp/plugin_compile \
    -sourcepath "$AUTOTOA_SRC" \
    @/tmp/autotoa_sources.txt 2>&1

if [ $? -eq 0 ]; then
    echo "✓ Auto TOA compilation successful!"
else
    echo "✗ Auto TOA compilation has errors"
fi

echo ""
echo "=== Compilation Summary ==="
echo "Compiled classes: $(find /tmp/plugin_compile -name "*.class" | wc -l)"
