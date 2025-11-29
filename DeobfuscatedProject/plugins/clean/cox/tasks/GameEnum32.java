/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum32
extends Enum<w> {
    public static final  /* enum */ w REACHED_LOWER_LEVEL;
    private static final  w[] $VALUES;
    public static final  /* enum */ w EXPLORING_UPPER_LEVEL;
    
    public static final  /* enum */ w REACHED_BOTTOM;
    
    public static final  /* enum */ w GET_OUT;
    public static final  /* enum */ w WAITING_FOR_LEADER_TO_START;
    public static final  /* enum */ w REACHED_MIDDLE_LEVEL;

    static {
        w.llIllIIlIIlIIl();
        w.llIllIIlIIlIII();
        WAITING_FOR_LEADER_TO_START = new GameEnum32();
        EXPLORING_UPPER_LEVEL = new GameEnum32();
        REACHED_MIDDLE_LEVEL = new GameEnum32();
        REACHED_LOWER_LEVEL = new GameEnum32();
        REACHED_BOTTOM = new GameEnum32();
        GET_OUT = new GameEnum32();
        w[] wArray = new w[lIlIIlIlIlII[6]];
        wArray[w.lIlIIlIlIlII[0]] = WAITING_FOR_LEADER_TO_START;
        wArray[w.lIlIIlIlIlII[1]] = EXPLORING_UPPER_LEVEL;
        wArray[w.lIlIIlIlIlII[2]] = REACHED_MIDDLE_LEVEL;
        wArray[w.lIlIIlIlIlII[3]] = REACHED_LOWER_LEVEL;
        wArray[w.lIlIIlIlIlII[4]] = REACHED_BOTTOM;
        wArray[w.lIlIIlIlIlII[5]] = GET_OUT;
        $VALUES = wArray;
    }

    private static void llIllIIlIIlIII() {
        lIlIIlIlIIll = new String[lIlIIlIlIlII[6]];
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[0]] = "WAITING_FOR_LEADER_TO_START";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[1]] = "EXPLORING_UPPER_LEVEL";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[2]] = "REACHED_MIDDLE_LEVEL";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[3]] = "REACHED_LOWER_LEVEL";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[4]] = "REACHED_BOTTOM";
        w.lIlIIlIlIIll[w.lIlIIlIlIlII[5]] = "GET_OUT";
    }

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum32.class, string);
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    private static boolean llIllIIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

}

