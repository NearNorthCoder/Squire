package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating", blocking = true)
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.h  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/h.class */
public class h extends Task {
    private static /* synthetic */ int[] lIlIIlIIlllII;
    private static /* synthetic */ String[] lIlIIlIIllIll;
    private final /* synthetic */ SquireSkipperConfig C;

    private static boolean lIlllIlIllIIIII(int i) {
        return i == 0;
    }

    private static String lIlllIlIlIlllIl(String llllllllllllllIllIlllIlIIlIllIII, String llllllllllllllIllIlllIlIIlIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIlIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlllII[2]), "DES");
            Cipher llllllllllllllIllIlllIlIIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlllIlIIlIllIlI.init(lIlIIlIIlllII[3], llllllllllllllIllIlllIlIIlIllIll);
            return new String(llllllllllllllIllIlllIlIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlIIlIllIIl) {
            llllllllllllllIllIlllIlIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIllIIIIl(int i, int i2) {
        return i > i2;
    }

    static {
        lIlllIlIlIlllll();
        lIlllIlIlIllllI();
    }

    private static void lIlllIlIlIlllll() {
        lIlIIlIIlllII = new int[4];
        lIlIIlIIlllII[0] = " ".length();
        lIlIIlIIlllII[1] = (88 ^ 101) & ((184 ^ 133) ^ (-1));
        lIlIIlIIlllII[2] = 138 ^ 130;
        lIlIIlIIlllII[3] = "  ".length();
    }

    @Inject
    public h(SquireSkipperConfig squireSkipperConfig) {
        this.C = squireSkipperConfig;
    }

    private static void lIlllIlIlIllllI() {
        lIlIIlIIllIll = new String[lIlIIlIIlllII[0]];
        lIlIIlIIllIll[lIlIIlIIlllII[1]] = lIlllIlIlIlllIl("r3vM6i1+pws=", "rCRBw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIlIIlIIlllII[0]];
        iArr[lIlIIlIIlllII[1]] = this.C.foodID();
        if (!lIlllIlIllIIIII(Inventory.contains(iArr) ? 1 : 0) && !lIlllIlIllIIIIl(Combat.getCurrentHealth(), this.C.eatHP())) {
            int[] iArr2 = new int[lIlIIlIIlllII[0]];
            iArr2[lIlIIlIIlllII[1]] = this.C.foodID();
            Inventory.getFirst(iArr2).interact(lIlIIlIIllIll[lIlIIlIIlllII[1]]);
            return lIlIIlIIlllII[0];
        }
        return lIlIIlIIlllII[1];
    }
}
