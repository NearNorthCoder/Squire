# Task Class Deobfuscation Mappings

This file provides specific mappings for renaming obfuscated task classes based on their `@TaskDesc` annotations.

## Zulrah Plugin (f9e8fbd0-4571-4716-b37b-883b4ae7fc62)

Package: `a.u.i.-.l.r.h.z.s.r.u.q.e`

| Obfuscated | TaskDesc Name | Suggested Rename | Priority | Notes |
|------------|---------------|------------------|----------|-------|
| c | (State Enum) | ZulrahState | - | Enum: BANKING, TRANSPORTING_ZULRAH, COLLECTING_ZULRAH, DONE |
| B | "Pressing continue" | DialogContinueTask | 0x7FFFFFFD | blocking=true |
| y | "Curing venom" | CureVenomTask | 100 | register=true |
| A | "Equipping recoil ring" | EquipRecoilTask | 0x7FFFFFFE | blocking=true |
| ab | "Handling prayers" | PrayerFlickingTask | 0x7FFFFFFF | register=true, subscribes to ProjectileSpawned |
| Q | "Detecting death" | DetectDeathTask | 0x7FFFFFFF | - |
| aa | "Panic tping" | PanicTeleportTask | 0x7FFFFFFF | blocking=true |
| L | "Collecting items" | CollectItemsTask | 0x7FFFFFFE | blocking=true, register=true |
| R | "Equipping gear (deathwalk)" | EquipDeathwalkGearTask | 0x7FFFFFFF | blocking=true |
| S | "Withdrawing teleport" | WithdrawTeleportTask | 0x7FFFFFFF | blocking=true |
| M | "Walking to bank (death)" | WalkToBankDeathTask | 0x7FFFFFFA | blocking=true |
| F | "Entering portal" | EnterPortalTask | 1000 | blocking=true |
| E | "Banking" | BankingTask | 1000 | blocking=true |
| D | "Banking" | BankingCollectionTask | 10 | blocking=true (different context) |
| af | "Looting items" | LootingTask | 10 | blocking=true |
| I | "Opening bank" | OpenBankTask | 5 | blocking=true |
| G | "Walking to bank" | WalkToBankTask | - | - |
| T | "Attacking zulrah" | AttackZulrahTask | 35 | register=true |
| X | "Eating for space" | EatForSpaceTask | 0x7FFFFFFF | register=true |
| W | "Eating" | EatingTask | 50 | - |
| Y | "Enabling special" | EnableSpecialTask | 50 | - |
| V | "Drinking potions" | DrinkPotionsTask | 5 | - |
| ak | "Drinking potions" | DrinkCombatPotionsTask | 5 | (different context) |
| ae | "Disabling prayers" | DisablePrayersTask | 100 | - |
| U | "Dodging Melee" | DodgeMeleeTask | 30 | blocking=true |
| Z | "Moving to safespot" | MoveToSafespotTask | 15 | - |
| ac | "Swapping gear" | SwapGearTask | 50 | - |
| al | "Equipping mage gear" | EquipMageGearTask | 10 | - |
| J | "Teleporting to Zul'Andra" | TeleportToZulAndraTask | 5 | - |
| ao | "Teleporting to Zul-andra" | TeleportToZulAndraTask2 | - | (variant) |
| ai | "Teleporting out" | TeleportOutTask | 1 | - |
| ah | "Returning to Zul'Andra" | ReturnToZulAndraTask | 10 | blocking=true |
| ap | "Traversing to Zul-andra" | TraverseToZulAndraTask | - | - |
| aj | "Boarding boat" | BoardBoatTask | 10 | - |
| N | "Going to Zulrah (Deathwalk)" | ZulrahDeathwalkTask | - | - |
| O | "Opening bank for zulrah teleport" | OpenBankForTeleportTask | 0x7FFFFFFD | blocking=true |
| H | "Handling house" | HandlePOHTask | 10 | - |
| an | "Using imbued heart" | UseImbuedHeartTask | 5 | - |
| C | "Turning on run" | EnableRunTask | - | - |

**Total: ~71 classes (including enums, overlays, configs)**

---

## Vorkath Plugin (70c49992-0f4a-4f1f-b83d-1bdcbc531725)

Package: `i.v.k.o.-.u.s.e.r.a.q.r.t.h`

| Obfuscated | TaskDesc Name | Suggested Rename | Priority | Notes |
|------------|---------------|------------------|----------|-------|
| A | "Pray" | PrayerFlickingTask | 0x7FFFFFFF | - |
| x | "Flee" | FleeTask | 108 | register=true |
| b | "Claiming death items" | ClaimDeathItemsTask | 125 | register=true, blocking=true |
| L | "Loot" | LootingTask | 2000 | blocking=true |
| z | "Poke" | PokeTask | 250 | blocking=true |
| y | "Killing zombified spawn" | KillSpawnTask | 50 | - |
| u | "Attack" | AttackVorkathTask | 10 | register=true |
| B | "Spec" | SpecialAttackTask | 11 | - |
| G | "Eat" | EatingTask | 110 | - |
| I | "Tick eat" | TickEatTask | 200 | - |
| E | "Drinking Antifire Potion" | DrinkAntifireTask | 110 | - |
| F | "Drinking Combat Potion" | DrinkCombatPotionTask | 109 | - |
| H | "Prayer pot" | DrinkPrayerPotionTask | 110 | - |
| J | "Venom" | CureVenomTask | 110 | register=true |
| C | "Swapping bolts" | SwapBoltsTask | 50 | - |
| D | "Walking to original safe spot" | WalkToSafespotTask | 25 | blocking=true |
| v | "Dodge" | DodgeTask | 25 | - |
| o | "Banking" | BankingTask | 80 | blocking=true |
| s | "Opening bank" | OpenBankTask | 75 | blocking=true |
| n | "Using Bankloadout" | UseBankloadoutTask | 80 | blocking=true |
| q | "Walking to bank" | WalkToBankTask | 79 | - |
| p | "Entering portal" | EnterPortalTask | 1000 | blocking=true |
| P | "Entering fight" | EnterFightTask | 100 | blocking=true |
| M | "Boarding boat" | BoardBoatTask | 105 | blocking=true |
| O | "Traversing to Rel" | TraverseToRelTask | 100 | - |
| t | "Teleporting to Relleka" | TeleportToRellekaTask | 5 | - |
| r | "Handling house" | HandlePOHTask | 84 | register=true, blocking=true |
| K | "Alching item" | AlchingTask | 300 | - |

**Total: ~48 classes**

---

## Hydra Plugin (f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e)

Package: `u.i.r.d.s.e.r.q.y.a.h.-`

| Obfuscated | TaskDesc Name | Suggested Rename | Priority | Notes |
|------------|---------------|------------------|----------|-------|
| x | "Handling Hydra prayers" | HydraPrayerTask | 0x7FFFFFFF | - |
| w | "Moving towards the next tile" | MoveToNextTileTask | 2 | register=true |
| s | "Attacking hydra" | AttackHydraTask | - | - |
| n | "Entering hydra room" | EnterHydraRoomTask | 5 | blocking=true |
| u | "Fire skip" | FireSkipTask | 5 | blocking=true |
| v | "Dodging lightning" | DodgeLightningTask | 5 | blocking=true, register=true |
| t | "Using blowpipe spec" | BlowpipeSpecTask | 100 | - |
| r | "Eating" | EatingTask | 10 | - |
| p | "Restoring prayer" | RestorePrayerTask | 20 | - |
| o | "Curing poison" | CurePoisonTask | 20 | - |
| q | "Drinking range potion" | DrinkRangePotionTask | 20 | - |
| z | "Burying bones" | BuryBonesTask | 20 | - |
| A | "Looting Items" | LootingTask | 10 | blocking=true, register=true |
| B | "Walking back to start" | WalkToStartTask | - | - |
| y | "Alching items" | AlchingTask | 15 | blocking=true |
| C | "Teleport out" | TeleportOutTask | 250 | blocking=true |

**Total: ~32 classes (most efficient implementation)**

---

## Bandos Plugin (f13c63fa-3e76-4035-9dfa-e833a382cd4c)

Package: `q.s.r.i.e.s.o.u.a.d.n.-.b`

| Obfuscated | TaskDesc Name | Suggested Rename | Priority | Notes |
|------------|---------------|------------------|----------|-------|
| m | "Attacking bandos" | AttackBandosTask | 10 | - |
| A | "Getting killcount" | GetKillcountTask | 5 | - |
| p | "Flicking prayers" | PrayerFlickingTask | 25 | - |
| r | "Moving to next tile" | MoveToNextTileTask | 9 | register=true |
| o | "Eating food" | EatingTask | 8 | - |
| t | "Consuming peaches" | ConsumePeachesTask | 5 | blocking=true |
| n | "Drinking stamina dose" | DrinkStaminaTask | 8 | - |
| x | "Drinking range potion" | DrinkRangePotionTask | - | - |
| s | "Casting B2P" | CastBonesToPeachesTask | 6 | - |
| q | "Killing minions" | KillMinionsTask | - | - |
| l | "Teleporting out" | TeleportOutTask | 100 | blocking=true, register=true |
| v | "Looting Items" | LootingTask | 5 | blocking=true |
| u | "High alching" | AlchingTask | 5 | blocking=true |
| w | "Placing cannon base" | PlaceCannonTask | 20 | blocking=true |
| y | "Equipping Bowfa" | EquipBowfaTask | - | - |
| z | "Moving to starting tile" | MoveToStartTileTask | - | - |

**Total: ~30 classes**

---

## Zammy Plugin (f8a8c131-0c60-4150-a875-6d5d0cb07058)

Package: `m.e.a.i.z.m.r.-.q.s.y.u`

| Obfuscated | TaskDesc Name | Suggested Rename | Priority | Notes |
|------------|---------------|------------------|----------|-------|
| o | "Attacking zamorak" | AttackZamorakTask | 10 | - |
| E | "Getting Killcount" | GetKillcountTask | 5 | - |
| s | "Flicking prayers" | PrayerFlickingTask | 25 | - |
| u | "Moving to next tile" | MoveToNextTileTask | 9 | register=true |
| r | "Eating food" | EatingTask | 8 | - |
| q | "Drinking stamina dose" | DrinkStaminaTask | 8 | - |
| p | "Drinking Poison Cure" | DrinkPoisonCureTask | 8 | - |
| C | "Drinking range potion" | DrinkRangePotionTask | - | - |
| A | "Killing minions" | KillMinionsTask | 2 | blocking=true |
| z | "Killing last minion with ranged" | KillLastMinionRangedTask | - | - |
| n | "Teleporting out" | TeleportOutTask | 100 | blocking=true |
| v | "Looting Items" | LootingTask | 5 | blocking=true |
| x | "Equipping Mage Gear" | EquipMageGearTask | - | - |
| y | "Equipping Ranged Gear" | EquipRangedGearTask | 100 | - |
| B | "Placing cannon base" | PlaceCannonTask | 20 | blocking=true |
| w | "Blood barragin rest" | BloodBarrageRestTask | - | - |
| t | "Recovering from getting stuck on a tile" | RecoverFromStuckTask | - | - |
| D | "Moving to starting tile" | MoveToStartTileTask | - | - |

**Total: ~34 classes**

---

## Saradomin Plugin (9cc2ff9a-834c-471c-85e9-f55eb9ce18c7)

Package: `u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e`

| Obfuscated | TaskDesc Name | Suggested Rename | Priority | Notes |
|------------|---------------|------------------|----------|-------|
| t | "Attacking Zilyana" | AttackZilyanaTask | 10 | - |
| y | "Getting Killcount" | GetKillcountTask | 5 | - |
| z | "Handling kc prayers" | KCPrayerTask | 10 | - |
| u | "Flicking prayers" | PrayerFlickingTask | 25 | - |
| w | "Moving to next tile" | MoveToNextTileTask | 9 | register=true |
| s | "Eating food" | EatingTask | 8 | - |
| B | "Consuming peaches" | ConsumePeachesTask | 5 | blocking=true |
| r | "Drinking stamina dose" | DrinkStaminaTask | 8 | - |
| H | "Drinking range potion" | DrinkRangePotionTask | - | - |
| A | "Casting B2P" | CastBonesToPeachesTask | 6 | - |
| F | "Killing minions" | KillMinionsTask | - | - |
| n | "Teleporting out" | TeleportOutTask | 100 | blocking=true |
| D | "Looting Items" | LootingTask | 5 | blocking=true |
| C | "High alching" | AlchingTask | 5 | blocking=true |
| I | "Equipping Bowfa" | EquipBowfaTask | - | - |
| x | "Entering room" | EnterRoomTask | - | register=true |
| q | "Withdrawing items" | WithdrawItemsTask | - | - |
| p | "Walking to Godwars" | WalkToGodwarsTask | - | - |
| E | "Restoring Prayer at Altar" | RestorePrayerAltarTask | 30 | - |
| m | "Enabling run" | EnableRunTask | 10 | - |
| v | "Recovering from getting stuck on a tile" | RecoverFromStuckTask | 10 | - |
| G | "Returning back to starting tile" | ReturnToStartTileTask | - | blocking=true |

**Total: ~38 classes**

---

## Common Task Type Identification Guide

### By Priority:
- **0x7FFFFFFF** → Prayer/Critical Safety Tasks
- **0x7FFFFFFE-0x7FFFFFFD** → Emergency/High Priority Actions
- **1000-2000** → Looting/Portal Entry/Banking
- **100-500** → Eating/Potions/Dodging
- **50-99** → Special Attacks/Gear Swapping
- **10-49** → Combat/Movement
- **1-9** → Background Tasks

### By Attributes:
- **blocking=true** → Must complete before other tasks
- **register=true** → Subscribes to game events
- **Both** → Critical mechanic requiring event monitoring

### By Name Pattern:
- "Handling/Flicking prayers" → Prayer management
- "Attacking {boss}" → Main combat task
- "Eating" / "Drinking" → Consumables
- "Moving to" / "Walking to" → Movement
- "Teleporting" → Transportation
- "Looting" → Loot collection
- "Equipping" / "Swapping" → Gear management
- "Dodging" / "Avoiding" → Mechanic avoidance
- "Entering" / "Boarding" → Instance/area entry
- "Banking" / "Withdrawing" → Bank operations

---

## Usage Instructions

1. **Locate obfuscated class** in decompiled source
2. **Find @TaskDesc annotation** at class level
3. **Look up task name** in appropriate plugin section above
4. **Rename class file** to suggested name
5. **Update package** from obfuscated to readable structure:
   - From: `a.u.i.-.l.r.h.z.s.r.u.q.e.ab`
   - To: `gg.squire.zulrah.tasks.PrayerFlickingTask`
6. **Update imports** in main plugin class
7. **Update tasks() method** to reference new class names

---

## Notes

- Multiple tasks may share similar names but have different priorities/contexts
- Some plugins have duplicate task names - check priority and implementation
- GWD plugins (Bandos/Zammy/Sara) share almost identical task structures
- Hydra is the most streamlined implementation with fewest tasks
- Zulrah is the most complex with multiple transportation and gear switching tasks
