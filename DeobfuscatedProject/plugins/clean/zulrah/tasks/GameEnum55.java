/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum55
extends Enum<f> {
    private final  int itemID;
    
    public static final  /* enum */ f SHARK;
    public static final  /* enum */ f ANGLER_FISH;
    public static final  /* enum */ f MANTA_RAY;
    private static final  f[] $VALUES;
    public static final  /* enum */ f KARAMBWAN;
    public static final  /* enum */ f MONKFISH;

    private GameEnum55(int n3) {
        this.itemID = n3;
    }

    private static boolean llIIIlllIllllIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static void llIIIlllIlllIII() {
        lIllIlIIIIlll = new String[lIllIlIIIlIll[10]];
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[0]] = "MANTA_RAY";
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[2]] = "SHARK";
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[4]] = "KARAMBWAN";
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[6]] = "ANGLER_FISH";
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[8]] = "MONKFISH";
    }

    static {
        f.llIIIlllIllllII();
        f.llIIIlllIlllIII();
        MANTA_RAY = new GameEnum55(lIllIlIIIlIll[1]);
        SHARK = new GameEnum55(lIllIlIIIlIll[3]);
        KARAMBWAN = new GameEnum55(lIllIlIIIlIll[5]);
        ANGLER_FISH = new GameEnum55(lIllIlIIIlIll[7]);
        MONKFISH = new GameEnum55(lIllIlIIIlIll[9]);
        f[] fArray = new f[lIllIlIIIlIll[10]];
        fArray[f.lIllIlIIIlIll[0]] = MANTA_RAY;
        fArray[f.lIllIlIIIlIll[2]] = SHARK;
        fArray[f.lIllIlIIIlIll[4]] = KARAMBWAN;
        fArray[f.lIllIlIIIlIll[6]] = ANGLER_FISH;
        fArray[f.lIllIlIIIlIll[8]] = MONKFISH;
        $VALUES = fArray;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum55.class, string);
    }

    public int q() {
        return this.itemID;
    }
}

