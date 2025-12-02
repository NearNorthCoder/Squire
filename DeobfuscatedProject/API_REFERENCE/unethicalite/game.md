# Unethicalite Game Package
`net.unethicalite.api.game`

---

# Vars
`net.unethicalite.api.game.Vars`

## Static Methods - Varps
```java
getVarp(int id) → int
getVarp(VarPlayer varPlayer) → int
setVarp(int id, int value) → void
```

## Static Methods - Varbits
```java
getBit(int id) → int
getBit(Varbits varbit) → int
setBit(int id, int value) → void
```

## Static Methods - VarcInt
```java
getVarcInt(int id) → int
setVarcInt(int id, int value) → void
```

## Static Methods - VarcStr
```java
getVarcStr(int id) → String
setVarcStr(int id, String value) → void
```

## Common Varbit IDs Used in Framework
```java
// Prayer unlocks
3909  → isPietyUnlocked (value == 8)
5451  → isRigourUnlocked (value == 1)
5452  → isAuguryUnlocked (value == 1)

// Prayer state
4103  → isQuickPrayerEnabled (value == 1)

// Dialog
12414 → isDialogOpen (value == 1)

// Grand Exchange
4396  → GE quantity
4398  → GE price

// Autocast
276   → autoCastSpellId
2668  → defensiveCasting

// Magic
892   → lastHomeTeleportUsage (minutes)

// Stamina
25    → isStaminaBoosted
```

## Usage Examples
Source: Framework decompiled

```java
// Check varbit
if (Vars.getBit(3909) == 8) {
    // Piety is unlocked
}

// Check varp
int questProgress = Vars.getVarp(questVarPlayer.getId());

// Check varc
if (Vars.getVarcInt(5) == 14) {
    // GE search is open
}

// Prayer check
if (Vars.getBit(prayer.getVarbit()) == 1) {
    // Prayer is enabled
}
```

---

# Combat
`net.unethicalite.api.game.Combat`

## Static Methods - Combat State
```java
getCurrentHealth() → int
getHealthPercent() → int
getMissingHealth() → int
isPoisoned() → boolean
isVenomed() → boolean
isEnvenomed() → boolean
getSpecEnergy() → int
isSpecEnabled() → boolean
```

## Static Methods - Combat Actions
```java
setSpec(boolean enabled) → void
toggleSpec() → void
```

## Static Methods - Combat Level
```java
getCombatLevel() → int
getWildernessLevel() → int
isInWilderness() → boolean
```

## Static Methods - Attack Styles
```java
getAttackStyle() → int
setAttackStyle(int style) → void
isAutoRetaliating() → boolean
setAutoRetaliate(boolean retaliate) → void
```

## Usage Examples
Source: `plugins/clean_enhanced/vorkath/tasks/AttackTask.java`

```java
// Check spec
if (!Combat.isSpecEnabled()) {
    Combat.setSpec(true);
}

// Check health
if (Combat.getHealthPercent() < 50) {
    // eat food
}

// Check wilderness
if (Combat.isInWilderness()) {
    int level = Combat.getWildernessLevel();
}

// Get spec energy
int spec = Combat.getSpecEnergy();
```

---

# Skills
`net.unethicalite.api.game.Skills`

## Static Methods
```java
getLevel(Skill skill) → int
getBoostedLevel(Skill skill) → int
getExperience(Skill skill) → int
```

## Skill Enum Values (from `net.runelite.api.Skill`)
```java
ATTACK, DEFENCE, STRENGTH, HITPOINTS, RANGED, PRAYER, MAGIC,
COOKING, WOODCUTTING, FLETCHING, FISHING, FIREMAKING, CRAFTING,
SMITHING, MINING, HERBLORE, AGILITY, THIEVING, SLAYER, FARMING,
RUNECRAFT, HUNTER, CONSTRUCTION
```

## Usage Examples
Source: Prayers.java

```java
// Get prayer level
int prayerLevel = Skills.getLevel(Skill.PRAYER);

// Check boosted level
int currentPrayer = Skills.getBoostedLevel(Skill.PRAYER);

// Calculate missing prayer
int missing = Skills.getBoostedLevel(Skill.PRAYER) - Skills.getLevel(Skill.PRAYER);

// Check skill requirement
if (Skills.getLevel(Skill.PRAYER) >= 70) {
    // Can use Piety
}
```

---

# Game
`net.unethicalite.api.game.Game`

## Static Methods - Game State
```java
getState() → GameState
isLoggedIn() → boolean
isLoading() → boolean
isMember() → boolean
getMembershipDays() → int
isInCutscene() → boolean
isInInstance() → boolean
```

## Static Methods - Client Info
```java
getClient() → Client
getClientThread() → Thread
isOnClientThread() → boolean
```

## Static Methods - Region
```java
getBaseX() → int
getBaseY() → int
getPlane() → int
isInInstancedRegion() → boolean
```

## Static Methods - Tick
```java
getTickCount() → int
```

## GameState Enum Values
```java
STARTING, LOGIN_SCREEN, LOGIN_SCREEN_AUTHENTICATOR, LOGGING_IN,
CONNECTION_LOST, LOADING, LOGGED_IN, HOPPING
```

## Usage Examples
Source: Time.java, Walker.java

```java
// Check logged in
if (Game.getState() != GameState.LOGGED_IN) {
    return false;
}

// Check instance
if (Game.isInInstance()) {
    // Inside instanced area
}

// Check cutscene
if (Game.isInCutscene()) {
    Time.sleepTicks(2);
    return false;
}

// Check membership
if (Game.getMembershipDays() <= 0) {
    // F2P account
}
```

---

# GameThread
`net.unethicalite.api.game.GameThread`

## Static Methods
```java
invoke(Runnable runnable) → void
invoke(int delay, Runnable runnable) → void
invokeLater(Callable<T> callable) → T
invokeLater(Supplier<T> supplier) → T
```

## Usage Examples
Source: GrandExchange.java, Quest.java

```java
// Run on game thread
GameThread.invoke(() -> {
    Static.getClient().runScript(new Object[]{754, id, 84});
});

// Get value from game thread
int notedId = GameThread.invokeLater(() ->
    Static.getClient().getItemComposition(itemId).getLinkedNoteId()
);

// Run script and get result
QuestState state = GameThread.invokeLater(() -> {
    client.runScript(new Object[]{4029, questId});
    return client.getIntStack()[0] == 2 ? QuestState.FINISHED : QuestState.IN_PROGRESS;
});
```

---

# Gear
`net.unethicalite.api.game.Gear`

## Static Methods
```java
swapTo(int[] ids) → void
```

## Usage Examples
Source: `plugins/clean_enhanced/vorkath/tasks/AttackTask.java`

```java
// Swap gear
EquipmentSetup setup = config.getEquipmentSetup();
Gear.swapTo(setup.getIds());
```

---

# House
`net.unethicalite.api.game.House`

## Static Methods
```java
isInside() → boolean
isPoolDrinkUseful() → boolean
drinkFromPool() → boolean
```

## Usage Examples
Source: Walker.java

```java
// Check house pool
if (House.isInside() && House.isPoolDrinkUseful()) {
    return House.drinkFromPool();
}
```
