package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.WidgetInfo;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.r  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/r.class */
public final class r {
    public static final /* synthetic */ r KITESHIELD;
    public static final /* synthetic */ r ARROWTIPS;
    public static final /* synthetic */ r FULL_HELM;
    public static final /* synthetic */ r AXE;
    public static final /* synthetic */ r PLATELEGS;
    private static final /* synthetic */ r[] $VALUES;
    private final /* synthetic */ int barsRequired;
    public static final /* synthetic */ r MACE;
    public static final /* synthetic */ r SCIMITAR;
    public static final /* synthetic */ r KNIFE;
    public static final /* synthetic */ r CLAWS;
    public static final /* synthetic */ r TWO_HANDED_SWORD;
    private static /* synthetic */ int[] lllIIIIlIll;
    public static final /* synthetic */ r SWORD;
    public static final /* synthetic */ r CHAINBODY;
    public static final /* synthetic */ r PLATESKIRT;
    private final /* synthetic */ WidgetInfo smithingWidgetGroup;
    public static final /* synthetic */ r JAVELIN_HEAD;
    public static final /* synthetic */ r WARHAMMER;
    private static /* synthetic */ String[] lllIIIIlIlI;
    public static final /* synthetic */ r MED_HELM;
    public static final /* synthetic */ r BATTLEAXE;
    public static final /* synthetic */ r DAGGER;
    public static final /* synthetic */ r PLATEBODY;
    public static final /* synthetic */ r NAILS;
    public static final /* synthetic */ r SQ_SHIELD;
    public static final /* synthetic */ r BOLTS;
    public static final /* synthetic */ r LONGSWORD;
    public static final /* synthetic */ r LIMBS;
    public static final /* synthetic */ r DART_TIP;

    private static String lIlIllIIIllllI(String llllllllllllllllIIlIlIlIlIlIlIIl, String llllllllllllllllIIlIlIlIlIlIIIll) {
        String llllllllllllllllIIlIlIlIlIlIlIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIlIlIlIIlll = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIlIlIIllI = llllllllllllllllIIlIlIlIlIlIIIll.toCharArray();
        int llllllllllllllllIIlIlIlIlIlIIlIl = lllIIIIlIll[0];
        char[] charArray = llllllllllllllllIIlIlIlIlIlIlIIl2.toCharArray();
        int length = charArray.length;
        int i = lllIIIIlIll[0];
        while (lIlIllIIlIIIll(i, length)) {
            llllllllllllllllIIlIlIlIlIlIIlll.append((char) (charArray[i] ^ llllllllllllllllIIlIlIlIlIlIIllI[llllllllllllllllIIlIlIlIlIlIIlIl % llllllllllllllllIIlIlIlIlIlIIllI.length]));
            "".length();
            llllllllllllllllIIlIlIlIlIlIIlIl++;
            i++;
            "".length();
            if ((((15 ^ 113) ^ (161 ^ 199)) & (((((73 + 187) - 247) + 178) ^ (((44 + 12) - (-67)) + 44)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIlIlIlIIlll);
    }

    private static String lIlIllIIIlllll(String llllllllllllllllIIlIlIlIlIlllIIl, String llllllllllllllllIIlIlIlIlIllIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIlIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIlIll[2], llllllllllllllllIIlIlIlIlIllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIlIlllIlI) {
            llllllllllllllllIIlIlIlIlIlllIlI.printStackTrace();
            return null;
        }
    }

    public int R() {
        return this.barsRequired;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    static {
        lIlIllIIlIIIlI();
        lIlIllIIlIIIIl();
        DAGGER = new r(lllIIIIlIlI[lllIIIIlIll[0]], lllIIIIlIll[0], WidgetInfo.SMITHING_ANVIL_DAGGER, lllIIIIlIll[1]);
        AXE = new r(lllIIIIlIlI[lllIIIIlIll[1]], lllIIIIlIll[1], WidgetInfo.SMITHING_ANVIL_AXE, lllIIIIlIll[1]);
        MACE = new r(lllIIIIlIlI[lllIIIIlIll[2]], lllIIIIlIll[2], WidgetInfo.SMITHING_ANVIL_MACE, lllIIIIlIll[1]);
        MED_HELM = new r(lllIIIIlIlI[lllIIIIlIll[3]], lllIIIIlIll[3], WidgetInfo.SMITHING_ANVIL_MED_HELM, lllIIIIlIll[1]);
        BOLTS = new r(lllIIIIlIlI[lllIIIIlIll[4]], lllIIIIlIll[4], WidgetInfo.SMITHING_ANVIL_BOLTS, lllIIIIlIll[1]);
        SWORD = new r(lllIIIIlIlI[lllIIIIlIll[5]], lllIIIIlIll[5], WidgetInfo.SMITHING_ANVIL_SWORD, lllIIIIlIll[1]);
        DART_TIP = new r(lllIIIIlIlI[lllIIIIlIll[6]], lllIIIIlIll[6], WidgetInfo.SMITHING_ANVIL_DART_TIPS, lllIIIIlIll[1]);
        NAILS = new r(lllIIIIlIlI[lllIIIIlIll[7]], lllIIIIlIll[7], WidgetInfo.SMITHING_ANVIL_NAILS, lllIIIIlIll[1]);
        SCIMITAR = new r(lllIIIIlIlI[lllIIIIlIll[8]], lllIIIIlIll[8], WidgetInfo.SMITHING_ANVIL_SCIMITAR, lllIIIIlIll[2]);
        ARROWTIPS = new r(lllIIIIlIlI[lllIIIIlIll[9]], lllIIIIlIll[9], WidgetInfo.SMITHING_ANVIL_ARROW_HEADS, lllIIIIlIll[1]);
        LIMBS = new r(lllIIIIlIlI[lllIIIIlIll[10]], lllIIIIlIll[10], WidgetInfo.SMITHING_ANVIL_LIMBS, lllIIIIlIll[1]);
        LONGSWORD = new r(lllIIIIlIlI[lllIIIIlIll[11]], lllIIIIlIll[11], WidgetInfo.SMITHING_ANVIL_LONG_SWORD, lllIIIIlIll[2]);
        JAVELIN_HEAD = new r(lllIIIIlIlI[lllIIIIlIll[12]], lllIIIIlIll[12], WidgetInfo.SMITHING_ANVIL_JAVELIN_HEADS, lllIIIIlIll[1]);
        FULL_HELM = new r(lllIIIIlIlI[lllIIIIlIll[13]], lllIIIIlIll[13], WidgetInfo.SMITHING_ANVIL_FULL_HELM, lllIIIIlIll[2]);
        KNIFE = new r(lllIIIIlIlI[lllIIIIlIll[14]], lllIIIIlIll[14], WidgetInfo.SMITHING_ANVIL_KNIVES, lllIIIIlIll[1]);
        SQ_SHIELD = new r(lllIIIIlIlI[lllIIIIlIll[15]], lllIIIIlIll[15], WidgetInfo.SMITHING_ANVIL_SQ_SHIELD, lllIIIIlIll[2]);
        WARHAMMER = new r(lllIIIIlIlI[lllIIIIlIll[16]], lllIIIIlIll[16], WidgetInfo.SMITHING_ANVIL_WARHAMMER, lllIIIIlIll[3]);
        BATTLEAXE = new r(lllIIIIlIlI[lllIIIIlIll[17]], lllIIIIlIll[17], WidgetInfo.SMITHING_ANVIL_BATTLE_AXE, lllIIIIlIll[3]);
        CHAINBODY = new r(lllIIIIlIlI[lllIIIIlIll[18]], lllIIIIlIll[18], WidgetInfo.SMITHING_ANVIL_CHAIN_BODY, lllIIIIlIll[3]);
        KITESHIELD = new r(lllIIIIlIlI[lllIIIIlIll[19]], lllIIIIlIll[19], WidgetInfo.SMITHING_ANVIL_KITE_SHIELD, lllIIIIlIll[3]);
        CLAWS = new r(lllIIIIlIlI[lllIIIIlIll[20]], lllIIIIlIll[20], WidgetInfo.SMITHING_ANVIL_CLAWS, lllIIIIlIll[2]);
        TWO_HANDED_SWORD = new r(lllIIIIlIlI[lllIIIIlIll[21]], lllIIIIlIll[21], WidgetInfo.SMITHING_ANVIL_TWO_H_SWORD, lllIIIIlIll[3]);
        PLATELEGS = new r(lllIIIIlIlI[lllIIIIlIll[22]], lllIIIIlIll[22], WidgetInfo.SMITHING_ANVIL_PLATE_LEGS, lllIIIIlIll[3]);
        PLATESKIRT = new r(lllIIIIlIlI[lllIIIIlIll[23]], lllIIIIlIll[23], WidgetInfo.SMITHING_ANVIL_PLATE_SKIRT, lllIIIIlIll[3]);
        PLATEBODY = new r(lllIIIIlIlI[lllIIIIlIll[24]], lllIIIIlIll[24], WidgetInfo.SMITHING_ANVIL_PLATE_BODY, lllIIIIlIll[5]);
        r[] rVarArr = new r[lllIIIIlIll[25]];
        rVarArr[lllIIIIlIll[0]] = DAGGER;
        rVarArr[lllIIIIlIll[1]] = AXE;
        rVarArr[lllIIIIlIll[2]] = MACE;
        rVarArr[lllIIIIlIll[3]] = MED_HELM;
        rVarArr[lllIIIIlIll[4]] = BOLTS;
        rVarArr[lllIIIIlIll[5]] = SWORD;
        rVarArr[lllIIIIlIll[6]] = DART_TIP;
        rVarArr[lllIIIIlIll[7]] = NAILS;
        rVarArr[lllIIIIlIll[8]] = SCIMITAR;
        rVarArr[lllIIIIlIll[9]] = ARROWTIPS;
        rVarArr[lllIIIIlIll[10]] = LIMBS;
        rVarArr[lllIIIIlIll[11]] = LONGSWORD;
        rVarArr[lllIIIIlIll[12]] = JAVELIN_HEAD;
        rVarArr[lllIIIIlIll[13]] = FULL_HELM;
        rVarArr[lllIIIIlIll[14]] = KNIFE;
        rVarArr[lllIIIIlIll[15]] = SQ_SHIELD;
        rVarArr[lllIIIIlIll[16]] = WARHAMMER;
        rVarArr[lllIIIIlIll[17]] = BATTLEAXE;
        rVarArr[lllIIIIlIll[18]] = CHAINBODY;
        rVarArr[lllIIIIlIll[19]] = KITESHIELD;
        rVarArr[lllIIIIlIll[20]] = CLAWS;
        rVarArr[lllIIIIlIll[21]] = TWO_HANDED_SWORD;
        rVarArr[lllIIIIlIll[22]] = PLATELEGS;
        rVarArr[lllIIIIlIll[23]] = PLATESKIRT;
        rVarArr[lllIIIIlIll[24]] = PLATEBODY;
        $VALUES = rVarArr;
    }

    public WidgetInfo Q() {
        return this.smithingWidgetGroup;
    }

    private static void lIlIllIIlIIIlI() {
        lllIIIIlIll = new int[26];
        lllIIIIlIll[0] = (180 ^ 187) & ((175 ^ 160) ^ (-1));
        lllIIIIlIll[1] = " ".length();
        lllIIIIlIll[2] = "  ".length();
        lllIIIIlIll[3] = "   ".length();
        lllIIIIlIll[4] = (115 ^ 110) ^ (114 ^ 107);
        lllIIIIlIll[5] = 18 ^ 23;
        lllIIIIlIll[6] = 195 ^ 197;
        lllIIIIlIll[7] = 58 ^ 61;
        lllIIIIlIll[8] = 156 ^ 148;
        lllIIIIlIll[9] = 12 ^ 5;
        lllIIIIlIll[10] = 13 ^ 7;
        lllIIIIlIll[11] = (124 ^ 9) ^ (40 ^ 86);
        lllIIIIlIll[12] = (56 ^ 91) ^ (25 ^ 118);
        lllIIIIlIll[13] = (62 ^ 21) ^ (64 ^ 102);
        lllIIIIlIll[14] = (((111 + 56) - 73) + 49) ^ (((52 + 35) - (-32)) + 10);
        lllIIIIlIll[15] = (119 ^ 38) ^ (216 ^ 134);
        lllIIIIlIll[16] = (((42 + 135) - 104) + 98) ^ (((14 + 89) - 64) + 148);
        lllIIIIlIll[17] = (((141 + 156) - 181) + 64) ^ (((27 + 7) - 16) + 147);
        lllIIIIlIll[18] = 64 ^ 82;
        lllIIIIlIll[19] = (56 ^ 0) ^ (69 ^ 110);
        lllIIIIlIll[20] = (219 ^ 130) ^ (42 ^ 103);
        lllIIIIlIll[21] = 101 ^ 112;
        lllIIIIlIll[22] = 31 ^ 9;
        lllIIIIlIll[23] = (((55 + 127) - 169) + 155) ^ (((125 + 95) - 141) + 112);
        lllIIIIlIll[24] = (14 ^ 3) ^ (12 ^ 25);
        lllIIIIlIll[25] = 134 ^ 159;
    }

    private static void lIlIllIIlIIIIl() {
        lllIIIIlIlI = new String[lllIIIIlIll[25]];
        lllIIIIlIlI[lllIIIIlIll[0]] = lIlIllIIIllllI("KBEgAwE+", "lPgDD");
        lllIIIIlIlI[lllIIIIlIll[1]] = lIlIllIIIlllll("e2bpO2sFAGs=", "yYBrX");
        lllIIIIlIlI[lllIIIIlIll[2]] = lIlIllIIIllllI("HwUnAg==", "RDdGY");
        lllIIIIlIlI[lllIIIIlIll[3]] = lIlIllIIlIIIII("WEgGNy1bECsZraO9Lz9tGQ==", "oosZL");
        lllIIIIlIlI[lllIIIIlIll[4]] = lIlIllIIlIIIII("vcNLLi3Ow4E=", "KlPWd");
        lllIIIIlIlI[lllIIIIlIll[5]] = lIlIllIIIlllll("D57UPUUZH8Q=", "LQLJO");
        lllIIIIlIlI[lllIIIIlIll[6]] = lIlIllIIIllllI("PRs0GQYtEzY=", "yZfMY");
        lllIIIIlIlI[lllIIIIlIll[7]] = lIlIllIIlIIIII("Eky9FrazQmw=", "siBFS");
        lllIIIIlIlI[lllIIIIlIll[8]] = lIlIllIIlIIIII("x8w51u+QziBNbiQyU8WrBA==", "kPciT");
        lllIIIIlIlI[lllIIIIlIll[9]] = lIlIllIIlIIIII("giwvDBWZMwd247KxXE+ZXA==", "nnnLA");
        lllIIIIlIlI[lllIIIIlIll[10]] = lIlIllIIIllllI("JScfKjc=", "inRhd");
        lllIIIIlIlI[lllIIIIlIll[11]] = lIlIllIIIllllI("LQw0Ijo2DCgh", "aCzei");
        lllIIIIlIlI[lllIIIIlIll[12]] = lIlIllIIlIIIII("w+wG3nk6th4ruiJHxyIzew==", "ztawg");
        lllIIIIlIlI[lllIIIIlIll[13]] = lIlIllIIlIIIII("hISXF8BWZSDDogLXU4e55Q==", "LCwvr");
        lllIIIIlIlI[lllIIIIlIll[14]] = lIlIllIIIllllI("Mig4CSk=", "yfqOl");
        lllIIIIlIlI[lllIIIIlIll[15]] = lIlIllIIIlllll("/6y/Fri47njfzGJvt2UQ0g==", "apUhI");
        lllIIIIlIlI[lllIIIIlIll[16]] = lIlIllIIIlllll("zmt3tbqH4yYodzE3XzUg6A==", "zTCEt");
        lllIIIIlIlI[lllIIIIlIll[17]] = lIlIllIIIlllll("ZT2x8nEN/rvHg1SmRpwUSA==", "miFST");
        lllIIIIlIlI[lllIIIIlIll[18]] = lIlIllIIIllllI("DTEWDwUMNhMf", "NyWFK");
        lllIIIIlIlI[lllIIIIlIll[19]] = lIlIllIIlIIIII("NU9WC/yJ9Zch+fSfz/mwOg==", "aRsab");
        lllIIIIlIlI[lllIIIIlIll[20]] = lIlIllIIIllllI("OjonHyc=", "yvfHt");
        lllIIIIlIlI[lllIIIIlIll[21]] = lIlIllIIlIIIII("dtVUKu83sUkFRuQYMavZbEwjPH/C9xTE", "QuNeE");
        lllIIIIlIlI[lllIIIIlIll[22]] = lIlIllIIlIIIII("aLs9PMkP90VPXorzXjDcuQ==", "fwaav");
        lllIIIIlIlI[lllIIIIlIll[23]] = lIlIllIIIllllI("EzQ4BjYQMzAAJw==", "CxyRs");
        lllIIIIlIlI[lllIIIIlIll[24]] = lIlIllIIIlllll("rvU9O2+xAiMD/BAVwiGUDQ==", "dgkdG");
    }

    private r(String str, int i, WidgetInfo widgetInfo, int i2) {
        this.smithingWidgetGroup = widgetInfo;
        this.barsRequired = i2;
    }

    private static boolean lIlIllIIlIIIll(int i, int i2) {
        return i < i2;
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    private static String lIlIllIIlIIIII(String llllllllllllllllIIlIlIlIlIIlIlII, String llllllllllllllllIIlIlIlIlIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlIIlIIll.getBytes(StandardCharsets.UTF_8)), lllIIIIlIll[8]), "DES");
            Cipher llllllllllllllllIIlIlIlIlIIlIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIlIlIIlIllI.init(lllIIIIlIll[2], secretKeySpec);
            return new String(llllllllllllllllIIlIlIlIlIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIlIIlIlIl) {
            llllllllllllllllIIlIlIlIlIIlIlIl.printStackTrace();
            return null;
        }
    }
}
