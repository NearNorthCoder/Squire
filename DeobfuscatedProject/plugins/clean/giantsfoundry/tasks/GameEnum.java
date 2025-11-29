/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GameEnum21;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum
extends Enum<g> {
    private final  h temperature;
    
    private final  int spriteId;
    private final  int objectId;
    public static final  /* enum */ g POLISH;
    private static final  g[] $VALUES;
    public static final  /* enum */ g GRINDSTONE;
    public static final  /* enum */ g HAMMER;

    static {
        g.lIIIIlIIIIlIlII();
        g.lIIIIlIIIIlIIll();
        HAMMER = new GameEnum(h.RED, llIlIlllllII[1], llIlIlllllII[2]);
        GRINDSTONE = new GameEnum(h.YELLOW, llIlIlllllII[4], llIlIlllllII[5]);
        POLISH = new GameEnum(h.GREEN, llIlIlllllII[7], llIlIlllllII[8]);
        g[] gArray = new g[llIlIlllllII[9]];
        gArray[g.llIlIlllllII[0]] = HAMMER;
        gArray[g.llIlIlllllII[3]] = GRINDSTONE;
        gArray[g.llIlIlllllII[6]] = POLISH;
        $VALUES = gArray;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public h H() {
        return this.temperature;
    }

        return String.valueOf(var1);
    }

    private static void lIIIIlIIIIlIIll() {
        llIlIllllIll = new String[llIlIlllllII[9]];
        g.llIlIllllIll[g.llIlIlllllII[0]] = "HAMMER";
        g.llIlIllllIll[g.llIlIlllllII[3]] = "GRINDSTONE";
        g.llIlIllllIll[g.llIlIlllllII[6]] = "POLISH";
    }

    private static boolean lIIIIlIIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public int J() {
        return this.objectId;
    }

    private GameEnum(h h2, int n3, int n4) {
        this.temperature = h2;
        this.spriteId = n3;
        this.objectId = n4;
    }

    public int I() {
        return this.spriteId;
    }
}

