/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class g
extends Enum<g> {
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g RIGOUR;
    public static final /* synthetic */ /* enum */ g AUGURY;
    public static final /* synthetic */ /* enum */ g EAGLE_EYE;
    public static final /* synthetic */ /* enum */ g PIETY;
    private static /* synthetic */ int[] llllIlIIIIll;
    private final /* synthetic */ Prayer clientType;
    public static final /* synthetic */ /* enum */ g NONE;
    public static final /* synthetic */ /* enum */ g CHIVALRY;
    private static /* synthetic */ String[] llllIlIIIIlI;
    public static final /* synthetic */ /* enum */ g MYSTIC_MIGHT;

    private static String lIIlIIIIIlllIII(String var17, String var5) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llllIlIIIIll[8]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llllIlIIIIll[2], var3);
            return new String(var1.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public String y() {
        String string = super.toString();
        return string.charAt(llllIlIIIIll[0]) + string.substring(llllIlIIIIll[1]).replaceAll(llllIlIIIIlI[llllIlIIIIll[0]], llllIlIIIIlI[llllIlIIIIll[1]]).toLowerCase();
    }

    public Prayer z() {
        return this.clientType;
    }

    private static String lIIlIIIIIllIllI(String var6, String var19) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llllIlIIIIll[2], var2);
            return new String(var12.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private g(Prayer prayer) {
        this.clientType = prayer;
    }

    private static void lIIlIIIIIlllIIl() {
        llllIlIIIIlI = new String[llllIlIIIIll[9]];
        g.llllIlIIIIlI[g.llllIlIIIIll[0]] = g."_";
        g.llllIlIIIIlI[g.llllIlIIIIll[1]] = g."";
        g.llllIlIIIIlI[g.llllIlIIIIll[2]] = g."AUGURY";
        g.llllIlIIIIlI[g.llllIlIIIIll[3]] = g."MYSTIC_MIGHT";
        g.llllIlIIIIlI[g.llllIlIIIIll[4]] = g."RIGOUR";
        g.llllIlIIIIlI[g.llllIlIIIIll[5]] = g."EAGLE_EYE";
        g.llllIlIIIIlI[g.llllIlIIIIll[6]] = g."PIETY";
        g.llllIlIIIIlI[g.llllIlIIIIll[7]] = g."CHIVALRY";
        g.llllIlIIIIlI[g.llllIlIIIIll[8]] = g."NONE";
    }

    private static void lIIlIIIIIlllIlI() {
        llllIlIIIIll = new int[10];
        g.llllIlIIIIll[0] = (67 + 187 - 139 + 79 ^ 76 + 113 - 162 + 108) & (0x82 ^ 0xA4 ^ (0x34 ^ 0x57) ^ -1);
        g.llllIlIIIIll[1] = 1;
        g.llllIlIIIIll[2] = 2;
        g.llllIlIIIIll[3] = 3;
        g.llllIlIIIIll[4] = 0x19 ^ 0x1D;
        g.llllIlIIIIll[5] = 145 + 26 - 94 + 105 ^ 112 + 7 - 27 + 87;
        g.llllIlIIIIll[6] = 0x53 ^ 0x55;
        g.llllIlIIIIll[7] = 0x89 ^ 0x8E;
        g.llllIlIIIIll[8] = 156 + 102 - 96 + 5 ^ 111 + 12 - -4 + 48;
        g.llllIlIIIIll[9] = 0x6E ^ 0x4B ^ (0xAF ^ 0x83);
    }

    static {
        g.lIIlIIIIIlllIlI();
        g.lIIlIIIIIlllIIl();
        AUGURY = new g(Prayer.AUGURY);
        MYSTIC_MIGHT = new g(Prayer.MYSTIC_MIGHT);
        RIGOUR = new g(Prayer.RIGOUR);
        EAGLE_EYE = new g(Prayer.EAGLE_EYE);
        PIETY = new g(Prayer.PIETY);
        CHIVALRY = new g(Prayer.CHIVALRY);
        NONE = new g(null);
        g[] gArray = new g[llllIlIIIIll[7]];
        gArray[g.llllIlIIIIll[0]] = AUGURY;
        gArray[g.llllIlIIIIll[1]] = MYSTIC_MIGHT;
        gArray[g.llllIlIIIIll[2]] = RIGOUR;
        gArray[g.llllIlIIIIll[3]] = EAGLE_EYE;
        gArray[g.llllIlIIIIll[4]] = PIETY;
        gArray[g.llllIlIIIIll[5]] = CHIVALRY;
        gArray[g.llllIlIIIIll[6]] = NONE;
        $VALUES = gArray;
    }

    private static boolean lIIlIIIIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static String lIIlIIIIIllIlll(String var11, String var14) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var15 = var14.toCharArray();
        int var10 = llllIlIIIIll[0];
        char[] var8 = var11.toCharArray();
        int var18 = var8.length;
        int var13 = llllIlIIIIll[0];
        while (g.lIIlIIIIIlllIll(var13, var18)) {
            char var7 = var8[var13];
            var16.append((char)(var7 ^ var15[var10 % var15.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }
}

