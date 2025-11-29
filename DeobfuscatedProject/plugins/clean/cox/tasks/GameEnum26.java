/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.Q;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum26
extends Enum<P> {
    private static final  P[] $VALUES;
    private final  String name;
    public static final  /* enum */ P EMPTY;
    
    public static final  /* enum */ P PUZZLE;
    private final  char code;
    public static final  /* enum */ P START;
    public static final  /* enum */ P FARMING;
    public static final  /* enum */ P COMBAT;
    
    public static final  /* enum */ P END;
    public static final  /* enum */ P SCAVENGERS;

    static {
        P.llIllIIlIIIIIl();
        P.llIllIIlIIIIII();
        START = new GameEnum26(lIlIIlIIllll[lIlIIlIlIIII[1]], lIlIIlIlIIII[2]);
        END = new GameEnum26(lIlIIlIIllll[lIlIIlIlIIII[4]], lIlIIlIlIIII[5]);
        SCAVENGERS = new GameEnum26(lIlIIlIIllll[lIlIIlIlIIII[7]], lIlIIlIlIIII[8]);
        FARMING = new GameEnum26(lIlIIlIIllll[lIlIIlIlIIII[10]], lIlIIlIlIIII[11]);
        EMPTY = new GameEnum26(lIlIIlIIllll[lIlIIlIlIIII[13]], lIlIIlIlIIII[14]);
        COMBAT = new GameEnum26(lIlIIlIIllll[lIlIIlIlIIII[16]], lIlIIlIlIIII[17]);
        PUZZLE = new GameEnum26(lIlIIlIIllll[lIlIIlIlIIII[19]], lIlIIlIlIIII[20]);
        P[] pArray = new P[lIlIIlIlIIII[10]];
        pArray[P.lIlIIlIlIIII[0]] = START;
        pArray[P.lIlIIlIlIIII[1]] = END;
        pArray[P.lIlIIlIlIIII[3]] = SCAVENGERS;
        pArray[P.lIlIIlIlIIII[4]] = FARMING;
        pArray[P.lIlIIlIlIIII[6]] = EMPTY;
        pArray[P.lIlIIlIlIIII[7]] = COMBAT;
        pArray[P.lIlIIlIlIIII[9]] = PUZZLE;
        $VALUES = pArray;
    }

    public N ce() {
        switch (Q.cm[this.ordinal()]) {
            case 1: {
                return N.START;
            }
            case 2: {
                return N.END;
            }
            case 3: {
                return N.SCAVENGERS;
            }
            case 4: {
                return N.FARMING;
            }
            case 5: {
                return N.UNKNOWN_COMBAT;
            }
            case 6: {
                return N.UNKNOWN_PUZZLE;
            }
        }
        return N.EMPTY;
    }

        return String.valueOf(var1);
    }

    private static boolean llIllIIlIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIllIIlIIIIII() {
        lIlIIlIIllll = new String[lIlIIlIlIIII[21]];
        P.lIlIIlIIllll[P.lIlIIlIlIIII[0]] = "START";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[1]] = "Start";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[3]] = "END";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[4]] = "End";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[6]] = "SCAVENGERS";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[7]] = "Scavengers";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[9]] = "FARMING";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[10]] = "Farming";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[12]] = "EMPTY";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[13]] = "Empty";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[15]] = "COMBAT";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[16]] = "Combat";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[18]] = "PUZZLE";
        P.lIlIIlIIllll[P.lIlIIlIlIIII[19]] = "Puzzle";
    }

    /*
     * WARNING - void declaration
     */
    public static P c(char c2) {
        void var2;
        P[] pArray = P.values();
        int n2 = pArray.length;
        int var3 = lIlIIlIlIIII[0];
        while (P.llIllIIlIIIIlI(var3, (int)var2)) {
            char var4;
            void var5;
            void var6 = var5[var3];
            if (P.llIllIIlIIIIll(var6.cf(), var4)) {
                return var6;
            }
            ++var3;

            if (((0x1A ^ 0x46 ^ (0xDC ^ 0x92)) & (0xF8 ^ 0xC4 ^ (0xAE ^ 0x80) ^ -1)) == (1 & (1 ^ -1))) continue;
            return null;
        }
        return EMPTY;
    }

    public static P valueOf(String string) {
        return Enum.valueOf(GameEnum26.class, string);
    }

    public char cf() {
        return this.code;
    }

    public String bX() {
        return this.name;
    }

    private GameEnum26(String string2, char c2) {
        this.name = string2;
        this.code = c2;
    }

    private static boolean llIllIIlIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    public static P[] values() {
        return (P[])$VALUES.clone();
    }

}

