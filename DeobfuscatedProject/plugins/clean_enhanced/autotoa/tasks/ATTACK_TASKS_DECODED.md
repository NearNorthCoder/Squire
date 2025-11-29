# TOA Attack Tasks - Deobfuscation Summary

## Overview
Three specialized attack tasks for handling specific boss mechanics in the Tombs of Amascut raid.

---

## 1. AttackingAkkhaButterflyTask.java

### Mechanic: Akkha Butterfly Phase
During Akkha's butterfly phase, shadows spawn in a circular pattern that players must follow.

### Decoded Values
- **NPC Name**: "Akkha's Shadow"
- **Action**: "Attack"

### Attack Pattern
1. Find current position in butterfly circle
2. Calculate next position in sequence (circular pattern)
3. Move to marked attack tiles
4. Attack shadow when positioned correctly
5. Maintain distance (max 2 tiles from shadow)
6. Use shadow attack style from config

### Key Features
- Follows circular movement pattern
- Positions on specific marked tiles
- Switches to shadow attack style automatically
- Handles positioning and attacking in sequence

---

## 2. SunKerisObeliskTask.java

### Mechanic: Het Obelisk Projectile Defense
During the Het puzzle, obelisks shoot projectiles that can be destroyed using the Keris partisan of the sun's special attack.

### Decoded IDs

#### NPC/Item IDs
- **Keris Partisan of the Sun**: 27291 (0x6A9B)
- **Obelisk Projectile 1**: 18590 (0x489E)
- **Obelisk Projectile 2**: 18621 (0x48BD)
- **Salt Deposit**: 19081
- **Tears of Elidinis**: 27339

#### Varbit IDs (Puzzle States)
- **Normal Value**: 4412
- **Shadow Value**: 19461
- **Normal Prayer Varbit**: 500 (0x1F4)
- **High Drain Prayer**: 1000 (0x3E8)
- **Shadow Puzzle Varbit**: 23423 (0x5D7F)
- **Overly Draining Varbit**: 11112 (0x2B68)

#### Thresholds
- **Low Prayer Threshold**: 51 points
- **Min Health for Spec**: 30 HP
- **Tick Eat Health Threshold**: 45 HP
- **Max Projectile Cycles**: 70 ticks (must be less than)
- **Min Projectile Cycles**: 5 ticks (must be greater than)

### Attack Pattern
1. Monitor for incoming obelisk projectiles
2. Check if projectile is in danger window (5-70 remaining cycles)
3. Restore prayer if below 51 points
4. Verify health is adequate (30+ or 45+ depending on projectile)
5. Check puzzle state varbits
6. Equip Keris partisan of the sun
7. Activate special attack to destroy projectile
8. Tick eat if necessary based on projectile timing

### Tick Eat Logic
The task implements sophisticated tick eating:
- Monitors projectile remaining cycles
- Different health requirements for different projectile variants
- Logs when tick eat should occur
- Prevents spec activation when health too low

### Prayer Management
- Uses tears of elidinis for prayer restore
- Filters out Sanfew serums (wants regular prayer restore)
- Uses salt deposits when available
- Restores prayer before attempting spec

---

## 3. KillingAnnoyingEggTask.java

### Mechanic: Akkha Egg Phase
During the Akkha fight, an egg spawns at a specific location that must be destroyed.

### Decoded Values
- **Egg NPC ID**: 28096 (0x6DC0)
- **Egg Spawn Location**: Point(27, 36)
- **Safe Area Offset**: -2 (must stay outside this)
- **Melee Area Offset**: 1 (attack range)

### Attack Pattern
1. Detect when egg mechanic is active
2. Locate egg NPC at coordinates (27, 36)
3. Verify egg is alive and attackable
4. Get safe tiles from game state
5. Find safe tile in melee range
6. Move to optimal attack position
7. Equip Keris weapon for bonus damage
8. Attack the egg

### Positioning Logic
- Must be within melee distance (1 tile offset)
- Must NOT be too close (safe area is -2 offset)
- Only moves to tiles that are marked as safe
- Filters for tiles that provide melee range to egg
- Prioritizes safe positioning over damage

### Key Features
- Uses Keris weapon for increased damage against Akkha mechanics
- Integrates with safe tile system
- Ensures proper positioning before attacking
- Handles movement to optimal attack tiles

---

## Common Patterns Across Tasks

### Item Handling
All tasks use consistent patterns for:
- Item equipping ("Wield" action)
- Item interaction ("Attack", "Drink" actions)
- Inventory searching with name filtering
- Equipment verification

### Safety Mechanisms
- Health threshold checks before risky actions
- Prayer point monitoring
- Safe tile verification
- Distance calculations

### Attack Optimization
- Weapon switching for specific mechanics
- Special attack timing
- Positioning optimization
- Target filtering and validation

---

## Technical Notes

### Deobfuscation Methods Used
1. **Static Array Decoding**: Decoded XOR-obfuscated integer arrays
2. **Bitwise Operation Resolution**: Calculated complex bitwise expressions
3. **String Array Reconstruction**: Mapped obfuscated string indices to actual values
4. **ID Extraction**: Converted hex-encoded item/NPC/projectile IDs

### Example Calculations
```java
// Keris Partisan ID
0xFFFFFF9F & 0x6AFB = 0x6A9B = 27291

// Obelisk Projectile 1 ID
-(0xFFFF974B & 0x7FF6) & (0xFFFFBFFF & 0x5FFF) = 18590

// Egg NPC ID
-(0xFFFFE137 & 0x5EEF) & (0xFFFFFFF6 & 0x6DFF) = 28096
```

---

## Game Mechanics Decoded

### Akkha Butterfly Phase
- Circular movement pattern with multiple positions
- Shadow NPCs spawn at marked tiles
- Players must follow sequence and attack shadows
- Uses special shadow attack style

### Het Obelisk Defense
- Projectiles travel with predictable timing
- Special attack window is 5-70 remaining cycles
- Different projectile variants require different health levels
- Tick eating can save from damage
- Prayer management crucial for sustained defense

### Akkha Egg Phase
- Single egg spawns at fixed location
- Requires melee range positioning
- Safe tiles must be used to avoid damage
- Keris weapons deal bonus damage
- Egg must be killed quickly
