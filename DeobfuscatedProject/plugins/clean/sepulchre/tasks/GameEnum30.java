/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class GameEnum30
extends Enum<m> {
    
    private static final  m[] $VALUES;
    public static final  /* enum */ m NORTH_BACK;

    private static void lIIIIlllllllIIl() {
        llIlllllllIl = new String[llIllllllllI[1]];
        m.llIlllllllIl[m.llIllllllllI[0]] = "NORTH_BACK";
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum30.class, string);
    }

    private static boolean lIIIIlllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    static {
        m.lIIIIlllllllIlI();
        m.lIIIIlllllllIIl();
        NORTH_BACK = new GameEnum30();
        m[] mArray = new m[llIllllllllI[1]];
        mArray[m.llIllllllllI[0]] = NORTH_BACK;
        $VALUES = mArray;
    }

        return String.valueOf(var1);
    }
}

