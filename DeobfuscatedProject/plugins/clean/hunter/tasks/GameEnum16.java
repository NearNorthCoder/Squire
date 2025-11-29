/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum16
extends Enum<e> {
    public static final  /* enum */ e PITFALL;
    public static final  /* enum */ e BIRDS;
    private static final  e[] $VALUES;
    
    public static final  /* enum */ e FALCONRY;
    
    public static final  /* enum */ e SALLIES;
    public static final  /* enum */ e CHINS;

    static {
        e.lIIIllIlIllIlll();
        e.lIIIllIlIllIllI();
        BIRDS = new GameEnum16();
        SALLIES = new GameEnum16();
        FALCONRY = new GameEnum16();
        CHINS = new GameEnum16();
        PITFALL = new GameEnum16();
        e[] eArray = new e[lllIllIlIlll[5]];
        eArray[e.lllIllIlIlll[0]] = BIRDS;
        eArray[e.lllIllIlIlll[1]] = SALLIES;
        eArray[e.lllIllIlIlll[2]] = FALCONRY;
        eArray[e.lllIllIlIlll[3]] = CHINS;
        eArray[e.lllIllIlIlll[4]] = PITFALL;
        $VALUES = eArray;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void lIIIllIlIllIllI() {
        lllIllIlIllI = new String[lllIllIlIlll[5]];
        e.lllIllIlIllI[e.lllIllIlIlll[0]] = "BIRDS";
        e.lllIllIlIllI[e.lllIllIlIlll[1]] = "SALLIES";
        e.lllIllIlIllI[e.lllIllIlIlll[2]] = "FALCONRY";
        e.lllIllIlIllI[e.lllIllIlIlll[3]] = "CHINS";
        e.lllIllIlIllI[e.lllIllIlIlll[4]] = "PITFALL";
    }

}

