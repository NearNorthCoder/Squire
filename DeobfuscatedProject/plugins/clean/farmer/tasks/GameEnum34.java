/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum1;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum34
extends Enum<ar>
implements aw {
    private final  av produceSeed;
    
    public static final  /* enum */ ar NASTURTIUM;
    public static final  /* enum */ ar LIMPWURT;
    
    public static final  /* enum */ ar MARIGOLD;
    public static final  /* enum */ ar NOTHING;
    public static final  /* enum */ ar DEFAULT;
    private static final  ar[] $VALUES;

    private static void lllIlIlIllllIl() {
        lIlllIIIIllI = new String[lIlllIIIIlll[5]];
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[0]] = "NOTHING";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[1]] = "DEFAULT";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[2]] = "MARIGOLD";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[3]] = "NASTURTIUM";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[4]] = "LIMPWURT";
    }

    private static boolean lllIlIllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ar.lllIlIlIllllll();
        ar.lllIlIlIllllIl();
        NOTHING = new GameEnum34(null);
        DEFAULT = new GameEnum34(av.DEFAULT);
        MARIGOLD = new GameEnum34(av.MARIGOLD);
        NASTURTIUM = new GameEnum34(av.NASTURTIUM);
        LIMPWURT = new GameEnum34(av.LIMPWURT);
        ar[] arArray = new ar[lIlllIIIIlll[5]];
        arArray[ar.lIlllIIIIlll[0]] = NOTHING;
        arArray[ar.lIlllIIIIlll[1]] = DEFAULT;
        arArray[ar.lIlllIIIIlll[2]] = MARIGOLD;
        arArray[ar.lIlllIIIIlll[3]] = NASTURTIUM;
        arArray[ar.lIlllIIIIlll[4]] = LIMPWURT;
        $VALUES = arArray;
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    private GameEnum34(av av2) {
        this.produceSeed = av2;
    }

        return String.valueOf(var1);
    }

    public static ar valueOf(String string) {
        return Enum.valueOf(GameEnum34.class, string);
    }

    public static ar[] values() {
        return (ar[])$VALUES.clone();
    }
}

