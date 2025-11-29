/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.giantsfoundry.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum18
extends Enum<d> {
    public static final  /* enum */ d NONE;
    public static final  d[] values;
    public static final  /* enum */ d SPIKED;
    private static final  d[] $VALUES;
    public static final  /* enum */ d BROAD;
    public static final  /* enum */ d LIGHT;
    public static final  /* enum */ d HEAVY;
    public static final  /* enum */ d FLAT;

    public static final  /* enum */ d NARROW;

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

    public static d a(int n2) {
        if (!d.lIIIIIlllIlIllI(n2) || d.lIIIIIlllIlIlll(n2, values.length)) {
            return NONE;
        }
        return values[n2];
    }

    static {
        d.lIIIIIlllIlIlIl();
        d.lIIIIIlllIlIlII();
        NONE = new GameEnum18();
        NARROW = new GameEnum18();
        LIGHT = new GameEnum18();
        FLAT = new GameEnum18();
        BROAD = new GameEnum18();
        HEAVY = new GameEnum18();
        SPIKED = new GameEnum18();
        d[] dArray = new d[llIlIllIIlll[7]];
        dArray[d.llIlIllIIlll[0]] = NONE;
        dArray[d.llIlIllIIlll[1]] = NARROW;
        dArray[d.llIlIllIIlll[2]] = LIGHT;
        dArray[d.llIlIllIIlll[3]] = FLAT;
        dArray[d.llIlIllIIlll[4]] = BROAD;
        dArray[d.llIlIllIIlll[5]] = HEAVY;
        dArray[d.llIlIllIIlll[6]] = SPIKED;
        $VALUES = dArray;
        values = d.values();
    }

    private static boolean lIIIIIlllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static boolean lIIIIIlllIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIlllIlIllI(int n2) {
        return n2 >= 0;
    }

        return String.valueOf(var1);
    }

    private static void lIIIIIlllIlIlII() {
        llIlIllIIllI = new String[llIlIllIIlll[7]];
        d.llIlIllIIllI[d.llIlIllIIlll[0]] = "NONE";
        d.llIlIllIIllI[d.llIlIllIIlll[1]] = "NARROW";
        d.llIlIllIIllI[d.llIlIllIIlll[2]] = "LIGHT";
        d.llIlIllIIllI[d.llIlIllIIlll[3]] = "FLAT";
        d.llIlIllIIllI[d.llIlIllIIlll[4]] = "BROAD";
        d.llIlIllIIllI[d.llIlIllIIlll[5]] = "HEAVY";
        d.llIlIllIIllI[d.llIlIllIIlll[6]] = "SPIKED";
    }
}

