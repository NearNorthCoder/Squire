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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.j_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.EscapingHazardTask;
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

/* TASK: Attacking boss -> AttackingbossTask */
@TaskDesc(name="Attacking boss", priority=4, register=true)
public class AttackingBossTask
extends n_Unknown {
    private final /* synthetic */ u bA;
    private static /* synthetic */ int[] llIIlIllIlll;
    private static /* synthetic */ String[] llIIlIllIllI;
    private final /* synthetic */ b bB;
    private /* synthetic */ boolean bC;

    private static void lllllIlllIllIl() {
        llIIlIllIllI = new String[llIIlIllIlll[5]];
        t.llIIlIllIllI[t.llIIlIllIlll[1]] = t."Escape";
        t.llIIlIllIllI[t.llIIlIllIlll[0]] = t."Attack";
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
        Client var12 = Static.getClient();
        Player var2 = var12.getLocalPlayer();
        if (t.lllllIlllIllll(var2)) {
            return null;
        }
        WorldPoint worldPoint = var3_3.getWorldLocation();
        List list = TileObjects.getAll(tileObject -> Predicates.ids((int[])e.O).test(tileObject));
        Stream<List> stream = list.stream().filter(tileObject -> {
            boolean bl;
            if (t.lllllIllllIlIl(tileObject.getWorldLocation().distanceTo(worldPoint), llIIlIllIlll[4])) {
                bl = llIIlIllIlll[0];
                0;
                
                }
            } else {
                bl = llIIlIllIlll[1];
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

    private static void lllllIlllIlllI() {
        llIIlIllIlll = new int[9];
        t.llIIlIllIlll[0] = 1;
        t.llIIlIllIlll[1] = (0x99 ^ 0xA8) & ~(0x22 ^ 0x13);
        t.llIIlIllIlll[2] = -(0xFFFFA6EE & 0x7B1F) & (0xFFFFFFFF & 0x7F4F);
        t.llIIlIllIlll[3] = -(0xFFFFBD87 & 0x4E79) & (0xFFFFEFEF & 0x1FF7);
        t.llIIlIllIlll[4] = 3;
        t.llIIlIllIlll[5] = 2;
        t.llIIlIllIlll[6] = 0xFFFFA7DB & 0x7BFD;
        t.llIIlIllIlll[7] = -1;
        t.llIIlIllIlll[8] = 0x51 ^ 0x59;
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

    private static String lllllIlllIlIll(String var48, String var46) {
        try {
            SecretKeySpec var51 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var46.getBytes(StandardCharsets.UTF_8)), llIIlIllIlll[8]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIIlIllIlll[5], var51);
            return new String(var4.doFinal(Base64.getDecoder().decode(var48.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var52) {
            var52.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ boolean c(Player player, WorldPoint worldPoint) {
        return player.getWorldLocation().equals((Object)worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint f(WorldPoint worldPoint) {
        void var9;
        t var3;
        j j2 = this.ba.X();
        if (t.lllllIlllIllll(j2)) {
            return null;
        }
        Optional<WorldPoint> var25 = var3.b(var3.br()).stream().min(Comparator.comparingDouble(arg_0 -> t.b((WorldPoint)var9, arg_0)));
        if (t.lllllIllllIIII(var25.isEmpty() ? 1 : 0)) {
            return null;
        }
        List<WorldPoint> var18 = var3.bA.c((WorldPoint)var9, var25.get());
        if (t.lllllIllllIIII(var3.bA.d(var18) ? 1 : 0)) {
            return var25.get();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Player player, NPC nPC) {
        void var4_4;
        void var13;
        void var56;
        t var14;
        if (t.lllllIllllIlIl(this.ba.X().aH(), llIIlIllIlll[0])) {
            return llIIlIllIlll[1];
        }
        List<WorldPoint> var54 = var14.bA.bu();
        if (t.lllllIllllIIII(var54.stream().anyMatch(arg_0 -> t.c((Player)var56, arg_0)) ? 1 : 0)) {
            return llIIlIllIlll[1];
        }
        Stream stream = var54.stream();
        u u2 = var14.bA;
        Objects.requireNonNull(u2);
        0;
        Stream<List> stream2 = stream.filter(u2::o).map(arg_0 -> var14.b((Player)var56, arg_0));
        u u3 = var14.bA;
        Objects.requireNonNull(u3);
        0;
        WorldPoint var49 = stream2.filter(u3::d).map(list -> (WorldPoint)list.get(list.size() - llIIlIllIlll[0])).min(Comparator.comparing(arg_0 -> t.a((Player)var56, arg_0))).orElse(null);
        if (!t.lllllIllllIIlI(var49) || t.lllllIllllIIlI(var13)) {
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
        int var39;
        int n2;
        int var53;
        int n3;
        int var45;
        int n4;
        int var58;
        int lllllllllllllllIlIIllIIllIIIIlll2;
        int n5;
        void var33;
        NPC lllllllllllllllIlIIllIIllIIIlIII2;
        t var6;
        Player player = Players.getLocal();
        if (t.lllllIlllIllll(player)) {
            return llIIlIllIlll[1];
        }
        j var26 = var6.ba.X();
        if (t.lllllIlllIllll(var26.aI())) {
            return llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(var6.bC ? 1 : 0)) {
            int[] nArray = new int[llIIlIllIlll[0]];
            nArray[t.llIIlIllIlll[1]] = llIIlIllIlll[2];
            int lllllllllllllllIlIIllIIllIIIlIII2 = Inventory.getCount((int[])nArray);
            if (t.lllllIllllIIIl(lllllllllllllllIlIIllIIllIIIlIII2, var6.ba.h().abortFishAmount())) {
                TileObject lllllllllllllllIlIIllIIllIIIIlll2 = TileObjects.getNearest((int[])e.O);
                if (t.lllllIlllIllll(lllllllllllllllIlIIllIIllIIIIlll2)) {
                    return llIIlIllIlll[1];
                }
                lllllllllllllllIlIIllIIllIIIIlll2.interact(llIIlIllIllI[llIIlIllIlll[1]]);
                return llIIlIllIlll[0];
            }
            var6.bC = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2 = var6.bA.m(var33.getWorldLocation()))) {
            n5 = lllllllllllllllIlIIllIIllIIIlIII2.getWorldLocation().distanceTo(var33.getWorldLocation());
            0;
            if (-3 >= 0) {
                return false;
            }
        } else {
            n5 = lllllllllllllllIlIIllIIllIIIIlll2 = llIIlIllIlll[3];
        }
        if (t.lllllIllllIIII(var58 = var6.ba.h().safeBossFight())) {
            n4 = llIIlIllIlll[4];
            0;
            if ((0x36 ^ 0x2E ^ (0x2F ^ 0x32)) <= 0) {
                return ((0x37 ^ 0x4C ^ (0xC4 ^ 0x98)) & (45 + 172 - 109 + 70 ^ 133 + 87 - 170 + 99 ^ -1)) != 0;
            }
        } else {
            n4 = var45 = llIIlIllIlll[5];
        }
        if (t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2) && t.lllllIllllIIIl(lllllllllllllllIlIIllIIllIIIIlll2, var45)) {
            n3 = llIIlIllIlll[0];
            0;
            if ((0x22 ^ 0x43 ^ (0x49 ^ 0x2C)) != (63 + 36 - 95 + 145 ^ 18 + 7 - -104 + 16)) {
                return ((0x76 ^ 0x4E ^ (0x3F ^ 0x45)) & (185 + 69 - 150 + 120 ^ 82 + 94 - 97 + 83 ^ -1)) != 0;
            }
        } else {
            n3 = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(var53 = n3)) {
            return llIIlIllIlll[1];
        }
        NPC var5 = var6.ba.X().aI();
        if (t.lllllIllllIIll(var6.ba.X().aD(), HeadIcon.RANGED) && t.lllllIlllIllll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON))) {
            n2 = llIIlIllIlll[0];
            0;
            if (1 > (0x12 ^ 0x16)) {
                return false;
            }
        } else {
            n2 = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(var39 = n2) && t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2) && t.lllllIllllIIII(var58)) {
            return llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(var39)) {
            List<WorldPoint> var42 = var6.bA.c(var33.getWorldLocation(), var5.getWorldLocation());
            u u2 = var6.bA;
            Stream stream = var42.stream();
            u u3 = var6.bA;
            Objects.requireNonNull(u3);
            0;
            if (t.lllllIllllIIII(u2.d(stream.filter(u3::n).collect(Collectors.toList())) ? 1 : 0)) {
                return var6.i(var5);
            }
            if (t.lllllIllllIIII(var5.getWorldArea().isInMeleeDistance(var33.getWorldLocation()) ? 1 : 0)) {
                var6.i(var5);
                0;
                WorldPoint var29 = var6.bA.k(var6.bA.i(var33.getWorldLocation()));
                if (t.lllllIllllIIlI(var29) && t.lllllIllllIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                    ScenePoint var16 = ScenePoint.fromWorld((WorldPoint)var29);
                    Movement.setDestination((int)var16.getX(), (int)var16.getY());
                }
                return llIIlIllIlll[0];
            }
            WorldPoint var29 = var6.f(var33.getWorldLocation());
            if (t.lllllIlllIllll(var29)) {
                WorldPoint var16 = var6.bs();
                if (!t.lllllIllllIIlI(var16) || t.lllllIllllIIII(var33.isMoving() ? 1 : 0)) {
                    return llIIlIllIlll[1];
                }
                ScenePoint var35 = ScenePoint.fromWorld((WorldPoint)var16);
                Movement.setDestination((int)var35.getX(), (int)var35.getY());
                return llIIlIllIlll[0];
            }
            ScenePoint var16 = ScenePoint.fromWorld((WorldPoint)var29);
            Movement.setDestination((int)var16.getX(), (int)var16.getY());
            return llIIlIllIlll[0];
        }
        if (t.lllllIllllIIII(var6.bB.t() ? 1 : 0)) {
            return var6.a((Player)var33, lllllllllllllllIlIIllIIllIIIlIII2);
        }
        return this.i((NPC)var8_10);
    }

    private static boolean lllllIllllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static /* synthetic */ double b(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceToHypotenuse(worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> g(WorldPoint worldPoint) {
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        int var7 = llIIlIllIlll[7];
        while (t.lllllIllllIIIl(var7, llIIlIllIlll[0])) {
            int var32 = llIIlIllIlll[7];
            while (t.lllllIllllIIIl(var32, llIIlIllIlll[0])) {
                void var30;
                t var1;
                void var34;
                var34.addAll(var1.a((WorldPoint)var30, var7, var32));
                0;
                ++var32;
                0;
                if (((0x99 ^ 0xBE) & ~(0x8C ^ 0xAB)) == 0) continue;
                return null;
            }
            ++var7;
            0;
            
            return null;
        }
        return linkedList;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var47;
        if (t.lllllIlllllIII((Object)this.ba.W(), (Object)d.BOSS_FIGHT)) {
            return;
        }
        if (t.lllllIllllIIlI(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON))) {
            return;
        }
        Actor var20 = var47.getActor();
        if (!t.lllllIllllIIlI(var47.getActor()) || t.lllllIllllIlII(e.aw.contains(var20.getName()) ? 1 : 0)) {
            return;
        }
        this.bB.c(llIIlIllIlll[4]);
    }

    public List<WorldPoint> b(List<WorldPoint> list) {
        Stream stream = list.stream();
        u u2 = this.bA;
        Objects.requireNonNull(u2);
        0;
        return stream.filter(u2::o).collect(Collectors.toList());
    }

    private static boolean lllllIllllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIllllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static /* synthetic */ Integer a(Player player, WorldPoint worldPoint) {
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
        void var15;
        void var59;
        void var38;
        if (t.lllllIllllIlII(n2) && t.lllllIllllIlII(n3)) {
            return List.of();
        }
        WorldPoint var11 = var38.dx((int)var59).dy((int)var15);
        if (!t.lllllIllllIlII(var31.bA.n(var11) ? 1 : 0) || !t.lllllIllllIIII(var31.bA.l(var11) ? 1 : 0) || t.lllllIllllIlII(var31.bA.j(var11) ? 1 : 0)) {
            return List.of(var38);
        }
        LinkedList<WorldPoint> var21 = new LinkedList<WorldPoint>(var31.a(var11, (int)var59, (int)var15));
        if (t.lllllIllllIlII((int)var59)) {
            var21.addAll(var31.a(var11, llIIlIllIlll[0], (int)var15));
            0;
            var21.addAll(var31.a(var11, llIIlIllIlll[7], (int)var15));
            0;
        }
        if (t.lllllIllllIlII((int)var15)) {
            var21.addAll(var31.a(var11, (int)var59, llIIlIllIlll[0]));
            0;
            var21.addAll(var31.a(var11, (int)var59, llIIlIllIlll[7]));
            0;
        }
        return var5_5;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> br() {
        void var7_7;
        void var22;
        j j2 = this.ba.X();
        if (t.lllllIlllIllll(j2)) {
            return null;
        }
        NPC var37 = var22.aI();
        if (t.lllllIlllIllll(var37)) {
            return null;
        }
        WorldArea var19 = var37.getWorldArea();
        int var55 = var19.getX();
        int var17 = var19.getY();
        int var27 = var19.getWidth();
        LinkedList<WorldPoint> var50 = new LinkedList<WorldPoint>();
        int var44 = llIIlIllIlll[1];
        while (t.lllllIlllllIIl(var44, var27)) {
            var50.add(new WorldPoint(var55 + var44, var17 - llIIlIllIlll[0], llIIlIllIlll[0]));
            0;
            var50.add(new WorldPoint(var55 + var44, var17 + var27, llIIlIllIlll[0]));
            0;
            var50.add(new WorldPoint(var55 - llIIlIllIlll[0], var17 + var44, llIIlIllIlll[0]));
            0;
            var50.add(new WorldPoint(var55 + var27, var17 + var44, llIIlIllIlll[0]));
            0;
            ++var44;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return var7_7;
    }

    private static String lllllIlllIllII(String var24, String var40) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var43 = new StringBuilder();
        char[] var28 = var40.toCharArray();
        int var8 = llIIlIllIlll[1];
        char[] var10 = var24.toCharArray();
        int var23 = var10.length;
        int var57 = llIIlIllIlll[1];
        while (t.lllllIlllllIIl(var57, var23)) {
            char var41 = var10[var57];
            var43.append((char)(var41 ^ var28[var8 % var28.length]));
            0;
            ++var8;
            ++var57;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var43);
    }

    private static boolean lllllIlllllIII(Object object, Object object2) {
        return object != object2;
    }

    private /* synthetic */ List b(Player player, WorldPoint worldPoint) {
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
        0;
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
        void var36;
        if (t.lllllIllllIllI(varbitChanged.getVarbitId(), llIIlIllIlll[6])) {
            return;
        }
        if (t.lllllIllllIlll(var36.getValue(), llIIlIllIlll[0])) {
            n2 = llIIlIllIlll[0];
            0;
            if (-1 > 0) {
                return;
            }
        } else {
            n2 = llIIlIllIlll[1];
        }
        lllllllllllllllIlIIllIIlIllIllll.bC = n2;
    }

    @Inject
    public t(c c2, b b2, u u2) {
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

