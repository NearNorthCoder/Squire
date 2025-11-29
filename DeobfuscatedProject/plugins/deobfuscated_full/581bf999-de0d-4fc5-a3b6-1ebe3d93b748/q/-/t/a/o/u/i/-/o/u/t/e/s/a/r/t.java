/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class t
extends Enum<t> {
    public static final /* synthetic */ /* enum */ t AUGURY;
    public static final /* synthetic */ /* enum */ t MYSTIC_MIGHT;
    private static /* synthetic */ int[] lIllIlIllIl;
    private static final /* synthetic */ t[] $VALUES;
    private final /* synthetic */ Prayer mapped;
    private static /* synthetic */ String[] lIllIlIllII;

    private static String lIIlIlllIlIIll(String var1, String var10) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIllIlIllIl[3]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIllIlIllIl[2], var2);
            return new String(var8.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private t(Prayer prayer) {
        this.mapped = prayer;
    }

    static {
        t.lIIlIlllIlIlIl();
        t.lIIlIlllIlIlII();
        AUGURY = new t(Prayer.AUGURY);
        MYSTIC_MIGHT = new t(Prayer.MYSTIC_MIGHT);
        t[] tArray = new t[lIllIlIllIl[2]];
        tArray[t.lIllIlIllIl[0]] = AUGURY;
        tArray[t.lIllIlIllIl[1]] = MYSTIC_MIGHT;
        $VALUES = tArray;
    }

    private static String lIIlIlllIlIIlI(String var3, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIllIlIllIl[2], var5);
            return new String(var7.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIlIlII() {
        lIllIlIllII = new String[lIllIlIllIl[2]];
        t.lIllIlIllII[t.lIllIlIllIl[0]] = t."AUGURY";
        t.lIllIlIllII[t.lIllIlIllIl[1]] = t."MYSTIC_MIGHT";
    }

    public Prayer ag() {
        return this.mapped;
    }

    private static void lIIlIlllIlIlIl() {
        lIllIlIllIl = new int[4];
        t.lIllIlIllIl[0] = (0x63 ^ 0x59) & ~(0x54 ^ 0x6E);
        t.lIllIlIllIl[1] = 1;
        t.lIllIlIllIl[2] = 2;
        t.lIllIlIllIl[3] = 0x5D ^ 0x55;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }
}

