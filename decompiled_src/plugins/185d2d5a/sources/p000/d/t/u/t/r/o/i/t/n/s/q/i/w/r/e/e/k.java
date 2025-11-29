package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dropping empty jug")
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.k  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/k.class */
public class k extends Task {
    private static /* synthetic */ String[] lIlIllllIllll;
    private static /* synthetic */ int[] lIlIlllllIIIl;

    private static boolean llIIIIllIIllIll(int i) {
        return i == 0;
    }

    private static String llIIIIllIIllIII(String llllllllllllllIllIIlllIlIlIIllll, String llllllllllllllIllIIlllIlIlIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlllIlIlIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlllIlIlIlIIIl.init(lIlIlllllIIIl[3], secretKeySpec);
            return new String(llllllllllllllIllIIlllIlIlIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIlIlIlIIII) {
            llllllllllllllIllIIlllIlIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static void llIIIIllIIllIIl() {
        lIlIllllIllll = new String[lIlIlllllIIIl[0]];
        lIlIllllIllll[lIlIlllllIIIl[1]] = llIIIIllIIllIII("u3Ppmn69+HI=", "ZfLGa");
    }

    private static void llIIIIllIIllIlI() {
        lIlIlllllIIIl = new int[4];
        lIlIlllllIIIl[0] = " ".length();
        lIlIlllllIIIl[1] = ((((163 + 156) - 207) + 67) ^ (((34 + 95) - 26) + 37)) & (((100 ^ 42) ^ (237 ^ 156)) ^ (-" ".length()));
        lIlIlllllIIIl[2] = (-4193) & 6127;
        lIlIlllllIIIl[3] = "  ".length();
    }

    static {
        llIIIIllIIllIlI();
        llIIIIllIIllIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIlIlllllIIIl[0]];
        iArr[lIlIlllllIIIl[1]] = lIlIlllllIIIl[2];
        if (llIIIIllIIllIll(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIlllllIIIl[1];
        }
        int[] iArr2 = new int[lIlIlllllIIIl[0]];
        iArr2[lIlIlllllIIIl[1]] = lIlIlllllIIIl[2];
        Inventory.getFirst(iArr2).interact(lIlIllllIllll[lIlIlllllIIIl[1]]);
        return lIlIlllllIIIl[0];
    }
}
