/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class g
extends Enum<g> {
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g MAGE;
    public static final /* synthetic */ /* enum */ g RANGE_1;
    private static /* synthetic */ int[] llIIllllIII;
    public static final /* synthetic */ /* enum */ g MELEE_1;
    public static final /* synthetic */ /* enum */ g NONE;
    private static /* synthetic */ String[] llIIlllIlll;
    public static final /* synthetic */ /* enum */ g MELEE_2;
    public static final /* synthetic */ /* enum */ g RANGE_2;

    private static String lIlIIIlllIlIll(String llllllllllllllllIIlllIlIIIlIlIlI, String llllllllllllllllIIlllIlIIIlIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlIIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIlIIIlIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIlIIIlIlllI.init(llIIllllIII[2], llllllllllllllllIIlllIlIIIlIllll);
            return new String(llllllllllllllllIIlllIlIIIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIlIIIlIllIl) {
            llllllllllllllllIIlllIlIIIlIllIl.printStackTrace();
            return null;
        }
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    static {
        g.lIlIIIlllIllIl();
        g.lIlIIIlllIllII();
        NONE = new g();
        MELEE_1 = new g();
        MELEE_2 = new g();
        RANGE_1 = new g();
        RANGE_2 = new g();
        MAGE = new g();
        g[] gArray = new g[llIIllllIII[6]];
        gArray[g.llIIllllIII[0]] = NONE;
        gArray[g.llIIllllIII[1]] = MELEE_1;
        gArray[g.llIIllllIII[2]] = MELEE_2;
        gArray[g.llIIllllIII[3]] = RANGE_1;
        gArray[g.llIIllllIII[4]] = RANGE_2;
        gArray[g.llIIllllIII[5]] = MAGE;
        $VALUES = gArray;
    }

    private static void lIlIIIlllIllII() {
        llIIlllIlll = new String[llIIllllIII[6]];
        g.llIIlllIlll[g.llIIllllIII[0]] = g."NONE";
        g.llIIlllIlll[g.llIIllllIII[1]] = g."MELEE_1";
        g.llIIlllIlll[g.llIIllllIII[2]] = g."MELEE_2";
        g.llIIlllIlll[g.llIIllllIII[3]] = g."RANGE_1";
        g.llIIlllIlll[g.llIIllllIII[4]] = g."RANGE_2";
        g.llIIlllIlll[g.llIIllllIII[5]] = g."MAGE";
    }

    private static String lIlIIIlllIlIlI(String llllllllllllllllIIlllIlIIlIIIIIl, String llllllllllllllllIIlllIlIIIlllIll) {
        llllllllllllllllIIlllIlIIlIIIIIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIlIIIllllll = new StringBuilder();
        char[] llllllllllllllllIIlllIlIIIlllllI = llllllllllllllllIIlllIlIIIlllIll.toCharArray();
        int llllllllllllllllIIlllIlIIIllllIl = llIIllllIII[0];
        char[] llllllllllllllllIIlllIlIIIllIlll = llllllllllllllllIIlllIlIIlIIIIIl.toCharArray();
        int llllllllllllllllIIlllIlIIIllIllI = llllllllllllllllIIlllIlIIIllIlll.length;
        int llllllllllllllllIIlllIlIIIllIlIl = llIIllllIII[0];
        while (g.lIlIIIlllIlllI(llllllllllllllllIIlllIlIIIllIlIl, llllllllllllllllIIlllIlIIIllIllI)) {
            char llllllllllllllllIIlllIlIIlIIIIlI = llllllllllllllllIIlllIlIIIllIlll[llllllllllllllllIIlllIlIIIllIlIl];
            llllllllllllllllIIlllIlIIIllllll.append((char)(llllllllllllllllIIlllIlIIlIIIIlI ^ llllllllllllllllIIlllIlIIIlllllI[llllllllllllllllIIlllIlIIIllllIl % llllllllllllllllIIlllIlIIIlllllI.length]));
            0;
            ++llllllllllllllllIIlllIlIIIllllIl;
            ++llllllllllllllllIIlllIlIIIllIlIl;
            0;
            if (1 >= -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIlIIIllllll);
    }

    private static String lIlIIIlllIlIIl(String llllllllllllllllIIlllIlIIIIlllIl, String llllllllllllllllIIlllIlIIIIlllII) {
        try {
            SecretKeySpec llllllllllllllllIIlllIlIIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), llIIllllIII[7]), "DES");
            Cipher llllllllllllllllIIlllIlIIIlIIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlllIlIIIlIIIIl.init(llIIllllIII[2], llllllllllllllllIIlllIlIIIlIIIlI);
            return new String(llllllllllllllllIIlllIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIlIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIlIIIlIIIII) {
            llllllllllllllllIIlllIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void lIlIIIlllIllIl() {
        llIIllllIII = new int[8];
        g.llIIllllIII[0] = (0x12 ^ 0xA) & ~(0x85 ^ 0x9D);
        g.llIIllllIII[1] = 1;
        g.llIIllllIII[2] = 2;
        g.llIIllllIII[3] = 3;
        g.llIIllllIII[4] = 0x94 ^ 0x90;
        g.llIIllllIII[5] = 0x7F ^ 0x7A;
        g.llIIllllIII[6] = 0xC ^ 0xA;
        g.llIIllllIII[7] = 62 + 25 - 6 + 46 ^ (0xD4 ^ 0xA3);
    }
}

