# Squire/Unethicalite API Reference Index
For AI consumption. Accuracy verified against decompiled source.

---

## Quick Reference

### Items (`net.unethicalite.api.items`)
| Class | Key Methods |
|-------|-------------|
| **Bank** | `isOpen()`, `open()`, `close()`, `contains()`, `getFirst()`, `withdraw()`, `deposit()`, `depositInventory()` |
| **Inventory** | `contains()`, `getFirst()`, `getAll()`, `getCount()`, `isFull()`, `getFreeSlots()`, `use()`, `dropAll()` |
| **Equipment** | `contains()`, `getFirst()`, `fromSlot()`, `getAll()` |
| **GrandExchange** | `isOpen()`, `buy()`, `sell()`, `collect()`, `getOffers()` |

### Widgets (`net.unethicalite.api.widgets`)
| Class | Key Methods |
|-------|-------------|
| **Dialog** | `isOpen()`, `canContinue()`, `continueSpace()`, `chooseOption()`, `enterAmount()`, `getOptions()` |
| **Widgets** | `get()`, `isVisible()`, `query()`, `getChildren()` |
| **Prayers** | `isEnabled()`, `toggle()`, `getPoints()`, `getOffensive()`, `flick()`, `disableAll()` |

### Entities (`net.unethicalite.api.entities`)
| Class | Key Methods |
|-------|-------------|
| **NPCs** | `getNearest()`, `getAll()`, `query()`, `render()` |
| **TileObjects** | `getNearest()`, `getFirstAt()`, `getFirstSurrounding()`, `getAll()`, `within()` |
| **Players** | `getLocal()`, `getHintArrowed()`, `getNearest()`, `getAll()` |
| **TileItems** | `getNearest()`, `getAll()`, `query()` |

### Movement (`net.unethicalite.api.movement`)
| Class | Key Methods |
|-------|-------------|
| **Movement** | `walkTo()`, `walk()`, `isRunEnabled()`, `toggleRun()`, `getRunEnergy()` |
| **Walker** | `walkTo()`, `buildPath()`, `step()`, `nearestWalkableTile()` |
| **Reachable** | `isWalkable()`, `isInteractable()`, `isDoored()` |

### Game (`net.unethicalite.api.game`)
| Class | Key Methods |
|-------|-------------|
| **Vars** | `getBit()`, `getVarp()`, `getVarcInt()` |
| **Combat** | `getCurrentHealth()`, `getSpecEnergy()`, `isSpecEnabled()`, `setSpec()` |
| **Skills** | `getLevel()`, `getBoostedLevel()`, `getExperience()` |
| **Game** | `isLoggedIn()`, `isInInstance()`, `isInCutscene()`, `getState()` |

### Magic (`net.unethicalite.api.magic`)
| Class | Key Methods |
|-------|-------------|
| **Magic** | `cast()`, `selectSpell()`, `isAutoCasting()`, `canCast()` |

### Commons (`net.unethicalite.api.commons`)
| Class | Key Methods |
|-------|-------------|
| **Time** | `sleep()`, `sleepUntil()`, `sleepTicks()`, `sleepTick()` |
| **Rand** | `nextInt()`, `nextBool()` |

### Squire Framework (`gg.squire.client.plugins`)
| Class | Key Methods |
|-------|-------------|
| **Task** | `run()`, `sleep()`, `sleepWhile()`, `sleeping()`, `tick()` |
| **TaskManager** | `registerTasks()`, `start()`, `stop()`, `getCurrentTask()` |
| **SquirePlugin** | `isPaused()`, `isEnabled()`, `getRuntime()`, `forceStop()` |

---

## Package Documentation Files

| File | Contents |
|------|----------|
| [unethicalite/items.md](unethicalite/items.md) | Bank, Inventory, Equipment, GrandExchange |
| [unethicalite/widgets.md](unethicalite/widgets.md) | Dialog, Widgets, Prayers |
| [unethicalite/entities.md](unethicalite/entities.md) | NPCs, TileObjects, Players, TileItems, Tiles |
| [unethicalite/movement.md](unethicalite/movement.md) | Movement, Walker, Reachable, BankLocation |
| [unethicalite/game.md](unethicalite/game.md) | Vars, Combat, Skills, Game, GameThread, Gear, House |
| [unethicalite/other.md](unethicalite/other.md) | Magic, Quest, Keyboard, Time, Rand, Predicates |
| [squire/framework.md](squire/framework.md) | Task, TaskDesc, TaskManager, SquirePlugin |
| [patterns.md](patterns.md) | Common code patterns from real plugins |

---

## Common Imports

```java
// Items
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;

// Widgets
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.api.widgets.Prayers;

// Entities
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.scene.Tiles;

// Movement
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

// Game
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;

// Magic
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;

// Commons
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Predicates;

// Input
import net.unethicalite.api.input.Keyboard;

// Quests
import net.unethicalite.api.quests.Quest;

// RuneLite
import net.runelite.api.*;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.coords.WorldArea;

// Squire Framework
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.plugins.fw.TaskManager;
```

---

## Key Enums Reference

### Bank.WithdrawMode
```java
NOTED, ITEM, DEFAULT
```

### Bank.QuantityMode
```java
ONE, FIVE, TEN, X, ALL, UNKNOWN
```

### GrandExchange.View
```java
CLOSED, OFFERS, BUYING, SELLING, UNKNOWN
```

### Prayer (net.runelite.api.Prayer)
```java
PROTECT_FROM_MELEE, PROTECT_FROM_MISSILES, PROTECT_FROM_MAGIC,
PIETY, RIGOUR, AUGURY, EAGLE_EYE, MYSTIC_MIGHT
```

### Skill (net.runelite.api.Skill)
```java
ATTACK, DEFENCE, STRENGTH, HITPOINTS, RANGED, PRAYER, MAGIC, ...
```

### GameState (net.runelite.api.GameState)
```java
STARTING, LOGIN_SCREEN, LOGGED_IN, LOADING, HOPPING, CONNECTION_LOST
```

### QuestState (net.runelite.api.QuestState)
```java
NOT_STARTED, IN_PROGRESS, FINISHED
```

---

## Common Varbits

| ID | Description | Check |
|----|-------------|-------|
| 3909 | Piety unlock | `== 8` |
| 5451 | Rigour unlock | `== 1` |
| 5452 | Augury unlock | `== 1` |
| 4103 | Quick prayer enabled | `== 1` |
| 25 | Stamina boosted | `> 0` |
| 4396 | GE quantity | value |
| 4398 | GE price | value |
| 276 | Autocast spell ID | value |
| 2668 | Defensive casting | `== 1` |
| 12414 | Dialog open | `== 1` |

---

## Source Locations

| Component | Path |
|-----------|------|
| Framework source | `/home/user/Squire/DeobfuscatedProject/framework/decompiled/` |
| Plugin examples | `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/` |
| Squire framework | `gg/squire/client/plugins/` |
| Unethicalite API | `net/unethicalite/api/` |
| Clean utility example | `plugins/clean_enhanced/sotf/framework/BankingUtil.java` |
