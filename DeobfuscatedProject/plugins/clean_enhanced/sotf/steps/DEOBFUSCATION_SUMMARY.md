# SOTF Quest Step Deobfuscation Summary

## Overview
This document summarizes the deobfuscation of 12 small quest step classes for the SOTF plugin.

## Files Processed

### 1. ax.java → CookingStep.java ✅ COMPLETE
- **Purpose**: Cooking training (1-75)
- **Location**: Castle Wars
- **Items**: Raw shrimp (1-5), sardines (5-30), trout (30+)
- **Key Features**:
  - Buys from GE when needed
  - Uses ring of dueling for teleportation
  - Cooks at Castle Wars range
  - Auto-switches food types based on level

### 2. ao.java → MiningStep.java ✅ STARTED
- **Purpose**: Mining training (1-15)
- **Location**: Lumbridge swamp
- **Items**: Copper ore, tin ore
- **Pickaxes**: Bronze → Iron → Steel → Mithril → Adamant → Rune (based on level)
- **Key Features**:
  - Buys pickaxes from GE
  - Drops ores (power mining)
  - Uses ring of wealth

### 3. ay.java → CraftingStep.java (Glassblowing)
- **Purpose**: Crafting training (1-87)
- **Method**: Glassblowing
- **Items**: Molten glass, glassblowing pipe
- **Progression**:
  - Beer glass (1-4)
  - Candle lantern (4-12)
  - Oil lamp (12-21)
  - Vial (21-33)
  - Fishbowl (33-46)
  - Unpowered orb (46-87)
  - Lantern lens/Light orb (87+)

### 4. az.java → FishingStep.java
- **Purpose**: Fishing training (1-74)
- **Location**: Lumbridge swamp fishing spots
- **Equipment**: Small net, fishing rod, fly fishing rod, bait, feathers
- **Progression**:
  - Small net fishing (1-5)
  - Rod fishing with bait (5-20)
  - Fly fishing (20+)
- **Key Features**:
  - Drops fish (power fishing)
  - Auto-switches methods based on level
  - Uses ring of wealth

### 5. ap.java → PrayerStep.java
- **Purpose**: Prayer training (1-43)
- **Location**: Chaos altar in Wilderness
- **Items**: Various bones (based on level)
- **Key Features**:
  - VERY DANGEROUS - Wilderness PKers
  - Uses chaos altar for 2x prayer XP
  - Teleports with burning amulet
  - Banking at Ferox Enclave

### 6. at.java → ThievingStep.java
- **Purpose**: Thieving training (pickpocketing)
- **NPCs**: Various NPCs based on thieving level
- **Key Features**:
  - Eats food when low HP
  - Doddle pickpocketing
  - Auto-switches NPCs based on level

### 7. au.java → WoodcuttingStep.java
- **Purpose**: Woodcutting training
- **Location**: Various tree locations
- **Equipment**: Bronze → Iron → Steel → Mithril → Adamant → Rune axe
- **Key Features**:
  - Power chops (drops logs)
  - Auto-upgrades axes

### 8. ak.java → MagicTrainingCowsStep.java
- **Purpose**: Magic training by casting spells on cows
- **Location**: Cow pen
- **Spells**: Wind/Water/Earth/Fire Strike based on level
- **Equipment**: Various staves and runes
- **Target**: Low-level cows for safe training

### 9. al.java → MagicTrainingAutocastStep.java
- **Purpose**: Magic training with autocasting
- **Location**: Cow pen
- **Method**: Sets autocast and attacks cows
- **Key Features**:
  - Configures autocast spell
  - Buys runes from GE
  - Eats food when needed

### 10. am.java → MeleeTrainingStep.java
- **Purpose**: Melee combat training (Attack/Strength/Defence)
- **Equipment**: Progressive armor and weapons
- **Progression**:
  - Bronze → Iron → Steel → Mithril → Adamant → Rune
- **Key Features**:
  - Sets attack style
  - Auto-upgrades equipment
  - Trains at various locations

### 11. aq.java → RangedTrainingStep.java
- **Purpose**: Ranged combat training
- **Equipment**: Various bows, crossbows, and ammo
- **Progression**:
  - Shortbow → Oak shortbow → Willow shortbow
  - Crossbow variants
  - Arrows/bolts
- **Key Features**:
  - Auto-equips Ava's device (if Animal Magnetism complete)
  - Switches equipment based on level
  - Buys ammo from GE

### 12. aw.java → ConstructionStep.java
- **Purpose**: Construction training
- **Location**: Player-owned house (POH)
- **Method**: Building and removing furniture
- **Progression**:
  - Crude wooden chairs (1-15)
  - Wooden larders (15-33)
  - Oak tables (33-52)
  - Oak larders (52+)
- **Items**: Planks, oak planks, nails, saw, hammer
- **Key Features**:
  - Teleports to house
  - Builds rooms (Kitchen, Dining room)
  - Uses ring of dueling for Castle Wars banking
  - Build mode automation

## Common Patterns

All these step classes follow a similar structure:

1. **Buying Mode**: Checks bank for required items, creates GE buy orders if missing
2. **Banking**: Withdraws supplies from bank
3. **Execution**: Performs the training activity
4. **Completion Check**: Returns true when target level is reached

### Common Fields
```java
public static List<PurchaseRequest> itemsToBuy = new ArrayList<>();
public static boolean buyingMode = false;
```

### Common Methods
```java
void prepareShoppingList()      // Creates GE buy orders
boolean hasRequiredSupplies()    // Checks if player has needed items
void execute[Activity]()         // Main training logic

// Interface methods
String getStepName()             // Returns step name
int execute()                    // Main execution, returns sleep time
boolean isComplete()             // Checks if target level reached
boolean shouldExecute()          // Usually returns false
```

## Deobfuscation Approach

For each file, the deobfuscation process involved:

1. **Decoding XOR Strings**: All string literals were XOR-encrypted and needed decoding
2. **Decoding Item IDs**: Item IDs were obfuscated with bitwise operations
3. **Renaming Variables**: Changed from `llIllllIII` style to meaningful names
4. **Renaming Methods**: Changed from `lIlllIlIIlIll` to descriptive names
5. **Simplifying Logic**: Removed dead code and obfuscation artifacts
6. **Adding Documentation**: Added Javadoc comments explaining purpose
7. **Updating Package**: Changed from obfuscated package to `gg.squire.sotf.steps`

## Status

- ✅ CookingStep.java - COMPLETE
- 🔄 Remaining 11 files - Analyzed and documented, ready for final implementation

## Next Steps

To complete the deobfuscation:
1. Generate clean versions of remaining 11 files using the patterns identified
2. Test each step to ensure functionality is preserved
3. Update imports to reference helper classes
4. Verify all XOR-decoded strings are correct
