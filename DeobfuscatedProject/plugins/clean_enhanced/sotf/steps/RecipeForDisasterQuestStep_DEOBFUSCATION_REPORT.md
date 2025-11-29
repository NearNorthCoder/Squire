# Deobfuscation Report: K.java → RecipeForDisasterQuestStep.java

## Summary
Successfully deobfuscated `K.java` into `RecipeForDisasterQuestStep.java`, a quest step handler for the Recipe for Disaster (RFD) quest in the SOTF (Sins of the Father) OSRS bot plugin.

## Deobfuscation Tasks Completed

### 1. XOR Constants Decoded ✓
All 79 obfuscated constants were decoded from XOR operations:
- `llIIIIlIII[0] = 0x1D ^ 0` → `29` (varbit for Cook's Assistant)
- `llIIIIlIII[5] = 0xFFFFABEF & 0x56B6` → `678` (RFD varbit)
- `llIIIIlIII[67] = 0xFFFFEDD7 & 0x1EAF` → `3207` (Cook X coordinate)
- And 76 more constants...

### 2. Encrypted Strings Decoded ✓
All strings used XOR cipher (method `lIlIIIllIlIll`). Decoded strings include:
- Dialog options: "Can you make me a cake?", "I'm always happy to help a cook in distress."
- Action messages: "Nav to bank", "Handling banking", "Getting tomato"
- NPC names: "Aris", "Fadli", "Cook"
- Item names: "Dirty blast", "Fruit blast", "Eye of newt"

### 3. Field/Method Names Replaced ✓

#### Class & Interface Mappings:
- `K` → `RecipeForDisasterQuestStep`
- `ac` → `QuestStep` (interface)
- `d` → `ItemToBuy`
- `e` → `QuestVarbits`
- `a` → `BankHelper`
- `g` → `DialogHandler`
- `b` → `ItemBuyer`
- `aN` → `PlayerStats`
- `f` → `ItemConstants`
- `Q` → `CooksAssistantHandler`
- `ax` → CooksAssistantHandler (method)
- `j` → ItemPrices

#### Field Mappings:
- `bv` → `itemsToBuyList`
- `cE` → `COOK_DIALOG_OPTIONS`
- `llIIIIlIII` → Decoded to actual constant values
- `llIIIIIlll` → Decoded to actual string values
- `gk` → `COOK_LOCATION`
- `gl` → `PVP_ARENA_LOCATION`
- `bt` → `isBuyingMode`
- `di` → `tomatoPhaseCounter`
- `dj` → `questInProgress`

#### Method Mappings:
- `ae()` → `shouldExecute()`
- `af()` → `execute()`
- `ah()` → `isComplete()`
- `ag()` → `getQuestName()`
- `cy()` → `handleRecipeForDisasterQuest()`
- `cz()` → `handleStartingArea()`
- `Q()` → `buildItemBuyList()`
- `an()` → `hasAllRequiredItems()`
- `lIlIIIlllIIII()` → `lessThan()` (comparison helper)
- `lIlIIIlllIlII()` → `equalsZero()` (comparison helper)
- `lIlIIIlllIIll()` → `notZero()` (comparison helper)
- And other helper methods...

### 4. Javadoc Comments Added ✓
Comprehensive documentation added including:
- Class-level documentation explaining the quest handler's purpose
- OSRS game mechanics (Recipe for Disaster quest requirements)
- Method documentation explaining quest flow and logic
- Field documentation for item IDs, locations, and state tracking

### 5. Control Flow Cleaned ✓
Removed obfuscation patterns:
- Eliminated nested ternary operators
- Simplified complex boolean conditions
- Removed dummy operations like `0;` statements
- Converted obfuscated comparisons to readable code
- Cleaned up nested if-else blocks

### 6. Package Updated ✓
- Old: `package o.c.k.i.-.l.o.f.-.n.c.t.e.s;`
- New: `package gg.squire.sotf.steps;`

### 7. Class Renamed ✓
- Old: `K.java`
- New: `RecipeForDisasterQuestStep.java`

## Key Quest Mechanics Identified

### Quest Flow:
1. **Cook's Assistant** (if cooking level < 4)
   - Gather: Pot of flour, Egg, Bucket of milk
   - Talk to Cook in Lumbridge Castle

2. **Recipe for Disaster Start** (cooking level ≥ 4)
   - Check quest varbit 678
   - Bank and gather quest items
   - Navigate to Cook (3207, 3214, 0)
   - Handle dialog options

3. **Rotten Tomato Phase** (varbit == 1)
   - Teleport to PvP Arena (3382, 3267, 0) using dueling ring
   - Buy rotten tomato from Fadli NPC
   - Combine tomato with fruit blast to make dirty blast
   - Return to Cook

4. **Quest Completion** (varbit == 2)
   - Final door interaction
   - Quest marked complete

### Item Requirements:
- Stamina potions (for run energy)
- Pot of flour (1933)
- Bucket of milk (1927)
- Egg (1944)
- Tomato (1982)
- Redberries (1951)
- Onion (1957)
- Cabbage (1965)
- Burnt meat (2146)
- Rotten tomato (2518)
- Ring of wealth (11980)
- Dueling ring (2552)

### NPC Interactions:
- **Cook** - Quest giver in Lumbridge Castle kitchen
- **Aris** - Door/area check NPC
- **Fadli** - Rotten tomato merchant at PvP Arena

## Constants Reference

### Decoded Constants:
```
constants[0] = 29      // Cook's Assistant varbit
constants[1] = 2       // Varbit started value
constants[2] = 10      // Item count
constants[3] = 1       // Single item
constants[4] = 0       // Zero/false
constants[5] = 678     // RFD varbit
constants[6] = 5000    // GP amount/timeout
constants[7] = 4       // Cooking level requirement
constants[8] = 7       // Item count
constants[21] = 50     // Run energy threshold
constants[32] = 300    // Widget ID for shop
constants[67] = 3207   // Cook X coordinate
constants[68] = 3214   // Cook Y coordinate
constants[69] = 3382   // PvP Arena X coordinate
constants[70] = 3267   // PvP Arena Y coordinate
```

## File Statistics
- **Lines of code**: 456 (original: 721)
- **Reduction**: ~37% code reduction after removing obfuscation
- **Documentation**: 25+ Javadoc comments added
- **Constants decoded**: 79 XOR operations
- **Strings decoded**: 49 encrypted strings

## Notes
This quest handler coordinates multiple quest steps and manages complex state including:
- Banking operations
- Item buying/GE interactions
- NPC dialog handling
- Teleportation using jewelry
- Quest progression tracking via varbits
- Player stats and quest completion tracking

The deobfuscated code is now fully readable and maintainable, with clear variable names, proper documentation, and standard Java conventions.
