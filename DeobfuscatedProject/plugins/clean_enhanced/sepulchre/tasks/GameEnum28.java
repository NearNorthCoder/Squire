/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.GameEnum19;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

public final class GameEnum28
extends Enum<K> {
    public static final  /* enum */ K WEST_II_II;
    public static final  /* enum */ K BOTTOM_V_III;
    public static final  /* enum */ K SOUTH_II_I_EXTEND;
    public static final  /* enum */ K NORTH_IV_IV;
    public static final  /* enum */ K TOP_V_VII;
    public static final  /* enum */ K SOUTH_IV_III;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ K WEST_III_IV;
    public static final  /* enum */ K EAST_II_IV;
    public static final  /* enum */ K MIDDLE_V_XVI;
    public static final  /* enum */ K NORTH_II_V;
    
    public static final  /* enum */ K EAST_III_III_EXTEND;
     Supplier<WorldPoint> destination;
     L type;
    private static final  K[] $VALUES;
    public static final  /* enum */ K MIDDLE_V_II;
    public static final  /* enum */ K TOP_V_VI;
    public static final  /* enum */ K MIDDLE_V_XIV;
    public static final  /* enum */ K WEST_IV_III;
    public static final  /* enum */ K SOUTH_IV_V;
    public static final  /* enum */ K EAST_IV_V;
    public static final  /* enum */ K WEST_IV_V;
    public static final  /* enum */ K EAST_IV_IV;
    public static final  /* enum */ K WEST_IV_VI;
    public static final  /* enum */ K WEST_IV_II;
    public static final  /* enum */ K NORTH_IV_I;
    public static final  /* enum */ K SOUTH_II_II;
    public static final  /* enum */ K MIDDLE_V_XII;
    public static final  /* enum */ K WEST_IV_IV;
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ K NORTH_IV_II;

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var3;
        K var4;
        Player player = Players.getLocal();
        if (K.var5(player)) {
            return var1[0];
        }
        if (K.var6(var4.a((Locatable)var3) ? 1 : 0)) {
            return var1[0];
        }
        System.out.println(var2[var1[0]]);
        this.a(squireSepulchre);
        Movement.setDestination((WorldPoint)this.destination.get());
        return var1[1];
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (K.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void var18() {
        var1 = new int[55];
        K.var1[0] = (0xFD ^ 0xA3) & ~(7 ^ 0x59);
        K.var1[1] = 1;
        K.var1[2] = 88 + 45 - 18 + 43 ^ 141 + 106 - 215 + 118;
        K.var1[3] = 163 + 136 - 188 + 108 ^ 77 + 113 - 138 + 147;
        K.var1[4] = 2;
        K.var1[5] = 0x5D ^ 0x57;
        K.var1[6] = 36 + 127 - 93 + 112 ^ 87 + 64 - 20 + 20;
        K.var1[7] = 86 + 114 - 137 + 119 ^ 1 + 40 - -58 + 39;
        K.var1[8] = 0x6B ^ 0xB ^ (0x3B ^ 0x61);
        K.var1[9] = 4 + 134 - 12 + 13 ^ 79 + 121 - 146 + 81;
        K.var1[10] = 3;
        K.var1[11] = 0xC ^ 0x54 ^ (0x30 ^ 0x55);
        K.var1[12] = 0x61 ^ 0x58;
        K.var1[13] = 0xAA ^ 0xBB;
        K.var1[14] = 101 + 68 - 168 + 145 ^ 146 + 99 - 151 + 54;
        K.var1[15] = 173 + 188 - 354 + 207 ^ 58 + 74 - 113 + 179;
        K.var1[16] = 0x74 ^ 0x7F;
        K.var1[17] = 0x31 ^ 0x3E;
        K.var1[18] = 0x88 ^ 0x95 ^ (0x80 ^ 0x99);
        K.var1[19] = 0xE8 ^ 0xB4 ^ (0xDB ^ 0xB4);
        K.var1[20] = 53 + 124 - 96 + 70 ^ 54 + 17 - -6 + 64;
        K.var1[21] = 111 + 122 - 96 + 14 ^ 31 + 70 - -6 + 21;
        K.var1[22] = 0x6F ^ 0x60 ^ (0x4C ^ 0x46);
        K.var1[23] = 0x3B ^ 9;
        K.var1[24] = 0x89 ^ 0xBC;
        K.var1[25] = 0x2C ^ 0x50 ^ (5 ^ 0x48);
        K.var1[26] = 0xA0 ^ 0x8E;
        K.var1[27] = 0xB6 ^ 0x94 ^ (0x63 ^ 0x76);
        K.var1[28] = 0x5C ^ 0x2C ^ (0xF1 ^ 0x95);
        K.var1[29] = 0x68 ^ 0x53;
        K.var1[30] = 70 + 97 - -12 + 5 ^ 144 + 49 - 169 + 123;
        K.var1[31] = 0x1E ^ 0x5D ^ (0x4C ^ 8);
        K.var1[32] = 0xD ^ 0x6F ^ (0x2B ^ 0x64);
        K.var1[33] = 8 + 93 - -31 + 53 ^ 42 + 125 - 118 + 98;
        K.var1[34] = 0xBE ^ 0xA6;
        K.var1[35] = 0x4D ^ 0x69;
        K.var1[36] = 0x17 ^ 0x71 ^ (7 ^ 0x6F);
        K.var1[37] = 0x83 ^ 0xAA;
        K.var1[38] = 0x57 ^ 0x5E;
        K.var1[39] = 0x3B ^ 0x19;
        K.var1[40] = 0x42 ^ 0x3B ^ (0x7B ^ 0xF);
        K.var1[41] = 0x16 ^ 4 ^ (0x69 ^ 0x44);
        K.var1[42] = 0x8B ^ 0xA3;
        K.var1[43] = 37 + 166 - 31 + 17 ^ 67 + 164 - 81 + 18;
        K.var1[44] = 0x31 ^ 0x11;
        K.var1[45] = 0xA1 ^ 0xB3;
        K.var1[46] = 0x47 ^ 0x64 ^ (0x39 ^ 0xC);
        K.var1[47] = 0x8A ^ 0x99;
        K.var1[48] = 1 ^ 0x2E;
        K.var1[49] = 0x8A ^ 0xAF;
        K.var1[50] = 0x16 ^ 0x35;
        K.var1[51] = 0x79 ^ 0x60;
        K.var1[52] = 23 + 64 - 58 + 101 ^ 23 + 151 - 159 + 171;
        K.var1[53] = 100 + 7 - -12 + 39 ^ 177 + 132 - 161 + 37;
        K.var1[54] = 37 + 105 - 88 + 86 ^ 149 + 134 - 162 + 30;
    }

    private static void var19() {
        var2 = new String[var1[54]];
        K.var2[K.var1[0]] = "in here!";
        K.var2[K.var1[1]] = "WEST_II_II";
        K.var2[K.var1[4]] = "SOUTH_II_I_EXTEND";
        K.var2[K.var1[10]] = "SOUTH_II_II";
        K.var2[K.var1[18]] = "EAST_II_IV";
        K.var2[K.var1[22]] = "NORTH_II_V";
        K.var2[K.var1[14]] = "EAST_III_III_EXTEND";
        K.var2[K.var1[31]] = "WEST_III_IV";
        K.var2[K.var1[2]] = "NORTH_IV_I";
        K.var2[K.var1[38]] = "NORTH_IV_II";
        K.var2[K.var1[5]] = "SOUTH_IV_III";
        K.var2[K.var1[16]] = "SOUTH_IV_V";
        K.var2[K.var1[9]] = "NORTH_IV_IV";
        K.var2[K.var1[40]] = "EAST_IV_IV";
        K.var2[K.var1[36]] = "EAST_IV_V";
        K.var2[K.var1[17]] = "WEST_IV_II";
        K.var2[K.var1[15]] = "WEST_IV_III";
        K.var2[K.var1[13]] = "WEST_IV_IV";
        K.var2[K.var1[45]] = "WEST_IV_V";
        K.var2[K.var1[47]] = "WEST_IV_VI";
        K.var2[K.var1[28]] = "TOP_V_VI";
        K.var2[K.var1[43]] = "TOP_V_VII";
        K.var2[K.var1[46]] = "MIDDLE_V_II";
        K.var2[K.var1[21]] = "MIDDLE_V_XII";
        K.var2[K.var1[34]] = "MIDDLE_V_XIV";
        K.var2[K.var1[51]] = "MIDDLE_V_XVI";
        K.var2[K.var1[20]] = "BOTTOM_V_III";
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var20 = this.startAreas.get().iterator();
        while (K.var21(var20.hasNext() ? 1 : 0)) {
            void var22;
            WorldArea var23 = var20.next();
            if (K.var21(var23.contains((Locatable)var22) ? 1 : 0)) {
                return var1[1];
            }
            0;
            if null == null continue;
            return ((93 + 102 - 135 + 133 ^ 83 + 38 - -26 + 10) & (0x50 ^ 0x42 ^ (0xCF ^ 0x81) ^ -1)) != 0;
        }
        return var1[0];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private GameEnum28(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, L l2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.type = l2;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var21(int n2) {
        return n2 != 0;
    }

    private GameEnum28(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, L l2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var36 = list.iterator();
            while (K.var21(var36.hasNext() ? 1 : 0)) {
                void var37;
                Triple var38 = (Triple)var36.next();
                var37.add(new WorldArea(SquireSepulchre.a((RegionPoint)var38.getFirst()), ((Integer)var38.getSecond()).intValue(), ((Integer)var38.getThird()).intValue()));
                0;
                0;
                if (3 == 3) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.type = l2;
    }

    public static K valueOf(String string) {
        return Enum.valueOf(GameEnum28.class, string);
    }

    public static K[] values() {
        return (K[])$VALUES.clone();
    }
}

