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
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.I;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.j;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.k;
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

public final class i
extends Enum<i> {
    public static final /* synthetic */ /* enum */ i WEST_III_V;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    /* synthetic */ Supplier<WorldArea> dartArea;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ /* enum */ i EAST_III_IV;
    public static final /* synthetic */ /* enum */ i WEST_IV_V;
    public static final /* synthetic */ /* enum */ i WEST_I_IV;
    private static /* synthetic */ int[] lllIIlIllIlI;
    public static final /* synthetic */ /* enum */ i MIDDLE_V_I;
    public /* synthetic */ Supplier<TileObject> object;
    public static final /* synthetic */ /* enum */ i NORTH_I_I;
    public static final /* synthetic */ /* enum */ i NORTH_IV_V;
    public static final /* synthetic */ /* enum */ i WEST_III_I;
    public static final /* synthetic */ /* enum */ i NORTH_II_II;
    public static final /* synthetic */ /* enum */ i SOUTH_II_V;
    public static final /* synthetic */ /* enum */ i EAST_II_V;
    /* synthetic */ Supplier<WorldPoint> dartDestination;
    public static final /* synthetic */ /* enum */ i SOUTH_II_I;
    /* synthetic */ Supplier<WorldPoint> startDestination;
    public static final /* synthetic */ /* enum */ i EAST_IV_III;
    private static /* synthetic */ String[] lllIIlIIIlIl;
    public static final /* synthetic */ /* enum */ i SOUTH_IV_VI;
    public static final /* synthetic */ /* enum */ i BOTTOM_V_I;
    /* synthetic */ j entry;
    public static final /* synthetic */ /* enum */ i SOUTH_I_IV;
    public static final /* synthetic */ /* enum */ i EAST_IV_I;
    public static final /* synthetic */ /* enum */ i NORTH_IV_IX;
    /* synthetic */ k type;
    private static final /* synthetic */ i[] $VALUES;

    private static /* synthetic */ boolean a(Player player, TileObject tileObject) {
        int n2;
        if (i.lIIIlIlIIlIIllI(tileObject.getWorldY() - player.getWorldY(), lllIIlIllIlI[17]) && i.lIIIlIlIIlIIllI(Math.abs(player.getWorldX() - tileObject.getWorldX()), lllIIlIllIlI[6]) && i.lIIIlIlIIlIIIII(player.getPlane(), tileObject.getPlane()) && i.lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[18]]) ? 1 : 0)) {
            n2 = lllIIlIllIlI[1];
            0;
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
        void lllllllllllllllIIllIlIlIIIIIllIl;
        i lllllllllllllllIIllIlIlIIIIIlllI;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return lllIIlIllIlI[0];
        }
        List<WorldPoint> lllllllllllllllIIllIlIlIIIIIllII = lllllllllllllllIIllIlIlIIIIIlllI.L();
        List<WorldPoint> lllllllllllllllIIllIlIlIIIIIlIll = lllllllllllllllIIllIlIlIIIIIlllI.d(lllllllllllllllIIllIlIlIIIIIllII);
        System.out.println("Ahead: " + String.valueOf(lllllllllllllllIIllIlIlIIIIIlIll));
        List<TileObject> lllllllllllllllIIllIlIlIIIIIlIlI = lllllllllllllllIIllIlIlIIIIIlllI.M();
        System.out.println("statues size: " + lllllllllllllllIIllIlIlIIIIIlIlI.size());
        ArrayList<Integer> lllllllllllllllIIllIlIlIIIIIlIIl = new ArrayList<Integer>();
        int lllllllllllllllIIllIlIlIIIIIlIII = lllIIlIllIlI[0];
        if (i.lIIIlIlIIlIIlll(lllllllllllllllIIllIlIlIIIIIlIlI.size())) {
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[12]]);
            int lllllllllllllllIIllIlIlIIIIIIlll = lllIIlIllIlI[0];
            Iterator<TileObject> lllllllllllllllIIllIlIlIIIIIIllI = lllllllllllllllIIllIlIlIIIIIlIlI.iterator();
            while (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIlIIIIIIllI.hasNext() ? 1 : 0)) {
                TileObject lllllllllllllllIIllIlIlIIIIIIlIl = lllllllllllllllIIllIlIlIIIIIIllI.next();
                int lllllllllllllllIIllIlIlIIIIIIlII = c.a(lllllllllllllllIIllIlIlIIIIIIlIl);
                if (i.lIIIlIlIIlIIIII(lllllllllllllllIIllIlIlIIIIIIlII, b.x)) {
                    ++lllllllllllllllIIllIlIlIIIIIlIII;
                }
                if (i.lIIIlIlIIlIIIll(lllllllllllllllIIllIlIlIIIIIIlII, b.x)) {
                    if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.SOUTH) || !i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.NORTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.SOUTH_BLADE)) {
                        System.out.println("Blacklisting: " + lllllllllllllllIIllIlIlIIIIIIlIl.getWorldX());
                        lllllllllllllllIIllIlIlIIIIIlIIl.add(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldX());
                        0;
                        0;
                        if (1 != 3) continue;
                        return ((8 + 108 - 65 + 79 ^ 150 + 37 - 131 + 95) & (33 + 60 - 15 + 69 ^ 44 + 33 - -48 + 9 ^ -1)) != 0;
                    }
                    if (i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.WEST) && !i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.EAST)) continue;
                    System.out.println("Blacklisting: " + lllllllllllllllIIllIlIlIIIIIIlIl.getWorldY());
                    lllllllllllllllIIllIlIlIIIIIlIIl.add(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldY());
                    0;
                    0;
                    if (-1 != ((0x3C ^ 8 ^ (0x1B ^ 0xC)) & (4 ^ 0x75 ^ (0xF4 ^ 0xA6) ^ -1))) continue;
                    return ((0x92 ^ 0xB0 ^ (0x5C ^ 0x47)) & (165 + 42 - 64 + 42 ^ 42 + 109 - 127 + 104 ^ -1)) != 0;
                }
                if (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIlIIIIIlllI.a(lllllllllllllllIIllIlIlIIIIIlIII) ? 1 : 0)) {
                    System.out.println(lllIIlIIIlIl[lllIIlIllIlI[13]]);
                    Movement.setDestination((WorldPoint)lllllllllllllllIIllIlIlIIIIIlllI.dartDestination.get());
                    return lllIIlIllIlI[1];
                }
                ++lllllllllllllllIIllIlIlIIIIIlIII;
                0;
                if (1 != 2) continue;
                return ((0x5F ^ 7) & ~(0xD ^ 0x55)) != 0;
            }
            System.out.println("Blacklisted " + lllllllllllllllIIllIlIlIIIIIIlll + " elements");
            if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.SOUTH) || !i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.NORTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.SOUTH_BLADE)) {
                lllllllllllllllIIllIlIlIIIIIlIll.removeIf(worldPoint -> lllllllllllllllIIllIlIlIIIIIlIIl.contains(worldPoint.getWorldX()));
                0;
                0;
                if (3 <= 0) {
                    return (1 & ~1) != 0;
                }
            } else if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.WEST) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.EAST)) {
                lllllllllllllllIIllIlIlIIIIIlIll.removeIf(worldPoint -> lllllllllllllllIIllIlIlIIIIIlIIl.contains(worldPoint.getWorldY()));
                0;
            }
            if (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIlIIIIIlIll.size())) {
                lllllllllllllllIIllIlIlIIIIIlIll.sort(Comparator.comparingInt(arg_0 -> i.b((Player)lllllllllllllllIIllIlIlIIIIIllIl, arg_0)));
                System.out.println(lllIIlIIIlIl[lllIIlIllIlI[14]]);
                Movement.setDestination((WorldPoint)lllllllllllllllIIllIlIlIIIIIlIll.get(lllIIlIllIlI[0]));
                return lllIIlIllIlI[1];
            }
            return lllIIlIllIlI[1];
        }
        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[4]]);
        List<NPC> lllllllllllllllIIllIlIlIIIIIIlll = lllllllllllllllIIllIlIlIIIIIlllI.N();
        lllllllllllllllIIllIlIlIIIIIIlll.sort(Comparator.comparingInt(arg_0 -> i.a((Player)lllllllllllllllIIllIlIlIIIIIllIl, arg_0)));
        lllllllllllllllIIllIlIlIIIIIlIIl.clear();
        int lllllllllllllllIIllIlIlIIIIIIllI = lllIIlIllIlI[0];
        while (i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIIIIIllI, lllIIlIllIlI[5])) {
            if (i.lIIIlIlIIlIIIlI(lllllllllllllllIIllIlIlIIIIIIlll.size(), lllllllllllllllIIllIlIlIIIIIIllI)) {
                0;
                if (3 > 2) break;
                return ((0xA ^ 0x5C) & ~(0x60 ^ 0x36)) != 0;
            }
            NPC lllllllllllllllIIllIlIlIIIIIIlIl = lllllllllllllllIIllIlIlIIIIIIlll.get(lllllllllllllllIIllIlIlIIIIIIllI);
            if (i.lIIIlIlIIIlllII(lllllllllllllllIIllIlIlIIIIIIlIl)) {
                lllllllllllllllIIllIlIlIIIIIIlll.remove(lllllllllllllllIIllIlIlIIIIIIllI);
                0;
                0;
                if (3 >= -1) continue;
                return ((0x4F ^ 0x17) & ~(0x3C ^ 0x64)) != 0;
            }
            if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.SOUTH_BLADE)) {
                if (i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldY(), lllllllllllllllIIllIlIlIIIIIllIl.getWorldY())) {
                    lllllllllllllllIIllIlIlIIIIIlIIl.add(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldX());
                    0;
                    ++lllllllllllllllIIllIlIlIIIIIIllI;
                    0;
                    if (-1 <= ((0x1D ^ 0x7E) & ~(0x7A ^ 0x19))) continue;
                    return ((0xFF ^ 0xC2) & ~(0x1F ^ 0x22)) != 0;
                }
                lllllllllllllllIIllIlIlIIIIIIlll.remove(lllllllllllllllIIllIlIlIIIIIIllI);
                0;
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.WEST)) {
                if (i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldX(), lllllllllllllllIIllIlIlIIIIIllIl.getWorldX())) {
                    lllllllllllllllIIllIlIlIIIIIlIIl.add(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldY());
                    0;
                    ++lllllllllllllllIIllIlIlIIIIIIllI;
                    0;
                    if ((0x52 ^ 0x56) != 0) continue;
                    return ((0xB5 ^ 0x84) & ~(0x82 ^ 0xB3)) != 0;
                }
                lllllllllllllllIIllIlIlIIIIIIlll.remove(lllllllllllllllIIllIlIlIIIIIIllI);
                0;
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.EAST)) {
                if (i.lIIIlIlIIlIlIII(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldX(), lllllllllllllllIIllIlIlIIIIIllIl.getWorldX())) {
                    lllllllllllllllIIllIlIlIIIIIlIIl.add(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldY());
                    0;
                    ++lllllllllllllllIIllIlIlIIIIIIllI;
                    0;
                    if (1 >= ((0x62 ^ 0x25) & ~(0xD7 ^ 0x90))) continue;
                    return ((0x2C ^ 0x35) & ~(0x37 ^ 0x2E)) != 0;
                }
                lllllllllllllllIIllIlIlIIIIIIlll.remove(lllllllllllllllIIllIlIlIIIIIIllI);
                0;
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.NORTH)) {
                if (i.lIIIlIlIIlIlIII(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldY(), lllllllllllllllIIllIlIlIIIIIllIl.getWorldY())) {
                    lllllllllllllllIIllIlIlIIIIIlIIl.add(lllllllllllllllIIllIlIlIIIIIIlIl.getWorldX());
                    0;
                    ++lllllllllllllllIIllIlIlIIIIIIllI;
                    0;
                    if (-1 < 0) continue;
                    return ((143 + 182 - 230 + 101 ^ 64 + 43 - 71 + 112) & (0x41 ^ 0x6E ^ 55 + 9 - 62 + 125 ^ -1)) != 0;
                }
                lllllllllllllllIIllIlIlIIIIIIlll.remove(lllllllllllllllIIllIlIlIIIIIIllI);
                0;
            }
            0;
            if ((0x9F ^ 0x9B) >= 3) continue;
            return ((0xFB ^ 0xAA) & ~(0xB ^ 0x5A)) != 0;
        }
        if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.SOUTH) || !i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.NORTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.SOUTH_BLADE)) {
            lllllllllllllllIIllIlIlIIIIIlIll.removeIf(worldPoint -> lllllllllllllllIIllIlIlIIIIIlIIl.contains(worldPoint.getWorldX()));
            0;
            0;
            if (1 != 1) {
                return ((206 + 147 - 245 + 116 ^ 31 + 26 - -24 + 97) & (0x34 ^ 0x20 ^ (0xD5 ^ 0x93) ^ -1)) != 0;
            }
        } else if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.WEST) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIIIlllI.type, (Object)k.EAST)) {
            lllllllllllllllIIllIlIlIIIIIlIll.removeIf(worldPoint -> lllllllllllllllIIllIlIlIIIIIlIIl.contains(worldPoint.getWorldY()));
            0;
        }
        if (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIlIIIIIlIll.size())) {
            lllllllllllllllIIllIlIlIIIIIlIll.sort(Comparator.comparingInt(arg_0 -> i.a((Player)lllllllllllllllIIllIlIlIIIIIllIl, arg_0)));
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[15]]);
            Movement.setDestination((WorldPoint)lllllllllllllllIIllIlIlIIIIIlIll.get(lllIIlIllIlI[0]));
            return lllIIlIllIlI[1];
        }
        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[16]]);
        return lllIIlIllIlI[0];
    }

    private static void lIIIlIlIIIllIlI() {
        lllIIlIIIlIl = new String[lllIIlIllIlI[61]];
        i.lllIIlIIIlIl[i.lllIIlIllIlI[0]] = i."in here!";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[1]] = i."Knight Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[5]] = i."Can start EAST";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[6]] = i."should finish is false";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[2]] = i."point is null!";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[8]] = i."Changed ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[9]] = i."Changed ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[10]] = i."Changed ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[11]] = i."Changed ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[12]] = i."statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[13]] = i."ShouldFinish!";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[14]] = i."Statues: Walking ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[4]] = i."darts";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[15]] = i."Darts: walking ahead";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[16]] = i."error!";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[18]] = i."Crossbowman Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[19]] = i."Crossbowman Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[20]] = i."Crossbowman Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[17]] = i."Crossbowman Statue";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[21]] = i."NORTH_I_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[3]] = i."WEST_I_IV";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[36]] = i."SOUTH_I_IV";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[38]] = i."SOUTH_II_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[23]] = i."SOUTH_II_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[40]] = i."EAST_II_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[42]] = i."NORTH_II_II";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[27]] = i."EAST_III_IV";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[49]] = i."WEST_III_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[24]] = i."WEST_III_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[26]] = i."SOUTH_IV_VI";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[39]] = i."NORTH_IV_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[37]] = i."NORTH_IV_IX";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[59]] = i."EAST_IV_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[62]] = i."EAST_IV_III";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[47]] = i."WEST_IV_V";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[50]] = i."MIDDLE_V_I";
        i.lllIIlIIIlIl[i.lllIIlIllIlI[51]] = i."BOTTOM_V_I";
    }

    private static /* synthetic */ boolean e(Player player, NPC nPC) {
        int n2;
        if (i.lIIIlIlIIIlllIl(b.z.contains(nPC.getId()) ? 1 : 0) && i.lIIIlIlIIlIIllI(nPC.getWorldY(), player.getWorldY() + lllIIlIllIlI[1]) && i.lIIIlIlIIlIIllI(Math.abs(nPC.getWorldX() - player.getWorldX()), lllIIlIllIlI[2]) && i.lIIIlIlIIlIlIII(nPC.getWorldY(), player.getWorldY() - lllIIlIllIlI[3]) && i.lIIIlIlIIlIIIII(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIlIllIlI[1];
            0;
            if (3 == -1) {
                return ((8 ^ 0x4C ^ (0x19 ^ 0x69)) & (0xD5 ^ 0x92 ^ (0x7B ^ 8) ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private static String lIIIlIIllllIIIl(String lllllllllllllllIIllIlIIlllIIllII, String lllllllllllllllIIllIlIIlllIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIlllIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIlllIIlllI.init(lllIIlIllIlI[5], lllllllllllllllIIllIlIIlllIIllll);
            return new String(lllllllllllllllIIllIlIIlllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlllIIllIl) {
            lllllllllllllllIIllIlIIlllIIllIl.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ boolean b(Player player, TileObject tileObject) {
        int n2;
        if (i.lIIIlIlIIlIIllI(tileObject.getWorldX() - player.getWorldX(), lllIIlIllIlI[17]) && i.lIIIlIlIIlIIllI(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIlIllIlI[6]) && i.lIIIlIlIIlIIIII(player.getPlane(), tileObject.getPlane()) && i.lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[19]]) ? 1 : 0)) {
            n2 = lllIIlIllIlI[1];
            0;
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

    private static /* synthetic */ boolean c(Player player, NPC nPC) {
        int n2;
        if (i.lIIIlIlIIIlllIl(b.z.contains(nPC.getId()) ? 1 : 0) && i.lIIIlIlIIlIIllI(nPC.getWorldX(), player.getWorldX() + lllIIlIllIlI[3]) && i.lIIIlIlIIlIIllI(Math.abs(nPC.getWorldY() - player.getWorldY()), lllIIlIllIlI[2]) && i.lIIIlIlIIlIlIII(nPC.getWorldX(), player.getWorldX() - lllIIlIllIlI[1]) && i.lIIIlIlIIlIIIII(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIlIllIlI[1];
            0;
            if (null != null) {
                return ((0x39 ^ 0x18) & ~(0x4C ^ 0x6D)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean d(Player player, TileObject tileObject) {
        int n2;
        if (i.lIIIlIlIIlIIllI(player.getWorldY() - tileObject.getWorldY(), lllIIlIllIlI[17]) && i.lIIIlIlIIlIIllI(Math.abs(player.getWorldX() - tileObject.getWorldX()), lllIIlIllIlI[6]) && i.lIIIlIlIIlIIIII(player.getPlane(), tileObject.getPlane()) && i.lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[17]]) ? 1 : 0)) {
            n2 = lllIIlIllIlI[1];
            0;
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
        void lllllllllllllllIIllIlIlIIIlIlIll;
        i lllllllllllllllIIllIlIlIIIlIllIl;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return lllIIlIllIlI[0];
        }
        int lllllllllllllllIIllIlIlIIIlIlIlI = lllIIlIllIlI[0];
        if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIlIllIl.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIlIllIl.type, (Object)k.SOUTH_BLADE)) {
            if (i.lIIIlIlIIlIIIlI(lllllllllllllllIIllIlIlIIIlIllIl.Q().get().getWorldY(), lllllllllllllllIIllIlIlIIIlIlIll.getWorldY())) {
                return lllIIlIllIlI[0];
            }
            lllllllllllllllIIllIlIlIIIlIlIlI = Math.abs(lllllllllllllllIIllIlIlIIIlIllIl.dartDestination.get().getWorldY() - lllllllllllllllIIllIlIlIIIlIlIll.getWorldY());
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIlIllIl.type, (Object)k.WEST)) {
            if (i.lIIIlIlIIlIIIlI(lllllllllllllllIIllIlIlIIIlIllIl.Q().get().getWorldX(), lllllllllllllllIIllIlIlIIIlIlIll.getWorldX())) {
                return lllIIlIllIlI[0];
            }
            lllllllllllllllIIllIlIlIIIlIlIlI = Math.abs(lllllllllllllllIIllIlIlIIIlIllIl.dartDestination.get().getWorldX() - lllllllllllllllIIllIlIlIIIlIlIll.getWorldX());
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIlIllIl.type, (Object)k.EAST)) {
            if (i.lIIIlIlIIlIIIIl(lllllllllllllllIIllIlIlIIIlIllIl.Q().get().getWorldX(), lllllllllllllllIIllIlIlIIIlIlIll.getWorldX())) {
                return lllIIlIllIlI[0];
            }
            lllllllllllllllIIllIlIlIIIlIlIlI = Math.abs(lllllllllllllllIIllIlIlIIIlIllIl.dartDestination.get().getWorldX() - lllllllllllllllIIllIlIlIIIlIlIll.getWorldX());
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIlIllIl.type, (Object)k.NORTH)) {
            if (i.lIIIlIlIIlIIIIl(lllllllllllllllIIllIlIlIIIlIllIl.Q().get().getWorldY(), lllllllllllllllIIllIlIlIIIlIlIll.getWorldY())) {
                return lllIIlIllIlI[0];
            }
            lllllllllllllllIIllIlIlIIIlIlIlI = Math.abs(lllllllllllllllIIllIlIlIIIlIllIl.dartDestination.get().getWorldY() - lllllllllllllllIIllIlIlIIIlIlIll.getWorldY());
        }
        List<TileObject> lllllllllllllllIIllIlIlIIIlIlIIl = lllllllllllllllIIllIlIlIIIlIllIl.M();
        int lllllllllllllllIIllIlIlIIIlIlIII = lllIIlIllIlI[0];
        while (i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIIlIlIII, lllllllllllllllIIllIlIlIIIlIlIIl.size()) && i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIIlIlIII, lllIIlIllIlI[6])) {
            void lllllllllllllllIIllIlIlIIIlIllII;
            if (i.lIIIlIlIIlIIIIl(lllllllllllllllIIllIlIlIIIlIlIII, lllllllllllllllIIllIlIlIIIlIlIIl.size())) {
                0;
                if (3 == 3) break;
                return ((0xAD ^ 0xA7) & ~(0x26 ^ 0x2C)) != 0;
            }
            TileObject lllllllllllllllIIllIlIlIIIlIIlll = lllllllllllllllIIllIlIlIIIlIlIIl.get(lllllllllllllllIIllIlIlIIIlIlIII);
            int lllllllllllllllIIllIlIlIIIlIIllI = c.a(lllllllllllllllIIllIlIlIIIlIIlll);
            if (!i.lIIIlIlIIlIIIll(lllllllllllllllIIllIlIlIIIlIIllI, b.y) || i.lIIIlIlIIlIIIII((int)lllllllllllllllIIllIlIlIIIlIllII, lllIIlIllIlI[6])) {
                return lllIIlIllIlI[1];
            }
            ++lllllllllllllllIIllIlIlIIIlIlIII;
            0;
            if (3 <= 3) continue;
            return ((0x7D ^ 0x2F) & ~(0xFC ^ 0xAE)) != 0;
        }
        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[6]]);
        return lllIIlIllIlI[0];
    }

    private static /* synthetic */ boolean b(Player player, NPC nPC) {
        int n2;
        if (i.lIIIlIlIIIlllIl(b.z.contains(nPC.getId()) ? 1 : 0) && i.lIIIlIlIIlIlIII(nPC.getWorldY(), player.getWorldY() - lllIIlIllIlI[1]) && i.lIIIlIlIIlIIllI(Math.abs(nPC.getWorldX() - player.getWorldX()), lllIIlIllIlI[2]) && i.lIIIlIlIIlIIllI(nPC.getWorldY(), player.getWorldY() + lllIIlIllIlI[3]) && i.lIIIlIlIIlIIIII(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIlIllIlI[1];
            0;
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
        void lllllllllllllllIIllIlIlIIIllllll;
        i lllllllllllllllIIllIlIlIIlIIIIII;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return null;
        }
        if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIlIIIIII.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.type, (Object)k.SOUTH_BLADE)) {
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.entry, (Object)j.WEST)) {
                WorldPoint lllllllllllllllIIllIlIlIIIlllllI = new WorldPoint(lllllllllllllllIIllIlIlIIlIIIIII.startPoint.get().getWorldX() + lllIIlIllIlI[1], lllllllllllllllIIllIlIlIIIllllll.getWorldY() - lllIIlIllIlI[5], lllllllllllllllIIllIlIlIIIllllll.getPlane());
                return new WorldArea(lllllllllllllllIIllIlIlIIIlllllI, lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.entry, (Object)j.EAST)) {
                WorldPoint lllllllllllllllIIllIlIlIIIlllllI = new WorldPoint(lllllllllllllllIIllIlIlIIlIIIIII.startPoint.get().getWorldX() - lllIIlIllIlI[6], lllllllllllllllIIllIlIlIIIllllll.getWorldY() - lllIIlIllIlI[5], lllllllllllllllIIllIlIlIIIllllll.getPlane());
                return new WorldArea(lllllllllllllllIIllIlIlIIIlllllI, lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.type, (Object)k.NORTH)) {
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.entry, (Object)j.WEST)) {
                WorldPoint lllllllllllllllIIllIlIlIIIlllllI = new WorldPoint(lllllllllllllllIIllIlIlIIlIIIIII.startPoint.get().getWorldX() + lllIIlIllIlI[1], lllllllllllllllIIllIlIlIIIllllll.getWorldY() + lllIIlIllIlI[5], lllllllllllllllIIllIlIlIIIllllll.getPlane());
                return new WorldArea(lllllllllllllllIIllIlIlIIIlllllI, lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.entry, (Object)j.EAST)) {
                WorldPoint lllllllllllllllIIllIlIlIIIlllllI = new WorldPoint(lllllllllllllllIIllIlIlIIlIIIIII.startPoint.get().getWorldX() - lllIIlIllIlI[6], lllllllllllllllIIllIlIlIIIllllll.getWorldY() + lllIIlIllIlI[5], lllllllllllllllIIllIlIlIIIllllll.getPlane());
                return new WorldArea(lllllllllllllllIIllIlIlIIIlllllI, lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.type, (Object)k.WEST)) {
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.entry, (Object)j.NORTH)) {
                WorldPoint lllllllllllllllIIllIlIlIIIlllllI = new WorldPoint(lllllllllllllllIIllIlIlIIIllllll.getWorldX() - lllIIlIllIlI[5], lllllllllllllllIIllIlIlIIlIIIIII.startPoint.get().getWorldY() - lllIIlIllIlI[6], lllllllllllllllIIllIlIlIIIllllll.getPlane());
                return new WorldArea(lllllllllllllllIIllIlIlIIIlllllI, lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.entry, (Object)j.SOUTH)) {
                WorldPoint lllllllllllllllIIllIlIlIIIlllllI = new WorldPoint(lllllllllllllllIIllIlIlIIIllllll.getWorldX() - lllIIlIllIlI[5], lllllllllllllllIIllIlIlIIlIIIIII.startPoint.get().getWorldY() + lllIIlIllIlI[1], lllllllllllllllIIllIlIlIIIllllll.getPlane());
                return new WorldArea(lllllllllllllllIIllIlIlIIIlllllI, lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.type, (Object)k.EAST)) {
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.entry, (Object)j.NORTH)) {
                WorldPoint lllllllllllllllIIllIlIlIIIlllllI = new WorldPoint(lllllllllllllllIIllIlIlIIIllllll.getWorldX() + lllIIlIllIlI[5], lllllllllllllllIIllIlIlIIlIIIIII.startPoint.get().getWorldY() - lllIIlIllIlI[6], lllllllllllllllIIllIlIlIIIllllll.getPlane());
                return new WorldArea(lllllllllllllllIIllIlIlIIIlllllI, lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIIIII.entry, (Object)j.SOUTH)) {
                WorldPoint lllllllllllllllIIllIlIlIIIlllllI = new WorldPoint(lllllllllllllllIIllIlIlIIIllllll.getWorldX() + lllIIlIllIlI[5], lllllllllllllllIIllIlIlIIlIIIIII.startPoint.get().getWorldY() + lllIIlIllIlI[1], lllllllllllllllIIllIlIlIIIllllll.getPlane());
                return new WorldArea(lllllllllllllllIIllIlIlIIIlllllI, lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> N() {
        void lllllllllllllllIIllIlIlIIIllIllI;
        i lllllllllllllllIIllIlIlIIIllIlll;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return null;
        }
        if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIllIlll.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIllIlll.type, (Object)k.SOUTH_BLADE)) {
            return NPCs.getAll(arg_0 -> i.e((Player)lllllllllllllllIIllIlIlIIIllIllI, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIllIlll.type, (Object)k.WEST)) {
            return NPCs.getAll(arg_0 -> i.d((Player)lllllllllllllllIIllIlIlIIIllIllI, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIllIlll.type, (Object)k.EAST)) {
            return NPCs.getAll(arg_0 -> i.c((Player)lllllllllllllllIIllIlIlIIIllIllI, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIllIlll.type, (Object)k.NORTH)) {
            return NPCs.getAll(arg_0 -> i.b((Player)lllllllllllllllIIllIlIlIIIllIllI, arg_0));
        }
        return null;
    }

    private static String lIIIlIIllllIIll(String lllllllllllllllIIllIlIIllIlIlIlI, String lllllllllllllllIIllIlIIllIlIlllI) {
        lllllllllllllllIIllIlIIllIlIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIllIlIllIl = new StringBuilder();
        char[] lllllllllllllllIIllIlIIllIlIllII = lllllllllllllllIIllIlIIllIlIlllI.toCharArray();
        int lllllllllllllllIIllIlIIllIlIlIll = lllIIlIllIlI[0];
        char[] lllllllllllllllIIllIlIIllIlIIlIl = lllllllllllllllIIllIlIIllIlIlIlI.toCharArray();
        int lllllllllllllllIIllIlIIllIlIIlII = lllllllllllllllIIllIlIIllIlIIlIl.length;
        int lllllllllllllllIIllIlIIllIlIIIll = lllIIlIllIlI[0];
        while (i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIIllIlIIIll, lllllllllllllllIIllIlIIllIlIIlII)) {
            char lllllllllllllllIIllIlIIllIllIIII = lllllllllllllllIIllIlIIllIlIIlIl[lllllllllllllllIIllIlIIllIlIIIll];
            lllllllllllllllIIllIlIIllIlIllIl.append((char)(lllllllllllllllIIllIlIIllIllIIII ^ lllllllllllllllIIllIlIIllIlIllII[lllllllllllllllIIllIlIIllIlIlIll % lllllllllllllllIIllIlIIllIlIllII.length]));
            0;
            ++lllllllllllllllIIllIlIIllIlIlIll;
            ++lllllllllllllllIIllIlIIllIlIIIll;
            0;
            if (2 != (0xDD ^ 0x9F ^ (0x40 ^ 6))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIllIlIllIl);
    }

    private i(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, k k2, j j2) {
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

    private static /* synthetic */ boolean d(Player player, NPC nPC) {
        int n2;
        if (i.lIIIlIlIIIlllIl(b.z.contains(nPC.getId()) ? 1 : 0) && i.lIIIlIlIIlIIllI(nPC.getWorldX(), player.getWorldX() + lllIIlIllIlI[1]) && i.lIIIlIlIIlIIllI(Math.abs(nPC.getWorldY() - player.getWorldY()), lllIIlIllIlI[2]) && i.lIIIlIlIIlIlIII(nPC.getWorldX(), player.getWorldX() - lllIIlIllIlI[3]) && i.lIIIlIlIIlIIIII(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIlIllIlI[1];
            0;
            if (-1 > -1) {
                return ((0x1F ^ 0x4E ^ (0x32 ^ 0x6F)) & (40 + 19 - 25 + 99 ^ 25 + 131 - 58 + 39 ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlIllIlI[0];
        }
        return n2 != 0;
    }

    private i(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, k k2, j j2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator lllllllllllllllIIllIlIIlllIlIlIl = list.iterator();
            while (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIIlllIlIlIl.hasNext() ? 1 : 0)) {
                void lllllllllllllllIIllIlIIlllIlIllI;
                Triple lllllllllllllllIIllIlIIlllIlIlII = (Triple)lllllllllllllllIIllIlIIlllIlIlIl.next();
                lllllllllllllllIIllIlIIlllIlIllI.add(new WorldArea(SquireSepulchre.a((RegionPoint)lllllllllllllllIIllIlIIlllIlIlII.getFirst()), ((Integer)lllllllllllllllIIllIlIIlllIlIlII.getSecond()).intValue(), ((Integer)lllllllllllllllIIllIlIIlllIlIlII.getThird()).intValue()));
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

    private static boolean lIIIlIlIIlIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIIlIIllllIlII(String lllllllllllllllIIllIlIIllIllllll, String lllllllllllllllIIllIlIIllIllllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIllIllllII.getBytes(StandardCharsets.UTF_8)), lllIIlIllIlI[11]), "DES");
            Cipher lllllllllllllllIIllIlIIlllIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIlllIIIIIl.init(lllIIlIllIlI[5], lllllllllllllllIIllIlIIlllIIIIlI);
            return new String(lllllllllllllllIIllIlIIlllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlllIIIIII) {
            lllllllllllllllIIllIlIIlllIIIIII.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ int f(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    private static boolean lIIIlIlIIIlllll(Object object, Object object2) {
        return object == object2;
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    private static void lIIIlIlIIIllIll() {
        lllIIlIllIlI = new int[63];
        i.lllIIlIllIlI[0] = (106 + 149 - 181 + 151 ^ 154 + 42 - 150 + 138) & (0x48 ^ 0x21 ^ (0x66 ^ 0x56) ^ -1);
        i.lllIIlIllIlI[1] = 1;
        i.lllIIlIllIlI[2] = 0xA1 ^ 0xA5;
        i.lllIIlIllIlI[3] = 0x51 ^ 0x45;
        i.lllIIlIllIlI[4] = 3 ^ 0xF;
        i.lllIIlIllIlI[5] = 2;
        i.lllIIlIllIlI[6] = 3;
        i.lllIIlIllIlI[7] = -1;
        i.lllIIlIllIlI[8] = 0x43 ^ 0x63 ^ (0x94 ^ 0xB1);
        i.lllIIlIllIlI[9] = 0x4B ^ 0x15 ^ (0xDE ^ 0x86);
        i.lllIIlIllIlI[10] = 0xA4 ^ 0xA3;
        i.lllIIlIllIlI[11] = 0x9B ^ 0x93;
        i.lllIIlIllIlI[12] = 0x6D ^ 0x39 ^ (0xD9 ^ 0x84);
        i.lllIIlIllIlI[13] = 0x28 ^ 0x22;
        i.lllIIlIllIlI[14] = 0xE1 ^ 0xA9 ^ (0xEF ^ 0xAC);
        i.lllIIlIllIlI[15] = 0x2D ^ 0x20;
        i.lllIIlIllIlI[16] = 0xA0 ^ 0xAE;
        i.lllIIlIllIlI[17] = 0x6B ^ 0x79;
        i.lllIIlIllIlI[18] = 0x69 ^ 0x66;
        i.lllIIlIllIlI[19] = 0x9A ^ 0x8A;
        i.lllIIlIllIlI[20] = 0x26 ^ 0x37;
        i.lllIIlIllIlI[21] = 1 ^ 0x12;
        i.lllIIlIllIlI[22] = 0x52 ^ 0x68;
        i.lllIIlIllIlI[23] = 0xCE ^ 0x9B ^ (0xC7 ^ 0x85);
        i.lllIIlIllIlI[24] = 0x76 ^ 0x6A;
        i.lllIIlIllIlI[25] = 0x7F ^ 0x40;
        i.lllIIlIllIlI[26] = 84 + 99 - 23 + 28 ^ 83 + 80 - 139 + 137;
        i.lllIIlIllIlI[27] = 0x4E ^ 0x30 ^ (0xD9 ^ 0xBD);
        i.lllIIlIllIlI[28] = 0x36 ^ 0x1F;
        i.lllIIlIllIlI[29] = 0x5A ^ 0x51 ^ (0x4D ^ 0x7A);
        i.lllIIlIllIlI[30] = 73 + 174 - 200 + 138 ^ 50 + 47 - -24 + 11;
        i.lllIIlIllIlI[31] = 0x4E ^ 0x66;
        i.lllIIlIllIlI[32] = 0xFFFFFFFC & 0x225F;
        i.lllIIlIllIlI[33] = 0x88 ^ 0xBC;
        i.lllIIlIllIlI[34] = 0xA3 ^ 0x90;
        i.lllIIlIllIlI[35] = 0xF1 ^ 0xC0;
        i.lllIIlIllIlI[36] = 2 ^ (0x86 ^ 0x91);
        i.lllIIlIllIlI[37] = 0xE1 ^ 0x90 ^ (0x44 ^ 0x2A);
        i.lllIIlIllIlI[38] = 0x4B ^ 0x73 ^ (0xB0 ^ 0x9E);
        i.lllIIlIllIlI[39] = 0x37 ^ 0x29;
        i.lllIIlIllIlI[40] = 0x2D ^ 0x35;
        i.lllIIlIllIlI[41] = 5 + 117 - -2 + 14 ^ 2 + 125 - 102 + 154;
        i.lllIIlIllIlI[42] = 0x56 ^ 0x4F;
        i.lllIIlIllIlI[43] = 122 + 24 - 110 + 105 ^ 40 + 86 - 54 + 110;
        i.lllIIlIllIlI[44] = 0x2C ^ 0x1E ^ (0x36 ^ 0x2F);
        i.lllIIlIllIlI[45] = 0x66 ^ 4 ^ (0xDF ^ 0x97);
        i.lllIIlIllIlI[46] = 0x3A ^ 2;
        i.lllIIlIllIlI[47] = 0xE1 ^ 0xC3;
        i.lllIIlIllIlI[48] = 0x9F ^ 0xAA;
        i.lllIIlIllIlI[49] = 0x45 ^ 0x5E;
        i.lllIIlIllIlI[50] = 0xE1 ^ 0xC2;
        i.lllIIlIllIlI[51] = 0x51 ^ 0x4D ^ (0xAA ^ 0x92);
        i.lllIIlIllIlI[52] = 0xA4 ^ 0x82;
        i.lllIIlIllIlI[53] = 125 + 143 - 138 + 105 ^ 183 + 165 - 314 + 162;
        i.lllIIlIllIlI[54] = 0x14 ^ 0x24;
        i.lllIIlIllIlI[55] = 0x26 ^ 0xB;
        i.lllIIlIllIlI[56] = 0x67 ^ 0x24 ^ (0xE8 ^ 0x85);
        i.lllIIlIllIlI[57] = 21 + 71 - -32 + 33 ^ 41 + 160 - 87 + 57;
        i.lllIIlIllIlI[58] = 0xE9 ^ 0xAD ^ (0x44 ^ 0x2C);
        i.lllIIlIllIlI[59] = 0x34 ^ 0x14;
        i.lllIIlIllIlI[60] = 0x93 ^ 0xA4;
        i.lllIIlIllIlI[61] = 0x6A ^ 0x4F;
        i.lllIIlIllIlI[62] = 0x63 ^ 0x42;
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

    private static /* synthetic */ int a(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    private static boolean lIIIlIlIIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static /* synthetic */ boolean c(Player player, TileObject tileObject) {
        int n2;
        if (i.lIIIlIlIIlIIllI(player.getWorldX() - tileObject.getWorldX(), lllIIlIllIlI[17]) && i.lIIIlIlIIlIIllI(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIlIllIlI[6]) && i.lIIIlIlIIlIIIII(player.getPlane(), tileObject.getPlane()) && i.lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[20]]) ? 1 : 0)) {
            n2 = lllIIlIllIlI[1];
            0;
            if (((0x28 ^ 0x3E) & ~(0x58 ^ 0x4E)) != 0) {
                return ((0xB2 ^ 0x92) & ~(2 ^ 0x22)) != 0;
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
        void lllllllllllllllIIllIlIlIIlIlIIIl;
        void lllllllllllllllIIllIlIlIIlIlIIII;
        i lllllllllllllllIIllIlIlIIlIlIIll;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return lllIIlIllIlI[0];
        }
        if (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIlIIlIlIIll.b((Locatable)lllllllllllllllIIllIlIlIIlIlIIII) ? 1 : 0)) {
            void lllllllllllllllIIllIlIlIIlIlIIlI;
            lllllllllllllllIIllIlIlIIlIlIIll.a((SquireSepulchre)lllllllllllllllIIllIlIlIIlIlIIIl);
            if (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIlIIlIlIIll.b((d)lllllllllllllllIIllIlIlIIlIlIIlI) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIIllIlIlIIlIlIIll.startDestination.get());
                return lllIIlIllIlI[1];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIIllIlIlIIlIlIIll.startPoint.get());
            return lllIIlIllIlI[1];
        }
        if (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIlIIlIlIIll.c((Locatable)lllllllllllllllIIllIlIlIIlIlIIII) ? 1 : 0)) {
            lllllllllllllllIIllIlIlIIlIlIIll.b((SquireSepulchre)lllllllllllllllIIllIlIlIIlIlIIIl);
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[0]]);
            lllllllllllllllIIllIlIlIIlIlIIll.O();
            0;
            return lllIIlIllIlI[1];
        }
        return lllIIlIllIlI[0];
    }

    private static /* synthetic */ int a(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(d d2) {
        J lllllllllllllllIIllIlIlIIlIIIlIl;
        TileObject lllllllllllllllIIllIlIlIIlIIIllI;
        i lllllllllllllllIIllIlIlIIlIIlIIl;
        void lllllllllllllllIIllIlIlIIlIIIlll;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return lllIIlIllIlI[0];
        }
        if (i.lIIIlIlIIIllllI(lllllllllllllllIIllIlIlIIlIIIlll.getWorldLocation().equals((Object)lllllllllllllllIIllIlIlIIlIIlIIl.startPoint.get()) ? 1 : 0)) {
            return lllIIlIllIlI[0];
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIlIIl.type, (Object)k.SOUTH_BLADE)) {
            void lllllllllllllllIIllIlIlIIlIIlIII;
            String[] stringArray = new String[lllIIlIllIlI[1]];
            stringArray[i.lllIIlIllIlI[0]] = lllIIlIIIlIl[lllIIlIllIlI[1]];
            lllllllllllllllIIllIlIlIIlIIIllI = TileObjects.getNearest((String[])stringArray);
            if (i.lIIIlIlIIIlllII(lllllllllllllllIIllIlIlIIlIIIllI)) {
                return lllIIlIllIlI[0];
            }
            lllllllllllllllIIllIlIlIIlIIIlIl = lllllllllllllllIIllIlIlIIlIIlIII.b(lllllllllllllllIIllIlIlIIlIIIllI);
            System.out.println("ID: " + lllllllllllllllIIllIlIlIIlIIIlIl.aG() + " | ticks: " + lllllllllllllllIIllIlIlIIlIIIlIl.aF());
            if ((!i.lIIIlIlIIlIIIII(lllllllllllllllIIllIlIlIIlIIIlIl.aG(), b.s) || i.lIIIlIlIIlIIIIl(lllllllllllllllIIllIlIlIIlIIIlIl.aF(), lllIIlIllIlI[2]) && i.lIIIlIlIIlIIIlI(lllllllllllllllIIllIlIlIIlIIIlIl.aF(), lllIIlIllIlI[3])) && i.lIIIlIlIIlIIIll(lllllllllllllllIIllIlIlIIlIIIlIl.aG(), b.v) && i.lIIIlIlIIlIIIll(lllllllllllllllIIllIlIlIIlIIIlIl.aG(), b.t)) {
                return lllIIlIllIlI[0];
            }
        }
        lllllllllllllllIIllIlIlIIlIIIllI = lllllllllllllllIIllIlIlIIlIIlIIl.N();
        lllllllllllllllIIllIlIlIIlIIIllI.sort(Comparator.comparingInt(arg_0 -> i.f((Player)lllllllllllllllIIllIlIlIIlIIIlll, arg_0)));
        System.out.println("darts: " + String.valueOf(lllllllllllllllIIllIlIlIIlIIIllI));
        if (i.lIIIlIlIIIllllI(lllllllllllllllIIllIlIlIIlIIIllI.size())) {
            return lllIIlIllIlI[1];
        }
        lllllllllllllllIIllIlIlIIlIIIlIl = (NPC)lllllllllllllllIIllIlIlIIlIIIllI.get(lllIIlIllIlI[0]);
        if (i.lIIIlIlIIlIIlII(lllllllllllllllIIllIlIlIIlIIIlIl)) {
            if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIlIIlIIl.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIlIIl.type, (Object)k.SOUTH_BLADE)) {
                int lllllllllllllllIIllIlIlIIlIIIlII = Math.abs(lllllllllllllllIIllIlIlIIlIIIlIl.getWorldY() - lllllllllllllllIIllIlIlIIlIIIlll.getWorldY());
                if (i.lIIIlIlIIlIIIII(lllllllllllllllIIllIlIlIIlIIIlIl.getWorldX(), lllllllllllllllIIllIlIlIIlIIlIIl.P().get().getWorldX()) && i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIlIIIlII, lllIIlIllIlI[4])) {
                    return lllIIlIllIlI[0];
                }
                return lllIIlIllIlI[1];
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIlIIl.type, (Object)k.WEST)) {
                int lllllllllllllllIIllIlIlIIlIIIlII = Math.abs(lllllllllllllllIIllIlIlIIlIIIlIl.getWorldX() - lllllllllllllllIIllIlIlIIlIIIlll.getWorldX());
                if (i.lIIIlIlIIlIIIII(lllllllllllllllIIllIlIlIIlIIIlIl.getWorldY(), lllllllllllllllIIllIlIlIIlIIlIIl.P().get().getWorldY()) && i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIlIIIlII, lllIIlIllIlI[4])) {
                    return lllIIlIllIlI[0];
                }
                return lllIIlIllIlI[1];
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIlIIl.type, (Object)k.EAST)) {
                System.out.println(lllIIlIIIlIl[lllIIlIllIlI[5]]);
                int lllllllllllllllIIllIlIlIIlIIIlII = Math.abs(lllllllllllllllIIllIlIlIIlIIIlIl.getWorldX() - lllllllllllllllIIllIlIlIIlIIIlll.getWorldX());
                if (i.lIIIlIlIIlIIIII(lllllllllllllllIIllIlIlIIlIIIlIl.getWorldY(), lllllllllllllllIIllIlIlIIlIIlIIl.P().get().getWorldY()) && i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIlIIIlII, lllIIlIllIlI[4])) {
                    return lllIIlIllIlI[0];
                }
                return lllIIlIllIlI[1];
            }
            if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIlIIlIIl.type, (Object)k.NORTH)) {
                int lllllllllllllllIIllIlIlIIlIIIlII = Math.abs(lllllllllllllllIIllIlIlIIlIIIlIl.getWorldY() - lllllllllllllllIIllIlIlIIlIIIlll.getWorldY());
                if (i.lIIIlIlIIlIIIII(lllllllllllllllIIllIlIlIIlIIIlIl.getWorldX(), lllllllllllllllIIllIlIlIIlIIlIIl.P().get().getWorldX()) && i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIlIIIlII, lllIIlIllIlI[4])) {
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
        NORTH_I_I = new i(List.of(new Triple((Object)new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[22], lllIIlIllIlI[5], b.C), (Object)lllIIlIllIlI[23], (Object)lllIIlIllIlI[9]), new Triple((Object)new RegionPoint(lllIIlIllIlI[4], lllIIlIllIlI[0], lllIIlIllIlI[5], b.F), (Object)lllIIlIllIlI[6], (Object)lllIIlIllIlI[6])), new RegionPoint(lllIIlIllIlI[24], lllIIlIllIlI[25], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[26], lllIIlIllIlI[0], lllIIlIllIlI[5], b.F), new RegionPoint(lllIIlIllIlI[27], lllIIlIllIlI[0], lllIIlIllIlI[5], b.F), lllIIlIllIlI[17], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[28], lllIIlIllIlI[29], lllIIlIllIlI[5], b.C), k.EAST, j.SOUTH);
        WEST_I_IV = new i(List.of(new Triple((Object)new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[31], lllIIlIllIlI[5], lllIIlIllIlI[32]), (Object)lllIIlIllIlI[6], (Object)lllIIlIllIlI[18]), new Triple((Object)new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[33], lllIIlIllIlI[5], b.C), (Object)lllIIlIllIlI[12], (Object)lllIIlIllIlI[6])), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[33], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[34], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[35], lllIIlIllIlI[5], b.C), lllIIlIllIlI[17], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[28], lllIIlIllIlI[5], b.C), k.EAST, j.NORTH);
        SOUTH_I_IV = new i(new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[21], lllIIlIllIlI[5], b.C), lllIIlIllIlI[6], lllIIlIllIlI[2], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[39], lllIIlIllIlI[23], lllIIlIllIlI[5], b.C), new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[23], lllIIlIllIlI[5], b.C), lllIIlIllIlI[16], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[23], lllIIlIllIlI[37], lllIIlIllIlI[5], b.C), k.WEST, j.SOUTH);
        SOUTH_II_I = new i(new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], b.G), lllIIlIllIlI[6], lllIIlIllIlI[10], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[39], lllIIlIllIlI[36], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[21], lllIIlIllIlI[5], b.G), lllIIlIllIlI[20], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[17], lllIIlIllIlI[12], lllIIlIllIlI[5], b.G), k.WEST, j.NORTH);
        SOUTH_II_V = new i(new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[20], lllIIlIllIlI[1], b.G), lllIIlIllIlI[6], lllIIlIllIlI[5], new RegionPoint(lllIIlIllIlI[19], lllIIlIllIlI[17], lllIIlIllIlI[1], b.G), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[21], lllIIlIllIlI[1], b.G), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[21], lllIIlIllIlI[1], b.G), lllIIlIllIlI[26], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[24], lllIIlIllIlI[1], b.G), k.EAST, j.SOUTH);
        EAST_II_V = new i(List.of(new Triple((Object)new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[23], lllIIlIllIlI[5], b.G), (Object)lllIIlIllIlI[1], (Object)lllIIlIllIlI[6]), new Triple((Object)new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[23], lllIIlIllIlI[5], b.G), (Object)lllIIlIllIlI[1], (Object)lllIIlIllIlI[6])), new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[23], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[38], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[6], lllIIlIllIlI[5], b.G), lllIIlIllIlI[6], lllIIlIllIlI[36], new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[2], lllIIlIllIlI[5], b.G), k.SOUTH, j.WEST);
        NORTH_II_II = new i(new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[41], lllIIlIllIlI[5], b.G), lllIIlIllIlI[6], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[23], lllIIlIllIlI[43], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[40], lllIIlIllIlI[29], lllIIlIllIlI[5], b.G), new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[29], lllIIlIllIlI[5], b.G), lllIIlIllIlI[4], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[26], lllIIlIllIlI[1], lllIIlIllIlI[5], b.H), k.EAST, j.SOUTH);
        EAST_III_IV = new i(new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[44], lllIIlIllIlI[5], b.J), lllIIlIllIlI[14], lllIIlIllIlI[4], new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[44], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[45], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[16], lllIIlIllIlI[5], b.J), lllIIlIllIlI[6], lllIIlIllIlI[47], new RegionPoint(lllIIlIllIlI[48], lllIIlIllIlI[19], lllIIlIllIlI[5], b.J), k.SOUTH, j.EAST);
        WEST_III_I = new i(new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[37], lllIIlIllIlI[5], b.J), lllIIlIllIlI[11], lllIIlIllIlI[2], new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[47], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[50], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[14], lllIIlIllIlI[50], lllIIlIllIlI[5], b.J), lllIIlIllIlI[15], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[15], lllIIlIllIlI[31], lllIIlIllIlI[5], b.J), k.WEST, j.SOUTH);
        WEST_III_V = new i(new RegionPoint(lllIIlIllIlI[2], lllIIlIllIlI[51], lllIIlIllIlI[5], b.J), lllIIlIllIlI[5], lllIIlIllIlI[13], new RegionPoint(lllIIlIllIlI[2], lllIIlIllIlI[51], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[50], lllIIlIllIlI[5], b.J), new RegionPoint(lllIIlIllIlI[1], lllIIlIllIlI[36], lllIIlIllIlI[5], b.J), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[23], lllIIlIllIlI[5], b.J), k.SOUTH, j.EAST);
        SOUTH_IV_VI = new i(new RegionPoint(lllIIlIllIlI[38], lllIIlIllIlI[41], lllIIlIllIlI[5], b.M), lllIIlIllIlI[6], lllIIlIllIlI[10], new RegionPoint(lllIIlIllIlI[40], lllIIlIllIlI[25], lllIIlIllIlI[5], b.M), new RegionPoint(lllIIlIllIlI[42], lllIIlIllIlI[0], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[38], lllIIlIllIlI[0], lllIIlIllIlI[5], b.L), lllIIlIllIlI[52], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[12], lllIIlIllIlI[5], b.L), k.EAST, j.SOUTH);
        NORTH_IV_V = new i(new RegionPoint(lllIIlIllIlI[13], lllIIlIllIlI[22], lllIIlIllIlI[5], b.L), lllIIlIllIlI[6], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[4], lllIIlIllIlI[29], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[15], lllIIlIllIlI[30], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[30], lllIIlIllIlI[5], b.L), lllIIlIllIlI[44], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[53], lllIIlIllIlI[29], lllIIlIllIlI[5], b.L), k.EAST, j.SOUTH);
        NORTH_IV_IX = new i(new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[54], lllIIlIllIlI[5], b.L), lllIIlIllIlI[12], lllIIlIllIlI[11], new RegionPoint(lllIIlIllIlI[19], lllIIlIllIlI[54], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[53], lllIIlIllIlI[5], b.L), new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[55], lllIIlIllIlI[5], b.L), lllIIlIllIlI[56], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[57], lllIIlIllIlI[58], lllIIlIllIlI[5], b.L), k.EAST, j.NORTH);
        EAST_IV_I = new i(new RegionPoint(lllIIlIllIlI[45], lllIIlIllIlI[59], lllIIlIllIlI[1], b.L), lllIIlIllIlI[16], lllIIlIllIlI[12], new RegionPoint(lllIIlIllIlI[60], lllIIlIllIlI[61], lllIIlIllIlI[1], b.L), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[51], lllIIlIllIlI[1], b.L), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[40], lllIIlIllIlI[1], b.L), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[23], lllIIlIllIlI[1], b.L), k.SOUTH_BLADE, j.WEST);
        EAST_IV_III = new i(new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0]), lllIIlIllIlI[1], lllIIlIllIlI[1], new RegionPoint(lllIIlIllIlI[60], lllIIlIllIlI[61], lllIIlIllIlI[1], b.L), new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0]), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[5], lllIIlIllIlI[1], b.L), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[48], lllIIlIllIlI[10], lllIIlIllIlI[1], b.L), k.SOUTH, j.WEST);
        WEST_IV_V = new i(new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[59], lllIIlIllIlI[1], b.L), lllIIlIllIlI[8], lllIIlIllIlI[16], new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[59], lllIIlIllIlI[1], b.L), new RegionPoint(lllIIlIllIlI[11], lllIIlIllIlI[37], lllIIlIllIlI[0], b.L), new RegionPoint(lllIIlIllIlI[11], lllIIlIllIlI[8], lllIIlIllIlI[1], b.L), lllIIlIllIlI[6], lllIIlIllIlI[37], new RegionPoint(lllIIlIllIlI[18], lllIIlIllIlI[10], lllIIlIllIlI[1], b.L), k.SOUTH, j.WEST);
        MIDDLE_V_I = new i(new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[5], lllIIlIllIlI[1], b.N), lllIIlIllIlI[13], lllIIlIllIlI[14], new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[10], lllIIlIllIlI[1], b.N), new RegionPoint(lllIIlIllIlI[8], lllIIlIllIlI[11], lllIIlIllIlI[0], b.N), new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[8], lllIIlIllIlI[1], b.N), lllIIlIllIlI[6], lllIIlIllIlI[59], new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[47], lllIIlIllIlI[1], b.N), k.NORTH, j.EAST);
        BOTTOM_V_I = new i(new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[0], lllIIlIllIlI[0], b.N), lllIIlIllIlI[13], lllIIlIllIlI[14], new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[2], lllIIlIllIlI[0], b.N), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[8], lllIIlIllIlI[0], b.N), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[5], lllIIlIllIlI[0], b.N), lllIIlIllIlI[6], lllIIlIllIlI[58], new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[28], lllIIlIllIlI[0], b.N), k.NORTH, j.EAST);
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
        Iterator<WorldArea> lllllllllllllllIIllIlIIlllllllIl = this.startAreas.get().iterator();
        while (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIIlllllllIl.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIllIlIIllllllllI;
            WorldArea lllllllllllllllIIllIlIIlllllllII = lllllllllllllllIIllIlIIlllllllIl.next();
            if (i.lIIIlIlIIIlllIl(lllllllllllllllIIllIlIIlllllllII.contains((Locatable)lllllllllllllllIIllIlIIllllllllI) ? 1 : 0)) {
                return lllIIlIllIlI[1];
            }
            0;
            if (null == null) continue;
            return ((0xFA ^ 0xA7) & ~(0x10 ^ 0x4D)) != 0;
        }
        return lllIIlIllIlI[0];
    }

    private static boolean lIIIlIlIIlIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static /* synthetic */ int b(Player player, WorldPoint worldPoint) {
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
        void lllllllllllllllIIllIlIlIIIlllIlI;
        i lllllllllllllllIIllIlIlIIIlllIll;
        Player player = Players.getLocal();
        if (i.lIIIlIlIIIlllII(player)) {
            return null;
        }
        if (!i.lIIIlIlIIlIIlIl((Object)lllllllllllllllIIllIlIlIIIlllIll.type, (Object)k.SOUTH) || i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIlllIll.type, (Object)k.SOUTH_BLADE)) {
            return TileObjects.getAll(arg_0 -> i.d((Player)lllllllllllllllIIllIlIlIIIlllIlI, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIlllIll.type, (Object)k.WEST)) {
            return TileObjects.getAll(arg_0 -> i.c((Player)lllllllllllllllIIllIlIlIIIlllIlI, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIlllIll.type, (Object)k.EAST)) {
            return TileObjects.getAll(arg_0 -> i.b((Player)lllllllllllllllIIllIlIlIIIlllIlI, arg_0));
        }
        if (i.lIIIlIlIIIlllll((Object)lllllllllllllllIIllIlIlIIIlllIll.type, (Object)k.NORTH)) {
            return TileObjects.getAll(arg_0 -> i.a((Player)lllllllllllllllIIllIlIlIIIlllIlI, arg_0));
        }
        return null;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    /*
     * Unable to fully structure code
     */
    private List<WorldPoint> d(List<WorldPoint> var1_1) {
        var2_2 = I.aC();
        var3_3 = new ArrayList<WorldPoint>();
        lllllllllllllllIIllIlIlIIIIllIll = i.lllIIlIllIlI[0];
        while (i.lIIIlIlIIlIIllI(lllllllllllllllIIllIlIlIIIIllIll, lllllllllllllllIIllIlIlIIIIllllI.size())) {
            block15: {
                block14: {
                    lllllllllllllllIIllIlIlIIIIllIlI = (WorldPoint)lllllllllllllllIIllIlIlIIIIllllI.get(lllllllllllllllIIllIlIlIIIIllIll);
                    if (!i.lIIIlIlIIIlllII(lllllllllllllllIIllIlIlIIIIllIlI)) break block14;
                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[2]]);
                    0;
                    if (-1 > 0) {
                        return null;
                    }
                    break block15;
                }
                if (!i.lIIIlIlIIIlllIl((int)lllllllllllllllIIllIlIlIIIIlllIl.contains(lllllllllllllllIIllIlIlIIIIllIlI))) ** GOTO lbl-1000
                if (i.lIIIlIlIIIlllll((Object)k.NORTH, (Object)lllllllllllllllIIllIlIlIIIIlllll.type)) {
                    lllllllllllllllIIllIlIlIIIIlllII.add(lllllllllllllllIIllIlIlIIIIllIlI.dy(i.lllIIlIllIlI[7]));
                    0;
                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[8]]);
                    0;
                    if (1 < 0) {
                        return null;
                    }
                } else if (i.lIIIlIlIIIlllll((Object)k.SOUTH, (Object)lllllllllllllllIIllIlIlIIIIlllll.type)) {
                    lllllllllllllllIIllIlIlIIIIlllII.add(lllllllllllllllIIllIlIlIIIIllIlI.dy(i.lllIIlIllIlI[1]));
                    0;
                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[9]]);
                    0;
                    if (1 < 0) {
                        return null;
                    }
                } else if (i.lIIIlIlIIIlllll((Object)k.EAST, (Object)lllllllllllllllIIllIlIlIIIIlllll.type)) {
                    lllllllllllllllIIllIlIlIIIIlllII.add(lllllllllllllllIIllIlIlIIIIllIlI.dx(i.lllIIlIllIlI[7]));
                    0;
                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[10]]);
                    0;
                    if (-1 > 0) {
                        return null;
                    }
                } else if (i.lIIIlIlIIIlllll((Object)k.WEST, (Object)lllllllllllllllIIllIlIlIIIIlllll.type)) {
                    lllllllllllllllIIllIlIlIIIIlllII.add(lllllllllllllllIIllIlIlIIIIllIlI.dx(i.lllIIlIllIlI[1]));
                    0;
                    System.out.println(i.lllIIlIIIlIl[i.lllIIlIllIlI[11]]);
                    0;
                    if (3 != 3) {
                        return null;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    lllllllllllllllIIllIlIlIIIIlllII.add(lllllllllllllllIIllIlIlIIIIllIlI);
                    0;
                }
            }
            ++lllllllllllllllIIllIlIlIIIIllIll;
            0;
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

