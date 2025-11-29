/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum68
extends Enum<A> {
    public static final  /* enum */ A UNKNOWN;
    
    public static final  /* enum */ A ACID;
    public static final  /* enum */ A CRYSTAL;
    
    public static final  /* enum */ A FLAME;
    private static final  A[] $VALUES;

    static {
        A.llIllllIllllII();
        A.llIllllIlllIll();
        FLAME = new GameEnum68();
        ACID = new GameEnum68();
        CRYSTAL = new GameEnum68();
        UNKNOWN = new GameEnum68();
        A[] aArray = new A[lIlIlIllIlll[4]];
        aArray[A.lIlIlIllIlll[0]] = FLAME;
        aArray[A.lIlIlIllIlll[1]] = ACID;
        aArray[A.lIlIlIllIlll[2]] = CRYSTAL;
        aArray[A.lIlIlIllIlll[3]] = UNKNOWN;
        $VALUES = aArray;
    }

    private static boolean llIllllIllllIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static void llIllllIlllIll() {
        lIlIlIllIllI = new String[lIlIlIllIlll[4]];
        A.lIlIlIllIllI[A.lIlIlIllIlll[0]] = "FLAME";
        A.lIlIlIllIllI[A.lIlIlIllIlll[1]] = "ACID";
        A.lIlIlIllIllI[A.lIlIlIllIlll[2]] = "CRYSTAL";
        A.lIlIlIllIllI[A.lIlIlIllIlll[3]] = "UNKNOWN";
    }

    public static A valueOf(String string) {
        return Enum.valueOf(GameEnum68.class, string);
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }
}

