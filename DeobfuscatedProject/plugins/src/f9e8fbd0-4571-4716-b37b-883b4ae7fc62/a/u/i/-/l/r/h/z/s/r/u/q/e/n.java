/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class n
extends Enum<n> {
    private static /* synthetic */ int[] lIllIlIlIIIll;
    public static final /* synthetic */ /* enum */ n EAST;
    public static final /* synthetic */ /* enum */ n NORTH_WEST;
    private final /* synthetic */ int x;
    public static final /* synthetic */ /* enum */ n WEST;
    public static final /* synthetic */ /* enum */ n CENTER_WEST;
    private final /* synthetic */ int y;
    public static final /* synthetic */ /* enum */ n NORTH_EAST;
    public static final /* synthetic */ /* enum */ n CENTER;
    private static /* synthetic */ String[] lIllIlIlIIIlI;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n CENTER_EAST;

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static void llIIIllllllIlIl() {
        lIllIlIlIIIll = new int[12];
        n.lIllIlIlIIIll[0] = (0xBF ^ 0x8B) & ~(0x5E ^ 0x6A);
        n.lIllIlIlIIIll[1] = 0x33 ^ 0x28 ^ (0x91 ^ 0x8C);
        n.lIllIlIlIIIll[2] = 0x29 ^ 0x31 ^ (0xD0 ^ 0xC1);
        n.lIllIlIlIIIll[3] = " ".length();
        n.lIllIlIlIIIll[4] = -(0x1B ^ 0x72 ^ (0x3D ^ 0x50));
        n.lIllIlIlIIIll[5] = 0x64 ^ 0x6E;
        n.lIllIlIlIIIll[6] = "  ".length();
        n.lIllIlIlIIIll[7] = 7 ^ 0x64 ^ (0xC1 ^ 0xA6);
        n.lIllIlIlIIIll[8] = "   ".length();
        n.lIllIlIlIIIll[9] = 0x49 ^ 0x4C;
        n.lIllIlIlIIIll[10] = 0x5D ^ 0x5A;
        n.lIllIlIlIIIll[11] = 0x80 ^ 0x88;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static String llIIIllllllIIlI(String llllllllllllllIllIIIlllIIlIIIlll, String llllllllllllllIllIIIlllIIlIIIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlllIIlIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlllIIlIIlIIl.init(lIllIlIlIIIll[6], llllllllllllllIllIIIlllIIlIIlIlI);
            return new String(llllllllllllllIllIIIlllIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlllIIlIIlIII) {
            llllllllllllllIllIIIlllIIlIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        n.llIIIllllllIlIl();
        n.llIIIllllllIlII();
        NORTH_EAST = new n(lIllIlIlIIIll[1], lIllIlIlIIIll[2]);
        NORTH_WEST = new n(lIllIlIlIIIll[4], lIllIlIlIIIll[5]);
        WEST = new n(lIllIlIlIIIll[4], lIllIlIlIIIll[7]);
        EAST = new n(lIllIlIlIIIll[7], lIllIlIlIIIll[7]);
        CENTER_WEST = new n(lIllIlIlIIIll[4], lIllIlIlIIIll[3]);
        CENTER_EAST = new n(lIllIlIlIIIll[7], lIllIlIlIIIll[3]);
        CENTER = new n(lIllIlIlIIIll[0], lIllIlIlIIIll[0]);
        n[] nArray = new n[lIllIlIlIIIll[10]];
        nArray[n.lIllIlIlIIIll[0]] = NORTH_EAST;
        nArray[n.lIllIlIlIIIll[3]] = NORTH_WEST;
        nArray[n.lIllIlIlIIIll[6]] = WEST;
        nArray[n.lIllIlIlIIIll[8]] = EAST;
        nArray[n.lIllIlIlIIIll[7]] = CENTER_WEST;
        nArray[n.lIllIlIlIIIll[9]] = CENTER_EAST;
        nArray[n.lIllIlIlIIIll[1]] = CENTER;
        $VALUES = nArray;
    }

    public int H() {
        return this.y;
    }

    private static String llIIIllllllIIIl(String llllllllllllllIllIIIlllIIlIlIlII, String llllllllllllllIllIIIlllIIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIIll[11]), "DES");
            Cipher llllllllllllllIllIIIlllIIlIlIllI = Cipher.getInstance("DES");
            llllllllllllllIllIIIlllIIlIlIllI.init(lIllIlIlIIIll[6], llllllllllllllIllIIIlllIIlIlIlll);
            return new String(llllllllllllllIllIIIlllIIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlllIIlIlIlIl) {
            llllllllllllllIllIIIlllIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIllllllIIll(String llllllllllllllIllIIIlllIIIllIlll, String llllllllllllllIllIIIlllIIIllIIIl) {
        llllllllllllllIllIIIlllIIIllIlll = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlllIIIllIlIl = new StringBuilder();
        char[] llllllllllllllIllIIIlllIIIllIlII = llllllllllllllIllIIIlllIIIllIIIl.toCharArray();
        int llllllllllllllIllIIIlllIIIllIIll = lIllIlIlIIIll[0];
        char[] llllllllllllllIllIIIlllIIIlIllIl = llllllllllllllIllIIIlllIIIllIlll.toCharArray();
        int llllllllllllllIllIIIlllIIIlIllII = llllllllllllllIllIIIlllIIIlIllIl.length;
        int llllllllllllllIllIIIlllIIIlIlIll = lIllIlIlIIIll[0];
        while (n.llIIIllllllIllI(llllllllllllllIllIIIlllIIIlIlIll, llllllllllllllIllIIIlllIIIlIllII)) {
            char llllllllllllllIllIIIlllIIIlllIII = llllllllllllllIllIIIlllIIIlIllIl[llllllllllllllIllIIIlllIIIlIlIll];
            llllllllllllllIllIIIlllIIIllIlIl.append((char)(llllllllllllllIllIIIlllIIIlllIII ^ llllllllllllllIllIIIlllIIIllIlII[llllllllllllllIllIIIlllIIIllIIll % llllllllllllllIllIIIlllIIIllIlII.length]));
            "".length();
            ++llllllllllllllIllIIIlllIIIllIIll;
            ++llllllllllllllIllIIIlllIIIlIlIll;
            "".length();
            if (-"   ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlllIIIllIlIl);
    }

    private n(int n3, int n4) {
        this.x = n3;
        this.y = n4;
    }

    public int G() {
        return this.x;
    }

    private static void llIIIllllllIlII() {
        lIllIlIlIIIlI = new String[lIllIlIlIIIll[10]];
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[0]] = n.llIIIllllllIIIl("ECzXfNYFva5sx6PPzGOO5g==", "hEcuD");
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[3]] = n.llIIIllllllIIlI("33iIaooaT/kT0kenNfd87A==", "rsHkX");
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[6]] = n.llIIIllllllIIlI("vob94k5l3ao=", "mqGRB");
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[8]] = n.llIIIllllllIIll("BBUXNw==", "ATDcM");
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[7]] = n.llIIIllllllIIll("NQI9PwkkGCQuHyI=", "vGskL");
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[9]] = n.llIIIllllllIIll("Ki8GFh87NQ0DCT0=", "ijHBZ");
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[1]] = n.llIIIllllllIIll("DiIlMSkf", "Mgkel");
    }

    private static boolean llIIIllllllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

