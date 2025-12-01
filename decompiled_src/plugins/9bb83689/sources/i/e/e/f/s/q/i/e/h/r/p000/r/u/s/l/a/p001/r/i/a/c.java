package i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Gathering bait", priority = 7, blocking = true)
/* renamed from: i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.c  reason: invalid package */
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:i/e/e/f/s/q/i/e/h/r/-/r/u/s/l/a/-/r/i/a/c.class */
public class c extends Task {
    private static /* synthetic */ int[] lIlIlllIIll;
    private static /* synthetic */ String[] lIlIlllIIlI;

    private static boolean lIIlIIlllllIIl(int i2) {
        return i2 == 0;
    }

    private static boolean lIIlIIlllllIlI(int i2, int i3) {
        return i2 >= i3;
    }

    static {
        lIIlIIlllllIII();
        lIIlIIllllIlll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIlIlllIIll[0]];
        iArr[lIlIlllIIll[1]] = lIlIlllIIll[2];
        if (lIIlIIlllllIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIlllIIll[0]];
            iArr2[lIlIlllIIll[1]] = lIlIlllIIll[3];
            if (!lIIlIIlllllIlI(Inventory.getCount(iArr2), lIlIlllIIll[4])) {
                int[] iArr3 = new int[lIlIlllIIll[0]];
                iArr3[lIlIlllIIll[1]] = lIlIlllIIll[5];
                TileObject nearest = TileObjects.getNearest(iArr3);
                if (lIIlIIlllllIll(nearest)) {
                    return lIlIlllIIll[1];
                }
                nearest.interact(lIlIlllIIlI[lIlIlllIIll[1]]);
                return lIlIlllIIll[0];
            }
        }
        return lIlIlllIIll[1];
    }

    private static void lIIlIIllllIlll() {
        lIlIlllIIlI = new String[lIlIlllIIll[0]];
        lIlIlllIIlI[lIlIlllIIll[1]] = lIIlIIllllIllI("fuJxQKqKSuA=", "FnBEp");
    }

    private static void lIIlIIlllllIII() {
        lIlIlllIIll = new int[7];
        lIlIlllIIll[0] = " ".length();
        lIlIlllIIll[1] = ((87 ^ 42) ^ (36 ^ 22)) & (((217 ^ 151) ^ " ".length()) ^ (-" ".length()));
        lIlIlllIIll[2] = (-((-2098) & 10871)) & (-1153) & 32743;
        lIlIlllIIll[3] = (-26113) & 28274;
        lIlIlllIIll[4] = "  ".length();
        lIlIlllIIll[5] = (-12292) & 46939;
        lIlIlllIIll[6] = 7 ^ 15;
    }

    private static String lIIlIIllllIllI(String llllllllllllllllIlIlIlllIlIIIIlI, String llllllllllllllllIlIlIlllIlIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIlllIIll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlllIlIIIIll) {
            llllllllllllllllIlIlIlllIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlllllIll(Object obj) {
        return obj == null;
    }
}
