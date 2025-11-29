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
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum19
extends Enum<c> {
    
    private final  WorldPoint anchor;
    private final  WorldPoint curtainLocation;
    private static final  c[] $VALUES;
    private final  WorldPoint lureTo;
    private final  WorldArea area;
    public static final  /* enum */ c LADDER_HOUSE;
    public static final  /* enum */ c MENAPHITE_HOUSE;

    private static boolean lIllIIlIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    public WorldPoint s() {
        return this.curtainLocation;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

    private GameEnum19(WorldArea worldArea, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.area = worldArea;
        this.lureTo = worldPoint;
        this.anchor = worldPoint2;
        this.curtainLocation = worldPoint3;
    }

    private static void lIllIIlIIllIIIl() {
        lIIlllIIIIllI = new String[lIIlllIIIIlll[18]];
        c.lIIlllIIIIllI[c.lIIlllIIIIlll[0]] = "LADDER_HOUSE";
        c.lIIlllIIIIllI[c.lIIlllIIIIlll[8]] = "MENAPHITE_HOUSE";
    }

    private static boolean lIllIIlIIllIlII(int n2) {
        return n2 != 0;
    }

    public WorldArea p() {
        return this.area;
    }

    /*
     * WARNING - void declaration
     */
    public static c b(WorldPoint worldPoint) {
        void var1;
        c[] cArray = c.values();
        int n2 = cArray.length;
        int var2 = lIIlllIIIIlll[0];
        while (c.lIllIIlIIllIIll(var2, (int)var1)) {
            WorldPoint var3;
            void var4;
            void var5 = var4[var2];
            if (c.lIllIIlIIllIlII(var5.p().contains(var3) ? 1 : 0)) {
                return var5;
            }
            ++var2;

            return null;
        }
        return null;
    }

    public WorldPoint q() {
        return this.lureTo;
    }

    static {
        c.lIllIIlIIllIIlI();
        c.lIllIIlIIllIIIl();
        LADDER_HOUSE = new GameEnum19(new WorldArea(lIIlllIIIIlll[1], lIIlllIIIIlll[2], lIIlllIIIIlll[3], lIIlllIIIIlll[4], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[5], lIIlllIIIIlll[2], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[1], lIIlllIIIIlll[6], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[5], lIIlllIIIIlll[7], lIIlllIIIIlll[0]));
        MENAPHITE_HOUSE = new GameEnum19(new WorldArea(lIIlllIIIIlll[9], lIIlllIIIIlll[10], lIIlllIIIIlll[11], lIIlllIIIIlll[4], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[12], lIIlllIIIIlll[13], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[14], lIIlllIIIIlll[15], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[16], lIIlllIIIIlll[17], lIIlllIIIIlll[0]));
        c[] cArray = new c[lIIlllIIIIlll[18]];
        cArray[c.lIIlllIIIIlll[0]] = LADDER_HOUSE;
        cArray[c.lIIlllIIIIlll[8]] = MENAPHITE_HOUSE;
        $VALUES = cArray;
    }

    public WorldPoint r() {
        return this.anchor;
    }
}

