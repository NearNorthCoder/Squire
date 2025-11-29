package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
@TaskDesc(name = "Swapping for obelisk", register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aC  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aC.class */
public class aC extends V {
    private static /* synthetic */ int[] lIlllIIlIII;
    private static /* synthetic */ String[] lIlllIIIllI;

    private static void lIIllIIIllllII() {
        lIlllIIlIII = new int[3];
        lIlllIIlIII[0] = ((104 ^ 80) ^ (223 ^ 181)) & (((229 ^ 185) ^ (129 ^ 143)) ^ (-" ".length()));
        lIlllIIlIII[1] = " ".length();
        lIlllIIlIII[2] = "  ".length();
    }

    private static boolean lIIllIIIllllIl(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.V
    public boolean aL() {
        return this.cf.obeliskGear().isSelected();
    }

    private static void lIIllIIIlllIll() {
        lIlllIIIllI = new String[lIlllIIlIII[1]];
        lIlllIIIllI[lIlllIIlIII[0]] = lIIllIIIllIIll("jUKo8Y/fxQw=", "oxUWE");
    }

    static {
        lIIllIIIllllII();
        lIIllIIIlllIll();
    }

    @Inject
    public aC(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.V
    public int[] j(String str) {
        return lIIllIIIllllIl(str.contains(lIlllIIIllI[lIlllIIlIII[0]]) ? 1 : 0) ? a(this.cf.obeliskGear()) : new int[lIlllIIlIII[0]];
    }

    private static String lIIllIIIllIIll(String llllllllllllllllIlIIlllIIIIIlIll, String llllllllllllllllIlIIlllIIIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIlIII[2], llllllllllllllllIlIIlllIIIIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlllIIIIIllII) {
            llllllllllllllllIlIIlllIIIIIllII.printStackTrace();
            return null;
        }
    }
}
