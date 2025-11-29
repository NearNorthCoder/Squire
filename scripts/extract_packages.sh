#!/bin/bash
# Extract specific packages from Squire JARs
# Usage: ./extract_packages.sh <jar_url> [more_urls...]

set -e

OUTPUT_DIR="./squire_extracted"
TEMP_DIR="./temp_jars"

mkdir -p "$OUTPUT_DIR" "$TEMP_DIR"

# Packages to extract
PACKAGES=(
    "gg/squire"
    "net/unethicalite"
    "com/openosrs"
)

download_and_extract() {
    local url="$1"
    local filename=$(echo "$url" | grep -oP '[a-f0-9-]{36}\.jar|squire-[^?]+\.jar' | head -1)

    if [ -z "$filename" ]; then
        filename="download_$RANDOM.jar"
    fi

    echo "Downloading $filename..."
    curl -sL -o "$TEMP_DIR/$filename" "$url"

    echo "Extracting packages from $filename..."
    cd "$TEMP_DIR"

    for pkg in "${PACKAGES[@]}"; do
        # Check if package exists in JAR
        if unzip -l "$filename" 2>/dev/null | grep -q "^.*$pkg/"; then
            echo "  Found: $pkg"
            unzip -o -q "$filename" "$pkg/*" -d "../$OUTPUT_DIR" 2>/dev/null || true
        fi
    done

    cd ..
    echo "Done with $filename"
    echo ""
}

# If URLs provided as arguments
if [ $# -gt 0 ]; then
    for url in "$@"; do
        download_and_extract "$url"
    done
else
    echo "Usage: ./extract_packages.sh <url1> [url2] [url3] ..."
    echo ""
    echo "Or paste URLs below (one per line, Ctrl+D when done):"
    while IFS= read -r url; do
        if [ -n "$url" ]; then
            download_and_extract "$url"
        fi
    done
fi

echo ""
echo "=== Extraction Complete ==="
echo "Output: $OUTPUT_DIR/"
echo ""
echo "Structure:"
find "$OUTPUT_DIR" -type d -maxdepth 3 | head -30

# Cleanup
rm -rf "$TEMP_DIR"
