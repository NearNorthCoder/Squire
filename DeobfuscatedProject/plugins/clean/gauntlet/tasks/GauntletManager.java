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
package gg.squire.gauntlet.tasks;

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
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum39;
import gg.squire.gauntlet.tasks.GameEnum18;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.GauntletManager;
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
public class GauntletManager {
    private  List<l> K;
    private static final  Logger C;
    private final  EventBus D;
    private  d H;
    
    private final  Client E;
    private  h G;
    private final  GauntletConfig F;
    
    private  GameObject L;
    private  int N;
    private  l M;
    private  j I;
    private  l J;

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
        WorldPoint var1 = Movement.getDestination();
        if (c.lIIIIIIllIIlIIl(Players.getLocal().isMoving() ? 1 : 0) && c.lIIIIIIllIIIlll(var1) && c.lIIIIIIllIIlIll(var1.distanceTo((Locatable)Players.getLocal()), llIlIIIllIlI[9])) {
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
        f var2;
        int n3;
        c var3;
        List<Object> list;
        if (c.lIIIIIIllIIlIIl(this.F.makeArmour() ? 1 : 0)) {
            list = List.of(f.TIER_1_BODY, f.TIER_1_LEGS, f.TIER_1_HELM);

            if (((0x33 ^ 0x7E) & ~(0xC ^ 0x41)) >= 1) {
                return null;
            }
        } else {
            list = new ArrayList();
        }
        List<Object> var4 = list;
        ArrayList<f> var5 = new ArrayList<f>();
        List<f> var6 = var3.K();
        if (c.lIIIIIIllIIIllI(var6.isEmpty() ? 1 : 0)) {
            var5.add(var6.get(llIlIIIllIlI[0]));

            var6.remove(llIlIIIllIlI[0]);

        }
        int var7 = Math.min(var3.F.potionGoal(), llIlIIIllIlI[3]);
        if (!c.lIIIIIIllIIIlII((Object)var3.H, (Object)d.PREPARE_BOSS_FIGHT) || c.lIIIIIIllIIlIlI((Object)var3.H, (Object)d.DEMI_BOSS_EXPLORE)) {
            n3 = var3.F.potionGoal() - var3.C();

            if (2 <= 0) {
                return null;
            }
        } else {
            n3 = var7 - var3.C();
        }
        int var8 = n3;
        int var9 = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(var9, var8)) {
            var5.add(f.VIAL);

            ++var9;

            if (((0x3E ^ 0x79 ^ (0xF2 ^ 0x82)) & (0x4C ^ 0x74 ^ (0x6E ^ 0x61) ^ -1)) == 0) continue;
            return null;
        }
        var5.addAll(var4);

        var5.addAll(var6);

        var9 = Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0;
        if ((!c.lIIIIIIllIIIllI(var9) || c.lIIIIIIllIIlIIl(var5.contains((Object)f.TIER_3_STAFF) ? 1 : 0)) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_2_BOW.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_3_BOW.ad()) ? 1 : 0)) {
            var5.add(f.TIER_1_BOW);

        }
        if (c.lIIIIIIllIIlIIl(var3.F.makeT2Offhand() ? 1 : 0)) {
            var2 = var3.L();
            if (c.lIIIIIIllIIIlll((Object)var2)) {
                if (c.lIIIIIIllIIIllI(Inventory.contains((int[])var2.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Inventory.contains((int[])var2.af().ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(var5.contains((Object)var2.af()) ? 1 : 0)) {
                    var5.add(var2.af());

                }
                var5.add(var2);

            }

            if (((0x15 ^ 0x4A) & ~(0x27 ^ 0x78)) < 0) {
                return null;
            }
        } else if (c.lIIIIIIllIIlIIl(var3.F.makeT3Offhand() ? 1 : 0) && c.lIIIIIIllIIIlll((Object)(var2 = var3.L()))) {
            f var10;
            f f3;
            if (c.lIIIIIIllIIlIlI((Object)var2, (Object)f.TIER_2_BOW)) {
                f3 = f.TIER_3_BOW;

                if (-1 >= (0x21 ^ 0x25)) {
                    return null;
                }
            } else {
                f3 = f.TIER_3_STAFF;
            }
            if (c.lIIIIIIllIIIllI(Inventory.contains((int[])(var10 = f3).ad()) ? 1 : 0)) {
                if (c.lIIIIIIllIIIllI(Inventory.contains((int[])var2.ad()) ? 1 : 0)) {
                    f var11 = var2.af();
                    if (c.lIIIIIIllIIIllI(Inventory.contains((int[])var11.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(var5.contains((Object)var11) ? 1 : 0)) {
                        var5.add(var11);

                    }
                    if (c.lIIIIIIllIIIllI(var5.contains((Object)var2) ? 1 : 0)) {
                        var5.add(var2);

                    }
                }
                var5.add(var10);

            }
        }
        if (c.lIIIIIIllIIllll(var3.F(), var3.F.fishGoal())) {
            n2 = llIlIIIllIlI[3];

            if ((0x2A ^ 5 ^ (0x17 ^ 0x3C)) <= 0) {
                return null;
            }
        } else {
            n2 = var2 = llIlIIIllIlI[0];
        }
        if ((!c.lIIIIIIllIIIlII((Object)var3.W(), (Object)d.DEMI_BOSS_EXPLORE) || c.lIIIIIIllIIlIlI((Object)var3.W(), (Object)d.PREPARE_BOSS_FIGHT)) && c.lIIIIIIllIIIllI(var2)) {
            var5.add(f.TELEPORT_CRYSTAL);

        }
        if (c.lIIIIIIllIIlIll(i.CRYSTAL_SHARD.aC(), llIlIIIllIlI[10]) && c.lIIIIIIllIIIllI(var3.F.makeT2Offhand() ? 1 : 0) && c.lIIIIIIllIIIllI(var3.F.makeT3Offhand() ? 1 : 0) && c.lIIIIIIllIIlIIl(var2)) {
            var5.add(var3.L());

        }
        var5.removeIf(f2 -> {
            int n2;
            if (c.lIIIIIIllIIIlII(f2, (Object)f.VIAL) && c.lIIIIIIllIIIlII(f2, (Object)f.TELEPORT_CRYSTAL) && (!c.lIIIIIIllIIIllI(Inventory.contains((int[])f2.ad()) ? 1 : 0) || c.lIIIIIIllIIlIIl(Equipment.contains((int[])f2.ad()) ? 1 : 0))) {
                n2 = llIlIIIllIlI[3];

                if (-(0xA3 ^ 0xA7) >= 0) {
                    return false;
                }
            } else {
                n2 = llIlIIIllIlI[0];
            }
            return n2 != 0;
        });

        if (c.lIIIIIIllIIlIlI((Object)var3.W(), (Object)d.PREPARE_BOSS_FIGHT) && c.lIIIIIIllIIlIIl(Inventory.contains((int[])f.TELEPORT_CRYSTAL.ad()) ? 1 : 0)) {
            var5.remove((Object)f.TELEPORT_CRYSTAL);

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
        l var12;
        void var13;
        c var14;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (c.lIIIIIIllIIlIII(this.G) && c.lIIIIIIllIIlIIl(Arrays.stream(e.O).anyMatch(n2 -> {
            boolean bl;
            if (c.lIIIIIIllIIIlIl(gameObject.getId(), n2)) {
                bl = llIlIIIllIlI[3];

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
        if (c.lIIIIIIllIIIlll(var14.G) && c.lIIIIIIllIIlIIl(Arrays.stream(e.U).anyMatch(arg_0 -> c.a((GameObjectSpawned)var13, arg_0)) ? 1 : 0) && c.lIIIIIIllIIIlll(var12 = var14.G.d(var13.getTile().getWorldLocation()))) {
            var12.b(llIlIIIllIlI[3]);
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

    private static  boolean a(GameObjectSpawned gameObjectSpawned, int n2) {
        boolean bl;
        if (c.lIIIIIIllIIIlIl(n2, gameObjectSpawned.getGameObject().getId())) {
            bl = llIlIIIllIlI[3];

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
        void var15;
        void var16;
        Map<i, Integer> map = this.E();
        if (c.lIIIIIIllIIlIIl(f.TELEPORT_CRYSTAL.ac().contains(n2) ? 1 : 0) && c.lIIIIIIllIIlIIl(this.g(n2) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (!c.lIIIIIIllIIIllI(i.CRYSTAL_SHARD.aA().contains((int)var16) ? 1 : 0) || c.lIIIIIIllIIllll(Inventory.getFreeSlots(), llIlIIIllIlI[1]) && c.lIIIIIIllIIlIIl(i.FISH.aA().contains((int)var16) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        int var17 = llIlIIIllIlI[0];
        Iterator var18 = var15.entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var18.hasNext() ? 1 : 0)) {
            Map.Entry var19 = var18.next();
            i var20 = (i)((Object)var19.getKey());
            if (c.lIIIIIIllIIIllI(var20.aA().contains((int)var16) ? 1 : 0)) {

                if (((0xA7 ^ 0x95 ^ (0xA4 ^ 0xC5)) & (0xA2 ^ 0x9F ^ (0x5F ^ 0x31) ^ -1)) <= 2) continue;
                return false;
            }
            var17 = llIlIIIllIlI[3];
            int var21 = (Integer)var19.getValue();
            if (c.lIIIIIIllIlIIII(var21)) {
                return llIlIIIllIlI[0];
            }

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
        c var22;
        void var23;
        HashMap<i, Integer> hashMap = new HashMap<i, Integer>();
        List<f> list = this.P();
        Iterator<f> lllllllllllllllIlIIIlIlllIlIIIIl22 = list.iterator();
        while (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIlllIlIIIIl22.hasNext() ? 1 : 0)) {
            f var24 = lllllllllllllllIlIIIlIlllIlIIIIl22.next();
            Iterator<Map.Entry<i, Integer>> var25 = var24.ag().entrySet().iterator();
            while (c.lIIIIIIllIIlIIl(var25.hasNext() ? 1 : 0)) {
                Map.Entry<i, Integer> var26 = var25.next();
                int var27 = var23.getOrDefault((Object)var26.getKey(), llIlIIIllIlI[0]);
                var23.put(var26.getKey(), var27 += var26.getValue().intValue());

                return null;
            }

            if ((0x74 ^ 0x70) >= (0x5F ^ 0x5B)) continue;
            return null;
        }
        int lllllllllllllllIlIIIlIlllIlIIIIl22 = Math.min(var22.F.potionGoal(), llIlIIIllIlI[3]);
        if (c.lIIIIIIllIIlIlI((Object)var22.H, (Object)d.PREPARE_BOSS_FIGHT)) {
            n2 = var22.F.potionGoal() - var22.C();

            if (2 == 0) {
                return null;
            }
        } else {
            n2 = lllllllllllllllIlIIIlIlllIlIIIIl22;
        }
        int var24 = n2;
        int var25 = var24 * f.VIAL.ag().get((Object)i.CRYSTAL_SHARD);
        var23.put(i.CRYSTAL_SHARD, var23.getOrDefault((Object)i.CRYSTAL_SHARD, llIlIIIllIlI[0]) + var25);

        if (c.lIIIIIIllIIIlII((Object)var22.H, (Object)d.EXTRA_FOOD_EXPLORE) && c.lIIIIIIllIIIlII((Object)var22.H, (Object)d.PREPARE_BOSS_FIGHT)) {
            if (c.lIIIIIIllIIlIlI((Object)var22.H, (Object)d.FIRST_ROTATION_EXPLORE)) {
                var23.put(i.HERB, lllllllllllllllIlIIIlIlllIlIIIIl22);

                if (((0x6A ^ 8) & ~(0x32 ^ 0x50)) >= 3) {
                    return null;
                }
            } else {
                int var26 = Inventory.getCount(var22.a(e.aa));
                var23.put(i.HERB, var22.F.potionGoal() - var26);

            }
            if (c.lIIIIIIllIIlIll(var22.F.fishGoal(), llIlIIIllIlI[4])) {
                var23.put(i.FISH, var22.F.fishGoal() / llIlIIIllIlI[5] * llIlIIIllIlI[6]);

                if ((0x6B ^ 4 ^ (0xC9 ^ 0xA2)) != (120 + 24 - 57 + 59 ^ 11 + 120 - 129 + 148)) {
                    return null;
                }
            } else {
                var23.put(i.FISH, var22.F.fishGoal() / llIlIIIllIlI[6] * llIlIIIllIlI[6]);

                if (3 >= (28 + 46 - -33 + 32 ^ 68 + 101 - 34 + 8)) {
                    return null;
                }
            }
        } else if (c.lIIIIIIllIIllII(Inventory.getFreeSlots())) {
            var23.put(i.FISH, var22.F.fishGoal());

        }
        Iterator var26 = var23.keySet().iterator();
        while (c.lIIIIIIllIIlIIl(var26.hasNext() ? 1 : 0)) {
            i var27 = (i)((Object)var26.next());
            int var28 = llIlIIIllIlI[0];
            if (c.lIIIIIIllIIlIlI((Object)var27, (Object)i.FISH)) {
                var28 = var22.F();

                if (1 < 0) {
                    return null;
                }
            } else {
                var28 = Inventory.getCount((boolean)llIlIIIllIlI[3], var22.a(var27.aA()));
            }
            var23.put(var27, (Integer)var23.get((Object)var27) - var28);

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
        Iterator<Map.Entry<i, Integer>> var29 = f2.ag().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var29.hasNext() ? 1 : 0)) {
            c var30;
            void var31;
            Map.Entry<i, Integer> var32 = var29.next();
            if (c.lIIIIIIllIIIlll((Object)var31.af()) && c.lIIIIIIllIIIllI(Inventory.contains(var30.a(var31.af().ac())) ? 1 : 0) && c.lIIIIIIllIIIllI(Equipment.contains(var30.a(var31.af().ac())) ? 1 : 0) && c.lIIIIIIllIIIllI(var30.a(var31.af()) ? 1 : 0)) {
                return llIlIIIllIlI[0];
            }
            if (c.lIIIIIIllIIllIl(var32.getKey().aC(), var32.getValue())) {
                return llIlIIIllIlI[0];
            }

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

                }
            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        });

        return list;
    }

    /*
     * WARNING - void declaration
     */
    public int M() {
        void var2_2;
        void var33;
        Widget widget = Widgets.get((int)WidgetInfo.GAUNTLET_TIMER_CONTAINER.getGroupId(), (int)llIlIIIllIlI[6]);
        if (c.lIIIIIIllIIlIII(widget)) {
            return llIlIIIllIlI[0];
        }
        String var34 = var33.getText();
        if (c.lIIIIIIllIIlIII(var34)) {
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

    public boolean S() {
        int n2;
        if (!c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.FIRST_ROTATION_EXPLORE) || !c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.DEMI_BOSS_EXPLORE) || !c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.WEAPON_FRAME_EXPLORE) || c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIlIIIllIlI[3];

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
        ArrayList<f> var35 = new ArrayList<f>();
        f var36 = f.TIER_3_STAFF;
        while (c.lIIIIIIllIIIlll((Object)var36) && c.lIIIIIIllIIIllI(Inventory.contains((int[])var36.ad()) ? 1 : 0) && c.lIIIIIIllIIIllI(Equipment.contains((int[])var36.ad()) ? 1 : 0)) {
            var35.add(var36);

            var36 = var36.af();

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
        void var37;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var38 = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(var38, (int)var37)) {
            c var39;
            void var40;
            void var41 = var40[var38];
            if (c.lIIIIIIllIIlIIl(var39.f((int)var41) ? 1 : 0)) {
                return llIlIIIllIlI[3];
            }
            ++var38;

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
        c var42;
        if (c.lIIIIIIllIIlIIl(this.F.makeT3Offhand() ? 1 : 0)) {
            g g2;
            void lllllllllllllllIlIIIlIllIllIlIlI2;
            void var43;
            ArrayList<g> arrayList = new ArrayList<g>();
            Map<i, Integer> map = this.E();
            if (c.lIIIIIIllIIlIIl(map.containsKey((Object)i.CRYSTAL_ORB) ? 1 : 0) && c.lIIIIIIllIIIllI(i.CRYSTAL_ORB.aC()) && c.lIIIIIIllIIIllI(Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0)) {
                arrayList.add(g.DRAGON);

            }
            if (c.lIIIIIIllIIlIIl(var43.containsKey((Object)i.CRYSTALLINE_BOWSTRING) ? 1 : 0) && c.lIIIIIIllIIIllI(i.CRYSTALLINE_BOWSTRING.aC()) && c.lIIIIIIllIIIllI(Inventory.contains((int[])f.TIER_3_BOW.ad()) ? 1 : 0)) {
                lllllllllllllllIlIIIlIllIllIlIlI2.add(g.DARK_BEAST);

            }
            Iterator var44 = lllllllllllllllIlIIIlIllIllIlIlI2.iterator();
            while (c.lIIIIIIllIIlIIl(var44.hasNext() ? 1 : 0)) {
                g var45 = (g)((Object)var44.next());
                NPC var46 = NPCs.getNearest((int[])var45.ah());
                if (c.lIIIIIIllIIIlll(var46)) {
                    return var45;
                }

                if (1 != (20 + 101 - 35 + 92 ^ 126 + 178 - 169 + 47)) continue;
                return null;
            }
            if (c.lIIIIIIllIIlIIl(lllllllllllllllIlIIIlIllIllIlIlI2.isEmpty() ? 1 : 0)) {
                g2 = null;

                if (2 <= 0) {
                    return null;
                }
            } else {
                g2 = (g)((Object)lllllllllllllllIlIIIlIllIllIlIlI2.get(llIlIIIllIlI[0]));
            }
            return g2;
        }
        if (c.lIIIIIIllIIIlII(var42.I.aD(), HeadIcon.MAGIC)) {
            lllllllllllllllIlIIIlIllIllIlIlI2 = g.DRAGON;

            if (3 >= (0x9C ^ 0x98)) {
                return null;
            }
        } else {
            lllllllllllllllIlIIIlIllIllIlIlI2 = g.DARK_BEAST;
        }
        if (c.lIIIIIIllIIlIIl(var42.a(lllllllllllllllIlIIIlIllIllIlIlI2) ? 1 : 0)) {
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

            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        }) ? 1 : 0)) {
            boolean bl;
            int n2 = this.h().fishGoal() - this.h().fishGoalDeviation();
            if (c.lIIIIIIllIIlllI(n2, this.F())) {
                bl = llIlIIIllIlI[3];

                }
            } else {
                bl = llIlIIIllIlI[0];
            }
            return bl;
        }
        return llIlIIIllIlI[0];
    }

    @Inject
    public GauntletManager(EventBus eventBus, Client client, GauntletConfig gauntletConfig) {
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
        void var47;
        c var48;
        this.GauntletManager(npcSpawned.getNpc());
        g g2 = g.i(npcSpawned.getNpc().getId());
        if (c.lIIIIIIllIIlIII((Object)g2)) {
            return;
        }
        l var49 = var48.V().d(var47.getNpc().getWorldLocation());
        if (c.lIIIIIIllIIlIII(var49)) {
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
        c var50;
        ItemContainer itemContainer = this.E.getItemContainer(InventoryID.INVENTORY);
        if (c.lIIIIIIllIIlIII(itemContainer)) {
            return llIlIIIllIlI[0];
        }
        Iterator<Map.Entry<i, Integer>> var51 = var50.E().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var51.hasNext() ? 1 : 0)) {
            void var52;
            Map.Entry<i, Integer> var53 = var51.next();
            if (c.lIIIIIIllIIlIIl(var52.test(var53.getKey()) ? 1 : 0)) {

                if (-3 < 0) continue;
                return (1 & ~1) != 0;
            }
            int var54 = var53.getValue();
            if (c.lIIIIIIllIIllII(var54)) {
                return llIlIIIllIlI[0];
            }

            return false;
        }
        return llIlIIIllIlI[3];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(l l2, WorldPoint worldPoint) {
        void var55;
        void var56;
        c var57;
        this.M = this.G.d(worldPoint);
        if (c.lIIIIIIllIIlIII(this.M)) {
            return llIlIIIllIlI[0];
        }
        if (c.lIIIIIIllIIlIIl(var57.M.e((l)var56) ? 1 : 0)) {
            if (c.lIIIIIIllIIlIIl(var56.aY() ? 1 : 0)) {
                var57.J = null;
                var57.K = Collections.emptyList();
                var57.b(var56.aQ());
                return llIlIIIllIlI[3];
            }
            var57.J = var56;
            var57.K = Collections.emptyList();
            return var57.a(var57.M, (l)var56);
        }
        List<l> var58 = var57.G.a((WorldPoint)var55, (l)var56);
        if (c.lIIIIIIllIIlIIl(var58.isEmpty() ? 1 : 0)) {
            var57.J = null;
            return llIlIIIllIlI[3];
        }
        Collections.reverse(var58);
        var57.K = var58;
        Player var59 = Players.getLocal();
        var57.J = null;
        int var60 = llIlIIIllIlI[0];
        while (c.lIIIIIIllIIllIl(var60, var58.size())) {
            l var61 = var58.get(var60);
            if (c.lIIIIIIllIIIlIl(var61.aO(), llIlIIIllIlI[1]) && c.lIIIIIIllIIIlIl(var61.aP(), llIlIIIllIlI[1])) {
                return llIlIIIllIlI[0];
            }
            if (c.lIIIIIIllIIlIIl(var61.aY() ? 1 : 0) && c.lIIIIIIllIIlllI(var61.aQ().distanceTo(var59.getWorldLocation()), llIlIIIllIlI[7]) && c.lIIIIIIllIIIllI(var61.e(var59.getWorldLocation()) ? 1 : 0)) {
                var57.b(var61.aQ());
                return llIlIIIllIlI[3];
            }
            if (c.lIIIIIIllIIIllI(var61.aY() ? 1 : 0)) {
                l l3;
                if (c.lIIIIIIllIIllII(var60)) {
                    l3 = var58.get(var60 - llIlIIIllIlI[3]);

                    if (3 <= 0) {
                        return ((97 + 82 - 64 + 14 ^ 184 + 142 - 142 + 12) & (0xB3 ^ 0x9F ^ (0xA8 ^ 0xC1) ^ -1)) != 0;
                    }
                } else {
                    l3 = var57.M;
                }
                l var62 = l3;
                var57.a(var62, var61);

                return llIlIIIllIlI[3];
            }
            ++var60;

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
        c var63;
        if (c.lIIIIIIllIIIlII(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        if (c.lIIIIIIllIIIllI(var63.A() ? 1 : 0)) {
            if (c.lIIIIIIllIIIlll(var63.G)) {
                var63.G.ao();
                var63.G = null;
            }
            var63.H = d.OUTSIDE;
        }
    }

    public l T() {
        c var64;
        if (c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            this.M = this.V().as();
            return this.M;
        }
        if (c.lIIIIIIllIIlIlI((Object)var64.W(), (Object)d.DEMI_BOSS_EXPLORE)) {
            Player var65 = var64.E.getLocalPlayer();
            if (c.lIIIIIIllIIlIII(var65)) {
                return null;
            }
            g var66 = var64.J();
            if (c.lIIIIIIllIIlIII((Object)var66)) {
                return null;
            }
            if (c.lIIIIIIllIIllII(Inventory.getCount((boolean)llIlIIIllIlI[3], var64.a(var66.an().aA())))) {
                return null;
            }
            var64.M = var64.V().d(var65.getWorldLocation());
            return var64.M;
        }
        return null;
    }

    private boolean b(f f2) {
        boolean bl;
        if (!c.lIIIIIIllIIIllI(Inventory.contains(item -> f2.ac().contains(item.getId())) ? 1 : 0) || c.lIIIIIIllIIlIIl(Equipment.contains(item -> f2.ac().contains(item.getId())) ? 1 : 0)) {
            bl = llIlIIIllIlI[3];

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

        return Inventory.getCount(this.a(arrayList)) + this.D();
    }

    private static void lIIIIIIlIlIIIlI() {
        llIlIIIllIIl = new String[llIlIIIllIlI[9]];
        c.llIlIIIllIIl[c.llIlIIIllIlI[0]] = "Light";
        c.llIlIIIllIIl[c.llIlIIIllIlI[3]] = ":";
    }

        return String.valueOf(var67);
    }

    public boolean A() {
        int n2;
        if (c.lIIIIIIllIIIlII(Game.getState(), GameState.LOGIN_SCREEN) && c.lIIIIIIllIIIlIl(Vars.getBit((int)llIlIIIllIlI[2]), llIlIIIllIlI[3])) {
            n2 = llIlIIIllIlI[3];

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
        c var68;
        void var69;
        if (c.lIIIIIIllIIlIlI((Object)g2, (Object)g.DRAGON) && c.lIIIIIIllIIlIIl(this.b(f.TIER_3_STAFF) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (c.lIIIIIIllIIlIlI(var69, (Object)g.DARK_BEAST) && c.lIIIIIIllIIlIIl(var68.b(f.TIER_3_BOW) ? 1 : 0)) {
            return llIlIIIllIlI[3];
        }
        if (c.lIIIIIIllIIllII(var69.an().aC())) {
            bl = llIlIIIllIlI[3];

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
        Iterator<Map.Entry<i, Integer>> var70 = map.entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var70.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> var71 = var70.next();
            i var72 = var71.getKey();
            int var73 = var71.getValue();
            if (c.lIIIIIIllIIllII(var73)) {
                void var74;
                var74.addAll(var72.az());

            }

            if (2 != 0) continue;
            return null;
        }
        return arrayList;
    }

    public boolean R() {
        boolean bl;
        if (!c.lIIIIIIllIIIlII((Object)this.W(), (Object)d.FIRST_ROTATION_CREATE) || c.lIIIIIIllIIlIlI((Object)this.W(), (Object)d.PREPARE_BOSS_FIGHT)) {
            bl = llIlIIIllIlI[3];

            if (3 <= 1) {
                return false;
            }
        } else {
            bl = llIlIIIllIlI[0];
        }
        return bl;
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
        c var75;
        ItemContainer itemContainer = this.E.getItemContainer(InventoryID.INVENTORY);
        if (c.lIIIIIIllIIlIII(itemContainer)) {
            return llIlIIIllIlI[0];
        }
        Iterator<Map.Entry<i, Integer>> var76 = var75.E().entrySet().iterator();
        while (c.lIIIIIIllIIlIIl(var76.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> var77 = var76.next();
            int var78 = var77.getValue();
            if (c.lIIIIIIllIIllII(var78)) {
                return llIlIIIllIlI[0];
            }

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
        C = LoggerFactory.getLogger(GauntletManager.class);
    }

    private void GauntletManager(NPC nPC) {
        if (c.lIIIIIIllIIIllI(e.aw.contains(nPC.getName()) ? 1 : 0)) {
            return;
        }
        this.I = new GauntletManager(nPC);
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

