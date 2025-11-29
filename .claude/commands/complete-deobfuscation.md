# Complete Deobfuscation of Auto TOA and SOTF Plugins - Phase 2

## Project Context

**Squire** is an OSRS (Old School RuneScape) botting client built on RuneLite/Unethicalite. The `DeobfuscatedProject/plugins/` directory contains plugins that were originally obfuscated and are being converted to clean, readable code.

### Key APIs Used
- `net.runelite.api.*` (Client, Player, NPC, Skill, World, widgets, coords)
- `net.unethicalite.api.*` (entities, game, items, movement, widgets, input)
- `net.unethicalite.client.Static` (getClient())
- `gg.squire.*` (Squire-specific APIs)

---

## Previous Work Completed

Phase 1 completed the following bulk replacements:

### Auto TOA (71 files modified)
- ✅ `extends AutotoaManager` → `extends KephriManager`
- ✅ Constructor parameter `z z2` → `ToaPlugin plugin`
- ✅ Method `bl()` → `shouldExecute()`
- ✅ Method `r()` → `reset()`
- ✅ Field references: `aY` → `plugin`, `cW` → `config`, `cu` → `client`

### SOTF (45 files modified)
- ✅ Imports `o.c.k.i.-.l.o.f.-.n.c.t.e.s.*` → `gg.squire.sotf.framework.*`
- ✅ `implements ac` → `implements QuestStep`
- ✅ Methods: `ae()` → `arePrerequisitesMet()`, `af()` → `execute()`, `ag()` → `getName()`, `ah()` → `isComplete()`
- ✅ Renamed 15 obfuscated step files to proper quest names

---

## REMAINING ISSUES - AUTO TOA

### Location: `DeobfuscatedProject/plugins/clean_enhanced/autotoa/`

### 1. CRITICAL: Malformed Package Reference
**File:** `tasks/SunKerisObeliskTask.java:121`
```java
// BROKEN - Contains invalid package syntax with dashes
if (!q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e.TEARS_OF_ELIDINIS.d(item.getId())

// SHOULD BE:
if (!GameEnum12.TEARS_OF_ELIDINIS.hasItemId(item.getId())
```

### 2. Inherited Obfuscated Methods from KephriManager
These are defined in `tasks/AutotoaManager.java` (which contains `class KephriManager`) and need to be renamed:

| Obfuscated | Suggested Name | Purpose | Used In |
|------------|----------------|---------|---------|
| `bB()` | `getTargetNPC()` | Returns target NPC | RedXCycleTask, others |
| `bA()` | `getRaidLevel()` | Returns raid level (1-3) | RedXCycleTask, others |
| `bm()` | `onBossDeath()` | Called when boss dies | RedXCycleTask |
| `bC()` | `executeTask()` | Main task execution | RedXCycleTask, MovingNextToRubbleTask |
| `br()` | `getGearSwap()` | Equipment swap config | 5+ files |
| `bp()` | `prepareAttack()` | Prepare for attacking | RedXCycleTask |
| `bF()` | `getDangerZones()` | Returns danger tiles | RedXCycleTask |
| `a(Point)` | `toWorldPoint(Point)` | Convert region point | 15+ files |
| `bc()` | `isInCombat()` | Combat check | SmellingSaltsTask |
| `aq()` | `isSpecialWeaponMode()` | Special weapon check | SmellingSaltsTask |

### 3. Obfuscated Event Handler Methods
Many files have event handlers named `a()` instead of proper names:

```java
// Current (obfuscated):
@Subscribe
public void a(GraphicsObjectCreated event) { ... }
@Subscribe
public void a(ActorDeath event) { ... }
@Subscribe
public void a(ChatMessage event) { ... }

// Should be:
@Subscribe
public void onGraphicsObjectCreated(GraphicsObjectCreated event) { ... }
@Subscribe
public void onActorDeath(ActorDeath event) { ... }
@Subscribe
public void onChatMessage(ChatMessage event) { ... }
```

**Files with obfuscated event handlers:**
- RedXCycleTask.java (lines 236, 264, 275)
- MovingToSafespotTask.java (line 107 - method `b()`)
- MovingNextToRubbleTask.java (lines 52, 62)
- RechargingTridentTask.java (lines 52, 98)
- MovingToRightSpotWithChargingTask.java (lines 115, 126)
- LoggingOutAndStoppingTask.java (line 59)
- SolvingObeliskPuzzleTask.java (lines 222, 242, 250)

### 4. Private Helper Methods Still Obfuscated
**File:** `tasks/SunKerisObeliskTask.java`
- Line 112, 249: `cl()` → `isKerisUnavailable()`
- Line 147, 204: `ck()` → `shouldTickEat()`
- Line 152, 232: `cj()` → `getHealthThreshold()`

### 5. Obfuscated Field References Still Present
- `this.cu` - Used in 6 files where `this.client` replacement was missed
- `this.cm` - Manager instance in HandlingZebakPrayersTask and similar
- `this.d` - Configuration object in SmellingSaltsTask

### 6. Files That Need Attention (Priority Order)
1. **SunKerisObeliskTask.java** - 13+ issues (critical malformed package)
2. **RedXCycleTask.java** - 11+ issues (multiple obfuscated methods)
3. **AutotoaManager.java** - Parent class with obfuscated method definitions
4. **AttackingAkkhaButterflyTask.java** - 5+ issues
5. **SmellingSaltsTask.java** - Obfuscated method calls

---

## REMAINING ISSUES - SOTF

### Location: `DeobfuscatedProject/plugins/clean_enhanced/sotf/`

### 1. CRITICAL: SquireSotfBuilder.java (13+ lines with malformed packages)
**Lines:** 290-295, 337, 436, 457, 466, 477, 489, 657, 662-663, 768

```java
// BROKEN:
o.c.k.i.-.l.o.f.-.n.c.t.e.s.GameStateUtil.isGrandExchangeWarningEnabled()
o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.A()
o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.y()

// SHOULD BE:
GameStateUtil.isGrandExchangeWarningEnabled()
GameStateUtil.disableGrandExchangeWarning()
GameStateUtil.someMethod()
```

Also has:
- Line 139: `List<ac>` → `List<QuestStep>`
- Line 202: `new ac[] { new aN() }` → proper class names
- Line 250: `new ac[0]` → `new QuestStep[0]`
- Line 251: `L.gn = null;` → obfuscated field

### 2. CRITICAL: SotfQuestManager.java (70+ lines of obfuscation)
**Lines 235-304:** Single-letter class instantiations that need mapping:
```java
// Thieving steps
new P(), new Z(), new W(), new V(), new T()

// Combat steps
new M(), new A(), new R(), new aa(), new H()

// Gathering steps
new G(), new ak(), new w()

// Crafting steps
new at(), new ad(), new af(), new ao(), new E(), new an()

// Magic steps
new ag(), new D()

// Ranged steps
new aj(), new ai(), new w(), new au(), new y()

// Quest steps
new aq(), new ar()

// Misc steps
new O(), new U(), new ah(), new v(), new L()
```

**Lines 379-611:** Obfuscated method calls:
- `aE.gm()`, `av.eA()`, `aw.eH()`, `aC.fQ()`, `ay.fi()`
- `m.ak()`, `n.aA()`, `w.bf()`, `y.bl()`, `v.aZ()`, `L.cB()`

### 3. Obfuscated Constants Used Across Multiple Files

| Constant | Files Using It |
|----------|----------------|
| `j.cf` | GrandTreeQuestStep, WitchesHouseQuestStep, ThievingTrainingStep, NatureSpiritQuestStep |
| `f.ba` | DragonSlayerQuestHandler, NatureSpiritQuestStep, GrandTreeQuestStep |
| `f.aX` | DragonSlayerQuestHandler |
| `z.eb` | SquireSotfBuilder |

### 4. Single-Letter Utility Classes
These classes are used throughout step files and need proper names:

| Class | Methods Used | Files |
|-------|--------------|-------|
| `I` | `co()`, `cm()` | WitchesHouseQuestStep, ImpCatcherQuestStep |
| `y` | `bl()`, `bp()`, `bq()` | VampyreQuestHelper (10+ instances) |
| `H` | `cf()` | NatureSpiritQuestStep, AnimalMagnetismStep |
| `J` | `cw()` | AnimalMagnetismStep |
| `x` | `bi()`, `bj()` | AnimalMagnetismStep |
| `m` | `ak()`, `ap()`, `aq()` | SotfQuestManager, GrandTreeQuestStep |
| `n` | `aA()` | SotfQuestManager |

### 5. Shopping List Item Class `d`
Used 50+ times across step files for shopping list items:
```java
// Current:
new d(ITEM_ID, QUANTITY, "Item Name")

// Should be renamed to something like:
new ShoppingItem(ITEM_ID, QUANTITY, "Item Name")
```

**Files with `new d(...)`:**
- WitchesHouseQuestStep.java (30+ uses)
- ImpCatcherQuestStep.java
- GrandTreeQuestStep.java
- InSearchOfMyrequeQuestStep.java (60+ uses)

---

## REFERENCE FILES

### Framework Classes (Already Deobfuscated)
- `sotf/framework/GameStateUtil.java` - Utility methods for game state
- `sotf/framework/QuestStep.java` - Interface for quest steps
- `sotf/framework/BankingUtil.java` - Banking utilities
- `sotf/framework/DialogUtil.java` - Dialog handling

### Class Mappings (from previous work)
```
Interface ac → QuestStep
Class e → GameStateUtil
Class ck → TOAConfigurableTask
Class z → TOAEquipmentManager (in Auto TOA)
```

### Method Mappings (from QuestStep.java)
```
ae() → arePrerequisitesMet()
af() → execute()
ag() → getName()
ah() → isComplete()
ez() → isEnabled()
```

### Method Mappings (from GameStateUtil.java)
```
j(int) → getVarbit(int)
c(int, int) → randomRange(int, int)
w() → getHealthPercentage()
z() → isGrandExchangeWarningEnabled()
A() → disableGrandExchangeWarning()
b(long) → formatTime(long)
G() → handleDeath()
```

---

## VERIFICATION COMMANDS

```bash
# Find remaining malformed package references
grep -rn "o\.c\.k\.i\.-\." DeobfuscatedProject/plugins/clean_enhanced/
grep -rn "q\.-\.t\.a\.o" DeobfuscatedProject/plugins/clean_enhanced/

# Find remaining single-letter method definitions
grep -rn "public boolean b[a-zA-Z]\(" DeobfuscatedProject/plugins/clean_enhanced/autotoa/
grep -rn "public void a(" DeobfuscatedProject/plugins/clean_enhanced/autotoa/

# Find remaining obfuscated field references
grep -rn "this\.cu\." DeobfuscatedProject/plugins/clean_enhanced/
grep -rn "this\.cm\." DeobfuscatedProject/plugins/clean_enhanced/

# Find single-letter class instantiations in SOTF
grep -rn "new [A-Z]\(\)" DeobfuscatedProject/plugins/clean_enhanced/sotf/
grep -rn "new [a-z][a-z]\(\)" DeobfuscatedProject/plugins/clean_enhanced/sotf/

# Find obfuscated constant references
grep -rn "[a-z]\.cf\|f\.ba\|f\.aX\|z\.eb" DeobfuscatedProject/plugins/clean_enhanced/sotf/
```

---

## APPROACH FOR PHASE 2

1. **Start with Parent Classes:**
   - Fix `AutotoaManager.java` (KephriManager) method names first
   - This will establish the correct method signatures for child classes

2. **Fix Critical Malformed Packages:**
   - `SunKerisObeliskTask.java` - Fix `q.-.t.a.o.u.i` reference
   - `SquireSotfBuilder.java` - Fix all `o.c.k.i.-` references

3. **Rename Event Handlers:**
   - Pattern: `public void a(EventType)` → `public void onEventType(EventType)`

4. **Map Single-Letter Classes in SOTF:**
   - Read each class file to understand its purpose
   - Create a mapping document
   - Rename files and class references

5. **Fix Obfuscated Constants:**
   - Identify what `j.cf`, `f.ba`, etc. represent
   - Create proper constant classes or inline the values

6. **Verify with grep commands above**

---

## SUCCESS CRITERIA

1. **No malformed package references** - All `o.c.k.i.-` and `q.-.t.a.o` patterns removed
2. **No single-letter public methods** - All renamed to descriptive names
3. **No single-letter class names** - All mapped to proper names
4. **No obfuscated field names** - All `cu`, `cm`, `d` renamed
5. **Event handlers properly named** - `onEventType()` pattern used
6. **Code compiles** - All references resolve correctly
