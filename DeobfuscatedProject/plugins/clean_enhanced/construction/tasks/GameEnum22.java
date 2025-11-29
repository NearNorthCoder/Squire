/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.construction.tasks;

import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class GameEnum22
extends Enum<an> {
    private static  String[] llIIllIIl;
    private static final  an[] $VALUES;
    private final  Predicate<Item> predicate;
    private static  int[] llIIllIlI;
    private final  String interaction;
    public static final  /* enum */ an FISHING_CAPE;
    private final  int regionId;
    private final  WorldPoint bankTile;

    private static void var1() {
        llIIllIlI = new int[9];
        an.llIIllIlI[0] = 1;
        an.llIIllIlI[1] = (0x17 ^ 0x1F ^ (0xC6 ^ 0x8C)) & (5 ^ 0x73 ^ (0x8C ^ 0xB8) ^ -1);
        an.llIIllIlI[2] = -(0xFFFFE2FE & 0x5DBB) & (0xFFFFF7FF & 0x6EFF);
        an.llIIllIlI[3] = 0xFFFFFF77 & 0x26CF;
        an.llIIllIlI[4] = -(0xFFFF9547 & 0x7EF9) & (0xFFFFBF75 & 0x7CFF);
        an.llIIllIlI[5] = -(0xFFFFF4B7 & 0x6FEA) & (0xFFFFFEBB & 0x6FFF);
        an.llIIllIlI[6] = -(0xFFFFFFED & 0x52B3) & (0xFFFFDFFF & 0x7FFA);
        an.llIIllIlI[7] = 2;
        an.llIIllIlI[8] = 0x92 ^ 0x9A;
    }

    public static an[] values() {
        return (an[])$VALUES.clone();
    }

    public WorldPoint bt() {
        return this.bankTile;
    }

    public String bs() {
        return this.interaction;
    }

        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private GameEnum22(Predicate<Item> predicate, String string2, int n3, WorldPoint worldPoint) {
        this.predicate = predicate;
        this.interaction = string2;
        this.regionId = n3;
        this.bankTile = worldPoint;
    }

    private static boolean var8(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var9(int n2, int n3) {
        return n2 != n3;
    }

    public boolean t(int n2) {
        boolean bl2;
        if (an.var8(this.regionId, n2)) {
            bl2 = llIIllIlI[0];
            0;
            if (-3 >= 0) {
                return ((0xE7 ^ 0x9C ^ (0x5D ^ 0x2D)) & (0x8A ^ 0x85 ^ (0x93 ^ 0x97) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIllIlI[1];
        }
        return bl2;
    }

    public boolean bq() {
        return this.t(Players.getLocal().getWorldLocation().getRegionID());
    }

    private static void var10() {
        llIIllIIl = new String[llIIllIlI[7]];
        an.llIIllIIl[an.llIIllIlI[1]] = "FISHING_CAPE";
        an.llIIllIIl[an.llIIllIlI[0]] = "Fishing Guild";
    }

    public Predicate<Item> br() {
        return this.predicate;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = llIIllIlI[1];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = llIIllIlI[1];
        while (an.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-(0x63 ^ 0x67) <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static an valueOf(String string) {
        return Enum.valueOf(GameEnum22.class, string);
    }

    static {
        an.var1();
        an.var10();
        FISHING_CAPE = new GameEnum22(item -> {
            boolean bl2;
            if (!an.var9(item.getId(), llIIllIlI[2]) || an.var8(item.getId(), llIIllIlI[3])) {
                bl2 = llIIllIlI[0];
                0;
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

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }
}

