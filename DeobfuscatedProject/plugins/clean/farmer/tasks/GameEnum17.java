/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum17
extends Enum<B> {
    private static final  B[] $VALUES;
    public static final  /* enum */ B EMPTY;
    public static final  /* enum */ B COMPLETED;
    
    public static final  /* enum */ B IN_PROGRESS;
    public static final  /* enum */ B OCCUPIED;
    public static final  /* enum */ B UNKNOWN;

    private static void llllIIIIlIIllI() {
        lIllllllllII = new String[lIlllllllllI[5]];
        B.lIllllllllII[B.lIlllllllllI[0]] = "COMPLETED";
        B.lIllllllllII[B.lIlllllllllI[1]] = "IN_PROGRESS";
        B.lIllllllllII[B.lIlllllllllI[2]] = "OCCUPIED";
        B.lIllllllllII[B.lIlllllllllI[3]] = "EMPTY";
        B.lIllllllllII[B.lIlllllllllI[4]] = "UNKNOWN";
    }

    public static B[] values() {
        return (B[])$VALUES.clone();
    }

    static {
        B.llllIIIIlIlIll();
        B.llllIIIIlIIllI();
        COMPLETED = new GameEnum17();
        IN_PROGRESS = new GameEnum17();
        OCCUPIED = new GameEnum17();
        EMPTY = new GameEnum17();
        UNKNOWN = new GameEnum17();
        B[] bArray = new B[lIlllllllllI[5]];
        bArray[B.lIlllllllllI[0]] = COMPLETED;
        bArray[B.lIlllllllllI[1]] = IN_PROGRESS;
        bArray[B.lIlllllllllI[2]] = OCCUPIED;
        bArray[B.lIlllllllllI[3]] = EMPTY;
        bArray[B.lIlllllllllI[4]] = UNKNOWN;
        $VALUES = bArray;
    }

    public static B valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

        return String.valueOf(var1);
    }

    private static boolean llllIIIIlIllII(int n2, int n3) {
        return n2 < n3;
    }
}

