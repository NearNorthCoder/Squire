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
import java.util.ArrayList;
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
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum5;
import gg.squire.gauntlet.tasks.GameEnum3;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.LHelper;
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
        if (c.var3(optional.isEmpty() ? 1 : 0)) {
            this.b(l2.aQ());
            return var2[3];
        }
        WorldPoint var4 = Movement.getDestination();
        if (c.var3(Players.getLocal().isMoving() ? 1 : 0) && c.var5(var4) && c.var6(var4.distanceTo((Locatable)Players.getLocal()), var2[9])) {
            return var2[0];
        }
        optional.get().interact(var1[var2[0]]);
        this.N = this.E.getTickCount();
        return var2[3];
    }

    /*
     * WARNING - void declaration
     */
    public List<f> P() {
        void var2_2;
        int n2;
        f var7;
        int n3;
        c var8;
        List<Object> list;
        if (c.var3(this.F.makeArmour() ? 1 : 0)) {
            list = List.of(f.TIER_1_BODY, f.TIER_1_LEGS, f.TIER_1_HELM);
            0;
            if (((0x33 ^ 0x7E) & ~(0xC ^ 0x41)) >= 1) {
                return null;
            }
        } else {
            list = new ArrayList();
        }
        List<Object> var9 = list;
        ArrayList<f> var10 = new ArrayList<f>();
        List<f> var11 = var8.K();
        if (c.var12(var11.isEmpty() ? 1 : 0)) {
            var10.add(var11.get(var2[0]));
            0;
            var11.remove(var2[0]);
            0;
        }
        int var13 = Math.min(var8.F.potionGoal(), var2[3]);
        if (!c.var14((Object)var8.H, (Object)d.PREPARE_BOSS_FIGHT) || c.var15((Object)var8.H, (Object)d.DEMI_BOSS_EXPLORE)) {
            n3 = var8.F.potionGoal() - var8.C();
            0;
            if (2 <= 0) {
                return null;
            }
        } else {
            n3 = var13 - var8.C();
        }
        int var16 = n3;
        int var17 = var2[0];
        while (c.var18(var17, var16)) {
            var10.add(f.VIAL);
            0;
            ++var17;
            0;
            if (((0x3E ^ 0x79 ^ (0xF2 ^ 0x82)) & (0x4C ^ 0x74 ^ (0x6E ^ 0x61) ^ -1)) == 0) continue;
            return null;
        }
        var10.addAll(var9);
        0;
        var10.addAll(var11);
        0;
        var17 = Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0;
        if ((!c.var12(var17) || c.var3(var10.contains((Object)f.TIER_3_STAFF) ? 1 : 0)) && c.var12(Inventory.contains((int[])f.TIER_2_BOW.ad()) ? 1 : 0) && c.var12(Inventory.contains((int[])f.TIER_3_BOW.ad()) ? 1 : 0)) {
            var10.add(f.TIER_1_BOW);
            0;
        }
        if (c.var3(var8.F.makeT2Offhand() ? 1 : 0)) {
            var7 = var8.L();
            if (c.var5((Object)var7)) {
                if (c.var12(Inventory.contains((int[])var7.ad()) ? 1 : 0) && c.var12(Inventory.contains((int[])var7.af().ad()) ? 1 : 0) && c.var12(var10.contains((Object)var7.af()) ? 1 : 0)) {
                    var10.add(var7.af());
                    0;
                }
                var10.add(var7);
                0;
            }
            0;
            if (((0x15 ^ 0x4A) & ~(0x27 ^ 0x78)) < 0) {
                return null;
            }
        } else if (c.var3(var8.F.makeT3Offhand() ? 1 : 0) && c.var5((Object)(var7 = var8.L()))) {
            f var19;
            f f3;
            if (c.var15((Object)var7, (Object)f.TIER_2_BOW)) {
                f3 = f.TIER_3_BOW;
                0;
                if (-1 >= (0x21 ^ 0x25)) {
                    return null;
                }
            } else {
                f3 = f.TIER_3_STAFF;
            }
            if (c.var12(Inventory.contains((int[])(var19 = f3).ad()) ? 1 : 0)) {
                if (c.var12(Inventory.contains((int[])var7.ad()) ? 1 : 0)) {
                    f var20 = var7.af();
                    if (c.var12(Inventory.contains((int[])var20.ad()) ? 1 : 0) && c.var12(var10.contains((Object)var20) ? 1 : 0)) {
                        var10.add(var20);
                        0;
                    }
                    if (c.var12(var10.contains((Object)var7) ? 1 : 0)) {
                        var10.add(var7);
                        0;
                    }
                }
                var10.add(var19);
                0;
            }
        }
        if (c.var21(var8.F(), var8.F.fishGoal())) {
            n2 = var2[3];
            0;
            if ((0x2A ^ 5 ^ (0x17 ^ 0x3C)) <= 0) {
                return null;
            }
        } else {
            n2 = var7 = var2[0];
        }
        if ((!c.var14((Object)var8.W(), (Object)d.DEMI_BOSS_EXPLORE) || c.var15((Object)var8.W(), (Object)d.PREPARE_BOSS_FIGHT)) && c.var12(var7)) {
            var10.add(f.TELEPORT_CRYSTAL);
            0;
        }
        if (c.var6(i.CRYSTAL_SHARD.aC(), var2[10]) && c.var12(var8.F.makeT2Offhand() ? 1 : 0) && c.var12(var8.F.makeT3Offhand() ? 1 : 0) && c.var3(var7)) {
            var10.add(var8.L());
            0;
        }
        var10.removeIf(f2 -> {
            int n2;
            if (c.var14(f2, (Object)f.VIAL) && c.var14(f2, (Object)f.TELEPORT_CRYSTAL) && (!c.var12(Inventory.contains((int[])f2.ad()) ? 1 : 0) || c.var3(Equipment.contains((int[])f2.ad()) ? 1 : 0))) {
                n2 = var2[3];
                0;
                if (-(0xA3 ^ 0xA7) >= 0) {
                    return ((0x1D ^ 0x40) & ~(0xDD ^ 0x80)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        0;
        if (c.var15((Object)var8.W(), (Object)d.PREPARE_BOSS_FIGHT) && c.var3(Inventory.contains((int[])f.TELEPORT_CRYSTAL.ad()) ? 1 : 0)) {
            var10.remove((Object)f.TELEPORT_CRYSTAL);
            0;
        }
        return var2_2;
    }

    private static boolean var22(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        l var23;
        void var24;
        c var25;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (c.var26(this.G) && c.var3(Arrays.stream(e.O).anyMatch(n2 -> {
            boolean bl;
            if (c.var22(gameObject.getId(), n2)) {
                bl = var2[3];
                0;
                if (2 < 0) {
                    return ((199 + 115 - 265 + 160 ^ 150 + 149 - 280 + 139) & (93 + 42 - 132 + 213 ^ 110 + 93 - 135 + 83 ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }) ? 1 : 0)) {
            this.a(gameObject.getWorldLocation());
        }
        if (c.var5(var25.G) && c.var3(Arrays.stream(e.U).anyMatch(arg_0 -> c.a((GameObjectSpawned)var24, arg_0)) ? 1 : 0) && c.var5(var23 = var25.G.d(var24.getTile().getWorldLocation()))) {
            var23.b(var2[3]);
        }
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var6(int n2, int n3) {
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
        if (c.var22(n2, gameObjectSpawned.getGameObject().getId())) {
            bl = var2[3];
            0;
            if null != null {
                return ((0xC2 ^ 0xB1 ^ (0x5C ^ 0xB)) & (0x18 ^ 0x77 ^ (0x7B ^ 0x30) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    public l Y() {
        return this.J;
    }

    private static boolean var15(Object object, Object object2) {
        return object == object2;
    }

    private int D() {
        return Inventory.getCount(this.a(e.aa)) + Inventory.getCount(this.a(e.Z));
    }

    public boolean h(int n2) {
        boolean bl;
        if (!c.var12(i.CRYSTAL_ORB.aA().contains(n2) ? 1 : 0) || c.var3(i.CRYSTALLINE_BOWSTRING.aA().contains(n2) ? 1 : 0)) {
            bl = var2[3];
            0;
            if (2 <= -1) {
                return ((125 + 106 - 134 + 49 ^ 6 + 74 - 58 + 119) & (0xA8 ^ 0x99 ^ (0x9E ^ 0xB0) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
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
        void var27;
        void var28;
        Map<i, Integer> map = this.E();
        if (c.var3(f.TELEPORT_CRYSTAL.ac().contains(n2) ? 1 : 0) && c.var3(this.g(n2) ? 1 : 0)) {
            return var2[3];
        }
        if (!c.var12(i.CRYSTAL_SHARD.aA().contains((int)var28) ? 1 : 0) || c.var21(Inventory.getFreeSlots(), var2[1]) && c.var3(i.FISH.aA().contains((int)var28) ? 1 : 0)) {
            return var2[3];
        }
        int var29 = var2[0];
        Iterator var30 = var27.entrySet().iterator();
        while (c.var3(var30.hasNext() ? 1 : 0)) {
            Map.Entry var31 = var30.next();
            i var32 = (i)((Object)var31.getKey());
            if (c.var12(var32.aA().contains((int)var28) ? 1 : 0)) {
                0;
                if (((0xA7 ^ 0x95 ^ (0xA4 ^ 0xC5)) & (0xA2 ^ 0x9F ^ (0x5F ^ 0x31) ^ -1)) <= 2) continue;
                return ((63 + 38 - 18 + 47 ^ 35 + 98 - 8 + 9) & (128 + 100 - 159 + 87 ^ 133 + 92 - 90 + 17 ^ -1)) != 0;
            }
            var29 = var2[3];
            int var33 = (Integer)var31.getValue();
            if (c.var34(var33)) {
                return var2[0];
            }
            0;
            
            return ((0xF6 ^ 0xB4 ^ (0x47 ^ 0x5C)) & (0x6E ^ 0x57 ^ (0x58 ^ 0x38) ^ -1)) != 0;
        }
        return (boolean)var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public Map<i, Integer> E() {
        int n2;
        c var35;
        void var36;
        HashMap<i, Integer> hashMap = new HashMap<i, Integer>();
        List<f> list = this.P();
        Iterator<f> lllllllllllllllIlIIIlIlllIlIIIIl22 = list.iterator();
        while (c.var3(lllllllllllllllIlIIIlIlllIlIIIIl22.hasNext() ? 1 : 0)) {
            f var37 = lllllllllllllllIlIIIlIlllIlIIIIl22.next();
            Iterator<Map.Entry<i, Integer>> var38 = var37.ag().entrySet().iterator();
            while (c.var3(var38.hasNext() ? 1 : 0)) {
                Map.Entry<i, Integer> var39 = var38.next();
                int var40 = var36.getOrDefault((Object)var39.getKey(), var2[0]);
                var36.put(var39.getKey(), var40 += var39.getValue().intValue());
                0;
                0;
                if null == null continue;
                return null;
            }
            0;
            if ((0x74 ^ 0x70) >= (0x5F ^ 0x5B)) continue;
            return null;
        }
        int lllllllllllllllIlIIIlIlllIlIIIIl22 = Math.min(var35.F.potionGoal(), var2[3]);
        if (c.var15((Object)var35.H, (Object)d.PREPARE_BOSS_FIGHT)) {
            n2 = var35.F.potionGoal() - var35.C();
            0;
            
        } else {
            n2 = lllllllllllllllIlIIIlIlllIlIIIIl22;
        }
        int var37 = n2;
        int var38 = var37 * f.VIAL.ag().get((Object)i.CRYSTAL_SHARD);
        var36.put(i.CRYSTAL_SHARD, var36.getOrDefault((Object)i.CRYSTAL_SHARD, var2[0]) + var38);
        0;
        if (c.var14((Object)var35.H, (Object)d.EXTRA_FOOD_EXPLORE) && c.var14((Object)var35.H, (Object)d.PREPARE_BOSS_FIGHT)) {
            if (c.var15((Object)var35.H, (Object)d.FIRST_ROTATION_EXPLORE)) {
                var36.put(i.HERB, lllllllllllllllIlIIIlIlllIlIIIIl22);
                0;
                0;
                if (((0x6A ^ 8) & ~(0x32 ^ 0x50)) >= 3) {
                    return null;
                }
            } else {
                int var39 = Inventory.getCount(var35.a(e.aa));
                var36.put(i.HERB, var35.F.potionGoal() - var39);
                0;
            }
            if (c.var6(var35.F.fishGoal(), var2[4])) {
                var36.put(i.FISH, var35.F.fishGoal() / var2[5] * var2[6]);
                0;
                0;
                if ((0x6B ^ 4 ^ (0xC9 ^ 0xA2)) != (120 + 24 - 57 + 59 ^ 11 + 120 - 129 + 148)) {
                    return null;
                }
            } else {
                var36.put(i.FISH, var35.F.fishGoal() / var2[6] * var2[6]);
                0;
                0;
                if (3 >= (28 + 46 - -33 + 32 ^ 68 + 101 - 34 + 8)) {
                    return null;
                }
            }
        } else if (c.var41(Inventory.getFreeSlots())) {
            var36.put(i.FISH, var35.F.fishGoal());
            0;
        }
        Iterator var39 = var36.keySet().iterator();
        while (c.var3(var39.hasNext() ? 1 : 0)) {
            i var40 = (i)((Object)var39.next());
            int var42 = var2[0];
            if (c.var15((Object)var40, (Object)i.FISH)) {
                var42 = var35.F();
                0;
                if (1 < 0) {
                    return null;
                }
            } else {
                var42 = Inventory.getCount((boolean)var2[3], var35.a(var40.aA()));
            }
            var36.put(var40, (Integer)var36.get((Object)var40) - var42);
            0;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return hashMap;
    }

    private static boolean var41(int n2) {
        return n2 > 0;
    }

    public d W() {
        return this.H;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(f f2) {
        Iterator<Map.Entry<i, Integer>> var43 = f2.ag().entrySet().iterator();
        while (c.var3(var43.hasNext() ? 1 : 0)) {
            c var44;
            void var45;
            Map.Entry<i, Integer> var46 = var43.next();
            if (c.var5((Object)var45.af()) && c.var12(Inventory.contains(var44.a(var45.af().ac())) ? 1 : 0) && c.var12(Equipment.contains(var44.a(var45.af().ac())) ? 1 : 0) && c.var12(var44.a(var45.af()) ? 1 : 0)) {
                return var2[0];
            }
            if (c.var18(var46.getKey().aC(), var46.getValue())) {
                return var2[0];
            }
            0;
            if ((3 ^ 7) == (0x61 ^ 0x65)) continue;
            return ((0x5D ^ 6) & ~(0x16 ^ 0x4D)) != 0;
        }
        return var2[3];
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
            if (c.var12(this.a((f)((Object)f2)) ? 1 : 0)) {
                bl = var2[3];
                0;
                if null != null {
                    return ((0xB2 ^ 0xA7) & ~(0xA1 ^ 0xB4) & ~((0x97 ^ 0xA7) & ~(0xB1 ^ 0x81))) != 0;
                }
            } else {
                bl = var2[0];
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
        void var47;
        Widget widget = Widgets.get((int)WidgetInfo.GAUNTLET_TIMER_CONTAINER.getGroupId(), (int)var2[6]);
        if (c.var26(widget)) {
            return var2[0];
        }
        String var48 = var47.getText();
        if (c.var26(var48)) {
            return var2[0];
        }
        String[] stringArray = var2_2.split(var1[var2[3]]);
        int n2 = Integer.parseInt(stringArray[var2[3]].trim());
        int n3 = Integer.parseInt(stringArray[var2[9]].trim());
        return n3 + n2 * var2[10];
    }

    public l ab() {
        return this.M;
    }

    private static void var49() {
        var2 = new int[11];
        c.var2[0] = (0x64 ^ 0x3E ^ (0xE3 ^ 0xA3)) & (0xC6 ^ 0xB6 ^ (0xAE ^ 0xC4) ^ -1);
        c.var2[1] = 3;
        c.var2[2] = -(0xFFFFB77E & 0x5CA3) & (0xFFFFB7FF & 0x7FFB);
        c.var2[3] = 1;
        c.var2[4] = 0x87 ^ 0x8D;
        c.var2[5] = 0x75 ^ 0x59 ^ (0x36 ^ 0x12);
        c.var2[6] = 0x6E ^ 0x4B ^ (0x11 ^ 0x30);
        c.var2[7] = 0x5F ^ 0x7F;
        c.var2[8] = 0xC3 ^ 0xC6;
        c.var2[9] = 2;
        c.var2[10] = 0xFC ^ 0xA7 ^ (0xD2 ^ 0xB5);
    }

    public boolean S() {
        int n2;
        if (!c.var14((Object)this.W(), (Object)d.FIRST_ROTATION_EXPLORE) || !c.var14((Object)this.W(), (Object)d.DEMI_BOSS_EXPLORE) || !c.var14((Object)this.W(), (Object)d.WEAPON_FRAME_EXPLORE) || c.var15((Object)this.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = var2[3];
            0;
            if null != null {
                return ((0xBA ^ 0x8C ^ (0x7E ^ 0x1B)) & (0xCE ^ 0x96 ^ (0xB4 ^ 0xBF) ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    private void b(WorldPoint worldPoint) {
        Player player = Players.getLocal();
        if (c.var18(player.distanceTo(worldPoint), var2[8])) {
            Movement.setDestination((WorldPoint)worldPoint);
        }
        Movement.walkTo((WorldPoint)worldPoint, (boolean)var2[0]);
        0;
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    private <T extends Identifiable> Predicate<T> a(List<Integer> list) {
        return identifiable -> list.contains(identifiable.getId());
    }

    private static boolean var21(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public List<f> K() {
        void var1_1;
        if (c.var26(this.I)) {
            return Collections.emptyList();
        }
        ArrayList<f> var50 = new ArrayList<f>();
        f var51 = f.TIER_3_STAFF;
        while (c.var5((Object)var51) && c.var12(Inventory.contains((int[])var51.ad()) ? 1 : 0) && c.var12(Equipment.contains((int[])var51.ad()) ? 1 : 0)) {
            var50.add(var51);
            0;
            var51 = var51.af();
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
        void var52;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var53 = var2[0];
        while (c.var18(var53, (int)var52)) {
            c var54;
            void var55;
            void var56 = var55[var53];
            if (c.var3(var54.f((int)var56) ? 1 : 0)) {
                return var2[3];
            }
            ++var53;
            0;
            if (-(0x5C ^ 0x69 ^ (0x64 ^ 0x55)) < 0) continue;
            return ((0x40 ^ 0x5B ^ 1) & (0xD7 ^ 0xC6 ^ (0x4F ^ 0x44) ^ -1)) != 0;
        }
        return var2[0];
    }

    /*
     * WARNING - void declaration
     */
    public g J() {
        void var1_2;
        g lllllllllllllllIlIIIlIllIllIlIlI2;
        c var57;
        if (c.var3(this.F.makeT3Offhand() ? 1 : 0)) {
            g g2;
            void lllllllllllllllIlIIIlIllIllIlIlI2;
            void var58;
            ArrayList<g> arrayList = new ArrayList<g>();
            Map<i, Integer> map = this.E();
            if (c.var3(map.containsKey((Object)i.CRYSTAL_ORB) ? 1 : 0) && c.var12(i.CRYSTAL_ORB.aC()) && c.var12(Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0)) {
                arrayList.add(g.DRAGON);
                0;
            }
            if (c.var3(var58.containsKey((Object)i.CRYSTALLINE_BOWSTRING) ? 1 : 0) && c.var12(i.CRYSTALLINE_BOWSTRING.aC()) && c.var12(Inventory.contains((int[])f.TIER_3_BOW.ad()) ? 1 : 0)) {
                lllllllllllllllIlIIIlIllIllIlIlI2.add(g.DARK_BEAST);
                0;
            }
            Iterator var59 = lllllllllllllllIlIIIlIllIllIlIlI2.iterator();
            while (c.var3(var59.hasNext() ? 1 : 0)) {
                g var60 = (g)((Object)var59.next());
                NPC var61 = NPCs.getNearest((int[])var60.ah());
                if (c.var5(var61)) {
                    return var60;
                }
                0;
                if (1 != (20 + 101 - 35 + 92 ^ 126 + 178 - 169 + 47)) continue;
                return null;
            }
            if (c.var3(lllllllllllllllIlIIIlIllIllIlIlI2.isEmpty() ? 1 : 0)) {
                g2 = null;
                0;
                if (2 <= 0) {
                    return null;
                }
            } else {
                g2 = (g)((Object)lllllllllllllllIlIIIlIllIllIlIlI2.get(var2[0]));
            }
            return g2;
        }
        if (c.var14(var57.I.aD(), HeadIcon.MAGIC)) {
            lllllllllllllllIlIIIlIllIllIlIlI2 = g.DRAGON;
            0;
            if (3 >= (0x9C ^ 0x98)) {
                return null;
            }
        } else {
            lllllllllllllllIlIIIlIllIllIlIlI2 = g.DARK_BEAST;
        }
        if (c.var3(var57.a(lllllllllllllllIlIIIlIllIllIlIlI2) ? 1 : 0)) {
            return null;
        }
        return var1_2;
    }

    public void a(d d2) {
        this.H = d2;
    }

    public boolean O() {
        if (c.var3(this.a((i i2) -> {
            boolean bl;
            if (c.var15(i2, (Object)i.FISH)) {
                bl = var2[3];
                0;
                if (-1 > 0) {
                    return ((0x64 ^ 0x3E ^ (0x54 ^ 0x33)) & (4 ^ 0x49 ^ (0x1F ^ 0x6F) ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }) ? 1 : 0)) {
            boolean bl;
            int n2 = this.h().fishGoal() - this.h().fishGoalDeviation();
            if (c.var62(n2, this.F())) {
                bl = var2[3];
                0;
                if null != null {
                    return ((50 + 53 - 83 + 114 ^ 114 + 161 - 145 + 64) & (107 + 43 - 117 + 172 ^ 101 + 99 - 76 + 13 ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }
        return var2[0];
    }

    @Inject
    public GauntletManager(EventBus eventBus, Client client, GauntletConfig gauntletConfig) {
        this.H = d.OUTSIDE;
        this.N = var2[0];
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
        void var63;
        c var64;
        this.GauntletManager(npcSpawned.getNpc());
        g g2 = g.i(npcSpawned.getNpc().getId());
        if (c.var26((Object)g2)) {
            return;
        }
        l var65 = var64.V().d(var63.getNpc().getWorldLocation());
        if (c.var26(var65)) {
            return;
        }
        var3_3.b(g2);
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Predicate<i> predicate) {
        c var66;
        ItemContainer itemContainer = this.E.getItemContainer(InventoryID.INVENTORY);
        if (c.var26(itemContainer)) {
            return var2[0];
        }
        Iterator<Map.Entry<i, Integer>> var67 = var66.E().entrySet().iterator();
        while (c.var3(var67.hasNext() ? 1 : 0)) {
            void var68;
            Map.Entry<i, Integer> var69 = var67.next();
            if (c.var3(var68.test(var69.getKey()) ? 1 : 0)) {
                0;
                if (-3 < 0) continue;
                return (1 & ~1) != 0;
            }
            int var70 = var69.getValue();
            if (c.var41(var70)) {
                return var2[0];
            }
            0;
            if null == null continue;
            return ((0x91 ^ 0xB4) & ~(8 ^ 0x2D)) != 0;
        }
        return var2[3];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(l l2, WorldPoint worldPoint) {
        void var71;
        void var72;
        c var73;
        this.M = this.G.d(worldPoint);
        if (c.var26(this.M)) {
            return var2[0];
        }
        if (c.var3(var73.M.e((var72) ? 1 : 0)) {
            if (c.var3(var72.aY() ? 1 : 0)) {
                var73.J = null;
                var73.K = Collections.emptyList();
                var73.b(var72.aQ());
                return var2[3];
            }
            var73.J = var72;
            var73.K = Collections.emptyList();
            return var73.a(var73.M, (var72);
        }
        List<l> var74 = var73.G.a((WorldPoint)var71, (var72);
        if (c.var3(var74.isEmpty() ? 1 : 0)) {
            var73.J = null;
            return var2[3];
        }
        Collections.reverse(var74);
        var73.K = var74;
        Player var75 = Players.getLocal();
        var73.J = null;
        int var76 = var2[0];
        while (c.var18(var76, var74.size())) {
            l var77 = var74.get(var76);
            if (c.var22(var77.aO(), var2[1]) && c.var22(var77.aP(), var2[1])) {
                return var2[0];
            }
            if (c.var3(var77.aY() ? 1 : 0) && c.var62(var77.aQ().distanceTo(var75.getWorldLocation()), var2[7]) && c.var12(var77.e(var75.getWorldLocation()) ? 1 : 0)) {
                var73.b(var77.aQ());
                return var2[3];
            }
            if (c.var12(var77.aY() ? 1 : 0)) {
                l l3;
                if (c.var41(var76)) {
                    l3 = var74.get(var76 - var2[3]);
                    0;
                    if (3 <= 0) {
                        return ((97 + 82 - 64 + 14 ^ 184 + 142 - 142 + 12) & (0xB3 ^ 0x9F ^ (0xA8 ^ 0xC1) ^ -1)) != 0;
                    }
                } else {
                    l3 = var73.M;
                }
                l var78 = l3;
                var73.a(var78, var77);
                0;
                return var2[3];
            }
            ++var76;
            0;
            if ((0x10 ^ 0x15) != 0) continue;
            return ((0xE5 ^ 0xA1) & ~(0x3B ^ 0x7F)) != 0;
        }
        return var2[3];
    }

    public h V() {
        return this.G;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        c var79;
        if (c.var14(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        if (c.var12(var79.A() ? 1 : 0)) {
            if (c.var5(var79.G)) {
                var79.G.ao();
                var79.G = null;
            }
            var79.H = d.OUTSIDE;
        }
    }

    public l T() {
        c var80;
        if (c.var15((Object)this.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            this.M = this.V().as();
            return this.M;
        }
        if (c.var15((Object)var80.W(), (Object)d.DEMI_BOSS_EXPLORE)) {
            Player var81 = var80.E.getLocalPlayer();
            if (c.var26(var81)) {
                return null;
            }
            g var82 = var80.J();
            if (c.var26((Object)var82)) {
                return null;
            }
            if (c.var41(Inventory.getCount((boolean)var2[3], var80.a(var82.an().aA())))) {
                return null;
            }
            var80.M = var80.V().d(var81.getWorldLocation());
            return var80.M;
        }
        return null;
    }

    private boolean b(f f2) {
        boolean bl;
        if (!c.var12(Inventory.contains(item -> f2.ac().contains(item.getId())) ? 1 : 0) || c.var3(Equipment.contains(item -> f2.ac().contains(item.getId())) ? 1 : 0)) {
            bl = var2[3];
            0;
            if ((6 ^ 2) < 0) {
                return (2 & ~2) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private int C() {
        List<Integer> list = f.VIAL.ac();
        List list2 = list.stream().map(n2 -> n2 + var2[3]).collect(Collectors.toList());
        ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
        arrayList.addAll(list2);
        0;
        return Inventory.getCount(this.a(arrayList)) + this.D();
    }

    private static void var83() {
        var1 = new String[var2[9]];
        c.var1[c.var2[0]] = "Light";
        c.var1[c.var2[3]] = ":";
    }

    private static String var84(String var85, String var86) {
        var85 = new String(Base64.getDecoder().decode(var85.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var87 = new StringBuilder();
        char[] var88 = var86.toCharArray();
        int var89 = var2[0];
        char[] var90 = var85.toCharArray();
        int var91 = var90.length;
        int var92 = var2[0];
        while (c.var18(var92, var91)) {
            char var93 = var90[var92];
            var87.append((char)(var93 ^ var88[var89 % var88.length]));
            0;
            ++var89;
            ++var92;
            0;
            if (((0xD9 ^ 0x82) & ~(0xE ^ 0x55)) < 1) continue;
            return null;
        }
        return String.valueOf(var87);
    }

    public boolean A() {
        int n2;
        if (c.var14(Game.getState(), GameState.LOGIN_SCREEN) && c.var22(Vars.getBit((int)var2[2]), var2[3])) {
            n2 = var2[3];
            0;
            if (-(62 + 23 - -2 + 46 ^ 67 + 17 - 13 + 57) >= 0) {
                return ((0x63 ^ 0x52 ^ (0x79 ^ 5)) & (0x34 ^ 0x4C ^ (0x22 ^ 0x17) ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    public boolean B() {
        boolean bl;
        if (c.var12(i.WEAPON_FRAME.aC())) {
            bl = var2[3];
            0;
            if (((0x2A ^ 0x2C) & ~(0x89 ^ 0x8F)) != 0) {
                return ((0xE4 ^ 0xA3) & ~(4 ^ 0x43)) != 0;
            }
        } else {
            bl = var2[0];
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
                if (!c.var62(Inventory.getFreeSlots(), var2[3])) break block2;
                int[] nArray = new int[var2[3]];
                nArray[c.var2[0]] = n2;
                if (!c.var3(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            n3 = var2[3];
            0;
            if ((0x18 ^ 0x1C) >= 1) return n3 != 0;
            return ((0xE ^ 0x2D) & ~(0xE4 ^ 0xC7)) != 0;
        }
        n3 = var2[0];
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(g g2) {
        boolean bl;
        c var94;
        void var95;
        if (c.var15((Object)g2, (Object)g.DRAGON) && c.var3(this.b(f.TIER_3_STAFF) ? 1 : 0)) {
            return var2[3];
        }
        if (c.var15(var95, (Object)g.DARK_BEAST) && c.var3(var94.b(f.TIER_3_BOW) ? 1 : 0)) {
            return var2[3];
        }
        if (c.var41(var95.an().aC())) {
            bl = var2[3];
            0;
            if (2 == 1) {
                return ((0xB3 ^ 0xC0 ^ (0x91 ^ 0xC2)) & (0xD5 ^ 0xA7 ^ (0xEF ^ 0xBD) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
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
        Iterator<Map.Entry<i, Integer>> var96 = map.entrySet().iterator();
        while (c.var3(var96.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> var97 = var96.next();
            i var98 = var97.getKey();
            int var99 = var97.getValue();
            if (c.var41(var99)) {
                void var100;
                var100.addAll(var98.az());
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
        if (!c.var14((Object)this.W(), (Object)d.FIRST_ROTATION_CREATE) || c.var15((Object)this.W(), (Object)d.PREPARE_BOSS_FIGHT)) {
            bl = var2[3];
            0;
            if (3 <= 1) {
                return ((0xAF ^ 0xA7) & ~(0x82 ^ 0x8A)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

        catch (Exception var106) {
            var106.printStackTrace();
            return null;
        }
    }

    private GameObject a(l l2) {
        Player player = this.E.getLocalPlayer();
        if (c.var26(player)) {
            return null;
        }
        List<Integer> list = this.Q();
        return (GameObject)TileObjects.getNearest(tileObject -> {
            int n2;
            if (c.var3(list.contains(tileObject.getId()) ? 1 : 0) && (!c.var5(l2) || c.var3(l2.e(tileObject.getWorldLocation()) ? 1 : 0))) {
                n2 = var2[3];
                0;
                if null != null {
                    return ((85 + 37 - 107 + 183 ^ 133 + 89 - 100 + 22) & (58 + 183 - 101 + 92 ^ 46 + 89 - -3 + 52 ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
    }

    private void b() {
        this.N = var2[0];
        this.M = null;
        this.L = null;
        this.K = null;
        this.J = null;
        this.I = null;
        this.H = d.OUTSIDE;
        this.G = null;
    }

    public boolean N() {
        c var107;
        ItemContainer itemContainer = this.E.getItemContainer(InventoryID.INVENTORY);
        if (c.var26(itemContainer)) {
            return var2[0];
        }
        Iterator<Map.Entry<i, Integer>> var108 = var107.E().entrySet().iterator();
        while (c.var3(var108.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> var109 = var108.next();
            int var110 = var109.getValue();
            if (c.var41(var110)) {
                return var2[0];
            }
            0;
            if (-1 <= 0) continue;
            return ((0x3C ^ 0x38) & ~(0x94 ^ 0x90)) != 0;
        }
        return var2[3];
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    public int F() {
        return i.FISH.aC() + Inventory.getCount(item -> e.aH.contains(item.getId())) + this.G.av().bb();
    }

    private static boolean var26(Object object) {
        return object == null;
    }

    public f L() {
        if (c.var26(this.I)) {
            return null;
        }
        return f.TIER_2_BOW;
    }

    static {
        c.var49();
        c.var83();
        C = LoggerFactory.getLogger(GauntletManager.class);
    }

    private void GauntletManager(NPC nPC) {
        if (c.var12(e.aw.contains(nPC.getName()) ? 1 : 0)) {
            return;
        }
        this.I = new GauntletManager(nPC);
    }

    private static boolean var34(int n2) {
        return n2 <= 0;
    }

    private void a(WorldPoint worldPoint) {
        l l2 = l.a(worldPoint, new Point(var2[1], var2[1]));
        this.G = new HHelper(Objects.requireNonNull(this.E.getLocalPlayer()).getWorldLocation(), l2);
        this.H = d.FIRST_ROTATION_EXPLORE;
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var62(int n2, int n3) {
        return n2 <= n3;
    }
}

