package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Attacking Zilyana", priority = 10)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.t  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/t.class */
public class t extends Task {
    private static /* synthetic */ int[] lIIlIlIIIIllI;
    private static /* synthetic */ String[] lIIlIlIIIIlIl;
    private final /* synthetic */ l ag;
    private final /* synthetic */ C0006g af;

    private static boolean lIlIlIllIIIlIII(Object obj) {
        return obj != null;
    }

    private static void lIlIlIllIIIIlII() {
        lIIlIlIIIIlIl = new String[lIIlIlIIIIllI[2]];
        lIIlIlIIIIlIl[lIIlIlIIIIllI[0]] = lIlIlIllIIIIIll("bFAHHkJ3QCU=", "OhBxh");
    }

    private static boolean lIlIlIllIIIIlll(int i) {
        return i != 0;
    }

    private static void lIlIlIllIIIIlIl() {
        lIIlIlIIIIllI = new int[5];
        lIIlIlIIIIllI[0] = (37 ^ 63) & ((178 ^ 168) ^ (-1));
        lIIlIlIIIIllI[1] = "   ".length();
        lIIlIlIIIIllI[2] = " ".length();
        lIIlIlIIIIllI[3] = (8 ^ 126) ^ (123 ^ 5);
        lIIlIlIIIIllI[4] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIlIlIllIIIIllI(this.af.m() ? 1 : 0)) {
            return lIIlIlIIIIllI[0];
        }
        if (!lIlIlIllIIIIlll(this.af.l() ? 1 : 0) || lIlIlIllIIIIllI(this.ag.P() ? 1 : 0)) {
            return lIIlIlIIIIllI[0];
        }
        if (lIlIlIllIIIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (lIlIlIllIIIlIII(Players.getLocal().getInteracting())) {
            return lIIlIlIIIIllI[0];
        }
        this.af.t().C().interact(lIIlIlIIIIlIl[lIIlIlIIIIllI[0]]);
        sleep(lIIlIlIIIIllI[1]);
        return lIIlIlIIIIllI[2];
    }

    static {
        lIlIlIllIIIIlIl();
        lIlIlIllIIIIlII();
    }

    private static boolean lIlIlIllIIIIllI(int i) {
        return i == 0;
    }

    @Inject
    public t(C0006g c0006g, l lVar) {
        this.af = c0006g;
        this.ag = lVar;
    }

    private static String lIlIlIllIIIIIll(String llllllllllllllIlllllIIIlIllllllI, String llllllllllllllIlllllIIIlIlllllIl) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIlIlllllIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIIllI[3]), "DES");
            Cipher llllllllllllllIlllllIIIllIIIIIII = Cipher.getInstance("DES");
            llllllllllllllIlllllIIIllIIIIIII.init(lIIlIlIIIIllI[4], llllllllllllllIlllllIIIllIIIIIIl);
            return new String(llllllllllllllIlllllIIIllIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIlIlllllll) {
            llllllllllllllIlllllIIIlIlllllll.printStackTrace();
            return null;
        }
    }
}
