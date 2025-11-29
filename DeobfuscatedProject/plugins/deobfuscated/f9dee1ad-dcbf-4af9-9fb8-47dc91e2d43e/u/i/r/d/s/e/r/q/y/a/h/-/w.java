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
package u.i.r.d.s.e.r.q.y.a.h.-;

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
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.e;
import u.i.r.d.s.e.r.q.y.a.h.-.h;
import u.i.r.d.s.e.r.q.y.a.h.-.k;
import u.i.r.d.s.e.r.q.y.a.h.-.l;

@TaskDesc(name="Moving towards the next tile", priority=2, register=true)
public class w
extends Task {
    private final /* synthetic */ HashSet<WorldPoint> aP;
    private static final /* synthetic */ int aL;
    private final /* synthetic */ SquireAlchemicalHydraConfig aO;
    private final /* synthetic */ e aN;
    private static /* synthetic */ int[] llllIIllIlll;
    private static /* synthetic */ String[] llllIIllIllI;
    private final /* synthetic */ a aM;
    private /* synthetic */ HashSet<WorldPoint> aQ;

    private static boolean lIIlIIIIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        LocalPoint lllllllllllllllIIlIlIlIIIIllllll;
        w lllllllllllllllIIlIlIlIIIlIIIlIl;
        Set<LocalPoint> lllllllllllllllIIlIlIlIIIlIIIIII;
        void lllllllllllllllIIlIlIlIIIlIIIlII;
        h h2 = this.aM.k();
        if (!w.lIIlIIIIIIlIIlI(h2) || !w.lIIlIIIIIIlIIll(this.aM.g() ? 1 : 0) || w.lIIlIIIIIIlIlII(this.aO.attack() ? 1 : 0)) {
            return llllIIllIlll[0];
        }
        Player lllllllllllllllIIlIlIlIIIlIIIIll = Players.getLocal();
        Client lllllllllllllllIIlIlIlIIIlIIIIlI = Static.getClient();
        if (w.lIIlIIIIIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIllIlll[0];
        }
        WorldPoint lllllllllllllllIIlIlIlIIIlIIIIIl = lllllllllllllllIIlIlIlIIIlIIIlII.c(llllIIllIlll[0]);
        if (w.lIIlIIIIIIlIlIl(lllllllllllllllIIlIlIlIIIlIIIIIl)) {
            lllllllllllllllIIlIlIlIIIlIIIIIl = lllllllllllllllIIlIlIlIIIlIIIIll.getWorldLocation();
        }
        if (w.lIIlIIIIIIlIIll((lllllllllllllllIIlIlIlIIIlIIIIII = lllllllllllllllIIlIlIlIIIlIIIlIl.aM.f()).contains(lllllllllllllllIIlIlIlIIIIllllll = LocalPoint.fromWorld((Client)lllllllllllllllIIlIlIlIIIlIIIIlI, (WorldPoint)lllllllllllllllIIlIlIlIIIlIIIIIl)) ? 1 : 0)) {
            Object lllllllllllllllIIlIlIlIIIIllllII;
            int n2;
            if (w.lIIlIIIIIIlIllI((Object)lllllllllllllllIIlIlIlIIIlIIIlII.S(), (Object)k.POISON)) {
                n2 = llllIIllIlll[1];
                0;
                if (-(84 + 49 - 77 + 92 ^ 29 + 116 - 91 + 90) >= 0) {
                    return ((0x6B ^ 0x53 ^ (0x4C ^ 0x56)) & (0xC2 ^ 0x85 ^ (0x52 ^ 0x37) ^ -1)) != 0;
                }
            } else {
                n2 = llllIIllIlll[2];
            }
            int lllllllllllllllIIlIlIlIIIIlllllI = n2;
            lllllllllllllllIIlIlIlIIIlIIIlIl.aQ = new HashSet(lllllllllllllllIIlIlIlIIIlIIIIIl.toWorldArea().offset(lllllllllllllllIIlIlIlIIIIlllllI).toWorldPointList());
            Deque lllllllllllllllIIlIlIlIIIIllllIl = lllllllllllllllIIlIlIlIIIlIIIIII.iterator();
            while (w.lIIlIIIIIIlIIll(lllllllllllllllIIlIlIlIIIIllllIl.hasNext() ? 1 : 0)) {
                lllllllllllllllIIlIlIlIIIIllllII = lllllllllllllllIIlIlIlIIIIllllIl.next();
                WorldPoint lllllllllllllllIIlIlIlIIIIlllIll = WorldPoint.fromLocal((Client)lllllllllllllllIIlIlIlIIIlIIIIlI, (LocalPoint)lllllllllllllllIIlIlIlIIIIllllII);
                List lllllllllllllllIIlIlIlIIIIlllIlI = lllllllllllllllIIlIlIlIIIIlllIll.toWorldArea().offset(llllIIllIlll[3]).toWorldPointList();
                Iterator lllllllllllllllIIlIlIlIIIIlllIIl = lllllllllllllllIIlIlIlIIIIlllIlI.iterator();
                while (w.lIIlIIIIIIlIIll(lllllllllllllllIIlIlIlIIIIlllIIl.hasNext() ? 1 : 0)) {
                    WorldPoint lllllllllllllllIIlIlIlIIIIlllIII = (WorldPoint)lllllllllllllllIIlIlIlIIIIlllIIl.next();
                    lllllllllllllllIIlIlIlIIIlIIIlIl.aQ.remove(lllllllllllllllIIlIlIlIIIIlllIII);
                    0;
                    0;
                    if (((0x3A ^ 0x3E) & ~(4 ^ 0)) != 3) continue;
                    return ((0x6A ^ 0x7D) & ~(0xB5 ^ 0xA2)) != 0;
                }
                0;
                if (-3 <= 0) continue;
                return ((0x89 ^ 0xA6) & ~(0x8C ^ 0xA3)) != 0;
            }
            lllllllllllllllIIlIlIlIIIIllllIl = lllllllllllllllIIlIlIlIIIlIIIIlI.getGraphicsObjects();
            lllllllllllllllIIlIlIlIIIIllllIl.forEach(graphicsObject -> {
                LocalPoint localPoint = graphicsObject.getLocation();
                if (w.lIIlIIIIIIlIlIl(localPoint)) {
                    return;
                }
                WorldPoint worldPoint = WorldPoint.fromLocal((Client)lllllllllllllllIIlIlIlIIIlIIIIlI, (LocalPoint)localPoint);
                this.aQ.remove(worldPoint);
                0;
            });
            lllllllllllllllIIlIlIlIIIIllllII = new ArrayList();
            lllllllllllllllIIlIlIlIIIIllllIl.forEach(arg_0 -> w.a(lllllllllllllllIIlIlIlIIIlIIIIlI, (List)lllllllllllllllIIlIlIlIIIIllllII, arg_0));
            HashSet<WorldPoint> hashSet = lllllllllllllllIIlIlIlIIIlIIIlIl.aQ;
            Objects.requireNonNull(hashSet);
            0;
            lllllllllllllllIIlIlIlIIIIllllII.forEach(hashSet::remove);
            lllllllllllllllIIlIlIlIIIlIIIlIl.aQ.stream().filter(Reachable::isWalkable).filter(worldPoint -> {
                boolean bl;
                if (w.lIIlIIIIIIlIlIl(TileObjects.getFirstAt((WorldPoint)worldPoint, tileObject -> tileObject.getName().contains(llllIIllIllI[llllIIllIlll[0]])))) {
                    bl = llllIIllIlll[3];
                    0;
                    if (2 == 1) {
                        return ((0xD3 ^ 0x92 ^ (0xE8 ^ 0xA1)) & (0x74 ^ 0x14 ^ (0x79 ^ 0x11) ^ -1)) != 0;
                    }
                } else {
                    bl = llllIIllIlll[0];
                }
                return bl;
            }).filter(arg_0 -> w.a(lllllllllllllllIIlIlIlIIIlIIIIlI, (List)lllllllllllllllIIlIlIlIIIIllllII, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)lllllllllllllllIIlIlIlIIIlIIIIll))).ifPresent(Movement::walkTo);
            return llllIIllIlll[3];
        }
        if (!w.lIIlIIIIIIlIlll((Object)lllllllllllllllIIlIlIlIIIlIIIlII.S(), (Object)k.ENRAGED) || w.lIIlIIIIIIlIllI((Object)lllllllllllllllIIlIlIlIIIlIIIlII.S(), (Object)k.FLAME) && w.lIIlIIIIIIlIlII(lllllllllllllllIIlIlIlIIIlIIIlII.Q() ? 1 : 0)) {
            return llllIIllIlll[0];
        }
        if (w.lIIlIIIIIIlIllI((Object)lllllllllllllllIIlIlIlIIIlIIIlII.S(), (Object)k.LIGHTNING) && w.lIIlIIIIIIlIllI((Object)lllllllllllllllIIlIlIlIIIlIIIlII.R(), (Object)l.WAITING)) {
            if (w.lIIlIIIIIIllIII(lllllllllllllllIIlIlIlIIIlIIIlII.I(), llllIIllIlll[2])) {
                lllllllllllllllIIlIlIlIIIlIIIlII.a(l.MOVING);
            }
            return llllIIllIlll[0];
        }
        if (w.lIIlIIIIIIlIllI((Object)lllllllllllllllIIlIlIlIIIlIIIlII.S(), (Object)k.LIGHTNING) && w.lIIlIIIIIIlIllI((Object)lllllllllllllllIIlIlIlIIIlIIIlII.R(), (Object)l.MOVING)) {
            return llllIIllIlll[0];
        }
        if (w.lIIlIIIIIIlIIll(lllllllllllllllIIlIlIlIIIlIIIIll.getWorldLocation().equals((Object)lllllllllllllllIIlIlIlIIIlIIIIIl) ? 1 : 0)) {
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
    private static /* synthetic */ void a(Client client, List list, GraphicsObject graphicsObject) {
        if (w.lIIlIIIIIIllIIl(graphicsObject.getId(), llllIIllIlll[4])) {
            void lllllllllllllllIIlIlIlIIIIlIllll;
            void lllllllllllllllIIlIlIlIIIIlIllIl;
            Client lllllllllllllllIIlIlIlIIIIllIIII;
            LocalPoint localPoint = graphicsObject.getLocation();
            if (w.lIIlIIIIIIlIlIl(localPoint)) {
                return;
            }
            WorldPoint lllllllllllllllIIlIlIlIIIIlIllII = WorldPoint.fromLocal((Client)lllllllllllllllIIlIlIlIIIIllIIII, (LocalPoint)lllllllllllllllIIlIlIlIIIIlIllIl);
            lllllllllllllllIIlIlIlIIIIlIllll.add(lllllllllllllllIIlIlIlIIIIlIllII);
            0;
        }
    }

    private static boolean lIIlIIIIIIlIIlI(Object object) {
        return object != null;
    }

    private static /* synthetic */ boolean a(Client client, List list, WorldPoint worldPoint) {
        Stream stream = Players.getLocal().getWorldLocation().pathTo(client, worldPoint).stream();
        List list2 = list;
        Objects.requireNonNull(list2);
        0;
        return stream.noneMatch(list2::contains);
    }

    private static boolean lIIlIIIIIIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlIIIIIIlIIIl() {
        llllIIllIlll = new int[6];
        w.llllIIllIlll[0] = (0x9D ^ 0xC7) & ~(0xE4 ^ 0xBE);
        w.llllIIllIlll[1] = 0x7C ^ 0x79;
        w.llllIIllIlll[2] = 3;
        w.llllIIllIlll[3] = 1;
        w.llllIIllIlll[4] = -(0xFFFFEDD7 & 0x7B3B) & (0xFFFFFF9F & 0x6FF6);
        w.llllIIllIlll[5] = 2;
    }

    private static String lIIlIIIIIIIllll(String lllllllllllllllIIlIlIlIIIIIllIII, String lllllllllllllllIIlIlIlIIIIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIIIIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlIIIIIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlIIIIIlllII.init(llllIIllIlll[5], lllllllllllllllIIlIlIlIIIIIlllIl);
            return new String(lllllllllllllllIIlIlIlIIIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlIIIIIllIll) {
            lllllllllllllllIIlIlIlIIIIIllIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIIlIIII() {
        llllIIllIllI = new String[llllIIllIlll[3]];
        w.llllIIllIllI[w.llllIIllIlll[0]] = w."vent";
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
    public w(a a2, e e2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
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

