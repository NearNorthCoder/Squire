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

public final class GameEnum59
extends Enum<aq>
implements aw {
    
    public static final  /* enum */ aq NOTHING;
    private static final  aq[] $VALUES;
    public static final  /* enum */ aq WHITE_BERRY;
    public static final  /* enum */ aq POISON_IVY;
    
    private final  av produce;
    public static final  /* enum */ aq DEFAULT;

    public static aq[] values() {
        return (aq[])$VALUES.clone();
    }

    private static void llllIIlIIIIlII() {
        llIIIIIlllll = new String[llIIIIlIIIII[4]];
        aq.llIIIIIlllll[aq.llIIIIlIIIII[0]] = "NOTHING";
        aq.llIIIIIlllll[aq.llIIIIlIIIII[1]] = "DEFAULT";
        aq.llIIIIIlllll[aq.llIIIIlIIIII[2]] = "WHITE_BERRY";
        aq.llIIIIIlllll[aq.llIIIIlIIIII[3]] = "POISON_IVY";
    }

        return String.valueOf(var1);
    }

    private static boolean llllIIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum59(av av2) {
        this.produce = av2;
    }

    @Override
    public av bf() {
        return this.produce;
    }

    public static aq valueOf(String string) {
        return Enum.valueOf(GameEnum59.class, string);
    }

    static {
        aq.llllIIlIIIIlIl();
        aq.llllIIlIIIIlII();
        NOTHING = new GameEnum59(null);
        DEFAULT = new GameEnum59(av.DEFAULT);
        WHITE_BERRY = new GameEnum59(av.WHITE_BERRY);
        POISON_IVY = new GameEnum59(av.POISON_IVY);
        aq[] aqArray = new aq[llIIIIlIIIII[4]];
        aqArray[aq.llIIIIlIIIII[0]] = NOTHING;
        aqArray[aq.llIIIIlIIIII[1]] = DEFAULT;
        aqArray[aq.llIIIIlIIIII[2]] = WHITE_BERRY;
        aqArray[aq.llIIIIlIIIII[3]] = POISON_IVY;
        $VALUES = aqArray;
    }
}

