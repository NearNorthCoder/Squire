# Unethicalite Widgets Package
`net.unethicalite.api.widgets`

---

# Dialog
`net.unethicalite.api.widgets.Dialog`

## Static Methods - State Checks
```java
isOpen() → boolean
isEnterInputOpen() → boolean
isViewingOptions() → boolean
canContinue() → boolean
canContinueNPC() → boolean
hasNPC() → boolean
getNPC() → String
getText() → String
```

## Static Methods - Option Handling
```java
getOptions() → List<Widget>
chooseOption(String... options) → boolean
chooseOption(Predicate<String> filter) → boolean
chooseOption(int index) → boolean
chooseOptionIndex(int index) → boolean
```

## Static Methods - Input
```java
enterAmount(int amount) → void
enterInput(String input) → void
```

## Static Methods - Continue
```java
continueSpace() → void
```

## Constants
```java
private static final int DIALOG_NPC_HEAD_MODEL = 4883
private static final int DIALOG_INPUT_PARENT = 162
private static final int DIALOG_INPUT_CHILD = 39
private static final int DIALOG_CHATBOX_PARENT = 162
private static final int DIALOG_CHATBOX_CHILD = 557
```

## Widget IDs Used
- `WidgetInfo.DIALOG_NPC_TEXT` - NPC dialog text
- `WidgetInfo.DIALOG_OPTION_OPTIONS` - Option list container
- `WidgetInfo.DIALOG_NPC_HEAD_MODEL` - NPC head model
- `WidgetInfo.DIALOG_NPC_NAME` - NPC name
- `WidgetInfo.DIALOG_PLAYER_TEXT` - Player dialog text

## Usage Examples
Source: `plugins/clean_enhanced/sotf/framework/BankingUtil.java`

```java
// Check and handle dialog
if (Dialog.isOpen()) {
    DialogUtil.chooseDialogOptions(new String[]{"Yes"});
}

// Continue through dialog
Dialog.continueSpace();

// Choose specific option
Dialog.chooseOption("Yes, I'm brave");

// Enter amount
Dialog.enterAmount(price);

// Get options
List<Widget> options = Dialog.getOptions();
```

---

# Widgets
`net.unethicalite.api.widgets.Widgets`

## Static Methods - Query
```java
query() → WidgetQuery
query(int group) → WidgetQuery
```

## Static Methods - Get
```java
get(WidgetInfo widgetInfo) → Widget
get(int group, int id) → Widget
get(int group, int id, int child) → Widget
get(int group) → List<Widget>
get(int group, Predicate<Widget> filter) → Widget
fromId(int packedId) → Widget
```

## Static Methods - Children
```java
getChildren(Widget widget, Predicate<Widget> filter) → List<Widget>
getChildren(WidgetInfo widgetInfo, Predicate<Widget> filter) → List<Widget>
getChildren(int group, int child, Predicate<Widget> filter) → List<Widget>
getAll(int group, Predicate<Widget> filter) → List<Widget>
```

## Static Methods - Visibility
```java
isVisible(Widget widget) → boolean
```

## Usage Examples
Source: Framework decompiled

```java
// Get widget by WidgetInfo
Widget widget = Widgets.get(WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);

// Get widget by group and id
Widget geWindow = Widgets.get(465, 6, 0);

// Check visibility
if (Widgets.isVisible(widget)) {
    widget.interact("Activate");
}

// Get children with filter
List<Widget> options = Widgets.getChildren(parent, w -> w.getText() != null);

// Query widgets
Widget result = Widgets.query(465).textContains("Confirm").first();
```

---

# Prayers
`net.unethicalite.api.widgets.Prayers`

## Static Methods - State
```java
isEnabled(Prayer prayer) → boolean
isQuickPrayerEnabled() → boolean
anyActive() → boolean
getPoints() → int
getMissingPoints() → int
```

## Static Methods - Toggle
```java
toggle(Prayer prayer) → void
toggle(Prayer prayer, boolean packet) → void
toggleQuickPrayer(boolean enabled) → void
disableAll() → void
```

## Static Methods - Flicking
```java
flick(List<Prayer> prayers) → boolean
flick(List<Prayer> prayers, boolean perfectFlick) → boolean
flickOffensiveAutomatic(Prayer... others) → boolean
```

## Static Methods - Get Prayers by Style
```java
getOffensive() → List<Prayer>
getOffensive(ItemStats itemStats) → List<Prayer>
getMeleePrayer() → List<Prayer>
getRangePrayers() → List<Prayer>
getMagePrayers() → List<Prayer>
```

## Prayer Enum Values (from `net.runelite.api.Prayer`)
```java
THICK_SKIN, BURST_OF_STRENGTH, CLARITY_OF_THOUGHT, SHARP_EYE, MYSTIC_WILL,
ROCK_SKIN, SUPERHUMAN_STRENGTH, IMPROVED_REFLEXES, RAPID_RESTORE, RAPID_HEAL,
PROTECT_ITEM, HAWK_EYE, MYSTIC_LORE, STEEL_SKIN, ULTIMATE_STRENGTH,
INCREDIBLE_REFLEXES, PROTECT_FROM_MAGIC, PROTECT_FROM_MISSILES, PROTECT_FROM_MELEE,
EAGLE_EYE, MYSTIC_MIGHT, RETRIBUTION, REDEMPTION, SMITE, PRESERVE, CHIVALRY,
PIETY, RIGOUR, AUGURY
```

## Usage Examples
Source: Framework decompiled

```java
// Check if prayer is on
if (Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE)) { ... }

// Toggle prayer with packet
Prayers.toggle(Prayer.PIETY, true);

// Get current prayer points
int points = Prayers.getPoints();

// Toggle quick prayers
Prayers.toggleQuickPrayer(true);

// Flick prayers
List<Prayer> prayers = List.of(Prayer.PIETY, Prayer.PROTECT_FROM_MELEE);
Prayers.flick(prayers);

// Get offensive prayers based on weapon
List<Prayer> offensive = Prayers.getOffensive();

// Disable all prayers
Prayers.disableAll();
```

## Varbits Used
```java
isEnabled(Prayer) → Vars.getBit(prayer.getVarbit()) == 1
isQuickPrayerEnabled() → Vars.getBit(4103) == 1
isPietyUnlocked() → Vars.getBit(3909) == 8
isRigourUnlocked() → Vars.getBit(5451) == 1
isAuguryUnlocked() → Vars.getBit(5452) == 1
```
