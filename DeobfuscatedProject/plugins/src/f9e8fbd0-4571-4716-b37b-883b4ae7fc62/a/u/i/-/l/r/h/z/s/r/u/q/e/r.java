/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.s;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class r
extends Enum<r> {
    private /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ r MELEE;
    private static /* synthetic */ int[] lIllIllIIlIII;
    private static /* synthetic */ String[] lIllIllIIIlII;
    public static final /* synthetic */ /* enum */ r JAD_RANGE_FIRST;
    private static final /* synthetic */ r[] $VALUES;
    public static final /* synthetic */ /* enum */ r RANGE;
    public static final /* synthetic */ /* enum */ r JAD_MAGIC_FIRST;
    public static final /* synthetic */ /* enum */ r MAGIC;

    private static String llIIlIIIlIlllII(String llllllllllllllIllIIIlIlllIIllIll, String llllllllllllllIllIIIlIlllIIllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIlllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIlllIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIlllIIlllll.init(lIllIllIIlIII[4], llllllllllllllIllIIIlIlllIlIIIII);
            return new String(llllllllllllllIllIIIlIlllIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIlllIIllllI) {
            llllllllllllllIllIIIlIlllIIllllI.printStackTrace();
            return null;
        }
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    public Prayer M() {
        switch (s.r[this.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return Prayer.MYSTIC_MIGHT;
            }
            case 5: {
                return Prayer.EAGLE_EYE;
            }
        }
        return Prayer.MYSTIC_MIGHT;
    }

    static {
        r.llIIlIIIllIIIll();
        r.llIIlIIIlIlllll();
        RANGE = new r(lIllIllIIlIII[1]);
        MELEE = new r(lIllIllIIlIII[3]);
        MAGIC = new r(lIllIllIIlIII[5]);
        JAD_MAGIC_FIRST = new r(lIllIllIIlIII[1]);
        JAD_RANGE_FIRST = new r(lIllIllIIlIII[1]);
        r[] rArray = new r[lIllIllIIlIII[8]];
        rArray[r.lIllIllIIlIII[0]] = RANGE;
        rArray[r.lIllIllIIlIII[2]] = MELEE;
        rArray[r.lIllIllIIlIII[4]] = MAGIC;
        rArray[r.lIllIllIIlIII[6]] = JAD_MAGIC_FIRST;
        rArray[r.lIllIllIIlIII[7]] = JAD_RANGE_FIRST;
        $VALUES = rArray;
    }

    private r(int n3) {
        this.id = n3;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    private static void llIIlIIIllIIIll() {
        lIllIllIIlIII = new int[10];
        r.lIllIllIIlIII[0] = (138 + 188 - 305 + 169 ^ 44 + 58 - 62 + 92) & (0x59 ^ 0x43 ^ (0x19 ^ 0x39) ^ -" ".length());
        r.lIllIllIIlIII[1] = 0xFFFF9FFB & 0x67FE;
        r.lIllIllIIlIII[2] = " ".length();
        r.lIllIllIIlIII[3] = -(0xFFFFB315 & 0x6CEF) & (0xFFFFE7FF & 0x3FFF);
        r.lIllIllIIlIII[4] = "  ".length();
        r.lIllIllIIlIII[5] = -(0xFFFFF8C6 & 0x3F3D) & (0xFFFFFFFF & 0x3FFF);
        r.lIllIllIIlIII[6] = "   ".length();
        r.lIllIllIIlIII[7] = 0xEC ^ 0x9C ^ (0xB7 ^ 0xC3);
        r.lIllIllIIlIII[8] = 0xB3 ^ 0x9C ^ (0x3F ^ 0x15);
        r.lIllIllIIlIII[9] = 8 ^ 0x5B ^ (0xDA ^ 0x81);
    }

    private static String llIIlIIIlIllIll(String llllllllllllllIllIIIlIlllIllIIlI, String llllllllllllllIllIIIlIlllIlIllII) {
        llllllllllllllIllIIIlIlllIllIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIlllIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIlllIllIIII = new StringBuilder();
        char[] llllllllllllllIllIIIlIlllIlIllll = llllllllllllllIllIIIlIlllIlIllII.toCharArray();
        int llllllllllllllIllIIIlIlllIlIlllI = lIllIllIIlIII[0];
        char[] llllllllllllllIllIIIlIlllIlIlIII = llllllllllllllIllIIIlIlllIllIIlI.toCharArray();
        int llllllllllllllIllIIIlIlllIlIIlll = llllllllllllllIllIIIlIlllIlIlIII.length;
        int llllllllllllllIllIIIlIlllIlIIllI = lIllIllIIlIII[0];
        while (r.llIIlIIIllIIlII(llllllllllllllIllIIIlIlllIlIIllI, llllllllllllllIllIIIlIlllIlIIlll)) {
            char llllllllllllllIllIIIlIlllIllIIll = llllllllllllllIllIIIlIlllIlIlIII[llllllllllllllIllIIIlIlllIlIIllI];
            llllllllllllllIllIIIlIlllIllIIII.append((char)(llllllllllllllIllIIIlIlllIllIIll ^ llllllllllllllIllIIIlIlllIlIllll[llllllllllllllIllIIIlIlllIlIlllI % llllllllllllllIllIIIlIlllIlIllll.length]));
            "".length();
            ++llllllllllllllIllIIIlIlllIlIlllI;
            ++llllllllllllllIllIIIlIlllIlIIllI;
            "".length();
            if (((122 + 78 - 115 + 82 ^ 84 + 120 - 168 + 95) & (73 + 92 - 98 + 77 ^ 176 + 80 - 109 + 33 ^ -" ".length())) == ((0xFB ^ 0xB4 ^ (0x93 ^ 0x84)) & (0x1D ^ 0x18 ^ (0x70 ^ 0x2D) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlIlllIllIIII);
    }

    private static void llIIlIIIlIlllll() {
        lIllIllIIIlII = new String[lIllIllIIlIII[8]];
        r.lIllIllIIIlII[r.lIllIllIIlIII[0]] = r.llIIlIIIlIllIlI("lzXWa1BXSyw=", "sbyPj");
        r.lIllIllIIIlII[r.lIllIllIIlIII[2]] = r.llIIlIIIlIllIll("KwMIJj0=", "fFDcx");
        r.lIllIllIIIlII[r.lIllIllIIlIII[4]] = r.llIIlIIIlIlllII("LhK3eE6uKgo=", "vGpFw");
        r.lIllIllIIIlII[r.lIllIllIIlIII[6]] = r.llIIlIIIlIllIll("GwYAGioQAA0GOBcOFhYz", "QGDEg");
        r.lIllIllIIIlII[r.lIllIllIIlIII[7]] = r.llIIlIIIlIllIll("OSAuGxYyLy0BGzUoOBcQ", "sajDD");
    }

    public int L() {
        return this.id;
    }

    private static String llIIlIIIlIllIlI(String llllllllllllllIllIIIlIllllIIIIlI, String llllllllllllllIllIIIlIlllIllllll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIllllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlllIllllll.getBytes(StandardCharsets.UTF_8)), lIllIllIIlIII[9]), "DES");
            Cipher llllllllllllllIllIIIlIllllIIIlII = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIllllIIIlII.init(lIllIllIIlIII[4], llllllllllllllIllIIIlIllllIIIlIl);
            return new String(llllllllllllllIllIIIlIllllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIllllIIIIll) {
            llllllllllllllIllIIIlIllllIIIIll.printStackTrace();
            return null;
        }
    }

    public Prayer N() {
        switch (s.r[this.ordinal()]) {
            case 2: 
            case 5: {
                return Prayer.PROTECT_FROM_MAGIC;
            }
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }

    private static boolean llIIlIIIllIIlII(int n2, int n3) {
        return n2 < n3;
    }
}

