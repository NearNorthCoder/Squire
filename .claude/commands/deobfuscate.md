# Squire Plugin Deobfuscation Guide

## Project Overview

**Squire** is an OSRS (Old School RuneScape) botting client built on RuneLite/Unethicalite. The `DeobfuscatedProject/plugins/` directory contains plugins that were originally obfuscated and are being converted to clean, readable code.

### Key APIs Used
- `net.runelite.api.*` (Client, Player, NPC, Skill, World, widgets, coords)
- `net.unethicalite.api.*` (entities, game, items, movement, widgets, input)
- `net.unethicalite.client.Static` (getClient())
- `gg.squire.*` (Squire-specific APIs)

---

## CRITICAL PRINCIPLE

**NEVER CREATE NEW CLASSES/METHODS** - This is a working project. All obfuscated classes, methods, and fields exist somewhere in the codebase, just with obfuscated names. Always:
1. Search for where obfuscated items are defined
2. Understand their purpose from context
3. Rename in place
4. Update all references

---

## Directory Structure

```
DeobfuscatedProject/plugins/
├── clean_enhanced/          # TARGET: Clean deobfuscated code
│   ├── autotoa/            # Auto TOA (Tombs of Amascut) plugin
│   │   ├── tasks/          # Task implementations
│   │   │   ├── ConsumableManager.java  # Manages consumables (was type C)
│   │   │   ├── TOAItemType.java        # TOA item enum (was GameEnum12/e)
│   │   │   ├── CombatPotion.java       # Combat potions (was GameEnum11/a)
│   │   │   ├── KephriManager.java      # Base task class
│   │   │   └── *.java                  # Individual tasks
│   │   └── gg/squire/autotoa/
│   │       ├── SquireAutoTOA.java      # Main plugin class
│   │       └── TOAConfig.java          # Configuration
│   └── sotf/               # SOTF (Sins of the Father) quest plugin
│       ├── framework/      # Utility classes (BankingUtil, DialogUtil, etc.)
│       ├── steps/          # Quest step implementations
│       └── util/           # Additional utilities
├── deobfuscated_full/      # Reference: Full decompiled code
└── src/                    # Reference: Original obfuscated source
```

---

## Completed Work (Phases 1-4)

### Auto TOA
- ✅ `extends AutotoaManager` → `extends KephriManager`
- ✅ Constructor parameter `z z2` → `ToaPlugin plugin`
- ✅ Method `bl()` → `shouldExecute()`, `r()` → `reset()`
- ✅ Field references: `aY` → `plugin`, `cW` → `config`, `cu` → `client`
- ✅ Type `C` → `ConsumableManager` (created new class)
- ✅ Method `.am()` → `.canConsumeItem()`, `.ao()` → `.recordConsumption()`
- ✅ Method `.av()` → `.getSupplyQuantity()`, `.al()` → `.canUseItem()`, `.an()` → `.recordItemUse()`
- ✅ `GameEnum12` → `TOAItemType`, `.d(id)` → `.hasItemId(id)`
- ✅ `GameEnum11` / type `a` → `CombatPotion`
- ✅ `this.d.dehydration()` → `this.config.dehydration()`

### SOTF
- ✅ Imports `o.c.k.i.-.l.o.f.-.n.c.t.e.s.*` → `gg.squire.sotf.framework.*`
- ✅ `implements ac` → `implements QuestStep`
- ✅ Methods: `ae()` → `arePrerequisitesMet()`, `af()` → `execute()`, `ag()` → `getName()`, `ah()` → `isComplete()`
- ✅ Framework classes created: `BankingUtil`, `DialogUtil`, `GameStateUtil`, `GrandExchangeUtil`

---

## Remaining Work

### Auto TOA - Inherited Methods (in KephriManager/parent class)

| Obfuscated | Suggested Name | Purpose |
|------------|----------------|---------|
| `bc()` | `isInCombatArea()` | Checks if in combat/boss area |
| `aq()` | `isInSpecialWeaponMode()` | Checks special weapon mode regions |
| `bf()` | `isBossFightActive()` | Checks if boss NPC is present |
| `be()` | `isBossAnimating()` | Checks boss animation state |
| `this.plugin.e()` | `isPaused()` | Checks if plugin is paused |

Files affected: DrinkingBrewTask, ApplyingSilkTask, SmellingSaltsTask, DrinkingPotionTask, CuringPoisonvenomTask, DrinkingAmbrosiaTask, DroppingUnnecessarySuppliesTask

### Auto TOA - Complex Tasks

`AttackingAkkhaButterflyTask.java` has many internal obfuscated methods:
- `bu()`, `bp()`, `bv()`, `J()`, `g()`, `bx()`, `br()`, `a()`
- Uses obfuscated type `o` for butterfly mechanic

### SOTF - Step Files (36 files)

Step files still use obfuscated utility calls instead of framework classes:

| Obfuscated | Framework Class | Methods |
|------------|-----------------|---------|
| `a.a()` | `BankingUtil` | `openNearestBank()`, `navigateToBank()`, `withdrawItem()` |
| `g.a()` | `DialogUtil` | `handleDialog()`, `talkToNpc()`, `isConversationOpen()` |
| `e.l()` | (Equipment) | `equipItem()` |
| `f.ba`, `f.bk` | (Constants) | Item ID constants |

---

## Key Class Mappings

```
# Auto TOA
C → ConsumableManager       (consumable management)
e → TOAItemType            (TOA supply items enum)
a → CombatPotion           (combat potions enum)
Z → KephriManager base     (task base class)
z → SquireAutoTOA          (main plugin class)

# SOTF
ac → QuestStep             (quest step interface)
g → DialogUtil             (dialog handling)
a → BankingUtil            (banking operations)
e → GameStateUtil          (game state utilities)
```

---

## Useful Search Commands

```bash
# Find remaining type C references
grep -rn "final C " DeobfuscatedProject/plugins/clean_enhanced/

# Find remaining GameEnum references
grep -rn "GameEnum\d+" DeobfuscatedProject/plugins/clean_enhanced/

# Find obfuscated method calls
grep -rn "\.bc()\|\.aq()\|\.bf()\|\.be()" DeobfuscatedProject/plugins/clean_enhanced/autotoa/

# Find obfuscated plugin method calls
grep -rn "plugin\.e()" DeobfuscatedProject/plugins/clean_enhanced/autotoa/

# Find SOTF obfuscated utility calls
grep -rn "\ba\.\w\+(\|\bg\.\w\+(" DeobfuscatedProject/plugins/clean_enhanced/sotf/steps/

# Find malformed package imports
grep -rn "o\.c\.k\.i\.-\." DeobfuscatedProject/plugins/clean_enhanced/
```

---

## Verification Commands

```bash
# Verify no remaining type C
grep -rn "final C " DeobfuscatedProject/plugins/clean_enhanced/

# Verify no malformed packages
grep -rn "o\.c\.k\.i\.-\." DeobfuscatedProject/plugins/clean_enhanced/

# Count remaining single-letter methods in tasks
grep -c "public.*[a-z][A-Z]()" DeobfuscatedProject/plugins/clean_enhanced/autotoa/tasks/*.java

# Check for any remaining this.d. references (config)
grep -rn "this\.d\." DeobfuscatedProject/plugins/clean_enhanced/
```

---

## Important Reference Files

### Auto TOA
- **ConsumableManager**: `clean_enhanced/autotoa/tasks/ConsumableManager.java`
- **TOAItemType enum**: `clean_enhanced/autotoa/tasks/TOAItemType.java`
- **CombatPotion enum**: `clean_enhanced/autotoa/tasks/CombatPotion.java`
- **Class mappings**: `clean_enhanced/autotoa/CLASS_MAPPINGS.json`
- **Original C class**: `deobfuscated_full/581bf999.../q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/C.java`
- **Original Z class (KephriManager)**: `src/581bf999.../q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/Z.java`

### SOTF
- **BankingUtil**: `clean_enhanced/sotf/framework/BankingUtil.java`
- **DialogUtil**: `clean_enhanced/sotf/framework/DialogUtil.java`
- **GameStateUtil**: `clean_enhanced/sotf/framework/GameStateUtil.java`
- **QuestStep interface**: `clean_enhanced/sotf/framework/QuestStep.java`

---

## Approach for Next Phase

### Priority 1: Fix Inherited Methods in KephriManager
1. Read `src/581bf999.../q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/Z.java` (original base class)
2. Understand each obfuscated method (`bc`, `aq`, `bf`, `be`)
3. Add properly named methods to `KephriManager` or update task files

### Priority 2: Fix Plugin.e() Method
1. Find `SquireAutoTOA.e()` method definition
2. Rename to `isPaused()` or similar
3. Update all references in task files

### Priority 3: SOTF Step File Updates
1. For each of 36 step files:
   - Replace `a.a(...)` with `BankingUtil.*`
   - Replace `g.a(...)` with `DialogUtil.*`
   - Replace `e.l(...)` with proper equip method
   - Replace `f.ba`, `f.bk` with proper constants

### Priority 4: Complex Task Deobfuscation
1. Work through `AttackingAkkhaButterflyTask.java` and similar complex tasks
2. Identify and rename internal obfuscated methods
3. Document any new patterns discovered

---

## Success Criteria

1. **No obfuscated type references** - All single-letter types mapped to proper names
2. **No obfuscated method calls** - All `.bc()`, `.aq()`, etc. renamed
3. **No obfuscated imports** - All `GameEnum*` imports replaced
4. **SOTF framework integration** - All step files use framework classes
5. **Code functionality preserved** - Same behavior, readable names
