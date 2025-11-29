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

import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum21;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;
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

public final class GameEnum2
extends Enum<t> {
    
     Supplier<List<WorldArea>> startAreas;
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ t COFFIN_V_III;
    public static final  /* enum */ t COFFIN_V_I;
     Supplier<WorldPoint> destination;
    
    private static final  t[] $VALUES;
     u type;
    public static final  /* enum */ t COFFIN_IV_I_NORTH;
    public static final  /* enum */ t FINAL_COFFIN;
    public static final  /* enum */ t COFFIN_IV_II_;
    public static final  /* enum */ t COFFIN_V_II;
     Supplier<WorldArea> lootArea;
    public static final  /* enum */ t COFFIN_IV_I_SOUTH;

    private GameEnum2(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, int n3, int n4, u u2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var3 = list.iterator();
            while (t.var4(var3.hasNext() ? 1 : 0)) {
                void var5;
                Triple var6 = (Triple)var3.next();
                var5.add(new WorldArea(SquireSepulchre.a((RegionPoint)var6.getFirst()), ((Integer)var6.getSecond()).intValue(), ((Integer)var6.getThird()).intValue()));
                0;
                0;
                if (-3 < 0) continue;
                return null;
            }
            return arrayList;
        };
        this.type = u2;
        this.lootArea = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var6_6;
        void var15;
        void var16;
        t var17;
        Player player = Players.getLocal();
        if (t.var18(player)) {
            return var1[0];
        }
        if (t.var7(var17.a((Locatable)var16) ? 1 : 0)) {
            return var1[0];
        }
        System.out.println(var2[var1[0]]);
        TileObject var19 = null;
        int var20 = var15.c();
        System.out.println("Time: " + var20);
        TileObject var21 = null;
        if (t.var22(var20, var1[1])) {
            var21 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.var4(tileObject.getName().equals(var2[var1[38]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[t.var1[0]] = var2[var1[39]];
                    if (t.var4(tileObject.hasAction(stringArray) ? 1 : 0) && t.var4(this.d((Locatable)tileObject) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (-(0x85 ^ 0x81) <= 0) return n2 != 0;
                        return ((0x3C ^ 0x2D) & ~(0x60 ^ 0x71)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
        }
        if (t.var23((Object)var17.type, (Object)u.HOLY_BARRIER)) {
            var19 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.var4(tileObject.getName().toLowerCase().equals(var2[var1[36]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[t.var1[0]] = var2[var1[37]];
                    if (t.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (3 >= 1) return n2 != 0;
                        return ((0x1C ^ 7 ^ (0x12 ^ 0x15)) & (0x50 ^ 3 ^ (0xF0 ^ 0xBF) ^ -1)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            0;
            if (3 < -1) {
                return ((0xDF ^ 0x9C) & ~(0x64 ^ 0x27)) != 0;
            }
        } else if (t.var23((Object)var17.type, (Object)u.FIX_BRIDGE)) {
            var19 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.var4(tileObject.getName().toLowerCase().contains(var2[var1[33]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[2]];
                    stringArray[t.var1[0]] = var2[var1[34]];
                    stringArray[t.var1[1]] = var2[var1[35]];
                    if (t.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (((0x67 ^ 0x7E) & ~(0x33 ^ 0x2A)) <= 0) return n2 != 0;
                        return ((0x47 ^ 9) & ~(0xD5 ^ 0x9B)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            0;
            if null != null {
                return ((0x51 ^ 9) & ~(0x4A ^ 0x12)) != 0;
            }
        } else if (t.var23((Object)var17.type, (Object)u.CAST_PORTAL)) {
            var19 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.var4(tileObject.getName().toLowerCase().contains(var2[var1[30]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[2]];
                    stringArray[t.var1[0]] = var2[var1[31]];
                    stringArray[t.var1[1]] = var2[var1[32]];
                    if (t.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (((0x86 ^ 0x8F) & ~(0x89 ^ 0x80)) != -1) return n2 != 0;
                        return ((0x28 ^ 0x3B) & ~(0xD5 ^ 0xC6)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            0;
            if (-1 > (0x79 ^ 0x7D)) {
                return (3 & ~3) != 0;
            }
        } else if (t.var23((Object)var17.type, (Object)u.BRAZIER)) {
            var19 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.var4(tileObject.getName().toLowerCase().contains(var2[var1[28]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[t.var1[0]] = var2[var1[29]];
                    if (t.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (-1 < (13 + 46 - -51 + 18 ^ 41 + 4 - -45 + 42)) return n2 != 0;
                        return ((0x51 ^ 0x25 ^ (0x52 ^ 0x66)) & (0xE8 ^ 0x9D ^ (0 ^ 0x35) ^ -1)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            0;
            if (-(0x34 ^ 0x61 ^ (0x24 ^ 0x75)) > 0) {
                return ((0x35 ^ 0x21 ^ (6 ^ 0x2F)) & (0x45 ^ 0x1D ^ (0x67 ^ 2) ^ -1)) != 0;
            }
        } else if (t.var23((Object)var17.type, (Object)u.GRAPPLE)) {
            var19 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.var4(tileObject.getName().toLowerCase().contains(var2[var1[26]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[t.var1[0]] = var2[var1[27]];
                    if (t.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (3 >= -1) return n2 != 0;
                        return (3 & (3 ^ -1)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
        }
        if (t.var18(var19)) {
            System.out.println(var2[var1[1]]);
            if (t.var24((Object)var17.type, (Object)u.BRAZIER)) {
                return var1[0];
            }
            var19 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.var4(tileObject.getName().toLowerCase().equals(var2[var1[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[t.var1[0]] = var2[var1[25]];
                    if (t.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if ((2 & ~2) < 2) return n2 != 0;
                        return ((0 ^ 0x1A) & ~(0x1E ^ 4)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            if (t.var18(var19)) {
                return var1[0];
            }
        }
        if (t.var7(var17.d((Locatable)var16) ? 1 : 0)) {
            if (t.var18(var21)) {
                System.out.println(var2[var1[2]]);
                return var1[0];
            }
            if (t.var23((Object)var17.type, (Object)u.FIX_BRIDGE)) {
                if (!t.var4(a.k() ? 1 : 0) || !t.var4(a.m() ? 1 : 0) || !t.var4(a.n() ? 1 : 0) || t.var7(a.l() ? 1 : 0)) {
                    System.out.println(var2[var1[3]]);
                    return var1[0];
                }
            } else if (t.var23((Object)var17.type, (Object)u.CAST_PORTAL)) {
                if (t.var7(a.a(var15.a()) ? 1 : 0)) {
                    System.out.println(var2[var1[4]]);
                    return var1[0];
                }
            } else if (t.var23((Object)var17.type, (Object)u.BRAZIER)) {
                if (t.var18(var19)) {
                    System.out.println(var2[var1[5]]);
                    return var1[0];
                }
                if (t.var7(a.o() ? 1 : 0)) {
                    System.out.println(var2[var1[6]]);
                    return var1[0];
                }
            } else if (t.var23((Object)var17.type, (Object)u.GRAPPLE)) {
                if (t.var18(var19)) {
                    System.out.println(var2[var1[7]]);
                    return var1[0];
                }
                if (t.var7(a.p() ? 1 : 0)) {
                    System.out.println(var2[var1[8]]);
                    return var1[0];
                }
            }
            String[] stringArray = new String[var1[6]];
            stringArray[t.var1[0]] = var2[var1[9]];
            stringArray[t.var1[1]] = var2[var1[10]];
            stringArray[t.var1[2]] = var2[var1[11]];
            stringArray[t.var1[3]] = var2[var1[12]];
            stringArray[t.var1[4]] = var2[var1[13]];
            stringArray[t.var1[5]] = var2[var1[14]];
            var19.interact(stringArray);
            return var1[1];
        }
        if (t.var18(var21)) {
            System.out.println(var2[var1[15]]);
            String[] stringArray = new String[var1[6]];
            stringArray[t.var1[0]] = var2[var1[16]];
            stringArray[t.var1[1]] = var2[var1[17]];
            stringArray[t.var1[2]] = var2[var1[18]];
            stringArray[t.var1[3]] = var2[var1[19]];
            stringArray[t.var1[4]] = var2[var1[20]];
            stringArray[t.var1[5]] = var2[var1[21]];
            var19.interact(stringArray);
            return var1[1];
        }
        System.out.println(var2[var1[22]]);
        var6_6.interact(var2[var1[23]]);
        return var1[1];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static void var25() {
        var1 = new int[51];
        t.var1[0] = (0xE ^ 0x4E ^ (0x98 ^ 0xC3)) & (0xEF ^ 0xC7 ^ (0x1B ^ 0x28) ^ -1);
        t.var1[1] = 1;
        t.var1[2] = 2;
        t.var1[3] = 3;
        t.var1[4] = 0x94 ^ 0x90;
        t.var1[5] = 0x1A ^ 0x7A ^ (0x46 ^ 0x23);
        t.var1[6] = 0x91 ^ 0x97;
        t.var1[7] = 0x6C ^ 0x7B ^ (0x81 ^ 0x91);
        t.var1[8] = 71 + 115 - 132 + 73 ^ (0x5E ^ 0x29);
        t.var1[9] = 0x75 ^ 0x7C;
        t.var1[10] = 5 + 32 - -104 + 10 ^ 136 + 126 - 171 + 66;
        t.var1[11] = 0xC1 ^ 0x99 ^ (0xFF ^ 0xAC);
        t.var1[12] = 0x8F ^ 0x83;
        t.var1[13] = 0x1F ^ 0x37 ^ (0x59 ^ 0x7C);
        t.var1[14] = 109 + 103 - 134 + 66 ^ 35 + 95 - -26 + 2;
        t.var1[15] = 0xAB ^ 0xA4;
        t.var1[16] = 0xD1 ^ 0xC1;
        t.var1[17] = 11 + 132 - 29 + 36 ^ 24 + 50 - 31 + 92;
        t.var1[18] = 0x43 ^ 0x39 ^ (0x6D ^ 5);
        t.var1[19] = 0x22 ^ 0x31;
        t.var1[20] = 0x21 ^ 0x35;
        t.var1[21] = 2 ^ 0x17;
        t.var1[22] = 24 + 78 - -29 + 82 ^ 122 + 183 - 190 + 80;
        t.var1[23] = 0x90 ^ 0x87;
        t.var1[24] = 0xA8 ^ 0xB0;
        t.var1[25] = 0x9A ^ 0x83;
        t.var1[26] = 0x47 ^ 0x5D;
        t.var1[27] = 0x6C ^ 0x77;
        t.var1[28] = 0x80 ^ 0x8A ^ (0xA1 ^ 0xB7);
        t.var1[29] = 174 + 109 - 192 + 127 ^ 157 + 101 - 120 + 61;
        t.var1[30] = 0xD9 ^ 0xC7;
        t.var1[31] = 0xBA ^ 0x8E ^ (0xE8 ^ 0xC3);
        t.var1[32] = 44 + 27 - 24 + 88 ^ 152 + 132 - 263 + 146;
        t.var1[33] = 0xC6 ^ 0xAD ^ (0x29 ^ 0x63);
        t.var1[34] = 84 + 115 - 106 + 54 ^ 15 + 33 - 3 + 132;
        t.var1[35] = 0x61 ^ 0x42;
        t.var1[36] = 0x6C ^ 0x48;
        t.var1[37] = 32 + 12 - 28 + 148 ^ 80 + 125 - 117 + 41;
        t.var1[38] = 0x41 ^ 0x67;
        t.var1[39] = 0x8F ^ 0xA8;
        t.var1[40] = 0 + 70 - -38 + 39 ^ 135 + 163 - 288 + 177;
        t.var1[41] = 0x12 ^ 0x2A;
        t.var1[42] = 0x7D ^ 0x29 ^ (0x2D ^ 0x4C);
        t.var1[43] = 0xA6 ^ 0x8F;
        t.var1[44] = 45 + 144 - 55 + 17 ^ 154 + 18 - 55 + 50;
        t.var1[45] = 0x6A ^ 0x53 ^ (0x2A ^ 0x39);
        t.var1[46] = 0x5A ^ 9 ^ (0xC8 ^ 0xB0);
        t.var1[47] = 0x25 ^ 9;
        t.var1[48] = 0x4F ^ 0x19 ^ (0x33 ^ 0x48);
        t.var1[49] = 0x63 ^ 0x4D;
        t.var1[50] = 166 + 107 - 236 + 131 ^ 90 + 29 - 91 + 107;
    }

    private static boolean var24(Object object, Object object2) {
        return object != object2;
    }

    private GameEnum2(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, int n5, int n6, BooleanSupplier booleanSupplier, u u2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.type = u2;
        this.lootArea = () -> new WorldArea(SquireSepulchre.a(regionPoint2), n5, n6);
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        t var26;
        if (t.var4(this.lootArea.get().contains(locatable) ? 1 : 0)) {
            return var1[1];
        }
        Iterator<WorldArea> var27 = var26.startAreas.get().iterator();
        while (t.var4(var27.hasNext() ? 1 : 0)) {
            void var28;
            WorldArea var29 = var27.next();
            if (t.var4(var29.contains((Locatable)var28) ? 1 : 0)) {
                return var1[1];
            }
            0;
            if ((0x78 ^ 0x7C) > 2) continue;
            return ((0x8E ^ 0xA1) & ~(0x57 ^ 0x78)) != 0;
        }
        return var1[0];
    }

    private static boolean var23(Object object, Object object2) {
        return object == object2;
    }

    public boolean d(Locatable locatable) {
        return this.lootArea.get().contains(locatable);
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    static {
        t.var25();
        t.var30();
        COFFIN_IV_I_SOUTH = new GameEnum2(new RegionPoint(var1[41], var1[13], var1[2], b.L), var1[3], var1[8], new RegionPoint(var1[42], var1[25], var1[2], b.L), var1[9], var1[4], u.FIX_BRIDGE);
        COFFIN_IV_I_NORTH = new GameEnum2(new RegionPoint(var1[44], var1[35], var1[2], b.L), var1[9], var1[10], new RegionPoint(var1[42], var1[28], var1[2], b.L), var1[9], var1[4], u.CAST_PORTAL);
        COFFIN_IV_II_ = new GameEnum2(List.of(new Triple((Object)new RegionPoint(var1[31], var1[5], var1[1], b.L), (Object)var1[3], (Object)var1[16]), new Triple((Object)new RegionPoint(var1[34], var1[17], var1[1], b.L), (Object)var1[8], (Object)var1[3])), new RegionPoint(var1[45], var1[15], var1[1], b.L), var1[9], var1[7], u.BRAZIER);
        COFFIN_V_I = new GameEnum2(new RegionPoint(var1[6], var1[2], var1[1], b.N), var1[10], var1[11], new RegionPoint(var1[21], var1[7], var1[1], b.N), var1[9], var1[9], u.CAST_PORTAL);
        COFFIN_V_II = new GameEnum2(new RegionPoint(var1[42], var1[8], var1[1], b.N), var1[14], var1[8], new RegionPoint(var1[38], var1[7], var1[1], b.N), var1[7], var1[7], u.GRAPPLE);
        COFFIN_V_III = new GameEnum2(new RegionPoint(var1[3], var1[39], var1[0], b.N), var1[22], var1[12], new RegionPoint(var1[3], var1[19], var1[0], b.N), var1[8], var1[17], u.FIX_BRIDGE);
        FINAL_COFFIN = new GameEnum2(new RegionPoint(var1[30], var1[33], var1[0], b.N), var1[5], var1[4], new RegionPoint(var1[30], var1[27], var1[0], b.N), var1[5], var1[6], u.HOLY_BARRIER);
        t[] tArray = new t[var1[7]];
        tArray[t.var1[0]] = COFFIN_IV_I_SOUTH;
        tArray[t.var1[1]] = COFFIN_IV_I_NORTH;
        tArray[t.var1[2]] = COFFIN_IV_II_;
        tArray[t.var1[3]] = COFFIN_V_I;
        tArray[t.var1[4]] = COFFIN_V_II;
        tArray[t.var1[5]] = COFFIN_V_III;
        tArray[t.var1[6]] = FINAL_COFFIN;
        $VALUES = tArray;
    }

    private static boolean var22(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    public static t valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    private static void var30() {
        var2 = new String[var1[50]];
        t.var2[t.var1[0]] = "contains";
        t.var2[t.var1[1]] = "loot: interact is null";
        t.var2[t.var1[2]] = "coffin is null";
        t.var2[t.var1[3]] = "aint got items for bridge chief :(";
        t.var2[t.var1[4]] = "aint got items for portal chief :(";
        t.var2[t.var1[5]] = "interact is null hmmge";
        t.var2[t.var1[6]] = "aint got items for brazier :(";
        t.var2[t.var1[7]] = "interact is null hmmge";
        t.var2[t.var1[8]] = "aint got items for grapple :(";
        t.var2[t.var1[9]] = "Pass-through";
        t.var2[t.var1[10]] = "Fix";
        t.var2[t.var1[11]] = "Sacrifice";
        t.var2[t.var1[12]] = "Conjure";
        t.var2[t.var1[13]] = "Walk-over";
        t.var2[t.var1[14]] = "Grapple";
        t.var2[t.var1[15]] = "leaving area";
        t.var2[t.var1[16]] = "Pass-through";
        t.var2[t.var1[17]] = "Fix";
        t.var2[t.var1[18]] = "Sacrifice";
        t.var2[t.var1[19]] = "Conjure";
        t.var2[t.var1[20]] = "Walk-over";
        t.var2[t.var1[21]] = "Grapple";
        t.var2[t.var1[22]] = "looting coffin";
        t.var2[t.var1[23]] = "Search-for-traps";
        t.var2[t.var1[24]] = "holy barrier";
        t.var2[t.var1[25]] = "Pass-through";
        t.var2[t.var1[26]] = "pillar";
        t.var2[t.var1[27]] = "Grapple";
        t.var2[t.var1[28]] = "saradomin brazier";
        t.var2[t.var1[29]] = "Sacrifice";
        t.var2[t.var1[30]] = "portal";
        t.var2[t.var1[31]] = "Conjure";
        t.var2[t.var1[32]] = "Pass-through";
        t.var2[t.var1[33]] = "bridge";
        t.var2[t.var1[34]] = "Fix";
        t.var2[t.var1[35]] = "Walk-over";
        t.var2[t.var1[36]] = "holy barrier";
        t.var2[t.var1[37]] = "Pass-through";
        t.var2[t.var1[38]] = "Coffin";
        t.var2[t.var1[39]] = "Search-for-traps";
        t.var2[t.var1[40]] = "COFFIN_IV_I_SOUTH";
        t.var2[t.var1[43]] = "COFFIN_IV_I_NORTH";
        t.var2[t.var1[45]] = "COFFIN_IV_II_";
        t.var2[t.var1[46]] = "COFFIN_V_I";
        t.var2[t.var1[47]] = "COFFIN_V_II";
        t.var2[t.var1[48]] = "COFFIN_V_III";
        t.var2[t.var1[49]] = "FINAL_COFFIN";
    }

    private GameEnum2(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, int n5, int n6, u u2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.type = u2;
        this.lootArea = () -> new WorldArea(SquireSepulchre.a(regionPoint2), n5, n6);
    }

    private static String var37(String var38, String var39) {
        var38 = new String(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var40 = new StringBuilder();
        char[] var41 = var39.toCharArray();
        int var42 = var1[0];
        char[] var43 = var38.toCharArray();
        int var44 = var43.length;
        int var45 = var1[0];
        while (t.var14(var45, var44)) {
            char var46 = var43[var45];
            var40.append((char)(var46 ^ var41[var42 % var41.length]));
            0;
            ++var42;
            ++var45;
            0;
            if ((0x6F ^ 0x6B) > 0) continue;
            return null;
        }
        return String.valueOf(var40);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }
}

