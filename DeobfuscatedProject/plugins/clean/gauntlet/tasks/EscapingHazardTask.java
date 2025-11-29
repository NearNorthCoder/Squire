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
package gg.squire.gauntlet.tasks;

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
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import gg.squire.gauntlet.tasks.GauntletManager;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
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
public class EscapingHazardTask
extends GauntletTaskBase {
    
    private final  b bD;

    private static boolean lllllllIlIllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void var1;
        void var2;
        WorldPoint var3;
        WorldPoint worldPoint3 = worldPoint2;
        int n2 = llIIlllIIIlI[1];
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        linkedList.add(worldPoint2);

        while (u.lllllllIlIllll((var3 = var3.dx((int)Math.signum(var2.getX() - var3.getX())).dy((int)Math.signum(var2.getY() - var3.getY()))).equals((Object)var2) ? 1 : 0) && u.lllllllIllIIlI((int)(++var1), llIIlllIIIlI[8])) {
            void var4;
            var4.add(var3);

            return null;
        }
        linkedList.add(worldPoint);

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
        void var5;
        void var6;
        h h2 = this.ba.V();
        if (u.lllllllIlIlIll(h2)) {
            return llIIlllIIIlI[1];
        }
        l var7 = var6.aq();
        int var8 = var7.aM() + llIIlllIIIlI[4];
        int var9 = var7.aN() + llIIlllIIIlI[4];
        int var10 = var8 + llIIlllIIIlI[6];
        int var11 = var9 + llIIlllIIIlI[6];
        if (u.lllllllIllIIll(var5.getX(), var8) && u.lllllllIllIIll(var5.getY(), var9) && u.lllllllIlIlllI(var5.getX(), var10) && u.lllllllIlIlllI(var5.getY(), var11)) {
            n2 = llIIlllIIIlI[0];

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
        int var12;
        int n2;
        int var13;
        int n3;
        int var14;
        int n4;
        int var15;
        int var16;
        int n5;
        void var17;
        u var18;
        Player player = Players.getLocal();
        if (u.lllllllIlIlIll(player)) {
            return llIIlllIIIlI[1];
        }
        WorldPoint var19 = Movement.getDestination();
        NPC var20 = var18.m(var17.getWorldLocation());
        int n6 = var18.n(var17.getWorldLocation());
        if (u.lllllllIlIllII(var20)) {
            n5 = var20.getWorldLocation().distanceTo(var17.getWorldLocation());

            if ((2 & ~2 & ~((6 ^ 0xD) & ~(0xCB ^ 0xC0))) > 1) {
                return false;
            }
        } else {
            n5 = var16 = llIIlllIIIlI[2];
        }
        if (u.lllllllIlIllIl(var15 = var18.ba.h().safeBossFight())) {
            n4 = llIIlllIIIlI[3];

            if (((0x46 ^ 0x6D) & ~(0x3D ^ 0x16)) != 0) {
                return false;
            }
        } else {
            n4 = var14 = llIIlllIIIlI[4];
        }
        if (u.lllllllIlIllII(var20) && u.lllllllIlIlllI(var16, var14)) {
            n3 = llIIlllIIIlI[0];

            if ((2 ^ 6) == 0) {
                return false;
            }
        } else {
            n3 = var13 = llIIlllIIIlI[1];
        }
        if (u.lllllllIlIllll(var18.l(var17.getWorldLocation()) ? 1 : 0)) {
            n2 = llIIlllIIIlI[0];

            if (((73 + 88 - 88 + 57 ^ 5 + 42 - -43 + 70) & (28 + 55 - 16 + 63 ^ 118 + 16 - 79 + 105 ^ -1)) != 0) {
                return ((0x1F ^ 0x33 ^ (0x59 ^ 0x20)) & (108 + 133 - 195 + 209 ^ 105 + 142 - 85 + 8 ^ -1)) != 0;
            }
        } else {
            n2 = var12 = llIIlllIIIlI[1];
        }
        if (u.lllllllIlIllII(var19) && u.lllllllIlIlIll(var17.getInteracting()) && u.lllllllIlIllIl(var17.isMoving() ? 1 : 0) && u.lllllllIlIllll(var19.equals((Object)var17.getWorldLocation()) ? 1 : 0) && u.lllllllIlIllIl(var18.d(var18.c(var19, var17.getWorldLocation())) ? 1 : 0)) {
            return llIIlllIIIlI[1];
        }
        if (!u.lllllllIlIllll(var12) || u.lllllllIlIllIl(n6)) {
            int n7;
            WorldPoint var21 = var18.k(var17.getWorldLocation());
            if (!u.lllllllIlIllll(n6) || u.lllllllIllIIII(var18.bD.z(), var18.ba.X().aK() + llIIlllIIIlI[3])) {
                n7 = llIIlllIIIlI[0];

            } else {
                int var22;
                n7 = var22 = llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllII(var21) && (!u.lllllllIlIllIl(var21.equals((Object)var19) ? 1 : 0) || u.lllllllIlIllll(var17.isMoving() ? 1 : 0))) {
                ScenePoint var23 = ScenePoint.fromWorld((WorldPoint)var21);
                Movement.setDestination((int)var23.getX(), (int)var23.getY());
                return llIIlllIIIlI[0];
            }
        }
        if (u.lllllllIlIllII(var20)) {
            WorldPoint var22;
            int var21;
            int n8;
            if (u.lllllllIllIIIl(var18.ba.X().aD(), HeadIcon.RANGED) && u.lllllllIlIlIll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && u.lllllllIlIllll(var15)) {
                n8 = llIIlllIIIlI[0];

                if (-(0xA2 ^ 0xB1 ^ (0x25 ^ 0x32)) >= 0) {
                    return false;
                }
            } else {
                n8 = var21 = llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllII(var22 = var18.i(var17.getWorldLocation()))) {
                int var23 = var20.getWorldLocation().distanceTo(var22);
                if (!u.lllllllIlIllll(var13) || u.lllllllIlIllll(var21) && u.lllllllIlIllIl(var18.bD.t() ? 1 : 0) && u.lllllllIllIIII(var23, var16)) {
                    ScenePoint var24 = ScenePoint.fromWorld((WorldPoint)var22);
                    Movement.setDestination((int)var24.getX(), (int)var24.getY());
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
        void var25;
        j j2 = this.ba.X();
        if (u.lllllllIlIlIll(j2)) {
            return llIIlllIIIlI[1];
        }
        NPC var26 = var25.aI();
        if (u.lllllllIlIlIll(var26)) {
            return llIIlllIIIlI[1];
        }
        return var3_3.getWorldArea().toWorldPointList().contains(worldPoint);
    }

    private static boolean lllllllIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public EscapingHazardTask(c c2, b b2) {
        d[] dArray = new d[llIIlllIIIlI[0]];
        dArray[u.llIIlllIIIlI[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bD = b2;
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
        int var27 = llIIlllIIIlI[0];
        while (u.lllllllIlIlllI(var27, llIIlllIIIlI[7])) {
            int var28 = -var27;
            while (u.lllllllIlIlllI(var28, var27)) {
                int var29 = -var27;
                while (u.lllllllIlIlllI(var29, var27)) {
                    if (u.lllllllIllIlII(Math.abs(var28), var27) && u.lllllllIllIlII(Math.abs(var29), var27)) {

                        if (((0x7E ^ 0x5A) & ~(0x38 ^ 0x1C)) != 0) {
                            return null;
                        }
                    } else {
                        u var30;
                        void var31;
                        WorldPoint var32 = var31.dx(var28).dy(var29);
                        if (u.lllllllIlIllIl(var30.j(var32) ? 1 : 0) && u.lllllllIlIllIl(var30.l(var32) ? 1 : 0) && u.lllllllIlIllll(var30.n(var32) ? 1 : 0)) {
                            return var32;
                        }
                    }
                    ++var29;

                    if (((4 ^ 0x24) & ~(0xBB ^ 0x9B)) >= 0) continue;
                    return null;
                }
                ++var28;

                if (1 >= -1) continue;
                return null;
            }
            ++var27;

            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint i(WorldPoint worldPoint) {
        LinkedList linkedList = new LinkedList();
        int var33 = llIIlllIIIlI[5];
        while (u.lllllllIlIlllI(var33, llIIlllIIIlI[0])) {
            int var34 = llIIlllIIIlI[5];
            while (u.lllllllIlIlllI(var34, llIIlllIIIlI[0])) {
                void var35;
                u var36;
                void var37;
                var37.add(var36.a(new AbstractMap.SimpleEntry<void, Integer>(var35, llIIlllIIIlI[2]), var33, var34));

                ++var34;

                if (((175 + 25 - 143 + 136 ^ 49 + 42 - 87 + 144) & (199 + 81 - 211 + 157 ^ 45 + 154 - 22 + 6 ^ -1)) == 0) continue;
                return null;
            }
            ++var33;

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
        u var38;
        void var39;
        int n3;
        boolean bl = this.n(list.get(llIIlllIIIlI[1]));
        if (u.lllllllIlIllll(this.l(list.get(llIIlllIIIlI[1])) ? 1 : 0)) {
            n3 = llIIlllIIIlI[0];

            if (((0xFB ^ 0x94 ^ (0x64 ^ 0x11)) & (0x52 ^ 0x76 ^ (0x2E ^ 0x10) ^ -1)) >= 2) {
                return ((143 + 115 - 194 + 157 ^ 89 + 46 - 84 + 107) & (0x79 ^ 0x58 ^ (0xCC ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            n3 = llIIlllIIIlI[1];
        }
        int var40 = n3;
        Iterator var41 = var39.iterator();
        while (u.lllllllIlIllIl(var41.hasNext() ? 1 : 0)) {
            int var42;
            int n4;
            WorldPoint var43 = (WorldPoint)var41.next();
            if (u.lllllllIlIllll(var38.l(var43) ? 1 : 0)) {
                n4 = llIIlllIIIlI[0];

                if (3 <= -1) {
                    return ((8 ^ 0x5B ^ (0x19 ^ 3)) & (0xF9 ^ 0x9E ^ (0xB ^ 0x25) ^ -1)) != 0;
                }
            } else {
                n4 = llIIlllIIIlI[1];
            }
            int var44 = n4;
            int n5 = var38.n(var43);
            if (u.lllllllIlIllIl(var40) && u.lllllllIlIllll(var44)) {
                var40 = llIIlllIIIlI[1];

                if (((0x64 ^ 0x7F ^ (1 ^ 0x1E)) & (44 + 89 - 8 + 29 ^ 51 + 44 - 80 + 143 ^ -1)) != 0) {
                    return false;
                }
            } else if (u.lllllllIlIllIl(var44)) {
                return llIIlllIIIlI[1];
            }
            if (u.lllllllIlIllIl(var42) && u.lllllllIlIllll(n5)) {
                var42 = llIIlllIIIlI[1];

                }
            } else if (u.lllllllIlIllIl(n5)) {
                return llIIlllIIIlI[1];
            }

            if (1 != ((0x68 ^ 0x41) & ~(0x44 ^ 0x6D))) continue;
            return false;
        }
        if (u.lllllllIlIllll(var38.n((WorldPoint)var39.get(var39.size() - llIIlllIIIlI[0])) ? 1 : 0) && u.lllllllIlIllIl(var38.l((WorldPoint)var39.get(var39.size() - llIIlllIIIlI[0])) ? 1 : 0)) {
            n2 = llIIlllIIIlI[0];

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
        int var45;
        int n5;
        u var46;
        void var47;
        void var48;
        void var49;
        if (u.lllllllIlIllll(n2) && u.lllllllIlIllll(n3)) {
            return null;
        }
        WorldPoint var50 = ((WorldPoint)var49.getKey()).dx((int)var48).dy((int)var47);
        if (!u.lllllllIlIllll(var46.n(var50) ? 1 : 0) || !u.lllllllIlIllIl(var46.l(var50) ? 1 : 0) || u.lllllllIlIllll(var46.j(var50) ? 1 : 0)) {
            return var49;
        }
        NPC var51 = var46.m(var50);
        if (u.lllllllIlIllII(var51)) {
            n5 = (int)var51.getWorldLocation().distanceToHypotenuse(var50);

            }
        } else {
            n5 = llIIlllIIIlI[2];
        }
        if (u.lllllllIllIIlI(var45 = n5, (Integer)var49.getValue())) {
            n4 = var45;

            if ((36 + 15 - -111 + 24 ^ 159 + 55 - 166 + 142) < 3) {
                return null;
            }
        } else {
            n4 = (Integer)var49.getValue();
        }
        int var52 = n4;
        AbstractMap.SimpleEntry<WorldPoint, Integer> var53 = new AbstractMap.SimpleEntry<WorldPoint, Integer>(var50, var52);
        LinkedList<AbstractMap.SimpleEntry<WorldPoint, Integer>> var54 = new LinkedList<AbstractMap.SimpleEntry<WorldPoint, Integer>>();
        var54.add(var46.a(var53, (int)var48, (int)var47));

        if (u.lllllllIlIllll((int)var48)) {
            var54.add(var46.a(var53, llIIlllIIIlI[0], (int)var47));

            var54.add(var46.a(var53, llIIlllIIIlI[5], (int)var47));

        }
        if (u.lllllllIlIllll((int)var47)) {
            var54.add(var46.a(var53, (int)var48, llIIlllIIIlI[0]));

            var54.add(var46.a(var53, (int)var48, llIIlllIIIlI[5]));

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
        void var55;
        Tile tile = Tiles.getAt((WorldPoint)worldPoint);
        if (u.lllllllIlIlIll(tile)) {
            return llIIlllIIIlI[0];
        }
        GroundObject var56 = var55.getGroundObject();
        if (u.lllllllIlIlIll(var56)) {
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
        void var57;
        h h2 = this.ba.V();
        if (u.lllllllIlIlIll(h2)) {
            return Collections.emptyList();
        }
        l var58 = var57.aq();
        WorldPoint var59 = var58.aQ();
        Client var60 = Static.getClient();
        Player var61 = var60.getLocalPlayer();
        if (u.lllllllIlIlIll(var61)) {
            return Collections.emptyList();
        }
        List list = TileObjects.getAll(tileObject -> Predicates.ids((int[])e.O).test(tileObject));
        int n2 = var3_3.getX();
        int n3 = var3_3.getY();
        return list.stream().map(tileObject -> {
            void var62;
            int var63;
            void var64;
            WorldPoint worldPoint = tileObject.getWorldLocation();
            if (u.lllllllIllIIII(worldPoint.getX(), n2 + llIIlllIIIlI[3])) {
                return worldPoint.dx(llIIlllIIIlI[9]);
            }
            if (u.lllllllIllIIlI(var64.getX(), var63 - llIIlllIIIlI[3])) {
                return var64.dx(llIIlllIIIlI[3]);
            }
            if (u.lllllllIllIIII(var64.getY(), (int)(var62 + llIIlllIIIlI[3]))) {
                return var64.dy(llIIlllIIIlI[9]);
            }
            return worldPoint.dy(llIIlllIIIlI[3]);
        }).collect(Collectors.toList());
    }

    private static boolean lllllllIlIllll(int n2) {
        return n2 == 0;
    }
}

