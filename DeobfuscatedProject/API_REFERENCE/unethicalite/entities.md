# Unethicalite Entities Package
`net.unethicalite.api.entities`

---

# NPCs
`net.unethicalite.api.entities.NPCs`

Extends `Entities<NPC>`. Provides query methods for NPCs in the game scene.

## Static Methods - Query
```java
query() → NPCQuery
query(Supplier<List<NPC>> supplier) → NPCQuery
```

## Static Methods - Get All
```java
getAll() → List<NPC>
getAll(Predicate<NPC> filter) → List<NPC>
getAll(int... ids) → List<NPC>
getAll(String... names) → List<NPC>
```

## Static Methods - Get Nearest
```java
getNearest(Predicate<NPC> filter) → NPC
getNearest(int... ids) → NPC
getNearest(String... names) → NPC
getNearest(WorldPoint to, Predicate<NPC> filter) → NPC
getNearest(WorldPoint to, int... ids) → NPC
getNearest(WorldPoint to, String... names) → NPC
```

## Static Methods - Rendering
```java
render(Graphics2D graphics, NPC npc, Color color) → void
```

## Usage Examples
Source: Framework decompiled (NPCs.java)

```java
// Get NPC by name (uses player location)
NPC target = NPCs.getNearest("Zombified Spawn");

// Check if NPC exists and is alive
if (target != null && !target.isDead()) {
    target.interact("Attack");
}

// Get NPC with predicate
NPC npc = NPCs.getNearest(n -> n.getId() == 4416);

// Get all NPCs by name
List<NPC> npcs = NPCs.getAll("Guard");

// Get nearest to specific WorldPoint
NPC closest = NPCs.getNearest(worldPoint, "Banker");
```

---

# TileObjects
`net.unethicalite.api.entities.TileObjects`

Extends `TileEntities<TileObject>`. Provides query methods for game objects.

## Static Methods - Query
```java
query() → TileObjectQuery
query(Supplier<List<TileObject>> supplier) → TileObjectQuery
```

## Static Methods - Get All
```java
getAll() → List<TileObject>
getAll(Predicate<TileObject> filter) → List<TileObject>
getAll(int... ids) → List<TileObject>
getAll(String... names) → List<TileObject>
```

## Static Methods - Get Nearest
```java
getNearest(Predicate<TileObject> filter) → TileObject
getNearest(int... ids) → TileObject
getNearest(String... names) → TileObject
getNearest(WorldPoint to, Predicate<TileObject> filter) → TileObject
getNearest(WorldPoint to, int... ids) → TileObject
getNearest(WorldPoint to, String... names) → TileObject
```

## Static Methods - Get At (Returns List)
```java
getAt(WorldPoint worldPoint, Predicate<TileObject> filter) → List<TileObject>
getAt(WorldPoint worldPoint, int... ids) → List<TileObject>
getAt(WorldPoint worldPoint, String... names) → List<TileObject>
getAt(Tile tile, Predicate<TileObject> filter) → List<TileObject>
getAt(Tile tile, int... ids) → List<TileObject>
getAt(Tile tile, String... names) → List<TileObject>
getAt(int worldX, int worldY, int plane, Predicate<TileObject> filter) → List<TileObject>
getAt(int worldX, int worldY, int plane, int... ids) → List<TileObject>
getAt(int worldX, int worldY, int plane, String... names) → List<TileObject>
```

## Static Methods - Get First At
```java
getFirstAt(WorldPoint worldPoint, Predicate<TileObject> filter) → TileObject
getFirstAt(WorldPoint worldPoint, int... ids) → TileObject
getFirstAt(WorldPoint worldPoint, String... names) → TileObject
getFirstAt(Tile tile, Predicate<TileObject> filter) → TileObject
getFirstAt(Tile tile, int... ids) → TileObject
getFirstAt(Tile tile, String... names) → TileObject
getFirstAt(int worldX, int worldY, int plane, Predicate<TileObject> filter) → TileObject
getFirstAt(int worldX, int worldY, int plane, int... ids) → TileObject
getFirstAt(int worldX, int worldY, int plane, String... names) → TileObject
```

## Static Methods - Get Surrounding
```java
getSurrounding(WorldPoint worldPoint, int radius, Predicate<TileObject> filter) → List<TileObject>
getSurrounding(WorldPoint worldPoint, int radius, int... ids) → List<TileObject>
getSurrounding(WorldPoint worldPoint, int radius, String... names) → List<TileObject>
getSurrounding(Tile tile, int radius, Predicate<TileObject> filter) → List<TileObject>
getSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileObject> filter) → List<TileObject>
getSurrounding(int worldX, int worldY, int plane, int radius, int... ids) → List<TileObject>
getSurrounding(int worldX, int worldY, int plane, int radius, String... names) → List<TileObject>
```

## Static Methods - Get First Surrounding
```java
getFirstSurrounding(WorldPoint worldPoint, int radius, Predicate<TileObject> filter) → TileObject
getFirstSurrounding(WorldPoint worldPoint, int radius, int... ids) → TileObject
getFirstSurrounding(WorldPoint worldPoint, int radius, String... names) → TileObject
getFirstSurrounding(Tile tile, int radius, Predicate<TileObject> filter) → TileObject
getFirstSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileObject> filter) → TileObject
getFirstSurrounding(int worldX, int worldY, int plane, int radius, int... ids) → TileObject
getFirstSurrounding(int worldX, int worldY, int plane, int radius, String... names) → TileObject
```

## Static Methods - Within Area
```java
within(WorldArea area, Predicate<TileObject> filter) → List<TileObject>
within(WorldArea area, int... ids) → List<TileObject>
within(WorldArea area, String... names) → List<TileObject>
```

## Static Methods - Rendering
```java
render(Graphics2D graphics, TileObject tileObject, Color color) → void
```

## Usage Examples
Source: Framework decompiled (TileObjects.java)

```java
// Get nearest by name (uses player location)
TileObject bankChest = TileObjects.getNearest("Bank chest");

// Get nearest to specific point
TileObject booth = TileObjects.getNearest(playerLoc, "Bank booth");

// Check actions and interact
if (bankChest != null && bankChest.hasAction("Use")) {
    bankChest.interact("Use");
}

// Get first surrounding
TileObject obj = TileObjects.getFirstSurrounding(3163, 3490, 0, 5, x -> x.hasAction("Exchange"));

// Get at specific WorldPoint
TileObject rockfall = TileObjects.getFirstAt(worldPoint, "Rockfall");

// Filter with predicate
TileObject door = TileObjects.getFirstAt(tile,
    it -> !(it instanceof WallObject) && it.getName() != null && it.getName().equals("Door"));
```

---

# Players
`net.unethicalite.api.entities.Players`

Extends `Entities<Player>`. Provides query methods for players in the game scene.

## Static Methods - Query
```java
query() → PlayerQuery
query(Supplier<List<Player>> supplier) → PlayerQuery
```

## Static Methods - Local Player
```java
getLocal() → Player
getHintArrowed() → Player
```

## Static Methods - Get All
```java
getAll() → List<Player>
getAll(Predicate<Player> filter) → List<Player>
getAll(String... names) → List<Player>
```

## Static Methods - Get Nearest
```java
getNearest(Predicate<Player> filter) → Player
getNearest(String... names) → Player
getNearest(WorldPoint to, Predicate<Player> filter) → Player
getNearest(WorldPoint to, String... names) → Player
```

## Player Methods (Instance)
```java
getWorldLocation() → WorldPoint
getWorldArea() → WorldArea
isIdle() → boolean
isAnimating() → boolean
isMoving() → boolean
isDead() → boolean
getHealthScale() → int
getHealthRatio() → int
getAnimation() → int
getInteracting() → Actor
getName() → String
getCombatLevel() → int
```

## Usage Examples
Source: `plugins/clean_enhanced/sotf/framework/BankingUtil.java`

```java
// Get local player
Player local = Players.getLocal();

// Get player location
WorldPoint playerLoc = Players.getLocal().getWorldLocation();

// Check animation
if (Players.getLocal().getAnimation() == -1) { ... }

// Check if idle
if (!Players.getLocal().isIdle()) {
    return true; // still busy
}

// Get all other players
List<Player> others = Players.getAll(p -> !p.equals(Players.getLocal()));
```

---

# TileItems
`net.unethicalite.api.entities.TileItems`

## Static Methods - Query
```java
query() → TileItemQuery
query(Supplier<List<TileItem>> supplier) → TileItemQuery
```

## Static Methods - Get All
```java
getAll() → List<TileItem>
getAll(Predicate<TileItem> filter) → List<TileItem>
getAll(int... ids) → List<TileItem>
getAll(String... names) → List<TileItem>
getSurrounding(WorldPoint worldPoint, int radius, Predicate<TileItem> filter) → List<TileItem>
getSurrounding(int x, int y, int z, int radius, Predicate<TileItem> filter) → List<TileItem>
```

## Static Methods - Get First
```java
getFirst(Predicate<TileItem> filter) → TileItem
getFirst(int... ids) → TileItem
getFirst(String... names) → TileItem
getFirstAt(WorldPoint worldPoint, Predicate<TileItem> filter) → TileItem
getFirstAt(WorldPoint worldPoint, int... ids) → TileItem
getFirstAt(WorldPoint worldPoint, String... names) → TileItem
getFirstAt(Tile tile, Predicate<TileItem> filter) → TileItem
getFirstSurrounding(WorldPoint worldPoint, int radius, Predicate<TileItem> filter) → TileItem
getFirstSurrounding(int x, int y, int z, int radius, Predicate<TileItem> filter) → TileItem
```

## Static Methods - Get Nearest
```java
getNearest(Predicate<TileItem> filter) → TileItem
getNearest(int... ids) → TileItem
getNearest(String... names) → TileItem
getNearestToPlayer(Predicate<TileItem> filter) → TileItem
getNearestToPlayer(int... ids) → TileItem
getNearestToPlayer(String... names) → TileItem
```

## TileItem Methods (Instance)
```java
pickup() → void
interact(String action) → void
getName() → String
getId() → int
getQuantity() → int
getWorldLocation() → WorldPoint
getTile() → Tile
```

## Usage Examples
Source: Framework decompiled

```java
// Get nearest loot
TileItem loot = TileItems.getNearest("Bones", "Coins");

// Pickup item
if (loot != null) {
    loot.pickup();
}

// Get all items at location
List<TileItem> items = TileItems.getAll(item -> item.getQuantity() > 100);

// Filter by value
TileItem valuable = TileItems.getNearest(item ->
    item.getName().contains("Dragon") || item.getName().contains("Rune"));
```

---

# Tiles
`net.unethicalite.api.scene.Tiles`

## Static Methods
```java
getAt(WorldPoint worldPoint) → Tile
getAt(int x, int y, int plane) → Tile
getAt(LocalPoint localPoint, int plane) → Tile
getHoveredTile() → Tile
getAll() → List<Tile>
getAll(Predicate<Tile> filter) → List<Tile>
getSurrounding(WorldPoint worldPoint, int radius) → List<Tile>
```

## Usage Examples
```java
// Get tile at location
Tile tile = Tiles.getAt(worldPoint);

// Check tile exists
if (tile != null) {
    WallObject wall = tile.getWallObject();
}

// Get surrounding tiles
List<Tile> nearby = Tiles.getSurrounding(Players.getLocal().getWorldLocation(), 5);
```
