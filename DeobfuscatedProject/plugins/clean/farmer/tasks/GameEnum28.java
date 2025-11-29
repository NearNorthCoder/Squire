/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum23;
import gg.squire.farmer.tasks.GameEnum1;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum28
extends Enum<J> {
    private final  av produceSeed;
    public static final  /* enum */ J STRAWBERRIES;
    public static final  /* enum */ J ONIONS;
    private static final  J[] $VALUES;
    public static final  /* enum */ J WATERMELON;
    
    private final  H type;

    public static J[] values() {
        return (J[])$VALUES.clone();
    }

    private GameEnum28(H h2, av av2) {
        this.type = h2;
        this.produceSeed = av2;
    }

    public H aE() {
        return this.type;
    }

    private static void llllIIlIIIlIII() {
        llIIIIlIIIIl = new String[llIIIIlIIIlI[3]];
        J.llIIIIlIIIIl[J.llIIIIlIIIlI[0]] = "WATERMELON";
        J.llIIIIlIIIIl[J.llIIIIlIIIlI[1]] = "ONIONS";
        J.llIIIIlIIIIl[J.llIIIIlIIIlI[2]] = "STRAWBERRIES";
    }

    public av aD() {
        return this.produceSeed;
    }

    public static J valueOf(String string) {
        return Enum.valueOf(GameEnum28.class, string);
    }

    static {
        J.llllIIlIIIlIIl();
        J.llllIIlIIIlIII();
        WATERMELON = new GameEnum28(H.SUPERCOMPOST, av.WATERMELON);
        ONIONS = new GameEnum28(H.COMPOST, av.ONIONS);
        STRAWBERRIES = new GameEnum28(H.COMPOST, av.STRAWEBERRIES);
        J[] jArray = new J[llIIIIlIIIlI[3]];
        jArray[J.llIIIIlIIIlI[0]] = WATERMELON;
        jArray[J.llIIIIlIIIlI[1]] = ONIONS;
        jArray[J.llIIIIlIIIlI[2]] = STRAWBERRIES;
        $VALUES = jArray;
    }
}

