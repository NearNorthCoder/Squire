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

public final class GameEnum37
extends Enum<d> {
    private final  int arrowTipId;
    public static final  /* enum */ d IRON;
    public static final  /* enum */ d DRAGON;
    private static final  d[] $VALUES;

    public static final  /* enum */ d MITHRIL;
    public static final  /* enum */ d STEEL;
    public static final  /* enum */ d ADAMANT;
    public static final  /* enum */ d RUNE;
    public static final  /* enum */ d BRONZE;
    public static final  /* enum */ d HEADLESS;
    public static final  /* enum */ d BROAD;
    public static final  /* enum */ d AMETHYST;

    private static boolean lIlIllIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlIIlIll() {
        lllIIIllIII = new String[lllIIIllIIl[20]];
        d.lllIIIllIII[d.lllIIIllIIl[0]] = "HEADLESS";
        d.lllIIIllIII[d.lllIIIllIIl[2]] = "BRONZE";
        d.lllIIIllIII[d.lllIIIllIIl[4]] = "IRON";
        d.lllIIIllIII[d.lllIIIllIIl[6]] = "STEEL";
        d.lllIIIllIII[d.lllIIIllIIl[8]] = "MITHRIL";
        d.lllIIIllIII[d.lllIIIllIIl[10]] = "BROAD";
        d.lllIIIllIII[d.lllIIIllIIl[12]] = "ADAMANT";
        d.lllIIIllIII[d.lllIIIllIIl[14]] = "RUNE";
        d.lllIIIllIII[d.lllIIIllIIl[16]] = "AMETHYST";
        d.lllIIIllIII[d.lllIIIllIIl[18]] = "DRAGON";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.lIlIllIlIIllII();
        d.lIlIllIlIIlIll();
        HEADLESS = new GameEnum37(lllIIIllIIl[1]);
        BRONZE = new GameEnum37(lllIIIllIIl[3]);
        IRON = new GameEnum37(lllIIIllIIl[5]);
        STEEL = new GameEnum37(lllIIIllIIl[7]);
        MITHRIL = new GameEnum37(lllIIIllIIl[9]);
        BROAD = new GameEnum37(lllIIIllIIl[11]);
        ADAMANT = new GameEnum37(lllIIIllIIl[13]);
        RUNE = new GameEnum37(lllIIIllIIl[15]);
        AMETHYST = new GameEnum37(lllIIIllIIl[17]);
        DRAGON = new GameEnum37(lllIIIllIIl[19]);
        d[] dArray = new d[lllIIIllIIl[20]];
        dArray[d.lllIIIllIIl[0]] = HEADLESS;
        dArray[d.lllIIIllIIl[2]] = BRONZE;
        dArray[d.lllIIIllIIl[4]] = IRON;
        dArray[d.lllIIIllIIl[6]] = STEEL;
        dArray[d.lllIIIllIIl[8]] = MITHRIL;
        dArray[d.lllIIIllIIl[10]] = BROAD;
        dArray[d.lllIIIllIIl[12]] = ADAMANT;
        dArray[d.lllIIIllIIl[14]] = RUNE;
        dArray[d.lllIIIllIIl[16]] = AMETHYST;
        dArray[d.lllIIIllIIl[18]] = DRAGON;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum37.class, string);
    }

    public int o() {
        return this.arrowTipId;
    }

    private GameEnum37(int n3) {
        this.arrowTipId = n3;
    }

        return String.valueOf(var1);
    }
}

