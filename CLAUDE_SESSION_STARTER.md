# Squire OSRS Bot Client - Decompilation & Deobfuscation Project

## Project Goal
Fully decompile and deobfuscate the Squire OSRS bot client to produce readable, documented source code for the complete system: loader -> launcher -> client -> plugins.

## Repository Structure

```
/home/user/Squire/DeobfuscatedProject/
├── repository2/                    # Original JAR files
│   ├── runelite-client-1.1.12-SNAPSHOT.jar  # Main client (DECOMPILED)
│   ├── runelite-api-1.1.12-SNAPSHOT.jar     # API interfaces (DECOMPILED)
│   ├── runescape-api-1.1.12-SNAPSHOT.jar    # RS API (DECOMPILED)
│   ├── http-api-1.3.1.jar                   # HTTP API (DECOMPILED)
│   └── runelite-jshell-1.1.12-SNAPSHOT.jar  # JShell (DECOMPILED)
│
├── data/
│   └── regions                     # Walkability collision map (RoaringBitmap, GZIP)
│
├── tools/
│   └── cfr.jar                     # CFR Java decompiler
│
├── runelite-client-decompiled/     # 1,541 Java files (9.2MB)
├── runelite-api-decompiled/        # 355 Java files (5.7MB)
├── runescape-api-decompiled/       # 315 Java files (359KB)
├── http-api-decompiled/            # 57 Java files (257KB)
├── runelite-jshell-decompiled/     # 5 Java files (49KB)
│
├── framework/decompiled/           # Framework code (Walker, pathfinding, etc.)
│
└── plugins/
    ├── src/                        # 53 UUID-named plugin directories
    ├── clean_enhanced/             # Deobfuscated plugin versions
    └── renamed/                    # Renamed obfuscated files
```

## Decompilation Status

### COMPLETED - Core JARs
| Component | Files | Size | Location |
|-----------|-------|------|----------|
| runelite-client | 1,541 | 9.2MB | `runelite-client-decompiled/` |
| runelite-api | 355 | 5.7MB | `runelite-api-decompiled/` |
| runescape-api | 315 | 359KB | `runescape-api-decompiled/` |
| http-api | 57 | 257KB | `http-api-decompiled/` |
| runelite-jshell | 5 | 49KB | `runelite-jshell-decompiled/` |

### COMPLETED - Plugins (Fully Deobfuscated)
| Plugin | UUID | Files |
|--------|------|-------|
| Blue Dragon Killer | 3be19261-31a6-42fb-a6f1-3e9f39e6a450 | 15 |
| Pest Control | d3ba43e2-4966-4faf-8fcb-fba83fc95121 | 10 |
| Leagues Utilities | 21e931a2-dcd2-41bf-996b-cb50a8d5161d | 15 |
| + 46 others | Various | Already in clean_enhanced/ |

### COMPLETED - Plugins (Fully Deobfuscated)
| Plugin | UUID | Files | Status |
|--------|------|-------|--------|
| Mixology | 37ff9308-5bb6-4332-83e0-8ab13e118f7a | 23 | DONE - Full deobfuscation with PotionType, HerbType enums |
| Barrows | 3b638005-922a-492f-9405-93e6a5194477 | 29 | DONE - Brother enum, GearManager, all tasks |
| Miner | 3f45ab50-7de6-493f-a8bc-b432dabdf252 | 50 | DONE - MiningActivity enum, MLM support, all tasks |
| Basics Collection | 4d97445a-f331-4d37-a32a-a78260ee3d07 | 100+ | DONE - Combat, magic, skilling utilities |
| AutoTOA | clean_enhanced/autotoa | 151 | DONE - Full TOA raid automation |
| SOTF | clean_enhanced/sotf | 79 | DONE - Quest automation framework |

## Key Files to Reference

### Pathfinding & Collision
- `runelite-client-decompiled/net/unethicalite/api/movement/pathfinder/CollisionMap.java` - Directional movement interface
- `runelite-client-decompiled/net/unethicalite/api/movement/pathfinder/GlobalCollisionMap.java` - RoaringBitmap collision data
- `framework/decompiled/net/unethicalite/api/movement/pathfinder/Walker.java` - Main pathfinding logic

### Plugin Architecture
- `runelite-client-decompiled/gg/squire/SquirePlugin.java` - Base plugin class
- `runelite-client-decompiled/gg/squire/DontObfuscate.java` - Annotation to skip obfuscation

### Deobfuscation Examples (Use as Reference)
- `plugins/src/d3ba43e2.../clean_enhanced/` - Pest Control (clean example)
- `plugins/src/3be19261.../clean_enhanced/` - Blue Dragon Killer (clean example)
- `plugins/src/21e931a2.../clean_enhanced/` - Leagues Utilities (clean example)

### Documentation Created
- `plugins/src/4d97445a.../ANALYSIS.md` - Basics Collection analysis (44 plugins)
- `plugins/src/4d97445a.../TASK_MAPPING.md` - Obfuscated to clean name mappings
- `plugins/clean_enhanced/barrows/CLASS_MAPPINGS.json` - Barrows mappings
- `plugins/clean_enhanced/mixology/CLASS_MAPPINGS.json` - Mixology mappings

## Obfuscation Patterns

### String Encryption
```java
// Blowfish encryption - most common
private static String decrypt(String encrypted) {
    // Uses MD5 hash of key for Blowfish
}

// DES encryption
// XOR + Base64 encoding
```

### Variable/Method Obfuscation
- Single letters: `a()`, `b()`, `c()`
- Confusing patterns: `lllllIlIIIlI`, `llIIlIlllIII` (mix of l, I, 1)
- Bitwise operations hiding constants: `(0xAE ^ 0x97) & (~(0xC ^ 0x72))`

### Task System
- Plugins use `@TaskDesc("Description")` annotations
- Priority-based execution (higher priority runs first)
- Common task types: Banking, Combat, Movement, Looting, Magic, Prayer

## Decompilation Commands

```bash
# Decompile a JAR with CFR
java -jar /home/user/Squire/DeobfuscatedProject/tools/cfr.jar \
    input.jar \
    --outputdir output_directory/

# Extract resources from JAR
unzip -j input.jar "path/to/resource" -d output_directory/
```

## Next Steps Priority

1. ✅ **Complete Barrows deobfuscation** - DONE (29 files)
2. ✅ **Complete Miner deobfuscation** - DONE (50 files)
3. ✅ **Complete Mixology deobfuscation** - DONE (23 files)
4. ✅ **Basics Collection utilities** - DONE (100+ files)
5. **Verify all 53 plugins have clean versions** - Review remaining plugins
6. **Create unified project structure** with proper imports
7. **Final cleanup** - Ensure consistent package naming across all plugins

## Tips for Success

1. **Use parallel agents** - Deploy multiple Task agents to work on different plugins simultaneously
2. **Reference clean examples** - Pest Control and Blue Dragon Killer are fully clean references
3. **Check CLASS_MAPPINGS.json** - Some plugins have partial mappings already
4. **Look for @TaskDesc** - These annotations reveal method purposes
5. **Decrypt strings first** - Makes understanding code much easier
6. **Preserve package structure** - Keep `gg.squire.*` package naming

## Git Branch
Working branch: `claude/squire-decompilation-01DrJZqeyaZ42BEoa7ktJTWL`

## Session Summary (Dec 5, 2025)
- Deployed 8 parallel agents to deobfuscate remaining plugins
- All 4 priority plugins fully deobfuscated:
  - Barrows: 29 files → clean classes, enums, and tasks
  - Miner: 50 files → MLM support, mining activities
  - Mixology: 23 files → potion types, herb tiers
  - Basics: 100+ files → combat, magic, skilling utilities
- 101 files changed, 10,674 insertions, 2,390 deletions

---

**START PROMPT FOR CLAUDE:**

Continue the Squire OSRS bot client decompilation and deobfuscation project. The goal is to have fully readable, documented source code for the entire system.

Current status:
- All 5 core JARs are decompiled
- 49/53 plugins have clean versions (some partial)
- 4 plugins need significant deobfuscation work: Barrows, Miner, Mixology, Basics Collection

Priority tasks:
1. Complete deobfuscation of Barrows plugin (29 files at `plugins/src/3b638005-922a-492f-9405-93e6a5194477/`)
2. Complete deobfuscation of Miner plugin (49 files at `plugins/src/3f45ab50-7de6-493f-a8bc-b432dabdf252/`)
3. Complete deobfuscation of Mixology plugin (20 files at `plugins/src/37ff9308-5bb6-4332-83e0-8ab13e118f7a/`)
4. Deobfuscate 158 support files in Basics Collection (`plugins/src/4d97445a-f331-4d37-a32a-a78260ee3d07/`)

Use parallel Task agents for efficiency. Reference the fully deobfuscated Pest Control plugin at `plugins/src/d3ba43e2-4966-4faf-8fcb-fba83fc95121/clean_enhanced/` as an example of the target quality.

Read the full context at `/home/user/Squire/CLAUDE_SESSION_STARTER.md`
