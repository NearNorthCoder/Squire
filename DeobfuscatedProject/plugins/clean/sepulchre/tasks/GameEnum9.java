/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class GameEnum9
extends Enum<o> {

    public static final  /* enum */ o SOUTH;
    private static final  o[] $VALUES;

    private static boolean lIIIlIIlIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.lIIIlIIlIIIllll();
        o.lIIIlIIlIIIlllI();
        SOUTH = new GameEnum9();
        o[] oArray = new o[lllIIIlIlIII[1]];
        oArray[o.lllIIIlIlIII[0]] = SOUTH;
        $VALUES = oArray;
    }

    private static void lIIIlIIlIIIlllI() {
        lllIIIlIIlll = new String[lllIIIlIlIII[1]];
        o.lllIIIlIIlll[o.lllIIIlIlIII[0]] = "SOUTH";
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }
}

