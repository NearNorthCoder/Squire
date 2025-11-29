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
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.FHelper;
import gg.squire.sepulchre.tasks.GameEnum10;
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
import net.unethicalite.api.movement.Movement;

public final class GameEnum17
extends Enum<e> {
    public  Supplier<TileObject> object;
    
    public static final  /* enum */ e WEST_III_VI;
    
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ e WEST_IV_I;
    public static final  /* enum */ e SOUTH_II_III;
    public static final  /* enum */ e NORTH_II_III;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ e SOUTH_I_I;
    public static final  /* enum */ e TOP_V_IV;
    public static final  /* enum */ e NORTH_III_III;
    public static final  /* enum */ e SOUTH_IV_VI;
    public static final  /* enum */ e WEST_II_I;
    public static final  /* enum */ e NORTH_III_V;
    private static final  e[] $VALUES;
    public static final  /* enum */ e WEST_II_VII;
    public static final  /* enum */ e NORTH_IV_III;
    public static final  /* enum */ e MIDDLE_V_XI;
     Supplier<WorldPoint> destination;
    public static final  /* enum */ e EAST_I_III;
     g type;
    public static final  /* enum */ e WEST_I_III;
    public static final  /* enum */ e WEST_III_III;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var10 = this.startAreas.get().iterator();
        while (e.var11(var10.hasNext() ? 1 : 0)) {
            void var12;
            WorldArea var13 = var10.next();
            if (e.var11(var13.contains((Locatable)var12) ? 1 : 0)) {
                return var2[2];
            }
            0;
            if null == null continue;
            return ((0x80 ^ 0x90) & ~(0xB6 ^ 0xA6)) != 0;
        }
        return var2[0];
    }

    private static void var14() {
        var2 = new int[54];
        e.var2[0] = (0x86 ^ 0xAA) & ~(0x1A ^ 0x36);
        e.var2[1] = 1 + 65 - -61 + 42 ^ 62 + 1 - -85 + 25;
        e.var2[2] = 1;
        e.var2[3] = 0x70 ^ 0x7D;
        e.var2[4] = 0x3E ^ 0x2E;
        e.var2[5] = 0x7E ^ 0x7B;
        e.var2[6] = 0x43 ^ 0x4C;
        e.var2[7] = 0xA8 ^ 0xA6;
        e.var2[8] = 0x3F ^ 0x62 ^ (0x70 ^ 0x27);
        e.var2[9] = 3;
        e.var2[10] = 0x36 ^ 0x2C;
        e.var2[11] = 0x22 ^ 0x24;
        e.var2[12] = 0x51 ^ 0x42;
        e.var2[13] = 0x1F ^ 0xD;
        e.var2[14] = 2;
        e.var2[15] = 0x67 ^ 0x60;
        e.var2[16] = 0x8E ^ 0x86;
        e.var2[17] = 0x50 ^ 0x59;
        e.var2[18] = 0xA6 ^ 0xAD;
        e.var2[19] = 81 + 141 - 221 + 174 ^ 122 + 136 - 148 + 53;
        e.var2[20] = 4 ^ 0x39;
        e.var2[21] = 0x7E ^ 0x4E ^ (0xAF ^ 0xB7);
        e.var2[22] = 0xB1 ^ 0x8A ^ (0x24 ^ 0x3A);
        e.var2[23] = 0x91 ^ 0xC0 ^ (0xBF ^ 0xC2);
        e.var2[24] = 0xC ^ 0xA ^ (0x96 ^ 0xA4);
        e.var2[25] = 0x22 ^ 0x55 ^ (0x60 ^ 6);
        e.var2[26] = 0x39 ^ 5;
        e.var2[27] = 0x4B ^ 0x68 ^ (0x31 ^ 0x3B);
        e.var2[28] = 0x53 ^ 0x4C;
        e.var2[29] = 0x65 ^ 0x69 ^ (0xA8 ^ 0x9E);
        e.var2[30] = 0x2D ^ 0xF;
        e.var2[31] = 0x91 ^ 0x9C ^ (0xB1 ^ 0x82);
        e.var2[32] = 0x6A ^ 2 ^ (0xFA ^ 0xA5);
        e.var2[33] = 0x9B ^ 0x85;
        e.var2[34] = 7 ^ 0x26;
        e.var2[35] = 20 + 75 - 38 + 71 ^ 115 + 17 - 35 + 74;
        e.var2[36] = 0xB2 ^ 0xA6;
        e.var2[37] = 0x2E ^ 0x73 ^ (0x5F ^ 0x1B);
        e.var2[38] = 0x66 ^ 0x71;
        e.var2[39] = 9 ^ 0x29;
        e.var2[40] = 0x62 ^ 0x77;
        e.var2[41] = 2 + 144 - 81 + 121 ^ 127 + 17 - 108 + 136;
        e.var2[42] = 0x5D ^ 0x40;
        e.var2[43] = 7 ^ 0x38;
        e.var2[44] = 0xC1 ^ 0x8A ^ (0x2D ^ 0x5E);
        e.var2[45] = 0x1E ^ 0x2B;
        e.var2[46] = 54 + 70 - 77 + 81 ^ 167 + 134 - 200 + 69;
        e.var2[47] = 0x94 ^ 0x8C;
        e.var2[48] = 0x9D ^ 0xAD;
        e.var2[49] = 173 + 96 - 146 + 111 ^ 36 + 126 - -3 + 31;
        e.var2[50] = 0x48 ^ 0xF ^ (6 ^ 0x77);
        e.var2[51] = 0xD3 ^ 0xB5 ^ (0xD3 ^ 0x8E);
        e.var2[52] = 0x1C ^ 7;
        e.var2[53] = 0x6E ^ 0x72;
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

    private GameEnum17(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, g g2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object = supplier;
        this.type = g2;
    }

    private static void var16() {
        var1 = new String[var2[39]];
        e.var1[e.var2[0]] = "Knight Statue";
        e.var1[e.var2[2]] = "Knight Statue";
        e.var1[e.var2[14]] = "Knight Statue";
        e.var1[e.var2[9]] = "Knight Statue";
        e.var1[e.var2[1]] = "Knight Statue";
        e.var1[e.var2[5]] = "Knight Statue";
        e.var1[e.var2[11]] = "Knight Statue";
        e.var1[e.var2[15]] = "Knight Statue";
        e.var1[e.var2[16]] = "Knight Statue";
        e.var1[e.var2[17]] = "Knight Statue";
        e.var1[e.var2[8]] = "Knight Statue";
        e.var1[e.var2[18]] = "Knight Statue";
        e.var1[e.var2[19]] = "Knight Statue";
        e.var1[e.var2[3]] = "Knight Statue";
        e.var1[e.var2[7]] = "Knight Statue";
        e.var1[e.var2[6]] = "Knight Statue";
        e.var1[e.var2[4]] = "WEST_I_III";
        e.var1[e.var2[25]] = "SOUTH_I_I";
        e.var1[e.var2[13]] = "EAST_I_III";
        e.var1[e.var2[12]] = "WEST_II_I";
        e.var1[e.var2[36]] = "WEST_II_VII";
        e.var1[e.var2[40]] = "SOUTH_II_III";
        e.var1[e.var2[41]] = "NORTH_II_III";
        e.var1[e.var2[38]] = "NORTH_III_V";
        e.var1[e.var2[47]] = "WEST_III_III";
        e.var1[e.var2[37]] = "NORTH_III_III";
        e.var1[e.var2[10]] = "WEST_III_VI";
        e.var1[e.var2[52]] = "NORTH_IV_III";
        e.var1[e.var2[53]] = "SOUTH_IV_VI";
        e.var1[e.var2[42]] = "WEST_IV_I";
        e.var1[e.var2[33]] = "TOP_V_IV";
        e.var1[e.var2[28]] = "MIDDLE_V_XI";
    }

    private GameEnum17(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, g g2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var17 = list.iterator();
            while (e.var11(var17.hasNext() ? 1 : 0)) {
                void var18;
                Triple var19 = (Triple)var17.next();
                var18.add(new WorldArea(SquireSepulchre.a((RegionPoint)var19.getFirst()), ((Integer)var19.getSecond()).intValue(), ((Integer)var19.getThird()).intValue()));
                0;
                0;
                if (-2 < 0) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object = supplier;
        this.type = g2;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var20(int n2, int n3) {
        return n2 <= n3;
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
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
        void var28;
        void var29;
        e var30;
        Player player = Players.getLocal();
        if (e.var31(player)) {
            return var2[0];
        }
        if (e.var32(var30.a((Locatable)var29) ? 1 : 0)) {
            return var2[0];
        }
        var30.a((SquireSepulchre)var28);
        if (e.var11(var30.a((d)var27) ? 1 : 0)) {
            WorldPoint var33 = var30.destination.get();
            System.out.println(var33);
            Movement.setDestination((WorldPoint)var33);
            return var2[2];
        }
        Movement.setDestination((WorldPoint)this.startPoint.get());
        return var2[2];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static boolean var34(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var35(int n2, int n3) {
        return n2 >= n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

    private static boolean var32(int n2) {
        return n2 == 0;
    }

    static {
        e.var14();
        e.var16();
        WEST_I_III = new GameEnum17(new RegionPoint(var2[0], var2[22], var2[14], b.C), var2[15], var2[17], new RegionPoint(var2[0], var2[23], var2[14], b.C), new RegionPoint(var2[11], var2[24], var2[14], b.C), () -> {
            String[] stringArray = new String[var2[2]];
            stringArray[e.var2[0]] = var1[var2[6]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[20], var2[21], var2[14], b.D)), (String[])stringArray);
        }, g.BLADE);
        SOUTH_I_I = new GameEnum17(List.of(new Triple((Object)new RegionPoint(var2[21], var2[9], var2[14], b.C), (Object)var2[4], (Object)var2[9]), new Triple((Object)new RegionPoint(var2[24], var2[26], var2[14], b.E), (Object)var2[9], (Object)var2[17])), new RegionPoint(var2[27], var2[9], var2[14], b.C), new RegionPoint(var2[28], var2[8], var2[14], b.C), () -> {
            String[] stringArray = new String[var2[2]];
            stringArray[e.var2[0]] = var1[var2[7]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLADE_I);
        EAST_I_III = new GameEnum17(new RegionPoint(var2[29], var2[30], var2[14], b.C), var2[11], var2[18], new RegionPoint(var2[31], var2[30], var2[14], b.C), new RegionPoint(var2[32], var2[13], var2[14], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.var11(tileObject.getName().startsWith(var1[var2[3]]) ? 1 : 0) && e.var15(tileObject.getPlane(), var2[14])) {
                n2 = var2[2];
                0;
                if (3 <= ((234 + 62 - 176 + 134 ^ 58 + 31 - -36 + 41) & (0x77 ^ 0x21 ^ (0x7B ^ 0x75) ^ -1))) {
                    return ((32 + 157 - 182 + 245 ^ 162 + 13 - 108 + 111) & (0x64 ^ 0x41 ^ (0x6B ^ 0) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }), g.BLADE);
        WEST_II_I = new GameEnum17(new RegionPoint(var2[13], var2[33], var2[14], b.G), var2[19], var2[1], new RegionPoint(var2[13], var2[34], var2[14], b.G), new RegionPoint(var2[19], var2[35], var2[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.var11(tileObject.getName().startsWith(var1[var2[19]]) ? 1 : 0) && e.var15(tileObject.getPlane(), var2[14])) {
                n2 = var2[2];
                0;
                if (((0x2C ^ 0x69) & ~(0x80 ^ 0xC5)) != 0) {
                    return ((0x47 ^ 0x26) & ~(0x18 ^ 0x79)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }), g.BLADE);
        WEST_II_VII = new GameEnum17(List.of(new Triple((Object)new RegionPoint(var2[26], var2[37], var2[2], b.I), (Object)var2[11], (Object)var2[11]), new Triple((Object)new RegionPoint(var2[26], var2[30], var2[2], b.I), (Object)var2[11], (Object)var2[8])), new RegionPoint(var2[2], var2[33], var2[2], b.G), new RegionPoint(var2[38], var2[39], var2[2], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.var11(tileObject.getName().startsWith(var1[var2[18]]) ? 1 : 0) && e.var15(tileObject.getPlane(), var2[2])) {
                n2 = var2[2];
                0;
                if (1 >= (0x55 ^ 0x51)) {
                    return ((1 ^ 0x40) & ~(0xED ^ 0xAC)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }), g.BLADE_II);
        SOUTH_II_III = new GameEnum17(new RegionPoint(var2[11], var2[6], var2[14], b.G), var2[9], var2[2], new RegionPoint(var2[11], var2[6], var2[14], b.G), new RegionPoint(var2[6], var2[3], var2[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.var11(tileObject.getName().startsWith(var1[var2[8]]) ? 1 : 0) && e.var15(tileObject.getPlane(), var2[14])) {
                n2 = var2[2];
                0;
                if (1 == 3) {
                    return ((0xC6 ^ 0x91) & ~(0x19 ^ 0x4E)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }), g.BLADE_III);
        NORTH_II_III = new GameEnum17(new RegionPoint(var2[42], var2[43], var2[14], b.G), var2[19], var2[9], new RegionPoint(var2[21], var2[43], var2[14], b.G), new RegionPoint(var2[24], var2[44], var2[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.var11(tileObject.getName().startsWith(var1[var2[17]]) ? 1 : 0) && e.var15(tileObject.getPlane(), var2[14])) {
                n2 = var2[2];
                0;
                if (((0x33 ^ 0x6C) & ~(0x17 ^ 0x48)) > 3) {
                    return ((0x55 ^ 4) & ~(6 ^ 0x57)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }), g.BLADE_IV);
        NORTH_III_V = new GameEnum17(new RegionPoint(var2[45], var2[7], var2[14], b.J), var2[9], var2[9], new RegionPoint(var2[45], var2[4], var2[14], b.J), new RegionPoint(var2[46], var2[40], var2[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.var11(tileObject.getName().startsWith(var1[var2[16]]) ? 1 : 0) && e.var15(tileObject.getPlane(), var2[14])) {
                n2 = var2[2];
                0;
                if (1 > 1) {
                    return ((0x1E ^ 0x42 ^ (0x69 ^ 0x71)) & (0x63 ^ 0xA ^ (0x8C ^ 0xA1) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_II);
        WEST_III_III = new GameEnum17(new RegionPoint(var2[1], var2[48], var2[14], b.J), var2[19], var2[7], new RegionPoint(var2[1], var2[29], var2[14], b.J), new RegionPoint(var2[1], var2[46], var2[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.var11(tileObject.getName().startsWith(var1[var2[15]]) ? 1 : 0) && e.var15(tileObject.getPlane(), var2[14])) {
                n2 = var2[2];
                0;
                if null != null {
                    return ((214 + 155 - 148 + 31 ^ 89 + 162 - 156 + 73) & (0 ^ 0x39 ^ (0x18 ^ 0x75) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_I);
        NORTH_III_III = new GameEnum17(List.of(new Triple((Object)new RegionPoint(var2[49], var2[49], var2[14], b.J), (Object)var2[9], (Object)var2[17]), new Triple((Object)new RegionPoint(var2[26], var2[30], var2[2], b.I), (Object)var2[11], (Object)var2[8])), new RegionPoint(var2[48], var2[50], var2[14], b.J), new RegionPoint(var2[51], var2[35], var2[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.var11(tileObject.getName().startsWith(var1[var2[11]]) ? 1 : 0) && e.var15(tileObject.getPlane(), var2[14])) {
                n2 = var2[2];
                0;
                if ((0x39 ^ 0x3D) < ((0x20 ^ 0x67) & ~(0x17 ^ 0x50))) {
                    return ((0x96 ^ 0x9A) & ~(0xA8 ^ 0xA4)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_I);
        WEST_III_VI = new GameEnum17(List.of(new Triple((Object)new RegionPoint(var2[1], var2[6], var2[14], b.J), (Object)var2[9], (Object)var2[17]), new Triple((Object)new RegionPoint(var2[1], var2[9], var2[14], b.J), (Object)var2[9], (Object)var2[17])), new RegionPoint(var2[11], var2[6], var2[14], b.J), new RegionPoint(var2[10], var2[5], var2[14], b.J), () -> {
            String[] stringArray = new String[var2[2]];
            stringArray[e.var2[0]] = var1[var2[5]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_III);
        NORTH_IV_III = new GameEnum17(new RegionPoint(var2[8], var2[30], var2[14], b.L), var2[7], var2[17], new RegionPoint(var2[8], var2[46], var2[14], b.L), new RegionPoint(var2[19], var2[26], var2[14], b.L), () -> {
            String[] stringArray = new String[var2[2]];
            stringArray[e.var2[0]] = var1[var2[1]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_IV);
        SOUTH_IV_VI = new GameEnum17(new RegionPoint(var2[5], var2[8], var2[14], b.L), var2[11], var2[11], new RegionPoint(var2[8], var2[8], var2[14], b.L), new RegionPoint(var2[47], var2[45], var2[14], b.M), () -> {
            String[] stringArray = new String[var2[2]];
            stringArray[e.var2[0]] = var1[var2[9]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_V);
        WEST_IV_I = new GameEnum17(new RegionPoint(var2[36], var2[25], var2[2], b.L), var2[16], var2[9], new RegionPoint(var2[36], var2[12], var2[2], b.L), new RegionPoint(var2[15], var2[39], var2[2], b.L), () -> {
            String[] stringArray = new String[var2[2]];
            stringArray[e.var2[0]] = var1[var2[14]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_VI);
        TOP_V_IV = new GameEnum17(new RegionPoint(var2[11], var2[45], var2[14], b.N), var2[25], var2[11], new RegionPoint(var2[11], var2[45], var2[14], b.N), new RegionPoint(var2[5], var2[24], var2[14], b.N), () -> {
            String[] stringArray = new String[var2[2]];
            stringArray[e.var2[0]] = var1[var2[2]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLUE_BLADE_I);
        MIDDLE_V_XI = new GameEnum17(new RegionPoint(var2[23], var2[45], var2[2], b.N), var2[6], var2[11], new RegionPoint(var2[29], var2[45], var2[2], b.N), new RegionPoint(var2[51], var2[24], var2[2], b.N), () -> {
            String[] stringArray = new String[var2[2]];
            stringArray[e.var2[0]] = var1[var2[0]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLUE_BLADE_II);
        e[] eArray = new e[var2[4]];
        eArray[e.var2[0]] = WEST_I_III;
        eArray[e.var2[2]] = SOUTH_I_I;
        eArray[e.var2[14]] = EAST_I_III;
        eArray[e.var2[9]] = WEST_II_I;
        eArray[e.var2[1]] = WEST_II_VII;
        eArray[e.var2[5]] = SOUTH_II_III;
        eArray[e.var2[11]] = NORTH_II_III;
        eArray[e.var2[15]] = NORTH_III_V;
        eArray[e.var2[16]] = WEST_III_III;
        eArray[e.var2[17]] = NORTH_III_III;
        eArray[e.var2[8]] = WEST_III_VI;
        eArray[e.var2[18]] = NORTH_IV_III;
        eArray[e.var2[19]] = SOUTH_IV_VI;
        eArray[e.var2[3]] = WEST_IV_I;
        eArray[e.var2[7]] = TOP_V_IV;
        eArray[e.var2[6]] = MIDDLE_V_XI;
        $VALUES = eArray;
    }

    private static String var36(String var37, String var38) {
        var37 = new String(Base64.getDecoder().decode(var37.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var39 = new StringBuilder();
        char[] var40 = var38.toCharArray();
        int var41 = var2[0];
        char[] var42 = var37.toCharArray();
        int var43 = var42.length;
        int var44 = var2[0];
        while (e.var9(var44, var43)) {
            char var45 = var42[var44];
            var39.append((char)(var45 ^ var40[var41 % var40.length]));
            0;
            ++var41;
            ++var44;
            0;
            if ((46 + 73 - -29 + 34 ^ 144 + 39 - 181 + 177) > 0) continue;
            return null;
        }
        return String.valueOf(var39);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2) {
        e var46;
        J j2 = d2.b(this.object.get());
        if (e.var31(j2)) {
            return var2[0];
        }
        Player var47 = Players.getLocal();
        if (e.var31(var47)) {
            return var2[0];
        }
        if (e.var32(var47.getWorldLocation().equals((Object)var46.startPoint.get()) ? 1 : 0)) {
            return var2[0];
        }
        switch (f.S[var46.type.ordinal()]) {
            case 1: {
                void var48;
                if (e.var15(var48.aG(), b.s) && !e.var35(var48.aF(), var2[1]) || e.var15(var48.aG(), b.v)) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && !e.var20(var48.aF(), var2[3]) || !e.var34(var48.aG(), b.t) || e.var15(var48.aG(), b.w)) {
                    return var2[2];
                }
                return var2[0];
            }
            case 2: {
                void var48;
                if (e.var15(var48.aG(), b.s)) {
                    return var2[2];
                }
                return var2[0];
            }
            case 3: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[4])) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.t)) {
                    return var2[2];
                }
                return var2[0];
            }
            case 4: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[5])) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[6])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 5: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[5])) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[4])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 6: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[5])) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[7])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 7: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[1])) {
                    return var2[2];
                }
                if (!e.var34(var48.aG(), b.u) || e.var15(var48.aG(), b.v)) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[8])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 8: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[9])) {
                    return var2[2];
                }
                if (!e.var34(var48.aG(), b.u) || e.var15(var48.aG(), b.v)) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[7])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 9: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[6])) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[9])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 10: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[9])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 11: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[10])) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[11])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 12: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[12])) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[11])) {
                    return var2[2];
                }
                return var2[0];
            }
            case 13: {
                void var48;
                if (e.var15(var48.aG(), b.s) && e.var49(var48.aF(), var2[13])) {
                    return var2[2];
                }
                if (e.var15(var48.aG(), b.s) && e.var9(var48.aF(), var2[11])) {
                    return var2[2];
                }
                return var2[0];
            }
        }
        return var2[0];
    }

    private static boolean var49(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var31(Object object) {
        return object == null;
    }
}

