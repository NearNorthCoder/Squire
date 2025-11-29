/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum15;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

public final class GameEnum22
extends Enum<r> {
    public static final  /* enum */ r NORTH_I_VI;
    private static final  r[] $VALUES;
    public static final  /* enum */ r EAST_II_XII;
    public static final  /* enum */ r WEST_II_VI;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ r NORTH_I_V;
     Supplier<WorldPoint> destination;
     s type;
    
    public static final  /* enum */ r SOUTH_IV_VII;
    public static final  /* enum */ r BOTTOM_V_IV;
    public static final  /* enum */ r NORTH_II_IV;
    public static final  /* enum */ r SOUTH_I_V;
    public static final  /* enum */ r SOUTH_II_VI;
    public static final  /* enum */ r SOUTH_III_II;
    public static final  /* enum */ r NORTH_IV_X;
    public  Supplier<TileObject> object;
    public static final  /* enum */ r EAST_II_VII;
    public static final  /* enum */ r SOUTH_IV_VI;
    public static final  /* enum */ r SOUTH_II_IV;
    public static final  /* enum */ r WEST_III_VI;
    
    public static final  /* enum */ r WEST_I_VI;
    public static final  /* enum */ r MIDDLE_V_XVII;
    public static final  /* enum */ r WEST_I_V;
    public static final  /* enum */ r NORTH_II_XI;
    public static final  /* enum */ r EAST_III_VIII;
    public static final  /* enum */ r WEST_II_VIII;
    public static final  /* enum */ r TOP_V_VIII;
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ r NORTH_II_I;
    public static final  /* enum */ r EAST_I_VI;

    private GameEnum22(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, s s2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var3 = list.iterator();
            while (r.var4(var3.hasNext() ? 1 : 0)) {
                void var5;
                Triple var6 = (Triple)var3.next();
                var5.add(new WorldArea(SquireSepulchre.a((RegionPoint)var6.getFirst()), ((Integer)var6.getSecond()).intValue(), ((Integer)var6.getThird()).intValue()));
                0;
                0;
                if ((0x8C ^ 0x88) >= 3) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object = supplier;
        this.type = s2;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static void var8() {
        var1 = new int[77];
        r.var1[0] = (0x13 ^ 0x7C ^ (0xDF ^ 0x87)) & (133 + 84 - 134 + 70 ^ 23 + 111 - 103 + 143 ^ -1);
        r.var1[1] = 1;
        r.var1[2] = 3;
        r.var1[3] = 2;
        r.var1[4] = 0xC4 ^ 0xAD ^ (0xAA ^ 0xC7);
        r.var1[5] = 0x11 ^ 0x5B ^ (0xD2 ^ 0x9D);
        r.var1[6] = 0x11 ^ 0x17;
        r.var1[7] = 0x7A ^ 0x7D;
        r.var1[8] = 0x6E ^ 9 ^ (0x67 ^ 8);
        r.var1[9] = 0x6A ^ 0x63;
        r.var1[10] = 6 ^ 0xC;
        r.var1[11] = 0x6E ^ 0x65;
        r.var1[12] = 145 + 72 - 50 + 17 ^ 178 + 166 - 325 + 161;
        r.var1[13] = 0x75 ^ 0x27 ^ (0x7E ^ 0x21);
        r.var1[14] = 0x84 ^ 0x8A;
        r.var1[15] = 0x37 ^ 0x38;
        r.var1[16] = 34 + 10 - -30 + 58 ^ 17 + 143 - 83 + 71;
        r.var1[17] = 0x16 ^ 7;
        r.var1[18] = 0x3F ^ 0x2C ^ 1;
        r.var1[19] = 0x81 ^ 0x92;
        r.var1[20] = 136 + 95 - 108 + 17 ^ 26 + 136 - 11 + 1;
        r.var1[21] = 7 ^ 3 ^ (0xB1 ^ 0xA0);
        r.var1[22] = 0x7C ^ 0x77 ^ (0x19 ^ 4);
        r.var1[23] = 0x75 ^ 0x62;
        r.var1[24] = 0x40 ^ 0x2B ^ (0x53 ^ 0x20);
        r.var1[25] = 0x24 ^ 0x3D;
        r.var1[26] = 0x66 ^ 0x7C;
        r.var1[27] = 0x67 ^ 0x7C;
        r.var1[28] = 3 ^ (0x60 ^ 0x7F);
        r.var1[29] = 0x8F ^ 0xA1 ^ (2 ^ 0x31);
        r.var1[30] = 0xF7 ^ 0x9A ^ (0x20 ^ 0x53);
        r.var1[31] = 33 + 55 - 29 + 104 ^ 113 + 69 - 1 + 7;
        r.var1[32] = 0x9F ^ 0xBD ^ 2;
        r.var1[33] = 0x6A ^ 0x4B;
        r.var1[34] = 0x2E ^ 0x6B ^ (0xCC ^ 0xAB);
        r.var1[35] = 0x2A ^ 9;
        r.var1[36] = 0x4B ^ 0x6F;
        r.var1[37] = 16 + 50 - -2 + 121 ^ 18 + 103 - 5 + 36;
        r.var1[38] = 0x1A ^ 0x3C;
        r.var1[39] = 0x1D ^ 0x3A;
        r.var1[40] = 0x96 ^ 0xBE;
        r.var1[41] = 66 + 90 - 92 + 90 ^ 24 + 38 - -52 + 65;
        r.var1[42] = 0x24 ^ 0xE;
        r.var1[43] = 57 + 107 - 140 + 113 ^ 58 + 135 - 40 + 9;
        r.var1[44] = 0xF ^ 0x23;
        r.var1[45] = 22 + 88 - 14 + 51 ^ 37 + 98 - -14 + 41;
        r.var1[46] = 0x9B ^ 0xB5;
        r.var1[47] = 0x7A ^ 0x64 ^ (0x85 ^ 0xB4);
        r.var1[48] = 0x14 ^ 0x47 ^ (0x25 ^ 0x46);
        r.var1[49] = 0x75 ^ 0x44;
        r.var1[50] = 0xD9 ^ 0x8C ^ (0x79 ^ 0x1E);
        r.var1[51] = 0xAD ^ 0x9E;
        r.var1[52] = 0x47 ^ 0x73;
        r.var1[53] = 0x4A ^ 0x7F;
        r.var1[54] = 0xF6 ^ 0x83 ^ (0xEB ^ 0xA8);
        r.var1[55] = 0x62 ^ 0x55;
        r.var1[56] = 0x7D ^ 0x2E ^ (0xAA ^ 0xC1);
        r.var1[57] = 77 + 142 - 173 + 104 ^ 25 + 169 - 137 + 118;
        r.var1[58] = 122 + 115 - 149 + 74 ^ 90 + 62 - 134 + 134;
        r.var1[59] = 0x7E ^ 0x43;
        r.var1[60] = 4 + 96 - -41 + 38 ^ 5 + 5 - -77 + 49;
        r.var1[61] = 0x98 ^ 0xA7;
        r.var1[62] = 3 ^ (0xA2 ^ 0x9D);
        r.var1[63] = 0x63 ^ 0x5D;
        r.var1[64] = 0x65 ^ 0x29 ^ (0x9E ^ 0x92);
        r.var1[65] = 63 + 106 - 108 + 69 ^ 7 + 157 - 105 + 136;
        r.var1[66] = 0x69 ^ 0x2B;
        r.var1[67] = 0x4D ^ 0x25 ^ (0x67 ^ 0x4C);
        r.var1[68] = 0x3B ^ 0x7F;
        r.var1[69] = 0x7F ^ 0x3A;
        r.var1[70] = 0x86 ^ 0xC0;
        r.var1[71] = 1 ^ 0x46;
        r.var1[72] = 0x13 ^ 0x5B;
        r.var1[73] = 0x31 ^ 0x78;
        r.var1[74] = 0x4A ^ 0x20 ^ (0x82 ^ 0xA2);
        r.var1[75] = 136 + 168 - 291 + 184 ^ 31 + 108 - 15 + 18;
        r.var1[76] = 0x7F ^ 0x33;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum22.class, string);
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[0];
        while (r.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (((67 + 77 - 101 + 145 ^ 149 + 143 - 155 + 49) & (0xDD ^ 0x8D ^ (0xCA ^ 0x9C) ^ -1)) >= -1) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    static {
        r.var8();
        r.var20();
        WEST_I_V = new GameEnum22(new RegionPoint(var1[21], var1[37], var1[3], b.C), var1[2], var1[12], new RegionPoint(var1[22], var1[37], var1[3], b.C), new RegionPoint(var1[22], var1[37], var1[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[50]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[51]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-1 <= 3) return n2 != 0;
                    return ((114 + 78 - 72 + 10 ^ 31 + 71 - 95 + 139) & (62 + 80 - 85 + 79 ^ 70 + 3 - -3 + 76 ^ -1) & ((126 + 114 - 119 + 70 ^ 46 + 130 - 53 + 19) & (0x86 ^ 0x89 ^ (0x1C ^ 0x22) ^ -1) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_I_VI = new GameEnum22(new RegionPoint(var1[21], var1[29], var1[1], b.C), var1[2], var1[6], new RegionPoint(var1[23], var1[32], var1[1], b.C), new RegionPoint(var1[23], var1[32], var1[1], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[48]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[49]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (((0xCD ^ 0x94 ^ (0x6C ^ 0x16)) & (124 + 58 - 117 + 110 ^ 11 + 34 - -52 + 43 ^ -1)) == 0) return n2 != 0;
                    return ((2 ^ 0x73 ^ (0x6B ^ 0x42)) & (16 + 38 - -82 + 21 ^ 168 + 185 - 207 + 51 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_I_V = new GameEnum22(new RegionPoint(var1[41], var1[37], var1[3], b.C), var1[2], var1[5], new RegionPoint(var1[42], var1[37], var1[3], b.C), new RegionPoint(var1[42], var1[37], var1[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[46]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[47]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (2 > 0) return n2 != 0;
                    return ((0x44 ^ 0x4F ^ (0xEE ^ 0xB6)) & (26 + 98 - -97 + 16 ^ 77 + 10 - -94 + 9 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_I_VI = new GameEnum22(new RegionPoint(var1[41], var1[31], var1[1], b.C), var1[2], var1[2], new RegionPoint(var1[41], var1[32], var1[1], b.C), new RegionPoint(var1[41], var1[32], var1[1], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[44]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[45]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (3 != -1) return n2 != 0;
                    return ((0x43 ^ 0x71) & ~(0x8A ^ 0xB8)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_I_V = new GameEnum22(new RegionPoint(var1[18], var1[26], var1[3], b.C), var1[6], var1[5], new RegionPoint(var1[19], var1[30], var1[3], b.C), new RegionPoint(var1[19], var1[30], var1[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[42]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[43]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-3 < 0) return n2 != 0;
                    return ((0x44 ^ 0x79) & ~(0x1D ^ 0x20)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_I_VI = new GameEnum22(new RegionPoint(var1[44], var1[16], var1[3], b.C), var1[2], var1[16], new RegionPoint(var1[45], var1[30], var1[3], b.C), new RegionPoint(var1[45], var1[30], var1[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[40]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[41]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (((0x5F ^ 0x1C) & ~(0x7D ^ 0x3E)) <= 0) return n2 != 0;
                    return ((0xD ^ 1) & ~(0xB3 ^ 0xBF)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_II_VI = new GameEnum22(new RegionPoint(var1[55], var1[19], var1[3], b.I), var1[8], var1[13], new RegionPoint(var1[57], var1[32], var1[3], b.I), new RegionPoint(var1[59], var1[21], var1[3], b.I), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[38]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[39]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if null == null return n2 != 0;
                    return ((0x15 ^ 0x47) & ~(3 ^ 0x51)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_II_VIII = new GameEnum22(new RegionPoint(var1[61], var1[31], var1[1], b.I), var1[25], var1[2], new RegionPoint(var1[23], var1[32], var1[1], b.G), new RegionPoint(var1[23], var1[32], var1[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[36]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[37]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if ((0xE7 ^ 0x86 ^ (0x33 ^ 0x56)) >= 0) return n2 != 0;
                    return ((0x12 ^ 0x52 ^ (0x23 ^ 0x7C)) & (2 ^ 5 ^ (0x31 ^ 0x29) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_II_IV = new GameEnum22(new RegionPoint(var1[55], var1[3], var1[3], b.I), var1[33], var1[13], new RegionPoint(var1[15], var1[13], var1[3], b.G), new RegionPoint(var1[15], var1[13], var1[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[34]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[35]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if null == null return n2 != 0;
                    return ((0x29 ^ 0x73) & ~(0x56 ^ 0xC)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_II_VI = new GameEnum22(new RegionPoint(var1[31], var1[22], var1[1], b.G), var1[2], var1[3], new RegionPoint(var1[32], var1[23], var1[1], b.G), new RegionPoint(var1[32], var1[23], var1[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[32]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[33]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if null == null return n2 != 0;
                    return ((0xA7 ^ 0xA0) & ~(0x4F ^ 0x48)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_II_VII = new GameEnum22(new RegionPoint(var1[33], var1[2], var1[3], b.G), var1[13], var1[7], new RegionPoint(var1[40], var1[7], var1[3], b.G), new RegionPoint(var1[40], var1[7], var1[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[30]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[31]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if ((132 + 49 - 122 + 77 ^ 39 + 68 - 51 + 84) == (0x9A ^ 0xA3 ^ (0x63 ^ 0x5E))) return n2 != 0;
                    return ((0x7C ^ 0x3C ^ (0x3A ^ 0x5B)) & (26 + 153 - 91 + 81 ^ 100 + 18 - 39 + 57 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_II_XII = new GameEnum22(new RegionPoint(var1[41], var1[30], var1[1], b.G), var1[6], var1[5], new RegionPoint(var1[41], var1[32], var1[1], b.G), new RegionPoint(var1[41], var1[32], var1[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[28]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[29]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return ((0x42 ^ 0x22) & ~(0x2B ^ 0x4B)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_I = new GameEnum22(new RegionPoint(var1[21], var1[36], var1[3], b.G), var1[15], var1[12], new RegionPoint(var1[22], var1[47], var1[3], b.G), new RegionPoint(var1[3], var1[47], var1[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[26]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[27]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (2 > 0) return n2 != 0;
                    return ((0x86 ^ 0x81 ^ (0x72 ^ 0x78)) & (0x7C ^ 0x57 ^ (0x2F ^ 9) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_IV = new GameEnum22(new RegionPoint(var1[38], var1[51], var1[3], b.G), var1[15], var1[12], new RegionPoint(var1[22], var1[47], var1[3], b.G), new RegionPoint(var1[3], var1[47], var1[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[24]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[25]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (((0x42 ^ 0) & ~(0x48 ^ 0xA)) >= -1) return n2 != 0;
                    return ((0x86 ^ 0xB0) & ~(0x61 ^ 0x57)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_XI = new GameEnum22(new RegionPoint(var1[31], var1[41], var1[1], b.G), var1[2], var1[8], new RegionPoint(var1[32], var1[41], var1[1], b.G), new RegionPoint(var1[32], var1[41], var1[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[22]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[23]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-(0xB8 ^ 0xBC) < 0) return n2 != 0;
                    return ((0x26 ^ 0x34) & ~(0x1E ^ 0xC)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_III_VIII = new GameEnum22(new RegionPoint(var1[38], var1[2], var1[3], b.J), var1[8], var1[14], new RegionPoint(var1[38], var1[4], var1[3], b.J), new RegionPoint(var1[38], var1[4], var1[3], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[20]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[21]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (1 < 3) return n2 != 0;
                    return ((0xB3 ^ 0x87 ^ (0x63 ^ 0x5A)) & (0x4E ^ 0x14 ^ (0x1C ^ 0x4B) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_III_II = new GameEnum22(new RegionPoint(var1[27], var1[21], var1[1], b.J), var1[11], var1[10], new RegionPoint(var1[27], var1[30], var1[1], b.J), new RegionPoint(var1[27], var1[30], var1[1], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[18]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[19]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (((0x62 ^ 0x7D ^ (0x11 ^ 0x39)) & (0x8C ^ 0x98 ^ (0x8C ^ 0xAF) ^ -1)) == 0) return n2 != 0;
                    return ((0x99 ^ 0x92 ^ (0x18 ^ 0x37)) & (0x4D ^ 0x78 ^ (0xD4 ^ 0xC5) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_III_VI = new GameEnum22(List.of(new Triple((Object)new RegionPoint(var1[4], var1[12], var1[3], b.J), (Object)var1[21], (Object)var1[2]), new Triple((Object)new RegionPoint(var1[19], var1[2], var1[3], b.J), (Object)var1[8], (Object)var1[9])), new RegionPoint(var1[26], var1[5], var1[3], b.J), new RegionPoint(var1[26], var1[5], var1[3], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[16]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[17]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-(74 + 103 - 46 + 56 ^ 186 + 37 - 196 + 164) < 0) return n2 != 0;
                    return ((0x6D ^ 0x14 ^ (0x94 ^ 0xB3)) & (0x4F ^ 0x1D ^ (0x6B ^ 0x67) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_IV_VII = new GameEnum22(new RegionPoint(var1[37], var1[2], var1[3], b.L), var1[25], var1[19], new RegionPoint(var1[37], var1[18], var1[3], b.L), new RegionPoint(var1[37], var1[18], var1[3], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[14]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[15]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if ((0xE ^ 0xB) != 0) return n2 != 0;
                    return ((0x84 ^ 0xAB) & ~(0x22 ^ 0xD)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_IV_X = new GameEnum22(new RegionPoint(var1[48], var1[35], var1[3], b.L), var1[9], var1[10], new RegionPoint(var1[48], var1[37], var1[3], b.L), new RegionPoint(var1[48], var1[37], var1[3], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[12]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[13]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (1 > 0) return n2 != 0;
                    return ((0x52 ^ 8) & ~(0xFF ^ 0xA5)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_IV_VI = new GameEnum22(List.of(new Triple((Object)new RegionPoint(var1[31], var1[5], var1[1], b.L), (Object)var1[2], (Object)var1[16]), new Triple((Object)new RegionPoint(var1[34], var1[17], var1[1], b.L), (Object)var1[8], (Object)var1[2])), new RegionPoint(var1[32], var1[20], var1[1], b.L), new RegionPoint(var1[32], var1[20], var1[1], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[10]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[11]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (3 >= 0) return n2 != 0;
                    return ((158 + 69 - 163 + 115 ^ 9 + 83 - -41 + 18) & (138 + 64 - 112 + 55 ^ 78 + 38 - 89 + 154 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        TOP_V_VIII = new GameEnum22(new RegionPoint(var1[2], var1[3], var1[3], b.N), var1[2], var1[14], new RegionPoint(var1[5], var1[4], var1[3], b.N), new RegionPoint(var1[5], var1[4], var1[3], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[8]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[9]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if ((152 + 102 - 198 + 122 ^ 54 + 73 - -45 + 10) == (34 + 145 - 164 + 150 ^ 159 + 20 - 26 + 8)) return n2 != 0;
                    return ((0x4A ^ 0x3C ^ (0x71 ^ 0x1F)) & (3 ^ (0x44 ^ 0x5F) ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        MIDDLE_V_XVII = new GameEnum22(new RegionPoint(var1[53], var1[8], var1[1], b.N), var1[14], var1[8], new RegionPoint(var1[60], var1[8], var1[1], b.N), new RegionPoint(var1[60], var1[8], var1[1], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[6]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[7]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if null == null return n2 != 0;
                    return ((0x57 ^ 0x37) & ~(0x1D ^ 0x7D)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        BOTTOM_V_IV = new GameEnum22(new RegionPoint(var1[25], var1[41], var1[0], b.N), var1[19], var1[6], new RegionPoint(var1[32], var1[41], var1[0], b.N), new RegionPoint(var1[32], var1[41], var1[0], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var4(tileObject.getName().equals(var2[var1[4]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[r.var1[0]] = var2[var1[5]];
                if (r.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-1 <= 0) return n2 != 0;
                    return ((221 + 84 - 104 + 23 ^ 165 + 79 - 111 + 43) & (239 + 73 - 109 + 46 ^ 113 + 121 - 166 + 101 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }), s.INTERACT);
        r[] rArray = new r[var1[24]];
        rArray[r.var1[0]] = WEST_I_V;
        rArray[r.var1[1]] = WEST_I_VI;
        rArray[r.var1[3]] = NORTH_I_V;
        rArray[r.var1[2]] = NORTH_I_VI;
        rArray[r.var1[4]] = SOUTH_I_V;
        rArray[r.var1[5]] = EAST_I_VI;
        rArray[r.var1[6]] = WEST_II_VI;
        rArray[r.var1[7]] = WEST_II_VIII;
        rArray[r.var1[8]] = SOUTH_II_IV;
        rArray[r.var1[9]] = SOUTH_II_VI;
        rArray[r.var1[10]] = EAST_II_VII;
        rArray[r.var1[11]] = EAST_II_XII;
        rArray[r.var1[12]] = NORTH_II_I;
        rArray[r.var1[13]] = NORTH_II_IV;
        rArray[r.var1[14]] = NORTH_II_XI;
        rArray[r.var1[15]] = EAST_III_VIII;
        rArray[r.var1[16]] = SOUTH_III_II;
        rArray[r.var1[17]] = WEST_III_VI;
        rArray[r.var1[18]] = SOUTH_IV_VII;
        rArray[r.var1[19]] = NORTH_IV_X;
        rArray[r.var1[20]] = SOUTH_IV_VI;
        rArray[r.var1[21]] = TOP_V_VIII;
        rArray[r.var1[22]] = MIDDLE_V_XVII;
        rArray[r.var1[23]] = BOTTOM_V_IV;
        $VALUES = rArray;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var27;
        r var28;
        Player player = Players.getLocal();
        if (r.var7(player)) {
            return var1[0];
        }
        if (r.var29(var28.a((Locatable)var27) ? 1 : 0)) {
            return var1[0];
        }
        this.a(squireSepulchre);
        this.X();
        0;
        return var1[1];
    }

    private GameEnum22(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, s s2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object = supplier;
        this.type = s2;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private boolean X() {
        TileObject tileObject = this.object.get();
        if (r.var7(tileObject)) {
            return var1[0];
        }
        System.out.println(var2[var1[0]]);
        String[] stringArray = new String[var1[2]];
        stringArray[r.var1[0]] = var2[var1[1]];
        stringArray[r.var1[1]] = var2[var1[3]];
        stringArray[r.var1[3]] = var2[var1[2]];
        tileObject.interact(stringArray);
        return var1[1];
    }

    private static boolean var29(int n2) {
        return n2 == 0;
    }

    private static void var20() {
        var2 = new String[var1[76]];
        r.var2[r.var1[0]] = "Traversing";
        r.var2[r.var1[1]] = "Jump";
        r.var2[r.var1[3]] = "Climb-down";
        r.var2[r.var1[2]] = "Squeeze-through";
        r.var2[r.var1[4]] = "Platform";
        r.var2[r.var1[5]] = "Jump";
        r.var2[r.var1[6]] = "Stairs";
        r.var2[r.var1[7]] = "Jump";
        r.var2[r.var1[8]] = "Stairs";
        r.var2[r.var1[9]] = "Jump";
        r.var2[r.var1[10]] = "Gate";
        r.var2[r.var1[11]] = "Squeeze-through";
        r.var2[r.var1[12]] = "Stairs";
        r.var2[r.var1[13]] = "Jump";
        r.var2[r.var1[14]] = "Stairs";
        r.var2[r.var1[15]] = "Climb-down";
        r.var2[r.var1[16]] = "Stairs";
        r.var2[r.var1[17]] = "Jump";
        r.var2[r.var1[18]] = "Platform";
        r.var2[r.var1[19]] = "Jump";
        r.var2[r.var1[20]] = "Stairs";
        r.var2[r.var1[21]] = "Jump";
        r.var2[r.var1[22]] = "Platform";
        r.var2[r.var1[23]] = "Jump";
        r.var2[r.var1[24]] = "Stairs";
        r.var2[r.var1[25]] = "Climb-down";
        r.var2[r.var1[26]] = "Platform";
        r.var2[r.var1[27]] = "Jump";
        r.var2[r.var1[28]] = "Platform";
        r.var2[r.var1[29]] = "Jump";
        r.var2[r.var1[30]] = "Stairs";
        r.var2[r.var1[31]] = "Climb-down";
        r.var2[r.var1[32]] = "Platform";
        r.var2[r.var1[33]] = "Jump";
        r.var2[r.var1[34]] = "Stairs";
        r.var2[r.var1[35]] = "Climb-down";
        r.var2[r.var1[36]] = "Platform";
        r.var2[r.var1[37]] = "Jump";
        r.var2[r.var1[38]] = "Stairs";
        r.var2[r.var1[39]] = "Jump";
        r.var2[r.var1[40]] = "Stairs";
        r.var2[r.var1[41]] = "Climb-down";
        r.var2[r.var1[42]] = "Stairs";
        r.var2[r.var1[43]] = "Climb-down";
        r.var2[r.var1[44]] = "Platform";
        r.var2[r.var1[45]] = "Jump";
        r.var2[r.var1[46]] = "Stairs";
        r.var2[r.var1[47]] = "Jump";
        r.var2[r.var1[48]] = "Platform";
        r.var2[r.var1[49]] = "Jump";
        r.var2[r.var1[50]] = "Stairs";
        r.var2[r.var1[51]] = "Jump";
        r.var2[r.var1[52]] = "WEST_I_V";
        r.var2[r.var1[53]] = "WEST_I_VI";
        r.var2[r.var1[54]] = "NORTH_I_V";
        r.var2[r.var1[55]] = "NORTH_I_VI";
        r.var2[r.var1[56]] = "SOUTH_I_V";
        r.var2[r.var1[57]] = "EAST_I_VI";
        r.var2[r.var1[58]] = "WEST_II_VI";
        r.var2[r.var1[60]] = "WEST_II_VIII";
        r.var2[r.var1[62]] = "SOUTH_II_IV";
        r.var2[r.var1[59]] = "SOUTH_II_VI";
        r.var2[r.var1[63]] = "EAST_II_VII";
        r.var2[r.var1[61]] = "EAST_II_XII";
        r.var2[r.var1[64]] = "NORTH_II_I";
        r.var2[r.var1[65]] = "NORTH_II_IV";
        r.var2[r.var1[66]] = "NORTH_II_XI";
        r.var2[r.var1[67]] = "EAST_III_VIII";
        r.var2[r.var1[68]] = "SOUTH_III_II";
        r.var2[r.var1[69]] = "WEST_III_VI";
        r.var2[r.var1[70]] = "SOUTH_IV_VII";
        r.var2[r.var1[71]] = "NORTH_IV_X";
        r.var2[r.var1[72]] = "SOUTH_IV_VI";
        r.var2[r.var1[73]] = "TOP_V_VIII";
        r.var2[r.var1[74]] = "MIDDLE_V_XVII";
        r.var2[r.var1[75]] = "BOTTOM_V_IV";
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var36 = this.startAreas.get().iterator();
        while (r.var4(var36.hasNext() ? 1 : 0)) {
            void var37;
            WorldArea var38 = var36.next();
            if (r.var4(var38.contains((Locatable)var37) ? 1 : 0)) {
                return var1[1];
            }
            0;
            if (-1 < 2) continue;
            return ((0x66 ^ 0x76) & ~(0xD ^ 0x1D)) != 0;
        }
        return var1[0];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }
}

