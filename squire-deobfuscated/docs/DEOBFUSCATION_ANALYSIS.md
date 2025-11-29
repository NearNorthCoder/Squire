# Squire Deobfuscation Analysis

Comprehensive analysis of deobfuscated Squire plugins (OSRS RuneLite-based bot client).

## Overview

- **68 plugins** analyzed
- **2,682 Java files** processed
- **43,283 strings** decrypted (99.6% success rate)
- **Multiple obfuscation layers** identified

## Compilation Issues Found

### 1. JADX Type Inference Failures ("??" errors)

**Found: 48+ critical errors across 18 files**

All follow this pattern:
```java
// BROKEN (JADX output):
?? r0 = lIlIllIIllIIl[1];
"".length();
return (...) ? (...) : r0;

// FIXED:
int r0 = lIlIllIIllIIl[1];
return (...) ? (...) : r0;
```

**Fix:** Replace all `??` with `int` - the RHS is always int array access.

**Most affected files:**
- C0003d.java (13 errors)
- C0005f.java (9 errors)
- x.java (4 errors)
- L.java (3 errors)
- v.java (3 errors)

### 2. Lambda Variable Scope Issues

Pattern where `r1` references undefined variables:
```java
// BROKEN:
return item.hasAction((v1) -> {
    return r1.equals(v1);  // r1 not defined
});

// SHOULD BE:
String str = decryptedString;
return item.hasAction((v1) -> {
    return str.equals(v1);
});
```

### 3. Dead Code Patterns

Thousands of anti-decompilation artifacts:
```java
"".length();           // Does nothing
" ".length();          // Returns 1
"   ".length();        // Returns 3

if ((3 ^ 7) <= 0) {    // Always false (3^7=4)
    return null;
}
```

## RuneLite API Mappings

### Client/Game State
| Obfuscated | RuneLite API |
|------------|--------------|
| `this.M`, `this.ai` | `Client` |
| `.getMapRegions()` | Client method |
| `.getVarbitValue()` | Client method |
| `.getGameState()` | Client method |

### Entity Types
| Pattern | Type |
|---------|------|
| `t`, `npc` | NPC |
| `J`, `N` | Player |
| `ao`, `ap` | Item |
| `tileObject` | TileObject |
| `T-Z`, `O-S` | WorldPoint |

### Configuration
| Pattern | Type |
|---------|------|
| `this.c` | Config |
| `this.a` | OverlayManager |
| `this.b` | EventBus |
| `this.N` | ClientThread |

### Event Handlers
All use `@Subscribe` with pattern `public void a(EventType)`:
- `GameTick` - Main game loop
- `GameStateChanged` - Login/logout
- `MenuOptionClicked` - Menu interactions
- `InventoryChanged` - Inventory updates
- `NpcSpawned/Despawned` - NPC tracking

## OSRS Game Constants Found

### Item IDs
| ID | Item |
|----|------|
| 8844-8850 | Defender progression |
| 12954 | Dragon Defender |
| 1071, 1121, 1159 | Mithril armor |

### NPC IDs
| ID | NPC |
|----|-----|
| 3266 | Norman (Mahogany Homes) |
| 10414-10424 | MH contractors |
| 2137-2142, 2463-2468 | Cyclopes |

### Animation IDs
| ID | Animation |
|----|-----------|
| 4413 | NPC Contact spell |
| 7561-7603 | COX attacks |

### Coordinates
| Location | Coords |
|----------|--------|
| Warriors Guild | (2845, 3540, 2) |
| Estate Agents | Multiple |

## Encryption Methods

### Three Cipher Types
1. **XOR** - Most common (~32k strings)
   - 5-char keys, unique per string
   - Base64 encoded

2. **Blowfish/ECB** (~10k strings)
   - MD5(key) for key derivation
   - PKCS5 padding

3. **DES/ECB** (~1k strings)
   - MD5(key)[:8] for key derivation
   - PKCS5 padding

### String Array Pattern
```java
static {
    lIlIllIIIlIII = new String[3];
    lIlIllIIIlIII[0] = decrypt("base64==", "key12");
    lIlIllIIIlIII[1] = decrypt("base64==", "key34");
    // ...
}
```

## Boolean Utility Methods

Common obfuscation patterns:
```java
// isTruthy
private static boolean lIIIlIllIIIlIlI(int i) {
    return i != 0;
}

// isFalsey
private static boolean lIIIlIllIIIlIII(int i) {
    return i == 0;
}

// areNotEqual
private static boolean lIIIlIllIIIllll(Object a, Object b) {
    return a != b;
}
```

## Plugin Categories

### Combat (12 plugins)
- Vorkath, Zulrah, Hydra
- GWD bosses (Bandos, Sara, Zammy)
- DT2 bosses

### Raids (3 plugins)
- Chambers of Xeric
- Auto TOA

### Skilling (10 plugins)
- Agility, Mining, Woodcutting
- Fishing, Farming, Herblore

### Minigames (11 plugins)
- Barrows, Fight Caves
- Gauntlet, Sepulchre

### Utility (40+ sub-plugins in "Basics")
- Auto Eater, Prayer Flicker
- Looter, Cannon Reloader
- Anti-PK, Shop Buyer

## Deobfuscation Priority

### High Priority (compilation blocking)
1. Fix all `??` type errors
2. Resolve lambda variable references
3. Fix JADX type inference warnings

### Medium Priority (readability)
1. Decrypt remaining encrypted strings
2. Rename boolean utility methods
3. Remove dead code patterns

### Low Priority (nice to have)
1. Rename `lIlIlIl` variables
2. Map constants to OSRS wiki names
3. Add JavaDoc comments

## Tools Available

| Tool | Purpose |
|------|---------|
| `fix_type_errors.py` | Fix ?? and dead code |
| `extract_decrypt_strings.py` | Decrypt all strings |
| `deobfuscate.py` | Full deobfuscation |
| `reorganize_plugins.py` | Rename to human names |

## Next Steps

1. Run `fix_type_errors.py` to fix compilation errors
2. Attempt compilation to find remaining issues
3. Map remaining obfuscated methods using API patterns
4. Build comprehensive renaming dictionary
