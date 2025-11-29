package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Entering Wintertodt Area", priority = 1)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.e  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/e.class */
public class e extends Task {
    private static /* synthetic */ int[] lIlIlllllIlll;
    private final /* synthetic */ b B;
    private static final /* synthetic */ WorldPoint A;
    private static final /* synthetic */ int z;
    private final /* synthetic */ SquireWintertodtConfig C;
    private static /* synthetic */ String[] lIlIlllllIlIl;

    @Inject
    public e(b bVar, SquireWintertodtConfig squireWintertodtConfig) {
        this.B = bVar;
        this.C = squireWintertodtConfig;
    }

    private static boolean llIIIIllIllIIll(int i) {
        return i != 0;
    }

    private static void llIIIIllIlIlllI() {
        lIlIlllllIlIl = new String[lIlIlllllIlll[1]];
        lIlIlllllIlIl[lIlIlllllIlll[0]] = llIIIIllIlIllIl("44TnUzlvsPQ=", "bMxMh");
    }

    static {
        llIIIIllIllIIlI();
        llIIIIllIlIlllI();
        z = lIlIlllllIlll[2];
        A = new WorldPoint(lIlIlllllIlll[4], lIlIlllllIlll[5], lIlIlllllIlll[0]);
    }

    private static void llIIIIllIllIIlI() {
        lIlIlllllIlll = new int[7];
        lIlIlllllIlll[0] = (36 ^ 127) & ((249 ^ 162) ^ (-1));
        lIlIlllllIlll[1] = " ".length();
        lIlIlllllIlll[2] = (-2162) & 31483;
        lIlIlllllIlll[3] = "  ".length();
        lIlIlllllIlll[4] = (-24610) & 26239;
        lIlIlllllIlll[5] = (-1) & 3963;
        lIlIlllllIlll[6] = (232 ^ 153) ^ (203 ^ 178);
    }

    private static String llIIIIllIlIllIl(String llllllllllllllIllIIlllIIlIlllIII, String llllllllllllllIllIIlllIIlIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIIlIllIlll.getBytes(StandardCharsets.UTF_8)), lIlIlllllIlll[6]), "DES");
            Cipher llllllllllllllIllIIlllIIlIlllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlllIIlIlllIlI.init(lIlIlllllIlll[3], secretKeySpec);
            return new String(llllllllllllllIllIIlllIIlIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIIlIlllIIl) {
            llllllllllllllIllIIlllIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIllIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public boolean run() {
        if (!llIIIIllIllIIll(Movement.shouldWalk() ? 1 : 0) || llIIIIllIllIIll(this.B.i() ? 1 : 0)) {
            return lIlIlllllIlll[0];
        }
        int[] iArr = new int[lIlIlllllIlll[1]];
        iArr[lIlIlllllIlll[0]] = lIlIlllllIlll[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (llIIIIllIllIlII(nearest)) {
            Movement.walk(A);
            sleep(lIlIlllllIlll[1]);
            return lIlIlllllIlll[0];
        }
        nearest.interact(lIlIlllllIlIl[lIlIlllllIlll[0]]);
        sleep(lIlIlllllIlll[3]);
        return lIlIlllllIlll[1];
    }
}
