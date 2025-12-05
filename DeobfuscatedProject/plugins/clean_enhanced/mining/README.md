# Squire Miner Plugin - Deobfuscated

This directory contains the deobfuscated version of the Squire OSRS bot Miner plugin.

## Overview

The Squire Miner is an automated mining plugin that supports multiple mining activities:
- **Motherlode Mine** - Full MLM support with sack tracking, hopper deposits, and vein mining
- **Sandstone** - Quarry sandstone mining with grinder deposits
- **Gem Rocks** - Mining gem rocks in Shilo Village
- **Amethyst** - Mining and optionally crafting amethyst
- **Granite, Volcanic Ash, Essence, Daeyalt, Bone Shards** - Various other mining activities
- **Superheat Mine** - Mining with superheat spell automation

## Directory Structure

```
gg/squire/mining/
├── SquireMiner.java              # Main plugin class
├── SquireMinerConfig.java        # Configuration interface
├── MiningInfoBox.java            # Overlay panel
├── MiningActivity.java           # Activity enum
├── GemType.java                  # Gem crafting options enum
├── MotherlodeMineArea.java       # MLM area waypoints enum
├── GemRockArea.java              # Gem rock locations enum
├── MotherlodeMineTracker.java    # MLM state tracking
├── RockTracker.java              # Rock depletion tracking
└── tasks/
    ├── MotherlodeMineTask.java   # Abstract base task
    ├── WorldHopTask.java         # World hopping
    ├── MineOreTask.java          # Mining ore veins
    ├── RepairStrutsTask.java     # Repairing broken struts
    ├── WalkToHopperTask.java     # Walking to hopper
    ├── WalkToVeinsTask.java      # Walking to veins
    ├── DepositOresTask.java      # Depositing ores
    ├── WithdrawOresTask.java     # Withdrawing from sack
    ├── DepositIntoGrinderTask.java   # Sandstone grinder
    ├── MineSandstoneTask.java    # Mining sandstone
    ├── SuperheatBankTask.java    # Banking for superheat
    └── SuperheatMineTask.java    # Superheat mining
```

## Deobfuscation Process

### 1. String Decryption
The original code used three encryption methods:
- **DES encryption** with MD5 key derivation
- **Blowfish encryption** with MD5 key derivation  
- **XOR cipher** with Base64 encoding

All strings have been decrypted and replaced with clear text.

### 2. Bitwise Constant Deobfuscation
Complex bitwise operations like:
```java
(0xC3 ^ 0x8E) & ~(0x4D ^ 0)  // Original
0  // Decoded value
```

Have been evaluated and replaced with their actual values.

### 3. Variable and Method Renaming
- Obfuscated names like `lllllIlllIIl`, `Y`, `Z`, `X` renamed to meaningful names
- Methods like `t()`, `v()`, `w()` renamed to `validate()`, `getUpperHopper()`, etc.

### 4. Code Structure
- Proper package structure: `gg.squire.mining` and `gg.squire.mining.tasks`
- Added comprehensive Javadoc comments
- Cleaned up imports
- Removed dead code and debugging artifacts

## Key Features

### Motherlode Mine
- **Smart sack management** - Tracks pay-dirt count and sack capacity
- **Multi-floor support** - Upper floor and south-west area
- **Auto-repair** - Repairs broken struts automatically
- **Ore deposit** - Deposits into hopper when full
- **World hopping** - Optional hopping to avoid reports

### Resource Management
- **Waterskin tracking** - For desert mining activities
- **Humidify spell** - Auto-refills waterskins
- **Bank loadouts** - For superheat mining
- **Deposit box** - Quick ore deposits

### Rock Tracking
- **Depletion detection** - Avoids re-clicking depleted rocks
- **Animation tracking** - Monitors mining animations
- **Optimal pathing** - Walks to nearest available veins

## Configuration Options

See `SquireMinerConfig.java` for all configuration options including:
- Mining activity selection
- MLM area selection
- World hopping toggle
- Deposit preferences
- Waterskin counts
- Gem crafting options

## Important Item IDs

- **Pay-dirt variants**: 4484, 4485, 4495, 4497, 4499, 5012
- **Main pay-dirt**: 12011
- **Waterskin**: 1823
- **Hammer**: 2347 (for strut repairs)
- **Deposit box**: 25937
- **Hopper**: 26674

## MLM Constants

- **Mining animation**: 6758
- **Upper floor capacity**: 81 pay-dirt
- **South-west capacity**: 54 pay-dirt
- **Sack enabled varbit**: 5558
- **Sack count varbit**: 5556

## Reference Quality

This deobfuscation follows the quality standard demonstrated in:
`/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/autotoa/gg/squire/autotoa/SquireAutoTOA.java`

## Author Notes

- Original code was heavily obfuscated with encrypted strings and bitwise operations
- The deobfuscation preserves all functionality while improving readability
- Task priority system controls execution order
- Event-driven architecture for efficient state tracking

For class mappings and detailed deobfuscation notes, see `CLASS_MAPPINGS.json`.
