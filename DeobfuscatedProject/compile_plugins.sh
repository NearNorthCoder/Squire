#!/bin/bash
# Compile SOTF and Auto TOA plugins
cd /home/user/Squire/DeobfuscatedProject

# Build classpath
CP=""
for jar in repository2/*.jar; do
    if [ -f "$jar" ]; then
        if [ -z "$CP" ]; then
            CP="$jar"
        else
            CP="$CP:$jar"
        fi
    fi
done

for jar in client/deobfuscated/lib/*.jar; do
    if [ -f "$jar" ]; then
        CP="$CP:$jar"
    fi
done

echo "Classpath has $(echo "$CP" | tr ':' '\n' | wc -l) JARs"

# Create output directory
mkdir -p /tmp/test_compile

# Compile SOTF framework first
echo "=== Compiling SOTF framework ==="
javac -proc:none -cp "$CP" -d /tmp/test_compile \
    -sourcepath plugins/clean_enhanced/sotf \
    plugins/clean_enhanced/sotf/framework/*.java 2>&1

# Compile SOTF steps
echo "=== Compiling SOTF steps ==="
javac -proc:none -cp "$CP:/tmp/test_compile" -d /tmp/test_compile \
    -sourcepath plugins/clean_enhanced/sotf \
    plugins/clean_enhanced/sotf/steps/TempleTrekkingQuestStep.java 2>&1 | head -50

# Compile Auto TOA
echo "=== Compiling Auto TOA tasks ==="
javac -proc:none -cp "$CP:/tmp/test_compile" -d /tmp/test_compile \
    -sourcepath plugins/clean_enhanced/autotoa \
    plugins/clean_enhanced/autotoa/tasks/TOATaskBase.java 2>&1 | head -50

echo "=== Done ==="
