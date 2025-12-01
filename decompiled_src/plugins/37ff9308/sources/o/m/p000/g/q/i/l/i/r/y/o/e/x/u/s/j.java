package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
@TaskDesc(name = "Agitator task")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.j  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/j.class */
public class j extends Task {
    private static /* synthetic */ int[] lllllllIlIll;
    private final /* synthetic */ SquireMixologyConfig R;
    private static /* synthetic */ String[] lllllllIlIlI;
    final /* synthetic */ int Q = lllllllIlIll[0];

    private static boolean lIIlIlIlIlIIllI(int i, int i2) {
        return i != i2;
    }

    @Inject
    public j(SquireMixologyConfig squireMixologyConfig) {
        this.R = squireMixologyConfig;
    }

    private static boolean lIIlIlIlIlIIIlI(int i) {
        return i == 0;
    }

    static {
        lIIlIlIlIlIIIIl();
        lIIlIlIlIIlllll();
    }

    private static boolean lIIlIlIlIlIIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIlIlIIIlI(s.e() ? 1 : 0) && !lIIlIlIlIlIIIll(this.R.pluginMode(), d.MINIGAME) && !lIIlIlIlIlIIIlI(s.a(lllllllIlIll[2], lllllllIlIll[3], lllllllIlIll[4]) ? 1 : 0) && !lIIlIlIlIlIIIlI(Players.getLocal().isIdle() ? 1 : 0)) {
            if (lIIlIlIlIlIIlII(this.R.potionStrategy(), f.MULTI_ORDER)) {
                if (lIIlIlIlIlIIIlI(s.g() ? 1 : 0) && lIIlIlIlIlIIlIl(Vars.getBit(lllllllIlIll[3]), lllllllIlIll[5])) {
                    return lllllllIlIll[1];
                }
                s.j();
                if (lIIlIlIlIlIIllI(SquireMixology.x, lllllllIlIll[0])) {
                    return lllllllIlIll[1];
                }
            }
            if (lIIlIlIlIlIIIll(this.R.potionStrategy(), f.MULTI_ORDER) && lIIlIlIlIlIIllI(SquireMixology.r, lllllllIlIll[0])) {
                return lllllllIlIll[1];
            }
            SquireMixology.g = lllllllIlIlI[lllllllIlIll[1]];
            int[] iArr = new int[lllllllIlIll[5]];
            iArr[lllllllIlIll[1]] = lllllllIlIll[4];
            TileObjects.getNearest(iArr).interact(lllllllIlIll[1]);
            return lllllllIlIll[1];
        }
        return lllllllIlIll[1];
    }

    private static void lIIlIlIlIIlllll() {
        lllllllIlIlI = new String[lllllllIlIll[5]];
        lllllllIlIlI[lllllllIlIll[1]] = lIIlIlIlIIllllI("ykBtTV1q5+K+LuTvwPIhiQ==", "KYIxs");
    }

    private static boolean lIIlIlIlIlIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIlIlIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIIlIlIlIIllllI(String lllllllllllllllIIlIIIlIIlIlIIIIl, String lllllllllllllllIIlIIIlIIlIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIIlIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIIlIlIIIll.init(lllllllIlIll[6], secretKeySpec);
            return new String(lllllllllllllllIIlIIIlIIlIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIIlIlIIIlI) {
            lllllllllllllllIIlIIIlIIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIlIIIIl() {
        lllllllIlIll = new int[7];
        lllllllIlIll[0] = (-((-4126) & 29087)) & (-5) & 30639;
        lllllllIlIll[1] = (122 ^ 45) & ((253 ^ 170) ^ (-1));
        lllllllIlIll[2] = (-28790) & 31743;
        lllllllIlIll[3] = (-21431) & 32759;
        lllllllIlIll[4] = (-801) & 56190;
        lllllllIlIll[5] = " ".length();
        lllllllIlIll[6] = "  ".length();
    }
}
