# Dragon Slayer Quest Handler Deobfuscation Notes

## Source File
`/home/user/Squire/DeobfuscatedProject/plugins/deobfuscated/7c1d3521-d222-494e-8c51-697efca0674b/o/c/k/i/-/l/o/f/-/n/c/t/e/s/U.java`

## Output File
`/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/steps/DragonSlayerQuestHandler.java`

## Important Correction
**This file is NOT for Temple Trekking as initially assumed.** It handles the **Dragon Slayer quest**, which is a prerequisite for the SOTF (Secrets of the North) questline.

## File Statistics
- **Original Size**: 2,648 lines (178KB)
- **Deobfuscated Size**: 868 lines
- **Reduction**: ~67% (removed obfuscation overhead)

## Deobfuscation Process

### 1. Integer Array Decoding
The file used a 366-element integer array (`llIIIllIII`) with XOR-obfuscated values:
```java
// Original:
U.llIIIllIII[6] = 0x31 ^ 3;  // = 50
U.llIIIllIII[14] = (2 ^ 0x70) + (0xF8 ^ 0xB7) - (0x53 ^ 0x1C) + (0x5B ^ 0x65);  // = 176

// Deobfuscated to constants:
private static final int QUEST_VARBIT = 176;
private static final int RUN_ENERGY_THRESHOLD = 50;
```

### 2. String Array Decoding
The file used a string array (`llIIIlIllI`) with encrypted strings. All strings were decoded:
```java
// Original:
llIIIlIllI[llIIIllIII[315]] // "Dragon slayer 1 quest"
llIIIlIllI[llIIIllIII[50]]  // "Oziach"

// Deobfuscated to literals:
"Dragon slayer 1 quest"
"Oziach"
```

### 3. Renamed Classes
- `U` → `DragonSlayerQuestHandler`
- Package: `o.c.k.i.-.l.o.f.-.n.c.t.e.s` → `gg.squire.sotf.steps`

### 4. Renamed Fields
- `bt` → `needToBuyItems`
- `md` → `hasMelzarMapPiece`
- `mc` → `hasThalzarMapPiece`
- `ma` → `hasLozarMapPiece`
- `mb` → `hasAntiDragonShield`
- `di` → `elvargPhase`
- `bv` → `itemsToBuy`
- `lW`, `lX`, `lY`, `lZ` → Named location constants

### 5. Renamed Methods
- `ag()` → Quest name getter (kept interface method name)
- `ah()` → Quest completion check (kept interface method name)
- `af()` → Main execution (kept interface method name)
- `dD()` → `executeQuestLogic()`
- `dE()` → `handleMelzarBanking()`
- `dF()` → `handleBankingForQuestStart()`
- `dG()` → `handleMelzarsMazePrep()`
- `Q()` → `prepareBuyList()`
- `an()` → `hasAllRequiredItems()`

## Quest Flow

### Stage 0: Quest Not Started
1. Check quest requirements (32 Quest Points)
2. Prepare inventory with required items
3. Bank to withdraw quest items if needed

### Stage 1: Speak to Guildmaster
1. Navigate to Champions' Guild
2. Talk to Guildmaster to start quest
3. Talk to Oziach in Edgeville

### Stage 2: Gather Map Pieces
The quest requires 3 map pieces:

#### Melzar's Map Piece (Melzar's Maze)
- Navigate through multi-floor maze
- Use colored keys in sequence:
  - **Red key** (ground floor) - Kill zombie
  - **Orange key** (floor 1) - Kill skeleton
  - **Yellow key** (floor 2) - Kill ghost
  - **Blue key** (floor 2/3) - Kill zombie
  - **Magenta key** - Kill lesser demon
  - **Green key** - Final floor
- Open chest to get map piece

#### Oracle's Map Piece
- Talk to Oracle after getting maze key
- Receive map piece through dialog

#### Lozar's Map Piece
- Navigate to Port Sarim
- Use items on magic door: Silk, Lobster pot, Unfired bowl, Wizard's mind bomb
- Complete puzzle to get map piece

### Stage 3: Find Ship
1. Talk to Ned in Draynor Village
2. Pay 2000 coins to hire Ned
3. Find ship in Port Sarim

### Stage 4: Repair Ship
1. Use 3 planks on ship hole
2. Use 90 steel nails with planks
3. Board ship with Ned

### Stage 5: Sail to Crandor
1. Talk to Customs Officer
2. Board gangplank
3. Talk to Captain Ned
4. Sail to Crandor

### Stage 6: Fight Elvarg
**Location**: Crandor dungeon

**Combat Strategy**:
- Enable Protect from Melee prayer
- Enable combat boosting prayers (Ultimate Strength, Incredible Reflexes)
- Drink antifire potion when varbit indicates fire breath
- Drink combat potions for strength boost
- Eat sharks when health drops below 40
- Drop empty vials to manage inventory
- Attack Elvarg and wait for kill

**Boss Mechanics**:
- Uses melee and dragonfire attacks
- ~80 hitpoints
- Protect from Melee blocks melee damage
- Antifire potion reduces dragonfire damage by 50%
- Anti-dragon shield provides additional protection

### Stage 7: Complete Quest
1. After defeating Elvarg, navigate out of dungeon
2. Return to Oziach in Edgeville
3. Claim rune platebody reward
4. Quest complete!

## Item Requirements Handled
- **Quest Items**: Silk, Lobster pot, Unfired bowl, Wizard's mind bomb
- **Combat Gear**: Rune scimitar, anti-dragon shield
- **Jewelry**: Amulet of glory, Ring of wealth
- **Food**: Sharks (for healing)
- **Potions**: Stamina potions, Prayer potions, Antifire potion, Combat potions
- **Ship Repair**: 3 planks, 90 steel nails
- **Money**: 2000 coins for Ned

## Banking Logic
The handler implements 3 different banking configurations:

1. **Quest Start Banking** (`handleBankingForQuestStart()`)
   - Withdraws all quest items
   - Checks for missing items and triggers buying

2. **Melzar Maze Banking** (`handleMelzarBanking()`)
   - Withdraws maze items (silk, lobster pot, etc.)
   - Withdraws food and potions

3. **Combat Banking** (`handleCombatBanking()`)
   - Withdraws combat gear
   - Withdraws food, potions, antifire
   - Prepares for Elvarg fight

## Shopping System
If items are missing from bank:
1. Populate `itemsToBuy` list with required items and shop IDs
2. Set `needToBuyItems = true`
3. Call `b.a(itemsToBuy)` to purchase from GE
4. Wait for shopping to complete
5. Resume quest when items acquired

## Code Quality Improvements
1. **Removed**: 50+ obfuscated comparison methods (lIlIIllIlIIIl, lIlIIllIIllII, etc.)
2. **Removed**: Obfuscated string decryption methods (3 different encryption schemes)
3. **Removed**: Dead code and obfuscation artifacts
4. **Added**: Comprehensive JavaDoc comments
5. **Added**: Named constants for all magic numbers
6. **Added**: Descriptive variable and method names
7. **Improved**: Code organization and structure

## Notes for Future Development
1. Some helper classes are still obfuscated (a, b, d, e, f, g, j)
2. Dialog system could be further improved
3. Consider extracting Melzar Maze logic to separate class
4. Banking logic could be centralized
5. Combat logic could be generalized for reuse

## Dependencies Still Obfuscated
These imported classes need separate deobfuscation:
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.a` - Banking utility
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.b` - Shopping utility
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.d` - Shop item class
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.e` - Quest utility
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.f` - Item IDs
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.g` - Dialog utility
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.j` - Additional item IDs
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN` - Unknown utility
- `o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac` - QuestStep interface
