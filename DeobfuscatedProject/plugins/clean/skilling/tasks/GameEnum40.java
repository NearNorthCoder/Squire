/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum40
extends Enum<p> {
    public static final  /* enum */ p REDWOOD;
    public static final  /* enum */ p MAGIC;
    public static final  /* enum */ p MAPLE;
    private static final  p[] $VALUES;
    private final  int logId;

    public static final  /* enum */ p WILLOW;
    public static final  /* enum */ p NORMAL;
    public static final  /* enum */ p OAK;
    public static final  /* enum */ p YEW;

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum40.class, string);
    }

    static {
        p.lIlIllllIllIII();
        p.lIlIllIlllIIlI();
        NORMAL = new GameEnum40(lllIlIIlIlI[1]);
        OAK = new GameEnum40(lllIlIIlIlI[3]);
        WILLOW = new GameEnum40(lllIlIIlIlI[5]);
        MAPLE = new GameEnum40(lllIlIIlIlI[7]);
        YEW = new GameEnum40(lllIlIIlIlI[9]);
        MAGIC = new GameEnum40(lllIlIIlIlI[11]);
        REDWOOD = new GameEnum40(lllIlIIlIlI[13]);
        p[] pArray = new p[lllIlIIlIlI[14]];
        pArray[p.lllIlIIlIlI[0]] = NORMAL;
        pArray[p.lllIlIIlIlI[2]] = OAK;
        pArray[p.lllIlIIlIlI[4]] = WILLOW;
        pArray[p.lllIlIIlIlI[6]] = MAPLE;
        pArray[p.lllIlIIlIlI[8]] = YEW;
        pArray[p.lllIlIIlIlI[10]] = MAGIC;
        pArray[p.lllIlIIlIlI[12]] = REDWOOD;
        $VALUES = pArray;
    }

    public int M() {
        return this.logId;
    }

    private static void lIlIllIlllIIlI() {
        lllIIlIIIlI = new String[lllIlIIlIlI[14]];
        p.lllIIlIIIlI[p.lllIlIIlIlI[0]] = "NORMAL";
        p.lllIIlIIIlI[p.lllIlIIlIlI[2]] = "OAK";
        p.lllIIlIIIlI[p.lllIlIIlIlI[4]] = "WILLOW";
        p.lllIIlIIIlI[p.lllIlIIlIlI[6]] = "MAPLE";
        p.lllIIlIIIlI[p.lllIlIIlIlI[8]] = "YEW";
        p.lllIIlIIIlI[p.lllIlIIlIlI[10]] = "MAGIC";
        p.lllIIlIIIlI[p.lllIlIIlIlI[12]] = "REDWOOD";
    }

        return String.valueOf(var1);
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private GameEnum40(int n3) {
        this.logId = n3;
    }

    private static boolean lIlIllllIllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

