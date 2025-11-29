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

public final class GameEnum19
extends Enum<j> {
    public static final  /* enum */ j BRONZE;
    public static final  /* enum */ j IRON;
    public static final  /* enum */ j DRAGON;
    public static final  /* enum */ j AMETHYST;
    private final  int dartTipId;
    public static final  /* enum */ j ADAMANT;
    private static final  j[] $VALUES;
    public static final  /* enum */ j STEEL;
    
    public static final  /* enum */ j RUNE;
    
    public static final  /* enum */ j MITHRIL;

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static void lIlIllllIlIlIl() {
        lllIlIIlIII = new String[lllIlIIlIIl[16]];
        j.lllIlIIlIII[j.lllIlIIlIIl[0]] = "BRONZE";
        j.lllIlIIlIII[j.lllIlIIlIIl[2]] = "IRON";
        j.lllIlIIlIII[j.lllIlIIlIIl[4]] = "STEEL";
        j.lllIlIIlIII[j.lllIlIIlIIl[6]] = "MITHRIL";
        j.lllIlIIlIII[j.lllIlIIlIIl[8]] = "ADAMANT";
        j.lllIlIIlIII[j.lllIlIIlIIl[10]] = "RUNE";
        j.lllIlIIlIII[j.lllIlIIlIIl[12]] = "AMETHYST";
        j.lllIlIIlIII[j.lllIlIIlIIl[14]] = "DRAGON";
    }

    public int D() {
        return this.dartTipId;
    }

    private static boolean lIlIllllIlIlll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    static {
        j.lIlIllllIlIllI();
        j.lIlIllllIlIlIl();
        BRONZE = new GameEnum19(lllIlIIlIIl[1]);
        IRON = new GameEnum19(lllIlIIlIIl[3]);
        STEEL = new GameEnum19(lllIlIIlIIl[5]);
        MITHRIL = new GameEnum19(lllIlIIlIIl[7]);
        ADAMANT = new GameEnum19(lllIlIIlIIl[9]);
        RUNE = new GameEnum19(lllIlIIlIIl[11]);
        AMETHYST = new GameEnum19(lllIlIIlIIl[13]);
        DRAGON = new GameEnum19(lllIlIIlIIl[15]);
        j[] jArray = new j[lllIlIIlIIl[16]];
        jArray[j.lllIlIIlIIl[0]] = BRONZE;
        jArray[j.lllIlIIlIIl[2]] = IRON;
        jArray[j.lllIlIIlIIl[4]] = STEEL;
        jArray[j.lllIlIIlIIl[6]] = MITHRIL;
        jArray[j.lllIlIIlIIl[8]] = ADAMANT;
        jArray[j.lllIlIIlIIl[10]] = RUNE;
        jArray[j.lllIlIIlIIl[12]] = AMETHYST;
        jArray[j.lllIlIIlIIl[14]] = DRAGON;
        $VALUES = jArray;
    }

    private GameEnum19(int n3) {
        this.dartTipId = n3;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

}

