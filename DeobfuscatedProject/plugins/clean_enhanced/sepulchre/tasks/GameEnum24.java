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

import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.GameEnum26;
import gg.squire.sepulchre.tasks.JHelper;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class GameEnum24
extends Enum<A> {
    public static final  /* enum */ A EAST_I_I;
    public static final  /* enum */ A EAST_II_X;
    public static final  /* enum */ A NORTH_II_VIII;
    public static final  /* enum */ A EAST_III_VII;
    public static final  /* enum */ A WEST_I_I;
    public static final  /* enum */ A NORTH_I_II;
    public static final  /* enum */ A EAST_I_IV;
    public static final  /* enum */ A MIDDLE_V_VII;
    public static final  /* enum */ A NORTH_II_IX;
    public  Supplier<TileObject> object;
    public static final  /* enum */ A MIDDLE_V_X;
    public static final  /* enum */ A TOP_V_I;
    public static final  /* enum */ A SOUTH_IV_II;
    public static final  /* enum */ A SOUTH_I_III;
    public static final  /* enum */ A EAST_II_IX;
    public static final  /* enum */ A MIDDLE_V_IX;
    public static final  /* enum */ A EAST_II_III;
    public static final  /* enum */ A EAST_II_XI;
    public static final  /* enum */ A SOUTH_I_II_EXTEND;
    public static final  /* enum */ A NORTH_IV_VII;
    public static final  /* enum */ A WEST_II_V;
    public static final  /* enum */ A EAST_I_II;
    public static final  /* enum */ A SOUTH_IV_I;
    public static final  /* enum */ A WEST_III_II;
    private static final  A[] $VALUES;
    public static final  /* enum */ A MIDDLE_V_III;
    public static final  /* enum */ A EAST_I_V;
    public static final  /* enum */ A WEST_I_II;
     C type;
    public static final  /* enum */ A EAST_II_VIII;
    public static final  /* enum */ A NORTH_IV_VIII;
    public static final  /* enum */ A MIDDLE_V_VI;
    public static final  /* enum */ A NORTH_II_X;
    public static final  /* enum */ A EAST_II_II;
    public static final  /* enum */ A NORTH_I_III;
    public static final  /* enum */ A EAST_II_I;
    public static final  /* enum */ A WEST_II_IV;

     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ A SOUTH_I_II;
    public static final  /* enum */ A EAST_III_VI;
    public static final  /* enum */ A TOP_V_III;
    public static final  /* enum */ A NORTH_I_IV;
     Supplier<WorldPoint> destination;
    public static final  /* enum */ A TOP_V_II;
     Supplier<WorldPoint> startPoint;

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var3;
        void var4;
        void var5;
        A var6;
        Player player = Players.getLocal();
        if (A.var7(player)) {
            return var1[0];
        }
        if (A.var8(var6.a((Locatable)var5) ? 1 : 0)) {
            return var1[0];
        }
        var6.a((SquireSepulchre)var4);
        if (A.var9(var6.a((d)var3) ? 1 : 0)) {
            System.out.println(var2[var1[2]]);
            Movement.setDestination((WorldPoint)var6.destination.get());
            return var1[2];
        }
        Movement.setDestination((WorldPoint)this.startPoint.get());
        return var1[2];
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2) {
        A var11;
        void var12;
        J j2 = d2.b(this.object.get());
        if (A.var7(j2)) {
            System.out.println(var2[var1[0]]);
            return var1[0];
        }
        System.out.println("ID: " + var12.aG() + " | ticks:" + var12.aF());
        Player var13 = Players.getLocal();
        if (A.var7(var13)) {
            return var1[0];
        }
        if (A.var8(var13.getWorldLocation().equals((Object)var11.startPoint.get()) ? 1 : 0)) {
            return var1[0];
        }
        switch (B.U[var11.type.ordinal()]) {
            case 1: {
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[1])) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[3])) {
                    return var1[2];
                }
                return var1[0];
            }
            case 2: {
                if (A.var14(var12.aG(), b.o) && A.var15(var12.aF(), var1[1])) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.n)) {
                    return var1[2];
                }
                return var1[0];
            }
            case 3: {
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[1])) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[3])) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.n)) {
                    return var1[2];
                }
                return var1[0];
            }
            case 4: {
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[1])) {
                    return var1[2];
                }
                if (!A.var16(var12.aG(), b.p) || A.var14(var12.aG(), b.n)) {
                    return var1[2];
                }
                return var1[0];
            }
            case 5: {
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[1])) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.n)) {
                    return var1[2];
                }
                return var1[0];
            }
            case 6: {
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[1])) {
                    return var1[2];
                }
                return var1[0];
            }
            case 7: {
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[1])) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.p) && A.var17(var12.aF(), var1[4])) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.n)) {
                    return var1[2];
                }
                return var1[0];
            }
            case 8: {
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[1])) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.n)) {
                    return var1[2];
                }
                return var1[0];
            }
            case 9: {
                if (A.var14(var12.aG(), b.o) && A.var10(var12.aF(), var1[2])) {
                    return var1[2];
                }
                return var1[0];
            }
            case 10: {
                if (A.var14(var12.aG(), b.o) && A.var14(var12.aF(), var1[2])) {
                    return var1[2];
                }
                return var1[0];
            }
            case 11: {
                if (A.var14(var12.aG(), b.o) && (!A.var16(var12.aF(), var1[2]) || !A.var16(var12.aF(), var1[1])) || A.var14(var12.aG(), b.n)) {
                    return var1[2];
                }
                if (A.var14(var12.aG(), b.p) && A.var10(var12.aF(), var1[2]) && A.var17(var12.aF(), var1[4])) {
                    return var1[2];
                }
                return var1[0];
            }
        }
        return var1[0];
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    public Supplier<WorldPoint> al() {
        return this.startPoint;
    }

    private GameEnum24(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, C c2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object = supplier;
        this.type = c2;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(GameEnum24.class, string);
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

    private static void var30() {
        var2 = new String[var1[80]];
        A.var2[A.var1[0]] = "we null? wtf";
        A.var2[A.var1[2]] = "walking to start";
        A.var2[A.var1[1]] = "Wizard Statue";
        A.var2[A.var1[3]] = "Wizard Statue";
        A.var2[A.var1[4]] = "Wizard Statue";
        A.var2[A.var1[10]] = "Wizard Statue";
        A.var2[A.var1[12]] = "Wizard Statue";
        A.var2[A.var1[14]] = "Wizard Statue";
        A.var2[A.var1[16]] = "Wizard Statue";
        A.var2[A.var1[18]] = "Wizard Statue";
        A.var2[A.var1[21]] = "Wizard Statue";
        A.var2[A.var1[23]] = "Wizard Statue";
        A.var2[A.var1[25]] = "Wizard Statue";
        A.var2[A.var1[11]] = "Wizard Statue";
        A.var2[A.var1[27]] = "Wizard Statue";
        A.var2[A.var1[9]] = "Wizard Statue";
        A.var2[A.var1[30]] = "Wizard Statue";
        A.var2[A.var1[29]] = "Wizard Statue";
        A.var2[A.var1[32]] = "Wizard Statue";
        A.var2[A.var1[33]] = "Wizard Statue";
        A.var2[A.var1[34]] = "Wizard Statue";
        A.var2[A.var1[13]] = "Wizard Statue";
        A.var2[A.var1[35]] = "Wizard Statue";
        A.var2[A.var1[8]] = "Wizard Statue";
        A.var2[A.var1[24]] = "Wizard Statue";
        A.var2[A.var1[15]] = "Wizard Statue";
        A.var2[A.var1[37]] = "Wizard Statue";
        A.var2[A.var1[17]] = "Wizard Statue";
        A.var2[A.var1[40]] = "Wizard Statue";
        A.var2[A.var1[31]] = "Wizard Statue";
        A.var2[A.var1[42]] = "Wizard Statue";
        A.var2[A.var1[43]] = "Wizard Statue";
        A.var2[A.var1[44]] = "Wizard Statue";
        A.var2[A.var1[39]] = "Wizard Statue";
        A.var2[A.var1[45]] = "Wizard Statue";
        A.var2[A.var1[46]] = "Wizard Statue";
        A.var2[A.var1[19]] = "Wizard Statue";
        A.var2[A.var1[48]] = "Wizard Statue";
        A.var2[A.var1[49]] = "Wizard Statue";
        A.var2[A.var1[50]] = "Wizard Statue";
        A.var2[A.var1[28]] = "Wizard Statue";
        A.var2[A.var1[36]] = "WEST_I_I";
        A.var2[A.var1[7]] = "WEST_I_II";
        A.var2[A.var1[52]] = "NORTH_I_II";
        A.var2[A.var1[5]] = "NORTH_I_III";
        A.var2[A.var1[54]] = "NORTH_I_IV";
        A.var2[A.var1[55]] = "SOUTH_I_II";
        A.var2[A.var1[56]] = "SOUTH_I_II_EXTEND";
        A.var2[A.var1[57]] = "SOUTH_I_III";
        A.var2[A.var1[58]] = "EAST_I_I";
        A.var2[A.var1[26]] = "EAST_I_II";
        A.var2[A.var1[22]] = "EAST_I_IV";
        A.var2[A.var1[61]] = "EAST_I_V";
        A.var2[A.var1[41]] = "WEST_II_IV";
        A.var2[A.var1[6]] = "WEST_II_V";
        A.var2[A.var1[62]] = "EAST_II_I";
        A.var2[A.var1[20]] = "EAST_II_II";
        A.var2[A.var1[51]] = "EAST_II_III";
        A.var2[A.var1[38]] = "EAST_II_VIII";
        A.var2[A.var1[47]] = "EAST_II_IX";
        A.var2[A.var1[53]] = "EAST_II_X";
        A.var2[A.var1[63]] = "EAST_II_XI";
        A.var2[A.var1[59]] = "NORTH_II_VIII";
        A.var2[A.var1[60]] = "NORTH_II_IX";
        A.var2[A.var1[64]] = "NORTH_II_X";
        A.var2[A.var1[65]] = "EAST_III_VI";
        A.var2[A.var1[66]] = "EAST_III_VII";
        A.var2[A.var1[67]] = "WEST_III_II";
        A.var2[A.var1[68]] = "SOUTH_IV_I";
        A.var2[A.var1[69]] = "SOUTH_IV_II";
        A.var2[A.var1[70]] = "NORTH_IV_VII";
        A.var2[A.var1[71]] = "NORTH_IV_VIII";
        A.var2[A.var1[72]] = "TOP_V_I";
        A.var2[A.var1[73]] = "TOP_V_II";
        A.var2[A.var1[74]] = "TOP_V_III";
        A.var2[A.var1[75]] = "MIDDLE_V_III";
        A.var2[A.var1[76]] = "MIDDLE_V_VI";
        A.var2[A.var1[77]] = "MIDDLE_V_VII";
        A.var2[A.var1[78]] = "MIDDLE_V_IX";
        A.var2[A.var1[79]] = "MIDDLE_V_X";
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var31 = this.startAreas.get().iterator();
        while (A.var9(var31.hasNext() ? 1 : 0)) {
            void var32;
            WorldArea var33 = var31.next();
            if (A.var9(var33.contains((Locatable)var32) ? 1 : 0)) {
                return var1[2];
            }
            0;
            if null == null continue;
            return ((85 + 111 - 102 + 63 ^ 14 + 20 - -90 + 27) & (0x16 ^ 0x18 ^ (0x12 ^ 0x16) ^ -1)) != 0;
        }
        return var1[0];
    }

    private static boolean var15(int n2, int n3) {
        return n2 >= n3;
    }

    private GameEnum24(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, C c2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var34 = list.iterator();
            while (A.var9(var34.hasNext() ? 1 : 0)) {
                void var35;
                Triple var36 = (Triple)var34.next();
                var35.add(new WorldArea(SquireSepulchre.a((RegionPoint)var36.getFirst()), ((Integer)var36.getSecond()).intValue(), ((Integer)var36.getThird()).intValue()));
                0;
                0;
                if (3 < (0x83 ^ 0x87)) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object = supplier;
        this.type = c2;
    }

    static {
        A.var37();
        A.var30();
        WEST_I_I = new GameEnum24(new RegionPoint(var1[51], var1[14], var1[1], b.D), var1[11], var1[33], new RegionPoint(var1[4], var1[15], var1[1], b.C), new RegionPoint(var1[4], var1[19], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[28]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[12], var1[37], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        WEST_I_II = new GameEnum24(new RegionPoint(var1[3], var1[37], var1[1], b.C), var1[3], var1[23], new RegionPoint(var1[4], var1[19], var1[1], b.C), new RegionPoint(var1[0], var1[5], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[50]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[12], var1[37], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_II = new GameEnum24(new RegionPoint(var1[36], var1[53], var1[1], b.C), var1[3], var1[4], new RegionPoint(var1[7], var1[53], var1[1], b.C), new RegionPoint(var1[7], var1[22], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[49]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[5], var1[47], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_III = new GameEnum24(new RegionPoint(var1[36], var1[22], var1[1], b.C), var1[3], var1[18], new RegionPoint(var1[7], var1[22], var1[1], b.C), new RegionPoint(var1[7], var1[7], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[48]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[5], var1[47], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_IV = new GameEnum24(new RegionPoint(var1[36], var1[7], var1[1], b.C), var1[3], var1[18], new RegionPoint(var1[7], var1[7], var1[1], b.C), new RegionPoint(var1[7], var1[48], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[19]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[5], var1[47], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        SOUTH_I_II = new GameEnum24(List.of(new Triple((Object)new RegionPoint(var1[33], var1[0], var1[1], b.C), (Object)var1[37], (Object)var1[3]), new Triple((Object)new RegionPoint(var1[35], var1[3], var1[1], b.C), (Object)var1[30], (Object)var1[16])), new RegionPoint(var1[43], var1[21], var1[1], b.C), new RegionPoint(var1[43], var1[27], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[46]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[31], var1[23], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        SOUTH_I_II_EXTEND = new GameEnum24(new RegionPoint(var1[43], var1[23], var1[1], b.C), var1[3], var1[4], new RegionPoint(var1[43], var1[27], var1[1], b.C), new RegionPoint(var1[44], var1[32], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[45]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[31], var1[23], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        SOUTH_I_III = new GameEnum24(new RegionPoint(var1[43], var1[9], var1[1], b.C), var1[3], var1[4], new RegionPoint(var1[44], var1[32], var1[1], b.C), new RegionPoint(var1[44], var1[35], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[39]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[31], var1[23], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_I_I = new GameEnum24(new RegionPoint(var1[38], var1[41], var1[1], b.C), var1[25], var1[16], new RegionPoint(var1[47], var1[41], var1[1], b.C), new RegionPoint(var1[47], var1[54], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[44]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[20], var1[22], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        EAST_I_II = new GameEnum24(new RegionPoint(var1[38], var1[54], var1[1], b.C), var1[3], var1[16], new RegionPoint(var1[47], var1[54], var1[1], b.C), new RegionPoint(var1[59], var1[45], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[43]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[20], var1[22], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        EAST_I_IV = new GameEnum24(List.of(new Triple((Object)new RegionPoint(var1[60], var1[35], var1[1], b.C), (Object)var1[4], (Object)var1[30]), new Triple((Object)new RegionPoint(var1[20], var1[30], var1[1], b.C), (Object)var1[14], (Object)var1[25])), new RegionPoint(var1[20], var1[32], var1[1], b.C), new RegionPoint(var1[22], var1[32], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[42]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[41], var1[27], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_I_V = new GameEnum24(new RegionPoint(var1[22], var1[30], var1[1], b.C), var1[10], var1[3], new RegionPoint(var1[22], var1[32], var1[1], b.C), new RegionPoint(var1[54], var1[42], var1[1], b.C), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[31]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[41], var1[9], var1[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        WEST_II_IV = new GameEnum24(new RegionPoint(var1[62], var1[19], var1[1], b.I), var1[16], var1[21], new RegionPoint(var1[51], var1[19], var1[1], b.I), new RegionPoint(var1[51], var1[44], var1[1], b.I), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[40]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[38], var1[39], var1[1], b.I)), (String[])stringArray);
        }, C.STATUE_SHORT);
        WEST_II_V = new GameEnum24(new RegionPoint(var1[62], var1[44], var1[1], b.I), var1[3], var1[4], new RegionPoint(var1[51], var1[44], var1[1], b.I), new RegionPoint(var1[63], var1[13], var1[1], b.I), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[17]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[38], var1[39], var1[1], b.I)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_I = new GameEnum24(new RegionPoint(var1[19], var1[43], var1[1], b.G), var1[10], var1[3], new RegionPoint(var1[28], var1[44], var1[1], b.G), new RegionPoint(var1[5], var1[44], var1[1], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[37]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[36], var1[31], var1[1], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_II = new GameEnum24(new RegionPoint(var1[36], var1[43], var1[1], b.G), var1[4], var1[3], new RegionPoint(var1[5], var1[44], var1[1], b.G), new RegionPoint(var1[26], var1[44], var1[1], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[15]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[36], var1[31], var1[1], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_III = new GameEnum24(new RegionPoint(var1[54], var1[43], var1[1], b.G), var1[12], var1[3], new RegionPoint(var1[26], var1[44], var1[1], b.G), new RegionPoint(var1[51], var1[8], var1[1], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[24]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[36], var1[31], var1[1], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_VIII = new GameEnum24(new RegionPoint(var1[38], var1[12], var1[2], b.G), var1[3], var1[11], new RegionPoint(var1[47], var1[32], var1[2], b.G), new RegionPoint(var1[47], var1[15], var1[2], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[8]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[20], var1[33], var1[2], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_IX = new GameEnum24(new RegionPoint(var1[38], var1[33], var1[2], b.G), var1[3], var1[14], new RegionPoint(var1[47], var1[15], var1[2], b.G), new RegionPoint(var1[26], var1[44], var1[2], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[35]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[20], var1[33], var1[2], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_X = new GameEnum24(new RegionPoint(var1[26], var1[37], var1[2], b.G), var1[33], var1[21], new RegionPoint(var1[26], var1[44], var1[2], b.G), new RegionPoint(var1[55], var1[44], var1[2], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[13]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[20], var1[33], var1[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_XI = new GameEnum24(new RegionPoint(var1[55], var1[43], var1[2], b.G), var1[4], var1[3], new RegionPoint(var1[55], var1[44], var1[2], b.G), new RegionPoint(var1[7], var1[44], var1[2], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[34]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[20], var1[33], var1[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_VIII = new GameEnum24(new RegionPoint(var1[35], var1[38], var1[2], b.G), var1[27], var1[10], new RegionPoint(var1[44], var1[38], var1[2], b.G), new RegionPoint(var1[44], var1[41], var1[2], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[33]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[31], var1[20], var1[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_IX = new GameEnum24(new RegionPoint(var1[43], var1[41], var1[2], b.G), var1[3], var1[10], new RegionPoint(var1[44], var1[41], var1[2], b.G), new RegionPoint(var1[44], var1[58], var1[2], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[32]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[31], var1[20], var1[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_X = new GameEnum24(new RegionPoint(var1[43], var1[58], var1[2], b.G), var1[3], var1[4], new RegionPoint(var1[44], var1[58], var1[2], b.G), new RegionPoint(var1[44], var1[36], var1[2], b.G), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[29]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[31], var1[20], var1[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_III_VI = new GameEnum24(List.of(new Triple((Object)new RegionPoint(var1[26], var1[27], var1[1], b.J), (Object)var1[3], (Object)var1[9]), new Triple((Object)new RegionPoint(var1[7], var1[13], var1[1], b.J), (Object)var1[16], (Object)var1[10])), new RegionPoint(var1[7], var1[13], var1[1], b.J), new RegionPoint(var1[7], var1[29], var1[1], b.J), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[30]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[28], var1[29], var1[1], b.J)), (String[])stringArray);
        }, C.STATUE_GOLD_SHORT);
        EAST_III_VII = new GameEnum24(new RegionPoint(var1[7], var1[29], var1[1], b.J), var1[3], var1[4], new RegionPoint(var1[7], var1[29], var1[1], b.J), new RegionPoint(var1[7], var1[18], var1[1], b.J), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[9]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[28], var1[23], var1[1], b.J)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        WEST_III_II = new GameEnum24(new RegionPoint(var1[23], var1[49], var1[1], b.J), var1[18], var1[21], new RegionPoint(var1[23], var1[56], var1[1], b.J), new RegionPoint(var1[23], var1[51], var1[1], b.J), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[27]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[18], var1[26], var1[1], b.J)), (String[])stringArray);
        }, C.STATUE);
        SOUTH_IV_I = new GameEnum24(new RegionPoint(var1[37], var1[29], var1[1], b.L), var1[18], var1[25], new RegionPoint(var1[37], var1[33], var1[1], b.L), new RegionPoint(var1[33], var1[33], var1[1], b.L), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[11]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[24], var1[9], var1[1], b.L)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        SOUTH_IV_II = new GameEnum24(new RegionPoint(var1[33], var1[29], var1[1], b.L), var1[14], var1[3], new RegionPoint(var1[33], var1[33], var1[1], b.L), new RegionPoint(var1[12], var1[9], var1[1], b.L), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[25]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[24], var1[9], var1[1], b.L)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        NORTH_IV_VII = new GameEnum24(new RegionPoint(var1[44], var1[41], var1[1], b.L), var1[21], var1[3], new RegionPoint(var1[44], var1[6], var1[1], b.L), new RegionPoint(var1[8], var1[6], var1[1], b.L), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[23]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[19], var1[22], var1[1], b.L)), (String[])stringArray);
        }, C.STATUE_STRICT);
        NORTH_IV_VIII = new GameEnum24(new RegionPoint(var1[8], var1[41], var1[1], b.L), var1[21], var1[3], new RegionPoint(var1[8], var1[6], var1[1], b.L), new RegionPoint(var1[30], var1[57], var1[1], b.L), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[21]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[19], var1[20], var1[1], b.L)), (String[])stringArray);
        }, C.STATUE_SHORT);
        TOP_V_I = new GameEnum24(new RegionPoint(var1[31], var1[22], var1[1], b.N), var1[12], var1[21], new RegionPoint(var1[31], var1[51], var1[1], b.N), new RegionPoint(var1[17], var1[51], var1[1], b.N), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[18]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[17], var1[6], var1[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_I);
        TOP_V_II = new GameEnum24(new RegionPoint(var1[17], var1[20], var1[1], b.N), var1[1], var1[3], new RegionPoint(var1[17], var1[51], var1[1], b.N), new RegionPoint(var1[8], var1[51], var1[1], b.N), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[16]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[15], var1[6], var1[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_III);
        TOP_V_III = new GameEnum24(new RegionPoint(var1[8], var1[20], var1[1], b.N), var1[4], var1[3], new RegionPoint(var1[8], var1[51], var1[1], b.N), new RegionPoint(var1[12], var1[41], var1[1], b.N), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[14]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[13], var1[6], var1[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_III = new GameEnum24(new RegionPoint(var1[3], var1[49], var1[2], b.N), var1[21], var1[13], new RegionPoint(var1[25], var1[20], var1[2], b.N), new RegionPoint(var1[9], var1[20], var1[2], b.N), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[12]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[11], var1[6], var1[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_SHORT);
        MIDDLE_V_VI = new GameEnum24(new RegionPoint(var1[11], var1[20], var1[2], b.N), var1[3], var1[3], new RegionPoint(var1[9], var1[20], var1[2], b.N), new RegionPoint(var1[8], var1[20], var1[2], b.N), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[10]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[9], var1[6], var1[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_VII = new GameEnum24(new RegionPoint(var1[30], var1[20], var1[2], b.N), var1[16], var1[3], new RegionPoint(var1[8], var1[20], var1[2], b.N), new RegionPoint(var1[31], var1[20], var1[2], b.N), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[4]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[8], var1[6], var1[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_IX = new GameEnum24(new RegionPoint(var1[24], var1[20], var1[2], b.N), var1[27], var1[3], new RegionPoint(var1[48], var1[20], var1[2], b.N), new RegionPoint(var1[52], var1[20], var1[2], b.N), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[3]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[7], var1[6], var1[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_X = new GameEnum24(new RegionPoint(var1[49], var1[20], var1[2], b.N), var1[12], var1[3], new RegionPoint(var1[52], var1[20], var1[2], b.N), new RegionPoint(var1[6], var1[20], var1[2], b.N), () -> {
            String[] stringArray = new String[var1[2]];
            stringArray[A.var1[0]] = var2[var1[1]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(var1[5], var1[6], var1[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        A[] aArray = new A[var1[50]];
        aArray[A.var1[0]] = WEST_I_I;
        aArray[A.var1[2]] = WEST_I_II;
        aArray[A.var1[1]] = NORTH_I_II;
        aArray[A.var1[3]] = NORTH_I_III;
        aArray[A.var1[4]] = NORTH_I_IV;
        aArray[A.var1[10]] = SOUTH_I_II;
        aArray[A.var1[12]] = SOUTH_I_II_EXTEND;
        aArray[A.var1[14]] = SOUTH_I_III;
        aArray[A.var1[16]] = EAST_I_I;
        aArray[A.var1[18]] = EAST_I_II;
        aArray[A.var1[21]] = EAST_I_IV;
        aArray[A.var1[23]] = EAST_I_V;
        aArray[A.var1[25]] = WEST_II_IV;
        aArray[A.var1[11]] = WEST_II_V;
        aArray[A.var1[27]] = EAST_II_I;
        aArray[A.var1[9]] = EAST_II_II;
        aArray[A.var1[30]] = EAST_II_III;
        aArray[A.var1[29]] = EAST_II_VIII;
        aArray[A.var1[32]] = EAST_II_IX;
        aArray[A.var1[33]] = EAST_II_X;
        aArray[A.var1[34]] = EAST_II_XI;
        aArray[A.var1[13]] = NORTH_II_VIII;
        aArray[A.var1[35]] = NORTH_II_IX;
        aArray[A.var1[8]] = NORTH_II_X;
        aArray[A.var1[24]] = EAST_III_VI;
        aArray[A.var1[15]] = EAST_III_VII;
        aArray[A.var1[37]] = WEST_III_II;
        aArray[A.var1[17]] = SOUTH_IV_I;
        aArray[A.var1[40]] = SOUTH_IV_II;
        aArray[A.var1[31]] = NORTH_IV_VII;
        aArray[A.var1[42]] = NORTH_IV_VIII;
        aArray[A.var1[43]] = TOP_V_I;
        aArray[A.var1[44]] = TOP_V_II;
        aArray[A.var1[39]] = TOP_V_III;
        aArray[A.var1[45]] = MIDDLE_V_III;
        aArray[A.var1[46]] = MIDDLE_V_VI;
        aArray[A.var1[19]] = MIDDLE_V_VII;
        aArray[A.var1[48]] = MIDDLE_V_IX;
        aArray[A.var1[49]] = MIDDLE_V_X;
        $VALUES = aArray;
    }

    private static void var37() {
        var1 = new int[81];
        A.var1[0] = (0xC4 ^ 0xB5 ^ (0x75 ^ 0x18)) & (163 + 147 - 188 + 99 ^ 181 + 134 - 128 + 6 ^ -1);
        A.var1[1] = 2;
        A.var1[2] = 1;
        A.var1[3] = 3;
        A.var1[4] = 0xD ^ 0x2A ^ (0xB0 ^ 0x93);
        A.var1[5] = 0x28 ^ 4;
        A.var1[6] = 0x43 ^ 0x75;
        A.var1[7] = 62 + 9 - -2 + 73 ^ 67 + 22 - 41 + 136;
        A.var1[8] = 0xD7 ^ 0xC0;
        A.var1[9] = 0x17 ^ 0x18;
        A.var1[10] = 71 + 56 - 68 + 121 ^ 48 + 153 - 72 + 48;
        A.var1[11] = 177 + 18 - 92 + 80 ^ 152 + 43 - 105 + 96;
        A.var1[12] = 0xBA ^ 0xBC;
        A.var1[13] = 113 + 142 - 133 + 57 ^ 148 + 30 - 138 + 126;
        A.var1[14] = 0xB3 ^ 0xB4;
        A.var1[15] = 63 + 26 - -6 + 45 ^ 122 + 31 - 140 + 136;
        A.var1[16] = 0x4B ^ 0x43;
        A.var1[17] = 145 + 38 - 44 + 11 ^ 90 + 107 - 186 + 130;
        A.var1[18] = 0x1A ^ 0x13;
        A.var1[19] = 0xC ^ 0x53 ^ (0x29 ^ 0x52);
        A.var1[20] = 53 + 7 - 50 + 129 ^ 127 + 51 - 153 + 154;
        A.var1[21] = 138 + 101 - 183 + 106 ^ 36 + 153 - 58 + 37;
        A.var1[22] = 0x96 ^ 0xA5;
        A.var1[23] = 0x31 ^ 0x3A;
        A.var1[24] = 0 ^ 0x18;
        A.var1[25] = 0x23 ^ 0x2C ^ 3;
        A.var1[26] = 0xA5 ^ 0x97;
        A.var1[27] = 0x59 ^ 0x74 ^ (0xAC ^ 0x8F);
        A.var1[28] = 4 ^ 0x2C;
        A.var1[29] = 176 + 58 - 165 + 120 ^ 130 + 132 - 259 + 169;
        A.var1[30] = 0x11 ^ 1;
        A.var1[31] = 0x5D ^ 0x5A ^ (0x21 ^ 0x3B);
        A.var1[32] = 95 + 97 - 126 + 94 ^ 118 + 36 - 45 + 69;
        A.var1[33] = 8 ^ 0x1B;
        A.var1[34] = 133 + 122 - 78 + 38 ^ 114 + 118 - 178 + 141;
        A.var1[35] = 0xB1 ^ 0x8A ^ (0x9E ^ 0xB3);
        A.var1[36] = 0x1F ^ 0x27 ^ (0x1E ^ 0xF);
        A.var1[37] = 0x3B ^ 0x21;
        A.var1[38] = 0x9A ^ 0xA0;
        A.var1[39] = 0x5C ^ 0x7D;
        A.var1[40] = 44 + 44 - 61 + 107 ^ 125 + 49 - 163 + 143;
        A.var1[41] = 0x4D ^ 0x1A ^ (5 ^ 0x67);
        A.var1[42] = 0x66 ^ 0x78;
        A.var1[43] = 0xC ^ 0x13;
        A.var1[44] = 0xBE ^ 0x9E;
        A.var1[45] = 0xA2 ^ 0x97 ^ (0xD1 ^ 0xC6);
        A.var1[46] = 0x6E ^ 0x6B ^ (0x1D ^ 0x3B);
        A.var1[47] = 0x70 ^ 0x4B;
        A.var1[48] = 0x41 ^ 0x64;
        A.var1[49] = 29 + 110 - 111 + 160 ^ 10 + 121 - 88 + 111;
        A.var1[50] = 61 + 27 - 70 + 113 ^ 17 + 11 - 17 + 153;
        A.var1[51] = 0xB5 ^ 0x8C;
        A.var1[52] = 0x13 ^ 0x39 ^ 1;
        A.var1[53] = 0x31 ^ 0xD;
        A.var1[54] = 0x1D ^ 0x30;
        A.var1[55] = 0x68 ^ 0x46;
        A.var1[56] = 0xA2 ^ 0xAD ^ (0x88 ^ 0xA8);
        A.var1[57] = 0x29 ^ 0x19;
        A.var1[58] = 0xD3 ^ 0x80 ^ (0xCD ^ 0xAF);
        A.var1[59] = 0 ^ 0x3E;
        A.var1[60] = 0x46 ^ 0x79;
        A.var1[61] = 78 + 72 - 63 + 96 ^ 88 + 19 - 70 + 94;
        A.var1[62] = 0xF2 ^ 0xC5;
        A.var1[63] = 0x7C ^ 0x41;
        A.var1[64] = 0x6A ^ 0x12 ^ (0x2F ^ 0x17);
        A.var1[65] = 0x4E ^ 0x41 ^ (0x60 ^ 0x2E);
        A.var1[66] = 0x2A ^ 0x68;
        A.var1[67] = 0x3E ^ 0xF ^ (0xC9 ^ 0xBB);
        A.var1[68] = 0x3F ^ 0x56 ^ (0x8A ^ 0xA7);
        A.var1[69] = 0x56 ^ 0x13;
        A.var1[70] = 93 + 60 - 47 + 100 ^ 19 + 7 - -6 + 104;
        A.var1[71] = 0xEB ^ 0x93 ^ (0x6D ^ 0x52);
        A.var1[72] = 24 + 42 - 64 + 195 ^ 123 + 137 - 150 + 31;
        A.var1[73] = 0xF ^ 0x46;
        A.var1[74] = 0x58 ^ 0x6E ^ (0xEE ^ 0x92);
        A.var1[75] = 5 ^ 0x4E;
        A.var1[76] = 0x48 ^ 4;
        A.var1[77] = 0x3E ^ 0x73;
        A.var1[78] = 0xC9 ^ 0x87;
        A.var1[79] = 0x68 ^ 0x15 ^ (0x16 ^ 0x24);
        A.var1[80] = 0x25 ^ 0x75;
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    private static String var38(String var39, String var40) {
        var39 = new String(Base64.getDecoder().decode(var39.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var41 = new StringBuilder();
        char[] var42 = var40.toCharArray();
        int var43 = var1[0];
        char[] var44 = var39.toCharArray();
        int var45 = var44.length;
        int var46 = var1[0];
        while (A.var17(var46, var45)) {
            char var47 = var44[var46];
            var41.append((char)(var47 ^ var42[var43 % var42.length]));
            0;
            ++var43;
            ++var46;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var41);
    }
}

