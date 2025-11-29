/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.Identifiable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.plugins.gauntlet.GauntletConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.j;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.HeadIcon;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.Identifiable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class c {
    private /* synthetic */ List<l> K;
    private static final /* synthetic */ Logger C;
    private final /* synthetic */ EventBus D;
    private /* synthetic */ d H;
    private static /* synthetic */ String[] llIlIIIllIIl;
    private final /* synthetic */ Client E;
    private /* synthetic */ h G;
    private final /* synthetic */ GauntletConfig F;
    private static /* synthetic */ int[] llIlIIIllIlI;
    private /* synthetic */ GameObject L;
    private /* synthetic */ int N;
    private /* synthetic */ l M;
    private /* synthetic */ j I;
    private /* synthetic */ l J;

    public GameObject aa() {
        return this.L;
    }

    private boolean a(l l2, l l3) {
        Comparator<TileObject> comparator = Comparator.comparingInt(tileObject -> (int)tileObject.getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation()));
        Comparator<TileObject> comparator2 = Comparator.comparingInt(tileObject -> (int)l3.aQ().distanceToHypotenuse(tileObject.getWorldLocation()));
        Optional<TileObject> optional = TileObjects.getAll((int[])e.U).stream().filter(tileObject -> l2.e(tileObject.getWorldLocation())).min(comparator2.thenComparing(comparator));
        if (c.lIIIIIIllIIlIIl(optional.isEmpty() ? 1 : 0)) {
            this.b(l2.aQ());
            return llIlIIIllIlI[3];
        }
        WorldPoint lllllllllllllllIlIIIlIllIllllIlI = Movement.getDestination();
        if (c.lIIIIIIllIIlIIl(Players.getLocal().isMoving() ? 1 : 0) && c.lIIIIIIllIIIlll(lllllllllllllllIlIIIlIllIllllIlI) && c.lIIIIIIllIIlIll(lllllllllllllllIlIIIlIllIllllIlI.distanceTo((Locatable)Players.getLocal()), llIlIIIllIlI[9])) {
            return llIlIIIllIlI[0];
        }
        optional.get().interact(llIlIIIllIIl[llIlIIIllIlI[0]]);
        this.N = this.E.getTickCount();
        return llIlIIIllIlI[3];
    }

    /*
     * WARNING - void declaration
     */
    public List<f> P() {
        void var2_2;
        int n2;
        f lllllllllllllllIlIIIlIllIIlIIIlI;
        int n3;
        c lllllllllllllllIlIIIlIllIIlIlIIl;
        List<Object> list;
        if (c.lIIIIIIllIIlIIl(this.F.makeArmour() ? 1 : 0)) {
            list = List.of(f.TIER_1_BODY, f.TIER_1_LEGS, f.TIER_1_HELM);
            "".length();
            if (((0x33 ^ 0x7E) & ~(0xC ^ 0x41)) >= " ".length()) {
                return null;
            }
        } else {
            list = new ArrayList();
        }
        List<Object> lllllllllllllllIlIIIlIllIIlIlIII = list;
        ArrayList<f> lllllllllllllllIlIIIlIllIIlIIlll = new ArrayList<f>();
        List<f> lllllllllllllllIlIIIlIllIIlIIllI = lllllllllllllllIlIIIlIllIIlIlIIl.K();
        if (c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIIlIIllI.isEmpty() ? 1 : 0)) {
            lllllllllllllllIlIIIlIllIIlIIlll.add(lllllllllllllllIlIIIlIllIIlIIllI.get(llIlIIIllIlI[0]));
            "".length();
            lllllllllllllllIlIIIlIllIIlIIllI.remove(llIlIIIllIlI[0]);
            "".length();
        }
        int lllllllllllllllIlIIIlIllIIlIIlIl = Math.min(lllllllllllllllIlIIIlIllIIlIlIIl.F.potionGoal(), llIlIIIllIlI[3]);
        if (!c.lIIIIIIllIIIlII((Object)lllllllllllllllIlIIIlIllIIlIlIIl.H, (Object)d.PREPARE_BOSS_FIGHT) || c.lIIIIIIllIIlIlI((Object)lllllllllllllllIlIIIlIllIIlIlIIl.H, (Object)d.DEMI_BOSS_EXPLORE)) {
            n3 = lllllllllllllllIlIIIlIllIIlIlIIl.F.potionGoal() - lllllllllllllllIlIIIlIllIIlIlIIl.C();
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        } else {
            n3 = lllllllllllllllIlIIIlIllIIlIIlIl - lllllllllllllllIlIIIlIllIIlIlIIl.C();
        }
        int lllllllllllllllIlIIIlIllIIlIIlII = n3;
        int lllllllllllllllIlIIIlIllIIlIIIll = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(lllllllllllllllIlIIIlIllIIlIIIll, lllllllllllllllIlIIIlIllIIlIIlII)) {
            lllllllllllllllIlIIIlIllIIlIIlll.add(f.VIAL);
            "".length();
            ++lllllllllllllllIlIIIlIllIIlIIIll;
            "".length();
            if (((0x3E ^ 0x79 ^ (0xF2 ^ 0x82)) & (0x4C ^ 0x74 ^ (0x6E ^ 0x61) ^ -" ".length())) == 0) continue;
            return null;
        }
        lllllllllllllllIlIIIlIllIIlIIlll.addAll(lllllllllllllllIlIIIlIllIIlIlIII);
        "".length();
        lllllllllllllllIlIIIlIllIIlIIlll.addAll(lllllllllllllllIlIIIlIllIIlIIllI);
        "".length();
        lllllllllllllllIlIIIlIllIIlIIIll = Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0;
        if ((!c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIIlIIIll) || c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIIlIIlll.contains((Object)f.TIER_3_STAFF) ? 1 : 0)) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_2_BOW.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_3_BOW.ad()) ? 1 : 0)) {
            lllllllllllllllIlIIIlIllIIlIIlll.add(f.TIER_1_BOW);
            "".length();
        }
        if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIIlIlIIl.F.makeT2Offhand() ? 1 : 0)) {
            lllllllllllllllIlIIIlIllIIlIIIlI = lllllllllllllllIlIIIlIllIIlIlIIl.L();
            if (c.lIIIIIIllIIIlll((Object)lllllllllllllllIlIIIlIllIIlIIIlI)) {
                if (c.lIIIIIIllIIIllI(Inventory.contains((int[])lllllllllllllllIlIIIlIllIIlIIIlI.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Inventory.contains((int[])lllllllllllllllIlIIIlIllIIlIIIlI.af().ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIIlIIlll.contains((Object)lllllllllllllllIlIIIlIllIIlIIIlI.af()) ? 1 : 0)) {
                    lllllllllllllllIlIIIlIllIIlIIlll.add(lllllllllllllllIlIIIlIllIIlIIIlI.af());
                    "".length();
                }
                lllllllllllllllIlIIIlIllIIlIIlll.add(lllllllllllllllIlIIIlIllIIlIIIlI);
                "".length();
            }
            "".length();
            if (((0x15 ^ 0x4A) & ~(0x27 ^ 0x78)) < 0) {
                return null;
            }
        } else if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIIlIlIIl.F.makeT3Offhand() ? 1 : 0) && c.lIIIIIIllIIIlll((Object)(lllllllllllllllIlIIIlIllIIlIIIlI = lllllllllllllllIlIIIlIllIIlIlIIl.L()))) {
            f lllllllllllllllIlIIIlIllIIlIIIIl;
            f f3;
            if (c.lIIIIIIllIIlIlI((Object)lllllllllllllllIlIIIlIllIIlIIIlI, (Object)f.TIER_2_BOW)) {
                f3 = f.TIER_3_BOW;
                "".length();
                if (-" ".length() >= (0x21 ^ 0x25)) {
                    return null;
                }
            } else {
                f3 = f.TIER_3_STAFF;
            }
            if (c.lIIIIIIllIIIllI(Inventory.contains((int[])(lllllllllllllllIlIIIlIllIIlIIIIl = f3).ad()) ? 1 : 0)) {
                if (c.lIIIIIIllIIIllI(Inventory.contains((int[])lllllllllllllllIlIIIlIllIIlIIIlI.ad()) ? 1 : 0)) {
                    f lllllllllllllllIlIIIlIllIIlIIIII = lllllllllllllllIlIIIlIllIIlIIIlI.af();
                    if (c.lIIIIIIllIIIllI(Inventory.contains((int[])lllllllllllllllIlIIIlIllIIlIIIII.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIIlIIlll.contains((Object)lllllllllllllllIlIIIlIllIIlIIIII) ? 1 : 0)) {
                        lllllllllllllllIlIIIlIllIIlIIlll.add(lllllllllllllllIlIIIlIllIIlIIIII);
                        "".length();
                    }
                    if (c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIIlIIlll.contains((Object)lllllllllllllllIlIIIlIllIIlIIIlI) ? 1 : 0)) {
                        lllllllllllllllIlIIIlIllIIlIIlll.add(lllllllllllllllIlIIIlIllIIlIIIlI);
                        "".length();
                    }
                }
                lllllllllllllllIlIIIlIllIIlIIlll.add(lllllllllllllllIlIIIlIllIIlIIIIl);
                "".length();
            }
        }
        if (c.lIIIIIIllIIllll(lllllllllllllllIlIIIlIllIIlIlIIl.F(), lllllllllllllllIlIIIlIllIIlIlIIl.F.fishGoal())) {
            n2 = llIlIIIllIlI[3];
            "".length();
            if ((0x2A ^ 5 ^ (0x17 ^ 0x3C)) <= 0) {
                return null;
            }
        } else {
            n2 = lllllllllllllllIlIIIlIllIIlIIIlI = llIlIIIllIlI[0];
        }
        if ((!c.lIIIIIIllIIIlII((Object)lllllllllllllllIlIIIlIllIIlIlIIl.W(), (Object)d.DEMI_BOSS_EXPLORE) || c.lIIIIIIllIIlIlI((Object)lllllllllllllllIlIIIlIllIIlIlIIl.W(), (Object)d.PREPARE_BOSS_FIGHT)) && c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIIlIIIlI)) {
            lllllllllllllllIlIIIlIllIIlIIlll.add(f.TELEPORT_CRYSTAL);
            "".length();
        }
        if (c.lIIIIIIllIIlIll(i.CRYSTAL_SHARD.aC(), llIlIIIllIlI[10]) && c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIIlIlIIl.F.makeT2Offhand() ? 1 : 0) && c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIIlIlIIl.F.makeT3Offhand() ? 1 : 0) && c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIIlIIIlI)) {
            lllllllllllllllIlIIIlIllIIlIIlll.add(lllllllllllllllIlIIIlIllIIlIlIIl.L());
            "".length();
        }
        lllllllllllllllIlIIIlIllIIlIIlll.removeIf(f2 -> {
            int n2;
            if (c.lIIIIIIllIIIlII(f2, (Object)f.VIAL) && c.lIIIIIIllIIIlII(f2, (Object)f.TELEPORT_CRYSTAL) && (!c.lIIIIIIllIIIllI(Inventory.contains((int[])f2.ad()) ? 1 : 0) || c.lIIIIIIllIIlIIl(Equipment.contains((int[])f2.ad()) ? 1 : 0))) {
                n2 = llIlIIIllIlI[3];
                "".length();
                if (-(0xA3 ^ 0xA7) >= 0) {
                    return ((0x1D ^ 0x40) & ~(0xDD ^ 0x80)) != 0;
                }
            } else {
                n2 = llIlIIIllIlI[0];
            }
            return n2 != 0;
        });
        "".length();
        if (c.lIIIIIIllIIlIlI((Object)lllllllllllllllIlIIIlIllIIlIlIIl.W(), (Object)d.PREPARE_BOSS_FIGHT) && c.lIIIIIIllIIlIIl(Inventory.contains((int[])f.TELEPORT_CRYSTAL.ad()) ? 1 : 0)) {
            lllllllllllllllIlIIIlIllIIlIIlll.remove((Object)f.TELEPORT_CRYSTAL);
            "".length();
        }
        return var2_2;
    }

    private static boolean lIIIIIIllIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        l lllllllllllllllIlIIIlIlllIlllIlI;
        void lllllllllllllllIlIIIlIlllIllllII;
        c lllllllllllllllIlIIIlIlllIllllIl;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (c.lIIIIIIllIIlIII(this.G) && c.lIIIIIIllIIlIIl(Arrays.stream(e.O).anyMatch(n2 -> {
            boolean bl;
            if (c.lIIIIIIllIIIlIl(gameObject.getId(), n2)) {
                bl = llIlIIIllIlI[3];
                "".length();
                if ("  ".length() < 0) {
                    return ((199 + 115 - 265 + 160 ^ 150 + 149 - 280 + 139) & (93 + 42 - 132 + 213 ^ 110 + 93 - 135 + 83 ^ -" ".length())) != 0;
                }
            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        }) ? 1 : 0)) {
            this.a(gameObject.getWorldLocation());
        }
        if (c.lIIIIIIllIIIlll(lllllllllllllllIlIIIlIlllIllllIl.G) && c.lIIIIIIllIIlIIl(Arrays.stream(e.U).anyMatch(arg_0 -> c.a((GameObjectSpawned)lllllllllllllllIlIIIlIlllIllllII, arg_0)) ? 1 : 0) && c.lIIIIIIllIIIlll(lllllllllllllllIlIIIlIlllIlllIlI = lllllllllllllllIlIIIlIlllIllllIl.G.d(lllllllllllllllIlIIIlIlllIllllII.getTile().getWorldLocation()))) {
            lllllllllllllllIlIIIlIlllIlllIlI.b(llIlIIIllIlI[3]);
        }
    }

    private static boolean lIIIIIIllIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIllIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    public int H() {
        return this.F.potionGoal();
    }

    public List<l> Z() {
        return this.K;
    }

    public GauntletConfig h() {
        return this.F;
    }

    public boolean G() {
        return this.F.corruptedMode();
    }

    private static /* synthetic */ boolean a(GameObjectSpawned gameObjectSpawned, int n2) {
        boolean bl;
        if (c.lIIIIIIllIIIlIl(n2, gameObjectSpawned.getGameObject().getId())) {
            bl = llIlIIIllIlI[3];
            "".length();
            if (null != null) {
                return ((0xC2 ^ 0xB1 ^ (0x5C ^ 0xB)) & (0x18 ^ 0x77 ^ (0x7B ^ 0x30) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIllIlI[0];
        }
        return bl;
    }

    public l Y() {
        return this.J;
    }

    private static boolean lIIIIIIllIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private int D() {
        return Inventory.getCount(this.a(e.aa)) + Inventory.getCount(this.a(e.Z));
    }

    public boolean h(int n2) {
        boolean bl;
        if (!c.lIIIIIIllIIIllI(i.CRYSTAL_ORB.aA().contains(n2) ? 1 : 0) || c.lIIIIIIllIIlIIl(i.CRYSTALLINE_BOWSTRING.aA().contains(n2) ? 1 : 0)) {
            bl = llIlIIIllIlI[3];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return ((125 + 106 - 134 + 49 ^ 6 + 74 - 58 + 119) & (0xA8 ^ 0x99 ^ (0x9E ^ 0xB0) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIllIlI[0];
        }
        return bl;
    }

    public void x() {
        this.b();
        this.D.register((Object)this);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2) {
        void var3_3;
        void lllllllllllllllIlIIIlIlIlllllIll;
        void lllllllllllllllIlIIIlIlIllllllII;
        Map<i, Integer> map = this.E();
        if (c.lIIIIIIllIIlIIl(f.TELEPORT_CRYSTAL.ac().contains(n2) ? 1 : 0) && c.lIIIIIIllIIlIIl(this.g(n2) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (!c.lIIIIIIllIIIllI(i.CRYSTAL_SHARD.aA().contains((int)lllllllllllllllIlIIIlIlIllllllII) ? 1 : 0) || c.lIIIIIIllIIllll(Inventory.getFreeSlots(), llIlIIIllIlI[1]) && c.lIIIIIIllIIlIIl(i.FISH.aA().contains((int)lllllllllllllllIlIIIlIlIllllllII) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        int lllllllllllllllIlIIIlIlIlllllIlI = llIlIIIllIlI[0];
        Iterator lllllllllllllllIlIIIlIlIlllllIIl = lllllllllllllllIlIIIlIlIlllllIll.entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlIlllllIIl.hasNext() ? 1 : 0)) {
            Map.Entry lllllllllllllllIlIIIlIlIlllllIII = lllllllllllllllIlIIIlIlIlllllIIl.next();
            i lllllllllllllllIlIIIlIlIllllIlll = (i)((Object)lllllllllllllllIlIIIlIlIlllllIII.getKey());
            if (c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIlIllllIlll.aA().contains((int)lllllllllllllllIlIIIlIlIllllllII) ? 1 : 0)) {
                "".length();
                if (((0xA7 ^ 0x95 ^ (0xA4 ^ 0xC5)) & (0xA2 ^ 0x9F ^ (0x5F ^ 0x31) ^ -" ".length())) <= "  ".length()) continue;
                return ((63 + 38 - 18 + 47 ^ 35 + 98 - 8 + 9) & (128 + 100 - 159 + 87 ^ 133 + 92 - 90 + 17 ^ -" ".length())) != 0;
            }
            lllllllllllllllIlIIIlIlIlllllIlI = llIlIIIllIlI[3];
            int lllllllllllllllIlIIIlIlIllllIllI = (Integer)lllllllllllllllIlIIIlIlIlllllIII.getValue();
            if (c.lIIIIIIllIlIIII(lllllllllllllllIlIIIlIlIllllIllI)) {
                return llIlIIIllIlI[0];
            }
            "".length();
            if ("   ".length() >= "   ".length()) continue;
            return ((0xF6 ^ 0xB4 ^ (0x47 ^ 0x5C)) & (0x6E ^ 0x57 ^ (0x58 ^ 0x38) ^ -" ".length())) != 0;
        }
        return (boolean)var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public Map<i, Integer> E() {
        int n2;
        c lllllllllllllllIlIIIlIlllIlIIlII;
        void lllllllllllllllIlIIIlIlllIlIIIll;
        HashMap<i, Integer> hashMap = new HashMap<i, Integer>();
        List<f> list = this.P();
        Iterator<f> lllllllllllllllIlIIIlIlllIlIIIIl22 = list.iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIlIIIIl22.hasNext() ? 1 : 0)) {
            f lllllllllllllllIlIIIlIlllIlIIIII = lllllllllllllllIlIIIlIlllIlIIIIl22.next();
            Iterator<Map.Entry<i, Integer>> lllllllllllllllIlIIIlIlllIIlllll = lllllllllllllllIlIIIlIlllIlIIIII.ag().entrySet().iterator();
            while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIIlllll.hasNext() ? 1 : 0)) {
                Map.Entry<i, Integer> lllllllllllllllIlIIIlIlllIIllllI = lllllllllllllllIlIIIlIlllIIlllll.next();
                int lllllllllllllllIlIIIlIlllIIlllIl = lllllllllllllllIlIIIlIlllIlIIIll.getOrDefault((Object)lllllllllllllllIlIIIlIlllIIllllI.getKey(), llIlIIIllIlI[0]);
                lllllllllllllllIlIIIlIlllIlIIIll.put(lllllllllllllllIlIIIlIlllIIllllI.getKey(), lllllllllllllllIlIIIlIlllIIlllIl += lllllllllllllllIlIIIlIlllIIllllI.getValue().intValue());
                "".length();
                "".length();
                if (null == null) continue;
                return null;
            }
            "".length();
            if ((0x74 ^ 0x70) >= (0x5F ^ 0x5B)) continue;
            return null;
        }
        int lllllllllllllllIlIIIlIlllIlIIIIl22 = Math.min(lllllllllllllllIlIIIlIlllIlIIlII.F.potionGoal(), llIlIIIllIlI[3]);
        if (c.lIIIIIIllIIlIlI((Object)lllllllllllllllIlIIIlIlllIlIIlII.H, (Object)d.PREPARE_BOSS_FIGHT)) {
            n2 = lllllllllllllllIlIIIlIlllIlIIlII.F.potionGoal() - lllllllllllllllIlIIIlIlllIlIIlII.C();
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        } else {
            n2 = lllllllllllllllIlIIIlIlllIlIIIIl22;
        }
        int lllllllllllllllIlIIIlIlllIlIIIII = n2;
        int lllllllllllllllIlIIIlIlllIIlllll = lllllllllllllllIlIIIlIlllIlIIIII * f.VIAL.ag().get((Object)i.CRYSTAL_SHARD);
        lllllllllllllllIlIIIlIlllIlIIIll.put(i.CRYSTAL_SHARD, lllllllllllllllIlIIIlIlllIlIIIll.getOrDefault((Object)i.CRYSTAL_SHARD, llIlIIIllIlI[0]) + lllllllllllllllIlIIIlIlllIIlllll);
        "".length();
        if (c.lIIIIIIllIIIlII((Object)lllllllllllllllIlIIIlIlllIlIIlII.H, (Object)d.EXTRA_FOOD_EXPLORE) && c.lIIIIIIllIIIlII((Object)lllllllllllllllIlIIIlIlllIlIIlII.H, (Object)d.PREPARE_BOSS_FIGHT)) {
            if (c.lIIIIIIllIIlIlI((Object)lllllllllllllllIlIIIlIlllIlIIlII.H, (Object)d.FIRST_ROTATION_EXPLORE)) {
                lllllllllllllllIlIIIlIlllIlIIIll.put(i.HERB, lllllllllllllllIlIIIlIlllIlIIIIl22);
                "".length();
                "".length();
                if (((0x6A ^ 8) & ~(0x32 ^ 0x50)) >= "   ".length()) {
                    return null;
                }
            } else {
                int lllllllllllllllIlIIIlIlllIIllllI = Inventory.getCount(lllllllllllllllIlIIIlIlllIlIIlII.a(e.aa));
                lllllllllllllllIlIIIlIlllIlIIIll.put(i.HERB, lllllllllllllllIlIIIlIlllIlIIlII.F.potionGoal() - lllllllllllllllIlIIIlIlllIIllllI);
                "".length();
            }
            if (c.lIIIIIIllIIlIll(lllllllllllllllIlIIIlIlllIlIIlII.F.fishGoal(), llIlIIIllIlI[4])) {
                lllllllllllllllIlIIIlIlllIlIIIll.put(i.FISH, lllllllllllllllIlIIIlIlllIlIIlII.F.fishGoal() / llIlIIIllIlI[5] * llIlIIIllIlI[6]);
                "".length();
                "".length();
                if ((0x6B ^ 4 ^ (0xC9 ^ 0xA2)) != (120 + 24 - 57 + 59 ^ 11 + 120 - 129 + 148)) {
                    return null;
                }
            } else {
                lllllllllllllllIlIIIlIlllIlIIIll.put(i.FISH, lllllllllllllllIlIIIlIlllIlIIlII.F.fishGoal() / llIlIIIllIlI[6] * llIlIIIllIlI[6]);
                "".length();
                "".length();
                if ("   ".length() >= (28 + 46 - -33 + 32 ^ 68 + 101 - 34 + 8)) {
                    return null;
                }
            }
        } else if (c.lIIIIIIllIIllII(Inventory.getFreeSlots())) {
            lllllllllllllllIlIIIlIlllIlIIIll.put(i.FISH, lllllllllllllllIlIIIlIlllIlIIlII.F.fishGoal());
            "".length();
        }
        Iterator lllllllllllllllIlIIIlIlllIIllllI = lllllllllllllllIlIIIlIlllIlIIIll.keySet().iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIIllllI.hasNext() ? 1 : 0)) {
            i lllllllllllllllIlIIIlIlllIIlllIl = (i)((Object)lllllllllllllllIlIIIlIlllIIllllI.next());
            int lllllllllllllllIlIIIlIlllIIlllII = llIlIIIllIlI[0];
            if (c.lIIIIIIllIIlIlI((Object)lllllllllllllllIlIIIlIlllIIlllIl, (Object)i.FISH)) {
                lllllllllllllllIlIIIlIlllIIlllII = lllllllllllllllIlIIIlIlllIlIIlII.F();
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            } else {
                lllllllllllllllIlIIIlIlllIIlllII = Inventory.getCount((boolean)llIlIIIllIlI[3], lllllllllllllllIlIIIlIlllIlIIlII.a(lllllllllllllllIlIIIlIlllIIlllIl.aA()));
            }
            lllllllllllllllIlIIIlIlllIlIIIll.put(lllllllllllllllIlIIIlIlllIIlllIl, (Integer)lllllllllllllllIlIIIlIlllIlIIIll.get((Object)lllllllllllllllIlIIIlIlllIIlllIl) - lllllllllllllllIlIIIlIlllIIlllII);
            "".length();
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        return hashMap;
    }

    private static boolean lIIIIIIllIIllII(int n2) {
        return n2 > 0;
    }

    public d W() {
        return this.H;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(f f2) {
        Iterator<Map.Entry<i, Integer>> lllllllllllllllIlIIIlIllIlllIIll = f2.ag().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIlllIIll.hasNext() ? 1 : 0)) {
            c lllllllllllllllIlIIIlIllIlllIlIl;
            void lllllllllllllllIlIIIlIllIlllIlII;
            Map.Entry<i, Integer> lllllllllllllllIlIIIlIllIlllIIlI = lllllllllllllllIlIIIlIllIlllIIll.next();
            if (c.lIIIIIIllIIIlll((Object)lllllllllllllllIlIIIlIllIlllIlII.af()) && c.lIIIIIIllIIIllI(Inventory.contains(lllllllllllllllIlIIIlIllIlllIlIl.a(lllllllllllllllIlIIIlIllIlllIlII.af().ac())) ? 1 : 0) && c.lIIIIIIllIIIllI(Equipment.contains(lllllllllllllllIlIIIlIllIlllIlIl.a(lllllllllllllllIlIIIlIllIlllIlII.af().ac())) ? 1 : 0) && c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllIlllIlIl.a(lllllllllllllllIlIIIlIllIlllIlII.af()) ? 1 : 0)) {
                return llIlIIIllIlI[0];
            }
            if (c.lIIIIIIllIIllIl(lllllllllllllllIlIIIlIllIlllIIlI.getKey().aC(), lllllllllllllllIlIIIlIllIlllIIlI.getValue())) {
                return llIlIIIllIlI[0];
            }
            "".length();
            if ((3 ^ 7) == (0x61 ^ 0x65)) continue;
            return ((0x5D ^ 6) & ~(0x16 ^ 0x4D)) != 0;
        }
        return llIlIIIllIlI[3];
    }

    public Item a(i i2) {
        return Inventory.getFirst(item -> i2.aA().contains(item.getId()));
    }

    public List<Item> b(i i2) {
        return Inventory.getAll(item -> i2.aA().contains(item.getId()));
    }

    public List<f> I() {
        List<f> list = this.P();
        list.removeIf(f2 -> {
            boolean bl;
            if (c.lIIIIIIllIIIllI(this.a((f)((Object)f2)) ? 1 : 0)) {
                bl = llIlIIIllIlI[3];
                "".length();
                if (null != null) {
                    return ((0xB2 ^ 0xA7) & ~(0xA1 ^ 0xB4) & ~((0x97 ^ 0xA7) & ~(0xB1 ^ 0x81))) != 0;
                }
            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        });
        "".length();
        return list;
    }

    /*
     * WARNING - void declaration
     */
    public int M() {
        void var2_2;
        void lllllllllllllllIlIIIlIllIlIlIIlI;
        Widget widget = Widgets.get((int)WidgetInfo.GAUNTLET_TIMER_CONTAINER.getGroupId(), (int)llIlIIIllIlI[6]);
        if (c.lIIIIIIllIIlIII(widget)) {
            return llIlIIIllIlI[0];
        }
        String lllllllllllllllIlIIIlIllIlIlIIIl = lllllllllllllllIlIIIlIllIlIlIIlI.getText();
        if (c.lIIIIIIllIIlIII(lllllllllllllllIlIIIlIllIlIlIIIl)) {
            return llIlIIIllIlI[0];
        }
        String[] stringArray = var2_2.split(llIlIIIllIIl[llIlIIIllIlI[3]]);
        int n2 = Integer.parseInt(stringArray[llIlIIIllIlI[3]].trim());
        int n3 = Integer.parseInt(stringArray[llIlIIIllIlI[9]].trim());
        return n3 + n2 * llIlIIIllIlI[10];
    }

    public l ab() {
        return this.M;
    }

    private static void lIIIIIIlIlIIIll() {
        llIlIIIllIlI = new int[11];
        c.llIlIIIllIlI[0] = (0x64 ^ 0x3E ^ (0xE3 ^ 0xA3)) & (0xC6 ^ 0xB6 ^ (0xAE ^ 0xC4) ^ -" ".length());
        c.llIlIIIllIlI[1] = "   ".length();
        c.llIlIIIllIlI[2] = -(0xFFFFB77E & 0x5CA3) & (0xFFFFB7FF & 0x7FFB);
        c.llIlIIIllIlI[3] = " ".length();
        c.llIlIIIllIlI[4] = 0x87 ^ 0x8D;
        c.llIlIIIllIlI[5] = 0x75 ^ 0x59 ^ (0x36 ^ 0x12);
        c.llIlIIIllIlI[6] = 0x6E ^ 0x4B ^ (0x11 ^ 0x30);
        c.llIlIIIllIlI[7] = 0x5F ^ 0x7F;
        c.llIlIIIllIlI[8] = 0xC3 ^ 0xC6;
        c.llIlIIIllIlI[9] = "  ".length();
        c.llIlIIIllIlI[10] = 0xFC ^ 0xA7 ^ (0xD2 ^ 0xB5);
    }

    public boolean S() {
        int n2;
        if (!c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.FIRST_ROTATION_EXPLORE) || !c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.DEMI_BOSS_EXPLORE) || !c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.WEAPON_FRAME_EXPLORE) || c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIlIIIllIlI[3];
            "".length();
            if (null != null) {
                return ((0xBA ^ 0x8C ^ (0x7E ^ 0x1B)) & (0xCE ^ 0x96 ^ (0xB4 ^ 0xBF) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIlIIIllIlI[0];
        }
        return n2 != 0;
    }

    private void b(WorldPoint worldPoint) {
        Player player = Players.getLocal();
        if (c.lIIIIIIllIIllIl(player.distanceTo(worldPoint), llIlIIIllIlI[8])) {
            Movement.setDestination((WorldPoint)worldPoint);
        }
        Movement.walkTo((WorldPoint)worldPoint, (boolean)llIlIIIllIlI[0]);
        "".length();
    }

    private static boolean lIIIIIIllIIIlII(Object object, Object object2) {
        return object != object2;
    }

    private <T extends Identifiable> Predicate<T> a(List<Integer> list) {
        return identifiable -> list.contains(identifiable.getId());
    }

    private static boolean lIIIIIIllIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public List<f> K() {
        void var1_1;
        if (c.lIIIIIIllIIlIII(this.I)) {
            return Collections.emptyList();
        }
        ArrayList<f> lllllllllllllllIlIIIlIllIlIllIll = new ArrayList<f>();
        f lllllllllllllllIlIIIlIllIlIllIlI = f.TIER_3_STAFF;
        while (c.lIIIIIIllIIIlll((Object)lllllllllllllllIlIIIlIllIlIllIlI) && c.lIIIIIIllIIIllI(Inventory.contains((int[])lllllllllllllllIlIIIlIllIlIllIlI.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Equipment.contains((int[])lllllllllllllllIlIIIlIllIlIllIlI.ad()) ? 1 : 0)) {
            lllllllllllllllIlIIIlIllIlIllIll.add(lllllllllllllllIlIIIlIllIlIllIlI);
            "".length();
            lllllllllllllllIlIIIlIllIlIllIlI = lllllllllllllllIlIIIlIllIlIllIlI.af();
            "".length();
            if ("  ".length() > " ".length()) continue;
            return null;
        }
        Collections.reverse(var1_1);
        return var1_1;
    }

    public GameObject U() {
        GameObject gameObject;
        l l2 = this.T();
        this.L = gameObject = this.a(l2);
        return gameObject;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(int ... nArray) {
        void lllllllllllllllIlIIIlIllIIIIlIII;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int lllllllllllllllIlIIIlIllIIIIIlll = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(lllllllllllllllIlIIIlIllIIIIIlll, (int)lllllllllllllllIlIIIlIllIIIIlIII)) {
            c lllllllllllllllIlIIIlIllIIIIlIll;
            void lllllllllllllllIlIIIlIllIIIIlIIl;
            void lllllllllllllllIlIIIlIllIIIIIllI = lllllllllllllllIlIIIlIllIIIIlIIl[lllllllllllllllIlIIIlIllIIIIIlll];
            if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIIIIlIll.f((int)lllllllllllllllIlIIIlIllIIIIIllI) ? 1 : 0)) {
                return llIlIIIllIlI[3];
            }
            ++lllllllllllllllIlIIIlIllIIIIIlll;
            "".length();
            if (-(0x5C ^ 0x69 ^ (0x64 ^ 0x55)) < 0) continue;
            return ((0x40 ^ 0x5B ^ " ".length()) & (0xD7 ^ 0xC6 ^ (0x4F ^ 0x44) ^ -" ".length())) != 0;
        }
        return llIlIIIllIlI[0];
    }

    /*
     * WARNING - void declaration
     */
    public g J() {
        void var1_2;
        g lllllllllllllllIlIIIlIllIllIlIlI2;
        c lllllllllllllllIlIIIlIllIllIlIll;
        if (c.lIIIIIIllIIlIIl(this.F.makeT3Offhand() ? 1 : 0)) {
            g g2;
            void lllllllllllllllIlIIIlIllIllIlIlI2;
            void lllllllllllllllIlIIIlIllIllIlIIl;
            ArrayList<g> arrayList = new ArrayList<g>();
            Map<i, Integer> map = this.E();
            if (c.lIIIIIIllIIlIIl(map.containsKey((Object)i.CRYSTAL_ORB) ? 1 : 0) && c.lIIIIIIllIIIllI(i.CRYSTAL_ORB.aC()) && c.lIIIIIIllIIIllI(Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0)) {
                arrayList.add(g.DRAGON);
                "".length();
            }
            if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIllIlIIl.containsKey((Object)i.CRYSTALLINE_BOWSTRING) ? 1 : 0) && c.lIIIIIIllIIIllI(i.CRYSTALLINE_BOWSTRING.aC()) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_3_BOW.ad()) ? 1 : 0)) {
                lllllllllllllllIlIIIlIllIllIlIlI2.add(g.DARK_BEAST);
                "".length();
            }
            Iterator lllllllllllllllIlIIIlIllIllIlIII = lllllllllllllllIlIIIlIllIllIlIlI2.iterator();
            while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIllIlIII.hasNext() ? 1 : 0)) {
                g lllllllllllllllIlIIIlIllIllIIlll = (g)((Object)lllllllllllllllIlIIIlIllIllIlIII.next());
                NPC lllllllllllllllIlIIIlIllIllIIllI = NPCs.getNearest((int[])lllllllllllllllIlIIIlIllIllIIlll.ah());
                if (c.lIIIIIIllIIIlll(lllllllllllllllIlIIIlIllIllIIllI)) {
                    return lllllllllllllllIlIIIlIllIllIIlll;
                }
                "".length();
                if (" ".length() != (20 + 101 - 35 + 92 ^ 126 + 178 - 169 + 47)) continue;
                return null;
            }
            if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIllIlIlI2.isEmpty() ? 1 : 0)) {
                g2 = null;
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            } else {
                g2 = (g)((Object)lllllllllllllllIlIIIlIllIllIlIlI2.get(llIlIIIllIlI[0]));
            }
            return g2;
        }
        if (c.lIIIIIIllIIIlII(lllllllllllllllIlIIIlIllIllIlIll.I.aD(), HeadIcon.MAGIC)) {
            lllllllllllllllIlIIIlIllIllIlIlI2 = g.DRAGON;
            "".length();
            if ("   ".length() >= (0x9C ^ 0x98)) {
                return null;
            }
        } else {
            lllllllllllllllIlIIIlIllIllIlIlI2 = g.DARK_BEAST;
        }
        if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIllIlIll.a(lllllllllllllllIlIIIlIllIllIlIlI2) ? 1 : 0)) {
            return null;
        }
        return var1_2;
    }

    public void a(d d2) {
        this.H = d2;
    }

    public boolean O() {
        if (c.lIIIIIIllIIlIIl(this.a((i i2) -> {
            boolean bl;
            if (c.lIIIIIIllIIlIlI(i2, (Object)i.FISH)) {
                bl = llIlIIIllIlI[3];
                "".length();
                if (-" ".length() > 0) {
                    return ((0x64 ^ 0x3E ^ (0x54 ^ 0x33)) & (4 ^ 0x49 ^ (0x1F ^ 0x6F) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        }) ? 1 : 0)) {
            boolean bl;
            int n2 = this.h().fishGoal() - this.h().fishGoalDeviation();
            if (c.lIIIIIIllIIlllI(n2, this.F())) {
                bl = llIlIIIllIlI[3];
                "".length();
                if (null != null) {
                    return ((50 + 53 - 83 + 114 ^ 114 + 161 - 145 + 64) & (107 + 43 - 117 + 172 ^ 101 + 99 - 76 + 13 ^ -" ".length())) != 0;
                }
            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        }
        return llIlIIIllIlI[0];
    }

    @Inject
    public c(EventBus eventBus, Client client, GauntletConfig gauntletConfig) {
        this.H = d.OUTSIDE;
        this.N = llIlIIIllIlI[0];
        this.D = eventBus;
        this.E = client;
        this.F = gauntletConfig;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void var3_3;
        void lllllllllllllllIlIIIlIlllIllIlII;
        c lllllllllllllllIlIIIlIlllIllIlIl;
        this.c(npcSpawned.getNpc());
        g g2 = g.i(npcSpawned.getNpc().getId());
        if (c.lIIIIIIllIIlIII((Object)g2)) {
            return;
        }
        l lllllllllllllllIlIIIlIlllIllIIlI = lllllllllllllllIlIIIlIlllIllIlIl.V().d(lllllllllllllllIlIIIlIlllIllIlII.getNpc().getWorldLocation());
        if (c.lIIIIIIllIIlIII(lllllllllllllllIlIIIlIlllIllIIlI)) {
            return;
        }
        var3_3.b(g2);
    }

    private static boolean lIIIIIIllIIIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Predicate<i> predicate) {
        c lllllllllllllllIlIIIlIllIIlllIIl;
        ItemContainer itemContainer = this.E.getItemContainer(InventoryID.INVENTORY);
        if (c.lIIIIIIllIIlIII(itemContainer)) {
            return llIlIIIllIlI[0];
        }
        Iterator<Map.Entry<i, Integer>> lllllllllllllllIlIIIlIllIIllIllI = lllllllllllllllIlIIIlIllIIlllIIl.E().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIIllIllI.hasNext() ? 1 : 0)) {
            void lllllllllllllllIlIIIlIllIIlllIII;
            Map.Entry<i, Integer> lllllllllllllllIlIIIlIllIIllIlIl = lllllllllllllllIlIIIlIllIIllIllI.next();
            if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIIlllIII.test(lllllllllllllllIlIIIlIllIIllIlIl.getKey()) ? 1 : 0)) {
                "".length();
                if (-"   ".length() < 0) continue;
                return (" ".length() & ~" ".length()) != 0;
            }
            int lllllllllllllllIlIIIlIllIIllIlII = lllllllllllllllIlIIIlIllIIllIlIl.getValue();
            if (c.lIIIIIIllIIllII(lllllllllllllllIlIIIlIllIIllIlII)) {
                return llIlIIIllIlI[0];
            }
            "".length();
            if (null == null) continue;
            return ((0x91 ^ 0xB4) & ~(8 ^ 0x2D)) != 0;
        }
        return llIlIIIllIlI[3];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(l l2, WorldPoint worldPoint) {
        void lllllllllllllllIlIIIlIlllIIlIIIl;
        void lllllllllllllllIlIIIlIlllIIlIIlI;
        c lllllllllllllllIlIIIlIlllIIlIIll;
        this.M = this.G.d(worldPoint);
        if (c.lIIIIIIllIIlIII(this.M)) {
            return llIlIIIllIlI[0];
        }
        if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIIlIIll.M.e((l)lllllllllllllllIlIIIlIlllIIlIIlI) ? 1 : 0)) {
            if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIIlIIlI.aY() ? 1 : 0)) {
                lllllllllllllllIlIIIlIlllIIlIIll.J = null;
                lllllllllllllllIlIIIlIlllIIlIIll.K = Collections.emptyList();
                lllllllllllllllIlIIIlIlllIIlIIll.b(lllllllllllllllIlIIIlIlllIIlIIlI.aQ());
                return llIlIIIllIlI[3];
            }
            lllllllllllllllIlIIIlIlllIIlIIll.J = lllllllllllllllIlIIIlIlllIIlIIlI;
            lllllllllllllllIlIIIlIlllIIlIIll.K = Collections.emptyList();
            return lllllllllllllllIlIIIlIlllIIlIIll.a(lllllllllllllllIlIIIlIlllIIlIIll.M, (l)lllllllllllllllIlIIIlIlllIIlIIlI);
        }
        List<l> lllllllllllllllIlIIIlIlllIIlIIII = lllllllllllllllIlIIIlIlllIIlIIll.G.a((WorldPoint)lllllllllllllllIlIIIlIlllIIlIIIl, (l)lllllllllllllllIlIIIlIlllIIlIIlI);
        if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIIlIIII.isEmpty() ? 1 : 0)) {
            lllllllllllllllIlIIIlIlllIIlIIll.J = null;
            return llIlIIIllIlI[3];
        }
        Collections.reverse(lllllllllllllllIlIIIlIlllIIlIIII);
        lllllllllllllllIlIIIlIlllIIlIIll.K = lllllllllllllllIlIIIlIlllIIlIIII;
        Player lllllllllllllllIlIIIlIlllIIIllll = Players.getLocal();
        lllllllllllllllIlIIIlIlllIIlIIll.J = null;
        int lllllllllllllllIlIIIlIlllIIIlllI = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(lllllllllllllllIlIIIlIlllIIIlllI, lllllllllllllllIlIIIlIlllIIlIIII.size())) {
            l lllllllllllllllIlIIIlIlllIIIllIl = lllllllllllllllIlIIIlIlllIIlIIII.get(lllllllllllllllIlIIIlIlllIIIlllI);
            if (c.lIIIIIIllIIIlIl(lllllllllllllllIlIIIlIlllIIIllIl.aO(), llIlIIIllIlI[1]) && c.lIIIIIIllIIIlIl(lllllllllllllllIlIIIlIlllIIIllIl.aP(), llIlIIIllIlI[1])) {
                return llIlIIIllIlI[0];
            }
            if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIIIllIl.aY() ? 1 : 0) && c.lIIIIIIllIIlllI(lllllllllllllllIlIIIlIlllIIIllIl.aQ().distanceTo(lllllllllllllllIlIIIlIlllIIIllll.getWorldLocation()), llIlIIIllIlI[7]) && c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIlllIIIllIl.e(lllllllllllllllIlIIIlIlllIIIllll.getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIlIIIlIlllIIlIIll.b(lllllllllllllllIlIIIlIlllIIIllIl.aQ());
                return llIlIIIllIlI[3];
            }
            if (c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIlllIIIllIl.aY() ? 1 : 0)) {
                l l3;
                if (c.lIIIIIIllIIllII(lllllllllllllllIlIIIlIlllIIIlllI)) {
                    l3 = lllllllllllllllIlIIIlIlllIIlIIII.get(lllllllllllllllIlIIIlIlllIIIlllI - llIlIIIllIlI[3]);
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((97 + 82 - 64 + 14 ^ 184 + 142 - 142 + 12) & (0xB3 ^ 0x9F ^ (0xA8 ^ 0xC1) ^ -" ".length())) != 0;
                    }
                } else {
                    l3 = lllllllllllllllIlIIIlIlllIIlIIll.M;
                }
                l lllllllllllllllIlIIIlIlllIIIllII = l3;
                lllllllllllllllIlIIIlIlllIIlIIll.a(lllllllllllllllIlIIIlIlllIIIllII, lllllllllllllllIlIIIlIlllIIIllIl);
                "".length();
                return llIlIIIllIlI[3];
            }
            ++lllllllllllllllIlIIIlIlllIIIlllI;
            "".length();
            if ((0x10 ^ 0x15) != 0) continue;
            return ((0xE5 ^ 0xA1) & ~(0x3B ^ 0x7F)) != 0;
        }
        return llIlIIIllIlI[3];
    }

    public h V() {
        return this.G;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        c lllllllllllllllIlIIIlIllllIIIIll;
        if (c.lIIIIIIllIIIlII(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        if (c.lIIIIIIllIIIllI(lllllllllllllllIlIIIlIllllIIIIll.A() ? 1 : 0)) {
            if (c.lIIIIIIllIIIlll(lllllllllllllllIlIIIlIllllIIIIll.G)) {
                lllllllllllllllIlIIIlIllllIIIIll.G.ao();
                lllllllllllllllIlIIIlIllllIIIIll.G = null;
            }
            lllllllllllllllIlIIIlIllllIIIIll.H = d.OUTSIDE;
        }
    }

    public l T() {
        c lllllllllllllllIlIIIlIlIlllIllII;
        if (c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            this.M = this.V().as();
            return this.M;
        }
        if (c.lIIIIIIllIIlIlI((Object)lllllllllllllllIlIIIlIlIlllIllII.W(), (Object)d.DEMI_BOSS_EXPLORE)) {
            Player lllllllllllllllIlIIIlIlIlllIlIll = lllllllllllllllIlIIIlIlIlllIllII.E.getLocalPlayer();
            if (c.lIIIIIIllIIlIII(lllllllllllllllIlIIIlIlIlllIlIll)) {
                return null;
            }
            g lllllllllllllllIlIIIlIlIlllIlIlI = lllllllllllllllIlIIIlIlIlllIllII.J();
            if (c.lIIIIIIllIIlIII((Object)lllllllllllllllIlIIIlIlIlllIlIlI)) {
                return null;
            }
            if (c.lIIIIIIllIIllII(Inventory.getCount((boolean)llIlIIIllIlI[3], lllllllllllllllIlIIIlIlIlllIllII.a(lllllllllllllllIlIIIlIlIlllIlIlI.an().aA())))) {
                return null;
            }
            lllllllllllllllIlIIIlIlIlllIllII.M = lllllllllllllllIlIIIlIlIlllIllII.V().d(lllllllllllllllIlIIIlIlIlllIlIll.getWorldLocation());
            return lllllllllllllllIlIIIlIlIlllIllII.M;
        }
        return null;
    }

    private boolean b(f f2) {
        boolean bl;
        if (!c.lIIIIIIllIIIllI(Inventory.contains(item -> f2.ac().contains(item.getId())) ? 1 : 0) || c.lIIIIIIllIIlIIl(Equipment.contains(item -> f2.ac().contains(item.getId())) ? 1 : 0)) {
            bl = llIlIIIllIlI[3];
            "".length();
            if ((6 ^ 2) < 0) {
                return ("  ".length() & ~"  ".length()) != 0;
            }
        } else {
            bl = llIlIIIllIlI[0];
        }
        return bl;
    }

    private int C() {
        List<Integer> list = f.VIAL.ac();
        List list2 = list.stream().map(n2 -> n2 + llIlIIIllIlI[3]).collect(Collectors.toList());
        ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
        arrayList.addAll(list2);
        "".length();
        return Inventory.getCount(this.a(arrayList)) + this.D();
    }

    private static void lIIIIIIlIlIIIlI() {
        llIlIIIllIIl = new String[llIlIIIllIlI[9]];
        c.llIlIIIllIIl[c.llIlIIIllIlI[0]] = c.lIIIIIIlIlIIIII("IRkdMB0=", "mpzXi");
        c.llIlIIIllIIl[c.llIlIIIllIlI[3]] = c.lIIIIIIlIlIIIIl("3TWOzZ5D904=", "HGrmF");
    }

    private static String lIIIIIIlIlIIIII(String lllllllllllllllIlIIIlIlIlIllllll, String lllllllllllllllIlIIIlIlIlIlllIIl) {
        lllllllllllllllIlIIIlIlIlIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlIlIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIlIlIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIlIIIlIlIlIllllII = lllllllllllllllIlIIIlIlIlIlllIIl.toCharArray();
        int lllllllllllllllIlIIIlIlIlIlllIll = llIlIIIllIlI[0];
        char[] lllllllllllllllIlIIIlIlIlIllIlIl = lllllllllllllllIlIIIlIlIlIllllll.toCharArray();
        int lllllllllllllllIlIIIlIlIlIllIlII = lllllllllllllllIlIIIlIlIlIllIlIl.length;
        int lllllllllllllllIlIIIlIlIlIllIIll = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(lllllllllllllllIlIIIlIlIlIllIIll, lllllllllllllllIlIIIlIlIlIllIlII)) {
            char lllllllllllllllIlIIIlIlIllIIIIII = lllllllllllllllIlIIIlIlIlIllIlIl[lllllllllllllllIlIIIlIlIlIllIIll];
            lllllllllllllllIlIIIlIlIlIllllIl.append((char)(lllllllllllllllIlIIIlIlIllIIIIII ^ lllllllllllllllIlIIIlIlIlIllllII[lllllllllllllllIlIIIlIlIlIlllIll % lllllllllllllllIlIIIlIlIlIllllII.length]));
            "".length();
            ++lllllllllllllllIlIIIlIlIlIlllIll;
            ++lllllllllllllllIlIIIlIlIlIllIIll;
            "".length();
            if (((0xD9 ^ 0x82) & ~(0xE ^ 0x55)) < " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIlIlIlIllllIl);
    }

    public boolean A() {
        int n2;
        if (c.lIIIIIIllIIIlII(Game.getState(), GameState.LOGIN_SCREEN) && c.lIIIIIIllIIIlIl(Vars.getBit((int)llIlIIIllIlI[2]), llIlIIIllIlI[3])) {
            n2 = llIlIIIllIlI[3];
            "".length();
            if (-(62 + 23 - -2 + 46 ^ 67 + 17 - 13 + 57) >= 0) {
                return ((0x63 ^ 0x52 ^ (0x79 ^ 5)) & (0x34 ^ 0x4C ^ (0x22 ^ 0x17) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIlIIIllIlI[0];
        }
        return n2 != 0;
    }

    public boolean B() {
        boolean bl;
        if (c.lIIIIIIllIIIllI(i.WEAPON_FRAME.aC())) {
            bl = llIlIIIllIlI[3];
            "".length();
            if (((0x2A ^ 0x2C) & ~(0x89 ^ 0x8F)) != 0) {
                return ((0xE4 ^ 0xA3) & ~(4 ^ 0x43)) != 0;
            }
        } else {
            bl = llIlIIIllIlI[0];
        }
        return bl;
    }

    public void y() {
        this.b();
        this.D.unregister((Object)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean g(int n2) {
        int n3;
        block3: {
            block2: {
                if (!c.lIIIIIIllIIlllI(Inventory.getFreeSlots(), llIlIIIllIlI[3])) break block2;
                int[] nArray = new int[llIlIIIllIlI[3]];
                nArray[c.llIlIIIllIlI[0]] = n2;
                if (!c.lIIIIIIllIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            n3 = llIlIIIllIlI[3];
            "".length();
            if ((0x18 ^ 0x1C) >= " ".length()) return n3 != 0;
            return ((0xE ^ 0x2D) & ~(0xE4 ^ 0xC7)) != 0;
        }
        n3 = llIlIIIllIlI[0];
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(g g2) {
        boolean bl;
        c lllllllllllllllIlIIIlIllIllIIIll;
        void lllllllllllllllIlIIIlIllIllIIIlI;
        if (c.lIIIIIIllIIlIlI((Object)g2, (Object)g.DRAGON) && c.lIIIIIIllIIlIIl(this.b(f.TIER_3_STAFF) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (c.lIIIIIIllIIlIlI(lllllllllllllllIlIIIlIllIllIIIlI, (Object)g.DARK_BEAST) && c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIllIIIll.b(f.TIER_3_BOW) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (c.lIIIIIIllIIllII(lllllllllllllllIlIIIlIllIllIIIlI.an().aC())) {
            bl = llIlIIIllIlI[3];
            "".length();
            if ("  ".length() == " ".length()) {
                return ((0xB3 ^ 0xC0 ^ (0x91 ^ 0xC2)) & (0xD5 ^ 0xA7 ^ (0xEF ^ 0xBD) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIllIlI[0];
        }
        return bl;
    }

    public j X() {
        return this.I;
    }

    /*
     * WARNING - void declaration
     */
    public List<Integer> Q() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Map<i, Integer> map = this.E();
        Iterator<Map.Entry<i, Integer>> lllllllllllllllIlIIIlIllIIIlIlIl = map.entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIIIlIlIl.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> lllllllllllllllIlIIIlIllIIIlIlII = lllllllllllllllIlIIIlIllIIIlIlIl.next();
            i lllllllllllllllIlIIIlIllIIIlIIll = lllllllllllllllIlIIIlIllIIIlIlII.getKey();
            int lllllllllllllllIlIIIlIllIIIlIIlI = lllllllllllllllIlIIIlIllIIIlIlII.getValue();
            if (c.lIIIIIIllIIllII(lllllllllllllllIlIIIlIllIIIlIIlI)) {
                void lllllllllllllllIlIIIlIllIIIlIlll;
                lllllllllllllllIlIIIlIllIIIlIlll.addAll(lllllllllllllllIlIIIlIllIIIlIIll.az());
                "".length();
            }
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        return arrayList;
    }

    public boolean R() {
        boolean bl;
        if (!c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.FIRST_ROTATION_CREATE) || c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.PREPARE_BOSS_FIGHT)) {
            bl = llIlIIIllIlI[3];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((0xAF ^ 0xA7) & ~(0x82 ^ 0x8A)) != 0;
            }
        } else {
            bl = llIlIIIllIlI[0];
        }
        return bl;
    }

    private static String lIIIIIIlIlIIIIl(String lllllllllllllllIlIIIlIlIlIlIlIlI, String lllllllllllllllIlIIIlIlIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlIlIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlIlIlIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlIlIlIlIllII.init(llIlIIIllIlI[9], lllllllllllllllIlIIIlIlIlIlIllIl);
            return new String(lllllllllllllllIlIIIlIlIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlIlIlIlIlIll) {
            lllllllllllllllIlIIIlIlIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private GameObject a(l l2) {
        Player player = this.E.getLocalPlayer();
        if (c.lIIIIIIllIIlIII(player)) {
            return null;
        }
        List<Integer> list = this.Q();
        return (GameObject)TileObjects.getNearest(tileObject -> {
            int n2;
            if (c.lIIIIIIllIIlIIl(list.contains(tileObject.getId()) ? 1 : 0) && (!c.lIIIIIIllIIIlll(l2) || c.lIIIIIIllIIlIIl(l2.e(tileObject.getWorldLocation()) ? 1 : 0))) {
                n2 = llIlIIIllIlI[3];
                "".length();
                if (null != null) {
                    return ((85 + 37 - 107 + 183 ^ 133 + 89 - 100 + 22) & (58 + 183 - 101 + 92 ^ 46 + 89 - -3 + 52 ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIlIIIllIlI[0];
            }
            return n2 != 0;
        });
    }

    private void b() {
        this.N = llIlIIIllIlI[0];
        this.M = null;
        this.L = null;
        this.K = null;
        this.J = null;
        this.I = null;
        this.H = d.OUTSIDE;
        this.G = null;
    }

    public boolean N() {
        c lllllllllllllllIlIIIlIllIlIIlIII;
        ItemContainer itemContainer = this.E.getItemContainer(InventoryID.INVENTORY);
        if (c.lIIIIIIllIIlIII(itemContainer)) {
            return llIlIIIllIlI[0];
        }
        Iterator<Map.Entry<i, Integer>> lllllllllllllllIlIIIlIllIlIIIllI = lllllllllllllllIlIIIlIllIlIIlIII.E().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIlIIIllI.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> lllllllllllllllIlIIIlIllIlIIIlIl = lllllllllllllllIlIIIlIllIlIIIllI.next();
            int lllllllllllllllIlIIIlIllIlIIIlII = lllllllllllllllIlIIIlIllIlIIIlIl.getValue();
            if (c.lIIIIIIllIIllII(lllllllllllllllIlIIIlIllIlIIIlII)) {
                return llIlIIIllIlI[0];
            }
            "".length();
            if (-" ".length() <= 0) continue;
            return ((0x3C ^ 0x38) & ~(0x94 ^ 0x90)) != 0;
        }
        return llIlIIIllIlI[3];
    }

    private static boolean lIIIIIIllIIIlll(Object object) {
        return object != null;
    }

    public int F() {
        return i.FISH.aC() + Inventory.getCount(item -> e.aH.contains(item.getId())) + this.G.av().bb();
    }

    private static boolean lIIIIIIllIIlIII(Object object) {
        return object == null;
    }

    public f L() {
        if (c.lIIIIIIllIIlIII(this.I)) {
            return null;
        }
        return f.TIER_2_BOW;
    }

    static {
        c.lIIIIIIlIlIIIll();
        c.lIIIIIIlIlIIIlI();
        C = LoggerFactory.getLogger(c.class);
    }

    private void c(NPC nPC) {
        if (c.lIIIIIIllIIIllI(e.aw.contains(nPC.getName()) ? 1 : 0)) {
            return;
        }
        this.I = new j(nPC);
    }

    private static boolean lIIIIIIllIlIIII(int n2) {
        return n2 <= 0;
    }

    private void a(WorldPoint worldPoint) {
        l l2 = l.a(worldPoint, new Point(llIlIIIllIlI[1], llIlIIIllIlI[1]));
        this.G = new h(Objects.requireNonNull(this.E.getLocalPlayer()).getWorldLocation(), l2);
        this.H = d.FIRST_ROTATION_EXPLORE;
    }

    private static boolean lIIIIIIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIllIIlllI(int n2, int n3) {
        return n2 <= n3;
    }
}

