/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Client
 *  net.runelite.api.Deque
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.GameEnum17;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.Client;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

public final class GameEnum
extends Enum<G> {
    public static final  /* enum */ G NORTH_II_VII;
    public static final  /* enum */ G TOP_V_V;

    public static final  /* enum */ G NORTH_II_V;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ G MIDDLE_V_XIII;
    public static final  /* enum */ G NORTH_II_VI;
     H type;
    public static final  /* enum */ G TOP_V_VII;
    public static final  /* enum */ G MIDDLE_V_XV;
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ G EAST_IV_II;
    public static final  /* enum */ G WEST_II_III;
    private static final  G[] $VALUES;
     Supplier<WorldPoint> destination;
    public static final  /* enum */ G EAST_II_VI;

    private static boolean lIIIlIIlIIIlIII(Object object) {
        return object == null;
    }

    private GameEnum(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, H h2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var1 = list.iterator();
            while (G.lIIIlIIlIIIlIll(var1.hasNext() ? 1 : 0)) {
                void var2;
                Triple var3 = (Triple)var1.next();
                var2.add(new WorldArea(SquireSepulchre.a((RegionPoint)var3.getFirst()), ((Integer)var3.getSecond()).intValue(), ((Integer)var3.getThird()).intValue()));

                if (-1 <= 2) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.type = h2;
    }

    private static void lIIIlIIlIIIIllI() {
        lllIIIlIIlIl = new String[lllIIIlIIllI[31]];
        G.lllIIIlIIlIl[G.lllIIIlIIllI[0]] = "in here!";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[1]] = "WEST_II_III";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[4]] = "EAST_II_VI";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[5]] = "NORTH_II_V";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[9]] = "NORTH_II_VI";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[11]] = "NORTH_II_VII";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[17]] = "EAST_IV_II";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[21]] = "TOP_V_V";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[25]] = "TOP_V_VII";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[23]] = "MIDDLE_V_XIII";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[29]] = "MIDDLE_V_XV";
    }

        return String.valueOf(var4);
    }

    private GameEnum(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, H h2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.type = h2;
    }

    private static boolean lIIIlIIlIIIlIIl(int n2) {
        return n2 == 0;
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(WorldPoint worldPoint) {
        Iterator<WorldArea> var5 = this.startAreas.get().iterator();
        while (G.lIIIlIIlIIIlIll(var5.hasNext() ? 1 : 0)) {
            void var6;
            WorldArea var7 = var5.next();
            if (G.lIIIlIIlIIIlIll(var7.contains((WorldPoint)var6) ? 1 : 0)) {
                return lllIIIlIIllI[1];
            }

            return ((28 + 123 - 59 + 68 ^ 149 + 134 - 187 + 63) & (0x41 ^ 0x16 ^ (0x27 ^ 0x4F) ^ -1)) != 0;
        }
        return lllIIIlIIllI[0];
    }

    private static boolean lIIIlIIlIIIlIll(int n2) {
        return n2 != 0;
    }

    static {
        G.lIIIlIIlIIIIlll();
        G.lIIIlIIlIIIIllI();
        WEST_II_III = new GameEnum(new RegionPoint(lllIIIlIIllI[2], lllIIIlIIllI[3], lllIIIlIIllI[4], b.I), lllIIIlIIllI[5], lllIIIlIIllI[6], new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[8], lllIIIlIIllI[4], b.I), new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[8], lllIIIlIIllI[4], b.I), H.STRANGE_TILES);
        EAST_II_VI = new GameEnum(new RegionPoint(lllIIIlIIllI[3], lllIIIlIIllI[5], lllIIIlIIllI[4], b.G), lllIIIlIIllI[6], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[9], lllIIIlIIllI[4], b.G), new RegionPoint(lllIIIlIIllI[10], lllIIIlIIllI[9], lllIIIlIIllI[4], b.G), H.STRANGE_TILES);
        NORTH_II_V = new GameEnum(new RegionPoint(lllIIIlIIllI[10], lllIIIlIIllI[2], lllIIIlIIllI[1], b.G), lllIIIlIIllI[11], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[12], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), new RegionPoint(lllIIIlIIllI[12], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), H.STRANGE_TILES);
        NORTH_II_VI = new GameEnum(new RegionPoint(lllIIIlIIllI[14], lllIIIlIIllI[2], lllIIIlIIllI[1], b.G), lllIIIlIIllI[11], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[15], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), new RegionPoint(lllIIIlIIllI[15], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), H.STRANGE_TILES);
        NORTH_II_VII = new GameEnum(new RegionPoint(lllIIIlIIllI[8], lllIIIlIIllI[2], lllIIIlIIllI[1], b.G), lllIIIlIIllI[9], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[16], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), new RegionPoint(lllIIIlIIllI[16], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), H.STRANGE_TILES);
        EAST_IV_II = new GameEnum(new RegionPoint(lllIIIlIIllI[18], lllIIIlIIllI[19], lllIIIlIIllI[1], b.L), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[19], lllIIIlIIllI[20], lllIIIlIIllI[1], b.L), new RegionPoint(lllIIIlIIllI[19], lllIIIlIIllI[20], lllIIIlIIllI[1], b.L), H.DART_STRANGE_TILES);
        TOP_V_V = new GameEnum(new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[22], lllIIIlIIllI[4], b.N), lllIIIlIIllI[5], lllIIIlIIllI[23], new RegionPoint(lllIIIlIIllI[11], lllIIIlIIllI[24], lllIIIlIIllI[4], b.N), new RegionPoint(lllIIIlIIllI[11], lllIIIlIIllI[24], lllIIIlIIllI[4], b.N), H.BLADE_STRANGE_TILES);
        TOP_V_VII = new GameEnum(new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[26], lllIIIlIIllI[4], b.N), lllIIIlIIllI[5], lllIIIlIIllI[25], new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[27], lllIIIlIIllI[4], b.N), new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[27], lllIIIlIIllI[4], b.N), H.BLADE_STRANGE_TILES);
        MIDDLE_V_XIII = new GameEnum(new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], b.N), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], b.N), new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], b.N), H.BLADE_STRANGE_TILES);
        MIDDLE_V_XV = new GameEnum(new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], b.N), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], b.N), new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], b.N), H.BLADE_STRANGE_TILES);
        G[] gArray = new G[lllIIIlIIllI[29]];
        gArray[G.lllIIIlIIllI[0]] = WEST_II_III;
        gArray[G.lllIIIlIIllI[1]] = EAST_II_VI;
        gArray[G.lllIIIlIIllI[4]] = NORTH_II_V;
        gArray[G.lllIIIlIIllI[5]] = NORTH_II_VI;
        gArray[G.lllIIIlIIllI[9]] = NORTH_II_VII;
        gArray[G.lllIIIlIIllI[11]] = EAST_IV_II;
        gArray[G.lllIIIlIIllI[17]] = TOP_V_V;
        gArray[G.lllIIIlIIllI[21]] = TOP_V_VII;
        gArray[G.lllIIIlIIllI[25]] = MIDDLE_V_XIII;
        gArray[G.lllIIIlIIllI[23]] = MIDDLE_V_XV;
        $VALUES = gArray;
    }

    public static G valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var8;
        void var9;
        G var10;
        Player player = Players.getLocal();
        if (G.lIIIlIIlIIIlIII(player)) {
            return lllIIIlIIllI[0];
        }
        if (G.lIIIlIIlIIIlIIl(var10.a((Locatable)var9) ? 1 : 0)) {
            return lllIIIlIIllI[0];
        }
        System.out.println(lllIIIlIIlIl[lllIIIlIIllI[0]]);
        var10.a((SquireSepulchre)var8);
        if (G.lIIIlIIlIIIlIlI((Object)var10.type, (Object)H.DART_STRANGE_TILES)) {
            Deque var11 = Static.getClient().getGraphicsObjects();
            Iterator var12 = var11.iterator();
            while (G.lIIIlIIlIIIlIll(var12.hasNext() ? 1 : 0)) {
                GraphicsObject var13 = (GraphicsObject)var12.next();
                if (G.lIIIlIIlIIIlIll(b.A.contains(var13.getId()) ? 1 : 0) && G.lIIIlIIlIIIlIll(var10.c(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var13.getLocation())) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var13.getLocation()));
                    return lllIIIlIIllI[1];
                }

                if (-2 <= 0) continue;
                return ((0x88 ^ 0xB0 ^ (0x38 ^ 0x34)) & (0x59 ^ 9 ^ (0x46 ^ 0x22) ^ -1)) != 0;
            }
            return lllIIIlIIllI[0];
        }
        if (G.lIIIlIIlIIIlIlI((Object)var10.type, (Object)H.BLADE_STRANGE_TILES)) {
            Deque var11 = Static.getClient().getGraphicsObjects();
            Iterator var12 = var11.iterator();
            while (G.lIIIlIIlIIIlIll(var12.hasNext() ? 1 : 0)) {
                GraphicsObject var13 = (GraphicsObject)var12.next();
                if (G.lIIIlIIlIIIlIll(b.A.contains(var13.getId()) ? 1 : 0) && G.lIIIlIIlIIIlIll(var10.c(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var13.getLocation())) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var13.getLocation()));
                    return lllIIIlIIllI[1];
                }

                if (1 != 0) continue;
                return false;
            }
        }
        Movement.setDestination((WorldPoint)this.destination.get());
        return lllIIIlIIllI[1];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var14 = this.startAreas.get().iterator();
        while (G.lIIIlIIlIIIlIll(var14.hasNext() ? 1 : 0)) {
            void var15;
            WorldArea var16 = var14.next();
            if (G.lIIIlIIlIIIlIll(var16.contains((Locatable)var15) ? 1 : 0)) {
                return lllIIIlIIllI[1];
            }

            if (2 <= 2) continue;
            return false;
        }
        return lllIIIlIIllI[0];
    }

    private static boolean lIIIlIIlIIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

