package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
@TaskDesc(name = "Logging out", priority = 2147483646, blocking = true)
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.n  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/n.class */
public class n extends Task {
    private final /* synthetic */ b K;
    private static /* synthetic */ int[] lIIllIllIIIII;
    private /* synthetic */ Player G;
    private final /* synthetic */ TempleTrekkingPlugin I;
    private final /* synthetic */ TempleTrekkingConfig J;
    private static /* synthetic */ String[] lIIllIlIlllll;

    private static boolean lIllIIIlIIIIIIl(int i) {
        return i == 0;
    }

    private static void lIllIIIlIIIIIII() {
        lIIllIllIIIII = new int[3];
        lIIllIllIIIII[0] = ((65 ^ 54) ^ (111 ^ 9)) & (((64 ^ 55) ^ (196 ^ 162)) ^ (-" ".length()));
        lIIllIllIIIII[1] = " ".length();
        lIIllIllIIIII[2] = "  ".length();
    }

    private static void lIllIIIIlllllll() {
        lIIllIlIlllll = new String[lIIllIllIIIII[1]];
        lIIllIlIlllll[lIIllIllIIIII[0]] = lIllIIIIllllllI("hJKjdVNJRhyED2zyKnzRSuZn/u0GZDvOaNQl2aDhR9w=", "wZwTr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        if (lIllIIIlIIIIIIl(this.I.k() ? 1 : 0)) {
            return lIIllIllIIIII[0];
        }
        Player local = Players.getLocal();
        if (lIllIIIlIIIIIIl(this.I.f().contains(local) ? 1 : 0) && lIllIIIlIIIIIIl(this.I.g().contains(local) ? 1 : 0)) {
            return lIIllIllIIIII[0];
        }
        Game.logout();
        System.out.println(lIIllIlIlllll[lIIllIllIIIII[0]]);
        return lIIllIllIIIII[0];
    }

    static {
        lIllIIIlIIIIIII();
        lIllIIIIlllllll();
    }

    @Inject
    public n(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b bVar) {
        this.J = templeTrekkingConfig;
        this.K = bVar;
        this.I = templeTrekkingPlugin;
    }

    private static String lIllIIIIllllllI(String llllllllllllllIlllIlllIlllIIIIlI, String llllllllllllllIlllIlllIlllIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIlllIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIlllIIIlII.init(lIIllIllIIIII[2], secretKeySpec);
            return new String(llllllllllllllIlllIlllIlllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIlllIIIIll) {
            llllllllllllllIlllIlllIlllIIIIll.printStackTrace();
            return null;
        }
    }
}
