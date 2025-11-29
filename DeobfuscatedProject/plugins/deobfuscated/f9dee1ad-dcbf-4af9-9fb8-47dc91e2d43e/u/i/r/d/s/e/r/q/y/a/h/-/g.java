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

    private static String lIIlIIIIIlllIII(String lllllllllllllllIIlIlIIllIIlIlIIl, String lllllllllllllllIIlIlIIllIIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), llllIlIIIIll[8]), "DES");
            Cipher lllllllllllllllIIlIlIIllIIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIllIIlIllIl.init(llllIlIIIIll[2], lllllllllllllllIIlIlIIllIIlIlllI);
            return new String(lllllllllllllllIIlIlIIllIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIllIIlIllII) {
            lllllllllllllllIIlIlIIllIIlIllII.printStackTrace();
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

    private static String lIIlIIIIIllIllI(String lllllllllllllllIIlIlIIllIIllIllI, String lllllllllllllllIIlIlIIllIIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIllIIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIllIIlllIlI.init(llllIlIIIIll[2], lllllllllllllllIIlIlIIllIIlllIll);
            return new String(lllllllllllllllIIlIlIIllIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIllIIlllIIl) {
            lllllllllllllllIIlIlIIllIIlllIIl.printStackTrace();
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

    private static String lIIlIIIIIllIlll(String lllllllllllllllIIlIlIIllIlIIllIl, String lllllllllllllllIIlIlIIllIlIIIlll) {
        lllllllllllllllIIlIlIIllIlIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIllIlIIlIll = new StringBuilder();
        char[] lllllllllllllllIIlIlIIllIlIIlIlI = lllllllllllllllIIlIlIIllIlIIIlll.toCharArray();
        int lllllllllllllllIIlIlIIllIlIIlIIl = llllIlIIIIll[0];
        char[] lllllllllllllllIIlIlIIllIlIIIIll = lllllllllllllllIIlIlIIllIlIIllIl.toCharArray();
        int lllllllllllllllIIlIlIIllIlIIIIlI = lllllllllllllllIIlIlIIllIlIIIIll.length;
        int lllllllllllllllIIlIlIIllIlIIIIIl = llllIlIIIIll[0];
        while (g.lIIlIIIIIlllIll(lllllllllllllllIIlIlIIllIlIIIIIl, lllllllllllllllIIlIlIIllIlIIIIlI)) {
            char lllllllllllllllIIlIlIIllIlIIlllI = lllllllllllllllIIlIlIIllIlIIIIll[lllllllllllllllIIlIlIIllIlIIIIIl];
            lllllllllllllllIIlIlIIllIlIIlIll.append((char)(lllllllllllllllIIlIlIIllIlIIlllI ^ lllllllllllllllIIlIlIIllIlIIlIlI[lllllllllllllllIIlIlIIllIlIIlIIl % lllllllllllllllIIlIlIIllIlIIlIlI.length]));
            0;
            ++lllllllllllllllIIlIlIIllIlIIlIIl;
            ++lllllllllllllllIIlIlIIllIlIIIIIl;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIIllIlIIlIll);
    }
}

