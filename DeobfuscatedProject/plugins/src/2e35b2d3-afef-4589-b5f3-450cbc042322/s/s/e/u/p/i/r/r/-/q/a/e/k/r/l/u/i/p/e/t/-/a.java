/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class a
extends Enum<a> {
    private static /* synthetic */ int[] lIlIIlIlIIlIl;
    private static /* synthetic */ String[] lIlIIlIlIIlII;
    private final /* synthetic */ WorldPoint worldPoint;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a KONAR;
    public static final /* synthetic */ /* enum */ a NIEVE;
    public static final /* synthetic */ /* enum */ a DURADEl;

    private static String lIlllIlIllllIIl(String llllllllllllllIllIlllIIllIIIIIII, String llllllllllllllIllIlllIIlIlllllll) {
        llllllllllllllIllIlllIIllIIIIIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIIllIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIIlIllllllI = new StringBuilder();
        char[] llllllllllllllIllIlllIIlIlllllIl = llllllllllllllIllIlllIIlIlllllll.toCharArray();
        int llllllllllllllIllIlllIIlIlllllII = lIlIIlIlIIlIl[0];
        char[] llllllllllllllIllIlllIIlIlllIllI = llllllllllllllIllIlllIIllIIIIIII.toCharArray();
        int llllllllllllllIllIlllIIlIlllIlIl = llllllllllllllIllIlllIIlIlllIllI.length;
        int llllllllllllllIllIlllIIlIlllIlII = lIlIIlIlIIlIl[0];
        while (a.lIlllIlIlllllIl(llllllllllllllIllIlllIIlIlllIlII, llllllllllllllIllIlllIIlIlllIlIl)) {
            char llllllllllllllIllIlllIIllIIIIIIl = llllllllllllllIllIlllIIlIlllIllI[llllllllllllllIllIlllIIlIlllIlII];
            llllllllllllllIllIlllIIlIllllllI.append((char)(llllllllllllllIllIlllIIllIIIIIIl ^ llllllllllllllIllIlllIIlIlllllIl[llllllllllllllIllIlllIIlIlllllII % llllllllllllllIllIlllIIlIlllllIl.length]));
            "".length();
            ++llllllllllllllIllIlllIIlIlllllII;
            ++llllllllllllllIllIlllIIlIlllIlII;
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlllIIlIllllllI);
    }

    static {
        a.lIlllIlIlllllII();
        a.lIlllIlIllllIll();
        NIEVE = new a(new WorldPoint(lIlIIlIlIIlIl[1], lIlIIlIlIIlIl[2], lIlIIlIlIIlIl[0]));
        DURADEl = new a(new WorldPoint(lIlIIlIlIIlIl[4], lIlIIlIlIIlIl[5], lIlIIlIlIIlIl[3]));
        KONAR = new a(new WorldPoint(lIlIIlIlIIlIl[7], lIlIIlIlIIlIl[8], lIlIIlIlIIlIl[0]));
        a[] aArray = new a[lIlIIlIlIIlIl[9]];
        aArray[a.lIlIIlIlIIlIl[0]] = NIEVE;
        aArray[a.lIlIIlIlIIlIl[3]] = DURADEl;
        aArray[a.lIlIIlIlIIlIl[6]] = KONAR;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static void lIlllIlIllllIll() {
        lIlIIlIlIIlII = new String[lIlIIlIlIIlIl[9]];
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[0]] = a.lIlllIlIllllIII("YK7+x1hzjbk=", "lBnyc");
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[3]] = a.lIlllIlIllllIIl("NCUiBwk1HA==", "pppFM");
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[6]] = a.lIlllIlIllllIlI("PbCdvYY9l1g=", "caKWZ");
    }

    private static void lIlllIlIlllllII() {
        lIlIIlIlIIlIl = new int[11];
        a.lIlIIlIlIIlIl[0] = (0x49 ^ 0x6C ^ (0x91 ^ 0xA3)) & (0xB6 ^ 0x9F ^ (0x83 ^ 0xBD) ^ -" ".length());
        a.lIlIIlIlIIlIl[1] = -(0xFFFFEBFB & 0x346E) & (0xFFFFBDEF & 0x6BFB);
        a.lIlIIlIlIIlIl[2] = -(0xFFFFB6AB & 0x7B55) & (0xFFFFBF5F & Short.MAX_VALUE);
        a.lIlIIlIlIIlIl[3] = " ".length();
        a.lIlIIlIlIIlIl[4] = -(0xFFFFFECF & 0x71F3) & (0xFFFFFFFF & 0x7BF7);
        a.lIlIIlIlIIlIl[5] = -(0xFFFFB5EF & 0x7E1A) & (0xFFFFFFBD & 0x3FEF);
        a.lIlIIlIlIIlIl[6] = "  ".length();
        a.lIlIIlIlIIlIl[7] = -(0xFFFFCE47 & 0x33B9) & (0xFFFFA75D & 0x5FBE);
        a.lIlIIlIlIIlIl[8] = 0xFFFFBEED & 0x4FDE;
        a.lIlIIlIlIIlIl[9] = "   ".length();
        a.lIlIIlIlIIlIl[10] = 0x39 ^ 0x78 ^ (0xE4 ^ 0xAD);
    }

    private static String lIlllIlIllllIII(String llllllllllllllIllIlllIIllIIllIll, String llllllllllllllIllIlllIIllIIlllII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIIllIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIIllIIlllll.init(lIlIIlIlIIlIl[6], llllllllllllllIllIlllIIllIlIIIII);
            return new String(llllllllllllllIllIlllIIllIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIIllIIllllI) {
            llllllllllllllIllIlllIIllIIllllI.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static String lIlllIlIllllIlI(String llllllllllllllIllIlllIIllIIlIIII, String llllllllllllllIllIlllIIllIIIllll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIllIIIllll.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIIlIl[10]), "DES");
            Cipher llllllllllllllIllIlllIIllIIlIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlllIIllIIlIIlI.init(lIlIIlIlIIlIl[6], llllllllllllllIllIlllIIllIIlIIll);
            return new String(llllllllllllllIllIlllIIllIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIIllIIlIIIl) {
            llllllllllllllIllIlllIIllIIlIIIl.printStackTrace();
            return null;
        }
    }

    public WorldPoint k() {
        return this.worldPoint;
    }

    private static boolean lIlllIlIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private a(WorldPoint worldPoint) {
        this.worldPoint = worldPoint;
    }
}

