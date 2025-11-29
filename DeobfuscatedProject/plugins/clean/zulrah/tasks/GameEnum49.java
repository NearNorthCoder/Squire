/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zulrah.tasks;

import a.u.i.-.l.r.h.z.s.r.u.q.e.s;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum49
extends Enum<r> {
    private  int id;
    public static final  /* enum */ r MELEE;

    public static final  /* enum */ r JAD_RANGE_FIRST;
    private static final  r[] $VALUES;
    public static final  /* enum */ r RANGE;
    public static final  /* enum */ r JAD_MAGIC_FIRST;
    public static final  /* enum */ r MAGIC;

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    public Prayer M() {
        switch (s.r[this.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return Prayer.MYSTIC_MIGHT;
            }
            case 5: {
                return Prayer.EAGLE_EYE;
            }
        }
        return Prayer.MYSTIC_MIGHT;
    }

    static {
        r.llIIlIIIllIIIll();
        r.llIIlIIIlIlllll();
        RANGE = new GameEnum49(lIllIllIIlIII[1]);
        MELEE = new GameEnum49(lIllIllIIlIII[3]);
        MAGIC = new GameEnum49(lIllIllIIlIII[5]);
        JAD_MAGIC_FIRST = new GameEnum49(lIllIllIIlIII[1]);
        JAD_RANGE_FIRST = new GameEnum49(lIllIllIIlIII[1]);
        r[] rArray = new r[lIllIllIIlIII[8]];
        rArray[r.lIllIllIIlIII[0]] = RANGE;
        rArray[r.lIllIllIIlIII[2]] = MELEE;
        rArray[r.lIllIllIIlIII[4]] = MAGIC;
        rArray[r.lIllIllIIlIII[6]] = JAD_MAGIC_FIRST;
        rArray[r.lIllIllIIlIII[7]] = JAD_RANGE_FIRST;
        $VALUES = rArray;
    }

    private GameEnum49(int n3) {
        this.id = n3;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum49.class, string);
    }

        return String.valueOf(var1);
    }

    private static void llIIlIIIlIlllll() {
        lIllIllIIIlII = new String[lIllIllIIlIII[8]];
        r.lIllIllIIIlII[r.lIllIllIIlIII[0]] = "RANGE";
        r.lIllIllIIIlII[r.lIllIllIIlIII[2]] = "MELEE";
        r.lIllIllIIIlII[r.lIllIllIIlIII[4]] = "MAGIC";
        r.lIllIllIIIlII[r.lIllIllIIlIII[6]] = "JAD_MAGIC_FIRST";
        r.lIllIllIIIlII[r.lIllIllIIlIII[7]] = "JAD_RANGE_FIRST";
    }

    public int L() {
        return this.id;
    }

    public Prayer N() {
        switch (s.r[this.ordinal()]) {
            case 2: 
            case 5: {
                return Prayer.PROTECT_FROM_MAGIC;
            }
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }

    private static boolean llIIlIIIllIIlII(int n2, int n3) {
        return n2 < n3;
    }
}

