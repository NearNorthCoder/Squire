/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum21
extends Enum<ao> {
    
    public static final  /* enum */ ao DRAGON_BONES;
    public final  int groundItemId;
    public final  int itemId;
    
    private static final  ao[] $VALUES;

    private static void lIIlIIlIlI() {
        lIlIIIII = new String[lIlIIIIl[3]];
        ao.lIlIIIII[ao.lIlIIIIl[0]] = "DRAGON_BONES";
    }

    static {
        ao.lIIlIIlIll();
        ao.lIIlIIlIlI();
        DRAGON_BONES = new GameEnum21(lIlIIIIl[1], lIlIIIIl[2]);
        ao[] aoArray = new ao[lIlIIIIl[3]];
        aoArray[ao.lIlIIIIl[0]] = DRAGON_BONES;
        $VALUES = aoArray;
    }

    public static ao[] values() {
        return (ao[])$VALUES.clone();
    }

    public static ao valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }

    private GameEnum21(int n3, int n4) {
        this.itemId = n3;
        this.groundItemId = n4;
    }

}

