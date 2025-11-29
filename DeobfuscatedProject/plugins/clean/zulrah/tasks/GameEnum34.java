/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zulrah.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum34
extends Enum<j> {
    public static final  /* enum */ j EAGLE_EYE;
    public static final  /* enum */ j RIGOUR;
    
    private final  Prayer prayer;
    private static final  j[] $VALUES;

        return String.valueOf(var1);
    }

    private static boolean llIIlIIIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIIIlIlll() {
        lIllIlIlIlllI = new String[lIllIlIllIIII[2]];
        j.lIllIlIlIlllI[j.lIllIlIllIIII[0]] = "EAGLE_EYE";
        j.lIllIlIlIlllI[j.lIllIlIllIIII[1]] = "RIGOUR";
    }

    private GameEnum34(Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        j.llIIlIIIIIllIlI();
        j.llIIlIIIIIlIlll();
        EAGLE_EYE = new GameEnum34(Prayer.EAGLE_EYE);
        RIGOUR = new GameEnum34(Prayer.RIGOUR);
        j[] jArray = new j[lIllIlIllIIII[2]];
        jArray[j.lIllIlIllIIII[0]] = EAGLE_EYE;
        jArray[j.lIllIlIllIIII[1]] = RIGOUR;
        $VALUES = jArray;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum34.class, string);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public Prayer r() {
        return this.prayer;
    }
}

