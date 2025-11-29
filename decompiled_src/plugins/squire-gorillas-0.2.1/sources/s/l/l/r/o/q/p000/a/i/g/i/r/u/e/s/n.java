package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Walking to gate")
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.n  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/n.class */
public class n extends j {
    private static /* synthetic */ String[] llIIlIlIllll;
    private static /* synthetic */ int[] llIIlIllIIII;
    private static final /* synthetic */ WorldPoint X;

    private static boolean lllllIllIIlIII(int i, int i2) {
        return i < i2;
    }

    private static String lllllIllIIIIlI(String lllllllllllllllIlIIllllIIIlllIlI, String lllllllllllllllIlIIllllIIIlllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllIIIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllIIIllllII.init(llIIlIllIIII[5], secretKeySpec);
            return new String(lllllllllllllllIlIIllllIIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIIIlllIll) {
            lllllllllllllllIlIIllllIIIlllIll.printStackTrace();
            return null;
        }
    }

    private static String lllllIllIIIIIl(String lllllllllllllllIlIIllllIIlIIllll, String lllllllllllllllIlIIllllIIlIIlllI) {
        String lllllllllllllllIlIIllllIIlIIllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllllIIlIIllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllllIIlIIlllI.toCharArray();
        int lllllllllllllllIlIIllllIIlIIlIll = llIIlIllIIII[1];
        char[] charArray2 = lllllllllllllllIlIIllllIIlIIllll2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlIIllllIIlIIIIll = llIIlIllIIII[1];
        while (lllllIllIIlIII(lllllllllllllllIlIIllllIIlIIIIll, length)) {
            char lllllllllllllllIlIIllllIIlIlIIII = charArray2[lllllllllllllllIlIIllllIIlIIIIll];
            lllllllllllllllIlIIllllIIlIIllIl.append((char) (lllllllllllllllIlIIllllIIlIlIIII ^ charArray[lllllllllllllllIlIIllllIIlIIlIll % charArray.length]));
            "".length();
            lllllllllllllllIlIIllllIIlIIlIll++;
            lllllllllllllllIlIIllllIIlIIIIll++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIllllIIlIIllIl);
    }

    private static boolean lllllIllIIIlIl(int i) {
        return i == 0;
    }

    private static boolean lllllIllIIIlll(Object obj) {
        return obj != null;
    }

    static {
        lllllIllIIIlII();
        lllllIllIIIIll();
        X = new WorldPoint(llIIlIllIIII[3], llIIlIllIIII[4], llIIlIllIIII[1]);
    }

    private static void lllllIllIIIIll() {
        llIIlIlIllll = new String[llIIlIllIIII[5]];
        llIIlIlIllll[llIIlIllIIII[1]] = lllllIllIIIIIl("IDUNCgwBIg==", "oEhde");
        llIIlIlIllll[llIIlIllIIII[2]] = lllllIllIIIIlI("6Pl+JIbO6w5+e4n1B4oArw==", "Junhu");
    }

    private static void lllllIllIIIlII() {
        llIIlIllIIII = new int[6];
        llIIlIllIIII[0] = (-((-3209) & 24010)) & (-129) & 30711;
        llIIlIllIIII[1] = (137 ^ 143) & ((122 ^ 124) ^ (-1));
        llIIlIllIIII[2] = " ".length();
        llIIlIllIIII[3] = (-12849) & 15283;
        llIIlIllIIII[4] = (-1) & 3519;
        llIIlIllIIII[5] = "  ".length();
    }

    @Inject
    public n(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (!lllllIllIIIlIl(Locations.isRegionLoaded(llIIlIllIIII[0]) ? 1 : 0) && !lllllIllIIIllI(J() ? 1 : 0)) {
            String[] strArr = new String[llIIlIllIIII[2]];
            strArr[llIIlIllIIII[1]] = llIIlIlIllll[llIIlIllIIII[1]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lllllIllIIIlll(nearest) && !lllllIllIIIlIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                nearest.interact(llIIlIlIllll[llIIlIllIIII[2]]);
                return llIIlIllIIII[2];
            }
            Movement.walkTo(X);
            "".length();
            return llIIlIllIIII[2];
        }
        return llIIlIllIIII[1];
    }

    private static boolean lllllIllIIIllI(int i) {
        return i != 0;
    }
}
