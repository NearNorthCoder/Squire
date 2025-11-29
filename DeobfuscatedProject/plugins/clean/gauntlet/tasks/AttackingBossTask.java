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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GauntletManager;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
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

    private static void lllllIlllIllIl() {
        llIIlIllIllI = new String[llIIlIllIlll[5]];
        t.llIIlIllIllI[t.llIIlIllIlll[1]] = "Escape";
        t.llIIlIllIllI[t.llIIlIllIlll[0]] = "Attack";
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint bs() {
        void var3_3;
        l l2 = this.ba.V().aq();
        if (t.lllllIlllIllll(l2)) {
            return null;
        }
        Client var1 = Static.getClient();
        Player var2 = var1.getLocalPlayer();
        if (t.lllllIlllIllll(var2)) {
            return null;
        }
        WorldPoint worldPoint = var3_3.getWorldLocation();
        List list = TileObjects.getAll(tileObject -> Predicates.ids((int[])e.O).test(tileObject));
        Stream<List> stream = list.stream().filter(tileObject -> {
            boolean bl;
            if (t.lllllIllllIlIl(tileObject.getWorldLocation().distanceTo(worldPoint), llIIlIllIlll[4])) {
                bl = llIIlIllIlll[0];

                }
            } else {
                bl = llIIlIllIlll[1];
            }
            return bl;
        }).map(tileObject -> this.bA.c(worldPoint, tileObject.getWorldLocation()));
        u u2 = this.bA;
        Objects.requireNonNull(u2);

        Stream stream2 = stream.filter(u2::d).flatMap(Collection::stream);
        u u3 = this.bA;
        Objects.requireNonNull(u3);

        return stream2.filter(u3::o).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(worldPoint))).orElse(null);
    }

    private static boolean lllllIlllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIllllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllIllllIIII(int n2) {
        return n2 != 0;
    }

    private static  boolean c(Player player, WorldPoint worldPoint) {
        return player.getWorldLocation().equals((Object)worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint f(WorldPoint worldPoint) {
        void var3;
        t var4;
        j j2 = this.ba.X();
        if (t.lllllIlllIllll(j2)) {
            return null;
        }
        Optional<WorldPoint> var5 = var4.b(var4.br()).stream().min(Comparator.comparingDouble(arg_0 -> t.b((WorldPoint)var3, arg_0)));
        if (t.lllllIllllIIII(var5.isEmpty() ? 1 : 0)) {
            return null;
        }
        List<WorldPoint> var6 = var4.bA.c((WorldPoint)var3, var5.get());
        if (t.lllllIllllIIII(var4.bA.d(var6) ? 1 : 0)) {
            return var5.get();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Player player, NPC nPC) {
        void var4_4;
        void var7;
        void var8;
        t var9;
        if (t.lllllIllllIlIl(this.ba.X().aH(), llIIlIllIlll[0])) {
            return llIIlIllIlll[1];
        }
        List<WorldPoint> var10 = var9.bA.bu();
        if (t.lllllIllllIIII(var10.stream().anyMatch(arg_0 -> t.c((Player)var8, arg_0)) ? 1 : 0)) {
            return llIIlIllIlll[1];
        }
        Stream stream = var10.stream();
        u u2 = var9.bA;
        Objects.requireNonNull(u2);

        Stream<List> stream2 = stream.filter(u2::o).map(arg_0 -> var9.b((Player)var8, arg_0));
        u u3 = var9.bA;
        Objects.requireNonNull(u3);

        WorldPoint var11 = stream2.filter(u3::d).map(list -> (WorldPoint)list.get(list.size() - llIIlIllIlll[0])).min(Comparator.comparing(arg_0 -> t.a((Player)var8, arg_0))).orElse(null);
        if (!t.lllllIllllIIlI(var11) || t.lllllIllllIIlI(var7)) {
            return llIIlIllIlll[1];
        }
        ScenePoint scenePoint = ScenePoint.fromWorld((WorldPoint)var4_4);
        Movement.setDestination((int)scenePoint.getX(), (int)scenePoint.getY());
        return llIIlIllIlll[0];
    }

    private static boolean lllllIlllIllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var8_10;
        int var12;
        int n2;
        int var13;
        int n3;
        int var14;
        int n4;
        int var15;
        int lllllllllllllllIlIIllIIllIIIIlll2;
        int n5;
        void var16;
        NPC lllllllllllllllIlIIllIIllIIIlIII2;
        t var17;
        Player player = Players.getLocal();
        if (t.lllllIlllIllll(player)) {
            return llIIlIllIlll[1];
        }
        j var18 = var17.ba.X();
        if (t.lllllIlllIllll(var18.aI())) {
            return llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(var17.bC ? 1 : 0)) {
            int[] nArray = new int[llIIlIllIlll[0]];
            nArray[t.llIIlIllIlll[1]] = llIIlIllIlll[2];
            int lllllllllllllllIlIIllIIllIIIlIII2 = Inventory.getCount((int[])nArray);
            if (t.lllllIllllIIIl(lllllllllllllllIlIIllIIllIIIlIII2, var17.ba.h().abortFishAmount())) {
                TileObject lllllllllllllllIlIIllIIllIIIIlll2 = TileObjects.getNearest((int[])e.O);
                if (t.lllllIlllIllll(lllllllllllllllIlIIllIIllIIIIlll2)) {
                    return llIIlIllIlll[1];
                }
                lllllllllllllllIlIIllIIllIIIIlll2.interact(llIIlIllIllI[llIIlIllIlll[1]]);
                return llIIlIllIlll[0];
            }
            var17.bC = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2 = var17.bA.m(var16.getWorldLocation()))) {
            n5 = lllllllllllllllIlIIllIIllIIIlIII2.getWorldLocation().distanceTo(var16.getWorldLocation());

        } else {
            n5 = lllllllllllllllIlIIllIIllIIIIlll2 = llIIlIllIlll[3];
        }
        if (t.lllllIllllIIII(var15 = var17.ba.h().safeBossFight())) {
            n4 = llIIlIllIlll[4];

            if ((0x36 ^ 0x2E ^ (0x2F ^ 0x32)) <= 0) {
                return ((0x37 ^ 0x4C ^ (0xC4 ^ 0x98)) & (45 + 172 - 109 + 70 ^ 133 + 87 - 170 + 99 ^ -1)) != 0;
            }
        } else {
            n4 = var14 = llIIlIllIlll[5];
        }
        if (t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2) && t.lllllIllllIIIl(lllllllllllllllIlIIllIIllIIIIlll2, var14)) {
            n3 = llIIlIllIlll[0];

            if ((0x22 ^ 0x43 ^ (0x49 ^ 0x2C)) != (63 + 36 - 95 + 145 ^ 18 + 7 - -104 + 16)) {
                return ((0x76 ^ 0x4E ^ (0x3F ^ 0x45)) & (185 + 69 - 150 + 120 ^ 82 + 94 - 97 + 83 ^ -1)) != 0;
            }
        } else {
            n3 = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(var13 = n3)) {
            return llIIlIllIlll[1];
        }
        NPC var19 = var17.ba.X().aI();
        if (t.lllllIllllIIll(var17.ba.X().aD(), HeadIcon.RANGED) && t.lllllIlllIllll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON))) {
            n2 = llIIlIllIlll[0];

            if (1 > (0x12 ^ 0x16)) {
                return false;
            }
        } else {
            n2 = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(var12 = n2) && t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2) && t.lllllIllllIIII(var15)) {
            return llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(var12)) {
            List<WorldPoint> var20 = var17.bA.c(var16.getWorldLocation(), var19.getWorldLocation());
            u u2 = var17.bA;
            Stream stream = var20.stream();
            u u3 = var17.bA;
            Objects.requireNonNull(u3);

            if (t.lllllIllllIIII(u2.d(stream.filter(u3::n).collect(Collectors.toList())) ? 1 : 0)) {
                return var17.i(var19);
            }
            if (t.lllllIllllIIII(var19.getWorldArea().isInMeleeDistance(var16.getWorldLocation()) ? 1 : 0)) {
                var17.i(var19);

                WorldPoint var21 = var17.bA.k(var17.bA.i(var16.getWorldLocation()));
                if (t.lllllIllllIIlI(var21) && t.lllllIllllIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                    ScenePoint var22 = ScenePoint.fromWorld((WorldPoint)var21);
                    Movement.setDestination((int)var22.getX(), (int)var22.getY());
                }
                return llIIlIllIlll[0];
            }
            WorldPoint var21 = var17.f(var16.getWorldLocation());
            if (t.lllllIlllIllll(var21)) {
                WorldPoint var22 = var17.bs();
                if (!t.lllllIllllIIlI(var22) || t.lllllIllllIIII(var16.isMoving() ? 1 : 0)) {
                    return llIIlIllIlll[1];
                }
                ScenePoint var23 = ScenePoint.fromWorld((WorldPoint)var22);
                Movement.setDestination((int)var23.getX(), (int)var23.getY());
                return llIIlIllIlll[0];
            }
            ScenePoint var22 = ScenePoint.fromWorld((WorldPoint)var21);
            Movement.setDestination((int)var22.getX(), (int)var22.getY());
            return llIIlIllIlll[0];
        }
        if (t.lllllIllllIIII(var17.bB.AttackingBossTask() ? 1 : 0)) {
            return var17.a((Player)var16, lllllllllllllllIlIIllIIllIIIlIII2);
        }
        return this.i((NPC)var8_10);
    }

    private static boolean lllllIllllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static  double b(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceToHypotenuse(worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> g(WorldPoint worldPoint) {
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        int var24 = llIIlIllIlll[7];
        while (t.lllllIllllIIIl(var24, llIIlIllIlll[0])) {
            int var25 = llIIlIllIlll[7];
            while (t.lllllIllllIIIl(var25, llIIlIllIlll[0])) {
                void var26;
                t var27;
                void var28;
                var28.addAll(var27.a((WorldPoint)var26, var24, var25));

                ++var25;

                if (((0x99 ^ 0xBE) & ~(0x8C ^ 0xAB)) == 0) continue;
                return null;
            }
            ++var24;

            return null;
        }
        return linkedList;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var29;
        if (t.lllllIlllllIII((Object)this.ba.W(), (Object)d.BOSS_FIGHT)) {
            return;
        }
        if (t.lllllIllllIIlI(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON))) {
            return;
        }
        Actor var30 = var29.getActor();
        if (!t.lllllIllllIIlI(var29.getActor()) || t.lllllIllllIlII(e.aw.contains(var30.getName()) ? 1 : 0)) {
            return;
        }
        this.bB.c(llIIlIllIlll[4]);
    }

    public List<WorldPoint> b(List<WorldPoint> list) {
        Stream stream = list.stream();
        u u2 = this.bA;
        Objects.requireNonNull(u2);

        return stream.filter(u2::o).collect(Collectors.toList());
    }

    private static boolean lllllIllllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIllllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static  Integer a(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo(player.getWorldLocation());
    }

    static {
        t.lllllIlllIlllI();
        t.lllllIlllIllIl();
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(WorldPoint worldPoint, int n2, int n3) {
        void var5_5;
        t var31;
        void var32;
        void var33;
        void var34;
        if (t.lllllIllllIlII(n2) && t.lllllIllllIlII(n3)) {
            return List.of();
        }
        WorldPoint var35 = var34.dx((int)var33).dy((int)var32);
        if (!t.lllllIllllIlII(var31.bA.n(var35) ? 1 : 0) || !t.lllllIllllIIII(var31.bA.l(var35) ? 1 : 0) || t.lllllIllllIlII(var31.bA.j(var35) ? 1 : 0)) {
            return List.of(var34);
        }
        LinkedList<WorldPoint> var36 = new LinkedList<WorldPoint>(var31.a(var35, (int)var33, (int)var32));
        if (t.lllllIllllIlII((int)var33)) {
            var36.addAll(var31.a(var35, llIIlIllIlll[0], (int)var32));

            var36.addAll(var31.a(var35, llIIlIllIlll[7], (int)var32));

        }
        if (t.lllllIllllIlII((int)var32)) {
            var36.addAll(var31.a(var35, (int)var33, llIIlIllIlll[0]));

            var36.addAll(var31.a(var35, (int)var33, llIIlIllIlll[7]));

        }
        return var5_5;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> br() {
        void var7_7;
        void var37;
        j j2 = this.ba.X();
        if (t.lllllIlllIllll(j2)) {
            return null;
        }
        NPC var38 = var37.aI();
        if (t.lllllIlllIllll(var38)) {
            return null;
        }
        WorldArea var39 = var38.getWorldArea();
        int var40 = var39.getX();
        int var41 = var39.getY();
        int var42 = var39.getWidth();
        LinkedList<WorldPoint> var43 = new LinkedList<WorldPoint>();
        int var44 = llIIlIllIlll[1];
        while (t.lllllIlllllIIl(var44, var42)) {
            var43.add(new WorldPoint(var40 + var44, var41 - llIIlIllIlll[0], llIIlIllIlll[0]));

            var43.add(new WorldPoint(var40 + var44, var41 + var42, llIIlIllIlll[0]));

            var43.add(new WorldPoint(var40 - llIIlIllIlll[0], var41 + var44, llIIlIllIlll[0]));

            var43.add(new WorldPoint(var40 + var42, var41 + var44, llIIlIllIlll[0]));

            ++var44;

            if (1 >= 0) continue;
            return null;
        }
        return var7_7;
    }

        return String.valueOf(var45);
    }

    private static boolean lllllIlllllIII(Object object, Object object2) {
        return object != object2;
    }

    private  List b(Player player, WorldPoint worldPoint) {
        return this.bA.c(player.getWorldLocation(), worldPoint);
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor actor = projectileSpawned.getProjectile().getInteracting();
        if (t.lllllIllllIIII(actor instanceof NPC) && t.lllllIllllIIlI(actor.getName()) && t.lllllIllllIIII(e.aw.contains(actor.getName()) ? 1 : 0) && t.lllllIllllIIII(e.aD.contains(projectileSpawned.getProjectile().getId()) ? 1 : 0)) {
            this.bB.c(llIIlIllIlll[4]);
        }
    }

    private static boolean lllllIllllIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllllIllllIIlI(Object object) {
        return object != null;
    }

    public WorldPoint bt() {
        Player player = Players.getLocal();
        j j2 = this.ba.X();
        NPC nPC = j2.aI();
        if (!t.lllllIllllIIlI(player) || t.lllllIlllIllll(nPC)) {
            return null;
        }
        List list = this.br().stream().flatMap(worldPoint -> this.g((WorldPoint)worldPoint).stream()).distinct().collect(Collectors.toList());
        List<WorldPoint> list2 = this.g(player.getWorldLocation());
        Stream stream = list2.stream();
        List list3 = list;
        Objects.requireNonNull(list3);

        Optional<WorldPoint> optional = stream.filter(list3::contains).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(nPC.getWorldArea()) + worldPoint.distanceTo(player.getWorldLocation())));
        return optional.orElse(list2.stream().max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(nPC.getWorldArea()))).orElse(null));
    }

    private boolean i(NPC nPC) {
        nPC.interact(llIIlIllIllI[llIIlIllIlll[0]]);
        return llIIlIllIlll[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        int n2;
        void var46;
        if (t.lllllIllllIllI(varbitChanged.getVarbitId(), llIIlIllIlll[6])) {
            return;
        }
        if (t.lllllIllllIlll(var46.getValue(), llIIlIllIlll[0])) {
            n2 = llIIlIllIlll[0];

        } else {
            n2 = llIIlIllIlll[1];
        }
        var47.bC = n2;
    }

    @Inject
    public AttackingBossTask(c c2, b b2, u u2) {
        d[] dArray = new d[llIIlIllIlll[0]];
        dArray[t.llIIlIllIlll[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bC = llIIlIllIlll[1];
        this.bB = b2;
        this.bA = u2;
    }

    private static boolean lllllIllllIlIl(int n2, int n3) {
        return n2 > n3;
    }
}

