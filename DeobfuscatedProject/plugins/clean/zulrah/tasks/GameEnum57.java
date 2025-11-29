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

public final class GameEnum57
extends Enum<p> {
    public static final  /* enum */ p WEST;
    
    public static final  /* enum */ p EAST;
    public static final  /* enum */ p SOUTH;
    private final  int y;
    
    private final  int x;
    public static final  /* enum */ p CENTER;
    private static final  p[] $VALUES;

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private GameEnum57(int n3, int n4) {
        this.x = n3;
        this.y = n4;
    }

    private static boolean llIIIllllIlIlll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    static {
        p.llIIIllllIlIlIl();
        p.llIIIllllIlIlII();
        EAST = new GameEnum57(lIllIlIIlIlIl[1], lIllIlIIlIlIl[2]);
        WEST = new GameEnum57(lIllIlIIlIlIl[4], lIllIlIIlIlIl[2]);
        CENTER = new GameEnum57(lIllIlIIlIlIl[0], lIllIlIIlIlIl[6]);
        SOUTH = new GameEnum57(lIllIlIIlIlIl[0], lIllIlIIlIlIl[8]);
        p[] pArray = new p[lIllIlIIlIlIl[9]];
        pArray[p.lIllIlIIlIlIl[0]] = EAST;
        pArray[p.lIllIlIIlIlIl[3]] = WEST;
        pArray[p.lIllIlIIlIlIl[5]] = CENTER;
        pArray[p.lIllIlIIlIlIl[7]] = SOUTH;
        $VALUES = pArray;
    }

    public int H() {
        return this.y;
    }

    private static void llIIIllllIlIlII() {
        lIllIlIIlIlII = new String[lIllIlIIlIlIl[9]];
        p.lIllIlIIlIlII[p.lIllIlIIlIlIl[0]] = "EAST";
        p.lIllIlIIlIlII[p.lIllIlIIlIlIl[3]] = "WEST";
        p.lIllIlIIlIlII[p.lIllIlIIlIlIl[5]] = "CENTER";
        p.lIllIlIIlIlII[p.lIllIlIIlIlIl[7]] = "SOUTH";
    }

    public int G() {
        return this.x;
    }

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum57.class, string);
    }

}

