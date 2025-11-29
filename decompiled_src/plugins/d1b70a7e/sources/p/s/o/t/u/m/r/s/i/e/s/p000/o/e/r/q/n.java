package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.SceneEntity;
@TaskDesc(name = "Tethering to mast", priority = 2147483646, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.n  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/n.class */
public class n extends Task {
    private static /* synthetic */ int[] lIIlllIIlIIII;
    private final /* synthetic */ SquireTempoross aw;
    private final /* synthetic */ SquireTemporossConfig ax;
    private final /* synthetic */ a av;
    private static /* synthetic */ String[] lIIlllIIIllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public boolean run() {
        if (!lIllIIlIlIIlIlI(this.av.K() ? 1 : 0) && !lIllIIlIlIIlIll(this.av.k() ? 1 : 0)) {
            SceneEntity W = this.av.N().W();
            if (lIllIIlIlIIllII(W)) {
                return lIIlllIIlIIII[0];
            }
            if (lIllIIlIlIIllIl(this.aw.a(W))) {
                return this.aw.b(W);
            }
            W.interact(lIIlllIIIllll[lIIlllIIlIIII[0]]);
            return lIIlllIIlIIII[1];
        }
        return lIIlllIIlIIII[0];
    }

    @Inject
    public n(a aVar, SquireTemporossConfig squireTemporossConfig, SquireTempoross squireTempoross) {
        this.av = aVar;
        this.ax = squireTemporossConfig;
        this.aw = squireTempoross;
    }

    private static void lIllIIlIlIIlIII() {
        lIIlllIIIllll = new String[lIIlllIIlIIII[1]];
        lIIlllIIIllll[lIIlllIIlIIII[0]] = lIllIIlIlIIIlIl("Cr0Rkcxijdc=", "HnvGC");
    }

    static {
        lIllIIlIlIIlIIl();
        lIllIIlIlIIlIII();
    }

    private static boolean lIllIIlIlIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIlIlIIlIll(int i) {
        return i != 0;
    }

    private static boolean lIllIIlIlIIllII(Object obj) {
        return obj == null;
    }

    private static String lIllIIlIlIIIlIl(String llllllllllllllIlllIllIIIIIlIlIll, String llllllllllllllIlllIllIIIIIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIlIIII[2], llllllllllllllIlllIllIIIIIlIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIIIlIllII) {
            llllllllllllllIlllIllIIIIIlIllII.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIlIIlIIl() {
        lIIlllIIlIIII = new int[3];
        lIIlllIIlIIII[0] = (139 ^ 161) & ((43 ^ 1) ^ (-1));
        lIIlllIIlIIII[1] = " ".length();
        lIIlllIIlIIII[2] = "  ".length();
    }

    private static boolean lIllIIlIlIIlIlI(int i) {
        return i == 0;
    }
}
