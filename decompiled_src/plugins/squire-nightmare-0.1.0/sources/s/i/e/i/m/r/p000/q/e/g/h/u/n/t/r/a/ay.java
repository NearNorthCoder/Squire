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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Avoiding Spores", priority = 2147483642, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ay  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ay.class */
public class ay extends A {
    private static /* synthetic */ String[] llllIIIIlIlI;
    private static /* synthetic */ int[] llllIIIIllII;
    private static final /* synthetic */ Logger eC;

    private static void lIIIlllIllIIllI() {
        llllIIIIlIlI = new String[llllIIIIllII[2]];
        llllIIIIlIlI[llllIIIIllII[0]] = lIIIlllIlIlllIl("drqTVJtfPixzvU/oYM37yPuPXMoRJbx+e2Ruv/OxIK4xR6sTiKQgYw==", "tgdCk");
        llllIIIIlIlI[llllIIIIllII[1]] = lIIIlllIlIlllIl("8BAu3+cOdje0c7UNVIbMmJSPCg6pXRi+HHG/g0mBHaS/axiVeqdwSw==", "sEkaP");
    }

    private static boolean lIIIlllIllIlIII(int i) {
        return i > 0;
    }

    @Inject
    protected ay(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0008e c0008e) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0008e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        if (lIIIlllIllIlIII(this.cM.ap())) {
            return llllIIIIllII[0];
        }
        WorldArea worldArea = SquireNightmarePlugin.d().getWorldArea();
        List<WorldArea> ax = C0008e.ax();
        if (lIIIlllIllIlIIl(ax.isEmpty() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        Player local = Players.getLocal();
        if (lIIIlllIllIlIIl(ax.stream().anyMatch(worldArea2 -> {
            return worldArea2.contains(local);
        }) ? 1 : 0)) {
            WorldPoint worldPoint = (WorldPoint) this.cT.toWorldPointList().stream().filter(worldPoint2 -> {
                if (lIIIlllIllIlIll(this.cM.Y().contains(worldPoint2) ? 1 : 0)) {
                    ?? r0 = llllIIIIllII[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIIIIllII[0];
            }).filter(worldPoint3 -> {
                if (lIIIlllIllIlIll(worldArea.contains(worldPoint3) ? 1 : 0)) {
                    ?? r0 = llllIIIIllII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIIIIllII[0];
            }).filter(worldPoint4 -> {
                return ax.stream().noneMatch(worldArea3 -> {
                    return worldArea3.contains(worldPoint4);
                });
            }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint5 -> {
                return local.getWorldLocation().distanceTo(worldPoint5);
            })).orElse(null);
            if (!lIIIlllIllIlIlI(worldPoint) || lIIIlllIllIlIIl(local.getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                Log.info(llllIIIIlIlI[llllIIIIllII[0]]);
                return llllIIIIllII[0];
            }
            eC.info(llllIIIIlIlI[llllIIIIllII[1]], worldPoint, Players.getLocal().getWorldLocation());
            j(worldPoint);
            "".length();
            return llllIIIIllII[1];
        }
        return llllIIIIllII[0];
    }

    static {
        lIIIlllIllIIlll();
        lIIIlllIllIIllI();
        eC = LoggerFactory.getLogger(ay.class);
    }

    private static void lIIIlllIllIIlll() {
        llllIIIIllII = new int[3];
        llllIIIIllII[0] = (53 ^ 127) & ((213 ^ 159) ^ (-1));
        llllIIIIllII[1] = " ".length();
        llllIIIIllII[2] = "  ".length();
    }

    private static String lIIIlllIlIlllIl(String lllllllllllllllIIllIIIIIlIllIlll, String lllllllllllllllIIllIIIIIlIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIIllII[2], lllllllllllllllIIllIIIIIlIlllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIIlIlllIII) {
            lllllllllllllllIIllIIIIIlIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllIlIll(int i) {
        return i == 0;
    }

    private static boolean lIIIlllIllIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIlllIllIlIlI(Object obj) {
        return obj != null;
    }
}
