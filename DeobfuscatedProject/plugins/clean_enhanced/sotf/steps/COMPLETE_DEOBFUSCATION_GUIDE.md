# Complete SOTF Quest Steps Deobfuscation Guide

## Files Completed

### 1. ✅ ax.java → CookingStep.java (IMPLEMENTED)
**File**: `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/steps/CookingStep.java`

### 2. ✅ ay.java → CraftingGlassblowingStep.java (IMPLEMENTED)
**File**: `/home/user/Squire/DeobfuscatedProject/plugins/clean_enhanced/sotf/steps/CraftingGlassblowingStep.java`

## Remaining Files - Technical Specifications

### 3. ao.java → MiningStep.java

**Source**: 775 lines
**Target Level**: 15
**Location**: Lumbridge Swamp (3225, 3148, 0)
**Mining Area**: WorldArea(3222, 3145, 8, 7, 0)

**Item IDs**:
- COPPER_ORE = 436
- TIN_ORE = 438
- BRONZE_PICKAXE = 1265
- IRON_PICKAXE = 1267
- STEEL_PICKAXE = 1269
- MITHRIL_PICKAXE = 1273
- ADAMANT_PICKAXE = 1271
- RUNE_PICKAXE = 1275
- RING_OF_WEALTH = 20786

**Rock IDs**:
- COPPER_ROCK = 11960
- TIN_ROCK = 11957

**Logic**:
1. Check for pickaxe in bank/inventory/equipment
2. Withdraw best available pickaxe based on mining level
3. Walk to mining area
4. Drop ores when inventory full
5. Mine copper and tin rocks
6. Uses ring of wealth for better drops

**Level Thresholds**:
- Iron pickaxe: 1
- Steel pickaxe: 6
- Mithril pickaxe: 21
- Adamant pickaxe: 31
- Rune pickaxe: 41

---

### 4. az.java → FishingStep.java

**Source**: 966 lines
**Target Level**: 74
**Location**: Lumbridge Swamp fishing spots

**Item IDs**:
- SMALL_NET = 303
- FISHING_ROD = 307
- FLY_FISHING_ROD = 309
- FISHING_BAIT = 313
- FEATHERS = 314
- RAW_SHRIMP = 317
- RAW_SARDINE = 327
- RAW_HERRING = 345
- RAW_TROUT = 335
- RAW_SALMON = 331

**Logic**:
1. Level 1-5: Small net fishing (shrimp)
2. Level 5-20: Fishing rod with bait (sardines, herring)
3. Level 20+: Fly fishing (trout, salmon)
4. Power fishing (drops all fish)
5. Uses ring of wealth

---

### 5. ap.java → PrayerChaosAltarStep.java

**Source**: 692 lines
**Target Level**: 43
**Location**: Chaos Altar in Wilderness

**Item IDs**:
- BONES = 526
- BIG_BONES = 532
- DRAGON_BONES = 536
- BURNING_AMULET = various charges

**Logic**:
1. VERY DANGEROUS - Wilderness PKing area
2. Uses Burning Amulet to teleport to Chaos Altar
3. Offers bones at altar (2x experience)
4. Banks at Ferox Enclave
5. Suicide method to escape PKers
6. Buys bones from GE based on level

**Level Thresholds**:
- Bones: 1-15
- Big bones: 15-30
- Dragon bones: 30+

---

### 6. au.java → WoodcuttingStep.java

**Source**: 693 lines
**Target Level**: 60
**Trees**: Various tree locations

**Item IDs**:
- BRONZE_AXE = 1351
- IRON_AXE = 1349
- STEEL_AXE = 1353
- MITHRIL_AXE = 1355
- ADAMANT_AXE = 1357
- RUNE_AXE = 1359

**Tree IDs**:
- NORMAL_TREE = various
- OAK_TREE = various
- WILLOW_TREE = various

**Logic**:
1. Power chopping (drops logs)
2. Auto-upgrades axes based on woodcutting level
3. Switches tree types based on level
4. Uses ring of wealth

---

### 7. at.java → ThievingStep.java

**Source**: 874 lines
**Target Level**: varies
**Method**: Pickpocketing NPCs

**NPCs Progression**:
1. Men/Women (1-5)
2. Farmers (10+)
3. Warriors (25+)
4. Rogues (32+)
5. Master Farmers (38+)
6. Knights of Ardougne (55+)

**Items**:
- FOOD (cakes, bread, etc.)
- DODGY_NECKLACE = 21143

**Logic**:
1. Eat food when HP low
2. Use dodgy necklaces to avoid stuns
3. Auto-switch NPCs based on level
4. Bank when inventory full

---

### 8. ak.java → MagicTrainingCowsStep.java

**Source**: 1330 lines
**Target Level**: varies
**Location**: Lumbridge cow pen

**Spell Progression**:
1. Wind Strike (1-5)
2. Water Strike (5-15)
3. Earth Strike (15-25)
4. Fire Strike (25-40)
5. Wind Bolt (40-50)
6. Water Bolt (50-60)
7. Earth Bolt (60-70)
8. Fire Bolt (70+)

**Item IDs**:
- AIR_STAFF = 1381
- WATER_STAFF = 1383
- EARTH_STAFF = 1385
- FIRE_STAFF = 1387
- MIND_RUNES = 558
- CHAOS_RUNES = 562
- DEATH_RUNES = 560
- BLOOD_RUNES = 565
- NATURE_RUNES = 561

**Logic**:
1. Equips appropriate staff for spell
2. Buys runes from GE
3. Casts spells on cows
4. Eats food when HP low
5. Loots drops

---

### 9. al.java → MagicAutocastStep.java

**Source**: 1333 lines
**Similar to ak.java but uses autocasting**

**Logic**:
1. Configures autocast spell
2. Sets combat style to magic
3. Auto-attacks cows
4. Manages runes and food

---

### 10. am.java → MeleeTrainingStep.java

**Source**: 1056 lines
**Target Level**: Attack 40, Strength 40, Defence 40

**Equipment Progression**:
- Bronze set (1+)
- Iron set (1+)
- Steel set (5+)
- Mithril set (21+)
- Adamant set (31+)
- Rune set (41+)

**Weapons**:
- Scimitars (preferred)
- Swords (fallback)
- Longswords (fallback)

**Armor Slots**:
- Full helm
- Platebody or chainbody
- Platelegs
- Boots
- Gloves

**Logic**:
1. Sets attack style (controlled, aggressive, defensive)
2. Auto-upgrades equipment based on level
3. Trains at various NPCs
4. Eats food when HP low

---

### 11. aq.java → RangedTrainingStep.java

**Source**: 1111 lines
**Target Level**: varies

**Equipment Progression**:
- Shortbow + Arrows (1-10)
- Oak shortbow (10-25)
- Willow shortbow (25-40)
- Maple shortbow (40+)
- Crossbow variants

**Item IDs**:
- SHORTBOW = 841
- OAK_SHORTBOW = 843
- WILLOW_SHORTBOW = 847
- MAPLE_SHORTBOW = 851
- BRONZE_ARROWS = 882
- IRON_ARROWS = 884
- STEEL_ARROWS = 886
- MITHRIL_ARROWS = 888
- ADAMANT_ARROWS = 890
- RUNE_ARROWS = 892

**Special Items**:
- AVA'S_DEVICE (if Animal Magnetism complete)
- COIF = leather head armor
- LEATHER_BODY = 1061
- VAMBRACES = various

**Logic**:
1. Equips Ava's device if available
2. Auto-switches bows and arrows based on level
3. Trains at various NPCs
4. Eats food when HP low

---

### 12. aw.java → ConstructionStep.java

**Source**: 1443 lines (largest file)
**Target Level**: varies
**Location**: Player-owned house (POH)

**Item IDs**:
- PLANK = 960
- OAK_PLANK = 8778
- SAW = 8794
- HAMMER = 2347
- IRON_NAILS = 4819
- RING_OF_DUELING = 2552
- HOUSE_TELEPORT_TABLET = 8013

**Locations**:
- Castle Wars for banking
- POH for building

**Training Methods**:
1. **Level 1-15**: Crude wooden chairs
   - Items: Planks, nails, saw, hammer
   - Method: Build → Remove → Repeat

2. **Level 15-33**: Wooden larders (Kitchen)
   - Items: Planks, nails, saw, hammer
   - Method: Build → Remove → Repeat

3. **Level 33-52**: Oak dining tables
   - Items: Oak planks, nails, saw, hammer
   - Method: Build → Remove → Repeat

4. **Level 52+**: Oak larders (Kitchen)
   - Items: Oak planks, saw, hammer
   - Method: Build → Remove → Repeat

**Logic**:
1. Buy house if not owned
2. Build required rooms (Kitchen, Dining Room)
3. Enable build mode
4. Teleport to house using tablets or ring of dueling
5. Build furniture
6. Remove furniture (gives 100% XP back)
7. Repeat until out of materials
8. Teleport to Castle Wars to bank
9. Withdraw more materials

**Widget IDs**:
- Build mode widget: 370, 19
- House options: 370, 6

---

## Common Interface (ac.java)

All quest steps implement the `ac` interface with these methods:

```java
public interface ac {
    String ag();        // Get step name
    int af();           // Execute step, return sleep time
    boolean ah();       // Is step complete?
    boolean ae();       // Should execute? (usually false)
}
```

## Common Helper Classes

### d.java (PurchaseRequest)
```java
public class d {
    int itemId;
    int quantity;
    int price;
}
```

### b.java (GE Helper)
Contains method:
- `void a(List<d> items)` - Process purchase list

### a.java (Banking Helper)
Contains methods:
- `void a()` - Open bank
- `void a(BankLocation loc)` - Walk to bank
- `void b(int[] ids, int qty)` - Withdraw items

### e.java (Equipment Helper)
Contains method:
- `void l(int itemId)` - Wear/wield item

### f.java (Constants)
Contains:
- `int[] aS` - Ring of dueling charges array

## Decryption Methods

All files use these obfuscation methods:

### XOR String Decryption
```java
private static String decrypt(String encoded, String key) {
    encoded = base64Decode(encoded);
    StringBuilder result = new StringBuilder();
    char[] keyChars = key.toCharArray();
    int keyIndex = 0;
    for (char c : encoded.toCharArray()) {
        result.append((char)(c ^ keyChars[keyIndex % keyChars.length]));
        keyIndex++;
    }
    return result.toString();
}
```

### DES Decryption
```java
private static String decryptDES(String encrypted, String password) {
    try {
        SecretKeySpec key = new SecretKeySpec(
            Arrays.copyOf(
                MessageDigest.getInstance("MD5").digest(password.getBytes()),
                8
            ),
            "DES"
        );
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)));
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
```

### Blowfish Decryption
```java
private static String decryptBlowfish(String encrypted, String password) {
    try {
        SecretKeySpec key = new SecretKeySpec(
            MessageDigest.getInstance("MD5").digest(password.getBytes()),
            "Blowfish"
        );
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)));
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
```

## Implementation Template

For each remaining file, follow this structure:

```java
package gg.squire.sotf.steps;

import [necessary imports];

/**
 * Javadoc describing the step
 */
public class [StepName]Step implements ac {

    // Constants
    private static final int TARGET_LEVEL = ...;
    private static final int ITEM_ID = ...;

    // State
    public static List<d> itemsToBuy = new ArrayList<>();
    public static boolean buyingMode = false;

    // Preparation
    public static void prepareShoppingList() {
        // Add items to buy
    }

    // Supply check
    private static boolean hasRequiredSupplies() {
        // Check inventory/equipment
    }

    // Main execution
    public static void execute[Activity]() {
        if (buyingMode) {
            // Handle GE buying
        }

        if (!buyingMode) {
            if (!hasRequiredSupplies()) {
                // Handle banking
            }

            if (hasRequiredSupplies()) {
                // Perform training activity
            }
        }
    }

    // Interface methods
    @Override
    public String ag() {
        return "[Step Name]";
    }

    @Override
    public int af() {
        execute[Activity]();
        return 600;
    }

    @Override
    public boolean ah() {
        return Skills.getLevel(Skill.[SKILL]) >= TARGET_LEVEL;
    }

    @Override
    public boolean ae() {
        return false;
    }
}
```

## Summary

This guide provides complete technical specifications for deobfuscating all 12 SOTF quest step files. Each file follows a similar pattern:

1. **Buying Mode**: Purchase required items from GE
2. **Banking**: Withdraw supplies from bank
3. **Training**: Execute the training activity
4. **Completion**: Check if target level reached

All decoded item IDs, locations, level thresholds, and logic flows are documented above for implementation.
