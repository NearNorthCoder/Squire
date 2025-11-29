/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.moons.tasks.CaveNavTask;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="Prep supplies")
public class PrepSuppliesTask
extends Task {
    static  WorldArea K;
    
    static  WorldArea Q;
    static final  WorldArea at;
    static final  WorldArea au;
    static  int an;
    static  int am;
    static  WorldArea ap;
    static final  WorldArea as;
    static  WorldPoint al;
    static  WorldArea aq;
    private final  SquireMoonsOfPerilConfig aj;
    static  WorldPoint ak;
    
    static  long ao;
    static final  WorldArea ar;

    static {
        k.var3();
        k.var4();
        ak = new WorldPoint(var2[95], var2[96], var2[0]);
        al = new WorldPoint(var2[97], var2[98], var2[0]);
        am = var2[0];
        ao = System.currentTimeMillis();
        ap = new WorldArea(var2[99], var2[100], var2[51], var2[57], var2[0]);
        aq = new WorldArea(var2[101], var2[102], var2[54], var2[50], var2[0]);
        Q = new WorldArea(var2[103], var2[100], var2[51], var2[57], var2[0]);
        K = new WorldArea(var2[104], var2[105], var2[55], var2[55], var2[0]);
        ar = new WorldArea(var2[106], var2[107], var2[66], var2[80], var2[0]);
        as = new WorldArea(var2[106], var2[108], var2[82], var2[109], var2[0]);
        at = new WorldArea(var2[110], var2[102], var2[74], var2[77], var2[0]);
        au = new WorldArea(var2[111], var2[112], var2[63], var2[59], var2[1]);
    }

    private static int var5(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean var6(int n, int n2) {
        return n <= n2;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var2[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var2[0];
        while (k.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static int var18(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean var19(int n) {
        return n != 0;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static void var3() {
        var2 = new int[114];
        k.var2[0] = (0x8C ^ 0x82) & ~(0x31 ^ 0x3F);
        k.var2[1] = 1;
        k.var2[2] = 2;
        k.var2[3] = 3;
        k.var2[4] = 0xAB ^ 0xAF;
        k.var2[5] = 0x57 ^ 0x52;
        k.var2[6] = 0x24 ^ 0x6C ^ (0xDE ^ 0x90);
        k.var2[7] = 0x26 ^ 0x21;
        k.var2[8] = 11 + 38 - -97 + 57 ^ 67 + 33 - 80 + 121;
        k.var2[9] = 1 ^ 9;
        k.var2[10] = 61 + 104 - 126 + 119 ^ 62 + 94 - 12 + 7;
        k.var2[11] = -(0xFFFFFF76 & 0x58D9) & (0xFFFFFFFF & 0x5DFF);
        k.var2[12] = -(0xFFFFFD57 & 0x52EC) & (0xFFFFFDFF & 0x77F3);
        k.var2[13] = 121 + 114 - 185 + 128 ^ 35 + 74 - 49 + 124;
        k.var2[14] = 0 ^ 0x24 ^ (0xB7 ^ 0x98);
        k.var2[15] = 0xB9 ^ 0xB5;
        k.var2[16] = -(0xFFFFFDF3 & 0x7ABF) & (0xFFFFFDF6 & Short.MAX_VALUE);
        k.var2[17] = 0xFFFFFF77 & 0x25FF;
        k.var2[18] = 0x3E ^ 0x1A ^ (0x71 ^ 0x58);
        k.var2[19] = 0xCA ^ 0xC4;
        k.var2[20] = 0x84 ^ 0x8B;
        k.var2[21] = -(0xFFFFCA75 & 0x7F8B) & (0xFFFFFFEF & 0x4F7E);
        k.var2[22] = 0xFFFFE5DF & 0x3FED;
        k.var2[23] = 0x8B ^ 0x9B;
        k.var2[24] = 0x20 ^ 0x3D ^ (0x91 ^ 0x9D);
        k.var2[25] = 179 + 91 - 201 + 118 ^ 16 + 40 - -50 + 63;
        k.var2[26] = 0xBE ^ 0xAD;
        k.var2[27] = 0xA1 ^ 0xB5;
        k.var2[28] = 0x4A ^ 0x5F;
        k.var2[29] = 0xB0 ^ 0xA6;
        k.var2[30] = 0x4B ^ 0xF ^ (0xC1 ^ 0x92);
        k.var2[31] = 0x98 ^ 0x80;
        k.var2[32] = 0xAC ^ 0xB5;
        k.var2[33] = 0x7D ^ 0x67;
        k.var2[34] = 0x61 ^ 0x7A;
        k.var2[35] = 105 + 13 - 100 + 215;
        k.var2[36] = 98 + 0 - 54 + 183;
        k.var2[37] = 0x90 ^ 0x8C;
        k.var2[38] = 0x87 ^ 0x9A;
        k.var2[39] = 0xC6 ^ 0x94 ^ (0x26 ^ 0x6A);
        k.var2[40] = 0x76 ^ 0x3F ^ (0xEC ^ 0xBA);
        k.var2[41] = 0x79 ^ 7 ^ (0xE0 ^ 0xBE);
        k.var2[42] = 0x51 ^ 0x70;
        k.var2[43] = 0x1F ^ 0x3D;
        k.var2[44] = -(0xFFFFF85B & 0xFB5) & (0xFFFFADFD & 0x5FFF);
        k.var2[45] = -(0xFFFFD85F & 0x7FA5) & (0xFFFFFFFF & 0x7DDF);
        k.var2[46] = -(0xFFFFCD3C & 0x36DF) & (0xFFFFBF7F & 0x5DFF);
        k.var2[47] = -(0xFFFFA62F & 0x7BF1) & (0xFFFFBF7C & 0x7FEF);
        k.var2[48] = 61 + 78 - 83 + 76 ^ 126 + 140 - 246 + 147;
        k.var2[49] = 6 ^ 0x22;
        k.var2[50] = 0x9F ^ 0xBA;
        k.var2[51] = 0x7B ^ 0x3F ^ (0x57 ^ 0x35);
        k.var2[52] = 15 + 61 - 2 + 67 ^ 128 + 33 - 148 + 157;
        k.var2[53] = 28 + 47 - 35 + 140 ^ 78 + 0 - 20 + 98;
        k.var2[54] = 0xB ^ 0x73 ^ (0x7B ^ 0x2A);
        k.var2[55] = 62 + 150 - 166 + 115 ^ 4 + 115 - 72 + 92;
        k.var2[56] = 0x77 ^ 0x5C;
        k.var2[57] = 0x5E ^ 0x25 ^ (0xF5 ^ 0xA2);
        k.var2[58] = 3 ^ (0x5E ^ 0x70);
        k.var2[59] = 92 + 57 - 106 + 144 ^ 1 + 9 - -42 + 97;
        k.var2[60] = 110 + 63 - 47 + 6 ^ 64 + 35 - 54 + 126;
        k.var2[61] = 31 + 39 - -83 + 0 ^ 63 + 83 - 14 + 37;
        k.var2[62] = 0x2F ^ 0x1E;
        k.var2[63] = 0x30 ^ 2;
        k.var2[64] = 98 + 81 - 37 + 33 ^ 69 + 97 - 165 + 155;
        k.var2[65] = 0x1B ^ 0x2F;
        k.var2[66] = 3 ^ 0x36;
        k.var2[67] = 0 ^ 0x36;
        k.var2[68] = 0x18 ^ 0x5A ^ (0x3F ^ 0x4A);
        k.var2[69] = 0x62 ^ 0xD ^ (0xF7 ^ 0xA0);
        k.var2[70] = 0xF9 ^ 0xC0;
        k.var2[71] = 0x6A ^ 0x31 ^ (0xE3 ^ 0x82);
        k.var2[72] = 0xFFFFC9F7 & 0x3739;
        k.var2[73] = 8 ^ 0x68 ^ (0x1E ^ 0x45);
        k.var2[74] = 0x79 ^ 0x64 ^ (0x2D ^ 0xC);
        k.var2[75] = 0x7F ^ 0x42;
        k.var2[76] = 124 + 65 - 60 + 125 ^ 144 + 15 - 113 + 146;
        k.var2[77] = 21 + 67 - 17 + 85 ^ 87 + 97 - 91 + 70;
        k.var2[78] = 7 ^ 0x47;
        k.var2[79] = 2 ^ (0x73 ^ 0x30);
        k.var2[80] = 0xFF ^ 0xB5 ^ (0x3C ^ 0x34);
        k.var2[81] = 2 + 87 - -89 + 55 ^ 159 + 87 - 150 + 74;
        k.var2[82] = 0x76 ^ 0x32;
        k.var2[83] = 0xA8 ^ 0xBE ^ (0x69 ^ 0x3A);
        k.var2[84] = 0x51 ^ 9 ^ (0x35 ^ 0x2A);
        k.var2[85] = 14 + 230 - 210 + 204 ^ 112 + 31 - 4 + 27;
        k.var2[86] = 0x69 ^ 0xC ^ (0x8A ^ 0xA6);
        k.var2[87] = 0 ^ 0x4A;
        k.var2[88] = 0x6C ^ 0x27;
        k.var2[89] = 0x68 ^ 0x24;
        k.var2[90] = 0x8A ^ 0xC7;
        k.var2[91] = 0x3A ^ 0x74;
        k.var2[92] = 0x31 ^ 0x7E;
        k.var2[93] = 0x72 ^ 0x22;
        k.var2[94] = 0 ^ 0x51;
        k.var2[95] = 0xFFFFBDF8 & 0x47F7;
        k.var2[96] = -(0xFFFFDE37 & 0x71EF) & (0xFFFFF5FF & Short.MAX_VALUE);
        k.var2[97] = -(0xFFFFFCDF & 0x6337) & (0xFFFFEDFE & 0x77FF);
        k.var2[98] = 0xFFFFB7FE & 0x6DDF;
        k.var2[99] = 0xFFFFADFF & 0x575B;
        k.var2[100] = 0xFFFFEDBB & 0x37CE;
        k.var2[101] = 0xFFFFCFFB & 0x358F;
        k.var2[102] = -(0xFFFFF26D & 0xF93) & (0xFFFFBFBF & 0x67FF);
        k.var2[103] = -(0xFFFFAA25 & 0x7DDB) & (0xFFFFBFBF & 0x6DFF);
        k.var2[104] = -(0xFFFF9A9D & 0x6D67) & (0xFFFFFFFF & 0xDD7);
        k.var2[105] = 0xFFFFFFDD & 0x257A;
        k.var2[106] = 0xFFFF9D7F & 0x67BE;
        k.var2[107] = -(0xFFFFFBE7 & 0x4E19) & (0xFFFFFF3D & 0x6FFF);
        k.var2[108] = -(0xFFFFFA4B & 0x4FF6) & (0xFFFFEFFF & Short.MAX_VALUE);
        k.var2[109] = 0x2E ^ 0x78 ^ 2;
        k.var2[110] = 0xFFFF8FE5 & 0x75DB;
        k.var2[111] = 0xFFFFBF8E & 0x45F7;
        k.var2[112] = -(0xFFFFDB65 & 0x64BF) & (0xFFFFF7EF & 0x6DBF);
        k.var2[113] = 173 + 32 - 54 + 84 ^ 172 + 25 - 38 + 26;
    }

    private static boolean var16(int n, int n2) {
        return n < n2;
    }

    private static boolean var26(int n) {
        return n > 0;
    }

    private static boolean var27(Object object) {
        return object != null;
    }

    public static void f() {
        block5: {
            block4: {
                if (!k.var19(Inventory.contains(item -> item.getName().contains(var1[var2[94]])) ? 1 : 0)) break block4;
                String[] stringArray = new String[var2[1]];
                stringArray[k.var2[0]] = var1[var2[0]];
                if (!k.var19(Inventory.contains((String[])stringArray) ? 1 : 0)) break block5;
            }
            k.h();
            return;
        }
        if (k.var19(Inventory.contains(item -> item.getName().contains(var1[var2[93]])) ? 1 : 0)) {
            k.g();
            k.i();
            return;
        }
    }

    private static boolean var28(int n, int n2) {
        return n > n2;
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var35(int n) {
        return n == 0;
    }

    private static void var4() {
        var1 = new String[var2[113]];
        k.var1[k.var2[0]] = "Moonlight grub paste";
        k.var1[k.var2[1]] = "Moonlight potion(1)";
        k.var1[k.var2[2]] = "Moonlight potion(2)";
        k.var1[k.var2[3]] = "Moonlight potion(3)";
        k.var1[k.var2[4]] = "Moonlight potion(2)";
        k.var1[k.var2[5]] = "Vial of water";
        k.var1[k.var2[6]] = "Vial of water";
        k.var1[k.var2[7]] = "Drop";
        k.var1[k.var2[9]] = "Drinking tea";
        k.var1[k.var2[10]] = "Make-cuppa";
        k.var1[k.var2[13]] = "Nav to streambound door";
        k.var1[k.var2[14]] = "Passing entrance";
        k.var1[k.var2[15]] = "Pass-through";
        k.var1[k.var2[18]] = "Nav to earthbound door";
        k.var1[k.var2[19]] = "Passing entrance";
        k.var1[k.var2[20]] = "Pass-through";
        k.var1[k.var2[23]] = "Nav to streambound door";
        k.var1[k.var2[24]] = "Passing entrance";
        k.var1[k.var2[25]] = "Pass-through";
        k.var1[k.var2[26]] = "Vial";
        k.var1[k.var2[27]] = "Vial";
        k.var1[k.var2[28]] = "Drop";
        k.var1[k.var2[29]] = "Raw bream";
        k.var1[k.var2[30]] = "Raw bream";
        k.var1[k.var2[31]] = "Drop";
        k.var1[k.var2[32]] = "Cooked bream";
        k.var1[k.var2[33]] = "Cooked bream";
        k.var1[k.var2[34]] = "Drop";
        k.var1[k.var2[37]] = "Nav to supplies";
        k.var1[k.var2[38]] = "Get Herb supplies";
        k.var1[k.var2[39]] = "Supply crates";
        k.var1[k.var2[40]] = "Moonlight grub paste";
        k.var1[k.var2[41]] = "Moonlight grub";
        k.var1[k.var2[42]] = "Moonlight grub";
        k.var1[k.var2[43]] = "Moonlight grub";
        k.var1[k.var2[48]] = "Nav to grub tile";
        k.var1[k.var2[49]] = "Gathering grubs";
        k.var1[k.var2[50]] = "Grubby sapling";
        k.var1[k.var2[51]] = "Collect-from";
        k.var1[k.var2[52]] = "Moonlight grub";
        k.var1[k.var2[53]] = "Moonlight grub";
        k.var1[k.var2[54]] = "Crushing grubs";
        k.var1[k.var2[55]] = "Moonlight grub";
        k.var1[k.var2[56]] = "Moonlight grub paste";
        k.var1[k.var2[57]] = "Moonlight grub";
        k.var1[k.var2[58]] = "Mixing potions";
        k.var1[k.var2[59]] = "Moonlight grub paste";
        k.var1[k.var2[60]] = "Drinking tea";
        k.var1[k.var2[61]] = "Make-cuppa";
        k.var1[k.var2[62]] = "Nav to streambound door";
        k.var1[k.var2[63]] = "Passing entrance";
        k.var1[k.var2[64]] = "Pass-through";
        k.var1[k.var2[65]] = "Nav to earthbound door";
        k.var1[k.var2[66]] = "Passing entrance";
        k.var1[k.var2[67]] = "Pass-through";
        k.var1[k.var2[68]] = "Nav to streambound door";
        k.var1[k.var2[69]] = "Passing entrance";
        k.var1[k.var2[70]] = "Pass-through";
        k.var1[k.var2[71]] = "Raw bream";
        k.var1[k.var2[73]] = "Nav to supplies";
        k.var1[k.var2[74]] = "Get net";
        k.var1[k.var2[75]] = "Supply crates";
        k.var1[k.var2[76]] = "Nav to fishing tile";
        k.var1[k.var2[77]] = "Fishing";
        k.var1[k.var2[78]] = "Fish";
        k.var1[k.var2[79]] = "Raw bream";
        k.var1[k.var2[80]] = "Nav to stove";
        k.var1[k.var2[81]] = "Cooking fish";
        k.var1[k.var2[82]] = "Cooking stove";
        k.var1[k.var2[83]] = "Cook";
        k.var1[k.var2[8]] = "Fishing spot";
        k.var1[k.var2[84]] = "Fish";
        k.var1[k.var2[85]] = "Entrance";
        k.var1[k.var2[86]] = "Entrance";
        k.var1[k.var2[87]] = "Entrance";
        k.var1[k.var2[88]] = "Cooking stove";
        k.var1[k.var2[89]] = "Entrance";
        k.var1[k.var2[90]] = "Entrance";
        k.var1[k.var2[91]] = "Entrance";
        k.var1[k.var2[92]] = "Cooking stove";
        k.var1[k.var2[93]] = "Moonlight potion";
        k.var1[k.var2[94]] = "Moonlight potion";
    }

    private static boolean var36(Object object) {
        return object == null;
    }

    private static boolean var37(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    private static void g() {
        void var38;
        String[] stringArray = new String[var2[1]];
        stringArray[k.var2[0]] = var1[var2[1]];
        Item item = Inventory.getFirst((String[])stringArray);
        String[] stringArray2 = new String[var2[1]];
        stringArray2[k.var2[0]] = var1[var2[2]];
        Item item2 = Inventory.getFirst((String[])stringArray2);
        String[] stringArray3 = new String[var2[1]];
        stringArray3[k.var2[0]] = var1[var2[3]];
        Item item3 = Inventory.getFirst((String[])stringArray3);
        if (k.var27(item) && k.var27(item3)) {
            item.useOn(item3);
            return;
        }
        if (k.var27(var38)) {
            void var39;
            void var40;
            String[] stringArray4 = new String[var2[1]];
            stringArray4[k.var2[0]] = var1[var2[4]];
            List var41 = Inventory.getAll((String[])stringArray4);
            if (k.var37(var41.size(), var2[2])) {
                ((Item)var41.get(var2[0])).useOn((Item)var41.get(var2[1]));
                return;
            }
            if (k.var27(var40)) {
                var40.useOn((Item)var38);
                return;
            }
            if (k.var27(var39)) {
                var38.useOn((Item)var39);
                return;
            }
        }
        String[] stringArray5 = new String[var2[1]];
        stringArray5[k.var2[0]] = var1[var2[5]];
        if (k.var19(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
            String[] stringArray6 = new String[var2[1]];
            stringArray6[k.var2[0]] = var1[var2[6]];
            Inventory.getFirst((String[])stringArray6).interact(var1[var2[7]]);
            return;
        }
    }

    private static void i() {
        TileObject var42;
        WorldPoint var43;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n;
            if (k.var19(tileObject.getName().contains(var1[var2[88]]) ? 1 : 0) && k.var6(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[5])) {
                n = var2[1];
                0;
                if (-2 >= 0) {
                    return ((0x52 ^ 0x3E ^ (0x21 ^ 0x6D)) & (140 + 106 - 216 + 140 ^ 36 + 11 - 3 + 94 ^ -1)) != 0;
                }
            } else {
                n = var2[0];
            }
            return n != 0;
        });
        if (k.var27(tileObject2) && k.var16(Movement.getRunEnergy(), var2[8])) {
            SquireMoonsOfPeril.g = var1[var2[60]];
            tileObject2.interact(var1[var2[61]]);
            return;
        }
        if (k.var19(au.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var43 = new WorldPoint(var2[11], var2[12], var2[1]);
            var42 = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.var19(tileObject.getName().contains(var1[var2[87]]) ? 1 : 0) && k.var6(tileObject.getWorldLocation().distanceTo(var43), var2[5])) {
                    n = var2[1];
                    0;
                    if (((0x30 ^ 0x7A ^ (0xAA ^ 0x83)) & (0xE7 ^ 0xB0 ^ (0xF4 ^ 0xC0) ^ -1)) > 0) {
                        return ((76 + 92 - 2 + 70 ^ 6 + 64 - -53 + 59) & (0x7E ^ 0x20 ^ (3 ^ 7) ^ -1)) != 0;
                    }
                } else {
                    n = var2[0];
                }
                return n != 0;
            });
            if (k.var36(var42)) {
                SquireMoonsOfPeril.g = var1[var2[62]];
                Movement.walkTo((WorldPoint)var43);
                0;
                return;
            }
            if (k.var27(var42)) {
                SquireMoonsOfPeril.g = var1[var2[63]];
                var42.interact(var1[var2[64]]);
                return;
            }
        }
        if (k.var19(ar.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var43 = new WorldPoint(var2[16], var2[17], var2[0]);
            var42 = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.var19(tileObject.getName().contains(var1[var2[86]]) ? 1 : 0) && k.var6(tileObject.getWorldLocation().distanceTo(var43), var2[5])) {
                    n = var2[1];
                    0;
                    
                } else {
                    n = var2[0];
                }
                return n != 0;
            });
            if (k.var36(var42)) {
                SquireMoonsOfPeril.g = var1[var2[65]];
                Movement.walkTo((WorldPoint)var43);
                0;
                return;
            }
            if (k.var27(var42)) {
                SquireMoonsOfPeril.g = var1[var2[66]];
                var42.interact(var1[var2[67]]);
                return;
            }
        }
        if (k.var19(as.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var43 = new WorldPoint(var2[21], var2[22], var2[0]);
            var42 = TileObjects.getNearest(tileObject -> {
                int n;
                if (k.var19(tileObject.getName().contains(var1[var2[85]]) ? 1 : 0) && k.var6(tileObject.getWorldLocation().distanceTo(var43), var2[7])) {
                    n = var2[1];
                    0;
                    if (2 < 2) {
                        return ((29 + 156 - 91 + 121 ^ 92 + 102 - 84 + 47) & (151 + 184 - 272 + 139 ^ 116 + 70 - 117 + 59 ^ -1)) != 0;
                    }
                } else {
                    n = var2[0];
                }
                return n != 0;
            });
            if (k.var36(var42)) {
                SquireMoonsOfPeril.g = var1[var2[68]];
                Movement.walkTo((WorldPoint)var43);
                0;
                return;
            }
            if (k.var27(var42)) {
                SquireMoonsOfPeril.g = var1[var2[69]];
                var42.interact(var1[var2[70]]);
                return;
            }
        }
        if (k.var19(at.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (k.var35(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[k.var2[0]] = var1[var2[71]];
                if (!k.var19(Inventory.contains((String[])stringArray) ? 1 : 0) || k.var26(Inventory.getFreeSlots())) {
                    int[] nArray = new int[var2[1]];
                    nArray[k.var2[0]] = var2[72];
                    if (k.var35(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (k.var28(Players.getLocal().getWorldLocation().distanceTo(al), var2[9])) {
                            SquireMoonsOfPeril.g = var1[var2[73]];
                            Movement.walkTo((WorldPoint)al);
                            0;
                            return;
                        }
                        if (k.var6(Players.getLocal().getWorldLocation().distanceTo(al), var2[9])) {
                            SquireMoonsOfPeril.g = var1[var2[74]];
                            String[] stringArray2 = new String[var2[1]];
                            stringArray2[k.var2[0]] = var1[var2[75]];
                            var43 = TileObjects.getNearest((String[])stringArray2);
                            if (k.var27(var43)) {
                                var43.interact(var2[1]);
                                return;
                            }
                        }
                    }
                    int[] nArray2 = new int[var2[1]];
                    nArray2[k.var2[0]] = var2[72];
                    if (k.var19(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        if (k.var28(Players.getLocal().getWorldLocation().distanceTo(ak), var2[9])) {
                            SquireMoonsOfPeril.g = var1[var2[76]];
                            Movement.walkTo((WorldPoint)ak);
                            0;
                            return;
                        }
                        if (k.var6(Players.getLocal().getWorldLocation().distanceTo(ak), var2[9]) && k.var27(var43 = TileObjects.getNearest(tileObject -> {
                            int n;
                            if (k.var19(tileObject.getName().contains(var1[var2[8]]) ? 1 : 0)) {
                                String[] stringArray = new String[var2[1]];
                                stringArray[k.var2[0]] = var1[var2[84]];
                                if (k.var19(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n = var2[1];
                                    0;
                                    if null == null return n != 0;
                                    return (3 & ~3) != 0;
                                }
                            }
                            n = var2[0];
                            return n != 0;
                        }))) {
                            am = var2[0];
                            SquireMoonsOfPeril.g = var1[var2[77]];
                            var43.interact(var1[var2[78]]);
                            return;
                        }
                    }
                }
            }
            if (k.var19(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[k.var2[0]] = var1[var2[79]];
                if (k.var19(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (k.var28(Players.getLocal().getWorldLocation().distanceTo(al), var2[9])) {
                        ao = System.currentTimeMillis() + (long)l.a(var2[46], var2[47]);
                        SquireMoonsOfPeril.g = var1[var2[80]];
                        Movement.walkTo((WorldPoint)al);
                        0;
                        return;
                    }
                    if (k.var6(Players.getLocal().getWorldLocation().distanceTo(al), var2[9])) {
                        SquireMoonsOfPeril.g = var1[var2[81]];
                        if (k.var44(k.var18(System.currentTimeMillis(), ao))) {
                            am = var2[0];
                            ao = System.currentTimeMillis() + (long)l.a(var2[46], var2[47]);
                        }
                        String[] stringArray3 = new String[var2[1]];
                        stringArray3[k.var2[0]] = var1[var2[82]];
                        var43 = TileObjects.getNearest((String[])stringArray3);
                        if (k.var27(var43) && k.var16(am, var2[3])) {
                            var43.interact(var1[var2[83]]);
                            am += var2[1];
                            return;
                        }
                    }
                }
            }
        }
    }

    public static boolean j() {
        int n;
        if (!k.var35(ap.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !k.var35(aq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !k.var35(Q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || k.var19(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n = var2[1];
            0;
            if null != null {
                return ((0xCB ^ 0xA7 ^ (0x41 ^ 0x7C)) & (0x48 ^ 0x76 ^ (0x7C ^ 0x13) ^ -1)) != 0;
            }
        } else {
            n = var2[0];
        }
        return n != 0;
    }

    private static boolean var44(int n) {
        return n >= 0;
    }

    public boolean run() {
        an = this.aj.makeXPotions();
        if (k.var19(k.j() ? 1 : 0)) {
            return var2[0];
        }
        if (k.var19(h.d() ? 1 : 0)) {
            return var2[0];
        }
        k.f();
        return var2[0];
    }

    private static void h() {
        block31: {
            block34: {
                block36: {
                    TileObject var45;
                    WorldPoint var46;
                    block35: {
                        block33: {
                            block32: {
                                TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                                    int n;
                                    if (k.var19(tileObject.getName().contains(var1[var2[92]]) ? 1 : 0) && k.var6(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var2[5])) {
                                        n = var2[1];
                                        0;
                                        if null != null {
                                            return ((0x6E ^ 0x28) & ~(0 ^ 0x46)) != 0;
                                        }
                                    } else {
                                        n = var2[0];
                                    }
                                    return n != 0;
                                });
                                if (k.var27(tileObject2) && k.var16(Movement.getRunEnergy(), var2[8])) {
                                    SquireMoonsOfPeril.g = var1[var2[9]];
                                    tileObject2.interact(var1[var2[10]]);
                                    return;
                                }
                                if (k.var19(au.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var46 = new WorldPoint(var2[11], var2[12], var2[1]);
                                    var45 = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.var19(tileObject.getName().contains(var1[var2[91]]) ? 1 : 0) && k.var6(tileObject.getWorldLocation().distanceTo(var46), var2[5])) {
                                            n = var2[1];
                                            0;
                                            if (-(0x49 ^ 0x4C) >= 0) {
                                                return ((0x17 ^ 8) & ~(0x25 ^ 0x3A)) != 0;
                                            }
                                        } else {
                                            n = var2[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.var36(var45)) {
                                        SquireMoonsOfPeril.g = var1[var2[13]];
                                        Movement.walkTo((WorldPoint)var46);
                                        0;
                                        return;
                                    }
                                    if (k.var27(var45)) {
                                        SquireMoonsOfPeril.g = var1[var2[14]];
                                        var45.interact(var1[var2[15]]);
                                        return;
                                    }
                                }
                                if (k.var19(ar.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var46 = new WorldPoint(var2[16], var2[17], var2[0]);
                                    var45 = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.var19(tileObject.getName().contains(var1[var2[90]]) ? 1 : 0) && k.var6(tileObject.getWorldLocation().distanceTo(var46), var2[5])) {
                                            n = var2[1];
                                            0;
                                            if (3 < 0) {
                                                return ((0x62 ^ 0x64) & ~(0x19 ^ 0x1F)) != 0;
                                            }
                                        } else {
                                            n = var2[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.var36(var45)) {
                                        SquireMoonsOfPeril.g = var1[var2[18]];
                                        Movement.walkTo((WorldPoint)var46);
                                        0;
                                        return;
                                    }
                                    if (k.var27(var45)) {
                                        SquireMoonsOfPeril.g = var1[var2[19]];
                                        var45.interact(var1[var2[20]]);
                                        return;
                                    }
                                }
                                if (k.var19(as.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var46 = new WorldPoint(var2[21], var2[22], var2[0]);
                                    var45 = TileObjects.getNearest(tileObject -> {
                                        int n;
                                        if (k.var19(tileObject.getName().contains(var1[var2[89]]) ? 1 : 0) && k.var6(tileObject.getWorldLocation().distanceTo(var46), var2[7])) {
                                            n = var2[1];
                                            0;
                                            if (-3 > 0) {
                                                return ((0x82 ^ 0xA5) & ~(0x9F ^ 0xB8)) != 0;
                                            }
                                        } else {
                                            n = var2[0];
                                        }
                                        return n != 0;
                                    });
                                    if (k.var36(var45)) {
                                        SquireMoonsOfPeril.g = var1[var2[23]];
                                        Movement.walkTo((WorldPoint)var46);
                                        0;
                                        return;
                                    }
                                    if (k.var27(var45)) {
                                        SquireMoonsOfPeril.g = var1[var2[24]];
                                        var45.interact(var1[var2[25]]);
                                        return;
                                    }
                                }
                                if (!k.var19(at.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                                if (k.var16(Inventory.getFreeSlots(), var2[6])) {
                                    String[] stringArray = new String[var2[1]];
                                    stringArray[k.var2[0]] = var1[var2[26]];
                                    if (k.var19(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                        String[] stringArray2 = new String[var2[1]];
                                        stringArray2[k.var2[0]] = var1[var2[27]];
                                        Inventory.getFirst((String[])stringArray2).interact(var1[var2[28]]);
                                        return;
                                    }
                                    String[] stringArray3 = new String[var2[1]];
                                    stringArray3[k.var2[0]] = var1[var2[29]];
                                    if (k.var19(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[var2[1]];
                                        stringArray4[k.var2[0]] = var1[var2[30]];
                                        Inventory.getFirst((String[])stringArray4).interact(var1[var2[31]]);
                                        return;
                                    }
                                    String[] stringArray5 = new String[var2[1]];
                                    stringArray5[k.var2[0]] = var1[var2[32]];
                                    if (k.var19(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                        String[] stringArray6 = new String[var2[1]];
                                        stringArray6[k.var2[0]] = var1[var2[33]];
                                        Inventory.getFirst((String[])stringArray6).interact(var1[var2[34]]);
                                        return;
                                    }
                                }
                                int[] nArray = new int[var2[1]];
                                nArray[k.var2[0]] = var2[35];
                                if (!k.var19(Inventory.contains((int[])nArray) ? 1 : 0)) break block32;
                                int[] nArray2 = new int[var2[1]];
                                nArray2[k.var2[0]] = var2[36];
                                if (!k.var35(Inventory.contains((int[])nArray2) ? 1 : 0)) break block33;
                            }
                            if (k.var28(Players.getLocal().getWorldLocation().distanceTo(al), var2[9])) {
                                SquireMoonsOfPeril.g = var1[var2[37]];
                                Movement.walkTo((WorldPoint)al);
                                0;
                                return;
                            }
                            if (k.var6(Players.getLocal().getWorldLocation().distanceTo(al), var2[9])) {
                                SquireMoonsOfPeril.g = var1[var2[38]];
                                String[] stringArray = new String[var2[1]];
                                stringArray[k.var2[0]] = var1[var2[39]];
                                var46 = TileObjects.getNearest((String[])stringArray);
                                if (k.var27(var46)) {
                                    var46.interact(var2[3]);
                                    return;
                                }
                            }
                        }
                        int[] nArray = new int[var2[1]];
                        nArray[k.var2[0]] = var2[35];
                        if (!k.var19(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                        int[] nArray3 = new int[var2[1]];
                        nArray3[k.var2[0]] = var2[36];
                        if (!k.var19(Inventory.contains((int[])nArray3) ? 1 : 0)) break block31;
                        String[] stringArray = new String[var2[1]];
                        stringArray[k.var2[0]] = var1[var2[40]];
                        if (!k.var35(Inventory.contains((String[])stringArray) ? 1 : 0)) break block34;
                        String[] stringArray7 = new String[var2[1]];
                        stringArray7[k.var2[0]] = var1[var2[41]];
                        if (!k.var19(Inventory.contains((String[])stringArray7) ? 1 : 0)) break block35;
                        String[] stringArray8 = new String[var2[1]];
                        stringArray8[k.var2[0]] = var1[var2[42]];
                        if (!k.var19(Inventory.contains((String[])stringArray8) ? 1 : 0)) break block36;
                        String[] stringArray9 = new String[var2[1]];
                        stringArray9[k.var2[0]] = var1[var2[43]];
                        if (!k.var16(Inventory.getCount((String[])stringArray9), var2[2])) break block36;
                    }
                    var46 = new WorldPoint(var2[44], var2[45], var2[0]);
                    if (k.var28(Players.getLocal().getWorldLocation().distanceTo(var46), var2[13])) {
                        am = var2[0];
                        ao = System.currentTimeMillis() + (long)l.a(var2[46], var2[47]);
                        SquireMoonsOfPeril.g = var1[var2[48]];
                        Movement.walkTo((WorldPoint)var46);
                        0;
                        return;
                    }
                    if (k.var6(Players.getLocal().getWorldLocation().distanceTo(var46), var2[13])) {
                        SquireMoonsOfPeril.g = var1[var2[49]];
                        if (k.var44(k.var5(System.currentTimeMillis(), ao))) {
                            am = var2[0];
                            ao = System.currentTimeMillis() + (long)l.a(var2[46], var2[47]);
                        }
                        String[] stringArray = new String[var2[1]];
                        stringArray[k.var2[0]] = var1[var2[50]];
                        var45 = TileObjects.getNearest((String[])stringArray);
                        if (k.var27(var45) && k.var16(am, var2[3])) {
                            var45.interact(var1[var2[51]]);
                            am += var2[1];
                            return;
                        }
                    }
                }
                String[] stringArray = new String[var2[1]];
                stringArray[k.var2[0]] = var1[var2[52]];
                if (k.var19(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray10 = new String[var2[1]];
                    stringArray10[k.var2[0]] = var1[var2[53]];
                    if (k.var37(Inventory.getCount((String[])stringArray10), var2[2])) {
                        SquireMoonsOfPeril.g = var1[var2[54]];
                        int[] nArray = new int[var2[1]];
                        nArray[k.var2[0]] = var2[35];
                        String[] stringArray11 = new String[var2[1]];
                        stringArray11[k.var2[0]] = var1[var2[55]];
                        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray11));
                        return;
                    }
                }
            }
            String[] stringArray = new String[var2[1]];
            stringArray[k.var2[0]] = var1[var2[56]];
            if (k.var19(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray12 = new String[var2[1]];
                stringArray12[k.var2[0]] = var1[var2[57]];
                if (k.var35(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    SquireMoonsOfPeril.g = var1[var2[58]];
                    int[] nArray = new int[var2[1]];
                    nArray[k.var2[0]] = var2[36];
                    String[] stringArray13 = new String[var2[1]];
                    stringArray13[k.var2[0]] = var1[var2[59]];
                    Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray13));
                    return;
                }
            }
        }
    }

    @Inject
    public PrepSuppliesTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.aj = squireMoonsOfPerilConfig;
    }
}

