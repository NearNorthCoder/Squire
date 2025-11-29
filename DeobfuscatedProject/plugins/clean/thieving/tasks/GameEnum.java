/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.thieving.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<b> {
    public static final  /* enum */ b PICKPOCKETING;
    public static final  /* enum */ b CHESTS;
    public static final  /* enum */ b BLACK_JACK;

    public static final  /* enum */ b STALLS;
    private static final  b[] $VALUES;
    public static final  /* enum */ b ROGUES_DEN;

    private static boolean lIllIIIlllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public String toString() {
        String string = super.toString();
        char c2 = string.charAt(lIIllIlllIlII[0]);
        return c2 + string.replaceAll(lIIllIlllIIll[lIIllIlllIlII[0]], lIIllIlllIIll[lIIllIlllIlII[1]]).substring(lIIllIlllIlII[1]).toLowerCase();
    }

        return String.valueOf(var1);
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static void lIllIIIlllIIIII() {
        lIIllIlllIIll = new String[lIIllIlllIlII[7]];
        b.lIIllIlllIIll[b.lIIllIlllIlII[0]] = "_";
        b.lIIllIlllIIll[b.lIIllIlllIlII[1]] = " ";
        b.lIIllIlllIIll[b.lIIllIlllIlII[2]] = "BLACK_JACK";
        b.lIIllIlllIIll[b.lIIllIlllIlII[3]] = "PICKPOCKETING";
        b.lIIllIlllIIll[b.lIIllIlllIlII[4]] = "STALLS";
        b.lIIllIlllIIll[b.lIIllIlllIlII[5]] = "CHESTS";
        b.lIIllIlllIIll[b.lIIllIlllIlII[6]] = "ROGUES_DEN";
    }

    static {
        b.lIllIIIlllIIIIl();
        b.lIllIIIlllIIIII();
        BLACK_JACK = new GameEnum();
        PICKPOCKETING = new GameEnum();
        STALLS = new GameEnum();
        CHESTS = new GameEnum();
        ROGUES_DEN = new GameEnum();
        b[] bArray = new b[lIIllIlllIlII[5]];
        bArray[b.lIIllIlllIlII[0]] = BLACK_JACK;
        bArray[b.lIIllIlllIlII[1]] = PICKPOCKETING;
        bArray[b.lIIllIlllIlII[2]] = STALLS;
        bArray[b.lIIllIlllIlII[3]] = CHESTS;
        bArray[b.lIIllIlllIlII[4]] = ROGUES_DEN;
        $VALUES = bArray;
    }
}

