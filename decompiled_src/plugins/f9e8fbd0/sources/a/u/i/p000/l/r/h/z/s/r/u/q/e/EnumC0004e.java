package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.e  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/e.class */
public final class EnumC0004e {
    public static final /* synthetic */ EnumC0004e ARDY_CLOAK;
    public static final /* synthetic */ EnumC0004e RUNE_POUCH;
    public static final /* synthetic */ EnumC0004e QUEST_CAPE;
    private final /* synthetic */ Predicate<Item> ids;
    private static final /* synthetic */ EnumC0004e[] $VALUES;
    public static final /* synthetic */ EnumC0004e CONS_CAPE;
    private static /* synthetic */ int[] lIllIlllIlllI;
    public static final /* synthetic */ EnumC0004e GLORY_AMULET;
    private static /* synthetic */ String[] lIllIlllIlIIl;
    public static final /* synthetic */ EnumC0004e HOUSE_TAB;

    private static String llIIlIIllIIlIII(String llllllllllllllIllIIIlIIIlIlIlIIl, String llllllllllllllIllIIIlIIIlIlIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlIIIlIlIlIII.toCharArray();
        int llllllllllllllIllIIIlIIIlIlIIlIl = lIllIlllIlllI[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIllIIIlIIIlIIllllI = charArray2.length;
        int i = lIllIlllIlllI[0];
        while (llIIlIIllIlIllI(i, llllllllllllllIllIIIlIIIlIIllllI)) {
            char llllllllllllllIllIIIlIIIlIlIlIlI = charArray2[i];
            sb.append((char) (llllllllllllllIllIIIlIIIlIlIlIlI ^ charArray[llllllllllllllIllIIIlIIIlIlIIlIl % charArray.length]));
            "".length();
            llllllllllllllIllIIIlIIIlIlIIlIl++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIIlIIllIlIlIl() {
        lIllIlllIlllI = new int[25];
        lIllIlllIlllI[0] = (4 ^ 22) & ((46 ^ 60) ^ (-1));
        lIllIlllIlllI[1] = "  ".length();
        lIllIlllIlllI[2] = (-((-1667) & 24235)) & (-257) & 32637;
        lIllIlllIlllI[3] = " ".length();
        lIllIlllIlllI[4] = (-1265) & 14332;
        lIllIlllIlllI[5] = (-24579) & 32591;
        lIllIlllIlllI[6] = (-((-447) & 20415)) & (-9) & 32767;
        lIllIlllIlllI[7] = (-(174 ^ 143)) & (-5391) & 32703;
        lIllIlllIlllI[8] = "   ".length();
        lIllIlllIlllI[9] = (((17 + 25) - 6) + 116) ^ (((100 + 69) - 117) + 104);
        lIllIlllIlllI[10] = (-1165) & 14285;
        lIllIlllIlllI[11] = (-174) & 13295;
        lIllIlllIlllI[12] = (-181) & 13303;
        lIllIlllIlllI[13] = (-17548) & 30671;
        lIllIlllIlllI[14] = 30 ^ 24;
        lIllIlllIlllI[15] = (-26690) & 28395;
        lIllIlllIlllI[16] = (-((-9229) & 31837)) & (-8195) & 32510;
        lIllIlllIlllI[17] = (-((-1157) & 31894)) & (-1) & 32447;
        lIllIlllIlllI[18] = (-31042) & 32753;
        lIllIlllIlllI[19] = (-(140 ^ 175)) & (-20485) & 32494;
        lIllIlllIlllI[20] = 199 ^ 194;
        lIllIlllIlllI[21] = (-4113) & 16090;
        lIllIlllIlllI[22] = (-((-2581) & 6999)) & (-2049) & 16255;
        lIllIlllIlllI[23] = (-6209) & 15998;
        lIllIlllIlllI[24] = 84 ^ 92;
    }

    public static EnumC0004e valueOf(String str) {
        return (EnumC0004e) Enum.valueOf(EnumC0004e.class, str);
    }

    private static boolean llIIlIIllIlIllI(int i, int i2) {
        return i < i2;
    }

    static {
        llIIlIIllIlIlIl();
        llIIlIIllIIlllI();
        String str = lIllIlllIlIIl[lIllIlllIlllI[0]];
        int i = lIllIlllIlllI[0];
        int[] iArr = new int[lIllIlllIlllI[1]];
        iArr[lIllIlllIlllI[0]] = lIllIlllIlllI[2];
        iArr[lIllIlllIlllI[3]] = lIllIlllIlllI[4];
        QUEST_CAPE = new EnumC0004e(str, i, iArr);
        String str2 = lIllIlllIlIIl[lIllIlllIlllI[3]];
        int i2 = lIllIlllIlllI[3];
        int[] iArr2 = new int[lIllIlllIlllI[3]];
        iArr2[lIllIlllIlllI[0]] = lIllIlllIlllI[5];
        HOUSE_TAB = new EnumC0004e(str2, i2, iArr2);
        String str3 = lIllIlllIlIIl[lIllIlllIlllI[1]];
        int i3 = lIllIlllIlllI[1];
        int[] iArr3 = new int[lIllIlllIlllI[1]];
        iArr3[lIllIlllIlllI[0]] = lIllIlllIlllI[6];
        iArr3[lIllIlllIlllI[3]] = lIllIlllIlllI[7];
        RUNE_POUCH = new EnumC0004e(str3, i3, iArr3);
        String str4 = lIllIlllIlIIl[lIllIlllIlllI[8]];
        int i4 = lIllIlllIlllI[8];
        int[] iArr4 = new int[lIllIlllIlllI[9]];
        iArr4[lIllIlllIlllI[0]] = lIllIlllIlllI[10];
        iArr4[lIllIlllIlllI[3]] = lIllIlllIlllI[11];
        iArr4[lIllIlllIlllI[1]] = lIllIlllIlllI[12];
        iArr4[lIllIlllIlllI[8]] = lIllIlllIlllI[13];
        ARDY_CLOAK = new EnumC0004e(str4, i4, iArr4);
        String str5 = lIllIlllIlIIl[lIllIlllIlllI[9]];
        int i5 = lIllIlllIlllI[9];
        int[] iArr5 = new int[lIllIlllIlllI[14]];
        iArr5[lIllIlllIlllI[0]] = lIllIlllIlllI[15];
        iArr5[lIllIlllIlllI[3]] = lIllIlllIlllI[16];
        iArr5[lIllIlllIlllI[1]] = lIllIlllIlllI[17];
        iArr5[lIllIlllIlllI[8]] = lIllIlllIlllI[18];
        iArr5[lIllIlllIlllI[9]] = lIllIlllIlllI[19];
        iArr5[lIllIlllIlllI[20]] = lIllIlllIlllI[21];
        GLORY_AMULET = new EnumC0004e(str5, i5, iArr5);
        String str6 = lIllIlllIlIIl[lIllIlllIlllI[20]];
        int i6 = lIllIlllIlllI[20];
        int[] iArr6 = new int[lIllIlllIlllI[1]];
        iArr6[lIllIlllIlllI[0]] = lIllIlllIlllI[22];
        iArr6[lIllIlllIlllI[3]] = lIllIlllIlllI[23];
        CONS_CAPE = new EnumC0004e(str6, i6, iArr6);
        EnumC0004e[] enumC0004eArr = new EnumC0004e[lIllIlllIlllI[14]];
        enumC0004eArr[lIllIlllIlllI[0]] = QUEST_CAPE;
        enumC0004eArr[lIllIlllIlllI[3]] = HOUSE_TAB;
        enumC0004eArr[lIllIlllIlllI[1]] = RUNE_POUCH;
        enumC0004eArr[lIllIlllIlllI[8]] = ARDY_CLOAK;
        enumC0004eArr[lIllIlllIlllI[9]] = GLORY_AMULET;
        enumC0004eArr[lIllIlllIlllI[20]] = CONS_CAPE;
        $VALUES = enumC0004eArr;
    }

    private static void llIIlIIllIIlllI() {
        lIllIlllIlIIl = new String[lIllIlllIlllI[14]];
        lIllIlllIlIIl[lIllIlllIlllI[0]] = llIIlIIllIIlIII("JRMnPh8rBSM9Dg==", "tFbmK");
        lIllIlllIlIIl[lIllIlllIlllI[3]] = llIIlIIllIIlIIl("bgCeP0PmN7Jodo7cmJVi2A==", "xetOc");
        lIllIlllIlIIl[lIllIlllIlllI[1]] = llIIlIIllIIlIII("GjAJLi4YKhIoOQ==", "HeGkq");
        lIllIlllIlIIl[lIllIlllIlllI[8]] = llIIlIIllIIlIII("CRgQLxsLBhs3Dw==", "HJTvD");
        lIllIlllIlIIl[lIllIlllIlllI[9]] = llIIlIIllIIlIIl("bhDXMYTbdo3F6NLrJdpEUQ==", "oHyHu");
        lIllIlllIlIIl[lIllIlllIlllI[20]] = llIIlIIllIIlIII("FCgrMSgUJjUn", "Wgebw");
    }

    private static String llIIlIIllIIlIIl(String llllllllllllllIllIIIlIIIlIlllIIl, String llllllllllllllIllIIIlIIIlIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIIlIlllIII.getBytes(StandardCharsets.UTF_8)), lIllIlllIlllI[24]), "DES");
            Cipher llllllllllllllIllIIIlIIIlIlllIll = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIIIlIlllIll.init(lIllIlllIlllI[1], secretKeySpec);
            return new String(llllllllllllllIllIIIlIIIlIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIIlIlllIlI) {
            llllllllllllllIllIIIlIIIlIlllIlI.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> p() {
        return this.ids;
    }

    public static EnumC0004e[] values() {
        return (EnumC0004e[]) $VALUES.clone();
    }

    private EnumC0004e(String str, int i, int... iArr) {
        this.ids = Predicates.ids(iArr);
    }
}
