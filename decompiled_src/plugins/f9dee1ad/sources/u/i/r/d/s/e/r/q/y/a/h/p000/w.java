package u.i.r.d.s.e.r.q.y.a.h.p000;

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
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Deque;
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
@TaskDesc(name = "Moving towards the next tile", priority = 2, register = true)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.w  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/w.class */
public class w extends Task {
    private final /* synthetic */ HashSet<WorldPoint> aP = new HashSet<>();
    private static final /* synthetic */ int aL;
    private final /* synthetic */ SquireAlchemicalHydraConfig aO;
    private final /* synthetic */ e aN;
    private static /* synthetic */ int[] llllIIllIlll;
    private static /* synthetic */ String[] llllIIllIllI;
    private final /* synthetic */ C0000a aM;
    private /* synthetic */ HashSet<WorldPoint> aQ;

    private static boolean lIIlIIIIIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    public boolean run() {
        int i;
        h k = this.aM.k();
        if (lIIlIIIIIIlIIlI(k) && lIIlIIIIIIlIIll(this.aM.g() ? 1 : 0) && !lIIlIIIIIIlIlII(this.aO.attack() ? 1 : 0)) {
            Player local = Players.getLocal();
            Client client = Static.getClient();
            if (lIIlIIIIIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
                return llllIIllIlll[0];
            }
            WorldPoint c = k.c(llllIIllIlll[0]);
            if (lIIlIIIIIIlIlIl(c)) {
                c = local.getWorldLocation();
            }
            Set<LocalPoint> f = this.aM.f();
            if (!lIIlIIIIIIlIIll(f.contains(LocalPoint.fromWorld(client, c)) ? 1 : 0)) {
                if (!lIIlIIIIIIlIlll(k.S(), k.ENRAGED) || (lIIlIIIIIIlIllI(k.S(), k.FLAME) && lIIlIIIIIIlIlII(k.Q() ? 1 : 0))) {
                    return llllIIllIlll[0];
                }
                if (lIIlIIIIIIlIllI(k.S(), k.LIGHTNING) && lIIlIIIIIIlIllI(k.R(), l.WAITING)) {
                    if (lIIlIIIIIIllIII(k.I(), llllIIllIlll[2])) {
                        k.a(l.MOVING);
                    }
                    return llllIIllIlll[0];
                }
                if ((!lIIlIIIIIIlIllI(k.S(), k.LIGHTNING) || !lIIlIIIIIIlIllI(k.R(), l.MOVING)) && !lIIlIIIIIIlIIll(local.getWorldLocation().equals(c) ? 1 : 0)) {
                    Movement.setDestination(c);
                    this.aP.clear();
                    return llllIIllIlll[3];
                }
                return llllIIllIlll[0];
            }
            if (lIIlIIIIIIlIllI(k.S(), k.POISON)) {
                i = llllIIllIlll[1];
                "".length();
                if ((-((((84 + 49) - 77) + 92) ^ (((29 + 116) - 91) + 90))) >= 0) {
                    return ((107 ^ 83) ^ (76 ^ 86)) & (((194 ^ 133) ^ (82 ^ 55)) ^ (-" ".length()));
                }
            } else {
                i = llllIIllIlll[2];
            }
            this.aQ = new HashSet<>(c.toWorldArea().offset(i).toWorldPointList());
            for (LocalPoint localPoint : f) {
                for (WorldPoint worldPoint : WorldPoint.fromLocal(client, localPoint).toWorldArea().offset(llllIIllIlll[3]).toWorldPointList()) {
                    this.aQ.remove(worldPoint);
                    "".length();
                    "".length();
                    if (((58 ^ 62) & ((4 ^ 0) ^ (-1))) == "   ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
                "".length();
                if ((-"   ".length()) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            Deque graphicsObjects = client.getGraphicsObjects();
            graphicsObjects.forEach(graphicsObject -> {
                LocalPoint location = graphicsObject.getLocation();
                if (lIIlIIIIIIlIlIl(location)) {
                    return;
                }
                this.aQ.remove(WorldPoint.fromLocal(client, location));
                "".length();
            });
            ArrayList arrayList = new ArrayList();
            graphicsObjects.forEach(graphicsObject2 -> {
                if (lIIlIIIIIIllIIl(graphicsObject2.getId(), llllIIllIlll[4])) {
                    LocalPoint location = graphicsObject2.getLocation();
                    if (lIIlIIIIIIlIlIl(location)) {
                        return;
                    }
                    arrayList.add(WorldPoint.fromLocal(client, location));
                    "".length();
                }
            });
            HashSet<WorldPoint> hashSet = this.aQ;
            Objects.requireNonNull(hashSet);
            "".length();
            arrayList.forEach((v1) -> {
                r1.remove(v1);
            });
            this.aQ.stream().filter(Reachable::isWalkable).filter(worldPoint2 -> {
                if (lIIlIIIIIIlIlIl(TileObjects.getFirstAt(worldPoint2, tileObject -> {
                    return tileObject.getName().contains(llllIIllIllI[llllIIllIlll[0]]);
                }))) {
                    ?? r0 = llllIIllIlll[3];
                    "".length();
                    return "  ".length() == " ".length() ? ((211 ^ 146) ^ (232 ^ 161)) & (((116 ^ 20) ^ (121 ^ 17)) ^ (-" ".length())) : r0;
                }
                return llllIIllIlll[0];
            }).filter(worldPoint3 -> {
                Stream stream = Players.getLocal().getWorldLocation().pathTo(client, worldPoint3).stream();
                Objects.requireNonNull(arrayList);
                "".length();
                return stream.noneMatch((v1) -> {
                    return r1.contains(v1);
                });
            }).min(Comparator.comparingInt(worldPoint4 -> {
                return worldPoint4.distanceTo(local);
            })).ifPresent(Movement::walkTo);
            return llllIIllIlll[3];
        }
        return llllIIllIlll[0];
    }

    private static boolean lIIlIIIIIIlIIll(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIIIIlIlII(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIIIIlIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIIIIllIII(int i, int i2) {
        return i > i2;
    }

    private static void lIIlIIIIIIlIIIl() {
        llllIIllIlll = new int[6];
        llllIIllIlll[0] = (157 ^ 199) & ((228 ^ 190) ^ (-1));
        llllIIllIlll[1] = 124 ^ 121;
        llllIIllIlll[2] = "   ".length();
        llllIIllIlll[3] = " ".length();
        llllIIllIlll[4] = (-((-4649) & 31547)) & (-97) & 28662;
        llllIIllIlll[5] = "  ".length();
    }

    private static String lIIlIIIIIIIllll(String lllllllllllllllIIlIlIlIIIIIllIlI, String lllllllllllllllIIlIlIlIIIIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIIIIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlIIIIIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlIIIIIlllII.init(llllIIllIlll[5], lllllllllllllllIIlIlIlIIIIIlllIl);
            return new String(lllllllllllllllIIlIlIlIIIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlIIIIIllIll) {
            lllllllllllllllIIlIlIlIIIIIllIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIIlIIII() {
        llllIIllIllI = new String[llllIIllIlll[3]];
        llllIIllIllI[llllIIllIlll[0]] = lIIlIIIIIIIllll("/SpDDqRvyV4=", "YBiiv");
    }

    private static boolean lIIlIIIIIIlIlIl(Object obj) {
        return obj == null;
    }

    static {
        lIIlIIIIIIlIIIl();
        lIIlIIIIIIlIIII();
        aL = llllIIllIlll[4];
    }

    private static boolean lIIlIIIIIIlIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIIIIIllIIl(int i, int i2) {
        return i == i2;
    }

    @Inject
    public w(C0000a c0000a, e eVar, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aM = c0000a;
        this.aN = eVar;
        this.aO = squireAlchemicalHydraConfig;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        this.aP.add(WorldPoint.fromLocal(Static.getClient(), graphicsObjectCreated.getGraphicsObject().getLocation()));
        "".length();
    }
}
