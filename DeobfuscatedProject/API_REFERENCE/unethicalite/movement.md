# Unethicalite Movement Package
`net.unethicalite.api.movement`

---

# Movement
`net.unethicalite.api.movement.Movement`

## Static Methods - Walking
```java
walk(WorldPoint destination) → void
walk(int x, int y, int plane) → void
walk(Locatable locatable) → void
walk(TileObject tileObject) → void
walkTo(WorldPoint destination) → boolean
walkTo(WorldArea destination) → boolean
walkTo(BankLocation bankLocation) → boolean
setDestination(WorldPoint destination) → void
setDestination(int x, int y) → void
```

## Static Methods - Run Energy
```java
getRunEnergy() → int
isRunEnabled() → boolean
isStaminaBoosted() → boolean
toggleRun() → void
shouldWalk() → boolean
```

## Static Methods - Path Info
```java
getDestination() → WorldPoint
isWalking() → boolean
```

## Static Methods - Destination Distance
```java
getDestinationDistance() → int
```

## Constants
```java
private static final int STAMINA_VARBIT = 25
```

## Usage Examples
Source: `plugins/clean_enhanced/sotf/framework/BankingUtil.java`, Walker.java

```java
// Basic walk
Movement.walkTo(BankLocation.VARROCK_WEST_BANK);

// Walk to point
Movement.walk(new WorldPoint(3164, 3485, 0));

// Check and enable run
if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 20) {
    Movement.toggleRun();
    Time.sleepUntil(Movement::isRunEnabled, 2000);
}

// Check stamina
if (Movement.isStaminaBoosted()) { ... }

// Should walk check (game tick rate limiting)
if (Movement.shouldWalk()) {
    Movement.walk(destination);
}
```

---

# Walker
`net.unethicalite.api.movement.pathfinder.Walker`

## Constants
```java
public static final int MAX_INTERACT_DISTANCE = 20
private static final int MIN_TILES_WALKED_IN_STEP = 7
private static final int MAX_TILES_WALKED_IN_STEP = 14
private static final int MAX_MIN_ENERGY = 50
private static final int MIN_ENERGY = 5
private static final int MAX_NEAREST_SEARCH_ITERATIONS = 10
```

## Static Methods - Walking
```java
walkTo(WorldPoint destination) → boolean
walkTo(WorldPoint destination, boolean useTeleports) → boolean
walkTo(WorldArea destination) → boolean
walkTo(WorldArea destination, boolean useTeleports) → boolean
walkAlong(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports) → boolean
stepAlong(List<WorldPoint> path) → boolean
step(WorldPoint destination) → boolean
```

## Static Methods - Path Building
```java
buildPath(WorldPoint destination) → List<WorldPoint>
buildPath(WorldPoint destination, boolean forced) → List<WorldPoint>
buildPath(WorldArea destination) → List<WorldPoint>
buildPath(WorldArea destination, boolean forced) → List<WorldPoint>
buildPath(WorldArea destination, boolean avoidWilderness, boolean forced) → List<WorldPoint>
buildPath(WorldArea destination, boolean avoidWilderness, boolean forced, boolean useTeleports) → List<WorldPoint>
buildPath(List<WorldPoint> startPoints, WorldPoint destination, boolean avoidWilderness, boolean forced) → List<WorldPoint>
buildPath(List<WorldPoint> startPoints, WorldArea destination, boolean avoidWilderness, boolean forced) → List<WorldPoint>
buildPath(List<WorldPoint> startPoints, WorldArea destination, boolean avoidWilderness, boolean forced, int maxSearchDistance) → List<WorldPoint>
```

## Static Methods - Path Calculation
```java
calculatePath(WorldPoint destination) → List<WorldPoint>
calculatePath(WorldArea destination) → List<WorldPoint>
calculatePath(List<WorldPoint> startPoints, WorldPoint destination) → List<WorldPoint>
calculatePath(List<WorldPoint> startPoints, WorldArea destination) → List<WorldPoint>
calculateTilePath(WorldArea destination) → TilePath
calculateTilePath(List<WorldPoint> startPoints, WorldArea destination) → TilePath
calculateTilePath(List<WorldPoint> startPoints, WorldArea destination, CollisionMap collisionMap) → TilePath
```

## Static Methods - Transport Handling
```java
buildTransportLinks() → Map<WorldPoint, List<Transport>>
buildTeleportLinks(WorldArea destination) → LinkedHashMap<WorldPoint, Teleport>
handleTransports(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports) → boolean
```

## Static Methods - Path Utilities
```java
remainingPath(List<WorldPoint> path) → List<WorldPoint>
reachablePath(List<WorldPoint> remainingPath) → List<WorldPoint>
nearestWalkableTile(WorldPoint source) → WorldPoint
nearestWalkableTile(WorldPoint source, Predicate<WorldPoint> filter) → WorldPoint
```

## Usage Examples
Source: Walker.java

```java
// Walk to destination with teleports
Walker.walkTo(destination, true);

// Walk without teleports
Walker.walkTo(destination, false);

// Check if at destination
if (destination.contains(Players.getLocal())) {
    return true;
}

// Build path manually
List<WorldPoint> path = Walker.buildPath(destination);
Static.getEntityRenderer().setCurrentPath(path);

// Get remaining path
List<WorldPoint> remaining = Walker.remainingPath(path);

// Find nearest walkable tile
WorldPoint walkable = Walker.nearestWalkableTile(source, x -> true);
```

---

# Reachable
`net.unethicalite.api.movement.Reachable`

## Static Methods
```java
isWalkable(WorldPoint worldPoint) → boolean
isWalkable(Tile tile) → boolean
isInteractable(Locatable locatable) → boolean
isReachable(Locatable locatable) → boolean
isDoored(Tile from, Tile to) → boolean
getInteractable(Locatable locatable) → WorldPoint
```

## Usage Examples
```java
// Check if tile is walkable
if (Reachable.isWalkable(destination)) {
    Movement.walk(destination);
}

// Filter reachable points
area.toWorldPointList().stream()
    .filter(Reachable::isWalkable)
    .findFirst();

// Check door between tiles
if (Reachable.isDoored(tileA, tileB)) {
    TileObject door = tileA.getWallObject();
    door.interact("Open");
}
```

---

# BankLocation (Enum)
`net.unethicalite.api.movement.pathfinder.model.BankLocation`

## Common Values
```java
GRAND_EXCHANGE_BANK
VARROCK_WEST_BANK
VARROCK_EAST_BANK
FALADOR_EAST_BANK
FALADOR_WEST_BANK
LUMBRIDGE_TOP_BANK
LUMBRIDGE_BANK
CASTLE_WARS_BANK
BARBARIAN_OUTPOST_BANK
SHANTAY_PASS_BANK
AL_KHARID_BANK
FEROX_ENCLAVE_BANK
EDGEVILLE_BANK
SEERS_VILLAGE_BANK
CATHERBY_BANK
YANILLE_BANK
ARDOUGNE_NORTH_BANK
ARDOUGNE_SOUTH_BANK
GNOME_STRONGHOLD_BANK
CANIFIS_BANK
BURGH_DE_ROTT_BANK
PORT_PHASMATYS_BANK
```

## Instance Methods
```java
getArea() → WorldArea
contains(WorldPoint point) → boolean
```

## Usage Examples
```java
// Walk to bank
Movement.walkTo(BankLocation.GRAND_EXCHANGE_BANK);

// Check if at bank
if (BankLocation.VARROCK_WEST_BANK.getArea().contains(playerLoc)) {
    Bank.open();
}

// Navigate
if (playerLoc.distanceTo(GE_CENTER) > 10) {
    Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
}
```
