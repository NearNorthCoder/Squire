/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.giantsfoundry.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum21
extends Enum<h> {
    public static final  /* enum */ h RED;
    public static final  /* enum */ h GREEN;
    
    public static final  /* enum */ h YELLOW;
    private final  int highlightChildId;
    private final  int childId;
    
    private static final  h[] $VALUES;

    private static void lIIIIIlIlllllIl() {
        llIlIlIIlllI = new String[llIlIlIIllll[9]];
        h.llIlIlIIlllI[h.llIlIlIIllll[0]] = "RED";
        h.llIlIlIIlllI[h.llIlIlIIllll[3]] = "YELLOW";
        h.llIlIlIIlllI[h.llIlIlIIllll[6]] = "GREEN";
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    public int L() {
        return this.highlightChildId;
    }

        return String.valueOf(var1);
    }

    static {
        h.lIIIIIllIIIlIII();
        h.lIIIIIlIlllllIl();
        RED = new GameEnum21(llIlIlIIllll[1], llIlIlIIllll[2]);
        YELLOW = new GameEnum21(llIlIlIIllll[4], llIlIlIIllll[5]);
        GREEN = new GameEnum21(llIlIlIIllll[7], llIlIlIIllll[8]);
        h[] hArray = new h[llIlIlIIllll[9]];
        hArray[h.llIlIlIIllll[0]] = RED;
        hArray[h.llIlIlIIllll[3]] = YELLOW;
        hArray[h.llIlIlIIllll[6]] = GREEN;
        $VALUES = hArray;
    }

    private GameEnum21(int n3, int n4) {
        this.childId = n3;
        this.highlightChildId = n4;
    }

    private static boolean lIIIIIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public int K() {
        return this.childId;
    }
}

