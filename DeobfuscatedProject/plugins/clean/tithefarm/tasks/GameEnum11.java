/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.tithefarm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum11
extends Enum<a> {
    public static final  /* enum */ a HERB_BOX;
    public static final  /* enum */ a SEED_PACK;
    public static final  /* enum */ a NONE;
    
    private static final  a[] $VALUES;

        return String.valueOf(var1);
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    static {
        a.lIllIllIlIIllIl();
        a.lIllIllIlIIllII();
        NONE = new GameEnum11();
        HERB_BOX = new GameEnum11();
        SEED_PACK = new GameEnum11();
        a[] aArray = new a[lIlIIIIIIIlll[3]];
        aArray[a.lIlIIIIIIIlll[0]] = NONE;
        aArray[a.lIlIIIIIIIlll[1]] = HERB_BOX;
        aArray[a.lIlIIIIIIIlll[2]] = SEED_PACK;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    private static boolean lIllIllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIIllII() {
        lIlIIIIIIIllI = new String[lIlIIIIIIIlll[3]];
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[0]] = "NONE";
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[1]] = "HERB_BOX";
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[2]] = "SEED_PACK";
    }

}

