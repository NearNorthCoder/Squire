/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum36
extends Enum<I> {
    public static final  /* enum */ I ITEM;
    private static final  I[] $VALUES;
    public static final  /* enum */ I SPELL;

    public static final  /* enum */ I TAB;

    private static void lIIllllIlI() {
        lIllIIII = new String[lIllIIIl[3]];
        I.lIllIIII[I.lIllIIIl[0]] = "SPELL";
        I.lIllIIII[I.lIllIIIl[1]] = "ITEM";
        I.lIllIIII[I.lIllIIIl[2]] = "TAB";
    }

    public static I[] values() {
        return (I[])$VALUES.clone();
    }

    private static boolean lIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    public static I valueOf(String string) {
        return Enum.valueOf(GameEnum36.class, string);
    }

        return String.valueOf(llIllllIIlIIlII);
    }

    static {
        I.lIIllllIll();
        I.lIIllllIlI();
        SPELL = new GameEnum36();
        ITEM = new GameEnum36();
        TAB = new GameEnum36();
        I[] iArray = new I[lIllIIIl[3]];
        iArray[I.lIllIIIl[0]] = SPELL;
        iArray[I.lIllIIIl[1]] = ITEM;
        iArray[I.lIllIIIl[2]] = TAB;
        $VALUES = iArray;
    }
}

