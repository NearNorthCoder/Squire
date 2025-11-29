/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Deque
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.hydra.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.GameEnum;
import gg.squire.hydra.tasks.GameEnum4;

@TaskDesc(name="Moving towards the next tile", priority=2, register=true)
public class MovingTowardsTheNextTileTask
extends Task {
    private final  HashSet<WorldPoint> aP;
    private static final  int aL;
    private final  SquireAlchemicalHydraConfig aO;
    private final  e aN;

    private final  a aM;
    private  HashSet<WorldPoint> aQ;

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        LocalPoint var4;
        w var5;
        Set<LocalPoint> var6;
        void var7;
        h h2 = this.aM.k();
        if (!w.var8(h2) || !w.var9(this.aM.g() ? 1 : 0) || w.var10(this.aO.attack() ? 1 : 0)) {
            return var1[0];
        }
        Player var11 = Players.getLocal();
        Client var12 = Static.getClient();
        if (w.var10(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var13 = var7.c(var1[0]);
        if (w.var14(var13)) {
            var13 = var11.getWorldLocation();
        }
        if (w.var9((var6 = var5.aM.f()).contains(var4 = LocalPoint.fromWorld((Client)var12, (WorldPoint)var13)) ? 1 : 0)) {
            Object var15;
            int n2;
            if (w.var3((Object)var7.S(), (Object)k.POISON)) {
                n2 = var1[1];
                0;
                if (-(84 + 49 - 77 + 92 ^ 29 + 116 - 91 + 90) >= 0) {
                    return ((0x6B ^ 0x53 ^ (0x4C ^ 0x56)) & (0xC2 ^ 0x85 ^ (0x52 ^ 0x37) ^ -1)) != 0;
                }
            } else {
                n2 = var1[2];
            }
            int var16 = n2;
            var5.aQ = new HashSet(var13.toWorldArea().offset(var16).toWorldPointList());
            Deque var17 = var6.iterator();
            while (w.var9(var17.hasNext() ? 1 : 0)) {
                var15 = var17.next();
                WorldPoint var18 = WorldPoint.fromLocal((Client)var12, (LocalPoint)var15);
                List var19 = var18.toWorldArea().offset(var1[3]).toWorldPointList();
                Iterator var20 = var19.iterator();
                while (w.var9(var20.hasNext() ? 1 : 0)) {
                    WorldPoint var21 = (WorldPoint)var20.next();
                    var5.aQ.remove(var21);
                    0;
                    0;
                    if (((0x3A ^ 0x3E) & ~(4 ^ 0)) != 3) continue;
                    return ((0x6A ^ 0x7D) & ~(0xB5 ^ 0xA2)) != 0;
                }
                0;
                if (-3 <= 0) continue;
                return ((0x89 ^ 0xA6) & ~(0x8C ^ 0xA3)) != 0;
            }
            var17 = var12.getGraphicsObjects();
            var17.forEach(graphicsObject -> {
                LocalPoint localPoint = graphicsObject.getLocation();
                if (w.var14(localPoint)) {
                    return;
                }
                WorldPoint worldPoint = WorldPoint.fromLocal((Client)var12, (LocalPoint)localPoint);
                this.aQ.remove(worldPoint);
                0;
            });
            var15 = new ArrayList();
            var17.forEach(arg_0 -> w.a(var12, (List)var15, arg_0));
            HashSet<WorldPoint> hashSet = var5.aQ;
            Objects.requireNonNull(hashSet);
            0;
            var15.forEach(hashSet::remove);
            var5.aQ.stream().filter(Reachable::isWalkable).filter(worldPoint -> {
                boolean bl;
                if (w.var14(TileObjects.getFirstAt((WorldPoint)worldPoint, tileObject -> tileObject.getName().contains(var2[var1[0]])))) {
                    bl = var1[3];
                    0;
                    if (2 == 1) {
                        return ((0xD3 ^ 0x92 ^ (0xE8 ^ 0xA1)) & (0x74 ^ 0x14 ^ (0x79 ^ 0x11) ^ -1)) != 0;
                    }
                } else {
                    bl = var1[0];
                }
                return bl;
            }).filter(arg_0 -> w.a(var12, (List)var15, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var11))).ifPresent(Movement::walkTo);
            return var1[3];
        }
        if (!w.var22((Object)var7.S(), (Object)k.ENRAGED) || w.var3((Object)var7.S(), (Object)k.FLAME) && w.var10(var7.Q() ? 1 : 0)) {
            return var1[0];
        }
        if (w.var3((Object)var7.S(), (Object)k.LIGHTNING) && w.var3((Object)var7.R(), (Object)l.WAITING)) {
            if (w.var23(var7.I(), var1[2])) {
                var7.a(l.MOVING);
            }
            return var1[0];
        }
        if (w.var3((Object)var7.S(), (Object)k.LIGHTNING) && w.var3((Object)var7.R(), (Object)l.MOVING)) {
            return var1[0];
        }
        if (w.var9(var11.getWorldLocation().equals((Object)var13) ? 1 : 0)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.aP.clear();
        return var1[3];
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static  void a(Client client, List list, GraphicsObject graphicsObject) {
        if (w.var24(graphicsObject.getId(), var1[4])) {
            void var25;
            void var26;
            Client var27;
            LocalPoint localPoint = graphicsObject.getLocation();
            if (w.var14(localPoint)) {
                return;
            }
            WorldPoint var28 = WorldPoint.fromLocal((Client)var27, (LocalPoint)var26);
            var25.add(var28);
            0;
        }
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static  boolean a(Client client, List list, WorldPoint worldPoint) {
        Stream stream = Players.getLocal().getWorldLocation().pathTo(client, worldPoint).stream();
        List list2 = list;
        Objects.requireNonNull(list2);
        0;
        return stream.noneMatch(list2::contains);
    }

    private static boolean var23(int n2, int n3) {
        return n2 > n3;
    }

    private static void var29() {
        var1 = new int[6];
        w.var1[0] = (0x9D ^ 0xC7) & ~(0xE4 ^ 0xBE);
        w.var1[1] = 0x7C ^ 0x79;
        w.var1[2] = 3;
        w.var1[3] = 1;
        w.var1[4] = -(0xFFFFEDD7 & 0x7B3B) & (0xFFFFFF9F & 0x6FF6);
        w.var1[5] = 2;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static void var36() {
        var2 = new String[var1[3]];
        w.var2[w.var1[0]] = "vent";
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    static {
        w.var29();
        w.var36();
        aL = var1[4];
    }

    private static boolean var22(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var24(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public MovingTowardsTheNextTileTask(a a2, e e2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aP = new HashSet();
        this.aM = a2;
        this.aN = e2;
        this.aO = squireAlchemicalHydraConfig;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        this.aP.add(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)graphicsObject.getLocation()));
        0;
    }
}

