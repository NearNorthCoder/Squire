package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ca  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ca.class */
final class ca {
    public static final /* synthetic */ ca RUNE_AXE;
    public static final /* synthetic */ ca BRONZE_AXE;
    public static final /* synthetic */ ca IRON_AXE;
    private static /* synthetic */ int[] lIIIlllII;
    public static final /* synthetic */ ca INFARNAL_AXE;
    public static final /* synthetic */ ca GILDED_AXE;
    public static final /* synthetic */ ca MITHRIL_AXE;
    public static final /* synthetic */ ca STEEL_AXE;
    public static final /* synthetic */ ca ADAMANT_AXE;
    public static final /* synthetic */ ca DRAGON_AXE;
    private static /* synthetic */ String[] lIIIllIlI;
    private final /* synthetic */ int itemID;
    private final /* synthetic */ Prayer protectionPrayer;
    public static final /* synthetic */ ca BLESSED_AXE;
    public static final /* synthetic */ ca BLACK_AXE;
    public static final /* synthetic */ ca CRYSTAL_AXE;
    public static final /* synthetic */ ca THIRD_AGE_AXE;
    private static final /* synthetic */ ca[] $VALUES;

    static {
        llllIllIlI();
        llllIllIIl();
        BRONZE_AXE = new ca(lIIIllIlI[lIIIlllII[0]], lIIIlllII[0], lIIIlllII[1], Prayer.PROTECT_FROM_MELEE);
        IRON_AXE = new ca(lIIIllIlI[lIIIlllII[2]], lIIIlllII[2], lIIIlllII[3], Prayer.PROTECT_FROM_MELEE);
        STEEL_AXE = new ca(lIIIllIlI[lIIIlllII[4]], lIIIlllII[4], lIIIlllII[5], Prayer.PROTECT_FROM_MELEE);
        BLACK_AXE = new ca(lIIIllIlI[lIIIlllII[6]], lIIIlllII[6], lIIIlllII[7], Prayer.PROTECT_FROM_MELEE);
        MITHRIL_AXE = new ca(lIIIllIlI[lIIIlllII[8]], lIIIlllII[8], lIIIlllII[9], Prayer.PROTECT_FROM_MELEE);
        ADAMANT_AXE = new ca(lIIIllIlI[lIIIlllII[10]], lIIIlllII[10], lIIIlllII[11], Prayer.PROTECT_FROM_MELEE);
        RUNE_AXE = new ca(lIIIllIlI[lIIIlllII[12]], lIIIlllII[12], lIIIlllII[13], Prayer.PROTECT_FROM_MELEE);
        DRAGON_AXE = new ca(lIIIllIlI[lIIIlllII[14]], lIIIlllII[14], lIIIlllII[15], Prayer.PROTECT_FROM_MELEE);
        CRYSTAL_AXE = new ca(lIIIllIlI[lIIIlllII[16]], lIIIlllII[16], lIIIlllII[17], Prayer.PROTECT_FROM_MELEE);
        BLESSED_AXE = new ca(lIIIllIlI[lIIIlllII[18]], lIIIlllII[18], lIIIlllII[19], Prayer.PROTECT_FROM_MELEE);
        GILDED_AXE = new ca(lIIIllIlI[lIIIlllII[20]], lIIIlllII[20], lIIIlllII[21], Prayer.PROTECT_FROM_MELEE);
        THIRD_AGE_AXE = new ca(lIIIllIlI[lIIIlllII[22]], lIIIlllII[22], lIIIlllII[23], Prayer.PROTECT_FROM_MELEE);
        INFARNAL_AXE = new ca(lIIIllIlI[lIIIlllII[24]], lIIIlllII[24], lIIIlllII[25], Prayer.PROTECT_FROM_MELEE);
        ca[] caVarArr = new ca[lIIIlllII[26]];
        caVarArr[lIIIlllII[0]] = BRONZE_AXE;
        caVarArr[lIIIlllII[2]] = IRON_AXE;
        caVarArr[lIIIlllII[4]] = STEEL_AXE;
        caVarArr[lIIIlllII[6]] = BLACK_AXE;
        caVarArr[lIIIlllII[8]] = MITHRIL_AXE;
        caVarArr[lIIIlllII[10]] = ADAMANT_AXE;
        caVarArr[lIIIlllII[12]] = RUNE_AXE;
        caVarArr[lIIIlllII[14]] = DRAGON_AXE;
        caVarArr[lIIIlllII[16]] = CRYSTAL_AXE;
        caVarArr[lIIIlllII[18]] = BLESSED_AXE;
        caVarArr[lIIIlllII[20]] = GILDED_AXE;
        caVarArr[lIIIlllII[22]] = THIRD_AGE_AXE;
        caVarArr[lIIIlllII[24]] = INFARNAL_AXE;
        $VALUES = caVarArr;
    }

    private static String llllIlIIIl(String llIIlIlIIIIIlll, String llIIlIlIIIIIllI) {
        try {
            SecretKeySpec llIIlIlIIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIlIIIIlIIl = Cipher.getInstance("Blowfish");
            llIIlIlIIIIlIIl.init(lIIIlllII[4], llIIlIlIIIIlIlI);
            return new String(llIIlIlIIIIlIIl.doFinal(Base64.getDecoder().decode(llIIlIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIlIIIIlIII) {
            llIIlIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIl(int i2, int i3) {
        return i2 < i3;
    }

    public int ar() {
        return this.itemID;
    }

    private ca(String str, int i2, int i3, Prayer prayer) {
        this.itemID = i3;
        this.protectionPrayer = prayer;
    }

    private static String llllIlIIlI(String llIIlIlIIIlllII, String llIIlIlIIIlIllI) {
        String llIIlIlIIIlllII2 = new String(Base64.getDecoder().decode(llIIlIlIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIlIlIIIlIllI.toCharArray();
        int llIIlIlIIIlIIll = lIIIlllII[0];
        char[] charArray2 = llIIlIlIIIlllII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlllII[0];
        while (lllllIlIIl(i2, length)) {
            char llIIlIlIIIlllIl = charArray2[i2];
            sb.append((char) (llIIlIlIIIlllIl ^ charArray[llIIlIlIIIlIIll % charArray.length]));
            "".length();
            llIIlIlIIIlIIll++;
            i2++;
            "".length();
            if (" ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llllIllIlI() {
        lIIIlllII = new int[27];
        lIIIlllII[0] = ((((30 + 41) - (-2)) + 97) ^ (((14 + 105) - 31) + 87)) & (((9 ^ 112) ^ (12 ^ 112)) ^ (-" ".length()));
        lIIIlllII[1] = (-((-327) & 25455)) & (-17) & 26495;
        lIIIlllII[2] = " ".length();
        lIIIlllII[3] = (-((-4161) & 30953)) & (-3) & 28143;
        lIIIlllII[4] = "  ".length();
        lIIIlllII[5] = (-((-7813) & 24229)) & (-6273) & 24041;
        lIIIlllII[6] = "   ".length();
        lIIIlllII[7] = (-17039) & 18399;
        lIIIlllII[8] = (84 ^ 81) ^ " ".length();
        lIIIlllII[9] = (-((-1761) & 26341)) & (-2177) & 28111;
        lIIIlllII[10] = 22 ^ 19;
        lIIIlllII[11] = (-((-25893) & 30119)) & (-8753) & 14335;
        lIIIlllII[12] = (((10 + 102) - 65) + 105) ^ (((11 + 83) - 67) + 131);
        lIIIlllII[13] = (-((-8195) & 29347)) & (-2065) & 24575;
        lIIIlllII[14] = 199 ^ 192;
        lIIIlllII[15] = (-((-4805) & 30661)) & (-141) & 32735;
        lIIIlllII[16] = (((50 + 65) - 90) + 118) ^ (((67 + 57) - 23) + 34);
        lIIIlllII[17] = (-((-4187) & 13151)) & (-129) & 32765;
        lIIIlllII[18] = 125 ^ 116;
        lIIIlllII[19] = (-((-16491) & 22123)) & (-16645) & 32767;
        lIIIlllII[20] = 140 ^ 134;
        lIIIlllII[21] = (-((-16717) & 25933)) & (-1) & 32495;
        lIIIlllII[22] = (125 ^ 71) ^ (240 ^ 193);
        lIIIlllII[23] = (-4309) & 24319;
        lIIIlllII[24] = (((67 + 11) - 57) + 170) ^ (((98 + 150) - 83) + 14);
        lIIIlllII[25] = (-((-9651) & 11767)) & (-1) & 15357;
        lIIIlllII[26] = 10 ^ 7;
    }

    public static ca valueOf(String str) {
        return (ca) Enum.valueOf(ca.class, str);
    }

    public Prayer dc() {
        return this.protectionPrayer;
    }

    public static ca[] values() {
        return (ca[]) $VALUES.clone();
    }

    private static String llllIIlllI(String llIIlIIlllllIlI, String llIIlIIlllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIlllllIIl.getBytes(StandardCharsets.UTF_8)), lIIIlllII[16]), "DES");
            Cipher llIIlIIllllllII = Cipher.getInstance("DES");
            llIIlIIllllllII.init(lIIIlllII[4], secretKeySpec);
            return new String(llIIlIIllllllII.doFinal(Base64.getDecoder().decode(llIIlIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIlllllIll) {
            llIIlIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static void llllIllIIl() {
        lIIIllIlI = new String[lIIIlllII[26]];
        lIIIllIlI[lIIIlllII[0]] = llllIIlllI("gCbxaFc7fVmBXN9kkuJfUQ==", "jdiyA");
        lIIIllIlI[lIIIlllII[2]] = llllIIlllI("DCYZNjrzWcefnsu8C/Y/1A==", "SSxyQ");
        lIIIllIlI[lIIIlllII[4]] = llllIIlllI("LeNhDKkGB6G4jD+hIbck0g==", "RJlSo");
        lIIIllIlI[lIIIlllII[6]] = llllIlIIIl("DdioBM11fPf9pvU5H2dIjw==", "MQLjG");
        lIIIllIlI[lIIIlllII[8]] = llllIlIIlI("BAoAAwgADwsKAgw=", "ICTKZ");
        lIIIllIlI[lIIIlllII[10]] = llllIIlllI("YdxDZu+1OECPQYUeErTr8g==", "ZtxEa");
        lIIIllIlI[lIIIlllII[12]] = llllIlIIlI("ARMWFTcSHh0=", "SFXPh");
        lIIIllIlI[lIIIlllII[14]] = llllIlIIIl("/2nIEqNTG7/gLPItdeSbBA==", "pCNXZ");
        lIIIllIlI[lIIIlllII[16]] = llllIlIIlI("JQEhHCYnHycOKiM=", "fSxOr");
        lIIIllIlI[lIIIlllII[18]] = llllIlIIlI("FygtGRgQIDcLExA=", "UdhJK");
        lIIIllIlI[lIIIlllII[20]] = llllIIlllI("Xx0ZacuKySrdxL8FaPDT5w==", "YLsmU");
        lIIIllIlI[lIIIlllII[22]] = llllIlIIIl("q7wbo8GOty124ZmrYFjJsw==", "KZlZZ");
        lIIIllIlI[lIIIlllII[24]] = llllIlIIlI("PyUrKQU4KiE3Fi4u", "vkmhW");
    }
}
