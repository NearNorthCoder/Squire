/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class x
extends Enum<x> {
    public static final /* synthetic */ /* enum */ x NONE;
    public static final /* synthetic */ /* enum */ x BLOWPIPE;
    public static final /* synthetic */ /* enum */ x WEBWEAVER_BOW;
    private static /* synthetic */ int[] llllIlIllIlI;
    private static final /* synthetic */ x[] $VALUES;
    public static final /* synthetic */ /* enum */ x CHINCHOMPA;
    public static final /* synthetic */ /* enum */ x HUNTER_CROSSBOW;
    private static /* synthetic */ String[] llllIlIlIlIl;
    private final /* synthetic */ String itemName;
    public static final /* synthetic */ /* enum */ x CRAWS_BOW;

    public String bP() {
        return this.itemName;
    }

    static {
        x.lIIlIIIlIIIlIIl();
        x.lIIlIIIlIIIIlll();
        HUNTER_CROSSBOW = new x(llllIlIlIlIl[llllIlIllIlI[1]]);
        BLOWPIPE = new x(llllIlIlIlIl[llllIlIllIlI[3]]);
        CHINCHOMPA = new x(llllIlIlIlIl[llllIlIllIlI[5]]);
        CRAWS_BOW = new x(llllIlIlIlIl[llllIlIllIlI[7]]);
        WEBWEAVER_BOW = new x(llllIlIlIlIl[llllIlIllIlI[9]]);
        NONE = new x(llllIlIlIlIl[llllIlIllIlI[11]]);
        x[] xArray = new x[llllIlIllIlI[6]];
        xArray[x.llllIlIllIlI[0]] = HUNTER_CROSSBOW;
        xArray[x.llllIlIllIlI[1]] = BLOWPIPE;
        xArray[x.llllIlIllIlI[2]] = CHINCHOMPA;
        xArray[x.llllIlIllIlI[3]] = CRAWS_BOW;
        xArray[x.llllIlIllIlI[4]] = WEBWEAVER_BOW;
        xArray[x.llllIlIllIlI[5]] = NONE;
        $VALUES = xArray;
    }

    private static void lIIlIIIlIIIlIIl() {
        llllIlIllIlI = new int[13];
        x.llllIlIllIlI[0] = (187 + 78 - 155 + 99 ^ 24 + 153 - 134 + 116) & (0x7B ^ 0x6D ^ (0xF0 ^ 0xA8) ^ -" ".length());
        x.llllIlIllIlI[1] = " ".length();
        x.llllIlIllIlI[2] = "  ".length();
        x.llllIlIllIlI[3] = "   ".length();
        x.llllIlIllIlI[4] = 135 + 136 - 96 + 22 ^ 175 + 68 - 175 + 125;
        x.llllIlIllIlI[5] = 56 + 108 - 160 + 149 ^ 68 + 12 - -36 + 40;
        x.llllIlIllIlI[6] = 181 + 119 - 233 + 126 ^ 117 + 34 - 13 + 61;
        x.llllIlIllIlI[7] = 0x69 ^ 0x6E;
        x.llllIlIllIlI[8] = 0xCF ^ 0xC7;
        x.llllIlIllIlI[9] = 0x9F ^ 0x96;
        x.llllIlIllIlI[10] = 0x89 ^ 0x83;
        x.llllIlIllIlI[11] = 0x88 ^ 0x83;
        x.llllIlIllIlI[12] = 0xCA ^ 0xAD ^ (0xFF ^ 0x94);
    }

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static void lIIlIIIlIIIIlll() {
        llllIlIlIlIl = new String[llllIlIllIlI[12]];
        x.llllIlIlIlIl[x.llllIlIllIlI[0]] = x.lIIlIIIIlllllll("uWGSSkEitfaU0E6TwMzi0A==", "hqXek");
        x.llllIlIlIlIl[x.llllIlIllIlI[1]] = x.lIIlIIIlIIIIIIl("GRE8FzUjF3VDMyMLIRAyPhM=", "QdRcP");
        x.llllIlIlIlIl[x.llllIlIllIlI[2]] = x.lIIlIIIlIIIIIlI("R+rkCOM4kwDyeLl6BpP3mg==", "vcAxH");
        x.llllIlIlIlIl[x.llllIlIllIlI[3]] = x.lIIlIIIlIIIIIlI("IFzf2QKIs+qF/QDNNkBMzg==", "ZkWfe");
        x.llllIlIlIlIl[x.llllIlIllIlI[4]] = x.lIIlIIIlIIIIIIl("BR4cKBcOGRg2FQ==", "FVUfT");
        x.llllIlIlIlIl[x.llllIlIllIlI[5]] = x.lIIlIIIlIIIIIIl("ATE7ICgqNj8+Kg==", "BYRNK");
        x.llllIlIlIlIl[x.llllIlIllIlI[6]] = x.lIIlIIIIlllllll("WrH19/mUjby/YInDVwkiBA==", "dcmRY");
        x.llllIlIlIlIl[x.llllIlIllIlI[7]] = x.lIIlIIIlIIIIIIl("KAYDJ1EYVAA/AQ==", "ktbPv");
        x.llllIlIlIlIl[x.llllIlIllIlI[8]] = x.lIIlIIIlIIIIIlI("w4JYQEJzQjyCrqt4Se5w+A==", "NRGWP");
        x.llllIlIlIlIl[x.llllIlIllIlI[9]] = x.lIIlIIIlIIIIIIl("BSoPPjAzOQg7dTAgGg==", "ROmIU");
        x.llllIlIlIlIl[x.llllIlIllIlI[10]] = x.lIIlIIIIlllllll("fQs7yb6FZes=", "Bxgob");
        x.llllIlIlIlIl[x.llllIlIllIlI[11]] = x.lIIlIIIlIIIIIlI("pCkD5QHXeX4=", "DNRuX");
    }

    private x(String string2) {
        this.itemName = string2;
    }

    private static String lIIlIIIlIIIIIIl(String lllllllllllllllIIlIllIIlIlIllIll, String lllllllllllllllIIlIllIIlIlIllIlI) {
        lllllllllllllllIIlIllIIlIlIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIlIlIllIIl = new StringBuilder();
        char[] lllllllllllllllIIlIllIIlIlIllIII = lllllllllllllllIIlIllIIlIlIllIlI.toCharArray();
        int lllllllllllllllIIlIllIIlIlIlIlll = llllIlIllIlI[0];
        char[] lllllllllllllllIIlIllIIlIlIlIIIl = lllllllllllllllIIlIllIIlIlIllIll.toCharArray();
        int lllllllllllllllIIlIllIIlIlIlIIII = lllllllllllllllIIlIllIIlIlIlIIIl.length;
        int lllllllllllllllIIlIllIIlIlIIllll = llllIlIllIlI[0];
        while (x.lIIlIIIlIIIlIlI(lllllllllllllllIIlIllIIlIlIIllll, lllllllllllllllIIlIllIIlIlIlIIII)) {
            char lllllllllllllllIIlIllIIlIlIlllII = lllllllllllllllIIlIllIIlIlIlIIIl[lllllllllllllllIIlIllIIlIlIIllll];
            lllllllllllllllIIlIllIIlIlIllIIl.append((char)(lllllllllllllllIIlIllIIlIlIlllII ^ lllllllllllllllIIlIllIIlIlIllIII[lllllllllllllllIIlIllIIlIlIlIlll % lllllllllllllllIIlIllIIlIlIllIII.length]));
            "".length();
            ++lllllllllllllllIIlIllIIlIlIlIlll;
            ++lllllllllllllllIIlIllIIlIlIIllll;
            "".length();
            if (-"  ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIIlIlIllIIl);
    }

    private static String lIIlIIIIlllllll(String lllllllllllllllIIlIllIIlIlIIIllI, String lllllllllllllllIIlIllIIlIlIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIlIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIlIlIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIlIlIIlIII.init(llllIlIllIlI[2], lllllllllllllllIIlIllIIlIlIIlIIl);
            return new String(lllllllllllllllIIlIllIIlIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIlIlIIIlll) {
            lllllllllllllllIIlIllIIlIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIlIIIIIlI(String lllllllllllllllIIlIllIIlIIllIlll, String lllllllllllllllIIlIllIIlIIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIlIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlIIllIllI.getBytes(StandardCharsets.UTF_8)), llllIlIllIlI[8]), "DES");
            Cipher lllllllllllllllIIlIllIIlIIlllIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIlIIlllIll.init(llllIlIllIlI[2], lllllllllllllllIIlIllIIlIIllllII);
            return new String(lllllllllllllllIIlIllIIlIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIlIIlllIlI) {
            lllllllllllllllIIlIllIIlIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }
}

