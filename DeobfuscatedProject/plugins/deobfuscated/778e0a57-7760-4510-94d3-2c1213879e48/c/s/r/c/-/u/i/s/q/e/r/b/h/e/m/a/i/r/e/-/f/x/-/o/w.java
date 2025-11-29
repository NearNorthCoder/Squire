/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class w
extends Enum<w> {
    public static final /* synthetic */ /* enum */ w REACHED_LOWER_LEVEL;
    private static final /* synthetic */ w[] $VALUES;
    public static final /* synthetic */ /* enum */ w EXPLORING_UPPER_LEVEL;
    private static /* synthetic */ int[] lIlIIlIlIlII;
    public static final /* synthetic */ /* enum */ w REACHED_BOTTOM;
    private static /* synthetic */ String[] lIlIIlIlIIll;
    public static final /* synthetic */ /* enum */ w GET_OUT;
    public static final /* synthetic */ /* enum */ w WAITING_FOR_LEADER_TO_START;
    public static final /* synthetic */ /* enum */ w REACHED_MIDDLE_LEVEL;

    static {
        w.llIllIIlIIlIIl();
        w.llIllIIlIIlIII();
        WAITING_FOR_LEADER_TO_START = new w();
        EXPLORING_UPPER_LEVEL = new w();
        REACHED_MIDDLE_LEVEL = new w();
        REACHED_LOWER_LEVEL = new w();
        REACHED_BOTTOM = new w();
        GET_OUT = new w();
        w[] wArray = new w[lIlIIlIlIlII[6]];
        wArray[w.lIlIIlIlIlII[0]] = WAITING_FOR_LEADER_TO_START;
        wArray[w.lIlIIlIlIlII[1]] = EXPLORING_UPPER_LEVEL;
        wArray[w.lIlIIlIlIlII[2]] = REACHED_MIDDLE_LEVEL;
        wArray[w.lIlIIlIlIlII[3]] = REACHED_LOWER_LEVEL;
        wArray[w.lIlIIlIlIlII[4]] = REACHED_BOTTOM;
        wArray[w.lIlIIlIlIlII[5]] = GET_OUT;
        $VALUES = wArray;
    }

    private static void llIllIIlIIlIIl() {
        lIlIIlIlIlII = new int[8];
        w.lIlIIlIlIlII[0] = (0x64 ^ 0x69) & ~(0x34 ^ 0x39);
        w.lIlIIlIlIlII[1] = 1;
        w.lIlIIlIlIlII[2] = 2;
        w.lIlIIlIlIlII[3] = 3;
        w.lIlIIlIlIlII[4] = 0xF ^ 0xB;
        w.lIlIIlIlIlII[5] = 23 + 36 - 26 + 152 ^ 54 + 84 - 13 + 63;
        w.lIlIIlIlIlII[6] = 0x1D ^ 0x1B;
        w.lIlIIlIlIlII[7] = 0x8E ^ 0xA8 ^ (0x72 ^ 0x5C);
    }

    private static void llIllIIlIIlIII() {
        lIlIIlIlIIll = new String[lIlIIlIlIlII[6]];
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[0]] = w."WAITING_FOR_LEADER_TO_START";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[1]] = w."EXPLORING_UPPER_LEVEL";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[2]] = w."REACHED_MIDDLE_LEVEL";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[3]] = w."REACHED_LOWER_LEVEL";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[4]] = w."REACHED_BOTTOM";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[5]] = w."GET_OUT";
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    private static boolean llIllIIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIIlIIIllI(String lllllllllllllllIllIllIlIlIIlIllI, String lllllllllllllllIllIllIlIlIIlIlIl) {
        lllllllllllllllIllIllIlIlIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIlIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIlIlIIlIlII = new StringBuilder();
        char[] lllllllllllllllIllIllIlIlIIlIIll = lllllllllllllllIllIllIlIlIIlIlIl.toCharArray();
        int lllllllllllllllIllIllIlIlIIlIIlI = lIlIIlIlIlII[0];
        char[] lllllllllllllllIllIllIlIlIIIllII = lllllllllllllllIllIllIlIlIIlIllI.toCharArray();
        int lllllllllllllllIllIllIlIlIIIlIll = lllllllllllllllIllIllIlIlIIIllII.length;
        int lllllllllllllllIllIllIlIlIIIlIlI = lIlIIlIlIlII[0];
        while (w.llIllIIlIIlIlI(lllllllllllllllIllIllIlIlIIIlIlI, lllllllllllllllIllIllIlIlIIIlIll)) {
            char lllllllllllllllIllIllIlIlIIlIlll = lllllllllllllllIllIllIlIlIIIllII[lllllllllllllllIllIllIlIlIIIlIlI];
            lllllllllllllllIllIllIlIlIIlIlII.append((char)(lllllllllllllllIllIllIlIlIIlIlll ^ lllllllllllllllIllIllIlIlIIlIIll[lllllllllllllllIllIllIlIlIIlIIlI % lllllllllllllllIllIllIlIlIIlIIll.length]));
            0;
            ++lllllllllllllllIllIllIlIlIIlIIlI;
            ++lllllllllllllllIllIllIlIlIIIlIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIlIlIIlIlII);
    }

    private static String llIllIIlIIIlll(String lllllllllllllllIllIllIlIIlllllll, String lllllllllllllllIllIllIlIIllllllI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlIlIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIlIlIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIlIlIIIIIll.init(lIlIIlIlIlII[2], lllllllllllllllIllIllIlIlIIIIlII);
            return new String(lllllllllllllllIllIllIlIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIlIlIIIIIlI) {
            lllllllllllllllIllIllIlIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llIllIIlIIIlIl(String lllllllllllllllIllIllIlIlIlIIllI, String lllllllllllllllIllIllIlIlIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIlII[7]), "DES");
            Cipher lllllllllllllllIllIllIlIlIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIllIllIlIlIlIlIII.init(lIlIIlIlIlII[2], lllllllllllllllIllIllIlIlIlIlIIl);
            return new String(lllllllllllllllIllIllIlIlIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIlIlIlIIlll) {
            lllllllllllllllIllIllIlIlIlIIlll.printStackTrace();
            return null;
        }
    }
}

