/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static /* synthetic */ String[] lllllllIIlIl;
    public static final /* synthetic */ /* enum */ d CREATE_PASTE;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d MINIGAME;
    private static /* synthetic */ int[] lllllllIIllI;

    private static String lIIlIlIlIIIllll(String lllllllllllllllIIlIIIlIIllIllIIl, String lllllllllllllllIIlIIIlIIllIlllIl) {
        lllllllllllllllIIlIIIlIIllIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIlIIllIlllII = new StringBuilder();
        char[] lllllllllllllllIIlIIIlIIllIllIll = lllllllllllllllIIlIIIlIIllIlllIl.toCharArray();
        int lllllllllllllllIIlIIIlIIllIllIlI = lllllllIIllI[0];
        char[] lllllllllllllllIIlIIIlIIllIlIlII = lllllllllllllllIIlIIIlIIllIllIIl.toCharArray();
        int lllllllllllllllIIlIIIlIIllIlIIll = lllllllllllllllIIlIIIlIIllIlIlII.length;
        int lllllllllllllllIIlIIIlIIllIlIIlI = lllllllIIllI[0];
        while (d.lIIlIlIlIIlIIll(lllllllllllllllIIlIIIlIIllIlIIlI, lllllllllllllllIIlIIIlIIllIlIIll)) {
            char lllllllllllllllIIlIIIlIIllIlllll = lllllllllllllllIIlIIIlIIllIlIlII[lllllllllllllllIIlIIIlIIllIlIIlI];
            lllllllllllllllIIlIIIlIIllIlllII.append((char)(lllllllllllllllIIlIIIlIIllIlllll ^ lllllllllllllllIIlIIIlIIllIllIll[lllllllllllllllIIlIIIlIIllIllIlI % lllllllllllllllIIlIIIlIIllIllIll.length]));
            0;
            ++lllllllllllllllIIlIIIlIIllIllIlI;
            ++lllllllllllllllIIlIIIlIIllIlIIlI;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIlIIllIlllII);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    static {
        d.lIIlIlIlIIlIIlI();
        d.lIIlIlIlIIlIIIl();
        MINIGAME = new d();
        CREATE_PASTE = new d();
        d[] dArray = new d[lllllllIIllI[2]];
        dArray[d.lllllllIIllI[0]] = MINIGAME;
        dArray[d.lllllllIIllI[1]] = CREATE_PASTE;
        $VALUES = dArray;
    }

    private static void lIIlIlIlIIlIIIl() {
        lllllllIIlIl = new String[lllllllIIllI[2]];
        d.lllllllIIlIl[d.lllllllIIllI[0]] = d."MINIGAME";
        d.lllllllIIlIl[d.lllllllIIllI[1]] = d."CREATE_PASTE";
    }

    private static String lIIlIlIlIIlIIII(String lllllllllllllllIIlIIIlIIlllIlllI, String lllllllllllllllIIlIIIlIIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIIllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIIllllIIII.init(lllllllIIllI[2], lllllllllllllllIIlIIIlIIllllIIIl);
            return new String(lllllllllllllllIIlIIIlIIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlIIlllIllll) {
            lllllllllllllllIIlIIIlIIlllIllll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIIlIIlI() {
        lllllllIIllI = new int[3];
        d.lllllllIIllI[0] = (0x38 ^ 0x5B ^ (0xC4 ^ 0xBA)) & (69 + 108 - 71 + 41 ^ 128 + 38 - 129 + 105 ^ -1);
        d.lllllllIIllI[1] = 1;
        d.lllllllIIllI[2] = 2;
    }

    private static boolean lIIlIlIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }
}

