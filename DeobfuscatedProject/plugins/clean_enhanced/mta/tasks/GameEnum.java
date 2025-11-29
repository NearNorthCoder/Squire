/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.mta.tasks;

import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

public final class GameEnum
extends Enum<i> {
    private final  int widgetId;
    public static final  /* enum */ i PENTAMID;
    private final  int groupId;

    public static final  /* enum */ i CUBE;
    private static final  i[] $VALUES;
    public static final  /* enum */ i CYLINDER;
    public static final  /* enum */ i ICOSAHEDRON;
    private final  String itemName;
    private final  String pile_name;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        i.var10();
        i.var11();
        CUBE = new GameEnum(var2[var1[1]], var1[2], var1[3], var2[var1[4]]);
        CYLINDER = new GameEnum(var2[var1[6]], var1[2], var1[7], var2[var1[8]]);
        PENTAMID = new GameEnum(var2[var1[10]], var1[2], var1[11], var2[var1[12]]);
        ICOSAHEDRON = new GameEnum(var2[var1[3]], var1[2], var1[14], var2[var1[15]]);
        i[] iArray = new i[var1[6]];
        iArray[i.var1[0]] = CUBE;
        iArray[i.var1[1]] = CYLINDER;
        iArray[i.var1[4]] = PENTAMID;
        iArray[i.var1[5]] = ICOSAHEDRON;
        $VALUES = iArray;
    }

    public String y() {
        return this.pile_name;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (i.var3(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void var11() {
        var2 = new String[var1[7]];
        i.var2[i.var1[0]] = "CUBE";
        i.var2[i.var1[1]] = "Cube";
        i.var2[i.var1[4]] = "Cube Pile";
        i.var2[i.var1[5]] = "CYLINDER";
        i.var2[i.var1[6]] = "Cylinder";
        i.var2[i.var1[8]] = "Cylinder Pile";
        i.var2[i.var1[9]] = "PENTAMID";
        i.var2[i.var1[10]] = "Pentamid";
        i.var2[i.var1[12]] = "Pentamid Pile";
        i.var2[i.var1[13]] = "ICOSAHEDRON";
        i.var2[i.var1[3]] = "Icosahedron";
        i.var2[i.var1[15]] = "Icosahedron Pile";
    }

    public int x() {
        return this.widgetId;
    }

    public String v() {
        return this.itemName;
    }

    private static void var10() {
        var1 = new int[16];
        i.var1[0] = (124 + 88 - 68 + 4 ^ 179 + 28 - 79 + 52) & (0x72 ^ 0x57 ^ (4 ^ 1) ^ -1);
        i.var1[1] = 1;
        i.var1[2] = 14 + 75 - -62 + 44;
        i.var1[3] = 0x25 ^ 0x2F;
        i.var1[4] = 2;
        i.var1[5] = 3;
        i.var1[6] = 0xC7 ^ 0xB6 ^ (0xC1 ^ 0xB4);
        i.var1[7] = 0x40 ^ 0x1B ^ (0x4C ^ 0x1B);
        i.var1[8] = 0x45 ^ 0x12 ^ (0x10 ^ 0x42);
        i.var1[9] = 0x20 ^ 0x60 ^ (0x7E ^ 0x38);
        i.var1[10] = 0x29 ^ 4 ^ (0x14 ^ 0x3E);
        i.var1[11] = 0x31 ^ 0x6B ^ (0xC5 ^ 0x91);
        i.var1[12] = 0xA9 ^ 0xA1;
        i.var1[13] = 0x6F ^ 0x50 ^ (0x8C ^ 0xBA);
        i.var1[14] = 0x1E ^ 7 ^ (0xCE ^ 0xC7);
        i.var1[15] = 0x33 ^ 0x16 ^ (0x80 ^ 0xAE);
    }

    public int w() {
        return this.groupId;
    }

    private GameEnum(String string2, int n3, int n4, String string3) {
        this.itemName = string2;
        this.groupId = n3;
        this.widgetId = n4;
        this.pile_name = string3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public boolean z() {
        return Widgets.isVisible((Widget)Widgets.get((int)this.groupId, (int)this.widgetId));
    }
}

