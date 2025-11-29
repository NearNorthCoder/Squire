/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class ar
extends Enum<ar>
implements aw {
    private final /* synthetic */ av produceSeed;
    private static /* synthetic */ int[] lIlllIIIIlll;
    public static final /* synthetic */ /* enum */ ar NASTURTIUM;
    public static final /* synthetic */ /* enum */ ar LIMPWURT;
    private static /* synthetic */ String[] lIlllIIIIllI;
    public static final /* synthetic */ /* enum */ ar MARIGOLD;
    public static final /* synthetic */ /* enum */ ar NOTHING;
    public static final /* synthetic */ /* enum */ ar DEFAULT;
    private static final /* synthetic */ ar[] $VALUES;

    private static void lllIlIlIllllIl() {
        lIlllIIIIllI = new String[lIlllIIIIlll[5]];
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[0]] = ar."NOTHING";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[1]] = ar."DEFAULT";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[2]] = ar."MARIGOLD";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[3]] = ar."NASTURTIUM";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[4]] = ar."LIMPWURT";
    }

    private static boolean lllIlIllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlIlIllllII(String lllllllllllllllIlIllIllllllllIll, String lllllllllllllllIlIllIlllllllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlllllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIlllllllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIlllllllllll.init(lIlllIIIIlll[2], lllllllllllllllIlIlllIIIIIIIIIII);
            return new String(lllllllllllllllIlIllIlllllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIllllllllllI) {
            lllllllllllllllIlIllIllllllllllI.printStackTrace();
            return null;
        }
    }

    static {
        ar.lllIlIlIllllll();
        ar.lllIlIlIllllIl();
        NOTHING = new ar(null);
        DEFAULT = new ar(av.DEFAULT);
        MARIGOLD = new ar(av.MARIGOLD);
        NASTURTIUM = new ar(av.NASTURTIUM);
        LIMPWURT = new ar(av.LIMPWURT);
        ar[] arArray = new ar[lIlllIIIIlll[5]];
        arArray[ar.lIlllIIIIlll[0]] = NOTHING;
        arArray[ar.lIlllIIIIlll[1]] = DEFAULT;
        arArray[ar.lIlllIIIIlll[2]] = MARIGOLD;
        arArray[ar.lIlllIIIIlll[3]] = NASTURTIUM;
        arArray[ar.lIlllIIIIlll[4]] = LIMPWURT;
        $VALUES = arArray;
    }

    private static String lllIlIlIlllIll(String lllllllllllllllIlIlllIIIIIlIIIlI, String lllllllllllllllIlIlllIIIIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIIIIlll[6]), "DES");
            Cipher lllllllllllllllIlIlllIIIIIlIIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIIIIIlIIlII.init(lIlllIIIIlll[2], lllllllllllllllIlIlllIIIIIlIIlIl);
            return new String(lllllllllllllllIlIlllIIIIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIIIIlIIIll) {
            lllllllllllllllIlIlllIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    private ar(av av2) {
        this.produceSeed = av2;
    }

    private static String lllIlIlIlllIlI(String lllllllllllllllIlIlllIIIIIIlIIlI, String lllllllllllllllIlIlllIIIIIIlIIIl) {
        lllllllllllllllIlIlllIIIIIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIIIIIlIIII = new StringBuilder();
        char[] lllllllllllllllIlIlllIIIIIIIllll = lllllllllllllllIlIlllIIIIIIlIIIl.toCharArray();
        int lllllllllllllllIlIlllIIIIIIIlllI = lIlllIIIIlll[0];
        char[] lllllllllllllllIlIlllIIIIIIIlIII = lllllllllllllllIlIlllIIIIIIlIIlI.toCharArray();
        int lllllllllllllllIlIlllIIIIIIIIlll = lllllllllllllllIlIlllIIIIIIIlIII.length;
        int lllllllllllllllIlIlllIIIIIIIIllI = lIlllIIIIlll[0];
        while (ar.lllIlIllIIIIII(lllllllllllllllIlIlllIIIIIIIIllI, lllllllllllllllIlIlllIIIIIIIIlll)) {
            char lllllllllllllllIlIlllIIIIIIlIIll = lllllllllllllllIlIlllIIIIIIIlIII[lllllllllllllllIlIlllIIIIIIIIllI];
            lllllllllllllllIlIlllIIIIIIlIIII.append((char)(lllllllllllllllIlIlllIIIIIIlIIll ^ lllllllllllllllIlIlllIIIIIIIllll[lllllllllllllllIlIlllIIIIIIIlllI % lllllllllllllllIlIlllIIIIIIIllll.length]));
            0;
            ++lllllllllllllllIlIlllIIIIIIIlllI;
            ++lllllllllllllllIlIlllIIIIIIIIllI;
            0;
            if (((0x7B ^ 0x34 ^ (0x46 ^ 0x17)) & (58 + 73 - 120 + 128 ^ 106 + 44 - 96 + 95 ^ -1)) <= 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIIIIIIlIIII);
    }

    public static ar valueOf(String string) {
        return Enum.valueOf(ar.class, string);
    }

    private static void lllIlIlIllllll() {
        lIlllIIIIlll = new int[7];
        ar.lIlllIIIIlll[0] = (0x43 ^ 0xB) & ~(0xF1 ^ 0xB9);
        ar.lIlllIIIIlll[1] = 1;
        ar.lIlllIIIIlll[2] = 2;
        ar.lIlllIIIIlll[3] = 3;
        ar.lIlllIIIIlll[4] = 0x6C ^ 0x7D ^ (0xD7 ^ 0xC2);
        ar.lIlllIIIIlll[5] = 0x1E ^ 0xE ^ (0x1C ^ 9);
        ar.lIlllIIIIlll[6] = 0xA8 ^ 0xA7 ^ (0x67 ^ 0x60);
    }

    public static ar[] values() {
        return (ar[])$VALUES.clone();
    }
}

