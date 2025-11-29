/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum14
extends Enum<h> {
    public static final  /* enum */ h MIDDLE;
    public static final  /* enum */ h GHOST_MUSHROOM;
    private final  WorldPoint location;
    public static final  /* enum */ h LEPRECHAUN;
    public static final  /* enum */ h CAMP_ENTRANCE;
    public static final  /* enum */ h DRIFTWOOD;
    
    private static final  h[] $VALUES;

    private GameEnum14(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public WorldPoint l() {
        return this.location;
    }

    private static void lIIIlIlIIllIIll() {
        lllIIllIIIIl = new String[lllIIllIIIlI[15]];
        h.lllIIllIIIIl[h.lllIIllIIIlI[0]] = "MIDDLE";
        h.lllIIllIIIIl[h.lllIIllIIIlI[3]] = "LEPRECHAUN";
        h.lllIIllIIIIl[h.lllIIllIIIlI[6]] = "CAMP_ENTRANCE";
        h.lllIIllIIIIl[h.lllIIllIIIlI[9]] = "GHOST_MUSHROOM";
        h.lllIIllIIIIl[h.lllIIllIIIlI[12]] = "DRIFTWOOD";
    }

    /*
     * WARNING - void declaration
     */
    static h c(WorldPoint worldPoint) {
        void var1;
        h[] hArray = h.values();
        int n2 = hArray.length;
        int var2 = lllIIllIIIlI[0];
        while (h.lIIIlIlIIllIlIl(var2, (int)var1)) {
            WorldPoint var3;
            void var4;
            void var5 = var4[var2];
            if (h.lIIIlIlIIllIllI(var5.l().equals((Object)var3) ? 1 : 0)) {
                return var5;
            }
            ++var2;

            if (2 == 2) continue;
            return null;
        }
        return null;
    }

    static {
        h.lIIIlIlIIllIlII();
        h.lIIIlIlIIllIIll();
        MIDDLE = new GameEnum14(new WorldPoint(lllIIllIIIlI[1], lllIIllIIIlI[2], lllIIllIIIlI[0]));
        LEPRECHAUN = new GameEnum14(new WorldPoint(lllIIllIIIlI[4], lllIIllIIIlI[5], lllIIllIIIlI[0]));
        CAMP_ENTRANCE = new GameEnum14(new WorldPoint(lllIIllIIIlI[7], lllIIllIIIlI[8], lllIIllIIIlI[0]));
        GHOST_MUSHROOM = new GameEnum14(new WorldPoint(lllIIllIIIlI[10], lllIIllIIIlI[11], lllIIllIIIlI[0]));
        DRIFTWOOD = new GameEnum14(new WorldPoint(lllIIllIIIlI[13], lllIIllIIIlI[14], lllIIllIIIlI[0]));
        h[] hArray = new h[lllIIllIIIlI[15]];
        hArray[h.lllIIllIIIlI[0]] = MIDDLE;
        hArray[h.lllIIllIIIlI[3]] = LEPRECHAUN;
        hArray[h.lllIIllIIIlI[6]] = CAMP_ENTRANCE;
        hArray[h.lllIIllIIIlI[9]] = GHOST_MUSHROOM;
        hArray[h.lllIIllIIIlI[12]] = DRIFTWOOD;
        $VALUES = hArray;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIIIlIlIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIIllIllI(int n2) {
        return n2 != 0;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

}

