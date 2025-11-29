/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hydra.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum18
extends Enum<l> {
    
    public static final  /* enum */ l DONE;
    public static final  /* enum */ l MOVING;
    private static final  l[] $VALUES;
    
    public static final  /* enum */ l WAITING;

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    static {
        l.lIIIlllllIIllII();
        l.lIIIllllIllllIl();
        WAITING = new GameEnum18();
        MOVING = new GameEnum18();
        DONE = new GameEnum18();
        l[] lArray = new l[llllIIlIIlII[3]];
        lArray[l.llllIIlIIlII[0]] = WAITING;
        lArray[l.llllIIlIIlII[1]] = MOVING;
        lArray[l.llllIIlIIlII[2]] = DONE;
        $VALUES = lArray;
    }

    private static boolean lIIIlllllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

        return String.valueOf(var1);
    }

    private static void lIIIllllIllllIl() {
        llllIIlIIIII = new String[llllIIlIIlII[3]];
        l.llllIIlIIIII[l.llllIIlIIlII[0]] = "WAITING";
        l.llllIIlIIIII[l.llllIIlIIlII[1]] = "MOVING";
        l.llllIIlIIIII[l.llllIIlIIlII[2]] = "DONE";
    }

}

