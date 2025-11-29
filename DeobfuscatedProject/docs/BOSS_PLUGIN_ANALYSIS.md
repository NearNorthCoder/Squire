# PvM Boss Plugin Analysis & Deobfuscation Mappings

## Overview
This document analyzes the common patterns and structure of Squire boss-killing plugins to aid in deobfuscation efforts.

## Boss Plugin Inventory

| Boss Name | Plugin ID | Class Count | Package Pattern |
|-----------|-----------|-------------|-----------------|
| Zulrah | f9e8fbd0-4571-4716-b37b-883b4ae7fc62 | 71 | a.u.i.-.l.r.h.z.s.r.u.q.e |
| Vorkath | 70c49992-0f4a-4f1f-b83d-1bdcbc531725 | 48 | i.v.k.o.-.u.s.e.r.a.q.r.t.h |
| Hydra | f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e | 32 | u.i.r.d.s.e.r.q.y.a.h.- |
| Bandos | f13c63fa-3e76-4035-9dfa-e833a382cd4c | 30 | q.s.r.i.e.s.o.u.a.d.n.-.b |
| Zammy | f8a8c131-0c60-4150-a875-6d5d0cb07058 | 34 | m.e.a.i.z.m.r.-.q.s.y.u |
| Saradomin | 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7 | 38 | u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e |

## Common Plugin Structure

### 1. Core Files (Always Present)
Every boss plugin contains these deobfuscated files:

```
gg/squire/{boss}/
├── Squire{Boss}Plugin.java       # Main plugin class (extends SquirePlugin)
├── Squire{Boss}Config.java       # Configuration interface
└── overlay/                      # UI components
    └── {Boss}InfoBox.java        # Info panel overlay
    └── {Boss}Overlay.java        # (some plugins)
```

### 2. Obfuscated Task Classes
Each plugin has 15-35 obfuscated task classes in scrambled packages:
- Named A-Z, a-z, aa-az, etc.
- All extend `gg.squire.client.plugins.fw.Task`
- Use `@TaskDesc` annotation with name, priority, blocking, register flags

### 3. State Management
Some plugins (Zulrah) include state enums:
- Example: `c.java` - enum with states: BANKING, TRANSPORTING_ZULRAH, COLLECTING_ZULRAH, DONE

---

## Common Task Categories & Patterns

### Prayer Management Tasks
**Priority:** Usually 0x7FFFFFFF (highest)
**Attributes:** register=true

| Plugin | Class | Task Name | Notes |
|--------|-------|-----------|-------|
| Zulrah | ab | "Handling prayers" | Listens to ProjectileSpawned events, switches based on attack type |
| Vorkath | A | "Pray" | Flicks protection prayers + offensive prayers |
| Hydra | x | "Handling Hydra prayers" | Switches prayers based on hydra phase |
| Bandos | p | "Flicking prayers" | Prayer flicking during combat |
| Zammy | s | "Flicking prayers" | Prayer flicking during combat |
| Saradomin | u | "Flicking prayers" | Prayer flicking during combat |

**Common Pattern:**
- Extends base prayer task class
- Monitors boss animations/projectiles
- Maintains list of active prayers
- Uses `Prayers.flick()` or `WidgetPackets.widgetFirstOption()`
- Often subscribes to `ProjectileSpawned` or `AnimationChanged` events

---

### Eating/Food Tasks
**Priority:** 8-110
**Attributes:** Often high priority, sometimes blocking

| Plugin | Class | Task Name |
|--------|-------|-----------|
| Zulrah | W | "Eating" |
| Zulrah | X | "Eating for space" |
| Vorkath | G | "Eat" |
| Hydra | r | "Eating" |
| Bandos | o | "Eating food" |
| Zammy | r | "Eating food" |
| Saradomin | s | "Eating food" |

**Common Pattern:**
- Checks current HP vs threshold
- Uses `Inventory.getFirst()` to find food
- Calls `item.interact("Eat")`
- May check if in combat
- Some plugins have separate "tick eat" tasks for advanced mechanics

---

### Potion Drinking Tasks
**Priority:** 5-110

| Potion Type | Common Task Names | Plugins |
|-------------|-------------------|---------|
| Prayer Restore | "Drinking prayer potion", "Prayer pot", "Restoring prayer" | All |
| Antifire | "Drinking Antifire Potion" | Vorkath |
| Combat/Super Combat | "Drinking Combat Potion", "Drinking range potion" | Most |
| Stamina | "Drinking stamina dose" | GWD plugins |
| Antivenom/Antipoison | "Curing venom", "Drinking Poison Cure" | Zulrah, Zammy |

**Common Pattern:**
- Checks player stats/status
- Uses `Inventory.getFirst()` with item name filter
- Calls `item.interact("Drink")`

---

### Banking Tasks
**Priority:** 5-1000, blocking=true

| Plugin | Classes | Task Names |
|--------|---------|------------|
| Zulrah | D, E, I, G | "Banking", "Opening bank", "Walking to bank" |
| Vorkath | o, s, q | "Banking", "Opening bank", "Walking to bank" |
| Saradomin | q | "Withdrawing items" |

**Common Pattern:**
- Walking to bank location
- Opening bank (NPC or object interaction)
- Withdrawing/depositing items
- May use bank loadout plugin integration

---

### Looting Tasks
**Priority:** 5-2000, blocking=true

| Plugin | Class | Task Name |
|--------|-------|-----------|
| Zulrah | af | "Looting items" |
| Vorkath | L | "Loot" |
| Hydra | A | "Looting Items" |
| Bandos | v | "Looting Items" |
| Zammy | v | "Looting Items" |
| Saradomin | D | "Looting Items" |

**Common Pattern:**
- Checks for `NpcLootReceived` events
- Filters loot by value/name
- Uses `GroundItems.getAt()` or similar
- Picks up items based on config settings

---

### Attack/Combat Tasks
**Priority:** 2-50

| Plugin | Class | Task Name |
|--------|-------|-----------|
| Zulrah | T | "Attacking zulrah" |
| Vorkath | u | "Attack" |
| Hydra | s | "Attacking hydra" |
| Bandos | m | "Attacking bandos" |
| Zammy | o | "Attacking zamorak" |
| Saradomin | t | "Attacking Zilyana" |

**Common Pattern:**
- Finds boss NPC by ID
- Checks if already in combat
- Calls `npc.interact("Attack")`
- May have special attack integration

---

### Movement/Dodging Tasks
**Priority:** 9-30, often blocking=true or register=true

| Plugin | Class | Task Name | Mechanic |
|--------|-------|-----------|----------|
| Zulrah | Z | "Moving to safespot" | Positioning |
| Zulrah | U | "Dodging Melee" | Melee attack avoidance |
| Vorkath | v | "Dodge" | Fireball dodge |
| Vorkath | D | "Walking to original safe spot" | Repositioning |
| Hydra | v | "Dodging lightning" | Lightning avoidance |
| Hydra | w | "Moving towards the next tile" | Phase positioning |
| Bandos | r | "Moving to next tile" | Kiting mechanic |
| Zammy | u | "Moving to next tile" | Kiting mechanic |
| Saradomin | w | "Moving to next tile" | Kiting mechanic |

**Common Pattern:**
- Monitors boss animations or projectiles
- Calculates safe tile positions
- Uses `Movement.walkTo()` or similar
- Often registered for event listeners

---

### Gear Switching Tasks
**Priority:** 10-100

| Plugin | Class | Task Name |
|--------|-------|-----------|
| Zulrah | ac | "Swapping gear" |
| Zulrah | al | "Equipping mage gear" |
| Zulrah | A | "Equipping recoil ring" |
| Vorkath | C | "Swapping bolts" |
| Zammy | x | "Equipping Mage Gear" |
| Zammy | y | "Equipping Ranged Gear" |
| Bandos | y | "Equipping Bowfa" |
| Saradomin | I | "Equipping Bowfa" |

**Common Pattern:**
- Checks current equipment slot
- Uses `Equipment.fromSlot()`
- Finds gear in inventory
- Calls `item.interact("Wield")` or `"Equip"`

---

### Special Attack Tasks
**Priority:** 11-100

| Plugin | Class | Task Name |
|--------|-------|-----------|
| Zulrah | Y | "Enabling special" |
| Vorkath | B | "Spec" |
| Hydra | t | "Using blowpipe spec" |

**Common Pattern:**
- Checks special attack energy
- Verifies correct weapon equipped
- Toggles spec bar
- Attacks target

---

### Teleportation Tasks
**Priority:** 1-100

| Plugin | Classes | Task Names |
|--------|---------|------------|
| Zulrah | J, ai, ah, ao | "Teleporting to Zul'Andra", "Teleporting out", "Returning to Zul'Andra" |
| Vorkath | t | "Teleporting to Relleka" |
| Hydra | C | "Teleport out" |
| Bandos | l | "Teleporting out" |
| Zammy | n | "Teleporting out" |
| Saradomin | n | "Teleporting out" |

**Common Pattern:**
- Checks emergency conditions (low HP, no food)
- Uses items (tabs, jewelry) or spells
- May check death detection first

---

### Instance/Portal Entry Tasks
**Priority:** 100-1000, blocking=true

| Plugin | Class | Task Name |
|--------|-------|-----------|
| Zulrah | F | "Entering portal" |
| Vorkath | p | "Entering portal" |
| Vorkath | P | "Entering fight" |
| Hydra | n | "Entering hydra room" |
| Saradomin | x | "Entering room" |

**Common Pattern:**
- Locates portal/entrance object
- Interacts with entrance
- May handle dialog continuation

---

### Utility Tasks

#### Dialog Handling
- **Task Name:** "Pressing continue"
- **Priority:** 0x7FFFFFFD (very high)
- **Pattern:** Uses `Dialog.canContinue()` and `Dialog.continueSpace()`

#### Run Energy
- **Task Names:** "Turning on run", "Enabling run"
- **Pattern:** Toggles run when energy available

#### Death Recovery
- **Task Names:** "Detecting death", "Claiming death items", "Going to Zulrah (Deathwalk)"
- **Pattern:** Checks respawn, navigates to death location or collection point

#### High Alchemy
- **Task Names:** "Alching item", "Alching items", "High alching"
- **Pattern:** Casts high alch spell on designated items

#### Bones to Peaches
- **Task Name:** "Casting B2P"
- **Priority:** 6
- **Pattern:** Converts bones to peaches for food

#### Cannon Management
- **Task Names:** "Placing cannon base"
- **Priority:** 20, blocking=true
- **Pattern:** Sets up dwarf multicannon

---

## Task Priority Hierarchy

Understanding task priorities helps identify their purpose:

| Priority Range | Typical Purpose | Examples |
|----------------|-----------------|----------|
| 0x7FFFFFFF | Critical safety/mechanics | Prayer flicking, death detection, panic teleport |
| 0x7FFFFFFE | Emergency actions | Equipping gear, collecting items |
| 0x7FFFFFFD | High priority interactions | Dialog continue, withdrawing teleport |
| 0x7FFFFFFA-0x7FFFFFF0 | Urgent actions | Walking to bank after death, equipping gear |
| 1000-2000 | Important but not urgent | Looting, entering portals, banking |
| 100-500 | Combat support | Eating, drinking potions, dodging |
| 50-99 | Combat enhancements | Special attacks, gear swapping |
| 10-49 | Standard combat | Attacking, movement |
| 1-9 | Background tasks | Teleporting preparation, potion drinking |

---

## Common Base Classes

Several task classes extend common base classes:

1. **Prayer Task Base** (`ad` in Zulrah, `w` in Vorkath)
   - Provides prayer flicking framework
   - Event subscription for boss mechanics
   - Prayer enabling/disabling logic

2. **Combat Task Base**
   - NPC targeting
   - Combat state management

3. **Movement Task Base**
   - Pathfinding utilities
   - Safe spot calculation

---

## Obfuscation Patterns

### Package Name Obfuscation
The obfuscated packages use single-letter directory names that are anagrams or permutations of "squire" + boss name:
- Zulrah: `a.u.i.-.l.r.h.z.s.r.u.q.e` (contains letters from "squire" + "zulrah")
- Vorkath: `i.v.k.o.-.u.s.e.r.a.q.r.t.h` (contains "vorkath" + "squire")
- Hydra: `u.i.r.d.s.e.r.q.y.a.h.-` (contains "hydra" + "squire")

### Class Name Obfuscation
- Single or double letters: A-Z, a-z, aa-az, etc.
- Alphabetical assignment based on registration order
- No semantic meaning in names

### String Obfuscation
All task classes use encrypted strings:
- Blowfish or DES encryption
- MD5 key derivation
- Base64 encoded ciphertext
- Decryption in static initializers

---

## Recommended Deobfuscation Approach

### Step 1: Identify Task Types
Use `@TaskDesc(name=...)` annotations to categorize tasks:

```java
@TaskDesc(name="Handling prayers", priority=0x7FFFFFFF, register=true)
public class ab extends Task { ... }
```
→ Rename to `PrayerFlickingTask.java`

### Step 2: Match Common Patterns
Compare task implementations across multiple boss plugins to identify shared functionality:
- Same task name = same purpose
- Similar priority = similar role
- Common API usage = common function

### Step 3: Suggested Naming Convention

```
{Function}{Action}Task.java
```

Examples:
- `ab` → `PrayerFlickingTask`
- `W` → `EatingTask`
- `T` → `AttackBossTask`
- `af` → `LootingTask`
- `Z` → `MovementSafespotTask`
- `ac` → `GearSwitchingTask`

### Step 4: Common Class Mappings

Based on cross-plugin analysis:

| Obfuscated | Suggested Name | Reasoning |
|------------|----------------|-----------|
| A-D | Config/Setup tasks | Usually appear first in task list |
| E-J | Combat mechanics | Mid-priority combat-related |
| K-P | Movement/utility | Positioning and support |
| Q-V | Food/potions | Consumable management |
| W-Z | Special mechanics | Boss-specific mechanics |
| a-f | Banking/looting | Post-combat tasks |
| g-m | Transportation | Teleports and traversal |
| n-t | Gear management | Equipment switching |
| u-z | Prayer/protection | Defensive mechanics |

---

## Framework Integration

All tasks interact with these core APIs:

### RuneLite APIs
- `net.runelite.api.Client` - Game state
- `net.runelite.api.Prayer` - Prayer enumeration
- `net.runelite.api.Item` - Inventory items
- `net.runelite.api.NPC` - NPCs and bosses
- `net.runelite.api.events.*` - Event system

### Unethicalite APIs
- `net.unethicalite.api.items.Inventory` - Inventory access
- `net.unethicalite.api.items.Equipment` - Equipment access
- `net.unethicalite.api.widgets.Prayers` - Prayer management
- `net.unethicalite.api.entities.NPCs` - NPC queries
- `net.unethicalite.api.movement.Movement` - Pathfinding
- `net.unethicalite.api.packets.*` - Packet manipulation

### Squire Framework
- `gg.squire.client.plugins.fw.Task` - Base task class
- `gg.squire.client.plugins.fw.TaskDesc` - Task annotation
- `gg.squire.client.plugins.SquirePlugin` - Plugin base class

---

## Boss-Specific Mechanics

### Zulrah (71 classes)
- **Unique Mechanics:** Phase rotation, multiple attack types, position-based prayer switching
- **Key Tasks:** Swapping between mage/range gear, dodging melee attacks, positioning on pillars
- **State Management:** BANKING, TRANSPORTING_ZULRAH, COLLECTING_ZULRAH, DONE

### Vorkath (48 classes)
- **Unique Mechanics:** Zombified spawn, acid pool avoidance, antifire required
- **Key Tasks:** Killing spawn, avoiding acid, maintaining antifire, prayer flicking magic
- **Special Features:** DHCB/lance support, POH pool integration

### Hydra (32 classes - Most Efficient)
- **Unique Mechanics:** 4 phases with different prayers, lightning dodging, fire vents
- **Key Tasks:** Phase-based prayer switching, lightning avoidance, fire skip
- **Optimization:** Fewer tasks = more focused design

### GWD Bosses (Bandos, Zammy, Sara: 30-38 classes)
- **Shared Mechanics:** Killcount collection, minion management, prayer flicking
- **Common Tasks:** Moving to next tile (kiting), flicking prayers, cannon placement
- **Similarities:** Very similar task structures, likely copy-paste with minor variations

---

## Conclusion

Boss plugins follow a consistent task-based architecture with:
1. **15-35 task classes** per plugin
2. **Common task categories** across all plugins
3. **Priority-based execution** for safety and efficiency
4. **Event-driven mechanics** for prayer switching and dodging
5. **Shared framework** for rapid plugin development

The high degree of similarity between plugins suggests:
- A standardized development template
- Copy-paste development with boss-specific modifications
- Shared base classes in the framework
- Common obfuscation pipeline

This analysis provides a foundation for systematic deobfuscation of boss plugin code.
