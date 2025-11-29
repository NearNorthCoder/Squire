/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.slayer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum7
extends Enum<a> {

    private final  WorldPoint worldPoint;
    private static final  a[] $VALUES;
    public static final  /* enum */ a KONAR;
    public static final  /* enum */ a NIEVE;
    public static final  /* enum */ a DURADEl;

        return String.valueOf(var1);
    }

    static {
        a.lIlllIlIlllllII();
        a.lIlllIlIllllIll();
        NIEVE = new GameEnum7(new WorldPoint(lIlIIlIlIIlIl[1], lIlIIlIlIIlIl[2], lIlIIlIlIIlIl[0]));
        DURADEl = new GameEnum7(new WorldPoint(lIlIIlIlIIlIl[4], lIlIIlIlIIlIl[5], lIlIIlIlIIlIl[3]));
        KONAR = new GameEnum7(new WorldPoint(lIlIIlIlIIlIl[7], lIlIIlIlIIlIl[8], lIlIIlIlIIlIl[0]));
        a[] aArray = new a[lIlIIlIlIIlIl[9]];
        aArray[a.lIlIIlIlIIlIl[0]] = NIEVE;
        aArray[a.lIlIIlIlIIlIl[3]] = DURADEl;
        aArray[a.lIlIIlIlIIlIl[6]] = KONAR;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    private static void lIlllIlIllllIll() {
        lIlIIlIlIIlII = new String[lIlIIlIlIIlIl[9]];
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[0]] = "NIEVE";
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[3]] = "DURADEl";
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[6]] = "KONAR";
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public WorldPoint k() {
        return this.worldPoint;
    }

    private static boolean lIlllIlIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum7(WorldPoint worldPoint) {
        this.worldPoint = worldPoint;
    }
}

