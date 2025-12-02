# Unethicalite Items Package
`net.unethicalite.api.items`

---

# Bank
`net.unethicalite.api.items.Bank`

## Static Methods - Query
```java
query() → ItemQuery
query(Supplier<List<Item>> supplier) → ItemQuery
```

## Static Methods - Bank State
```java
isOpen() → boolean
isEmpty() → boolean
isPinWindowOpen() → boolean
isSettingsOpen() → boolean
isNotedWithdrawMode() → boolean
isMainTabOpen() → boolean
isTabOpen(int index) → boolean
getQuantityMode() → QuantityMode
getFreeSlots() → int
getCapacity() → int
getOccupiedSlots() → int
```

## Static Methods - Bank Actions
```java
open() → boolean
close() → void
enterBankPin() → boolean
setQuantityMode(QuantityMode quantityMode) → void
setWithdrawMode(boolean noted) → void
toggleSettings() → void
releasePlaceholders() → void
openMainTab() → void
openTab(int index) → void
collapseTabs() → void
collapseTab(int index) → void
```

## Static Methods - Item Retrieval
```java
getAll() → List<Item>
getAll(Predicate<Item> filter) → List<Item>
getAll(int... ids) → List<Item>
getAll(String... names) → List<Item>
getFirst(Predicate<Item> filter) → Item
getFirst(int... ids) → Item
getFirst(String... names) → Item
contains(Predicate<Item> filter) → boolean
contains(int... id) → boolean
contains(String... name) → boolean
getCount(Predicate<Item> filter) → int
getCount(int... ids) → int
getCount(String... names) → int
getCount(boolean stacks, Predicate<Item> filter) → int
getCount(boolean stacks, int... ids) → int
getCount(boolean stacks, String... names) → int
getTabs() → List<Widget>
hasTabs() → boolean
```

## Static Methods - Deposit
```java
depositInventory() → void
depositEquipment() → void
deposit(String name, int amount) → void
deposit(int id, int amount) → void
deposit(Predicate<Item> filter, int amount) → void
depositAll(String... names) → void
depositAll(int... ids) → void
depositAll(Predicate<Item> filter) → void
depositAllExcept(String... names) → void
depositAllExcept(int... ids) → void
depositAllExcept(Predicate<Item> filter) → void
```

## Static Methods - Withdraw
```java
withdraw(String name, int amount, WithdrawMode withdrawMode) → void
withdraw(int id, int amount, WithdrawMode withdrawMode) → void
withdraw(Predicate<Item> filter, int amount, WithdrawMode withdrawMode) → void
withdrawAll(String name, WithdrawMode withdrawMode) → void
withdrawAll(int id, WithdrawMode withdrawMode) → void
withdrawAll(Predicate<Item> filter, WithdrawMode withdrawMode) → void
withdrawX(String name, int amount, WithdrawMode withdrawMode) → void
withdrawX(int id, int amount, WithdrawMode withdrawMode) → void
withdrawX(Predicate<Item> filter, int amount, WithdrawMode withdrawMode) → void
withdrawLastQuantity(String name, WithdrawMode withdrawMode) → void
withdrawLastQuantity(int id, WithdrawMode withdrawMode) → void
withdrawLastQuantity(Predicate<Item> filter, WithdrawMode withdrawMode) → void
```

## Enums
```java
enum WithdrawMode { NOTED, ITEM, DEFAULT }
enum QuantityMode { ONE, FIVE, TEN, X, ALL, UNKNOWN }
```

## Inner Class: Bank.Inventory
`net.unethicalite.api.items.Bank$Inventory`

Represents items in inventory while bank is open. Uses bank widget context.

```java
query() → ItemQuery
getAll() → List<Item>
getAll(Predicate<Item> filter) → List<Item>
getAll(int... ids) → List<Item>
getAll(String... names) → List<Item>
getFirst(Predicate<Item> filter) → Item
getFirst(int... ids) → Item
getFirst(String... names) → Item
getCount(boolean stacks, Predicate<Item> filter) → int
getCount(boolean stacks, int... ids) → int
getCount(boolean stacks, String... names) → int
getCount(Predicate<Item> filter) → int
getCount(int... ids) → int
getCount(String... names) → int
containsAllOf(int... ids) → boolean
containsAllOf(List<Integer> itemIdList) → boolean
allMatches(Map<Integer, Integer> idCountMap) → boolean
allMatches(Map<Integer, Integer> idCountMap, Function<Integer, Predicate<Item>> remapping) → boolean
```

## Usage Examples
Source: `plugins/clean_enhanced/sotf/framework/BankingUtil.java`

```java
// Basic withdraw
Bank.withdraw(itemId, quantity, Bank.WithdrawMode.DEFAULT);

// Withdraw as noted
Bank.withdraw(itemId, quantity, Bank.WithdrawMode.NOTED);

// Check if bank has item
if (Bank.contains(itemId)) {
    Bank.withdraw(itemId, 1, Bank.WithdrawMode.DEFAULT);
}

// Deposit all inventory
Bank.depositInventory();

// Open bank and wait
GrandExchange.openBank();
Time.sleepUntil(Bank::isOpen, 3000);

// Open nearest bank object
TileObject bankChest = TileObjects.getNearest(playerLoc, "Bank chest");
if (bankChest != null && bankChest.hasAction("Use")) {
    bankChest.interact("Use");
    Time.sleepUntil(Bank::isOpen, 3000);
}
```

---

# Inventory
`net.unethicalite.api.items.Inventory`

## Static Methods - Query
```java
query() → ItemQuery
query(Supplier<List<Item>> supplier) → ItemQuery
fromInventory(int inventoryId, Function<Item, Boolean> applyItemProperties) → Items
fromInventory(int inventoryId, int widgetId) → Items
```

## Static Methods - Item Retrieval
```java
getAll() → List<Item>
getAll(Predicate<Item> filter) → List<Item>
getAll(int... ids) → List<Item>
getAll(String... names) → List<Item>
getFirst(Predicate<Item> filter) → Item
getFirst(int... ids) → Item
getFirst(String... names) → Item
getItem(int slot) → Item
```

## Static Methods - Contains
```java
contains(Predicate<Item> filter) → boolean
contains(int... id) → boolean
contains(String... name) → boolean
containsAllOf(int... ids) → boolean
containsAllOf(List<Integer> itemIdList) → boolean
allMatches(Map<Integer, Integer> idCountMap) → boolean
```

## Static Methods - Count
```java
getCount(boolean stacks, Predicate<Item> filter) → int
getCount(boolean stacks, int... ids) → int
getCount(boolean stacks, String... names) → int
getCount(Predicate<Item> filter) → int
getCount(int... ids) → int
getCount(String... names) → int
```

## Static Methods - State
```java
isFull() → boolean
isEmpty() → boolean
getFreeSlots() → int
```

## Static Methods - Actions
```java
swap(int first, int second) → boolean
dropAll(Predicate<Item> filter) → boolean
dropAll(int... ids) → boolean
dropAll(String... names) → boolean
doActions(Predicate<Item> filter, String... actions) → void
```

## Static Methods - Use
```java
use(int first, int second) → boolean
use(String first, int... second) → boolean
use(int first, String... second) → boolean
use(String first, String... second) → boolean
use(String first, String second) → boolean
use(Predicate<Item> first, Predicate<Item> second) → boolean
use(Predicate<Item> first, Interactable second) → boolean
```

## Static Methods - Interact
```java
interact(String action, int... items) → boolean
interact(String action, String... items) → boolean
interact(Predicate<Item> filter, String action) → boolean
interact(Predicate<Item> filter, Predicate<String> action) → boolean
```

## Usage Examples
Source: `plugins/clean_enhanced/sotf/framework/BankingUtil.java`

```java
// Check if item exists
if (Inventory.contains(itemId)) { ... }

// Get and interact with item
Inventory.getFirst(item -> item.getName().contains("teleport")).interact("Break");

// Check with name pattern
if (Inventory.contains(item -> item.getName().contains("teleport"))) { ... }

// Interact with specific item
Inventory.getFirst(ItemIdArrays.RING_OF_WEALTH).interact("Wear");

// Check slots
if (Inventory.isFull()) { ... }
if (Inventory.getFreeSlots() < 5) { ... }
```

---

# Equipment
`net.unethicalite.api.items.Equipment`

## Static Methods - Query
```java
query() → ItemQuery
query(Supplier<List<Item>> supplier) → ItemQuery
```

## Static Methods - Item Retrieval
```java
getAll() → List<Item>
getAll(Predicate<Item> filter) → List<Item>
getAll(int... ids) → List<Item>
getAll(String... names) → List<Item>
getFirst(Predicate<Item> filter) → Item
getFirst(int... ids) → Item
getFirst(String... names) → Item
fromSlot(EquipmentInventorySlot slot) → Item
```

## Static Methods - Contains
```java
contains(Predicate<Item> filter) → boolean
contains(int... id) → boolean
contains(String... name) → boolean
containsAllOf(int... ids) → boolean
containsAllOf(List<Integer> equipmentIdList) → boolean
```

## Static Methods - Count
```java
getCount(boolean stacks, Predicate<Item> filter) → int
getCount(boolean stacks, int... ids) → int
getCount(boolean stacks, String... names) → int
getCount(Predicate<Item> filter) → int
getCount(int... ids) → int
getCount(String... names) → int
```

## Usage Examples
Source: `plugins/clean_enhanced/sotf/framework/BankingUtil.java`

```java
// Check equipped item
if (!Equipment.contains(ItemIdArrays.RING_OF_WEALTH)) {
    Inventory.getFirst(ItemIdArrays.RING_OF_WEALTH).interact("Wear");
}

// Get weapon
Item weapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
```

---

# GrandExchange
`net.unethicalite.api.items.GrandExchange`

## Static Methods - State
```java
isOpen() → boolean
isSetupOpen() → boolean
isSelling() → boolean
isBuying() → boolean
isFull() → boolean
isEmpty() → boolean
isSearchingItem() → boolean
canCollect() → boolean
getView() → View
getItemId() → int
getPrice() → int
getQuantity() → int
getGuidePrice() → int
getEmptySlots() → int
getOffers() → List<GrandExchangeOffer>
```

## Static Methods - Actions
```java
open() → void
openBank() → void
openItemSearch() → void
collect() → void
collect(boolean toBank) → void
confirm() → void
createBuyOffer() → void
abortOffer(int itemId) → void
setItem(int id) → void
setPrice(int price) → void
setQuantity(int quantity) → void
```

## Static Methods - Sell
```java
sell(Predicate<Item> filter) → void
sell(int... ids) → void
sell(String... names) → void
sell(int itemId, int quantity, int price) → boolean
sell(int itemId, int quantity, int price, boolean collect, boolean toBank) → boolean
```

## Static Methods - Buy
```java
buy(int itemId, int quantity, int price) → boolean
buy(int itemId, int quantity, int price, boolean collect, boolean toBank) → boolean
```

## Static Methods - Exchange
```java
exchange(boolean buy, int itemId, int quantity, int price) → boolean
exchange(boolean buy, int itemId, int quantity, int price, boolean collect, boolean toBank) → boolean
```

## Enums
```java
enum View { CLOSED, OFFERS, BUYING, SELLING, UNKNOWN }
```

## Usage Examples
Source: Framework decompiled

```java
// Open GE bank
GrandExchange.openBank();

// Buy item
GrandExchange.buy(itemId, quantity, price);

// Collect all
if (GrandExchange.canCollect()) {
    GrandExchange.collect();
}

// Create buy offer
if (!GrandExchange.isFull()) {
    GrandExchange.createBuyOffer();
}
```
