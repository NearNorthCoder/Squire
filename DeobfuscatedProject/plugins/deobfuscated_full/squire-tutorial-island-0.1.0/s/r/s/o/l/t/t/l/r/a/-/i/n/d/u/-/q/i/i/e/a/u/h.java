/*
 * Decompiled with CFR 0.152.
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
extends Enum<h> {
    private static /* synthetic */ int[] lIlIIIllllIlI;
    private static /* synthetic */ String[] lIlIIIllllIIl;
    public static final /* synthetic */ /* enum */ h TUTORIAL_ISLAND;
    private final /* synthetic */ String questName;
    private static final /* synthetic */ h[] $VALUES;

    private static String lIlllIIIlIlIlII(String var2, String var9) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlIIIllllIlI[2], var7);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIlIlIlIl(String var6, String var4) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIlIIIllllIlI[3]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlIIIllllIlI[2], var8);
            return new String(var5.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void lIlllIIIlIlIlll() {
        lIlIIIllllIlI = new int[4];
        h.lIlIIIllllIlI[0] = (0x26 ^ 0xA) & ~(0x60 ^ 0x4C);
        h.lIlIIIllllIlI[1] = 1;
        h.lIlIIIllllIlI[2] = 2;
        h.lIlIIIllllIlI[3] = 0x79 ^ 0x71;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static void lIlllIIIlIlIllI() {
        lIlIIIllllIIl = new String[lIlIIIllllIlI[2]];
        h.lIlIIIllllIIl[h.lIlIIIllllIlI[0]] = h."TUTORIAL_ISLAND";
        h.lIlIIIllllIIl[h.lIlIIIllllIlI[1]] = h."Tutorial Island";
    }

    static {
        h.lIlllIIIlIlIlll();
        h.lIlllIIIlIlIllI();
        TUTORIAL_ISLAND = new h(lIlIIIllllIIl[lIlIIIllllIlI[1]]);
        h[] hArray = new h[lIlIIIllllIlI[1]];
        hArray[h.lIlIIIllllIlI[0]] = TUTORIAL_ISLAND;
        $VALUES = hArray;
    }

    private h(String string2) {
        this.questName = string2;
    }
}

