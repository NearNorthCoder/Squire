package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Mining Daeyalt Essence")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/m.class */
public class C0012m extends Task {
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ int[] lllllIIllIII;
    private static /* synthetic */ String[] lllllIIlIlll;

    private static void lIIlIIlIllIllII() {
        lllllIIllIII = new int[5];
        lllllIIllIII[0] = "  ".length() & ("  ".length() ^ (-" ".length()));
        lllllIIllIII[1] = 153 ^ 157;
        lllllIIllIII[2] = " ".length();
        lllllIIllIII[3] = 114 ^ 122;
        lllllIIllIII[4] = "  ".length();
    }

    private static String lIIlIIlIllIlIlI(String lllllllllllllllIIlIIlIlllIllllII, String lllllllllllllllIIlIIlIlllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlllIlllIll.getBytes(StandardCharsets.UTF_8)), lllllIIllIII[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIIllIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlllIllllIl) {
            lllllllllllllllIIlIIlIlllIllllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        if (lIIlIIlIllIllIl(this.f.activity(), EnumC0000a.DAEYALT)) {
            return lllllIIllIII[0];
        }
        TileObject h = EnumC0006g.h();
        if (lIIlIIlIllIlllI(h)) {
            return lllllIIllIII[0];
        }
        if (lIIlIIlIllIllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            sleep(lllllIIllIII[1]);
            return lllllIIllIII[0];
        }
        h.interact(lllllIIlIlll[lllllIIllIII[0]]);
        sleep(lllllIIllIII[1]);
        return lllllIIllIII[2];
    }

    private static boolean lIIlIIlIllIllll(int i) {
        return i != 0;
    }

    private static boolean lIIlIIlIllIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lIIlIIlIllIllII();
        lIIlIIlIllIlIll();
    }

    private static boolean lIIlIIlIllIlllI(Object obj) {
        return obj == null;
    }

    private static void lIIlIIlIllIlIll() {
        lllllIIlIlll = new String[lllllIIllIII[2]];
        lllllIIlIlll[lllllIIllIII[0]] = lIIlIIlIllIlIlI("ARqmL9bb5lY=", "QrsHB");
    }
}
