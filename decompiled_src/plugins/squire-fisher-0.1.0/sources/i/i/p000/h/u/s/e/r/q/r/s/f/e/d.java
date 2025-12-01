package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Depositing Loot")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.d  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/d.class */
public class d extends Task {
    private static final /* synthetic */ Logger w;
    private static /* synthetic */ int[] lIlllIllIIIl;
    private /* synthetic */ int q;
    private final /* synthetic */ SquireFisherConfig x;
    private static /* synthetic */ String[] lIlllIllIIII;
    private final /* synthetic */ SquireFisherPlugin y;

    private static String lllIlIlllIIIlI(String lllllllllllllllIlIlllIlIllIIIIlI, String lllllllllllllllIlIlllIlIllIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIllIIIl[5]), "DES");
            Cipher lllllllllllllllIlIlllIlIllIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlIllIIIlII.init(lIlllIllIIIl[6], lllllllllllllllIlIlllIlIllIIIlIl);
            return new String(lllllllllllllllIlIlllIlIllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIllIIIIll) {
            lllllllllllllllIlIlllIlIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlllIIlII() {
        lIlllIllIIIl = new int[7];
        lIlllIllIIIl[0] = (-((-2421) & 31605)) & (-3073) & 32623;
        lIlllIllIIIl[1] = (95 ^ 25) ^ (108 ^ 60);
        lIlllIllIIIl[2] = ((65 ^ 103) ^ (94 ^ 51)) & (((82 ^ 109) ^ (10 ^ 126)) ^ (-" ".length()));
        lIlllIllIIIl[3] = (31 ^ 58) ^ (20 ^ 34);
        lIlllIllIIIl[4] = " ".length();
        lIlllIllIIIl[5] = (40 ^ 99) ^ (90 ^ 25);
        lIlllIllIIIl[6] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    public boolean run() {
        if (!lllIlIlllIIlIl(Widgets.isVisible(Widgets.get(lIlllIllIIIl[0], lIlllIllIIIl[1])) ? 1 : 0) && !lllIlIlllIIlIl(this.y.e() ? 1 : 0)) {
            if (lllIlIlllIIllI(Widgets.isVisible(Widgets.get(lIlllIllIIIl[0], lIlllIllIIIl[1])) ? 1 : 0)) {
                Widgets.get(lIlllIllIIIl[0], lIlllIllIIIl[3]).interact(lIlllIllIIII[lIlllIllIIIl[2]]);
                this.y.a((boolean) lIlllIllIIIl[2]);
            }
            return lIlllIllIIIl[4];
        }
        return lIlllIllIIIl[2];
    }

    private static boolean lllIlIlllIIllI(int i2) {
        return i2 != 0;
    }

    static {
        lllIlIlllIIlII();
        lllIlIlllIIIll();
        w = LoggerFactory.getLogger(d.class);
    }

    private static boolean lllIlIlllIIlIl(int i2) {
        return i2 == 0;
    }

    @Inject
    public d(SquireFisherConfig squireFisherConfig, SquireFisherPlugin squireFisherPlugin) {
        this.x = squireFisherConfig;
        this.y = squireFisherPlugin;
    }

    private static void lllIlIlllIIIll() {
        lIlllIllIIII = new String[lIlllIllIIIl[4]];
        lIlllIllIIII[lIlllIllIIIl[2]] = lllIlIlllIIIlI("TjU1cL+y00x8pG0m/h0i/w==", "ZqeVc");
    }
}
