# Squire Deobfuscated

Decompiled and deobfuscated Squire plugins and analysis tools.

## Overview

This repository contains:
- **68 deobfuscated Squire plugins** with human-readable names
- **Local launcher** for running plugins without authentication
- **Analysis tools** for string decryption and code analysis
- **Documentation** of the obfuscation techniques used

## Directory Structure

```
squire-deobfuscated/
├── README.md                 # This file
├── plugins/                  # Deobfuscated plugin source code
│   ├── vorkath/              # Boss plugins
│   ├── zulrah/
│   ├── chambers_of_xeric/    # Raid plugins
│   ├── barrows/              # Minigame plugins
│   ├── agility/              # Skilling plugins
│   ├── basics/               # Utility plugins (40+ sub-plugins)
│   └── ...
├── launcher/                 # Local launcher package
│   ├── LocalLauncher.java    # Auth bypass launcher
│   ├── build.sh              # Build script (Linux/Mac)
│   ├── build.bat             # Build script (Windows)
│   └── ...
├── tools/                    # Analysis scripts
│   ├── extract_decrypt_strings.py   # String decryption
│   ├── deobfuscate.py               # Full deobfuscator
│   └── reorganize_plugins.py        # Plugin renaming
├── docs/                     # Documentation
│   ├── PLUGIN_MAPPING.md     # Plugin name mappings
│   ├── AUTH_BYPASS.md        # Authentication analysis
│   └── ENCRYPTION.md         # String encryption methods
├── data/                     # Generated data
│   ├── string_mapping.json   # 43,000+ decrypted strings
│   └── plugins.json          # Plugin manifest
└── dist/                     # Pre-built JARs
    └── squire-local.jar      # Ready-to-run launcher
```

## Quick Start

### Running Locally

```bash
# 1. Place original plugin JARs in plugins_jars/
# 2. Build the local launcher
cd launcher
./build.sh

# 3. Run with local plugins
java -jar ../dist/squire-local.jar --plugins-dir ../plugins_jars
```

### Viewing Deobfuscated Source

Browse the `plugins/` directory for readable source code:
- Each plugin is in its own named directory
- `gg/squire/` packages contain named classes
- `obfuscated/` contains single-letter class names (flattened)

## Plugin Categories

### Bosses (12 plugins)
- Vorkath, Zulrah, Hydra, Corporeal Beast
- Bandos, Saradomin, Zammy (GWD)
- Duke Sucellus, Vardorvis, Whisperer (DT2)
- Scurrius, Shamans

### Raids (3 plugins)
- Chambers of Xeric, Auto TOA, TOA

### Minigames (11 plugins)
- Barrows, Fight Caves, Hallowed Sepulchre
- Gauntlet, Giants Foundry, Mixology
- Moons of Peril, Nightmare Zone, Pest Control
- Sorceress Garden, Wintertodt

### Skilling (10 plugins)
- Agility, Blast Furnace, Farmer, Herblore
- Hunter, Miner, Tithe Farm, Woodcutter
- Aerial Fisher, Herbiboar

### Account Builders (8 plugins)
- Easy Clue, Barrows, GWD, Rogues Outfit
- Shaman, SOTF, Temple Trek, Rat King

### Utility (4+ plugins)
- Basics (40+ sub-plugins inside)
- Leagues, Charter Ships, Tempoross

## Obfuscation Techniques Found

1. **String Encryption**: XOR, Blowfish/ECB, DES/ECB with MD5-derived keys
2. **Package Obfuscation**: Single-letter directory names (a/b/c/...)
3. **Class Naming**: l/I combinations (llIIllIl, etc.)
4. **Dead Code**: Always-false conditionals, empty string .length()
5. **Expression Obfuscation**: `" ".length()` = 1

## Decryption Statistics

- **Total strings found**: 43,469
- **Successfully decrypted**: 43,283 (99.6%)
- **Encryption methods used**:
  - XOR with unique 5-char keys: ~32,000 strings
  - Blowfish/ECB: ~10,000 strings
  - DES/ECB: ~1,000 strings

## Legal Notice

This repository is for **educational and security research purposes only**.

- Code is decompiled from publicly available JAR files
- No authentication tokens or user data included
- Plugins require valid game sessions to function
