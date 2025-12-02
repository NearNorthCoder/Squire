# Unethicalite Other Packages
Magic, Quests, Input, Commons

---

# Magic
`net.unethicalite.api.magic.Magic`

## Constants
```java
private static final int AUTOCAST_VARP = 108
private static final int AUTO_CAST_SPELL_ID_VARBIT = 276
private static final int DEFENSIVE_CASTING_VARBIT = 2668
```

## Static Methods - Spellbook
```java
getCurrentSpellBook() → SpellBook
```

## Static Methods - Autocasting
```java
isAutoCasting() → boolean
isDefensiveAutoCasting() → boolean
getAutoCastingSpell() → Spell
autoCast(Spell spell) → boolean
```

## Static Methods - Spell State
```java
isSpellSelected(Spell spell) → boolean
canCast(Spell spell) → boolean
```

## Static Methods - Cast
```java
cast(Spell spell) → void
cast(Spell spell, int actionIndex) → void
cast(Spell spell, int id, boolean bypassActions) → void
cast(Spell spell, int actionIndex, int opcode) → void
cast(Spell spell, Item target) → void
cast(Spell spell, NPC target) → void
cast(Spell spell, Player target) → void
cast(Spell spell, TileItem target) → void
cast(Spell spell, TileObject target) → void
selectSpell(Spell spell) → void
```

## Static Methods - Home Teleport
```java
getLastHomeTeleportUsage() → Instant
isHomeTeleportOnCooldown() → boolean
```

## SpellBook Enum
```java
enum SpellBook {
    STANDARD, ANCIENT, LUNAR, ARCEUUS

    isCurrent() → boolean
    getSpells() → List<Spell>
}
```

## Spell Interface
```java
interface Spell {
    canCast() → boolean
    canAutoCast() → boolean
    isAutoCasting() → boolean
    getWidget() → WidgetInfo
}
```

## Common Spells (SpellBook.Standard)
```java
SpellBook.Standard.HOME_TELEPORT
SpellBook.Standard.LUMBRIDGE_TELEPORT
SpellBook.Standard.VARROCK_TELEPORT
SpellBook.Standard.FALADOR_TELEPORT
SpellBook.Standard.CAMELOT_TELEPORT
SpellBook.Standard.HIGH_LEVEL_ALCHEMY
SpellBook.Standard.LOW_LEVEL_ALCHEMY
SpellBook.Standard.CRUMBLE_UNDEAD
SpellBook.Standard.TELEKINETIC_GRAB
```

## Usage Examples
Source: `plugins/clean_enhanced/vorkath/tasks/AttackTask.java`

```java
// Cast spell on NPC
Magic.cast(SpellBook.Standard.CRUMBLE_UNDEAD, npc);

// Check autocast
if (Magic.isAutoCasting()) {
    Spell spell = Magic.getAutoCastingSpell();
}

// Cast teleport
Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);

// High alch item
Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, item);
```

---

# Quest
`net.unethicalite.api.quests.Quest`

## Enum - Quest Values (Partial List)
```java
// F2P Quests
COOKS_ASSISTANT, DRAGON_SLAYER_I, DEMON_SLAYER, THE_RESTLESS_GHOST,
RUNE_MYSTERIES, SHEEP_SHEARER, VAMPYRE_SLAYER, WITCHS_POTION, X_MARKS_THE_SPOT

// P2P Quests
PRIEST_IN_PERIL, NATURE_SPIRIT, IN_SEARCH_OF_THE_MYREQUE, IN_AID_OF_THE_MYREQUE,
DARKNESS_OF_HALLOWVALE, A_TASTE_OF_HOPE, SINS_OF_THE_FATHER,
DESERT_TREASURE, MONKEY_MADNESS_I, MONKEY_MADNESS_II, DRAGON_SLAYER_II,
SONG_OF_THE_ELVES, RECIPE_FOR_DISASTER

// Miniquests
ENTER_THE_ABYSS, THE_MAGE_ARENA, THE_MAGE_ARENA_II, DADDYS_HOME
```

## Instance Methods
```java
getState() → QuestState
getProgress() → int
getId() → int
getName() → String
getKeywords() → List<String>
getQuestType() → Type
getDifficulty() → Difficulty
getVarPlayer() → QuestVarPlayer
```

## QuestState Enum
```java
enum QuestState {
    NOT_STARTED, IN_PROGRESS, FINISHED
}
```

## Quest.Type Enum
```java
enum Type {
    F2P, P2P, MINIQUEST, ACHIEVEMENT_DIARY, GENERIC, SKILL
}
```

## Quest.Difficulty Enum
```java
enum Difficulty {
    ALL, NOVICE, INTERMEDIATE, EXPERIENCED, MASTER, GRANDMASTER,
    MINIQUEST, ACHIEVEMENT_DIARY, GENERIC, SKILL
}
```

## Usage Examples
Source: Framework decompiled

```java
// Check quest state
if (Quest.SINS_OF_THE_FATHER.getState() == QuestState.FINISHED) {
    // Quest complete
}

// Check progress
int progress = Quest.DESERT_TREASURE.getProgress();

// Check using varbit
int sotfProgress = Vars.getBit(QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId());
```

---

# Keyboard
`net.unethicalite.api.input.Keyboard`

## Static Methods - Key Events
```java
pressed(int keyCode) → void
pressed(int keyCode, char keyChar) → void
typed(int keyCode) → void
typed(int keyCode, char keyChar) → void
released(int keyCode) → void
released(int keyCode, char keyChar) → void
```

## Static Methods - Typing
```java
type(char c) → void
type(int number) → void
type(String text) → void
type(String text, boolean sendEnter) → void
```

## Static Methods - Special Keys
```java
sendEnter() → void
sendSpace() → void
```

## Usage Examples
```java
// Type text
Keyboard.type("Hello World");

// Type with enter
Keyboard.type("100", true);

// Send space (continue dialog)
Keyboard.sendSpace();

// Press escape
Keyboard.pressed(KeyEvent.VK_ESCAPE);
```

---

# Time
`net.unethicalite.api.commons.Time`

## Constants
```java
private static final int DEFAULT_POLLING_RATE = 10
```

## Static Methods - Sleep
```java
sleep(long ms) → boolean
sleep(int min, int max) → boolean
```

## Static Methods - Sleep Until
```java
sleepUntil(BooleanSupplier supplier, int timeOut) → boolean
sleepUntil(BooleanSupplier supplier, int pollingRate, int timeOut) → boolean
sleepUntil(BooleanSupplier supplier, BooleanSupplier resetSupplier, int timeOut) → boolean
sleepUntil(BooleanSupplier supplier, BooleanSupplier resetSupplier, int pollingRate, int timeOut) → boolean
```

## Static Methods - Sleep Ticks
```java
sleepTick() → boolean
sleepTicks(int ticks) → boolean
sleepTicksUntil(BooleanSupplier supplier, int ticks) → boolean
```

## Static Methods - Format
```java
format(Duration duration) → String
```

## Usage Examples
Source: `plugins/clean_enhanced/sotf/framework/BankingUtil.java`

```java
// Sleep ticks
Time.sleepTicks(2);

// Sleep until condition
Time.sleepUntil(Bank::isOpen, 3000);

// Sleep with custom polling
Time.sleepUntil(() -> Dialog.isOpen(), 100, 5000);

// Sleep tick (single game tick)
Time.sleepTick();

// Sleep until with reset
Time.sleepUntil(
    () -> Inventory.contains("Logs"),
    () -> Players.getLocal().isAnimating(),
    10000
);

// Format duration
String formatted = Time.format(Duration.ofSeconds(3661)); // "01:01:01"
```

---

# Rand
`net.unethicalite.api.commons.Rand`

## Static Methods
```java
nextInt(int min, int max) → int
nextInt() → int
nextBool() → boolean
```

## Usage Examples
Source: Walker.java, Prayers.java

```java
// Random int in range
int delay = Rand.nextInt(55, 190);

// Random walk distance
int targetDistance = Rand.nextInt(7, nextTileIdx);

// Random check (1 in 100 chance)
if (Rand.nextInt(0, 100) == 1) {
    return false;
}

// Random boolean
if (Rand.nextBool()) { ... }
```

---

# Predicates
`net.unethicalite.api.commons.Predicates`

## Static Methods
```java
names(String... names) → Predicate<Named>
nameContains(String text) → Predicate<Named>
ids(int... ids) → Predicate<Identifiable>
actions(String... actions) → Predicate<Interactable>
```

## Usage Examples
Source: Walker.java, Framework decompiled

```java
// Filter by name containing
Predicate<Item> pickaxe = Predicates.nameContains("pickaxe");
if (Inventory.contains(pickaxe) || Equipment.contains(pickaxe)) { ... }

// Filter by names
GrandExchange.sell(Predicates.names("Dragon bones", "Shark"));

// Filter by ids
Inventory.getFirst(Predicates.ids(1234, 5678));
```
