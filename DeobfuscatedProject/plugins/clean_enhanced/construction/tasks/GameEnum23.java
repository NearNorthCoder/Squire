/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.collect.ImmutableList
 *  javax.annotation.Nullable
 */
package gg.squire.construction.tasks;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.IntPredicate;
import javax.annotation.Nullable;

public final class GameEnum23
extends Enum<T> {
    public static final  /* enum */ T BLUE_DRAGONS;
    public static final  /* enum */ T DARK_WARRIORS;
    public static final  /* enum */ T CHAOS_DRUIDS;
    public static final  /* enum */ T MUTATED_ZYGOMITES;
    public static final  /* enum */ T WALL_BEASTS;
    public static final  /* enum */ T FIRE_GIANTS;
    public static final  /* enum */ T CRAZY_ARCHAEOLOGIST;
    public static final  /* enum */ T RED_DRAGONS;
    public static final  /* enum */ T KURASK;
    public static final  /* enum */ T MITHRIL_DRAGONS;
    public static final  /* enum */ T THERMONUCLEAR_SMOKE_DEVIL;
    public static final  /* enum */ T ZOMBIES;
    private final  int itemSpriteId;
    public static final  /* enum */ T SARACHNIS;
    private static final  T[] $VALUES;
    public static final  /* enum */ T CRAWLING_HANDS;
    static final  List<String> LOCATIONS;
    public static final  /* enum */ T CHAOS_FANATIC;
    public static final  /* enum */ T TROLLS;
    public static final  /* enum */ T WOLVES;
    public static final  /* enum */ T CATABLEPON;
    public static final  /* enum */ T HYDRAS;
    public static final  /* enum */ T WATERFIENDS;
    public static final  /* enum */ T SULPHUR_LIZARDS;
    public static final  /* enum */ T ICE_WARRIORS;
    public static final  /* enum */ T CAVE_SLIMES;
    public static final  /* enum */ T RATS;
    public static final  /* enum */ T CAVE_HORRORS;
    public static final  /* enum */ T FEVER_SPIDERS;
    public static final  /* enum */ T SCORPIONS;
    public static final  /* enum */ T TUROTH;
    public static final  /* enum */ T CAVE_BUGS;
    public static final  /* enum */ T ICE_GIANTS;
    public static final  /* enum */ T LESSER_DEMONS;
    public static final  /* enum */ T BLACK_KNIGHTS;
    public static final  /* enum */ T ANKOU;
    public static final  /* enum */ T MONKEYS;
    public static final  /* enum */ T EARTH_WARRIORS;
    public static final  /* enum */ T CAVE_KRAKEN;
    public static final  /* enum */ T KALPHITE_QUEEN;
    public static final  /* enum */ T MINIONS_OF_SCABARAS;
    public static final  /* enum */ T ZUK;
    public static final  /* enum */ T VAMPYRES;
    public static final  /* enum */ T FLESH_CRAWLERS;
    public static final  /* enum */ T KILLERWATTS;
    public static final  /* enum */ T TZHAAR;
    public static final  /* enum */ T GENERAL_GRAARDOR;
    public static final  /* enum */ T IRON_DRAGONS;
    public static final  /* enum */ T DAGANNOTH;
    public static final  /* enum */ T DERANGED_ARCHAEOLOGIST;
    public static final  /* enum */ T MINOTAURS;
    public static final  /* enum */ T SMOKE_DEVILS;
    public static final  /* enum */ T SKELETONS;
    public static final  /* enum */ T ALCHEMICAL_HYDRA;
    public static final  /* enum */ T SPIDERS;
    public static final  /* enum */ T STEEL_DRAGONS;
    public static final  /* enum */ T SKELETAL_WYVERNS;
    @Nullable
    private final  IntPredicate xpMatcher;
    public static final  /* enum */ T CALLISTO;
    public static final  /* enum */ T BASILISKS;
    public static final  /* enum */ T LAVA_DRAGONS;
    public static final  /* enum */ T KRIL_TSUTSAROTH;
    public static final  /* enum */ T MOSS_GIANTS;
    public static final  /* enum */ T BANDITS;
    public static final  /* enum */ T LIZARDS;
    public static final  /* enum */ T JAD;
    public static final  /* enum */ T KREEARRA;
    public static final  /* enum */ T INFERNAL_MAGES;
    public static final  /* enum */ T CERBERUS;
    public static final  /* enum */ T HOBGOBLINS;
    public static final  /* enum */ T VORKATH;
    private final  String[] targetNames;
    public static final  /* enum */ T KRAKEN;
    public static final  /* enum */ T TEMPLE_SPIDERS;
    public static final  /* enum */ T BATS;
    public static final  /* enum */ T GOBLINS;
    public static final  /* enum */ T MOLANISKS;
    public static final  /* enum */ T ABYSSAL_DEMONS;
    public static final  /* enum */ T DAGANNOTH_KINGS;
    public static final  /* enum */ T DRAKES;
    public static final  /* enum */ T BANSHEES;
    public static final  /* enum */ T MOGRES;
    public static final  /* enum */ T SCORPIA;
    public static final  /* enum */ T ZILYANA;
    public static final  /* enum */ T ENTS;
    public static final  /* enum */ T ELVES;
    public static final  /* enum */ T ABYSSAL_SIRE;
    public static final  /* enum */ T SOURHOGS;
    public static final  /* enum */ T AVIANSIES;
    public static final  /* enum */ T PYREFIENDS;
    public static final  /* enum */ T LIZARDMEN;
    public static final  /* enum */ T MAGIC_AXES;
    public static final  /* enum */ T BLACK_DEMONS;
    public static final  /* enum */ T GHOSTS;
    public static final  /* enum */ T VENENATIS;
    public static final  /* enum */ T FOSSIL_ISLAND_WYVERNS;
    public static final  /* enum */ T ICEFIENDS;
    public static final  /* enum */ T ADAMANT_DRAGONS;
    public static final  /* enum */ T JELLIES;
    public static final  /* enum */ T JUNGLE_HORROR;
    public static final  /* enum */ T CAVE_CRAWLERS;
    public static final  /* enum */ T GHOULS;
    public static final  /* enum */ T DOGS;
    public static final  /* enum */ T ROCKSLUGS;
    public static final  /* enum */ T SPIRITUAL_CREATURES;
    public static final  /* enum */ T GROTESQUE_GUARDIANS;
    public static final  /* enum */ T COCKATRICE;
    public static final  /* enum */ T ZULRAH;
    public static final  /* enum */ T COWS;
    public static final  /* enum */ T REVENANTS;
    public static final  /* enum */ T HELLHOUNDS;
    public static final  /* enum */ T SUQAHS;
    public static final  /* enum */ T DARK_BEASTS;
    public static final  /* enum */ T OTHERWORLDLY_BEING;
    private final  int weaknessThreshold;
    public static final  /* enum */ T HARPIE_BUG_SWARMS;
    private static  String[] llIlIIIlI;
    public static final  /* enum */ T GREATER_DEMONS;
    public static final  /* enum */ T RUNE_DRAGONS;
    public static final  /* enum */ T BLACK_DRAGONS;
    private static  int[] lllIlIIll;
    public static final  /* enum */ T BLOODVELD;
    public static final  /* enum */ T VETION;
    public static final  /* enum */ T CROCODILES;
    private final  String name;
    public static final  /* enum */ T GARGOYLES;
    public static final  /* enum */ T PIRATES;
    private final  int weaknessItem;
    public static final  /* enum */ T BARROWS_BROTHERS;
    public static final  /* enum */ T DWARVES;
    public static final  /* enum */ T GIANT_MOLE;
    public static final  /* enum */ T MAMMOTHS;
    public static final  /* enum */ T WYRMS;
    public static final  /* enum */ T BEARS;
    public static final  /* enum */ T KING_BLACK_DRAGON;
    public static final  /* enum */ T DUST_DEVILS;
    public static final  /* enum */ T BRONZE_DRAGONS;
    public static final  /* enum */ T BRINE_RATS;
    public static final  /* enum */ T OGRES;
    public static final  /* enum */ T GREEN_DRAGONS;
    public static final  /* enum */ T HILL_GIANTS;
    public static final  /* enum */ T CHAOS_ELEMENTAL;
    public static final  /* enum */ T WEREWOLVES;
    public static final  /* enum */ T SHADES;
    public static final  /* enum */ T BIRDS;
    public static final  /* enum */ T SHADOW_WARRIORS;
    public static final  /* enum */ T UNDEAD_DRUIDS;
    public static final  /* enum */ T KALPHITE;
    public static final  /* enum */ T ABERRANT_SPECTRES;
    public static final  /* enum */ T SEA_SNAKES;
    public static final  /* enum */ T TERROR_DOGS;
    public static final  /* enum */ T NECHRYAEL;
    public static final  /* enum */ T ROGUES;

    private GameEnum23(String string2, int n3, IntPredicate intPredicate) {
        boolean bl2;
        if (n3 >= 0) {
            bl2 = 0;
            0;
            if (3 > 3) {
                throw null;
            }
        } else {
            bl2 = 1;
        }
        Preconditions.checkArgument((boolean)bl2);
        this.name = string2;
        this.itemSpriteId = n3;
        this.weaknessThreshold = 2;
        this.weaknessItem = 2;
        this.targetNames = new String[1];
        this.xpMatcher = intPredicate;
    }

    private GameEnum23(String string2, int n3, String ... stringArray) {
        boolean bl2;
        if (n3 >= 0) {
            bl2 = 0;
            0;
            if (-3 >= 0) {
                throw null;
            }
        } else {
            bl2 = 1;
        }
        Preconditions.checkArgument((boolean)bl2);
        this.name = string2;
        this.itemSpriteId = n3;
        this.weaknessThreshold = 2;
        this.weaknessItem = 2;
        this.targetNames = stringArray;
        this.xpMatcher = null;
    }

    public int aO() {
        return this.itemSpriteId;
    }

    static {
        T.var1();
        T.var2();
        String[] stringArray = new String[0];
        stringArray[1] = llIlIIIlI[7];
        ABERRANT_SPECTRES = new GameEnum23(llIlIIIlI[0], 6, stringArray);
        ABYSSAL_DEMONS = new GameEnum23(llIlIIIlI[9], lllIlIIll[10], n2 -> {
            boolean bl2;
            if (n2 != 5) {
                bl2 = 0;
                0;
                
            } else {
                bl2 = 1;
            }
            return bl2;
        });
        ABYSSAL_SIRE = new GameEnum23(llIlIIIlI[lllIlIIll[12]], lllIlIIll[13], n2 -> {
            boolean bl2;
            if (n2 != 5) {
                bl2 = 0;
                0;
                if null != null {
                    return ((0x71 ^ 0x24) & ~(0x72 ^ 0x27)) != 0;
                }
            } else {
                bl2 = 1;
            }
            return bl2;
        });
        ADAMANT_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[15]], lllIlIIll[16], new String[1]);
        ALCHEMICAL_HYDRA = new GameEnum23(llIlIIIlI[lllIlIIll[18]], lllIlIIll[19], new String[1]);
        ANKOU = new GameEnum23(llIlIIIlI[lllIlIIll[21]], lllIlIIll[22], new String[1]);
        AVIANSIES = new GameEnum23(llIlIIIlI[lllIlIIll[24]], lllIlIIll[25], new String[1]);
        String[] stringArray2 = new String[9];
        stringArray2[1] = llIlIIIlI[lllIlIIll[29]];
        stringArray2[0] = llIlIIIlI[lllIlIIll[30]];
        stringArray2[7] = llIlIIIlI[lllIlIIll[31]];
        stringArray2[8] = llIlIIIlI[lllIlIIll[32]];
        BANDITS = new GameEnum23(llIlIIIlI[lllIlIIll[27]], lllIlIIll[28], stringArray2);
        BANSHEES = new GameEnum23(llIlIIIlI[lllIlIIll[34]], lllIlIIll[35], new String[1]);
        BARROWS_BROTHERS = new GameEnum23(llIlIIIlI[lllIlIIll[37]], lllIlIIll[38], new String[1]);
        BASILISKS = new GameEnum23(llIlIIIlI[lllIlIIll[40]], lllIlIIll[41], new String[1]);
        String[] stringArray3 = new String[0];
        stringArray3[1] = llIlIIIlI[lllIlIIll[45]];
        BATS = new GameEnum23(llIlIIIlI[lllIlIIll[43]], lllIlIIll[44], stringArray3);
        BEARS = new GameEnum23(llIlIIIlI[lllIlIIll[47]], lllIlIIll[48], new String[1]);
        String[] stringArray4 = new String[lllIlIIll[14]];
        stringArray4[1] = llIlIIIlI[lllIlIIll[52]];
        stringArray4[0] = llIlIIIlI[lllIlIIll[53]];
        stringArray4[7] = llIlIIIlI[lllIlIIll[54]];
        stringArray4[8] = llIlIIIlI[lllIlIIll[55]];
        stringArray4[9] = llIlIIIlI[lllIlIIll[56]];
        stringArray4[T.lllIlIIll[11]] = llIlIIIlI[lllIlIIll[57]];
        stringArray4[T.lllIlIIll[12]] = llIlIIIlI[lllIlIIll[58]];
        BIRDS = new GameEnum23(llIlIIIlI[lllIlIIll[50]], lllIlIIll[51], stringArray4);
        BLACK_DEMONS = new GameEnum23(llIlIIIlI[lllIlIIll[60]], lllIlIIll[61], new String[1]);
        String[] stringArray5 = new String[0];
        stringArray5[1] = llIlIIIlI[lllIlIIll[65]];
        BLACK_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[63]], lllIlIIll[64], stringArray5);
        String[] stringArray6 = new String[0];
        stringArray6[1] = llIlIIIlI[lllIlIIll[69]];
        BLACK_KNIGHTS = new GameEnum23(llIlIIIlI[lllIlIIll[67]], lllIlIIll[68], stringArray6);
        BLOODVELD = new GameEnum23(llIlIIIlI[5], lllIlIIll[71], new String[1]);
        String[] stringArray7 = new String[0];
        stringArray7[1] = llIlIIIlI[lllIlIIll[75]];
        BLUE_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[73]], lllIlIIll[74], stringArray7);
        BRINE_RATS = new GameEnum23(llIlIIIlI[lllIlIIll[77]], lllIlIIll[78], new String[1]);
        BRONZE_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[80]], lllIlIIll[81], new String[1]);
        CALLISTO = new GameEnum23(llIlIIIlI[lllIlIIll[83]], lllIlIIll[84], new String[1]);
        CATABLEPON = new GameEnum23(llIlIIIlI[lllIlIIll[86]], lllIlIIll[87], new String[1]);
        CAVE_BUGS = new GameEnum23(llIlIIIlI[lllIlIIll[89]], lllIlIIll[90], new String[1]);
        String[] stringArray8 = new String[0];
        stringArray8[1] = llIlIIIlI[lllIlIIll[94]];
        CAVE_CRAWLERS = new GameEnum23(llIlIIIlI[lllIlIIll[92]], lllIlIIll[93], stringArray8);
        String[] stringArray9 = new String[0];
        stringArray9[1] = llIlIIIlI[lllIlIIll[98]];
        CAVE_HORRORS = new GameEnum23(llIlIIIlI[lllIlIIll[96]], lllIlIIll[97], stringArray9);
        CAVE_KRAKEN = new GameEnum23(llIlIIIlI[lllIlIIll[100]], lllIlIIll[101], new String[1]);
        CAVE_SLIMES = new GameEnum23(llIlIIIlI[lllIlIIll[103]], lllIlIIll[104], new String[1]);
        CERBERUS = new GameEnum23(llIlIIIlI[lllIlIIll[106]], lllIlIIll[107], new String[1]);
        String[] stringArray10 = new String[7];
        stringArray10[1] = llIlIIIlI[lllIlIIll[111]];
        stringArray10[0] = llIlIIIlI[lllIlIIll[112]];
        CHAOS_DRUIDS = new GameEnum23(llIlIIIlI[lllIlIIll[109]], lllIlIIll[110], stringArray10);
        CHAOS_ELEMENTAL = new GameEnum23(llIlIIIlI[lllIlIIll[114]], lllIlIIll[115], new String[1]);
        CHAOS_FANATIC = new GameEnum23(llIlIIIlI[lllIlIIll[117]], lllIlIIll[118], new String[1]);
        String[] stringArray11 = new String[0];
        stringArray11[1] = llIlIIIlI[lllIlIIll[122]];
        COCKATRICE = new GameEnum23(llIlIIIlI[lllIlIIll[120]], lllIlIIll[121], stringArray11);
        COWS = new GameEnum23(llIlIIIlI[lllIlIIll[124]], lllIlIIll[125], new String[1]);
        String[] stringArray12 = new String[0];
        stringArray12[1] = llIlIIIlI[lllIlIIll[129]];
        CRAWLING_HANDS = new GameEnum23(llIlIIIlI[lllIlIIll[127]], lllIlIIll[128], stringArray12);
        String[] stringArray13 = new String[0];
        stringArray13[1] = llIlIIIlI[lllIlIIll[133]];
        CRAZY_ARCHAEOLOGIST = new GameEnum23(llIlIIIlI[lllIlIIll[131]], lllIlIIll[132], stringArray13);
        CROCODILES = new GameEnum23(llIlIIIlI[lllIlIIll[135]], lllIlIIll[136], new String[1]);
        DAGANNOTH = new GameEnum23(llIlIIIlI[lllIlIIll[138]], lllIlIIll[139], new String[1]);
        DAGANNOTH_KINGS = new GameEnum23(llIlIIIlI[lllIlIIll[141]], lllIlIIll[142], new String[1]);
        String[] stringArray14 = new String[0];
        stringArray14[1] = llIlIIIlI[lllIlIIll[146]];
        DARK_BEASTS = new GameEnum23(llIlIIIlI[lllIlIIll[144]], lllIlIIll[145], stringArray14);
        String[] stringArray15 = new String[0];
        stringArray15[1] = llIlIIIlI[lllIlIIll[150]];
        DARK_WARRIORS = new GameEnum23(llIlIIIlI[lllIlIIll[148]], lllIlIIll[149], stringArray15);
        DERANGED_ARCHAEOLOGIST = new GameEnum23(llIlIIIlI[lllIlIIll[152]], lllIlIIll[153], new String[1]);
        String[] stringArray16 = new String[0];
        stringArray16[1] = llIlIIIlI[lllIlIIll[157]];
        DOGS = new GameEnum23(llIlIIIlI[lllIlIIll[155]], lllIlIIll[156], stringArray16);
        DRAKES = new GameEnum23(llIlIIIlI[lllIlIIll[159]], lllIlIIll[160], new String[1]);
        String[] stringArray17 = new String[0];
        stringArray17[1] = llIlIIIlI[lllIlIIll[164]];
        DUST_DEVILS = new GameEnum23(llIlIIIlI[lllIlIIll[162]], lllIlIIll[163], stringArray17);
        String[] stringArray18 = new String[7];
        stringArray18[1] = llIlIIIlI[lllIlIIll[168]];
        stringArray18[0] = llIlIIIlI[lllIlIIll[169]];
        DWARVES = new GameEnum23(llIlIIIlI[lllIlIIll[166]], lllIlIIll[167], stringArray18);
        EARTH_WARRIORS = new GameEnum23(llIlIIIlI[lllIlIIll[171]], lllIlIIll[172], new String[1]);
        String[] stringArray19 = new String[8];
        stringArray19[1] = llIlIIIlI[lllIlIIll[176]];
        stringArray19[0] = llIlIIIlI[lllIlIIll[177]];
        stringArray19[7] = llIlIIIlI[lllIlIIll[178]];
        ELVES = new GameEnum23(llIlIIIlI[lllIlIIll[174]], lllIlIIll[175], stringArray19);
        String[] stringArray20 = new String[0];
        stringArray20[1] = llIlIIIlI[lllIlIIll[182]];
        ENTS = new GameEnum23(llIlIIIlI[lllIlIIll[180]], lllIlIIll[181], stringArray20);
        FEVER_SPIDERS = new GameEnum23(llIlIIIlI[lllIlIIll[184]], lllIlIIll[185], new String[1]);
        FIRE_GIANTS = new GameEnum23(llIlIIIlI[lllIlIIll[187]], lllIlIIll[188], new String[1]);
        String[] stringArray21 = new String[0];
        stringArray21[1] = llIlIIIlI[lllIlIIll[192]];
        FLESH_CRAWLERS = new GameEnum23(llIlIIIlI[lllIlIIll[190]], lllIlIIll[191], stringArray21);
        String[] stringArray22 = new String[9];
        stringArray22[1] = llIlIIIlI[lllIlIIll[196]];
        stringArray22[0] = llIlIIIlI[lllIlIIll[197]];
        stringArray22[7] = llIlIIIlI[lllIlIIll[198]];
        stringArray22[8] = llIlIIIlI[lllIlIIll[199]];
        FOSSIL_ISLAND_WYVERNS = new GameEnum23(llIlIIIlI[lllIlIIll[194]], lllIlIIll[195], stringArray22);
        GARGOYLES = new GameEnum23(llIlIIIlI[lllIlIIll[201]], lllIlIIll[202], lllIlIIll[17], lllIlIIll[203], new String[1]);
        GENERAL_GRAARDOR = new GameEnum23(llIlIIIlI[lllIlIIll[205]], lllIlIIll[206], new String[1]);
        String[] stringArray23 = new String[7];
        stringArray23[1] = llIlIIIlI[lllIlIIll[210]];
        stringArray23[0] = llIlIIIlI[lllIlIIll[211]];
        GHOSTS = new GameEnum23(llIlIIIlI[lllIlIIll[208]], lllIlIIll[209], stringArray23);
        GHOULS = new GameEnum23(llIlIIIlI[lllIlIIll[213]], lllIlIIll[214], new String[1]);
        GIANT_MOLE = new GameEnum23(llIlIIIlI[lllIlIIll[216]], lllIlIIll[217], new String[1]);
        GOBLINS = new GameEnum23(llIlIIIlI[lllIlIIll[219]], lllIlIIll[220], new String[1]);
        GREATER_DEMONS = new GameEnum23(llIlIIIlI[lllIlIIll[222]], lllIlIIll[223], new String[1]);
        String[] stringArray24 = new String[7];
        stringArray24[1] = llIlIIIlI[lllIlIIll[227]];
        stringArray24[0] = llIlIIIlI[lllIlIIll[228]];
        GREEN_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[225]], lllIlIIll[226], stringArray24);
        String[] stringArray25 = new String[7];
        stringArray25[1] = llIlIIIlI[lllIlIIll[232]];
        stringArray25[0] = llIlIIIlI[lllIlIIll[233]];
        GROTESQUE_GUARDIANS = new GameEnum23(llIlIIIlI[lllIlIIll[230]], lllIlIIll[231], 1, lllIlIIll[203], stringArray25);
        HARPIE_BUG_SWARMS = new GameEnum23(llIlIIIlI[lllIlIIll[235]], lllIlIIll[236], new String[1]);
        HELLHOUNDS = new GameEnum23(llIlIIIlI[lllIlIIll[238]], lllIlIIll[239], new String[1]);
        String[] stringArray26 = new String[0];
        stringArray26[1] = llIlIIIlI[lllIlIIll[243]];
        HILL_GIANTS = new GameEnum23(llIlIIIlI[lllIlIIll[241]], lllIlIIll[242], stringArray26);
        HOBGOBLINS = new GameEnum23(llIlIIIlI[lllIlIIll[245]], lllIlIIll[246], new String[1]);
        HYDRAS = new GameEnum23(llIlIIIlI[lllIlIIll[248]], lllIlIIll[249], new String[1]);
        ICEFIENDS = new GameEnum23(llIlIIIlI[lllIlIIll[251]], lllIlIIll[252], new String[1]);
        ICE_GIANTS = new GameEnum23(llIlIIIlI[lllIlIIll[254]], lllIlIIll[252], new String[1]);
        String[] stringArray27 = new String[0];
        stringArray27[1] = llIlIIIlI[lllIlIIll[258]];
        ICE_WARRIORS = new GameEnum23(llIlIIIlI[lllIlIIll[256]], lllIlIIll[257], stringArray27);
        String[] stringArray28 = new String[0];
        stringArray28[1] = llIlIIIlI[lllIlIIll[262]];
        INFERNAL_MAGES = new GameEnum23(llIlIIIlI[lllIlIIll[260]], lllIlIIll[261], stringArray28);
        IRON_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[264]], lllIlIIll[265], new String[1]);
        JAD = new GameEnum23(llIlIIIlI[lllIlIIll[267]], lllIlIIll[268], n2 -> {
            boolean bl2;
            if (n2 == 4) {
                bl2 = 0;
                0;
                if (-2 > 0) {
                    return ((0xE9 ^ 0xAF) & ~(0x55 ^ 0x13)) != 0;
                }
            } else {
                bl2 = 1;
            }
            return bl2;
        });
        String[] stringArray29 = new String[0];
        stringArray29[1] = llIlIIIlI[lllIlIIll[272]];
        JELLIES = new GameEnum23(llIlIIIlI[lllIlIIll[270]], lllIlIIll[271], stringArray29);
        JUNGLE_HORROR = new GameEnum23(llIlIIIlI[lllIlIIll[274]], lllIlIIll[275], new String[1]);
        KALPHITE = new GameEnum23(llIlIIIlI[lllIlIIll[277]], lllIlIIll[278], new String[1]);
        KALPHITE_QUEEN = new GameEnum23(llIlIIIlI[lllIlIIll[280]], lllIlIIll[281], new String[1]);
        KILLERWATTS = new GameEnum23(llIlIIIlI[lllIlIIll[283]], lllIlIIll[284], new String[1]);
        KING_BLACK_DRAGON = new GameEnum23(llIlIIIlI[lllIlIIll[286]], lllIlIIll[287], new String[1]);
        String[] stringArray30 = new String[0];
        stringArray30[1] = llIlIIIlI[lllIlIIll[291]];
        KRAKEN = new GameEnum23(llIlIIIlI[lllIlIIll[289]], lllIlIIll[290], stringArray30);
        KREEARRA = new GameEnum23(llIlIIIlI[lllIlIIll[293]], lllIlIIll[294], new String[1]);
        KRIL_TSUTSAROTH = new GameEnum23(llIlIIIlI[lllIlIIll[296]], lllIlIIll[297], new String[1]);
        KURASK = new GameEnum23(llIlIIIlI[lllIlIIll[299]], lllIlIIll[300], new String[1]);
        String[] stringArray31 = new String[0];
        stringArray31[1] = llIlIIIlI[lllIlIIll[304]];
        LAVA_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[302]], lllIlIIll[303], stringArray31);
        LESSER_DEMONS = new GameEnum23(llIlIIIlI[lllIlIIll[306]], lllIlIIll[307], new String[1]);
        String[] stringArray32 = new String[0];
        stringArray32[1] = llIlIIIlI[lllIlIIll[311]];
        LIZARDMEN = new GameEnum23(llIlIIIlI[lllIlIIll[309]], lllIlIIll[310], stringArray32);
        String[] stringArray33 = new String[9];
        stringArray33[1] = llIlIIIlI[lllIlIIll[315]];
        stringArray33[0] = llIlIIIlI[lllIlIIll[316]];
        stringArray33[7] = llIlIIIlI[lllIlIIll[317]];
        stringArray33[8] = llIlIIIlI[lllIlIIll[318]];
        LIZARDS = new GameEnum23(llIlIIIlI[lllIlIIll[313]], lllIlIIll[314], stringArray33);
        String[] stringArray34 = new String[0];
        stringArray34[1] = llIlIIIlI[lllIlIIll[322]];
        MAGIC_AXES = new GameEnum23(llIlIIIlI[lllIlIIll[320]], lllIlIIll[321], stringArray34);
        String[] stringArray35 = new String[0];
        stringArray35[1] = llIlIIIlI[lllIlIIll[326]];
        MAMMOTHS = new GameEnum23(llIlIIIlI[lllIlIIll[324]], lllIlIIll[325], stringArray35);
        String[] stringArray36 = new String[8];
        stringArray36[1] = llIlIIIlI[lllIlIIll[330]];
        stringArray36[0] = llIlIIIlI[lllIlIIll[331]];
        stringArray36[7] = llIlIIIlI[lllIlIIll[332]];
        MINIONS_OF_SCABARAS = new GameEnum23(llIlIIIlI[lllIlIIll[328]], lllIlIIll[329], stringArray36);
        MINOTAURS = new GameEnum23(llIlIIIlI[lllIlIIll[334]], lllIlIIll[335], new String[1]);
        MITHRIL_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[337]], lllIlIIll[338], new String[1]);
        MOGRES = new GameEnum23(llIlIIIlI[lllIlIIll[340]], lllIlIIll[341], new String[1]);
        MOLANISKS = new GameEnum23(llIlIIIlI[lllIlIIll[343]], lllIlIIll[344], new String[1]);
        String[] stringArray37 = new String[0];
        stringArray37[1] = llIlIIIlI[lllIlIIll[348]];
        MONKEYS = new GameEnum23(llIlIIIlI[lllIlIIll[346]], lllIlIIll[347], stringArray37);
        MOSS_GIANTS = new GameEnum23(llIlIIIlI[lllIlIIll[350]], lllIlIIll[351], new String[1]);
        String[] stringArray38 = new String[7];
        stringArray38[1] = llIlIIIlI[lllIlIIll[356]];
        stringArray38[0] = llIlIIIlI[lllIlIIll[357]];
        MUTATED_ZYGOMITES = new GameEnum23(llIlIIIlI[lllIlIIll[353]], lllIlIIll[354], lllIlIIll[14], lllIlIIll[355], stringArray38);
        String[] stringArray39 = new String[0];
        stringArray39[1] = llIlIIIlI[lllIlIIll[361]];
        NECHRYAEL = new GameEnum23(llIlIIIlI[lllIlIIll[359]], lllIlIIll[360], stringArray39);
        OGRES = new GameEnum23(llIlIIIlI[lllIlIIll[363]], lllIlIIll[364], new String[1]);
        OTHERWORLDLY_BEING = new GameEnum23(llIlIIIlI[lllIlIIll[366]], lllIlIIll[367], new String[1]);
        String[] stringArray40 = new String[0];
        stringArray40[1] = llIlIIIlI[lllIlIIll[371]];
        PIRATES = new GameEnum23(llIlIIIlI[lllIlIIll[369]], lllIlIIll[370], stringArray40);
        String[] stringArray41 = new String[0];
        stringArray41[1] = llIlIIIlI[lllIlIIll[375]];
        PYREFIENDS = new GameEnum23(llIlIIIlI[lllIlIIll[373]], lllIlIIll[374], stringArray41);
        RATS = new GameEnum23(llIlIIIlI[lllIlIIll[377]], lllIlIIll[378], new String[1]);
        String[] stringArray42 = new String[0];
        stringArray42[1] = llIlIIIlI[lllIlIIll[382]];
        RED_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[380]], lllIlIIll[381], stringArray42);
        String[] stringArray43 = new String[lllIlIIll[20]];
        stringArray43[1] = llIlIIIlI[lllIlIIll[386]];
        stringArray43[0] = llIlIIIlI[lllIlIIll[387]];
        stringArray43[7] = llIlIIIlI[lllIlIIll[388]];
        stringArray43[8] = llIlIIIlI[lllIlIIll[389]];
        stringArray43[9] = llIlIIIlI[lllIlIIll[390]];
        stringArray43[T.lllIlIIll[11]] = llIlIIIlI[lllIlIIll[391]];
        stringArray43[T.lllIlIIll[12]] = llIlIIIlI[lllIlIIll[392]];
        stringArray43[T.lllIlIIll[14]] = llIlIIIlI[lllIlIIll[393]];
        stringArray43[T.lllIlIIll[15]] = llIlIIIlI[lllIlIIll[394]];
        stringArray43[T.lllIlIIll[17]] = llIlIIIlI[lllIlIIll[395]];
        stringArray43[T.lllIlIIll[18]] = llIlIIIlI[lllIlIIll[396]];
        REVENANTS = new GameEnum23(llIlIIIlI[lllIlIIll[384]], lllIlIIll[385], stringArray43);
        ROCKSLUGS = new GameEnum23(llIlIIIlI[lllIlIIll[398]], lllIlIIll[399], 9, lllIlIIll[400], new String[1]);
        String[] stringArray44 = new String[0];
        stringArray44[1] = llIlIIIlI[lllIlIIll[404]];
        ROGUES = new GameEnum23(llIlIIIlI[lllIlIIll[402]], lllIlIIll[403], stringArray44);
        RUNE_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[406]], lllIlIIll[407], new String[1]);
        SARACHNIS = new GameEnum23(llIlIIIlI[lllIlIIll[409]], lllIlIIll[410], new String[1]);
        SCORPIA = new GameEnum23(llIlIIIlI[lllIlIIll[412]], lllIlIIll[413], new String[1]);
        SCORPIONS = new GameEnum23(llIlIIIlI[lllIlIIll[378]], lllIlIIll[191], new String[1]);
        SEA_SNAKES = new GameEnum23(llIlIIIlI[lllIlIIll[416]], lllIlIIll[417], new String[1]);
        String[] stringArray45 = new String[lllIlIIll[18]];
        stringArray45[1] = llIlIIIlI[lllIlIIll[421]];
        stringArray45[0] = llIlIIIlI[lllIlIIll[422]];
        stringArray45[7] = llIlIIIlI[lllIlIIll[423]];
        stringArray45[8] = llIlIIIlI[lllIlIIll[424]];
        stringArray45[9] = llIlIIIlI[lllIlIIll[425]];
        stringArray45[T.lllIlIIll[11]] = llIlIIIlI[lllIlIIll[426]];
        stringArray45[T.lllIlIIll[12]] = llIlIIIlI[lllIlIIll[427]];
        stringArray45[T.lllIlIIll[14]] = llIlIIIlI[lllIlIIll[428]];
        stringArray45[T.lllIlIIll[15]] = llIlIIIlI[lllIlIIll[429]];
        stringArray45[T.lllIlIIll[17]] = llIlIIIlI[lllIlIIll[51]];
        SHADES = new GameEnum23(llIlIIIlI[lllIlIIll[419]], lllIlIIll[420], stringArray45);
        SHADOW_WARRIORS = new GameEnum23(llIlIIIlI[lllIlIIll[431]], lllIlIIll[68], new String[1]);
        SKELETAL_WYVERNS = new GameEnum23(llIlIIIlI[lllIlIIll[433]], lllIlIIll[434], new String[1]);
        SKELETONS = new GameEnum23(llIlIIIlI[lllIlIIll[436]], lllIlIIll[437], new String[1]);
        SMOKE_DEVILS = new GameEnum23(llIlIIIlI[lllIlIIll[439]], lllIlIIll[440], new String[1]);
        SOURHOGS = new GameEnum23(llIlIIIlI[lllIlIIll[442]], lllIlIIll[443], new String[1]);
        SPIDERS = new GameEnum23(llIlIIIlI[lllIlIIll[445]], lllIlIIll[446], new String[1]);
        String[] stringArray46 = new String[8];
        stringArray46[1] = llIlIIIlI[lllIlIIll[450]];
        stringArray46[0] = llIlIIIlI[lllIlIIll[451]];
        stringArray46[7] = llIlIIIlI[lllIlIIll[452]];
        SPIRITUAL_CREATURES = new GameEnum23(llIlIIIlI[lllIlIIll[448]], lllIlIIll[449], stringArray46);
        STEEL_DRAGONS = new GameEnum23(llIlIIIlI[lllIlIIll[454]], lllIlIIll[455], new String[1]);
        SULPHUR_LIZARDS = new GameEnum23(llIlIIIlI[lllIlIIll[457]], lllIlIIll[458], new String[1]);
        SUQAHS = new GameEnum23(llIlIIIlI[lllIlIIll[460]], lllIlIIll[461], new String[1]);
        TEMPLE_SPIDERS = new GameEnum23(llIlIIIlI[lllIlIIll[463]], lllIlIIll[312], new String[1]);
        TERROR_DOGS = new GameEnum23(llIlIIIlI[lllIlIIll[465]], lllIlIIll[466], new String[1]);
        THERMONUCLEAR_SMOKE_DEVIL = new GameEnum23(llIlIIIlI[lllIlIIll[468]], lllIlIIll[469], new String[1]);
        String[] stringArray47 = new String[7];
        stringArray47[1] = llIlIIIlI[lllIlIIll[473]];
        stringArray47[0] = llIlIIIlI[lllIlIIll[474]];
        TROLLS = new GameEnum23(llIlIIIlI[lllIlIIll[471]], lllIlIIll[472], stringArray47);
        TUROTH = new GameEnum23(llIlIIIlI[lllIlIIll[476]], lllIlIIll[477], new String[1]);
        TZHAAR = new GameEnum23(llIlIIIlI[lllIlIIll[479]], lllIlIIll[480], new String[1]);
        UNDEAD_DRUIDS = new GameEnum23(llIlIIIlI[lllIlIIll[482]], lllIlIIll[483], new String[1]);
        String[] stringArray48 = new String[7];
        stringArray48[1] = llIlIIIlI[lllIlIIll[487]];
        stringArray48[0] = llIlIIIlI[lllIlIIll[488]];
        VAMPYRES = new GameEnum23(llIlIIIlI[lllIlIIll[485]], lllIlIIll[486], stringArray48);
        VENENATIS = new GameEnum23(llIlIIIlI[lllIlIIll[490]], lllIlIIll[491], new String[1]);
        VETION = new GameEnum23(llIlIIIlI[lllIlIIll[493]], lllIlIIll[494], new String[1]);
        VORKATH = new GameEnum23(llIlIIIlI[lllIlIIll[496]], lllIlIIll[497], new String[1]);
        WALL_BEASTS = new GameEnum23(llIlIIIlI[lllIlIIll[499]], lllIlIIll[500], new String[1]);
        WATERFIENDS = new GameEnum23(llIlIIIlI[lllIlIIll[502]], lllIlIIll[503], new String[1]);
        String[] stringArray49 = new String[0];
        stringArray49[1] = llIlIIIlI[lllIlIIll[507]];
        WEREWOLVES = new GameEnum23(llIlIIIlI[lllIlIIll[505]], lllIlIIll[506], stringArray49);
        String[] stringArray50 = new String[0];
        stringArray50[1] = llIlIIIlI[lllIlIIll[511]];
        WOLVES = new GameEnum23(llIlIIIlI[lllIlIIll[509]], lllIlIIll[510], stringArray50);
        WYRMS = new GameEnum23(llIlIIIlI[lllIlIIll[513]], lllIlIIll[514], new String[1]);
        ZILYANA = new GameEnum23(llIlIIIlI[lllIlIIll[516]], lllIlIIll[517], new String[1]);
        String[] stringArray51 = new String[0];
        stringArray51[1] = llIlIIIlI[lllIlIIll[520]];
        ZOMBIES = new GameEnum23(llIlIIIlI[lllIlIIll[519]], lllIlIIll[214], stringArray51);
        ZUK = new GameEnum23(llIlIIIlI[lllIlIIll[522]], lllIlIIll[523], n2 -> {
            boolean bl2;
            if (n2 == 3) {
                bl2 = 0;
                0;
                if (-3 >= 0) {
                    return ((0xCC ^ 0x8A ^ (0x96 ^ 0xB0)) & (5 ^ 9 ^ (0xE6 ^ 0x8A) ^ -1)) != 0;
                }
            } else {
                bl2 = 1;
            }
            return bl2;
        });
        ZULRAH = new GameEnum23(llIlIIIlI[lllIlIIll[525]], lllIlIIll[526], new String[1]);
        T[] tArray = new T[lllIlIIll[199]];
        tArray[1] = ABERRANT_SPECTRES;
        tArray[0] = ABYSSAL_DEMONS;
        tArray[7] = ABYSSAL_SIRE;
        tArray[8] = ADAMANT_DRAGONS;
        tArray[9] = ALCHEMICAL_HYDRA;
        tArray[T.lllIlIIll[11]] = ANKOU;
        tArray[T.lllIlIIll[12]] = AVIANSIES;
        tArray[T.lllIlIIll[14]] = BANDITS;
        tArray[T.lllIlIIll[15]] = BANSHEES;
        tArray[T.lllIlIIll[17]] = BARROWS_BROTHERS;
        tArray[T.lllIlIIll[18]] = BASILISKS;
        tArray[T.lllIlIIll[20]] = BATS;
        tArray[T.lllIlIIll[21]] = BEARS;
        tArray[T.lllIlIIll[23]] = BIRDS;
        tArray[T.lllIlIIll[24]] = BLACK_DEMONS;
        tArray[T.lllIlIIll[26]] = BLACK_DRAGONS;
        tArray[T.lllIlIIll[27]] = BLACK_KNIGHTS;
        tArray[T.lllIlIIll[29]] = BLOODVELD;
        tArray[T.lllIlIIll[30]] = BLUE_DRAGONS;
        tArray[T.lllIlIIll[31]] = BRINE_RATS;
        tArray[T.lllIlIIll[32]] = BRONZE_DRAGONS;
        tArray[T.lllIlIIll[33]] = CALLISTO;
        tArray[T.lllIlIIll[34]] = CATABLEPON;
        tArray[T.lllIlIIll[36]] = CAVE_BUGS;
        tArray[T.lllIlIIll[37]] = CAVE_CRAWLERS;
        tArray[T.lllIlIIll[39]] = CAVE_HORRORS;
        tArray[T.lllIlIIll[40]] = CAVE_KRAKEN;
        tArray[T.lllIlIIll[42]] = CAVE_SLIMES;
        tArray[T.lllIlIIll[43]] = CERBERUS;
        tArray[T.lllIlIIll[45]] = CHAOS_DRUIDS;
        tArray[T.lllIlIIll[46]] = CHAOS_ELEMENTAL;
        tArray[T.lllIlIIll[47]] = CHAOS_FANATIC;
        tArray[T.lllIlIIll[49]] = COCKATRICE;
        tArray[T.lllIlIIll[50]] = COWS;
        tArray[T.lllIlIIll[52]] = CRAWLING_HANDS;
        tArray[T.lllIlIIll[53]] = CRAZY_ARCHAEOLOGIST;
        tArray[T.lllIlIIll[54]] = CROCODILES;
        tArray[T.lllIlIIll[55]] = DAGANNOTH;
        tArray[T.lllIlIIll[56]] = DAGANNOTH_KINGS;
        tArray[T.lllIlIIll[57]] = DARK_BEASTS;
        tArray[T.lllIlIIll[58]] = DARK_WARRIORS;
        tArray[T.lllIlIIll[59]] = DERANGED_ARCHAEOLOGIST;
        tArray[T.lllIlIIll[60]] = DOGS;
        tArray[T.lllIlIIll[62]] = DRAKES;
        tArray[T.lllIlIIll[63]] = DUST_DEVILS;
        tArray[T.lllIlIIll[65]] = DWARVES;
        tArray[T.lllIlIIll[66]] = EARTH_WARRIORS;
        tArray[T.lllIlIIll[67]] = ELVES;
        tArray[T.lllIlIIll[69]] = ENTS;
        tArray[T.lllIlIIll[70]] = FEVER_SPIDERS;
        tArray[5] = FIRE_GIANTS;
        tArray[T.lllIlIIll[72]] = FLESH_CRAWLERS;
        tArray[T.lllIlIIll[73]] = FOSSIL_ISLAND_WYVERNS;
        tArray[T.lllIlIIll[75]] = GARGOYLES;
        tArray[T.lllIlIIll[76]] = GENERAL_GRAARDOR;
        tArray[T.lllIlIIll[77]] = GHOSTS;
        tArray[T.lllIlIIll[79]] = GHOULS;
        tArray[T.lllIlIIll[80]] = GIANT_MOLE;
        tArray[T.lllIlIIll[82]] = GOBLINS;
        tArray[T.lllIlIIll[83]] = GREATER_DEMONS;
        tArray[T.lllIlIIll[85]] = GREEN_DRAGONS;
        tArray[T.lllIlIIll[86]] = GROTESQUE_GUARDIANS;
        tArray[T.lllIlIIll[88]] = HARPIE_BUG_SWARMS;
        tArray[T.lllIlIIll[89]] = HELLHOUNDS;
        tArray[T.lllIlIIll[91]] = HILL_GIANTS;
        tArray[T.lllIlIIll[92]] = HOBGOBLINS;
        tArray[T.lllIlIIll[94]] = HYDRAS;
        tArray[T.lllIlIIll[95]] = ICEFIENDS;
        tArray[T.lllIlIIll[96]] = ICE_GIANTS;
        tArray[T.lllIlIIll[98]] = ICE_WARRIORS;
        tArray[T.lllIlIIll[99]] = INFERNAL_MAGES;
        tArray[T.lllIlIIll[100]] = IRON_DRAGONS;
        tArray[T.lllIlIIll[102]] = JAD;
        tArray[T.lllIlIIll[103]] = JELLIES;
        tArray[T.lllIlIIll[105]] = JUNGLE_HORROR;
        tArray[T.lllIlIIll[106]] = KALPHITE;
        tArray[T.lllIlIIll[108]] = KALPHITE_QUEEN;
        tArray[T.lllIlIIll[109]] = KILLERWATTS;
        tArray[T.lllIlIIll[111]] = KING_BLACK_DRAGON;
        tArray[T.lllIlIIll[112]] = KRAKEN;
        tArray[T.lllIlIIll[113]] = KREEARRA;
        tArray[T.lllIlIIll[114]] = KRIL_TSUTSAROTH;
        tArray[T.lllIlIIll[116]] = KURASK;
        tArray[T.lllIlIIll[117]] = LAVA_DRAGONS;
        tArray[T.lllIlIIll[119]] = LESSER_DEMONS;
        tArray[T.lllIlIIll[120]] = LIZARDMEN;
        tArray[T.lllIlIIll[122]] = LIZARDS;
        tArray[T.lllIlIIll[123]] = MAGIC_AXES;
        tArray[T.lllIlIIll[124]] = MAMMOTHS;
        tArray[T.lllIlIIll[126]] = MINIONS_OF_SCABARAS;
        tArray[T.lllIlIIll[127]] = MINOTAURS;
        tArray[T.lllIlIIll[129]] = MITHRIL_DRAGONS;
        tArray[T.lllIlIIll[130]] = MOGRES;
        tArray[T.lllIlIIll[131]] = MOLANISKS;
        tArray[T.lllIlIIll[133]] = MONKEYS;
        tArray[T.lllIlIIll[134]] = MOSS_GIANTS;
        tArray[T.lllIlIIll[135]] = MUTATED_ZYGOMITES;
        tArray[T.lllIlIIll[137]] = NECHRYAEL;
        tArray[T.lllIlIIll[138]] = OGRES;
        tArray[T.lllIlIIll[140]] = OTHERWORLDLY_BEING;
        tArray[T.lllIlIIll[141]] = PIRATES;
        tArray[T.lllIlIIll[143]] = PYREFIENDS;
        tArray[T.lllIlIIll[144]] = RATS;
        tArray[T.lllIlIIll[146]] = RED_DRAGONS;
        tArray[T.lllIlIIll[147]] = REVENANTS;
        tArray[T.lllIlIIll[148]] = ROCKSLUGS;
        tArray[T.lllIlIIll[150]] = ROGUES;
        tArray[T.lllIlIIll[151]] = RUNE_DRAGONS;
        tArray[T.lllIlIIll[152]] = SARACHNIS;
        tArray[T.lllIlIIll[154]] = SCORPIA;
        tArray[T.lllIlIIll[155]] = SCORPIONS;
        tArray[T.lllIlIIll[157]] = SEA_SNAKES;
        tArray[T.lllIlIIll[158]] = SHADES;
        tArray[T.lllIlIIll[159]] = SHADOW_WARRIORS;
        tArray[T.lllIlIIll[161]] = SKELETAL_WYVERNS;
        tArray[T.lllIlIIll[162]] = SKELETONS;
        tArray[T.lllIlIIll[164]] = SMOKE_DEVILS;
        tArray[T.lllIlIIll[165]] = SOURHOGS;
        tArray[T.lllIlIIll[166]] = SPIDERS;
        tArray[T.lllIlIIll[168]] = SPIRITUAL_CREATURES;
        tArray[T.lllIlIIll[169]] = STEEL_DRAGONS;
        tArray[T.lllIlIIll[170]] = SULPHUR_LIZARDS;
        tArray[T.lllIlIIll[171]] = SUQAHS;
        tArray[T.lllIlIIll[173]] = TEMPLE_SPIDERS;
        tArray[T.lllIlIIll[174]] = TERROR_DOGS;
        tArray[T.lllIlIIll[176]] = THERMONUCLEAR_SMOKE_DEVIL;
        tArray[T.lllIlIIll[177]] = TROLLS;
        tArray[T.lllIlIIll[178]] = TUROTH;
        tArray[T.lllIlIIll[179]] = TZHAAR;
        tArray[T.lllIlIIll[180]] = UNDEAD_DRUIDS;
        tArray[T.lllIlIIll[182]] = VAMPYRES;
        tArray[T.lllIlIIll[183]] = VENENATIS;
        tArray[T.lllIlIIll[184]] = VETION;
        tArray[T.lllIlIIll[186]] = VORKATH;
        tArray[T.lllIlIIll[187]] = WALL_BEASTS;
        tArray[T.lllIlIIll[189]] = WATERFIENDS;
        tArray[T.lllIlIIll[190]] = WEREWOLVES;
        tArray[T.lllIlIIll[192]] = WOLVES;
        tArray[T.lllIlIIll[193]] = WYRMS;
        tArray[T.lllIlIIll[194]] = ZILYANA;
        tArray[T.lllIlIIll[196]] = ZOMBIES;
        tArray[T.lllIlIIll[197]] = ZUK;
        tArray[T.lllIlIIll[198]] = ZULRAH;
        $VALUES = tArray;
        Object[] objectArray = new String[lllIlIIll[52]];
        objectArray[1] = llIlIIIlI[lllIlIIll[539]];
        objectArray[0] = llIlIIIlI[lllIlIIll[540]];
        objectArray[7] = llIlIIIlI[lllIlIIll[541]];
        objectArray[8] = llIlIIIlI[lllIlIIll[542]];
        objectArray[9] = llIlIIIlI[lllIlIIll[543]];
        objectArray[T.lllIlIIll[11]] = llIlIIIlI[lllIlIIll[544]];
        objectArray[T.lllIlIIll[12]] = llIlIIIlI[lllIlIIll[545]];
        objectArray[T.lllIlIIll[14]] = llIlIIIlI[lllIlIIll[546]];
        objectArray[T.lllIlIIll[15]] = llIlIIIlI[lllIlIIll[547]];
        objectArray[T.lllIlIIll[17]] = llIlIIIlI[lllIlIIll[548]];
        objectArray[T.lllIlIIll[18]] = llIlIIIlI[lllIlIIll[549]];
        objectArray[T.lllIlIIll[20]] = llIlIIIlI[lllIlIIll[550]];
        objectArray[T.lllIlIIll[21]] = llIlIIIlI[lllIlIIll[551]];
        objectArray[T.lllIlIIll[23]] = llIlIIIlI[lllIlIIll[552]];
        objectArray[T.lllIlIIll[24]] = llIlIIIlI[lllIlIIll[553]];
        objectArray[T.lllIlIIll[26]] = llIlIIIlI[lllIlIIll[554]];
        objectArray[T.lllIlIIll[27]] = llIlIIIlI[lllIlIIll[555]];
        objectArray[T.lllIlIIll[29]] = llIlIIIlI[lllIlIIll[556]];
        objectArray[T.lllIlIIll[30]] = llIlIIIlI[lllIlIIll[557]];
        objectArray[T.lllIlIIll[31]] = llIlIIIlI[lllIlIIll[558]];
        objectArray[T.lllIlIIll[32]] = llIlIIIlI[lllIlIIll[559]];
        objectArray[T.lllIlIIll[33]] = llIlIIIlI[lllIlIIll[560]];
        objectArray[T.lllIlIIll[34]] = llIlIIIlI[lllIlIIll[561]];
        objectArray[T.lllIlIIll[36]] = llIlIIIlI[lllIlIIll[562]];
        objectArray[T.lllIlIIll[37]] = llIlIIIlI[lllIlIIll[563]];
        objectArray[T.lllIlIIll[39]] = llIlIIIlI[lllIlIIll[564]];
        objectArray[T.lllIlIIll[40]] = llIlIIIlI[lllIlIIll[565]];
        objectArray[T.lllIlIIll[42]] = llIlIIIlI[lllIlIIll[566]];
        objectArray[T.lllIlIIll[43]] = llIlIIIlI[lllIlIIll[567]];
        objectArray[T.lllIlIIll[45]] = llIlIIIlI[lllIlIIll[568]];
        objectArray[T.lllIlIIll[46]] = llIlIIIlI[lllIlIIll[569]];
        objectArray[T.lllIlIIll[47]] = llIlIIIlI[lllIlIIll[570]];
        objectArray[T.lllIlIIll[49]] = llIlIIIlI[lllIlIIll[571]];
        objectArray[T.lllIlIIll[50]] = llIlIIIlI[lllIlIIll[572]];
        LOCATIONS = ImmutableList.of((Object)llIlIIIlI[lllIlIIll[527]], (Object)llIlIIIlI[lllIlIIll[528]], (Object)llIlIIIlI[lllIlIIll[529]], (Object)llIlIIIlI[lllIlIIll[530]], (Object)llIlIIIlI[lllIlIIll[531]], (Object)llIlIIIlI[lllIlIIll[532]], (Object)llIlIIIlI[lllIlIIll[533]], (Object)llIlIIIlI[lllIlIIll[534]], (Object)llIlIIIlI[lllIlIIll[535]], (Object)llIlIIIlI[lllIlIIll[536]], (Object)llIlIIIlI[lllIlIIll[537]], (Object)llIlIIIlI[lllIlIIll[538]], (Object[])objectArray);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int aR() {
        return this.weaknessItem;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 < (0xD4 ^ 0xC5 ^ (0xE ^ 0x1B))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Nullable
    public IntPredicate aS() {
        return this.xpMatcher;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public static T[] values() {
        return (T[])$VALUES.clone();
    }

    public static T valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }

    public int aQ() {
        return this.weaknessThreshold;
    }

    public String ax() {
        return this.name;
    }

    public String[] aP() {
        return this.targetNames;
    }

    private GameEnum23(String string2, int n3, int n4, int n5, String ... stringArray) {
        boolean bl2;
        if (n3 >= 0) {
            bl2 = 0;
            0;
            if (((0x58 ^ 0x74) & ~(0x4C ^ 0x60)) != ((0x2E ^ 0x60) & ~(0xF9 ^ 0xB7))) {
                throw null;
            }
        } else {
            bl2 = 1;
        }
        Preconditions.checkArgument((boolean)bl2);
        this.name = string2;
        this.itemSpriteId = n3;
        this.weaknessThreshold = n4;
        this.weaknessItem = n5;
        this.targetNames = stringArray;
        this.xpMatcher = null;
    }
}

