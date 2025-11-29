package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Stepping into flower area", priority = 2147483642, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.aw  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/aw.class */
public class aw extends A {
    private static /* synthetic */ int[] llllIlllIIII;
    private static final /* synthetic */ Logger es;
    private static /* synthetic */ String[] llllIllIlllI;

    private static boolean lIIlIIIlllIIlll(Object obj) {
        return obj == null;
    }

    private static void lIIlIIIlllIIllI() {
        llllIlllIIII = new int[4];
        llllIlllIIII[0] = (184 ^ 152) & ((130 ^ 162) ^ (-1));
        llllIlllIIII[1] = "   ".length();
        llllIlllIIII[2] = " ".length();
        llllIlllIIII[3] = "  ".length();
    }

    static {
        lIIlIIIlllIIllI();
        lIIlIIIlllIIlIl();
        es = LoggerFactory.getLogger(aw.class);
    }

    @Inject
    protected aw(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0008e c0008e) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0008e);
    }

    private static boolean lIIlIIIlllIlIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        WorldPoint worldLocation = this.cL.getLocalPlayer().getWorldLocation();
        RectangularArea ay = C0008e.ay();
        if (lIIlIIIlllIIlll(ay)) {
            return llllIlllIIII[0];
        }
        Player local = Players.getLocal();
        WorldPoint destination = Movement.getDestination();
        if (lIIlIIIlllIlIII(ay.contains(worldLocation) ? 1 : 0)) {
            return llllIlllIIII[0];
        }
        if (lIIlIIIlllIlIIl(destination) && lIIlIIIlllIlIII(local.isMoving() ? 1 : 0) && lIIlIIIlllIlIII(ay.contains(destination) ? 1 : 0)) {
            return llllIlllIIII[0];
        }
        NPC d = SquireNightmarePlugin.d();
        WorldPoint worldPoint = null;
        if (lIIlIIIlllIlIII(bZ() ? 1 : 0)) {
            Stream stream = d.getWorldArea().getMeleeTiles(Static.getClient()).stream();
            Objects.requireNonNull(ay);
            "".length();
            worldPoint = (WorldPoint) stream.filter(this::contains).filter(worldPoint2 -> {
                if (lIIlIIIlllIlIlI(d.getWorldArea().contains(worldPoint2.getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = llllIlllIIII[2];
                    "".length();
                    return "  ".length() <= " ".length() ? ((((29 + 41) - 34) + 197) ^ (((187 + 94) - 108) + 21)) & (((181 ^ 170) ^ (127 ^ 75)) ^ (-" ".length())) : r0;
                }
                return llllIlllIIII[0];
            }).filter(worldPoint3 -> {
                if (lIIlIIIlllIlIlI(this.cM.Y().contains(worldPoint3.getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = llllIlllIIII[2];
                    "".length();
                    return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIlllIIII[0];
            }).min(Comparator.comparingInt(worldPoint4 -> {
                return worldPoint4.getWorldLocation().distanceTo(worldLocation);
            })).orElse(null);
        }
        if (lIIlIIIlllIIlll(worldPoint)) {
            worldPoint = ay.getNearest();
        }
        if (!lIIlIIIlllIIlll(worldPoint)) {
            Movement.setDestination(worldPoint);
            return llllIlllIIII[2];
        }
        String str = llllIllIlllI[llllIlllIIII[0]];
        Object[] objArr = new Object[llllIlllIIII[1]];
        objArr[llllIlllIIII[0]] = ay;
        objArr[llllIlllIIII[2]] = d.getWorldArea();
        objArr[llllIlllIIII[3]] = this.cM.Y();
        Log.error(str, objArr);
        return llllIlllIIII[0];
    }

    private static boolean lIIlIIIlllIlIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIlllIlIlI(int i) {
        return i == 0;
    }

    private static void lIIlIIIlllIIlIl() {
        llllIllIlllI = new String[llllIlllIIII[2]];
        llllIllIlllI[llllIlllIIII[0]] = lIIlIIIllIlllll("vJgu9MNxXDZUSWSQZ3uMrmNkQZtvlL5dtJf5fRJtKznFM3UQMFPkiiC2SuvuK8aR9ZMIInfKDYh7u1iktFwi1iRhMX1x+sojkWQBJQ8aZulWaVRA9e3/1A==", "xrDrj");
    }

    private static String lIIlIIIllIlllll(String lllllllllllllllIIlIlIllIlIIIlIIl, String lllllllllllllllIIlIlIllIlIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIlIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIlIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIllIlIIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIllIlIIIlIll.init(llllIlllIIII[3], lllllllllllllllIIlIlIllIlIIIllII);
            return new String(lllllllllllllllIIlIlIllIlIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIlIIIlIlI) {
            lllllllllllllllIIlIlIllIlIIIlIlI.printStackTrace();
            return null;
        }
    }
}
