# SOTF Plugin - Missing Classes Investigation Report

## Summary

The SOTF plugin imports from an obfuscated package `o.c.k.i.-.l.o.f.-.n.c.t.e.s` containing 70+ utility classes. The `clean_enhanced/sotf/` directory has deobfuscated quest step files, but they still reference these obfuscated utility classes.

## Source Locations

- **Original obfuscated**: `/home/user/Squire/DeobfuscatedProject/plugins/deobfuscated/7c1d3521-d222-494e-8c51-697efca0674b/`
- **Full deobfuscated**: `/home/user/Squire/DeobfuscatedProject/plugins/deobfuscated_full/7c1d3521-d222-494e-8c51-697efca0674b/o/c/k/i/-/l/o/f/-/n/c/t/e/s/`
- **Clean enhanced**: `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/`

## Classes Found in `deobfuscated_full/`

### ac - QuestStep Interface (FOUND)
**File**: `deobfuscated_full/.../ac.java` (18 lines)
```java
public interface ac {
    boolean ae();  // Check if prerequisites are met
    boolean ah();  // Check if step is complete
    int af();      // Execute step, return sleep duration in ms
    String ag();   // Get step name for logging
    default boolean ez() { return true; }  // Unknown, defaults to true
}
```
**Deobfuscated Name**: `QuestStep` interface

### a - BankingUtil Class (FOUND)
**File**: `deobfuscated_full/.../a.java` (487 lines)
**Methods**:
- `a()` - Open nearest bank
- `a(BankLocation)` - Navigate to specific bank
- `a(int itemId, int quantity)` - Withdraw item from bank
- `a(int[] itemIds)` - Withdraw all items from array
- `b(int itemId, int quantity)` - Withdraw item as noted
- `b(int[] itemIds, int quantity)` - Withdraw from array with quantity

**Deobfuscated Name**: `BankingUtil` class

### b - ShopUtil/GrandExchangeUtil Class (FOUND)
**File**: `deobfuscated_full/.../b.java` (824 lines)
**Methods**:
- `a(List<d>)` - Process GE buy orders for list of shop items
- `a(String)` - Check if item exists in inventory
- `a(int)` - Set up GE buy offer for item ID
- `b(List<Integer>)` - Process GE sell orders
- `g()` - Close GE widget

**Static Fields**:
- `List<Integer> J` - Item IDs to buy
- `List<Integer> K` - Quantities
- `List<Integer> L` - Prices/timeouts
- `WorldPoint I` - GE location

**Deobfuscated Name**: `GrandExchangeUtil` class

### e - GameStateUtil Class (FOUND)
**File**: `deobfuscated_full/.../e.java` (very large, 32710+ tokens)
**Methods** (inferred from usage):
- `e.j(int varbitId)` - Get varbit value
- `e.c(int[] items)` - Check if inventory contains all items
- `e.c(int min, int max)` - Generate random number in range
- `e.w()` - Get current health percentage
- `e.a(HashMap, int, int)` - Process crafting/smithing
- `e.z()` - Check GE warning state
- `e.A()` - Disable GE warning
- `e.G()` - Unknown utility

**Deobfuscated Name**: `GameStateUtil` class

### f - ItemIds Constants Class (FOUND)
**File**: `deobfuscated_full/.../f.java` (380 lines)
**Static Fields** - All `int[]` arrays:
- `f.ba` - Stamina potion variants (4 items)
- `f.aX` - Prayer restore potion variants (4 items)
- `f.aT` - Equipment/gear variants (9 items)
- `f.bk` - Ring of wealth variants (5 items)
- `f.aR`, `f.aS`, `f.aU`, etc. - Various item ID arrays

**Note**: Values are XOR-obfuscated at runtime via `lIlllIllll` array

**Deobfuscated Name**: `ItemIdArrays` or `EquipmentIds` class

### g - DialogUtil Class (FOUND)
**File**: `deobfuscated_full/.../g.java` (323 lines)
**Methods**:
- `g.a(String[] options)` - Choose dialog options
- `g.a(String npcName, String[] options)` - Talk to NPC and choose options
- `g.a(String npcName, String[] options, boolean walk)` - Talk with walk option
- `g.b(String npcName, String[] options)` - Alternative talk method
- `g.M()` - Check if conversation window is open

**Deobfuscated Name**: `DialogUtil` class

## Classes NOT Found (Must Be Reconstructed)

### d - ShopItem Data Class (MISSING)
**Usage Pattern** (from 20+ occurrences):
```java
new d(itemId, quantity, timeout)
// Examples:
new d(PLANK, 3, 17406)
new d(STEEL_NAILS, 90, j.cf)
new d(ROPE_ID, 14, 0x315)
```

**Methods Called** (from b.java):
- `d.p()` - Returns item ID (int)
- `d.q()` - Returns quantity (int)
- `d.r()` - Returns timeout/price (int)

**Reconstructed Class**:
```java
public class d {
    private int itemId;
    private int quantity;
    private int timeout;

    public d(int itemId, int quantity, int timeout) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.timeout = timeout;
    }

    public int p() { return itemId; }
    public int q() { return quantity; }
    public int r() { return timeout; }
}
```

**Deobfuscated Name**: `ShopItem` or `GEItem` class

### j - Constants Class (MISSING)
**Usage Pattern**:
```java
j.cf  // Used as timeout parameter value
// Examples:
new d(STEEL_NAILS, 90, j.cf)
new d(32665, 20, j.cf)
new CompanionData(0, 0, j.cf)
```

**Reconstructed Class**:
```java
public class j {
    public static final int cf = 17424;  // Common timeout value (guessed from context)
}
```

**Deobfuscated Name**: `Constants` class

## Other Obfuscated Classes Referenced

From imports in SOTF files, these additional classes exist in `deobfuscated_full/`:
- `c`, `h`, `i`, `k`, `l`, `m`, `n`, `o`, `p`, `q`, `r`, `s`, `t`, `u`, `v`, `w`, `x`, `y`, `z`
- `A` through `Z` (uppercase)
- `aA` through `aN` (extended)
- `aa` through `az`

Each appears to be a utility or quest step handler. Full deobfuscation would require analyzing each file.

## Framework Comparison

### Standard Squire Framework (autotoa/cox)
```java
@TaskDesc(name="TaskName", priority=10, blocking=true)
public class SomeTask extends Task {
    public boolean run() { ... }
}
```

### SOTF Framework (obfuscated)
```java
public class SomeStep implements ac {
    public boolean ae() { ... }  // Prerequisites check
    public int af() { ... }      // Execute, return sleep time
    public String ag() { ... }   // Get name
    public boolean ah() { ... }  // Completion check
}
```

## Recommendations

### Option 1: Create Deobfuscated Framework Classes
Create human-readable versions in `clean_enhanced/sotf/framework/`:
- `QuestStep.java` - Interface replacing `ac`
- `ShopItem.java` - Data class replacing `d`
- `ItemIdArrays.java` - Constants replacing `f`
- `BankingUtil.java` - Utility replacing `a`
- `GrandExchangeUtil.java` - Utility replacing `b`
- `GameStateUtil.java` - Utility replacing `e`
- `DialogUtil.java` - Utility replacing `g`
- `Constants.java` - Constants replacing `j`

### Option 2: Copy and Clean From deobfuscated_full
1. Copy files from `deobfuscated_full/.../o/c/k/i/-/l/o/f/-/n/c/t/e/s/`
2. Rename to clean package: `gg.squire.sotf.framework`
3. Decode XOR constants and encrypted strings
4. Rename methods to meaningful names

### Option 3: Update Imports Only
Update all SOTF files to use proper imports pointing to the `deobfuscated_full` location, accepting the obfuscated class names.

## Files Requiring Import Updates

All files in `clean_enhanced/sotf/` that import from `o.c.k.i.-.l.o.f.-.n.c.t.e.s`:
- `SotfQuestManager.java`
- `SquireSotfBuilder.java`
- All files in `steps/` directory (80+ files)

Each needs either:
1. Updated imports to deobfuscated framework classes
2. Or removal of obfuscated imports if not used

## Next Steps

1. Create `clean_enhanced/sotf/framework/` directory
2. Implement reconstructed `ShopItem` (d) and `Constants` (j) classes
3. Copy and clean utility classes from `deobfuscated_full`
4. Update all SOTF file imports to use new framework package
