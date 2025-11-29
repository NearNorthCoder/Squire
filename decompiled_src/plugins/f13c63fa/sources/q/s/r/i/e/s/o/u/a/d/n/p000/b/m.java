package q.s.r.i.e.s.o.u.a.d.n.p000.b;

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
@TaskDesc(name = "Attacking bandos", priority = 10)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.m  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/m.class */
public class m extends Task {
    private final /* synthetic */ e M;
    private final /* synthetic */ d N;
    private static /* synthetic */ int[] llIlllIlIII;
    private static /* synthetic */ String[] llIlllIIlll;

    @Inject
    public m(e eVar, d dVar) {
        this.M = eVar;
        this.N = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIlIllIlIIlI(this.M.t() ? 1 : 0) || lIlIlIllIlIIll(this.M.y() ? 1 : 0)) {
            return llIlllIlIII[0];
        }
        if (lIlIlIllIlIIll(this.M.s() ? 1 : 0)) {
            return llIlllIlIII[0];
        }
        if (lIlIlIllIlIIll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!lIlIlIllIlIlII(this.N.m()) && !lIlIlIllIlIlIl(Players.getLocal().getInteracting())) {
            this.M.z().c().interact(llIlllIIlll[llIlllIlIII[0]]);
            sleep(llIlllIlIII[1]);
            return llIlllIlIII[2];
        }
        return llIlllIlIII[0];
    }

    private static String lIlIlIllIIllll(String llllllllllllllllIIlIlIlIlllIIllI, String llllllllllllllllIIlIlIlIlllIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIlllIIlll) {
            llllllllllllllllIIlIlIlIlllIIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIllIlIIIl();
        lIlIlIllIlIIII();
    }

    private static boolean lIlIlIllIlIlII(Object obj) {
        return obj == null;
    }

    private static void lIlIlIllIlIIIl() {
        llIlllIlIII = new int[4];
        llIlllIlIII[0] = "   ".length() & ("   ".length() ^ (-" ".length()));
        llIlllIlIII[1] = "   ".length();
        llIlllIlIII[2] = " ".length();
        llIlllIlIII[3] = "  ".length();
    }

    private static boolean lIlIlIllIlIIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIlIllIlIIll(int i) {
        return i == 0;
    }

    private static boolean lIlIlIllIlIlIl(Object obj) {
        return obj != null;
    }

    private static void lIlIlIllIlIIII() {
        llIlllIIlll = new String[llIlllIlIII[2]];
        llIlllIIlll[llIlllIlIII[0]] = lIlIlIllIIllll("lmg1WeY6JAQ=", "JaOIl");
    }
}
