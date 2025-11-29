/*
 * Decompiled with CFR 0.152.
 */
package l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c VETERAN;
    private /* synthetic */ int pointsPerGame;
    private /* synthetic */ String difficulty;
    public static final /* synthetic */ /* enum */ c INTERMEDIATE;
    private static /* synthetic */ String[] lIIIlIlIIIIII;
    private /* synthetic */ int levelRequirement;
    private /* synthetic */ int objectID;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c NOVICE;
    private static /* synthetic */ int[] lIIIlIlIIIIIl;

    static {
        c.lIIllllllIlIIII();
        c.lIIllllllIIllll();
        NOVICE = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[1]], lIIIlIlIIIIIl[2], lIIIlIlIIIIIl[3], lIIIlIlIIIIIl[4]);
        INTERMEDIATE = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[4]], lIIIlIlIIIIIl[6], lIIIlIlIIIIIl[7], lIIIlIlIIIIIl[8]);
        VETERAN = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[9]], lIIIlIlIIIIIl[10], lIIIlIlIIIIIl[11], lIIIlIlIIIIIl[9]);
        c[] cArray = new c[lIIIlIlIIIIIl[4]];
        cArray[c.lIIIlIlIIIIIl[0]] = NOVICE;
        cArray[c.lIIIlIlIIIIIl[1]] = INTERMEDIATE;
        cArray[c.lIIIlIlIIIIIl[5]] = VETERAN;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIIllllllIIllll() {
        lIIIlIlIIIIII = new String[lIIIlIlIIIIIl[12]];
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[0]] = c.lIIllllllIIllII("FxgdIBsc", "YWKiX");
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[1]] = c.lIIllllllIIllIl("ES8ufqM9V20=", "JhhtY");
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[5]] = c.lIIllllllIIlllI("gx1vpwztCmyEJVRa6OdpwQ==", "iundj");
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[4]] = c.lIIllllllIIllII("ERkMACM1EhwMMCwS", "XwxeQ");
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[8]] = c.lIIllllllIIlllI("pEP+1mKLbcA=", "BLDBp");
        c.lIIIlIlIIIIII[c.lIIIlIlIIIIIl[9]] = c.lIIllllllIIllIl("cIxGU+OMMU8=", "oxuUs");
    }

    private static void lIIllllllIlIIII() {
        lIIIlIlIIIIIl = new int[14];
        c.lIIIlIlIIIIIl[0] = (4 ^ 0xF ^ (0x66 ^ 0x73)) & (0x49 ^ 0x18 ^ (0xB ^ 0x44) ^ -" ".length());
        c.lIIIlIlIIIIIl[1] = " ".length();
        c.lIIIlIlIIIIIl[2] = 0x99 ^ 0xB1;
        c.lIIIlIlIIIIIl[3] = -(0xFFFFCCF3 & 0x7B0D) & (0xFFFFFFFF & 0x7FEB);
        c.lIIIlIlIIIIIl[4] = "   ".length();
        c.lIIIlIlIIIIIl[5] = "  ".length();
        c.lIIIlIlIIIIIl[6] = 0xF7 ^ 0xB1;
        c.lIIIlIlIIIIIl[7] = 0xFFFFFEDF & 0x653F;
        c.lIIIlIlIIIIIl[8] = (0x27 ^ 0x6D) & ~(0x11 ^ 0x5B) ^ (0x28 ^ 0x2C);
        c.lIIIlIlIIIIIl[9] = 125 + 43 - 65 + 50 ^ 105 + 135 - 109 + 25;
        c.lIIIlIlIIIIIl[10] = 0x6C ^ 0x1D ^ (0x47 ^ 0x52);
        c.lIIIlIlIIIIIl[11] = 0xFFFFE472 & 0x7FAD;
        c.lIIIlIlIIIIIl[12] = 0x92 ^ 0x94;
        c.lIIIlIlIIIIIl[13] = 0xBA ^ 0xB2;
    }

    public String j() {
        return this.difficulty;
    }

    public String toString() {
        return "Boats." + this.name() + "(difficulty=" + this.j() + ", levelRequirement=" + this.k() + ", objectID=" + this.l() + ", pointsPerGame=" + this.m() + ")";
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static boolean lIIllllllIlIIIl(int n, int n2) {
        return n < n2;
    }

    private static String lIIllllllIIllIl(String lllllllllllllllIIIIlllIllIIIIlII, String lllllllllllllllIIIIlllIllIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIIIIl[13]), "DES");
            Cipher lllllllllllllllIIIIlllIllIIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIllIIIIllI.init(lIIIlIlIIIIIl[5], lllllllllllllllIIIIlllIllIIIIlll);
            return new String(lllllllllllllllIIIIlllIllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIllIIIIlIl) {
            lllllllllllllllIIIIlllIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIllllllIIlllI(String lllllllllllllllIIIIlllIlIlllIlll, String lllllllllllllllIIIIlllIlIlllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIlIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIlIllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIlIllllIIl.init(lIIIlIlIIIIIl[5], lllllllllllllllIIIIlllIlIllllIlI);
            return new String(lllllllllllllllIIIIlllIlIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIlIllllIII) {
            lllllllllllllllIIIIlllIlIllllIII.printStackTrace();
            return null;
        }
    }

    public int m() {
        return this.pointsPerGame;
    }

    private c(String string2, int n2, int n3, int n4) {
        this.difficulty = string2;
        this.levelRequirement = n2;
        this.objectID = n3;
        this.pointsPerGame = n4;
    }

    public int k() {
        return this.levelRequirement;
    }

    public int l() {
        return this.objectID;
    }

    private static String lIIllllllIIllII(String lllllllllllllllIIIIlllIllIIllIIl, String lllllllllllllllIIIIlllIllIIlIIll) {
        lllllllllllllllIIIIlllIllIIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIllIIlIlll = new StringBuilder();
        char[] lllllllllllllllIIIIlllIllIIlIllI = lllllllllllllllIIIIlllIllIIlIIll.toCharArray();
        int lllllllllllllllIIIIlllIllIIlIlIl = lIIIlIlIIIIIl[0];
        char[] lllllllllllllllIIIIlllIllIIIllll = lllllllllllllllIIIIlllIllIIllIIl.toCharArray();
        int lllllllllllllllIIIIlllIllIIIlllI = lllllllllllllllIIIIlllIllIIIllll.length;
        int lllllllllllllllIIIIlllIllIIIllIl = lIIIlIlIIIIIl[0];
        while (c.lIIllllllIlIIIl(lllllllllllllllIIIIlllIllIIIllIl, lllllllllllllllIIIIlllIllIIIlllI)) {
            char lllllllllllllllIIIIlllIllIIllIlI = lllllllllllllllIIIIlllIllIIIllll[lllllllllllllllIIIIlllIllIIIllIl];
            lllllllllllllllIIIIlllIllIIlIlll.append((char)(lllllllllllllllIIIIlllIllIIllIlI ^ lllllllllllllllIIIIlllIllIIlIllI[lllllllllllllllIIIIlllIllIIlIlIl % lllllllllllllllIIIIlllIllIIlIllI.length]));
            "".length();
            ++lllllllllllllllIIIIlllIllIIlIlIl;
            ++lllllllllllllllIIIIlllIllIIIllIl;
            "".length();
            if (" ".length() <= "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlllIllIIlIlll);
    }
}

