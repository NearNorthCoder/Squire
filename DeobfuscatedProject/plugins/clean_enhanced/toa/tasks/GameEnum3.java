/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.toa.tasks;

import java.util.Collection;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class GameEnum3
extends Enum<i> {
    private final  int regionY;
    public static final  /* enum */ i DEATH;
    private final  int objectId;
    public static final  /* enum */ i AIR;
    private final  int regionX;
    public static final  /* enum */ i LIGHTNING;
    
    public static final  /* enum */ i FIRE;
    
    private static final  i[] $VALUES;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static void var10() {
        var1 = new String[var2[13]];
        i.var1[i.var2[0]] = "DEATH";
        i.var1[i.var2[1]] = "FIRE";
        i.var1[i.var2[8]] = "LIGHTNING";
        i.var1[i.var2[11]] = "AIR";
    }

    public int m() {
        return this.objectId;
    }

    /*
     * WARNING - void declaration
     */
    public static i a(int n2) {
        void var11;
        i[] iArray = i.values();
        int n3 = iArray.length;
        int var12 = var2[0];
        while (i.var13(var12, (int)var11)) {
            int var14;
            void var15;
            void var16 = var15[var12];
            if (i.var3(var16.m(), var14)) {
                return var16;
            }
            ++var12;
            0;
            if (((0 ^ 0x51) & ~(0x56 ^ 7)) == 0) continue;
            return null;
        }
        return null;
    }

    private GameEnum3(int n3, int n4, int n5) {
        this.objectId = n3;
        this.regionX = n4;
        this.regionY = n5;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void var23() {
        var2 = new int[15];
        i.var2[0] = (87 + 126 - 139 + 57 ^ 39 + 75 - -23 + 13) & (0xB7 ^ 0x8F ^ (0x42 ^ 0x6F) ^ -1);
        i.var2[1] = 1;
        i.var2[2] = 0xFFFFBB7F & 0x7DD4;
        i.var2[3] = 0xFFFFFBAF & 0xB77F;
        i.var2[4] = 0xB0 ^ 0x81 ^ (0x22 ^ 0x31);
        i.var2[5] = 0x64 ^ 0x7B ^ (0x6C ^ 0x52);
        i.var2[6] = 0xFFFFB33F & 0xFFEC;
        i.var2[7] = 0x66 ^ 0x79;
        i.var2[8] = 2;
        i.var2[9] = 0xFFFFF37F & 0xBFAD;
        i.var2[10] = 197 + 88 - 198 + 130 ^ 29 + 117 - 138 + 191;
        i.var2[11] = 3;
        i.var2[12] = 0xFFFFBFFE & 0xF32F;
        i.var2[13] = 0x44 ^ 0x7F ^ (0x2D ^ 0x12);
        i.var2[14] = 120 + 53 - 19 + 27 ^ 20 + 23 - -136 + 10;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    static {
        i.var23();
        i.var10();
        DEATH = new GameEnum3(var2[3], var2[4], var2[5]);
        FIRE = new GameEnum3(var2[6], var2[7], var2[5]);
        LIGHTNING = new GameEnum3(var2[9], var2[4], var2[10]);
        AIR = new GameEnum3(var2[12], var2[7], var2[10]);
        i[] iArray = new i[var2[13]];
        iArray[i.var2[0]] = DEATH;
        iArray[i.var2[1]] = FIRE;
        iArray[i.var2[8]] = LIGHTNING;
        iArray[i.var2[11]] = AIR;
        $VALUES = iArray;
    }

    public WorldPoint a(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, var2[1], var2[2]);
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld());
        return collection.stream().findFirst().orElse(null);
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var2[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var2[0];
        while (i.var13(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (1 >= ((0x20 ^ 0x39 ^ (0xD2 ^ 0x8B)) & (0x1A ^ 0x75 ^ (0x43 ^ 0x6C) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var27);
    }
}

