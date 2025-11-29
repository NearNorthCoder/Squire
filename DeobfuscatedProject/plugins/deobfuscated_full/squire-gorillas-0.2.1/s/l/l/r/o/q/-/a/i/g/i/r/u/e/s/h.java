/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class h
extends Enum<h> {
    private static final /* synthetic */ h[] $VALUES;
    public static final /* synthetic */ /* enum */ h RIGOUR;
    private static /* synthetic */ String[] llIIlIIlIlII;
    private final /* synthetic */ Prayer mapped;
    public static final /* synthetic */ /* enum */ h EAGLE_EYE;
    private static /* synthetic */ int[] llIIlIIlIlIl;

    private static void lllllIIlllIIlI() {
        llIIlIIlIlII = new String[llIIlIIlIlIl[2]];
        h.llIIlIIlIlII[h.llIIlIIlIlIl[0]] = h."RIGOUR";
        h.llIIlIIlIlII[h.llIIlIIlIlIl[1]] = h."EAGLE_EYE";
    }

    private static String lllllIIlllIIIl(String var10, String var6) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIIlIIlIlIl[3]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llIIlIIlIlIl[2], var5);
            return new String(var7.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private h(Prayer prayer) {
        this.mapped = prayer;
    }

    private static String lllllIIlllIIII(String var4, String var3) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llIIlIIlIlIl[2], var1);
            return new String(var8.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public Prayer C() {
        return this.mapped;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    static {
        h.lllllIIlllIIll();
        h.lllllIIlllIIlI();
        RIGOUR = new h(Prayer.RIGOUR);
        EAGLE_EYE = new h(Prayer.EAGLE_EYE);
        h[] hArray = new h[llIIlIIlIlIl[2]];
        hArray[h.llIIlIIlIlIl[0]] = RIGOUR;
        hArray[h.llIIlIIlIlIl[1]] = EAGLE_EYE;
        $VALUES = hArray;
    }

    private static void lllllIIlllIIll() {
        llIIlIIlIlIl = new int[4];
        h.llIIlIIlIlIl[0] = (0xBC ^ 0xAA ^ (0x1A ^ 0x17)) & (162 + 9 - 31 + 32 ^ 104 + 34 - 20 + 65 ^ -1);
        h.llIIlIIlIlIl[1] = 1;
        h.llIIlIIlIlIl[2] = 2;
        h.llIIlIIlIlIl[3] = 0 ^ 8;
    }
}

