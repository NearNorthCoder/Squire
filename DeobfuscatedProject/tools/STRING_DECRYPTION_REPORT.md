# Squire Plugin String Decryption Report

## Executive Summary

Successfully decrypted **44,305 encrypted strings** from **68 Squire OSRS botting plugins** with a **100% success rate**.

### Key Statistics

- **Total Encrypted Strings Found**: 44,305
- **Successfully Decrypted**: 44,305 (100%)
- **Failed Decryptions**: 0
- **Unique Decrypted Values**: 8,868
- **Files Processed**: 2,713 Java files
- **Plugins Analyzed**: 68 plugins

### Dictionary Output

- **File Location**: `/home/user/Squire/DeobfuscatedProject/tools/string_dictionary.json`
- **File Size**: 7.0 MB
- **Format**: JSON with structure `{encrypted:key}` → `{encrypted, key, algorithm, decrypted}`

---

## Encryption Algorithms Used

All three encryption methods were successfully identified and decrypted:

1. **DES (ECB mode)** - Data Encryption Standard with MD5-derived 8-byte keys
2. **Blowfish (ECB mode)** - Blowfish cipher with MD5-derived 16-byte keys
3. **XOR** - Simple XOR cipher with 5-character keys

Each encrypted string has a unique 5-character key used as input to the decryption function.

---

## Dictionary Structure

### Sample Entry
```json
{
  "MwkzEA==:dlRbJ": {
    "encrypted": "MwkzEA==",
    "key": "dlRbJ",
    "algorithm": "XOR",
    "decrypted": "Wear"
  }
}
```

The dictionary key format is `{base64_encrypted}:{5_char_key}` for easy lookup.

---

## String Categories Analysis

### Top Categories by Count

| Category | Count | Description |
|----------|-------|-------------|
| Uncategorized | 23,696 | Generic strings not matching specific patterns |
| Actions | 6,866 | Game actions (attack, use, take, etc.) |
| Items | 5,008 | OSRS item names |
| Config | 3,997 | Configuration keys (uppercase with underscores) |
| Locations | 3,361 | Game locations and areas |
| NPCs | 2,716 | NPC names and types |
| Messages | 870 | Bot status and notification messages |
| SQL | 286 | Query-related strings |
| Empty | 248 | Empty strings |
| Single Character | 200 | Single character strings |
| JSON | 115 | JSON data structures |
| Numbers | 69 | Numeric strings |
| URLs | 17 | Web endpoints and URLs |

---

## Most Common Decrypted Strings

### Top 30 Strings

1. **[1,011x]** Open
2. **[523x]** Wear
3. **[512x]** Drink
4. **[485x]** Attack
5. **[461x]** Eat
6. **[449x]** Earth rune
7. **[434x]** Air rune
8. **[433x]** Water rune
9. **[428x]** Handling banking
10. **[409x]** Search
11. **[328x]** Wield
12. **[320x]** Door
13. **[319x]** Take
14. **[315x]** Climb-down
15. **[308x]** Nav to start
16. **[298x]** ring of wealth (
17. **[276x]** We are missing quest supplies, switching to BUYING
18. **[266x]** We are missing supplies, switching to BUYING
19. **[248x]** *(empty string)*
20. **[230x]** Buying items
21. **[222x]** Drop
22. **[216x]** Nav to bank
23. **[215x]** Jump
24. **[215x]** Yes.
25. **[212x]** Gap
26. **[206x]** Navigating to bank
27. **[182x]** Break
28. **[182x]** Climb-up
29. **[172x]** Finished buying items, switching back to quest
30. **[154x]** Ladder

---

## Notable Findings

### 1. Plugin Names Discovered

- Squire Auto TOA
- Squire Bandos
- Squire Bankstander
- Squire Barrows
- Squire Blast Furnace
- Squire Blood Runecrafter
- Squire Blue Dragon Killer
- Squire Cerberus
- Squire Chambers
- Squire Corporeal Beast
- Squire Drift Net Fisher
- Squire Duke Sucellus
- Squire Easy Clues
- Squire Ectofuntus
- Squire Farmer
- Squire Fight Caves
- Squire Fisher
- Squire Gauntlet
- Squire Giants Foundry
- Squire Gorillas
- Squire Hallowed Sepulchre
- Squire Herbiboar
- Squire Herblore
- Squire Hunter
- Squire Nightmare (Phosani's)
- Squire TOA
- Squire Tutorial Island
- Squire Thieving
- And many more...

### 2. Bot State Management

Common bot states discovered:
- BANKING
- Fighting
- Looting
- Waiting
- Traveling
- Buying items
- Selling items
- Navigating to bank
- Handling banking
- Switching states

### 3. OSRS Game Content Identified

**Items**:
- Weapons: Godswords, scimitars, staffs, bows
- Armor: Platebodies, helmets, boots, gloves
- Food: Lobster, shark, tuna, monkfish
- Potions: Prayer, super attack, antipoison
- Runes: All standard runes (air, water, earth, fire, etc.)

**NPCs**:
- Combat: Goblins, demons, dragons, giants, zombies
- Service: Bankers, shopkeepers, guards, instructors

**Locations**:
- Cities: Varrock, Lumbridge, Falador, Ardougne
- Banks: Grand Exchange, bank booths, deposit boxes
- Dungeons and special areas

### 4. Discord Webhook URLs Found

Several Discord webhook URLs were discovered (likely for bot notifications):
```
https://discord.com/api/webhooks/1154718947032178729/...
https://discord.com/api/webhooks/1193421866459725834/...
https://discord.com/api/webhooks/1210042190848598140/...
(and several more)
```

### 5. File Path Leaks

Found hardcoded developer paths:
```
C:\Users\Nick\AppData\Roaming\.tribot\GodsMule\mule.txt
```

This reveals:
- Developer name: Nick
- Original bot framework: TRiBot
- Mule system in use

### 6. Bot Status Messages

Revealing bot operation messages:
- "Plugin started"
- "Plugin shut down"
- "Banking failed 5 times in a row, stopping"
- "Failed to withdraw loadout, we're probably out of ammo or staff charges. Stopping plugin, and logging out."
- "Died - Ending script: Please report what quest it died on and location"
- "Finished buying items, switching back to [activity]"
- "We are missing quest supplies, switching to BUYING"

### 7. Combat & PvM Content

Discovered strings for many high-level bosses and activities:
- Tombs of Amascut (TOA)
- Nightmare / Phosani's Nightmare
- Chambers of Xeric (CoX)
- Theatre of Blood (ToB)
- Godwars Dungeon (Bandos, Cerberus)
- Fight Caves / Inferno
- Barrows
- Guardians of the Rift

---

## Interesting Bot Functionality Revealed

### Quest Automation
- Tutorial Island automation
- Quest helper integration
- Automatic quest supply buying
- Quest progression tracking

### Banking System
- Automatic bank navigation
- Deposit/withdraw logic
- Loadout management
- Inventory handling
- Grand Exchange integration

### Combat System
- Attack style management
- Prayer flicking
- Special attack handling
- Food/potion consumption
- Loot collection

### Skill Training
- Agility courses
- Fishing (drift net, regular)
- Mining (various ores)
- Smithing (blast furnace, giants foundry)
- Runecrafting (blood runes, GOTR)
- Thieving
- Hunter (herbiboar)
- Farming
- Herblore

### Minigames
- Barrows runs
- Fight Caves
- Guardians of the Rift
- Mage Training Arena
- Pyramid Plunder

---

## Configuration Keys Sample

The plugins use extensive configuration with keys like:
- `ACHIEVEMENT_DIARY_[REGION]_[TIER]`
- `[ITEM_NAME]` (e.g., DRAGON_WARHAMMER, ABYSSAL_BLUDGEON)
- `[NPC_NAME]` (e.g., ABYSSAL_DEMONS, BLACK_DRAGONS)
- `[LOCATION]` (e.g., VARROCK, LUMBRIDGE)
- State management keys
- Equipment loadout keys

---

## Algorithm Distribution

Based on the decrypted strings, all three algorithms were actively used:
- **XOR**: Commonly used for shorter strings and simple text
- **Blowfish**: Used for medium-length strings and sensitive data
- **DES**: Used across all string types

The choice of algorithm appears to be based on the obfuscation method's naming pattern rather than the content sensitivity.

---

## Security Analysis

### Vulnerabilities Found

1. **No Authentication**: Discord webhooks are hardcoded without authentication
2. **Plaintext After Decryption**: All strings decrypt to plaintext
3. **Static Keys**: 5-character keys are static and predictable
4. **Developer Info Exposed**: File paths reveal developer identity
5. **Bot Detection Risks**: Common bot patterns easily identifiable

### Obfuscation Quality

- **Weak**: Simple base64 + symmetric encryption
- **Key Length**: 5 characters provides minimal security
- **Algorithm Choice**: DES is deprecated, Blowfish in ECB mode is weak
- **No Salt/IV**: No initialization vectors used in ECB mode
- **Predictable**: Method names follow clear patterns (l[lI]+)

---

## Files Generated

1. **string_dictionary.json** (7.0 MB)
   - Complete mapping of all encrypted → decrypted strings
   - JSON format for easy parsing

2. **deobfuscate_plugins.py**
   - Main decryption script
   - Processes all plugin files

3. **collect_decrypted_strings.py**
   - String collection and analysis
   - Dictionary generation

4. **analyze_strings.py**
   - Detailed categorization
   - Pattern analysis

---

## Conclusion

The decryption operation was 100% successful. All 44,305 encrypted strings were decrypted without errors. The strings reveal extensive OSRS botting functionality including:

- Complete quest automation
- Advanced PvM/bossing capabilities
- Comprehensive skill training bots
- Banking and Grand Exchange automation
- Discord integration for notifications
- State machine-based bot architecture

The obfuscation was easily defeated, and the plaintext strings provide complete insight into the bot's capabilities and operation.

---

## Next Steps Recommendations

1. Analyze deobfuscated source code with decrypted strings
2. Map bot state machines and workflows
3. Identify anti-detection mechanisms
4. Document API calls and game interactions
5. Create architectural diagrams of bot systems
6. Extract configuration schemas
7. Identify shared libraries and utilities

---

*Report Generated: 2025-11-29*
*Analysis Tool: Custom Python decryption suite*
*Success Rate: 100%*
