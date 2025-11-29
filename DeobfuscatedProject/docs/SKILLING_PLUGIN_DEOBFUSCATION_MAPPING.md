# Skilling Plugin Deobfuscation Mapping

## Overview
This document maps common patterns and obfuscated classes found in Squire skilling plugins. Skilling plugins share similar architectures for banking, resource collection, and item processing.

## Plugin Structure

### Common Plugin Architecture
All skilling plugins follow this structure:
```
PluginDirectory/
├── gg/squire/{skill}/
│   ├── Squire{Skill}.java         # Main plugin class
│   ├── Squire{Skill}Config.java   # Configuration interface
│   └── overlay/
│       └── {Skill}InfoBox.java    # Overlay panel
└── {obfuscated_package}/
    ├── a.java - z.java            # Obfuscated task/enum classes
    └── A.java - Z.java            # More obfuscated classes
```

## Known Skilling Plugins

### Plugin UUID Mappings
| Plugin | UUID | Package |
|--------|------|---------|
| Herblore | 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c | r.e.o.r.h.s.b.e.q.l.e.u.-.i.r |
| Mining | 3f45ab50-7de6-493f-a8bc-b432dabdf252 | m.e.i.q.u.r.-.n.s.e.r.i |
| Thieving | squire-thieving-0.0.1 | s.r.i.t.g.n.-.u.h.i.q.i.e.v.e |
| Fishing | squire-fisher-0.1.0 | i.i.-.h.u.s.e.r.q.r.s.f.e |

## Common Class Patterns

### Base Task Class Pattern
**Obfuscated:** Class `d` (in Herblore plugin)
**Purpose:** Abstract base class for all plugin tasks
**Structure:**
```java
public abstract class d extends Task {
    private final SquireHerblore j;        // Plugin instance
    private final HerbloreConfig i;        // Config instance
    private final List<c> h;               // List of valid modes

    public abstract boolean h();           // Task execution method
    public boolean run()                   // RuneLite Task.run()
}
```

**Suggested Deobfuscation:**
- Class `d` → `HerbloreBaseTask`
- Field `j` → `plugin`
- Field `i` → `config`
- Field `h` → `validModes`
- Method `h()` → `execute()` or `perform()`

### Common Task Types

#### 1. Banking Task
**Obfuscated:** Class `f` (Herblore), Various in other plugins
**Annotation:** `@TaskDesc(name="Banking")`
**Common Features:**
- Opens bank
- Deposits inventory
- Withdraws required items
- Handles different banking modes/stages

**Example from Herblore (class f):**
```java
@TaskDesc(name="Banking")
public class f extends d {
    private c e;           // Current stage/mode
    private EventBus o;    // Event bus for communication
    private b f;           // Herb type
    private e g;           // Potion type

    @Override
    public boolean h() {
        // Banking logic
    }
}
```

**Suggested Deobfuscation:**
- Class `f` → `BankingTask`
- Field `e` → `currentStage` or `currentMode`
- Field `o` → `eventBus`
- Field `f` → `herbType` (skill-specific)
- Field `g` → `potionType` (skill-specific)

#### 2. Resource Processing Task
**Obfuscated:** Class `h` (Herblore - Cleaning herbs)
**Annotation:** `@TaskDesc(name="Cleaning herbs")`
**Common Features:**
- Processes items in inventory
- Interacts with items using RuneLite API
- Checks for required items

**Example from Herblore (class h):**
```java
@TaskDesc(name="Cleaning herbs")
public class h extends d {
    @Override
    public boolean h() {
        int herbId = this.j().herb().e();
        List items = Inventory.getAll(herbId);
        if (items.isEmpty()) return false;

        for (int i = 0; i < Math.min(perTick, items.size()); i++) {
            items.get(i).interact("Clean");
        }
        return true;
    }
}
```

**Suggested Deobfuscation:**
- Class `h` → `CleaningTask` or `ProcessingTask`

#### 3. Item Creation Task
**Obfuscated:** Class `i` (Herblore - Making potions)
**Annotation:** `@TaskDesc(name="Making potions", register=true)`
**Common Features:**
- Handles production widgets
- Combines items
- Tracks animation/tick states

**Suggested Deobfuscation:**
- Class `i` → `ProductionTask` or `CraftingTask`

### Enum Classes

#### Mode/Stage Enum
**Obfuscated:** Class `c` (in multiple plugins)
**Purpose:** Defines different operating modes or stages

**Herblore Example:**
```java
public final class c extends Enum<c> {
    CLEAN_HERBS,
    MAKE_UNF_POTS,
    FINISH_POTS,
    ALL_STAGES,
    ALL_STAGES_ALL_HERBS
}
```

**Thieving Example:**
```java
public final class b extends Enum<b> {
    BLACK_JACK,
    PICKPOCKETING,
    STALLS,
    CHESTS,
    ROGUES_DEN
}
```

**Suggested Deobfuscation:**
- Class `c` or `b` → `{SkillName}Mode` or `{SkillName}Method`

#### Resource/Item Enum
**Obfuscated:** Class `b` (Herblore), `h` (Mining), `a` (Mining activities)
**Purpose:** Defines skill-specific resources or items

**Herblore Herb Enum (class b):**
```java
public final class b extends Enum<b> {
    GUAM_LEAF,
    MARRENTILL,
    TARROMIN,
    HARRALANDER,
    RANARR_WEED,
    // ... more herbs

    private final int grimyId;
    private final int cleanId;
    private final int unfPotionId;
}
```

**Mining Activity Enum (class a):**
```java
public final class a extends Enum<a> {
    MOTHERLODE_MINE,
    SANDSTONE,
    GEM_ROCKS,
    GUILD_IRON,
    ARDY_IRON,
    GRANITE,
    AMETHYST,
    VOLCANIC_ASH,
    SUPERHEAT_MINE,
    ESSENCE,
    DAEYALT,
    BONE_SHARDS

    String activityName;
}
```

**Mining Ore Enum (class h):**
```java
public final class h extends Enum<h> {
    COPPER_ORE,
    TIN_ORE,
    IRON_ORE

    private final int oreID;
    private final int[] objectID;
}
```

**Suggested Deobfuscation:**
- Class `b` (Herblore) → `HerbType`
- Class `a` (Mining) → `MiningActivity`
- Class `h` (Mining) → `OreType`

### Base Abstract Task Pattern (Non-Plugin Specific)

**Thieving Example (class a):**
```java
public abstract class a extends Task {
    protected final SquireThievingConfig p;    // Config
    protected final SquireThieving o;          // Plugin instance

    public abstract boolean l();               // Execute method

    protected NPC m() { ... }                  // Get NPC
    protected void a(NPC npc) { ... }          // Interact with NPC
    protected boolean o() { ... }              // Check stunning graphic
}
```

**Mining Example (class C):**
```java
public abstract class C extends Task {
    protected final SquireMiner Y;             // Plugin instance
    protected final T Z;                       // Helper/manager
    protected final SquireMinerConfig X;       // Config

    public abstract boolean t();               // Execute method

    protected TileObject v() { ... }           // Get deposit box
    protected TileObject u() { ... }           // Get MLM object
}
```

**Suggested Deobfuscation:**
- Class `a`/`C` → `{SkillName}BaseTask`
- Method `l()`/`t()` → `execute()` or `perform()`
- Helper methods → Descriptive names based on functionality

## Common Task Names (from @TaskDesc)

### Universal Tasks
- **Banking** - Handles bank operations (deposits, withdrawals)
- **Walking to bank** - Navigation to banking areas
- **Eating** - Food consumption for health
- **Drinking stamina potion** - Stamina management
- **Turning on run** - Enable run energy
- **Hopping** - World hopping for resources/avoiding players
- **Idle** - Wait/idle state

### Skill-Specific Tasks

#### Herblore
- "Cleaning herbs"
- "Making potions"
- "Banking"

#### Mining
- Mining-specific tasks (need further analysis)

#### Thieving
- "Banking loot from pickpocketing"
- "Doing Vyre stuff"
- "Walking to stall"
- "Walking to bank"
- "Depositing seeds"
- "Unnoting for extra food"
- "Cancelling attacking bandit/thug"

#### Fishing
- "Chopping Tentacle"

## Common Method Naming Patterns

### Single Letter Methods (Obfuscated)
These appear consistently across plugins:

| Obfuscated | Likely Purpose | Example Usage |
|------------|----------------|---------------|
| `h()` | Execute task | Main task logic |
| `i()` | Get valid modes/list | Returns List<Mode> |
| `j()` | Get config | Returns config instance |
| `k()` | Get plugin | Returns plugin instance |
| `l()` | Execute (variant) | Alternative execute |
| `t()` | Execute (variant) | Alternative execute |
| `m()` | Get NPC | Finds specific NPC |
| `n()` | Get specific NPC | Specialized NPC finder |
| `o()` | Check state | Boolean check method |
| `p()` | Perform action | Private helper method |
| `q()` | Perform action | Private helper method |
| `r()` | Perform action | Private helper method |
| `a()` | Generic helper | Multiple purposes |
| `b()` | Generic helper | Multiple purposes |
| `c()` | Generic helper | Multiple purposes |
| `e()` | Get ID | Returns item/object ID |
| `f()` | Get ID | Returns secondary ID |
| `g()` | Get ID | Returns tertiary ID |
| `v()` | Get object | Returns TileObject/location |
| `u()` | Get object | Returns TileObject/location |
| `w()` | Get object | Returns TileObject/location |
| `x()` | Get object | Returns TileObject/location |

### Field Naming Patterns

| Obfuscated | Likely Purpose |
|------------|----------------|
| `o` | Plugin instance or EventBus |
| `p` | Config instance |
| `e` | Current mode/stage/state |
| `f` | Primary resource type |
| `g` | Secondary resource type |
| `h` | List/collection |
| `i` | Config instance |
| `j` | Plugin instance |
| `q` | Counter/tick tracker |
| `r` | Counter/tick tracker |
| `X`, `Y`, `Z` | Upper-case for important instances |

## Deobfuscation Strategy

### Step 1: Identify Plugin Type
1. Check main plugin class name (Squire{Skill})
2. Check config class name
3. Review @TaskDesc annotations

### Step 2: Map Base Classes
1. Find abstract base task class (usually extends Task)
2. Map common fields (plugin, config)
3. Map abstract execute method

### Step 3: Map Enums
1. Identify mode/method enums (operating modes)
2. Identify resource/item enums (skill-specific items)
3. Map enum fields and methods

### Step 4: Map Task Classes
1. Group by @TaskDesc name
2. Identify task type (Banking, Processing, Crafting, etc.)
3. Map task-specific fields
4. Map helper methods

### Step 5: Create Consistent Naming
Use this pattern:
- Base class: `{Skill}BaseTask`
- Banking task: `BankingTask` or `{Skill}BankingTask`
- Processing task: `{Resource}ProcessingTask`
- Mode enum: `{Skill}Mode` or `{Skill}Method`
- Resource enum: `{Resource}Type`

## Common Code Patterns

### Banking Pattern
```java
if (!Bank.isOpen()) {
    Bank.open();
    return true;
}

if (needsDeposit()) {
    Bank.depositInventory();
}

if (needsWithdraw()) {
    Bank.withdraw(itemId, amount, Bank.WithdrawMode.ITEM);
}

return true;
```

### Resource Processing Pattern
```java
List<Item> items = Inventory.getAll(itemId);
if (items.isEmpty()) return false;

for (int i = 0; i < Math.min(perTick, items.size()); i++) {
    items.get(i).interact("Action");
}
return true;
```

### Item Combining Pattern
```java
Item item1 = Inventory.getFirst(id1);
Item item2 = Inventory.getFirst(id2);

if (item1 == null || item2 == null) return false;

item1.useOn(item2);
return true;
```

### Production Widget Pattern
```java
if (Production.isOpen()) {
    Production.choosePreviousOption();
    return true;
}
```

## Anti-Ban Patterns

Common obfuscation techniques found:
1. **String Obfuscation**: Base64 + XOR encryption
2. **Control Flow Obfuscation**: Complex boolean expressions
3. **Integer Arrays**: Constant values stored in arrays
4. **Method Name Obfuscation**: Single letters (a-z)
5. **Package Obfuscation**: Random character sequences

## Future Work

### Additional Plugins to Analyze
- Woodcutter
- Hunter
- Herbiboar (df6d2a51-cc28-47f1-b346-c5a30f777aad)
- Farming
- Agility

### Patterns to Map
- Anti-ban randomization
- Prayer management
- Combat handling in skilling
- Special attack usage
- Equipment swapping

## Summary

### Key Findings
1. **Consistent Architecture**: All skilling plugins use a Task-based system with:
   - Main plugin class
   - Config interface
   - Overlay/InfoBox
   - Multiple task classes
   - Enum classes for modes and resources

2. **Common Base Classes**:
   - Abstract task classes that extend `gg.squire.client.plugins.fw.Task`
   - Contain plugin instance, config instance, and valid modes list

3. **Task Types**:
   - Banking tasks (most common)
   - Resource processing tasks
   - Item creation/crafting tasks
   - Navigation/movement tasks
   - State management tasks

4. **Naming Conventions**:
   - Single-letter methods for core functionality
   - Single-letter fields for important instances
   - Uppercase letters for task classes in some plugins
   - Lowercase letters for enums and helpers

5. **Common Functionality**:
   - Bank interaction
   - Inventory management
   - Object/NPC interaction
   - Production widget handling
   - Event-based state changes

### Recommended Next Steps
1. Create automated deobfuscation tool based on patterns
2. Map remaining skilling plugins
3. Document skill-specific patterns
4. Create unified naming convention guide
5. Build cross-reference database for similar classes
