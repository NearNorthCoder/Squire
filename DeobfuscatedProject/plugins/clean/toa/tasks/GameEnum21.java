/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum21
extends Enum<c> {
    public static final  /* enum */ c RANGE_2;
    public static final  /* enum */ c MAGE;
    public static final  /* enum */ c MELEE_1;
    
    public static final  /* enum */ c RANGE_1;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c NONE;
    public static final  /* enum */ c MELEE_2;

    static {
        c.lIllIllIIIllIIl();
        c.lIllIllIIIllIII();
        NONE = new GameEnum21();
        MELEE_1 = new GameEnum21();
        MELEE_2 = new GameEnum21();
        RANGE_1 = new GameEnum21();
        RANGE_2 = new GameEnum21();
        MAGE = new GameEnum21();
        c[] cArray = new c[lIlIIIIIlIlII[6]];
        cArray[c.lIlIIIIIlIlII[0]] = NONE;
        cArray[c.lIlIIIIIlIlII[1]] = MELEE_1;
        cArray[c.lIlIIIIIlIlII[2]] = MELEE_2;
        cArray[c.lIlIIIIIlIlII[3]] = RANGE_1;
        cArray[c.lIlIIIIIlIlII[4]] = RANGE_2;
        cArray[c.lIlIIIIIlIlII[5]] = MAGE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }

    private static void lIllIllIIIllIII() {
        lIlIIIIIlIIll = new String[lIlIIIIIlIlII[6]];
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[0]] = "NONE";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[1]] = "MELEE_1";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[2]] = "MELEE_2";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[3]] = "RANGE_1";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[4]] = "RANGE_2";
        c.lIlIIIIIlIIll[c.lIlIIIIIlIlII[5]] = "MAGE";
    }

    private static boolean lIllIllIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

}

