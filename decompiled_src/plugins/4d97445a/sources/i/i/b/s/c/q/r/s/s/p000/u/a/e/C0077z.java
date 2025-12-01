package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.magic.Thralls;
@TaskDesc(name = "Using thrall", priority = 4999)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/z.class */
public class C0077z extends Task {
    private static /* synthetic */ int[] lllIlllll;
    private static /* synthetic */ String[] lllIllllI;
    private final /* synthetic */ C0000a aP;

    private static void llIIllIlIll() {
        lllIlllll = new int[3];
        lllIlllll[0] = ((((146 + 38) - 66) + 54) ^ (((113 + 140) - 214) + 111)) & (((((7 + 140) - 48) + 60) ^ (((51 + 54) - 44) + 104)) ^ (-" ".length()));
        lllIlllll[1] = " ".length();
        lllIlllll[2] = "  ".length();
    }

    private static boolean llIIllIlllI(Object obj) {
        return obj != null;
    }

    private static void llIIllIlIlI() {
        lllIllllI = new String[lllIlllll[1]];
        lllIllllI[lllIlllll[0]] = llIIllIlIIl("39P8w1W0u5U=", "vGsfE");
    }

    @Inject
    public C0077z(C0000a c0000a) {
        this.aP = c0000a;
    }

    private static String llIIllIlIIl(String lIlIlIIIIIllIIl, String lIlIlIIIIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIIIllIll = Cipher.getInstance("Blowfish");
            lIlIlIIIIIllIll.init(lllIlllll[2], secretKeySpec);
            return new String(lIlIlIIIIIllIll.doFinal(Base64.getDecoder().decode(lIlIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIIIllIlI) {
            lIlIlIIIIIllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        if (!llIIllIllII(Thralls.canUse() ? 1 : 0) && !llIIllIllIl(this.aP.k())) {
            NPC y = this.aP.k().y();
            if (llIIllIlllI(y)) {
                String[] strArr = new String[lllIlllll[1]];
                strArr[lllIlllll[0]] = lllIllllI[lllIlllll[0]];
                if (llIIllIllII(y.hasAction(strArr) ? 1 : 0)) {
                    return lllIlllll[0];
                }
            }
            return Thralls.useBestThrall();
        }
        return lllIlllll[0];
    }

    static {
        llIIllIlIll();
        llIIllIlIlI();
    }

    private static boolean llIIllIllIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIllIllII(int i2) {
        return i2 == 0;
    }
}
