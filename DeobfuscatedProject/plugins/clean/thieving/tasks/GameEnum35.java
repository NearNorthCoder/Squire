/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.thieving.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum35
extends Enum<h> {
    private final  WorldPoint location;
    private static final  h[] $VALUES;
    private final  String name;
    private final  WorldArea area;
    public static final  /* enum */ h CAKE_ARDOUGNE;
    public static final  /* enum */ h FRUIT_HOSIDIUS;
    private final  boolean ensureStanding;

    public boolean A() {
        return this.ensureStanding;
    }

    public WorldArea p() {
        return this.area;
    }

    private static void lIllIIlIIIIIIII() {
        lIIllIllllIlI = new String[lIIllIllllIll[15]];
        h.lIIllIllllIlI[h.lIIllIllllIll[0]] = "CAKE_ARDOUGNE";
        h.lIIllIllllIlI[h.lIIllIllllIll[1]] = "Baker's stall";
        h.lIIllIllllIlI[h.lIIllIllllIll[7]] = "FRUIT_HOSIDIUS";
        h.lIIllIllllIlI[h.lIIllIllllIll[8]] = "Fruit Stall";
    }

    static {
        h.lIllIIlIIIIIIIl();
        h.lIllIIlIIIIIIII();
        CAKE_ARDOUGNE = new GameEnum35(lIIllIllllIlI[lIIllIllllIll[1]], new WorldPoint(lIIllIllllIll[2], lIIllIllllIll[3], lIIllIllllIll[0]), new WorldArea(lIIllIllllIll[4], lIIllIllllIll[5], lIIllIllllIll[6], lIIllIllllIll[6], lIIllIllllIll[0]), lIIllIllllIll[1]);
        FRUIT_HOSIDIUS = new GameEnum35(lIIllIllllIlI[lIIllIllllIll[8]], new WorldPoint(lIIllIllllIll[9], lIIllIllllIll[10], lIIllIllllIll[0]), new WorldArea(lIIllIllllIll[11], lIIllIllllIll[12], lIIllIllllIll[13], lIIllIllllIll[14], lIIllIllllIll[0]), lIIllIllllIll[0]);
        h[] hArray = new h[lIIllIllllIll[7]];
        hArray[h.lIIllIllllIll[0]] = CAKE_ARDOUGNE;
        hArray[h.lIIllIllllIll[1]] = FRUIT_HOSIDIUS;
        $VALUES = hArray;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIllIIlIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public String v() {
        return this.name;
    }

        return String.valueOf(var1);
    }

    public WorldPoint z() {
        return this.location;
    }

    private GameEnum35(String string2, WorldPoint worldPoint, WorldArea worldArea, boolean bl) {
        this.name = string2;
        this.location = worldPoint;
        this.area = worldArea;
        this.ensureStanding = bl;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum35.class, string);
    }
}

