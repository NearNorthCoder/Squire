# Squire Plugin Deobfuscation Guide - Continuation Session

## Project Overview
Squire is an OSRS botting client built on RuneLite/Unethicalite. We are deobfuscating plugins to create clean, readable, compilable code.

**Critical Principle**: NEVER CREATE NEW CLASSES/METHODS - rename obfuscated items in place and update all references.

## Directory Structure
```
/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/
├── autotoa/           # Auto TOA plugin (Tombs of Amascut) - ~85% complete
│   ├── gg/squire/autotoa/
│   │   └── SquireAutoTOA.java      # Main plugin class
│   └── tasks/
│       ├── AutotoaManager.java      # Base class (KephriManager)
│       ├── SpecialAttackTracker.java # NEW - utility for spec tracking
│       └── [40+ task files]
└── sotf/              # SOTF plugin (Sins of the Father) - ~15% complete
    ├── framework/
    │   ├── BankingUtil.java         # Banking operations
    │   ├── DialogUtil.java          # Dialog/NPC interactions
    │   ├── GameStateUtil.java       # Game state utilities
    │   └── ItemIdArrays.java        # Item ID constants
    └── steps/
        └── [28 step files needing updates]
```

## Completed Work (Phases 1-7)

### Auto TOA - SquireAutoTOA.java
| Obfuscated | Deobfuscated |
|------------|--------------|
| `e()` | `isPaused()` |
| `c(boolean)` | `setKerisSpecialReady(boolean)` |
| `d()` | `isRunToggleDisabled()` |

### Auto TOA - KephriManager (AutotoaManager.java)
| Obfuscated | Deobfuscated |
|------------|--------------|
| `bc()` | `isInCombatArea()` |
| `aq()` | `isInSpecialWeaponMode()` |
| `bf()` | `isBossFightActive()` |
| `be()` | `isBossIdle()` |
| `bd()` | `getNearestBossNpc()` |
| `j(int)` | `isInRegion(int)` |
| `aZ()` | `isShadowPuzzleActive()` |
| `aY()` | `getTearsCount()` |
| `aX()` | `getCurrentPhaseId()` |
| `bu()` | `isButterflyPhaseActive()` |
| `bp()` | `handlePlayerMoving()` |
| `bv()` | `getButterflyMechanic()` |
| `co()` | `getWardenNpc()` |
| `ba()` | `canEat()` |
| `a(Point)` | `localToWorld(Point)` |
| `J()` | `getAkkhasShadow()` |
| `g(NPC)` | `isNpcValid(NPC)` |
| `g(WorldPoint)` | `moveTo(WorldPoint)` |
| `r()` | `resetTask()` |
| `br()` | `getGearSwap()` |

### Auto TOA - SpecialAttackTracker.java (NEW)
| Obfuscated | Deobfuscated |
|------------|--------------|
| `aY.c()` | `SpecialAttackTracker.resetSpecialState()` |
| `aY.c(true)` | `SpecialAttackTracker.setSpecialReady(true)` |

### SOTF Framework Mappings
| Obfuscated | Deobfuscated |
|------------|--------------|
| `a.a()` | `BankingUtil.openNearestBank()` |
| `a.a(BankLocation)` | `BankingUtil.navigateToBank(BankLocation)` |
| `a.a(int, int)` | `BankingUtil.withdrawItem(int, int)` |
| `g.a(String, String[])` | `DialogUtil.talkToNpc(String, String[])` |
| `f.ba` | `ItemIdArrays.STAMINA_POTIONS` |
| `f.aX` | `ItemIdArrays.PRAYER_POTIONS` |
| `e.x()` | `GameStateUtil.closeBankAndHopWorld()` |

## Remaining Work

### Auto TOA (~15% remaining)
1. **Task method overrides** still obfuscated in some files:
   - `bj()` - task validation method
   - `bn()` - blocking check method
   - `aS()` - always run check
   - `br()` - still obfuscated in GoingToFinalPhaseTask.java (should be `getGearSwap()`)

2. **Type `o` (ButterflyMechanic)** - has placeholder implementation, needs real logic

3. **Files to check for remaining obfuscated calls**:
```bash
grep -rn "this\.[a-z]{2}\(" /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/autotoa/tasks/
```

### SOTF (~85% remaining)
46 step files need obfuscated calls replaced. Pattern established in `BankAndPrepareSuppliesStep.java`:

**Find files needing updates:**
```bash
grep -l "a\.a\(\|g\.a\(\|f\.\|e\.x\(" /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/steps/
```

**Key step files to update:**
- AgilityTraining*.java
- CombatTrainingStep.java
- DragonSlayerQuestHandler.java
- SinsOfTheFatherQuest.java
- VampyreQuestHelper.java
- [and 40+ more]

## Search Commands

Find remaining obfuscated plugin methods:
```bash
grep -rn "plugin\.[a-z]\(" /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/autotoa/
```

Find remaining obfuscated inherited methods:
```bash
grep -rn "this\.[a-z]{1,2}\(" /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/autotoa/tasks/
```

Find SOTF files needing deobfuscation:
```bash
grep -l "\ba\.\|\bg\.\|\bf\.\|\be\." /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/steps/*.java
```

## Git Branch
Working branch: `claude/deobfuscate-squire-plugins-01AQjJvKtHBXS5kLYaipbfuG`

## Recent Commits
- `fed72362` - Phase 7: Create SpecialAttackTracker and begin SOTF deobfuscation
- `30964f08` - Phase 6: Deobfuscate Auto TOA plugin methods and task files
- `e7f73992` - Add SOTF backward compatibility alias classes
- `163c796b` - Phase 5: Deobfuscate plugin methods and COX type C

## Next Steps (Priority Order)
1. Complete remaining Auto TOA task method deobfuscation (bj, bn, aS, br)
2. Update all 46 SOTF step files to use framework classes directly
3. Verify all imports are correct in updated files
4. Test compilation of deobfuscated code

## Key APIs Reference
- `net.runelite.api.*` - RuneLite client API
- `net.unethicalite.api.*` - Unethicalite extensions
- `gg.squire.*` - Squire client utilities

Continue deobfuscating the Squire plugins following the patterns established above.
