/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.vorkath.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i BLOWPIE;
    public static final  /* enum */ i CBOW;
    public static final  /* enum */ i NELEE;
    
    public static final  /* enum */ i MELEE;
    public static final  /* enum */ i OTHER;
    private static final  i[] $VALUES;

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        return String.valueOf(var1);
    }

    static {
        i.llIIIIIIllIIlIl();
        i.llIIIIIIllIIlII();
        NELEE = new GameEnum();
        BLOWPIE = new GameEnum();
        CBOW = new GameEnum();
        MELEE = new GameEnum();
        OTHER = new GameEnum();
        i[] iArray = new i[lIlIllIIllIll[5]];
        iArray[i.lIlIllIIllIll[0]] = NELEE;
        iArray[i.lIlIllIIllIll[1]] = BLOWPIE;
        iArray[i.lIlIllIIllIll[2]] = CBOW;
        iArray[i.lIlIllIIllIll[3]] = MELEE;
        iArray[i.lIlIllIIllIll[4]] = OTHER;
        $VALUES = iArray;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean llIIIIIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIIIllIIlII() {
        lIlIllIIllIlI = new String[lIlIllIIllIll[5]];
        i.lIlIllIIllIlI[i.lIlIllIIllIll[0]] = "NELEE";
        i.lIlIllIIllIlI[i.lIlIllIIllIll[1]] = "BLOWPIE";
        i.lIlIllIIllIlI[i.lIlIllIIllIll[2]] = "CBOW";
        i.lIlIllIIllIlI[i.lIlIllIIllIll[3]] = "MELEE";
        i.lIlIllIIllIlI[i.lIlIllIIllIll[4]] = "OTHER";
    }
}

