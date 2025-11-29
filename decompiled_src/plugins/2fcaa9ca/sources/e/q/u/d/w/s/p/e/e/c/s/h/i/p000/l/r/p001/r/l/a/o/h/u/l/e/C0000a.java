package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/a.class */
public class C0000a {
    private static /* synthetic */ String[] lllIIIlIIIIl;
    private static /* synthetic */ int[] lllIIIlIIIlI;

    private static boolean lIIIlIIIlllIlIl(int i) {
        return i != 0;
    }

    static {
        lIIIlIIIlllIIll();
        lIIIlIIIlllIIlI();
    }

    private static String lIIIlIIIlllIIIl(String lllllllllllllllIIllIlllllllIIlll, String lllllllllllllllIIllIlllllllIIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllllllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlllllllIIlIl = new StringBuilder();
        char[] lllllllllllllllIIllIlllllllIIlII = lllllllllllllllIIllIlllllllIIllI.toCharArray();
        int lllllllllllllllIIllIlllllllIIIll = lllIIIlIIIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIllIllllllIllIll = lllIIIlIIIlI[1];
        while (lIIIlIIIllllIIl(lllllllllllllllIIllIllllllIllIll, length)) {
            lllllllllllllllIIllIlllllllIIlIl.append((char) (charArray[lllllllllllllllIIllIllllllIllIll] ^ lllllllllllllllIIllIlllllllIIlII[lllllllllllllllIIllIlllllllIIIll % lllllllllllllllIIllIlllllllIIlII.length]));
            "".length();
            lllllllllllllllIIllIlllllllIIIll++;
            lllllllllllllllIIllIllllllIllIll++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlllllllIIlIl);
    }

    private static boolean lIIIlIIIllllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIIIlllIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIlIIIlllIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean n() {
        if (lIIIlIIIlllIllI(Inventory.getFirst(item -> {
            if (lIIIlIIIlllIlIl(item.getName().contains(lllIIIlIIIIl[lllIIIlIIIlI[9]]) ? 1 : 0) && lIIIlIIIlllIlll(item.getQuantity(), lllIIIlIIIlI[5])) {
                ?? r0 = lllIIIlIIIlI[2];
                "".length();
                return ((113 ^ 35) & ((84 ^ 6) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIlIIIlI[1];
        }))) {
            ?? r0 = lllIIIlIIIlI[2];
            "".length();
            return (((((32 + 124) - 59) + 128) ^ (((119 + 39) - (-6)) + 30)) & (((((123 + 86) - 187) + 126) ^ (((108 + 165) - 91) + 1)) ^ (-" ".length()))) != (((((189 + 20) - 47) + 83) ^ (((62 + 88) - 80) + 80)) & (((((247 + 180) - 250) + 72) ^ (((79 + 117) - 53) + 11)) ^ (-" ".length()))) ? ((127 ^ 12) ^ (15 ^ 107)) & (((211 ^ 128) ^ (208 ^ 148)) ^ (-" ".length())) : r0;
        }
        return lllIIIlIIIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean k() {
        String[] strArr = new String[lllIIIlIIIlI[0]];
        strArr[lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[1]];
        strArr[lllIIIlIIIlI[2]] = lllIIIlIIIIl[lllIIIlIIIlI[2]];
        if (lIIIlIIIlllIlII(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lllIIIlIIIlI[2]];
            strArr2[lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[0]];
            if (!lIIIlIIIlllIlIl(Equipment.contains(strArr2) ? 1 : 0)) {
                return lllIIIlIIIlI[1];
            }
        }
        ?? r0 = lllIIIlIIIlI[2];
        "".length();
        return "   ".length() == (((43 ^ 45) ^ (46 ^ 54)) & (((184 ^ 175) ^ (172 ^ 165)) ^ (-" ".length()))) ? ((109 ^ 58) ^ (37 ^ 98)) & (((55 ^ 35) ^ (47 ^ 43)) ^ (-" ".length())) : r0;
    }

    public static boolean l() {
        String[] strArr = new String[lllIIIlIIIlI[2]];
        strArr[lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[3]];
        return Inventory.contains(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    public static boolean o() {
        String[] strArr = new String[lllIIIlIIIlI[2]];
        strArr[lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[4]];
        if (!lIIIlIIIlllIlIl(Equipment.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lllIIIlIIIlI[2]];
            strArr2[lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[6]];
            if (lIIIlIIIlllIlll(Inventory.getCount(strArr2), lllIIIlIIIlI[0])) {
                ?? r0 = lllIIIlIIIlI[2];
                "".length();
                return (((((85 + 100) - 85) + 49) ^ (((80 + 50) - 28) + 74)) & (((66 ^ 43) ^ (192 ^ 140)) ^ (-" ".length()))) != (((((109 + 112) - 180) + 104) ^ (((43 + 32) - (-15)) + 60)) & (((21 ^ 126) ^ (51 ^ 95)) ^ (-" ".length()))) ? ((((130 + 149) - 102) + 5) ^ (((1 + 48) - (-15)) + 85)) & (((187 ^ 138) ^ (116 ^ 102)) ^ (-" ".length())) : r0;
            }
            return lllIIIlIIIlI[1];
        }
        String[] strArr3 = new String[lllIIIlIIIlI[2]];
        strArr3[lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[5]];
        if (lIIIlIIIlllIlll(Inventory.getCount(strArr3), lllIIIlIIIlI[2])) {
            ?? r02 = lllIIIlIIIlI[2];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
        }
        ?? r03 = lllIIIlIIIlI[1];
        "".length();
        return (-" ".length()) >= " ".length() ? ((0 ^ 71) ^ (69 ^ 18)) & (((19 ^ 119) ^ (80 ^ 36)) ^ (-" ".length())) : r03;
    }

    private static boolean lIIIlIIIlllIllI(Object obj) {
        return obj != null;
    }

    private static void lIIIlIIIlllIIll() {
        lllIIIlIIIlI = new int[12];
        lllIIIlIIIlI[0] = "  ".length();
        lllIIIlIIIlI[1] = ((150 ^ 192) ^ (86 ^ 5)) & (((14 ^ 114) ^ (48 ^ 73)) ^ (-" ".length()));
        lllIIIlIIIlI[2] = " ".length();
        lllIIIlIIIlI[3] = "   ".length();
        lllIIIlIIIlI[4] = (101 ^ 0) ^ (199 ^ 166);
        lllIIIlIIIlI[5] = (19 ^ 45) ^ (24 ^ 35);
        lllIIIlIIIlI[6] = (120 ^ 27) ^ (247 ^ 146);
        lllIIIlIIIlI[7] = (-18950) & 28367;
        lllIIIlIIIlI[8] = (-((-8797) & 11871)) & (-617) & 28411;
        lllIIIlIIIlI[9] = (185 ^ 153) ^ (170 ^ 141);
        lllIIIlIIIlI[10] = 118 ^ 126;
        lllIIIlIIIlI[11] = (91 ^ 30) ^ (113 ^ 61);
    }

    private static void lIIIlIIIlllIIlI() {
        lllIIIlIIIIl = new String[lllIIIlIIIlI[11]];
        lllIIIlIIIIl[lllIIIlIIIlI[1]] = lIIIlIIIllIllll("HHEL8lC/XXw=", "otinT");
        lllIIIlIIIIl[lllIIIlIIIlI[2]] = lIIIlIIIlllIIII("1eRrp2e5n0hHId2kxdIfJA==", "pNRKZ");
        lllIIIlIIIIl[lllIIIlIIIlI[0]] = lIIIlIIIlllIIIl("EBIoPiEvFiByJjkeKTc8", "XsDRN");
        lllIIIlIIIIl[lllIIIlIIIlI[3]] = lIIIlIIIllIllll("XBESbLTi3AQ=", "gBCXm");
        lllIIIlIIIIl[lllIIIlIIIlI[4]] = lIIIlIIIlllIIII("bcVG8qJtmxV5xLQWkQzHLg==", "ocSDL");
        lllIIIlIIIIl[lllIIIlIIIlI[5]] = lIIIlIIIllIllll("NfTpZVq+SlOBybpMROxyqQ==", "wiBwL");
        lllIIIlIIIIl[lllIIIlIIIlI[6]] = lIIIlIIIlllIIIl("ERQuNS81EGMhIzQB", "GuCEV");
        lllIIIlIIIIl[lllIIIlIIIlI[9]] = lIIIlIIIlllIIIl("QxcxDQQQ", "cyPdh");
        lllIIIlIIIIl[lllIIIlIIIlI[10]] = lIIIlIIIllIllll("B1S6J25KU4E=", "EPUXS");
    }

    private static String lIIIlIIIllIllll(String lllllllllllllllIIllIllllllIlIIlI, String lllllllllllllllIIllIllllllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIllllllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllllIlIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIlI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIIIlI[0], lllllllllllllllIIllIllllllIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllllllIlIIll) {
            lllllllllllllllIIllIllllllIlIIll.printStackTrace();
            return null;
        }
    }

    public static boolean p() {
        int[] iArr = new int[lllIIIlIIIlI[0]];
        iArr[lllIIIlIIIlI[1]] = lllIIIlIIIlI[7];
        iArr[lllIIIlIIIlI[2]] = lllIIIlIIIlI[8];
        return Equipment.contains(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean m() {
        if (lIIIlIIIlllIllI(Inventory.getFirst(item -> {
            if (lIIIlIIIlllIlIl(item.getName().toLowerCase().contains(lllIIIlIIIIl[lllIIIlIIIlI[10]]) ? 1 : 0)) {
                int[] iArr = new int[lllIIIlIIIlI[2]];
                iArr[lllIIIlIIIlI[1]] = item.getId();
                if (lIIIlIIIlllIlll(Inventory.getCount(iArr), lllIIIlIIIlI[0])) {
                    ?? r0 = lllIIIlIIIlI[2];
                    "".length();
                    return (((163 ^ 171) ^ " ".length()) & (((((41 + 114) - 86) + 105) ^ (((97 + 70) - 131) + 131)) ^ (-" ".length()))) != 0 ? ((48 ^ 102) ^ (63 ^ 53)) & (((((136 + 156) - 245) + 172) ^ (((90 + 4) - 91) + 132)) ^ (-" ".length())) : r0;
                }
            }
            return lllIIIlIIIlI[1];
        }))) {
            ?? r0 = lllIIIlIIIlI[2];
            "".length();
            return ((((171 + 166) - 213) + 52) ^ (((148 + 111) - 226) + 147)) != ((104 ^ 66) ^ (49 ^ 31)) ? ((((195 + 190) - 174) + 17) ^ (((29 + 22) - (-46)) + 38)) & (((((228 + 94) - 132) + 39) ^ (((61 + 66) - 36) + 43)) ^ (-" ".length())) : r0;
        }
        return lllIIIlIIIlI[1];
    }

    private static String lIIIlIIIlllIIII(String lllllllllllllllIIllIllllllllIlll, String lllllllllllllllIIllIllllllllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlllllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlllllllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlllllllllIIl.init(lllIIIlIIIlI[0], lllllllllllllllIIllIlllllllllIlI);
            return new String(lllllllllllllllIIllIlllllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlllllllllIII) {
            lllllllllllllllIIllIlllllllllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean a(z zVar) {
        return lIIIlIIIllllIII(zVar, z.NONE) ? lllIIIlIIIlI[1] : zVar.spell.canCast();
    }

    private static boolean lIIIlIIIllllIII(Object obj, Object obj2) {
        return obj == obj2;
    }
}
