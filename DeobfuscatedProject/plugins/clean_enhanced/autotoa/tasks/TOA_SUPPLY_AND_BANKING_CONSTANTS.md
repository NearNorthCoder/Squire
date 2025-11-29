# TOA Supply and Banking Constants

This document catalogs all item IDs, widget IDs, and object IDs discovered during deobfuscation of the TOA supply and banking task files.

## File: WithdrawingSuppliesTask.java

### Purpose
Manages withdrawal of TOA consumable supplies from the Supplies container during raids.

### TOA Supply Item IDs

All TOA supplies exist in multiple dose variants (4-dose, 3-dose, 2-dose, 1-dose).

#### Tears of Elidinis (Prayer Restore)
- **Item IDs**: 27327, 27329, 27331, 27333
- **Hex**: 0x6ABF, 0x6AC1, 0x6AC3, 0x6AC5
- **Purpose**: Restores prayer points
- **Priority**: 6 (lowest - withdrawn last)

#### Nectar (Health Restore)
- **Item IDs**: 27315, 27317, 27319, 27321
- **Hex**: 0x6AB3, 0x6AB5, 0x6AB7, 0x6AB9
- **Purpose**: Restores hitpoints
- **Priority**: 4

#### Smelling Salts (Combat Boost)
- **Item IDs**: 27343, 27345
- **Hex**: 0x6ACF, 0x6AD1
- **Purpose**: Provides combat stat boost
- **Priority**: 1 (highest - withdrawn first)

#### Liquid Adrenaline (Special Attack Restore)
- **Item IDs**: 27339, 27341
- **Hex**: 0x6ACB, 0x6ACD
- **Purpose**: Restores special attack energy
- **Priority**: 2

#### Ambrosia (Stat Restore)
- **Item IDs**: 27347, 27349
- **Hex**: 0x6AD3, 0x6AD5
- **Purpose**: Restores combat stats
- **Priority**: 3

#### Blessed Crystal Scarab
- **Item IDs**: 27335, 27337
- **Hex**: 0x6AC7, 0x6AC9
- **Purpose**: Special consumable for TOA
- **Note**: Not explicitly handled in withdrawal priority

#### Silk Dressing (Healing Over Time)
- **Item IDs**: 27323, 27325
- **Hex**: 0x6ABB, 0x6ABD
- **Purpose**: Provides healing over time
- **Priority**: 5

### String Constants

#### Container and Actions
- **Supplies Container Name**: "Supplies"
- **Action - Open**: "Open"
- **Action - Withdraw All**: "Withdraw All"

#### Potion Filtering
- **Restore Potion Keyword**: "restore"
- **Prayer Potion Keyword**: "prayer"
- **Sanfew Serum Keyword**: "sanfew" (excluded from dropping)

### Withdrawal Priority Order
1. Smelling Salts (combat boost) - Priority 1
2. Liquid Adrenaline (spec restore) - Priority 2
3. Ambrosia (stat restore) - Priority 3
4. Nectar (health restore) - Priority 4
5. Silk Dressing (healing over time) - Priority 5
6. Tears of Elidinis (prayer restore) - Priority 6

### Inventory Management Logic
- Drops prayer potions (restore/prayer) to make space
- **Exception**: Never drops Sanfew serum (cures poison/venom AND restores prayer)
- Withdraws all prayer restores when inventory has >1 free slot and prayers are active
- Only operates when in special weapon mode (`isInSpecialWeaponMode()`)

---

## File: ClaimingDeathItemsTask.java

### Purpose
Recovers items from the death chest after dying in TOA (Theatre of Amascut/Tombs of Amascut).

### Widget IDs

#### Death Chest Interface
- **Widget Group ID**: 602 (0x25A)
- **Main Child Widget**: 3
- **Action Child Widget**: 6 (for Unlock/Take-All actions)

### Object IDs

#### Death Storage
- **Death Chest Object ID**: 46078 (0xB3FE)

### Action Strings
- **Claim**: "Claim" - Used to open death chest
- **Unlock**: "Unlock" - Unlocks the death chest if locked
- **Take-All**: "Take-All" - Takes all items from death chest

### Chat Messages
- **Death Detection**: "You failed to survive the Tombs"
  - Triggers the death recovery process
  - Sets `hasDied` flag to true

### Rune Pouch Configuration

#### Item Names
- **Divine Rune Pouch**: "Divine rune pouch"
- **Regular Rune Pouch**: "rune pouch"
- **Rune Item Suffix**: "rune"

#### Capacity
- **Regular Rune Pouch**: 3 slots
- **Divine Rune Pouch**: 4 slots

### Inventory Management Logic

The task manages inventory space before claiming death items using these strategies:

1. **Equip Kephri Melee Gear**
   - Equips configured Kephri melee setup from `config.kephriMelee()`
   - Frees inventory slots by moving items to equipment slots

2. **Fill Rune Pouch**
   - Consolidates loose runes into rune pouch
   - Checks for empty rune pouch slots
   - Adds runes one at a time until pouch is full
   - Handles both regular (3-slot) and divine (4-slot) rune pouches

### Death Recovery Flow

1. **Death Detection**: Chat message listener detects death
2. **Inventory Space**: Creates space by equipping gear or filling rune pouch
3. **Open Death Chest**: Interacts with death chest object (ID 46078)
4. **Unlock (if needed)**: Unlocks chest using widget action
5. **Take All Items**: Uses "Take-All" action on widget
6. **Dialog Handling**: Handles any confirmation dialogs
7. **Reset State**: Sets `hasDied` to false when complete

### Special Handling
- **Bank PIN**: Waits if bank PIN window is open
- **Dialog Options**: Automatically chooses option 2 in dialog menus
- **Widget Visibility**: Checks if death chest widgets are visible before interacting

---

## Related Classes

### TOAConsumableManager (formerly class C)
- Manages consumable usage tracking
- Tracks supply quantities via `getSupplyQuantity()`
- Checks if supplies container is open via `isSuppliesContainerOpen()`
- Withdraws supplies via `withdrawSupply(supplyType)`

### TOAEquipmentManager (formerly class z)
- Manages equipment setup and switching
- Gets equipment item IDs via `getEquipmentItemIds(setup)`
- Equips items via `equipItems(itemIds)`

### TOASupplyType (formerly enum e / GameEnum12)
- Enum representing each TOA supply type
- Contains list of item IDs for each supply (multiple doses)
- Provides `hasItemId(id)` method to check if an ID matches the supply type

### TOAConfigurableTask (formerly class ck)
- Base class for TOA tasks that need config access
- Provides `validate()` method for task logic
- Extends `TOATaskInfrastructure`

---

## Usage Notes

### WithdrawingSuppliesTask
- **Priority**: 5000 (high priority)
- **Blocking**: Yes
- **Trigger**: When Supplies container is in inventory
- **Dependencies**: Requires TOAConsumableManager instance

### ClaimingDeathItemsTask
- **Priority**: 100
- **Blocking**: Yes
- **Register**: Yes (subscribes to chat events)
- **Trigger**: After death in TOA (chat message detection)
- **Dependencies**: Requires TOAEquipmentManager instance

---

## Technical Implementation Details

### Obfuscation Patterns Decoded

1. **Bitwise Operations**: Constants were obfuscated using XOR, AND, and NOT operations
2. **Negative Values**: Some values used two's complement negation
3. **String Encoding**: String arrays stored action names and item keywords
4. **Control Flow**: Boolean methods with single operators (var5, var6, etc.)

### Example Deobfuscation
```java
// Obfuscated:
var2[5] = 0xFFFFF7FE & 0xBBFF;

// Calculated:
0xFFFFF7FE & 0xBBFF = 0xB3FE = 46078 (Death Chest Object ID)
```

---

## References

- **OSRS Wiki - Tombs of Amascut**: https://oldschool.runescape.wiki/w/Tombs_of_Amascut
- **Supply Items**: All supplies obtained from ToA reward chest and supply cache
- **Death Storage**: Standard OSRS death storage mechanics apply

---

*Document generated during deobfuscation of Squire AutoTOA plugin*
*Date: 2025-11-29*
