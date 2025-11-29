/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<n> {
    
    public static final  /* enum */ n EAST;
    public static final  /* enum */ n NORTH_WEST;
    private final  int x;
    public static final  /* enum */ n WEST;
    public static final  /* enum */ n CENTER_WEST;
    private final  int y;
    public static final  /* enum */ n NORTH_EAST;
    public static final  /* enum */ n CENTER;
    
    private static final  n[] $VALUES;
    public static final  /* enum */ n CENTER_EAST;

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    static {
        n.llIIIllllllIlIl();
        n.llIIIllllllIlII();
        NORTH_EAST = new GameEnum(lIllIlIlIIIll[1], lIllIlIlIIIll[2]);
        NORTH_WEST = new GameEnum(lIllIlIlIIIll[4], lIllIlIlIIIll[5]);
        WEST = new GameEnum(lIllIlIlIIIll[4], lIllIlIlIIIll[7]);
        EAST = new GameEnum(lIllIlIlIIIll[7], lIllIlIlIIIll[7]);
        CENTER_WEST = new GameEnum(lIllIlIlIIIll[4], lIllIlIlIIIll[3]);
        CENTER_EAST = new GameEnum(lIllIlIlIIIll[7], lIllIlIlIIIll[3]);
        CENTER = new GameEnum(lIllIlIlIIIll[0], lIllIlIlIIIll[0]);
        n[] nArray = new n[lIllIlIlIIIll[10]];
        nArray[n.lIllIlIlIIIll[0]] = NORTH_EAST;
        nArray[n.lIllIlIlIIIll[3]] = NORTH_WEST;
        nArray[n.lIllIlIlIIIll[6]] = WEST;
        nArray[n.lIllIlIlIIIll[8]] = EAST;
        nArray[n.lIllIlIlIIIll[7]] = CENTER_WEST;
        nArray[n.lIllIlIlIIIll[9]] = CENTER_EAST;
        nArray[n.lIllIlIlIIIll[1]] = CENTER;
        $VALUES = nArray;
    }

    public int H() {
        return this.y;
    }

        return String.valueOf(var1);
    }

    private GameEnum(int n3, int n4) {
        this.x = n3;
        this.y = n4;
    }

    public int G() {
        return this.x;
    }

    private static void llIIIllllllIlII() {
        lIllIlIlIIIlI = new String[lIllIlIlIIIll[10]];
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[0]] = "NORTH_EAST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[3]] = "NORTH_WEST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[6]] = "WEST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[8]] = "EAST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[7]] = "CENTER_WEST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[9]] = "CENTER_EAST";
        n.lIllIlIlIIIlI[n.lIllIlIlIIIll[1]] = "CENTER";
    }

    private static boolean llIIIllllllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

