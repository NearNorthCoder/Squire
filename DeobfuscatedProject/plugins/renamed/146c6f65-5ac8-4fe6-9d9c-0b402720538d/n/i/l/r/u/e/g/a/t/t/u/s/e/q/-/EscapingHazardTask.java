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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.j_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
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

/* TASK: Escaping hazard -> EscapinghazardTask */
@TaskDesc(name="Escaping hazard", priority=8)
@Singleton
public class EscapingHazardTask
extends n_Unknown {
    private static /* synthetic */ int[] llIIlllIIIlI;
    private final /* synthetic */ b bD;

    private static boolean lllllllIlIllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void var3;
        void var38;
        WorldPoint var60;
        WorldPoint worldPoint3 = worldPoint2;
        int n2 = llIIlllIIIlI[1];
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        linkedList.add(worldPoint2);
        0;
        while (u.lllllllIlIllll((var60 = var60.dx((int)Math.signum(var38.getX() - var60.getX())).dy((int)Math.signum(var38.getY() - var60.getY()))).equals((Object)var38) ? 1 : 0) && u.lllllllIllIIlI((int)(++var3), llIIlllIIIlI[8])) {
            void var1;
            var1.add(var60);
            0;
            0;
            
            return null;
        }
        linkedList.add(worldPoint);
        0;
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
        void var13;
        void var15;
        h h2 = this.ba.V();
        if (u.lllllllIlIlIll(h2)) {
            return llIIlllIIIlI[1];
        }
        l var40 = var15.aq();
        int var4 = var40.aM() + llIIlllIIIlI[4];
        int var39 = var40.aN() + llIIlllIIIlI[4];
        int var30 = var4 + llIIlllIIIlI[6];
        int var53 = var39 + llIIlllIIIlI[6];
        if (u.lllllllIllIIll(var13.getX(), var4) && u.lllllllIllIIll(var13.getY(), var39) && u.lllllllIlIlllI(var13.getX(), var30) && u.lllllllIlIlllI(var13.getY(), var53)) {
            n2 = llIIlllIIIlI[0];
            0;
            if ((0xA4 ^ 0xA0) < -1) {
                return false;
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
        int var33;
        int n2;
        int var62;
        int n3;
        int var45;
        int n4;
        int var16;
        int var2;
        int n5;
        void var19;
        u var56;
        Player player = Players.getLocal();
        if (u.lllllllIlIlIll(player)) {
            return llIIlllIIIlI[1];
        }
        WorldPoint var50 = Movement.getDestination();
        NPC var41 = var56.m(var19.getWorldLocation());
        int n6 = var56.n(var19.getWorldLocation());
        if (u.lllllllIlIllII(var41)) {
            n5 = var41.getWorldLocation().distanceTo(var19.getWorldLocation());
            0;
            if ((2 & ~2 & ~((6 ^ 0xD) & ~(0xCB ^ 0xC0))) > 1) {
                return false;
            }
        } else {
            n5 = var2 = llIIlllIIIlI[2];
        }
        if (u.lllllllIlIllIl(var16 = var56.ba.h().safeBossFight())) {
            n4 = llIIlllIIIlI[3];
            0;
            if (((0x46 ^ 0x6D) & ~(0x3D ^ 0x16)) != 0) {
                return false;
            }
        } else {
            n4 = var45 = llIIlllIIIlI[4];
        }
        if (u.lllllllIlIllII(var41) && u.lllllllIlIlllI(var2, var45)) {
            n3 = llIIlllIIIlI[0];
            0;
            if ((2 ^ 6) == 0) {
                return false;
            }
        } else {
            n3 = var62 = llIIlllIIIlI[1];
        }
        if (u.lllllllIlIllll(var56.l(var19.getWorldLocation()) ? 1 : 0)) {
            n2 = llIIlllIIIlI[0];
            0;
            if (((73 + 88 - 88 + 57 ^ 5 + 42 - -43 + 70) & (28 + 55 - 16 + 63 ^ 118 + 16 - 79 + 105 ^ -1)) != 0) {
                return ((0x1F ^ 0x33 ^ (0x59 ^ 0x20)) & (108 + 133 - 195 + 209 ^ 105 + 142 - 85 + 8 ^ -1)) != 0;
            }
        } else {
            n2 = var33 = llIIlllIIIlI[1];
        }
        if (u.lllllllIlIllII(var50) && u.lllllllIlIlIll(var19.getInteracting()) && u.lllllllIlIllIl(var19.isMoving() ? 1 : 0) && u.lllllllIlIllll(var50.equals((Object)var19.getWorldLocation()) ? 1 : 0) && u.lllllllIlIllIl(var56.d(var56.c(var50, var19.getWorldLocation())) ? 1 : 0)) {
            return llIIlllIIIlI[1];
        }
        if (!u.lllllllIlIllll(var33) || u.lllllllIlIllIl(n6)) {
            int n7;
            WorldPoint var27 = var56.k(var19.getWorldLocation());
            if (!u.lllllllIlIllll(n6) || u.lllllllIllIIII(var56.bD.z(), var56.ba.X().aK() + llIIlllIIIlI[3])) {
                n7 = llIIlllIIIlI[0];
                0;
                if (-2 >= 0) {
                    return false;
                }
            } else {
                int var23;
                n7 = var23 = llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllII(var27) && (!u.lllllllIlIllIl(var27.equals((Object)var50) ? 1 : 0) || u.lllllllIlIllll(var19.isMoving() ? 1 : 0))) {
                ScenePoint var59 = ScenePoint.fromWorld((WorldPoint)var27);
                Movement.setDestination((int)var59.getX(), (int)var59.getY());
                return llIIlllIIIlI[0];
            }
        }
        if (u.lllllllIlIllII(var41)) {
            WorldPoint var23;
            int var27;
            int n8;
            if (u.lllllllIllIIIl(var56.ba.X().aD(), HeadIcon.RANGED) && u.lllllllIlIlIll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && u.lllllllIlIllll(var16)) {
                n8 = llIIlllIIIlI[0];
                0;
                if (-(0xA2 ^ 0xB1 ^ (0x25 ^ 0x32)) >= 0) {
                    return false;
                }
            } else {
                n8 = var27 = llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllII(var23 = var56.i(var19.getWorldLocation()))) {
                int var59 = var41.getWorldLocation().distanceTo(var23);
                if (!u.lllllllIlIllll(var62) || u.lllllllIlIllll(var27) && u.lllllllIlIllIl(var56.bD.t() ? 1 : 0) && u.lllllllIllIIII(var59, var2)) {
                    ScenePoint var28 = ScenePoint.fromWorld((WorldPoint)var23);
                    Movement.setDestination((int)var28.getX(), (int)var28.getY());
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
        void var42;
        j j2 = this.ba.X();
        if (u.lllllllIlIlIll(j2)) {
            return llIIlllIIIlI[1];
        }
        NPC var7 = var42.aI();
        if (u.lllllllIlIlIll(var7)) {
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
        u.llIIlllIIIlI[0] = 1;
        u.llIIlllIIIlI[1] = (0x93 ^ 0xB7) & ~(0x33 ^ 0x17);
        u.llIIlllIIIlI[2] = 0xFFFFBBE7 & 0x47FF;
        u.llIIlllIIIlI[3] = 3;
        u.llIIlllIIIlI[4] = 2;
        u.llIIlllIIIlI[5] = -1;
        u.llIIlllIIIlI[6] = 0x1A ^ 0x11;
        u.llIIlllIIIlI[7] = 0x48 ^ 0x28 ^ (0x47 ^ 0x2B);
        u.llIIlllIIIlI[8] = 53 + 143 - -4 + 1 ^ 118 + 116 - 120 + 59;
        u.llIIlllIIIlI[9] = -3;
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
            0;
            if ((0x6A ^ 0x6E) < 1) {
                return false;
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
        int var63 = llIIlllIIIlI[0];
        while (u.lllllllIlIlllI(var63, llIIlllIIIlI[7])) {
            int var48 = -var63;
            while (u.lllllllIlIlllI(var48, var63)) {
                int var61 = -var63;
                while (u.lllllllIlIlllI(var61, var63)) {
                    if (u.lllllllIllIlII(Math.abs(var48), var63) && u.lllllllIllIlII(Math.abs(var61), var63)) {
                        0;
                        if (((0x7E ^ 0x5A) & ~(0x38 ^ 0x1C)) != 0) {
                            return null;
                        }
                    } else {
                        u var44;
                        void var35;
                        WorldPoint var17 = var35.dx(var48).dy(var61);
                        if (u.lllllllIlIllIl(var44.j(var17) ? 1 : 0) && u.lllllllIlIllIl(var44.l(var17) ? 1 : 0) && u.lllllllIlIllll(var44.n(var17) ? 1 : 0)) {
                            return var17;
                        }
                    }
                    ++var61;
                    0;
                    if (((4 ^ 0x24) & ~(0xBB ^ 0x9B)) >= 0) continue;
                    return null;
                }
                ++var48;
                0;
                if (1 >= -1) continue;
                return null;
            }
            ++var63;
            0;
            
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint i(WorldPoint worldPoint) {
        LinkedList linkedList = new LinkedList();
        int var49 = llIIlllIIIlI[5];
        while (u.lllllllIlIlllI(var49, llIIlllIIIlI[0])) {
            int var54 = llIIlllIIIlI[5];
            while (u.lllllllIlIlllI(var54, llIIlllIIIlI[0])) {
                void var12;
                u var43;
                void var34;
                var34.add(var43.a(new AbstractMap.SimpleEntry<void, Integer>(var12, llIIlllIIIlI[2]), var49, var54));
                0;
                ++var54;
                0;
                if (((175 + 25 - 143 + 136 ^ 49 + 42 - 87 + 144) & (199 + 81 - 211 + 157 ^ 45 + 154 - 22 + 6 ^ -1)) == 0) continue;
                return null;
            }
            ++var49;
            0;
            if (-3 <= 0) continue;
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
                0;
                if (((21 + 49 - 42 + 185 ^ 97 + 23 - 61 + 94) & (0xC4 ^ 0x8D ^ (0x59 ^ 0x5C) ^ -1)) >= 2) {
                    return ((220 + 228 - 375 + 171 ^ 33 + 103 - -35 + 23) & (0xA ^ 0x31 ^ (0x75 ^ 0x78) ^ -1)) != 0;
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
        u var21;
        void var37;
        int n3;
        boolean bl = this.n(list.get(llIIlllIIIlI[1]));
        if (u.lllllllIlIllll(this.l(list.get(llIIlllIIIlI[1])) ? 1 : 0)) {
            n3 = llIIlllIIIlI[0];
            0;
            if (((0xFB ^ 0x94 ^ (0x64 ^ 0x11)) & (0x52 ^ 0x76 ^ (0x2E ^ 0x10) ^ -1)) >= 2) {
                return ((143 + 115 - 194 + 157 ^ 89 + 46 - 84 + 107) & (0x79 ^ 0x58 ^ (0xCC ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            n3 = llIIlllIIIlI[1];
        }
        int var8 = n3;
        Iterator var11 = var37.iterator();
        while (u.lllllllIlIllIl(var11.hasNext() ? 1 : 0)) {
            int var55;
            int n4;
            WorldPoint var57 = (WorldPoint)var11.next();
            if (u.lllllllIlIllll(var21.l(var57) ? 1 : 0)) {
                n4 = llIIlllIIIlI[0];
                0;
                if (3 <= -1) {
                    return ((8 ^ 0x5B ^ (0x19 ^ 3)) & (0xF9 ^ 0x9E ^ (0xB ^ 0x25) ^ -1)) != 0;
                }
            } else {
                n4 = llIIlllIIIlI[1];
            }
            int var14 = n4;
            int n5 = var21.n(var57);
            if (u.lllllllIlIllIl(var8) && u.lllllllIlIllll(var14)) {
                var8 = llIIlllIIIlI[1];
                0;
                if (((0x64 ^ 0x7F ^ (1 ^ 0x1E)) & (44 + 89 - 8 + 29 ^ 51 + 44 - 80 + 143 ^ -1)) != 0) {
                    return false;
                }
            } else if (u.lllllllIlIllIl(var14)) {
                return llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllIl(var55) && u.lllllllIlIllll(n5)) {
                var55 = llIIlllIIIlI[1];
                0;
                
                }
            } else if (u.lllllllIlIllIl(n5)) {
                return llIIlllIIIlI[1];
            }
            0;
            if (1 != ((0x68 ^ 0x41) & ~(0x44 ^ 0x6D))) continue;
            return false;
        }
        if (u.lllllllIlIllll(var21.n((WorldPoint)var37.get(var37.size() - llIIlllIIIlI[0])) ? 1 : 0) && u.lllllllIlIllIl(var21.l((WorldPoint)var37.get(var37.size() - llIIlllIIIlI[0])) ? 1 : 0)) {
            n2 = llIIlllIIIlI[0];
            0;
            if (((0xA ^ 0x22 ^ (0x96 ^ 0x84)) & (0x5E ^ 0x44 ^ (0xBD ^ 0x9D) ^ -1)) < 0) {
                return ((0xCC ^ 0xB8 ^ (0x5A ^ 0x18)) & (99 + 25 - 68 + 114 ^ 74 + 92 - 30 + 20 ^ -1)) != 0;
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
        int var24;
        int n5;
        u var25;
        void var22;
        void var52;
        void var36;
        if (u.lllllllIlIllll(n2) && u.lllllllIlIllll(n3)) {
            return null;
        }
        WorldPoint var58 = ((WorldPoint)var36.getKey()).dx((int)var52).dy((int)var22);
        if (!u.lllllllIlIllll(var25.n(var58) ? 1 : 0) || !u.lllllllIlIllIl(var25.l(var58) ? 1 : 0) || u.lllllllIlIllll(var25.j(var58) ? 1 : 0)) {
            return var36;
        }
        NPC var51 = var25.m(var58);
        if (u.lllllllIlIllII(var51)) {
            n5 = (int)var51.getWorldLocation().distanceToHypotenuse(var58);
            0;
            
            }
        } else {
            n5 = llIIlllIIIlI[2];
        }
        if (u.lllllllIllIIlI(var24 = n5, (Integer)var36.getValue())) {
            n4 = var24;
            0;
            if ((36 + 15 - -111 + 24 ^ 159 + 55 - 166 + 142) < 3) {
                return null;
            }
        } else {
            n4 = (Integer)var36.getValue();
        }
        int var46 = n4;
        AbstractMap.SimpleEntry<WorldPoint, Integer> var29 = new AbstractMap.SimpleEntry<WorldPoint, Integer>(var58, var46);
        LinkedList<AbstractMap.SimpleEntry<WorldPoint, Integer>> var5 = new LinkedList<AbstractMap.SimpleEntry<WorldPoint, Integer>>();
        var5.add(var25.a(var29, (int)var52, (int)var22));
        0;
        if (u.lllllllIlIllll((int)var52)) {
            var5.add(var25.a(var29, llIIlllIIIlI[0], (int)var22));
            0;
            var5.add(var25.a(var29, llIIlllIIIlI[5], (int)var22));
            0;
        }
        if (u.lllllllIlIllll((int)var22)) {
            var5.add(var25.a(var29, (int)var52, llIIlllIIIlI[0]));
            0;
            var5.add(var25.a(var29, (int)var52, llIIlllIIIlI[5]));
            0;
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
        void var9;
        Tile tile = Tiles.getAt((WorldPoint)worldPoint);
        if (u.lllllllIlIlIll(tile)) {
            return llIIlllIIIlI[0];
        }
        GroundObject var10 = var9.getGroundObject();
        if (u.lllllllIlIlIll(var10)) {
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
        void var18;
        h h2 = this.ba.V();
        if (u.lllllllIlIlIll(h2)) {
            return Collections.emptyList();
        }
        l var20 = var18.aq();
        WorldPoint lllllllllllllllIlIIlIIllllIllllI = var20.aQ();
        Client var26 = Static.getClient();
        Player var31 = var26.getLocalPlayer();
        if (u.lllllllIlIlIll(var31)) {
            return Collections.emptyList();
        }
        List list = TileObjects.getAll(tileObject -> Predicates.ids((int[])e.O).test(tileObject));
        int n2 = var3_3.getX();
        int n3 = var3_3.getY();
        return list.stream().map(tileObject -> {
            void var47;
            int var32;
            void var6;
            WorldPoint worldPoint = tileObject.getWorldLocation();
            if (u.lllllllIllIIII(worldPoint.getX(), n2 + llIIlllIIIlI[3])) {
                return worldPoint.dx(llIIlllIIIlI[9]);
            }
            if (u.lllllllIllIIlI(var6.getX(), var32 - llIIlllIIIlI[3])) {
                return var6.dx(llIIlllIIIlI[3]);
            }
            if (u.lllllllIllIIII(var6.getY(), (int)(var47 + llIIlllIIIlI[3]))) {
                return var6.dy(llIIlllIIIlI[9]);
            }
            return worldPoint.dy(llIIlllIIIlI[3]);
        }).collect(Collectors.toList());
    }

    private static boolean lllllllIlIllll(int n2) {
        return n2 == 0;
    }
}

