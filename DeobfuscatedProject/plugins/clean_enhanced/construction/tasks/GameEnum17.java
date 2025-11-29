/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.construction.tasks;

import javax.annotation.Nullable;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum17
extends Enum<c> {
    private final  int x1;
    private final  int y2;
    private static  int[] lIlIIlIll;
    public static final  /* enum */ c EAST;
    private final  int x2;
    public static final  /* enum */ c NORTH;
    private static final  c[] $VALUES;
    private final  int y1;
    public static final  /* enum */ c WEST;
    private static  String[] lIlIIlIlI;

    private static boolean var1(int n2, int n3) {
        return n2 < n3;
    }

    public int v() {
        return this.y2;
    }

    private static boolean var2(int n2, int n3) {
        return n2 >= n3;
    }

    public int s() {
        return this.x1;
    }

    private static void var3() {
        lIlIIlIll = new int[16];
        c.lIlIIlIll[0] = (0x68 ^ 0x37) & ~(0x26 ^ 0x79);
        c.lIlIIlIll[1] = 2;
        c.lIlIIlIll[2] = 0x6C ^ 0x64;
        c.lIlIIlIll[3] = 0x23 ^ 7 ^ (0xA6 ^ 0x8F);
        c.lIlIIlIll[4] = 0xFFFF97CF & 0x6CFF;
        c.lIlIIlIll[5] = -(0xFFFFFBD9 & 0x73F) & (0xFFFF97F9 & 0x6FFF);
        c.lIlIIlIll[6] = -(0xFFFFAFBD & 0x7B63) & (0xFFFFAFFB & Short.MAX_VALUE);
        c.lIlIIlIll[7] = -(0xFFFFF737 & 0x78CD) & (0xFFFFF5ED & 0x7EFF);
        c.lIlIIlIll[8] = 1;
        c.lIlIIlIll[9] = -(0xFFFFF0FD & 0x6FE3) & (0xFFFFFDFF & 0x67EF);
        c.lIlIIlIll[10] = -(0xFFFFCA9F & Short.MAX_VALUE) & (0xFFFFCFBF & Short.MAX_VALUE);
        c.lIlIIlIll[11] = -(0xFFFFFA7F & 0x5FE5) & (0xFFFFDF7F & Short.MAX_VALUE);
        c.lIlIIlIll[12] = -(0xFFFFD105 & 0x6EFF) & (0xFFFFFF7F & 0x45AD);
        c.lIlIIlIll[13] = 0xFFFFCD5F & 0x37EF;
        c.lIlIIlIll[14] = -(0x51 ^ 0x46) & (0xFFFFED7F & 0x17F7);
        c.lIlIIlIll[15] = 3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = lIlIIlIll[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = lIlIIlIll[0];
        while (c.var1(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if ((0x43 ^ 0x47) > ((0xF3 ^ 0xA8) & ~(0xFA ^ 0xA1))) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    public int t() {
        return this.x2;
    }

    private GameEnum17(int n3, int n4, int n5, int n6) {
        this.x1 = n3;
        this.x2 = n4;
        this.y1 = n5;
        this.y2 = n6;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public int u() {
        return this.y1;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public WorldPoint GameEnum17(int n2) {
        if (!c.var21(n2, lIlIIlIll[1]) || c.var22(n2)) {
            return null;
        }
        return new WorldPoint(this.x1 + lIlIIlIll[2] + n2, this.y1 + lIlIIlIll[3], lIlIIlIll[0]);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

    private static boolean var21(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static c a(WorldPoint worldPoint) {
        void var23;
        c[] cArray = c.values();
        int n2 = cArray.length;
        int var24 = lIlIIlIll[0];
        while (c.var1(var24, (int)var23)) {
            WorldPoint var25;
            void var26;
            void var27 = var26[var24];
            if (c.var2(var25.getX(), var27.s()) && c.var21(var25.getX(), var27.t()) && c.var2(var25.getY(), var27.u()) && c.var21(var25.getY(), var27.v())) {
                return var27;
            }
            ++var24;
            0;
            if (3 > 2) continue;
            return null;
        }
        return null;
    }

    private static boolean var22(int n2) {
        return n2 < 0;
    }

    private static void var14() {
        lIlIIlIlI = new String[lIlIIlIll[15]];
        c.lIlIIlIlI[c.lIlIIlIll[0]] = "WEST";
        c.lIlIIlIlI[c.lIlIIlIll[8]] = "NORTH";
        c.lIlIIlIlI[c.lIlIIlIll[1]] = "EAST";
    }
}

