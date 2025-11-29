/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class GameEnum26
extends Enum<L> {
    public static final  /* enum */ L WALK;

    private static final  L[] $VALUES;

    private static boolean lIIIlIlIIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        L.lIIIlIlIIIIlIll();
        L.lIIIlIlIIIIlIlI();
        WALK = new GameEnum26();
        L[] lArray = new L[lllIIlIlIIIl[1]];
        lArray[L.lllIIlIlIIIl[0]] = WALK;
        $VALUES = lArray;
    }

    public static L[] values() {
        return (L[])$VALUES.clone();
    }

    private static void lIIIlIlIIIIlIlI() {
        lllIIlIlIIII = new String[lllIIlIlIIIl[1]];
        L.lllIIlIlIIII[L.lllIIlIlIIIl[0]] = "WALK";
    }

        return String.valueOf(var1);
    }

    public static L valueOf(String string) {
        return Enum.valueOf(GameEnum26.class, string);
    }
}

