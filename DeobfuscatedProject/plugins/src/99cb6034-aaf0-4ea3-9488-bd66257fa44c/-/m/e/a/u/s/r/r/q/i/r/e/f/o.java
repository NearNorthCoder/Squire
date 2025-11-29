/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class o
extends Enum<o> {
    private static final /* synthetic */ o[] $VALUES;
    public static final /* synthetic */ /* enum */ o BIRD_HOUSE;
    private static /* synthetic */ int[] lIllllllIIII;
    public static final /* synthetic */ /* enum */ o HERBS;
    public static final /* synthetic */ /* enum */ o SEAWEED;
    public static final /* synthetic */ /* enum */ o TREES;
    private static /* synthetic */ String[] lIlllllIllll;

    private static void lllIllllllllII() {
        lIlllllIllll = new String[lIllllllIIII[4]];
        o.lIlllllIllll[o.lIllllllIIII[0]] = o.lllIlllllllIlI("gqFMm0nE57s=", "ZYVxY");
        o.lIlllllIllll[o.lIllllllIIII[1]] = o.lllIlllllllIll("Ej43KQM=", "FlrlP");
        o.lIlllllIllll[o.lIllllllIIII[2]] = o.lllIlllllllIll("KBM6IxIiFT00CA==", "jZhgM");
        o.lIlllllIllll[o.lIllllllIIII[3]] = o.lllIlllllllIlI("r2SQ4lteKrI=", "oEVDm");
    }

    private static String lllIlllllllIll(String lllllllllllllllIlIlIlllllllIllII, String lllllllllllllllIlIlIlllllllIIllI) {
        lllllllllllllllIlIlIlllllllIllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlllllllIlIlI = new StringBuilder();
        char[] lllllllllllllllIlIlIlllllllIlIIl = lllllllllllllllIlIlIlllllllIIllI.toCharArray();
        int lllllllllllllllIlIlIlllllllIlIII = lIllllllIIII[0];
        char[] lllllllllllllllIlIlIlllllllIIIlI = lllllllllllllllIlIlIlllllllIllII.toCharArray();
        int lllllllllllllllIlIlIlllllllIIIIl = lllllllllllllllIlIlIlllllllIIIlI.length;
        int lllllllllllllllIlIlIlllllllIIIII = lIllllllIIII[0];
        while (o.lllIlllllllllI(lllllllllllllllIlIlIlllllllIIIII, lllllllllllllllIlIlIlllllllIIIIl)) {
            char lllllllllllllllIlIlIlllllllIllIl = lllllllllllllllIlIlIlllllllIIIlI[lllllllllllllllIlIlIlllllllIIIII];
            lllllllllllllllIlIlIlllllllIlIlI.append((char)(lllllllllllllllIlIlIlllllllIllIl ^ lllllllllllllllIlIlIlllllllIlIIl[lllllllllllllllIlIlIlllllllIlIII % lllllllllllllllIlIlIlllllllIlIIl.length]));
            "".length();
            ++lllllllllllllllIlIlIlllllllIlIII;
            ++lllllllllllllllIlIlIlllllllIIIII;
            "".length();
            if ("  ".length() != " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlllllllIlIlI);
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private static boolean lllIlllllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIllllllllIl() {
        lIllllllIIII = new int[6];
        o.lIllllllIIII[0] = (0xA3 ^ 0xB7) & ~(0x23 ^ 0x37);
        o.lIllllllIIII[1] = " ".length();
        o.lIllllllIIII[2] = "  ".length();
        o.lIllllllIIII[3] = "   ".length();
        o.lIllllllIIII[4] = 0x37 ^ 0x61 ^ (0xD2 ^ 0x80);
        o.lIllllllIIII[5] = 0x4B ^ 0x43;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private static String lllIlllllllIlI(String lllllllllllllllIlIlIllllllIlIlll, String lllllllllllllllIlIlIllllllIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllllllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllllIlIllI.getBytes(StandardCharsets.UTF_8)), lIllllllIIII[5]), "DES");
            Cipher lllllllllllllllIlIlIllllllIllIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllllllIllIIl.init(lIllllllIIII[2], lllllllllllllllIlIlIllllllIllIlI);
            return new String(lllllllllllllllIlIlIllllllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllllllIllIII) {
            lllllllllllllllIlIlIllllllIllIII.printStackTrace();
            return null;
        }
    }

    static {
        o.lllIllllllllIl();
        o.lllIllllllllII();
        HERBS = new o();
        TREES = new o();
        BIRD_HOUSE = new o();
        SEAWEED = new o();
        o[] oArray = new o[lIllllllIIII[4]];
        oArray[o.lIllllllIIII[0]] = HERBS;
        oArray[o.lIllllllIIII[1]] = TREES;
        oArray[o.lIllllllIIII[2]] = BIRD_HOUSE;
        oArray[o.lIllllllIIII[3]] = SEAWEED;
        $VALUES = oArray;
    }
}

