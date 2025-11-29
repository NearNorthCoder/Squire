/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.LocalPoint
 */
package gg.squire.mta.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.LocalPoint;

public final class GameEnum13
extends Enum<m> {
    
    public static final  /* enum */ m MAZE_7;
    public static final  /* enum */ m MAZE_4;
    public static final  /* enum */ m MAZE_1;
    public static final  /* enum */ m MAZE_6;
    private final  int walls;
    public static final  /* enum */ m MAZE_2;
    private static final  m[] $VALUES;
    
    public static final  /* enum */ m MAZE_5;
    public static final  /* enum */ m MAZE_9;
    public static final  /* enum */ m MAZE_3;
    public static final  /* enum */ m MAZE_10;
    public static final  /* enum */ m MAZE_8;
    private final  LocalPoint start;

    /*
     * WARNING - void declaration
     */
    public static m b(int n2) {
        void var1;
        m[] mArray = m.values();
        int n3 = mArray.length;
        int var2 = lllIlIIllllI[0];
        while (m.lIIIlIllllIIIlI(var2, (int)var1)) {
            int var3;
            void var4;
            void var5 = var4[var2];
            if (m.lIIIlIllllIIIll(var5.C(), var3)) {
                return var5;
            }
            ++var2;

            if (3 > 2) continue;
            return null;
        }
        return null;
    }

    private GameEnum13(int n3, LocalPoint localPoint) {
        this.walls = n3;
        this.start = localPoint;
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    private static boolean lIIIlIllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    public LocalPoint D() {
        return this.start;
    }

    static {
        m.lIIIlIllllIIIIl();
        m.lIIIlIllllIIIII();
        MAZE_1 = new GameEnum13(lllIlIIllllI[1], new LocalPoint(lllIlIIllllI[2], lllIlIIllllI[3]));
        MAZE_2 = new GameEnum13(lllIlIIllllI[5], new LocalPoint(lllIlIIllllI[6], lllIlIIllllI[2]));
        MAZE_3 = new GameEnum13(lllIlIIllllI[8], new LocalPoint(lllIlIIllllI[9], lllIlIIllllI[10]));
        MAZE_4 = new GameEnum13(lllIlIIllllI[12], new LocalPoint(lllIlIIllllI[13], lllIlIIllllI[6]));
        MAZE_5 = new GameEnum13(lllIlIIllllI[15], new LocalPoint(lllIlIIllllI[16], lllIlIIllllI[17]));
        MAZE_6 = new GameEnum13(lllIlIIllllI[19], new LocalPoint(lllIlIIllllI[20], lllIlIIllllI[21]));
        MAZE_7 = new GameEnum13(lllIlIIllllI[23], new LocalPoint(lllIlIIllllI[24], lllIlIIllllI[25]));
        MAZE_8 = new GameEnum13(lllIlIIllllI[27], new LocalPoint(lllIlIIllllI[28], lllIlIIllllI[29]));
        MAZE_9 = new GameEnum13(lllIlIIllllI[31], new LocalPoint(lllIlIIllllI[17], lllIlIIllllI[13]));
        MAZE_10 = new GameEnum13(lllIlIIllllI[33], new LocalPoint(lllIlIIllllI[21], lllIlIIllllI[34]));
        m[] mArray = new m[lllIlIIllllI[35]];
        mArray[m.lllIlIIllllI[0]] = MAZE_1;
        mArray[m.lllIlIIllllI[4]] = MAZE_2;
        mArray[m.lllIlIIllllI[7]] = MAZE_3;
        mArray[m.lllIlIIllllI[11]] = MAZE_4;
        mArray[m.lllIlIIllllI[14]] = MAZE_5;
        mArray[m.lllIlIIllllI[18]] = MAZE_6;
        mArray[m.lllIlIIllllI[22]] = MAZE_7;
        mArray[m.lllIlIIllllI[26]] = MAZE_8;
        mArray[m.lllIlIIllllI[30]] = MAZE_9;
        mArray[m.lllIlIIllllI[32]] = MAZE_10;
        $VALUES = mArray;
    }

    public int C() {
        return this.walls;
    }

        return String.valueOf(var6);
    }

    private static void lIIIlIllllIIIII() {
        lllIlIIlllIl = new String[lllIlIIllllI[35]];
        m.lllIlIIlllIl[m.lllIlIIllllI[0]] = "MAZE_1";
        m.lllIlIIlllIl[m.lllIlIIllllI[4]] = "MAZE_2";
        m.lllIlIIlllIl[m.lllIlIIllllI[7]] = "MAZE_3";
        m.lllIlIIlllIl[m.lllIlIIllllI[11]] = "MAZE_4";
        m.lllIlIIlllIl[m.lllIlIIllllI[14]] = "MAZE_5";
        m.lllIlIIlllIl[m.lllIlIIllllI[18]] = "MAZE_6";
        m.lllIlIIlllIl[m.lllIlIIllllI[22]] = "MAZE_7";
        m.lllIlIIlllIl[m.lllIlIIllllI[26]] = "MAZE_8";
        m.lllIlIIlllIl[m.lllIlIIllllI[30]] = "MAZE_9";
        m.lllIlIIlllIl[m.lllIlIIllllI[32]] = "MAZE_10";
    }

    private static boolean lIIIlIllllIIIll(int n2, int n3) {
        return n2 == n3;
    }
}

