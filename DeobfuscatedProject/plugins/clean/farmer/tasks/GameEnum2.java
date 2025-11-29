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

public final class GameEnum2
extends Enum<at>
implements aw {
    public static final  /* enum */ at IRIT;
    public static final  /* enum */ at TARROMIN;
    public static final  /* enum */ at DEFAULT;
    private static final  at[] $VALUES;
    
    public static final  /* enum */ at DWARF_WEED;
    
    public static final  /* enum */ at TORSTOL;
    public static final  /* enum */ at AVANTOE;
    public static final  /* enum */ at LANTADYME;
    private final  av produceSeed;
    public static final  /* enum */ at CADANTINE;
    public static final  /* enum */ at KWUARM;
    public static final  /* enum */ at GUAM;
    public static final  /* enum */ at TOADFLAX;
    public static final  /* enum */ at RANARR;
    public static final  /* enum */ at SNAPDRAGON;
    public static final  /* enum */ at NOTHING;
    public static final  /* enum */ at HARRALANDER;

    public static at[] values() {
        return (at[])$VALUES.clone();
    }

    static {
        at.llllIIlIllIlIl();
        at.llllIIlIllIlII();
        NOTHING = new GameEnum2(null);
        DEFAULT = new GameEnum2(av.DEFAULT);
        GUAM = new GameEnum2(av.GUAM);
        TARROMIN = new GameEnum2(av.TARROMIN);
        HARRALANDER = new GameEnum2(av.HARRALANDER);
        RANARR = new GameEnum2(av.RANNAR_WEED);
        SNAPDRAGON = new GameEnum2(av.SNAPDRAGON);
        TOADFLAX = new GameEnum2(av.TOADFLAX);
        IRIT = new GameEnum2(av.IRIT);
        CADANTINE = new GameEnum2(av.CADANTINE);
        LANTADYME = new GameEnum2(av.LANTADYME);
        DWARF_WEED = new GameEnum2(av.DWARF_WEED);
        TORSTOL = new GameEnum2(av.TORSTOL);
        AVANTOE = new GameEnum2(av.AVANTOE);
        KWUARM = new GameEnum2(av.KWUARM);
        at[] atArray = new at[llIIIIlIllll[15]];
        atArray[at.llIIIIlIllll[0]] = NOTHING;
        atArray[at.llIIIIlIllll[1]] = DEFAULT;
        atArray[at.llIIIIlIllll[2]] = GUAM;
        atArray[at.llIIIIlIllll[3]] = TARROMIN;
        atArray[at.llIIIIlIllll[4]] = HARRALANDER;
        atArray[at.llIIIIlIllll[5]] = RANARR;
        atArray[at.llIIIIlIllll[6]] = SNAPDRAGON;
        atArray[at.llIIIIlIllll[7]] = TOADFLAX;
        atArray[at.llIIIIlIllll[8]] = IRIT;
        atArray[at.llIIIIlIllll[9]] = CADANTINE;
        atArray[at.llIIIIlIllll[10]] = LANTADYME;
        atArray[at.llIIIIlIllll[11]] = DWARF_WEED;
        atArray[at.llIIIIlIllll[12]] = TORSTOL;
        atArray[at.llIIIIlIllll[13]] = AVANTOE;
        atArray[at.llIIIIlIllll[14]] = KWUARM;
        $VALUES = atArray;
    }

    public static at valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        return String.valueOf(var1);
    }

    private GameEnum2(av av2) {
        this.produceSeed = av2;
    }

    private static void llllIIlIllIlII() {
        llIIIIlIlllI = new String[llIIIIlIllll[15]];
        at.llIIIIlIlllI[at.llIIIIlIllll[0]] = "NOTHING";
        at.llIIIIlIlllI[at.llIIIIlIllll[1]] = "DEFAULT";
        at.llIIIIlIlllI[at.llIIIIlIllll[2]] = "GUAM";
        at.llIIIIlIlllI[at.llIIIIlIllll[3]] = "TARROMIN";
        at.llIIIIlIlllI[at.llIIIIlIllll[4]] = "HARRALANDER";
        at.llIIIIlIlllI[at.llIIIIlIllll[5]] = "RANARR";
        at.llIIIIlIlllI[at.llIIIIlIllll[6]] = "SNAPDRAGON";
        at.llIIIIlIlllI[at.llIIIIlIllll[7]] = "TOADFLAX";
        at.llIIIIlIlllI[at.llIIIIlIllll[8]] = "IRIT";
        at.llIIIIlIlllI[at.llIIIIlIllll[9]] = "CADANTINE";
        at.llIIIIlIlllI[at.llIIIIlIllll[10]] = "LANTADYME";
        at.llIIIIlIlllI[at.llIIIIlIllll[11]] = "DWARF_WEED";
        at.llIIIIlIlllI[at.llIIIIlIllll[12]] = "TORSTOL";
        at.llIIIIlIlllI[at.llIIIIlIllll[13]] = "AVANTOE";
        at.llIIIIlIlllI[at.llIIIIlIllll[14]] = "KWUARM";
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    private static boolean llllIIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

