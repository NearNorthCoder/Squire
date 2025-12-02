# Squire Shared Files & Deobfuscation Status

## Project Structure Overview

```
/home/user/Squire/DeobfuscatedProject/
├── client/src/c/r/m/           # 39 CORE CLIENT CLASSES (heavily obfuscated)
├── deobfuscated/src/squire/    # 41 CLEAN CLIENT FILES (auth, ui, util, config)
├── plugins/
│   ├── src/                    # 68 ORIGINAL OBFUSCATED PLUGINS (UUID directories)
│   ├── clean_enhanced/         # 62 WORKING DEOBFUSCATION COPIES
│   ├── clean/                  # Intermediate cleaned versions
│   └── deobfuscated/           # Earlier deobfuscation attempts
```

---

## Shared vs Plugin-Embedded Classes

### Key Finding: Utility Classes are NOT Truly Shared

The utility classes (`a.java`, `e.java`, `f.java`, `g.java`) are **embedded within each plugin** - NOT shared across plugins. Each plugin has its OWN copy in its obfuscated package structure.

**Example - SOTF Plugin (UUID: 7c1d3521-d222-494e-8c51-697efca0674b):**
```
plugins/src/7c1d3521.../o/c/k/i/-/l/o/f/-/n/c/t/e/s/
├── a.java  → BankingUtil (bank operations)
├── b.java  → ShoppingUtil (GE buying)
├── e.java  → GameStateUtil (game state, varbits)
├── f.java  → ItemIdArrays (item ID constants)
├── g.java  → DialogUtil (NPC dialog)
└── [90+ more obfuscated files]
```

### Framework Classes We Created (SOTF Only)

Located at: `/DeobfuscatedProject/plugins/clean_enhanced/sotf/framework/`

| File | Original | Purpose |
|------|----------|---------|
| `BankingUtil.java` | `a.java` | Bank operations, withdrawals |
| `DialogUtil.java` | `g.java` | NPC dialog, chat options |
| `GameStateUtil.java` | `e.java` | Varbits, game state, world hopping |
| `ItemIdArrays.java` | `f.java` | Item ID constants (potions, gear) |
| `GrandExchangeUtil.java` | `b.java` | GE buying operations |
| `ShopItem.java` | `d.java` | Shopping list item class |
| `QuestStep.java` | interface | Quest step interface |
| `Constants.java` | various | Shared constants |

---

## Client Core Classes (Highest Priority Shared Code)

Location: `/DeobfuscatedProject/client/src/c/r/m/`

**39 heavily obfuscated files** - These appear to be the ACTUAL shared client infrastructure:

```
a.java through z.java (26 files)
A.java through M.java (13 files)
```

### Already Deobfuscated Client Code

Location: `/DeobfuscatedProject/deobfuscated/src/squire/`

| Package | Status | Files |
|---------|--------|-------|
| `squire/auth/` | ✅ CLEAN | 12 files (OAuth, sessions, tokens) |
| `squire/ui/` | ✅ CLEAN | 17 files (login UI, panels, themes) |
| `squire/util/` | ✅ CLEAN | 10 files (crypto, platform, files) |
| `squire/config/` | ✅ CLEAN | 2 files (config management) |

---

## Plugins Needing Utility Class Deobfuscation

These plugins likely have similar `a.java`, `e.java`, `f.java`, `g.java` patterns:

### High-Value Plugins (Large, Complex)

| Plugin | UUID | Status |
|--------|------|--------|
| AutoTOA | (named) | ✅ ~95% Complete |
| SOTF | 7c1d3521-d222-494e-8c51-697efca0674b | ✅ ~95% Complete |
| COX | (named) | ⚠️ Needs work |
| Gauntlet | 146c6f65-5ac8-4fe6-9d9c-0b402720538d | ⚠️ Needs work |
| Nightmare | (named) | ⚠️ Needs work |
| TOA | (named) | ⚠️ Needs work |

### Medium Plugins (Could Share Patterns)

| Plugin | Category |
|--------|----------|
| Hydra, Vorkath, Zulrah | PVM Bosses |
| Slayer, Combat | Combat |
| Agility, Mining, Fishing, Woodcutting | Skilling |
| Blast Furnace, Wintertodt, Tempoross | Minigames |

---

## Remaining Work Summary

### 1. Client Core (39 files) - NOT STARTED
```bash
# Location
/home/user/Squire/DeobfuscatedProject/client/src/c/r/m/
```

### 2. Other Plugins with Similar Patterns
Each plugin likely has its own `a.java`, `e.java`, `f.java`, `g.java` that follow the same patterns we decoded in SOTF.

### 3. SOTF Remaining Items
- Fix remaining `f.bk` reference in `AgilityTraining1to50Step.java:330`
- Verify all imports are correct

---

## Search Commands for Next Session

### Find obfuscated patterns in any plugin:
```bash
# Banking utility calls
grep -rn "a\.a\(" /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/[PLUGIN]/

# Dialog utility calls
grep -rn "g\.a\(" /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/[PLUGIN]/

# Item ID arrays
grep -rn "f\.[a-zA-Z]" /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/[PLUGIN]/

# Game state utilities
grep -rn "e\.[a-zA-Z]\(" /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/[PLUGIN]/
```

### Find all plugins with obfuscated utility patterns:
```bash
# Count plugins with obfuscated calls remaining
for dir in /home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/*/; do
  count=$(grep -r "a\.a\(\|g\.a\(\|f\.[a-z]" "$dir" 2>/dev/null | wc -l)
  if [ "$count" -gt 0 ]; then
    echo "$(basename $dir): $count matches"
  fi
done
```

### View original obfuscated source for any plugin:
```bash
# Find plugin UUID from mapping
cat /home/user/Squire/DeobfuscatedProject/uuid_to_plugin_mapping.json | grep -A5 "PLUGIN_NAME"

# Then browse source
ls /home/user/Squire/DeobfuscatedProject/plugins/src/[UUID]/
```

### Check client core obfuscation:
```bash
# View client classes
ls /home/user/Squire/DeobfuscatedProject/client/src/c/r/m/

# Sample a class
head -50 /home/user/Squire/DeobfuscatedProject/client/src/c/r/m/a.java
```

---

## Recommended Next Steps

1. **Fix the one remaining pattern** in SOTF (`f.bk` on line 330)
2. **Analyze client core classes** - Determine if these are truly shared
3. **Create shared framework** - If patterns are identical across plugins, create a single shared framework
4. **Apply SOTF patterns** to other major plugins (COX, Gauntlet, etc.)

---

## Git Branch
Current: `claude/deobfuscate-squire-plugin-01E9CXx1GwiyvD98zJSxPE8R`

Latest Commit: `f51ff3971` - Phase 8: Complete SOTF step files deobfuscation
