/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum8
extends Enum<q> {
    private final  int weedAmount;
    private static final  q[] $VALUES;
    
    public static final  /* enum */ q SODA_ASH;
    private final  int bucketAmount;
    
    public static final  /* enum */ q NORMAL_SEAWEED;
    private final  int itemId;
    public static final  /* enum */ q GIANT_SEAWEED;

    private static boolean lIlIllllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    private GameEnum8(int n3, int n4, int n5) {
        this.itemId = n3;
        this.weedAmount = n4;
        this.bucketAmount = n5;
    }

        return String.valueOf(var1);
    }

    public int P() {
        return this.bucketAmount;
    }

    private static void lIlIllllIIllll() {
        lllIlIIIllI = new String[lllIlIIIlll[2]];
        q.lllIlIIIllI[q.lllIlIIIlll[0]] = "GIANT_SEAWEED";
        q.lllIlIIIllI[q.lllIlIIIlll[4]] = "NORMAL_SEAWEED";
        q.lllIlIIIllI[q.lllIlIIIlll[7]] = "SODA_ASH";
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    static {
        q.lIlIllllIlIIII();
        q.lIlIllllIIllll();
        GIANT_SEAWEED = new GameEnum8(lllIlIIIlll[1], lllIlIIIlll[2], lllIlIIIlll[3]);
        NORMAL_SEAWEED = new GameEnum8(lllIlIIIlll[5], lllIlIIIlll[6], lllIlIIIlll[6]);
        SODA_ASH = new GameEnum8(lllIlIIIlll[8], lllIlIIIlll[6], lllIlIIIlll[6]);
        q[] qArray = new q[lllIlIIIlll[2]];
        qArray[q.lllIlIIIlll[0]] = GIANT_SEAWEED;
        qArray[q.lllIlIIIlll[4]] = NORMAL_SEAWEED;
        qArray[q.lllIlIIIlll[7]] = SODA_ASH;
        $VALUES = qArray;
    }

    public int N() {
        return this.itemId;
    }

    public int O() {
        return this.weedAmount;
    }
}

