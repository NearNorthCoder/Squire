/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.GameEnum6;
import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.CHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum14;
import gg.squire.sepulchre.tasks.GameEnum9;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class GameEnum8
extends Enum<i> {
    public static final  /* enum */ i WEST_III_V;
     Supplier<WorldPoint> startPoint;
     Supplier<WorldArea> dartArea;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ i EAST_III_IV;
    public static final  /* enum */ i WEST_IV_V;
    public static final  /* enum */ i WEST_I_IV;
    
    public static final  /* enum */ i MIDDLE_V_I;
    public  Supplier<TileObject> object;
    public static final  /* enum */ i NORTH_I_I;
    public static final  /* enum */ i NORTH_IV_V;
    public static final  /* enum */ i WEST_III_I;
    public static final  /* enum */ i NORTH_II_II;
    public static final  /* enum */ i SOUTH_II_V;
    public static final  /* enum */ i EAST_II_V;
     Supplier<WorldPoint> dartDestination;
    public static final  /* enum */ i SOUTH_II_I;
     Supplier<WorldPoint> startDestination;
    public static final  /* enum */ i EAST_IV_III;
    
    public static final  /* enum */ i SOUTH_IV_VI;
    public static final  /* enum */ i BOTTOM_V_I;
     j entry;
    public static final  /* enum */ i SOUTH_I_IV;
    public static final  /* enum */ i EAST_IV_I;
    public static final  /* enum */ i NORTH_IV_IX;
     k type;
    private static final  i[] $VALUES;

    private static  boolean a(Player player, TileObject tileObject) {
        int n2;
        if (i.var3(tileObject.getWorldY() - player.getWorldY(), var1[17]) && i.var3(Math.abs(player.getWorldX() - tileObject.getWorldX()), var1[6]) && i.var4(player.getPlane(), tileObject.getPlane()) && i.var5(tileObject.getName().equals(var2[var1[18]]) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (((0xF8 ^ 0x91 ^ (0xB2 ^ 0x8E)) & (0x34 ^ 0x18 ^ (0xF8 ^ 0x81) ^ -1)) != 0) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var6(int n2) {
        return n2 > 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean O() {
        void var8;
        i var9;
        Player player = Players.getLocal();
        if (i.var7(player)) {
            return var1[0];
        }
        List<WorldPoint> var10 = var9.L();
        List<WorldPoint> var11 = var9.d(var10);
        System.out.println("Ahead: " + String.valueOf(var11));
        List<TileObject> var12 = var9.M();
        System.out.println("statues size: " + var12.size());
        ArrayList<Integer> var13 = new ArrayList<Integer>();
        int var14 = var1[0];
        if (i.var6(var12.size())) {
            System.out.println(var2[var1[12]]);
            int var15 = var1[0];
            Iterator<TileObject> var16 = var12.iterator();
            while (i.var5(var16.hasNext() ? 1 : 0)) {
                TileObject var17 = var16.next();
                int var18 = c.a(var17);
                if (i.var4(var18, b.x)) {
                    ++var14;
                }
                if (i.var19(var18, b.x)) {
                    if (!i.var20((Object)var9.type, (Object)k.SOUTH) || !i.var20((Object)var9.type, (Object)k.NORTH) || i.var21((Object)var9.type, (Object)k.SOUTH_BLADE)) {
                        System.out.println("Blacklisting: " + var17.getWorldX());
                        var13.add(var17.getWorldX());
                        0;
                        0;
                        if (1 != 3) continue;
                        return ((8 + 108 - 65 + 79 ^ 150 + 37 - 131 + 95) & (33 + 60 - 15 + 69 ^ 44 + 33 - -48 + 9 ^ -1)) != 0;
                    }
                    if (i.var20((Object)var9.type, (Object)k.WEST) && !i.var21((Object)var9.type, (Object)k.EAST)) continue;
                    System.out.println("Blacklisting: " + var17.getWorldY());
                    var13.add(var17.getWorldY());
                    0;
                    0;
                    if (-1 != ((0x3C ^ 8 ^ (0x1B ^ 0xC)) & (4 ^ 0x75 ^ (0xF4 ^ 0xA6) ^ -1))) continue;
                    return ((0x92 ^ 0xB0 ^ (0x5C ^ 0x47)) & (165 + 42 - 64 + 42 ^ 42 + 109 - 127 + 104 ^ -1)) != 0;
                }
                if (i.var5(var9.a(var14) ? 1 : 0)) {
                    System.out.println(var2[var1[13]]);
                    Movement.setDestination((WorldPoint)var9.dartDestination.get());
                    return var1[1];
                }
                ++var14;
                0;
                if (1 != 2) continue;
                return ((0x5F ^ 7) & ~(0xD ^ 0x55)) != 0;
            }
            System.out.println("Blacklisted " + var15 + " elements");
            if (!i.var20((Object)var9.type, (Object)k.SOUTH) || !i.var20((Object)var9.type, (Object)k.NORTH) || i.var21((Object)var9.type, (Object)k.SOUTH_BLADE)) {
                var11.removeIf(worldPoint -> var13.contains(worldPoint.getWorldX()));
                0;
                0;
                if (3 <= 0) {
                    return (1 & ~1) != 0;
                }
            } else if (!i.var20((Object)var9.type, (Object)k.WEST) || i.var21((Object)var9.type, (Object)k.EAST)) {
                var11.removeIf(worldPoint -> var13.contains(worldPoint.getWorldY()));
                0;
            }
            if (i.var5(var11.size())) {
                var11.sort(Comparator.comparingInt(arg_0 -> i.b((Player)var8, arg_0)));
                System.out.println(var2[var1[14]]);
                Movement.setDestination((WorldPoint)var11.get(var1[0]));
                return var1[1];
            }
            return var1[1];
        }
        System.out.println(var2[var1[4]]);
        List<NPC> var15 = var9.N();
        var15.sort(Comparator.comparingInt(arg_0 -> i.a((Player)var8, arg_0)));
        var13.clear();
        int var16 = var1[0];
        while (i.var3(var16, var1[5])) {
            if (i.var22(var15.size(), var16)) {
                0;
                if (3 > 2) break;
                return ((0xA ^ 0x5C) & ~(0x60 ^ 0x36)) != 0;
            }
            NPC var17 = var15.get(var16);
            if (i.var7(var17)) {
                var15.remove(var16);
                0;
                0;
                
                return ((0x4F ^ 0x17) & ~(0x3C ^ 0x64)) != 0;
            }
            if (!i.var20((Object)var9.type, (Object)k.SOUTH) || i.var21((Object)var9.type, (Object)k.SOUTH_BLADE)) {
                if (i.var3(var17.getWorldY(), var8.getWorldY())) {
                    var13.add(var17.getWorldX());
                    0;
                    ++var16;
                    0;
                    if (-1 <= ((0x1D ^ 0x7E) & ~(0x7A ^ 0x19))) continue;
                    return ((0xFF ^ 0xC2) & ~(0x1F ^ 0x22)) != 0;
                }
                var15.remove(var16);
                0;
            }
            if (i.var21((Object)var9.type, (Object)k.WEST)) {
                if (i.var3(var17.getWorldX(), var8.getWorldX())) {
                    var13.add(var17.getWorldY());
                    0;
                    ++var16;
                    0;
                    if ((0x52 ^ 0x56) != 0) continue;
                    return ((0xB5 ^ 0x84) & ~(0x82 ^ 0xB3)) != 0;
                }
                var15.remove(var16);
                0;
            }
            if (i.var21((Object)var9.type, (Object)k.EAST)) {
                if (i.var23(var17.getWorldX(), var8.getWorldX())) {
                    var13.add(var17.getWorldY());
                    0;
                    ++var16;
                    0;
                    if (1 >= ((0x62 ^ 0x25) & ~(0xD7 ^ 0x90))) continue;
                    return ((0x2C ^ 0x35) & ~(0x37 ^ 0x2E)) != 0;
                }
                var15.remove(var16);
                0;
            }
            if (i.var21((Object)var9.type, (Object)k.NORTH)) {
                if (i.var23(var17.getWorldY(), var8.getWorldY())) {
                    var13.add(var17.getWorldX());
                    0;
                    ++var16;
                    0;
                    if (-1 < 0) continue;
                    return ((143 + 182 - 230 + 101 ^ 64 + 43 - 71 + 112) & (0x41 ^ 0x6E ^ 55 + 9 - 62 + 125 ^ -1)) != 0;
                }
                var15.remove(var16);
                0;
            }
            0;
            if ((0x9F ^ 0x9B) >= 3) continue;
            return ((0xFB ^ 0xAA) & ~(0xB ^ 0x5A)) != 0;
        }
        if (!i.var20((Object)var9.type, (Object)k.SOUTH) || !i.var20((Object)var9.type, (Object)k.NORTH) || i.var21((Object)var9.type, (Object)k.SOUTH_BLADE)) {
            var11.removeIf(worldPoint -> var13.contains(worldPoint.getWorldX()));
            0;
            0;
            if (1 != 1) {
                return ((206 + 147 - 245 + 116 ^ 31 + 26 - -24 + 97) & (0x34 ^ 0x20 ^ (0xD5 ^ 0x93) ^ -1)) != 0;
            }
        } else if (!i.var20((Object)var9.type, (Object)k.WEST) || i.var21((Object)var9.type, (Object)k.EAST)) {
            var11.removeIf(worldPoint -> var13.contains(worldPoint.getWorldY()));
            0;
        }
        if (i.var5(var11.size())) {
            var11.sort(Comparator.comparingInt(arg_0 -> i.a((Player)var8, arg_0)));
            System.out.println(var2[var1[15]]);
            Movement.setDestination((WorldPoint)var11.get(var1[0]));
            return var1[1];
        }
        System.out.println(var2[var1[16]]);
        return var1[0];
    }

    private static void var24() {
        var2 = new String[var1[61]];
        i.var2[i.var1[0]] = "in here!";
        i.var2[i.var1[1]] = "Knight Statue";
        i.var2[i.var1[5]] = "Can start EAST";
        i.var2[i.var1[6]] = "should finish is false";
        i.var2[i.var1[2]] = "point is null!";
        i.var2[i.var1[8]] = "Changed ahead";
        i.var2[i.var1[9]] = "Changed ahead";
        i.var2[i.var1[10]] = "Changed ahead";
        i.var2[i.var1[11]] = "Changed ahead";
        i.var2[i.var1[12]] = "statue";
        i.var2[i.var1[13]] = "ShouldFinish!";
        i.var2[i.var1[14]] = "Statues: Walking ahead";
        i.var2[i.var1[4]] = "darts";
        i.var2[i.var1[15]] = "Darts: walking ahead";
        i.var2[i.var1[16]] = "error!";
        i.var2[i.var1[18]] = "Crossbowman Statue";
        i.var2[i.var1[19]] = "Crossbowman Statue";
        i.var2[i.var1[20]] = "Crossbowman Statue";
        i.var2[i.var1[17]] = "Crossbowman Statue";
        i.var2[i.var1[21]] = "NORTH_I_I";
        i.var2[i.var1[3]] = "WEST_I_IV";
        i.var2[i.var1[36]] = "SOUTH_I_IV";
        i.var2[i.var1[38]] = "SOUTH_II_I";
        i.var2[i.var1[23]] = "SOUTH_II_V";
        i.var2[i.var1[40]] = "EAST_II_V";
        i.var2[i.var1[42]] = "NORTH_II_II";
        i.var2[i.var1[27]] = "EAST_III_IV";
        i.var2[i.var1[49]] = "WEST_III_I";
        i.var2[i.var1[24]] = "WEST_III_V";
        i.var2[i.var1[26]] = "SOUTH_IV_VI";
        i.var2[i.var1[39]] = "NORTH_IV_V";
        i.var2[i.var1[37]] = "NORTH_IV_IX";
        i.var2[i.var1[59]] = "EAST_IV_I";
        i.var2[i.var1[62]] = "EAST_IV_III";
        i.var2[i.var1[47]] = "WEST_IV_V";
        i.var2[i.var1[50]] = "MIDDLE_V_I";
        i.var2[i.var1[51]] = "BOTTOM_V_I";
    }

    private static  boolean e(Player player, NPC nPC) {
        int n2;
        if (i.var5(b.z.contains(nPC.getId()) ? 1 : 0) && i.var3(nPC.getWorldY(), player.getWorldY() + var1[1]) && i.var3(Math.abs(nPC.getWorldX() - player.getWorldX()), var1[2]) && i.var23(nPC.getWorldY(), player.getWorldY() - var1[3]) && i.var4(nPC.getPlane(), player.getPlane())) {
            n2 = var1[1];
            0;
            if (3 == -1) {
                return ((8 ^ 0x4C ^ (0x19 ^ 0x69)) & (0xD5 ^ 0x92 ^ (0x7B ^ 8) ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static  boolean b(Player player, TileObject tileObject) {
        int n2;
        if (i.var3(tileObject.getWorldX() - player.getWorldX(), var1[17]) && i.var3(Math.abs(player.getWorldY() - tileObject.getWorldY()), var1[6]) && i.var4(player.getPlane(), tileObject.getPlane()) && i.var5(tileObject.getName().equals(var2[var1[19]]) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if ((0xD6 ^ 0xC0 ^ (0x11 ^ 3)) < (0x6A ^ 0x6F ^ 1)) {
                return ((0x58 ^ 0x19 ^ (0xF4 ^ 0x8C)) & (0x54 ^ 0x41 ^ (0x67 ^ 0x4B) ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static  boolean c(Player player, NPC nPC) {
        int n2;
        if (i.var5(b.z.contains(nPC.getId()) ? 1 : 0) && i.var3(nPC.getWorldX(), player.getWorldX() + var1[3]) && i.var3(Math.abs(nPC.getWorldY() - player.getWorldY()), var1[2]) && i.var23(nPC.getWorldX(), player.getWorldX() - var1[1]) && i.var4(nPC.getPlane(), player.getPlane())) {
            n2 = var1[1];
            0;
            if null != null {
                return ((0x39 ^ 0x18) & ~(0x4C ^ 0x6D)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static  boolean d(Player player, TileObject tileObject) {
        int n2;
        if (i.var3(player.getWorldY() - tileObject.getWorldY(), var1[17]) && i.var3(Math.abs(player.getWorldX() - tileObject.getWorldX()), var1[6]) && i.var4(player.getPlane(), tileObject.getPlane()) && i.var5(tileObject.getName().equals(var2[var1[17]]) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if ((29 + 90 - 111 + 136 ^ 97 + 116 - 199 + 134) == 0) {
                return ((48 + 127 - 126 + 170 ^ 158 + 141 - 151 + 50) & (0x45 ^ 0x54 ^ (0x2A ^ 0x26) ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2) {
        void var31;
        i var32;
        Player player = Players.getLocal();
        if (i.var7(player)) {
            return var1[0];
        }
        int var33 = var1[0];
        if (!i.var20((Object)var32.type, (Object)k.SOUTH) || i.var21((Object)var32.type, (Object)k.SOUTH_BLADE)) {
            if (i.var22(var32.Q().get().getWorldY(), var31.getWorldY())) {
                return var1[0];
            }
            var33 = Math.abs(var32.dartDestination.get().getWorldY() - var31.getWorldY());
        }
        if (i.var21((Object)var32.type, (Object)k.WEST)) {
            if (i.var22(var32.Q().get().getWorldX(), var31.getWorldX())) {
                return var1[0];
            }
            var33 = Math.abs(var32.dartDestination.get().getWorldX() - var31.getWorldX());
        }
        if (i.var21((Object)var32.type, (Object)k.EAST)) {
            if (i.var34(var32.Q().get().getWorldX(), var31.getWorldX())) {
                return var1[0];
            }
            var33 = Math.abs(var32.dartDestination.get().getWorldX() - var31.getWorldX());
        }
        if (i.var21((Object)var32.type, (Object)k.NORTH)) {
            if (i.var34(var32.Q().get().getWorldY(), var31.getWorldY())) {
                return var1[0];
            }
            var33 = Math.abs(var32.dartDestination.get().getWorldY() - var31.getWorldY());
        }
        List<TileObject> var35 = var32.M();
        int var36 = var1[0];
        while (i.var3(var36, var35.size()) && i.var3(var36, var1[6])) {
            void var37;
            if (i.var34(var36, var35.size())) {
                0;
                if (3 == 3) break;
                return ((0xAD ^ 0xA7) & ~(0x26 ^ 0x2C)) != 0;
            }
            TileObject var38 = var35.get(var36);
            int var39 = c.a(var38);
            if (!i.var19(var39, b.y) || i.var4((int)var37, var1[6])) {
                return var1[1];
            }
            ++var36;
            0;
            if (3 <= 3) continue;
            return ((0x7D ^ 0x2F) & ~(0xFC ^ 0xAE)) != 0;
        }
        System.out.println(var2[var1[6]]);
        return var1[0];
    }

    private static  boolean b(Player player, NPC nPC) {
        int n2;
        if (i.var5(b.z.contains(nPC.getId()) ? 1 : 0) && i.var23(nPC.getWorldY(), player.getWorldY() - var1[1]) && i.var3(Math.abs(nPC.getWorldX() - player.getWorldX()), var1[2]) && i.var3(nPC.getWorldY(), player.getWorldY() + var1[3]) && i.var4(nPC.getPlane(), player.getPlane())) {
            n2 = var1[1];
            0;
            if ((0x32 ^ 0x3F ^ (0x94 ^ 0x9C)) <= 0) {
                return ((0x4B ^ 0x17 ^ (0x1F ^ 0x15)) & (55 + 90 - -3 + 60 ^ 88 + 70 - 50 + 26 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var34(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> L() {
        void var40;
        i var41;
        Player player = Players.getLocal();
        if (i.var7(player)) {
            return null;
        }
        if (!i.var20((Object)var41.type, (Object)k.SOUTH) || i.var21((Object)var41.type, (Object)k.SOUTH_BLADE)) {
            if (i.var21((Object)var41.entry, (Object)j.WEST)) {
                WorldPoint var42 = new WorldPoint(var41.startPoint.get().getWorldX() + var1[1], var40.getWorldY() - var1[5], var40.getPlane());
                return new WorldArea(var42, var1[6], var1[1]).toWorldPointList();
            }
            if (i.var21((Object)var41.entry, (Object)j.EAST)) {
                WorldPoint var42 = new WorldPoint(var41.startPoint.get().getWorldX() - var1[6], var40.getWorldY() - var1[5], var40.getPlane());
                return new WorldArea(var42, var1[6], var1[1]).toWorldPointList();
            }
        }
        if (i.var21((Object)var41.type, (Object)k.NORTH)) {
            if (i.var21((Object)var41.entry, (Object)j.WEST)) {
                WorldPoint var42 = new WorldPoint(var41.startPoint.get().getWorldX() + var1[1], var40.getWorldY() + var1[5], var40.getPlane());
                return new WorldArea(var42, var1[6], var1[1]).toWorldPointList();
            }
            if (i.var21((Object)var41.entry, (Object)j.EAST)) {
                WorldPoint var42 = new WorldPoint(var41.startPoint.get().getWorldX() - var1[6], var40.getWorldY() + var1[5], var40.getPlane());
                return new WorldArea(var42, var1[6], var1[1]).toWorldPointList();
            }
        }
        if (i.var21((Object)var41.type, (Object)k.WEST)) {
            if (i.var21((Object)var41.entry, (Object)j.NORTH)) {
                WorldPoint var42 = new WorldPoint(var40.getWorldX() - var1[5], var41.startPoint.get().getWorldY() - var1[6], var40.getPlane());
                return new WorldArea(var42, var1[1], var1[6]).toWorldPointList();
            }
            if (i.var21((Object)var41.entry, (Object)j.SOUTH)) {
                WorldPoint var42 = new WorldPoint(var40.getWorldX() - var1[5], var41.startPoint.get().getWorldY() + var1[1], var40.getPlane());
                return new WorldArea(var42, var1[1], var1[6]).toWorldPointList();
            }
        }
        if (i.var21((Object)var41.type, (Object)k.EAST)) {
            if (i.var21((Object)var41.entry, (Object)j.NORTH)) {
                WorldPoint var42 = new WorldPoint(var40.getWorldX() + var1[5], var41.startPoint.get().getWorldY() - var1[6], var40.getPlane());
                return new WorldArea(var42, var1[1], var1[6]).toWorldPointList();
            }
            if (i.var21((Object)var41.entry, (Object)j.SOUTH)) {
                WorldPoint var42 = new WorldPoint(var40.getWorldX() + var1[5], var41.startPoint.get().getWorldY() + var1[1], var40.getPlane());
                return new WorldArea(var42, var1[1], var1[6]).toWorldPointList();
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> N() {
        void var43;
        i var44;
        Player player = Players.getLocal();
        if (i.var7(player)) {
            return null;
        }
        if (!i.var20((Object)var44.type, (Object)k.SOUTH) || i.var21((Object)var44.type, (Object)k.SOUTH_BLADE)) {
            return NPCs.getAll(arg_0 -> i.e((Player)var43, arg_0));
        }
        if (i.var21((Object)var44.type, (Object)k.WEST)) {
            return NPCs.getAll(arg_0 -> i.d((Player)var43, arg_0));
        }
        if (i.var21((Object)var44.type, (Object)k.EAST)) {
            return NPCs.getAll(arg_0 -> i.c((Player)var43, arg_0));
        }
        if (i.var21((Object)var44.type, (Object)k.NORTH)) {
            return NPCs.getAll(arg_0 -> i.b((Player)var43, arg_0));
        }
        return null;
    }

    private static String var45(String var46, String var47) {
        var46 = new String(Base64.getDecoder().decode(var46.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var48 = new StringBuilder();
        char[] var49 = var47.toCharArray();
        int var50 = var1[0];
        char[] var51 = var46.toCharArray();
        int var52 = var51.length;
        int var53 = var1[0];
        while (i.var3(var53, var52)) {
            char var54 = var51[var53];
            var48.append((char)(var54 ^ var49[var50 % var49.length]));
            0;
            ++var50;
            ++var53;
            0;
            if (2 != (0xDD ^ 0x9F ^ (0x40 ^ 6))) continue;
            return null;
        }
        return String.valueOf(var48);
    }

    private GameEnum8(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, k k2, j j2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.type = k2;
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.entry = j2;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static  boolean d(Player player, NPC nPC) {
        int n2;
        if (i.var5(b.z.contains(nPC.getId()) ? 1 : 0) && i.var3(nPC.getWorldX(), player.getWorldX() + var1[1]) && i.var3(Math.abs(nPC.getWorldY() - player.getWorldY()), var1[2]) && i.var23(nPC.getWorldX(), player.getWorldX() - var1[3]) && i.var4(nPC.getPlane(), player.getPlane())) {
            n2 = var1[1];
            0;
            if (-1 > -1) {
                return ((0x1F ^ 0x4E ^ (0x32 ^ 0x6F)) & (40 + 19 - 25 + 99 ^ 25 + 131 - 58 + 39 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private GameEnum8(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, k k2, j j2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var55 = list.iterator();
            while (i.var5(var55.hasNext() ? 1 : 0)) {
                void var56;
                Triple var57 = (Triple)var55.next();
                var56.add(new WorldArea(SquireSepulchre.a((RegionPoint)var57.getFirst()), ((Integer)var57.getSecond()).intValue(), ((Integer)var57.getThird()).intValue()));
                0;
                0;
                if (1 > 0) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.startDestination = () -> SquireSepulchre.a(regionPoint2);
        this.type = k2;
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint3), n3, n4);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint4);
        this.entry = j2;
    }

    private static boolean var19(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var63) {
            var63.printStackTrace();
            return null;
        }
    }

    private static  int f(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    private static boolean var21(Object object, Object object2) {
        return object == object2;
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    private static void var64() {
        var1 = new int[63];
        i.var1[0] = (106 + 149 - 181 + 151 ^ 154 + 42 - 150 + 138) & (0x48 ^ 0x21 ^ (0x66 ^ 0x56) ^ -1);
        i.var1[1] = 1;
        i.var1[2] = 0xA1 ^ 0xA5;
        i.var1[3] = 0x51 ^ 0x45;
        i.var1[4] = 3 ^ 0xF;
        i.var1[5] = 2;
        i.var1[6] = 3;
        i.var1[7] = -1;
        i.var1[8] = 0x43 ^ 0x63 ^ (0x94 ^ 0xB1);
        i.var1[9] = 0x4B ^ 0x15 ^ (0xDE ^ 0x86);
        i.var1[10] = 0xA4 ^ 0xA3;
        i.var1[11] = 0x9B ^ 0x93;
        i.var1[12] = 0x6D ^ 0x39 ^ (0xD9 ^ 0x84);
        i.var1[13] = 0x28 ^ 0x22;
        i.var1[14] = 0xE1 ^ 0xA9 ^ (0xEF ^ 0xAC);
        i.var1[15] = 0x2D ^ 0x20;
        i.var1[16] = 0xA0 ^ 0xAE;
        i.var1[17] = 0x6B ^ 0x79;
        i.var1[18] = 0x69 ^ 0x66;
        i.var1[19] = 0x9A ^ 0x8A;
        i.var1[20] = 0x26 ^ 0x37;
        i.var1[21] = 1 ^ 0x12;
        i.var1[22] = 0x52 ^ 0x68;
        i.var1[23] = 0xCE ^ 0x9B ^ (0xC7 ^ 0x85);
        i.var1[24] = 0x76 ^ 0x6A;
        i.var1[25] = 0x7F ^ 0x40;
        i.var1[26] = 84 + 99 - 23 + 28 ^ 83 + 80 - 139 + 137;
        i.var1[27] = 0x4E ^ 0x30 ^ (0xD9 ^ 0xBD);
        i.var1[28] = 0x36 ^ 0x1F;
        i.var1[29] = 0x5A ^ 0x51 ^ (0x4D ^ 0x7A);
        i.var1[30] = 73 + 174 - 200 + 138 ^ 50 + 47 - -24 + 11;
        i.var1[31] = 0x4E ^ 0x66;
        i.var1[32] = 0xFFFFFFFC & 0x225F;
        i.var1[33] = 0x88 ^ 0xBC;
        i.var1[34] = 0xA3 ^ 0x90;
        i.var1[35] = 0xF1 ^ 0xC0;
        i.var1[36] = 2 ^ (0x86 ^ 0x91);
        i.var1[37] = 0xE1 ^ 0x90 ^ (0x44 ^ 0x2A);
        i.var1[38] = 0x4B ^ 0x73 ^ (0xB0 ^ 0x9E);
        i.var1[39] = 0x37 ^ 0x29;
        i.var1[40] = 0x2D ^ 0x35;
        i.var1[41] = 5 + 117 - -2 + 14 ^ 2 + 125 - 102 + 154;
        i.var1[42] = 0x56 ^ 0x4F;
        i.var1[43] = 122 + 24 - 110 + 105 ^ 40 + 86 - 54 + 110;
        i.var1[44] = 0x2C ^ 0x1E ^ (0x36 ^ 0x2F);
        i.var1[45] = 0x66 ^ 4 ^ (0xDF ^ 0x97);
        i.var1[46] = 0x3A ^ 2;
        i.var1[47] = 0xE1 ^ 0xC3;
        i.var1[48] = 0x9F ^ 0xAA;
        i.var1[49] = 0x45 ^ 0x5E;
        i.var1[50] = 0xE1 ^ 0xC2;
        i.var1[51] = 0x51 ^ 0x4D ^ (0xAA ^ 0x92);
        i.var1[52] = 0xA4 ^ 0x82;
        i.var1[53] = 125 + 143 - 138 + 105 ^ 183 + 165 - 314 + 162;
        i.var1[54] = 0x14 ^ 0x24;
        i.var1[55] = 0x26 ^ 0xB;
        i.var1[56] = 0x67 ^ 0x24 ^ (0xE8 ^ 0x85);
        i.var1[57] = 21 + 71 - -32 + 33 ^ 41 + 160 - 87 + 57;
        i.var1[58] = 0xE9 ^ 0xAD ^ (0x44 ^ 0x2C);
        i.var1[59] = 0x34 ^ 0x14;
        i.var1[60] = 0x93 ^ 0xA4;
        i.var1[61] = 0x6A ^ 0x4F;
        i.var1[62] = 0x63 ^ 0x42;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    private static  int a(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    private static boolean var23(int n2, int n3) {
        return n2 > n3;
    }

    private static  boolean c(Player player, TileObject tileObject) {
        int n2;
        if (i.var3(player.getWorldX() - tileObject.getWorldX(), var1[17]) && i.var3(Math.abs(player.getWorldY() - tileObject.getWorldY()), var1[6]) && i.var4(player.getPlane(), tileObject.getPlane()) && i.var5(tileObject.getName().equals(var2[var1[20]]) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (((0x28 ^ 0x3E) & ~(0x58 ^ 0x4E)) != 0) {
                return ((0xB2 ^ 0x92) & ~(2 ^ 0x22)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var65;
        void var66;
        i var67;
        Player player = Players.getLocal();
        if (i.var7(player)) {
            return var1[0];
        }
        if (i.var5(var67.b((Locatable)var66) ? 1 : 0)) {
            void var68;
            var67.a((SquireSepulchre)var65);
            if (i.var5(var67.b((d)var68) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var67.startDestination.get());
                return var1[1];
            }
            Movement.setDestination((WorldPoint)var67.startPoint.get());
            return var1[1];
        }
        if (i.var5(var67.c((Locatable)var66) ? 1 : 0)) {
            var67.b((SquireSepulchre)var65);
            System.out.println(var2[var1[0]]);
            var67.O();
            0;
            return var1[1];
        }
        return var1[0];
    }

    private static  int a(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(d d2) {
        J var69;
        TileObject var70;
        i var71;
        void var72;
        Player player = Players.getLocal();
        if (i.var7(player)) {
            return var1[0];
        }
        if (i.var73(var72.getWorldLocation().equals((Object)var71.startPoint.get()) ? 1 : 0)) {
            return var1[0];
        }
        if (i.var21((Object)var71.type, (Object)k.SOUTH_BLADE)) {
            void var74;
            String[] stringArray = new String[var1[1]];
            stringArray[i.var1[0]] = var2[var1[1]];
            var70 = TileObjects.getNearest((String[])stringArray);
            if (i.var7(var70)) {
                return var1[0];
            }
            var69 = var74.b(var70);
            System.out.println("ID: " + var69.aG() + " | ticks: " + var69.aF());
            if ((!i.var4(var69.aG(), b.s) || i.var34(var69.aF(), var1[2]) && i.var22(var69.aF(), var1[3])) && i.var19(var69.aG(), b.v) && i.var19(var69.aG(), b.t)) {
                return var1[0];
            }
        }
        var70 = var71.N();
        var70.sort(Comparator.comparingInt(arg_0 -> i.f((Player)var72, arg_0)));
        System.out.println("darts: " + String.valueOf(var70));
        if (i.var73(var70.size())) {
            return var1[1];
        }
        var69 = (NPC)var70.get(var1[0]);
        if (i.var75(var69)) {
            if (!i.var20((Object)var71.type, (Object)k.SOUTH) || i.var21((Object)var71.type, (Object)k.SOUTH_BLADE)) {
                int var76 = Math.abs(var69.getWorldY() - var72.getWorldY());
                if (i.var4(var69.getWorldX(), var71.P().get().getWorldX()) && i.var3(var76, var1[4])) {
                    return var1[0];
                }
                return var1[1];
            }
            if (i.var21((Object)var71.type, (Object)k.WEST)) {
                int var76 = Math.abs(var69.getWorldX() - var72.getWorldX());
                if (i.var4(var69.getWorldY(), var71.P().get().getWorldY()) && i.var3(var76, var1[4])) {
                    return var1[0];
                }
                return var1[1];
            }
            if (i.var21((Object)var71.type, (Object)k.EAST)) {
                System.out.println(var2[var1[5]]);
                int var76 = Math.abs(var69.getWorldX() - var72.getWorldX());
                if (i.var4(var69.getWorldY(), var71.P().get().getWorldY()) && i.var3(var76, var1[4])) {
                    return var1[0];
                }
                return var1[1];
            }
            if (i.var21((Object)var71.type, (Object)k.NORTH)) {
                int var76 = Math.abs(var69.getWorldY() - var72.getWorldY());
                if (i.var4(var69.getWorldX(), var71.P().get().getWorldX()) && i.var3(var76, var1[4])) {
                    return var1[0];
                }
                return var1[1];
            }
            return var1[0];
        }
        return var1[0];
    }

    static {
        i.var64();
        i.var24();
        NORTH_I_I = new GameEnum8(List.of(new Triple((Object)new RegionPoint(var1[9], var1[22], var1[5], b.C), (Object)var1[23], (Object)var1[9]), new Triple((Object)new RegionPoint(var1[4], var1[0], var1[5], b.F), (Object)var1[6], (Object)var1[6])), new RegionPoint(var1[24], var1[25], var1[5], b.C), new RegionPoint(var1[26], var1[0], var1[5], b.F), new RegionPoint(var1[27], var1[0], var1[5], b.F), var1[17], var1[6], new RegionPoint(var1[28], var1[29], var1[5], b.C), k.EAST, j.SOUTH);
        WEST_I_IV = new GameEnum8(List.of(new Triple((Object)new RegionPoint(var1[30], var1[31], var1[5], var1[32]), (Object)var1[6], (Object)var1[18]), new Triple((Object)new RegionPoint(var1[0], var1[33], var1[5], b.C), (Object)var1[12], (Object)var1[6])), new RegionPoint(var1[9], var1[33], var1[5], b.C), new RegionPoint(var1[10], var1[34], var1[5], b.C), new RegionPoint(var1[9], var1[35], var1[5], b.C), var1[17], var1[6], new RegionPoint(var1[36], var1[28], var1[5], b.C), k.EAST, j.NORTH);
        SOUTH_I_IV = new GameEnum8(new RegionPoint(var1[37], var1[21], var1[5], b.C), var1[6], var1[2], new RegionPoint(var1[37], var1[38], var1[5], b.C), new RegionPoint(var1[39], var1[23], var1[5], b.C), new RegionPoint(var1[36], var1[23], var1[5], b.C), var1[16], var1[6], new RegionPoint(var1[23], var1[37], var1[5], b.C), k.WEST, j.SOUTH);
        SOUTH_II_I = new GameEnum8(new RegionPoint(var1[37], var1[38], var1[5], b.G), var1[6], var1[10], new RegionPoint(var1[37], var1[38], var1[5], b.G), new RegionPoint(var1[39], var1[36], var1[5], b.G), new RegionPoint(var1[20], var1[21], var1[5], b.G), var1[20], var1[6], new RegionPoint(var1[17], var1[12], var1[5], b.G), k.WEST, j.NORTH);
        SOUTH_II_V = new GameEnum8(new RegionPoint(var1[16], var1[20], var1[1], b.G), var1[6], var1[5], new RegionPoint(var1[19], var1[17], var1[1], b.G), new RegionPoint(var1[20], var1[21], var1[1], b.G), new RegionPoint(var1[9], var1[21], var1[1], b.G), var1[26], var1[6], new RegionPoint(var1[37], var1[24], var1[1], b.G), k.EAST, j.SOUTH);
        EAST_II_V = new GameEnum8(List.of(new Triple((Object)new RegionPoint(var1[41], var1[23], var1[5], b.G), (Object)var1[1], (Object)var1[6]), new Triple((Object)new RegionPoint(var1[30], var1[23], var1[5], b.G), (Object)var1[1], (Object)var1[6])), new RegionPoint(var1[41], var1[23], var1[5], b.G), new RegionPoint(var1[22], var1[38], var1[5], b.G), new RegionPoint(var1[22], var1[6], var1[5], b.G), var1[6], var1[36], new RegionPoint(var1[41], var1[2], var1[5], b.G), k.SOUTH, j.WEST);
        NORTH_II_II = new GameEnum8(new RegionPoint(var1[36], var1[41], var1[5], b.G), var1[6], var1[6], new RegionPoint(var1[23], var1[43], var1[5], b.G), new RegionPoint(var1[40], var1[29], var1[5], b.G), new RegionPoint(var1[3], var1[29], var1[5], b.G), var1[4], var1[6], new RegionPoint(var1[26], var1[1], var1[5], b.H), k.EAST, j.SOUTH);
        EAST_III_IV = new GameEnum8(new RegionPoint(var1[43], var1[44], var1[5], b.J), var1[14], var1[4], new RegionPoint(var1[43], var1[44], var1[5], b.J), new RegionPoint(var1[22], var1[45], var1[5], b.J), new RegionPoint(var1[46], var1[16], var1[5], b.J), var1[6], var1[47], new RegionPoint(var1[48], var1[19], var1[5], b.J), k.SOUTH, j.EAST);
        WEST_III_I = new GameEnum8(new RegionPoint(var1[36], var1[37], var1[5], b.J), var1[11], var1[2], new RegionPoint(var1[36], var1[47], var1[5], b.J), new RegionPoint(var1[3], var1[50], var1[5], b.J), new RegionPoint(var1[14], var1[50], var1[5], b.J), var1[15], var1[6], new RegionPoint(var1[15], var1[31], var1[5], b.J), k.WEST, j.SOUTH);
        WEST_III_V = new GameEnum8(new RegionPoint(var1[2], var1[51], var1[5], b.J), var1[5], var1[13], new RegionPoint(var1[2], var1[51], var1[5], b.J), new RegionPoint(var1[6], var1[50], var1[5], b.J), new RegionPoint(var1[1], var1[36], var1[5], b.J), var1[6], var1[17], new RegionPoint(var1[9], var1[23], var1[5], b.J), k.SOUTH, j.EAST);
        SOUTH_IV_VI = new GameEnum8(new RegionPoint(var1[38], var1[41], var1[5], b.M), var1[6], var1[10], new RegionPoint(var1[40], var1[25], var1[5], b.M), new RegionPoint(var1[42], var1[0], var1[5], b.L), new RegionPoint(var1[38], var1[0], var1[5], b.L), var1[52], var1[6], new RegionPoint(var1[46], var1[12], var1[5], b.L), k.EAST, j.SOUTH);
        NORTH_IV_V = new GameEnum8(new RegionPoint(var1[13], var1[22], var1[5], b.L), var1[6], var1[6], new RegionPoint(var1[4], var1[29], var1[5], b.L), new RegionPoint(var1[15], var1[30], var1[5], b.L), new RegionPoint(var1[10], var1[30], var1[5], b.L), var1[44], var1[6], new RegionPoint(var1[53], var1[29], var1[5], b.L), k.EAST, j.SOUTH);
        NORTH_IV_IX = new GameEnum8(new RegionPoint(var1[16], var1[54], var1[5], b.L), var1[12], var1[11], new RegionPoint(var1[19], var1[54], var1[5], b.L), new RegionPoint(var1[20], var1[53], var1[5], b.L), new RegionPoint(var1[16], var1[55], var1[5], b.L), var1[56], var1[6], new RegionPoint(var1[57], var1[58], var1[5], b.L), k.EAST, j.NORTH);
        EAST_IV_I = new GameEnum8(new RegionPoint(var1[45], var1[59], var1[1], b.L), var1[16], var1[12], new RegionPoint(var1[60], var1[61], var1[1], b.L), new RegionPoint(var1[46], var1[51], var1[1], b.L), new RegionPoint(var1[46], var1[40], var1[1], b.L), var1[6], var1[17], new RegionPoint(var1[3], var1[23], var1[1], b.L), k.SOUTH_BLADE, j.WEST);
        EAST_IV_III = new GameEnum8(new RegionPoint(var1[0], var1[0], var1[0], var1[0]), var1[1], var1[1], new RegionPoint(var1[60], var1[61], var1[1], b.L), new RegionPoint(var1[0], var1[0], var1[0], var1[0]), new RegionPoint(var1[46], var1[5], var1[1], b.L), var1[6], var1[17], new RegionPoint(var1[48], var1[10], var1[1], b.L), k.SOUTH, j.WEST);
        WEST_IV_V = new GameEnum8(new RegionPoint(var1[6], var1[59], var1[1], b.L), var1[8], var1[16], new RegionPoint(var1[10], var1[59], var1[1], b.L), new RegionPoint(var1[11], var1[37], var1[0], b.L), new RegionPoint(var1[11], var1[8], var1[1], b.L), var1[6], var1[37], new RegionPoint(var1[18], var1[10], var1[1], b.L), k.SOUTH, j.WEST);
        MIDDLE_V_I = new GameEnum8(new RegionPoint(var1[9], var1[5], var1[1], b.N), var1[13], var1[14], new RegionPoint(var1[9], var1[10], var1[1], b.N), new RegionPoint(var1[8], var1[11], var1[0], b.N), new RegionPoint(var1[6], var1[8], var1[1], b.N), var1[6], var1[59], new RegionPoint(var1[0], var1[47], var1[1], b.N), k.NORTH, j.EAST);
        BOTTOM_V_I = new GameEnum8(new RegionPoint(var1[43], var1[0], var1[0], b.N), var1[13], var1[14], new RegionPoint(var1[43], var1[2], var1[0], b.N), new RegionPoint(var1[22], var1[8], var1[0], b.N), new RegionPoint(var1[46], var1[5], var1[0], b.N), var1[6], var1[58], new RegionPoint(var1[30], var1[28], var1[0], b.N), k.NORTH, j.EAST);
        i[] iArray = new i[var1[17]];
        iArray[i.var1[0]] = NORTH_I_I;
        iArray[i.var1[1]] = WEST_I_IV;
        iArray[i.var1[5]] = SOUTH_I_IV;
        iArray[i.var1[6]] = SOUTH_II_I;
        iArray[i.var1[2]] = SOUTH_II_V;
        iArray[i.var1[8]] = EAST_II_V;
        iArray[i.var1[9]] = NORTH_II_II;
        iArray[i.var1[10]] = EAST_III_IV;
        iArray[i.var1[11]] = WEST_III_I;
        iArray[i.var1[12]] = WEST_III_V;
        iArray[i.var1[13]] = SOUTH_IV_VI;
        iArray[i.var1[14]] = NORTH_IV_V;
        iArray[i.var1[4]] = NORTH_IV_IX;
        iArray[i.var1[15]] = EAST_IV_I;
        iArray[i.var1[16]] = EAST_IV_III;
        iArray[i.var1[18]] = WEST_IV_V;
        iArray[i.var1[19]] = MIDDLE_V_I;
        iArray[i.var1[20]] = BOTTOM_V_I;
        $VALUES = iArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> var77 = this.startAreas.get().iterator();
        while (i.var5(var77.hasNext() ? 1 : 0)) {
            void var78;
            WorldArea var79 = var77.next();
            if (i.var5(var79.contains((Locatable)var78) ? 1 : 0)) {
                return var1[1];
            }
            0;
            if null == null continue;
            return ((0xFA ^ 0xA7) & ~(0x10 ^ 0x4D)) != 0;
        }
        return var1[0];
    }

    private static boolean var20(Object object, Object object2) {
        return object != object2;
    }

    private static  int b(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    private static boolean var22(int n2, int n3) {
        return n2 <= n3;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    /*
     * WARNING - void declaration
     */
    private List<TileObject> M() {
        void var80;
        i var81;
        Player player = Players.getLocal();
        if (i.var7(player)) {
            return null;
        }
        if (!i.var20((Object)var81.type, (Object)k.SOUTH) || i.var21((Object)var81.type, (Object)k.SOUTH_BLADE)) {
            return TileObjects.getAll(arg_0 -> i.d((Player)var80, arg_0));
        }
        if (i.var21((Object)var81.type, (Object)k.WEST)) {
            return TileObjects.getAll(arg_0 -> i.c((Player)var80, arg_0));
        }
        if (i.var21((Object)var81.type, (Object)k.EAST)) {
            return TileObjects.getAll(arg_0 -> i.b((Player)var80, arg_0));
        }
        if (i.var21((Object)var81.type, (Object)k.NORTH)) {
            return TileObjects.getAll(arg_0 -> i.a((Player)var80, arg_0));
        }
        return null;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    /*
     * Unable to fully structure code
     */
    private List<WorldPoint> d(List<WorldPoint> var1_1) {
        var2_2 = I.aC();
        var3_3 = new ArrayList<WorldPoint>();
        var82 = i.var1[0];
        while (i.var3(var82, var83.size())) {
            block15: {
                block14: {
                    var84 = (WorldPoint)var83.get(var82);
                    if (!i.var7(var84)) break block14;
                    System.out.println(i.var2[i.var1[2]]);
                    0;
                    if (-1 > 0) {
                        return null;
                    }
                    break block15;
                }
                if (!i.var5((int)var85.contains(var84))) ** GOTO lbl-1000
                if (i.var21((Object)k.NORTH, (Object)var86.type)) {
                    var87.add(var84.dy(i.var1[7]));
                    0;
                    System.out.println(i.var2[i.var1[8]]);
                    0;
                    if (1 < 0) {
                        return null;
                    }
                } else if (i.var21((Object)k.SOUTH, (Object)var86.type)) {
                    var87.add(var84.dy(i.var1[1]));
                    0;
                    System.out.println(i.var2[i.var1[9]]);
                    0;
                    if (1 < 0) {
                        return null;
                    }
                } else if (i.var21((Object)k.EAST, (Object)var86.type)) {
                    var87.add(var84.dx(i.var1[7]));
                    0;
                    System.out.println(i.var2[i.var1[10]]);
                    0;
                    if (-1 > 0) {
                        return null;
                    }
                } else if (i.var21((Object)k.WEST, (Object)var86.type)) {
                    var87.add(var84.dx(i.var1[1]));
                    0;
                    System.out.println(i.var2[i.var1[11]]);
                    0;
                    if (3 != 3) {
                        return null;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var87.add(var84);
                    0;
                }
            }
            ++var82;
            0;
            if (1 == 1) continue;
            return null;
        }
        System.out.println("result lengtH: " + var3_3.size() + " | " + String.valueOf(var3_3));
        return var3_3;
    }

    private static boolean var75(Object object) {
        return object != null;
    }

    private static boolean var73(int n2) {
        return n2 == 0;
    }
}

