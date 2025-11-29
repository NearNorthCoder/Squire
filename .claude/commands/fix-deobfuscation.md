# Complete Deobfuscation of Auto TOA and SOTF Plugins

## Project Context

**Squire** is an OSRS (Old School RuneScape) botting client built on RuneLite/Unethicalite. The `DeobfuscatedProject/plugins/` directory contains plugins that were originally obfuscated and are being converted to clean, readable code.

### Key APIs Used
- `net.runelite.api.*` (Client, Player, NPC, Skill, World, widgets, coords)
- `net.unethicalite.api.*` (entities, game, items, movement, widgets, input)
- `net.unethicalite.client.Static` (getClient())
- `gg.squire.*` (Squire-specific APIs)

---

## Your Task

Complete the deobfuscation of **Auto TOA** and **SOTF** plugins to 100%. Fix all remaining obfuscated:
- Class names and filenames
- Method names
- Field names
- Import statements
- Type references

---

## Current State

### Auto TOA Plugin (~88% complete)
**Location:** `DeobfuscatedProject/plugins/clean_enhanced/autotoa/`

**COMPLETED:**
- Renamed 4 files: `ck.java`→`TOAConfigurableTask.java`, `aS.java`→`BaboonAttack.java`, `aV.java`→`DoingTaskSwitchMapper.java`, `bQ.java`→`BoulderSolution.java`
- Fixed `extends ck` → `extends TOAConfigurableTask` in 3 files
- Renamed `bl()` → `validate()` in files extending `TOAConfigurableTask`

**REMAINING ISSUES:**

1. **File `AutotoaManager.java` contains wrong class name:**
   - File: `tasks/AutotoaManager.java`
   - Contains: `public abstract class KephriManager extends ToaTaskBase`
   - Should: Either rename class to `AutotoaManager` OR update all files that `extends AutotoaManager` to `extends KephriManager`
   - **20+ files** extend `AutotoaManager`

2. **Obfuscated methods in files extending AutotoaManager:**
   - `bl()` → likely `shouldExecute()` (based on parent class pattern)
   - `bj()` → needs analysis
   - `bn()` → needs analysis
   - `aS()` → needs analysis
   - `r()` → `reset()`
   - `a(GameStateChanged)` → `onGameStateChanged(GameStateChanged)`
   - `a(ChatMessage)` → `onChatMessage(ChatMessage)`
   - `a(GameObjectSpawned)` → `onGameObjectSpawned(GameObjectSpawned)`
   - `a(ActorDeath)` → `onActorDeath(ActorDeath)`

3. **Obfuscated constructor parameter:**
   - Pattern: `(Client client, z z2, TOAConfig config)`
   - `z` is obfuscated class name - find what it maps to

4. **Obfuscated fields:**
   - `aY` → should be `plugin` (type: SquireAutoTOA)
   - `hY` → should be `config` or similar
   - `cu` → appears to be Client reference

5. **Files with `bl()` that need method rename:**
   - SunKerisObeliskTask.java
   - MovingToRightSpotWithChargingTask.java
   - GoingToFinalPhaseTask.java
   - LootingChestRoomTask.java
   - AttackingAkkhaButterflyTask.java
   - MovingToSafespotTask.java
   - (Plus 6 more - use grep to find all)

6. **Files with `r()` that need rename to `reset()`:**
   - RedXCycleTask.java
   - MovingToRightSpotWithChargingTask.java
   - MovingAwayFromAllDungTask.java
   - LootingChestRoomTask.java
   - SolvingObeliskPuzzleTask.java
   - MovingToSafespotTask.java

---

### SOTF Plugin (~65% complete)
**Location:** `DeobfuscatedProject/plugins/clean_enhanced/sotf/`

**COMPLETED:**
- Fixed imports in `SotfInfoOverlay.java`, `SotfQuestManager.java`, `SquireSotfBuilder.java`
- Fixed `implements ac` → `implements QuestStep` in `SotfQuestManager.java`
- Fixed `List<ac>` → `List<QuestStep>` in `SotfQuestManager.java`
- Fixed method calls: `.ag()`→`.getName()`, `.ah()`→`.isComplete()`, `.af()`→`.execute()`
- Fixed `e.b()`→`GameStateUtil.formatTime()`, `e.z()`→`GameStateUtil.isGrandExchangeWarningEnabled()`

**REMAINING ISSUES:**

1. **16+ step files still have obfuscated imports:**
   Files in `steps/` directory with `import o.c.k.i.-.l.o.f.-.n.c.t.e.s.*`:
   - w_QuestStep.java, an_QuestStep.java, ar_QuestStep.java, ad_QuestStep.java
   - ae_QuestStep.java, X_QuestStep.java, V_QuestStep.java, P_QuestStep.java
   - H_QuestStep.java, E_QuestStep.java, C_QuestStep.java
   - SinsOfTheFatherQuest.java, DragonSlayerQuestHandler.java
   - CookingTrainingStep.java, FishingTrainingStep.java, BankAndPrepareSuppliesStep.java

   **Fix:** Replace `import o.c.k.i.-.l.o.f.-.n.c.t.e.s.*` with `import gg.squire.sotf.framework.*`

2. **20+ files still have `implements ac`:**
   - All step files listed above plus:
   - av_QuestStep.java, XMarksTheSpotQuestComplete.java, XMarksTheSpotQuestStep.java
   - WoodcuttingTrainingStep.java, ThievingTrainingStep.java, NmzMeleeQuestStep.java
   - NmzRangeQuestStep.java, MiningTrainingStep.java, ItemConstants.java

   **Fix:** Replace `implements ac` with `implements QuestStep`

3. **Single-letter quest step classes need mapping:**
   In `SotfQuestManager.java`, these classes are instantiated but still obfuscated:
   ```java
   new P(), new Z(), new W(), new V(), new T()  // thieving
   new M(), new A(), new R(), new aa(), new H()  // combat
   new G(), new ak(), new w()  // gathering
   new at(), new ad(), new af(), new ao(), new E(), new an()  // crafting
   new ag(), new D()  // magic
   new aj(), new ai(), new w(), new au(), new y()  // ranged
   new aq(), new ar()  // quests
   new O(), new U(), new ah(), new v(), new L()  // misc
   ```

   **Action:** Search step files to find what each class does, then rename appropriately

4. **Obfuscated file names in steps/:**
   - `w_QuestStep.java` → Determine actual quest and rename
   - `C_QuestStep.java` → Determine actual quest (contains Grand Tree content)
   - `E_QuestStep.java`, `V_QuestStep.java`, `X_QuestStep.java`, `P_QuestStep.java`, `H_QuestStep.java`
   - `ad_QuestStep.java`, `ae_QuestStep.java`, `an_QuestStep.java`, `ar_QuestStep.java`, `av_QuestStep.java`, `G_QuestStep.java`

5. **SquireSotfBuilder.java still missing imports:**
   - Has TODO comment for: H, L, V, aD, aN, t, u, z
   - These are quest step classes that need proper imports after renaming

---

## Reference Files (Read These First!)

### Clean Framework Examples (SOTF):
- `DeobfuscatedProject/plugins/clean_enhanced/sotf/framework/GameStateUtil.java` - Fully deobfuscated utility class
- `DeobfuscatedProject/plugins/clean_enhanced/sotf/framework/BankingUtil.java` - Fully deobfuscated
- `DeobfuscatedProject/plugins/clean_enhanced/sotf/framework/DialogUtil.java` - Fully deobfuscated
- `DeobfuscatedProject/plugins/clean_enhanced/sotf/framework/QuestStep.java` - The interface all steps implement

### Class/Method Mappings (from QuestStep.java):
```
Interface ac → QuestStep
  ae() → arePrerequisitesMet()
  af() → execute()
  ag() → getName()
  ah() → isComplete()
  ez() → isEnabled()
```

### Class Mappings (from GameStateUtil.java header):
```
Class e → GameStateUtil
  j(int) → getVarbit(int)
  c(int, int) → randomRange(int, int)
  w() → getHealthPercentage()
  z() → isGrandExchangeWarningEnabled()
  A() → disableGrandExchangeWarning()
  b(long) → formatTime(long)
  G() → handleDeath()
```

### Auto TOA Parent Class (TOAConfigurableTask.java):
```java
public abstract class TOAConfigurableTask extends TOATaskInfrastructure {
    public abstract boolean validate();  // Subclasses override this
    public boolean run() { ... calls validate() ... }
}
```

### Auto TOA KephriManager (in AutotoaManager.java):
```java
public abstract class KephriManager extends ToaTaskBase {
    public boolean validate() { ... calls shouldExecute() ... }
    protected abstract boolean shouldExecute();  // Subclasses override this
}
```

---

## Obfuscation Patterns to Fix

1. **Single-letter class names:** `a.java`, `e.java`, `ac.java` → Meaningful names
2. **Single-letter method names:** `a()`, `b()`, `bl()`, `r()` → Meaningful names
3. **Package refs:** `o.c.k.i.-.l.o.f.-.n.c.t.e.s` → `gg.squire.sotf.framework`
4. **XOR constants in comments:** `// 0x62 ^ 0x53` → Remove or convert to plain numbers
5. **Boolean helpers:** `isTrue(int n) { return n != 0; }` → Replace with direct comparisons

---

## Verification Commands

```bash
# Find remaining obfuscated imports
grep -r "import o\.c\.k\.i" DeobfuscatedProject/plugins/clean_enhanced/

# Find remaining "implements ac"
grep -r "implements ac\b" DeobfuscatedProject/plugins/clean_enhanced/

# Find remaining single-letter method names in TOA
grep -rE "public (boolean|void|int) [a-z]{1,2}\(" DeobfuscatedProject/plugins/clean_enhanced/autotoa/

# Find files extending AutotoaManager
grep -r "extends AutotoaManager" DeobfuscatedProject/plugins/clean_enhanced/autotoa/
```

---

## Success Criteria

1. **No obfuscated imports** - All `o.c.k.i.-.l.o.f.-.n.c.t.e.s.*` replaced
2. **No `implements ac`** - All replaced with `implements QuestStep`
3. **No single-letter public methods** - All renamed to meaningful names
4. **No obfuscated filenames** - All `X_QuestStep.java` style files renamed
5. **No obfuscated field names** - All `aY`, `hY`, `cu` renamed
6. **Class names match filenames** - `AutotoaManager.java` contains `class AutotoaManager`

---

## Approach

1. **Research First:** Read framework files to understand patterns
2. **Fix Imports:** Bulk replace obfuscated package imports
3. **Fix Interfaces:** Bulk replace `implements ac`
4. **Fix Methods:** Rename methods based on parent class patterns
5. **Fix Fields:** Rename based on type and usage
6. **Fix Filenames:** Rename files to match their class/purpose
7. **Verify:** Run grep commands to confirm no remaining issues
8. **Commit:** Create clear commit message describing changes
