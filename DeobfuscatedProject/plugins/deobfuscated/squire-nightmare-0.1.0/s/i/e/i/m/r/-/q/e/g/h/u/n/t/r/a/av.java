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

final class av
extends Enum<av> {
    public static final /* synthetic */ /* enum */ av WEST;
    private static /* synthetic */ int[] llllIIlIIllI;
    private static /* synthetic */ String[] llllIIlIIlIl;
    public static final /* synthetic */ /* enum */ av NORTH;
    private static final /* synthetic */ av[] $VALUES;
    public static final /* synthetic */ /* enum */ av EAST;
    public static final /* synthetic */ /* enum */ av SOUTH;

    private static String lIIIllllIllllll(String lllllllllllllllIIlIllllIlIIIIllI, String lllllllllllllllIIlIllllIlIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllllIlIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), llllIIlIIllI[5]), "DES");
            Cipher lllllllllllllllIIlIllllIlIIIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllllIlIIIlIII.init(llllIIlIIllI[2], lllllllllllllllIIlIllllIlIIIlIIl);
            return new String(lllllllllllllllIIlIllllIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllllIlIIIIlll) {
            lllllllllllllllIIlIllllIlIIIIlll.printStackTrace();
            return null;
        }
    }

    public static av valueOf(String string) {
        return Enum.valueOf(av.class, string);
    }

    public static av[] values() {
        return (av[])$VALUES.clone();
    }

    private static String lIIIlllllIIIIIl(String lllllllllllllllIIlIllllIlIIlIIll, String lllllllllllllllIIlIllllIlIIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllllIlIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllllIlIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllllIlIIlIlIl.init(llllIIlIIllI[2], lllllllllllllllIIlIllllIlIIlIllI);
            return new String(lllllllllllllllIIlIllllIlIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllllIlIIlIlII) {
            lllllllllllllllIIlIllllIlIIlIlII.printStackTrace();
            return null;
        }
    }

    static {
        av.lIIIlllllIIIIll();
        av.lIIIlllllIIIIlI();
        NORTH = new av();
        SOUTH = new av();
        EAST = new av();
        WEST = new av();
        av[] avArray = new av[llllIIlIIllI[4]];
        avArray[av.llllIIlIIllI[0]] = NORTH;
        avArray[av.llllIIlIIllI[1]] = SOUTH;
        avArray[av.llllIIlIIllI[2]] = EAST;
        avArray[av.llllIIlIIllI[3]] = WEST;
        $VALUES = avArray;
    }

    private static void lIIIlllllIIIIll() {
        llllIIlIIllI = new int[6];
        av.llllIIlIIllI[0] = (0xC5 ^ 0x8B) & ~(0xE7 ^ 0xA9);
        av.llllIIlIIllI[1] = 1;
        av.llllIIlIIllI[2] = 2;
        av.llllIIlIIllI[3] = 3;
        av.llllIIlIIllI[4] = 93 + 138 - 173 + 98 ^ 90 + 15 - -22 + 25;
        av.llllIIlIIllI[5] = 0x71 ^ 0x79 ^ (0x10 ^ 0x1C) & ~(0xB0 ^ 0xBC);
    }

    private static String lIIIlllllIIIIII(String lllllllllllllllIIlIllllIIlllIllI, String lllllllllllllllIIlIllllIIlllIlIl) {
        lllllllllllllllIIlIllllIIlllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllllIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllllIIlllIlII = new StringBuilder();
        char[] lllllllllllllllIIlIllllIIlllIIll = lllllllllllllllIIlIllllIIlllIlIl.toCharArray();
        int lllllllllllllllIIlIllllIIlllIIlI = llllIIlIIllI[0];
        char[] lllllllllllllllIIlIllllIIllIllII = lllllllllllllllIIlIllllIIlllIllI.toCharArray();
        int lllllllllllllllIIlIllllIIllIlIll = lllllllllllllllIIlIllllIIllIllII.length;
        int lllllllllllllllIIlIllllIIllIlIlI = llllIIlIIllI[0];
        while (av.lIIIlllllIIIlII(lllllllllllllllIIlIllllIIllIlIlI, lllllllllllllllIIlIllllIIllIlIll)) {
            char lllllllllllllllIIlIllllIIlllIlll = lllllllllllllllIIlIllllIIllIllII[lllllllllllllllIIlIllllIIllIlIlI];
            lllllllllllllllIIlIllllIIlllIlII.append((char)(lllllllllllllllIIlIllllIIlllIlll ^ lllllllllllllllIIlIllllIIlllIIll[lllllllllllllllIIlIllllIIlllIIlI % lllllllllllllllIIlIllllIIlllIIll.length]));
            0;
            ++lllllllllllllllIIlIllllIIlllIIlI;
            ++lllllllllllllllIIlIllllIIllIlIlI;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllllIIlllIlII);
    }

    private static void lIIIlllllIIIIlI() {
        llllIIlIIlIl = new String[llllIIlIIllI[4]];
        av.llllIIlIIlIl[av.llllIIlIIllI[0]] = av."NORTH";
        av.llllIIlIIlIl[av.llllIIlIIllI[1]] = av."SOUTH";
        av.llllIIlIIlIl[av.llllIIlIIllI[2]] = av."EAST";
        av.llllIIlIIlIl[av.llllIIlIIllI[3]] = av."WEST";
    }

    private static boolean lIIIlllllIIIlII(int n2, int n3) {
        return n2 < n3;
    }
}

