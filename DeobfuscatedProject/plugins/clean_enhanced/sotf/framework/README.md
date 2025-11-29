# SOTF Framework Classes

This directory contains deobfuscated versions of the utility classes from the obfuscated package `o.c.k.i.-.l.o.f.-.n.c.t.e.s`.

## Class Mapping

| Obfuscated | Deobfuscated | Status | Purpose |
|------------|--------------|--------|---------|
| `ac` | `QuestStep` | Complete | Interface for quest step implementations |
| `d` | `ShopItem` | Complete | Data class for GE purchase orders |
| `j` | `Constants` | Complete | Timeout and configuration constants |
| `e` | `GameStateUtil` | Stub | Game state queries (varbits, health, etc.) |
| `f` | `ItemIdArrays` | Stub | Item ID constant arrays |
| `a` | - | Not created | Banking operations utility |
| `b` | - | Not created | GE buy/sell operations |
| `g` | - | Not created | NPC dialog handling |

## Usage

### Implementing a Quest Step

```java
import gg.squire.sotf.framework.QuestStep;

public class MyQuestStep implements QuestStep {
    @Override
    public boolean arePrerequisitesMet() {
        // Check if requirements are met
        return Skills.getLevel(Skill.ATTACK) >= 40;
    }

    @Override
    public int execute() {
        // Perform quest actions
        // Return sleep time in milliseconds
        return 1000;
    }

    @Override
    public String getName() {
        return "My Quest Step";
    }

    @Override
    public boolean isComplete() {
        // Check if step is done
        return GameStateUtil.getVarbit(QUEST_VARBIT) >= 5;
    }
}
```

### Buying Items from Grand Exchange

```java
import gg.squire.sotf.framework.ShopItem;
import gg.squire.sotf.framework.Constants;

List<ShopItem> items = new ArrayList<>();
items.add(new ShopItem(ItemID.RUNE_SCIMITAR, 1, Constants.DEFAULT_GE_TIMEOUT));
items.add(new ShopItem(ItemID.LOBSTER, 100, 15000));

// Process with GrandExchangeUtil (b.a() method)
```

### Checking Game State

```java
import gg.squire.sotf.framework.GameStateUtil;
import gg.squire.sotf.framework.ItemIdArrays;

// Check quest progress
int questProgress = GameStateUtil.getVarbit(12345);

// Check health
if (GameStateUtil.getHealthPercentage() < 50.0) {
    // Eat food
}

// Check for stamina potions
if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS)) {
    // Drink stamina
}
```

## Original Source Location

The full obfuscated source is located at:
```
/plugins/deobfuscated_full/7c1d3521-d222-494e-8c51-697efca0674b/o/c/k/i/-/l/o/f/-/n/c/t/e/s/
```

## Notes

- Stub classes contain basic implementations based on usage analysis
- Full implementations may have additional methods not documented here
- Item ID arrays use placeholder values that may need verification
- The obfuscated classes use XOR operations to hide constant values at runtime
