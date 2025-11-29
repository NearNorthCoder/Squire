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

import gg.squire.sepulchre.tasks.GameEnum10;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum19;
import gg.squire.sepulchre.tasks.GameEnum13;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public final class GameEnum12
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
        if (i.lIIIlIlIIlIIllI(tileObject.getWorldY() - player.getWorldY(), lllIIlIllIlI[17]) && i.lIIIlIlIIlIIllI(Math.abs(player.getWorldX() - tileObject.getWorldX()), lllIIlIllIlI[6]) && i.lIIIlIlIIlIIIII(player.getPlane(), tileObject.getPlane()) && i.lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[18]]) ? 1 : 0)) {
            n2 = lllIIlIllIlI[1];

            if (((0xF8 ^ 0x91 ^ (0xB2 ^ 0x8E)) & (0x34 ^ 0x18 ^ (0xF8 ^ 0x81) ^ -1)) != 0) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIlIIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIlIIlIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIlIIIlllII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean O() {
        void var1;
        i var2;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return lllIIlIllIlI[0];
        }
        List<WorldPoint> var3 = var2.L();
        List<WorldPoint> var4 = var2.d(var3);
        System.out.println("Ahead: " + String.valueOf(var4));
        List<TileObject> var5 = var2.M();
        System.out.println("statues size: " + var5.size());
        ArrayList<Integer> var6 = new ArrayList<Integer>();
        int var7 = lllIIlIllIlI[0];
        if (i.lIIIlIlIIlIIlll(var5.size())) {
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[12]]);
            int var8 = lllIIlIllIlI[0];
            Iterator<TileObject> var9 = var5.iterator();
            while (i.lIIIlIlIIIlllIl(var9.hasNext() ? 1 : 0)) {
                TileObject var10 = var9.next();
                int var11 = c.a(var10);
                if (i.lIIIlIlIIlIIIII(var11, b.x)) {
                    ++var7;
                }
                if (i.lIIIlIlIIlIIIll(var11, b.x)) {
                    if (!i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.SOUTH) || !i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.NORTH) || i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.SOUTH_BLADE)) {
                        System.out.println("Blacklisting: " + var10.getWorldX());
                        var6.add(var10.getWorldX());

                        if (1 != 3) continue;
                        return false;
                    }
                    if (i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.WEST) && !i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.EAST)) continue;
                    System.out.println("Blacklisting: " + var10.getWorldY());
                    var6.add(var10.getWorldY());

                    if (-1 != ((0x3C ^ 8 ^ (0x1B ^ 0xC)) & (4 ^ 0x75 ^ (0xF4 ^ 0xA6) ^ -1))) continue;
                    return ((0x92 ^ 0xB0 ^ (0x5C ^ 0x47)) & (165 + 42 - 64 + 42 ^ 42 + 109 - 127 + 104 ^ -1)) != 0;
                }
                if (i.lIIIlIlIIIlllIl(var2.a(var7) ? 1 : 0)) {
                    System.out.println(lllIIlIIIlIl[lllIIlIllIlI[13]]);
                    Movement.setDestination((WorldPoint)var2.dartDestination.get());
                    return lllIIlIllIlI[1];
                }
                ++var7;

                if (1 != 2) continue;
                return false;
            }
            System.out.println("Blacklisted " + var8 + " elements");
            if (!i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.SOUTH) || !i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.NORTH) || i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.SOUTH_BLADE)) {
                var4.removeIf(worldPoint -> var6.contains(worldPoint.getWorldX()));

                if (3 <= 0) {
                    return (1 & ~1) != 0;
                }
            } else if (!i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.WEST) || i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.EAST)) {
                var4.removeIf(worldPoint -> var6.contains(worldPoint.getWorldY()));

            }
            if (i.lIIIlIlIIIlllIl(var4.size())) {
                var4.sort(Comparator.comparingInt(arg_0 -> i.b((Player)var1, arg_0)));
                System.out.println(lllIIlIIIlIl[lllIIlIllIlI[14]]);
                Movement.setDestination((WorldPoint)var4.get(lllIIlIllIlI[0]));
                return lllIIlIllIlI[1];
            }
            return lllIIlIllIlI[1];
        }
        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[4]]);
        List<NPC> var8 = var2.N();
        var8.sort(Comparator.comparingInt(arg_0 -> i.a((Player)var1, arg_0)));
        var6.clear();
        int var9 = lllIIlIllIlI[0];
        while (i.lIIIlIlIIlIIllI(var9, lllIIlIllIlI[5])) {
            if (i.lIIIlIlIIlIIIlI(var8.size(), var9)) {

                if (3 > 2) break;
                return false;
            }
            NPC var10 = var8.get(var9);
            if (i.lIIIlIlIIIlllII(var10)) {
                var8.remove(var9);

                if (3 >= -1) continue;
                return false;
            }
            if (!i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.SOUTH_BLADE)) {
                if (i.lIIIlIlIIlIIllI(var10.getWorldY(), var1.getWorldY())) {
                    var6.add(var10.getWorldX());

                    ++var9;

                    if (-1 <= ((0x1D ^ 0x7E) & ~(0x7A ^ 0x19))) continue;
                    return false;
                }
                var8.remove(var9);

            }
            if (i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.WEST)) {
                if (i.lIIIlIlIIlIIllI(var10.getWorldX(), var1.getWorldX())) {
                    var6.add(var10.getWorldY());

                    ++var9;

                    if ((0x52 ^ 0x56) != 0) continue;
                    return false;
                }
                var8.remove(var9);

            }
            if (i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.EAST)) {
                if (i.lIIIlIlIIlIlIII(var10.getWorldX(), var1.getWorldX())) {
                    var6.add(var10.getWorldY());

                    ++var9;

                    if (1 >= ((0x62 ^ 0x25) & ~(0xD7 ^ 0x90))) continue;
                    return false;
                }
                var8.remove(var9);

            }
            if (i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.NORTH)) {
                if (i.lIIIlIlIIlIlIII(var10.getWorldY(), var1.getWorldY())) {
                    var6.add(var10.getWorldX());

                    ++var9;

                    if (-1 < 0) continue;
                    return false;
                }
                var8.remove(var9);

            }

            if ((0x9F ^ 0x9B) >= 3) continue;
            return false;
        }
        if (!i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.SOUTH) || !i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.NORTH) || i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.SOUTH_BLADE)) {
            var4.removeIf(worldPoint -> var6.contains(worldPoint.getWorldX()));

            if (1 != 1) {
                return ((206 + 147 - 245 + 116 ^ 31 + 26 - -24 + 97) & (0x34 ^ 0x20 ^ (0xD5 ^ 0x93) ^ -1)) != 0;
            }
        } else if (!i.lIIIlIlIIlIIlIl((Object)var2.type, (Object)k.WEST) || i.lIIIlIlIIIlllll((Object)var2.type, (Object)k.EAST)) {
            var4.removeIf(worldPoint -> var6.contains(worldPoint.getWorldY()));

        }
        if (i.lIIIlIlIIIlllIl(var4.size())) {
            var4.sort(Comparator.comparingInt(arg_0 -> i.a((Player)var1, arg_0)));
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[15]]);
            Movement.setDestination((WorldPoint)var4.get(lllIIlIllIlI[0]));
            return lllIIlIllIlI[1];
        }
        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[16]]);
        return lllIIlIllIlI[0];
    }

    private static void lIIIlIlIIIllIlI() {
        lllIIlIIIlIl = new String[lllIIlIllIlI[61]];
        i.lllIIlIIIlIl[i.lllIIlIllIlI[0]] = "in here!";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[1]] = "Knight Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[5]] = "Can start EAST";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[6]] = "should finish is false";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[2]] = "point is null!";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[8]] = "Changed ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[9]] = "Changed ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[10]] = "Changed ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[11]] = "Changed ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[12]] = "statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[13]] = "ShouldFinish!";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[14]] = "Statues: Walking ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[4]] = "darts";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[15]] = "Darts: walking ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[16]] = "error!";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[18]] = "Crossbowman Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[19]] = "Crossbowman Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[20]] = "Crossbowman Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[17]] = "Crossbowman Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[21]] = "NORTH_I_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[3]] = "WEST_I_IV";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[36]] = "SOUTH_I_IV";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[38]] = "SOUTH_II_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[23]] = "SOUTH_II_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[40]] = "EAST_II_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[42]] = "NORTH_II_II";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[27]] = "EAST_III_IV";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[49]] = "WEST_III_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[24]] = "WEST_III_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[26]] = "SOUTH_IV_VI";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[39]] = "NORTH_IV_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[37]] = "NORTH_IV_IX";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[59]] = "EAST_IV_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[62]] = "EAST_IV_III";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[47]] = "WEST_IV_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[50]] = "MIDDLE_V_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[51]] = "BOTTOM_V_I";
    }

    private static  boolean e(Player player, NPC nPC) {
        int n2;
        if (i.lIIIlIlIIIlllIl(b.z.contains(nPC.getId()) ? 1 : 0) && i.lIIIlIlIIlIIllI(nPC.getWorldY(), player.getWorldY() + lllIIlIllIlI[1]) && i.lIIIlIlIIlIIllI(Math.abs(nPC.getWorldX() - player.getWorldX()), lllIIlIllIlI[2]) && i.lIIIlIlIIlIlIII(nPC.getWorldY(), player.getWorldY() - lllIIlIllIlI[3]) && i.lIIIlIlIIlIIIII(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIlIllIlI[1];

            if (3 == -1) {
                return ((8 ^ 0x4C ^ (0x19 ^ 0x69)) & (0xD5 ^ 0x92 ^ (0x7B ^ 8) ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private static  boolean b(Player player, TileObject tileObject) {
        int n2;
        if (i.lIIIlIlIIlIIllI(tileObject.getWorldX() - player.getWorldX(), lllIIlIllIlI[17]) && i.lIIIlIlIIlIIllI(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIlIllIlI[6]) && i.lIIIlIlIIlIIIII(player.getPlane(), tileObject.getPlane()) && i.lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[19]]) ? 1 : 0)) {
            n2 = lllIIlIllIlI[1];

            if ((0xD6 ^ 0xC0 ^ (0x11 ^ 3)) < (0x6A ^ 0x6F ^ 1)) {
                return ((0x58 ^ 0x19 ^ (0xF4 ^ 0x8C)) & (0x54 ^ 0x41 ^ (0x67 ^ 0x4B) ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIlIIIlllIl(int n2) {
        return n2 != 0;
    }

    private static  boolean c(Player player, NPC nPC) {
        int n2;
        if (i.lIIIlIlIIIlllIl(b.z.contains(nPC.getId()) ? 1 : 0) && i.lIIIlIlIIlIIllI(nPC.getWorldX(), player.getWorldX() + lllIIlIllIlI[3]) && i.lIIIlIlIIlIIllI(Math.abs(nPC.getWorldY() - player.getWorldY()), lllIIlIllIlI[2]) && i.lIIIlIlIIlIlIII(nPC.getWorldX(), player.getWorldX() - lllIIlIllIlI[1]) && i.lIIIlIlIIlIIIII(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIlIllIlI[1];

            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private static  boolean d(Player player, TileObject tileObject) {
        int n2;
        if (i.lIIIlIlIIlIIllI(player.getWorldY() - tileObject.getWorldY(), lllIIlIllIlI[17]) && i.lIIIlIlIIlIIllI(Math.abs(player.getWorldX() - tileObject.getWorldX()), lllIIlIllIlI[6]) && i.lIIIlIlIIlIIIII(player.getPlane(), tileObject.getPlane()) && i.lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[17]]) ? 1 : 0)) {
            n2 = lllIIlIllIlI[1];

            if ((29 + 90 - 111 + 136 ^ 97 + 116 - 199 + 134) == 0) {
                return ((48 + 127 - 126 + 170 ^ 158 + 141 - 151 + 50) & (0x45 ^ 0x54 ^ (0x2A ^ 0x26) ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2) {
        void var12;
        i var13;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return lllIIlIllIlI[0];
        }
        int var14 = lllIIlIllIlI[0];
        if (!i.lIIIlIlIIlIIlIl((Object)var13.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)var13.type, (Object)k.SOUTH_BLADE)) {
            if (i.lIIIlIlIIlIIIlI(var13.Q().get().getWorldY(), var12.getWorldY())) {
                return lllIIlIllIlI[0];
            }
            var14 = Math.abs(var13.dartDestination.get().getWorldY() - var12.getWorldY());
        }
        if (i.lIIIlIlIIIlllll((Object)var13.type, (Object)k.WEST)) {
            if (i.lIIIlIlIIlIIIlI(var13.Q().get().getWorldX(), var12.getWorldX())) {
                return lllIIlIllIlI[0];
            }
            var14 = Math.abs(var13.dartDestination.get().getWorldX() - var12.getWorldX());
        }
        if (i.lIIIlIlIIIlllll((Object)var13.type, (Object)k.EAST)) {
            if (i.lIIIlIlIIlIIIIl(var13.Q().get().getWorldX(), var12.getWorldX())) {
                return lllIIlIllIlI[0];
            }
            var14 = Math.abs(var13.dartDestination.get().getWorldX() - var12.getWorldX());
        }
        if (i.lIIIlIlIIIlllll((Object)var13.type, (Object)k.NORTH)) {
            if (i.lIIIlIlIIlIIIIl(var13.Q().get().getWorldY(), var12.getWorldY())) {
                return lllIIlIllIlI[0];
            }
            var14 = Math.abs(var13.dartDestination.get().getWorldY() - var12.getWorldY());
        }
        List<TileObject> var15 = var13.M();
        int var16 = lllIIlIllIlI[0];
        while (i.lIIIlIlIIlIIllI(var16, var15.size()) && i.lIIIlIlIIlIIllI(var16, lllIIlIllIlI[6])) {
            void var17;
            if (i.lIIIlIlIIlIIIIl(var16, var15.size())) {

                if (3 == 3) break;
                return false;
            }
            TileObject var18 = var15.get(var16);
            int var19 = c.a(var18);
            if (!i.lIIIlIlIIlIIIll(var19, b.y) || i.lIIIlIlIIlIIIII((int)var17, lllIIlIllIlI[6])) {
                return lllIIlIllIlI[1];
            }
            ++var16;

            if (3 <= 3) continue;
            return false;
        }
        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[6]]);
        return lllIIlIllIlI[0];
    }

    private static  boolean b(Player player, NPC nPC) {
        int n2;
        if (i.lIIIlIlIIIlllIl(b.z.contains(nPC.getId()) ? 1 : 0) && i.lIIIlIlIIlIlIII(nPC.getWorldY(), player.getWorldY() - lllIIlIllIlI[1]) && i.lIIIlIlIIlIIllI(Math.abs(nPC.getWorldX() - player.getWorldX()), lllIIlIllIlI[2]) && i.lIIIlIlIIlIIllI(nPC.getWorldY(), player.getWorldY() + lllIIlIllIlI[3]) && i.lIIIlIlIIlIIIII(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIlIllIlI[1];

            if ((0x32 ^ 0x3F ^ (0x94 ^ 0x9C)) <= 0) {
                return ((0x4B ^ 0x17 ^ (0x1F ^ 0x15)) & (55 + 90 - -3 + 60 ^ 88 + 70 - 50 + 26 ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIlIIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> L() {
        void var20;
        i var21;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return null;
        }
        if (!i.lIIIlIlIIlIIlIl((Object)var21.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)var21.type, (Object)k.SOUTH_BLADE)) {
            if (i.lIIIlIlIIIlllll((Object)var21.entry, (Object)j.WEST)) {
                WorldPoint var22 = new WorldPoint(var21.startPoint.get().getWorldX() + lllIIlIllIlI[1], var20.getWorldY() - lllIIlIllIlI[5], var20.getPlane());
                return new WorldArea(var22, lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
            if (i.lIIIlIlIIIlllll((Object)var21.entry, (Object)j.EAST)) {
                WorldPoint var22 = new WorldPoint(var21.startPoint.get().getWorldX() - lllIIlIllIlI[6], var20.getWorldY() - lllIIlIllIlI[5], var20.getPlane());
                return new WorldArea(var22, lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
        }
        if (i.lIIIlIlIIIlllll((Object)var21.type, (Object)k.NORTH)) {
            if (i.lIIIlIlIIIlllll((Object)var21.entry, (Object)j.WEST)) {
                WorldPoint var22 = new WorldPoint(var21.startPoint.get().getWorldX() + lllIIlIllIlI[1], var20.getWorldY() + lllIIlIllIlI[5], var20.getPlane());
                return new WorldArea(var22, lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
            if (i.lIIIlIlIIIlllll((Object)var21.entry, (Object)j.EAST)) {
                WorldPoint var22 = new WorldPoint(var21.startPoint.get().getWorldX() - lllIIlIllIlI[6], var20.getWorldY() + lllIIlIllIlI[5], var20.getPlane());
                return new WorldArea(var22, lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
        }
        if (i.lIIIlIlIIIlllll((Object)var21.type, (Object)k.WEST)) {
            if (i.lIIIlIlIIIlllll((Object)var21.entry, (Object)j.NORTH)) {
                WorldPoint var22 = new WorldPoint(var20.getWorldX() - lllIIlIllIlI[5], var21.startPoint.get().getWorldY() - lllIIlIllIlI[6], var20.getPlane());
                return new WorldArea(var22, lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
            if (i.lIIIlIlIIIlllll((Object)var21.entry, (Object)j.SOUTH)) {
                WorldPoint var22 = new WorldPoint(var20.getWorldX() - lllIIlIllIlI[5], var21.startPoint.get().getWorldY() + lllIIlIllIlI[1], var20.getPlane());
                return new WorldArea(var22, lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
        }
        if (i.lIIIlIlIIIlllll((Object)var21.type, (Object)k.EAST)) {
            if (i.lIIIlIlIIIlllll((Object)var21.entry, (Object)j.NORTH)) {
                WorldPoint var22 = new WorldPoint(var20.getWorldX() + lllIIlIllIlI[5], var21.startPoint.get().getWorldY() - lllIIlIllIlI[6], var20.getPlane());
                return new WorldArea(var22, lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
            if (i.lIIIlIlIIIlllll((Object)var21.entry, (Object)j.SOUTH)) {
                WorldPoint var22 = new WorldPoint(var20.getWorldX() + lllIIlIllIlI[5], var21.startPoint.get().getWorldY() + lllIIlIllIlI[1], var20.getPlane());
                return new WorldArea(var22, lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> N() {
        void var23;
        i var24;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return null;
        }
        if (!i.lIIIlIlIIlIIlIl((Object)var24.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)var24.type, (Object)k.SOUTH_BLADE)) {
            return NPCs.getAll(arg_0 -> i.e((Player)var23, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)var24.type, (Object)k.WEST)) {
            return NPCs.getAll(arg_0 -> i.d((Player)var23, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)var24.type, (Object)k.EAST)) {
            return NPCs.getAll(arg_0 -> i.c((Player)var23, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)var24.type, (Object)k.NORTH)) {
            return NPCs.getAll(arg_0 -> i.b((Player)var23, arg_0));
        }
        return null;
    }

        return String.valueOf(var25);
    }

    private GameEnum12(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, k k2, j j2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.type = k2;
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.entry = j2;
    }

    private static boolean lIIIlIlIIlIIllI(int n2, int n3) {
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
        if (i.lIIIlIlIIIlllIl(b.z.contains(nPC.getId()) ? 1 : 0) && i.lIIIlIlIIlIIllI(nPC.getWorldX(), player.getWorldX() + lllIIlIllIlI[1]) && i.lIIIlIlIIlIIllI(Math.abs(nPC.getWorldY() - player.getWorldY()), lllIIlIllIlI[2]) && i.lIIIlIlIIlIlIII(nPC.getWorldX(), player.getWorldX() - lllIIlIllIlI[3]) && i.lIIIlIlIIlIIIII(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIlIllIlI[1];

            if (-1 > -1) {
                return ((0x1F ^ 0x4E ^ (0x32 ^ 0x6F)) & (40 + 19 - 25 + 99 ^ 25 + 131 - 58 + 39 ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private GameEnum12(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, k k2, j j2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var26 = list.iterator();
            while (i.lIIIlIlIIIlllIl(var26.hasNext() ? 1 : 0)) {
                void var27;
                Triple var28 = (Triple)var26.next();
                var27.add(new WorldArea(SquireSepulchre.a((RegionPoint)var28.getFirst()), ((Integer)var28.getSecond()).intValue(), ((Integer)var28.getThird()).intValue()));

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

    private static boolean lIIIlIlIIlIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static  int f(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    private static boolean lIIIlIlIIIlllll(Object object, Object object2) {
        return object == object2;
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
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

    private static boolean lIIIlIlIIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static  boolean c(Player player, TileObject tileObject) {
        int n2;
        if (i.lIIIlIlIIlIIllI(player.getWorldX() - tileObject.getWorldX(), lllIIlIllIlI[17]) && i.lIIIlIlIIlIIllI(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIlIllIlI[6]) && i.lIIIlIlIIlIIIII(player.getPlane(), tileObject.getPlane()) && i.lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[20]]) ? 1 : 0)) {
            n2 = lllIIlIllIlI[1];

            if (((0x28 ^ 0x3E) & ~(0x58 ^ 0x4E)) != 0) {
                return false;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var29;
        void var30;
        i var31;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return lllIIlIllIlI[0];
        }
        if (i.lIIIlIlIIIlllIl(var31.b((Locatable)var30) ? 1 : 0)) {
            void var32;
            var31.a((SquireSepulchre)var29);
            if (i.lIIIlIlIIIlllIl(var31.b((SepulchreManager) ar32) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var31.startDestination.get());
                return lllIIlIllIlI[1];
            }
            Movement.setDestination((WorldPoint)var31.startPoint.get());
            return lllIIlIllIlI[1];
        }
        if (i.lIIIlIlIIIlllIl(var31.c((Locatable)var30) ? 1 : 0)) {
            var31.b((SquireSepulchre)var29);
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[0]]);
            var31.O();

            return lllIIlIllIlI[1];
        }
        return lllIIlIllIlI[0];
    }

    private static  int a(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(d d2) {
        J var33;
        TileObject var34;
        i var35;
        void var36;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return lllIIlIllIlI[0];
        }
        if (i.lIIIlIlIIIllllI(var36.getWorldLocation().equals((Object)var35.startPoint.get()) ? 1 : 0)) {
            return lllIIlIllIlI[0];
        }
        if (i.lIIIlIlIIIlllll((Object)var35.type, (Object)k.SOUTH_BLADE)) {
            void var37;
            String[] stringArray = new String[lllIIlIllIlI[1]];
            stringArray[i.lllIIlIllIlI[0]] = lllIIlIIIlIl[lllIIlIllIlI[1]];
            var34 = TileObjects.getNearest((String[])stringArray);
            if (i.lIIIlIlIIIlllII(var34)) {
                return lllIIlIllIlI[0];
            }
            var33 = var37.b(var34);
            System.out.println("ID: " + var33.aG() + " | ticks: " + var33.aF());
            if ((!i.lIIIlIlIIlIIIII(var33.aG(), b.s) || i.lIIIlIlIIlIIIIl(var33.aF(), lllIIlIllIlI[2]) && i.lIIIlIlIIlIIIlI(var33.aF(), lllIIlIllIlI[3])) && i.lIIIlIlIIlIIIll(var33.aG(), b.v) && i.lIIIlIlIIlIIIll(var33.aG(), b.t)) {
                return lllIIlIllIlI[0];
            }
        }
        var34 = var35.N();
        var34.sort(Comparator.comparingInt(arg_0 -> i.f((Player)var36, arg_0)));
        System.out.println("darts: " + String.valueOf(var34));
        if (i.lIIIlIlIIIllllI(var34.size())) {
            return lllIIlIllIlI[1];
        }
        var33 = (NPC)var34.get(lllIIlIllIlI[0]);
        if (i.lIIIlIlIIlIIlII(var33)) {
            if (!i.lIIIlIlIIlIIlIl((Object)var35.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)var35.type, (Object)k.SOUTH_BLADE)) {
                int var38 = Math.abs(var33.getWorldY() - var36.getWorldY());
                if (i.lIIIlIlIIlIIIII(var33.getWorldX(), var35.P().get().getWorldX()) && i.lIIIlIlIIlIIllI(var38, lllIIlIllIlI[4])) {
                    return lllIIlIllIlI[0];
                }
                return lllIIlIllIlI[1];
            }
            if (i.lIIIlIlIIIlllll((Object)var35.type, (Object)k.WEST)) {
                int var38 = Math.abs(var33.getWorldX() - var36.getWorldX());
                if (i.lIIIlIlIIlIIIII(var33.getWorldY(), var35.P().get().getWorldY()) && i.lIIIlIlIIlIIllI(var38, lllIIlIllIlI[4])) {
                    return lllIIlIllIlI[0];
                }
                return lllIIlIllIlI[1];
            }
            if (i.lIIIlIlIIIlllll((Object)var35.type, (Object)k.EAST)) {
                System.out.println(lllIIlIIIlIl[lllIIlIllIlI[5]]);
                int var38 = Math.abs(var33.getWorldX() - var36.getWorldX());
                if (i.lIIIlIlIIlIIIII(var33.getWorldY(), var35.P().get().getWorldY()) && i.lIIIlIlIIlIIllI(var38, lllIIlIllIlI[4])) {
                    return lllIIlIllIlI[0];
                }
                return lllIIlIllIlI[1];
            }
            if (i.lIIIlIlIIIlllll((Object)var35.type, (Object)k.NORTH)) {
                int var38 = Math.abs(var33.getWorldY() - var36.getWorldY());
                if (i.lIIIlIlIIlIIIII(var33.getWorldX(), var35.P().get().getWorldX()) && i.lIIIlIlIIlIIllI(var38, lllIIlIllIlI[4])) {
                    return lllIIlIllIlI[0];
                }
                return lllIIlIllIlI[1];
            }
            return lllIIlIllIlI[0];
        }
        return lllIIlIllIlI[0];
    }

    static {
        i.lIIIlIlIIIllIll();
        i.lIIIlIlIIIllIlI();
        NORTH_I_I = new GameEnum12(List.of(new Triple((Object)new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[22], lllIIlIllIlI[5], b.C), (Object)lllIIlIllIlI[23], (Object)lllIIlIllIlI[9]), new Triple((Object)new RegionPoint(lllIIlIllIlI[4], lllIIlIllIlI[0], lllIIlIllIlI[5], b.F), (Object)lllIIlIllIlI[6], (Object)lllIIlIllIlI[6])), new RegionPoint(lllIIlIllIlI[24], lllIIlIllIlI[25], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[26], lllIIlIllIlI[0], lllIIlIllIlI[5], b.F), new RegionPoint(lllIIlIllIlI[27], lllIIlIllIlI[0], lllIIlIllIlI[5], b.F), lllIIlIllIlI[17], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[28], lllIIlIllIlI[29], lllIIlIllIlI[5], b.C), k.EAST, j.SOUTH);
        WEST_I_IV = new GameEnum12(List.of(new Triple((Object)new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[31], lllIIlIllIlI[5], lllIIlIllIlI[32]), (Object)lllIIlIllIlI[6], (Object)lllIIlIllIlI[18]), new Triple((Object)new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[33], lllIIlIllIlI[5], b.C), (Object)lllIIlIllIlI[12], (Object)lllIIlIllIlI[6])), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[33], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[34], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[35], lllIIlIllIlI[5], b.C), lllIIlIllIlI[17], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[28], lllIIlIllIlI[5], b.C), k.EAST, j.NORTH);
        SOUTH_I_IV = new GameEnum12(new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[21], lllIIlIllIlI[5], b.C), lllIIlIllIlI[6], lllIIlIllIlI[2], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[39], lllIIlIllIlI[23], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[23], lllIIlIllIlI[5], b.C), lllIIlIllIlI[16], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[23], lllIIlIllIlI[37], lllIIlIllIlI[5], b.C), k.WEST, j.SOUTH);
        SOUTH_II_I = new GameEnum12(new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], b.G), lllIIlIllIlI[6], lllIIlIllIlI[10], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[39], lllIIlIllIlI[36], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[21], lllIIlIllIlI[5], b.G), lllIIlIllIlI[20], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[17], lllIIlIllIlI[12], lllIIlIllIlI[5], b.G), k.WEST, j.NORTH);
        SOUTH_II_V = new GameEnum12(new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[20], lllIIlIllIlI[1], b.G), lllIIlIllIlI[6], lllIIlIllIlI[5], new RegionPoint(lllIIlIllIlI[19], lllIIlIllIlI[17], lllIIlIllIlI[1], b.G), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[21], lllIIlIllIlI[1], b.G), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[21], lllIIlIllIlI[1], b.G), lllIIlIllIlI[26], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[24], lllIIlIllIlI[1], b.G), k.EAST, j.SOUTH);
        EAST_II_V = new GameEnum12(List.of(new Triple((Object)new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[23], lllIIlIllIlI[5], b.G), (Object)lllIIlIllIlI[1], (Object)lllIIlIllIlI[6]), new Triple((Object)new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[23], lllIIlIllIlI[5], b.G), (Object)lllIIlIllIlI[1], (Object)lllIIlIllIlI[6])), new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[23], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[38], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[6], lllIIlIllIlI[5], b.G), lllIIlIllIlI[6], lllIIlIllIlI[36], new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[2], lllIIlIllIlI[5], b.G), k.SOUTH, j.WEST);
        NORTH_II_II = new GameEnum12(new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[41], lllIIlIllIlI[5], b.G), lllIIlIllIlI[6], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[23], lllIIlIllIlI[43], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[40], lllIIlIllIlI[29], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[29], lllIIlIllIlI[5], b.G), lllIIlIllIlI[4], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[26], lllIIlIllIlI[1], lllIIlIllIlI[5], b.H), k.EAST, j.SOUTH);
        EAST_III_IV = new GameEnum12(new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[44], lllIIlIllIlI[5], b.J), lllIIlIllIlI[14], lllIIlIllIlI[4], new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[44], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[45], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[16], lllIIlIllIlI[5], b.J), lllIIlIllIlI[6], lllIIlIllIlI[47], new RegionPoint(lllIIlIllIlI[48], lllIIlIllIlI[19], lllIIlIllIlI[5], b.J), k.SOUTH, j.EAST);
        WEST_III_I = new GameEnum12(new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[37], lllIIlIllIlI[5], b.J), lllIIlIllIlI[11], lllIIlIllIlI[2], new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[47], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[50], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[14], lllIIlIllIlI[50], lllIIlIllIlI[5], b.J), lllIIlIllIlI[15], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[15], lllIIlIllIlI[31], lllIIlIllIlI[5], b.J), k.WEST, j.SOUTH);
        WEST_III_V = new GameEnum12(new RegionPoint(lllIIlIllIlI[2], lllIIlIllIlI[51], lllIIlIllIlI[5], b.J), lllIIlIllIlI[5], lllIIlIllIlI[13], new RegionPoint(lllIIlIllIlI[2], lllIIlIllIlI[51], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[50], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[1], lllIIlIllIlI[36], lllIIlIllIlI[5], b.J), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[23], lllIIlIllIlI[5], b.J), k.SOUTH, j.EAST);
        SOUTH_IV_VI = new GameEnum12(new RegionPoint(lllIIlIllIlI[38], lllIIlIllIlI[41], lllIIlIllIlI[5], b.M), lllIIlIllIlI[6], lllIIlIllIlI[10], new RegionPoint(lllIIlIllIlI[40], lllIIlIllIlI[25], lllIIlIllIlI[5], b.M), new RegionPoint(lllIIlIllIlI[42], lllIIlIllIlI[0], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[38], lllIIlIllIlI[0], lllIIlIllIlI[5], b.L), lllIIlIllIlI[52], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[12], lllIIlIllIlI[5], b.L), k.EAST, j.SOUTH);
        NORTH_IV_V = new GameEnum12(new RegionPoint(lllIIlIllIlI[13], lllIIlIllIlI[22], lllIIlIllIlI[5], b.L), lllIIlIllIlI[6], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[4], lllIIlIllIlI[29], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[15], lllIIlIllIlI[30], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[30], lllIIlIllIlI[5], b.L), lllIIlIllIlI[44], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[53], lllIIlIllIlI[29], lllIIlIllIlI[5], b.L), k.EAST, j.SOUTH);
        NORTH_IV_IX = new GameEnum12(new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[54], lllIIlIllIlI[5], b.L), lllIIlIllIlI[12], lllIIlIllIlI[11], new RegionPoint(lllIIlIllIlI[19], lllIIlIllIlI[54], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[53], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[55], lllIIlIllIlI[5], b.L), lllIIlIllIlI[56], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[57], lllIIlIllIlI[58], lllIIlIllIlI[5], b.L), k.EAST, j.NORTH);
        EAST_IV_I = new GameEnum12(new RegionPoint(lllIIlIllIlI[45], lllIIlIllIlI[59], lllIIlIllIlI[1], b.L), lllIIlIllIlI[16], lllIIlIllIlI[12], new RegionPoint(lllIIlIllIlI[60], lllIIlIllIlI[61], lllIIlIllIlI[1], b.L), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[51], lllIIlIllIlI[1], b.L), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[40], lllIIlIllIlI[1], b.L), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[23], lllIIlIllIlI[1], b.L), k.SOUTH_BLADE, j.WEST);
        EAST_IV_III = new GameEnum12(new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0]), lllIIlIllIlI[1], lllIIlIllIlI[1], new RegionPoint(lllIIlIllIlI[60], lllIIlIllIlI[61], lllIIlIllIlI[1], b.L), new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0]), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[5], lllIIlIllIlI[1], b.L), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[48], lllIIlIllIlI[10], lllIIlIllIlI[1], b.L), k.SOUTH, j.WEST);
        WEST_IV_V = new GameEnum12(new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[59], lllIIlIllIlI[1], b.L), lllIIlIllIlI[8], lllIIlIllIlI[16], new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[59], lllIIlIllIlI[1], b.L), new RegionPoint(lllIIlIllIlI[11], lllIIlIllIlI[37], lllIIlIllIlI[0], b.L), new RegionPoint(lllIIlIllIlI[11], lllIIlIllIlI[8], lllIIlIllIlI[1], b.L), lllIIlIllIlI[6], lllIIlIllIlI[37], new RegionPoint(lllIIlIllIlI[18], lllIIlIllIlI[10], lllIIlIllIlI[1], b.L), k.SOUTH, j.WEST);
        MIDDLE_V_I = new GameEnum12(new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[5], lllIIlIllIlI[1], b.N), lllIIlIllIlI[13], lllIIlIllIlI[14], new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[10], lllIIlIllIlI[1], b.N), new RegionPoint(lllIIlIllIlI[8], lllIIlIllIlI[11], lllIIlIllIlI[0], b.N), new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[8], lllIIlIllIlI[1], b.N), lllIIlIllIlI[6], lllIIlIllIlI[59], new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[47], lllIIlIllIlI[1], b.N), k.NORTH, j.EAST);
        BOTTOM_V_I = new GameEnum12(new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[0], lllIIlIllIlI[0], b.N), lllIIlIllIlI[13], lllIIlIllIlI[14], new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[2], lllIIlIllIlI[0], b.N), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[8], lllIIlIllIlI[0], b.N), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[5], lllIIlIllIlI[0], b.N), lllIIlIllIlI[6], lllIIlIllIlI[58], new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[28], lllIIlIllIlI[0], b.N), k.NORTH, j.EAST);
        i[] iArray = new i[lllIIlIllIlI[17]];
        iArray[i.lllIIlIllIlI[0]] = NORTH_I_I;
        iArray[i.lllIIlIllIlI[1]] = WEST_I_IV;
        iArray[i.lllIIlIllIlI[5]] = SOUTH_I_IV;
        iArray[i.lllIIlIllIlI[6]] = SOUTH_II_I;
        iArray[i.lllIIlIllIlI[2]] = SOUTH_II_V;
        iArray[i.lllIIlIllIlI[8]] = EAST_II_V;
        iArray[i.lllIIlIllIlI[9]] = NORTH_II_II;
        iArray[i.lllIIlIllIlI[10]] = EAST_III_IV;
        iArray[i.lllIIlIllIlI[11]] = WEST_III_I;
        iArray[i.lllIIlIllIlI[12]] = WEST_III_V;
        iArray[i.lllIIlIllIlI[13]] = SOUTH_IV_VI;
        iArray[i.lllIIlIllIlI[14]] = NORTH_IV_V;
        iArray[i.lllIIlIllIlI[4]] = NORTH_IV_IX;
        iArray[i.lllIIlIllIlI[15]] = EAST_IV_I;
        iArray[i.lllIIlIllIlI[16]] = EAST_IV_III;
        iArray[i.lllIIlIllIlI[18]] = WEST_IV_V;
        iArray[i.lllIIlIllIlI[19]] = MIDDLE_V_I;
        iArray[i.lllIIlIllIlI[20]] = BOTTOM_V_I;
        $VALUES = iArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> var39 = this.startAreas.get().iterator();
        while (i.lIIIlIlIIIlllIl(var39.hasNext() ? 1 : 0)) {
            void var40;
            WorldArea var41 = var39.next();
            if (i.lIIIlIlIIIlllIl(var41.contains((Locatable)var40) ? 1 : 0)) {
                return lllIIlIllIlI[1];
            }

            return false;
        }
        return lllIIlIllIlI[0];
    }

    private static boolean lIIIlIlIIlIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static  int b(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    private static boolean lIIIlIlIIlIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    /*
     * WARNING - void declaration
     */
    private List<TileObject> M() {
        void var42;
        i var43;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return null;
        }
        if (!i.lIIIlIlIIlIIlIl((Object)var43.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)var43.type, (Object)k.SOUTH_BLADE)) {
            return TileObjects.getAll(arg_0 -> i.d((Player)var42, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)var43.type, (Object)k.WEST)) {
            return TileObjects.getAll(arg_0 -> i.c((Player)var42, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)var43.type, (Object)k.EAST)) {
            return TileObjects.getAll(arg_0 -> i.b((Player)var42, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)var43.type, (Object)k.NORTH)) {
            return TileObjects.getAll(arg_0 -> i.a((Player)var42, arg_0));
        }
        return null;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    /*
     * Unable to fully structure code
     */
    private List<WorldPoint> d(List<WorldPoint> var1_1) {
        var2_2 = I.aC();
        var3_3 = new ArrayList<WorldPoint>();
        var44 = i.lllIIlIllIlI[0];
        while (i.lIIIlIlIIlIIllI(var44, var45.size())) {
            block15: {
                block14: {
                    var46 = (WorldPoint)var45.get(var44);
                    if (!i.lIIIlIlIIIlllII(var46)) break block14;
                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[2]]);

                    break block15;
                }
                if (!i.lIIIlIlIIIlllIl((int)var47.contains(var46))) ** GOTO lbl-1000
                if (i.lIIIlIlIIIlllll((Object)k.NORTH, (Object)var48.type)) {
                    var49.add(var46.dy(i.lllIIlIllIlI[7]));

                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[8]]);

                    if (1 < 0) {
                        return null;
                    }
                } else if (i.lIIIlIlIIIlllll((Object)k.SOUTH, (Object)var48.type)) {
                    var49.add(var46.dy(i.lllIIlIllIlI[1]));

                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[9]]);

                    if (1 < 0) {
                        return null;
                    }
                } else if (i.lIIIlIlIIIlllll((Object)k.EAST, (Object)var48.type)) {
                    var49.add(var46.dx(i.lllIIlIllIlI[7]));

                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[10]]);

                } else if (i.lIIIlIlIIIlllll((Object)k.WEST, (Object)var48.type)) {
                    var49.add(var46.dx(i.lllIIlIllIlI[1]));

                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[11]]);

                    if (3 != 3) {
                        return null;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var49.add(var46);

                }
            }
            ++var44;

            if (1 == 1) continue;
            return null;
        }
        System.out.println("result lengtH: " + var3_3.size() + " | " + String.valueOf(var3_3));
        return var3_3;
    }

    private static boolean lIIIlIlIIlIIlII(Object object) {
        return object != null;
    }

    private static boolean lIIIlIlIIIllllI(int n2) {
        return n2 == 0;
    }
}

