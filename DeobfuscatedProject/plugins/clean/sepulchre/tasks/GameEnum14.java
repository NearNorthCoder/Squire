/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum14
extends Enum<g> {
    private static final  g[] $VALUES;
    public static final  /* enum */ g BLADE;
    public static final  /* enum */ g GOLDEN_BLADE_II;
    public static final  /* enum */ g GOLDEN_BLADE_V;
    public static final  /* enum */ g BLADE_I;
    public static final  /* enum */ g BLADE_III;
    public static final  /* enum */ g BLADE_II;
    public static final  /* enum */ g BLUE_BLADE_II;
    public static final  /* enum */ g BLADE_IV;
    public static final  /* enum */ g GOLDEN_BLADE_III;
    public static final  /* enum */ g GOLDEN_BLADE_IV;
    public static final  /* enum */ g GOLDEN_BLADE_VI;
    
    public static final  /* enum */ g BLUE_BLADE_I;
    
    public static final  /* enum */ g GOLDEN_BLADE_I;

    static {
        g.lIIIlIIIIIlIllI();
        g.lIIIlIIIIIlIlIl();
        BLADE = new GameEnum14();
        BLADE_I = new GameEnum14();
        BLADE_II = new GameEnum14();
        BLADE_III = new GameEnum14();
        BLADE_IV = new GameEnum14();
        GOLDEN_BLADE_II = new GameEnum14();
        GOLDEN_BLADE_I = new GameEnum14();
        GOLDEN_BLADE_III = new GameEnum14();
        GOLDEN_BLADE_IV = new GameEnum14();
        GOLDEN_BLADE_V = new GameEnum14();
        GOLDEN_BLADE_VI = new GameEnum14();
        BLUE_BLADE_I = new GameEnum14();
        BLUE_BLADE_II = new GameEnum14();
        g[] gArray = new g[lllIIIIIlIII[13]];
        gArray[g.lllIIIIIlIII[0]] = BLADE;
        gArray[g.lllIIIIIlIII[1]] = BLADE_I;
        gArray[g.lllIIIIIlIII[2]] = BLADE_II;
        gArray[g.lllIIIIIlIII[3]] = BLADE_III;
        gArray[g.lllIIIIIlIII[4]] = BLADE_IV;
        gArray[g.lllIIIIIlIII[5]] = GOLDEN_BLADE_II;
        gArray[g.lllIIIIIlIII[6]] = GOLDEN_BLADE_I;
        gArray[g.lllIIIIIlIII[7]] = GOLDEN_BLADE_III;
        gArray[g.lllIIIIIlIII[8]] = GOLDEN_BLADE_IV;
        gArray[g.lllIIIIIlIII[9]] = GOLDEN_BLADE_V;
        gArray[g.lllIIIIIlIII[10]] = GOLDEN_BLADE_VI;
        gArray[g.lllIIIIIlIII[11]] = BLUE_BLADE_I;
        gArray[g.lllIIIIIlIII[12]] = BLUE_BLADE_II;
        $VALUES = gArray;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static boolean lIIIlIIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static void lIIIlIIIIIlIlIl() {
        lllIIIIIIlll = new String[lllIIIIIlIII[13]];
        g.lllIIIIIIlll[g.lllIIIIIlIII[0]] = "BLADE";
        g.lllIIIIIIlll[g.lllIIIIIlIII[1]] = "BLADE_I";
        g.lllIIIIIIlll[g.lllIIIIIlIII[2]] = "BLADE_II";
        g.lllIIIIIIlll[g.lllIIIIIlIII[3]] = "BLADE_III";
        g.lllIIIIIIlll[g.lllIIIIIlIII[4]] = "BLADE_IV";
        g.lllIIIIIIlll[g.lllIIIIIlIII[5]] = "GOLDEN_BLADE_II";
        g.lllIIIIIIlll[g.lllIIIIIlIII[6]] = "GOLDEN_BLADE_I";
        g.lllIIIIIIlll[g.lllIIIIIlIII[7]] = "GOLDEN_BLADE_III";
        g.lllIIIIIIlll[g.lllIIIIIlIII[8]] = "GOLDEN_BLADE_IV";
        g.lllIIIIIIlll[g.lllIIIIIlIII[9]] = "GOLDEN_BLADE_V";
        g.lllIIIIIIlll[g.lllIIIIIlIII[10]] = "GOLDEN_BLADE_VI";
        g.lllIIIIIIlll[g.lllIIIIIlIII[11]] = "BLUE_BLADE_I";
        g.lllIIIIIIlll[g.lllIIIIIlIII[12]] = "BLUE_BLADE_II";
    }
}

