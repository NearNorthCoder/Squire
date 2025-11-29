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

public final class GameEnum20
extends Enum<ap>
implements aw {
    public static final  /* enum */ ap STRAWBERRIES;
    public static final  /* enum */ ap ONIONS;
    private final  av produceSeed;
    public static final  /* enum */ ap SWEETCORN;
    public static final  /* enum */ ap SNAPE_GRASS;
    
    public static final  /* enum */ ap WATERMELON;
    public static final  /* enum */ ap NOTHING;
    public static final  /* enum */ ap DEFAULT;
    private static final  ap[] $VALUES;

    @Override
    public av bf() {
        return this.produceSeed;
    }

    public static ap valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }

        return String.valueOf(var1);
    }

    private static void llllIIlllIIllI() {
        llIIIIllllIl = new String[llIIIlIIIIII[7]];
        ap.llIIIIllllIl[ap.llIIIlIIIIII[0]] = "NOTHING";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[1]] = "DEFAULT";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[2]] = "WATERMELON";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[3]] = "STRAWBERRIES";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[4]] = "ONIONS";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[5]] = "SWEETCORN";
        ap.llIIIIllllIl[ap.llIIIlIIIIII[6]] = "SNAPE_GRASS";
    }

    public static ap[] values() {
        return (ap[])$VALUES.clone();
    }

    static {
        ap.llllIIlllIlIlI();
        ap.llllIIlllIIllI();
        NOTHING = new GameEnum20(null);
        DEFAULT = new GameEnum20(av.DEFAULT);
        WATERMELON = new GameEnum20(av.WATERMELON);
        STRAWBERRIES = new GameEnum20(av.STRAWEBERRIES);
        ONIONS = new GameEnum20(av.ONIONS);
        SWEETCORN = new GameEnum20(av.SWEETCORN);
        SNAPE_GRASS = new GameEnum20(av.SNAPE_GRASS);
        ap[] apArray = new ap[llIIIlIIIIII[7]];
        apArray[ap.llIIIlIIIIII[0]] = NOTHING;
        apArray[ap.llIIIlIIIIII[1]] = DEFAULT;
        apArray[ap.llIIIlIIIIII[2]] = WATERMELON;
        apArray[ap.llIIIlIIIIII[3]] = STRAWBERRIES;
        apArray[ap.llIIIlIIIIII[4]] = ONIONS;
        apArray[ap.llIIIlIIIIII[5]] = SWEETCORN;
        apArray[ap.llIIIlIIIIII[6]] = SNAPE_GRASS;
        $VALUES = apArray;
    }

    private static boolean llllIIlllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum20(av av2) {
        this.produceSeed = av2;
    }
}

