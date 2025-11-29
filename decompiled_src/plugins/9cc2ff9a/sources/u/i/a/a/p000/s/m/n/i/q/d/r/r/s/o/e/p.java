package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Walking to Godwars")
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.p  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/p.class */
public class p extends o {
    private final /* synthetic */ C0006g S;
    private static /* synthetic */ String[] lIIlIIllllIII;
    private static final /* synthetic */ WorldPoint Q;
    private static /* synthetic */ int[] lIIlIIllllIIl;
    private static final /* synthetic */ int R;

    private static boolean lIlIlIlIlIllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlIlIlIllIll(Object obj) {
        return obj != null;
    }

    private static void lIlIlIlIlIlIlII() {
        lIIlIIllllIII = new String[lIIlIIllllIIl[2]];
        lIIlIIllllIII[lIIlIIllllIIl[0]] = lIlIlIlIlIlIIll("ZXqk0zzpruul1SEm4ErLTQ==", "GVZsb");
    }

    private static boolean lIlIlIlIlIllIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        if (!lIlIlIlIlIllIII(S() ? 1 : 0) && !lIlIlIlIlIllIIl(this.O.a() ? 1 : 0) && !lIlIlIlIlIllIIl(this.S.s() ? 1 : 0) && !lIlIlIlIlIllIIl(this.P.isInInstancedRegion() ? 1 : 0) && !lIlIlIlIlIllIlI(this.P.getPlane(), lIIlIIllllIIl[1])) {
            int[] iArr = new int[lIIlIIllllIIl[2]];
            iArr[lIIlIIllllIIl[0]] = lIIlIIllllIIl[3];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIlIlIlIlIllIll(nearest) && !lIlIlIlIlIllIII(Reachable.isInteractable(nearest) ? 1 : 0)) {
                nearest.interact(lIIlIIllllIII[lIIlIIllllIIl[0]]);
                return lIIlIIllllIIl[2];
            }
            Movement.walkTo(Q);
            "".length();
            return lIIlIIllllIIl[2];
        }
        return lIIlIIllllIIl[0];
    }

    private static void lIlIlIlIlIlIlll() {
        lIIlIIllllIIl = new int[7];
        lIIlIIllllIIl[0] = (58 ^ 98) & ((240 ^ 168) ^ (-1));
        lIIlIIllllIIl[1] = "  ".length();
        lIIlIIllllIIl[2] = " ".length();
        lIIlIIllllIIl[3] = (-9) & 26427;
        lIIlIIllllIIl[4] = (-29721) & 32635;
        lIIlIIllllIIl[5] = (-8270) & 12015;
        lIIlIIllllIIl[6] = 47 ^ 39;
    }

    private static boolean lIlIlIlIlIllIIl(int i) {
        return i != 0;
    }

    private static String lIlIlIlIlIlIIll(String llllllllllllllIlllllIIlIlIIlIlII, String llllllllllllllIlllllIIlIlIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIlIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIlIIllllIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIllllIIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIlIlIIlIlIl) {
            llllllllllllllIlllllIIlIlIIlIlIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIlIlIlIlll();
        lIlIlIlIlIlIlII();
        R = lIIlIIllllIIl[3];
        Q = new WorldPoint(lIIlIIllllIIl[4], lIIlIIllllIIl[5], lIIlIIllllIIl[0]);
    }

    @Inject
    public p(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, C0006g c0006g, Client client) {
        super(squireSaraConfig, squireSaradomin, client);
        this.S = c0006g;
    }
}
