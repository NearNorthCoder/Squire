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

public final class GameEnum18
extends Enum<w> {
     String name;
    
    public static final  /* enum */ w NONE;
    private static final  w[] $VALUES;
    public static final  /* enum */ w HALLOWED_HAMMER;
    
    public static final  /* enum */ w HAMMER;

    private static void lIIIlIIIIlIllII() {
        lllIIIIIllll = new String[lllIIIIlIIIl[6]];
        w.lllIIIIIllll[w.lllIIIIlIIIl[0]] = "NONE";
        w.lllIIIIIllll[w.lllIIIIlIIIl[1]] = w.lIIIlIIIIlIlIll("PjL+8IStxZs=", "AlLse");
        w.lllIIIIIllll[w.lllIIIIlIIIl[2]] = "HAMMER";
        w.lllIIIIIllll[w.lllIIIIlIIIl[3]] = "Hammer";
        w.lllIIIIIllll[w.lllIIIIlIIIl[4]] = "HALLOWED_HAMMER";
        w.lllIIIIIllll[w.lllIIIIlIIIl[5]] = "Hallowed hammer";
    }

    static {
        w.lIIIlIIIIlllIIl();
        w.lIIIlIIIIlIllII();
        NONE = new GameEnum18(lllIIIIIllll[lllIIIIlIIIl[1]]);
        HAMMER = new GameEnum18(lllIIIIIllll[lllIIIIlIIIl[3]]);
        HALLOWED_HAMMER = new GameEnum18(lllIIIIIllll[lllIIIIlIIIl[5]]);
        w[] wArray = new w[lllIIIIlIIIl[3]];
        wArray[w.lllIIIIlIIIl[0]] = NONE;
        wArray[w.lllIIIIlIIIl[1]] = HAMMER;
        wArray[w.lllIIIIlIIIl[2]] = HALLOWED_HAMMER;
        $VALUES = wArray;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

    private GameEnum18(String string2) {
        this.name = string2;
    }

}

