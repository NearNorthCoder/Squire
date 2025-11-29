package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Drinking prayer", priority = 10000)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.y  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/y.class */
public class y extends Task {
    private static /* synthetic */ int[] lIlIlIIIlIllI;
    private final /* synthetic */ SquireVardorvis aq;
    private final /* synthetic */ C0004e as;
    private final /* synthetic */ SquireVardorvisConfig ar;
    private static /* synthetic */ String[] lIlIlIIIlIlIl;

    static {
        lIllllIlIlllIIl();
        lIllllIlIlllIII();
    }

    private static void lIllllIlIlllIIl() {
        lIlIlIIIlIllI = new int[5];
        lIlIlIIIlIllI[0] = ((((168 + 42) - 146) + 153) ^ (((10 + 95) - 83) + 177)) & (((246 ^ 132) ^ (38 ^ 74)) ^ (-" ".length()));
        lIlIlIIIlIllI[1] = " ".length();
        lIlIlIIIlIllI[2] = "  ".length();
        lIlIlIIIlIllI[3] = "   ".length();
        lIlIlIIIlIllI[4] = (9 ^ 98) ^ (8 ^ 107);
    }

    private static String lIllllIlIllIllI(String llllllllllllllIllIllIIIlIIIlIlll, String llllllllllllllIllIllIIIlIIIlIllI) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIlIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIIlIIIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIIlIIIllIIl.init(lIlIlIIIlIllI[2], llllllllllllllIllIllIIIlIIIllIlI);
            return new String(llllllllllllllIllIllIIIlIIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIlIIIllIII) {
            llllllllllllllIllIllIIIlIIIllIII.printStackTrace();
            return null;
        }
    }

    private static String lIllllIlIllIlll(String llllllllllllllIllIllIIIlIIIIlIlI, String llllllllllllllIllIllIIIlIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIllI[4]), "DES");
            Cipher llllllllllllllIllIllIIIlIIIIllII = Cipher.getInstance("DES");
            llllllllllllllIllIllIIIlIIIIllII.init(lIlIlIIIlIllI[2], secretKeySpec);
            return new String(llllllllllllllIllIllIIIlIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIlIIIIlIll) {
            llllllllllllllIllIllIIIlIIIIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIllllIlIlllIlI(Prayers.getPoints(), this.ar.drinkPrayerAt())) {
            return lIlIlIIIlIllI[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lIllllIlIllllII(item.getName().toLowerCase().contains(lIlIlIIIlIlIl[lIlIlIIIlIllI[1]]) ? 1 : 0) || lIllllIlIllllIl(item.getName().toLowerCase().contains(lIlIlIIIlIlIl[lIlIlIIIlIllI[2]]) ? 1 : 0)) {
                ?? r0 = lIlIlIIIlIllI[1];
                "".length();
                return "   ".length() <= (-" ".length()) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
            }
            return lIlIlIIIlIllI[0];
        });
        if (lIllllIlIlllIll(first)) {
            return lIlIlIIIlIllI[0];
        }
        first.interact(lIlIlIIIlIlIl[lIlIlIIIlIllI[0]]);
        return lIlIlIIIlIllI[1];
    }

    private static boolean lIllllIlIlllIlI(int i, int i2) {
        return i > i2;
    }

    private static void lIllllIlIlllIII() {
        lIlIlIIIlIlIl = new String[lIlIlIIIlIllI[3]];
        lIlIlIIIlIlIl[lIlIlIIIlIllI[0]] = lIllllIlIllIllI("bNgV8YDiAZo=", "UzwDV");
        lIlIlIIIlIlIl[lIlIlIIIlIllI[1]] = lIllllIlIllIllI("FhoksnwJ5uz7D02egQClng==", "GpLrE");
        lIlIlIIIlIlIl[lIlIlIIIlIllI[2]] = lIllllIlIllIlll("M5v+jprxl0hJUzRcjkA96Q==", "RaYvQ");
    }

    private static boolean lIllllIlIlllIll(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIlIllllII(int i) {
        return i == 0;
    }

    private static boolean lIllllIlIllllIl(int i) {
        return i != 0;
    }

    @Inject
    public y(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.aq = squireVardorvis;
        this.ar = squireVardorvisConfig;
        this.as = squireVardorvis.j();
    }
}
