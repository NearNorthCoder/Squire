# TOA Tasks Deobfuscation Summary

This document summarizes the deobfuscated TOA task files in the `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/autotoa/tasks/` directory.

## Completed Deobfuscations

### Infrastructure Files

1. **ck.java → TOAConfigurableTask.java** (Conceptual rename)
   - Base class for TOA tasks requiring configuration access
   - Provides common widget IDs and validation framework
   - All configuration-dependent tasks extend this class

2. **aV.java → DoingTaskSwitchMapper.java** (Conceptual rename)
   - Switch statement mapper for CrondisTaskType enum
   - Maps PILLARS and VENTS task types to switch case values

3. **bQ.java → BoulderSolution.java** (Conceptual rename)
   - Data class for Crondis boulder puzzle solutions
   - Tracks boulder, jug, target point, and movement type
   - Calculates standing tiles for solving the puzzle

4. **aS.java → BaboonAttack.java** (Conceptual rename)
   - Data class for baboon attacks in the baboon room
   - Tracks which baboon is attacking and the prayer to use

### Task Implementation Files

5. **HandlingObeliskPrayersTask.java**
   - Manages prayer flicking during Obelisk encounter
   - Uses offensive prayers based on gear setup
   - Priority: Integer.MAX_VALUE (highest)

6. **SwappingForObeliskTask.java**
   - Handles gear swapping when entering Obelisk room
   - Switches to configured Obelisk-specific gear setup
   - Registered as event listener

7. **CreatingToaPartyTask.java**
   - Creates raid party at the TOA entrance
   - Checks varbit 14386 for party status
   - Opens party interface and creates party
   - Priority: 5

8. **ClaimingRewardsOutsideTask.java**
   - Claims rewards from chest after completing raid
   - Banks reward items automatically
   - Priority: Integer.MAX_VALUE (highest)
   - Runs outside the raid area

9. **BankingToGoBackInTask.java**
   - Withdraws items from bank before entering raid
   - Uses BankLoadouts system with retry logic (max 5 attempts)
   - Handles bank PIN window
   - Priority: 10

10. **SkippingAkkhaDpsTask.java**
    - Optimizes Akkha shadow phase positioning
    - Moves player strategically to skip shadow DPS phases
    - Tracks shadow spawns via graphics objects (ID: 23895)
    - Priority: 150

11. **DoingTask.java → DoingCrondisTask.java** (Conceptual rename)
    - Handles Crondis room tasks (pillars and vents)
    - Detects task type via graphics object spawns
    - Repairs damaged pillars (ID: 46527)
    - Neutralizes fume vents (ID: 46079) with water
    - Priority: 50

12. **HoppingToDifferentWorldTask.java**
    - Manages world hopping between raids
    - Supports custom world lists via config
    - Prefers low-population worlds in same region
    - Validates game state before hopping
    - Priority: 1000

## Remaining Files (Partially Deobfuscated or Require Additional Work)

The following files from the user's request still need complete deobfuscation:

1. **WithdrawingSuppliesTask.java** - Withdraws raid supplies from supply chests (complex supply management)
2. **ClaimingDeathItemsTask.java** - Claims items from death chest on wipe (complex item recovery logic)
3. **SunKerisObeliskTask.java** - Sun Keris special attack management for Obelisk (combat optimization)
4. **AutotoaTaskBase.java** - Base overlay class for rendering task information (graphics/rendering)
5. **AutotoaManager.java** - Main manager/coordinator (appears to be Kephri-specific, very complex)

## Key Patterns Identified

### Constant Decoding
- Obfuscated integer arrays (`var1`, `var2`) contain game IDs and values
- String arrays contain NPC names, object names, and actions
- XOR operations and Base64 encoding used for string obfuscation

### Common IDs
- **Varbit 14386**: TOA party status
- **Widget 50594947**: Party creation interface
- **Object 45814/45821**: Entry portal
- **Object 46527**: Damaged pillar (Crondis)
- **Object 46079**: Fume vent (Crondis)
- **Graphics 23895**: Task indicator (Crondis)
- **NPC 15710**: Akkha boss
- **Animation 9779**: Akkha special attack

### Task Priority Levels
- Integer.MAX_VALUE: Critical tasks (prayers, rewards claiming)
- 150: Combat optimization (Akkha DPS skip)
- 50: Room mechanics (Crondis tasks)
- 10: Preparation (banking)
- 5: Setup (party creation)

## File Locations

All deobfuscated files are located at:
```
/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/autotoa/tasks/
```

## Notes

- Many files reference parent classes that may not exist in this directory
- Some conceptual renames are suggested (marked with "Conceptual rename")
- The obfuscation heavily uses numerical constants that map to game entity IDs
- Event-driven architecture with @Subscribe annotations for game events
