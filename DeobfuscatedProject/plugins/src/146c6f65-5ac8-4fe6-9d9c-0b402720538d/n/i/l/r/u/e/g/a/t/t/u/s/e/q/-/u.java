/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GroundObject
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Tile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.scene.Tiles
 *  net.unethicalite.client.Static
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.j;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GroundObject;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.client.Static;

@TaskDesc(name="Escaping hazard", priority=8)
@Singleton
public class u
extends n {
    private static /* synthetic */ int[] llIIlllIIIlI;
    private final /* synthetic */ b bD;

    private static boolean lllllllIlIllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void lllllllllllllllIlIIlIIllIlIIllII;
        void lllllllllllllllIlIIlIIllIlIIllll;
        WorldPoint lllllllllllllllIlIIlIIllIlIIllIl;
        WorldPoint worldPoint3 = worldPoint2;
        int n2 = llIIlllIIIlI[1];
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        linkedList.add(worldPoint2);
        "".length();
        while (u.lllllllIlIllll((lllllllllllllllIlIIlIIllIlIIllIl = lllllllllllllllIlIIlIIllIlIIllIl.dx((int)Math.signum(lllllllllllllllIlIIlIIllIlIIllll.getX() - lllllllllllllllIlIIlIIllIlIIllIl.getX())).dy((int)Math.signum(lllllllllllllllIlIIlIIllIlIIllll.getY() - lllllllllllllllIlIIlIIllIlIIllIl.getY()))).equals((Object)lllllllllllllllIlIIlIIllIlIIllll) ? 1 : 0) && u.lllllllIllIIlI((int)(++lllllllllllllllIlIIlIIllIlIIllII), llIIlllIIIlI[8])) {
            void lllllllllllllllIlIIlIIllIlIIlIll;
            lllllllllllllllIlIIlIIllIlIIlIll.add(lllllllllllllllIlIIlIIllIlIIllIl);
            "".length();
            "".length();
            if (null == null) continue;
            return null;
        }
        linkedList.add(worldPoint);
        "".length();
        Collections.reverse(linkedList);
        return linkedList;
    }

    private static boolean lllllllIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean j(WorldPoint worldPoint) {
        int n2;
        void lllllllllllllllIlIIlIIlllIIIlIIl;
        void lllllllllllllllIlIIlIIlllIIIlIII;
        h h2 = this.ba.V();
        if (u.lllllllIlIlIll(h2)) {
            return llIIlllIIIlI[1];
        }
        l lllllllllllllllIlIIlIIlllIIIIlll = lllllllllllllllIlIIlIIlllIIIlIII.aq();
        int lllllllllllllllIlIIlIIlllIIIIllI = lllllllllllllllIlIIlIIlllIIIIlll.aM() + llIIlllIIIlI[4];
        int lllllllllllllllIlIIlIIlllIIIIlIl = lllllllllllllllIlIIlIIlllIIIIlll.aN() + llIIlllIIIlI[4];
        int lllllllllllllllIlIIlIIlllIIIIlII = lllllllllllllllIlIIlIIlllIIIIllI + llIIlllIIIlI[6];
        int lllllllllllllllIlIIlIIlllIIIIIll = lllllllllllllllIlIIlIIlllIIIIlIl + llIIlllIIIlI[6];
        if (u.lllllllIllIIll(lllllllllllllllIlIIlIIlllIIIlIIl.getX(), lllllllllllllllIlIIlIIlllIIIIllI) && u.lllllllIllIIll(lllllllllllllllIlIIlIIlllIIIlIIl.getY(), lllllllllllllllIlIIlIIlllIIIIlIl) && u.lllllllIlIlllI(lllllllllllllllIlIIlIIlllIIIlIIl.getX(), lllllllllllllllIlIIlIIlllIIIIlII) && u.lllllllIlIlllI(lllllllllllllllIlIIlIIlllIIIlIIl.getY(), lllllllllllllllIlIIlIIlllIIIIIll)) {
            n2 = llIIlllIIIlI[0];
            "".length();
            if ((0xA4 ^ 0xA0) < -" ".length()) {
                return ((0x3A ^ 0x58) & ~(0x6F ^ 0xD)) != 0;
            }
        } else {
            n2 = llIIlllIIIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lllllllIllIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllllIlIlIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        int lllllllllllllllIlIIlIIllllIIIIIl;
        int n2;
        int lllllllllllllllIlIIlIIllllIIIIlI;
        int n3;
        int lllllllllllllllIlIIlIIllllIIIIll;
        int n4;
        int lllllllllllllllIlIIlIIllllIIIlII;
        int lllllllllllllllIlIIlIIllllIIIlIl;
        int n5;
        void lllllllllllllllIlIIlIIllllIIlIIl;
        u lllllllllllllllIlIIlIIllllIIlIlI;
        Player player = Players.getLocal();
        if (u.lllllllIlIlIll(player)) {
            return llIIlllIIIlI[1];
        }
        WorldPoint lllllllllllllllIlIIlIIllllIIlIII = Movement.getDestination();
        NPC lllllllllllllllIlIIlIIllllIIIlll = lllllllllllllllIlIIlIIllllIIlIlI.m(lllllllllllllllIlIIlIIllllIIlIIl.getWorldLocation());
        int n6 = lllllllllllllllIlIIlIIllllIIlIlI.n(lllllllllllllllIlIIlIIllllIIlIIl.getWorldLocation());
        if (u.lllllllIlIllII(lllllllllllllllIlIIlIIllllIIIlll)) {
            n5 = lllllllllllllllIlIIlIIllllIIIlll.getWorldLocation().distanceTo(lllllllllllllllIlIIlIIllllIIlIIl.getWorldLocation());
            "".length();
            if (("  ".length() & ~"  ".length() & ~((6 ^ 0xD) & ~(0xCB ^ 0xC0))) > " ".length()) {
                return ((0x16 ^ 0x77) & ~(0x48 ^ 0x29)) != 0;
            }
        } else {
            n5 = lllllllllllllllIlIIlIIllllIIIlIl = llIIlllIIIlI[2];
        }
        if (u.lllllllIlIllIl(lllllllllllllllIlIIlIIllllIIIlII = lllllllllllllllIlIIlIIllllIIlIlI.ba.h().safeBossFight())) {
            n4 = llIIlllIIIlI[3];
            "".length();
            if (((0x46 ^ 0x6D) & ~(0x3D ^ 0x16)) != 0) {
                return ((0x79 ^ 0x62) & ~(0x22 ^ 0x39)) != 0;
            }
        } else {
            n4 = lllllllllllllllIlIIlIIllllIIIIll = llIIlllIIIlI[4];
        }
        if (u.lllllllIlIllII(lllllllllllllllIlIIlIIllllIIIlll) && u.lllllllIlIlllI(lllllllllllllllIlIIlIIllllIIIlIl, lllllllllllllllIlIIlIIllllIIIIll)) {
            n3 = llIIlllIIIlI[0];
            "".length();
            if ((2 ^ 6) == 0) {
                return ((0x94 ^ 0x93) & ~(0x90 ^ 0x97)) != 0;
            }
        } else {
            n3 = lllllllllllllllIlIIlIIllllIIIIlI = llIIlllIIIlI[1];
        }
        if (u.lllllllIlIllll(lllllllllllllllIlIIlIIllllIIlIlI.l(lllllllllllllllIlIIlIIllllIIlIIl.getWorldLocation()) ? 1 : 0)) {
            n2 = llIIlllIIIlI[0];
            "".length();
            if (((73 + 88 - 88 + 57 ^ 5 + 42 - -43 + 70) & (28 + 55 - 16 + 63 ^ 118 + 16 - 79 + 105 ^ -" ".length())) != 0) {
                return ((0x1F ^ 0x33 ^ (0x59 ^ 0x20)) & (108 + 133 - 195 + 209 ^ 105 + 142 - 85 + 8 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllllllllllllllIlIIlIIllllIIIIIl = llIIlllIIIlI[1];
        }
        if (u.lllllllIlIllII(lllllllllllllllIlIIlIIllllIIlIII) && u.lllllllIlIlIll(lllllllllllllllIlIIlIIllllIIlIIl.getInteracting()) && u.lllllllIlIllIl(lllllllllllllllIlIIlIIllllIIlIIl.isMoving() ? 1 : 0) && u.lllllllIlIllll(lllllllllllllllIlIIlIIllllIIlIII.equals((Object)lllllllllllllllIlIIlIIllllIIlIIl.getWorldLocation()) ? 1 : 0) && u.lllllllIlIllIl(lllllllllllllllIlIIlIIllllIIlIlI.d(lllllllllllllllIlIIlIIllllIIlIlI.c(lllllllllllllllIlIIlIIllllIIlIII, lllllllllllllllIlIIlIIllllIIlIIl.getWorldLocation())) ? 1 : 0)) {
            return llIIlllIIIlI[1];
        }
        if (!u.lllllllIlIllll(lllllllllllllllIlIIlIIllllIIIIIl) || u.lllllllIlIllIl(n6)) {
            int n7;
            WorldPoint lllllllllllllllIlIIlIIllllIIIIII = lllllllllllllllIlIIlIIllllIIlIlI.k(lllllllllllllllIlIIlIIllllIIlIIl.getWorldLocation());
            if (!u.lllllllIlIllll(n6) || u.lllllllIllIIII(lllllllllllllllIlIIlIIllllIIlIlI.bD.z(), lllllllllllllllIlIIlIIllllIIlIlI.ba.X().aK() + llIIlllIIIlI[3])) {
                n7 = llIIlllIIIlI[0];
                "".length();
                if (-"  ".length() >= 0) {
                    return ((107 + 4 - 18 + 125 ^ 30 + 107 - 64 + 74) & (83 + 117 - 157 + 151 ^ 128 + 128 - 208 + 91 ^ -" ".length())) != 0;
                }
            } else {
                int lllllllllllllllIlIIlIIlllIllllll;
                n7 = lllllllllllllllIlIIlIIlllIllllll = llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllII(lllllllllllllllIlIIlIIllllIIIIII) && (!u.lllllllIlIllIl(lllllllllllllllIlIIlIIllllIIIIII.equals((Object)lllllllllllllllIlIIlIIllllIIlIII) ? 1 : 0) || u.lllllllIlIllll(lllllllllllllllIlIIlIIllllIIlIIl.isMoving() ? 1 : 0))) {
                ScenePoint lllllllllllllllIlIIlIIlllIlllllI = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIlIIllllIIIIII);
                Movement.setDestination((int)lllllllllllllllIlIIlIIlllIlllllI.getX(), (int)lllllllllllllllIlIIlIIlllIlllllI.getY());
                return llIIlllIIIlI[0];
            }
        }
        if (u.lllllllIlIllII(lllllllllllllllIlIIlIIllllIIIlll)) {
            WorldPoint lllllllllllllllIlIIlIIlllIllllll;
            int lllllllllllllllIlIIlIIllllIIIIII;
            int n8;
            if (u.lllllllIllIIIl(lllllllllllllllIlIIlIIllllIIlIlI.ba.X().aD(), HeadIcon.RANGED) && u.lllllllIlIlIll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && u.lllllllIlIllll(lllllllllllllllIlIIlIIllllIIIlII)) {
                n8 = llIIlllIIIlI[0];
                "".length();
                if (-(0xA2 ^ 0xB1 ^ (0x25 ^ 0x32)) >= 0) {
                    return ((55 + 52 - 59 + 84 ^ 61 + 38 - 84 + 146) & (177 + 183 - 206 + 77 ^ 24 + 68 - -43 + 59 ^ -" ".length())) != 0;
                }
            } else {
                n8 = lllllllllllllllIlIIlIIllllIIIIII = llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllII(lllllllllllllllIlIIlIIlllIllllll = lllllllllllllllIlIIlIIllllIIlIlI.i(lllllllllllllllIlIIlIIllllIIlIIl.getWorldLocation()))) {
                int lllllllllllllllIlIIlIIlllIlllllI = lllllllllllllllIlIIlIIllllIIIlll.getWorldLocation().distanceTo(lllllllllllllllIlIIlIIlllIllllll);
                if (!u.lllllllIlIllll(lllllllllllllllIlIIlIIllllIIIIlI) || u.lllllllIlIllll(lllllllllllllllIlIIlIIllllIIIIII) && u.lllllllIlIllIl(lllllllllllllllIlIIlIIllllIIlIlI.bD.t() ? 1 : 0) && u.lllllllIllIIII(lllllllllllllllIlIIlIIlllIlllllI, lllllllllllllllIlIIlIIllllIIIlIl)) {
                    ScenePoint lllllllllllllllIlIIlIIlllIllllIl = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIlIIlllIllllll);
                    Movement.setDestination((int)lllllllllllllllIlIIlIIlllIllllIl.getX(), (int)lllllllllllllllIlIIlIIlllIllllIl.getY());
                    return llIIlllIIIlI[0];
                }
            }
        }
        return llIIlllIIIlI[1];
    }

    static {
        u.lllllllIlIlIlI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean n(WorldPoint worldPoint) {
        void var3_3;
        void lllllllllllllllIlIIlIIllIllIIllI;
        j j2 = this.ba.X();
        if (u.lllllllIlIlIll(j2)) {
            return llIIlllIIIlI[1];
        }
        NPC lllllllllllllllIlIIlIIllIllIIlIl = lllllllllllllllIlIIlIIllIllIIllI.aI();
        if (u.lllllllIlIlIll(lllllllllllllllIlIIlIIllIllIIlIl)) {
            return llIIlllIIIlI[1];
        }
        return var3_3.getWorldArea().toWorldPointList().contains(worldPoint);
    }

    private static boolean lllllllIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public u(c c2, b b2) {
        d[] dArray = new d[llIIlllIIIlI[0]];
        dArray[u.llIIlllIIIlI[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bD = b2;
    }

    private static void lllllllIlIlIlI() {
        llIIlllIIIlI = new int[10];
        u.llIIlllIIIlI[0] = " ".length();
        u.llIIlllIIIlI[1] = (0x93 ^ 0xB7) & ~(0x33 ^ 0x17);
        u.llIIlllIIIlI[2] = 0xFFFFBBE7 & 0x47FF;
        u.llIIlllIIIlI[3] = "   ".length();
        u.llIIlllIIIlI[4] = "  ".length();
        u.llIIlllIIIlI[5] = -" ".length();
        u.llIIlllIIIlI[6] = 0x1A ^ 0x11;
        u.llIIlllIIIlI[7] = 0x48 ^ 0x28 ^ (0x47 ^ 0x2B);
        u.llIIlllIIIlI[8] = 53 + 143 - -4 + 1 ^ 118 + 116 - 120 + 59;
        u.llIIlllIIIlI[9] = -"   ".length();
    }

    private static boolean lllllllIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (u.lllllllIlIllIl(e.ax.contains(npcSpawned.getNpc().getId()) ? 1 : 0)) {
            this.bD.a(npcSpawned.getNpc());
        }
    }

    public boolean o(WorldPoint worldPoint) {
        int n2;
        if (u.lllllllIlIllIl(this.j(worldPoint) ? 1 : 0) && u.lllllllIlIllIl(this.l(worldPoint) ? 1 : 0) && u.lllllllIlIllll(this.n(worldPoint) ? 1 : 0)) {
            n2 = llIIlllIIIlI[0];
            "".length();
            if ((0x6A ^ 0x6E) < " ".length()) {
                return ((0x26 ^ 0xE) & ~(0x66 ^ 0x4E)) != 0;
            }
        } else {
            n2 = llIIlllIIIlI[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint k(WorldPoint worldPoint) {
        if (u.lllllllIlIlIll(worldPoint)) {
            return null;
        }
        int lllllllllllllllIlIIlIIllIllllIlI = llIIlllIIIlI[0];
        while (u.lllllllIlIlllI(lllllllllllllllIlIIlIIllIllllIlI, llIIlllIIIlI[7])) {
            int lllllllllllllllIlIIlIIllIllllIIl = -lllllllllllllllIlIIlIIllIllllIlI;
            while (u.lllllllIlIlllI(lllllllllllllllIlIIlIIllIllllIIl, lllllllllllllllIlIIlIIllIllllIlI)) {
                int lllllllllllllllIlIIlIIllIllllIII = -lllllllllllllllIlIIlIIllIllllIlI;
                while (u.lllllllIlIlllI(lllllllllllllllIlIIlIIllIllllIII, lllllllllllllllIlIIlIIllIllllIlI)) {
                    if (u.lllllllIllIlII(Math.abs(lllllllllllllllIlIIlIIllIllllIIl), lllllllllllllllIlIIlIIllIllllIlI) && u.lllllllIllIlII(Math.abs(lllllllllllllllIlIIlIIllIllllIII), lllllllllllllllIlIIlIIllIllllIlI)) {
                        "".length();
                        if (((0x7E ^ 0x5A) & ~(0x38 ^ 0x1C)) != 0) {
                            return null;
                        }
                    } else {
                        u lllllllllllllllIlIIlIIllIlllllII;
                        void lllllllllllllllIlIIlIIllIllllIll;
                        WorldPoint lllllllllllllllIlIIlIIllIlllIlll = lllllllllllllllIlIIlIIllIllllIll.dx(lllllllllllllllIlIIlIIllIllllIIl).dy(lllllllllllllllIlIIlIIllIllllIII);
                        if (u.lllllllIlIllIl(lllllllllllllllIlIIlIIllIlllllII.j(lllllllllllllllIlIIlIIllIlllIlll) ? 1 : 0) && u.lllllllIlIllIl(lllllllllllllllIlIIlIIllIlllllII.l(lllllllllllllllIlIIlIIllIlllIlll) ? 1 : 0) && u.lllllllIlIllll(lllllllllllllllIlIIlIIllIlllllII.n(lllllllllllllllIlIIlIIllIlllIlll) ? 1 : 0)) {
                            return lllllllllllllllIlIIlIIllIlllIlll;
                        }
                    }
                    ++lllllllllllllllIlIIlIIllIllllIII;
                    "".length();
                    if (((4 ^ 0x24) & ~(0xBB ^ 0x9B)) >= 0) continue;
                    return null;
                }
                ++lllllllllllllllIlIIlIIllIllllIIl;
                "".length();
                if (" ".length() >= -" ".length()) continue;
                return null;
            }
            ++lllllllllllllllIlIIlIIllIllllIlI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint i(WorldPoint worldPoint) {
        LinkedList linkedList = new LinkedList();
        int lllllllllllllllIlIIlIIlllIllIIIl = llIIlllIIIlI[5];
        while (u.lllllllIlIlllI(lllllllllllllllIlIIlIIlllIllIIIl, llIIlllIIIlI[0])) {
            int lllllllllllllllIlIIlIIlllIllIIII = llIIlllIIIlI[5];
            while (u.lllllllIlIlllI(lllllllllllllllIlIIlIIlllIllIIII, llIIlllIIIlI[0])) {
                void lllllllllllllllIlIIlIIlllIllIIll;
                u lllllllllllllllIlIIlIIlllIllIlII;
                void lllllllllllllllIlIIlIIlllIllIIlI;
                lllllllllllllllIlIIlIIlllIllIIlI.add(lllllllllllllllIlIIlIIlllIllIlII.a(new AbstractMap.SimpleEntry<void, Integer>(lllllllllllllllIlIIlIIlllIllIIll, llIIlllIIIlI[2]), lllllllllllllllIlIIlIIlllIllIIIl, lllllllllllllllIlIIlIIlllIllIIII));
                "".length();
                ++lllllllllllllllIlIIlIIlllIllIIII;
                "".length();
                if (((175 + 25 - 143 + 136 ^ 49 + 42 - 87 + 144) & (199 + 81 - 211 + 157 ^ 45 + 154 - 22 + 6 ^ -" ".length())) == 0) continue;
                return null;
            }
            ++lllllllllllllllIlIIlIIlllIllIIIl;
            "".length();
            if (-"   ".length() <= 0) continue;
            return null;
        }
        Comparator<AbstractMap.SimpleEntry> comparator = Comparator.comparingInt(AbstractMap.SimpleEntry::getValue);
        Comparator<AbstractMap.SimpleEntry> comparator2 = Comparator.comparingInt(simpleEntry -> (int)((WorldPoint)simpleEntry.getKey()).distanceToHypotenuse(worldPoint));
        j j2 = this.ba.X();
        Comparator<AbstractMap.SimpleEntry> comparator3 = Comparator.comparingInt(simpleEntry -> (int)((WorldPoint)simpleEntry.getKey()).distanceToHypotenuse(j2.aI().getWorldLocation()));
        Comparator<AbstractMap.SimpleEntry> comparator4 = comparator.thenComparing(comparator3);
        return linkedList.stream().filter(Objects::nonNull).filter(simpleEntry -> {
            boolean bl;
            if (u.lllllllIlIllll(((WorldPoint)simpleEntry.getKey()).equals((Object)worldPoint) ? 1 : 0)) {
                bl = llIIlllIIIlI[0];
                "".length();
                if (((21 + 49 - 42 + 185 ^ 97 + 23 - 61 + 94) & (0xC4 ^ 0x8D ^ (0x59 ^ 0x5C) ^ -" ".length())) >= "  ".length()) {
                    return ((220 + 228 - 375 + 171 ^ 33 + 103 - -35 + 23) & (0xA ^ 0x31 ^ (0x75 ^ 0x78) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIlllIIIlI[1];
            }
            return bl;
        }).max(comparator4).map(AbstractMap.SimpleEntry::getKey).orElse(null);
    }

    private static boolean lllllllIllIIII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(List<WorldPoint> list) {
        int n2;
        u lllllllllllllllIlIIlIIllIlIlllII;
        void lllllllllllllllIlIIlIIllIlIllIll;
        int n3;
        boolean bl = this.n(list.get(llIIlllIIIlI[1]));
        if (u.lllllllIlIllll(this.l(list.get(llIIlllIIIlI[1])) ? 1 : 0)) {
            n3 = llIIlllIIIlI[0];
            "".length();
            if (((0xFB ^ 0x94 ^ (0x64 ^ 0x11)) & (0x52 ^ 0x76 ^ (0x2E ^ 0x10) ^ -" ".length())) >= "  ".length()) {
                return ((143 + 115 - 194 + 157 ^ 89 + 46 - 84 + 107) & (0x79 ^ 0x58 ^ (0xCC ^ 0xAE) ^ -" ".length())) != 0;
            }
        } else {
            n3 = llIIlllIIIlI[1];
        }
        int lllllllllllllllIlIIlIIllIlIllIIl = n3;
        Iterator lllllllllllllllIlIIlIIllIlIllIII = lllllllllllllllIlIIlIIllIlIllIll.iterator();
        while (u.lllllllIlIllIl(lllllllllllllllIlIIlIIllIlIllIII.hasNext() ? 1 : 0)) {
            int lllllllllllllllIlIIlIIllIlIllIlI;
            int n4;
            WorldPoint lllllllllllllllIlIIlIIllIlIlIlll = (WorldPoint)lllllllllllllllIlIIlIIllIlIllIII.next();
            if (u.lllllllIlIllll(lllllllllllllllIlIIlIIllIlIlllII.l(lllllllllllllllIlIIlIIllIlIlIlll) ? 1 : 0)) {
                n4 = llIIlllIIIlI[0];
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return ((8 ^ 0x5B ^ (0x19 ^ 3)) & (0xF9 ^ 0x9E ^ (0xB ^ 0x25) ^ -" ".length())) != 0;
                }
            } else {
                n4 = llIIlllIIIlI[1];
            }
            int lllllllllllllllIlIIlIIllIlIlIllI = n4;
            int n5 = lllllllllllllllIlIIlIIllIlIlllII.n(lllllllllllllllIlIIlIIllIlIlIlll);
            if (u.lllllllIlIllIl(lllllllllllllllIlIIlIIllIlIllIIl) && u.lllllllIlIllll(lllllllllllllllIlIIlIIllIlIlIllI)) {
                lllllllllllllllIlIIlIIllIlIllIIl = llIIlllIIIlI[1];
                "".length();
                if (((0x64 ^ 0x7F ^ (1 ^ 0x1E)) & (44 + 89 - 8 + 29 ^ 51 + 44 - 80 + 143 ^ -" ".length())) != 0) {
                    return ((38 + 143 - 149 + 137 ^ 7 + 36 - -76 + 22) & (147 + 114 - 234 + 153 ^ 91 + 70 - 100 + 83 ^ -" ".length())) != 0;
                }
            } else if (u.lllllllIlIllIl(lllllllllllllllIlIIlIIllIlIlIllI)) {
                return llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllIl(lllllllllllllllIlIIlIIllIlIllIlI) && u.lllllllIlIllll(n5)) {
                lllllllllllllllIlIIlIIllIlIllIlI = llIIlllIIIlI[1];
                "".length();
                if (null != null) {
                    return ((51 + 52 - -29 + 48 ^ 63 + 54 - -42 + 30) & (0x33 ^ 0x1C ^ (0x3C ^ 0x1A) ^ -" ".length())) != 0;
                }
            } else if (u.lllllllIlIllIl(n5)) {
                return llIIlllIIIlI[1];
            }
            "".length();
            if (" ".length() != ((0x68 ^ 0x41) & ~(0x44 ^ 0x6D))) continue;
            return ((0x64 ^ 0x6F) & ~(0x94 ^ 0x9F)) != 0;
        }
        if (u.lllllllIlIllll(lllllllllllllllIlIIlIIllIlIlllII.n((WorldPoint)lllllllllllllllIlIIlIIllIlIllIll.get(lllllllllllllllIlIIlIIllIlIllIll.size() - llIIlllIIIlI[0])) ? 1 : 0) && u.lllllllIlIllIl(lllllllllllllllIlIIlIIllIlIlllII.l((WorldPoint)lllllllllllllllIlIIlIIllIlIllIll.get(lllllllllllllllIlIIlIIllIlIllIll.size() - llIIlllIIIlI[0])) ? 1 : 0)) {
            n2 = llIIlllIIIlI[0];
            "".length();
            if (((0xA ^ 0x22 ^ (0x96 ^ 0x84)) & (0x5E ^ 0x44 ^ (0xBD ^ 0x9D) ^ -" ".length())) < 0) {
                return ((0xCC ^ 0xB8 ^ (0x5A ^ 0x18)) & (99 + 25 - 68 + 114 ^ 74 + 92 - 30 + 20 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIlllIIIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lllllllIlIllII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private AbstractMap.SimpleEntry<WorldPoint, Integer> a(AbstractMap.SimpleEntry<WorldPoint, Integer> simpleEntry, int n2, int n3) {
        void var9_9;
        int n4;
        int lllllllllllllllIlIIlIIlllIIllIIl;
        int n5;
        u lllllllllllllllIlIIlIIlllIIlllll;
        void lllllllllllllllIlIIlIIlllIIlllII;
        void lllllllllllllllIlIIlIIlllIIlllIl;
        void lllllllllllllllIlIIlIIlllIIllllI;
        if (u.lllllllIlIllll(n2) && u.lllllllIlIllll(n3)) {
            return null;
        }
        WorldPoint lllllllllllllllIlIIlIIlllIIllIll = ((WorldPoint)lllllllllllllllIlIIlIIlllIIllllI.getKey()).dx((int)lllllllllllllllIlIIlIIlllIIlllIl).dy((int)lllllllllllllllIlIIlIIlllIIlllII);
        if (!u.lllllllIlIllll(lllllllllllllllIlIIlIIlllIIlllll.n(lllllllllllllllIlIIlIIlllIIllIll) ? 1 : 0) || !u.lllllllIlIllIl(lllllllllllllllIlIIlIIlllIIlllll.l(lllllllllllllllIlIIlIIlllIIllIll) ? 1 : 0) || u.lllllllIlIllll(lllllllllllllllIlIIlIIlllIIlllll.j(lllllllllllllllIlIIlIIlllIIllIll) ? 1 : 0)) {
            return lllllllllllllllIlIIlIIlllIIllllI;
        }
        NPC lllllllllllllllIlIIlIIlllIIllIlI = lllllllllllllllIlIIlIIlllIIlllll.m(lllllllllllllllIlIIlIIlllIIllIll);
        if (u.lllllllIlIllII(lllllllllllllllIlIIlIIlllIIllIlI)) {
            n5 = (int)lllllllllllllllIlIIlIIlllIIllIlI.getWorldLocation().distanceToHypotenuse(lllllllllllllllIlIIlIIlllIIllIll);
            "".length();
            if (null != null) {
                return null;
            }
        } else {
            n5 = llIIlllIIIlI[2];
        }
        if (u.lllllllIllIIlI(lllllllllllllllIlIIlIIlllIIllIIl = n5, (Integer)lllllllllllllllIlIIlIIlllIIllllI.getValue())) {
            n4 = lllllllllllllllIlIIlIIlllIIllIIl;
            "".length();
            if ((36 + 15 - -111 + 24 ^ 159 + 55 - 166 + 142) < "   ".length()) {
                return null;
            }
        } else {
            n4 = (Integer)lllllllllllllllIlIIlIIlllIIllllI.getValue();
        }
        int lllllllllllllllIlIIlIIlllIIllIII = n4;
        AbstractMap.SimpleEntry<WorldPoint, Integer> lllllllllllllllIlIIlIIlllIIlIlll = new AbstractMap.SimpleEntry<WorldPoint, Integer>(lllllllllllllllIlIIlIIlllIIllIll, lllllllllllllllIlIIlIIlllIIllIII);
        LinkedList<AbstractMap.SimpleEntry<WorldPoint, Integer>> lllllllllllllllIlIIlIIlllIIlIllI = new LinkedList<AbstractMap.SimpleEntry<WorldPoint, Integer>>();
        lllllllllllllllIlIIlIIlllIIlIllI.add(lllllllllllllllIlIIlIIlllIIlllll.a(lllllllllllllllIlIIlIIlllIIlIlll, (int)lllllllllllllllIlIIlIIlllIIlllIl, (int)lllllllllllllllIlIIlIIlllIIlllII));
        "".length();
        if (u.lllllllIlIllll((int)lllllllllllllllIlIIlIIlllIIlllIl)) {
            lllllllllllllllIlIIlIIlllIIlIllI.add(lllllllllllllllIlIIlIIlllIIlllll.a(lllllllllllllllIlIIlIIlllIIlIlll, llIIlllIIIlI[0], (int)lllllllllllllllIlIIlIIlllIIlllII));
            "".length();
            lllllllllllllllIlIIlIIlllIIlIllI.add(lllllllllllllllIlIIlIIlllIIlllll.a(lllllllllllllllIlIIlIIlllIIlIlll, llIIlllIIIlI[5], (int)lllllllllllllllIlIIlIIlllIIlllII));
            "".length();
        }
        if (u.lllllllIlIllll((int)lllllllllllllllIlIIlIIlllIIlllII)) {
            lllllllllllllllIlIIlIIlllIIlIllI.add(lllllllllllllllIlIIlIIlllIIlllll.a(lllllllllllllllIlIIlIIlllIIlIlll, (int)lllllllllllllllIlIIlIIlllIIlllIl, llIIlllIIIlI[0]));
            "".length();
            lllllllllllllllIlIIlIIlllIIlIllI.add(lllllllllllllllIlIIlIIlllIIlllll.a(lllllllllllllllIlIIlIIlllIIlIlll, (int)lllllllllllllllIlIIlIIlllIIlllIl, llIIlllIIIlI[5]));
            "".length();
        }
        Comparator<AbstractMap.SimpleEntry> comparator = Comparator.comparingInt(AbstractMap.SimpleEntry::getValue);
        Comparator<AbstractMap.SimpleEntry> comparator2 = Comparator.comparingInt(simpleEntry2 -> (int)((WorldPoint)simpleEntry2.getKey()).distanceToHypotenuse((WorldPoint)simpleEntry.getKey()));
        Comparator<AbstractMap.SimpleEntry> comparator3 = comparator.thenComparing(comparator2);
        return var9_9.stream().filter(Objects::nonNull).max(comparator3).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(WorldPoint worldPoint) {
        void var3_3;
        void lllllllllllllllIlIIlIIllIllIlllI;
        Tile tile = Tiles.getAt((WorldPoint)worldPoint);
        if (u.lllllllIlIlIll(tile)) {
            return llIIlllIIIlI[0];
        }
        GroundObject lllllllllllllllIlIIlIIllIllIllIl = lllllllllllllllIlIIlIIllIllIlllI.getGroundObject();
        if (u.lllllllIlIlIll(lllllllllllllllIlIIlIIllIllIllIl)) {
            return llIIlllIIIlI[0];
        }
        return e.ay.contains(var3_3.getId());
    }

    private static boolean lllllllIllIlII(int n2, int n3) {
        return n2 != n3;
    }

    public NPC m(WorldPoint worldPoint) {
        return NPCs.getNearest((WorldPoint)worldPoint, nPC -> e.ax.contains(nPC.getId()));
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> bu() {
        void var3_3;
        void lllllllllllllllIlIIlIIlllllIIIII;
        h h2 = this.ba.V();
        if (u.lllllllIlIlIll(h2)) {
            return Collections.emptyList();
        }
        l lllllllllllllllIlIIlIIllllIlllll = lllllllllllllllIlIIlIIlllllIIIII.aq();
        WorldPoint lllllllllllllllIlIIlIIllllIllllI = lllllllllllllllIlIIlIIllllIlllll.aQ();
        Client lllllllllllllllIlIIlIIllllIlllIl = Static.getClient();
        Player lllllllllllllllIlIIlIIllllIlllII = lllllllllllllllIlIIlIIllllIlllIl.getLocalPlayer();
        if (u.lllllllIlIlIll(lllllllllllllllIlIIlIIllllIlllII)) {
            return Collections.emptyList();
        }
        List list = TileObjects.getAll(tileObject -> Predicates.ids((int[])e.O).test(tileObject));
        int n2 = var3_3.getX();
        int n3 = var3_3.getY();
        return list.stream().map(tileObject -> {
            void lllllllllllllllIlIIlIIllIIllllIl;
            int lllllllllllllllIlIIlIIllIIlllllI;
            void lllllllllllllllIlIIlIIllIIlllIll;
            WorldPoint worldPoint = tileObject.getWorldLocation();
            if (u.lllllllIllIIII(worldPoint.getX(), n2 + llIIlllIIIlI[3])) {
                return worldPoint.dx(llIIlllIIIlI[9]);
            }
            if (u.lllllllIllIIlI(lllllllllllllllIlIIlIIllIIlllIll.getX(), lllllllllllllllIlIIlIIllIIlllllI - llIIlllIIIlI[3])) {
                return lllllllllllllllIlIIlIIllIIlllIll.dx(llIIlllIIIlI[3]);
            }
            if (u.lllllllIllIIII(lllllllllllllllIlIIlIIllIIlllIll.getY(), (int)(lllllllllllllllIlIIlIIllIIllllIl + llIIlllIIIlI[3]))) {
                return lllllllllllllllIlIIlIIllIIlllIll.dy(llIIlllIIIlI[9]);
            }
            return worldPoint.dy(llIIlllIIIlI[3]);
        }).collect(Collectors.toList());
    }

    private static boolean lllllllIlIllll(int n2) {
        return n2 == 0;
    }
}

