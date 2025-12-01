package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Attacking hydra")
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.s  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/s.class */
public class s extends Task {
    private final /* synthetic */ e ay;
    private static /* synthetic */ int[] llllIIlIIllI;
    private static /* synthetic */ String[] llllIIlIIlIl;
    private final /* synthetic */ SquireAlchemicalHydraConfig az;
    private final /* synthetic */ C0000a ax;

    private static void lIIIlllllIIllll() {
        llllIIlIIlIl = new String[llllIIlIIllI[1]];
        llllIIlIIlIl[llllIIlIIllI[0]] = lIIIlllllIIlllI("Y9SaW8w94gQ=", "ufTPQ");
    }

    static {
        lIIIlllllIlIIII();
        lIIIlllllIIllll();
    }

    private static boolean lIIIlllllIlIIll(Object obj) {
        return obj == null;
    }

    private static String lIIIlllllIIlllI(String lllllllllllllllIIlIlIllIIIlllIIl, String lllllllllllllllIIlIlIllIIIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIIllI[3], lllllllllllllllIIlIlIllIIIllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIIIlllIlI) {
            lllllllllllllllIIlIlIllIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllIlIIlI(Object obj) {
        return obj != null;
    }

    @Inject
    public s(C0000a c0000a, e eVar, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ax = c0000a;
        this.ay = eVar;
        this.az = squireAlchemicalHydraConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    public boolean run() {
        if (lIIIlllllIlIIIl(this.az.attack() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        h k = this.ax.k();
        if (!lIIIlllllIlIIlI(k) || lIIIlllllIlIIIl(this.ax.g() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        NPC K = k.K();
        if (!lIIIlllllIlIIll(k.K()) && !lIIIlllllIlIIlI(Players.getLocal().getInteracting())) {
            if (lIIIlllllIlIlII(k.Q() ? 1 : 0) && lIIIlllllIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                return llllIIlIIllI[0];
            }
            K.interact(llllIIlIIlIl[llllIIlIIllI[0]]);
            sleep(Math.min(this.ay.w() - llllIIlIIllI[1], llllIIlIIllI[2]));
            return llllIIlIIllI[1];
        }
        return llllIIlIIllI[0];
    }

    private static void lIIIlllllIlIIII() {
        llllIIlIIllI = new int[4];
        llllIIlIIllI[0] = ((((108 + 109) - 146) + 184) ^ (((28 + 101) - (-3)) + 30)) & (((((19 + 91) - (-50)) + 95) ^ (((93 + 149) - 140) + 60)) ^ (-" ".length()));
        llllIIlIIllI[1] = " ".length();
        llllIIlIIllI[2] = (((85 + 117) - 92) + 35) ^ (((16 + 4) - (-27)) + 102);
        llllIIlIIllI[3] = "  ".length();
    }

    private static boolean lIIIlllllIlIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlllllIlIlII(int i) {
        return i != 0;
    }
}
