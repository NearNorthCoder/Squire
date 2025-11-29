# Skilling Plugin Class Mappings - Quick Reference

## Herblore Plugin (5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c)
**Package:** `r.e.o.r.h.s.b.e.q.l.e.u.-.i.r`

| Obfuscated | Deobfuscated | Type | Description |
|------------|--------------|------|-------------|
| `d` | `HerbloreBaseTask` | Abstract Class | Base task class for all herblore tasks |
| `f` | `BankingTask` | Task Class | Handles banking operations (@TaskDesc: "Banking") |
| `h` | `CleaningHerbsTask` | Task Class | Cleans grimy herbs (@TaskDesc: "Cleaning herbs") |
| `i` | `MakingPotionsTask` | Task Class | Creates potions (@TaskDesc: "Making potions") |
| `c` | `HerbloreMode` | Enum | Operation modes (CLEAN_HERBS, MAKE_UNF_POTS, FINISH_POTS, ALL_STAGES, ALL_STAGES_ALL_HERBS) |
| `b` | `HerbType` | Enum | Herb types with IDs (GUAM_LEAF, MARRENTILL, TARROMIN, etc.) |
| `e` | `PotionType` | Enum | Potion types and recipes |
| `a` | `HerbloreStateEvent` | Event Class | State change event |
| `g` | Unknown | Helper Class | Helper/switch class |

### Herblore Field Mappings
| Class | Obfuscated | Deobfuscated | Type |
|-------|------------|--------------|------|
| `d` | `j` | `plugin` | SquireHerblore |
| `d` | `i` | `config` | HerbloreConfig |
| `d` | `h` | `validModes` | List&lt;HerbloreMode&gt; |
| `f` | `e` | `currentStage` | HerbloreMode |
| `f` | `o` | `eventBus` | EventBus |
| `f` | `f` | `herbType` | HerbType |
| `f` | `g` | `potionType` | PotionType |
| `i` | `q` | `tickCounter` | int |
| `i` | `r` | `animationTick` | int |

### Herblore Method Mappings
| Class | Obfuscated | Deobfuscated | Returns | Description |
|-------|------------|--------------|---------|-------------|
| `d` | `h()` | `execute()` | boolean | Abstract task execution |
| `d` | `j()` | `getConfig()` | HerbloreConfig | Returns config |
| `d` | `k()` | `getPlugin()` | SquireHerblore | Returns plugin |
| `d` | `i()` | `getValidModes()` | List | Returns valid modes |
| `b` | `e()` | `getGrimyId()` | int | Returns grimy herb ID |
| `b` | `f()` | `getCleanId()` | int | Returns clean herb ID |
| `b` | `g()` | `getUnfPotionId()` | int | Returns unf potion ID |
| `b` | `a(int)` | `hasItemId(int)` | boolean | Checks if ID matches herb |
| `b` | `b(int)` | `getStageForItem(int)` | HerbloreMode | Returns stage for item ID |

---

## Mining Plugin (3f45ab50-7de6-493f-a8bc-b432dabdf252)
**Package:** `m.e.i.q.u.r.-.n.s.e.r.i`

| Obfuscated | Deobfuscated | Type | Description |
|------------|--------------|------|-------------|
| `C` | `MiningBaseTask` | Abstract Class | Base task class for mining tasks |
| `a` | `MiningActivity` | Enum | Mining activities (MOTHERLODE_MINE, SANDSTONE, GEM_ROCKS, etc.) |
| `h` | `OreType` | Enum | Ore types (COPPER_ORE, TIN_ORE, IRON_ORE) |
| `T` | `MiningManager` | Helper Class | Manages mining state/helpers |

### Mining Field Mappings
| Class | Obfuscated | Deobfuscated | Type |
|-------|------------|--------------|------|
| `C` | `X` | `config` | SquireMinerConfig |
| `C` | `Y` | `plugin` | SquireMiner |
| `C` | `Z` | `manager` | MiningManager |

### Mining Method Mappings
| Class | Obfuscated | Deobfuscated | Returns | Description |
|-------|------------|--------------|---------|-------------|
| `C` | `t()` | `execute()` | boolean | Abstract task execution |
| `C` | `v()` | `getDepositBoxUpstairs()` | TileObject | Returns upstairs deposit box |
| `C` | `u()` | `getMotherlodeObject()` | TileObject | Returns MLM object |
| `C` | `w()` | `getDepositBoxDownstairs()` | TileObject | Returns downstairs deposit box |
| `C` | `x()` | `getDepositBox()` | TileObject | Returns appropriate deposit box |
| `a` | `c()` | `getActivityName()` | String | Returns activity name |
| `h` | `m()` | `getOreId()` | int | Returns ore item ID |
| `h` | `l()` | `getObjectIds()` | int[] | Returns rock object IDs |

---

## Thieving Plugin (squire-thieving-0.0.1)
**Package:** `s.r.i.t.g.n.-.u.h.i.q.i.e.v.e`

| Obfuscated | Deobfuscated | Type | Description |
|------------|--------------|------|-------------|
| `a` | `ThievingBaseTask` | Abstract Class | Base task class for thieving |
| `C` | `BankingTask` | Task Class | Banking for pickpocketing (@TaskDesc: "Banking loot") |
| `b` | `ThievingMethod` | Enum | Methods (BLACK_JACK, PICKPOCKETING, STALLS, CHESTS, ROGUES_DEN) |
| `f` | `PickpocketTarget` | Enum | NPC targets (ELF, VYRE, etc.) |

### Thieving Field Mappings
| Class | Obfuscated | Deobfuscated | Type |
|-------|------------|--------------|------|
| `a` | `o` | `plugin` | SquireThieving |
| `a` | `p` | `config` | SquireThievingConfig |
| `a` | `q` | `CONSTANT` | int (static) |

### Thieving Method Mappings
| Class | Obfuscated | Deobfuscated | Returns | Description |
|-------|------------|--------------|---------|-------------|
| `a` | `l()` | `execute()` | boolean | Abstract task execution |
| `a` | `m()` | `getElf()` | NPC | Returns elf NPC |
| `a` | `n()` | `getVyre()` | NPC | Returns vyre NPC |
| `a` | `o()` | `isStunned()` | boolean | Checks stun graphic |
| `a` | `a(NPC)` | `pickpocket(NPC)` | void | Pickpockets NPC |
| `a` | `a(f)` | `getTarget(PickpocketTarget)` | NPC | Gets NPC for target type |

---

## Fishing Plugin (squire-fisher-0.1.0)
**Package:** `i.i.-.h.u.s.e.r.q.r.s.f.e`

| Obfuscated | Deobfuscated | Type | Description |
|------------|--------------|------|-------------|
| `a` | `ChopTentacleTask` | Task Class | Chops fishing trawler tentacle (@TaskDesc: "Chopping Tentacle") |

### Fishing Field Mappings
| Class | Obfuscated | Deobfuscated | Type |
|-------|------------|--------------|------|
| `a` | `o` | `logger` | Logger (static) |
| `a` | `p` | `config` | SquireFisherConfig |
| `a` | `q` | `tickDelay` | int |

---

## Universal Task Patterns

### Common Task Class Naming
| @TaskDesc Name | Suggested Class Name | Purpose |
|----------------|---------------------|---------|
| "Banking" | `BankingTask` | Handles bank operations |
| "Walking to bank" | `WalkToBankTask` | Navigation to bank |
| "Eating" | `EatingTask` | Consumes food |
| "Drinking stamina potion" | `DrinkStaminaTask` | Drinks stamina |
| "Turning on run" | `EnableRunTask` | Enables run |
| "Hopping" | `WorldHopTask` | World hopping |
| "Idle" | `IdleTask` | Wait/idle state |
| "Restoring Prayer" | `RestorePrayerTask` | Prayer restoration |
| "Restoring from pool" | `PoolRestoreTask` | POH pool restore |

### Common Field Names by Letter

| Obfuscated | Common Deobfuscation | Type Pattern |
|------------|---------------------|--------------|
| `o` | `plugin` or `eventBus` or `logger` | Plugin instance, EventBus, or Logger |
| `p` | `config` | Config instance |
| `e` | `currentMode` or `currentStage` | Enum representing current state |
| `f` | `resourceType` | Primary resource/item enum |
| `g` | `secondaryType` | Secondary resource/item enum |
| `h` | `validModes` or `list` | List/Collection |
| `i` | `config` | Config instance (alternate) |
| `j` | `plugin` | Plugin instance (alternate) |
| `q` | `tickCounter` or `delay` | Integer counter |
| `r` | `tickTracker` | Integer counter |
| `X` | `config` | Config (uppercase pattern) |
| `Y` | `plugin` | Plugin (uppercase pattern) |
| `Z` | `manager` or `helper` | Manager/helper class |

### Common Method Names by Letter

| Obfuscated | Common Purpose | Return Type Pattern |
|------------|----------------|---------------------|
| `h()` | Execute task | boolean |
| `i()` | Get list/collection | List |
| `j()` | Get config | Config interface |
| `k()` | Get plugin | Plugin class |
| `l()` | Execute task (alt) | boolean |
| `t()` | Execute task (alt) | boolean |
| `m()` | Get NPC/Object | NPC or Object |
| `n()` | Get specific resource | NPC or Object |
| `o()` | Check state | boolean |
| `p()`, `q()`, `r()` | Perform action | boolean (private) |
| `e()` | Get primary ID | int |
| `f()` | Get secondary ID | int |
| `g()` | Get tertiary ID | int |
| `v()`, `u()`, `w()`, `x()` | Get location/object | TileObject or WorldPoint |
| `a()` | Generic action | Various |
| `b()` | Generic getter | Various |
| `c()` | Generic getter | Various |

---

## Enum Patterns

### Mode/Method Enums
Usually named `b` or `c`, represents different operating modes:
- Herblore: `CLEAN_HERBS`, `MAKE_UNF_POTS`, `FINISH_POTS`, `ALL_STAGES`
- Thieving: `BLACK_JACK`, `PICKPOCKETING`, `STALLS`, `CHESTS`
- Mining: Different activities

**Suggested naming:** `{Skill}Mode` or `{Skill}Method`

### Resource/Item Enums
Usually named `a`, `b`, or `h`, represents skill-specific items:
- Contains item IDs, object IDs
- May have helper methods to check/get IDs
- Often has descriptive enum constants

**Suggested naming:** `{Resource}Type` (e.g., `HerbType`, `OreType`, `Fish Type`)

---

## Code Pattern Recognition Guide

### Identify Banking Task
```java
// Look for these patterns:
Bank.isOpen()
Bank.open()
Bank.depositInventory()
Bank.withdraw(...)
Bank.contains(...)
```

### Identify Processing Task
```java
// Look for these patterns:
Inventory.getAll(itemId)
item.interact("Action")
Math.min(perTick, items.size())
```

### Identify Production Task
```java
// Look for these patterns:
Production.isOpen()
Production.choosePreviousOption()
```

### Identify Navigation Task
```java
// Look for these patterns:
Movement.walkTo(...)
Reachable.isInteractable(...)
WorldPoint
```

---

## Quick Deobfuscation Checklist

1. ✓ Check @TaskDesc annotation for task name
2. ✓ Identify if class extends Task
3. ✓ Look for plugin instance field (usually `o`, `j`, `Y`)
4. ✓ Look for config instance field (usually `p`, `i`, `X`)
5. ✓ Check for enum fields (usually `e`, `f`, `g`)
6. ✓ Identify abstract execute method (`h()`, `l()`, `t()`)
7. ✓ Map getter methods (`j()`, `k()`, `e()`, `f()`, `g()`)
8. ✓ Map helper methods based on return types
9. ✓ Check for EventBus field (usually `o`)
10. ✓ Look for tick counters (usually `q`, `r`)

---

## Notes
- Most obfuscation is consistent within a plugin but varies between plugins
- Same letter can mean different things in different plugins
- @TaskDesc annotation is the most reliable identifier
- Field types help identify purpose (EventBus, Config, Plugin instances)
- Method return types help identify purpose (NPC, TileObject, boolean, etc.)
