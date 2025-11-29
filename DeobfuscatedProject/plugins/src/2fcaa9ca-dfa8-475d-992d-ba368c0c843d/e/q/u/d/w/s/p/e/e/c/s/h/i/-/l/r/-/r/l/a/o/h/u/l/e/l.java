/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Pair
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

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.m;
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
import kotlin.Pair;
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

public final class l
extends Enum<l> {
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    /* synthetic */ List<Pair<Integer, Integer>> waitPairs;
    public static final /* synthetic */ /* enum */ l SOUTH_III_I;
    private static final /* synthetic */ l[] $VALUES;
    /* synthetic */ Supplier<WorldPoint> dartDestination;
    /* synthetic */ Supplier<WorldPoint> startDestination;
    private static /* synthetic */ String[] lllIIIllIlIl;
    /* synthetic */ m type;
    /* synthetic */ Supplier<WorldArea> dartArea;
    private static /* synthetic */ int[] lllIIIlllIII;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public /* synthetic */ Supplier<TileObject> object;

    private static boolean lIIIlIIllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static /* synthetic */ int g(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    private static boolean lIIIlIIllIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIllIIIllI(Object object) {
        return object != null;
    }

    private static void lIIIlIIlIlllllI() {
        lllIIIllIlIl = new String[lllIIIlllIII[13]];
        l.lllIIIllIlIl[l.lllIIIlllIII[0]] = l.lIIIlIIlIlllIll("AQYMJhgyTyUzCyIaEw==", "VovGj");
        l.lllIIIllIlIl[l.lllIIIlllIII[1]] = l.lIIIlIIlIllllII("7eA3wKxkB7DK5zuonL5zRg==", "uxDfl");
        l.lllIIIllIlIl[l.lllIIIlllIII[4]] = l.lIIIlIIlIlllIll("MjcZKxITKgE1AB9lJSwABTAT", "qEvXa");
        l.lllIIIllIlIl[l.lllIIIlllIII[3]] = l.lIIIlIIlIllllIl("6D/y+DNJpUyr5kpCOX3XOZ/oEAPQqvGr", "kXmWo");
        l.lllIIIllIlIl[l.lllIIIlllIII[11]] = l.lIIIlIIlIlllIll("GwcxIQUXAS08EgE=", "HHduM");
    }

    /*
     * WARNING - void declaration
     */
    private boolean T() {
        l lllllllllllllllIIllIllIlIIIlIlIl;
        void lllllllllllllllIIllIllIlIIIlIIlI;
        WorldPoint worldPoint = this.startPoint.get();
        int n2 = worldPoint.getWorldY();
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        int lllllllllllllllIIllIllIlIIIlIIIl = lllllllllllllllIIllIllIlIIIlIIlI.getWorldY();
        int lllllllllllllllIIllIllIlIIIlIIII = lllIIIlllIII[4];
        Iterator<Pair<Integer, Integer>> lllllllllllllllIIllIllIlIIIIllll = lllllllllllllllIIllIllIlIIIlIlIl.waitPairs.iterator();
        while (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIIIIllll.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIllIllIlIIIlIIll;
            Pair<Integer, Integer> lllllllllllllllIIllIllIlIIIIlllI = lllllllllllllllIIllIllIlIIIIllll.next();
            if (!l.lIIIlIIllIIllIl(lllllllllllllllIIllIllIlIIIlIIIl, (Integer)lllllllllllllllIIllIllIlIIIIlllI.getFirst() + lllllllllllllllIIllIllIlIIIlIIll)) continue;
            if (l.lIIIlIIllIIlIll(lllllllllllllllIIllIllIlIIIlIIIl, (Integer)lllllllllllllllIIllIllIlIIIIlllI.getSecond() + lllllllllllllllIIllIllIlIIIlIIll)) {
                "".length();
                if (-"   ".length() < 0) continue;
                return ((32 + 73 - 58 + 89 ^ 62 + 80 - 76 + 121) & (22 + 122 - 37 + 75 ^ 68 + 31 - 0 + 34 ^ -" ".length())) != 0;
            }
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    /*
     * WARNING - void declaration
     */
    private int U() {
        l lllllllllllllllIIllIllIlIIIIIlIl;
        void lllllllllllllllIIllIllIlIIIIIIlI;
        WorldPoint worldPoint = this.startPoint.get();
        int n2 = worldPoint.getWorldY();
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[5];
        }
        int lllllllllllllllIIllIllIlIIIIIIIl = lllllllllllllllIIllIllIlIIIIIIlI.getWorldY();
        int lllllllllllllllIIllIllIlIIIIIIII = lllIIIlllIII[4];
        Iterator<Pair<Integer, Integer>> lllllllllllllllIIllIllIIllllllll = lllllllllllllllIIllIllIlIIIIIlIl.waitPairs.iterator();
        while (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIIllllllll.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIllIllIlIIIIIIll;
            Pair<Integer, Integer> lllllllllllllllIIllIllIIlllllllI = lllllllllllllllIIllIllIIllllllll.next();
            if (!l.lIIIlIIllIIllIl(lllllllllllllllIIllIllIlIIIIIIIl, (Integer)lllllllllllllllIIllIllIIlllllllI.getFirst() + lllllllllllllllIIllIllIlIIIIIIll)) continue;
            if (l.lIIIlIIllIIlIll(lllllllllllllllIIllIllIlIIIIIIIl, (Integer)lllllllllllllllIIllIllIIlllllllI.getSecond() + lllllllllllllllIIllIllIlIIIIIIll)) {
                "".length();
                if ("  ".length() != 0) continue;
                return (0x15 ^ 0x66 ^ (0x7B ^ 0x38)) & (187 + 156 - 213 + 59 ^ 33 + 118 - 106 + 96 ^ -" ".length());
            }
            if (l.lIIIlIIllIIlIII(lllllllllllllllIIllIllIlIIIIIIIl, (int)(lllllllllllllllIIllIllIlIIIIIIll + (Integer)lllllllllllllllIIllIllIIlllllllI.getSecond()))) {
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[0];
        }
        return lllIIIlllIII[5];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    static {
        l.lIIIlIIllIIIIIl();
        l.lIIIlIIlIlllllI();
        SOUTH_III_I = new l(List.of(new Triple((Object)new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[4], lllIIIlllIII[1], b.J), (Object)lllIIIlllIII[1], (Object)lllIIIlllIII[11]), new Triple((Object)new RegionPoint(lllIIIlllIII[12], lllIIIlllIII[4], lllIIIlllIII[1], b.J), (Object)lllIIIlllIII[1], (Object)lllIIIlllIII[11])), new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[13], lllIIIlllIII[1], b.J), new RegionPoint(lllIIIlllIII[14], lllIIIlllIII[15], lllIIIlllIII[4], b.J), List.of(new Pair((Object)lllIIIlllIII[16], (Object)lllIIIlllIII[1]), new Pair((Object)lllIIIlllIII[10], (Object)lllIIIlllIII[2])), new RegionPoint(lllIIIlllIII[17], lllIIIlllIII[18], lllIIIlllIII[1], b.K), lllIIIlllIII[3], lllIIIlllIII[19], new RegionPoint(lllIIIlllIII[17], lllIIIlllIII[12], lllIIIlllIII[4], b.J), m.NORTH_BACK);
        l[] lArray = new l[lllIIIlllIII[1]];
        lArray[l.lllIIIlllIII[0]] = SOUTH_III_I;
        $VALUES = lArray;
    }

    private static boolean lIIIlIIllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIlIIlIlllIll(String lllllllllllllllIIllIllIIllIIIIII, String lllllllllllllllIIllIllIIlIllllll) {
        lllllllllllllllIIllIllIIllIIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIIllIIIIll = new StringBuilder();
        char[] lllllllllllllllIIllIllIIllIIIIlI = lllllllllllllllIIllIllIIlIllllll.toCharArray();
        int lllllllllllllllIIllIllIIllIIIIIl = lllIIIlllIII[0];
        char[] lllllllllllllllIIllIllIIlIlllIll = lllllllllllllllIIllIllIIllIIIIII.toCharArray();
        int lllllllllllllllIIllIllIIlIlllIlI = lllllllllllllllIIllIllIIlIlllIll.length;
        int lllllllllllllllIIllIllIIlIlllIIl = lllIIIlllIII[0];
        while (l.lIIIlIIllIIlIII(lllllllllllllllIIllIllIIlIlllIIl, lllllllllllllllIIllIllIIlIlllIlI)) {
            char lllllllllllllllIIllIllIIllIIIllI = lllllllllllllllIIllIllIIlIlllIll[lllllllllllllllIIllIllIIlIlllIIl];
            lllllllllllllllIIllIllIIllIIIIll.append((char)(lllllllllllllllIIllIllIIllIIIllI ^ lllllllllllllllIIllIllIIllIIIIlI[lllllllllllllllIIllIllIIllIIIIIl % lllllllllllllllIIllIllIIllIIIIlI.length]));
            "".length();
            ++lllllllllllllllIIllIllIIllIIIIIl;
            ++lllllllllllllllIIllIllIIlIlllIIl;
            "".length();
            if ((0x55 ^ 0x51) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllIIllIIIIll);
    }

    private boolean d(d lllllllllllllllIIllIllIIllllIllI) {
        String[] stringArray = new String[lllIIIlllIII[1]];
        stringArray[l.lllIIIlllIII[0]] = lllIIIllIlIl[lllIIIlllIII[0]];
        TileObject lllllllllllllllIIllIllIIllllIlIl = TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIlllIII[6], lllIIIlllIII[7], lllIIIlllIII[1], b.J)), (String[])stringArray);
        String[] stringArray2 = new String[lllIIIlllIII[1]];
        stringArray2[l.lllIIIlllIII[0]] = lllIIIllIlIl[lllIIIlllIII[1]];
        TileObject lllllllllllllllIIllIllIIllllIlII = TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[7], lllIIIlllIII[1], b.J)), (String[])stringArray2);
        if (!l.lIIIlIIllIIIllI(lllllllllllllllIIllIllIIllllIlIl) || l.lIIIlIIllIIIIlI(lllllllllllllllIIllIllIIllllIlII)) {
            return lllIIIlllIII[0];
        }
        J lllllllllllllllIIllIllIIllllIIll = lllllllllllllllIIllIllIIllllIllI.b(lllllllllllllllIIllIllIIllllIlIl);
        J lllllllllllllllIIllIllIIllllIIlI = lllllllllllllllIIllIllIIllllIllI.b(lllllllllllllllIIllIllIIllllIlII);
        int lllllllllllllllIIllIllIIllllIIIl = lllllllllllllllIIllIllIIllllIIll.aG();
        int lllllllllllllllIIllIllIIllllIIII = lllllllllllllllIIllIllIIllllIIlI.aG();
        if (l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIIllllIIIl, b.o) && !l.lIIIlIIllIIlllI(lllllllllllllllIIllIllIIllllIIll.aF(), lllIIIlllIII[4]) || l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIIllllIIII, b.o) && l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIIllllIIlI.aF(), lllIIIlllIII[4])) {
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> lllllllllllllllIIllIllIIlllIlIIl = this.startAreas.get().iterator();
        while (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIIlllIlIIl.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIllIllIIlllIlIlI;
            WorldArea lllllllllllllllIIllIllIIlllIlIII = lllllllllllllllIIllIllIIlllIlIIl.next();
            if (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIIlllIlIII.contains((Locatable)lllllllllllllllIIllIllIIlllIlIlI) ? 1 : 0)) {
                return lllIIIlllIII[1];
            }
            "".length();
            if ("   ".length() > 0) continue;
            return ((0xA2 ^ 0xA8) & ~(0x67 ^ 0x6D)) != 0;
        }
        return lllIIIlllIII[0];
    }

    private l(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, List<Pair<Integer, Integer>> list, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, m m2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.type = m2;
    }

    private l(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, List<Pair<Integer, Integer>> list2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, m m2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator lllllllllllllllIIllIllIIllIlIIIl = list.iterator();
            while (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIIllIlIIIl.hasNext() ? 1 : 0)) {
                void lllllllllllllllIIllIllIIllIlIIlI;
                Triple lllllllllllllllIIllIllIIllIlIIII = (Triple)lllllllllllllllIIllIllIIllIlIIIl.next();
                lllllllllllllllIIllIllIIllIlIIlI.add(new WorldArea(SquireSepulchre.a((RegionPoint)lllllllllllllllIIllIllIIllIlIIII.getFirst()), ((Integer)lllllllllllllllIIllIllIIllIlIIII.getSecond()).intValue(), ((Integer)lllllllllllllllIIllIllIIllIlIIII.getThird()).intValue()));
                "".length();
                "".length();
                if (-" ".length() <= (0xB2 ^ 0xB6)) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.startDestination = () -> SquireSepulchre.a(regionPoint2);
        this.type = m2;
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint3), n3, n4);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint4);
        this.waitPairs = list2;
    }

    private static /* synthetic */ boolean j(Player player, NPC nPC) {
        boolean bl;
        if (l.lIIIlIIllIIlIII(nPC.getWorldY(), player.getWorldY() + lllIIIlllIII[4])) {
            bl = lllIIIlllIII[1];
            "".length();
            if ((0x99 ^ 0x9D) < 0) {
                return ((0x6B ^ 0x6E) & ~(0xAE ^ 0xAB)) != 0;
            }
        } else {
            bl = lllIIIlllIII[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(d d2) {
        void lllllllllllllllIIllIllIlIIlIlIII;
        l lllllllllllllllIIllIllIlIIlIlIlI;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        int lllllllllllllllIIllIllIlIIlIIlll = lllIIIlllIII[4];
        if (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIIlIlIlI.T() ? 1 : 0)) {
            void lllllllllllllllIIllIllIlIIlIlIIl;
            if (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIIlIlIlI.d((d)lllllllllllllllIIllIllIlIIlIlIIl) ? 1 : 0)) {
                lllllllllllllllIIllIllIlIIlIIlll = lllIIIlllIII[4];
                "".length();
                if ("   ".length() <= " ".length()) {
                    return ((0x76 ^ 0x6B) & ~(0xAE ^ 0xB3)) != 0;
                }
            } else {
                lllllllllllllllIIllIllIlIIlIIlll = lllllllllllllllIIllIllIlIIlIlIlI.U();
            }
        }
        WorldPoint lllllllllllllllIIllIllIlIIlIIllI = new WorldPoint(lllllllllllllllIIllIllIlIIlIlIlI.startPoint.get().getWorldX() - lllIIIlllIII[3], lllllllllllllllIIllIllIlIIlIlIII.getWorldY() + lllllllllllllllIIllIllIlIIlIIlll, lllllllllllllllIIllIllIlIIlIlIII.getPlane());
        List lllllllllllllllIIllIllIlIIlIIlIl = new WorldArea(lllllllllllllllIIllIllIlIIlIIllI, lllIIIlllIII[3], lllIIIlllIII[1]).toWorldPointList();
        List lllllllllllllllIIllIllIlIIlIIlII = TileObjects.getAll(arg_0 -> l.e((Player)lllllllllllllllIIllIllIlIIlIlIII, arg_0));
        ArrayList<Integer> lllllllllllllllIIllIllIlIIlIIIll = new ArrayList<Integer>();
        if (l.lIIIlIIllIIlIlI(lllllllllllllllIIllIllIlIIlIIlII.size())) {
            int lllllllllllllllIIllIllIlIIlIIIlI = lllIIIlllIII[0];
            int lllllllllllllllIIllIllIlIIlIIIIl = lllIIIlllIII[0];
            Iterator lllllllllllllllIIllIllIlIIlIIIII = lllllllllllllllIIllIllIlIIlIIlII.iterator();
            while (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIIlIIIII.hasNext() ? 1 : 0)) {
                TileObject lllllllllllllllIIllIllIlIIIlllll = (TileObject)lllllllllllllllIIllIllIlIIlIIIII.next();
                int lllllllllllllllIIllIllIlIIIllllI = c.a(lllllllllllllllIIllIllIlIIIlllll);
                if (l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIlIIIllllI, b.x)) {
                    ++lllllllllllllllIIllIllIlIIlIIIIl;
                }
                if (l.lIIIlIIllIIlIll(lllllllllllllllIIllIllIlIIIllllI, b.y)) {
                    ++lllllllllllllllIIllIllIlIIlIIIlI;
                    lllllllllllllllIIllIllIlIIlIIIll.add(lllllllllllllllIIllIllIlIIIlllll.getWorldX());
                    "".length();
                    "".length();
                    if ((0x39 ^ 0x5F ^ (0x55 ^ 0x37)) != 0) continue;
                    return ((174 + 197 - 319 + 146 ^ 20 + 24 - -40 + 61) & (0x3C ^ 0x62 ^ (0xBA ^ 0xB3) ^ -" ".length())) != 0;
                }
                ++lllllllllllllllIIllIllIlIIlIIIIl;
                "".length();
                if (null == null) continue;
                return ((41 + 66 - 23 + 51 ^ 132 + 24 - 81 + 74) & (0x8C ^ 0xB5 ^ (0xA1 ^ 0x8A) ^ -" ".length())) != 0;
            }
            lllllllllllllllIIllIllIlIIlIIlIl.removeIf(worldPoint -> lllllllllllllllIIllIllIlIIlIIIll.contains(worldPoint.getWorldX()));
            "".length();
            if (l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIlIIlIIlIl.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)lllllllllllllllIIllIllIlIIlIIlIl.get(lllIIIlllIII[0])));
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[1];
        }
        List lllllllllllllllIIllIllIlIIlIIIlI = NPCs.getAll(arg_0 -> l.h((Player)lllllllllllllllIIllIllIlIIlIlIII, arg_0));
        lllllllllllllllIIllIllIlIIlIIIlI.sort(Comparator.comparingInt(arg_0 -> l.g((Player)lllllllllllllllIIllIllIlIIlIlIII, arg_0)));
        lllllllllllllllIIllIllIlIIlIIIll.clear();
        Iterator lllllllllllllllIIllIllIlIIlIIIIl = lllllllllllllllIIllIllIlIIlIIIlI.iterator();
        while (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIIlIIIIl.hasNext() ? 1 : 0)) {
            NPC lllllllllllllllIIllIllIlIIlIIIII = (NPC)lllllllllllllllIIllIllIlIIlIIIIl.next();
            if (l.lIIIlIIllIIlIII(lllllllllllllllIIllIllIlIIlIIIll.size(), lllIIIlllIII[4]) && l.lIIIlIIllIIIlIl(lllllllllllllllIIllIllIlIIlIIIll.contains(lllllllllllllllIIllIllIlIIlIIIII.getWorldX()) ? 1 : 0) && l.lIIIlIIllIIlIII(lllllllllllllllIIllIllIlIIlIIIII.getWorldY(), lllllllllllllllIIllIllIlIIlIlIII.getWorldY() + lllIIIlllIII[4])) {
                lllllllllllllllIIllIllIlIIlIIIll.add(lllllllllllllllIIllIllIlIIlIIIII.getWorldX());
                "".length();
            }
            "".length();
            if (-" ".length() < 0) continue;
            return ((0x47 ^ 0x70 ^ (0x75 ^ 0x4D)) & (0 + 119 - 56 + 74 ^ 115 + 66 - 121 + 74 ^ -" ".length())) != 0;
        }
        lllllllllllllllIIllIllIlIIlIIIll.stream().sorted();
        "".length();
        lllllllllllllllIIllIllIlIIlIIlIl.removeIf(worldPoint -> lllllllllllllllIIllIllIlIIlIIIll.contains(worldPoint.getWorldX()));
        "".length();
        if (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIIlIIlIl.size())) {
            if (l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIlIIlIIlIl.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)lllllllllllllllIIllIllIlIIlIIlIl.get(lllIIIlllIII[0])));
                return lllIIIlllIII[1];
            }
            Movement.setDestination((WorldPoint)((WorldPoint)lllllllllllllllIIllIllIlIIlIIlIl.get(lllIIIlllIII[0])));
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static /* synthetic */ boolean e(Player player, TileObject tileObject) {
        int n2;
        if (l.lIIIlIIllIIlIII(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[10]) && l.lIIIlIIllIIlIll(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[4]) && l.lIIIlIIllIIIlll(player.getPlane(), tileObject.getPlane()) && l.lIIIlIIllIIIIll(tileObject.getName().equals(lllIIIllIlIl[lllIIIlllIII[4]]) ? 1 : 0)) {
            n2 = lllIIIlllIII[1];
            "".length();
            if (null != null) {
                return ((0x7F ^ 0x67 ^ (0xAA ^ 0xA1)) & (90 + 93 - 122 + 82 ^ 148 + 154 - 255 + 109 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllIIIlllIII[0];
        }
        return n2 != 0;
    }

    private static String lIIIlIIlIllllIl(String lllllllllllllllIIllIllIIlIllIIII, String lllllllllllllllIIllIllIIlIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIlIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIIlIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIIlIllIIlI.init(lllIIIlllIII[4], lllllllllllllllIIllIllIIlIllIIll);
            return new String(lllllllllllllllIIllIllIIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIIlIllIIIl) {
            lllllllllllllllIIllIllIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ boolean f(Player player, TileObject tileObject) {
        int n2;
        if (l.lIIIlIIllIIlIII(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[10]) && l.lIIIlIIllIIlIII(Math.abs(player.getWorldX() - tileObject.getWorldX()), lllIIIlllIII[11]) && l.lIIIlIIllIIIlll(player.getPlane(), tileObject.getPlane()) && l.lIIIlIIllIIIIll(tileObject.getName().equals(lllIIIllIlIl[lllIIIlllIII[3]]) ? 1 : 0)) {
            n2 = lllIIIlllIII[1];
            "".length();
            if (null != null) {
                return ((0x5C ^ 7) & ~(0x38 ^ 0x63)) != 0;
            }
        } else {
            n2 = lllIIIlllIII[0];
        }
        return n2 != 0;
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    private static boolean lIIIlIIllIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIllIIIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean S() {
        l lllllllllllllllIIllIllIlIlIIIIlI;
        void lllllllllllllllIIllIllIlIlIIIIIl;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIlIl(lllllllllllllllIIllIllIlIlIIIIIl.getWorldLocation().equals((Object)lllllllllllllllIIllIllIlIlIIIIlI.startPoint.get()) ? 1 : 0)) {
            return lllIIIlllIII[0];
        }
        WorldPoint lllllllllllllllIIllIllIlIlIIIIII = new WorldPoint(lllllllllllllllIIllIllIlIlIIIIlI.startPoint.get().getWorldX() - lllIIIlllIII[3], lllllllllllllllIIllIllIlIlIIIIIl.getWorldY() + lllIIIlllIII[1], lllllllllllllllIIllIllIlIlIIIIIl.getPlane());
        List lllllllllllllllIIllIllIlIIllllll = new WorldArea(lllllllllllllllIIllIllIlIlIIIIII, lllIIIlllIII[3], lllIIIlllIII[1]).toWorldPointList();
        List lllllllllllllllIIllIllIlIIlllllI = TileObjects.getAll(arg_0 -> l.f((Player)lllllllllllllllIIllIllIlIlIIIIIl, arg_0));
        ArrayList<Integer> lllllllllllllllIIllIllIlIIllllIl = new ArrayList<Integer>();
        if (l.lIIIlIIllIIlIlI(lllllllllllllllIIllIllIlIIlllllI.size())) {
            int lllllllllllllllIIllIllIlIIllllII = lllIIIlllIII[0];
            int lllllllllllllllIIllIllIlIIlllIll = lllIIIlllIII[0];
            Iterator lllllllllllllllIIllIllIlIIlllIlI = lllllllllllllllIIllIllIlIIlllllI.iterator();
            while (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIIlllIlI.hasNext() ? 1 : 0)) {
                TileObject lllllllllllllllIIllIllIlIIlllIIl = (TileObject)lllllllllllllllIIllIllIlIIlllIlI.next();
                int lllllllllllllllIIllIllIlIIlllIII = c.a(lllllllllllllllIIllIllIlIIlllIIl);
                if (l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIlIIlllIII, b.x)) {
                    ++lllllllllllllllIIllIllIlIIlllIll;
                }
                if (l.lIIIlIIllIIlIll(lllllllllllllllIIllIllIlIIlllIII, b.x)) {
                    ++lllllllllllllllIIllIllIlIIllllII;
                    lllllllllllllllIIllIllIlIIllllIl.add(lllllllllllllllIIllIllIlIIlllIIl.getWorldX());
                    "".length();
                    "".length();
                    if (-" ".length() <= 0) continue;
                    return ((11 + 158 - 94 + 149 ^ 158 + 103 - 118 + 44) & (39 + 205 - 169 + 168 ^ 31 + 50 - -73 + 14 ^ -" ".length())) != 0;
                }
                ++lllllllllllllllIIllIllIlIIlllIll;
                "".length();
                if ((0xC1 ^ 0xB5 ^ (0 ^ 0x71)) > 0) continue;
                return ((0xA9 ^ 0x97 ^ (0x1E ^ 0x76)) & (0x8F ^ 0x9E ^ (0x25 ^ 0x62) ^ -" ".length())) != 0;
            }
            lllllllllllllllIIllIllIlIIllllll.removeIf(worldPoint -> lllllllllllllllIIllIllIlIIllllIl.contains(worldPoint.getWorldX()));
            "".length();
            if (l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIlIIllllll.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint)((WorldPoint)lllllllllllllllIIllIllIlIIllllll.get(lllIIIlllIII[0])));
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void lllllllllllllllIIllIllIlIlIllIIl;
        void lllllllllllllllIIllIllIlIlIllIII;
        l lllllllllllllllIIllIllIlIlIllIll;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIlIllIll.b((Locatable)lllllllllllllllIIllIllIlIlIllIII) ? 1 : 0)) {
            lllllllllllllllIIllIllIlIlIllIll.a((SquireSepulchre)lllllllllllllllIIllIllIlIlIllIIl);
            if (l.lIIIlIIllIIIlII((Object)lllllllllllllllIIllIllIlIlIllIll.type, (Object)m.NORTH_BACK) && l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIlIllIll.S() ? 1 : 0)) {
                lllllllllllllllIIllIllIlIlIllIll.b((SquireSepulchre)lllllllllllllllIIllIllIlIlIllIIl);
                return lllIIIlllIII[1];
            }
            if (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIlIllIll.R() ? 1 : 0)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIIllIllIlIlIllIll.startDestination.get());
                return lllIIIlllIII[1];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIIllIllIlIlIllIll.startPoint.get());
            return lllIIIlllIII[1];
        }
        if (l.lIIIlIIllIIIIll(lllllllllllllllIIllIllIlIlIllIll.c((Locatable)lllllllllllllllIIllIllIlIlIllIII) ? 1 : 0)) {
            lllllllllllllllIIllIllIlIlIllIll.b((SquireSepulchre)lllllllllllllllIIllIllIlIlIllIIl);
            if (l.lIIIlIIllIIIlII((Object)lllllllllllllllIIllIllIlIlIllIll.type, (Object)m.NORTH_BACK)) {
                void lllllllllllllllIIllIllIlIlIllIlI;
                lllllllllllllllIIllIllIlIlIllIll.c((d)lllllllllllllllIIllIllIlIlIllIlI);
                "".length();
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[0];
        }
        return lllIIIlllIII[0];
    }

    private static /* synthetic */ int i(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static boolean lIIIlIIllIIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIIlIIlIllllII(String lllllllllllllllIIllIllIIlIlIIIll, String lllllllllllllllIIllIllIIlIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIlIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), lllIIIlllIII[20]), "DES");
            Cipher lllllllllllllllIIllIllIIlIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIllIIlIlIIlIl.init(lllIIIlllIII[4], lllllllllllllllIIllIllIIlIlIIllI);
            return new String(lllllllllllllllIIllIllIIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIIlIlIIlII) {
            lllllllllllllllIIllIllIIlIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIllIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIIlIIllIIIIIl() {
        lllIIIlllIII = new int[21];
        l.lllIIIlllIII[0] = (0x6B ^ 0x63 ^ (0x55 ^ 0x47)) & (71 + 56 - 122 + 175 ^ 124 + 77 - 64 + 37 ^ -" ".length());
        l.lllIIIlllIII[1] = " ".length();
        l.lllIIIlllIII[2] = 0xE ^ 0x27 ^ (0x42 ^ 0x60);
        l.lllIIIlllIII[3] = "   ".length();
        l.lllIIIlllIII[4] = "  ".length();
        l.lllIIIlllIII[5] = -" ".length();
        l.lllIIIlllIII[6] = 0x39 ^ 0x24;
        l.lllIIIlllIII[7] = 0xC5 ^ 0xC2;
        l.lllIIIlllIII[8] = 0xAF ^ 0x98 ^ (0x1A ^ 0xF);
        l.lllIIIlllIII[9] = 0x15 ^ 1;
        l.lllIIIlllIII[10] = 5 ^ 0xC ^ "   ".length();
        l.lllIIIlllIII[11] = 0x3D ^ 0x39;
        l.lllIIIlllIII[12] = 154 + 151 - 243 + 119 ^ 75 + 146 - 219 + 169;
        l.lllIIIlllIII[13] = 0xB1 ^ 0xA2 ^ (0xD7 ^ 0xC1);
        l.lllIIIlllIII[14] = 0x3B ^ 1;
        l.lllIIIlllIII[15] = 0x4F ^ 0x25 ^ (0x70 ^ 0x30);
        l.lllIIIlllIII[16] = -(0xB5 ^ 0xB3);
        l.lllIIIlllIII[17] = 0xBF ^ 0xC4 ^ (0xCE ^ 0xAA);
        l.lllIIIlllIII[18] = 0xFE ^ 0xC1;
        l.lllIIIlllIII[19] = 0xA9 ^ 0xBF;
        l.lllIIIlllIII[20] = 0x48 ^ 0xE ^ (0xCC ^ 0x82);
    }

    /*
     * WARNING - void declaration
     */
    public boolean R() {
        l lllllllllllllllIIllIllIlIlIlIIlI;
        void lllllllllllllllIIllIllIlIlIlIIIl;
        Player player = Players.getLocal();
        if (l.lIIIlIIllIIIIlI(player)) {
            return lllIIIlllIII[0];
        }
        if (l.lIIIlIIllIIIlIl(lllllllllllllllIIllIllIlIlIlIIIl.getWorldLocation().equals((Object)lllllllllllllllIIllIllIlIlIlIIlI.startPoint.get()) ? 1 : 0)) {
            return lllIIIlllIII[0];
        }
        List lllllllllllllllIIllIllIlIlIlIIII = NPCs.getAll(arg_0 -> l.j((Player)lllllllllllllllIIllIllIlIlIlIIIl, arg_0));
        lllllllllllllllIIllIllIlIlIlIIII.sort(Comparator.comparingInt(arg_0 -> l.i((Player)lllllllllllllllIIllIllIlIlIlIIIl, arg_0)));
        NPC lllllllllllllllIIllIllIlIlIIllll = (NPC)lllllllllllllllIIllIllIlIlIlIIII.get(lllIIIlllIII[0]);
        if (l.lIIIlIIllIIIllI(lllllllllllllllIIllIllIlIlIIllll)) {
            int lllllllllllllllIIllIllIlIlIIlllI = Math.abs(lllllllllllllllIIllIllIlIlIIllll.getWorldY() - lllllllllllllllIIllIllIlIlIlIIIl.getWorldY());
            if (l.lIIIlIIllIIIlll(lllllllllllllllIIllIllIlIlIIllll.getWorldX(), lllllllllllllllIIllIllIlIlIlIIlI.P().get().getWorldX()) && l.lIIIlIIllIIlIII(lllllllllllllllIIllIllIlIlIIlllI, lllIIIlllIII[2])) {
                return lllIIIlllIII[0];
            }
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    private static boolean lIIIlIIllIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    private static /* synthetic */ boolean h(Player player, NPC nPC) {
        int n2;
        if (l.lIIIlIIllIIIIll(b.z.contains(nPC.getId()) ? 1 : 0) && l.lIIIlIIllIIlIII(nPC.getWorldY(), player.getWorldY() + lllIIIlllIII[4]) && l.lIIIlIIllIIlIII(Math.abs(nPC.getWorldX() - player.getWorldX()), lllIIIlllIII[3]) && l.lIIIlIIllIIlIll(nPC.getWorldY(), player.getWorldY() - lllIIIlllIII[9]) && l.lIIIlIIllIIIlll(nPC.getPlane(), player.getPlane())) {
            n2 = lllIIIlllIII[1];
            "".length();
            if (null != null) {
                return ((0xB0 ^ 0x84) & ~(0x44 ^ 0x70)) != 0;
            }
        } else {
            n2 = lllIIIlllIII[0];
        }
        return n2 != 0;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static boolean lIIIlIIllIIlIlI(int n2) {
        return n2 > 0;
    }
}

