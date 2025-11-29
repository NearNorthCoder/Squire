/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vorkath.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum20
extends Enum<j> {
    
    public static final  /* enum */ j FREEZE;
    public static final  /* enum */ j FIRE_BALLS;
    public static final  /* enum */ j NONE;
    private static final  j[] $VALUES;

    private static void lIllllllllIlllI() {
        lIlIlIlllIllI = new String[lIlIlIlllIlll[3]];
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[0]] = "NONE";
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[1]] = "FIRE_BALLS";
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[2]] = "FREEZE";
    }

    static {
        j.lIllllllllIllll();
        j.lIllllllllIlllI();
        NONE = new GameEnum20();
        FIRE_BALLS = new GameEnum20();
        FREEZE = new GameEnum20();
        j[] jArray = new j[lIlIlIlllIlll[3]];
        jArray[j.lIlIlIlllIlll[0]] = NONE;
        jArray[j.lIlIlIlllIlll[1]] = FIRE_BALLS;
        jArray[j.lIlIlIlllIlll[2]] = FREEZE;
        $VALUES = jArray;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }
}

