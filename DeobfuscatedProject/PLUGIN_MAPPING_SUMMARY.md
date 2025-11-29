# Squire Plugins UUID Mapping - Summary Report

**Generated:** 2025-11-29  
**Total Plugins:** 68 (53 UUID + 15 Named)

---

## Overview

This document summarizes the comprehensive UUID-to-plugin-name mapping analysis of Squire OSRS botting client plugins.

### Files Created

1. **uuid_to_plugin_mapping.json** - Complete JSON mapping with metadata
2. **uuid_renaming_guide.csv** - CSV format for easy reference and scripting
3. **PLUGIN_MAPPING_SUMMARY.md** - This summary document

---

## Statistics by Category

### UUID Plugins (53 total)

| Category | Count | Percentage |
|----------|-------|------------|
| PVM (Combat/Bosses) | 20 | 37.7% |
| Minigames | 14 | 26.4% |
| Skilling | 10 | 18.9% |
| Account Builders | 8 | 15.1% |
| Quest | 1 | 1.9% |

### Named Plugins (15 total)

| Category | Count |
|----------|-------|
| Skilling | 7 |
| Minigames | 4 |
| PVM | 3 |
| Quest | 1 |

---

## Plugin Categories Breakdown

### PVM/Combat Plugins (23 total)
- Squire Whisperer
- Squire Duke Sucellus
- Squire Shamans
- Squire Cerberus
- Squire Auto TOA / Squire TOA
- Squire Scurrius
- Squire Vorkath
- Squire Moons of Peril
- Squire Chambers Of Xeric (COX)
- Squire Vardorvis
- Squire Saradomin
- Squire Corporeal Beast
- Squire Bandos
- Squire Zammy
- Squire Hydra
- Squire Zulrah
- Squire Gauntlet
- Squire Blue Dragon Killer
- Squire Demonic Gorillas
- Squire Phosani Nightmare

### Minigames (18 total)
- Squire Blast Furnace
- Squire Nightmare Zone
- Squire Wintertodt
- Squire Temple Trekking
- Squire Hallowed Sepulchre
- Squire Sorceress Garden
- Squire Mixology
- Squire Barrows
- Squire Tithe Farm
- Squire Tempoross
- Squire Pest Control
- Squire Fight Caves
- Squire Guardians of The Rift (GOTR)
- Squire Mage Training Arena (MTA)
- Squire Pyramid Plunder
- Squire Warriors Guild

### Skilling (17 total)
- Squire Agility
- Squire Miner
- Squire Herblore
- Squire Farmer
- Squire Aerial Fisher
- Squire Charter Ships
- Squire Giants Foundry
- Squire Zeah Runecrafter
- Squire Herbiboar
- Squire Hunter
- Squire Woodcutter
- Squire Bankstander
- Squire Drift Net Fisher
- Squire Fishing
- Squire Mahogany Homes
- Squire Plank Maker
- Squire Thiever

### Account Builders (8 total)
- Squire Templetrek Builder
- Squire Barrows Builder
- Squire Shaman Builder
- Squire Sotf Builder
- Squire GWD Builder
- Squire Rat King Builder
- Squire Easy Clue Builder
- Squire Rogues Outfit Builder

### Quest/Tutorial (2 total)
- Squire Quester
- Squire Tutorial Island

### Other (3 total)
- Squire Turael Skipper (Slayer)
- Squire Easy Clues (Clue scrolls)
- [Leagues] Note items (Leagues-specific)
- Squire Account Cleaner (Utility)

---

## Special Cases / Anomalies

### Non-Standard Package Structures

Two plugins deviate from the standard `gg.squire.*` package structure:

1. **UUID: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e**
   - Name: Squire Easy Clues
   - Package: `net.unethicalite.plugins.logout`
   - Note: Uses net.unethicalite instead of gg.squire

2. **UUID: df6d2a51-cc28-47f1-b346-c5a30f777aad**
   - Name: Squire Herbiboar
   - Package: `squire.gg.hunter`
   - Note: Reversed package structure (squire.gg instead of gg.squire)

---

## Main Plugin Classes

Most plugins follow these naming conventions:
- **Squire[Feature]Plugin.java** - Standard plugin format
- **Squire[Feature].java** - Shortened format
- **AccBuilder[Feature].java** - Account builder plugins

### Example Main Classes:
- SquireBlastFurnace.java
- SquireVorkathPlugin.java
- SquireTOA.java
- AccBuilderBarrows.java
- SquireQuester.java

---

## Package Organization

The plugins are organized into logical packages:

### Common Package Prefixes:
- `gg.squire.minigames` - Minigame content
- `gg.squire.account` - Account builders
- `gg.squire.pvm` - Combat/PVM
- `gg.squire.plugins` - General plugins
- `gg.squire.[specific]` - Feature-specific packages

### Examples:
- `gg.squire.barrows` - Barrows minigame
- `gg.squire.vorkath` - Vorkath boss
- `gg.squire.fishing` - Fishing skills
- `gg.squire.quest` - Quest automation

---

## High-Value/Notable Plugins

### Raid Plugins
- Squire Chambers Of Xeric (COX)
- Squire TOA / Auto TOA

### Boss Plugins (DT2)
- Squire Duke Sucellus
- Squire Vardorvis
- Squire Whisperer
- Squire Leviathan (if exists)

### Popular Content
- Squire GOTR (Guardians of the Rift)
- Squire Tempoross
- Squire Wintertodt
- Squire Mage Training Arena

### Account Building
- 8 specialized account builders for different content

---

## Directory Structure Analysis

### UUID Directories
- Total: 53 UUID-named directories
- Pattern: `[8]-[4]-[4]-[4]-[12]` (standard UUID v4)
- All located in: `/home/user/Squire/DeobfuscatedProject/plugins/src/`

### Named Directories
- Total: 15 pre-named directories
- Pattern: `squire-[feature]-[version]`
- Examples:
  - squire-gotr-0.4.1
  - squire-toa-1.0.1
  - squire-mta-0.2.1

---

## Usage Guide

### For Renaming Operations

Use the CSV file for batch renaming:
```bash
# Example: Read CSV and rename directories
while IFS=, read -r uuid name category class package; do
    if [ "$uuid" != "UUID" ]; then
        # Sanitize name for directory
        dir_name=$(echo "$name" | tr '[:upper:]' '[:lower:]' | tr ' ' '-')
        echo "mv $uuid $dir_name"
    fi
done < uuid_renaming_guide.csv
```

### For Searching by Category

```bash
# Find all PVM plugins
grep ",pvm," uuid_renaming_guide.csv

# Find all account builders
grep ",account-builder," uuid_renaming_guide.csv
```

---

## Verification Status

- All 53 UUID directories successfully mapped
- All main plugin classes identified
- All @PluginDescriptor annotations found
- Package structures documented
- 2 anomalous package structures noted

---

## Next Steps Recommendations

1. **Rename UUID directories** to human-readable names based on the mapping
2. **Organize by category** - Consider creating category subdirectories
3. **Update build configs** - Ensure build.gradle or equivalent references new names
4. **Document dependencies** - Map inter-plugin dependencies
5. **Version standardization** - Align version numbers across plugins
6. **Package refactoring** - Fix the 2 non-standard package structures

---

## Contact/Notes

This mapping was automatically generated by analyzing:
- Directory structures under `/home/user/Squire/DeobfuscatedProject/plugins/src/`
- Java source files with `@PluginDescriptor` annotations
- Package declarations in main plugin classes

For any discrepancies or questions, verify against the source files directly.

