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

    private static String lIlIllIIIllllI(String llllllllllllllllIIlIlIlIlIlIIlII, String llllllllllllllllIIlIlIlIlIlIlIII) {
        llllllllllllllllIIlIlIlIlIlIIlII = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIlIlIlIIlll = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIlIlIIllI = llllllllllllllllIIlIlIlIlIlIlIII.toCharArray();
        int llllllllllllllllIIlIlIlIlIlIIlIl = lllIIIIlIll[0];
        char[] llllllllllllllllIIlIlIlIlIIlllll = llllllllllllllllIIlIlIlIlIlIIlII.toCharArray();
        int llllllllllllllllIIlIlIlIlIIllllI = llllllllllllllllIIlIlIlIlIIlllll.length;
        int llllllllllllllllIIlIlIlIlIIlllIl = lllIIIIlIll[0];
        while (r.lIlIllIIlIIIll(llllllllllllllllIIlIlIlIlIIlllIl, llllllllllllllllIIlIlIlIlIIllllI)) {
            char llllllllllllllllIIlIlIlIlIlIlIlI = llllllllllllllllIIlIlIlIlIIlllll[llllllllllllllllIIlIlIlIlIIlllIl];
            llllllllllllllllIIlIlIlIlIlIIlll.append((char)(llllllllllllllllIIlIlIlIlIlIlIlI ^ llllllllllllllllIIlIlIlIlIlIIllI[llllllllllllllllIIlIlIlIlIlIIlIl % llllllllllllllllIIlIlIlIlIlIIllI.length]));
            "".length();
            ++llllllllllllllllIIlIlIlIlIlIIlIl;
            ++llllllllllllllllIIlIlIlIlIIlllIl;
            "".length();
            if (((0xF ^ 0x71 ^ (0xA1 ^ 0xC7)) & (73 + 187 - 247 + 178 ^ 44 + 12 - -67 + 44 ^ -" ".length())) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIlIlIlIIlll);
    }

    private static String lIlIllIIIlllll(String llllllllllllllllIIlIlIlIlIlllIIl, String llllllllllllllllIIlIlIlIlIlllIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIlIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIlIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIlIlllIll.init(lllIIIIlIll[2], llllllllllllllllIIlIlIlIlIllllII);
            return new String(llllllllllllllllIIlIlIlIlIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIlIlllIlI) {
            llllllllllllllllIIlIlIlIlIlllIlI.printStackTrace();
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
        r.lllIIIIlIll[1] = " ".length();
        r.lllIIIIlIll[2] = "  ".length();
        r.lllIIIIlIll[3] = "   ".length();
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
        r.lllIIIIlIlI[r.lllIIIIlIll[0]] = r.lIlIllIIIllllI("KBEgAwE+", "lPgDD");
        r.lllIIIIlIlI[r.lllIIIIlIll[1]] = r.lIlIllIIIlllll("e2bpO2sFAGs=", "yYBrX");
        r.lllIIIIlIlI[r.lllIIIIlIll[2]] = r.lIlIllIIIllllI("HwUnAg==", "RDdGY");
        r.lllIIIIlIlI[r.lllIIIIlIll[3]] = r.lIlIllIIlIIIII("WEgGNy1bECsZraO9Lz9tGQ==", "oosZL");
        r.lllIIIIlIlI[r.lllIIIIlIll[4]] = r.lIlIllIIlIIIII("vcNLLi3Ow4E=", "KlPWd");
        r.lllIIIIlIlI[r.lllIIIIlIll[5]] = r.lIlIllIIIlllll("D57UPUUZH8Q=", "LQLJO");
        r.lllIIIIlIlI[r.lllIIIIlIll[6]] = r.lIlIllIIIllllI("PRs0GQYtEzY=", "yZfMY");
        r.lllIIIIlIlI[r.lllIIIIlIll[7]] = r.lIlIllIIlIIIII("Eky9FrazQmw=", "siBFS");
        r.lllIIIIlIlI[r.lllIIIIlIll[8]] = r.lIlIllIIlIIIII("x8w51u+QziBNbiQyU8WrBA==", "kPciT");
        r.lllIIIIlIlI[r.lllIIIIlIll[9]] = r.lIlIllIIlIIIII("giwvDBWZMwd247KxXE+ZXA==", "nnnLA");
        r.lllIIIIlIlI[r.lllIIIIlIll[10]] = r.lIlIllIIIllllI("JScfKjc=", "inRhd");
        r.lllIIIIlIlI[r.lllIIIIlIll[11]] = r.lIlIllIIIllllI("LQw0Ijo2DCgh", "aCzei");
        r.lllIIIIlIlI[r.lllIIIIlIll[12]] = r.lIlIllIIlIIIII("w+wG3nk6th4ruiJHxyIzew==", "ztawg");
        r.lllIIIIlIlI[r.lllIIIIlIll[13]] = r.lIlIllIIlIIIII("hISXF8BWZSDDogLXU4e55Q==", "LCwvr");
        r.lllIIIIlIlI[r.lllIIIIlIll[14]] = r.lIlIllIIIllllI("Mig4CSk=", "yfqOl");
        r.lllIIIIlIlI[r.lllIIIIlIll[15]] = r.lIlIllIIIlllll("/6y/Fri47njfzGJvt2UQ0g==", "apUhI");
        r.lllIIIIlIlI[r.lllIIIIlIll[16]] = r.lIlIllIIIlllll("zmt3tbqH4yYodzE3XzUg6A==", "zTCEt");
        r.lllIIIIlIlI[r.lllIIIIlIll[17]] = r.lIlIllIIIlllll("ZT2x8nEN/rvHg1SmRpwUSA==", "miFST");
        r.lllIIIIlIlI[r.lllIIIIlIll[18]] = r.lIlIllIIIllllI("DTEWDwUMNhMf", "NyWFK");
        r.lllIIIIlIlI[r.lllIIIIlIll[19]] = r.lIlIllIIlIIIII("NU9WC/yJ9Zch+fSfz/mwOg==", "aRsab");
        r.lllIIIIlIlI[r.lllIIIIlIll[20]] = r.lIlIllIIIllllI("OjonHyc=", "yvfHt");
        r.lllIIIIlIlI[r.lllIIIIlIll[21]] = r.lIlIllIIlIIIII("dtVUKu83sUkFRuQYMavZbEwjPH/C9xTE", "QuNeE");
        r.lllIIIIlIlI[r.lllIIIIlIll[22]] = r.lIlIllIIlIIIII("aLs9PMkP90VPXorzXjDcuQ==", "fwaav");
        r.lllIIIIlIlI[r.lllIIIIlIll[23]] = r.lIlIllIIIllllI("EzQ4BjYQMzAAJw==", "CxyRs");
        r.lllIIIIlIlI[r.lllIIIIlIll[24]] = r.lIlIllIIIlllll("rvU9O2+xAiMD/BAVwiGUDQ==", "dgkdG");
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

    private static String lIlIllIIlIIIII(String llllllllllllllllIIlIlIlIlIIlIlII, String llllllllllllllllIIlIlIlIlIIlIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIlIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIIlIll[8]), "DES");
            Cipher llllllllllllllllIIlIlIlIlIIlIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIlIlIIlIllI.init(lllIIIIlIll[2], llllllllllllllllIIlIlIlIlIIlIlll);
            return new String(llllllllllllllllIIlIlIlIlIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIlIIlIlIl) {
            llllllllllllllllIIlIlIlIlIIlIlIl.printStackTrace();
            return null;
        }
    }
}

