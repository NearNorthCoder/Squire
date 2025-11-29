/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum118
extends Enum<bi> {
    private static final  bi[] $VALUES;
    
    public static final  /* enum */ bi SWARM;
    public static final  /* enum */ bi ATTACK;
    public static final  /* enum */ bi MAGE;

    private static boolean lIIlllIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static bi[] values() {
        return (bi[])$VALUES.clone();
    }

    static {
        bi.lIIlllIlIlIIIl();
        bi.lIIlllIlIIIlIl();
        ATTACK = new GameEnum118();
        SWARM = new GameEnum118();
        MAGE = new GameEnum118();
        bi[] biArray = new bi[llIIIIlIlII[3]];
        biArray[bi.llIIIIlIlII[0]] = ATTACK;
        biArray[bi.llIIIIlIlII[1]] = SWARM;
        biArray[bi.llIIIIlIlII[2]] = MAGE;
        $VALUES = biArray;
    }

        return String.valueOf(var1);
    }

    private static void lIIlllIlIIIlIl() {
        llIIIIIllll = new String[llIIIIlIlII[3]];
        bi.llIIIIIllll[bi.llIIIIlIlII[0]] = "ATTACK";
        bi.llIIIIIllll[bi.llIIIIlIlII[1]] = "SWARM";
        bi.llIIIIIllll[bi.llIIIIlIlII[2]] = "MAGE";
    }

    public static bi valueOf(String string) {
        return Enum.valueOf(GameEnum118.class, string);
    }
}

