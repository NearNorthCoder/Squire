# Squire Basics Collection Plugin

**Plugin UUID:** `4d97445a-f331-4d37-a32a-a78260ee3d07`
**Type:** Utility Plugin Bundle
**Total Plugins:** 44 Individual Utilities
**Total Files:** 241 Java Files
**Status:** Fully Analyzed & Documented

---

## 📁 Directory Structure

```
4d97445a-f331-4d37-a32a-a78260ee3d07/
├── ANALYSIS.md              # Complete technical analysis
├── TASK_MAPPING.md          # Obfuscated → Renamed task mapping
├── README.md                # This file
├── summary.txt              # Original decompilation summary
├── gg/squire/basics/        # 83 deobfuscated plugin files
└── i/i/b/s/c/q/r/s/s/-/u/a/e/  # 158 obfuscated support files
```

---

## 🎯 What is This Plugin?

The "Basics Collection" is a comprehensive bundle of 44 utility plugins for Old School RuneScape automation. Each utility provides specific functionality ranging from combat automation to skilling helpers to quality-of-life improvements.

---

## 📊 Quick Stats

- **44 Main Plugins** (all with @PluginDescriptor)
- **90 Task Classes** (priority-based task execution system)
- **38 Configuration Classes** (user settings)
- **4 Overlay Classes** (visual feedback)
- **47 Helper Classes** (enums, types, utilities)
- **~30,000 Lines of Code**

---

## 🔍 Deobfuscation Status

### ✅ Fully Readable
- All main plugin classes
- All configuration classes  
- All overlay classes
- Package structure restored

### ⚠️ Renamed Only
- Task implementation classes (renamed in `/renamed/` directory)
- Helper/utility classes
- Enum definitions

**Note:** The obfuscated task files still contain:
- Encrypted strings
- Obfuscated control flow
- Meaningless variable names
- But they have been **renamed** with descriptive class names

---

## 📑 Documentation Files

1. **ANALYSIS.md** - Complete technical breakdown including:
   - All 44 plugins listed with descriptions
   - File statistics and categories
   - Common patterns and shared code
   - Obfuscation techniques analysis
   - Deobfuscation status

2. **TASK_MAPPING.md** - Task class reference guide:
   - Obfuscated → Renamed mappings
   - Task categories (Banking, Combat, Magic, etc.)
   - How to find tasks for specific plugins
   - Priority system explanation

3. **README.md** (this file) - Quick overview and navigation

---

## 🗂️ Plugin Categories

| Category | Count | Examples |
|----------|-------|----------|
| Combat & PvM | 11 | Auto Attacker, Auto Eater, Cerberus, Dagannoth Kings |
| Skilling | 8 | Chop n Burn, Construction, Ectofuntus, Secondaries |
| Magic | 4 | Telegrab, Teleporter, Mage Arena, StunAlchTP |
| Prayer | 2 | Prayer Flicker, Jad Flicker |
| Wilderness | 2 | Chaos Altar, Anti PK Assistant |
| Item Management | 5 | Looter, Inventory Assistant, Gear Loadouts, Shop Buyer |
| Muling/Trading | 2 | Exchange Dumper, Trader |
| Favor | 2 | Sandworm Digger, Soldier Healer |
| QOL & Misc | 8 | Quest Helper, Kitten Feeder, Relog Hopper, etc. |

---

## 🚀 Key Features

### Task-Based Architecture
All plugins use a priority-based task execution system:
- Tasks have priorities (1-255)
- Higher priority tasks execute first
- Each task validates before executing
- Modular and reusable across plugins

### Shared Components
Common functionality is implemented in shared task classes:
- Banking, Combat, Movement, Looting
- Dialog handling, Teleportation
- Equipment management, Food consumption

### Heavy Obfuscation
Support classes use aggressive obfuscation:
- String encryption (Base64 + XOR)
- Numeric obfuscation (complex arithmetic)
- Control flow obfuscation
- Confusing variable names (lIllIIlIIll pattern)

---

## 📂 File Paths

**Main Plugin Sources:**
```bash
/home/user/Squire/DeobfuscatedProject/plugins/src/4d97445a-f331-4d37-a32a-a78260ee3d07/
```

**Renamed Task Files:**
```bash
/home/user/Squire/DeobfuscatedProject/plugins/renamed/4d97445a-f331-4d37-a32a-a78260ee3d07/
```

**Alternative Locations:**
- `/plugins/deobfuscated/` - Similar structure
- `/plugins/deobfuscated_full/` - Full deobfuscation attempts

---

## 🔧 Working with This Plugin

### To Find a Specific Plugin:
```bash
cd gg/squire/basics/
ls -la
# Look in subdirectories: combat/, magic/, prayer/, etc.
```

### To Find Task Implementations:
1. Open the main plugin file (e.g., `SquireCerberus.java`)
2. Look at the `tasks()` method
3. Note the class references (e.g., `A.class`, `C.class`)
4. Check `/renamed/` directory for descriptive names

### To Understand Plugin Behavior:
1. Read the @PluginDescriptor annotation
2. Check the Config class for user settings
3. Review the tasks() method for execution flow
4. Look at task classes for implementation details

---

## 🎯 Next Steps

### For Further Deobfuscation:
1. Decrypt all string literals in task files
2. Simplify numeric expressions
3. Rename variables meaningfully
4. Simplify control flow logic
5. Extract and document common patterns

### For Documentation:
1. Create per-plugin documentation
2. Document task execution flows
3. Map all obfuscated → deobfuscated names
4. Create architecture diagrams

### For Analysis:
1. Identify security concerns
2. Document API usage patterns
3. Analyze performance implications
4. Study obfuscation techniques

---

## 📝 Notes

- The "29 plugins" discrepancy: Analysis found 44 total plugins. The number 29 may refer to publicly advertised features or exclude hidden/debug plugins.
- 4 plugins are marked as `hidden=true` in their descriptors
- The aggressive obfuscation suggests proprietary commercial software
- This is a RuneScape automation/botting plugin collection

---

## 📅 Analysis Info

- **Date:** December 5, 2025
- **Decompiler:** CFR 0.152
- **Analysis Tool:** Claude Code Agent
- **Status:** Complete

---

## ⚠️ Disclaimer

This code analysis is for educational and research purposes. The analyzed software appears to be automation/botting software for Old School RuneScape, which may violate the game's terms of service.

---

**For detailed technical analysis, see ANALYSIS.md**
**For task mapping reference, see TASK_MAPPING.md**
