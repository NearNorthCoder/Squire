# Deobfuscation Report: BankAndPrepareSuppliesStep.java

## Original File
- **Path**: `/home/user/Squire/DeobfuscatedProject/plugins/deobfuscated/7c1d3521-d222-494e-8c51-697efca0674b/o/c/k/i/-/l/o/f/-/n/c/t/e/s/aJ.java`
- **Original Class Name**: `aJ`
- **Original Package**: `o.c.k.i.-.l.o.f.-.n.c.t.e.s`

## Deobfuscated File
- **Path**: `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/steps/BankAndPrepareSuppliesStep.java`
- **New Class Name**: `BankAndPrepareSuppliesStep`
- **New Package**: `gg.squire.sotf.steps`

## Purpose
This step handles banking and supply preparation for the SOTF (Sins of the Father) quest in OSRS. It manages:
- Building a shopping list of required quest items
- Banking operations (deposit all inventory/equipment)
- Withdrawing necessary supplies
- Using consumables (stamina potions, prayer potions, food)
- Navigating to the quest start location

## Key Deobfuscations

### XOR-Encoded Constants Decoded
The original code used heavily XOR-obfuscated integer arrays. Here are the key decoded values:

| Original Obfuscation | Decoded Value | Purpose |
|---------------------|---------------|---------|
| `lIlllllIll[0]` | `1` | Array index / quantity |
| `lIlllllIll[1]` | `0` | Array index |
| `lIlllllIll[2]` | `3000` | Bank open timeout (ms) |
| `lIlllllIll[3]` | `2` | Tick delay medium |
| `lIlllllIll[4]` | `4` | Tick delay long |
| `lIlllllIll[5]` | `12625` | Stamina potion ID |
| `lIlllllIll[6]` | `2355` | Silver bar ID |
| `lIlllllIll[10]` | `161` | Min run energy threshold |
| `lIlllllIll[11]` | `24` | Min prayer points threshold |
| `lIlllllIll[15]` | `6` | Navigation distance threshold |
| `lIlllllIll[17]` | `9177` | Crossbow item ID |
| `lIlllllIll[20]` | `221` | Silver bar ID (alternate) |
| `lIlllllIll[32]` | `72` | Quest step tick delay |

### String Decryption Results
The original code used Blowfish/DES encryption for strings. Decoded strings:

| Original Variable | Decoded String |
|------------------|----------------|
| `lIlllllIIl[0]` | "Finished buying items, switching back to quest" |
| `lIlllllIIl[1]` | "Nav to bank" |
| `lIlllllIIl[2]` | "Handling banking" |
| `lIlllllIIl[3]` | "We are missing quest supplies, switching to BUYING" |
| `lIlllllIIl[4]` | "Drink" |
| `lIlllllIIl[6]` | "Shark" |
| `lIlllllIIl[8]` | "Eat" |
| `lIlllllIIl[9]` | "Nav to start" |
| `lIlllllIIl[11]` | "" (empty string) |
| `lIlllllIIl[34]` | "ring of wealth (" |
| `lIlllllIIl[35]` | "Yes." |

### Method Renamings

| Original Name | New Name | Purpose |
|--------------|----------|---------|
| `gY()` | `executeBankingAndPreparation()` | Main execution logic |
| `an()` | `hasRequiredItems()` | Checks if required items are in inventory |
| `Q()` | `buildShoppingList()` | Builds list of items to buy |
| `af()` | `af()` | Returns tick delay (interface method) |
| `ag()` | `ag()` | Returns step name (interface method) |
| `ah()` | `ah()` | Checks if step should execute (interface method) |
| `ae()` | `ae()` | Checks if step is complete (interface method) |

### Field Renamings

| Original Name | New Name | Purpose |
|--------------|----------|---------|
| `bv` | `shoppingList` | List of items to purchase |
| `bt` | `isPrepared` | Whether supplies are prepared |
| `pN` | `currentQuestStep` | Current quest progression step |
| `de` | `startLocation` | Quest start location coordinates |
| `cE` | `dialogOptions` | Dialog options for NPC interactions |
| `lIlllllIll` | Replaced with named constants | XOR-obfuscated integer array |
| `lIlllllIIl` | Replaced with string literals | Encrypted string array |

### Control Flow Deobfuscation

1. **Removed obfuscated boolean checks**:
   - `lIlIIIIlIlIIl(bt ? 1 : 0)` → `!isPrepared`
   - `lIlIIIIlIlIll(x)` → `x == 0` → Direct boolean usage

2. **Simplified comparison methods**:
   - Removed methods like `lIlIIIIlIlIlI(int a, int b)` which just did `a < b`
   - Replaced with direct comparisons

3. **Cleaned up unreachable code**:
   - Removed dead code branches like `if (2 > 0) continue;`
   - Removed obfuscation artifacts like `0;` statements

## OSRS Game Mechanics Documented

### Banking System
- **Bank Locations**: Uses `BankLocation.getNearest()` to find closest bank
- **Bank Operations**:
  - `Bank.depositInventory()` - Deposits all inventory items
  - `Bank.depositEquipment()` - Deposits all equipped items
  - `Bank.contains()` - Checks if bank contains specific items
  - `Bank.getFirst()` - Gets first matching item from bank

### Consumables
- **Stamina Potions**: Restore run energy. Used when run energy < threshold
- **Prayer Potions**: Restore prayer points. Used when prayer points < threshold
- **Food (Sharks)**: Restore hitpoints. Used when health < 60%

### Quest System
- **Quest Varbits**: Track quest progress via varbit values
- **X Marks the Spot**: Tutorial quest that must be completed first (varbit value 6 = complete)

### Movement
- **Run Energy**: Ranges from 0-100, depletes while running
- **Navigation**: Uses `Movement.walkTo()` to path to coordinates
- **Distance Checks**: Uses `WorldPoint.distanceTo()` to check proximity

### Dialog System
- **Dialog Options**: Player can choose dialog responses
- **Dialog.close()**: Closes dialog windows to prevent blocking

## Shopping List Items

The quest requires these items to be purchased if not in bank:

1. **Crossbow** (ID: 9177) - Quantity: 2
2. **Silver Bars** (ID: 221) - Quantity: varies
3. **Ring of Wealth** - Quantity: varies (identified by name)
4. **Teleport Tablets** (ID: 16342) - Quantity: 1
5. **Varrock Teleports** (ID: 8007) - Quantity: 4+
6. **Teleport to House** (ID: 8013) - Quantity: 20+
7. **Stamina Potions** (ID: 12625) - Quantity: 15+

Each item has an associated price/cost value for the Grand Exchange purchasing system.

## Code Quality Improvements

1. **Added comprehensive Javadoc comments** explaining:
   - Class purpose and responsibilities
   - Method behaviors and parameters
   - OSRS game mechanics context
   - Return values and side effects

2. **Replaced magic numbers with named constants**:
   - All item IDs are now named constants
   - Thresholds and timings have descriptive names
   - Array sizes use constants instead of literals

3. **Improved code readability**:
   - Descriptive variable names instead of obfuscated identifiers
   - Logical grouping of related constants
   - Clear separation of concerns

4. **Removed obfuscation artifacts**:
   - Eliminated unnecessary wrapper methods
   - Removed dead code and unreachable branches
   - Simplified boolean logic

## Implementation Notes

- The step implements the `ac` interface (quest step interface)
- Returns tick delay of 72 to control execution frequency
- Never marks itself as complete (returns false from `ae()`)
- Only executes after X Marks the Spot quest is complete
- Uses shared utility classes (`a`, `b`, `e`, `f`, `g`, `j`) for common operations

## Dependencies on Other Obfuscated Classes

Still references obfuscated classes that need deobfuscation:
- `a` - Banking/withdrawal utilities
- `b` - Shopping list manager
- `d` - Shopping list item data structure
- `e` - Health/stat checking utilities
- `f` - Item ID constants (contains `ba` for stamina, `aX` for prayer potions)
- `g` - Dialog interaction utilities
- `j` - Additional constants (contains `cf` field)
