/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class GameEnum6
extends Enum<I> {

    private  int height;
    private  int nextReq;
    public static final  /* enum */ I THUNDER_VII;
    public static final  /* enum */ I THUNDER_I;
    public static final  /* enum */ I THUNDER_III;
    private static final  I[] $VALUES;
    private  int width;
    public static final  /* enum */ I THUNDER_II;
    public static final  /* enum */ I THUNDER_VI;
    private  Supplier<WorldArea> area;
    private  RegionPoint regionStart;
    public static final  /* enum */ I THUNDER_V;
    public static final  /* enum */ I THUNDER_VIII;
    public static final  /* enum */ I THUNDER_IV;

    static {
        I.var3();
        I.var4();
        THUNDER_I = new GameEnum6(new RegionPoint(var1[3], var1[4], var1[0], b.N), var1[5], var1[6]);
        THUNDER_II = new GameEnum6(new RegionPoint(var1[3], var1[7], var1[0], b.N), var1[5], var1[6]);
        THUNDER_III = new GameEnum6(new RegionPoint(var1[8], var1[9], var1[2], b.N), var1[5], var1[5]);
        THUNDER_IV = new GameEnum6(new RegionPoint(var1[10], var1[9], var1[2], b.N), var1[5], var1[5]);
        THUNDER_V = new GameEnum6(new RegionPoint(var1[12], var1[13], var1[0], b.N), var1[6], var1[5]);
        THUNDER_VI = new GameEnum6(new RegionPoint(var1[14], var1[13], var1[0], b.N), var1[6], var1[5]);
        THUNDER_VII = new GameEnum6(new RegionPoint(var1[8], var1[9], var1[1], b.L), var1[5], var1[5]);
        THUNDER_VIII = new GameEnum6(new RegionPoint(var1[10], var1[9], var1[1], b.L), var1[5], var1[5]);
        I[] iArray = new I[var1[17]];
        iArray[I.var1[0]] = THUNDER_I;
        iArray[I.var1[2]] = THUNDER_II;
        iArray[I.var1[1]] = THUNDER_III;
        iArray[I.var1[5]] = THUNDER_IV;
        iArray[I.var1[11]] = THUNDER_V;
        iArray[I.var1[6]] = THUNDER_VI;
        iArray[I.var1[15]] = THUNDER_VII;
        iArray[I.var1[16]] = THUNDER_VIII;
        $VALUES = iArray;
    }

    public static I[] values() {
        return (I[])$VALUES.clone();
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    public static I valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    private static void var3() {
        var1 = new int[18];
        I.var1[0] = (0x30 ^ 0x3D ^ (0x5C ^ 0x63)) & (37 + 142 - 82 + 56 ^ 104 + 81 - 83 + 69 ^ -1);
        I.var1[1] = 2;
        I.var1[2] = 1;
        I.var1[3] = 0xA ^ 0x3D ^ (0xC ^ 3);
        I.var1[4] = 106 + 85 - 145 + 103 ^ 134 + 110 - 243 + 152;
        I.var1[5] = 3;
        I.var1[6] = 0xE ^ 0x3A ^ (0x6E ^ 0x5F);
        I.var1[7] = 0x90 ^ 0xA5 ^ (0x94 ^ 0x82);
        I.var1[8] = 0x62 ^ 0x7C ^ (2 ^ 0x3A);
        I.var1[9] = 0x3A ^ 0x59 ^ (0x2C ^ 0x62);
        I.var1[10] = 0x44 ^ 0x3C ^ (0xF7 ^ 0xA1);
        I.var1[11] = 0x8F ^ 0x8B;
        I.var1[12] = 129 + 3 - 114 + 137 ^ 91 + 76 - 88 + 109;
        I.var1[13] = 4 ^ 0x24 ^ (0x3E ^ 0x2D);
        I.var1[14] = 14 + 147 - 72 + 87 ^ 116 + 52 - 140 + 137;
        I.var1[15] = 103 + 16 - 93 + 152 ^ 14 + 10 - -117 + 39;
        I.var1[16] = 0x39 ^ 0x20 ^ (0xAD ^ 0xB3);
        I.var1[17] = 128 + 6 - 91 + 126 ^ 112 + 98 - 169 + 120;
    }

    public Supplier<WorldArea> K() {
        return this.area;
    }

    private GameEnum6(RegionPoint regionPoint, int n3, int n4) {
        this.regionStart = regionPoint;
        this.width = n3;
        this.height = n4;
        this.area = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (I.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var15);
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> aC() {
        void var23;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        System.out.println(I.values().length);
        I[] iArray = I.values();
        int n2 = iArray.length;
        int var24 = var1[0];
        while (I.var21(var24, (int)var23)) {
            void var25;
            void var26;
            void var27 = var26[var24];
            var25.addAll(var27.aD());
            0;
            ++var24;
            0;
            if ((0x4B ^ 0xA ^ (0xCB ^ 0x8E)) > 1) continue;
            return null;
        }
        return arrayList;
    }

    private List<WorldPoint> aD() {
        WorldArea worldArea = this.area.get();
        List list = worldArea.toWorldPointList();
        list.removeIf(worldPoint -> {
            boolean bl;
            int n2 = Math.abs(worldPoint.getWorldY() - worldArea.getY());
            int n3 = Math.abs(worldPoint.getWorldX() - worldArea.getX());
            if (I.var5((n3 + n2) % var1[1])) {
                bl = var1[2];
                0;
                if null != null {
                    return ((0xF1 ^ 0xA9 ^ (0x26 ^ 0x6A)) & (0xB1 ^ 0xAA ^ (0x17 ^ 0x18) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
        0;
        return list;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var2 = new String[var1[17]];
        I.var2[I.var1[0]] = "THUNDER_I";
        I.var2[I.var1[2]] = "THUNDER_II";
        I.var2[I.var1[1]] = "THUNDER_III";
        I.var2[I.var1[5]] = "THUNDER_IV";
        I.var2[I.var1[11]] = "THUNDER_V";
        I.var2[I.var1[6]] = "THUNDER_VI";
        I.var2[I.var1[15]] = "THUNDER_VII";
        I.var2[I.var1[16]] = "THUNDER_VIII";
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }
}

