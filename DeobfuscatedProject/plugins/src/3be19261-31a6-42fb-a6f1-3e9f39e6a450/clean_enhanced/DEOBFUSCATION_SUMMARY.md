# Blue Dragon Killer Plugin - Deobfuscation Summary

## Overview
Successfully deobfuscated the Blue Dragon Killer plugin (UUID: 3be19261-31a6-42fb-a6f1-3e9f39e6a450).
All 15 Java files have been processed, cleaned, and documented.

## Total Files Processed: 15

### Files Already Clean: 3
1. **SquireBlueDragonKiller.java** - Partially clean, but had obfuscated variables and encrypted strings
2. **SquireBlueDragonKillerConfig.java** - Mostly clean, referenced obfuscated classes
3. **InfoBox.java** - Clean structure but had encrypted strings

### Files That Needed Full Deobfuscation: 12
All files in the obfuscated package `k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.*`

## Deobfuscated File Mappings

### Core Classes

| Original File | Deobfuscated Name | Purpose |
|--------------|-------------------|----------|
| a.java | DragonCombatManager.java | Manages dragon combat, finding targets, and attacking |
| b.java | DragonLocation.java | Enum defining dragon spawn locations |
| c.java | AttackStyle.java | Enum for combat styles (Melee/Magic/Range) |
| d.java | LootTarget.java | Data class for tracking loot items |

### Task Classes

| Original File | Deobfuscated Name | Purpose |
|--------------|-------------------|----------|
| e.java | StartingTask.java | Initialization task, validates config |
| f.java | BankItemsTask.java | Handles banking operations |
| g.java | AttackDragonTask.java | Main combat task for attacking dragons |
| h.java | EatFoodTask.java | Manages eating food when low HP |
| i.java | FlickPrayerTask.java | Handles prayer flicking for efficiency |
| j.java | LootItemsTask.java | Picks up dragon drops from ground |
| k.java | WalkToBankTask.java | Navigation to bank location |
| l.java | WalkToDragonsTask.java | Navigation to dragon location |

### Other Files

| Original File | Deobfuscated Name | Purpose |
|--------------|-------------------|----------|
| SquireBlueDragonKiller.java | SquireBlueDragonKiller.java | Main plugin class (cleaned) |
| SquireBlueDragonKillerConfig.java | SquireBlueDragonKillerConfig.java | Configuration interface (cleaned) |
| InfoBox.java | PluginInfoBox.java | Stats overlay panel (cleaned) |

## Key Classes and Their Purposes

### 1. SquireBlueDragonKiller.java (Main Plugin)
- **Purpose**: Core plugin that coordinates all tasks
- **Key Features**:
  - Tracks loot statistics (bones, hides, scales, ensouled heads)
  - Manages plugin state (banking, started)
  - Handles item spawns and inventory changes
  - Validates supplies and stops when needed
  - Item IDs decrypted: 536 (bones), 1751 (hide), 243 (scales), 13511 (ensouled)

### 2. DragonCombatManager.java
- **Purpose**: Handles all combat-related operations
- **Key Methods**:
  - `isInDragonArea()` - Checks if player is in dragon area
  - `getNearestDragon()` - Finds attackable blue dragons
  - `attack()` - Attacks dragons or retaliating NPCs
  - `isBeingAttacked()` - Detects if player is under attack

### 3. DragonLocation.java (Enum)
- **Locations**:
  1. **HEROS** - Heroes' Guild (1910, 9954, 0)
  2. **TAVERLEY_DUNGEON** - Taverley Dungeon (2911, 9775, 0)
  3. **MYTHS_GUILD** - Myths' Guild (1951, 9015, 1)
- Each location includes safe spot coordinates and dragon spawn areas

### 4. AttackStyle.java (Enum)
- **Values**: MELEE, MAGIC, RANGE
- Used to determine prayer types and combat behavior

### 5. LootTarget.java
- **Purpose**: Tracks items to be looted
- **Fields**: location (WorldPoint), itemId (int)
- Includes proper equals/hashCode implementation

### 6. Task Classes
All task classes extend the framework's `Task` class and have specific priorities:
- **StartingTask** - Validates configuration
- **EatFoodTask** (Priority 130) - Highest priority for survival
- **FlickPrayerTask** (Priority 15) - High priority for efficiency
- **LootItemsTask** (Priority 10, blocking) - Prevents other tasks during looting
- **AttackDragonTask** (Priority 5) - Main combat loop
- **BankItemsTask** - Handles withdrawing items from bank
- **WalkToBankTask** - Navigation to bank
- **WalkToDragonsTask** - Navigation to dragons

## Decrypted Strings

### Obfuscation Methods Found
1. **Blowfish Encryption** - Used for most strings
2. **DES Encryption** - Used for some location names
3. **XOR Obfuscation** - Used for simple string encoding
4. **Integer Obfuscation** - Bitwise operations hiding numeric constants

### Key Decrypted Values
- **Actions**: "Attack", "Eat", "Take", "Drop", "Break", "Drink"
- **NPC Names**: "Blue dragon", "Pickaxe"
- **Locations**: "Heroes' Guild Blue Dragons", "Taverley Dungeon Blue Dragons", "Myths Guild Blue Dragons"
- **UI Labels**: "Runtime:", "Status:", "Task:", "Bones:", "Blue Dragonhides:", "Blue Dragon Scales:", "Ensouled Dragon Heads:"
- **Messages**: "You have run out of", "No bank loadout configured for Blue Dragon Killer!", "Out of ammunition, returning to bank"

## Directory Structure

```
clean_enhanced/
└── gg/
    └── squire/
        └── combat/
            ├── AttackStyle.java
            ├── DragonCombatManager.java
            ├── DragonLocation.java
            ├── LootTarget.java
            ├── SquireBlueDragonKiller.java
            ├── SquireBlueDragonKillerConfig.java
            ├── overlays/
            │   └── PluginInfoBox.java
            └── tasks/
                ├── AttackDragonTask.java
                ├── BankItemsTask.java
                ├── EatFoodTask.java
                ├── FlickPrayerTask.java
                ├── LootItemsTask.java
                ├── StartingTask.java
                ├── WalkToBankTask.java
                └── WalkToDragonsTask.java
```

## Issues Encountered

### None - Deobfuscation Successful
All files were successfully deobfuscated without major issues. The code was well-structured after deobfuscation, and all encryption patterns were successfully decoded.

## Code Quality Improvements

1. **Removed all obfuscated variable names** - Replaced with meaningful names
2. **Removed all synthetic modifiers** - Cleaned up decompilation artifacts
3. **Added comprehensive Javadoc** - Every class and public method documented
4. **Removed encryption logic** - Replaced with plain strings
5. **Simplified control flow** - Removed unnecessary obfuscation patterns
6. **Improved readability** - Proper formatting and naming conventions
7. **Removed dead code** - Eliminated unused helper methods for obfuscation

## Plugin Functionality Summary

The Blue Dragon Killer plugin automates the following workflow:

1. **Initialization** - Validates bank loadout configuration
2. **Travel** - Walks to configured dragon location
3. **Combat** - Attacks blue dragons using selected combat style
4. **Prayer** - Flicks combat prayers for efficiency (if enabled)
5. **Health** - Eats food when health drops below threshold
6. **Looting** - Picks up configured dragon drops (bones, hides, scales, ensouled heads)
7. **Banking** - Returns to bank when inventory full or out of supplies
8. **Repeat** - Cycles back to dragon location

### Configuration Options
- **Attack Style**: Melee, Magic, or Range
- **Dragon Location**: Heroes' Guild, Taverley Dungeon, or Myths' Guild
- **Bank Location**: Multiple bank locations supported
- **Loot Settings**: Toggle bones, hides, scales, and ensouled heads
- **Prayer Flicking**: Enable/disable prayer flicking
- **Eat Threshold**: Health percentage to eat at
- **Bank Loadout**: Gear and supplies configuration

## Statistics Tracking

The plugin tracks and displays:
- Runtime duration
- Current task being executed
- Bones looted (with per-hour rate)
- Dragon hides looted (with per-hour rate)
- Dragon scales looted (with per-hour rate)
- Ensouled dragon heads looted (with per-hour rate)

All statistics are displayed in a bottom-left overlay panel.

## Conclusion

All 15 files have been successfully deobfuscated and enhanced with:
- Clear, meaningful names
- Comprehensive documentation
- Proper package structure
- Removed encryption and obfuscation
- Clean, readable code

The plugin is now fully readable and maintainable.
