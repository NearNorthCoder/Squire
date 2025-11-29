/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum3
extends Enum<c> {
    public static final  /* enum */ c ALL_STAGES;
    
    public static final  /* enum */ c FINISH_POTS;
    public static final  /* enum */ c CLEAN_HERBS;
    private static final  c[] $VALUES;
    public static final  /* enum */ c MAKE_UNF_POTS;
    public static final  /* enum */ c ALL_STAGES_ALL_HERBS;

    private static void lIIIlIlllIlllll() {
        lllIlIIlIIIl = new String[lllIlIIlIIll[5]];
        c.lllIlIIlIIIl[c.lllIlIIlIIll[0]] = "CLEAN_HERBS";
        c.lllIlIIlIIIl[c.lllIlIIlIIll[1]] = "MAKE_UNF_POTS";
        c.lllIlIIlIIIl[c.lllIlIIlIIll[2]] = "FINISH_POTS";
        c.lllIlIIlIIIl[c.lllIlIIlIIll[3]] = "ALL_STAGES";
        c.lllIlIIlIIIl[c.lllIlIIlIIll[4]] = "ALL_STAGES_ALL_HERBS";
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static boolean lIIIlIllllIIIll(int n, int n2) {
        return n < n2;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    static {
        c.lIIIlIllllIIIIl();
        c.lIIIlIlllIlllll();
        CLEAN_HERBS = new GameEnum3();
        MAKE_UNF_POTS = new GameEnum3();
        FINISH_POTS = new GameEnum3();
        ALL_STAGES = new GameEnum3();
        ALL_STAGES_ALL_HERBS = new GameEnum3();
        c[] cArray = new c[lllIlIIlIIll[5]];
        cArray[c.lllIlIIlIIll[0]] = CLEAN_HERBS;
        cArray[c.lllIlIIlIIll[1]] = MAKE_UNF_POTS;
        cArray[c.lllIlIIlIIll[2]] = FINISH_POTS;
        cArray[c.lllIlIIlIIll[3]] = ALL_STAGES;
        cArray[c.lllIlIIlIIll[4]] = ALL_STAGES_ALL_HERBS;
        $VALUES = cArray;
    }

        return String.valueOf(var1);
    }
}

