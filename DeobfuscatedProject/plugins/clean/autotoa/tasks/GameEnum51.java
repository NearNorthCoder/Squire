/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum51
extends Enum<bY> {
    
    public static final  /* enum */ bY WAVE;
    
    public static final  /* enum */ bY JUG;
    public static final  /* enum */ bY ATTACK;
    private static final  bY[] $VALUES;

    private static void lIlIIlllllIIlI() {
        llIlIllIIll = new String[llIlIllIlII[3]];
        bY.llIlIllIIll[bY.llIlIllIlII[0]] = "ATTACK";
        bY.llIlIllIIll[bY.llIlIllIlII[1]] = "WAVE";
        bY.llIlIllIIll[bY.llIlIllIlII[2]] = "JUG";
    }

        return String.valueOf(var1);
    }

    static {
        bY.lIlIIlllllIIll();
        bY.lIlIIlllllIIlI();
        ATTACK = new GameEnum51();
        WAVE = new GameEnum51();
        JUG = new GameEnum51();
        bY[] bYArray = new bY[llIlIllIlII[3]];
        bYArray[bY.llIlIllIlII[0]] = ATTACK;
        bYArray[bY.llIlIllIlII[1]] = WAVE;
        bYArray[bY.llIlIllIlII[2]] = JUG;
        $VALUES = bYArray;
    }

    public static bY valueOf(String string) {
        return Enum.valueOf(GameEnum51.class, string);
    }

    private static boolean lIlIIlllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public static bY[] values() {
        return (bY[])$VALUES.clone();
    }
}

