package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Walking to cavern")
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.k  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/k.class */
public class k extends j {
    private static /* synthetic */ int[] llIIlIlIIIII;
    private static final /* synthetic */ int V;
    private static final /* synthetic */ WorldPoint W;
    private static /* synthetic */ String[] llIIlIIlllll;

    private static String lllllIlIIlIlIl(String lllllllllllllllIlIIllllllIIIlIIl, String lllllllllllllllIlIIllllllIIIlIII) {
        String lllllllllllllllIlIIllllllIIIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIllllllIIIIllI = lllllllllllllllIlIIllllllIIIlIII.toCharArray();
        int lllllllllllllllIlIIllllllIIIIlIl = llIIlIlIIIII[0];
        char[] charArray = lllllllllllllllIlIIllllllIIIlIIl2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIIlllllIlllllIl = llIIlIlIIIII[0];
        while (lllllIlIIllIll(lllllllllllllllIlIIlllllIlllllIl, length)) {
            sb.append((char) (charArray[lllllllllllllllIlIIlllllIlllllIl] ^ lllllllllllllllIlIIllllllIIIIllI[lllllllllllllllIlIIllllllIIIIlIl % lllllllllllllllIlIIllllllIIIIllI.length]));
            "".length();
            lllllllllllllllIlIIllllllIIIIlIl++;
            lllllllllllllllIlIIlllllIlllllIl++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllllIlIIllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lllllIlIIllIll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public k(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    private static boolean lllllIlIIllIIl(int i) {
        return i == 0;
    }

    private static void lllllIlIIlIllI() {
        llIIlIIlllll = new String[llIIlIlIIIII[5]];
        llIIlIIlllll[llIIlIlIIIII[0]] = lllllIlIIlIlIl("CBcsNx8lVj88GTkXNDEI", "KvZRm");
        llIIlIIlllll[llIIlIlIIIII[2]] = lllllIlIIlIlIl("LAsmIQQ=", "ieRDv");
    }

    private static boolean lllllIlIIllIII(int i) {
        return i != 0;
    }

    static {
        lllllIlIIlIlll();
        lllllIlIIlIllI();
        V = llIIlIlIIIII[1];
        W = new WorldPoint(llIIlIlIIIII[3], llIIlIlIIIII[4], llIIlIlIIIII[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (!lllllIlIIllIII(J() ? 1 : 0) && !lllllIlIIllIIl(Locations.isRegionLoaded(llIIlIlIIIII[1]) ? 1 : 0)) {
            String[] strArr = new String[llIIlIlIIIII[2]];
            strArr[llIIlIlIIIII[0]] = llIIlIIlllll[llIIlIlIIIII[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lllllIlIIllIlI(nearest) && !lllllIlIIllIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                nearest.interact(llIIlIIlllll[llIIlIlIIIII[2]]);
                return llIIlIlIIIII[2];
            }
            Movement.walkTo(W);
            "".length();
            return llIIlIlIIIII[2];
        }
        return llIIlIlIIIII[0];
    }

    private static void lllllIlIIlIlll() {
        llIIlIlIIIII = new int[6];
        llIIlIlIIIII[0] = (151 ^ 153) & ((190 ^ 176) ^ (-1));
        llIIlIlIIIII[1] = (-16385) & 24407;
        llIIlIlIIIII[2] = " ".length();
        llIIlIlIIIII[3] = (-((-23707) & 31903)) & (-20481) & 30702;
        llIIlIlIIIII[4] = (-((-29027) & 31095)) & (-24577) & 32255;
        llIIlIlIIIII[5] = "  ".length();
    }
}
