/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum9
extends Enum<t> {
    public static final  /* enum */ t NONE;
    private static final  t[] $VALUES;

    public static final  /* enum */ t GOBLIN_PAINT_CANNON;
    public static final  /* enum */ t HAM_JOINT;
    private final  int itemID;

    public int bH() {
        return this.itemID;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private GameEnum9(int n3) {
        this.itemID = n3;
    }

    private static void lIIIllllllIlIIl() {
        llllIIlIllll = new String[llllIIllIIIl[6]];
        t.llllIIlIllll[t.llllIIllIIIl[0]] = "GOBLIN_PAINT_CANNON";
        t.llllIIlIllll[t.llllIIllIIIl[2]] = "HAM_JOINT";
        t.llllIIlIllll[t.llllIIllIIIl[4]] = "NONE";
    }

    static {
        t.lIIIllllllIllII();
        t.lIIIllllllIlIIl();
        GOBLIN_PAINT_CANNON = new GameEnum9(llllIIllIIIl[1]);
        HAM_JOINT = new GameEnum9(llllIIllIIIl[3]);
        NONE = new GameEnum9(llllIIllIIIl[5]);
        t[] tArray = new t[llllIIllIIIl[6]];
        tArray[t.llllIIllIIIl[0]] = GOBLIN_PAINT_CANNON;
        tArray[t.llllIIllIIIl[2]] = HAM_JOINT;
        tArray[t.llllIIllIIIl[4]] = NONE;
        $VALUES = tArray;
    }
}

