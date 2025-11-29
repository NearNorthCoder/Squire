/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.z;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public class a {
    private static /* synthetic */ String[] lllIIIlIIIIl;
    private static /* synthetic */ int[] lllIIIlIIIlI;

    private static boolean lIIIlIIIlllIlIl(int n2) {
        return n2 != 0;
    }

    static {
        a.lIIIlIIIlllIIll();
        a.lIIIlIIIlllIIlI();
    }

    private static String lIIIlIIIlllIIIl(String lllllllllllllllIIllIlllllllIIlll, String lllllllllllllllIIllIlllllllIIllI) {
        lllllllllllllllIIllIlllllllIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllllllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlllllllIIlIl = new StringBuilder();
        char[] lllllllllllllllIIllIlllllllIIlII = lllllllllllllllIIllIlllllllIIllI.toCharArray();
        int lllllllllllllllIIllIlllllllIIIll = lllIIIlIIIlI[1];
        char[] lllllllllllllllIIllIllllllIlllIl = lllllllllllllllIIllIlllllllIIlll.toCharArray();
        int lllllllllllllllIIllIllllllIlllII = lllllllllllllllIIllIllllllIlllIl.length;
        int lllllllllllllllIIllIllllllIllIll = lllIIIlIIIlI[1];
        while (a.lIIIlIIIllllIIl(lllllllllllllllIIllIllllllIllIll, lllllllllllllllIIllIllllllIlllII)) {
            char lllllllllllllllIIllIlllllllIlIII = lllllllllllllllIIllIllllllIlllIl[lllllllllllllllIIllIllllllIllIll];
            lllllllllllllllIIllIlllllllIIlIl.append((char)(lllllllllllllllIIllIlllllllIlIII ^ lllllllllllllllIIllIlllllllIIlII[lllllllllllllllIIllIlllllllIIIll % lllllllllllllllIIllIlllllllIIlII.length]));
            "".length();
            ++lllllllllllllllIIllIlllllllIIIll;
            ++lllllllllllllllIIllIllllllIllIll;
            "".length();
            if (" ".length() == " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlllllllIIlIl);
    }

    private static boolean lIIIlIIIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIlllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIIIlllIlII(int n2) {
        return n2 == 0;
    }

    public static boolean n() {
        boolean bl;
        if (a.lIIIlIIIlllIllI(Inventory.getFirst(item -> {
            int n2;
            if (a.lIIIlIIIlllIlIl(item.getName().contains(lllIIIlIIIIl[lllIIIlIIIlI[9]]) ? 1 : 0) && a.lIIIlIIIlllIlll(item.getQuantity(), lllIIIlIIIlI[5])) {
                n2 = lllIIIlIIIlI[2];
                "".length();
                if (((0x71 ^ 0x23) & ~(0x54 ^ 6)) <= -" ".length()) {
                    return ((0x1E ^ 0x30) & ~(0x6B ^ 0x45)) != 0;
                }
            } else {
                n2 = lllIIIlIIIlI[1];
            }
            return n2 != 0;
        }))) {
            bl = lllIIIlIIIlI[2];
            "".length();
            if (((32 + 124 - 59 + 128 ^ 119 + 39 - -6 + 30) & (123 + 86 - 187 + 126 ^ 108 + 165 - 91 + 1 ^ -" ".length())) != ((189 + 20 - 47 + 83 ^ 62 + 88 - 80 + 80) & (247 + 180 - 250 + 72 ^ 79 + 117 - 53 + 11 ^ -" ".length()))) {
                return ((0x7F ^ 0xC ^ (0xF ^ 0x6B)) & (0xD3 ^ 0x80 ^ (0xD0 ^ 0x94) ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIIlIIIlI[1];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean k() {
        boolean bl;
        block3: {
            block2: {
                String[] stringArray = new String[lllIIIlIIIlI[0]];
                stringArray[a.lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[1]];
                stringArray[a.lllIIIlIIIlI[2]] = lllIIIlIIIIl[lllIIIlIIIlI[2]];
                if (!a.lIIIlIIIlllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
                String[] stringArray2 = new String[lllIIIlIIIlI[2]];
                stringArray2[a.lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[0]];
                if (!a.lIIIlIIIlllIlIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block3;
            }
            bl = lllIIIlIIIlI[2];
            "".length();
            if ("   ".length() != ((0x2B ^ 0x2D ^ (0x2E ^ 0x36)) & (0xB8 ^ 0xAF ^ (0xAC ^ 0xA5) ^ -" ".length()))) return bl;
            return ((0x6D ^ 0x3A ^ (0x25 ^ 0x62)) & (0x37 ^ 0x23 ^ (0x2F ^ 0x2B) ^ -" ".length())) != 0;
        }
        bl = lllIIIlIIIlI[1];
        return bl;
    }

    public static boolean l() {
        String[] stringArray = new String[lllIIIlIIIlI[2]];
        stringArray[a.lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[3]];
        return Inventory.contains((String[])stringArray);
    }

    public static boolean o() {
        boolean bl;
        String[] stringArray = new String[lllIIIlIIIlI[2]];
        stringArray[a.lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[4]];
        if (a.lIIIlIIIlllIlIl(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lllIIIlIIIlI[2]];
            stringArray2[a.lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[5]];
            if (a.lIIIlIIIlllIlll(Inventory.getCount((String[])stringArray2), lllIIIlIIIlI[2])) {
                bl = lllIIIlIIIlI[2];
                "".length();
                if (null != null) {
                    return ((0x6F ^ 0x2F) & ~(0x4E ^ 0xE)) != 0;
                }
            } else {
                bl = lllIIIlIIIlI[1];
                "".length();
                if (-" ".length() >= " ".length()) {
                    return ((0 ^ 0x47 ^ (0x45 ^ 0x12)) & (0x13 ^ 0x77 ^ (0x50 ^ 0x24) ^ -" ".length())) != 0;
                }
            }
        } else {
            String[] stringArray3 = new String[lllIIIlIIIlI[2]];
            stringArray3[a.lllIIIlIIIlI[1]] = lllIIIlIIIIl[lllIIIlIIIlI[6]];
            if (a.lIIIlIIIlllIlll(Inventory.getCount((String[])stringArray3), lllIIIlIIIlI[0])) {
                bl = lllIIIlIIIlI[2];
                "".length();
                if (((85 + 100 - 85 + 49 ^ 80 + 50 - 28 + 74) & (0x42 ^ 0x2B ^ (0xC0 ^ 0x8C) ^ -" ".length())) != ((109 + 112 - 180 + 104 ^ 43 + 32 - -15 + 60) & (0x15 ^ 0x7E ^ (0x33 ^ 0x5F) ^ -" ".length()))) {
                    return ((130 + 149 - 102 + 5 ^ 1 + 48 - -15 + 85) & (0xBB ^ 0x8A ^ (0x74 ^ 0x66) ^ -" ".length())) != 0;
                }
            } else {
                bl = lllIIIlIIIlI[1];
            }
        }
        return bl;
    }

    private static boolean lIIIlIIIlllIllI(Object object) {
        return object != null;
    }

    private static void lIIIlIIIlllIIll() {
        lllIIIlIIIlI = new int[12];
        a.lllIIIlIIIlI[0] = "  ".length();
        a.lllIIIlIIIlI[1] = (0x96 ^ 0xC0 ^ (0x56 ^ 5)) & (0xE ^ 0x72 ^ (0x30 ^ 0x49) ^ -" ".length());
        a.lllIIIlIIIlI[2] = " ".length();
        a.lllIIIlIIIlI[3] = "   ".length();
        a.lllIIIlIIIlI[4] = 0x65 ^ 0 ^ (0xC7 ^ 0xA6);
        a.lllIIIlIIIlI[5] = 0x13 ^ 0x2D ^ (0x18 ^ 0x23);
        a.lllIIIlIIIlI[6] = 0x78 ^ 0x1B ^ (0xF7 ^ 0x92);
        a.lllIIIlIIIlI[7] = 0xFFFFB5FA & 0x6ECF;
        a.lllIIIlIIIlI[8] = -(0xFFFFDDA3 & 0x2E5F) & (0xFFFFFD97 & 0x6EFB);
        a.lllIIIlIIIlI[9] = 0xB9 ^ 0x99 ^ (0xAA ^ 0x8D);
        a.lllIIIlIIIlI[10] = 0x76 ^ 0x7E;
        a.lllIIIlIIIlI[11] = 0x5B ^ 0x1E ^ (0x71 ^ 0x3D);
    }

    private static void lIIIlIIIlllIIlI() {
        lllIIIlIIIIl = new String[lllIIIlIIIlI[11]];
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[1]] = a.lIIIlIIIllIllll("HHEL8lC/XXw=", "otinT");
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[2]] = a.lIIIlIIIlllIIII("1eRrp2e5n0hHId2kxdIfJA==", "pNRKZ");
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[0]] = a.lIIIlIIIlllIIIl("EBIoPiEvFiByJjkeKTc8", "XsDRN");
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[3]] = a.lIIIlIIIllIllll("XBESbLTi3AQ=", "gBCXm");
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[4]] = a.lIIIlIIIlllIIII("bcVG8qJtmxV5xLQWkQzHLg==", "ocSDL");
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[5]] = a.lIIIlIIIllIllll("NfTpZVq+SlOBybpMROxyqQ==", "wiBwL");
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[6]] = a.lIIIlIIIlllIIIl("ERQuNS81EGMhIzQB", "GuCEV");
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[9]] = a.lIIIlIIIlllIIIl("QxcxDQQQ", "cyPdh");
        a.lllIIIlIIIIl[a.lllIIIlIIIlI[10]] = a.lIIIlIIIllIllll("B1S6J25KU4E=", "EPUXS");
    }

    private static String lIIIlIIIllIllll(String lllllllllllllllIIllIllllllIlIIlI, String lllllllllllllllIIllIllllllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIllllllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllllIlIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIlI[10]), "DES");
            Cipher lllllllllllllllIIllIllllllIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIIllIllllllIlIlII.init(lllIIIlIIIlI[0], lllllllllllllllIIllIllllllIlIlIl);
            return new String(lllllllllllllllIIllIllllllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllllllIlIIll) {
            lllllllllllllllIIllIllllllIlIIll.printStackTrace();
            return null;
        }
    }

    public static boolean p() {
        int[] nArray = new int[lllIIIlIIIlI[0]];
        nArray[a.lllIIIlIIIlI[1]] = lllIIIlIIIlI[7];
        nArray[a.lllIIIlIIIlI[2]] = lllIIIlIIIlI[8];
        return Equipment.contains((int[])nArray);
    }

    public static boolean m() {
        boolean bl;
        if (a.lIIIlIIIlllIllI(Inventory.getFirst(item -> {
            int n2;
            if (a.lIIIlIIIlllIlIl(item.getName().toLowerCase().contains(lllIIIlIIIIl[lllIIIlIIIlI[10]]) ? 1 : 0)) {
                int[] nArray = new int[lllIIIlIIIlI[2]];
                nArray[a.lllIIIlIIIlI[1]] = item.getId();
                if (a.lIIIlIIIlllIlll(Inventory.getCount((int[])nArray), lllIIIlIIIlI[0])) {
                    n2 = lllIIIlIIIlI[2];
                    "".length();
                    if (((0xA3 ^ 0xAB ^ " ".length()) & (41 + 114 - 86 + 105 ^ 97 + 70 - 131 + 131 ^ -" ".length())) == 0) return n2 != 0;
                    return ((0x30 ^ 0x66 ^ (0x3F ^ 0x35)) & (136 + 156 - 245 + 172 ^ 90 + 4 - 91 + 132 ^ -" ".length())) != 0;
                }
            }
            n2 = lllIIIlIIIlI[1];
            return n2 != 0;
        }))) {
            bl = lllIIIlIIIlI[2];
            "".length();
            if ((171 + 166 - 213 + 52 ^ 148 + 111 - 226 + 147) != (0x68 ^ 0x42 ^ (0x31 ^ 0x1F))) {
                return ((195 + 190 - 174 + 17 ^ 29 + 22 - -46 + 38) & (228 + 94 - 132 + 39 ^ 61 + 66 - 36 + 43 ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIIlIIIlI[1];
        }
        return bl;
    }

    private static String lIIIlIIIlllIIII(String lllllllllllllllIIllIllllllllIlIl, String lllllllllllllllIIllIllllllllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlllllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlllllllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlllllllllIIl.init(lllIIIlIIIlI[0], lllllllllllllllIIllIlllllllllIlI);
            return new String(lllllllllllllllIIllIlllllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlllllllllIII) {
            lllllllllllllllIIllIlllllllllIII.printStackTrace();
            return null;
        }
    }

    public static boolean a(z z2) {
        if (a.lIIIlIIIllllIII((Object)z2, (Object)z.NONE)) {
            return lllIIIlIIIlI[1];
        }
        return z2.spell.canCast();
    }

    private static boolean lIIIlIIIllllIII(Object object, Object object2) {
        return object == object2;
    }
}

