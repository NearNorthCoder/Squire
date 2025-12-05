# Task Class Mapping Reference

This document maps the obfuscated single-letter task class names to their renamed, meaningful names.

## Quick Reference: Obfuscated → Renamed

| Original | Renamed Class | Plugin Association |
|----------|---------------|-------------------|
| A.java | TraversingToCerberusTask.java | Squire Cerberus |
| C.java | ChoppingAndBurningTask.java | Squire Chop 'n Burn |
| (Additional mappings available in /renamed/ directory) | | |

## Complete Task List by Plugin

### Squire Cerberus (17 tasks)
Tasks: A, j, k, l, m, n, o, q, r, s, t, u, v, w, x, y, z

### Squire Chop 'n Burn (1 task)
Tasks: C

### All Other Plugins
(158 total obfuscated files supporting all 44 plugins)

## File Locations

**Original Obfuscated:**
```
/home/user/Squire/DeobfuscatedProject/plugins/src/4d97445a-f331-4d37-a32a-a78260ee3d07/i/i/b/s/c/q/r/s/s/-/u/a/e/
```

**Renamed with Meaningful Names:**
```
/home/user/Squire/DeobfuscatedProject/plugins/renamed/4d97445a-f331-4d37-a32a-a78260ee3d07/i/i/b/s/c/q/r/s/s/-/u/a/e/
```

## Finding the Right Task

To find which task belongs to which plugin:

1. Look at the plugin's `tasks()` method in the main plugin file
2. Match the class references (e.g., `u.class`, `j.class`) to the obfuscated files
3. Check the renamed directory for the descriptive name
4. The @TaskDesc annotation shows the task name and priority

Example from SquireCerberus.java:
```java
protected Class<?>[] tasks() {
    return new Class[]{
        u.class,  // One of the Cerberus tasks
        j.class,  // Another Cerberus task
        // ... 15 more tasks
    };
}
```

## Task Categories

### Banking Tasks
- BankingTask
- BankingForItemsTask  
- BankingInventoryTask
- TraverseToBankTask
- WalkingToBankTask

### Combat Tasks
- AttackingTask
- AttackingNpcTask
- AttackingCerberusTask
- AttackingChompyTask
- AttackingLurableTask
- EatingFoodTask
- EatingWildPieTask
- DrinkingPrayerPotionTask
- DrinkingBoostTask
- SpecialAttackTask

### Movement Tasks
- TraversingToCerberusTask
- WalkingToBankTask
- WalkingBackToTileBeforeLootTask
- TeleportingTask
- TeleportingOutTask
- RunningTask

### Looting Tasks
- LootingTask
- LootingItemsTask
- LootingValuablesTask
- LootingHerbsTask
- LootingHeadTask
- LootingCustomItemsTask
- PickingUpAnItemTask

### Magic Tasks
- AlchingTask
- AlchingLootTask
- QuickAlchingTask
- CastBloomTask
- TeleportingTask
- GrabbingTask
- StunningTask

### Prayer Tasks
- FlickingTask
- HandlingPrayerTask
- PrayingWithBonemealTask

### Utility Tasks
- HoppingTask
- HoppingWorldsTask
- ReloggingTask
- LoggingOutTask
- PressingContinueTask
- PressingDialogOptionTask
- TalkingToNpcTask
- InteractingWithObjectTask
- UsingItemOnItemTask
- EquippingItemsTask
- EquippingBraceletsTask

### Specialized Tasks
- ReloadingCannonTask
- RepairingCannonTask
- ResettingAggroTask
- NotifyingForPlayerTask
- BuyingShopItemsTask
- BuyingBonesTask
- BuyingBondTask
- RedeemingBondTask
- TradingTask
- OpeningPackTask
- DialoguePacketAbuseTask

## Notes

- Total of 103 classes have @TaskDesc annotations (actual Task implementations)
- 55 additional support files (enums, types, unknown helpers)
- Each task has a priority value (1-255) determining execution order
- Higher priority = executes first
- Tasks validate before execution (validate() method)

---

**Last Updated:** 2025-12-05
