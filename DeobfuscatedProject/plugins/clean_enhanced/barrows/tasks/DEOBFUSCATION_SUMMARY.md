# Barrows Plugin Tasks Deobfuscation Summary

## Overview
Successfully deobfuscated 13 task files (n.java through z.java) for the Squire OSRS Bot Barrows plugin.

## Files Deobfuscated

### 1. AttackingBrotherTask.java (n.java)
- **Priority**: 13337 (High)
- **Purpose**: Handles attacking Barrows brothers
- **Key Features**:
  - Gear switching between normal and special attack gear
  - Iban Blast auto-casting setup
  - Special attack management for Ahrim and Karil
  - Brother NPC targeting and interaction

### 2. OpeningSarcophagusTask.java (o.java)
- **Priority**: 250
- **Purpose**: Opens sarcophagi to spawn brothers
- **Key Features**:
  - Dialog handling for brother spawns
  - Checks for already active brothers
  - Tracks brothers killed count
  
### 3. ExitingCryptTask.java (p.java)
- **Priority**: 150
- **Purpose**: Exits the Barrows crypt
- **Key Features**:
  - Checks if all 6 brothers are killed before exiting
  - Finds and interacts with staircase
  
### 4. DiggingNextBrotherTask.java (q.java)
- **Priority**: 100
- **Purpose**: Digs at brother hill locations
- **Key Features**:
  - Uses spade to dig at brother locations
  - Handles gear swapping for digging
  - Manages movement to dig locations
  
### 5. UsingImbuedHeartTask.java (r.java)
- **Priority**: 13337 (High)
- **Purpose**: Uses imbued heart for magic boost
- **Key Features**:
  - Checks if heart is on cooldown (varbit 4625)
  - Item IDs: 20724 (Imbued heart), 21712 (Saturated heart)
  
### 6. GoingToHouseMidTripTask.java (s.java)
- **Priority**: 300
- **Purpose**: Teleports to house mid-trip for restoration
- **Key Features**:
  - Risk assessment (checks if being attacked)
  - Prayer point checking
  - Conditional teleporting based on config
  
### 7. DrinkingFromPoolTask.java (t.java)
- **Priority**: 250
- **Purpose**: Drinks from rejuvenation pool
- **Key Features**:
  - Simple pool interaction
  - Restores hitpoints, prayer, and stats
  
### 8. TeleportingToBarrowsTask.java (u.java)
- **Priority**: 100
- **Purpose**: Teleports to Barrows
- **Key Features**:
  - Uses Barrows tablet or other teleport methods
  - Coordinates: (3565, 3311, 0)
  - Walks if already near Barrows
  
### 9. AttackingMonsterForPotentialTask.java (v.java)
- **Priority**: 200
- **Purpose**: Attacks tunnel monsters for reward potential
- **Key Features**:
  - Targets specific crypt monsters
  - Uses tunnel gear setup
  - Handles door opening in tunnels
  
### 10. ClaimingChestTask.java (w.java)
- **Priority**: 150
- **Purpose**: Claims reward from chest
- **Key Features**:
  - Listens for loot messages via chat
  - Drops unnecessary items for inventory space
  - Waits for brother to die before claiming
  
### 11. GoingToHouseTask.java (x.java)
- **Priority**: 50
- **Purpose**: Teleports to house after run
- **Key Features**:
  - Only runs if config enabled
  - Simple house teleport after completion
  
### 12. OpeningChestTask.java (y.java)
- **Priority**: 220
- **Purpose**: Opens the reward chest
- **Key Features**:
  - Checks reachability
  - Distance checking (must be within 6 tiles)
  
### 13. WalkingToChestTask.java (z.java)
- **Priority**: 50
- **Purpose**: Walks to chest location in tunnels
- **Key Features**:
  - Pathfinding using global collision map
  - Special handling for stuck positions
  - Coordinates: (3551, 9702, 0)

## Deobfuscation Techniques Applied

### 1. String Decryption
- **XOR + Base64**: Decrypted all XOR-encrypted Base64 strings
- **DES Encryption**: Decrypted DES-encrypted strings  
- **Blowfish Encryption**: Decrypted Blowfish-encrypted strings

Example decryptions:
- "Auto casting IBAN BLAST"
- "Swapping to spec gear"
- "Toggling spec"
- "Attack", "Search", "Open", "Dig"

### 2. Bitwise Constant Evaluation
Evaluated all bitwise operations like:
- `0x22 ^ 0x27` → 5
- `0xFFFFAF9A & 0x53EF` → 1153
- `(0x5C ^ 0xF) & ~(0x74 ^ 0x27)` → 0

### 3. Variable Renaming
Renamed obfuscated variables:
- `llllIIllIII` → descriptive names like `ibanStaffIds`, `brotherNpc`, etc.
- `S`, `T`, `U` → `plugin`, `config`, `manager`
- Method parameters like `d2` → `brother`, `currentBrother`

### 4. Method Renaming
Renamed obfuscated methods:
- `lIllIlIIIlllll` → descriptive names
- `a()`, `b()`, `c()` → `getBrothersKilled()`, `getCurrentBrother()`, etc.

### 5. Documentation
Added comprehensive Javadoc comments explaining:
- Class purposes
- Method functionality
- Parameter descriptions
- Return value meanings

## Key Constants Discovered

### Item IDs
- Iban Staff: 1409
- Iban Staff (u): 12658
- Upgraded Iban Staff: 25627
- Imbued Heart: 20724
- Saturated Heart: 21712
- Spade: 952

### Widget IDs
- Combat Tab: 593942
- Iban Blast Spell: 14286885

### World Coordinates
- Chest Location: (3551, 9702, 0)
- Barrows Teleport: (3565, 3311, 0)

### Varbits/Varps
- Imbued Heart Cooldown: Varbit 4625
- Brothers Killed: Various varbits per brother

## Output Location
All deobfuscated files are in:
`/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/barrows/tasks/`

## Quality Standard
Files follow the quality standard set by SquireAutoTOA.java reference:
- Clean, readable code
- Descriptive variable and method names
- Comprehensive comments
- Proper package structure (gg.squire.barrows.tasks)
- No obfuscation artifacts remaining

## Usage
These task files work together to automate Barrows runs:
1. Teleport to Barrows
2. Dig at each brother's location
3. Open sarcophagus
4. Attack brother with appropriate gear/spec
5. Exit crypt
6. Repeat for all 6 brothers
7. Walk to chest
8. Open and claim rewards
9. Attack tunnel monsters for potential
10. Teleport to house for restoration
11. Return to Barrows or bank

