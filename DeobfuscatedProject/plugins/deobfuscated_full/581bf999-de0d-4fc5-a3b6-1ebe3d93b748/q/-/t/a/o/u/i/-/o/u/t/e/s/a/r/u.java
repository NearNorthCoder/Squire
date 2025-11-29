/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class u
extends Enum<u> {
    private static final /* synthetic */ u[] $VALUES;
    private final /* synthetic */ Prayer mapped;
    private static /* synthetic */ int[] llIlIIIlIlI;
    public static final /* synthetic */ /* enum */ u ULTIMATE_STRENGTH;
    private static /* synthetic */ String[] llIlIIIlIIl;
    public static final /* synthetic */ /* enum */ u CHIVALRY;
    public static final /* synthetic */ /* enum */ u PIETY;

    static {
        u.lIlIIlIIlllllI();
        u.lIlIIlIIllllIl();
        PIETY = new u(Prayer.PIETY);
        CHIVALRY = new u(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new u(Prayer.ULTIMATE_STRENGTH);
        u[] uArray = new u[llIlIIIlIlI[3]];
        uArray[u.llIlIIIlIlI[0]] = PIETY;
        uArray[u.llIlIIIlIlI[1]] = CHIVALRY;
        uArray[u.llIlIIIlIlI[2]] = ULTIMATE_STRENGTH;
        $VALUES = uArray;
    }

    private u(Prayer prayer) {
        this.mapped = prayer;
    }

    public Prayer ag() {
        return this.mapped;
    }

    private static void lIlIIlIIlllllI() {
        llIlIIIlIlI = new int[4];
        u.llIlIIIlIlI[0] = (10 + 88 - 42 + 127 ^ 126 + 19 - 127 + 118) & (0x4B ^ 0x40 ^ (0x74 ^ 0x40) ^ -1);
        u.llIlIIIlIlI[1] = 1;
        u.llIlIIIlIlI[2] = 2;
        u.llIlIIIlIlI[3] = 3;
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }

    private static String lIlIIlIIlllIll(String var2, String var11) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIlIIIlIlI[2], var10);
            return new String(var14.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private static void lIlIIlIIllllIl() {
        llIlIIIlIIl = new String[llIlIIIlIlI[3]];
        u.llIlIIIlIIl[u.llIlIIIlIlI[0]] = u."PIETY";
        u.llIlIIIlIIl[u.llIlIIIlIlI[1]] = u."CHIVALRY";
        u.llIlIIIlIIl[u.llIlIIIlIlI[2]] = u."ULTIMATE_STRENGTH";
    }

    private static String lIlIIlIIllllII(String var5, String var7) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var3 = var7.toCharArray();
        int var4 = llIlIIIlIlI[0];
        char[] var12 = var5.toCharArray();
        int var6 = var12.length;
        int var13 = llIlIIIlIlI[0];
        while (u.lIlIIlIIllllll(var13, var6)) {
            char var9 = var12[var13];
            var1.append((char)(var9 ^ var3[var4 % var3.length]));
            0;
            ++var4;
            ++var13;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }
}

