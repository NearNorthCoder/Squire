/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class EEnum
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e CHIVALRY;
    private final /* synthetic */ Prayer mapped;
    public static final /* synthetic */ /* enum */ e PIETY;
    private static /* synthetic */ String[] llIIlIlllIIl;
    private static final /* synthetic */ e[] $VALUES;
    private static /* synthetic */ int[] llIIlIlllIlI;
    public static final /* synthetic */ /* enum */ e ULTIMATE_STRENGTH;

    public Prayer C() {
        return this.mapped;
    }

    private static void lllllIlllIIllI() {
        llIIlIlllIIl = new String[llIIlIlllIlI[3]];
        e.llIIlIlllIIl[e.llIIlIlllIlI[0]] = e."PIETY";
        e.llIIlIlllIIl[e.llIIlIlllIlI[1]] = e."CHIVALRY";
        e.llIIlIlllIIl[e.llIIlIlllIlI[2]] = e."ULTIMATE_STRENGTH";
    }

    private static void lllllIlllIIlll() {
        llIIlIlllIlI = new int[4];
        e.llIIlIlllIlI[0] = (0x80 ^ 0xA1) & ~(0xA ^ 0x2B);
        e.llIIlIlllIlI[1] = 1;
        e.llIIlIlllIlI[2] = 2;
        e.llIIlIlllIlI[3] = 3;
    }

    static {
        e.lllllIlllIIlll();
        e.lllllIlllIIllI();
        PIETY = new e(Prayer.PIETY);
        CHIVALRY = new e(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new e(Prayer.ULTIMATE_STRENGTH);
        e[] eArray = new e[llIIlIlllIlI[3]];
        eArray[e.llIIlIlllIlI[0]] = PIETY;
        eArray[e.llIIlIlllIlI[1]] = CHIVALRY;
        eArray[e.llIIlIlllIlI[2]] = ULTIMATE_STRENGTH;
        $VALUES = eArray;
    }

    private e(Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean lllllIlllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static String lllllIlllIIlII(String var9, String var11) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIIlIlllIlI[2], var10);
            return new String(var4.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String lllllIlllIIlIl(String var1, String var5) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var6 = var5.toCharArray();
        int var14 = llIIlIlllIlI[0];
        char[] var3 = var1.toCharArray();
        int var7 = var3.length;
        int var8 = llIIlIlllIlI[0];
        while (e.lllllIlllIlIII(var8, var7)) {
            char var2 = var3[var8];
            var12.append((char)(var2 ^ var6[var14 % var6.length]));
            0;
            ++var14;
            ++var8;
            0;
            if (((0xA1 ^ 0xA9 ^ (0xBA ^ 0xA5)) & (0x26 ^ 6 ^ (8 ^ 0x3F) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }
}

