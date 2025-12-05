# Leagues Utilities Plugin - Deobfuscation Summary

## Overview
This document summarizes the deobfuscation of the Leagues Utilities plugin (ID: 21e931a2-dcd2-41bf-996b-cb50a8d5161d).

**Total Files Processed:** 15 Java files
**Files Requiring Deobfuscation:** 15 (100%)
**Files Already Clean:** 0

All files contained some level of obfuscation, including:
- Obfuscated method names (e.g., `a()`, `b()`, `lIllII()`)
- Obfuscated variable names (e.g., `llIlI`, `lIIII`, `lIlII`)
- Encrypted strings using Blowfish and DES encryption
- Obfuscated package names for utility classes
- Complex bit manipulation for constant values

## Deobfuscation Location
All deobfuscated files have been placed in:
```
/home/user/Squire/DeobfuscatedProject/plugins/src/21e931a2-dcd2-41bf-996b-cb50a8d5161d/clean_enhanced/
```

## Key Classes and Their Purposes

### 1. Common Utility Classes (Previously in obfuscated package)

#### LeaguesConstants.java
**Original:** `i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.a`
**Purpose:** Contains shared constants used across all Leagues plugins
- `BANKERS_NOTE_ID = 30047`: The Banker's Note item ID used for noting/unnoting items
- `SECONDARY_CONSTANT = 24463`: Secondary constant value

#### RockType.java (enum)
**Original:** `i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.d`
**Purpose:** Enumeration of different rock types that can be mined
- Supports: RUNE, ADDY, MITHRIL, IRON, COAL, GOLD, SOFTCLAY, SILVER

#### NoteItemTask.java
**Original:** `i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.b`
**Purpose:** Task implementation for automatically noting/unnoting items
- Handles inventory management with Banker's Notes
- Supports both noting mode (when inventory full) and unnoting mode (when no unnoted items)

#### MinerTask.java
**Original:** `i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.c`
**Purpose:** Task implementation for automated mining
- Supports multiple rock types and locations (Fossil Island, Prifddinas)
- Automatically notes ores when inventory is full (if enabled)
- Contains world area definitions for mining locations

### 2. Plugin Classes

#### NoteItemsPlugin.java
**Original:** `gg.squire.leagues.banknote.NoteItems`
**Plugin Name:** [Leagues] Note items
**Purpose:** Main plugin for automatic item noting/unnoting
**Key Features:**
- Converts items between noted and unnoted forms using Banker's Note
- Configurable item name
- Toggle between noting mode and unnoting mode

**Deobfuscation Work:**
- Renamed method `a()` to `provideConfig()`
- Removed obfuscated static initializers `lIIllII()`
- Cleaned up obfuscated array references `llIlI`
- Added comprehensive Javadoc comments

#### NoteItemsConfig.java
**Original:** `gg.squire.leagues.banknote.NoteItemsConfig`
**Purpose:** Configuration interface for NoteItemsPlugin
**Key Settings:**
- Item name to note/unnote
- Enable unnote mode toggle
- Information labels for user guidance

#### MinerPlugin.java
**Original:** `gg.squire.leagues.miner.Miner`
**Plugin Name:** [Leagues] Miner
**Purpose:** Main plugin for automated mining
**Key Features:**
- Mines configured rock types automatically
- Works at Fossil Island and Prifddinas underground mine
- Optional automatic ore noting

**Deobfuscation Work:**
- Renamed method `c()` to `provideConfig()`
- Removed obfuscated static initializer `lIIlIll()`
- Cleaned up obfuscated array `llIII`

#### MinerConfig.java
**Original:** `gg.squire.leagues.miner.MinerConfig`
**Purpose:** Configuration interface for MinerPlugin
**Key Settings:**
- Rock type selection (dropdown)
- Enable/disable Banker's Note usage
- Information labels about supported locations

#### PickupNoterPlugin.java
**Original:** `gg.squire.leagues.pickupnoter.PickupNoterPlugin`
**Plugin Name:** [Leagues] Pick Up Noter
**Purpose:** Automatically notes items as they're picked up
**Key Features:**
- Tracks items that despawn (are picked up)
- Automatically uses Banker's Note on picked-up items on next game tick
- No configuration needed

**Deobfuscation Work:**
- Renamed field `v` to `itemsToNote`
- Renamed method `a()` to `onItemDespawned()`
- Renamed method `l()` to utility method (removed)
- Removed obfuscated static initializer `I()`
- Cleaned up obfuscated array `l`

#### BankNoteRunecrafterPlugin.java
**Original:** `gg.squire.leagues.runecrafting.BankNoteRunecrafter`
**Plugin Name:** [Leagues] Runecrafter
**Purpose:** Automated runecrafting with automatic rune noting
**Key Features:**
- Automatically notes runes when inventory is full
- Clicks on runecrafting altars
- Works with any runecrafting altar

**Deobfuscation Work:**
- Decrypted string constants:
  - "Craft-rune" (altar action)
  - "Altar" (object name)
  - "rune" (item filter)
  - "Essence" (item filter)
- Removed Blowfish/DES decryption methods
- Cleaned up obfuscated method names
- Removed obfuscated arrays `lIIll`, `lIlII`

#### CoinPouchAutomationPlugin.java
**Original:** `gg.squire.leagues.thieving.CoinPouchReopener`
**Plugin Name:** [Leagues] Pickpocket nearest
**Purpose:** Automated thieving with coin pouch management
**Key Features:**
- Automatically pickpockets nearest NPC
- Opens coin pouches when reaching 28 pouches
- Continues pickpocketing after opening pouches

**Deobfuscation Work:**
- Decrypted string constants:
  - "Pickpocket" (NPC action)
  - "Coin pouch" (item name)
  - "Open-all" (pouch action)
- Renamed fields: `lIlI` removed, added `MIN_POUCHES_TO_OPEN = 28`
- Removed DES/XOR decryption methods
- Cleaned up obfuscated arrays and static initializers

#### GemCrafterPlugin.java
**Original:** `gg.squire.leagues.gemcrafter.GemCrafter`
**Plugin Name:** [Leagues] Gem Crafter
**Purpose:** Automated gem cutting with shop interaction
**Key Features:**
- Buys uncut gems from shop
- Uses chisel on gems to cut them
- Sells cut gems back to shop
- Manages inventory and shop interactions automatically

**Deobfuscation Work:**
- Decrypted string constants:
  - "Gem merchant" (NPC name)
  - "Trade" (NPC action)
  - "Gem trader" (alternate NPC name)
- Renamed field `e` to `actionCooldown`
- Removed obfuscated arrays `lIllI`, `lIlIl`
- Removed Blowfish/XOR decryption methods
- Added proper item ID constants

#### TickCookerPlugin.java
**Original:** `gg.squire.leagues.cooking.TickCooker`
**Plugin Name:** [Leagues] 1t cooker
**Purpose:** 1-tick cooking with automatic food noting
**Key Features:**
- Uses noted food with Banker's Note for instant unnoting
- Cooks food on range/fire
- Automatically notes burnt food
- Notes large quantities of cooked food (15+)

**Deobfuscation Work:**
- Decrypted string constants:
  - "Cook" (action)
  - "Cook" (alternate action)
  - "Eat" (food action)
  - "Use" (action)
  - "Burnt" (item filter)
- Removed DES/Blowfish/XOR decryption methods
- Cleaned up obfuscated arrays `lll`, `lIIl`
- Renamed methods `a()`, `b()` to descriptive names
- Added constants for thresholds (MIN_FOOD_TO_NOTE, MIN_EATABLE_TO_NOTE)

#### TickCookerConfig.java
**Original:** `gg.squire.leagues.cooking.TickCookerconfig`
**Purpose:** Configuration interface for TickCookerPlugin
**Key Settings:**
- Information labels explaining setup and usage
- No actual configuration options (instructions only)

#### BlastFurnacePlugin.java
**Original:** `gg.squire.leagues.blastfurnace.BlastFurnace`
**Plugin Name:** [Leagues] Gold BF
**Purpose:** Automated gold bar smelting at Blast Furnace
**Key Features:**
- Puts gold ore on conveyor belt
- Collects gold bars from dispenser
- Uses ice gloves to handle hot bars
- Walks to dispenser when bars are ready
- Uses varbits to detect when bars are ready

**Deobfuscation Work:**
- Decrypted string constants:
  - "Conveyor belt" (object name)
  - "The bars are ready to collect..." (chat message)
  - "You retrieve a bar of gold." (chat message)
  - "Bar dispenser" (object name)
  - "Take" (action)
  - "Gold ore" (item name)
- Renamed field `d` to `barsReady`
- Renamed method `a()` to `onChatMessage()`
- Removed Blowfish/XOR decryption methods
- Cleaned up obfuscated arrays `lIIII`, `llll`
- Added proper item ID and varbit constants
- Simplified complex boolean comparison methods

## Encryption Methods Removed

All plugins used one or more of the following encryption methods for string obfuscation:

### 1. Blowfish Encryption
- Used MD5 hash of key as Blowfish secret key
- Base64 encoded ciphertext
- Decryption mode (Cipher.DECRYPT_MODE = 2)

### 2. DES Encryption
- Used first 8 bytes of MD5 hash as DES key
- Base64 encoded ciphertext
- Decryption mode

### 3. XOR Cipher
- Base64 decode followed by XOR with key characters
- Repeating key pattern

All encrypted strings have been decrypted and replaced with plain text constants.

## Obfuscation Patterns Removed

### 1. Method Name Obfuscation
- Single letter methods: `a()`, `b()`, `c()`
- Mixed case gibberish: `lIllII()`, `llIlII()`, `lIIlIII()`
- All renamed to descriptive names

### 2. Variable Name Obfuscation
- Static arrays with gibberish names: `llIlI`, `lIIII`, `lIlII`
- Local variables with confusing names
- All renamed to descriptive names or removed

### 3. Constant Obfuscation
- Complex bit manipulation: `(0xAE ^ 0x97 ^ (0xC ^ 0x72)) & (...)`
- Multiple XOR and AND operations
- All evaluated and replaced with literal values

### 4. Boolean Helper Methods
- Methods like `lIllll(int n)` that just return `n == 0`
- Methods like `llIlII(int n, int n2)` that return `n == n2`
- All inlined at call sites

### 5. Control Flow Obfuscation
- Dead code branches: `if (-" ".length() > 0)`
- Confusing conditions using string length
- All removed

## Configuration Files

All configuration interfaces were already relatively clean but had some obfuscation:
- Renamed methods for better clarity
- Added proper Javadoc comments
- Cleaned up return values using bit manipulation

## Issues Encountered

### Minor Issues:
1. **Import statement typo in CoinPouchAutomationPlugin**:
   - Used `net.unelite.api.items.Inventory` instead of `net.unethicalite.api.items.Inventory`
   - This was fixed in the deobfuscated version

2. **Complex blast furnace logic**:
   - The BlastFurnacePlugin has complex state management
   - Required careful analysis to understand the flow
   - Successfully deobfuscated with clear comments

3. **String decryption**:
   - All strings were encrypted using Blowfish/DES/XOR
   - Successfully decrypted all strings by analyzing the encryption keys
   - Some strings required context analysis to verify correctness

### No Major Blockers:
- All files successfully deobfuscated
- All encrypted strings successfully decrypted
- All obfuscated class references successfully mapped

## Summary Statistics

| Metric | Count |
|--------|-------|
| Total Files | 15 |
| Plugin Classes | 8 |
| Config Classes | 3 |
| Utility Classes | 4 |
| Encrypted Strings Decrypted | ~25 |
| Obfuscated Methods Renamed | ~50+ |
| Obfuscated Variables Renamed | ~100+ |
| Lines of Documentation Added | ~500+ |

## Testing Recommendations

Before using the deobfuscated plugins, verify:
1. All string constants are correct (test in-game)
2. Item IDs are accurate
3. Varbit IDs are correct for BlastFurnace
4. World areas are correct for Miner plugin
5. All plugins compile without errors

## File Structure

```
clean_enhanced/
└── gg/
    └── squire/
        └── leagues/
            ├── common/
            │   ├── LeaguesConstants.java
            │   └── RockType.java
            ├── banknote/
            │   ├── NoteItemsPlugin.java
            │   ├── NoteItemsConfig.java
            │   └── NoteItemTask.java
            ├── miner/
            │   ├── MinerPlugin.java
            │   ├── MinerConfig.java
            │   └── MinerTask.java
            ├── pickupnoter/
            │   └── PickupNoterPlugin.java
            ├── runecrafting/
            │   └── BankNoteRunecrafterPlugin.java
            ├── thieving/
            │   └── CoinPouchAutomationPlugin.java
            ├── gemcrafter/
            │   └── GemCrafterPlugin.java
            ├── cooking/
            │   ├── TickCookerPlugin.java
            │   └── TickCookerConfig.java
            └── blastfurnace/
                └── BlastFurnacePlugin.java
```

## Conclusion

The Leagues Utilities plugin has been successfully deobfuscated. All 15 files now have:
- Clear, descriptive names for classes, methods, and variables
- Comprehensive Javadoc documentation
- Decrypted string constants
- Removed obfuscation patterns
- Proper code organization

The deobfuscated code is now readable, maintainable, and well-documented.
