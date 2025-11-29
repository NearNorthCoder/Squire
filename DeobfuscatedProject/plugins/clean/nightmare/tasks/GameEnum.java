/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class GameEnum
extends Enum<av> {
    public static final  /* enum */ av WEST;

    public static final  /* enum */ av NORTH;
    private static final  av[] $VALUES;
    public static final  /* enum */ av EAST;
    public static final  /* enum */ av SOUTH;

    public static av valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static av[] values() {
        return (av[])$VALUES.clone();
    }

    static {
        av.lIIIlllllIIIIll();
        av.lIIIlllllIIIIlI();
        NORTH = new GameEnum();
        SOUTH = new GameEnum();
        EAST = new GameEnum();
        WEST = new GameEnum();
        av[] avArray = new av[llllIIlIIllI[4]];
        avArray[av.llllIIlIIllI[0]] = NORTH;
        avArray[av.llllIIlIIllI[1]] = SOUTH;
        avArray[av.llllIIlIIllI[2]] = EAST;
        avArray[av.llllIIlIIllI[3]] = WEST;
        $VALUES = avArray;
    }

        return String.valueOf(var1);
    }

    private static void lIIIlllllIIIIlI() {
        llllIIlIIlIl = new String[llllIIlIIllI[4]];
        av.llllIIlIIlIl[av.llllIIlIIllI[0]] = "NORTH";
        av.llllIIlIIlIl[av.llllIIlIIllI[1]] = "SOUTH";
        av.llllIIlIIlIl[av.llllIIlIIllI[2]] = "EAST";
        av.llllIIlIIlIl[av.llllIIlIIllI[3]] = "WEST";
    }

    private static boolean lIIIlllllIIIlII(int n2, int n3) {
        return n2 < n3;
    }
}

