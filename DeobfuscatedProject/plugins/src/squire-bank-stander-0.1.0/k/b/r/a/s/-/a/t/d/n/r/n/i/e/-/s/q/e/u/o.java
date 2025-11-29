/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class o
extends Enum<o> {
    public static final /* synthetic */ /* enum */ o EMERALD_AMULET;
    public static final /* synthetic */ /* enum */ o OPAL_AMULET;
    public static final /* synthetic */ /* enum */ o ONYX_RING;
    public static final /* synthetic */ /* enum */ o GOLD_NECKLACE;
    public static final /* synthetic */ /* enum */ o DRAGONSTONE_RING;
    public static final /* synthetic */ /* enum */ o RUBY_BRACELET;
    private final /* synthetic */ int craftingWidgetGroup;
    public static final /* synthetic */ /* enum */ o RUBY_NECKLACE;
    public static final /* synthetic */ /* enum */ o ZENYTE_BRACELET;
    public static final /* synthetic */ /* enum */ o EMERALD_BRACELET;
    public static final /* synthetic */ /* enum */ o DIAMOND_BRACELET;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ /* enum */ o RUBY_RING;
    public static final /* synthetic */ /* enum */ o DIAMOND_AMULET;
    public static final /* synthetic */ /* enum */ o ONYX_AMULET;
    public static final /* synthetic */ /* enum */ o OPAL_RING;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ /* enum */ o OPAL_NECKLACE;
    public static final /* synthetic */ /* enum */ o JADE_NECKLACE;
    public static final /* synthetic */ /* enum */ o EMERALD_NECKLACE;
    public static final /* synthetic */ /* enum */ o ONYX_NECKLACE;
    public static final /* synthetic */ /* enum */ o SAPPHIRE_AMULET;
    private final /* synthetic */ String craftingOption;
    private static /* synthetic */ int[] lllIlIlIllI;
    private final /* synthetic */ int mouldID;
    public static final /* synthetic */ /* enum */ o GOLD_RING;
    public static final /* synthetic */ /* enum */ o DRAGONSTONE_BRACELET;
    public static final /* synthetic */ /* enum */ o SAPPHIRE_BRACELET;
    public static final /* synthetic */ /* enum */ o OPAL_BRACELET;
    public static final /* synthetic */ /* enum */ o ONYX_BRACELET;
    public static final /* synthetic */ /* enum */ o TOPAZ_RING;
    public static final /* synthetic */ /* enum */ o TOPAZ_NECKLACE;
    public static final /* synthetic */ /* enum */ o GOLD_AMULET;
    private static /* synthetic */ String[] lllIlIlIlIl;
    public static final /* synthetic */ /* enum */ o SAPPHIRE_NECKLACE;
    public static final /* synthetic */ /* enum */ o SAPPHIRE_RING;
    public static final /* synthetic */ /* enum */ o RUBY_AMULET;
    public static final /* synthetic */ /* enum */ o JADE_RING;
    public static final /* synthetic */ /* enum */ o GOLD_BRACELET;
    public static final /* synthetic */ /* enum */ o TOPAZ_BRACELET;
    public static final /* synthetic */ /* enum */ o DRAGONSTONE_NECKLACE;
    public static final /* synthetic */ /* enum */ o ZENYTE_AMULET;
    public static final /* synthetic */ /* enum */ o EMERALD_RING;
    public static final /* synthetic */ /* enum */ o DRAGONSTONE_AMULET;
    public static final /* synthetic */ /* enum */ o JADE_AMULET;
    public static final /* synthetic */ /* enum */ o DIAMOND_RING;
    public static final /* synthetic */ /* enum */ o TOPAZ_AMULET;
    public static final /* synthetic */ /* enum */ o JADE_BRACELET;
    private final /* synthetic */ int secondaryID;
    public static final /* synthetic */ /* enum */ o DIAMOND_NECKLACE;
    public static final /* synthetic */ /* enum */ o ZENYTE_NECKLACE;
    private final /* synthetic */ int craftingWidgetID;
    private static final /* synthetic */ o[] $VALUES;
    public static final /* synthetic */ /* enum */ o ZENYTE_RING;

    private o(int n3, int n4, int n5, int n6, int n7, int n8, String string2) {
        this.materialID = n3;
        this.secondaryID = n4;
        this.mouldID = n5;
        this.finishedID = n6;
        this.craftingWidgetGroup = n7;
        this.craftingWidgetID = n8;
        this.craftingOption = string2;
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private static String lIlIlllllllIll(String llllllllllllllllIIlIIlIIllIIIllI, String llllllllllllllllIIlIIlIIllIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), lllIlIlIllI[6]), "DES");
            Cipher llllllllllllllllIIlIIlIIllIIlIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlIIllIIlIII.init(lllIlIlIllI[8], llllllllllllllllIIlIIlIIllIIlIIl);
            return new String(llllllllllllllllIIlIIlIIllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIIllIIIlll) {
            llllllllllllllllIIlIIlIIllIIIlll.printStackTrace();
            return null;
        }
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
        GOLD_RING = new o(lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[4], lllIlIlIllI[5], lllIlIlIllI[6], lllIlIlIlIl[lllIlIlIllI[7]]);
        GOLD_NECKLACE = new o(lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[10], lllIlIlIllI[5], lllIlIlIllI[11], lllIlIlIlIl[lllIlIlIllI[12]]);
        GOLD_AMULET = new o(lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[15], lllIlIlIllI[5], lllIlIlIllI[16], lllIlIlIlIl[lllIlIlIllI[17]]);
        GOLD_BRACELET = new o(lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[20], lllIlIlIllI[5], lllIlIlIllI[21], lllIlIlIlIl[lllIlIlIllI[22]]);
        OPAL_RING = new o(lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[25], lllIlIlIllI[18], lllIlIlIllI[22], lllIlIlIlIl[lllIlIlIllI[26]]);
        OPAL_NECKLACE = new o(lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[28], lllIlIlIllI[18], lllIlIlIllI[29], lllIlIlIlIl[lllIlIlIllI[29]]);
        OPAL_BRACELET = new o(lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[31], lllIlIlIllI[18], lllIlIlIllI[32], lllIlIlIlIl[lllIlIlIllI[33]]);
        OPAL_AMULET = new o(lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[35], lllIlIlIllI[18], lllIlIlIllI[36], lllIlIlIlIl[lllIlIlIllI[36]]);
        JADE_RING = new o(lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[39], lllIlIlIllI[18], lllIlIlIllI[6], lllIlIlIlIl[lllIlIlIllI[40]]);
        JADE_NECKLACE = new o(lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[42], lllIlIlIllI[18], lllIlIlIllI[30], lllIlIlIlIl[lllIlIlIllI[32]]);
        JADE_BRACELET = new o(lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[44], lllIlIlIllI[18], lllIlIlIllI[43], lllIlIlIlIl[lllIlIlIllI[45]]);
        JADE_AMULET = new o(lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[47], lllIlIlIllI[18], lllIlIlIllI[37], lllIlIlIlIl[lllIlIlIllI[11]]);
        TOPAZ_RING = new o(lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[50], lllIlIlIllI[18], lllIlIlIllI[26], lllIlIlIlIl[lllIlIlIllI[51]]);
        TOPAZ_NECKLACE = new o(lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[53], lllIlIlIllI[18], lllIlIlIllI[33], lllIlIlIlIl[lllIlIlIllI[54]]);
        TOPAZ_BRACELET = new o(lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[56], lllIlIlIllI[18], lllIlIlIllI[45], lllIlIlIlIl[lllIlIlIllI[57]]);
        TOPAZ_AMULET = new o(lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[59], lllIlIlIllI[18], lllIlIlIllI[40], lllIlIlIlIl[lllIlIlIllI[60]]);
        SAPPHIRE_RING = new o(lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[63], lllIlIlIllI[5], lllIlIlIllI[26], lllIlIlIlIl[lllIlIlIllI[64]]);
        SAPPHIRE_NECKLACE = new o(lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[66], lllIlIlIllI[5], lllIlIlIllI[48], lllIlIlIlIl[lllIlIlIllI[67]]);
        SAPPHIRE_BRACELET = new o(lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[69], lllIlIlIllI[5], lllIlIlIllI[70], lllIlIlIlIl[lllIlIlIllI[16]]);
        SAPPHIRE_AMULET = new o(lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[72], lllIlIlIllI[5], lllIlIlIllI[71], lllIlIlIlIl[lllIlIlIllI[73]]);
        EMERALD_RING = new o(lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[76], lllIlIlIllI[5], lllIlIlIllI[27], lllIlIlIlIl[lllIlIlIllI[77]]);
        EMERALD_NECKLACE = new o(lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[79], lllIlIlIllI[5], lllIlIlIllI[51], lllIlIlIlIl[lllIlIlIllI[80]]);
        EMERALD_BRACELET = new o(lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[82], lllIlIlIllI[5], lllIlIlIllI[83], lllIlIlIlIl[lllIlIlIllI[84]]);
        EMERALD_AMULET = new o(lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[86], lllIlIlIllI[5], lllIlIlIllI[73], lllIlIlIlIl[lllIlIlIllI[87]]);
        RUBY_RING = new o(lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[90], lllIlIlIllI[5], lllIlIlIllI[29], lllIlIlIlIl[lllIlIlIllI[91]]);
        RUBY_NECKLACE = new o(lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[92], lllIlIlIllI[5], lllIlIlIllI[52], lllIlIlIlIl[lllIlIlIllI[93]]);
        RUBY_BRACELET = new o(lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[94], lllIlIlIllI[5], lllIlIlIllI[95], lllIlIlIlIl[lllIlIlIllI[83]]);
        RUBY_AMULET = new o(lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[96], lllIlIlIllI[5], lllIlIlIllI[74], lllIlIlIlIl[lllIlIlIllI[97]]);
        DIAMOND_RING = new o(lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[100], lllIlIlIllI[5], lllIlIlIllI[30], lllIlIlIlIl[lllIlIlIllI[101]]);
        DIAMOND_NECKLACE = new o(lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[103], lllIlIlIllI[5], lllIlIlIllI[54], lllIlIlIlIl[lllIlIlIllI[104]]);
        DIAMOND_BRACELET = new o(lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[106], lllIlIlIllI[5], lllIlIlIllI[97], lllIlIlIlIl[lllIlIlIllI[107]]);
        DIAMOND_AMULET = new o(lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[109], lllIlIlIllI[5], lllIlIlIllI[77], lllIlIlIlIl[lllIlIlIllI[110]]);
        DRAGONSTONE_RING = new o(lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[113], lllIlIlIllI[5], lllIlIlIllI[33], lllIlIlIlIl[lllIlIlIllI[114]]);
        DRAGONSTONE_NECKLACE = new o(lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[116], lllIlIlIllI[5], lllIlIlIllI[55], lllIlIlIlIl[lllIlIlIllI[117]]);
        DRAGONSTONE_BRACELET = new o(lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[119], lllIlIlIllI[5], lllIlIlIllI[98], lllIlIlIlIl[lllIlIlIllI[120]]);
        DRAGONSTONE_AMULET = new o(lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[122], lllIlIlIllI[5], lllIlIlIllI[78], lllIlIlIlIl[lllIlIlIllI[123]]);
        ONYX_RING = new o(lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[126], lllIlIlIllI[5], lllIlIlIllI[34], lllIlIlIlIl[lllIlIlIllI[127]]);
        ONYX_NECKLACE = new o(lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[129], lllIlIlIllI[5], lllIlIlIllI[57], lllIlIlIlIl[lllIlIlIllI[130]]);
        ONYX_BRACELET = new o(lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[132], lllIlIlIllI[5], lllIlIlIllI[101], lllIlIlIlIl[lllIlIlIllI[133]]);
        ONYX_AMULET = new o(lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[135], lllIlIlIllI[5], lllIlIlIllI[80], lllIlIlIlIl[lllIlIlIllI[136]]);
        ZENYTE_RING = new o(lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[139], lllIlIlIllI[5], lllIlIlIllI[36], lllIlIlIlIl[lllIlIlIllI[140]]);
        ZENYTE_NECKLACE = new o(lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[142], lllIlIlIllI[5], lllIlIlIllI[58], lllIlIlIlIl[lllIlIlIllI[143]]);
        ZENYTE_BRACELET = new o(lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[145], lllIlIlIllI[5], lllIlIlIllI[102], lllIlIlIlIl[lllIlIlIllI[146]]);
        ZENYTE_AMULET = new o(lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[148], lllIlIlIllI[5], lllIlIlIllI[81], lllIlIlIlIl[lllIlIlIllI[149]]);
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

    private static String lIlIllllllllIl(String llllllllllllllllIIlIIlIIlIllIIIl, String llllllllllllllllIIlIIlIIlIllIIII) {
        llllllllllllllllIIlIIlIIlIllIIIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIlIllIlII = new StringBuilder();
        char[] llllllllllllllllIIlIIlIIlIllIIll = llllllllllllllllIIlIIlIIlIllIIII.toCharArray();
        int llllllllllllllllIIlIIlIIlIllIIlI = lllIlIlIllI[1];
        char[] llllllllllllllllIIlIIlIIlIlIllII = llllllllllllllllIIlIIlIIlIllIIIl.toCharArray();
        int llllllllllllllllIIlIIlIIlIlIlIll = llllllllllllllllIIlIIlIIlIlIllII.length;
        int llllllllllllllllIIlIIlIIlIlIlIlI = lllIlIlIllI[1];
        while (o.lIllIIIIIIIIII(llllllllllllllllIIlIIlIIlIlIlIlI, llllllllllllllllIIlIIlIIlIlIlIll)) {
            char llllllllllllllllIIlIIlIIlIllIlll = llllllllllllllllIIlIIlIIlIlIllII[llllllllllllllllIIlIIlIIlIlIlIlI];
            llllllllllllllllIIlIIlIIlIllIlII.append((char)(llllllllllllllllIIlIIlIIlIllIlll ^ llllllllllllllllIIlIIlIIlIllIIll[llllllllllllllllIIlIIlIIlIllIIlI % llllllllllllllllIIlIIlIIlIllIIll.length]));
            "".length();
            ++llllllllllllllllIIlIIlIIlIllIIlI;
            ++llllllllllllllllIIlIIlIIlIlIlIlI;
            "".length();
            if ((0x87 ^ 0x83) != "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIIlIllIlII);
    }

    public String L() {
        return this.craftingOption;
    }

    private static void lIlIllllllllll() {
        lllIlIlIllI = new int[151];
        o.lllIlIlIllI[0] = -" ".length();
        o.lllIlIlIllI[1] = (0x4A ^ 0x52) & ~(0x9F ^ 0x87);
        o.lllIlIlIllI[2] = 0xFFFFC93F & 0x3FF5;
        o.lllIlIlIllI[3] = 0xFFFFDEBD & 0x277A;
        o.lllIlIlIllI[4] = 0xFFFFF76F & 0xEF3;
        o.lllIlIlIllI[5] = 0xFFFFE1BF & 0x1FFE;
        o.lllIlIlIllI[6] = 0xDB ^ 0x82 ^ (0x61 ^ 0x30);
        o.lllIlIlIllI[7] = " ".length();
        o.lllIlIlIllI[8] = "  ".length();
        o.lllIlIlIllI[9] = 0xFFFFCEBF & 0x377D;
        o.lllIlIlIllI[10] = 0xFFFFBF7F & 0x46F6;
        o.lllIlIlIllI[11] = 0x15 ^ 2;
        o.lllIlIlIllI[12] = "   ".length();
        o.lllIlIlIllI[13] = 36 + 104 - 66 + 112 ^ 171 + 179 - 254 + 94;
        o.lllIlIlIllI[14] = -(0xFFFFFD55 & 0x13EB) & (0xFFFF97FB & 0x7F7F);
        o.lllIlIlIllI[15] = -(0xFFFFF7D3 & 0x782F) & (0xFFFFF69F & 0x7FEB);
        o.lllIlIlIllI[16] = 0x50 ^ 0x75;
        o.lllIlIlIllI[17] = 0x29 ^ 0x76 ^ (0xF4 ^ 0xAE);
        o.lllIlIlIllI[18] = 0x5D ^ 0x2A ^ (0xDC ^ 0xAD);
        o.lllIlIlIllI[19] = -(0xFFFFD44B & 0x6FF7) & (0xFFFFEF7B & Short.MAX_VALUE);
        o.lllIlIlIllI[20] = -(0xFFFF85C7 & 0x7E7B) & (0xFFFFAFFE & 0x7F7F);
        o.lllIlIlIllI[21] = 0x7B ^ 0x2E ^ (0xEB ^ 0x8C);
        o.lllIlIlIllI[22] = 0x89 ^ 0xB9 ^ (0x92 ^ 0xA5);
        o.lllIlIlIllI[23] = 0xFFFFB6E9 & 0x4F5F;
        o.lllIlIlIllI[24] = -(0xFFFFAFDD & 0x766F) & (0xFFFFAF7F & Short.MAX_VALUE);
        o.lllIlIlIllI[25] = 0xFFFFD7DF & 0x7A79;
        o.lllIlIlIllI[26] = 0x7A ^ 0x73;
        o.lllIlIlIllI[27] = 0x88 ^ 0x82;
        o.lllIlIlIllI[28] = 0xFFFFF3F2 & 0x5E6F;
        o.lllIlIlIllI[29] = 0x59 ^ 0x52;
        o.lllIlIlIllI[30] = 159 + 35 - 124 + 132 ^ 32 + 128 - 66 + 104;
        o.lllIlIlIllI[31] = 0xFFFFD3FD & 0x7E7F;
        o.lllIlIlIllI[32] = 0xB0 ^ 0xA3;
        o.lllIlIlIllI[33] = 2 ^ 0x1C ^ (0x46 ^ 0x55);
        o.lllIlIlIllI[34] = 21 + 11 - -90 + 18 ^ 109 + 60 - 139 + 100;
        o.lllIlIlIllI[35] = -(0xFFFFA7BF & 0x7D55) & (0xFFFFFFFF & 0x777F);
        o.lllIlIlIllI[36] = " ".length() ^ (0x2E ^ 0x20);
        o.lllIlIlIllI[37] = 0x1F ^ 0x40 ^ (0x68 ^ 0x27);
        o.lllIlIlIllI[38] = -(0xFFFFEBB3 & 0x7DDD) & (0xFFFFFFFB & 0x6FDF);
        o.lllIlIlIllI[39] = 0xFFFFF2DF & 0x5F7C;
        o.lllIlIlIllI[40] = 0x10 ^ 1;
        o.lllIlIlIllI[41] = 0x6C ^ 0x7E;
        o.lllIlIlIllI[42] = 0xFFFFDBE5 & 0x767F;
        o.lllIlIlIllI[43] = 0x91 ^ 0x85;
        o.lllIlIlIllI[44] = 0xFFFFDE9C & 0x73E3;
        o.lllIlIlIllI[45] = 0x62 ^ 0x77;
        o.lllIlIlIllI[46] = 0x28 ^ 0x59 ^ (0xA6 ^ 0xC1);
        o.lllIlIlIllI[47] = -(0xFFFFA0F7 & 0x7F8A) & (0xFFFFF6FF & 0x7BEF);
        o.lllIlIlIllI[48] = 0xCD ^ 0x9E ^ (0xC1 ^ 0x8A);
        o.lllIlIlIllI[49] = -(0xFFFFD50F & 0x7BF3) & (0xFFFFD7EF & 0x7F5F);
        o.lllIlIlIllI[50] = 0xFFFFFADF & 0x577F;
        o.lllIlIlIllI[51] = 0x89 ^ 0x90;
        o.lllIlIlIllI[52] = 8 ^ 0x12;
        o.lllIlIlIllI[53] = -(0xFFFFAD4E & 0x7BB7) & (0xFFFFFF7F & 0x7BED);
        o.lllIlIlIllI[54] = 0x1F ^ 0x23 ^ (0xB6 ^ 0x91);
        o.lllIlIlIllI[55] = 0x89 ^ 0x95;
        o.lllIlIlIllI[56] = -(0xFFFFBFEB & 0x653D) & (0xFFFFF7AF & 0x7FFB);
        o.lllIlIlIllI[57] = 0xB6 ^ 0xAB;
        o.lllIlIlIllI[58] = 0xE7 ^ 0x8A ^ (0xC3 ^ 0xB0);
        o.lllIlIlIllI[59] = -(0xFFFFE4E5 & 0x3F9B) & (0xFFFFF7F7 & 0x7EF9);
        o.lllIlIlIllI[60] = "   ".length() ^ (0x9C ^ 0x80);
        o.lllIlIlIllI[61] = 21 + 80 - 7 + 43 ^ 54 + 161 - 161 + 115;
        o.lllIlIlIllI[62] = -(0xFFFFEDAF & 0x5BF1) & (0xFFFFCFFF & 0x7FE7);
        o.lllIlIlIllI[63] = -(0xFFFFCBDF & 0x7DB3) & (0xFFFFFFF7 & 0x4FFF);
        o.lllIlIlIllI[64] = 0x12 ^ 0x33;
        o.lllIlIlIllI[65] = 0x9B ^ 0xB9;
        o.lllIlIlIllI[66] = -(0xFFFFEDEF & 0x7217) & (0xFFFFF6FE & 0x6F7F);
        o.lllIlIlIllI[67] = " ".length() ^ (0x58 ^ 0x7A);
        o.lllIlIlIllI[68] = 0x80 ^ 0xA4;
        o.lllIlIlIllI[69] = -(0xFFFFFEFF & 0x45C1) & (0xFFFFEFFF & Short.MAX_VALUE);
        o.lllIlIlIllI[70] = 0xA5 ^ 0x9A ^ (0x5E ^ 0x55);
        o.lllIlIlIllI[71] = 0x44 ^ 0x67 ^ (0x8A ^ 0x8F);
        o.lllIlIlIllI[72] = 0xFFFFF6DB & 0xFAF;
        o.lllIlIlIllI[73] = 0x5C ^ 0x59 ^ (0xA3 ^ 0x81);
        o.lllIlIlIllI[74] = 3 ^ 0x2B;
        o.lllIlIlIllI[75] = -(0xFFFFD7AF & 0x387B) & (0xFFFFB6FF & 0x5F6F);
        o.lllIlIlIllI[76] = 0xFFFFE6EF & 0x1F77;
        o.lllIlIlIllI[77] = 0x72 ^ 0x49 ^ (0x12 ^ 0);
        o.lllIlIlIllI[78] = 6 + 11 - 6 + 156 ^ 96 + 60 - 127 + 112;
        o.lllIlIlIllI[79] = -(0xFFFFFABA & 0x7547) & (0xFFFFFFFF & 0x767B);
        o.lllIlIlIllI[80] = 0xA5 ^ 0x8E;
        o.lllIlIlIllI[81] = 0xE9 ^ 0x8A ^ (0x2E ^ 0x61);
        o.lllIlIlIllI[82] = -(104 + 63 - 156 + 119) & (0xFFFFFBC5 & 0x2FFF);
        o.lllIlIlIllI[83] = 0x22 ^ 0x75 ^ (0xCA ^ 0xA8);
        o.lllIlIlIllI[84] = 0x6F ^ 0x45 ^ (0x2D ^ 0x2A);
        o.lllIlIlIllI[85] = 0x35 ^ 0x1B;
        o.lllIlIlIllI[86] = -(0xFFFFB963 & 0x7E9F) & (0xFFFFBFBF & 0x7ECF);
        o.lllIlIlIllI[87] = 0x86 ^ 0xB8 ^ (0x98 ^ 0x89);
        o.lllIlIlIllI[88] = 0x2A ^ 0x67 ^ (0x26 ^ 0x5B);
        o.lllIlIlIllI[89] = 0xFFFFA6FB & 0x5F47;
        o.lllIlIlIllI[90] = 0xFFFF9EE9 & 0x677F;
        o.lllIlIlIllI[91] = 7 ^ 0x36;
        o.lllIlIlIllI[92] = 0xFFFF877E & 0x7EFD;
        o.lllIlIlIllI[93] = 0xF3 ^ 0xBF ^ 17 + 5 - -51 + 54;
        o.lllIlIlIllI[94] = -(0xFFFFDEFB & 0x6117) & (0xFFFFFFFF & 0x6B5F);
        o.lllIlIlIllI[95] = 0x5C ^ 0x6A;
        o.lllIlIlIllI[96] = -(0xFFFFF1BD & 0x1F53) & (0xFFFFDFDF & 0x37BF);
        o.lllIlIlIllI[97] = 0x4D ^ 0x65 ^ (0xBB ^ 0xA4);
        o.lllIlIlIllI[98] = 34 + 204 - 212 + 225 ^ 8 + 32 - -34 + 121;
        o.lllIlIlIllI[99] = -(0xFFFFFEBF & 0x71E7) & (0xFFFFFFFF & 0x76E7);
        o.lllIlIlIllI[100] = -(0xFFFFDDF1 & 0x721F) & (0xFFFFFEFB & 0x577F);
        o.lllIlIlIllI[101] = 0x1A ^ 0x76 ^ (0x95 ^ 0xC0);
        o.lllIlIlIllI[102] = 0xBB ^ 0x81;
        o.lllIlIlIllI[103] = -(0xFFFFC9A1 & 0x77DF) & (0xFFFFDFFF & 0x67FE);
        o.lllIlIlIllI[104] = 0xA7 ^ 0x9C;
        o.lllIlIlIllI[105] = 0xC6 ^ 0xBB ^ (0xF5 ^ 0xB4);
        o.lllIlIlIllI[106] = 0xFFFFFFDC & 0x2B77;
        o.lllIlIlIllI[107] = 146 + 27 - 93 + 71 ^ 100 + 42 - 82 + 110;
        o.lllIlIlIllI[108] = 0x80 ^ 0xBE;
        o.lllIlIlIllI[109] = 0xFFFFFF9B & 0x6F5;
        o.lllIlIlIllI[110] = 0x85 ^ 0xBA;
        o.lllIlIlIllI[111] = 0xFA ^ 0xBA;
        o.lllIlIlIllI[112] = -(0xFFFFBDFF & 0x6BA1) & (0xFFFFEFEF & 0x3FFF);
        o.lllIlIlIllI[113] = 0xFFFFDFED & 0x267F;
        o.lllIlIlIllI[114] = 0x4C ^ 0xD;
        o.lllIlIlIllI[115] = 0x59 ^ 0x1B;
        o.lllIlIlIllI[116] = 0xFFFFD7D1 & 0x2EAE;
        o.lllIlIlIllI[117] = 0x2C ^ 0x6F;
        o.lllIlIlIllI[118] = 0xED ^ 0xC7 ^ (0x2D ^ 0x43);
        o.lllIlIlIllI[119] = 0xFFFFFF7F & 0x2BEB;
        o.lllIlIlIllI[120] = 0xDA ^ 0xBC ^ (0xE1 ^ 0xC2);
        o.lllIlIlIllI[121] = 44 + 198 - 190 + 181 ^ 59 + 92 - 19 + 43;
        o.lllIlIlIllI[122] = 0xFFFFCEFF & 0x3793;
        o.lllIlIlIllI[123] = 218 + 204 - 383 + 209 ^ 70 + 17 - 30 + 134;
        o.lllIlIlIllI[124] = 0xD5 ^ 0x9D;
        o.lllIlIlIllI[125] = -(0xFFFF8CB3 & 0x775D) & (0xFFFFDFBD & 0x3DFF);
        o.lllIlIlIllI[126] = 0xFFFFD9AF & 0x3FFF;
        o.lllIlIlIllI[127] = 0x3E ^ 0x77;
        o.lllIlIlIllI[128] = 0x7F ^ 0x35;
        o.lllIlIlIllI[129] = -(0xFFFFDF6F & 0x26DF) & (0xFFFF9FFF & Short.MAX_VALUE);
        o.lllIlIlIllI[130] = 137 + 131 - 237 + 212 ^ 135 + 107 - 182 + 124;
        o.lllIlIlIllI[131] = 0xE2 ^ 0xA1 ^ (0xB7 ^ 0xB8);
        o.lllIlIlIllI[132] = -(0xFFFFBD7F & 0x5686) & (0xFFFFFFFF & 0x3F7F);
        o.lllIlIlIllI[133] = 0xAE ^ 0x8C ^ (0x4C ^ 0x23);
        o.lllIlIlIllI[134] = 0x19 ^ 0x57;
        o.lllIlIlIllI[135] = 0xFFFFF9BB & 0x1FF7;
        o.lllIlIlIllI[136] = 0x34 ^ 0x22 ^ (0x7B ^ 0x22);
        o.lllIlIlIllI[137] = 0x92 ^ 0xC2;
        o.lllIlIlIllI[138] = 0xFFFFFCBF & 0x4F65;
        o.lllIlIlIllI[139] = -(0xFFFFBBEF & 0x57B6) & (0xFFFFFFFF & 0x5FF7);
        o.lllIlIlIllI[140] = 0x5D ^ 0x62 ^ (0x37 ^ 0x59);
        o.lllIlIlIllI[141] = 0xE6 ^ 0xB4;
        o.lllIlIlIllI[142] = 0xFFFFEFEF & 0x5C5F;
        o.lllIlIlIllI[143] = 0xC0 ^ 0x93;
        o.lllIlIlIllI[144] = 81 + 240 - 217 + 141 ^ 45 + 143 - 31 + 4;
        o.lllIlIlIllI[145] = 0xFFFFDC66 & 0x6FBD;
        o.lllIlIlIllI[146] = 0xEC ^ 0xB9;
        o.lllIlIlIllI[147] = 0x59 ^ 0x11 ^ (0x9D ^ 0x83);
        o.lllIlIlIllI[148] = -(0xFFFFF791 & 0x1BFF) & (0xFFFFDFBD & Short.MAX_VALUE);
        o.lllIlIlIllI[149] = 0x5D ^ 0x12 ^ (0x58 ^ 0x40);
        o.lllIlIlIllI[150] = 0x5F ^ 7;
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

    private o(int n3, int n4, int n5, int n6, int n7, String string2) {
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
        o.lllIlIlIlIl[o.lllIlIlIllI[1]] = o.lIlIlllllllIll("aXD8bNJ3SppgAlSX5pi9nQ==", "wSLIS");
        o.lllIlIlIlIl[o.lllIlIlIllI[7]] = o.lIlIllllllllII("eImCgy6e21k=", "zbLKF");
        o.lllIlIlIlIl[o.lllIlIlIllI[8]] = o.lIlIlllllllIll("XsOHwbClycpJjZYcfdQUHw==", "DvGWd");
        o.lllIlIlIlIl[o.lllIlIlIllI[12]] = o.lIlIllllllllII("3K9DE4F+u4M=", "vyBWb");
        o.lllIlIlIlIl[o.lllIlIlIllI[13]] = o.lIlIllllllllII("vqFuw/tbqEveHJ6XGmwI7Q==", "ycZHz");
        o.lllIlIlIlIl[o.lllIlIlIllI[17]] = o.lIlIlllllllIll("9gjbUcxidKM=", "ccasc");
        o.lllIlIlIlIl[o.lllIlIlIllI[18]] = o.lIlIllllllllIl("LwUWNjoqGBsxICQPDg==", "hJZre");
        o.lllIlIlIlIl[o.lllIlIlIllI[22]] = o.lIlIllllllllIl("GzccPQ==", "VVwXB");
        o.lllIlIlIlIl[o.lllIlIlIllI[6]] = o.lIlIlllllllIll("lGx+o5H+K+n9rVGjwh18FA==", "cTCLT");
        o.lllIlIlIlIl[o.lllIlIlIllI[26]] = o.lIlIllllllllII("e7Oo6UjgRQw=", "LJzIa");
        o.lllIlIlIlIl[o.lllIlIlIllI[27]] = o.lIlIlllllllIll("61LviGXoz7jzd575B6yvBA==", "caDOi");
        o.lllIlIlIlIl[o.lllIlIlIllI[29]] = o.lIlIlllllllIll("IUwzTwxa9xg=", "RvuSj");
        o.lllIlIlIlIl[o.lllIlIlIllI[30]] = o.lIlIllllllllII("QIia4frMjmW1Wibj3wGW4Q==", "EwfXx");
        o.lllIlIlIlIl[o.lllIlIlIllI[33]] = o.lIlIlllllllIll("CkcXBFIZuyI=", "vEYJL");
        o.lllIlIlIlIl[o.lllIlIlIllI[34]] = o.lIlIllllllllII("W47FXuLO9dURJERwcgpdzw==", "Cbjeg");
        o.lllIlIlIlIl[o.lllIlIlIllI[36]] = o.lIlIllllllllII("8ttDP8ps/kA=", "DOayl");
        o.lllIlIlIlIl[o.lllIlIlIllI[37]] = o.lIlIllllllllIl("ITUQKTE5PRor", "ktTln");
        o.lllIlIlIlIl[o.lllIlIlIllI[40]] = o.lIlIllllllllIl("MSQnHx0=", "rVFyi");
        o.lllIlIlIlIl[o.lllIlIlIllI[41]] = o.lIlIllllllllIl("JxM2EDwjFzEeLywRNw==", "mRrUc");
        o.lllIlIlIlIl[o.lllIlIlIllI[32]] = o.lIlIllllllllII("cu/1Zjd2/Wo=", "lyyCk");
        o.lllIlIlIlIl[o.lllIlIlIllI[43]] = o.lIlIllllllllIl("OyYpNCkzNSwyMz0iOQ==", "qgmqv");
        o.lllIlIlIlIl[o.lllIlIlIllI[45]] = o.lIlIlllllllIll("gb64KQJRzLE=", "hfcih");
        o.lllIlIlIlIl[o.lllIlIlIllI[46]] = o.lIlIlllllllIll("AvVS17rggEdJFkTMeyZ/FQ==", "kHyeU");
        o.lllIlIlIlIl[o.lllIlIlIllI[11]] = o.lIlIlllllllIll("WROTWQk/SxE=", "DBUJv");
        o.lllIlIlIlIl[o.lllIlIlIllI[48]] = o.lIlIllllllllIl("PA0GJww3EB8oEQ==", "hBVfV");
        o.lllIlIlIlIl[o.lllIlIlIllI[51]] = o.lIlIlllllllIll("vNY2sQX+VVA=", "mnmWs");
        o.lllIlIlIlIl[o.lllIlIlIllI[52]] = o.lIlIlllllllIll("XyNbjoDDKLJGm1wOQBaq1A==", "ruvzB");
        o.lllIlIlIlIl[o.lllIlIlIllI[54]] = o.lIlIllllllllII("2mlvEgePtC8=", "QEpOF");
        o.lllIlIlIlIl[o.lllIlIlIllI[55]] = o.lIlIllllllllIl("HTolLzcWNycvLgw5MDo=", "Iuunm");
        o.lllIlIlIlIl[o.lllIlIlIllI[57]] = o.lIlIlllllllIll("sq6qnzsXsSY=", "nyxKa");
        o.lllIlIlIlIl[o.lllIlIlIllI[58]] = o.lIlIllllllllII("P69ktefD9i27ebkGgJ+4fA==", "wwqCl");
        o.lllIlIlIlIl[o.lllIlIlIllI[60]] = o.lIlIlllllllIll("C+K/gMJ2i9A=", "TXoSi");
        o.lllIlIlIlIl[o.lllIlIlIllI[61]] = o.lIlIlllllllIll("9hXFgx9DFAr+blTy2MjxEw==", "XqjlQ");
        o.lllIlIlIlIl[o.lllIlIlIllI[64]] = o.lIlIlllllllIll("3VPfBlNFCO0=", "YXrud");
        o.lllIlIlIlIl[o.lllIlIlIllI[65]] = o.lIlIlllllllIll("wQqobklfHPBHxLuKqNBxU80huyMmpuIX", "CwnLi");
        o.lllIlIlIlIl[o.lllIlIlIllI[67]] = o.lIlIlllllllIll("6hFdTmOCfCw=", "UQzhT");
        o.lllIlIlIlIl[o.lllIlIlIllI[68]] = o.lIlIllllllllII("GPRMXWBfbAOSapjVTOKRptE/jd/A0H2D", "NvgSe");
        o.lllIlIlIlIl[o.lllIlIlIllI[16]] = o.lIlIllllllllII("VIGrlDTl4vE=", "uAfpg");
        o.lllIlIlIlIl[o.lllIlIlIllI[71]] = o.lIlIllllllllII("KIB5I7yxgTQANAMUxg9w0w==", "XNbjm");
        o.lllIlIlIlIl[o.lllIlIlIllI[73]] = o.lIlIllllllllIl("DgQaNg==", "CeqSC");
        o.lllIlIlIlIl[o.lllIlIlIllI[74]] = o.lIlIllllllllII("NfALnoqy+BpkPjTHzwmiNg==", "VpqtQ");
        o.lllIlIlIlIl[o.lllIlIlIllI[77]] = o.lIlIllllllllII("EQuBwWJtv9s=", "iOywH");
        o.lllIlIlIlIl[o.lllIlIlIllI[78]] = o.lIlIllllllllII("9IL6bVncQ4ClL9Ac6q++m/BrH2yAihoF", "SpDsm");
        o.lllIlIlIlIl[o.lllIlIlIllI[80]] = o.lIlIllllllllII("A1qthw5q2+Q=", "Dpwqz");
        o.lllIlIlIlIl[o.lllIlIlIllI[81]] = o.lIlIlllllllIll("rqidIL19tjlh/F/zfMXLoDDcYR9DlSFD", "awzjI");
        o.lllIlIlIlIl[o.lllIlIlIllI[84]] = o.lIlIllllllllIl("PiMfDQ==", "sBthX");
        o.lllIlIlIlIl[o.lllIlIlIllI[85]] = o.lIlIllllllllII("0jpvl7ZvuIfzXv/98Z4K1w==", "ceiGm");
        o.lllIlIlIlIl[o.lllIlIlIllI[87]] = o.lIlIllllllllII("TPliX+iEAvA=", "qfsbO");
        o.lllIlIlIlIl[o.lllIlIlIllI[88]] = o.lIlIllllllllIl("GRcsDgYZCyAQ", "KBnWY");
        o.lllIlIlIlIl[o.lllIlIlIllI[91]] = o.lIlIllllllllII("PNW0b6SL2lM=", "JhNzJ");
        o.lllIlIlIlIl[o.lllIlIlIllI[21]] = o.lIlIllllllllII("awde2+9ePotcTB35Hv3VJA==", "mQnZe");
        o.lllIlIlIlIl[o.lllIlIlIllI[93]] = o.lIlIlllllllIll("C1uwEAZyYis=", "VMYOW");
        o.lllIlIlIlIl[o.lllIlIlIllI[70]] = o.lIlIllllllllIl("IR83Ay0xGDQZNz8PIQ==", "sJuZr");
        o.lllIlIlIlIl[o.lllIlIlIllI[83]] = o.lIlIllllllllII("2hKjUtJUfpg=", "LedXR");
        o.lllIlIlIlIl[o.lllIlIlIllI[95]] = o.lIlIllllllllII("BdSGDl405aMb6/G6MxFtMQ==", "cWPVG");
        o.lllIlIlIlIl[o.lllIlIlIllI[97]] = o.lIlIllllllllIl("GRMCAw==", "Trify");
        o.lllIlIlIlIl[o.lllIlIlIllI[98]] = o.lIlIlllllllIll("vXUTOxWEL4KlUX7RjQjt4g==", "VbomP");
        o.lllIlIlIlIl[o.lllIlIlIllI[101]] = o.lIlIlllllllIll("tCRFd3DtFVw=", "fLVZk");
        o.lllIlIlIlIl[o.lllIlIlIllI[102]] = o.lIlIllllllllII("0kgMHiz3DX1FW2AcVu/OenEcaV77skxq", "AYAaw");
        o.lllIlIlIlIl[o.lllIlIlIllI[104]] = o.lIlIllllllllII("gBP1ecb9+5E=", "YJprT");
        o.lllIlIlIlIl[o.lllIlIlIllI[105]] = o.lIlIllllllllII("I8RwGcYjbaPbrjh8xtSMd0t2hrMCt6o7", "MlTMJ");
        o.lllIlIlIlIl[o.lllIlIlIllI[107]] = o.lIlIllllllllII("dlitxXzV56Q=", "Vrbob");
        o.lllIlIlIlIl[o.lllIlIlIllI[108]] = o.lIlIlllllllIll("9YsIPfvOFZ4N1dmve4fxrQ==", "WxNtE");
        o.lllIlIlIlIl[o.lllIlIlIllI[110]] = o.lIlIllllllllII("7qfQhDot1l8=", "BTWrt");
        o.lllIlIlIlIl[o.lllIlIlIllI[111]] = o.lIlIllllllllIl("EyQADjwZJRUGPRIpEwA9EA==", "WvAIs");
        o.lllIlIlIlIl[o.lllIlIlIllI[114]] = o.lIlIlllllllIll("x112cqSe8Ss=", "AKEFW");
        o.lllIlIlIlIl[o.lllIlIlIllI[115]] = o.lIlIlllllllIll("mHpHyz+fLnkQo9QJibtu+bFI+DAw2rZ5", "EznAe");
        o.lllIlIlIlIl[o.lllIlIlIllI[117]] = o.lIlIlllllllIll("DdK5BTuyWQY=", "rdvcn");
        o.lllIlIlIlIl[o.lllIlIlIllI[118]] = o.lIlIllllllllIl("FTE3NSwfMCI9LRQ8NCAiEiY6Nzc=", "Qcvrc");
        o.lllIlIlIlIl[o.lllIlIlIllI[120]] = o.lIlIllllllllII("RfUqmxL51HY=", "QeoKC");
        o.lllIlIlIlIl[o.lllIlIlIllI[121]] = o.lIlIllllllllII("CwaN+ASI9grTDkWnR6zJmmiKAH0t0A5q", "Tontk");
        o.lllIlIlIlIl[o.lllIlIlIllI[123]] = o.lIlIllllllllIl("IQkYIQ==", "lhsDg");
        o.lllIlIlIlIl[o.lllIlIlIllI[124]] = o.lIlIllllllllIl("JxwTFy06GwQI", "hRJOr");
        o.lllIlIlIlIl[o.lllIlIlIllI[127]] = o.lIlIllllllllIl("KCodCw==", "eKvnH");
        o.lllIlIlIlIl[o.lllIlIlIllI[128]] = o.lIlIlllllllIll("0PMIC86T3GqjTj5zPMBS2g==", "DPbce");
        o.lllIlIlIlIl[o.lllIlIlIllI[130]] = o.lIlIllllllllIl("JAsKAw==", "ijafg");
        o.lllIlIlIlIl[o.lllIlIlIllI[131]] = o.lIlIlllllllIll("CIzOSnnLmEVYCwWk9BxSzg==", "RrwSr");
        o.lllIlIlIlIl[o.lllIlIlIllI[133]] = o.lIlIlllllllIll("LdCTyqNsKRU=", "TjkaK");
        o.lllIlIlIlIl[o.lllIlIlIllI[134]] = o.lIlIllllllllII("c5aMQNpKPzDG5OXqWX0rHA==", "YcSYq");
        o.lllIlIlIlIl[o.lllIlIlIllI[136]] = o.lIlIlllllllIll("QZYc9hwBxg4=", "LCDXk");
        o.lllIlIlIlIl[o.lllIlIlIllI[137]] = o.lIlIllllllllIl("LAAkOz8zGjgrJTE=", "vEjbk");
        o.lllIlIlIlIl[o.lllIlIlIllI[140]] = o.lIlIllllllllIl("FykMCg==", "ZHgob");
        o.lllIlIlIlIl[o.lllIlIlIllI[141]] = o.lIlIllllllllII("t6NWwEpmoraOd/2hAX6fKA==", "ycHUt");
        o.lllIlIlIlIl[o.lllIlIlIllI[143]] = o.lIlIllllllllII("MxBW8egqwDA=", "PAINt");
        o.lllIlIlIlIl[o.lllIlIlIllI[144]] = o.lIlIllllllllII("4/DIHjbZQHQ9BY2sNJIz6w==", "AXpIp");
        o.lllIlIlIlIl[o.lllIlIlIllI[146]] = o.lIlIlllllllIll("+sGxJfiPJ6I=", "nYwFS");
        o.lllIlIlIlIl[o.lllIlIlIllI[147]] = o.lIlIllllllllIl("HwIFKCAAGAo8IQkCHw==", "EGKqt");
        o.lllIlIlIlIl[o.lllIlIlIllI[149]] = o.lIlIlllllllIll("j43lAGlnmgM=", "CnhZr");
    }

    public int H() {
        return this.secondaryID;
    }

    private static String lIlIllllllllII(String llllllllllllllllIIlIIlIIlIlIIIIl, String llllllllllllllllIIlIIlIIlIlIIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIlIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIIlIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIIlIlIIIll.init(lllIlIlIllI[8], llllllllllllllllIIlIIlIIlIlIIlII);
            return new String(llllllllllllllllIIlIIlIIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIIlIlIIIlI) {
            llllllllllllllllIIlIIlIIlIlIIIlI.printStackTrace();
            return null;
        }
    }
}

