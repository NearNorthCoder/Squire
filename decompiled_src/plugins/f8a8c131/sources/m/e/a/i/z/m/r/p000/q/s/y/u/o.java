package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Attacking zamorak", priority = 10)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.o  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/o.class */
public class o extends Task {
    private static /* synthetic */ int[] lIllIIIlIllll;
    private final /* synthetic */ l M;
    private static /* synthetic */ String[] lIllIIIlIlllI;
    private final /* synthetic */ C0002c N;

    private static boolean llIIIlIlIIIllII(int i) {
        return i != 0;
    }

    private static void llIIIlIlIIIlIlI() {
        lIllIIIlIlllI = new String[lIllIIIlIllll[2]];
        lIllIIIlIlllI[lIllIIIlIllll[0]] = llIIIlIlIIIIllI("0Ihotv8C3Sc=", "wGzfM");
    }

    @Inject
    public o(l lVar, C0002c c0002c) {
        this.M = lVar;
        this.N = c0002c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIlIlIIIllII(this.M.B() ? 1 : 0) || llIIIlIlIIIllIl(this.M.G() ? 1 : 0)) {
            return lIllIIIlIllll[0];
        }
        if (llIIIlIlIIIllIl(this.M.A() ? 1 : 0)) {
            return lIllIIIlIllll[0];
        }
        if (llIIIlIlIIIllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!llIIIlIlIIIlllI(this.N.e()) && !llIIIlIlIIIllll(Players.getLocal().getInteracting())) {
            this.M.I().m().interact(lIllIIIlIlllI[lIllIIIlIllll[0]]);
            sleep(lIllIIIlIllll[1]);
            return lIllIIIlIllll[2];
        }
        return lIllIIIlIllll[0];
    }

    private static String llIIIlIlIIIIllI(String llllllllllllllIllIIlIlllIIIlIIII, String llllllllllllllIllIIlIlllIIIIllll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlllIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIlllIIIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIlllIIIlIIlI.init(lIllIIIlIllll[3], llllllllllllllIllIIlIlllIIIlIIll);
            return new String(llllllllllllllIllIIlIlllIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlllIIIlIIIl) {
            llllllllllllllIllIIlIlllIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIlIIIllll(Object obj) {
        return obj != null;
    }

    private static void llIIIlIlIIIlIll() {
        lIllIIIlIllll = new int[4];
        lIllIIIlIllll[0] = ((71 ^ 38) ^ (16 ^ 99)) & (((226 ^ 141) ^ (252 ^ 129)) ^ (-" ".length()));
        lIllIIIlIllll[1] = "   ".length();
        lIllIIIlIllll[2] = " ".length();
        lIllIIIlIllll[3] = "  ".length();
    }

    private static boolean llIIIlIlIIIllIl(int i) {
        return i == 0;
    }

    static {
        llIIIlIlIIIlIll();
        llIIIlIlIIIlIlI();
    }

    private static boolean llIIIlIlIIIlllI(Object obj) {
        return obj == null;
    }
}
