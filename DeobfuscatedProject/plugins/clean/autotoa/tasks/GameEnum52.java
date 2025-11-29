/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum52
extends Enum<g> {
    private static final  g[] $VALUES;
    public static final  /* enum */ g MAGE;
    public static final  /* enum */ g RANGE_1;
    
    public static final  /* enum */ g MELEE_1;
    public static final  /* enum */ g NONE;
    
    public static final  /* enum */ g MELEE_2;
    public static final  /* enum */ g RANGE_2;

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum52.class, string);
    }

    static {
        g.lIlIIIlllIllIl();
        g.lIlIIIlllIllII();
        NONE = new GameEnum52();
        MELEE_1 = new GameEnum52();
        MELEE_2 = new GameEnum52();
        RANGE_1 = new GameEnum52();
        RANGE_2 = new GameEnum52();
        MAGE = new GameEnum52();
        g[] gArray = new g[llIIllllIII[6]];
        gArray[g.llIIllllIII[0]] = NONE;
        gArray[g.llIIllllIII[1]] = MELEE_1;
        gArray[g.llIIllllIII[2]] = MELEE_2;
        gArray[g.llIIllllIII[3]] = RANGE_1;
        gArray[g.llIIllllIII[4]] = RANGE_2;
        gArray[g.llIIllllIII[5]] = MAGE;
        $VALUES = gArray;
    }

    private static void lIlIIIlllIllII() {
        llIIlllIlll = new String[llIIllllIII[6]];
        g.llIIlllIlll[g.llIIllllIII[0]] = "NONE";
        g.llIIlllIlll[g.llIIllllIII[1]] = "MELEE_1";
        g.llIIlllIlll[g.llIIllllIII[2]] = "MELEE_2";
        g.llIIlllIlll[g.llIIllllIII[3]] = "RANGE_1";
        g.llIIlllIlll[g.llIIllllIII[4]] = "RANGE_2";
        g.llIIlllIlll[g.llIIllllIII[5]] = "MAGE";
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIIIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

}

