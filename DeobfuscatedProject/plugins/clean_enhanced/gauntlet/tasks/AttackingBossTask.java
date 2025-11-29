/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import gg.squire.gauntlet.tasks.EscapingHazardTask;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Attacking boss", priority=4, register=true)
public class AttackingBossTask
extends GauntletTaskBase {
    private final  u bA;

    private final  b bB;
    private  boolean bC;

    /*
     * WARNING - void declaration
     */
    public WorldPoint bs() {
        void var3_3;
        l l2 = this.ba.V().aq();
        if l2 == null {
            return null;
        }
        Client var3 = Static.getClient();
        Player var4 = var3.getLocalPlayer();
        if var4 == null {
            return null;
        }
        WorldPoint worldPoint = var3_3.getWorldLocation();
        List list = TileObjects.getAll(tileObject -> Predicates.ids((int[])e.O).test(tileObject));
        Stream<List> stream = list.stream().filter(tileObject -> {
            boolean bl;
            if ((tileObject.getWorldLocation().distanceTo(worldPoint) > 4)) {
                bl = 0;
                0;
                if null != null {
                    return ((0x16 ^ 0x4E) & ~(0x55 ^ 0xD)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).map(tileObject -> this.bA.c(worldPoint, tileObject.getWorldLocation()));
        u u2 = this.bA;
        Objects.requireNonNull(u2);
        0;
        Stream stream2 = stream.filter(u2::d).flatMap(Collection::stream);
        u u3 = this.bA;
        Objects.requireNonNull(u3);
        0;
        return stream2.filter(u3::o).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(worldPoint))).orElse(null);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static  boolean c(Player player, WorldPoint worldPoint) {
        return player.getWorldLocation().equals((Object)worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint f(WorldPoint worldPoint) {
        void var11;
        t var12;
        j j2 = this.ba.X();
        if j2 == null {
            return null;
        }
        Optional<WorldPoint> var13 = var12.b(var12.br()).stream().min(Comparator.comparingDouble(arg_0 -> t.b((WorldPoint)var11, arg_0)));
        if ((var13.isEmpty( != 0) ? 1 : 0)) {
            return null;
        }
        List<WorldPoint> var14 = var12.bA.c((WorldPoint)var11, var13.get());
        if ((var12.bA.dlllllllllllllllIlIIllIIlIlIllIII)) {
            return var13.get();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Player player, NPC nPC) {
        void var4_4;
        void var15;
        void var16;
        t var17;
        if ((this.ba.X().aH() > 0)) {
            return 1;
        }
        List<WorldPoint> var18 = var17.bA.bu();
        if ((var18.stream( != 0).anyMatch(arg_0 -> t.c((Player)var16, arg_0)) ? 1 : 0)) {
            return 1;
        }
        Stream stream = var18.stream();
        u u2 = var17.bA;
        Objects.requireNonNull(u2);
        0;
        Stream<List> stream2 = stream.filter(u2::o).map(arg_0 -> var17.b((Player)var16, arg_0));
        u u3 = var17.bA;
        Objects.requireNonNull(u3);
        0;
        WorldPoint var19 = stream2.filter(u3::d).map(list -> (WorldPoint)list.get(list.size() - 0)).min(Comparator.comparing(arg_0 -> t.a((Player)var16, arg_0))).orElse(null);
        if (!var19 != null || var15 != null) {
            return 1;
        }
        ScenePoint scenePoint = ScenePoint.fromWorld((WorldPoint)var4_4);
        Movement.setDestination((int)scenePoint.getX(), (int)scenePoint.getY());
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var8_10;
        int var20;
        int n2;
        int var21;
        int n3;
        int var22;
        int n4;
        int var23;
        int lllllllllllllllIlIIllIIllIIIIlll2;
        int n5;
        void var24;
        NPC lllllllllllllllIlIIllIIllIIIlIII2;
        t var25;
        Player player = Players.getLocal();
        if player == null {
            return 1;
        }
        j var26 = var25.ba.X();
        if ((var26.aI( == null))) {
            return 1;
        }
        if (var25.bC != 0) {
            int[] nArray = new int[0];
            nArray[1] = 2;
            int lllllllllllllllIlIIllIIllIIIlIII2 = Inventory.getCount((int[])nArray);
            if ((lllllllllllllllIlIIllIIllIIIlIII2 <= var25.ba.h().abortFishAmount())) {
                TileObject lllllllllllllllIlIIllIIllIIIIlll2 = TileObjects.getNearest((int[])e.O);
                if lllllllllllllllIlIIllIIllIIIIlll2 == null {
                    return 1;
                }
                lllllllllllllllIlIIllIIllIIIIlll2.interact(var2[1]);
                return 0;
            }
            var25.bC = 1;
        }
        if ((lllllllllllllllIlIIllIIllIIIlIII2 = var25.bA.m(var24.getWorldLocation( != null)))) {
            n5 = lllllllllllllllIlIIllIIllIIIlIII2.getWorldLocation().distanceTo(var24.getWorldLocation());
            0;
            if (-3 >= 0) {
                return ((0xBE ^ 0x89) & ~(0x2D ^ 0x1A)) != 0;
            }
        } else {
            n5 = lllllllllllllllIlIIllIIllIIIIlll2 = 3;
        }
        if ((var23 = var25.ba.h( != 0).safeBossFight())) {
            n4 = 4;
            0;
            if ((0x36 ^ 0x2E ^ (0x2F ^ 0x32)) <= 0) {
                return ((0x37 ^ 0x4C ^ (0xC4 ^ 0x98)) & (45 + 172 - 109 + 70 ^ 133 + 87 - 170 + 99 ^ -1)) != 0;
            }
        } else {
            n4 = var22 = 5;
        }
        if (lllllllllllllllIlIIllIIllIIIlIII2 != null && (lllllllllllllllIlIIllIIllIIIIlll2 <= var22)) {
            n3 = 0;
            0;
            if ((0x22 ^ 0x43 ^ (0x49 ^ 0x2C)) != (63 + 36 - 95 + 145 ^ 18 + 7 - -104 + 16)) {
                return ((0x76 ^ 0x4E ^ (0x3F ^ 0x45)) & (185 + 69 - 150 + 120 ^ 82 + 94 - 97 + 83 ^ -1)) != 0;
            }
        } else {
            n3 = 1;
        }
        if (var21 = n3 != 0) {
            return 1;
        }
        NPC var27 = var25.ba.X().aI();
        if ((var25.ba.X().aD() == var25.ba.X().aD()2) && (Equipment.fromSlot(EquipmentInventorySlot == nullEquipmentInventorySlot.WEAPON))) {
            n2 = 0;
            0;
            if (1 > (0x12 ^ 0x16)) {
                return ((0xAB ^ 0x86) & ~(0x22 ^ 0xF)) != 0;
            }
        } else {
            n2 = 1;
        }
        if ((var20 = n2 != 0) && lllllllllllllllIlIIllIIllIIIlIII2 != null && var23) {
            return 1;
        }
        if var20 {
            List<WorldPoint> var28 = var25.bA.c(var24.getWorldLocation(), var27.getWorldLocation());
            u u2 = var25.bA;
            Stream stream = var28.stream();
            u u3 = var25.bA;
            Objects.requireNonNull(u3);
            0;
            if ((u2.d(stream.filter(u3::n != 0).collect(Collectors.toList())) ? 1 : 0)) {
                return var25.i(var27);
            }
            if ((var27.getWorldArea( != 0).isInMeleeDistance(var24.getWorldLocation()) ? 1 : 0)) {
                var25.i(var27);
                0;
                WorldPoint var29 = var25.bA.k(var25.bA.i(var24.getWorldLocation()));
                if (var29 != null && (Players.getLocal( == 0).isMoving() ? 1 : 0)) {
                    ScenePoint var30 = ScenePoint.fromWorld((WorldPoint)var29);
                    Movement.setDestination((int)var30.getX(), (int)var30.getY());
                }
                return 0;
            }
            WorldPoint var29 = var25.f(var24.getWorldLocation());
            if var29 == null {
                WorldPoint var30 = var25.bs();
                if (!var30 != null || (var24.isMoving( != 0) ? 1 : 0)) {
                    return 1;
                }
                ScenePoint var31 = ScenePoint.fromWorld((WorldPoint)var30);
                Movement.setDestination((int)var31.getX(), (int)var31.getY());
                return 0;
            }
            ScenePoint var30 = ScenePoint.fromWorld((WorldPoint)var29);
            Movement.setDestination((int)var30.getX(), (int)var30.getY());
            return 0;
        }
        if ((var25.bB.AttackingBossTask( != 0) ? 1 : 0)) {
            return var25.a((Player)var24, lllllllllllllllIlIIllIIllIIIlIII2);
        }
        return this.i((NPC)var8_10);
    }

    private static  double b(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceToHypotenuse(worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> g(WorldPoint worldPoint) {
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        int var32 = 7;
        while (var32 <= 0) {
            int var33 = 7;
            while (var33 <= 0) {
                void var34;
                t var35;
                void var36;
                var36.addAll(var35.a((WorldPoint)var34, var32, var33));
                0;
                ++var33;
                0;
                if (((0x99 ^ 0xBE) & ~(0x8C ^ 0xAB)) == 0) continue;
                return null;
            }
            ++var32;
            0;
            if null == null continue;
            return null;
        }
        return linkedList;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var37;
        if (((Object)this.ba.W() != (Object)this.ba.W()2)d.BOSS_FIGHT)) {
            return;
        }
        if ((Equipment.fromSlot(EquipmentInventorySlot != nullEquipmentInventorySlot.WEAPON))) {
            return;
        }
        Actor var38 = var37.getActor();
        if (!(var37.getActor( != null)) || (e.aw.contains(var38.getName( == 0)) ? 1 : 0)) {
            return;
        }
        this.bB.c(4);
    }

    public List<WorldPoint> b(List<WorldPoint> list) {
        Stream stream = list.stream();
        u u2 = this.bA;
        Objects.requireNonNull(u2);
        0;
        return stream.filter(u2::o).collect(Collectors.toList());
    }

    private static  Integer a(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo(player.getWorldLocation());
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(WorldPoint worldPoint, int n2, int n3) {
        void var5_5;
        t var39;
        void var40;
        void var41;
        void var42;
        if ((n2 == 0) && (n3 == 0)) {
            return List.of();
        }
        WorldPoint var43 = var42.dx((int)var41).dy((int)var40);
        if (!(var39.bA.n(var43 == 0) ? 1 : 0) || !(var39.bA.var44) || (var39.bA.j(var43 == 0) ? 1 : 0)) {
            return List.of(var42);
        }
        LinkedList<WorldPoint> var45 = new LinkedList<WorldPoint>(var39.a(var43, (int)var41, (int)var40));
        if (((int == 0)var41)) {
            var45.addAll(var39.a(var43, 0, (int)var40));
            0;
            var45.addAll(var39.a(var43, 7, (int)var40));
            0;
        }
        if (((int == 0)var40)) {
            var45.addAll(var39.a(var43, (int)var41, 0));
            0;
            var45.addAll(var39.a(var43, (int)var41, 7));
            0;
        }
        return var5_5;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> br() {
        void var7_7;
        void var46;
        j j2 = this.ba.X();
        if j2 == null {
            return null;
        }
        NPC var47 = var46.aI();
        if var47 == null {
            return null;
        }
        WorldArea var48 = var47.getWorldArea();
        int var49 = var48.getX();
        int var50 = var48.getY();
        int var51 = var48.getWidth();
        LinkedList<WorldPoint> var52 = new LinkedList<WorldPoint>();
        int var53 = 1;
        while (var53 < var51) {
            var52.add(new WorldPoint(var49 + var53, var50 - 0, 0));
            0;
            var52.add(new WorldPoint(var49 + var53, var50 + var51, 0));
            0;
            var52.add(new WorldPoint(var49 - 0, var50 + var53, 0));
            0;
            var52.add(new WorldPoint(var49 + var51, var50 + var53, 0));
            0;
            ++var53;
            0;
            
            return null;
        }
        return var7_7;
    }

    private static String var54(String var55, String var56) {
        var55 = new String(Base64.getDecoder().decode(var55.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var57 = new StringBuilder();
        char[] var58 = var56.toCharArray();
        int var59 = 1;
        char[] var60 = var55.toCharArray();
        int var61 = var60.length;
        int var62 = 1;
        while (var62 < var61) {
            char var63 = var60[var62];
            var57.append((char)(var63 ^ var58[var59 % var58.length]));
            0;
            ++var59;
            ++var62;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var57);
    }

    private  List b(Player player, WorldPoint worldPoint) {
        return this.bA.c(player.getWorldLocation(), worldPoint);
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor actor = projectileSpawned.getProjectile().getInteracting();
        if ((actor instanceof NPC != 0) && (actor.getName( != null)) && (e.aw.contains(actor.getName( != 0)) ? 1 : 0) && (e.aD.contains(projectileSpawned.getProjectile( != 0).getId()) ? 1 : 0)) {
            this.bB.c(4);
        }
    }

    public WorldPoint bt() {
        Player player = Players.getLocal();
        j j2 = this.ba.X();
        NPC nPC = j2.aI();
        if (!player != null || nPC == null) {
            return null;
        }
        List list = this.br().stream().flatMap(worldPoint -> this.g((WorldPoint)worldPoint).stream()).distinct().collect(Collectors.toList());
        List<WorldPoint> list2 = this.g(player.getWorldLocation());
        Stream stream = list2.stream();
        List list3 = list;
        Objects.requireNonNull(list3);
        0;
        Optional<WorldPoint> optional = stream.filter(list3::contains).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(nPC.getWorldArea()) + worldPoint.distanceTo(player.getWorldLocation())));
        return optional.orElse(list2.stream().max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(nPC.getWorldArea()))).orElse(null));
    }

    private boolean i(NPC nPC) {
        nPC.interact(var2[0]);
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        int n2;
        void var64;
        if ((varbitChanged.getVarbitId() != 6)) {
            return;
        }
        if ((var64.getValue() == 0)) {
            n2 = 0;
            0;
            if (-1 > 0) {
                return;
            }
        } else {
            n2 = 1;
        }
        var65.bC = n2;
    }

    @Inject
    public AttackingBossTask(c c2, b b2, u u2) {
        d[] dArray = new d[0];
        dArray[1] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bC = 1;
        this.bB = b2;
        this.bA = u2;
    }

}

