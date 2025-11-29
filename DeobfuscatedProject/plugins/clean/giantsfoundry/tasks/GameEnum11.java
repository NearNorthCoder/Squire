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

public final class GameEnum11
extends Enum<c> {
    private static final  c[] $VALUES;
    public static final  /* enum */ c ADAMANT_BAR;
    
    private final  int productionSetting;
    public static final  /* enum */ c IRON_BAR;
    public static final  /* enum */ c BRONZE_BAR;
    private final  int itemId;
    public static final  /* enum */ c RUNE_BAR;
    
    public static final  /* enum */ c MITHRIL_BAR;
    public static final  /* enum */ c STEEL_BAR;

        return String.valueOf(var1);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    public int w() {
        return this.productionSetting;
    }

    private static void lIIIIIlIlllIllI() {
        llIlIlIIlIlI = new String[llIlIlIIlIll[12]];
        c.llIlIlIIlIlI[c.llIlIlIIlIll[0]] = "BRONZE_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[2]] = "IRON_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[4]] = "STEEL_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[6]] = "MITHRIL_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[8]] = "ADAMANT_BAR";
        c.llIlIlIIlIlI[c.llIlIlIIlIll[10]] = "RUNE_BAR";
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    static {
        c.lIIIIIlIlllIlll();
        c.lIIIIIlIlllIllI();
        BRONZE_BAR = new GameEnum11(llIlIlIIlIll[1], llIlIlIIlIll[2]);
        IRON_BAR = new GameEnum11(llIlIlIIlIll[3], llIlIlIIlIll[4]);
        STEEL_BAR = new GameEnum11(llIlIlIIlIll[5], llIlIlIIlIll[6]);
        MITHRIL_BAR = new GameEnum11(llIlIlIIlIll[7], llIlIlIIlIll[8]);
        ADAMANT_BAR = new GameEnum11(llIlIlIIlIll[9], llIlIlIIlIll[10]);
        RUNE_BAR = new GameEnum11(llIlIlIIlIll[11], llIlIlIIlIll[12]);
        c[] cArray = new c[llIlIlIIlIll[12]];
        cArray[c.llIlIlIIlIll[0]] = BRONZE_BAR;
        cArray[c.llIlIlIIlIll[2]] = IRON_BAR;
        cArray[c.llIlIlIIlIll[4]] = STEEL_BAR;
        cArray[c.llIlIlIIlIll[6]] = MITHRIL_BAR;
        cArray[c.llIlIlIIlIll[8]] = ADAMANT_BAR;
        cArray[c.llIlIlIIlIll[10]] = RUNE_BAR;
        $VALUES = cArray;
    }

    public int v() {
        return this.itemId;
    }

    private static boolean lIIIIIlIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum11(int n3, int n4) {
        this.itemId = n3;
        this.productionSetting = n4;
    }
}

