package u.i.r.d.s.e.r.q.y.a.h.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Burying bones", priority = 20)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.z  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/z.class */
public class z extends Task {
    private static /* synthetic */ String[] llllIIlllllI;
    private final /* synthetic */ C0000a aW;
    private static /* synthetic */ int[] llllIIllllll;
    private final /* synthetic */ SquireAlchemicalHydraConfig aX;

    private static void lIIlIIIIIlIllIl() {
        llllIIllllll = new int[4];
        llllIIllllll[0] = (66 ^ 8) & ((80 ^ 26) ^ (-1));
        llllIIllllll[1] = " ".length();
        llllIIllllll[2] = "  ".length();
        llllIIllllll[3] = (231 ^ 194) ^ (24 ^ 53);
    }

    private static boolean lIIlIIIIIlIlllI(int i) {
        return i == 0;
    }

    static {
        lIIlIIIIIlIllIl();
        lIIlIIIIIlIllII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIIIlIlllI(this.aX.bury() ? 1 : 0) && !lIIlIIIIIlIlllI(this.aW.g() ? 1 : 0) && !lIIlIIIIIlIllll(this.aW.k())) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llllIIllllll[1]];
                strArr[llllIIllllll[0]] = llllIIlllllI[llllIIllllll[1]];
                return item.hasAction(strArr);
            });
            if (lIIlIIIIIllIIII(first)) {
                return llllIIllllll[0];
            }
            first.interact(llllIIlllllI[llllIIllllll[0]]);
            return llllIIllllll[1];
        }
        return llllIIllllll[0];
    }

    private static void lIIlIIIIIlIllII() {
        llllIIlllllI = new String[llllIIllllll[2]];
        llllIIlllllI[llllIIllllll[0]] = lIIlIIIIIlIlIll("eP2DeyEIEe0=", "BSnWu");
        llllIIlllllI[llllIIllllll[1]] = lIIlIIIIIlIlIll("UMokKNnOXtU=", "hMjUz");
    }

    private static boolean lIIlIIIIIllIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIIlIllll(Object obj) {
        return obj != null;
    }

    @Inject
    public z(C0000a c0000a, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aW = c0000a;
        this.aX = squireAlchemicalHydraConfig;
    }

    private static String lIIlIIIIIlIlIll(String lllllllllllllllIIlIlIIlllIIIllIl, String lllllllllllllllIIlIlIIlllIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlllIIIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIllllll[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIllllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlllIIIlllI) {
            lllllllllllllllIIlIlIIlllIIIlllI.printStackTrace();
            return null;
        }
    }
}
