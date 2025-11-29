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
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.LHelper;
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

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void var2;
        void var3;
        WorldPoint var4;
        WorldPoint worldPoint3 = worldPoint2;
        int n2 = 1;
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        linkedList.add(worldPoint2);
        0;
        while (((var4 = var4.dx((int == 0)Math.signum(var3.getX() - var4.getX())).dy((int)Math.signum(var3.getY() - var4.getY()))).equals((Object)var3) ? 1 : 0) && ((int)(++var2) < 8)) {
            void var5;
            var5.add(var4);
            0;
            0;
            if null == null continue;
            return null;
        }
        linkedList.add(worldPoint);
        0;
        Collections.reverse(linkedList);
        return linkedList;
    }

    /*
     * WARNING - void declaration
     */
    public boolean j(WorldPoint worldPoint) {
        int n2;
        void var6;
        void var7;
        h h2 = this.ba.V();
        if h2 == null {
            return 1;
        }
        l var8 = var7.aq();
        int var9 = var8.aM() + 4;
        int var10 = var8.aN() + 4;
        int var11 = var9 + 6;
        int var12 = var10 + 6;
        if ((var6.getX() >= var9) && (var6.getY() >= var10) && (var6.getX() <= var11) && (var6.getY() <= var12)) {
            n2 = 0;
            0;
            if ((0xA4 ^ 0xA0) < -1) {
                return ((0x3A ^ 0x58) & ~(0x6F ^ 0xD)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        int var13;
        int n2;
        int var14;
        int n3;
        int var15;
        int n4;
        int var16;
        int var17;
        int n5;
        void var18;
        u var19;
        Player player = Players.getLocal();
        if player == null {
            return 1;
        }
        WorldPoint var20 = Movement.getDestination();
        NPC var21 = var19.m(var18.getWorldLocation());
        int n6 = var19.n(var18.getWorldLocation());
        if var21 != null {
            n5 = var21.getWorldLocation().distanceTo(var18.getWorldLocation());
            0;
            if ((2 & ~2 & ~((6 ^ 0xD) & ~(0xCB ^ 0xC0))) > 1) {
                return ((0x16 ^ 0x77) & ~(0x48 ^ 0x29)) != 0;
            }
        } else {
            n5 = var17 = 2;
        }
        if ((var16 = var19.ba.h( != 0).safeBossFight())) {
            n4 = 3;
            0;
            if (((0x46 ^ 0x6D) & ~(0x3D ^ 0x16)) != 0) {
                return ((0x79 ^ 0x62) & ~(0x22 ^ 0x39)) != 0;
            }
        } else {
            n4 = var15 = 4;
        }
        if (var21 != null && (var17 <= var15)) {
            n3 = 0;
            0;
            if ((2 ^ 6) == 0) {
                return ((0x94 ^ 0x93) & ~(0x90 ^ 0x97)) != 0;
            }
        } else {
            n3 = var14 = 1;
        }
        if ((var19.l(var18.getWorldLocation( == 0)) ? 1 : 0)) {
            n2 = 0;
            0;
            if (((73 + 88 - 88 + 57 ^ 5 + 42 - -43 + 70) & (28 + 55 - 16 + 63 ^ 118 + 16 - 79 + 105 ^ -1)) != 0) {
                return ((0x1F ^ 0x33 ^ (0x59 ^ 0x20)) & (108 + 133 - 195 + 209 ^ 105 + 142 - 85 + 8 ^ -1)) != 0;
            }
        } else {
            n2 = var13 = 1;
        }
        if (var20 != null && (var18.getInteracting( == null)) && (var18.isMoving( != 0) ? 1 : 0) && (var20.equals((Object == 0)var18.getWorldLocation()) ? 1 : 0) && (var19.d(var19.c(var20, var18.getWorldLocation( != 0))) ? 1 : 0)) {
            return 1;
        }
        if (!(var13 == 0) || n6) {
            int n7;
            WorldPoint var22 = var19.k(var18.getWorldLocation());
            if (!(n6 == 0) || (var19.bD.z() > var19.ba.X().aK() + 3)) {
                n7 = 0;
                0;
                if (-2 >= 0) {
                    return ((107 + 4 - 18 + 125 ^ 30 + 107 - 64 + 74) & (83 + 117 - 157 + 151 ^ 128 + 128 - 208 + 91 ^ -1)) != 0;
                }
            } else {
                int var23;
                n7 = var23 = 1;
            }
            if (var22 != null && (!(var22.equals(ObjectlllllllllllllllIlIIlIIllllIIlIII) ? 1 : 0) || (var18.isMoving( == 0) ? 1 : 0))) {
                ScenePoint var24 = ScenePoint.fromWorld((WorldPoint)var22);
                Movement.setDestination((int)var24.getX(), (int)var24.getY());
                return 0;
            }
        }
        if var21 != null {
            WorldPoint var23;
            int var22;
            int n8;
            if ((var19.ba.X().aD() == var19.ba.X().aD()2) && (Equipment.fromSlot(EquipmentInventorySlot == nullEquipmentInventorySlot.WEAPON)) && (var16 == 0)) {
                n8 = 0;
                0;
                if (-(0xA2 ^ 0xB1 ^ (0x25 ^ 0x32)) >= 0) {
                    return ((55 + 52 - 59 + 84 ^ 61 + 38 - 84 + 146) & (177 + 183 - 206 + 77 ^ 24 + 68 - -43 + 59 ^ -1)) != 0;
                }
            } else {
                n8 = var22 = 1;
            }
            if ((var23 = var19.i(var18.getWorldLocation( != null)))) {
                int var24 = var21.getWorldLocation().distanceTo(var23);
                if (!(var14 == 0) || (var22 == 0) && (var19.bD.t( != 0) ? 1 : 0) && (var24 > var17)) {
                    ScenePoint var25 = ScenePoint.fromWorld((WorldPoint)var23);
                    Movement.setDestination((int)var25.getX(), (int)var25.getY());
                    return 0;
                }
            }
        }
        return 1;
    }

    static {
        u.var26();
    }

    /*
     * WARNING - void declaration
     */
    public boolean n(WorldPoint worldPoint) {
        void var3_3;
        void var27;
        j j2 = this.ba.X();
        if j2 == null {
            return 1;
        }
        NPC var28 = var27.aI();
        if var28 == null {
            return 1;
        }
        return var3_3.getWorldArea().toWorldPointList().contains(worldPoint);
    }

    @Inject
    public EscapingHazardTask(c c2, b b2) {
        d[] dArray = new d[0];
        dArray[1] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bD = b2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if ((e.ax.contains(npcSpawned.getNpc( != 0).getId()) ? 1 : 0)) {
            this.bD.a(npcSpawned.getNpc());
        }
    }

    public boolean o(WorldPoint worldPoint) {
        int n2;
        if ((this.jworldPoint) && (this.lworldPoint) && (this.n(worldPoint == 0) ? 1 : 0)) {
            n2 = 0;
            0;
            if ((0x6A ^ 0x6E) < 1) {
                return ((0x26 ^ 0xE) & ~(0x66 ^ 0x4E)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint k(WorldPoint worldPoint) {
        if worldPoint == null {
            return null;
        }
        int var29 = 0;
        while (var29 <= 7) {
            int var30 = -var29;
            while (var30 <= var29) {
                int var31 = -var29;
                while (var31 <= var29) {
                    if ((Math.abs(var30) != var29) && (Math.abs(var31) != var29)) {
                        0;
                        if (((0x7E ^ 0x5A) & ~(0x38 ^ 0x1C)) != 0) {
                            return null;
                        }
                    } else {
                        u var32;
                        void var33;
                        WorldPoint var34 = var33.dx(var30).dy(var31);
                        if ((var32.jlllllllllllllllIlIIlIIllIlllIlll) && (var32.var35) && (var32.n(var34 == 0) ? 1 : 0)) {
                            return var34;
                        }
                    }
                    ++var31;
                    0;
                    
                    return null;
                }
                ++var30;
                0;
                
                return null;
            }
            ++var29;
            0;
            if null == null continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint i(WorldPoint worldPoint) {
        LinkedList linkedList = new LinkedList();
        int var36 = 5;
        while (var36 <= 0) {
            int var37 = 5;
            while (var37 <= 0) {
                void var38;
                u var39;
                void var40;
                var40.add(var39.a(new AbstractMap.SimpleEntry<void, Integer>(var38, 2), var36, var37));
                0;
                ++var37;
                0;
                if (((175 + 25 - 143 + 136 ^ 49 + 42 - 87 + 144) & (199 + 81 - 211 + 157 ^ 45 + 154 - 22 + 6 ^ -1)) == 0) continue;
                return null;
            }
            ++var36;
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
            if ((((WorldPoint == 0)simpleEntry.getKey()).equals((Object)worldPoint) ? 1 : 0)) {
                bl = 0;
                0;
                if (((21 + 49 - 42 + 185 ^ 97 + 23 - 61 + 94) & (0xC4 ^ 0x8D ^ (0x59 ^ 0x5C) ^ -1)) >= 2) {
                    return ((220 + 228 - 375 + 171 ^ 33 + 103 - -35 + 23) & (0xA ^ 0x31 ^ (0x75 ^ 0x78) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).max(comparator4).map(AbstractMap.SimpleEntry::getKey).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(List<WorldPoint> list) {
        int n2;
        u var41;
        void var42;
        int n3;
        boolean bl = this.n(list.get(1));
        if ((this.l(list.get(1 == 0)) ? 1 : 0)) {
            n3 = 0;
            0;
            if (((0xFB ^ 0x94 ^ (0x64 ^ 0x11)) & (0x52 ^ 0x76 ^ (0x2E ^ 0x10) ^ -1)) >= 2) {
                return ((143 + 115 - 194 + 157 ^ 89 + 46 - 84 + 107) & (0x79 ^ 0x58 ^ (0xCC ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            n3 = 1;
        }
        int var43 = n3;
        Iterator var44 = var42.iterator();
        while ((var44.hasNext( != 0) ? 1 : 0)) {
            int var45;
            int n4;
            WorldPoint var46 = (WorldPoint)var44.next();
            if ((var41.l(var46 == 0) ? 1 : 0)) {
                n4 = 0;
                0;
                if (3 <= -1) {
                    return ((8 ^ 0x5B ^ (0x19 ^ 3)) & (0xF9 ^ 0x9E ^ (0xB ^ 0x25) ^ -1)) != 0;
                }
            } else {
                n4 = 1;
            }
            int var47 = n4;
            int n5 = var41.n(var46);
            if (var43 && (var47 == 0)) {
                var43 = 1;
                0;
                if (((0x64 ^ 0x7F ^ (1 ^ 0x1E)) & (44 + 89 - 8 + 29 ^ 51 + 44 - 80 + 143 ^ -1)) != 0) {
                    return ((38 + 143 - 149 + 137 ^ 7 + 36 - -76 + 22) & (147 + 114 - 234 + 153 ^ 91 + 70 - 100 + 83 ^ -1)) != 0;
                }
            } else if var47 {
                return 1;
            }
            if (var45 && (n5 == 0)) {
                var45 = 1;
                0;
                if null != null {
                    return ((51 + 52 - -29 + 48 ^ 63 + 54 - -42 + 30) & (0x33 ^ 0x1C ^ (0x3C ^ 0x1A) ^ -1)) != 0;
                }
            } else if n5 {
                return 1;
            }
            0;
            if (1 != ((0x68 ^ 0x41) & ~(0x44 ^ 0x6D))) continue;
            return ((0x64 ^ 0x6F) & ~(0x94 ^ 0x9F)) != 0;
        }
        if ((var41.n((WorldPoint == 0)var42.get(var42.size() - 0)) ? 1 : 0) && (var41.l(WorldPointlllllllllllllllIlIIlIIllIlIllIll.get(var42.size() - 0)) ? 1 : 0)) {
            n2 = 0;
            0;
            if (((0xA ^ 0x22 ^ (0x96 ^ 0x84)) & (0x5E ^ 0x44 ^ (0xBD ^ 0x9D) ^ -1)) < 0) {
                return ((0xCC ^ 0xB8 ^ (0x5A ^ 0x18)) & (99 + 25 - 68 + 114 ^ 74 + 92 - 30 + 20 ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private AbstractMap.SimpleEntry<WorldPoint, Integer> a(AbstractMap.SimpleEntry<WorldPoint, Integer> simpleEntry, int n2, int n3) {
        void var9_9;
        int n4;
        int var48;
        int n5;
        u var49;
        void var50;
        void var51;
        void var52;
        if ((n2 == 0) && (n3 == 0)) {
            return null;
        }
        WorldPoint var53 = ((WorldPoint)var52.getKey()).dx((int)var51).dy((int)var50);
        if (!(var49.n(var53 == 0) ? 1 : 0) || !(var49.var54) || (var49.j(var53 == 0) ? 1 : 0)) {
            return var52;
        }
        NPC var55 = var49.m(var53);
        if var55 != null {
            n5 = (int)var55.getWorldLocation().distanceToHypotenuse(var53);
            0;
            if null != null {
                return null;
            }
        } else {
            n5 = 2;
        }
        if ((var48 = n5 < (Integer)var52.getValue())) {
            n4 = var48;
            0;
            if ((36 + 15 - -111 + 24 ^ 159 + 55 - 166 + 142) < 3) {
                return null;
            }
        } else {
            n4 = (Integer)var52.getValue();
        }
        int var56 = n4;
        AbstractMap.SimpleEntry<WorldPoint, Integer> var57 = new AbstractMap.SimpleEntry<WorldPoint, Integer>(var53, var56);
        LinkedList<AbstractMap.SimpleEntry<WorldPoint, Integer>> var58 = new LinkedList<AbstractMap.SimpleEntry<WorldPoint, Integer>>();
        var58.add(var49.a(var57, (int)var51, (int)var50));
        0;
        if (((int == 0)var51)) {
            var58.add(var49.a(var57, 0, (int)var50));
            0;
            var58.add(var49.a(var57, 5, (int)var50));
            0;
        }
        if (((int == 0)var50)) {
            var58.add(var49.a(var57, (int)var51, 0));
            0;
            var58.add(var49.a(var57, (int)var51, 5));
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
        void var59;
        Tile tile = Tiles.getAt((WorldPoint)worldPoint);
        if tile == null {
            return 0;
        }
        GroundObject var60 = var59.getGroundObject();
        if var60 == null {
            return 0;
        }
        return e.ay.contains(var3_3.getId());
    }

    public NPC m(WorldPoint worldPoint) {
        return NPCs.getNearest((WorldPoint)worldPoint, nPC -> e.ax.contains(nPC.getId()));
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> bu() {
        void var3_3;
        void var61;
        h h2 = this.ba.V();
        if h2 == null {
            return Collections.emptyList();
        }
        l var62 = var61.aq();
        WorldPoint var63 = var62.aQ();
        Client var64 = Static.getClient();
        Player var65 = var64.getLocalPlayer();
        if var65 == null {
            return Collections.emptyList();
        }
        List list = TileObjects.getAll(tileObject -> Predicates.ids((int[])e.O).test(tileObject));
        int n2 = var3_3.getX();
        int n3 = var3_3.getY();
        return list.stream().map(tileObject -> {
            void var66;
            int var67;
            void var68;
            WorldPoint worldPoint = tileObject.getWorldLocation();
            if ((worldPoint.getX() > n2 + 3)) {
                return worldPoint.dx(9);
            }
            if ((var68.getX() < var67 - 3)) {
                return var68.dx(3);
            }
            if ((var68.getY() > (int)(var66 + 3))) {
                return var68.dy(9);
            }
            return worldPoint.dy(3);
        }).collect(Collectors.toList());
    }

}

