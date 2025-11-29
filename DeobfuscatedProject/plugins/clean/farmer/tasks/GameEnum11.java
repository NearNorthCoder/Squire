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

public final class GameEnum11
extends Enum<as>
implements aw {
    private final  av produceSeed;
    
    public static final  /* enum */ as NOTHING;
    
    public static final  /* enum */ as DEFAULT;
    public static final  /* enum */ as GRAPES;
    private static final  as[] $VALUES;

    @Override
    public av bf() {
        return this.produceSeed;
    }

    public static as[] values() {
        return (as[])$VALUES.clone();
    }

    private static void lllIlllIlIIlII() {
        lIllllIlIIll = new String[lIllllIlIlIl[3]];
        as.lIllllIlIIll[as.lIllllIlIlIl[0]] = "NOTHING";
        as.lIllllIlIIll[as.lIllllIlIlIl[1]] = "DEFAULT";
        as.lIllllIlIIll[as.lIllllIlIlIl[2]] = "GRAPES";
    }

        return String.valueOf(var1);
    }

    static {
        as.lllIlllIlIIlIl();
        as.lllIlllIlIIlII();
        NOTHING = new GameEnum11(null);
        DEFAULT = new GameEnum11(av.DEFAULT);
        GRAPES = new GameEnum11(av.GRAPES);
        as[] asArray = new as[lIllllIlIlIl[3]];
        asArray[as.lIllllIlIlIl[0]] = NOTHING;
        asArray[as.lIllllIlIlIl[1]] = DEFAULT;
        asArray[as.lIllllIlIlIl[2]] = GRAPES;
        $VALUES = asArray;
    }

    private static boolean lllIlllIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static as valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    private GameEnum11(av av2) {
        this.produceSeed = av2;
    }
}

