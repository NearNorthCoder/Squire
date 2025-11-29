/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.WidgetInfo
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.WidgetInfo;

public final class r
extends Enum<r> {
    public static final /* synthetic */ /* enum */ r KITESHIELD;
    public static final /* synthetic */ /* enum */ r ARROWTIPS;
    public static final /* synthetic */ /* enum */ r FULL_HELM;
    public static final /* synthetic */ /* enum */ r AXE;
    public static final /* synthetic */ /* enum */ r PLATELEGS;
    private static final /* synthetic */ r[] $VALUES;
    private final /* synthetic */ int barsRequired;
    public static final /* synthetic */ /* enum */ r MACE;
    public static final /* synthetic */ /* enum */ r SCIMITAR;
    public static final /* synthetic */ /* enum */ r KNIFE;
    public static final /* synthetic */ /* enum */ r CLAWS;
    public static final /* synthetic */ /* enum */ r TWO_HANDED_SWORD;
    private static /* synthetic */ int[] lllIIIIlIll;
    public static final /* synthetic */ /* enum */ r SWORD;
    public static final /* synthetic */ /* enum */ r CHAINBODY;
    public static final /* synthetic */ /* enum */ r PLATESKIRT;
    private final /* synthetic */ WidgetInfo smithingWidgetGroup;
    public static final /* synthetic */ /* enum */ r JAVELIN_HEAD;
    public static final /* synthetic */ /* enum */ r WARHAMMER;
    private static /* synthetic */ String[] lllIIIIlIlI;
    public static final /* synthetic */ /* enum */ r MED_HELM;
    public static final /* synthetic */ /* enum */ r BATTLEAXE;
    public static final /* synthetic */ /* enum */ r DAGGER;
    public static final /* synthetic */ /* enum */ r PLATEBODY;
    public static final /* synthetic */ /* enum */ r NAILS;
    public static final /* synthetic */ /* enum */ r SQ_SHIELD;
    public static final /* synthetic */ /* enum */ r BOLTS;
    public static final /* synthetic */ /* enum */ r LONGSWORD;
    public static final /* synthetic */ /* enum */ r LIMBS;
    public static final /* synthetic */ /* enum */ r DART_TIP;

    private static String lIlIllIIIllllI(String var18, String var3) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var6 = var3.toCharArray();
        int var2 = lllIIIIlIll[0];
        char[] var11 = var18.toCharArray();
        int var14 = var11.length;
        int var7 = lllIIIIlIll[0];
        while (r.lIlIllIIlIIIll(var7, var14)) {
            char var8 = var11[var7];
            var9.append((char)(var8 ^ var6[var2 % var6.length]));
            0;
            ++var2;
            ++var7;
            0;
            if (((0xF ^ 0x71 ^ (0xA1 ^ 0xC7)) & (73 + 187 - 247 + 178 ^ 44 + 12 - -67 + 44 ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static String lIlIllIIIlllll(String var12, String var16) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lllIIIIlIll[2], var13);
            return new String(var5.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public int R() {
        return this.barsRequired;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    static {
        r.lIlIllIIlIIIlI();
        r.lIlIllIIlIIIIl();
        DAGGER = new r(WidgetInfo.SMITHING_ANVIL_DAGGER, lllIIIIlIll[1]);
        AXE = new r(WidgetInfo.SMITHING_ANVIL_AXE, lllIIIIlIll[1]);
        MACE = new r(WidgetInfo.SMITHING_ANVIL_MACE, lllIIIIlIll[1]);
        MED_HELM = new r(WidgetInfo.SMITHING_ANVIL_MED_HELM, lllIIIIlIll[1]);
        BOLTS = new r(WidgetInfo.SMITHING_ANVIL_BOLTS, lllIIIIlIll[1]);
        SWORD = new r(WidgetInfo.SMITHING_ANVIL_SWORD, lllIIIIlIll[1]);
        DART_TIP = new r(WidgetInfo.SMITHING_ANVIL_DART_TIPS, lllIIIIlIll[1]);
        NAILS = new r(WidgetInfo.SMITHING_ANVIL_NAILS, lllIIIIlIll[1]);
        SCIMITAR = new r(WidgetInfo.SMITHING_ANVIL_SCIMITAR, lllIIIIlIll[2]);
        ARROWTIPS = new r(WidgetInfo.SMITHING_ANVIL_ARROW_HEADS, lllIIIIlIll[1]);
        LIMBS = new r(WidgetInfo.SMITHING_ANVIL_LIMBS, lllIIIIlIll[1]);
        LONGSWORD = new r(WidgetInfo.SMITHING_ANVIL_LONG_SWORD, lllIIIIlIll[2]);
        JAVELIN_HEAD = new r(WidgetInfo.SMITHING_ANVIL_JAVELIN_HEADS, lllIIIIlIll[1]);
        FULL_HELM = new r(WidgetInfo.SMITHING_ANVIL_FULL_HELM, lllIIIIlIll[2]);
        KNIFE = new r(WidgetInfo.SMITHING_ANVIL_KNIVES, lllIIIIlIll[1]);
        SQ_SHIELD = new r(WidgetInfo.SMITHING_ANVIL_SQ_SHIELD, lllIIIIlIll[2]);
        WARHAMMER = new r(WidgetInfo.SMITHING_ANVIL_WARHAMMER, lllIIIIlIll[3]);
        BATTLEAXE = new r(WidgetInfo.SMITHING_ANVIL_BATTLE_AXE, lllIIIIlIll[3]);
        CHAINBODY = new r(WidgetInfo.SMITHING_ANVIL_CHAIN_BODY, lllIIIIlIll[3]);
        KITESHIELD = new r(WidgetInfo.SMITHING_ANVIL_KITE_SHIELD, lllIIIIlIll[3]);
        CLAWS = new r(WidgetInfo.SMITHING_ANVIL_CLAWS, lllIIIIlIll[2]);
        TWO_HANDED_SWORD = new r(WidgetInfo.SMITHING_ANVIL_TWO_H_SWORD, lllIIIIlIll[3]);
        PLATELEGS = new r(WidgetInfo.SMITHING_ANVIL_PLATE_LEGS, lllIIIIlIll[3]);
        PLATESKIRT = new r(WidgetInfo.SMITHING_ANVIL_PLATE_SKIRT, lllIIIIlIll[3]);
        PLATEBODY = new r(WidgetInfo.SMITHING_ANVIL_PLATE_BODY, lllIIIIlIll[5]);
        r[] rArray = new r[lllIIIIlIll[25]];
        rArray[r.lllIIIIlIll[0]] = DAGGER;
        rArray[r.lllIIIIlIll[1]] = AXE;
        rArray[r.lllIIIIlIll[2]] = MACE;
        rArray[r.lllIIIIlIll[3]] = MED_HELM;
        rArray[r.lllIIIIlIll[4]] = BOLTS;
        rArray[r.lllIIIIlIll[5]] = SWORD;
        rArray[r.lllIIIIlIll[6]] = DART_TIP;
        rArray[r.lllIIIIlIll[7]] = NAILS;
        rArray[r.lllIIIIlIll[8]] = SCIMITAR;
        rArray[r.lllIIIIlIll[9]] = ARROWTIPS;
        rArray[r.lllIIIIlIll[10]] = LIMBS;
        rArray[r.lllIIIIlIll[11]] = LONGSWORD;
        rArray[r.lllIIIIlIll[12]] = JAVELIN_HEAD;
        rArray[r.lllIIIIlIll[13]] = FULL_HELM;
        rArray[r.lllIIIIlIll[14]] = KNIFE;
        rArray[r.lllIIIIlIll[15]] = SQ_SHIELD;
        rArray[r.lllIIIIlIll[16]] = WARHAMMER;
        rArray[r.lllIIIIlIll[17]] = BATTLEAXE;
        rArray[r.lllIIIIlIll[18]] = CHAINBODY;
        rArray[r.lllIIIIlIll[19]] = KITESHIELD;
        rArray[r.lllIIIIlIll[20]] = CLAWS;
        rArray[r.lllIIIIlIll[21]] = TWO_HANDED_SWORD;
        rArray[r.lllIIIIlIll[22]] = PLATELEGS;
        rArray[r.lllIIIIlIll[23]] = PLATESKIRT;
        rArray[r.lllIIIIlIll[24]] = PLATEBODY;
        $VALUES = rArray;
    }

    public WidgetInfo Q() {
        return this.smithingWidgetGroup;
    }

    private static void lIlIllIIlIIIlI() {
        lllIIIIlIll = new int[26];
        r.lllIIIIlIll[0] = (0xB4 ^ 0xBB) & ~(0xAF ^ 0xA0);
        r.lllIIIIlIll[1] = 1;
        r.lllIIIIlIll[2] = 2;
        r.lllIIIIlIll[3] = 3;
        r.lllIIIIlIll[4] = 0x73 ^ 0x6E ^ (0x72 ^ 0x6B);
        r.lllIIIIlIll[5] = 0x12 ^ 0x17;
        r.lllIIIIlIll[6] = 0xC3 ^ 0xC5;
        r.lllIIIIlIll[7] = 0x3A ^ 0x3D;
        r.lllIIIIlIll[8] = 0x9C ^ 0x94;
        r.lllIIIIlIll[9] = 0xC ^ 5;
        r.lllIIIIlIll[10] = 0xD ^ 7;
        r.lllIIIIlIll[11] = 0x7C ^ 9 ^ (0x28 ^ 0x56);
        r.lllIIIIlIll[12] = 0x38 ^ 0x5B ^ (0x19 ^ 0x76);
        r.lllIIIIlIll[13] = 0x3E ^ 0x15 ^ (0x40 ^ 0x66);
        r.lllIIIIlIll[14] = 111 + 56 - 73 + 49 ^ 52 + 35 - -32 + 10;
        r.lllIIIIlIll[15] = 0x77 ^ 0x26 ^ (0xD8 ^ 0x86);
        r.lllIIIIlIll[16] = 42 + 135 - 104 + 98 ^ 14 + 89 - 64 + 148;
        r.lllIIIIlIll[17] = 141 + 156 - 181 + 64 ^ 27 + 7 - 16 + 147;
        r.lllIIIIlIll[18] = 0x40 ^ 0x52;
        r.lllIIIIlIll[19] = 0x38 ^ 0 ^ (0x45 ^ 0x6E);
        r.lllIIIIlIll[20] = 0xDB ^ 0x82 ^ (0x2A ^ 0x67);
        r.lllIIIIlIll[21] = 0x65 ^ 0x70;
        r.lllIIIIlIll[22] = 0x1F ^ 9;
        r.lllIIIIlIll[23] = 55 + 127 - 169 + 155 ^ 125 + 95 - 141 + 112;
        r.lllIIIIlIll[24] = 0xE ^ 3 ^ (0xC ^ 0x19);
        r.lllIIIIlIll[25] = 0x86 ^ 0x9F;
    }

    private static void lIlIllIIlIIIIl() {
        lllIIIIlIlI = new String[lllIIIIlIll[25]];
        r.lllIIIIlIlI[r.lllIIIIlIll[0]] = r."DAGGER";
        r.lllIIIIlIlI[r.lllIIIIlIll[1]] = r."AXE";
        r.lllIIIIlIlI[r.lllIIIIlIll[2]] = r."MACE";
        r.lllIIIIlIlI[r.lllIIIIlIll[3]] = r."MED_HELM";
        r.lllIIIIlIlI[r.lllIIIIlIll[4]] = r."BOLTS";
        r.lllIIIIlIlI[r.lllIIIIlIll[5]] = r."SWORD";
        r.lllIIIIlIlI[r.lllIIIIlIll[6]] = r."DART_TIP";
        r.lllIIIIlIlI[r.lllIIIIlIll[7]] = r."NAILS";
        r.lllIIIIlIlI[r.lllIIIIlIll[8]] = r."SCIMITAR";
        r.lllIIIIlIlI[r.lllIIIIlIll[9]] = r."ARROWTIPS";
        r.lllIIIIlIlI[r.lllIIIIlIll[10]] = r."LIMBS";
        r.lllIIIIlIlI[r.lllIIIIlIll[11]] = r."LONGSWORD";
        r.lllIIIIlIlI[r.lllIIIIlIll[12]] = r."JAVELIN_HEAD";
        r.lllIIIIlIlI[r.lllIIIIlIll[13]] = r."FULL_HELM";
        r.lllIIIIlIlI[r.lllIIIIlIll[14]] = r."KNIFE";
        r.lllIIIIlIlI[r.lllIIIIlIll[15]] = r."SQ_SHIELD";
        r.lllIIIIlIlI[r.lllIIIIlIll[16]] = r."WARHAMMER";
        r.lllIIIIlIlI[r.lllIIIIlIll[17]] = r."BATTLEAXE";
        r.lllIIIIlIlI[r.lllIIIIlIll[18]] = r."CHAINBODY";
        r.lllIIIIlIlI[r.lllIIIIlIll[19]] = r."KITESHIELD";
        r.lllIIIIlIlI[r.lllIIIIlIll[20]] = r."CLAWS";
        r.lllIIIIlIlI[r.lllIIIIlIll[21]] = r."TWO_HANDED_SWORD";
        r.lllIIIIlIlI[r.lllIIIIlIll[22]] = r."PLATELEGS";
        r.lllIIIIlIlI[r.lllIIIIlIll[23]] = r."PLATESKIRT";
        r.lllIIIIlIlI[r.lllIIIIlIll[24]] = r."PLATEBODY";
    }

    private r(WidgetInfo widgetInfo, int n3) {
        this.smithingWidgetGroup = widgetInfo;
        this.barsRequired = n3;
    }

    private static boolean lIlIllIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    private static String lIlIllIIlIIIII(String var4, String var1) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lllIIIIlIll[8]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lllIIIIlIll[2], var19);
            return new String(var15.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

