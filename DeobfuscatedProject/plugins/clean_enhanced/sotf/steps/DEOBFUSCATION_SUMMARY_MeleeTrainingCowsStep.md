# Deobfuscation Summary: MeleeTrainingCowsStep.java

## Original File
`/home/user/Squire/DeobfuscatedProject/plugins/deobfuscated/7c1d3521-d222-494e-8c51-697efca0674b/o/c/k/i/-/l/o/f/-/n/c/t/e/s/am.java`

## Deobfuscated File
`/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/steps/MeleeTrainingCowsStep.java`

## Purpose
This is a melee combat training step for the SOTF (Sins of the Father) OSRS bot plugin. It trains Attack, Strength, and Defence skills by killing cows in Lumbridge until Strength level 40 is reached.

## Key Deobfuscation Actions

### 1. XOR Constants Decoded
Decoded all obfuscated integer constants from the `lIllllIIllllI()` static initializer:
- `lllIIIIIIl[17]` → `ADAMANT_SCIMITAR = 1331`
- `lllIIIIIIl[18]` → `RUNE_SCIMITAR = 1333`
- `lllIIIIIIl[10]` → `BRONZE_SCIMITAR = 1321`
- `lllIIIIIIl[54]` → `IRON_SCIMITAR = 1323`
- `lllIIIIIIl[12]` → `LOBSTER = 379` (food)
- `lllIIIIIIl[42]` → `LEATHER_VAMBRACES = 1063`
- `lllIIIIIIl[44]` → `LEATHER_BODY = 1129`
- `lllIIIIIIl[45]` → `LEATHER_CHAPS = 1095`
- `lllIIIIIIl[47]` → `LEATHER_BOOTS = 1061`
- And many more...

### 2. Encrypted Strings Decoded
All DES/Base64 encrypted strings were already decrypted in the decompiled output:
- "Buying items"
- "Handling banking"
- "Walking to cow area"
- "Killing cows"
- "Iron scimitar", "Steel scimitar", "Mithril scimitar"
- "Wield", "Wear", "Eat", "Attack"
- "Toggle auto retaliate"
- "40 Str" (step name)

### 3. Obfuscated Names Replaced

#### Class Names
- `am` → `MeleeTrainingCowsStep`

#### Method Names
- `aJ()` → `runMainLoop()`
- `aL()` → `equipBestGear()`
- `aM()` → `hasRequiredSupplies()`
- `aN()` → `hasBankSupplies()`
- `aO()` → `setCombatStyle()`
- `am()` → `killCows()`
- `Q()` → `buildShoppingList()`
- `ag()` → `getName()`
- `ae()` → `shouldExecute()`
- `ah()` → `isComplete()`
- `af()` → `execute()`
- `lIllllIlIIIll()` → `≥` (greater than or equal)
- `lIllllIlIIIIl()` → `<` (less than)
- `lIllllIlIlIII()` → `==` (equals)
- `lIllllIlIIIlI()` → `== 0` (is false)
- `lIllllIlIIIII()` → `!= 0` (is true)
- `lIllllIlIIlII()` → `!= null` (not null)
- `lIllllIlIIlll()` → `== null` (is null)

#### Field Names
- `lllIIIIIII` → Individual string literals (no array needed)
- `lllIIIIIIl` → Individual constants (no array needed)
- `bv` → `itemsToBuy`
- `bt` → `needsToBuyItems`
- `cK` → `REQUIRED_EQUIPMENT`
- `cL`, `cM`, `cN` → `COW_AREA_1`, `COW_AREA_2`, `COW_AREA_3`
- `ck`, `cO`, `cP` → `SAFE_SPOT_1`, `SAFE_SPOT_2`, `SAFE_SPOT_3`

### 4. Control Flow Cleaned Up
Removed deeply nested block statements and replaced with clear, linear logic:
- **Before**: 24+ nested blocks in `aN()` checking equipment/bank/inventory
- **After**: Clear `hasRequiredSupplies()` and `hasBankSupplies()` methods with early returns

### 5. Package Updated
- **Old**: `package o.c.k.i.-.l.o.f.-.n.c.t.e.s;`
- **New**: `package gg.squire.sotf.steps;`

### 6. Documentation Added
Comprehensive Javadoc comments explaining:
- **Class purpose**: Melee training by killing cows
- **OSRS game mechanics**: Equipment requirements, combat styles, attack levels
- **Training strategy**: Progressive weapon upgrades, balanced skill training
- **Combat style logic**: Rotation between Attack/Strength/Defence training
- **Item IDs**: All OSRS item IDs with descriptive names
- **World coordinates**: Lumbridge cow field areas and safe spots

## Key Features Identified

### Equipment Progression
The bot automatically upgrades weapons as Attack level increases:
1. **Level 1-4**: Bronze scimitar (1321)
2. **Level 5-9**: Iron scimitar (1323)
3. **Level 10-19**: Steel scimitar (1325)
4. **Level 20-29**: Mithril scimitar (1329)
5. **Level 30-39**: Adamant scimitar (1331)
6. **Level 40+**: Rune scimitar (1333)

### Armor Set
- Leather body, chaps, vambraces, boots
- Iron full helm → Steel full helm upgrade

### Combat Style Strategy
Balanced training approach:
- Train Strength to 10, then Attack to 10, then Defence to 10
- Repeat pattern for each tier (20, 30, 40)
- Prioritizes Strength for DPS (damage per second)

### Training Areas
Three overlapping areas in Lumbridge cow field:
- **COW_AREA_1**: WorldArea(3234, 3254, 11x11, plane 0)
- **COW_AREA_2**: WorldArea(3238, 3264, 13x16, plane 0)
- **COW_AREA_3**: WorldArea(3244, 3274, 32x14, plane 0)

### Food Management
- Uses Lobsters (item ID 379) for healing
- Eats when health drops below 45%
- Withdraws 100 lobsters from bank

### Banking Logic
1. Walks to nearest bank
2. Deposits all inventory and equipment
3. Checks for required supplies
4. If missing items, switches to BUYING mode
5. Withdraws weapon, armor, food, and 500 coins

### NPC Targeting
Smart cow selection:
- Targets cows not already in combat
- Defends against cows that attack the player
- Avoids dead NPCs
- Waits during combat animations

## Code Quality Improvements
1. **Removed magic numbers**: All constants have descriptive names
2. **Eliminated array lookups**: Direct constant references
3. **Clear method names**: Self-documenting code
4. **Proper error handling**: Try-catch in execute method
5. **Logical organization**: Related functionality grouped together
6. **Type safety**: Strong typing for items, locations, and NPCs

## File Statistics
- **Original**: 1,056 lines of obfuscated code
- **Deobfuscated**: ~750 lines of clean, documented code
- **Reduction**: ~30% smaller with better readability

## Dependencies Referenced
The code references several external handlers (implementations in other files):
- `ShopHandler` - Handles Grand Exchange purchases
- `NavigationHandler` - Pathfinding and walking
- `BankHandler` - Banking operations
- `EquipmentLoadout` - Equipment preset definitions
- `HealthCalculator` - Player health percentage calculation
- `SandCrabsHandler` - Next training area after cows

## OSRS Game Knowledge Applied
- **Skill training**: Attack, Strength, Defence progression
- **Combat styles**: Accurate (Attack XP), Aggressive (Strength XP), Defensive (Defence XP)
- **Equipment requirements**: Level requirements for scimitars (1, 5, 10, 20, 30, 40)
- **Food mechanics**: Lobsters heal 12 HP
- **Auto-retaliate**: Combat setting to automatically fight back
- **Run energy**: Toggling run when energy > 30%
- **NPC interactions**: Attack option, combat states, death animations
- **Banking**: Depositing inventory/equipment, withdrawing supplies
- **Grand Exchange**: Buying missing items with coins

## Completion Criteria
Step completes when: `Skills.getLevel(Skill.STRENGTH) >= 40`

This transitions the account to the next training phase (likely Sand Crabs or another training method).
