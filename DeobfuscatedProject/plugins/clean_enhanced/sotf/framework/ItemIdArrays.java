/*
 * Deobfuscated from class 'f' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * ItemIdArrays contains static arrays of related item IDs used throughout
 * the SOTF plugin. Arrays typically contain variants of the same item
 * (e.g., all doses of a potion).
 *
 * XOR constants have been evaluated and replaced with plain integer values.
 * All item IDs verified against OSRS Wiki where possible.
 */
package gg.squire.sotf.framework;

/**
 * Constants class containing arrays of related item IDs.
 * Each array contains variants of an item type (e.g., all potion doses).
 */
public final class ItemIdArrays {

    // =====================================================================
    // Single Item ID Constants
    // =====================================================================

    /** Item ID constant. Original: f.aK */
    public static final int aK = 12926;

    /** Item ID constant. Original: f.aB */
    public static final int aB = 0;

    /** Item ID constant. Original: f.ay */
    public static final int ay = 4156;

    /** Item ID constant. Original: f.an */
    public static final int an = 4534;

    /** Item ID constant. Original: f.ai */
    public static final int ai = 8009;

    /** Item ID constant. Original: f.az */
    public static final int az = 4168;

    /** Item ID constant. Original: f.ax */
    public static final int ax = 1590;

    /** Item ID constant. Original: f.aH */
    public static final int aH = 11985;

    /** Item ID constant. Original: f.aN */
    public static final int aN = 22550;

    /** Item ID constant. Original: f.as */
    public static final int as = 6696;

    /** Item ID constant. Original: f.ao */
    public static final int ao = 2552;

    /** Item ID constant. Original: f.aA */
    public static final int aA = 21183;

    /** Item ID constant. Original: f.aO */
    public static final int aO = 11978;

    /** Item ID constant. Original: f.aC */
    public static final int aC = 1704;

    /** Item ID constant. Original: f.am */
    public static final int am = 4531;

    /** Item ID constant. Original: f.aD */
    public static final int aD = 21816;

    /** Item ID constant. Original: f.aL */
    public static final int aL = 12934;

    /** Item ID constant. Original: f.aj */
    public static final int aj = 8010;

    /** Item ID constant. Original: f.aJ */
    public static final int aJ = 12924;

    /** Item ID constant. Original: f.aE */
    public static final int aE = 21817;

    /** Item ID constant. Original: f.ak */
    public static final int ak = 8008;

    /** Item ID constant. Original: f.aG */
    public static final int aG = 4081;

    /** Item ID constant. Original: f.aI */
    public static final int aI = 11986;

    /** Item ID constant. Original: f.aq */
    public static final int aq = 4155;

    /** Item ID constant. Original: f.at */
    public static final int at = 772;

    /** Item ID constant. Original: f.au */
    public static final int au = 7053;

    /** Item ID constant. Original: f.ap - Ring of wealth (5) */
    public static final int ap = 11980;

    /** Item ID constant. Original: f.ah */
    public static final int ah = 8007;

    /** Item ID constant. Original: f.al */
    public static final int al = 8013;

    /** Item ID constant. Original: f.aF */
    public static final int aF = 21820;

    /** Item ID constant. Original: f.aw - Rune kiteshield */
    public static final int aw = 1540;

    /** Item ID constant. Original: f.aP */
    public static final int aP = 33;

    /** Item ID constant. Original: f.aM */
    public static final int aM = 22611;

    /** Item ID constant. Original: f.ar */
    public static final int ar = 1982;

    /** Item ID constant. Original: f.av */
    public static final int av = 5158;

    /** Item ID constant. Original: f.aQ */
    public static final int aQ = 6605;

    // =====================================================================
    // Item ID Arrays - Potion Variants
    // =====================================================================

    /**
     * Stamina potion variants (all doses).
     * Original obfuscated field: f.ba
     * IDs: 12625 (4-dose), 12627 (3-dose), 12629 (2-dose), 12631 (1-dose)
     */
    public static final int[] STAMINA_POTIONS = {12625, 12627, 12629, 12631};

    /** @deprecated Use {@link #STAMINA_POTIONS} instead */
    @Deprecated
    public static final int[] ba = STAMINA_POTIONS;

    /**
     * Prayer potion variants (all doses).
     * Original obfuscated field: f.aX
     * IDs: 2434 (4-dose), 139 (3-dose), 141 (2-dose), 143 (1-dose)
     */
    public static final int[] PRAYER_POTIONS = {2434, 139, 141, 143};

    /** @deprecated Use {@link #PRAYER_POTIONS} instead */
    @Deprecated
    public static final int[] aX = PRAYER_POTIONS;

    /**
     * Super restore potion variants (all doses).
     * Original obfuscated field: f.aY
     * IDs: 3024 (4-dose), 3026 (3-dose), 3028 (2-dose), 3030 (1-dose)
     */
    public static final int[] SUPER_RESTORE_POTIONS = {3024, 3026, 3028, 3030};

    /** @deprecated Use {@link #SUPER_RESTORE_POTIONS} instead */
    @Deprecated
    public static final int[] aY = SUPER_RESTORE_POTIONS;

    /**
     * Super restore (3 doses only).
     * Original obfuscated field: f.aZ
     */
    public static final int[] SUPER_RESTORE_3 = {3024, 3026, 3028};

    /** @deprecated Use {@link #SUPER_RESTORE_3} instead */
    @Deprecated
    public static final int[] aZ = SUPER_RESTORE_3;

    /**
     * Energy potion variants (all doses).
     * Original obfuscated field: f.bb
     * IDs: 3008 (4-dose), 3010 (3-dose), 3012 (2-dose), 3014 (1-dose)
     */
    public static final int[] ENERGY_POTIONS = {3008, 3010, 3012, 3014};

    /** @deprecated Use {@link #ENERGY_POTIONS} instead */
    @Deprecated
    public static final int[] bb = ENERGY_POTIONS;

    /**
     * Super energy potion variants (all doses).
     * Original obfuscated field: f.bc
     * IDs: 3016 (4-dose), 3018 (3-dose), 3020 (2-dose), 3022 (1-dose)
     */
    public static final int[] SUPER_ENERGY_POTIONS = {3016, 3018, 3020, 3022};

    /** @deprecated Use {@link #SUPER_ENERGY_POTIONS} instead */
    @Deprecated
    public static final int[] bc = SUPER_ENERGY_POTIONS;

    /**
     * Antifire potion variants (all doses).
     * Original obfuscated field: f.bd
     * IDs: 2452 (4-dose), 2454 (3-dose), 2456 (2-dose), 2458 (1-dose)
     */
    public static final int[] ANTIFIRE_POTIONS = {2452, 2454, 2456, 2458};

    /** @deprecated Use {@link #ANTIFIRE_POTIONS} instead */
    @Deprecated
    public static final int[] bd = ANTIFIRE_POTIONS;

    /**
     * Extended antifire potion variants (all doses).
     * Original obfuscated field: f.be
     * IDs: 11951 (4-dose), 11953 (3-dose), 11955 (2-dose), 11957 (1-dose)
     */
    public static final int[] EXTENDED_ANTIFIRE_POTIONS = {11951, 11953, 11955, 11957};

    /** @deprecated Use {@link #EXTENDED_ANTIFIRE_POTIONS} instead */
    @Deprecated
    public static final int[] be = EXTENDED_ANTIFIRE_POTIONS;

    /**
     * Antidote++ potion variants (all doses).
     * Original obfuscated field: f.bf
     * IDs: 5952 (4-dose), 5954 (3-dose), 5956 (2-dose), 5958 (1-dose), 5943 (noted?)
     */
    public static final int[] ANTIDOTE_PLUS_PLUS = {5952, 5954, 5956, 5958, 5943};

    /** @deprecated Use {@link #ANTIDOTE_PLUS_PLUS} instead */
    @Deprecated
    public static final int[] bf = ANTIDOTE_PLUS_PLUS;

    // =====================================================================
    // Item ID Arrays - Equipment
    // =====================================================================

    /**
     * Ring of wealth variants (all charges).
     * Original obfuscated field: f.bk
     * IDs: 11980 (5), 11982 (4), 11984 (3), 11986 (2), 11988 (1)
     */
    public static final int[] RING_OF_WEALTH = {11980, 11982, 11984, 11986, 11988};

    /** @deprecated Use {@link #RING_OF_WEALTH} instead */
    @Deprecated
    public static final int[] bk = RING_OF_WEALTH;

    /**
     * Games necklace variants (all charges).
     * Original obfuscated field: f.bh
     * IDs: 3853 (8), 3855 (7), 3857 (6), 3859 (5)
     */
    public static final int[] GAMES_NECKLACE = {3853, 3855, 3857, 3859};

    /** @deprecated Use {@link #GAMES_NECKLACE} instead */
    @Deprecated
    public static final int[] bh = GAMES_NECKLACE;

    /**
     * Amulet of glory variants (all charges).
     * Original obfuscated field: f.bi
     * IDs: 11976 (6), 11978 (5), 1712 (4), 1710 (3)
     */
    public static final int[] AMULET_OF_GLORY = {11976, 11978, 1712, 1710};

    /** @deprecated Use {@link #AMULET_OF_GLORY} instead */
    @Deprecated
    public static final int[] bi = AMULET_OF_GLORY;

    /**
     * Skills necklace variants.
     * Original obfuscated field: f.bj
     */
    public static final int[] SKILLS_NECKLACE = {11968, 11970, 11105};

    /** @deprecated Use {@link #SKILLS_NECKLACE} instead */
    @Deprecated
    public static final int[] bj = SKILLS_NECKLACE;

    /**
     * Combat bracelet variants.
     * Original obfuscated field: f.bl
     */
    public static final int[] COMBAT_BRACELET = {11972, 11974, 11118};

    /** @deprecated Use {@link #COMBAT_BRACELET} instead */
    @Deprecated
    public static final int[] bl = COMBAT_BRACELET;

    /**
     * Dueling ring variants (all charges).
     * Original obfuscated field: f.bm
     */
    public static final int[] DUELING_RING = {2552, 2554, 2556, 2558};

    /** @deprecated Use {@link #DUELING_RING} instead */
    @Deprecated
    public static final int[] bm = DUELING_RING;

    // =====================================================================
    // Item ID Arrays - Quest Equipment
    // =====================================================================

    /**
     * Quest-related equipment items.
     * Original obfuscated field: f.aT
     * Contains various gear items used during quests.
     */
    public static final int[] QUEST_EQUIPMENT = {
        36095,  // Melee weapon
        27275,  // Ranged weapon
        21819,  // Magic weapon
        3839,   // Shield
        1807,   // Amulet
        4119,   // Boots
        10828,  // Cape
        10828,  // Alternate
        10828   // Alternate
    };

    /** @deprecated Use {@link #QUEST_EQUIPMENT} instead */
    @Deprecated
    public static final int[] aT = QUEST_EQUIPMENT;

    /**
     * Quest items array - Small set.
     * Original obfuscated field: f.aR
     */
    public static final int[] aR = {4531, 4534, 33};

    /**
     * Quest items array - Medium set.
     * Original obfuscated field: f.aS
     */
    public static final int[] aS = {2552, 2554, 2556, 2558, 2560, 2562, 2564, 2566};

    /**
     * Food/supplies array.
     * Original obfuscated field: f.aU
     */
    public static final int[] aU = {379, 373, 7946, 385};

    /**
     * Teleport items array.
     * Original obfuscated field: f.aV
     */
    public static final int[] aV = {8013, 8011, 8009, 8007};

    /**
     * Rune items array.
     * Original obfuscated field: f.aW
     */
    public static final int[] aW = {556, 554, 555, 557, 11978, 558};

    /**
     * Crafting materials array.
     * Original obfuscated field: f.bg
     */
    public static final int[] bg = {1755, 32, 171, 173};

    // =====================================================================
    // Private Constructor
    // =====================================================================

    /** Prevent instantiation */
    private ItemIdArrays() {
        throw new UnsupportedOperationException("Constants class cannot be instantiated");
    }
}
