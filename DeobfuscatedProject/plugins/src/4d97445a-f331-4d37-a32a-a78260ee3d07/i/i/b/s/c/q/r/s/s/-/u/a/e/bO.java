/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class bO
extends Enum<bO> {
    private static final /* synthetic */ bO[] $VALUES;
    public static final /* synthetic */ /* enum */ bO FUNGUS;
    private static /* synthetic */ String[] llIIlllIl;
    private static /* synthetic */ int[] llIIllllI;
    public static final /* synthetic */ /* enum */ bO SWAMP_TOAD;
    public static final /* synthetic */ /* enum */ bO SNAPE_GRASS;
    private final /* synthetic */ int id;

    private static String lIllIlIIlll(String lIllIIlIIlIIIII, String lIllIIlIIIlllIl) {
        try {
            SecretKeySpec lIllIIlIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlIIlIIIlI = Cipher.getInstance("Blowfish");
            lIllIIlIIlIIIlI.init(llIIllllI[4], lIllIIlIIlIIIll);
            return new String(lIllIIlIIlIIIlI.doFinal(Base64.getDecoder().decode(lIllIIlIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlIIlIIIIl) {
            lIllIIlIIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIII() {
        llIIlllIl = new String[llIIllllI[6]];
        bO.llIIlllIl[bO.llIIllllI[0]] = bO.lIllIlIIllI("KAY9MhE9", "nSsuD");
        bO.llIIlllIl[bO.llIIllllI[2]] = bO.lIllIlIIllI("JxwjKSsrFTA4PSc=", "tRbyn");
        bO.llIIlllIl[bO.llIIllllI[4]] = bO.lIllIlIIlll("qwQ6KZP0KmY8dEwjeg5mWg==", "jXcHJ");
    }

    private static void lIllIlIlIIl() {
        llIIllllI = new int[7];
        bO.llIIllllI[0] = (70 + 34 - 92 + 123 ^ 37 + 23 - 46 + 138) & (0x29 ^ 0x78 ^ (0x88 ^ 0xC6) ^ -" ".length());
        bO.llIIllllI[1] = -(0xFFFFCFFD & 0x3467) & (0xFFFF8FFE & Short.MAX_VALUE);
        bO.llIIllllI[2] = " ".length();
        bO.llIIllllI[3] = 129 + 155 - 136 + 83;
        bO.llIIllllI[4] = "  ".length();
        bO.llIIllllI[5] = 0xFFFFF869 & 0xFFE;
        bO.llIIllllI[6] = "   ".length();
    }

    static {
        bO.lIllIlIlIIl();
        bO.lIllIlIlIII();
        FUNGUS = new bO(llIIllllI[1]);
        SNAPE_GRASS = new bO(llIIllllI[3]);
        SWAMP_TOAD = new bO(llIIllllI[5]);
        bO[] bOArray = new bO[llIIllllI[6]];
        bOArray[bO.llIIllllI[0]] = FUNGUS;
        bOArray[bO.llIIllllI[2]] = SNAPE_GRASS;
        bOArray[bO.llIIllllI[4]] = SWAMP_TOAD;
        $VALUES = bOArray;
    }

    private static boolean lIllIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private bO(int n3) {
        this.id = n3;
    }

    private static String lIllIlIIllI(String lIllIIlIIllIIII, String lIllIIlIIllIlII) {
        lIllIIlIIllIIII = new String(Base64.getDecoder().decode(lIllIIlIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIlIIllIIll = new StringBuilder();
        char[] lIllIIlIIllIIlI = lIllIIlIIllIlII.toCharArray();
        int lIllIIlIIllIIIl = llIIllllI[0];
        char[] lIllIIlIIlIlIll = lIllIIlIIllIIII.toCharArray();
        int lIllIIlIIlIlIlI = lIllIIlIIlIlIll.length;
        int lIllIIlIIlIlIIl = llIIllllI[0];
        while (bO.lIllIlIlIlI(lIllIIlIIlIlIIl, lIllIIlIIlIlIlI)) {
            char lIllIIlIIllIllI = lIllIIlIIlIlIll[lIllIIlIIlIlIIl];
            lIllIIlIIllIIll.append((char)(lIllIIlIIllIllI ^ lIllIIlIIllIIlI[lIllIIlIIllIIIl % lIllIIlIIllIIlI.length]));
            "".length();
            ++lIllIIlIIllIIIl;
            ++lIllIIlIIlIlIIl;
            "".length();
            if ("  ".length() > ((37 + 180 - 204 + 198 ^ 37 + 77 - 28 + 73) & (132 + 86 - 182 + 106 ^ 101 + 15 - -10 + 68 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lIllIIlIIllIIll);
    }

    public static bO[] values() {
        return (bO[])$VALUES.clone();
    }

    public int P() {
        return this.id;
    }

    public static bO valueOf(String string) {
        return Enum.valueOf(bO.class, string);
    }
}

