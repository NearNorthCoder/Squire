/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GHelper;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.I;
import gg.squire.cox.tasks.GameEnum19;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum30
extends Enum<H> {
     G west;
    public static final  /* enum */ H CRABS_SINGLE;
    public static final  /* enum */ H CRABS_DOUBLE_1;
    
    public static final  /* enum */ H CRABS_MOVABLE_3;
    
    public static final  /* enum */ H TEKTON_START;
     G east;
    public static final  /* enum */ H CRABS_MOVABLE_4;
    public static final  /* enum */ H CRABS_MOVABLE_1;
     G north;
    public static final  /* enum */ H MYSTICS_SAFESPOT;
    public static final  /* enum */ H CRABS_BASE_1;
    public static final  /* enum */ H CRABS_DOUBLE_2;
    public static final  /* enum */ H CRABS_BASE_2;
    public static final  /* enum */ H VESPULA_ATTACK_POINT;
    private static final  H[] $VALUES;
    public static final  /* enum */ H CRABS_MOVABLE_2;

    private static void llIlllIllllIll() {
        lIlIlIlIIllI = new String[lIlIlIlIIlll[23]];
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[0]] = "TEKTON_START";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[4]] = "CRABS_BASE_1";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[10]] = "CRABS_BASE_2";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[14]] = "CRABS_MOVABLE_1";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[16]] = "CRABS_MOVABLE_2";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[18]] = "CRABS_MOVABLE_3";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[20]] = "CRABS_MOVABLE_4";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[8]] = "CRABS_SINGLE";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[12]] = "CRABS_DOUBLE_1";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[6]] = "CRABS_DOUBLE_2";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[2]] = "MYSTICS_SAFESPOT";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[21]] = "VESPULA_ATTACK_POINT";
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    public G d(n n2) {
        S s2 = n2.bx;
        switch (I.cc[s2.ordinal()]) {
            case 1: {
                H var1;
                return var1.east;
            }
            case 2: {
                H var1;
                return var1.north;
            }
            case 3: {
                H var1;
                return var1.west;
            }
        }
        return this.east;
    }

    static {
        H.llIlllIlllllII();
        H.llIlllIllllIll();
        TEKTON_START = new GameEnum30(new GHelper(lIlIlIlIIlll[1], lIlIlIlIIlll[2]), new GHelper(lIlIlIlIIlll[3], lIlIlIlIIlll[1]), new GHelper(lIlIlIlIIlll[1], lIlIlIlIIlll[2]));
        CRABS_BASE_1 = new GameEnum30(new GHelper(lIlIlIlIIlll[5], lIlIlIlIIlll[6]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[8], lIlIlIlIIlll[9]));
        CRABS_BASE_2 = new GameEnum30(new GHelper(lIlIlIlIIlll[11], lIlIlIlIIlll[8]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[12], lIlIlIlIIlll[13]));
        CRABS_MOVABLE_1 = new GameEnum30(new GHelper(lIlIlIlIIlll[15], lIlIlIlIIlll[12]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[2], lIlIlIlIIlll[1]));
        CRABS_MOVABLE_2 = new GameEnum30(new GHelper(lIlIlIlIIlll[17], lIlIlIlIIlll[12]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[9], lIlIlIlIIlll[1]));
        CRABS_MOVABLE_3 = new GameEnum30(new GHelper(lIlIlIlIIlll[19], lIlIlIlIIlll[12]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]));
        CRABS_MOVABLE_4 = new GameEnum30(new GHelper(lIlIlIlIIlll[9], lIlIlIlIIlll[12]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]));
        CRABS_SINGLE = new GameEnum30(new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[21], lIlIlIlIIlll[9]));
        CRABS_DOUBLE_1 = new GameEnum30(new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[2], lIlIlIlIIlll[9]));
        CRABS_DOUBLE_2 = new GameEnum30(new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new GHelper(lIlIlIlIIlll[21], lIlIlIlIIlll[11]));
        MYSTICS_SAFESPOT = new GameEnum30(new GHelper(lIlIlIlIIlll[6], lIlIlIlIIlll[6]), new GHelper(lIlIlIlIIlll[15], lIlIlIlIIlll[15]), new GHelper(lIlIlIlIIlll[15], lIlIlIlIIlll[6]));
        VESPULA_ATTACK_POINT = new GameEnum30(new GHelper(lIlIlIlIIlll[22], lIlIlIlIIlll[23]), new GHelper(lIlIlIlIIlll[1], lIlIlIlIIlll[12]), new GHelper(lIlIlIlIIlll[19], lIlIlIlIIlll[23]));
        H[] hArray = new H[lIlIlIlIIlll[23]];
        hArray[H.lIlIlIlIIlll[0]] = TEKTON_START;
        hArray[H.lIlIlIlIIlll[4]] = CRABS_BASE_1;
        hArray[H.lIlIlIlIIlll[10]] = CRABS_BASE_2;
        hArray[H.lIlIlIlIIlll[14]] = CRABS_MOVABLE_1;
        hArray[H.lIlIlIlIIlll[16]] = CRABS_MOVABLE_2;
        hArray[H.lIlIlIlIIlll[18]] = CRABS_MOVABLE_3;
        hArray[H.lIlIlIlIIlll[20]] = CRABS_MOVABLE_4;
        hArray[H.lIlIlIlIIlll[8]] = CRABS_SINGLE;
        hArray[H.lIlIlIlIIlll[12]] = CRABS_DOUBLE_1;
        hArray[H.lIlIlIlIIlll[6]] = CRABS_DOUBLE_2;
        hArray[H.lIlIlIlIIlll[2]] = MYSTICS_SAFESPOT;
        hArray[H.lIlIlIlIIlll[21]] = VESPULA_ATTACK_POINT;
        $VALUES = hArray;
    }

    private static boolean llIlllIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }

    private GameEnum30(G g2, G g3, G g4) {
        this.west = g2;
        this.north = g3;
        this.east = g4;
    }

    public WorldPoint c(n n2) {
        char c2 = n2.bu;
        WorldPoint worldPoint = n2.bq;
        S s2 = n2.bx;
        return this.d(n2).c(c2, worldPoint);
    }

    public static H valueOf(String string) {
        return Enum.valueOf(GameEnum30.class, string);
    }
}

