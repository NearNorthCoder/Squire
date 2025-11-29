package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
@TaskDesc(name = "Swapping for obelisk", register = true)
/* renamed from: -.r.u.q.e.s.o.t.a.i.E  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/E.class */
public class E extends y {
    private static /* synthetic */ String[] lIIlllllIlIIl;
    private static /* synthetic */ int[] lIIlllllIlIlI;

    private static String lIllIlIlIIIllll(String llllllllllllllIlllIlIIIIIIlllIIl, String llllllllllllllIlllIlIIIIIIlllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllIlIlI[2], llllllllllllllIlllIlIIIIIIllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIIIIIIlllIlI) {
            llllllllllllllIlllIlIIIIIIlllIlI.printStackTrace();
            return null;
        }
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public boolean C() {
        return this.aL.obeliskGear().isSelected();
    }

    private static boolean lIllIlIlIIlIIlI(int i) {
        return i != 0;
    }

    private static void lIllIlIlIIlIIII() {
        lIIlllllIlIIl = new String[lIIlllllIlIlI[1]];
        lIIlllllIlIIl[lIIlllllIlIlI[0]] = lIllIlIlIIIllll("gIsnCFSfJ6Q=", "YVGXn");
    }

    static {
        lIllIlIlIIlIIIl();
        lIllIlIlIIlIIII();
    }

    private static void lIllIlIlIIlIIIl() {
        lIIlllllIlIlI = new int[3];
        lIIlllllIlIlI[0] = (25 ^ 9) & ((18 ^ 2) ^ (-1));
        lIIlllllIlIlI[1] = " ".length();
        lIIlllllIlIlI[2] = "  ".length();
    }

    @Inject
    public E(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.y
    public int[] a(String str) {
        return lIllIlIlIIlIIlI(str.contains(lIIlllllIlIIl[lIIlllllIlIlI[0]]) ? 1 : 0) ? a(this.aL.obeliskGear()) : new int[lIIlllllIlIlI[0]];
    }
}
