/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum19;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

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
        if (!(au.lllIlllIIIlIll((Object)this, (Object)COMPOST) && au.lllIlllIIIlIll((Object)this, (Object)GIANT_COMPOST) && au.lllIlllIIIlIll((Object)this, (Object)SUPERCOMPOST) && au.lllIlllIIIlIll((Object)this, (Object)GIANT_SUPERCOMPOST) && au.lllIlllIIIlIll((Object)this, (Object)ULTRACOMPOST) && au.lllIlllIIIlIll((Object)this, (Object)GIANT_ULTRACOMPOST) && au.lllIlllIIIlIll((Object)this, (Object)ROTTEN_TOMATO) && !au.lllIlllIIIllII((Object)this, (Object)GIANT_ROTTEN_TOMATO))) {
            n2 = lIlllIlllllI[1];

            if (((0x8A ^ 0xB3) & ~(0x11 ^ 0x28)) < 0) {
                return false;
            }
        } else {
            n2 = lIlllIlllllI[0];
        }
        return n2 != 0;
    }

    public static au[] values() {
        return (au[])$VALUES.clone();
    }

    public int bj() {
        return this.regrowTickrate;
    }

    private static boolean lllIlllIIIlIll(Object object, Object object2) {
        return object != object2;
    }

        return String.valueOf(var1);
    }

    private static boolean lllIlllIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    public String ac() {
        return this.name;
    }

    static {
        au.lllIlllIIIIlll();
        au.lllIllIlIlIlll();
        WEEDS = new GameEnum4(lIlllIIlllII[lIlllIlllllI[1]], lIlllIlllllI[2], lIlllIlllllI[3], lIlllIlllllI[4]);
        SCARECROW = new GameEnum4(lIlllIIlllII[lIlllIlllllI[6]], lIlllIlllllI[7], lIlllIlllllI[3], lIlllIlllllI[4]);
        POTATO = new GameEnum4(lIlllIIlllII[lIlllIlllllI[3]], lIlllIIlllII[lIlllIlllllI[8]], P.ALLOTMENT, lIlllIlllllI[9], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        ONION = new GameEnum4(lIlllIIlllII[lIlllIlllllI[12]], lIlllIIlllII[lIlllIlllllI[13]], P.ALLOTMENT, lIlllIlllllI[14], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        CABBAGE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[15]], lIlllIIlllII[lIlllIlllllI[16]], P.ALLOTMENT, lIlllIlllllI[17], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        TOMATO = new GameEnum4(lIlllIIlllII[lIlllIlllllI[19]], lIlllIIlllII[lIlllIlllllI[20]], P.ALLOTMENT, lIlllIlllllI[21], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        SWEETCORN = new GameEnum4(lIlllIIlllII[lIlllIlllllI[23]], P.ALLOTMENT, lIlllIlllllI[24], lIlllIlllllI[10], lIlllIlllllI[11], lIlllIlllllI[0], lIlllIlllllI[6]);
        STRAWBERRY = new GameEnum4(lIlllIIlllII[lIlllIlllllI[26]], lIlllIIlllII[lIlllIlllllI[27]], P.ALLOTMENT, lIlllIlllllI[28], lIlllIlllllI[10], lIlllIlllllI[11], lIlllIlllllI[0], lIlllIlllllI[6]);
        WATERMELON = new GameEnum4(lIlllIIlllII[lIlllIlllllI[30]], lIlllIIlllII[lIlllIlllllI[31]], P.ALLOTMENT, lIlllIlllllI[32], lIlllIlllllI[10], lIlllIlllllI[13], lIlllIlllllI[0], lIlllIlllllI[6]);
        SNAPE_GRASS = new GameEnum4(lIlllIIlllII[lIlllIlllllI[34]], P.ALLOTMENT, lIlllIlllllI[35], lIlllIlllllI[10], lIlllIlllllI[12], lIlllIlllllI[0], lIlllIlllllI[6]);
        MARIGOLD = new GameEnum4(lIlllIIlllII[lIlllIlllllI[37]], lIlllIIlllII[lIlllIlllllI[38]], P.FLOWER, lIlllIlllllI[39], lIlllIlllllI[3], lIlllIlllllI[3]);
        ROSEMARY = new GameEnum4(lIlllIIlllII[lIlllIlllllI[41]], P.FLOWER, lIlllIlllllI[42], lIlllIlllllI[3], lIlllIlllllI[3]);
        NASTURTIUM = new GameEnum4(lIlllIIlllII[lIlllIlllllI[44]], lIlllIIlllII[lIlllIlllllI[45]], P.FLOWER, lIlllIlllllI[46], lIlllIlllllI[3], lIlllIlllllI[3]);
        WOAD = new GameEnum4(lIlllIIlllII[lIlllIlllllI[48]], P.FLOWER, lIlllIlllllI[49], lIlllIlllllI[3], lIlllIlllllI[3]);
        LIMPWURT = new GameEnum4(lIlllIIlllII[lIlllIlllllI[51]], lIlllIIlllII[lIlllIlllllI[52]], P.FLOWER, lIlllIlllllI[53], lIlllIlllllI[3], lIlllIlllllI[3]);
        WHITE_LILY = new GameEnum4(lIlllIIlllII[lIlllIlllllI[55]], lIlllIIlllII[lIlllIlllllI[56]], P.FLOWER, lIlllIlllllI[57], lIlllIlllllI[3], lIlllIlllllI[3]);
        REDBERRIES = new GameEnum4(lIlllIIlllII[lIlllIlllllI[59]], lIlllIIlllII[lIlllIlllllI[60]], P.BUSH, lIlllIlllllI[61], lIlllIlllllI[27], lIlllIlllllI[8], lIlllIlllllI[27], lIlllIlllllI[3]);
        CADAVABERRIES = new GameEnum4(lIlllIIlllII[lIlllIlllllI[63]], lIlllIIlllII[lIlllIlllllI[64]], P.BUSH, lIlllIlllllI[65], lIlllIlllllI[27], lIlllIlllllI[11], lIlllIlllllI[27], lIlllIlllllI[3]);
        DWELLBERRIES = new GameEnum4(lIlllIIlllII[lIlllIlllllI[67]], lIlllIIlllII[lIlllIlllllI[68]], P.BUSH, lIlllIlllllI[69], lIlllIlllllI[27], lIlllIlllllI[12], lIlllIlllllI[27], lIlllIlllllI[3]);
        JANGERBERRIES = new GameEnum4(lIlllIIlllII[lIlllIlllllI[71]], lIlllIIlllII[lIlllIlllllI[72]], P.BUSH, lIlllIlllllI[73], lIlllIlllllI[27], lIlllIlllllI[13], lIlllIlllllI[27], lIlllIlllllI[3]);
        WHITEBERRIES = new GameEnum4(lIlllIIlllII[lIlllIlllllI[75]], lIlllIIlllII[lIlllIlllllI[76]], P.BUSH, lIlllIlllllI[77], lIlllIlllllI[27], lIlllIlllllI[13], lIlllIlllllI[27], lIlllIlllllI[3]);
        POISON_IVY = new GameEnum4(lIlllIIlllII[lIlllIlllllI[79]], lIlllIIlllII[lIlllIlllllI[80]], P.BUSH, lIlllIlllllI[81], lIlllIlllllI[27], lIlllIlllllI[13], lIlllIlllllI[27], lIlllIlllllI[3]);
        BARLEY = new GameEnum4(lIlllIIlllII[lIlllIlllllI[83]], P.HOPS, lIlllIlllllI[84], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        HAMMERSTONE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[86]], P.HOPS, lIlllIlllllI[87], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        ASGARNIAN = new GameEnum4(lIlllIIlllII[lIlllIlllllI[89]], P.HOPS, lIlllIlllllI[90], lIlllIlllllI[10], lIlllIlllllI[8], lIlllIlllllI[0], lIlllIlllllI[6]);
        JUTE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[92]], P.HOPS, lIlllIlllllI[93], lIlllIlllllI[10], lIlllIlllllI[8], lIlllIlllllI[0], lIlllIlllllI[6]);
        YANILLIAN = new GameEnum4(lIlllIIlllII[lIlllIlllllI[95]], P.HOPS, lIlllIlllllI[96], lIlllIlllllI[10], lIlllIlllllI[11], lIlllIlllllI[0], lIlllIlllllI[6]);
        KRANDORIAN = new GameEnum4(lIlllIIlllII[lIlllIlllllI[98]], P.HOPS, lIlllIlllllI[99], lIlllIlllllI[10], lIlllIlllllI[12], lIlllIlllllI[0], lIlllIlllllI[6]);
        WILDBLOOD = new GameEnum4(lIlllIIlllII[lIlllIlllllI[101]], P.HOPS, lIlllIlllllI[102], lIlllIlllllI[10], lIlllIlllllI[13], lIlllIlllllI[0], lIlllIlllllI[6]);
        GUAM = new GameEnum4(lIlllIIlllII[lIlllIlllllI[104]], P.HERB, lIlllIlllllI[105], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        MARRENTILL = new GameEnum4(lIlllIIlllII[lIlllIlllllI[107]], P.HERB, lIlllIlllllI[108], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        TARROMIN = new GameEnum4(lIlllIIlllII[lIlllIlllllI[110]], P.HERB, lIlllIlllllI[111], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        HARRALANDER = new GameEnum4(lIlllIIlllII[lIlllIlllllI[113]], P.HERB, lIlllIlllllI[114], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        RANARR = new GameEnum4(lIlllIIlllII[lIlllIlllllI[116]], P.HERB, lIlllIlllllI[117], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        TOADFLAX = new GameEnum4(lIlllIIlllII[lIlllIlllllI[119]], P.HERB, lIlllIlllllI[120], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        IRIT = new GameEnum4(lIlllIIlllII[lIlllIlllllI[122]], P.HERB, lIlllIlllllI[123], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        AVANTOE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[125]], P.HERB, lIlllIlllllI[126], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        KWUARM = new GameEnum4(lIlllIIlllII[lIlllIlllllI[128]], P.HERB, lIlllIlllllI[129], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        SNAPDRAGON = new GameEnum4(lIlllIIlllII[lIlllIlllllI[131]], P.HERB, lIlllIlllllI[132], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        CADANTINE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[134]], P.HERB, lIlllIlllllI[135], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        LANTADYME = new GameEnum4(lIlllIIlllII[lIlllIlllllI[137]], P.HERB, lIlllIlllllI[138], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        DWARF_WEED = new GameEnum4(lIlllIIlllII[lIlllIlllllI[140]], P.HERB, lIlllIlllllI[141], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        TORSTOL = new GameEnum4(lIlllIIlllII[lIlllIlllllI[143]], P.HERB, lIlllIlllllI[144], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        GOUTWEED = new GameEnum4(lIlllIIlllII[lIlllIlllllI[146]], P.HERB, lIlllIlllllI[147], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[5]);
        ANYHERB = new GameEnum4(lIlllIIlllII[lIlllIlllllI[149]], P.HERB, lIlllIlllllI[105], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        OAK = new GameEnum4(lIlllIIlllII[lIlllIlllllI[151]], lIlllIIlllII[lIlllIlllllI[152]], P.TREE, lIlllIlllllI[153], lIlllIlllllI[55], lIlllIlllllI[3]);
        WILLOW = new GameEnum4(lIlllIIlllII[lIlllIlllllI[155]], lIlllIIlllII[lIlllIlllllI[156]], P.TREE, lIlllIlllllI[157], lIlllIlllllI[55], lIlllIlllllI[11]);
        MAPLE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[159]], lIlllIIlllII[lIlllIlllllI[160]], P.TREE, lIlllIlllllI[161], lIlllIlllllI[55], lIlllIlllllI[13]);
        YEW = new GameEnum4(lIlllIIlllII[lIlllIlllllI[163]], lIlllIIlllII[lIlllIlllllI[164]], P.TREE, lIlllIlllllI[165], lIlllIlllllI[55], lIlllIlllllI[15]);
        MAGIC = new GameEnum4(lIlllIIlllII[lIlllIlllllI[167]], lIlllIIlllII[lIlllIlllllI[168]], P.TREE, lIlllIlllllI[169], lIlllIlllllI[55], lIlllIlllllI[18]);
        APPLE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[171]], lIlllIIlllII[lIlllIlllllI[172]], P.FRUIT_TREE, lIlllIlllllI[173], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        BANANA = new GameEnum4(lIlllIIlllII[lIlllIlllllI[176]], lIlllIIlllII[lIlllIlllllI[177]], P.FRUIT_TREE, lIlllIlllllI[178], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        ORANGE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[180]], lIlllIIlllII[lIlllIlllllI[181]], P.FRUIT_TREE, lIlllIlllllI[182], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        CURRY = new GameEnum4(lIlllIIlllII[lIlllIlllllI[184]], lIlllIIlllII[lIlllIlllllI[185]], P.FRUIT_TREE, lIlllIlllllI[186], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        PINEAPPLE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[188]], lIlllIIlllII[lIlllIlllllI[189]], P.FRUIT_TREE, lIlllIlllllI[190], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        PAPAYA = new GameEnum4(lIlllIIlllII[lIlllIlllllI[192]], lIlllIIlllII[lIlllIlllllI[193]], P.FRUIT_TREE, lIlllIlllllI[194], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        PALM = new GameEnum4(lIlllIIlllII[lIlllIlllllI[196]], lIlllIIlllII[lIlllIlllllI[197]], P.FRUIT_TREE, lIlllIlllllI[198], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        DRAGONFRUIT = new GameEnum4(lIlllIIlllII[lIlllIlllllI[200]], lIlllIIlllII[lIlllIlllllI[201]], P.FRUIT_TREE, lIlllIlllllI[202], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        CACTUS = new GameEnum4(lIlllIIlllII[lIlllIlllllI[204]], P.CACTUS, lIlllIlllllI[205], lIlllIlllllI[112], lIlllIlllllI[12], lIlllIlllllI[27], lIlllIlllllI[4]);
        POTATO_CACTUS = new GameEnum4(lIlllIIlllII[lIlllIlllllI[207]], lIlllIIlllII[lIlllIlllllI[208]], P.CACTUS, lIlllIlllllI[209], lIlllIlllllI[10], lIlllIlllllI[12], lIlllIlllllI[3], lIlllIlllllI[11]);
        TEAK = new GameEnum4(lIlllIIlllII[lIlllIlllllI[211]], P.HARDWOOD_TREE, lIlllIlllllI[212], lIlllIlllllI[213], lIlllIlllllI[12]);
        MAHOGANY = new GameEnum4(lIlllIIlllII[lIlllIlllllI[215]], P.HARDWOOD_TREE, lIlllIlllllI[216], lIlllIlllllI[213], lIlllIlllllI[13]);
        ATTAS = new GameEnum4(lIlllIIlllII[lIlllIlllllI[218]], P.ANIMA, lIlllIlllllI[219], lIlllIlllllI[213], lIlllIlllllI[13]);
        IASOR = new GameEnum4(lIlllIIlllII[lIlllIlllllI[221]], P.ANIMA, lIlllIlllllI[222], lIlllIlllllI[213], lIlllIlllllI[13]);
        KRONOS = new GameEnum4(lIlllIIlllII[lIlllIlllllI[224]], P.ANIMA, lIlllIlllllI[225], lIlllIlllllI[213], lIlllIlllllI[13]);
        SEAWEED = new GameEnum4(lIlllIIlllII[lIlllIlllllI[226]], P.SEAWEED, lIlllIlllllI[227], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[4]);
        GRAPE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[229]], P.GRAPES, lIlllIlllllI[230], lIlllIlllllI[3], lIlllIlllllI[12], lIlllIlllllI[0], lIlllIlllllI[3]);
        MUSHROOM = new GameEnum4(lIlllIIlllII[lIlllIlllllI[232]], P.MUSHROOM, lIlllIlllllI[233], lIlllIlllllI[55], lIlllIlllllI[11], lIlllIlllllI[0], lIlllIlllllI[11]);
        BELLADONNA = new GameEnum4(lIlllIIlllII[lIlllIlllllI[235]], P.BELLADONNA, lIlllIlllllI[236], lIlllIlllllI[112], lIlllIlllllI[3]);
        CALQUAT = new GameEnum4(lIlllIIlllII[lIlllIlllllI[238]], P.CALQUAT, lIlllIlllllI[239], lIlllIlllllI[174], lIlllIlllllI[13], lIlllIlllllI[0], lIlllIlllllI[11]);
        SPIRIT_TREE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[241]], P.SPIRIT_TREE, lIlllIlllllI[242], lIlllIlllllI[243], lIlllIlllllI[18]);
        CELASTRUS = new GameEnum4(lIlllIIlllII[lIlllIlllllI[245]], lIlllIIlllII[lIlllIlllllI[246]], P.CELASTRUS, lIlllIlllllI[247], lIlllIlllllI[174], lIlllIlllllI[8], lIlllIlllllI[0], lIlllIlllllI[4]);
        REDWOOD = new GameEnum4(lIlllIIlllII[lIlllIlllllI[249]], lIlllIIlllII[lIlllIlllllI[250]], P.REDWOOD, lIlllIlllllI[251], lIlllIlllllI[213], lIlllIlllllI[15]);
        HESPORI = new GameEnum4(lIlllIIlllII[lIlllIlllllI[253]], P.HESPORI, lIlllIlllllI[254], lIlllIlllllI[213], lIlllIlllllI[4], lIlllIlllllI[0], lIlllIlllllI[5]);
        CRYSTAL_TREE = new GameEnum4(lIlllIIlllII[lIlllIlllllI[256]], P.CRYSTAL_TREE, lIlllIlllllI[257], lIlllIlllllI[112], lIlllIlllllI[11]);
        EMPTY_COMPOST_BIN = new GameEnum4(lIlllIIlllII[lIlllIlllllI[259]], P.COMPOST, lIlllIlllllI[260], lIlllIlllllI[0], lIlllIlllllI[1], lIlllIlllllI[0], lIlllIlllllI[0]);
        COMPOST = new GameEnum4(lIlllIIlllII[lIlllIlllllI[262]], P.COMPOST, lIlllIlllllI[263], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[20]);
        SUPERCOMPOST = new GameEnum4(lIlllIIlllII[lIlllIlllllI[265]], P.COMPOST, lIlllIlllllI[266], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[20]);
        ULTRACOMPOST = new GameEnum4(lIlllIIlllII[lIlllIlllllI[268]], P.COMPOST, lIlllIlllllI[269], lIlllIlllllI[0], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[20]);
        ROTTEN_TOMATO = new GameEnum4(lIlllIIlllII[lIlllIlllllI[271]], P.COMPOST, lIlllIlllllI[272], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[20]);
        EMPTY_GIANT_COMPOST_BIN = new GameEnum4(lIlllIIlllII[lIlllIlllllI[274]], P.COMPOST, lIlllIlllllI[260], lIlllIlllllI[0], lIlllIlllllI[1], lIlllIlllllI[0], lIlllIlllllI[0]);
        GIANT_COMPOST = new GameEnum4(lIlllIIlllII[lIlllIlllllI[276]], P.GIANT_COMPOST, lIlllIlllllI[263], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[41]);
        GIANT_SUPERCOMPOST = new GameEnum4(lIlllIIlllII[lIlllIlllllI[278]], P.GIANT_COMPOST, lIlllIlllllI[266], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[41]);
        GIANT_ULTRACOMPOST = new GameEnum4(lIlllIIlllII[lIlllIlllllI[280]], P.GIANT_COMPOST, lIlllIlllllI[269], lIlllIlllllI[0], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[41]);
        GIANT_ROTTEN_TOMATO = new GameEnum4(lIlllIIlllII[lIlllIlllllI[282]], P.GIANT_COMPOST, lIlllIlllllI[272], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[41]);
        au[] auArray = new au[lIlllIlllllI[119]];
        auArray[au.lIlllIlllllI[0]] = WEEDS;
        auArray[au.lIlllIlllllI[1]] = SCARECROW;
        auArray[au.lIlllIlllllI[5]] = POTATO;
        auArray[au.lIlllIlllllI[6]] = ONION;
        auArray[au.lIlllIlllllI[4]] = CABBAGE;
        auArray[au.lIlllIlllllI[3]] = TOMATO;
        auArray[au.lIlllIlllllI[8]] = SWEETCORN;
        auArray[au.lIlllIlllllI[11]] = STRAWBERRY;
        auArray[au.lIlllIlllllI[12]] = WATERMELON;
        auArray[au.lIlllIlllllI[13]] = SNAPE_GRASS;
        auArray[au.lIlllIlllllI[10]] = MARIGOLD;
        auArray[au.lIlllIlllllI[15]] = ROSEMARY;
        auArray[au.lIlllIlllllI[16]] = NASTURTIUM;
        auArray[au.lIlllIlllllI[18]] = WOAD;
        auArray[au.lIlllIlllllI[19]] = LIMPWURT;
        auArray[au.lIlllIlllllI[20]] = WHITE_LILY;
        auArray[au.lIlllIlllllI[22]] = REDBERRIES;
        auArray[au.lIlllIlllllI[23]] = CADAVABERRIES;
        auArray[au.lIlllIlllllI[25]] = DWELLBERRIES;
        auArray[au.lIlllIlllllI[26]] = JANGERBERRIES;
        auArray[au.lIlllIlllllI[27]] = WHITEBERRIES;
        auArray[au.lIlllIlllllI[29]] = POISON_IVY;
        auArray[au.lIlllIlllllI[30]] = BARLEY;
        auArray[au.lIlllIlllllI[31]] = HAMMERSTONE;
        auArray[au.lIlllIlllllI[33]] = ASGARNIAN;
        auArray[au.lIlllIlllllI[34]] = JUTE;
        auArray[au.lIlllIlllllI[36]] = YANILLIAN;
        auArray[au.lIlllIlllllI[37]] = KRANDORIAN;
        auArray[au.lIlllIlllllI[38]] = WILDBLOOD;
        auArray[au.lIlllIlllllI[40]] = GUAM;
        auArray[au.lIlllIlllllI[41]] = MARRENTILL;
        auArray[au.lIlllIlllllI[43]] = TARROMIN;
        auArray[au.lIlllIlllllI[44]] = HARRALANDER;
        auArray[au.lIlllIlllllI[45]] = RANARR;
        auArray[au.lIlllIlllllI[47]] = TOADFLAX;
        auArray[au.lIlllIlllllI[48]] = IRIT;
        auArray[au.lIlllIlllllI[50]] = AVANTOE;
        auArray[au.lIlllIlllllI[51]] = KWUARM;
        auArray[au.lIlllIlllllI[52]] = SNAPDRAGON;
        auArray[au.lIlllIlllllI[54]] = CADANTINE;
        auArray[au.lIlllIlllllI[55]] = LANTADYME;
        auArray[au.lIlllIlllllI[56]] = DWARF_WEED;
        auArray[au.lIlllIlllllI[58]] = TORSTOL;
        auArray[au.lIlllIlllllI[59]] = GOUTWEED;
        auArray[au.lIlllIlllllI[60]] = ANYHERB;
        auArray[au.lIlllIlllllI[62]] = OAK;
        auArray[au.lIlllIlllllI[63]] = WILLOW;
        auArray[au.lIlllIlllllI[64]] = MAPLE;
        auArray[au.lIlllIlllllI[66]] = YEW;
        auArray[au.lIlllIlllllI[67]] = MAGIC;
        auArray[au.lIlllIlllllI[68]] = APPLE;
        auArray[au.lIlllIlllllI[70]] = BANANA;
        auArray[au.lIlllIlllllI[71]] = ORANGE;
        auArray[au.lIlllIlllllI[72]] = CURRY;
        auArray[au.lIlllIlllllI[74]] = PINEAPPLE;
        auArray[au.lIlllIlllllI[75]] = PAPAYA;
        auArray[au.lIlllIlllllI[76]] = PALM;
        auArray[au.lIlllIlllllI[78]] = DRAGONFRUIT;
        auArray[au.lIlllIlllllI[79]] = CACTUS;
        auArray[au.lIlllIlllllI[80]] = POTATO_CACTUS;
        auArray[au.lIlllIlllllI[82]] = TEAK;
        auArray[au.lIlllIlllllI[83]] = MAHOGANY;
        auArray[au.lIlllIlllllI[85]] = ATTAS;
        auArray[au.lIlllIlllllI[86]] = IASOR;
        auArray[au.lIlllIlllllI[88]] = KRONOS;
        auArray[au.lIlllIlllllI[89]] = SEAWEED;
        auArray[au.lIlllIlllllI[91]] = GRAPE;
        auArray[au.lIlllIlllllI[92]] = MUSHROOM;
        auArray[au.lIlllIlllllI[94]] = BELLADONNA;
        auArray[au.lIlllIlllllI[95]] = CALQUAT;
        auArray[au.lIlllIlllllI[97]] = SPIRIT_TREE;
        auArray[au.lIlllIlllllI[98]] = CELASTRUS;
        auArray[au.lIlllIlllllI[100]] = REDWOOD;
        auArray[au.lIlllIlllllI[101]] = HESPORI;
        auArray[au.lIlllIlllllI[103]] = CRYSTAL_TREE;
        auArray[au.lIlllIlllllI[104]] = EMPTY_COMPOST_BIN;
        auArray[au.lIlllIlllllI[106]] = COMPOST;
        auArray[au.lIlllIlllllI[107]] = SUPERCOMPOST;
        auArray[au.lIlllIlllllI[109]] = ULTRACOMPOST;
        auArray[au.lIlllIlllllI[110]] = ROTTEN_TOMATO;
        auArray[au.lIlllIlllllI[112]] = EMPTY_GIANT_COMPOST_BIN;
        auArray[au.lIlllIlllllI[113]] = GIANT_COMPOST;
        auArray[au.lIlllIlllllI[115]] = GIANT_SUPERCOMPOST;
        auArray[au.lIlllIlllllI[116]] = GIANT_ULTRACOMPOST;
        auArray[au.lIlllIlllllI[118]] = GIANT_ROTTEN_TOMATO;
        $VALUES = auArray;
    }

    private GameEnum4(String string2, String string3, P p2, int n3, int n4, int n5) {
        this(string2, string3, p2, n3, n4, n5, lIlllIlllllI[0], lIlllIlllllI[1]);
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static au d(String string) {
        void var2;
        au[] auArray = au.values();
        int n2 = auArray.length;
        int var3 = lIlllIlllllI[0];
        while (au.lllIlllIIIlIII(var3, (int)var2)) {
            String var4;
            void var5;
            void var6 = var5[var3];
            if (au.lllIlllIIIlIlI(var6.k().equalsIgnoreCase(var4) ? 1 : 0)) {
                return var6;
            }
            ++var3;

            if (2 < 3) continue;
            return null;
        }
        return null;
    }

    private static void lllIllIlIlIlll() {
        lIlllIIlllII = new String[lIlllIlllllI[283]];
        au.lIlllIIlllII[au.lIlllIlllllI[0]] = "WEEDS";
        au.lIlllIIlllII[au.lIlllIlllllI[1]] = "Weeds";
        au.lIlllIIlllII[au.lIlllIlllllI[5]] = "SCARECROW";
        au.lIlllIIlllII[au.lIlllIlllllI[6]] = "Scarecrow";
        au.lIlllIIlllII[au.lIlllIlllllI[4]] = "POTATO";
        au.lIlllIIlllII[au.lIlllIlllllI[3]] = "Potato";
        au.lIlllIIlllII[au.lIlllIlllllI[8]] = "Potatoes";
        au.lIlllIIlllII[au.lIlllIlllllI[11]] = "ONION";
        au.lIlllIIlllII[au.lIlllIlllllI[12]] = "Onion";
        au.lIlllIIlllII[au.lIlllIlllllI[13]] = "Onions";
        au.lIlllIIlllII[au.lIlllIlllllI[10]] = "CABBAGE";
        au.lIlllIIlllII[au.lIlllIlllllI[15]] = "Cabbage";
        au.lIlllIIlllII[au.lIlllIlllllI[16]] = "Cabbages";
        au.lIlllIIlllII[au.lIlllIlllllI[18]] = "TOMATO";
        au.lIlllIIlllII[au.lIlllIlllllI[19]] = "Tomato";
        au.lIlllIIlllII[au.lIlllIlllllI[20]] = "Tomatoes";
        au.lIlllIIlllII[au.lIlllIlllllI[22]] = "SWEETCORN";
        au.lIlllIIlllII[au.lIlllIlllllI[23]] = "Sweetcorn";
        au.lIlllIIlllII[au.lIlllIlllllI[25]] = "STRAWBERRY";
        au.lIlllIIlllII[au.lIlllIlllllI[26]] = "Strawberry";
        au.lIlllIIlllII[au.lIlllIlllllI[27]] = "Strawberries";
        au.lIlllIIlllII[au.lIlllIlllllI[29]] = "WATERMELON";
        au.lIlllIIlllII[au.lIlllIlllllI[30]] = "Watermelon";
        au.lIlllIIlllII[au.lIlllIlllllI[31]] = "Watermelons";
        au.lIlllIIlllII[au.lIlllIlllllI[33]] = "SNAPE_GRASS";
        au.lIlllIIlllII[au.lIlllIlllllI[34]] = "Snape grass";
        au.lIlllIIlllII[au.lIlllIlllllI[36]] = "MARIGOLD";
        au.lIlllIIlllII[au.lIlllIlllllI[37]] = "Marigold";
        au.lIlllIIlllII[au.lIlllIlllllI[38]] = "Marigolds";
        au.lIlllIIlllII[au.lIlllIlllllI[40]] = "ROSEMARY";
        au.lIlllIIlllII[au.lIlllIlllllI[41]] = "Rosemary";
        au.lIlllIIlllII[au.lIlllIlllllI[43]] = "NASTURTIUM";
        au.lIlllIIlllII[au.lIlllIlllllI[44]] = "Nasturtium";
        au.lIlllIIlllII[au.lIlllIlllllI[45]] = "Nasturtiums";
        au.lIlllIIlllII[au.lIlllIlllllI[47]] = "WOAD";
        au.lIlllIIlllII[au.lIlllIlllllI[48]] = "Woad";
        au.lIlllIIlllII[au.lIlllIlllllI[50]] = "LIMPWURT";
        au.lIlllIIlllII[au.lIlllIlllllI[51]] = "Limpwurt";
        au.lIlllIIlllII[au.lIlllIlllllI[52]] = "Limpwurt roots";
        au.lIlllIIlllII[au.lIlllIlllllI[54]] = "WHITE_LILY";
        au.lIlllIIlllII[au.lIlllIlllllI[55]] = "White lily";
        au.lIlllIIlllII[au.lIlllIlllllI[56]] = "White lillies";
        au.lIlllIIlllII[au.lIlllIlllllI[58]] = "REDBERRIES";
        au.lIlllIIlllII[au.lIlllIlllllI[59]] = "Redberry";
        au.lIlllIIlllII[au.lIlllIlllllI[60]] = "Redberries";
        au.lIlllIIlllII[au.lIlllIlllllI[62]] = "CADAVABERRIES";
        au.lIlllIIlllII[au.lIlllIlllllI[63]] = "Cadavaberry";
        au.lIlllIIlllII[au.lIlllIlllllI[64]] = "Cadava berries";
        au.lIlllIIlllII[au.lIlllIlllllI[66]] = "DWELLBERRIES";
        au.lIlllIIlllII[au.lIlllIlllllI[67]] = "Dwellberry";
        au.lIlllIIlllII[au.lIlllIlllllI[68]] = "Dwellberries";
        au.lIlllIIlllII[au.lIlllIlllllI[70]] = "JANGERBERRIES";
        au.lIlllIIlllII[au.lIlllIlllllI[71]] = "Jangerberry";
        au.lIlllIIlllII[au.lIlllIlllllI[72]] = "Jangerberries";
        au.lIlllIIlllII[au.lIlllIlllllI[74]] = "WHITEBERRIES";
        au.lIlllIIlllII[au.lIlllIlllllI[75]] = "Whiteberry";
        au.lIlllIIlllII[au.lIlllIlllllI[76]] = "White berries";
        au.lIlllIIlllII[au.lIlllIlllllI[78]] = "POISON_IVY";
        au.lIlllIIlllII[au.lIlllIlllllI[79]] = "Poison ivy";
        au.lIlllIIlllII[au.lIlllIlllllI[80]] = "Poison ivy berries";
        au.lIlllIIlllII[au.lIlllIlllllI[82]] = "BARLEY";
        au.lIlllIIlllII[au.lIlllIlllllI[83]] = "Barley";
        au.lIlllIIlllII[au.lIlllIlllllI[85]] = "HAMMERSTONE";
        au.lIlllIIlllII[au.lIlllIlllllI[86]] = "Hammerstone";
        au.lIlllIIlllII[au.lIlllIlllllI[88]] = "ASGARNIAN";
        au.lIlllIIlllII[au.lIlllIlllllI[89]] = "Asgarnian";
        au.lIlllIIlllII[au.lIlllIlllllI[91]] = "JUTE";
        au.lIlllIIlllII[au.lIlllIlllllI[92]] = "Jute";
        au.lIlllIIlllII[au.lIlllIlllllI[94]] = "YANILLIAN";
        au.lIlllIIlllII[au.lIlllIlllllI[95]] = "Yanillian";
        au.lIlllIIlllII[au.lIlllIlllllI[97]] = "KRANDORIAN";
        au.lIlllIIlllII[au.lIlllIlllllI[98]] = "Krandorian";
        au.lIlllIIlllII[au.lIlllIlllllI[100]] = "WILDBLOOD";
        au.lIlllIIlllII[au.lIlllIlllllI[101]] = "Wildblood";
        au.lIlllIIlllII[au.lIlllIlllllI[103]] = "GUAM";
        au.lIlllIIlllII[au.lIlllIlllllI[104]] = "Guam";
        au.lIlllIIlllII[au.lIlllIlllllI[106]] = "MARRENTILL";
        au.lIlllIIlllII[au.lIlllIlllllI[107]] = "Marrentill";
        au.lIlllIIlllII[au.lIlllIlllllI[109]] = "TARROMIN";
        au.lIlllIIlllII[au.lIlllIlllllI[110]] = "Tarromin";
        au.lIlllIIlllII[au.lIlllIlllllI[112]] = "HARRALANDER";
        au.lIlllIIlllII[au.lIlllIlllllI[113]] = "Harralander";
        au.lIlllIIlllII[au.lIlllIlllllI[115]] = "RANARR";
        au.lIlllIIlllII[au.lIlllIlllllI[116]] = "Ranarr";
        au.lIlllIIlllII[au.lIlllIlllllI[118]] = "TOADFLAX";
        au.lIlllIIlllII[au.lIlllIlllllI[119]] = "Toadflax";
        au.lIlllIIlllII[au.lIlllIlllllI[121]] = "IRIT";
        au.lIlllIIlllII[au.lIlllIlllllI[122]] = "Irit";
        au.lIlllIIlllII[au.lIlllIlllllI[124]] = "AVANTOE";
        au.lIlllIIlllII[au.lIlllIlllllI[125]] = "Avantoe";
        au.lIlllIIlllII[au.lIlllIlllllI[127]] = "KWUARM";
        au.lIlllIIlllII[au.lIlllIlllllI[128]] = "Kwuarm";
        au.lIlllIIlllII[au.lIlllIlllllI[130]] = "SNAPDRAGON";
        au.lIlllIIlllII[au.lIlllIlllllI[131]] = "Snapdragon";
        au.lIlllIIlllII[au.lIlllIlllllI[133]] = "CADANTINE";
        au.lIlllIIlllII[au.lIlllIlllllI[134]] = "Cadantine";
        au.lIlllIIlllII[au.lIlllIlllllI[136]] = "LANTADYME";
        au.lIlllIIlllII[au.lIlllIlllllI[137]] = "Lantadyme";
        au.lIlllIIlllII[au.lIlllIlllllI[139]] = "DWARF_WEED";
        au.lIlllIIlllII[au.lIlllIlllllI[140]] = "Dwarf weed";
        au.lIlllIIlllII[au.lIlllIlllllI[142]] = "TORSTOL";
        au.lIlllIIlllII[au.lIlllIlllllI[143]] = "Torstol";
        au.lIlllIIlllII[au.lIlllIlllllI[145]] = "GOUTWEED";
        au.lIlllIIlllII[au.lIlllIlllllI[146]] = "Goutweed";
        au.lIlllIIlllII[au.lIlllIlllllI[148]] = "ANYHERB";
        au.lIlllIIlllII[au.lIlllIlllllI[149]] = "Any herb";
        au.lIlllIIlllII[au.lIlllIlllllI[150]] = "OAK";
        au.lIlllIIlllII[au.lIlllIlllllI[151]] = "Oak";
        au.lIlllIIlllII[au.lIlllIlllllI[152]] = "Oak tree";
        au.lIlllIIlllII[au.lIlllIlllllI[154]] = "WILLOW";
        au.lIlllIIlllII[au.lIlllIlllllI[155]] = "Willow";
        au.lIlllIIlllII[au.lIlllIlllllI[156]] = "Willow tree";
        au.lIlllIIlllII[au.lIlllIlllllI[158]] = "MAPLE";
        au.lIlllIIlllII[au.lIlllIlllllI[159]] = "Maple";
        au.lIlllIIlllII[au.lIlllIlllllI[160]] = "Maple tree";
        au.lIlllIIlllII[au.lIlllIlllllI[162]] = "YEW";
        au.lIlllIIlllII[au.lIlllIlllllI[163]] = "Yew";
        au.lIlllIIlllII[au.lIlllIlllllI[164]] = "Yew tree";
        au.lIlllIIlllII[au.lIlllIlllllI[166]] = "MAGIC";
        au.lIlllIIlllII[au.lIlllIlllllI[167]] = "Magic";
        au.lIlllIIlllII[au.lIlllIlllllI[168]] = "Magic tree";
        au.lIlllIIlllII[au.lIlllIlllllI[170]] = "APPLE";
        au.lIlllIIlllII[au.lIlllIlllllI[171]] = "Apple";
        au.lIlllIIlllII[au.lIlllIlllllI[172]] = "Apple tree";
        au.lIlllIIlllII[au.lIlllIlllllI[175]] = "BANANA";
        au.lIlllIIlllII[au.lIlllIlllllI[176]] = "Banana";
        au.lIlllIIlllII[au.lIlllIlllllI[177]] = "Banana tree";
        au.lIlllIIlllII[au.lIlllIlllllI[179]] = "ORANGE";
        au.lIlllIIlllII[au.lIlllIlllllI[180]] = "Orange";
        au.lIlllIIlllII[au.lIlllIlllllI[181]] = "Orange tree";
        au.lIlllIIlllII[au.lIlllIlllllI[183]] = "CURRY";
        au.lIlllIIlllII[au.lIlllIlllllI[184]] = "Curry";
        au.lIlllIIlllII[au.lIlllIlllllI[185]] = "Curry tree";
        au.lIlllIIlllII[au.lIlllIlllllI[187]] = "PINEAPPLE";
        au.lIlllIIlllII[au.lIlllIlllllI[188]] = "Pineapple";
        au.lIlllIIlllII[au.lIlllIlllllI[189]] = "Pineapple plant";
        au.lIlllIIlllII[au.lIlllIlllllI[191]] = "PAPAYA";
        au.lIlllIIlllII[au.lIlllIlllllI[192]] = "Papaya";
        au.lIlllIIlllII[au.lIlllIlllllI[193]] = "Papaya tree";
        au.lIlllIIlllII[au.lIlllIlllllI[195]] = "PALM";
        au.lIlllIIlllII[au.lIlllIlllllI[196]] = "Palm";
        au.lIlllIIlllII[au.lIlllIlllllI[197]] = "Palm tree";
        au.lIlllIIlllII[au.lIlllIlllllI[199]] = "DRAGONFRUIT";
        au.lIlllIIlllII[au.lIlllIlllllI[200]] = "Dragonfruit";
        au.lIlllIIlllII[au.lIlllIlllllI[201]] = "Dragonfruit tree";
        au.lIlllIIlllII[au.lIlllIlllllI[203]] = "CACTUS";
        au.lIlllIIlllII[au.lIlllIlllllI[204]] = "Cactus";
        au.lIlllIIlllII[au.lIlllIlllllI[206]] = "POTATO_CACTUS";
        au.lIlllIIlllII[au.lIlllIlllllI[207]] = "Potato cactus";
        au.lIlllIIlllII[au.lIlllIlllllI[208]] = "Potato cacti";
        au.lIlllIIlllII[au.lIlllIlllllI[210]] = "TEAK";
        au.lIlllIIlllII[au.lIlllIlllllI[211]] = "Teak";
        au.lIlllIIlllII[au.lIlllIlllllI[214]] = "MAHOGANY";
        au.lIlllIIlllII[au.lIlllIlllllI[215]] = "Mahogany";
        au.lIlllIIlllII[au.lIlllIlllllI[217]] = "ATTAS";
        au.lIlllIIlllII[au.lIlllIlllllI[218]] = "Attas";
        au.lIlllIIlllII[au.lIlllIlllllI[220]] = "IASOR";
        au.lIlllIIlllII[au.lIlllIlllllI[221]] = "Iasor";
        au.lIlllIIlllII[au.lIlllIlllllI[223]] = "KRONOS";
        au.lIlllIIlllII[au.lIlllIlllllI[224]] = "Kronos";
        au.lIlllIIlllII[au.lIlllIlllllI[174]] = "SEAWEED";
        au.lIlllIIlllII[au.lIlllIlllllI[226]] = "Seaweed";
        au.lIlllIIlllII[au.lIlllIlllllI[228]] = "GRAPE";
        au.lIlllIIlllII[au.lIlllIlllllI[229]] = "Grape";
        au.lIlllIIlllII[au.lIlllIlllllI[231]] = "MUSHROOM";
        au.lIlllIIlllII[au.lIlllIlllllI[232]] = "Mushroom";
        au.lIlllIIlllII[au.lIlllIlllllI[234]] = "BELLADONNA";
        au.lIlllIIlllII[au.lIlllIlllllI[235]] = "Belladonna";
        au.lIlllIIlllII[au.lIlllIlllllI[237]] = "CALQUAT";
        au.lIlllIIlllII[au.lIlllIlllllI[238]] = "Calquat";
        au.lIlllIIlllII[au.lIlllIlllllI[240]] = "SPIRIT_TREE";
        au.lIlllIIlllII[au.lIlllIlllllI[241]] = "Spirit tree";
        au.lIlllIIlllII[au.lIlllIlllllI[244]] = "CELASTRUS";
        au.lIlllIIlllII[au.lIlllIlllllI[245]] = "Celastrus";
        au.lIlllIIlllII[au.lIlllIlllllI[246]] = "Celastrus tree";
        au.lIlllIIlllII[au.lIlllIlllllI[248]] = "REDWOOD";
        au.lIlllIIlllII[au.lIlllIlllllI[249]] = "Redwood";
        au.lIlllIIlllII[au.lIlllIlllllI[250]] = "Redwood tree";
        au.lIlllIIlllII[au.lIlllIlllllI[252]] = "HESPORI";
        au.lIlllIIlllII[au.lIlllIlllllI[253]] = "Hespori";
        au.lIlllIIlllII[au.lIlllIlllllI[255]] = "CRYSTAL_TREE";
        au.lIlllIIlllII[au.lIlllIlllllI[256]] = "Crystal tree";
        au.lIlllIIlllII[au.lIlllIlllllI[258]] = "EMPTY_COMPOST_BIN";
        au.lIlllIIlllII[au.lIlllIlllllI[259]] = "Compost Bin";
        au.lIlllIIlllII[au.lIlllIlllllI[261]] = "COMPOST";
        au.lIlllIIlllII[au.lIlllIlllllI[262]] = "Compost";
        au.lIlllIIlllII[au.lIlllIlllllI[264]] = "SUPERCOMPOST";
        au.lIlllIIlllII[au.lIlllIlllllI[265]] = "Supercompost";
        au.lIlllIIlllII[au.lIlllIlllllI[267]] = "ULTRACOMPOST";
        au.lIlllIIlllII[au.lIlllIlllllI[268]] = "Ultracompost";
        au.lIlllIIlllII[au.lIlllIlllllI[270]] = "ROTTEN_TOMATO";
        au.lIlllIIlllII[au.lIlllIlllllI[271]] = "Rotten Tomato";
        au.lIlllIIlllII[au.lIlllIlllllI[273]] = "EMPTY_GIANT_COMPOST_BIN";
        au.lIlllIIlllII[au.lIlllIlllllI[274]] = "Giant Compost Bin";
        au.lIlllIIlllII[au.lIlllIlllllI[275]] = "GIANT_COMPOST";
        au.lIlllIIlllII[au.lIlllIlllllI[276]] = "Compost";
        au.lIlllIIlllII[au.lIlllIlllllI[277]] = "GIANT_SUPERCOMPOST";
        au.lIlllIIlllII[au.lIlllIlllllI[278]] = "Supercompost";
        au.lIlllIIlllII[au.lIlllIlllllI[279]] = "GIANT_ULTRACOMPOST";
        au.lIlllIIlllII[au.lIlllIlllllI[280]] = "Ultracompost";
        au.lIlllIIlllII[au.lIlllIlllllI[281]] = "GIANT_ROTTEN_TOMATO";
        au.lIlllIIlllII[au.lIlllIlllllI[282]] = "Rotten Tomato";
    }

    public String k() {
        return this.contractName;
    }

    private GameEnum4(String string2, int n3, int n4, int n5) {
        this(string2, string2, null, n3, n4, n5, lIlllIlllllI[0], lIlllIlllllI[1]);
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

    private static boolean lllIlllIIIlIlI(int n2) {
        return n2 != 0;
    }

    private GameEnum4(String string2, P p2, int n3, int n4, int n5, int n6, int n7) {
        this(string2, string2, p2, n3, n4, n5, n6, n7);
    }

    private static boolean lllIlllIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum4(String string2, P p2, int n3, int n4, int n5) {
        this(string2, string2, p2, n3, n4, n5, lIlllIlllllI[0], lIlllIlllllI[1]);
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static au g(int n2) {
        void var7;
        au[] auArray = au.values();
        int n3 = auArray.length;
        int var8 = lIlllIlllllI[0];
        while (au.lllIlllIIIlIII(var8, (int)var7)) {
            int var9;
            void var10;
            void var11 = var10[var8];
            if (au.lllIlllIIIlIIl(var11.GameEnum4(), var9)) {
                return var11;
            }
            ++var8;

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

    private static boolean lllIlllIIIllII(Object object, Object object2) {
        return object == object2;
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

