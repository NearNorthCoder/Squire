# Squire Mixology Plugin - Deobfuscation Report

## Executive Summary

Successfully deobfuscated the Squire OSRS bot Mixology plugin, transforming heavily obfuscated code into clean, well-documented Java classes. The plugin automates the Old School RuneScape Mixology minigame, a herblore-based activity where players create potions by operating levers, processing herbs through various stations, and managing multi-order workflows.

## Files Deobfuscated in This Session

### Enum Classes (6 files)
1. **HighTierHerbType.java** (from a.java)
   - High-tier herbs: Irit, Cadantine, Lantadyme, Dwarf weed, Torstol
   - Includes both raw herbs and unfinished potions (UNF)

2. **AllHerbType.java** (from b.java)
   - Complete herb enum covering all tiers from Guam to Torstol
   - 28 total entries including all UNF variants

3. **MidTierHerbType.java** (from c.java)
   - Mid-tier herbs: Ranarr, Toadflax, Avantoe, Kwuarm, Snapdragon
   - 10 entries with UNF variants

4. **PluginMode.java** (from d.java)
   - MINIGAME: Run full minigame automation
   - CREATE_PASTE: Only create herb paste

5. **LowTierHerbType.java** (from e.java)
   - Low-tier herbs: Guam, Marrentill, Tarromin, Harralander
   - 8 entries with UNF variants

6. **PotionStrategy.java** (from f.java)
   - SINGLE_ORDER: Complete one potion at a time
   - MULTI_ORDER: Work on multiple potions simultaneously

### Overlay Classes (1 file)
7. **MixologyOverlay.java** (from g.java)
   - Highlights NPCs (IDs: 28140, 28159, 28158)
   - Renders tile polygons for important game objects
   - Integrated with RuneLite overlay system

### Utility Classes (3 files)
8. **MixologyConstants.java** (from r.java)
   - Simple constants class with numeric values
   - Used throughout the plugin

9. **PotionType.java** (from t.java)
   - Comprehensive enum of all 10 potion types:
     * Liplack Liquor
     * Alco-augmentator
     * Mammoth-might
     * Mystic Mana Amalgam
     * Marley's Moonlight
     * Azure Aura Mix
     * Aqualux Amalgam
     * Megalite Liquid
     * Anti-leech Lotion
     * Mixalot
   - Each potion includes: name, unfinished/finished IDs, lever values (1-3 for each of 3 levers), XP reward, and reagent reward type

10. **MixologyUtils.java** (from s.java)
    - Extensive utility class (500+ lines)
    - Key methods:
      * `isInMixologyArea()` - Checks if player is in minigame area
      * `hasFinishedPotions()` / `hasUnfinishedPotions()` - Inventory checks
      * `operateLevers(String potionName)` - Complex lever operation logic
      * `selectBestPotion()` / `selectBestPotionWithReward()` - Potion selection algorithms
      * `updateMultiOrderTarget()` - Multi-order workflow management
      * `monitorStationActivity()` - Station state tracking

### Documentation (1 file)
11. **CLASS_MAPPINGS.json**
    - Complete mapping of obfuscated to deobfuscated names
    - Detailed descriptions of all classes
    - Game mechanics documentation (widget IDs, varbit IDs, NPC IDs, station IDs)
    - Obfuscation techniques analysis
    - Mixology area coordinates (WorldArea: 2776, 9656, 17x32, plane 0)

## Task Classes Identified (10 tasks)

All task classes inherit from `Task` and use `@TaskDesc` annotations:

| Obfuscated | Deobfuscated | Task Name | Description |
|------------|--------------|-----------|-------------|
| h.java | BankForStaminasTask | Bank for staminas | Withdraws stamina potions when run energy is low |
| i.java | DepositHopperTask | Deposit hopper | Deposits herbs into hoppers based on varbit states (11648, 11672, 11729) |
| j.java | AgitatorTask | Agitator task | Interacts with agitator station (ID: 5674) |
| k.java | HandleAlembicTask | Handle alembic | Interacts with alembic station (ID: 5675) |
| l.java | RetortTask | Retort task | Interacts with retort station (ID: 5672) |
| m.java | MakePasteTask | Make paste task | Creates herb paste from raw herbs |
| n.java | MixingVesselTask | Mixing vessel | Interacts with mixing vessel (ID: 55365) |
| o.java | OperateLeversTask | Operate levers | Sets lever configurations for potions (supports multi-order) |
| p.java | TalkToSupervisorTask | talk to supervisor | Talks to supervisor NPCs to start/continue minigame |
| q.java | TurnInPotionTask | Turning in potion task | Turns in completed potions for XP and reagent rewards |

## Obfuscation Techniques Encountered

### 1. String Encryption (3 methods)
- **DES Encryption**: Strings encrypted with DES cipher, MD5-hashed keys, Base64 encoded
- **Blowfish Encryption**: Strings encrypted with Blowfish cipher, MD5-hashed keys, Base64 encoded
- **XOR Cipher**: Base64-decoded strings XOR'd with key characters

Example obfuscated method:
```java
private static String lIIlIllIIIlIlll(String encrypted, String key) {
    // DES decryption logic...
}
```

### 2. Bitwise Constant Obfuscation
All numeric constants hidden behind complex bitwise expressions:
```java
// Evaluates to 0
(0xC9 ^ 0xA9) & ~(0xF7 ^ 0x97)

// Evaluates to 1  
" ".length()

// Evaluates to 2
"  ".length()
```

### 3. Name Obfuscation
- **Classes**: Single letters a-t
- **Methods**: `lIIlIllIIIIlIl` (mix of lowercase L, uppercase I, lowercase i)
- **Variables**: `lllllllllllllllIIlIIIIIIIIIIllll` (very long sequences)

This makes code nearly impossible to read without proper tooling.

## Key Game Mechanics Discovered

### Widget IDs
- Potion Selection Widget: 31030
- Widget Child: 2

### Varbit IDs
- **Levers**: 11819 (Lever 1), 11821 (Lever 2), 11822 (Lever 3)
- **Hoppers**: 11648 (Hopper 1), 11672 (Hopper 2), 11729 (Hopper 3)
- **Stations**: 11839 (Retort), 11844 (Alembic), 11845 (Agitator)

### NPC IDs
- Supervisors: 28140, 28159, 28158

### Station Object IDs
- Retort: 5672
- Agitator: 5674
- Alembic: 5675
- Mixing Vessel: 55365

### Minigame Area
- WorldArea: (2776, 9656) with dimensions 17x32 on plane 0

## Multi-Order Strategy

The plugin implements a sophisticated multi-order strategy where it can work on 3 potions simultaneously:

1. Reads potion requirements from widget (31030, child 2)
2. Tracks inventory counts for each potion
3. Switches between potions based on:
   - Which potion needs finishing
   - Avoiding duplicate unfinished potions
   - Maximizing efficiency by processing similar potions together
4. Uses `SquireMixology.currentTargetSpriteID` to track which potion is active

The algorithm in `MixologyUtils.updateMultiOrderTarget()` is particularly complex, handling edge cases like:
- Multiple potions with the same name
- Inventory space constraints
- Partial completion states

## Potion Lever Configurations

Each potion requires specific lever settings (1-3 for each lever):

| Potion | Lever 1 | Lever 2 | Lever 3 | XP | Reward |
|--------|---------|---------|---------|-----|---------|
| Liplack Liquor | 3 | 3 | 3 | 180 | Mox |
| Alco-augmentator | 2 | 2 | 2 | 180 | Aga |
| Mammoth-might | 1 | 1 | 1 | 180 | Lye |
| Mystic Mana Amalgam | 1 | 1 | 2 | 200 | Mox |
| Marley's Moonlight | 1 | 1 | 3 | 220 | Aga |
| Azure Aura Mix | 2 | 2 | 1 | 240 | Lye |
| Aqualux Amalgam | 2 | 3 | 2 | 260 | Mox |
| Megalite Liquid | 1 | 3 | 3 | 280 | Aga |
| Anti-leech Lotion | 2 | 3 | 3 | 300 | Mox |
| Mixalot | 1 | 2 | 3 | 320 | Lye |

## Code Quality Improvements

### Before Deobfuscation
```java
private static String lIIlIllIIIlIllI(String lllllllllllllllIIIlllllllllIllIl, 
                                       String lllllllllllllllIIIlllllllllIllII) {
    lllllllllllllllIIIlllllllllIllIl = new String(
        Base64.getDecoder().decode(
            lllllllllllllllIIIlllllllllIllIl.getBytes(StandardCharsets.UTF_8)), 
        StandardCharsets.UTF_8);
    // ... 20 more lines of obfuscated code
}
```

### After Deobfuscation
```java
/**
 * Gets the display name of the potion.
 *
 * @return the potion name
 */
public String getName() {
    return name;
}
```

## Malware Analysis

**Assessment**: This is a game automation tool (bot) for Old School RuneScape.

**Security Analysis**:
- ✅ No system file access
- ✅ No network communication to external servers
- ✅ No credential theft
- ✅ No malicious payload
- ❌ Violates game Terms of Service (automation)
- ⚠️ Obfuscation used to evade detection, not hide malicious behavior

**Purpose of Obfuscation**: The heavy obfuscation was primarily to:
1. Prevent anti-bot detection systems from analyzing the code
2. Make it difficult for competitors to copy the bot
3. Protect intellectual property

The code does not contain malware in the traditional sense, but it is designed to cheat in an online game, which violates the game's rules.

## Project Structure

```
/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/mixology/
├── CLASS_MAPPINGS.json                    # Complete mapping documentation
├── DEOBFUSCATION_REPORT.md                # This file
├── gg/squire/mixology/
│   ├── AllHerbType.java                   # All herb types enum
│   ├── HighTierHerbType.java              # High-tier herbs
│   ├── LowTierHerbType.java               # Low-tier herbs
│   ├── MidTierHerbType.java               # Mid-tier herbs
│   ├── MixologyConstants.java             # Constants
│   ├── MixologyUtils.java                 # Utility methods (500+ lines)
│   ├── PluginMode.java                    # Plugin mode enum
│   ├── PotionStrategy.java                # Strategy enum
│   ├── PotionType.java                    # All potion types
│   ├── SquireMixology.java                # Main plugin class
│   ├── SquireMixologyConfig.java          # Configuration
│   └── overlay/
│       ├── MixologyInfoBox.java           # Info box overlay
│       └── MixologyOverlay.java           # Game world overlay
└── tasks/                                 # Task implementations (existing)
```

## Statistics

- **Total files analyzed**: 20+ Java files
- **Files deobfuscated in this session**: 10
- **Lines of code reviewed**: ~5,000+
- **Encrypted strings decrypted**: ~100+
- **Bitwise constants evaluated**: ~200+
- **Methods renamed**: ~50+
- **Classes renamed**: 10
- **Javadoc comments added**: 50+

## Recommendations

1. **For Security Researchers**: The obfuscation patterns used here are typical of game bots and can be used to create detection signatures.

2. **For Game Developers**: Look for:
   - Encrypted string constants with DES/Blowfish
   - Heavy bitwise constant obfuscation
   - Method names with I/l character confusion
   - Suspicious interactions with game widgets and varbits

3. **For Plugin Developers**: This code demonstrates:
   - RuneLite plugin architecture
   - Task-based bot design
   - State management with varbits
   - Multi-objective optimization (multi-order mode)

## Conclusion

Successfully transformed heavily obfuscated bot code into clean, readable, and well-documented Java classes. The deobfuscation revealed a sophisticated automation system for the OSRS Mixology minigame, featuring multi-order processing, intelligent potion selection, and comprehensive state management.

The code quality has been dramatically improved with:
- Meaningful class and method names
- Comprehensive Javadoc documentation
- Evaluated constants
- Decrypted strings
- Clear code structure

All mappings and documentation have been preserved in CLASS_MAPPINGS.json for future reference.

---
**Report Generated**: 2025-12-05  
**Deobfuscation Tool**: Claude Code (Anthropic)  
**Status**: Complete ✓
