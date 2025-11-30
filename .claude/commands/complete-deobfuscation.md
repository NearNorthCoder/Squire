# Complete Deobfuscation of Auto TOA and SOTF Plugins - Phase 4

## CRITICAL PRINCIPLE

**NEVER CREATE NEW CLASSES/METHODS** - This is a working project. All obfuscated classes, methods, and fields exist somewhere in the codebase, just with obfuscated names. Always:
1. Search for where obfuscated items are defined
2. Understand their purpose from context
3. Rename in place
4. Update all references

## Project Context

**Squire** is an OSRS (Old School RuneScape) botting client built on RuneLite/Unethicalite. The `DeobfuscatedProject/plugins/` directory contains plugins that were originally obfuscated and are being converted to clean, readable code.

### Key APIs Used
- `net.runelite.api.*` (Client, Player, NPC, Skill, World, widgets, coords)
- `net.unethicalite.api.*` (entities, game, items, movement, widgets, input)
- `net.unethicalite.client.Static` (getClient())
- `gg.squire.*` (Squire-specific APIs)

---

## WORK COMPLETED (Phases 1-3)

### Auto TOA (71 files)
- ✅ `extends AutotoaManager` → `extends KephriManager`
- ✅ Constructor parameter `z z2` → `ToaPlugin plugin`
- ✅ Method `bl()` → `shouldExecute()`, `r()` → `reset()`
- ✅ Field references: `aY` → `plugin`, `cW` → `config`, `cu` → `client`
- ✅ Type `C` → `ConsumableManager` in some consumable tasks
- ✅ Method `.am()` → `.canConsumeItem()`, `.ao()` → `.recordConsumption()`
- ✅ `this.cm.a()` → `this.regionHelper.isInRegions()` in prayer tasks
- ✅ `this.cm.b()` → `this.regionHelper.getTargetNpc()` in prayer tasks

### SOTF (45 files)
- ✅ Imports `o.c.k.i.-.l.o.f.-.n.c.t.e.s.*` → `gg.squire.sotf.framework.*`
- ✅ `implements ac` → `implements QuestStep`
- ✅ Methods: `ae()` → `arePrerequisitesMet()`, `af()` → `execute()`, `ag()` → `getName()`, `ah()` → `isComplete()`
- ✅ Renamed 15 obfuscated step files to proper quest names
- ✅ Renamed 33+ single-letter task classes in SotfQuestManager.java
- ✅ Renamed trainer classes: `aE` → `ThievingTrainer`, `av` → `AgilityTrainer`, etc.
- ✅ `QuestStepInterface` → `QuestStep` in CookingStep, CraftingGlassblowingStep, LostCityQuestStep

---

## REMAINING ISSUES - AUTO TOA

### Location: `DeobfuscatedProject/plugins/clean_enhanced/autotoa/`

### 1. CRITICAL: Type `C` Still Used in 5+ Files
These files still reference obfuscated type `C` instead of `ConsumableManager`:
- `tasks/CuringPoisonvenomTask.java`
- `tasks/CrackingScarabTask.java`
- `tasks/ApplyingSilkTask.java`
- `tasks/SmellingSaltsTask.java`
- `tasks/DroppingUnnecessarySuppliesTask.java`

**Pattern to fix:**
```java
// FIND:
private final C consumableManager;
@Inject protected TaskName(Client client, C consumableManager, ...)

// REPLACE WITH:
private final ConsumableManager consumableManager;
@Inject protected TaskName(Client client, ConsumableManager consumableManager, ...)
```

### 2. CRITICAL: Find `regionHelper` Field Definition
In prayer task files, we renamed `this.cm` to `this.regionHelper`, but need to verify:
- Where is this field defined? (likely in `KephriManager` or `TOATaskBase`)
- What is the actual class type?

**Files affected:**
- `HandlingZebakPrayersTask.java`
- `HandlingBabaPrayersTask.java`
- `HandlingTumekenP3PrayersTask.java`
- `HandlingElidinisP3PrayersTask.java`

### 3. TOAConfig.java Obfuscated Return Types
**File:** `SquireAutoTOA.java` or `TOAConfig.java`
Methods returning obfuscated enum types:
- `u()`, `l()`, `w()`, `t()` - return single-letter enum types

### 4. Obfuscated Methods in Task Files
These methods are inherited from `KephriManager` (defined in `AutotoaManager.java`):

| Method | Suggested Name | Used In |
|--------|----------------|---------|
| `bc()` | `isInCombatArea()` | SmellingSaltsTask, DrinkingPotionTask |
| `aq()` | `isSpecialWeaponMode()` | DrinkingAmbrosiaTask, SmellingSaltsTask |
| `bf()` | `isBossFightPhase()` | DrinkingAmbrosiaTask |
| `bL()` | `shouldPerformAction()` | Multiple tasks |
| `g()` | `getGameState()` | Multiple tasks |
| `J()`, `M()`, `N()` | Unknown | Multiple tasks |

### 5. GameEnum12 Class References
Pattern `GameEnum12.NECTAR.d(item.getId())` and `GameEnum12.AMBROSIA.d(item.getId())`:
- Need to find `GameEnum12` definition
- Rename `.d()` method to descriptive name like `.hasItemId()`

---

## REMAINING ISSUES - SOTF

### Location: `DeobfuscatedProject/plugins/clean_enhanced/sotf/`

### 1. Framework Utility Classes Need Deobfuscation
Located in `sotf/framework/` or `sotf/util/`:

| Obfuscated | Likely Name | Methods |
|------------|-------------|---------|
| `g` | `DialogUtil` | `.a()` - handle dialog |
| `a` | `BankingUtil` | `.a()` - banking operations |
| `e` | `GameStateUtil` | `.A()`, `.y()` |

**Example pattern in step files:**
```java
// Current:
g.a();  // Dialog handling
a.a();  // Banking operation

// Should be:
DialogUtil.handleDialog();
BankingUtil.performBanking();
```

### 2. Single-Letter Methods in Framework Classes
Many framework classes have single-letter static methods:
- `ThievingTrainer.train()` was `aE.gm()` - ✅ fixed
- But internal methods may still be obfuscated

### 3. Quest Helper Classes
These quest/trainer classes exist but may have internal obfuscation:
- `AnimalMagnetismQuest.execute()` - was `w.bf()`
- `DarknessOfHallowvaleQuest.execute()` - was `y.bl()`
- Internal methods like `bp()`, `bq()` still obfuscated

---

## KEY REFERENCE FILES

### Auto TOA Architecture
```
SquireAutoTOA.java          - Main plugin class
├── AutotoaManager.java     - Contains KephriManager base class
│   └── KephriManager       - Abstract base for all tasks (line 47)
├── TOATaskBase.java        - Parent of KephriManager
└── tasks/                  - Individual task implementations
    ├── DrinkingBrewTask.java
    ├── ConsumableManager    - Type C, manages consumables
    └── ...
```

### SOTF Architecture
```
SquireSotfBuilder.java      - Main plugin class
├── SotfQuestManager.java   - Quest orchestration
├── framework/
│   ├── QuestStep.java      - Interface (was ac)
│   ├── GameStateUtil.java  - Game state utilities
│   └── ...
├── steps/                  - Quest step implementations
└── util/
    ├── BankingUtils.java
    ├── GrandExchangeHelper.java
    └── PurchaseRequest.java
```

### Class Type Mappings (Confirmed)
```
C → ConsumableManager       (Auto TOA consumable management)
ac → QuestStep              (SOTF quest step interface)
e → GameStateUtil           (SOTF game utilities)
z → SquireAutoTOA           (Auto TOA main plugin - was z2 param)
```

### Method Mappings (Confirmed)
```
# ConsumableManager (type C)
.am() → .canConsumeItem()
.ao() → .recordConsumption()
.ap() → .isBrewAvailable()

# QuestStep interface
ae() → arePrerequisitesMet()
af() → execute()
ag() → getName()
ah() → isComplete()

# KephriManager (prayer/region)
cm.a(regionIds) → regionHelper.isInRegions(regionIds)
cm.b() → regionHelper.getTargetNpc()
```

---

## SEARCH COMMANDS FOR FINDING DEFINITIONS

```bash
# Find where type C is defined (likely ConsumableManager)
grep -rn "class C " DeobfuscatedProject/plugins/
grep -rn "interface C " DeobfuscatedProject/plugins/

# Find where cm field is defined (regionHelper)
grep -rn "private.*cm" DeobfuscatedProject/plugins/clean_enhanced/autotoa/
grep -rn "protected.*cm" DeobfuscatedProject/plugins/clean_enhanced/autotoa/

# Find GameEnum12 definition
grep -rn "class GameEnum12" DeobfuscatedProject/plugins/
grep -rn "enum GameEnum12" DeobfuscatedProject/plugins/

# Find remaining obfuscated method calls
grep -rn "\.bc()" DeobfuscatedProject/plugins/clean_enhanced/autotoa/
grep -rn "\.aq()" DeobfuscatedProject/plugins/clean_enhanced/autotoa/
grep -rn "\.bf()" DeobfuscatedProject/plugins/clean_enhanced/autotoa/

# Find remaining type C references
grep -rn "final C " DeobfuscatedProject/plugins/clean_enhanced/autotoa/
grep -rn ", C " DeobfuscatedProject/plugins/clean_enhanced/autotoa/

# Find SOTF single-letter utility calls
grep -rn "g\.a(" DeobfuscatedProject/plugins/clean_enhanced/sotf/
grep -rn "a\.a(" DeobfuscatedProject/plugins/clean_enhanced/sotf/
```

---

## VERIFICATION AFTER CHANGES

```bash
# Verify no remaining type C
grep -rn "final C " DeobfuscatedProject/plugins/clean_enhanced/

# Verify no malformed packages
grep -rn "o\.c\.k\.i\.-\." DeobfuscatedProject/plugins/clean_enhanced/
grep -rn "q\.-\.t\.a\.o" DeobfuscatedProject/plugins/clean_enhanced/

# Count remaining single-letter methods
grep -c "public.*[a-z][A-Z]()" DeobfuscatedProject/plugins/clean_enhanced/autotoa/tasks/*.java

# Find any remaining this.cm references
grep -rn "this\.cm\." DeobfuscatedProject/plugins/clean_enhanced/
```

---

## APPROACH FOR PHASE 4

### Priority 1: Complete Auto TOA ConsumableManager Migration
1. Find where `class C` is defined
2. Rename it to `ConsumableManager`
3. Fix remaining 5 files still using type `C`

### Priority 2: Fix regionHelper Field
1. Search for `cm` field definition in `KephriManager` or `TOATaskBase`
2. Understand the actual type
3. Rename field properly in parent class
4. Verify child classes compile

### Priority 3: Deobfuscate KephriManager Methods
1. Read `AutotoaManager.java` to find method definitions
2. Understand each method's purpose from implementation
3. Rename: `bc()` → `isInCombatArea()`, `aq()` → `isSpecialWeaponMode()`, etc.

### Priority 4: SOTF Framework Classes
1. Find `g`, `a` utility class definitions in framework/
2. Rename to `DialogUtil`, `BankingUtil`, etc.
3. Rename their methods to descriptive names

### Priority 5: Clean Up Remaining Obfuscation
1. Fix any remaining single-letter methods
2. Fix enum/config obfuscated types
3. Verify all files compile

---

## SUCCESS CRITERIA

1. **No type `C` references** - All replaced with `ConsumableManager`
2. **No `this.cm` references** - All replaced with proper field name
3. **No single-letter public methods** - All renamed to descriptive names
4. **No single-letter class names** - All mapped to proper names
5. **All inherited methods have clear names** - `bc()`, `aq()`, `bf()` etc. renamed
6. **SOTF framework classes deobfuscated** - `g`, `a` classes renamed
7. **Code functionality preserved** - Same behavior, readable names
