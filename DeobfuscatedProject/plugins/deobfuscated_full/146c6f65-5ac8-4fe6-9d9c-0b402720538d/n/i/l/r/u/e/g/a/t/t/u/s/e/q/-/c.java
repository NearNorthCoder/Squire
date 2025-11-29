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
        WorldPoint var74 = Movement.getDestination();
        if (c.lIIIIIIllIIlIIl(Players.getLocal().isMoving() ? 1 : 0) && c.lIIIIIIllIIIlll(var74) && c.lIIIIIIllIIlIll(var74.distanceTo((Locatable)Players.getLocal()), llIlIIIllIlI[9])) {
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
        f var10;
        int n3;
        c var8;
        List<Object> list;
        if (c.lIIIIIIllIIlIIl(this.F.makeArmour() ? 1 : 0)) {
            list = List.of(f.TIER_1_BODY, f.TIER_1_LEGS, f.TIER_1_HELM);
            0;
            if (((0x33 ^ 0x7E) & ~(0xC ^ 0x41)) >= 1) {
                return null;
            }
        } else {
            list = new ArrayList();
        }
        List<Object> var15 = list;
        ArrayList<f> var79 = new ArrayList<f>();
        List<f> var90 = var8.K();
        if (c.lIIIIIIllIIIllI(var90.isEmpty() ? 1 : 0)) {
            var79.add(var90.get(llIlIIIllIlI[0]));
            0;
            var90.remove(llIlIIIllIlI[0]);
            0;
        }
        int var31 = Math.min(var8.F.potionGoal(), llIlIIIllIlI[3]);
        if (!c.lIIIIIIllIIIlII((Object)var8.H, (Object)d.PREPARE_BOSS_FIGHT) || c.lIIIIIIllIIlIlI((Object)var8.H, (Object)d.DEMI_BOSS_EXPLORE)) {
            n3 = var8.F.potionGoal() - var8.C();
            0;
            if (2 <= 0) {
                return null;
            }
        } else {
            n3 = var31 - var8.C();
        }
        int var88 = n3;
        int var34 = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(var34, var88)) {
            var79.add(f.VIAL);
            0;
            ++var34;
            0;
            if (((0x3E ^ 0x79 ^ (0xF2 ^ 0x82)) & (0x4C ^ 0x74 ^ (0x6E ^ 0x61) ^ -1)) == 0) continue;
            return null;
        }
        var79.addAll(var15);
        0;
        var79.addAll(var90);
        0;
        var34 = Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0;
        if ((!c.lIIIIIIllIIIllI(var34) || c.lIIIIIIllIIlIIl(var79.contains((Object)f.TIER_3_STAFF) ? 1 : 0)) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_2_BOW.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_3_BOW.ad()) ? 1 : 0)) {
            var79.add(f.TIER_1_BOW);
            0;
        }
        if (c.lIIIIIIllIIlIIl(var8.F.makeT2Offhand() ? 1 : 0)) {
            var10 = var8.L();
            if (c.lIIIIIIllIIIlll((Object)var10)) {
                if (c.lIIIIIIllIIIllI(Inventory.contains((int[])var10.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Inventory.contains((int[])var10.af().ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(var79.contains((Object)var10.af()) ? 1 : 0)) {
                    var79.add(var10.af());
                    0;
                }
                var79.add(var10);
                0;
            }
            0;
            if (((0x15 ^ 0x4A) & ~(0x27 ^ 0x78)) < 0) {
                return null;
            }
        } else if (c.lIIIIIIllIIlIIl(var8.F.makeT3Offhand() ? 1 : 0) && c.lIIIIIIllIIIlll((Object)(var10 = var8.L()))) {
            f var54;
            f f3;
            if (c.lIIIIIIllIIlIlI((Object)var10, (Object)f.TIER_2_BOW)) {
                f3 = f.TIER_3_BOW;
                0;
                if (-1 >= (0x21 ^ 0x25)) {
                    return null;
                }
            } else {
                f3 = f.TIER_3_STAFF;
            }
            if (c.lIIIIIIllIIIllI(Inventory.contains((int[])(var54 = f3).ad()) ? 1 : 0)) {
                if (c.lIIIIIIllIIIllI(Inventory.contains((int[])var10.ad()) ? 1 : 0)) {
                    f var69 = var10.af();
                    if (c.lIIIIIIllIIIllI(Inventory.contains((int[])var69.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(var79.contains((Object)var69) ? 1 : 0)) {
                        var79.add(var69);
                        0;
                    }
                    if (c.lIIIIIIllIIIllI(var79.contains((Object)var10) ? 1 : 0)) {
                        var79.add(var10);
                        0;
                    }
                }
                var79.add(var54);
                0;
            }
        }
        if (c.lIIIIIIllIIllll(var8.F(), var8.F.fishGoal())) {
            n2 = llIlIIIllIlI[3];
            0;
            if ((0x2A ^ 5 ^ (0x17 ^ 0x3C)) <= 0) {
                return null;
            }
        } else {
            n2 = var10 = llIlIIIllIlI[0];
        }
        if ((!c.lIIIIIIllIIIlII((Object)var8.W(), (Object)d.DEMI_BOSS_EXPLORE) || c.lIIIIIIllIIlIlI((Object)var8.W(), (Object)d.PREPARE_BOSS_FIGHT)) && c.lIIIIIIllIIIllI(var10)) {
            var79.add(f.TELEPORT_CRYSTAL);
            0;
        }
        if (c.lIIIIIIllIIlIll(i.CRYSTAL_SHARD.aC(), llIlIIIllIlI[10]) && c.lIIIIIIllIIIllI(var8.F.makeT2Offhand() ? 1 : 0) && c.lIIIIIIllIIIllI(var8.F.makeT3Offhand() ? 1 : 0) && c.lIIIIIIllIIlIIl(var10)) {
            var79.add(var8.L());
            0;
        }
        var79.removeIf(f2 -> {
            int n2;
            if (c.lIIIIIIllIIIlII(f2, (Object)f.VIAL) && c.lIIIIIIllIIIlII(f2, (Object)f.TELEPORT_CRYSTAL) && (!c.lIIIIIIllIIIllI(Inventory.contains((int[])f2.ad()) ? 1 : 0) || c.lIIIIIIllIIlIIl(Equipment.contains((int[])f2.ad()) ? 1 : 0))) {
                n2 = llIlIIIllIlI[3];
                0;
                if (-(0xA3 ^ 0xA7) >= 0) {
                    return false;
                }
            } else {
                n2 = llIlIIIllIlI[0];
            }
            return n2 != 0;
        });
        0;
        if (c.lIIIIIIllIIlIlI((Object)var8.W(), (Object)d.PREPARE_BOSS_FIGHT) && c.lIIIIIIllIIlIIl(Inventory.contains((int[])f.TELEPORT_CRYSTAL.ad()) ? 1 : 0)) {
            var79.remove((Object)f.TELEPORT_CRYSTAL);
            0;
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
        l var37;
        void var17;
        c var72;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (c.lIIIIIIllIIlIII(this.G) && c.lIIIIIIllIIlIIl(Arrays.stream(e.O).anyMatch(n2 -> {
            boolean bl;
            if (c.lIIIIIIllIIIlIl(gameObject.getId(), n2)) {
                bl = llIlIIIllIlI[3];
                0;
                if (2 < 0) {
                    return false;
                }
            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        }) ? 1 : 0)) {
            this.a(gameObject.getWorldLocation());
        }
        if (c.lIIIIIIllIIIlll(var72.G) && c.lIIIIIIllIIlIIl(Arrays.stream(e.U).anyMatch(arg_0 -> c.a((GameObjectSpawned)var17, arg_0)) ? 1 : 0) && c.lIIIIIIllIIIlll(var37 = var72.G.d(var17.getTile().getWorldLocation()))) {
            var37.b(llIlIIIllIlI[3]);
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
            0;
            
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
            0;
            if (2 <= -1) {
                return ((125 + 106 - 134 + 49 ^ 6 + 74 - 58 + 119) & (0xA8 ^ 0x99 ^ (0x9E ^ 0xB0) ^ -1)) != 0;
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
        void var49;
        void var50;
        Map<i, Integer> map = this.E();
        if (c.lIIIIIIllIIlIIl(f.TELEPORT_CRYSTAL.ac().contains(n2) ? 1 : 0) && c.lIIIIIIllIIlIIl(this.g(n2) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (!c.lIIIIIIllIIIllI(i.CRYSTAL_SHARD.aA().contains((int)var50) ? 1 : 0) || c.lIIIIIIllIIllll(Inventory.getFreeSlots(), llIlIIIllIlI[1]) && c.lIIIIIIllIIlIIl(i.FISH.aA().contains((int)var50) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        int var66 = llIlIIIllIlI[0];
        Iterator var46 = var49.entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var46.hasNext() ? 1 : 0)) {
            Map.Entry var87 = var46.next();
            i var56 = (i)((Object)var87.getKey());
            if (c.lIIIIIIllIIIllI(var56.aA().contains((int)var50) ? 1 : 0)) {
                0;
                if (((0xA7 ^ 0x95 ^ (0xA4 ^ 0xC5)) & (0xA2 ^ 0x9F ^ (0x5F ^ 0x31) ^ -1)) <= 2) continue;
                return false;
            }
            var66 = llIlIIIllIlI[3];
            int var68 = (Integer)var87.getValue();
            if (c.lIIIIIIllIlIIII(var68)) {
                return llIlIIIllIlI[0];
            }
            0;
            if (3 >= 3) continue;
            return ((0xF6 ^ 0xB4 ^ (0x47 ^ 0x5C)) & (0x6E ^ 0x57 ^ (0x58 ^ 0x38) ^ -1)) != 0;
        }
        return (boolean)var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public Map<i, Integer> E() {
        int n2;
        c var3;
        void var64;
        HashMap<i, Integer> hashMap = new HashMap<i, Integer>();
        List<f> list = this.P();
        Iterator<f> lllllllllllllllIlIIIlIlllIlIIIIl22 = list.iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIlIIIIl22.hasNext() ? 1 : 0)) {
            f var70 = lllllllllllllllIlIIIlIlllIlIIIIl22.next();
            Iterator<Map.Entry<i, Integer>> var42 = var70.ag().entrySet().iterator();
            while (c.lIIIIIIllIIlIIl(var42.hasNext() ? 1 : 0)) {
                Map.Entry<i, Integer> var41 = var42.next();
                int var26 = var64.getOrDefault((Object)var41.getKey(), llIlIIIllIlI[0]);
                var64.put(var41.getKey(), var26 += var41.getValue().intValue());
                0;
                0;
                
                return null;
            }
            0;
            if ((0x74 ^ 0x70) >= (0x5F ^ 0x5B)) continue;
            return null;
        }
        int lllllllllllllllIlIIIlIlllIlIIIIl22 = Math.min(var3.F.potionGoal(), llIlIIIllIlI[3]);
        if (c.lIIIIIIllIIlIlI((Object)var3.H, (Object)d.PREPARE_BOSS_FIGHT)) {
            n2 = var3.F.potionGoal() - var3.C();
            0;
            if (2 == 0) {
                return null;
            }
        } else {
            n2 = lllllllllllllllIlIIIlIlllIlIIIIl22;
        }
        int var70 = n2;
        int var42 = var70 * f.VIAL.ag().get((Object)i.CRYSTAL_SHARD);
        var64.put(i.CRYSTAL_SHARD, var64.getOrDefault((Object)i.CRYSTAL_SHARD, llIlIIIllIlI[0]) + var42);
        0;
        if (c.lIIIIIIllIIIlII((Object)var3.H, (Object)d.EXTRA_FOOD_EXPLORE) && c.lIIIIIIllIIIlII((Object)var3.H, (Object)d.PREPARE_BOSS_FIGHT)) {
            if (c.lIIIIIIllIIlIlI((Object)var3.H, (Object)d.FIRST_ROTATION_EXPLORE)) {
                var64.put(i.HERB, lllllllllllllllIlIIIlIlllIlIIIIl22);
                0;
                0;
                if (((0x6A ^ 8) & ~(0x32 ^ 0x50)) >= 3) {
                    return null;
                }
            } else {
                int var41 = Inventory.getCount(var3.a(e.aa));
                var64.put(i.HERB, var3.F.potionGoal() - var41);
                0;
            }
            if (c.lIIIIIIllIIlIll(var3.F.fishGoal(), llIlIIIllIlI[4])) {
                var64.put(i.FISH, var3.F.fishGoal() / llIlIIIllIlI[5] * llIlIIIllIlI[6]);
                0;
                0;
                if ((0x6B ^ 4 ^ (0xC9 ^ 0xA2)) != (120 + 24 - 57 + 59 ^ 11 + 120 - 129 + 148)) {
                    return null;
                }
            } else {
                var64.put(i.FISH, var3.F.fishGoal() / llIlIIIllIlI[6] * llIlIIIllIlI[6]);
                0;
                0;
                if (3 >= (28 + 46 - -33 + 32 ^ 68 + 101 - 34 + 8)) {
                    return null;
                }
            }
        } else if (c.lIIIIIIllIIllII(Inventory.getFreeSlots())) {
            var64.put(i.FISH, var3.F.fishGoal());
            0;
        }
        Iterator var41 = var64.keySet().iterator();
        while (c.lIIIIIIllIIlIIl(var41.hasNext() ? 1 : 0)) {
            i var26 = (i)((Object)var41.next());
            int var9 = llIlIIIllIlI[0];
            if (c.lIIIIIIllIIlIlI((Object)var26, (Object)i.FISH)) {
                var9 = var3.F();
                0;
                if (1 < 0) {
                    return null;
                }
            } else {
                var9 = Inventory.getCount((boolean)llIlIIIllIlI[3], var3.a(var26.aA()));
            }
            var64.put(var26, (Integer)var64.get((Object)var26) - var9);
            0;
            0;
            if (-1 == -1) continue;
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
        Iterator<Map.Entry<i, Integer>> var60 = f2.ag().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var60.hasNext() ? 1 : 0)) {
            c var39;
            void var89;
            Map.Entry<i, Integer> var63 = var60.next();
            if (c.lIIIIIIllIIIlll((Object)var89.af()) && c.lIIIIIIllIIIllI(Inventory.contains(var39.a(var89.af().ac())) ? 1 : 0) && c.lIIIIIIllIIIllI(Equipment.contains(var39.a(var89.af().ac())) ? 1 : 0) && c.lIIIIIIllIIIllI(var39.a(var89.af()) ? 1 : 0)) {
                return llIlIIIllIlI[0];
            }
            if (c.lIIIIIIllIIllIl(var63.getKey().aC(), var63.getValue())) {
                return llIlIIIllIlI[0];
            }
            0;
            if ((3 ^ 7) == (0x61 ^ 0x65)) continue;
            return false;
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
                0;
                
                }
            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        });
        0;
        return list;
    }

    /*
     * WARNING - void declaration
     */
    public int M() {
        void var2_2;
        void var44;
        Widget widget = Widgets.get((int)WidgetInfo.GAUNTLET_TIMER_CONTAINER.getGroupId(), (int)llIlIIIllIlI[6]);
        if (c.lIIIIIIllIIlIII(widget)) {
            return llIlIIIllIlI[0];
        }
        String var78 = var44.getText();
        if (c.lIIIIIIllIIlIII(var78)) {
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
        c.llIlIIIllIlI[0] = (0x64 ^ 0x3E ^ (0xE3 ^ 0xA3)) & (0xC6 ^ 0xB6 ^ (0xAE ^ 0xC4) ^ -1);
        c.llIlIIIllIlI[1] = 3;
        c.llIlIIIllIlI[2] = -(0xFFFFB77E & 0x5CA3) & (0xFFFFB7FF & 0x7FFB);
        c.llIlIIIllIlI[3] = 1;
        c.llIlIIIllIlI[4] = 0x87 ^ 0x8D;
        c.llIlIIIllIlI[5] = 0x75 ^ 0x59 ^ (0x36 ^ 0x12);
        c.llIlIIIllIlI[6] = 0x6E ^ 0x4B ^ (0x11 ^ 0x30);
        c.llIlIIIllIlI[7] = 0x5F ^ 0x7F;
        c.llIlIIIllIlI[8] = 0xC3 ^ 0xC6;
        c.llIlIIIllIlI[9] = 2;
        c.llIlIIIllIlI[10] = 0xFC ^ 0xA7 ^ (0xD2 ^ 0xB5);
    }

    public boolean S() {
        int n2;
        if (!c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.FIRST_ROTATION_EXPLORE) || !c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.DEMI_BOSS_EXPLORE) || !c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.WEAPON_FRAME_EXPLORE) || c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIlIIIllIlI[3];
            0;
            
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
        0;
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
        ArrayList<f> var77 = new ArrayList<f>();
        f var25 = f.TIER_3_STAFF;
        while (c.lIIIIIIllIIIlll((Object)var25) && c.lIIIIIIllIIIllI(Inventory.contains((int[])var25.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Equipment.contains((int[])var25.ad()) ? 1 : 0)) {
            var77.add(var25);
            0;
            var25 = var25.af();
            0;
            if (2 > 1) continue;
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
        void var19;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var53 = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(var53, (int)var19)) {
            c var32;
            void var22;
            void var71 = var22[var53];
            if (c.lIIIIIIllIIlIIl(var32.f((int)var71) ? 1 : 0)) {
                return llIlIIIllIlI[3];
            }
            ++var53;
            0;
            if (-(0x5C ^ 0x69 ^ (0x64 ^ 0x55)) < 0) continue;
            return ((0x40 ^ 0x5B ^ 1) & (0xD7 ^ 0xC6 ^ (0x4F ^ 0x44) ^ -1)) != 0;
        }
        return llIlIIIllIlI[0];
    }

    /*
     * WARNING - void declaration
     */
    public g J() {
        void var1_2;
        g lllllllllllllllIlIIIlIllIllIlIlI2;
        c var58;
        if (c.lIIIIIIllIIlIIl(this.F.makeT3Offhand() ? 1 : 0)) {
            g g2;
            void lllllllllllllllIlIIIlIllIllIlIlI2;
            void var82;
            ArrayList<g> arrayList = new ArrayList<g>();
            Map<i, Integer> map = this.E();
            if (c.lIIIIIIllIIlIIl(map.containsKey((Object)i.CRYSTAL_ORB) ? 1 : 0) && c.lIIIIIIllIIIllI(i.CRYSTAL_ORB.aC()) && c.lIIIIIIllIIIllI(Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0)) {
                arrayList.add(g.DRAGON);
                0;
            }
            if (c.lIIIIIIllIIlIIl(var82.containsKey((Object)i.CRYSTALLINE_BOWSTRING) ? 1 : 0) && c.lIIIIIIllIIIllI(i.CRYSTALLINE_BOWSTRING.aC()) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_3_BOW.ad()) ? 1 : 0)) {
                lllllllllllllllIlIIIlIllIllIlIlI2.add(g.DARK_BEAST);
                0;
            }
            Iterator var27 = lllllllllllllllIlIIIlIllIllIlIlI2.iterator();
            while (c.lIIIIIIllIIlIIl(var27.hasNext() ? 1 : 0)) {
                g var81 = (g)((Object)var27.next());
                NPC var24 = NPCs.getNearest((int[])var81.ah());
                if (c.lIIIIIIllIIIlll(var24)) {
                    return var81;
                }
                0;
                if (1 != (20 + 101 - 35 + 92 ^ 126 + 178 - 169 + 47)) continue;
                return null;
            }
            if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIllIlIlI2.isEmpty() ? 1 : 0)) {
                g2 = null;
                0;
                if (2 <= 0) {
                    return null;
                }
            } else {
                g2 = (g)((Object)lllllllllllllllIlIIIlIllIllIlIlI2.get(llIlIIIllIlI[0]));
            }
            return g2;
        }
        if (c.lIIIIIIllIIIlII(var58.I.aD(), HeadIcon.MAGIC)) {
            lllllllllllllllIlIIIlIllIllIlIlI2 = g.DRAGON;
            0;
            if (3 >= (0x9C ^ 0x98)) {
                return null;
            }
        } else {
            lllllllllllllllIlIIIlIllIllIlIlI2 = g.DARK_BEAST;
        }
        if (c.lIIIIIIllIIlIIl(var58.a(lllllllllllllllIlIIIlIllIllIlIlI2) ? 1 : 0)) {
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
                0;
                if (-1 > 0) {
                    return ((0x64 ^ 0x3E ^ (0x54 ^ 0x33)) & (4 ^ 0x49 ^ (0x1F ^ 0x6F) ^ -1)) != 0;
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
                0;
                
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
        void var80;
        c var61;
        this.c(npcSpawned.getNpc());
        g g2 = g.i(npcSpawned.getNpc().getId());
        if (c.lIIIIIIllIIlIII((Object)g2)) {
            return;
        }
        l var35 = var61.V().d(var80.getNpc().getWorldLocation());
        if (c.lIIIIIIllIIlIII(var35)) {
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
        c var5;
        ItemContainer itemContainer = this.E.getItemContainer(InventoryID.INVENTORY);
        if (c.lIIIIIIllIIlIII(itemContainer)) {
            return llIlIIIllIlI[0];
        }
        Iterator<Map.Entry<i, Integer>> var21 = var5.E().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var21.hasNext() ? 1 : 0)) {
            void var59;
            Map.Entry<i, Integer> var65 = var21.next();
            if (c.lIIIIIIllIIlIIl(var59.test(var65.getKey()) ? 1 : 0)) {
                0;
                if (-3 < 0) continue;
                return (1 & ~1) != 0;
            }
            int var7 = var65.getValue();
            if (c.lIIIIIIllIIllII(var7)) {
                return llIlIIIllIlI[0];
            }
            0;
            
            return false;
        }
        return llIlIIIllIlI[3];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(l l2, WorldPoint worldPoint) {
        void var11;
        void var38;
        c var48;
        this.M = this.G.d(worldPoint);
        if (c.lIIIIIIllIIlIII(this.M)) {
            return llIlIIIllIlI[0];
        }
        if (c.lIIIIIIllIIlIIl(var48.M.e((l)var38) ? 1 : 0)) {
            if (c.lIIIIIIllIIlIIl(var38.aY() ? 1 : 0)) {
                var48.J = null;
                var48.K = Collections.emptyList();
                var48.b(var38.aQ());
                return llIlIIIllIlI[3];
            }
            var48.J = var38;
            var48.K = Collections.emptyList();
            return var48.a(var48.M, (l)var38);
        }
        List<l> var75 = var48.G.a((WorldPoint)var11, (l)var38);
        if (c.lIIIIIIllIIlIIl(var75.isEmpty() ? 1 : 0)) {
            var48.J = null;
            return llIlIIIllIlI[3];
        }
        Collections.reverse(var75);
        var48.K = var75;
        Player var20 = Players.getLocal();
        var48.J = null;
        int var36 = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(var36, var75.size())) {
            l var6 = var75.get(var36);
            if (c.lIIIIIIllIIIlIl(var6.aO(), llIlIIIllIlI[1]) && c.lIIIIIIllIIIlIl(var6.aP(), llIlIIIllIlI[1])) {
                return llIlIIIllIlI[0];
            }
            if (c.lIIIIIIllIIlIIl(var6.aY() ? 1 : 0) && c.lIIIIIIllIIlllI(var6.aQ().distanceTo(var20.getWorldLocation()), llIlIIIllIlI[7]) && c.lIIIIIIllIIIllI(var6.e(var20.getWorldLocation()) ? 1 : 0)) {
                var48.b(var6.aQ());
                return llIlIIIllIlI[3];
            }
            if (c.lIIIIIIllIIIllI(var6.aY() ? 1 : 0)) {
                l l3;
                if (c.lIIIIIIllIIllII(var36)) {
                    l3 = var75.get(var36 - llIlIIIllIlI[3]);
                    0;
                    if (3 <= 0) {
                        return ((97 + 82 - 64 + 14 ^ 184 + 142 - 142 + 12) & (0xB3 ^ 0x9F ^ (0xA8 ^ 0xC1) ^ -1)) != 0;
                    }
                } else {
                    l3 = var48.M;
                }
                l var57 = l3;
                var48.a(var57, var6);
                0;
                return llIlIIIllIlI[3];
            }
            ++var36;
            0;
            if ((0x10 ^ 0x15) != 0) continue;
            return false;
        }
        return llIlIIIllIlI[3];
    }

    public h V() {
        return this.G;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        c var67;
        if (c.lIIIIIIllIIIlII(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        if (c.lIIIIIIllIIIllI(var67.A() ? 1 : 0)) {
            if (c.lIIIIIIllIIIlll(var67.G)) {
                var67.G.ao();
                var67.G = null;
            }
            var67.H = d.OUTSIDE;
        }
    }

    public l T() {
        c var14;
        if (c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            this.M = this.V().as();
            return this.M;
        }
        if (c.lIIIIIIllIIlIlI((Object)var14.W(), (Object)d.DEMI_BOSS_EXPLORE)) {
            Player var83 = var14.E.getLocalPlayer();
            if (c.lIIIIIIllIIlIII(var83)) {
                return null;
            }
            g var52 = var14.J();
            if (c.lIIIIIIllIIlIII((Object)var52)) {
                return null;
            }
            if (c.lIIIIIIllIIllII(Inventory.getCount((boolean)llIlIIIllIlI[3], var14.a(var52.an().aA())))) {
                return null;
            }
            var14.M = var14.V().d(var83.getWorldLocation());
            return var14.M;
        }
        return null;
    }

    private boolean b(f f2) {
        boolean bl;
        if (!c.lIIIIIIllIIIllI(Inventory.contains(item -> f2.ac().contains(item.getId())) ? 1 : 0) || c.lIIIIIIllIIlIIl(Equipment.contains(item -> f2.ac().contains(item.getId())) ? 1 : 0)) {
            bl = llIlIIIllIlI[3];
            0;
            if ((6 ^ 2) < 0) {
                return (2 & ~2) != 0;
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
        0;
        return Inventory.getCount(this.a(arrayList)) + this.D();
    }

    private static void lIIIIIIlIlIIIlI() {
        llIlIIIllIIl = new String[llIlIIIllIlI[9]];
        c.llIlIIIllIIl[c.llIlIIIllIlI[0]] = c."Light";
        c.llIlIIIllIIl[c.llIlIIIllIlI[3]] = c.":";
    }

    private static String lIIIIIIlIlIIIII(String var18, String var45) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var47 = new StringBuilder();
        char[] var43 = var45.toCharArray();
        int var12 = llIlIIIllIlI[0];
        char[] var55 = var18.toCharArray();
        int var91 = var55.length;
        int var29 = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(var29, var91)) {
            char var4 = var55[var29];
            var47.append((char)(var4 ^ var43[var12 % var43.length]));
            0;
            ++var12;
            ++var29;
            0;
            if (((0xD9 ^ 0x82) & ~(0xE ^ 0x55)) < 1) continue;
            return null;
        }
        return String.valueOf(var47);
    }

    public boolean A() {
        int n2;
        if (c.lIIIIIIllIIIlII(Game.getState(), GameState.LOGIN_SCREEN) && c.lIIIIIIllIIIlIl(Vars.getBit((int)llIlIIIllIlI[2]), llIlIIIllIlI[3])) {
            n2 = llIlIIIllIlI[3];
            0;
            if (-(62 + 23 - -2 + 46 ^ 67 + 17 - 13 + 57) >= 0) {
                return ((0x63 ^ 0x52 ^ (0x79 ^ 5)) & (0x34 ^ 0x4C ^ (0x22 ^ 0x17) ^ -1)) != 0;
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
            0;
            if (((0x2A ^ 0x2C) & ~(0x89 ^ 0x8F)) != 0) {
                return false;
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
            0;
            if ((0x18 ^ 0x1C) >= 1) return n3 != 0;
            return false;
        }
        n3 = llIlIIIllIlI[0];
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(g g2) {
        boolean bl;
        c var30;
        void var16;
        if (c.lIIIIIIllIIlIlI((Object)g2, (Object)g.DRAGON) && c.lIIIIIIllIIlIIl(this.b(f.TIER_3_STAFF) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (c.lIIIIIIllIIlIlI(var16, (Object)g.DARK_BEAST) && c.lIIIIIIllIIlIIl(var30.b(f.TIER_3_BOW) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (c.lIIIIIIllIIllII(var16.an().aC())) {
            bl = llIlIIIllIlI[3];
            0;
            if (2 == 1) {
                return ((0xB3 ^ 0xC0 ^ (0x91 ^ 0xC2)) & (0xD5 ^ 0xA7 ^ (0xEF ^ 0xBD) ^ -1)) != 0;
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
        Iterator<Map.Entry<i, Integer>> var51 = map.entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var51.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> var40 = var51.next();
            i var2 = var40.getKey();
            int var28 = var40.getValue();
            if (c.lIIIIIIllIIllII(var28)) {
                void var1;
                var1.addAll(var2.az());
                0;
            }
            0;
            if (2 != 0) continue;
            return null;
        }
        return arrayList;
    }

    public boolean R() {
        boolean bl;
        if (!c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.FIRST_ROTATION_CREATE) || c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.PREPARE_BOSS_FIGHT)) {
            bl = llIlIIIllIlI[3];
            0;
            if (3 <= 1) {
                return false;
            }
        } else {
            bl = llIlIIIllIlI[0];
        }
        return bl;
    }

    private static String lIIIIIIlIlIIIIl(String var84, String var76) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var76.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(llIlIIIllIlI[9], var13);
            return new String(var23.doFinal(Base64.getDecoder().decode(var84.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var85) {
            var85.printStackTrace();
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
                0;
                
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
        c var33;
        ItemContainer itemContainer = this.E.getItemContainer(InventoryID.INVENTORY);
        if (c.lIIIIIIllIIlIII(itemContainer)) {
            return llIlIIIllIlI[0];
        }
        Iterator<Map.Entry<i, Integer>> var73 = var33.E().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var73.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> var86 = var73.next();
            int var62 = var86.getValue();
            if (c.lIIIIIIllIIllII(var62)) {
                return llIlIIIllIlI[0];
            }
            0;
            if (-1 <= 0) continue;
            return false;
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

