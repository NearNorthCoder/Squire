/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.runecrafting.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<b> {
    public static final  /* enum */ b OVERCHARGED;
    
    public static final  /* enum */ b STRONG;
    private static final  b[] $VALUES;
    public static final  /* enum */ b MEDIUM;
    public static final  /* enum */ b WEAK;

        return String.valueOf(var1);
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    static {
        b.llllllIlIlIIII();
        b.llllllIlIIllll();
        WEAK = new GameEnum();
        MEDIUM = new GameEnum();
        STRONG = new GameEnum();
        OVERCHARGED = new GameEnum();
        b[] bArray = new b[llIIllIlIllI[4]];
        bArray[b.llIIllIlIllI[0]] = WEAK;
        bArray[b.llIIllIlIllI[1]] = MEDIUM;
        bArray[b.llIIllIlIllI[2]] = STRONG;
        bArray[b.llIIllIlIllI[3]] = OVERCHARGED;
        $VALUES = bArray;
    }

    private static void llllllIlIIllll() {
        llIIllIlIlIl = new String[llIIllIlIllI[4]];
        b.llIIllIlIlIl[b.llIIllIlIllI[0]] = "WEAK";
        b.llIIllIlIlIl[b.llIIllIlIllI[1]] = "MEDIUM";
        b.llIIllIlIlIl[b.llIIllIlIllI[2]] = "STRONG";
        b.llIIllIlIlIl[b.llIIllIlIllI[3]] = "OVERCHARGED";
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llIIllIlIllI[0]) + string.substring(llIIllIlIllI[1]).toLowerCase();
    }

    private static boolean llllllIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

