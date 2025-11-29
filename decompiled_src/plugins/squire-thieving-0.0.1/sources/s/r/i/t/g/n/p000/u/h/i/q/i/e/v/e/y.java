package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Handling dodgy necklaces", priority = 50, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.y  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/y.class */
public class y extends Task {
    private final /* synthetic */ SquireThievingConfig am;
    private final /* synthetic */ SquireThieving an;
    private static /* synthetic */ String[] lIIlllIIIIIlI;
    private static final /* synthetic */ Logger al;
    private static /* synthetic */ int[] lIIlllIIIIIll;

    static {
        lIllIIlIIIllllI();
        lIllIIlIIIlllIl();
        al = LoggerFactory.getLogger(y.class);
    }

    private static boolean lIllIIlIIIlllll(int i) {
        return i == 0;
    }

    @Inject
    public y(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.am = squireThievingConfig;
        this.an = squireThieving;
    }

    private static void lIllIIlIIIllllI() {
        lIIlllIIIIIll = new int[5];
        lIIlllIIIIIll[0] = ((83 ^ 114) ^ (171 ^ 133)) & (((((5 + 119) - 12) + 35) ^ (((68 + 16) - (-27)) + 45)) ^ (-" ".length()));
        lIIlllIIIIIll[1] = " ".length();
        lIIlllIIIIIll[2] = (-((-707) & 12267)) & (-1) & 32703;
        lIIlllIIIIIll[3] = 153 ^ 145;
        lIIlllIIIIIll[4] = "  ".length();
    }

    private static boolean lIllIIlIIlIIIIl(int i) {
        return i != 0;
    }

    private static void lIllIIlIIIlllIl() {
        lIIlllIIIIIlI = new String[lIIlllIIIIIll[1]];
        lIIlllIIIIIlI[lIIlllIIIIIll[0]] = lIllIIlIIIlllII("+d3CGbwkwNY=", "nSFvK");
    }

    private static boolean lIllIIlIIlIIIII(int i) {
        return i <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    public boolean run() {
        if (!lIllIIlIIIlllll(this.am.dodgyNecklace() ? 1 : 0) && !lIllIIlIIlIIIII(this.am.dodgyNecklaceAmount())) {
            int[] iArr = new int[lIIlllIIIIIll[1]];
            iArr[lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
            if (lIllIIlIIlIIIIl(Equipment.contains(iArr) ? 1 : 0)) {
                return lIIlllIIIIIll[0];
            }
            int[] iArr2 = new int[lIIlllIIIIIll[1]];
            iArr2[lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
            if (lIllIIlIIIlllll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIlllIIIIIll[1]];
                iArr3[lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
                if (lIllIIlIIlIIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIlllIIIIIll[1]];
                    iArr4[lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
                    Inventory.getFirst(iArr4).interact(lIIlllIIIIIlI[lIIlllIIIIIll[0]]);
                    return lIIlllIIIIIll[1];
                }
            }
            return lIIlllIIIIIll[0];
        }
        return lIIlllIIIIIll[0];
    }

    private static String lIllIIlIIIlllII(String llllllllllllllIlllIllIlIlIIlIlIl, String llllllllllllllIlllIllIlIlIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIll[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIlIIlIllI) {
            llllllllllllllIlllIllIlIlIIlIllI.printStackTrace();
            return null;
        }
    }
}
