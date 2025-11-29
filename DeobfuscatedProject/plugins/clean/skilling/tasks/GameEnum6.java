/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum6
extends Enum<o> {
    public static final  /* enum */ o EMERALD_AMULET;
    public static final  /* enum */ o OPAL_AMULET;
    public static final  /* enum */ o ONYX_RING;
    public static final  /* enum */ o GOLD_NECKLACE;
    public static final  /* enum */ o DRAGONSTONE_RING;
    public static final  /* enum */ o RUBY_BRACELET;
    private final  int craftingWidgetGroup;
    public static final  /* enum */ o RUBY_NECKLACE;
    public static final  /* enum */ o ZENYTE_BRACELET;
    public static final  /* enum */ o EMERALD_BRACELET;
    public static final  /* enum */ o DIAMOND_BRACELET;
    private final  int materialID;
    public static final  /* enum */ o RUBY_RING;
    public static final  /* enum */ o DIAMOND_AMULET;
    public static final  /* enum */ o ONYX_AMULET;
    public static final  /* enum */ o OPAL_RING;
    private final  int finishedID;
    public static final  /* enum */ o OPAL_NECKLACE;
    public static final  /* enum */ o JADE_NECKLACE;
    public static final  /* enum */ o EMERALD_NECKLACE;
    public static final  /* enum */ o ONYX_NECKLACE;
    public static final  /* enum */ o SAPPHIRE_AMULET;
    private final  String craftingOption;
    
    private final  int mouldID;
    public static final  /* enum */ o GOLD_RING;
    public static final  /* enum */ o DRAGONSTONE_BRACELET;
    public static final  /* enum */ o SAPPHIRE_BRACELET;
    public static final  /* enum */ o OPAL_BRACELET;
    public static final  /* enum */ o ONYX_BRACELET;
    public static final  /* enum */ o TOPAZ_RING;
    public static final  /* enum */ o TOPAZ_NECKLACE;
    public static final  /* enum */ o GOLD_AMULET;
    
    public static final  /* enum */ o SAPPHIRE_NECKLACE;
    public static final  /* enum */ o SAPPHIRE_RING;
    public static final  /* enum */ o RUBY_AMULET;
    public static final  /* enum */ o JADE_RING;
    public static final  /* enum */ o GOLD_BRACELET;
    public static final  /* enum */ o TOPAZ_BRACELET;
    public static final  /* enum */ o DRAGONSTONE_NECKLACE;
    public static final  /* enum */ o ZENYTE_AMULET;
    public static final  /* enum */ o EMERALD_RING;
    public static final  /* enum */ o DRAGONSTONE_AMULET;
    public static final  /* enum */ o JADE_AMULET;
    public static final  /* enum */ o DIAMOND_RING;
    public static final  /* enum */ o TOPAZ_AMULET;
    public static final  /* enum */ o JADE_BRACELET;
    private final  int secondaryID;
    public static final  /* enum */ o DIAMOND_NECKLACE;
    public static final  /* enum */ o ZENYTE_NECKLACE;
    private final  int craftingWidgetID;
    private static final  o[] $VALUES;
    public static final  /* enum */ o ZENYTE_RING;

    private GameEnum6(int n3, int n4, int n5, int n6, int n7, int n8, String string2) {
        this.materialID = n3;
        this.secondaryID = n4;
        this.mouldID = n5;
        this.finishedID = n6;
        this.craftingWidgetGroup = n7;
        this.craftingWidgetID = n8;
        this.craftingOption = string2;
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    public int K() {
        return this.craftingWidgetID;
    }

    public int z() {
        return this.materialID;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    static {
        o.lIlIllllllllll();
        o.lIlIlllllllllI();
        GOLD_RING = new GameEnum6(lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[4], lllIlIlIllI[5], lllIlIlIllI[6], lllIlIlIlIl[lllIlIlIllI[7]]);
        GOLD_NECKLACE = new GameEnum6(lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[10], lllIlIlIllI[5], lllIlIlIllI[11], lllIlIlIlIl[lllIlIlIllI[12]]);
        GOLD_AMULET = new GameEnum6(lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[15], lllIlIlIllI[5], lllIlIlIllI[16], lllIlIlIlIl[lllIlIlIllI[17]]);
        GOLD_BRACELET = new GameEnum6(lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[20], lllIlIlIllI[5], lllIlIlIllI[21], lllIlIlIlIl[lllIlIlIllI[22]]);
        OPAL_RING = new GameEnum6(lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[25], lllIlIlIllI[18], lllIlIlIllI[22], lllIlIlIlIl[lllIlIlIllI[26]]);
        OPAL_NECKLACE = new GameEnum6(lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[28], lllIlIlIllI[18], lllIlIlIllI[29], lllIlIlIlIl[lllIlIlIllI[29]]);
        OPAL_BRACELET = new GameEnum6(lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[31], lllIlIlIllI[18], lllIlIlIllI[32], lllIlIlIlIl[lllIlIlIllI[33]]);
        OPAL_AMULET = new GameEnum6(lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[35], lllIlIlIllI[18], lllIlIlIllI[36], lllIlIlIlIl[lllIlIlIllI[36]]);
        JADE_RING = new GameEnum6(lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[39], lllIlIlIllI[18], lllIlIlIllI[6], lllIlIlIlIl[lllIlIlIllI[40]]);
        JADE_NECKLACE = new GameEnum6(lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[42], lllIlIlIllI[18], lllIlIlIllI[30], lllIlIlIlIl[lllIlIlIllI[32]]);
        JADE_BRACELET = new GameEnum6(lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[44], lllIlIlIllI[18], lllIlIlIllI[43], lllIlIlIlIl[lllIlIlIllI[45]]);
        JADE_AMULET = new GameEnum6(lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[47], lllIlIlIllI[18], lllIlIlIllI[37], lllIlIlIlIl[lllIlIlIllI[11]]);
        TOPAZ_RING = new GameEnum6(lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[50], lllIlIlIllI[18], lllIlIlIllI[26], lllIlIlIlIl[lllIlIlIllI[51]]);
        TOPAZ_NECKLACE = new GameEnum6(lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[53], lllIlIlIllI[18], lllIlIlIllI[33], lllIlIlIlIl[lllIlIlIllI[54]]);
        TOPAZ_BRACELET = new GameEnum6(lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[56], lllIlIlIllI[18], lllIlIlIllI[45], lllIlIlIlIl[lllIlIlIllI[57]]);
        TOPAZ_AMULET = new GameEnum6(lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[59], lllIlIlIllI[18], lllIlIlIllI[40], lllIlIlIlIl[lllIlIlIllI[60]]);
        SAPPHIRE_RING = new GameEnum6(lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[63], lllIlIlIllI[5], lllIlIlIllI[26], lllIlIlIlIl[lllIlIlIllI[64]]);
        SAPPHIRE_NECKLACE = new GameEnum6(lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[66], lllIlIlIllI[5], lllIlIlIllI[48], lllIlIlIlIl[lllIlIlIllI[67]]);
        SAPPHIRE_BRACELET = new GameEnum6(lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[69], lllIlIlIllI[5], lllIlIlIllI[70], lllIlIlIlIl[lllIlIlIllI[16]]);
        SAPPHIRE_AMULET = new GameEnum6(lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[72], lllIlIlIllI[5], lllIlIlIllI[71], lllIlIlIlIl[lllIlIlIllI[73]]);
        EMERALD_RING = new GameEnum6(lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[76], lllIlIlIllI[5], lllIlIlIllI[27], lllIlIlIlIl[lllIlIlIllI[77]]);
        EMERALD_NECKLACE = new GameEnum6(lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[79], lllIlIlIllI[5], lllIlIlIllI[51], lllIlIlIlIl[lllIlIlIllI[80]]);
        EMERALD_BRACELET = new GameEnum6(lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[82], lllIlIlIllI[5], lllIlIlIllI[83], lllIlIlIlIl[lllIlIlIllI[84]]);
        EMERALD_AMULET = new GameEnum6(lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[86], lllIlIlIllI[5], lllIlIlIllI[73], lllIlIlIlIl[lllIlIlIllI[87]]);
        RUBY_RING = new GameEnum6(lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[90], lllIlIlIllI[5], lllIlIlIllI[29], lllIlIlIlIl[lllIlIlIllI[91]]);
        RUBY_NECKLACE = new GameEnum6(lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[92], lllIlIlIllI[5], lllIlIlIllI[52], lllIlIlIlIl[lllIlIlIllI[93]]);
        RUBY_BRACELET = new GameEnum6(lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[94], lllIlIlIllI[5], lllIlIlIllI[95], lllIlIlIlIl[lllIlIlIllI[83]]);
        RUBY_AMULET = new GameEnum6(lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[96], lllIlIlIllI[5], lllIlIlIllI[74], lllIlIlIlIl[lllIlIlIllI[97]]);
        DIAMOND_RING = new GameEnum6(lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[100], lllIlIlIllI[5], lllIlIlIllI[30], lllIlIlIlIl[lllIlIlIllI[101]]);
        DIAMOND_NECKLACE = new GameEnum6(lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[103], lllIlIlIllI[5], lllIlIlIllI[54], lllIlIlIlIl[lllIlIlIllI[104]]);
        DIAMOND_BRACELET = new GameEnum6(lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[106], lllIlIlIllI[5], lllIlIlIllI[97], lllIlIlIlIl[lllIlIlIllI[107]]);
        DIAMOND_AMULET = new GameEnum6(lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[109], lllIlIlIllI[5], lllIlIlIllI[77], lllIlIlIlIl[lllIlIlIllI[110]]);
        DRAGONSTONE_RING = new GameEnum6(lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[113], lllIlIlIllI[5], lllIlIlIllI[33], lllIlIlIlIl[lllIlIlIllI[114]]);
        DRAGONSTONE_NECKLACE = new GameEnum6(lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[116], lllIlIlIllI[5], lllIlIlIllI[55], lllIlIlIlIl[lllIlIlIllI[117]]);
        DRAGONSTONE_BRACELET = new GameEnum6(lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[119], lllIlIlIllI[5], lllIlIlIllI[98], lllIlIlIlIl[lllIlIlIllI[120]]);
        DRAGONSTONE_AMULET = new GameEnum6(lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[122], lllIlIlIllI[5], lllIlIlIllI[78], lllIlIlIlIl[lllIlIlIllI[123]]);
        ONYX_RING = new GameEnum6(lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[126], lllIlIlIllI[5], lllIlIlIllI[34], lllIlIlIlIl[lllIlIlIllI[127]]);
        ONYX_NECKLACE = new GameEnum6(lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[129], lllIlIlIllI[5], lllIlIlIllI[57], lllIlIlIlIl[lllIlIlIllI[130]]);
        ONYX_BRACELET = new GameEnum6(lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[132], lllIlIlIllI[5], lllIlIlIllI[101], lllIlIlIlIl[lllIlIlIllI[133]]);
        ONYX_AMULET = new GameEnum6(lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[135], lllIlIlIllI[5], lllIlIlIllI[80], lllIlIlIlIl[lllIlIlIllI[136]]);
        ZENYTE_RING = new GameEnum6(lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[139], lllIlIlIllI[5], lllIlIlIllI[36], lllIlIlIlIl[lllIlIlIllI[140]]);
        ZENYTE_NECKLACE = new GameEnum6(lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[142], lllIlIlIllI[5], lllIlIlIllI[58], lllIlIlIlIl[lllIlIlIllI[143]]);
        ZENYTE_BRACELET = new GameEnum6(lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[145], lllIlIlIllI[5], lllIlIlIllI[102], lllIlIlIlIl[lllIlIlIllI[146]]);
        ZENYTE_AMULET = new GameEnum6(lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[148], lllIlIlIllI[5], lllIlIlIllI[81], lllIlIlIlIl[lllIlIlIllI[149]]);
        o[] oArray = new o[lllIlIlIllI[81]];
        oArray[o.lllIlIlIllI[1]] = GOLD_RING;
        oArray[o.lllIlIlIllI[7]] = GOLD_NECKLACE;
        oArray[o.lllIlIlIllI[8]] = GOLD_AMULET;
        oArray[o.lllIlIlIllI[12]] = GOLD_BRACELET;
        oArray[o.lllIlIlIllI[13]] = OPAL_RING;
        oArray[o.lllIlIlIllI[17]] = OPAL_NECKLACE;
        oArray[o.lllIlIlIllI[18]] = OPAL_BRACELET;
        oArray[o.lllIlIlIllI[22]] = OPAL_AMULET;
        oArray[o.lllIlIlIllI[6]] = JADE_RING;
        oArray[o.lllIlIlIllI[26]] = JADE_NECKLACE;
        oArray[o.lllIlIlIllI[27]] = JADE_BRACELET;
        oArray[o.lllIlIlIllI[29]] = JADE_AMULET;
        oArray[o.lllIlIlIllI[30]] = TOPAZ_RING;
        oArray[o.lllIlIlIllI[33]] = TOPAZ_NECKLACE;
        oArray[o.lllIlIlIllI[34]] = TOPAZ_BRACELET;
        oArray[o.lllIlIlIllI[36]] = TOPAZ_AMULET;
        oArray[o.lllIlIlIllI[37]] = SAPPHIRE_RING;
        oArray[o.lllIlIlIllI[40]] = SAPPHIRE_NECKLACE;
        oArray[o.lllIlIlIllI[41]] = SAPPHIRE_BRACELET;
        oArray[o.lllIlIlIllI[32]] = SAPPHIRE_AMULET;
        oArray[o.lllIlIlIllI[43]] = EMERALD_RING;
        oArray[o.lllIlIlIllI[45]] = EMERALD_NECKLACE;
        oArray[o.lllIlIlIllI[46]] = EMERALD_BRACELET;
        oArray[o.lllIlIlIllI[11]] = EMERALD_AMULET;
        oArray[o.lllIlIlIllI[48]] = RUBY_RING;
        oArray[o.lllIlIlIllI[51]] = RUBY_NECKLACE;
        oArray[o.lllIlIlIllI[52]] = RUBY_BRACELET;
        oArray[o.lllIlIlIllI[54]] = RUBY_AMULET;
        oArray[o.lllIlIlIllI[55]] = DIAMOND_RING;
        oArray[o.lllIlIlIllI[57]] = DIAMOND_NECKLACE;
        oArray[o.lllIlIlIllI[58]] = DIAMOND_BRACELET;
        oArray[o.lllIlIlIllI[60]] = DIAMOND_AMULET;
        oArray[o.lllIlIlIllI[61]] = DRAGONSTONE_RING;
        oArray[o.lllIlIlIllI[64]] = DRAGONSTONE_NECKLACE;
        oArray[o.lllIlIlIllI[65]] = DRAGONSTONE_BRACELET;
        oArray[o.lllIlIlIllI[67]] = DRAGONSTONE_AMULET;
        oArray[o.lllIlIlIllI[68]] = ONYX_RING;
        oArray[o.lllIlIlIllI[16]] = ONYX_NECKLACE;
        oArray[o.lllIlIlIllI[71]] = ONYX_BRACELET;
        oArray[o.lllIlIlIllI[73]] = ONYX_AMULET;
        oArray[o.lllIlIlIllI[74]] = ZENYTE_RING;
        oArray[o.lllIlIlIllI[77]] = ZENYTE_NECKLACE;
        oArray[o.lllIlIlIllI[78]] = ZENYTE_BRACELET;
        oArray[o.lllIlIlIllI[80]] = ZENYTE_AMULET;
        $VALUES = oArray;
    }

        return String.valueOf(var1);
    }

    public String L() {
        return this.craftingOption;
    }

    private static boolean lIllIIIIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public int E() {
        return this.finishedID;
    }

    public int J() {
        return this.craftingWidgetGroup;
    }

    private GameEnum6(int n3, int n4, int n5, int n6, int n7, String string2) {
        this.materialID = n3;
        this.secondaryID = lllIlIlIllI[0];
        this.mouldID = n4;
        this.finishedID = n5;
        this.craftingWidgetGroup = n6;
        this.craftingWidgetID = n7;
        this.craftingOption = string2;
    }

    public int I() {
        return this.mouldID;
    }

    private static void lIlIlllllllllI() {
        lllIlIlIlIl = new String[lllIlIlIllI[150]];
        o.lllIlIlIlIl[o.lllIlIlIllI[1]] = "GOLD_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[7]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[8]] = "GOLD_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[12]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[13]] = "GOLD_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[17]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[18]] = "GOLD_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[22]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[6]] = "OPAL_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[26]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[27]] = "OPAL_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[29]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[30]] = "OPAL_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[33]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[34]] = "OPAL_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[36]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[37]] = "JADE_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[40]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[41]] = "JADE_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[32]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[43]] = "JADE_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[45]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[46]] = "JADE_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[11]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[48]] = "TOPAZ_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[51]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[52]] = "TOPAZ_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[54]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[55]] = "TOPAZ_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[57]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[58]] = "TOPAZ_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[60]] = "Craft";
        o.lllIlIlIlIl[o.lllIlIlIllI[61]] = "SAPPHIRE_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[64]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[65]] = "SAPPHIRE_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[67]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[68]] = "SAPPHIRE_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[16]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[71]] = "SAPPHIRE_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[73]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[74]] = "EMERALD_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[77]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[78]] = "EMERALD_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[80]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[81]] = "EMERALD_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[84]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[85]] = "EMERALD_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[87]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[88]] = "RUBY_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[91]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[21]] = "RUBY_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[93]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[70]] = "RUBY_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[83]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[95]] = "RUBY_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[97]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[98]] = "DIAMOND_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[101]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[102]] = "DIAMOND_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[104]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[105]] = "DIAMOND_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[107]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[108]] = "DIAMOND_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[110]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[111]] = "DRAGONSTONE_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[114]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[115]] = "DRAGONSTONE_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[117]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[118]] = "DRAGONSTONE_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[120]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[121]] = "DRAGONSTONE_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[123]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[124]] = "ONYX_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[127]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[128]] = "ONYX_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[130]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[131]] = "ONYX_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[133]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[134]] = "ONYX_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[136]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[137]] = "ZENYTE_RING";
        o.lllIlIlIlIl[o.lllIlIlIllI[140]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[141]] = "ZENYTE_NECKLACE";
        o.lllIlIlIlIl[o.lllIlIlIllI[143]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[144]] = "ZENYTE_BRACELET";
        o.lllIlIlIlIl[o.lllIlIlIllI[146]] = "Make";
        o.lllIlIlIlIl[o.lllIlIlIllI[147]] = "ZENYTE_AMULET";
        o.lllIlIlIlIl[o.lllIlIlIllI[149]] = "Make";
    }

    public int H() {
        return this.secondaryID;
    }

}

