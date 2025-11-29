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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.j;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.u;
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
public class t
extends n {
    private final /* synthetic */ u bA;
    private static /* synthetic */ int[] llIIlIllIlll;
    private static /* synthetic */ String[] llIIlIllIllI;
    private final /* synthetic */ b bB;
    private /* synthetic */ boolean bC;

    private static void lllllIlllIllIl() {
        llIIlIllIllI = new String[llIIlIllIlll[5]];
        t.llIIlIllIllI[t.llIIlIllIlll[1]] = t.lllllIlllIlIll("0uEXH5rn44w=", "dsNjx");
        t.llIIlIllIllI[t.llIIlIllIlll[0]] = t.lllllIlllIllII("BA48CBku", "EzHiz");
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
        Client lllllllllllllllIlIIllIIlIIllllIl = Static.getClient();
        Player lllllllllllllllIlIIllIIlIIllllII = lllllllllllllllIlIIllIIlIIllllIl.getLocalPlayer();
        if (t.lllllIlllIllll(lllllllllllllllIlIIllIIlIIllllII)) {
            return null;
        }
        WorldPoint worldPoint = var3_3.getWorldLocation();
        List list = TileObjects.getAll(tileObject -> Predicates.ids((int[])e.O).test(tileObject));
        Stream<List> stream = list.stream().filter(tileObject -> {
            boolean bl;
            if (t.lllllIllllIlIl(tileObject.getWorldLocation().distanceTo(worldPoint), llIIlIllIlll[4])) {
                bl = llIIlIllIlll[0];
                "".length();
                if (null != null) {
                    return ((0x16 ^ 0x4E) & ~(0x55 ^ 0xD)) != 0;
                }
            } else {
                bl = llIIlIllIlll[1];
            }
            return bl;
        }).map(tileObject -> this.bA.c(worldPoint, tileObject.getWorldLocation()));
        u u2 = this.bA;
        Objects.requireNonNull(u2);
        "".length();
        Stream stream2 = stream.filter(u2::d).flatMap(Collection::stream);
        u u3 = this.bA;
        Objects.requireNonNull(u3);
        "".length();
        return stream2.filter(u3::o).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(worldPoint))).orElse(null);
    }

    private static void lllllIlllIlllI() {
        llIIlIllIlll = new int[9];
        t.llIIlIllIlll[0] = " ".length();
        t.llIIlIllIlll[1] = (0x99 ^ 0xA8) & ~(0x22 ^ 0x13);
        t.llIIlIllIlll[2] = -(0xFFFFA6EE & 0x7B1F) & (0xFFFFFFFF & 0x7F4F);
        t.llIIlIllIlll[3] = -(0xFFFFBD87 & 0x4E79) & (0xFFFFEFEF & 0x1FF7);
        t.llIIlIllIlll[4] = "   ".length();
        t.llIIlIllIlll[5] = "  ".length();
        t.llIIlIllIlll[6] = 0xFFFFA7DB & 0x7BFD;
        t.llIIlIllIlll[7] = -" ".length();
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

    private static String lllllIlllIlIll(String lllllllllllllllIlIIllIIIllllIIII, String lllllllllllllllIlIIllIIIllllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIllllIIIl.getBytes(StandardCharsets.UTF_8)), llIIlIllIlll[8]), "DES");
            Cipher lllllllllllllllIlIIllIIIllllIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIllllIlII.init(llIIlIllIlll[5], lllllllllllllllIlIIllIIIllllIlIl);
            return new String(lllllllllllllllIlIIllIIIllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIllllIIll) {
            lllllllllllllllIlIIllIIIllllIIll.printStackTrace();
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
        void lllllllllllllllIlIIllIIlIlIllIll;
        t lllllllllllllllIlIIllIIlIlIlllII;
        j j2 = this.ba.X();
        if (t.lllllIlllIllll(j2)) {
            return null;
        }
        Optional<WorldPoint> lllllllllllllllIlIIllIIlIlIllIIl = lllllllllllllllIlIIllIIlIlIlllII.b(lllllllllllllllIlIIllIIlIlIlllII.br()).stream().min(Comparator.comparingDouble(arg_0 -> t.b((WorldPoint)lllllllllllllllIlIIllIIlIlIllIll, arg_0)));
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIlIlIllIIl.isEmpty() ? 1 : 0)) {
            return null;
        }
        List<WorldPoint> lllllllllllllllIlIIllIIlIlIllIII = lllllllllllllllIlIIllIIlIlIlllII.bA.c((WorldPoint)lllllllllllllllIlIIllIIlIlIllIll, lllllllllllllllIlIIllIIlIlIllIIl.get());
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIlIlIlllII.bA.d(lllllllllllllllIlIIllIIlIlIllIII) ? 1 : 0)) {
            return lllllllllllllllIlIIllIIlIlIllIIl.get();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Player player, NPC nPC) {
        void var4_4;
        void lllllllllllllllIlIIllIIlIlllIlIl;
        void lllllllllllllllIlIIllIIlIlllIllI;
        t lllllllllllllllIlIIllIIlIlllIlll;
        if (t.lllllIllllIlIl(this.ba.X().aH(), llIIlIllIlll[0])) {
            return llIIlIllIlll[1];
        }
        List<WorldPoint> lllllllllllllllIlIIllIIlIlllIlII = lllllllllllllllIlIIllIIlIlllIlll.bA.bu();
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIlIlllIlII.stream().anyMatch(arg_0 -> t.c((Player)lllllllllllllllIlIIllIIlIlllIllI, arg_0)) ? 1 : 0)) {
            return llIIlIllIlll[1];
        }
        Stream stream = lllllllllllllllIlIIllIIlIlllIlII.stream();
        u u2 = lllllllllllllllIlIIllIIlIlllIlll.bA;
        Objects.requireNonNull(u2);
        "".length();
        Stream<List> stream2 = stream.filter(u2::o).map(arg_0 -> lllllllllllllllIlIIllIIlIlllIlll.b((Player)lllllllllllllllIlIIllIIlIlllIllI, arg_0));
        u u3 = lllllllllllllllIlIIllIIlIlllIlll.bA;
        Objects.requireNonNull(u3);
        "".length();
        WorldPoint lllllllllllllllIlIIllIIlIlllIIll = stream2.filter(u3::d).map(list -> (WorldPoint)list.get(list.size() - llIIlIllIlll[0])).min(Comparator.comparing(arg_0 -> t.a((Player)lllllllllllllllIlIIllIIlIlllIllI, arg_0))).orElse(null);
        if (!t.lllllIllllIIlI(lllllllllllllllIlIIllIIlIlllIIll) || t.lllllIllllIIlI(lllllllllllllllIlIIllIIlIlllIlIl)) {
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
        int lllllllllllllllIlIIllIIllIIIIIlI;
        int n2;
        int lllllllllllllllIlIIllIIllIIIIlII;
        int n3;
        int lllllllllllllllIlIIllIIllIIIIlIl;
        int n4;
        int lllllllllllllllIlIIllIIllIIIIllI;
        int lllllllllllllllIlIIllIIllIIIIlll2;
        int n5;
        void lllllllllllllllIlIIllIIllIIIlIlI;
        NPC lllllllllllllllIlIIllIIllIIIlIII2;
        t lllllllllllllllIlIIllIIllIIIlIll;
        Player player = Players.getLocal();
        if (t.lllllIlllIllll(player)) {
            return llIIlIllIlll[1];
        }
        j lllllllllllllllIlIIllIIllIIIlIIl = lllllllllllllllIlIIllIIllIIIlIll.ba.X();
        if (t.lllllIlllIllll(lllllllllllllllIlIIllIIllIIIlIIl.aI())) {
            return llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIlIll.bC ? 1 : 0)) {
            int[] nArray = new int[llIIlIllIlll[0]];
            nArray[t.llIIlIllIlll[1]] = llIIlIllIlll[2];
            int lllllllllllllllIlIIllIIllIIIlIII2 = Inventory.getCount((int[])nArray);
            if (t.lllllIllllIIIl(lllllllllllllllIlIIllIIllIIIlIII2, lllllllllllllllIlIIllIIllIIIlIll.ba.h().abortFishAmount())) {
                TileObject lllllllllllllllIlIIllIIllIIIIlll2 = TileObjects.getNearest((int[])e.O);
                if (t.lllllIlllIllll(lllllllllllllllIlIIllIIllIIIIlll2)) {
                    return llIIlIllIlll[1];
                }
                lllllllllllllllIlIIllIIllIIIIlll2.interact(llIIlIllIllI[llIIlIllIlll[1]]);
                return llIIlIllIlll[0];
            }
            lllllllllllllllIlIIllIIllIIIlIll.bC = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2 = lllllllllllllllIlIIllIIllIIIlIll.bA.m(lllllllllllllllIlIIllIIllIIIlIlI.getWorldLocation()))) {
            n5 = lllllllllllllllIlIIllIIllIIIlIII2.getWorldLocation().distanceTo(lllllllllllllllIlIIllIIllIIIlIlI.getWorldLocation());
            "".length();
            if (-"   ".length() >= 0) {
                return ((0xBE ^ 0x89) & ~(0x2D ^ 0x1A)) != 0;
            }
        } else {
            n5 = lllllllllllllllIlIIllIIllIIIIlll2 = llIIlIllIlll[3];
        }
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIIllI = lllllllllllllllIlIIllIIllIIIlIll.ba.h().safeBossFight())) {
            n4 = llIIlIllIlll[4];
            "".length();
            if ((0x36 ^ 0x2E ^ (0x2F ^ 0x32)) <= 0) {
                return ((0x37 ^ 0x4C ^ (0xC4 ^ 0x98)) & (45 + 172 - 109 + 70 ^ 133 + 87 - 170 + 99 ^ -" ".length())) != 0;
            }
        } else {
            n4 = lllllllllllllllIlIIllIIllIIIIlIl = llIIlIllIlll[5];
        }
        if (t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2) && t.lllllIllllIIIl(lllllllllllllllIlIIllIIllIIIIlll2, lllllllllllllllIlIIllIIllIIIIlIl)) {
            n3 = llIIlIllIlll[0];
            "".length();
            if ((0x22 ^ 0x43 ^ (0x49 ^ 0x2C)) != (63 + 36 - 95 + 145 ^ 18 + 7 - -104 + 16)) {
                return ((0x76 ^ 0x4E ^ (0x3F ^ 0x45)) & (185 + 69 - 150 + 120 ^ 82 + 94 - 97 + 83 ^ -" ".length())) != 0;
            }
        } else {
            n3 = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIIlII = n3)) {
            return llIIlIllIlll[1];
        }
        NPC lllllllllllllllIlIIllIIllIIIIIll = lllllllllllllllIlIIllIIllIIIlIll.ba.X().aI();
        if (t.lllllIllllIIll(lllllllllllllllIlIIllIIllIIIlIll.ba.X().aD(), HeadIcon.RANGED) && t.lllllIlllIllll(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON))) {
            n2 = llIIlIllIlll[0];
            "".length();
            if (" ".length() > (0x12 ^ 0x16)) {
                return ((0xAB ^ 0x86) & ~(0x22 ^ 0xF)) != 0;
            }
        } else {
            n2 = llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIIIlI = n2) && t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIlIII2) && t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIIllI)) {
            return llIIlIllIlll[1];
        }
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIIIlI)) {
            List<WorldPoint> lllllllllllllllIlIIllIIllIIIIIIl = lllllllllllllllIlIIllIIllIIIlIll.bA.c(lllllllllllllllIlIIllIIllIIIlIlI.getWorldLocation(), lllllllllllllllIlIIllIIllIIIIIll.getWorldLocation());
            u u2 = lllllllllllllllIlIIllIIllIIIlIll.bA;
            Stream stream = lllllllllllllllIlIIllIIllIIIIIIl.stream();
            u u3 = lllllllllllllllIlIIllIIllIIIlIll.bA;
            Objects.requireNonNull(u3);
            "".length();
            if (t.lllllIllllIIII(u2.d(stream.filter(u3::n).collect(Collectors.toList())) ? 1 : 0)) {
                return lllllllllllllllIlIIllIIllIIIlIll.i(lllllllllllllllIlIIllIIllIIIIIll);
            }
            if (t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIIIll.getWorldArea().isInMeleeDistance(lllllllllllllllIlIIllIIllIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIlIIllIIllIIIlIll.i(lllllllllllllllIlIIllIIllIIIIIll);
                "".length();
                WorldPoint lllllllllllllllIlIIllIIllIIIIIII = lllllllllllllllIlIIllIIllIIIlIll.bA.k(lllllllllllllllIlIIllIIllIIIlIll.bA.i(lllllllllllllllIlIIllIIllIIIlIlI.getWorldLocation()));
                if (t.lllllIllllIIlI(lllllllllllllllIlIIllIIllIIIIIII) && t.lllllIllllIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                    ScenePoint lllllllllllllllIlIIllIIlIlllllll = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIllIIllIIIIIII);
                    Movement.setDestination((int)lllllllllllllllIlIIllIIlIlllllll.getX(), (int)lllllllllllllllIlIIllIIlIlllllll.getY());
                }
                return llIIlIllIlll[0];
            }
            WorldPoint lllllllllllllllIlIIllIIllIIIIIII = lllllllllllllllIlIIllIIllIIIlIll.f(lllllllllllllllIlIIllIIllIIIlIlI.getWorldLocation());
            if (t.lllllIlllIllll(lllllllllllllllIlIIllIIllIIIIIII)) {
                WorldPoint lllllllllllllllIlIIllIIlIlllllll = lllllllllllllllIlIIllIIllIIIlIll.bs();
                if (!t.lllllIllllIIlI(lllllllllllllllIlIIllIIlIlllllll) || t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIlIlI.isMoving() ? 1 : 0)) {
                    return llIIlIllIlll[1];
                }
                ScenePoint lllllllllllllllIlIIllIIlIllllllI = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIllIIlIlllllll);
                Movement.setDestination((int)lllllllllllllllIlIIllIIlIllllllI.getX(), (int)lllllllllllllllIlIIllIIlIllllllI.getY());
                return llIIlIllIlll[0];
            }
            ScenePoint lllllllllllllllIlIIllIIlIlllllll = ScenePoint.fromWorld((WorldPoint)lllllllllllllllIlIIllIIllIIIIIII);
            Movement.setDestination((int)lllllllllllllllIlIIllIIlIlllllll.getX(), (int)lllllllllllllllIlIIllIIlIlllllll.getY());
            return llIIlIllIlll[0];
        }
        if (t.lllllIllllIIII(lllllllllllllllIlIIllIIllIIIlIll.bB.t() ? 1 : 0)) {
            return lllllllllllllllIlIIllIIllIIIlIll.a((Player)lllllllllllllllIlIIllIIllIIIlIlI, lllllllllllllllIlIIllIIllIIIlIII2);
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
        int lllllllllllllllIlIIllIIlIIlIIIll = llIIlIllIlll[7];
        while (t.lllllIllllIIIl(lllllllllllllllIlIIllIIlIIlIIIll, llIIlIllIlll[0])) {
            int lllllllllllllllIlIIllIIlIIlIIIlI = llIIlIllIlll[7];
            while (t.lllllIllllIIIl(lllllllllllllllIlIIllIIlIIlIIIlI, llIIlIllIlll[0])) {
                void lllllllllllllllIlIIllIIlIIlIIlIl;
                t lllllllllllllllIlIIllIIlIIlIIllI;
                void lllllllllllllllIlIIllIIlIIlIIlII;
                lllllllllllllllIlIIllIIlIIlIIlII.addAll(lllllllllllllllIlIIllIIlIIlIIllI.a((WorldPoint)lllllllllllllllIlIIllIIlIIlIIlIl, lllllllllllllllIlIIllIIlIIlIIIll, lllllllllllllllIlIIllIIlIIlIIIlI));
                "".length();
                ++lllllllllllllllIlIIllIIlIIlIIIlI;
                "".length();
                if (((0x99 ^ 0xBE) & ~(0x8C ^ 0xAB)) == 0) continue;
                return null;
            }
            ++lllllllllllllllIlIIllIIlIIlIIIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return linkedList;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void lllllllllllllllIlIIllIIlIllIIIll;
        if (t.lllllIlllllIII((Object)this.ba.W(), (Object)d.BOSS_FIGHT)) {
            return;
        }
        if (t.lllllIllllIIlI(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON))) {
            return;
        }
        Actor lllllllllllllllIlIIllIIlIllIIIlI = lllllllllllllllIlIIllIIlIllIIIll.getActor();
        if (!t.lllllIllllIIlI(lllllllllllllllIlIIllIIlIllIIIll.getActor()) || t.lllllIllllIlII(e.aw.contains(lllllllllllllllIlIIllIIlIllIIIlI.getName()) ? 1 : 0)) {
            return;
        }
        this.bB.c(llIIlIllIlll[4]);
    }

    public List<WorldPoint> b(List<WorldPoint> list) {
        Stream stream = list.stream();
        u u2 = this.bA;
        Objects.requireNonNull(u2);
        "".length();
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
        t lllllllllllllllIlIIllIIlIIIllIll;
        void lllllllllllllllIlIIllIIlIIIllIII;
        void lllllllllllllllIlIIllIIlIIIllIIl;
        void lllllllllllllllIlIIllIIlIIIllIlI;
        if (t.lllllIllllIlII(n2) && t.lllllIllllIlII(n3)) {
            return List.of();
        }
        WorldPoint lllllllllllllllIlIIllIIlIIIlIlll = lllllllllllllllIlIIllIIlIIIllIlI.dx((int)lllllllllllllllIlIIllIIlIIIllIIl).dy((int)lllllllllllllllIlIIllIIlIIIllIII);
        if (!t.lllllIllllIlII(lllllllllllllllIlIIllIIlIIIllIll.bA.n(lllllllllllllllIlIIllIIlIIIlIlll) ? 1 : 0) || !t.lllllIllllIIII(lllllllllllllllIlIIllIIlIIIllIll.bA.l(lllllllllllllllIlIIllIIlIIIlIlll) ? 1 : 0) || t.lllllIllllIlII(lllllllllllllllIlIIllIIlIIIllIll.bA.j(lllllllllllllllIlIIllIIlIIIlIlll) ? 1 : 0)) {
            return List.of(lllllllllllllllIlIIllIIlIIIllIlI);
        }
        LinkedList<WorldPoint> lllllllllllllllIlIIllIIlIIIlIllI = new LinkedList<WorldPoint>(lllllllllllllllIlIIllIIlIIIllIll.a(lllllllllllllllIlIIllIIlIIIlIlll, (int)lllllllllllllllIlIIllIIlIIIllIIl, (int)lllllllllllllllIlIIllIIlIIIllIII));
        if (t.lllllIllllIlII((int)lllllllllllllllIlIIllIIlIIIllIIl)) {
            lllllllllllllllIlIIllIIlIIIlIllI.addAll(lllllllllllllllIlIIllIIlIIIllIll.a(lllllllllllllllIlIIllIIlIIIlIlll, llIIlIllIlll[0], (int)lllllllllllllllIlIIllIIlIIIllIII));
            "".length();
            lllllllllllllllIlIIllIIlIIIlIllI.addAll(lllllllllllllllIlIIllIIlIIIllIll.a(lllllllllllllllIlIIllIIlIIIlIlll, llIIlIllIlll[7], (int)lllllllllllllllIlIIllIIlIIIllIII));
            "".length();
        }
        if (t.lllllIllllIlII((int)lllllllllllllllIlIIllIIlIIIllIII)) {
            lllllllllllllllIlIIllIIlIIIlIllI.addAll(lllllllllllllllIlIIllIIlIIIllIll.a(lllllllllllllllIlIIllIIlIIIlIlll, (int)lllllllllllllllIlIIllIIlIIIllIIl, llIIlIllIlll[0]));
            "".length();
            lllllllllllllllIlIIllIIlIIIlIllI.addAll(lllllllllllllllIlIIllIIlIIIllIll.a(lllllllllllllllIlIIllIIlIIIlIlll, (int)lllllllllllllllIlIIllIIlIIIllIIl, llIIlIllIlll[7]));
            "".length();
        }
        return var5_5;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> br() {
        void var7_7;
        void lllllllllllllllIlIIllIIlIlIIllIl;
        j j2 = this.ba.X();
        if (t.lllllIlllIllll(j2)) {
            return null;
        }
        NPC lllllllllllllllIlIIllIIlIlIIllII = lllllllllllllllIlIIllIIlIlIIllIl.aI();
        if (t.lllllIlllIllll(lllllllllllllllIlIIllIIlIlIIllII)) {
            return null;
        }
        WorldArea lllllllllllllllIlIIllIIlIlIIlIll = lllllllllllllllIlIIllIIlIlIIllII.getWorldArea();
        int lllllllllllllllIlIIllIIlIlIIlIlI = lllllllllllllllIlIIllIIlIlIIlIll.getX();
        int lllllllllllllllIlIIllIIlIlIIlIIl = lllllllllllllllIlIIllIIlIlIIlIll.getY();
        int lllllllllllllllIlIIllIIlIlIIlIII = lllllllllllllllIlIIllIIlIlIIlIll.getWidth();
        LinkedList<WorldPoint> lllllllllllllllIlIIllIIlIlIIIlll = new LinkedList<WorldPoint>();
        int lllllllllllllllIlIIllIIlIlIIIllI = llIIlIllIlll[1];
        while (t.lllllIlllllIIl(lllllllllllllllIlIIllIIlIlIIIllI, lllllllllllllllIlIIllIIlIlIIlIII)) {
            lllllllllllllllIlIIllIIlIlIIIlll.add(new WorldPoint(lllllllllllllllIlIIllIIlIlIIlIlI + lllllllllllllllIlIIllIIlIlIIIllI, lllllllllllllllIlIIllIIlIlIIlIIl - llIIlIllIlll[0], llIIlIllIlll[0]));
            "".length();
            lllllllllllllllIlIIllIIlIlIIIlll.add(new WorldPoint(lllllllllllllllIlIIllIIlIlIIlIlI + lllllllllllllllIlIIllIIlIlIIIllI, lllllllllllllllIlIIllIIlIlIIlIIl + lllllllllllllllIlIIllIIlIlIIlIII, llIIlIllIlll[0]));
            "".length();
            lllllllllllllllIlIIllIIlIlIIIlll.add(new WorldPoint(lllllllllllllllIlIIllIIlIlIIlIlI - llIIlIllIlll[0], lllllllllllllllIlIIllIIlIlIIlIIl + lllllllllllllllIlIIllIIlIlIIIllI, llIIlIllIlll[0]));
            "".length();
            lllllllllllllllIlIIllIIlIlIIIlll.add(new WorldPoint(lllllllllllllllIlIIllIIlIlIIlIlI + lllllllllllllllIlIIllIIlIlIIlIII, lllllllllllllllIlIIllIIlIlIIlIIl + lllllllllllllllIlIIllIIlIlIIIllI, llIIlIllIlll[0]));
            "".length();
            ++lllllllllllllllIlIIllIIlIlIIIllI;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return var7_7;
    }

    private static String lllllIlllIllII(String lllllllllllllllIlIIllIIlIIIIIIlI, String lllllllllllllllIlIIllIIlIIIIIllI) {
        lllllllllllllllIlIIllIIlIIIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIlIIIIIlIl = new StringBuilder();
        char[] lllllllllllllllIlIIllIIlIIIIIlII = lllllllllllllllIlIIllIIlIIIIIllI.toCharArray();
        int lllllllllllllllIlIIllIIlIIIIIIll = llIIlIllIlll[1];
        char[] lllllllllllllllIlIIllIIIllllllIl = lllllllllllllllIlIIllIIlIIIIIIlI.toCharArray();
        int lllllllllllllllIlIIllIIIllllllII = lllllllllllllllIlIIllIIIllllllIl.length;
        int lllllllllllllllIlIIllIIIlllllIll = llIIlIllIlll[1];
        while (t.lllllIlllllIIl(lllllllllllllllIlIIllIIIlllllIll, lllllllllllllllIlIIllIIIllllllII)) {
            char lllllllllllllllIlIIllIIlIIIIlIII = lllllllllllllllIlIIllIIIllllllIl[lllllllllllllllIlIIllIIIlllllIll];
            lllllllllllllllIlIIllIIlIIIIIlIl.append((char)(lllllllllllllllIlIIllIIlIIIIlIII ^ lllllllllllllllIlIIllIIlIIIIIlII[lllllllllllllllIlIIllIIlIIIIIIll % lllllllllllllllIlIIllIIlIIIIIlII.length]));
            "".length();
            ++lllllllllllllllIlIIllIIlIIIIIIll;
            ++lllllllllllllllIlIIllIIIlllllIll;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllIIlIIIIIlIl);
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
        "".length();
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
        void lllllllllllllllIlIIllIIlIllIlllI;
        if (t.lllllIllllIllI(varbitChanged.getVarbitId(), llIIlIllIlll[6])) {
            return;
        }
        if (t.lllllIllllIlll(lllllllllllllllIlIIllIIlIllIlllI.getValue(), llIIlIllIlll[0])) {
            n2 = llIIlIllIlll[0];
            "".length();
            if (-" ".length() > 0) {
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

