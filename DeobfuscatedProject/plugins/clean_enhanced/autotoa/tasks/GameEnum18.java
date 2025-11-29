/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.autotoa.tasks;

import java.util.List;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;

public final class GameEnum18
extends Enum<d> {
    private final  int req;
    public static final  /* enum */ d VOIDWAKER;
    
    private final  List<Integer> ids;
    private static final  d[] $VALUES;
    
    public static final  /* enum */ d ZARYTE_CROSSBOW;
    public static final  /* enum */ d DRAGON_CLAWS;
    public static final  /* enum */ d TOXIC_BLOWPIPE;
    public static final  /* enum */ d DRAGON_DAGGER;
    public static final  /* enum */ d OSMUMTENS_FANG;
    public static final  /* enum */ d BANDOS_GODSWORD;

    static {
        d.var3();
        d.var4();
        DRAGON_DAGGER = new GameEnum18(List.of(Integer.valueOf(var1[3]), Integer.valueOf(var1[4]), Integer.valueOf(var1[5]), Integer.valueOf(var1[6]), Integer.valueOf(var1[7])), var1[8]);
        BANDOS_GODSWORD = new GameEnum18(List.of(Integer.valueOf(var1[10]), Integer.valueOf(var1[11])), var1[12]);
        TOXIC_BLOWPIPE = new GameEnum18(List.of(Integer.valueOf(var1[14])), var1[12]);
        OSMUMTENS_FANG = new GameEnum18(List.of(Integer.valueOf(var1[16]), Integer.valueOf(var1[17])), var1[8]);
        DRAGON_CLAWS = new GameEnum18(List.of(Integer.valueOf(var1[19])), var1[12]);
        VOIDWAKER = new GameEnum18(List.of(Integer.valueOf(var1[21]), Integer.valueOf(var1[22])), var1[12]);
        ZARYTE_CROSSBOW = new GameEnum18(List.of(Integer.valueOf(var1[24]), Integer.valueOf(var1[25])), var1[26]);
        d[] dArray = new d[var1[27]];
        dArray[d.var1[1]] = DRAGON_DAGGER;
        dArray[d.var1[9]] = BANDOS_GODSWORD;
        dArray[d.var1[13]] = TOXIC_BLOWPIPE;
        dArray[d.var1[15]] = OSMUMTENS_FANG;
        dArray[d.var1[18]] = DRAGON_CLAWS;
        dArray[d.var1[20]] = VOIDWAKER;
        dArray[d.var1[23]] = ZARYTE_CROSSBOW;
        $VALUES = dArray;
    }

    /*
     * WARNING - void declaration
     */
    public static int b(int ... nArray) {
        void var5;
        d[] dArray = d.values();
        int n2 = dArray.length;
        int var6 = var1[1];
        while (d.var7(var6, (int)var5)) {
            int[] var8;
            void var9;
            void var10 = var9[var6];
            int[] var11 = var8;
            int var12 = var11.length;
            int var13 = var1[1];
            while (d.var7(var13, var12)) {
                int var14 = var11[var13];
                if (d.var15(var10.p().contains(var14) ? 1 : 0)) {
                    return var10.o();
                }
                ++var13;
                0;
                if (((0x1B ^ 0x79) & ~(0xA4 ^ 0xC6)) == 0) continue;
                return 2 & ~2;
            }
            ++var6;
            0;
            if (3 > 1) continue;
            return (0x6E ^ 0x2E) & ~(0xF4 ^ 0xB4);
        }
        return var1[0];
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[29];
        d.var1[0] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        d.var1[1] = (0x59 ^ 0x79) & ~(0x4D ^ 0x6D);
        d.var1[2] = 0x45 ^ 0x4F;
        d.var1[3] = -(0xFFFFF743 & 0x4BBD) & (0xFFFFCFBF & 0x77FF);
        d.var1[4] = 0xFFFF8DFF & 0x76CF;
        d.var1[5] = 0xFFFFFFF7 & 0x4FBF;
        d.var1[6] = 0xFFFFD678 & 0x3FB7;
        d.var1[7] = -(0xFFFF9F97 & 0x617E) & (0xFFFF9F7F & 0x77D7);
        d.var1[8] = 181 + 122 - 290 + 237;
        d.var1[9] = 1;
        d.var1[10] = 0xFFFFFE5D & 0x2FBE;
        d.var1[11] = -(0xFFFFABFE & 0x7467) & (0xFFFFFFFF & 0x6FF7);
        d.var1[12] = 0xFFFFA7FE & 0x59F5;
        d.var1[13] = 2;
        d.var1[14] = -(0xFFFFB70D & 0x4CF3) & (0xFFFFBE7F & 0x77FE);
        d.var1[15] = 3;
        d.var1[16] = 0xFFFFF6EB & 0x6F7F;
        d.var1[17] = 0xFFFFFE6F & 0x6BFE;
        d.var1[18] = 0x94 ^ 0x9F ^ (0x6E ^ 0x61);
        d.var1[19] = -(10 + 75 - -54 + 24) & (0xFFFFFFF7 & 0x35FE);
        d.var1[20] = 0x89 ^ 0x95 ^ (0x14 ^ 0xD);
        d.var1[21] = -(0xFFFFD3DF & 0x2D36) & (0xFFFFFD7F & 0x6FBF);
        d.var1[22] = -(0xFFFFFAE5 & 0x173B) & (0xFFFFFFFF & 0x7EFD);
        d.var1[23] = 0x6C ^ 0x6A;
        d.var1[24] = -(0xFFFFF8E2 & 0x175F) & (0xFFFFF77F & 0x7FC7);
        d.var1[25] = -(0xFFFFFD7F & 0x17CD) & (0xFFFFFF7E & Short.MAX_VALUE);
        d.var1[26] = -(0xFFFFF736 & 0x5DCB) & (0xFFFFFFFF & 0x57EF);
        d.var1[27] = 0x59 ^ 0x5E;
        d.var1[28] = 0x80 ^ 0x8D ^ (0x68 ^ 0x6D);
    }

    private GameEnum18(List<Integer> list, int n3) {
        this.ids = list;
        this.req = n3;
    }

    private static void var4() {
        var2 = new String[var1[27]];
        d.var2[d.var1[1]] = "DRAGON_DAGGER";
        d.var2[d.var1[9]] = "BANDOS_GODSWORD";
        d.var2[d.var1[13]] = "TOXIC_BLOWPIPE";
        d.var2[d.var1[15]] = "OSMUMTENS_FANG";
        d.var2[d.var1[18]] = "DRAGON_CLAWS";
        d.var2[d.var1[20]] = "VOIDWAKER";
        d.var2[d.var1[23]] = "ZARYTE_CROSSBOW";
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

    public int o() {
        return this.req / var1[2];
    }

    public int q() {
        return this.req;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var1[1];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var1[1];
        while (d.var7(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static boolean var32(Object object) {
        return object == null;
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static int n() {
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (d.var32(item)) {
            return var1[0];
        }
        d[] var33 = d.values();
        int var34 = var33.length;
        int var35 = var1[1];
        while (d.var7(var35, var34)) {
            void var36;
            d var37 = var33[var35];
            if (d.var15(var37.p().contains(var36.getId()) ? 1 : 0)) {
                return var37.o();
            }
            ++var35;
            0;
            if (2 > 0) continue;
            return (0xE5 ^ 0xB7) & ~(0x63 ^ 0x31);
        }
        return var1[0];
    }

        catch (Exception var43) {
            var43.printStackTrace();
            return null;
        }
    }

    public List<Integer> p() {
        return this.ids;
    }
}

