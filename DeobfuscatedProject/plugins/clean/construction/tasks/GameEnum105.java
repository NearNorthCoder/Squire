/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.construction.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class GameEnum105
extends Enum<an> {
    
    private static final  an[] $VALUES;
    private final  Predicate<Item> predicate;
    
    private final  String interaction;
    public static final  /* enum */ an FISHING_CAPE;
    private final  int regionId;
    private final  WorldPoint bankTile;

    public static an[] values() {
        return (an[])$VALUES.clone();
    }

    public WorldPoint bt() {
        return this.bankTile;
    }

    public String bs() {
        return this.interaction;
    }

    private GameEnum105(Predicate<Item> predicate, String string2, int n3, WorldPoint worldPoint) {
        this.predicate = predicate;
        this.interaction = string2;
        this.regionId = n3;
        this.bankTile = worldPoint;
    }

    private static boolean lIllIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    public boolean t(int n2) {
        boolean bl2;
        if (an.lIllIlIIIIl(this.regionId, n2)) {
            bl2 = llIIllIlI[0];

        } else {
            bl2 = llIIllIlI[1];
        }
        return bl2;
    }

    public boolean bq() {
        return this.t(Players.getLocal().getWorldLocation().getRegionID());
    }

    private static void lIllIIlllll() {
        llIIllIIl = new String[llIIllIlI[7]];
        an.llIIllIIl[an.llIIllIlI[1]] = "FISHING_CAPE";
        an.llIIllIIl[an.llIIllIlI[0]] = "Fishing Guild";
    }

    public Predicate<Item> br() {
        return this.predicate;
    }

        return String.valueOf(lIllIIlIllIIIll);
    }

    public static an valueOf(String string) {
        return Enum.valueOf(GameEnum105.class, string);
    }

    static {
        an.lIllIlIIIII();
        an.lIllIIlllll();
        FISHING_CAPE = new GameEnum105(item -> {
            boolean bl2;
            if (!an.lIllIlIIIlI(item.getId(), llIIllIlI[2]) || an.lIllIlIIIIl(item.getId(), llIIllIlI[3])) {
                bl2 = llIIllIlI[0];

                if ((114 + 71 - 84 + 26 ^ (0xDB ^ 0xA0)) <= 2) {
                    return ((0x8C ^ 0xA4 ^ (0x13 ^ 0x5B)) & (0x58 ^ 0x4D ^ (0xF ^ 0x7A) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIlI[1];
            }
            return bl2;
        }, llIIllIIl[llIIllIlI[0]], llIIllIlI[4], new WorldPoint(llIIllIlI[5], llIIllIlI[6], llIIllIlI[1]));
        an[] anArray = new an[llIIllIlI[0]];
        anArray[an.llIIllIlI[1]] = FISHING_CAPE;
        $VALUES = anArray;
    }

    private static boolean lIllIlIIIll(int n2, int n3) {
        return n2 < n3;
    }
}

