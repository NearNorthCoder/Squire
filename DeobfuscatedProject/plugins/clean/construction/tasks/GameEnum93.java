/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class GameEnum93
extends Enum<e> {
    private final  Prayer prayer;
    public static final  /* enum */ e MELEE;
    public static final  /* enum */ e GHOST_RANGED;
    
    public static final  /* enum */ e GHOST_MELEE;
    public static final  /* enum */ e LAVA;
    public static final  /* enum */ e GHOST_MAGIC;
    private static final  e[] $VALUES;
    public static final  /* enum */ e GHOSTS;
    public static final  /* enum */ e MAGIC;
    public static final  /* enum */ e SPAWN;
    
    public static final  /* enum */ e RANGED;
    public static final  /* enum */ e AUTO;
    private final  int priority;

    static {
        e.lIIllIlllI();
        e.lIIllIllIl();
        SPAWN = new GameEnum93(null, lIlIllII[1]);
        AUTO = new GameEnum93(null, lIlIllII[0]);
        MELEE = new GameEnum93(Prayer.PROTECT_FROM_MELEE, lIlIllII[0]);
        RANGED = new GameEnum93(Prayer.PROTECT_FROM_MISSILES, lIlIllII[0]);
        MAGIC = new GameEnum93(Prayer.PROTECT_FROM_MAGIC, lIlIllII[0]);
        LAVA = new GameEnum93(null, lIlIllII[1]);
        GHOSTS = new GameEnum93(null, lIlIllII[1]);
        GHOST_MELEE = new GameEnum93(Prayer.PROTECT_FROM_MELEE, lIlIllII[2]);
        GHOST_RANGED = new GameEnum93(Prayer.PROTECT_FROM_MISSILES, lIlIllII[2]);
        GHOST_MAGIC = new GameEnum93(Prayer.PROTECT_FROM_MAGIC, lIlIllII[2]);
        e[] eArray = new e[lIlIllII[10]];
        eArray[e.lIlIllII[1]] = SPAWN;
        eArray[e.lIlIllII[0]] = AUTO;
        eArray[e.lIlIllII[2]] = MELEE;
        eArray[e.lIlIllII[3]] = RANGED;
        eArray[e.lIlIllII[4]] = MAGIC;
        eArray[e.lIlIllII[5]] = LAVA;
        eArray[e.lIlIllII[6]] = GHOSTS;
        eArray[e.lIlIllII[7]] = GHOST_MELEE;
        eArray[e.lIlIllII[8]] = GHOST_RANGED;
        eArray[e.lIlIllII[9]] = GHOST_MAGIC;
        $VALUES = eArray;
    }

    private static boolean lIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum93(Prayer prayer, int n3) {
        this.prayer = prayer;
        this.priority = n3;
    }

    private static void lIIllIllIl() {
        lIlIlIll = new String[lIlIllII[10]];
        e.lIlIlIll[e.lIlIllII[1]] = "SPAWN";
        e.lIlIlIll[e.lIlIllII[0]] = "AUTO";
        e.lIlIlIll[e.lIlIllII[2]] = "MELEE";
        e.lIlIlIll[e.lIlIllII[3]] = "RANGED";
        e.lIlIlIll[e.lIlIllII[4]] = "MAGIC";
        e.lIlIlIll[e.lIlIllII[5]] = "LAVA";
        e.lIlIlIll[e.lIlIllII[6]] = "GHOSTS";
        e.lIlIlIll[e.lIlIllII[7]] = "GHOST_MELEE";
        e.lIlIlIll[e.lIlIllII[8]] = "GHOST_RANGED";
        e.lIlIlIll[e.lIlIllII[9]] = "GHOST_MAGIC";
    }

    public int H() {
        return this.priority;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static boolean lIIlllIIII(Object object, Object object2) {
        return object == object2;
    }

    public String toString() {
        return "Attack{prayer=" + this.prayer + ", priority=" + this.priority + "}";
    }

        return String.valueOf(llIllllIllllIll);
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum93.class, string);
    }

    public Prayer j() {
        return this.prayer;
    }

    private static boolean lIIllIllll(Object object, Object object2) {
        return object != object2;
    }

    public boolean G() {
        boolean bl2;
        if (!e.lIIllIllll((Object)this, (Object)GHOST_MAGIC) || !e.lIIllIllll((Object)this, (Object)GHOST_RANGED) || e.lIIlllIIII((Object)this, (Object)GHOST_MELEE)) {
            bl2 = lIlIllII[0];

        } else {
            bl2 = lIlIllII[1];
        }
        return bl2;
    }
}

