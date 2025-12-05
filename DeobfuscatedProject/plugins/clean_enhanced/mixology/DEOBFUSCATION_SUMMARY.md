# Mixology Plugin Deobfuscation Summary

## Overview
The Mixology plugin (UUID: 37ff9308-5bb6-4332-83e0-8ab13e118f7a) for OSRS automation has been analyzed and partially deobfuscated. This plugin automates the Mixology minigame introduced in OSRS.

## File Statistics
- **Total Source Files**: 23 Java files
- **Files in clean_enhanced**: 24 Java files (including CLASS_MAPPINGS.json)
- **Already Clean Files**: 3 (SquireMixology.java, SquireMixologyConfig.java, MixologyInfoBox.java)
- **Obfuscated Files Requiring Deobfuscation**: 20 files (a.java through t.java)

## Deobfuscation Status

### ✅ Fully Deobfuscated and Documented (3 files)
1. **PluginMode.java** (was d.java)
   - Enum for plugin operating modes (MINIGAME, CREATE_PASTE)
   - Fully documented with Javadoc
   - All strings decrypted
   - Clean variable names

2. **PotionStrategy.java** (was f.java)
   - Enum for potion creation strategy (SINGLE_ORDER, MULTI_ORDER)
   - Fully documented with Javadoc
   - All strings decrypted
   - Clean variable names

3. **MixologyConstants.java** (was r.java)
   - Constants class with game values (ONE, TWO, THREE, DIGWEED_NPC_NAME)
   - Fully documented with Javadoc
   - All strings decrypted
   - Clean variable names

### ⚠️ Partially Deobfuscated (18 files)
The following files exist in clean_enhanced but have issues:

#### Herb Type Enums (5 files)
1. **GameEnum4.java** (should be HerbTypeHighLevel.java - was a.java)
   - Contains: Irit, Cadantine, Lantadyme, Dwarf Weed, Torstol herbs and potions (unf)
   - **Issues**:
     - Wrong class name (GameEnum4 instead of HerbTypeHighLevel)
     - Strings are decrypted but method names still obfuscated (var3(), var4(), var5())
     - Missing comprehensive Javadoc
     - Broken code with orphaned catch blocks

2. **GameEnum2.java** (should be HerbTypeAll.java - was b.java)
   - Contains: All herbs from Guam to Torstol (comprehensive list)
   - **Status**: Needs complete deobfuscation

3. **GameEnum3.java** (should be HerbTypeMidLevel.java - was c.java)
   - Contains: Ranarr, Toadflax, Avantoe, Kwuarm, Snapdragon herbs and potions
   - **Status**: Needs complete deobfuscation

4. **GameEnum5.java** (should be HerbTypeLowLevel.java - was e.java)
   - Contains: Guam, Marrentill, Tarromin, Harralander herbs and potions
   - **Status**: Needs complete deobfuscation

5. **GameEnum.java** (should be Potion.java - was t.java)
   - Contains: Potion definitions with herb requirements
   - **Status**: Not yet examined, needs deobfuscation

#### Utility/Manager Classes (2 files)
6. **MixologyManager.java** (should be MixologyOverlay.java - was g.java)
   - Overlay that renders on game screen
   - **Issues**: Incorrect name, needs proper renaming and documentation
   - **Status**: Partially deobfuscated

7. **MixologyManager.java** (duplicate name conflict - should be MixologyHelper.java - was s.java)
   - Main utility class with helper methods for:
     - Checking inventory for herbs
     - Managing potion orders
     - Interacting with game objects
     - State management
   - **Issues**: Name conflict with overlay class, needs renaming
   - **Status**: Complex file requiring extensive cleanup

#### Task Classes (11 files)
8. **AgitatorTask.java** (was j.java)
   - Task for operating the agitator in Mixology minigame
   - **Status**: Partially deobfuscated, needs cleanup

9. **BankForStaminasTask.java** (was h.java)
   - Task for banking to get stamina potions
   - **Status**: Partially deobfuscated, needs cleanup

10. **DepositHopperTask.java** (was i.java)
    - Task for depositing items into hopper
    - **Status**: Partially deobfuscated, needs cleanup

11. **HandleAlembicTask.java** (was k.java)
    - Task for handling the alembic apparatus
    - **Status**: Partially deobfuscated, needs cleanup

12. **MakePasteTask.java** (was m.java)
    - Task for creating paste from herbs
    - **Status**: Partially deobfuscated, needs cleanup

13. **MixingVesselTask.java** (was n.java)
    - Task for interacting with mixing vessel
    - **Status**: Partially deobfuscated, needs cleanup

14. **OperateLeversTask.java** (was o.java)
    - Task for operating levers in the minigame
    - **Status**: Partially deobfuscated, needs cleanup

15. **RetortTask.java** (was l.java)
    - Task for using the retort apparatus
    - **Status**: Partially deobfuscated, needs cleanup

16. **TalkToSupervisorTask.java** (was p.java)
    - Task for talking to NPC Digweed (supervisor)
    - **Status**: Partially deobfuscated, needs cleanup

17. **TurningInPotionTask.java** (was q.java)
    - Task for turning in completed potions
    - **Status**: Partially deobfuscated, needs cleanup

18. **GameEnum6.java, GameEnum7.java** (purpose unknown)
    - Additional enum classes
    - **Status**: Need investigation

## Obfuscation Patterns Identified

### 1. String Encryption
The plugin uses two encryption methods:
- **Blowfish Encryption**: Used for most string literals
- **DES Encryption**: Used for some string literals
- **XOR Encoding**: Simple XOR with Base64 encoding

Example encrypted string:
```java
"zM5h/68P3lpffYs2+UDm/Q==" → decrypts to → "Squire Mixology"
```

### 2. Variable Name Obfuscation
Variables use patterns like:
- `lllllllllIlI` (alternating lowercase L and uppercase i)
- `llllllllllII` (lowercase L with uppercase i)
- `lIIIIIIIIllll` (intentionally confusing patterns)

### 3. Method Name Obfuscation
Methods named:
- `a()`, `b()`, `c()` for core functionality
- `lIIlIlIlllIIlll()` for helper methods
- Numeric arrays used for all constants

### 4. Control Flow Obfuscation
- Complex XOR operations for simple constants
- Unnecessary while loops
- Dead code branches with impossible conditions

## Key Classes and Their Purposes

### Plugin Core
- **SquireMixology**: Main plugin class (extends SquirePlugin)
  - Manages overlays and task execution
  - Handles game events (ChatMessage, ConfigButtonClicked, GameTick)
  - Maintains state variables for current potions being created

### Configuration
- **SquireMixologyConfig**: Plugin configuration interface
  - Plugin mode setting (minigame vs create paste)
  - Potion strategy (single order vs multi-order)

### Enums
- **HerbType variants**: Define all herbs and their IDs
  - Low level: Guam, Marrentill, Tarromin, Harralander
  - Mid level: Ranarr, Toadflax, Avantoe, Kwuarm, Snapdragon
  - High level: Irit, Cadantine, Lantadyme, Dwarf Weed, Torstol
- **PluginMode**: MINIGAME or CREATE_PASTE
- **PotionStrategy**: SINGLE_ORDER or MULTI_ORDER
- **Potion**: Potion recipes with required herbs

### Utilities
- **MixologyHelper** (s.java): Core utility methods
  - `e()`: Check if in Mixology area
  - `f()`, `g()`, `h()`: Inventory checking methods
  - `a()`: Potion selection logic
  - `b()`, `c()`: Sprite ID and interaction methods
  - `j()`: Update current potion state

- **MixologyOverlay** (g.java): Renders visual overlays
  - Highlights NPCs relevant to current task
  - Shows tile markers

### Tasks
All task classes follow the Task pattern from Squire framework:
- Implement `run()` method
- Check conditions before executing
- Interact with game objects
- Use `@TaskDesc` annotation for task name

## Encryption Keys Found
The plugin uses hardcoded encryption keys for string obfuscation:
- Various 5-character random strings like "yoxVx", "PcQJJ", "bKWrz", etc.
- These are used as seeds for MD5 hashing to generate actual encryption keys

## Issues Encountered

### 1. Incomplete Deobfuscation
- Many files have decrypted strings but retain obfuscated method/variable names
- Generic names like "GameEnum4" instead of descriptive names
- Missing or incomplete Javadoc comments

### 2. Code Structure Issues
- Orphaned catch blocks in some files (lines 124-134 in GameEnum4.java)
- Duplicate class names (two files named MixologyManager.java)
- Inconsistent naming conventions

### 3. Naming Conflicts
- Multiple classes share the name "MixologyManager"
- GameEnum1-7 are not descriptive names

## Recommended Next Steps

### High Priority
1. **Fix Herb Enum Classes**
   - Rename GameEnum2-7 to descriptive names
   - Fix broken code (orphaned catch blocks)
   - Add comprehensive Javadoc
   - Clean up method names (var3 → initializeConstants)
   - Properly decrypt and assign all string constants

2. **Resolve Naming Conflicts**
   - Rename g.java properly to MixologyOverlay
   - Ensure s.java is named MixologyHelper
   - Create separate package structure if needed

3. **Complete Task Deobfuscation**
   - Review all 11 task files
   - Add Javadoc explaining what each task does
   - Clean up variable names
   - Remove obfuscation artifacts

### Medium Priority
4. **Improve Documentation**
   - Add package-level Javadoc
   - Document the overall plugin workflow
   - Create diagrams showing task execution order

5. **Code Cleanup**
   - Remove dead code
   - Simplify complex XOR operations to simple constants
   - Fix all compiler warnings

### Low Priority
6. **Optimization**
   - Consider consolidating herb enums into single enum with tier field
   - Remove duplicate logic across task files
   - Improve code reusability

## Plugin Workflow
Based on analysis, the Mixology plugin workflow is:

1. **Initialization** (SquireMixology.onStart)
   - Add overlays
   - Initialize state variables
   - Reset counters

2. **Order Processing**
   - Detect new order via ChatMessage
   - Parse required potions
   - Select herbs based on priority

3. **Task Execution**
   - TalkToSupervisorTask: Get assignment
   - MakePasteTask: Create paste from herbs
   - DepositHopperTask: Deposit paste into hopper
   - HandleAlembicTask: Operate alembic
   - AgitatorTask: Use agitator
   - MixingVesselTask: Use mixing vessel
   - OperateLeversTask: Pull levers for specific potions
   - RetortTask: Use retort
   - TurningInPotionTask: Submit completed potion
   - BankForStaminasTask: Restock if needed

4. **State Management**
   - Track current potion order
   - Monitor completion status
   - Handle errors and retries

## Technical Details

### Dependencies
- RuneLite API (Client, NPC, TileObject, etc.)
- Unethicalite API (Static, NPCs, TileObjects, Inventory, etc.)
- Google Guice (dependency injection)
- Squire framework (SquirePlugin, Task, TaskDesc)

### Design Patterns
- **Strategy Pattern**: PotionStrategy enum
- **State Pattern**: Plugin modes
- **Task Pattern**: All task classes
- **Singleton**: Overlay classes
- **Enum Pattern**: All herb and config enums

## Conclusion

The Mixology plugin is a sophisticated automation tool for the OSRS Mixology minigame. While approximately 13% of files (3/23) have been fully deobfuscated with proper documentation, the remaining 87% require:

- Proper class renaming
- Method and variable cleanup
- Comprehensive Javadoc addition
- Code structure fixes
- String decryption completion

The core functionality is preserved in the existing partially-deobfuscated files, but they require significant cleanup for maintainability and readability. The plugin demonstrates advanced obfuscation techniques including string encryption (Blowfish/DES), variable name confusion, and control flow obfuscation.

---
**Generated**: 2025-12-05
**Plugin UUID**: 37ff9308-5bb6-4332-83e0-8ab13e118f7a
**Plugin Name**: Squire Mixology
