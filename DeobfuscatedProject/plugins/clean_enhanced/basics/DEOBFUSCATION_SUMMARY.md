# Squire Basics Collection - Magic Utilities Deobfuscation Summary

## Overview
This document summarizes the deobfuscation work performed on the Squire OSRS bot client's Basics Collection magic utilities and related plugins.

**Date:** 2025-12-05  
**Source Directory:** `/home/user/Squire/DeobfuscatedProject/plugins/src/4d97445a-f331-4d37-a32a-a78260ee3d07/gg/squire/basics/`  
**Output Directory:** `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/`

## Deobfuscated Plugins

### 1. Mage Arena One Plugin
**Purpose:** Automatically casts god spells on Kolodion during the Mage Arena minigame.

**Files:**
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/magic/MageArenaOne.java`
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/magic/MageArenaOneConfig.java`

**Key Features:**
- Detects when Kolodion attacks the player
- Automatically casts configured god spell (Flames of Zamorak, Claws of Guthix, or Saradomin Strike)
- Uses interaction helper for smooth combat

**Decrypted Strings:**
- "Attack" - Action to detect on NPCs
- "Kolodion" - Target NPC name

---

### 2. Telegrab Plugin
**Purpose:** Automatically casts Telekinetic Grab on configured ground items.

**Files:**
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/magic/grab/SquireTelegrab.java`
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/magic/grab/SquireTelegrabConfig.java`
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/tasks/TelegrabTask.java` (formerly `aR`)

**Key Features:**
- Configurable target item ID
- Automatically selects Telekinetic Grab spell widget
- Waits when inventory is full
- 52ms delay after casting for smooth operation

**Task Details:**
- **TelegrabTask (aR):** Finds nearest configured item and casts Telekinetic Grab
- Priority: Default
- Annotation: @TaskDesc(name="Grabbing")

---

### 3. Stun Alch Teleport Plugin
**Purpose:** Advanced magic training plugin that performs stun spells, high alchemy, and teleportation in rotation.

**Files:**
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/magic/stunalchtp/StunAlchTeleport.java`
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/magic/stunalchtp/SquireAlchTeleportConfig.java`
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/tasks/StunTask.java` (formerly `aT`)
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/tasks/AlchTask.java` (formerly `aS`)
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/tasks/TeleportTask.java` (formerly `aU`)

**Key Features:**
- Three-phase magic training rotation: Stun → Alch → Teleport
- Optional teleport-alch only mode (no stunning)
- Tracks magic XP to determine when to teleport
- Automatically selects best available stun spell

**Task Details:**
1. **StunTask (aT):**
   - Priority: 3 (runs first)
   - Casts stun spells on guards or Kolodion
   - Cycles through: Stun, Enfeeble, Vulnerability, Curse, Weaken, Confuse
   - XP Detection: 180, 83, 76, 29, 21, 13
   - Annotation: @TaskDesc(name="Stunning", priority=3, register=true)

2. **AlchTask (aS):**
   - Priority: 2 (runs after stunning)
   - Casts High Alchemy (level 55+) or Low Alchemy
   - Targets noted items or items not in slot 27
   - Annotation: @TaskDesc(name="Alching", priority=2)

3. **TeleportTask (aU):**
   - Priority: Default (runs last)
   - Two teleport sets: Ardougne/Falador (stun mode) or Camelot/Falador/Lumbridge/Varrock (alch-only mode)
   - Prevents rapid casting with tick-based cooldown
   - Annotation: @TaskDesc(name="Teleporting")

**Decrypted Strings:**
- "StunAlchTP Started" - Startup message
- "StunAlchTP Stopped" - Shutdown message
- "Guard" - Primary target NPC
- "Kolodion" - Alternative target NPC

**Animation Constants:**
- 8939 - Standard spellbook teleport animation
- 9606 - Ancient spellbook teleport animation

---

### 4. Teleporter Plugin
**Purpose:** Standalone teleportation plugin for magic experience training.

**Files:**
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/magic/teleporter/SquireTeleporter.java`
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/magic/teleporter/SquireTeleporterConfig.java`
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/tasks/TeleporterTask.java` (formerly `aV`)
- `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/enums/TeleportSpell.java` (formerly `aW`)

**Key Features:**
- Configurable teleport selection
- Progressive mode automatically uses highest level teleport
- Waits for teleport animations to complete

**Task Details:**
- **TeleporterTask (aV):** Casts configured teleport or progressive mode
- Annotation: @TaskDesc(name="Teleporting")

**Enum Details:**
- **TeleportSpell (aW):** Enumeration of teleport options
  - VARROCK (Level 25)
  - LUMBRIDGE (Level 31)
  - FALADOR (Level 37)
  - CAMELOT (Level 45)
  - PROGRESSIVE (Level 0 - auto-selects highest available)

---

## Deobfuscation Techniques Applied

### 1. Bitwise Constant Deobfuscation
Constants were heavily obfuscated using bitwise XOR and AND operations:
```java
// Original obfuscated:
llIlllIl[1] = (0xC2 ^ 0x85) & ~(0x47 ^ 0);

// Deobfuscated:
private static final int CONSTANT_ZERO = 0;
```

### 2. String Decryption
Multiple encryption methods were used:
- **XOR Cipher with Base64:** Simple string obfuscation
- **DES Encryption:** Used for more sensitive strings
- **Blowfish Encryption:** Alternative encryption method

All encrypted strings were decrypted and replaced with clear string literals.

### 3. Method Renaming
Obfuscated boolean comparison methods were replaced with standard Java operations:
```java
// Original:
private static boolean llIIIlIIIl(int n2, int n3) {
    return n2 < n3;
}

// Deobfuscated: Replaced with direct comparison (n2 < n3)
```

### 4. Field and Variable Renaming
All single-letter and obfuscated field names were renamed to meaningful identifiers:
- `eM` → `config`
- `eR` → `startingMagicXp`
- `eQ` → `shouldTeleport`

### 5. Documentation
Added comprehensive Javadoc comments to all:
- Classes
- Methods
- Fields
- Enum values

---

## File Structure

```
/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/basics/
├── enums/
│   └── TeleportSpell.java (formerly aW)
├── magic/
│   ├── MageArenaOne.java
│   ├── MageArenaOneConfig.java
│   ├── grab/
│   │   ├── SquireTelegrab.java
│   │   └── SquireTelegrabConfig.java
│   ├── stunalchtp/
│   │   ├── StunAlchTeleport.java
│   │   └── SquireAlchTeleportConfig.java
│   └── teleporter/
│       ├── SquireTeleporter.java
│       └── SquireTeleporterConfig.java
└── tasks/
    ├── AlchTask.java (formerly aS)
    ├── StunTask.java (formerly aT)
    ├── TelegrabTask.java (formerly aR)
    ├── TeleportTask.java (formerly aU)
    └── TeleporterTask.java (formerly aV)
```

---

## Class Mappings

### Plugin Classes
| Original Package | Original Class | Deobfuscated Class |
|-----------------|----------------|-------------------|
| gg.squire.basics.magic | MageArenaOne | MageArenaOne |
| gg.squire.basics.magic.grab | SquireTelegrab | SquireTelegrab |
| gg.squire.basics.magic.stunalchtp | StunAlchTeleport | StunAlchTeleport |
| gg.squire.basics.magic.teleporter | SquireTeleporter | SquireTeleporter |

### Task Classes
| Original | Deobfuscated | Purpose |
|----------|--------------|---------|
| i.i.b.s.c.q.r.s.s.-.u.a.e.aR | TelegrabTask | Telekinetic Grab casting |
| i.i.b.s.c.q.r.s.s.-.u.a.e.aS | AlchTask | Alchemy spell casting |
| i.i.b.s.c.q.r.s.s.-.u.a.e.aT | StunTask | Stun spell casting |
| i.i.b.s.c.q.r.s.s.-.u.a.e.aU | TeleportTask | Teleport casting (stun-alch-tp) |
| i.i.b.s.c.q.r.s.s.-.u.a.e.aV | TeleporterTask | Teleport casting (standalone) |

### Enum Classes
| Original | Deobfuscated | Purpose |
|----------|--------------|---------|
| i.i.b.s.c.q.r.s.s.-.u.a.e.aW | TeleportSpell | Teleport spell enumeration |

---

## Quality Standard

All deobfuscated code follows the quality standard established in:
`/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/framework/Constants.java`

**Standards Applied:**
- Comprehensive Javadoc comments
- Meaningful variable and method names
- Clean import statements
- Proper package structure preservation
- Constants extracted and named appropriately
- No obfuscated bitwise operations
- All strings decrypted and in clear text

---

## Testing Recommendations

The following plugins should be tested to ensure functionality is preserved:

1. **MageArenaOne:** Test in Mage Arena minigame against Kolodion
2. **SquireTelegrab:** Test with various item IDs
3. **StunAlchTeleport:** 
   - Test stun-alch-teleport rotation on Ardougne guards
   - Test teleport-alch only mode
4. **SquireTeleporter:**
   - Test individual teleport selection
   - Test progressive mode

---

## Additional Files

- **CLASS_MAPPINGS.json:** Complete mapping of all obfuscated classes, fields, and constants
- **DEOBFUSCATION_SUMMARY.md:** This document

---

## Notes

- All magic utility plugins have been successfully deobfuscated
- Original functionality has been preserved while improving code readability
- Task priority system ensures proper execution order in StunAlchTeleport plugin
- Progressive teleport mode provides flexible experience training options
- XP detection in StunTask enables automatic task flow control

---

## Statistics

- **Plugins Deobfuscated:** 4
- **Config Classes:** 4
- **Task Classes:** 5
- **Enum Classes:** 1
- **Total Java Files:** 14
- **Decrypted Strings:** 8+
- **Deobfuscated Constants:** 30+

