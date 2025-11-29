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

public final class GameEnum19
extends Enum<S> {
    public static  int EAST;
    public static  int NORTH;
    public static final  /* enum */ S TEMPLATE_EAST;
    public static final  /* enum */ S TEMPLATE_NORTH;
    public static  int SOUTH;
    public static final  /* enum */ S TEMPLATE_WEST;
    private static final  S[] $VALUES;
    
    public static final  /* enum */ S TEMPLATE_UNKNOWN;
    public static  int WEST;

    public static S valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

    static {
        S.llIllllIIllIlI();
        S.llIllllIIllIIl();
        TEMPLATE_WEST = new GameEnum19();
        TEMPLATE_NORTH = new GameEnum19();
        TEMPLATE_EAST = new GameEnum19();
        TEMPLATE_UNKNOWN = new GameEnum19();
        S[] sArray = new S[lIlIlIlIlllI[2]];
        sArray[S.lIlIlIlIlllI[3]] = TEMPLATE_WEST;
        sArray[S.lIlIlIlIlllI[4]] = TEMPLATE_NORTH;
        sArray[S.lIlIlIlIlllI[1]] = TEMPLATE_EAST;
        sArray[S.lIlIlIlIlllI[5]] = TEMPLATE_UNKNOWN;
        $VALUES = sArray;
        NORTH = lIlIlIlIlllI[3];
        EAST = lIlIlIlIlllI[4];
        SOUTH = lIlIlIlIlllI[1];
        WEST = lIlIlIlIlllI[5];
    }

    public static int d(char c2) {
        switch (c2) {
            case 'N': {
                return NORTH;
            }
            case 'S': {
                return SOUTH;
            }
            case 'E': {
                return EAST;
            }
            case 'W': {
                return WEST;
            }
        }
        return lIlIlIlIlllI[0];
    }

    private static boolean llIllllIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    public static S a(char c2, char c3) {
        int n2 = S.b(c2, c3);
        switch (n2) {
            case 1: {
                return TEMPLATE_WEST;
            }
            case 2: {
                return TEMPLATE_NORTH;
            }
            case 3: {
                return TEMPLATE_EAST;
            }
        }
        return TEMPLATE_UNKNOWN;
    }

    private static int b(char c2, char c3) {
        int n2 = S.e(c2);
        int n3 = S.d(c3);
        int n4 = (n3 - n2 + lIlIlIlIlllI[2]) % lIlIlIlIlllI[2];
        return n4;
    }

    public static int e(char c2) {
        return (S.d(c2) + lIlIlIlIlllI[1]) % lIlIlIlIlllI[2];
    }

    private static void llIllllIIllIIl() {
        lIlIlIlIllIl = new String[lIlIlIlIlllI[2]];
        S.lIlIlIlIllIl[S.lIlIlIlIlllI[3]] = "TEMPLATE_WEST";
        S.lIlIlIlIllIl[S.lIlIlIlIlllI[4]] = "TEMPLATE_NORTH";
        S.lIlIlIlIllIl[S.lIlIlIlIlllI[1]] = "TEMPLATE_EAST";
        S.lIlIlIlIllIl[S.lIlIlIlIlllI[5]] = "TEMPLATE_UNKNOWN";
    }

        return String.valueOf(var1);
    }

    public static S[] values() {
        return (S[])$VALUES.clone();
    }
}

