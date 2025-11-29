/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum13
extends Enum<g> {
    public static final  /* enum */ g ADAMANT;
    
    public static final  /* enum */ g BRONZE;
    public static final  /* enum */ g STEEL;
    private static final  g[] $VALUES;
    public static final  /* enum */ g MITHRIL;
    public static final  /* enum */ g DRAGON;
    private final  int boltTipId;
    public static final  /* enum */ g BROAD;
    public static final  /* enum */ g IRON;
    
    public static final  /* enum */ g RUNE;

    private static boolean lIlIlllIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int y() {
        return this.boltTipId;
    }

    private static void lIlIlllIlIIIII() {
        lllIIllIlII = new String[lllIIllIlIl[16]];
        g.lllIIllIlII[g.lllIIllIlIl[0]] = "BRONZE";
        g.lllIIllIlII[g.lllIIllIlIl[2]] = "IRON";
        g.lllIIllIlII[g.lllIIllIlIl[4]] = "STEEL";
        g.lllIIllIlII[g.lllIIllIlIl[6]] = "MITHRIL";
        g.lllIIllIlII[g.lllIIllIlIl[8]] = "ADAMANT";
        g.lllIIllIlII[g.lllIIllIlIl[10]] = "RUNE";
        g.lllIIllIlII[g.lllIIllIlIl[12]] = "BROAD";
        g.lllIIllIlII[g.lllIIllIlIl[14]] = "DRAGON";
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    static {
        g.lIlIlllIlIIIIl();
        g.lIlIlllIlIIIII();
        BRONZE = new GameEnum13(lllIIllIlIl[1]);
        IRON = new GameEnum13(lllIIllIlIl[3]);
        STEEL = new GameEnum13(lllIIllIlIl[5]);
        MITHRIL = new GameEnum13(lllIIllIlIl[7]);
        ADAMANT = new GameEnum13(lllIIllIlIl[9]);
        RUNE = new GameEnum13(lllIIllIlIl[11]);
        BROAD = new GameEnum13(lllIIllIlIl[13]);
        DRAGON = new GameEnum13(lllIIllIlIl[15]);
        g[] gArray = new g[lllIIllIlIl[16]];
        gArray[g.lllIIllIlIl[0]] = BRONZE;
        gArray[g.lllIIllIlIl[2]] = IRON;
        gArray[g.lllIIllIlIl[4]] = STEEL;
        gArray[g.lllIIllIlIl[6]] = MITHRIL;
        gArray[g.lllIIllIlIl[8]] = ADAMANT;
        gArray[g.lllIIllIlIl[10]] = RUNE;
        gArray[g.lllIIllIlIl[12]] = BROAD;
        gArray[g.lllIIllIlIl[14]] = DRAGON;
        $VALUES = gArray;
    }

        return String.valueOf(var1);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private GameEnum13(int n3) {
        this.boltTipId = n3;
    }

}

