/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum14
extends Enum<o> {
    private static final  o[] $VALUES;
    public static final  /* enum */ o BIRD_HOUSE;
    
    public static final  /* enum */ o HERBS;
    public static final  /* enum */ o SEAWEED;
    public static final  /* enum */ o TREES;

    private static void lllIllllllllII() {
        lIlllllIllll = new String[lIllllllIIII[4]];
        o.lIlllllIllll[o.lIllllllIIII[0]] = "HERBS";
        o.lIlllllIllll[o.lIllllllIIII[1]] = "TREES";
        o.lIlllllIllll[o.lIllllllIIII[2]] = "BIRD_HOUSE";
        o.lIlllllIllll[o.lIllllllIIII[3]] = "SEAWEED";
    }

        return String.valueOf(var1);
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    private static boolean lllIlllllllllI(int n2, int n3) {
        return n2 < n3;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    static {
        o.lllIllllllllIl();
        o.lllIllllllllII();
        HERBS = new GameEnum14();
        TREES = new GameEnum14();
        BIRD_HOUSE = new GameEnum14();
        SEAWEED = new GameEnum14();
        o[] oArray = new o[lIllllllIIII[4]];
        oArray[o.lIllllllIIII[0]] = HERBS;
        oArray[o.lIllllllIIII[1]] = TREES;
        oArray[o.lIllllllIIII[2]] = BIRD_HOUSE;
        oArray[o.lIllllllIIII[3]] = SEAWEED;
        $VALUES = oArray;
    }
}

