/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum10;
import javax.annotation.Nullable;

public final class GameEnum4
extends Enum<au> {
    public static final  /* enum */ au CELASTRUS;
    public static final  /* enum */ au COMPOST;
    public static final  /* enum */ au MAHOGANY;
    public static final  /* enum */ au CADANTINE;
    public static final  /* enum */ au CACTUS;
    public static final  /* enum */ au PINEAPPLE;
    private final  String contractName;
    public static final  /* enum */ au AVANTOE;
    public static final  /* enum */ au SPIRIT_TREE;
    public static final  /* enum */ au YANILLIAN;
    public static final  /* enum */ au ORANGE;
    private final  int tickrate;
    public static final  /* enum */ au CADAVABERRIES;
    public static final  /* enum */ au WEEDS;
    public static final  /* enum */ au REDBERRIES;
    public static final  /* enum */ au CALQUAT;
    public static final  /* enum */ au BELLADONNA;
    public static final  /* enum */ au HESPORI;
    public static final  /* enum */ au PAPAYA;
    public static final  /* enum */ au OAK;
    public static final  /* enum */ au KRONOS;
    public static final  /* enum */ au ULTRACOMPOST;
    public static final  /* enum */ au MAGIC;
    public static final  /* enum */ au WHITEBERRIES;
    private final  int regrowTickrate;
    public static final  /* enum */ au WOAD;
    public static final  /* enum */ au WHITE_LILY;
    private static final  au[] $VALUES;
    public static final  /* enum */ au MUSHROOM;
    public static final  /* enum */ au BANANA;
    public static final  /* enum */ au CRYSTAL_TREE;
    public static final  /* enum */ au WILDBLOOD;
    public static final  /* enum */ au SNAPE_GRASS;
    public static final  /* enum */ au DRAGONFRUIT;
    public static final  /* enum */ au STRAWBERRY;
    public static final  /* enum */ au POTATO;
    public static final  /* enum */ au TORSTOL;
    public static final  /* enum */ au SWEETCORN;
    public static final  /* enum */ au TARROMIN;
    public static final  /* enum */ au CABBAGE;
    public static final  /* enum */ au SNAPDRAGON;
    public static final  /* enum */ au WILLOW;
    public static final  /* enum */ au GIANT_ROTTEN_TOMATO;
    public static final  /* enum */ au ANYHERB;
    public static final  /* enum */ au EMPTY_GIANT_COMPOST_BIN;
    private final  int itemID;
    public static final  /* enum */ au POTATO_CACTUS;
    public static final  /* enum */ au CURRY;
    public static final  /* enum */ au LANTADYME;
    public static final  /* enum */ au JANGERBERRIES;
    public static final  /* enum */ au ONION;
    private final  String name;
    
    public static final  /* enum */ au GIANT_SUPERCOMPOST;
    public static final  /* enum */ au GRAPE;
    public static final  /* enum */ au PALM;
    public static final  /* enum */ au YEW;
    public static final  /* enum */ au LIMPWURT;
    public static final  /* enum */ au DWELLBERRIES;
    public static final  /* enum */ au APPLE;
    public static final  /* enum */ au IASOR;
    public static final  /* enum */ au TOMATO;
    public static final  /* enum */ au ROSEMARY;
    public static final  /* enum */ au SCARECROW;
    public static final  /* enum */ au GIANT_COMPOST;
    public static final  /* enum */ au GIANT_ULTRACOMPOST;
    public static final  /* enum */ au KWUARM;
    public static final  /* enum */ au GOUTWEED;
    public static final  /* enum */ au ATTAS;
    public static final  /* enum */ au WATERMELON;
    public static final  /* enum */ au NASTURTIUM;
    public static final  /* enum */ au POISON_IVY;
    public static final  /* enum */ au MAPLE;
    public static final  /* enum */ au RANARR;
    public static final  /* enum */ au MARRENTILL;
    public static final  /* enum */ au ASGARNIAN;
    public static final  /* enum */ au REDWOOD;
    public static final  /* enum */ au TEAK;
    public static final  /* enum */ au KRANDORIAN;
    private final  P patchImplementation;
    
    public static final  /* enum */ au IRIT;
    private final  int stages;
    private final  int harvestStages;
    public static final  /* enum */ au SEAWEED;
    public static final  /* enum */ au BARLEY;
    public static final  /* enum */ au ROTTEN_TOMATO;
    public static final  /* enum */ au HARRALANDER;
    public static final  /* enum */ au MARIGOLD;
    public static final  /* enum */ au JUTE;
    public static final  /* enum */ au GUAM;
    public static final  /* enum */ au HAMMERSTONE;
    public static final  /* enum */ au SUPERCOMPOST;
    public static final  /* enum */ au TOADFLAX;
    public static final  /* enum */ au DWARF_WEED;
    public static final  /* enum */ au EMPTY_COMPOST_BIN;

    public int bk() {
        return this.harvestStages;
    }

    public boolean bg() {
        int n2;
        if (!(((Object)this != (Object)this2)COMPOST) && ((Object)this != (Object)this2)GIANT_COMPOST) && ((Object)this != (Object)this2)SUPERCOMPOST) && ((Object)this != (Object)this2)GIANT_SUPERCOMPOST) && ((Object)this != (Object)this2)ULTRACOMPOST) && ((Object)this != (Object)this2)GIANT_ULTRACOMPOST) && ((Object)this != (Object)this2)ROTTEN_TOMATO) && !((Object)this == (Object)this2)GIANT_ROTTEN_TOMATO))) {
            n2 = 1;
            0;
            if (((0x8A ^ 0xB3) & ~(0x11 ^ 0x28)) < 0) {
                return ((0x3C ^ 0x7C) & ~(0x1E ^ 0x5E)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

    public static au[] values() {
        return (au[])$VALUES.clone();
    }

    public int bj() {
        return this.regrowTickrate;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if ((0xC2 ^ 0xC7) > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public String ac() {
        return this.name;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    static {
        au.var25();
        au.var26();
        WEEDS = new GameEnum4(var1[1], 2, 3, 4);
        SCARECROW = new GameEnum4(var1[6], 7, 3, 4);
        POTATO = new GameEnum4(var1[3], var1[8], P.ALLOTMENT, 9, var2[10], 3, 0, 6);
        ONION = new GameEnum4(var1[var2[12]], var1[var2[13]], P.ALLOTMENT, var2[14], var2[10], 3, 0, 6);
        CABBAGE = new GameEnum4(var1[var2[15]], var1[var2[16]], P.ALLOTMENT, var2[17], var2[10], 3, 0, 6);
        TOMATO = new GameEnum4(var1[var2[19]], var1[var2[20]], P.ALLOTMENT, var2[21], var2[10], 3, 0, 6);
        SWEETCORN = new GameEnum4(var1[var2[23]], P.ALLOTMENT, var2[24], var2[10], var2[11], 0, 6);
        STRAWBERRY = new GameEnum4(var1[var2[26]], var1[var2[27]], P.ALLOTMENT, var2[28], var2[10], var2[11], 0, 6);
        WATERMELON = new GameEnum4(var1[var2[30]], var1[var2[31]], P.ALLOTMENT, var2[32], var2[10], var2[13], 0, 6);
        SNAPE_GRASS = new GameEnum4(var1[var2[34]], P.ALLOTMENT, var2[35], var2[10], var2[12], 0, 6);
        MARIGOLD = new GameEnum4(var1[var2[37]], var1[var2[38]], P.FLOWER, var2[39], 3, 3);
        ROSEMARY = new GameEnum4(var1[var2[41]], P.FLOWER, var2[42], 3, 3);
        NASTURTIUM = new GameEnum4(var1[var2[44]], var1[var2[45]], P.FLOWER, var2[46], 3, 3);
        WOAD = new GameEnum4(var1[var2[48]], P.FLOWER, var2[49], 3, 3);
        LIMPWURT = new GameEnum4(var1[var2[51]], var1[var2[52]], P.FLOWER, var2[53], 3, 3);
        WHITE_LILY = new GameEnum4(var1[var2[55]], var1[var2[56]], P.FLOWER, var2[57], 3, 3);
        REDBERRIES = new GameEnum4(var1[var2[59]], var1[var2[60]], P.BUSH, var2[61], var2[27], 8, var2[27], 3);
        CADAVABERRIES = new GameEnum4(var1[var2[63]], var1[var2[64]], P.BUSH, var2[65], var2[27], var2[11], var2[27], 3);
        DWELLBERRIES = new GameEnum4(var1[var2[67]], var1[var2[68]], P.BUSH, var2[69], var2[27], var2[12], var2[27], 3);
        JANGERBERRIES = new GameEnum4(var1[var2[71]], var1[var2[72]], P.BUSH, var2[73], var2[27], var2[13], var2[27], 3);
        WHITEBERRIES = new GameEnum4(var1[var2[75]], var1[var2[76]], P.BUSH, var2[77], var2[27], var2[13], var2[27], 3);
        POISON_IVY = new GameEnum4(var1[var2[79]], var1[var2[80]], P.BUSH, var2[81], var2[27], var2[13], var2[27], 3);
        BARLEY = new GameEnum4(var1[var2[83]], P.HOPS, var2[84], var2[10], 3, 0, 6);
        HAMMERSTONE = new GameEnum4(var1[var2[86]], P.HOPS, var2[87], var2[10], 3, 0, 6);
        ASGARNIAN = new GameEnum4(var1[var2[89]], P.HOPS, var2[90], var2[10], 8, 0, 6);
        JUTE = new GameEnum4(var1[var2[92]], P.HOPS, var2[93], var2[10], 8, 0, 6);
        YANILLIAN = new GameEnum4(var1[var2[95]], P.HOPS, var2[96], var2[10], var2[11], 0, 6);
        KRANDORIAN = new GameEnum4(var1[var2[98]], P.HOPS, var2[99], var2[10], var2[12], 0, 6);
        WILDBLOOD = new GameEnum4(var1[var2[101]], P.HOPS, var2[102], var2[10], var2[13], 0, 6);
        GUAM = new GameEnum4(var1[var2[104]], P.HERB, var2[105], var2[27], 3, 0, 6);
        MARRENTILL = new GameEnum4(var1[var2[107]], P.HERB, var2[108], var2[27], 3, 0, 6);
        TARROMIN = new GameEnum4(var1[var2[110]], P.HERB, var2[111], var2[27], 3, 0, 6);
        HARRALANDER = new GameEnum4(var1[var2[113]], P.HERB, var2[114], var2[27], 3, 0, 6);
        RANARR = new GameEnum4(var1[var2[116]], P.HERB, var2[117], var2[27], 3, 0, 6);
        TOADFLAX = new GameEnum4(var1[var2[119]], P.HERB, var2[120], var2[27], 3, 0, 6);
        IRIT = new GameEnum4(var1[var2[122]], P.HERB, var2[123], var2[27], 3, 0, 6);
        AVANTOE = new GameEnum4(var1[var2[125]], P.HERB, var2[126], var2[27], 3, 0, 6);
        KWUARM = new GameEnum4(var1[var2[128]], P.HERB, var2[129], var2[27], 3, 0, 6);
        SNAPDRAGON = new GameEnum4(var1[var2[131]], P.HERB, var2[132], var2[27], 3, 0, 6);
        CADANTINE = new GameEnum4(var1[var2[134]], P.HERB, var2[135], var2[27], 3, 0, 6);
        LANTADYME = new GameEnum4(var1[var2[137]], P.HERB, var2[138], var2[27], 3, 0, 6);
        DWARF_WEED = new GameEnum4(var1[var2[140]], P.HERB, var2[141], var2[27], 3, 0, 6);
        TORSTOL = new GameEnum4(var1[var2[143]], P.HERB, var2[144], var2[27], 3, 0, 6);
        GOUTWEED = new GameEnum4(var1[var2[146]], P.HERB, var2[147], var2[27], 3, 0, 5);
        ANYHERB = new GameEnum4(var1[var2[149]], P.HERB, var2[105], var2[27], 3, 0, 6);
        OAK = new GameEnum4(var1[var2[151]], var1[var2[152]], P.TREE, var2[153], var2[55], 3);
        WILLOW = new GameEnum4(var1[var2[155]], var1[var2[156]], P.TREE, var2[157], var2[55], var2[11]);
        MAPLE = new GameEnum4(var1[var2[159]], var1[var2[160]], P.TREE, var2[161], var2[55], var2[13]);
        YEW = new GameEnum4(var1[var2[163]], var1[var2[164]], P.TREE, var2[165], var2[55], var2[15]);
        MAGIC = new GameEnum4(var1[var2[167]], var1[var2[168]], P.TREE, var2[169], var2[55], var2[18]);
        APPLE = new GameEnum4(var1[var2[171]], var1[var2[172]], P.FRUIT_TREE, var2[173], var2[174], var2[11], var2[62], var2[11]);
        BANANA = new GameEnum4(var1[var2[176]], var1[var2[177]], P.FRUIT_TREE, var2[178], var2[174], var2[11], var2[62], var2[11]);
        ORANGE = new GameEnum4(var1[var2[180]], var1[var2[181]], P.FRUIT_TREE, var2[182], var2[174], var2[11], var2[62], var2[11]);
        CURRY = new GameEnum4(var1[var2[184]], var1[var2[185]], P.FRUIT_TREE, var2[186], var2[174], var2[11], var2[62], var2[11]);
        PINEAPPLE = new GameEnum4(var1[var2[188]], var1[var2[189]], P.FRUIT_TREE, var2[190], var2[174], var2[11], var2[62], var2[11]);
        PAPAYA = new GameEnum4(var1[var2[192]], var1[var2[193]], P.FRUIT_TREE, var2[194], var2[174], var2[11], var2[62], var2[11]);
        PALM = new GameEnum4(var1[var2[196]], var1[var2[197]], P.FRUIT_TREE, var2[198], var2[174], var2[11], var2[62], var2[11]);
        DRAGONFRUIT = new GameEnum4(var1[var2[200]], var1[var2[201]], P.FRUIT_TREE, var2[202], var2[174], var2[11], var2[62], var2[11]);
        CACTUS = new GameEnum4(var1[var2[204]], P.CACTUS, var2[205], var2[112], var2[12], var2[27], 4);
        POTATO_CACTUS = new GameEnum4(var1[var2[207]], var1[var2[208]], P.CACTUS, var2[209], var2[10], var2[12], 3, var2[11]);
        TEAK = new GameEnum4(var1[var2[211]], P.HARDWOOD_TREE, var2[212], var2[213], var2[12]);
        MAHOGANY = new GameEnum4(var1[var2[215]], P.HARDWOOD_TREE, var2[216], var2[213], var2[13]);
        ATTAS = new GameEnum4(var1[var2[218]], P.ANIMA, var2[219], var2[213], var2[13]);
        IASOR = new GameEnum4(var1[var2[221]], P.ANIMA, var2[222], var2[213], var2[13]);
        KRONOS = new GameEnum4(var1[var2[224]], P.ANIMA, var2[225], var2[213], var2[13]);
        SEAWEED = new GameEnum4(var1[var2[226]], P.SEAWEED, var2[227], var2[10], 3, 0, 4);
        GRAPE = new GameEnum4(var1[var2[229]], P.GRAPES, var2[230], 3, var2[12], 0, 3);
        MUSHROOM = new GameEnum4(var1[var2[232]], P.MUSHROOM, var2[233], var2[55], var2[11], 0, var2[11]);
        BELLADONNA = new GameEnum4(var1[var2[235]], P.BELLADONNA, var2[236], var2[112], 3);
        CALQUAT = new GameEnum4(var1[var2[238]], P.CALQUAT, var2[239], var2[174], var2[13], 0, var2[11]);
        SPIRIT_TREE = new GameEnum4(var1[var2[241]], P.SPIRIT_TREE, var2[242], var2[243], var2[18]);
        CELASTRUS = new GameEnum4(var1[var2[245]], var1[var2[246]], P.CELASTRUS, var2[247], var2[174], 8, 0, 4);
        REDWOOD = new GameEnum4(var1[var2[249]], var1[var2[250]], P.REDWOOD, var2[251], var2[213], var2[15]);
        HESPORI = new GameEnum4(var1[var2[253]], P.HESPORI, var2[254], var2[213], 4, 0, 5);
        CRYSTAL_TREE = new GameEnum4(var1[var2[256]], P.CRYSTAL_TREE, var2[257], var2[112], var2[11]);
        EMPTY_COMPOST_BIN = new GameEnum4(var1[var2[259]], P.COMPOST, var2[260], 0, 1, 0, 0);
        COMPOST = new GameEnum4(var1[var2[262]], P.COMPOST, var2[263], var2[55], 6, 0, var2[20]);
        SUPERCOMPOST = new GameEnum4(var1[var2[265]], P.COMPOST, var2[266], var2[55], 6, 0, var2[20]);
        ULTRACOMPOST = new GameEnum4(var1[var2[268]], P.COMPOST, var2[269], 0, 6, 0, var2[20]);
        ROTTEN_TOMATO = new GameEnum4(var1[var2[271]], P.COMPOST, var2[272], var2[55], 6, 0, var2[20]);
        EMPTY_GIANT_COMPOST_BIN = new GameEnum4(var1[var2[274]], P.COMPOST, var2[260], 0, 1, 0, 0);
        GIANT_COMPOST = new GameEnum4(var1[var2[276]], P.GIANT_COMPOST, var2[263], var2[55], 6, 0, var2[41]);
        GIANT_SUPERCOMPOST = new GameEnum4(var1[var2[278]], P.GIANT_COMPOST, var2[266], var2[55], 6, 0, var2[41]);
        GIANT_ULTRACOMPOST = new GameEnum4(var1[var2[280]], P.GIANT_COMPOST, var2[269], 0, 6, 0, var2[41]);
        GIANT_ROTTEN_TOMATO = new GameEnum4(var1[var2[282]], P.GIANT_COMPOST, var2[272], var2[55], 6, 0, var2[41]);
        au[] auArray = new au[var2[119]];
        auArray[0] = WEEDS;
        auArray[1] = SCARECROW;
        auArray[5] = POTATO;
        auArray[6] = ONION;
        auArray[4] = CABBAGE;
        auArray[3] = TOMATO;
        auArray[8] = SWEETCORN;
        auArray[au.var2[11]] = STRAWBERRY;
        auArray[au.var2[12]] = WATERMELON;
        auArray[au.var2[13]] = SNAPE_GRASS;
        auArray[au.var2[10]] = MARIGOLD;
        auArray[au.var2[15]] = ROSEMARY;
        auArray[au.var2[16]] = NASTURTIUM;
        auArray[au.var2[18]] = WOAD;
        auArray[au.var2[19]] = LIMPWURT;
        auArray[au.var2[20]] = WHITE_LILY;
        auArray[au.var2[22]] = REDBERRIES;
        auArray[au.var2[23]] = CADAVABERRIES;
        auArray[au.var2[25]] = DWELLBERRIES;
        auArray[au.var2[26]] = JANGERBERRIES;
        auArray[au.var2[27]] = WHITEBERRIES;
        auArray[au.var2[29]] = POISON_IVY;
        auArray[au.var2[30]] = BARLEY;
        auArray[au.var2[31]] = HAMMERSTONE;
        auArray[au.var2[33]] = ASGARNIAN;
        auArray[au.var2[34]] = JUTE;
        auArray[au.var2[36]] = YANILLIAN;
        auArray[au.var2[37]] = KRANDORIAN;
        auArray[au.var2[38]] = WILDBLOOD;
        auArray[au.var2[40]] = GUAM;
        auArray[au.var2[41]] = MARRENTILL;
        auArray[au.var2[43]] = TARROMIN;
        auArray[au.var2[44]] = HARRALANDER;
        auArray[au.var2[45]] = RANARR;
        auArray[au.var2[47]] = TOADFLAX;
        auArray[au.var2[48]] = IRIT;
        auArray[au.var2[50]] = AVANTOE;
        auArray[au.var2[51]] = KWUARM;
        auArray[au.var2[52]] = SNAPDRAGON;
        auArray[au.var2[54]] = CADANTINE;
        auArray[au.var2[55]] = LANTADYME;
        auArray[au.var2[56]] = DWARF_WEED;
        auArray[au.var2[58]] = TORSTOL;
        auArray[au.var2[59]] = GOUTWEED;
        auArray[au.var2[60]] = ANYHERB;
        auArray[au.var2[62]] = OAK;
        auArray[au.var2[63]] = WILLOW;
        auArray[au.var2[64]] = MAPLE;
        auArray[au.var2[66]] = YEW;
        auArray[au.var2[67]] = MAGIC;
        auArray[au.var2[68]] = APPLE;
        auArray[au.var2[70]] = BANANA;
        auArray[au.var2[71]] = ORANGE;
        auArray[au.var2[72]] = CURRY;
        auArray[au.var2[74]] = PINEAPPLE;
        auArray[au.var2[75]] = PAPAYA;
        auArray[au.var2[76]] = PALM;
        auArray[au.var2[78]] = DRAGONFRUIT;
        auArray[au.var2[79]] = CACTUS;
        auArray[au.var2[80]] = POTATO_CACTUS;
        auArray[au.var2[82]] = TEAK;
        auArray[au.var2[83]] = MAHOGANY;
        auArray[au.var2[85]] = ATTAS;
        auArray[au.var2[86]] = IASOR;
        auArray[au.var2[88]] = KRONOS;
        auArray[au.var2[89]] = SEAWEED;
        auArray[au.var2[91]] = GRAPE;
        auArray[au.var2[92]] = MUSHROOM;
        auArray[au.var2[94]] = BELLADONNA;
        auArray[au.var2[95]] = CALQUAT;
        auArray[au.var2[97]] = SPIRIT_TREE;
        auArray[au.var2[98]] = CELASTRUS;
        auArray[au.var2[100]] = REDWOOD;
        auArray[au.var2[101]] = HESPORI;
        auArray[au.var2[103]] = CRYSTAL_TREE;
        auArray[au.var2[104]] = EMPTY_COMPOST_BIN;
        auArray[au.var2[106]] = COMPOST;
        auArray[au.var2[107]] = SUPERCOMPOST;
        auArray[au.var2[109]] = ULTRACOMPOST;
        auArray[au.var2[110]] = ROTTEN_TOMATO;
        auArray[au.var2[112]] = EMPTY_GIANT_COMPOST_BIN;
        auArray[au.var2[113]] = GIANT_COMPOST;
        auArray[au.var2[115]] = GIANT_SUPERCOMPOST;
        auArray[au.var2[116]] = GIANT_ULTRACOMPOST;
        auArray[au.var2[118]] = GIANT_ROTTEN_TOMATO;
        $VALUES = auArray;
    }

    private GameEnum4(String string2, String string3, P p2, int n3, int n4, int n5) {
        this(string2, string3, p2, n3, n4, n5, 0, 1);
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static au d(String string) {
        void var27;
        au[] auArray = au.values();
        int n2 = auArray.length;
        int var28 = 0;
        while ((var28 < (int)var27)) {
            String var29;
            void var30;
            void var31 = var30[var28];
            if ((var31.k( != 0).equalsIgnoreCase(var29) ? 1 : 0)) {
                return var31;
            }
            ++var28;
            0;
            if (2 < 3) continue;
            return null;
        }
        return null;
    }

    public String k() {
        return this.contractName;
    }

    private GameEnum4(String string2, int n3, int n4, int n5) {
        this(string2, string2, null, n3, n4, n5, 0, 1);
    }

    public P bh() {
        return this.patchImplementation;
    }

    private GameEnum4(String string2, int n3, int n4, int n5, int n6, int n7) {
        this(string2, string2, null, n3, n4, n5, n6, n7);
    }

    public int bi() {
        return this.tickrate;
    }

    private GameEnum4(String string2, P p2, int n3, int n4, int n5, int n6, int n7) {
        this(string2, string2, p2, n3, n4, n5, n6, n7);
    }

    private GameEnum4(String string2, P p2, int n3, int n4, int n5) {
        this(string2, string2, p2, n3, n4, n5, 0, 1);
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static au g(int n2) {
        void var32;
        au[] auArray = au.values();
        int n3 = auArray.length;
        int var33 = 0;
        while ((var33 < (int)var32)) {
            int var34;
            void var35;
            void var36 = var35[var33];
            if ((var36.GameEnum4() == var34)) {
                return var36;
            }
            ++var33;
            0;
            if ((32 + 71 - -65 + 4 ^ 124 + 37 - 83 + 90) >= 2) continue;
            return null;
        }
        return null;
    }

    public int GameEnum4() {
        return this.itemID;
    }

    public static au valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public int bc() {
        return this.stages;
    }

    private GameEnum4(String string2, String string3, P p2, int n3, int n4, int n5, int n6, int n7) {
        this.name = string2;
        this.contractName = string3;
        this.patchImplementation = p2;
        this.itemID = n3;
        this.tickrate = n4;
        this.stages = n5;
        this.regrowTickrate = n6;
        this.harvestStages = n7;
    }
}

