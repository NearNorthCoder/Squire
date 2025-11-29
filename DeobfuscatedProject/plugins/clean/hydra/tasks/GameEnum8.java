/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.hydra.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum8
extends Enum<g> {
    private static final  g[] $VALUES;
    public static final  /* enum */ g RIGOUR;
    public static final  /* enum */ g AUGURY;
    public static final  /* enum */ g EAGLE_EYE;
    public static final  /* enum */ g PIETY;
    
    private final  Prayer clientType;
    public static final  /* enum */ g NONE;
    public static final  /* enum */ g CHIVALRY;
    
    public static final  /* enum */ g MYSTIC_MIGHT;

    public String y() {
        String string = super.toString();
        return string.charAt(llllIlIIIIll[0]) + string.substring(llllIlIIIIll[1]).replaceAll(llllIlIIIIlI[llllIlIIIIll[0]], llllIlIIIIlI[llllIlIIIIll[1]]).toLowerCase();
    }

    public Prayer z() {
        return this.clientType;
    }

    private GameEnum8(Prayer prayer) {
        this.clientType = prayer;
    }

    private static void lIIlIIIIIlllIIl() {
        llllIlIIIIlI = new String[llllIlIIIIll[9]];
        g.llllIlIIIIlI[g.llllIlIIIIll[0]] = "_";
        g.llllIlIIIIlI[g.llllIlIIIIll[1]] = g.lIIlIIIIIllIllI("cjq1CKISQYU=", "ahtFa");
        g.llllIlIIIIlI[g.llllIlIIIIll[2]] = "AUGURY";
        g.llllIlIIIIlI[g.llllIlIIIIll[3]] = "MYSTIC_MIGHT";
        g.llllIlIIIIlI[g.llllIlIIIIll[4]] = "RIGOUR";
        g.llllIlIIIIlI[g.llllIlIIIIll[5]] = "EAGLE_EYE";
        g.llllIlIIIIlI[g.llllIlIIIIll[6]] = "PIETY";
        g.llllIlIIIIlI[g.llllIlIIIIll[7]] = "CHIVALRY";
        g.llllIlIIIIlI[g.llllIlIIIIll[8]] = "NONE";
    }

    static {
        g.lIIlIIIIIlllIlI();
        g.lIIlIIIIIlllIIl();
        AUGURY = new GameEnum8(Prayer.AUGURY);
        MYSTIC_MIGHT = new GameEnum8(Prayer.MYSTIC_MIGHT);
        RIGOUR = new GameEnum8(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum8(Prayer.EAGLE_EYE);
        PIETY = new GameEnum8(Prayer.PIETY);
        CHIVALRY = new GameEnum8(Prayer.CHIVALRY);
        NONE = new GameEnum8(null);
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
        return Enum.valueOf(GameEnum8.class, string);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }
}

