/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum18
extends Enum<q> {
    
    private static final  q[] $VALUES;
    private final  int quantity;
    public static final  /* enum */ q CHARTER_SHIP;
    public static final  /* enum */ q ZUL_ANDRA_TELEPORT;
    
    private final  int[] items;
    public static final  /* enum */ q FAIRY_RING;

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private static boolean llIIlIIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIIlIlIll() {
        lIllIlIllIlII = new String[lIllIlIllIlIl[8]];
        q.lIllIlIllIlII[q.lIllIlIllIlIl[0]] = "ZUL_ANDRA_TELEPORT";
        q.lIllIlIllIlII[q.lIllIlIllIlIl[1]] = "FAIRY_RING";
        q.lIllIlIllIlII[q.lIllIlIllIlIl[3]] = "CHARTER_SHIP";
    }

    public int[] K() {
        return this.items;
    }

    static {
        q.llIIlIIIIlIllII();
        q.llIIlIIIIlIlIll();
        int[] nArray = new int[lIllIlIllIlIl[1]];
        nArray[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[2];
        ZUL_ANDRA_TELEPORT = new GameEnum18(lIllIlIllIlIl[1], nArray);
        int[] nArray2 = new int[lIllIlIllIlIl[3]];
        nArray2[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[4];
        nArray2[q.lIllIlIllIlIl[1]] = lIllIlIllIlIl[5];
        FAIRY_RING = new GameEnum18(lIllIlIllIlIl[1], nArray2);
        int[] nArray3 = new int[lIllIlIllIlIl[1]];
        nArray3[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[7];
        CHARTER_SHIP = new GameEnum18(lIllIlIllIlIl[6], nArray3);
        q[] qArray = new q[lIllIlIllIlIl[8]];
        qArray[q.lIllIlIllIlIl[0]] = ZUL_ANDRA_TELEPORT;
        qArray[q.lIllIlIllIlIl[1]] = FAIRY_RING;
        qArray[q.lIllIlIllIlIl[3]] = CHARTER_SHIP;
        $VALUES = qArray;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

    private GameEnum18(int n3, int ... nArray) {
        this.quantity = n3;
        this.items = nArray;
    }

    public int J() {
        return this.quantity;
    }

        return String.valueOf(var1);
    }
}

