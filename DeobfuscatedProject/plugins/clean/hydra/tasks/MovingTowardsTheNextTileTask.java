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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.hydra.tasks.AHelper;
import gg.squire.hydra.tasks.EHelper;
import gg.squire.hydra.tasks.HHelper;
import gg.squire.hydra.tasks.GameEnum;
import gg.squire.hydra.tasks.GameEnum18;

@TaskDesc(name="Moving towards the next tile", priority=2, register=true)
public class MovingTowardsTheNextTileTask
extends Task {
    private final  HashSet<WorldPoint> aP;
    private static final  int aL;
    private final  SquireAlchemicalHydraConfig aO;
    private final  e aN;

    private final  a aM;
    private  HashSet<WorldPoint> aQ;

    private static boolean lIIlIIIIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        LocalPoint var1;
        w var2;
        Set<LocalPoint> var3;
        void var4;
        h h2 = this.aM.k();
        if (!w.lIIlIIIIIIlIIlI(h2) || !w.lIIlIIIIIIlIIll(this.aM.g() ? 1 : 0) || w.lIIlIIIIIIlIlII(this.aO.attack() ? 1 : 0)) {
            return llllIIllIlll[0];
        }
        Player var5 = Players.getLocal();
        Client var6 = Static.getClient();
        if (w.lIIlIIIIIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIllIlll[0];
        }
        WorldPoint var7 = var4.c(llllIIllIlll[0]);
        if (w.lIIlIIIIIIlIlIl(var7)) {
            var7 = var5.getWorldLocation();
        }
        if (w.lIIlIIIIIIlIIll((var3 = var2.aM.f()).contains(var1 = LocalPoint.fromWorld((Client)var6, (WorldPoint)var7)) ? 1 : 0)) {
            Object var8;
            int n2;
            if (w.lIIlIIIIIIlIllI((Object)var4.S(), (Object)k.POISON)) {
                n2 = llllIIllIlll[1];

                if (-(84 + 49 - 77 + 92 ^ 29 + 116 - 91 + 90) >= 0) {
                    return ((0x6B ^ 0x53 ^ (0x4C ^ 0x56)) & (0xC2 ^ 0x85 ^ (0x52 ^ 0x37) ^ -1)) != 0;
                }
            } else {
                n2 = llllIIllIlll[2];
            }
            int var9 = n2;
            var2.aQ = new HashSet(var7.toWorldArea().offset(var9).toWorldPointList());
            Deque var10 = var3.iterator();
            while (w.lIIlIIIIIIlIIll(var10.hasNext() ? 1 : 0)) {
                var8 = var10.next();
                WorldPoint var11 = WorldPoint.fromLocal((Client)var6, (LocalPoint)var8);
                List var12 = var11.toWorldArea().offset(llllIIllIlll[3]).toWorldPointList();
                Iterator var13 = var12.iterator();
                while (w.lIIlIIIIIIlIIll(var13.hasNext() ? 1 : 0)) {
                    WorldPoint var14 = (WorldPoint)var13.next();
                    var2.aQ.remove(var14);

                    if (((0x3A ^ 0x3E) & ~(4 ^ 0)) != 3) continue;
                    return false;
                }

                if (-3 <= 0) continue;
                return false;
            }
            var10 = var6.getGraphicsObjects();
            var10.forEach(graphicsObject -> {
                LocalPoint localPoint = graphicsObject.getLocation();
                if (w.lIIlIIIIIIlIlIl(localPoint)) {
                    return;
                }
                WorldPoint worldPoint = WorldPoint.fromLocal((Client)var6, (LocalPoint)localPoint);
                this.aQ.remove(worldPoint);

            });
            var8 = new ArrayList();
            var10.forEach(arg_0 -> w.a(var6, (List)var8, arg_0));
            HashSet<WorldPoint> hashSet = var2.aQ;
            Objects.requireNonNull(hashSet);

            var8.forEach(hashSet::remove);
            var2.aQ.stream().filter(Reachable::isWalkable).filter(worldPoint -> {
                boolean bl;
                if (w.lIIlIIIIIIlIlIl(TileObjects.getFirstAt((WorldPoint)worldPoint, tileObject -> tileObject.getName().contains(llllIIllIllI[llllIIllIlll[0]])))) {
                    bl = llllIIllIlll[3];

                    if (2 == 1) {
                        return ((0xD3 ^ 0x92 ^ (0xE8 ^ 0xA1)) & (0x74 ^ 0x14 ^ (0x79 ^ 0x11) ^ -1)) != 0;
                    }
                } else {
                    bl = llllIIllIlll[0];
                }
                return bl;
            }).filter(arg_0 -> w.a(var6, (List)var8, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)var5))).ifPresent(Movement::walkTo);
            return llllIIllIlll[3];
        }
        if (!w.lIIlIIIIIIlIlll((Object)var4.S(), (Object)k.ENRAGED) || w.lIIlIIIIIIlIllI((Object)var4.S(), (Object)k.FLAME) && w.lIIlIIIIIIlIlII(var4.Q() ? 1 : 0)) {
            return llllIIllIlll[0];
        }
        if (w.lIIlIIIIIIlIllI((Object)var4.S(), (Object)k.LIGHTNING) && w.lIIlIIIIIIlIllI((Object)var4.R(), (Object)l.WAITING)) {
            if (w.lIIlIIIIIIllIII(var4.I(), llllIIllIlll[2])) {
                var4.a(l.MOVING);
            }
            return llllIIllIlll[0];
        }
        if (w.lIIlIIIIIIlIllI((Object)var4.S(), (Object)k.LIGHTNING) && w.lIIlIIIIIIlIllI((Object)var4.R(), (Object)l.MOVING)) {
            return llllIIllIlll[0];
        }
        if (w.lIIlIIIIIIlIIll(var5.getWorldLocation().equals((Object)var7) ? 1 : 0)) {
            return llllIIllIlll[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        this.aP.clear();
        return llllIIllIlll[3];
    }

    private static boolean lIIlIIIIIIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIIIlIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static  void a(Client client, List list, GraphicsObject graphicsObject) {
        if (w.lIIlIIIIIIllIIl(graphicsObject.getId(), llllIIllIlll[4])) {
            void var15;
            void var16;
            Client var17;
            LocalPoint localPoint = graphicsObject.getLocation();
            if (w.lIIlIIIIIIlIlIl(localPoint)) {
                return;
            }
            WorldPoint var18 = WorldPoint.fromLocal((Client)var17, (LocalPoint)var16);
            var15.add(var18);

        }
    }

    private static boolean lIIlIIIIIIlIIlI(Object object) {
        return object != null;
    }

    private static  boolean a(Client client, List list, WorldPoint worldPoint) {
        Stream stream = Players.getLocal().getWorldLocation().pathTo(client, worldPoint).stream();
        List list2 = list;
        Objects.requireNonNull(list2);

        return stream.noneMatch(list2::contains);
    }

    private static boolean lIIlIIIIIIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlIIIIIIlIIII() {
        llllIIllIllI = new String[llllIIllIlll[3]];
        w.llllIIllIllI[w.llllIIllIlll[0]] = "vent";
    }

    private static boolean lIIlIIIIIIlIlIl(Object object) {
        return object == null;
    }

    static {
        w.lIIlIIIIIIlIIIl();
        w.lIIlIIIIIIlIIII();
        aL = llllIIllIlll[4];
    }

    private static boolean lIIlIIIIIIlIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIIIIIllIIl(int n2, int n3) {
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

    }
}

