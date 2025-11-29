/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import -.m.e.a.u.s.r.r.q.i.r.e.f.I;
import gg.squire.farmer.tasks.GameEnum63;
import gg.squire.farmer.tasks.GameEnum4;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum23
extends Enum<H> {
    public static final  /* enum */ H LUNAR_SPELL;
    
    private static final  H[] $VALUES;
    
    private final  int id;
    private final  K equipment;
    public static final  /* enum */ H SUPERCOMPOST;
    public static final  /* enum */ H COMPOST;
    public static final  /* enum */ H ULTRACOMPOST;

    static {
        H.llllIIIIIllIII();
        H.llllIIIIIIlllI();
        COMPOST = new GameEnum23(lIllllllIllI[1], K.COMPOST);
        SUPERCOMPOST = new GameEnum23(lIllllllIllI[3], K.SUPER_COMPOST);
        ULTRACOMPOST = new GameEnum23(lIllllllIllI[5], K.ULTRA_COMPOST);
        LUNAR_SPELL = new GameEnum23(lIllllllIllI[7], null);
        H[] hArray = new H[lIllllllIllI[8]];
        hArray[H.lIllllllIllI[0]] = COMPOST;
        hArray[H.lIllllllIllI[2]] = SUPERCOMPOST;
        hArray[H.lIllllllIllI[4]] = ULTRACOMPOST;
        hArray[H.lIllllllIllI[6]] = LUNAR_SPELL;
        $VALUES = hArray;
    }

    private static void llllIIIIIIlllI() {
        lIllllllIlII = new String[lIllllllIllI[8]];
        H.lIllllllIlII[H.lIllllllIllI[0]] = "COMPOST";
        H.lIllllllIlII[H.lIllllllIllI[2]] = "SUPERCOMPOST";
        H.lIllllllIlII[H.lIllllllIllI[4]] = "ULTRACOMPOST";
        H.lIllllllIlII[H.lIllllllIllI[6]] = "LUNAR_SPELL";
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    public static H valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }

        return String.valueOf(var1);
    }

    private static boolean llllIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static H c(au au2) {
        switch (I.bm[au2.ordinal()]) {
            case 1: 
            case 2: {
                return ULTRACOMPOST;
            }
            case 3: 
            case 4: {
                return SUPERCOMPOST;
            }
            case 5: 
            case 6: {
                return COMPOST;
            }
        }
        return null;
    }

    public int aB() {
        return this.id;
    }

    public K aC() {
        return this.equipment;
    }

    private GameEnum23(int n3, K k2) {
        this.id = n3;
        this.equipment = k2;
    }

}

