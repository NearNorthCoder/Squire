/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum9
extends Enum<g> {

    public static final  /* enum */ g FULL;
    private static final  g[] $VALUES;
    public static final  /* enum */ g TRANSITION;
    public static final  /* enum */ g OPEN;
    public static final  /* enum */ g EMPTY;

    private static boolean lIIIllIlllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        g.lIIIllIlllIIIlI();
        g.lIIIllIlllIIIII();
        OPEN = new GameEnum9();
        EMPTY = new GameEnum9();
        FULL = new GameEnum9();
        TRANSITION = new GameEnum9();
        g[] gArray = new g[lllIlllIlIIl[4]];
        gArray[g.lllIlllIlIIl[0]] = OPEN;
        gArray[g.lllIlllIlIIl[1]] = EMPTY;
        gArray[g.lllIlllIlIIl[2]] = FULL;
        gArray[g.lllIlllIlIIl[3]] = TRANSITION;
        $VALUES = gArray;
    }

        return String.valueOf(var1);
    }

    private static void lIIIllIlllIIIII() {
        lllIlllIIlIl = new String[lllIlllIlIIl[4]];
        g.lllIlllIIlIl[g.lllIlllIlIIl[0]] = "OPEN";
        g.lllIlllIIlIl[g.lllIlllIlIIl[1]] = "EMPTY";
        g.lllIlllIIlIl[g.lllIlllIlIIl[2]] = "FULL";
        g.lllIlllIIlIl[g.lllIlllIlIIl[3]] = "TRANSITION";
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }
}

