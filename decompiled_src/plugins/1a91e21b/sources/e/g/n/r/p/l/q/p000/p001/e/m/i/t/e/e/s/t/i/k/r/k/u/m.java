package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drop task")
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.m  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/m.class */
public class m extends Task {
    private static /* synthetic */ String[] lIIllIIllllII;
    private final /* synthetic */ TempleTrekkingPlugin H;
    private static /* synthetic */ int[] lIIllIIlllllI;

    private static void lIllIIIIIIllllI() {
        lIIllIIllllII = new String[lIIllIIlllllI[1]];
        lIIllIIllllII[lIIllIIlllllI[0]] = lIllIIIIIIllIlI("LNIj7r9/D9E=", "okpos");
    }

    private static boolean lIllIIIIIlIIIII(int i) {
        return i == 0;
    }

    static {
        lIllIIIIIIlllll();
        lIllIIIIIIllllI();
    }

    @Inject
    public m(TempleTrekkingPlugin templeTrekkingPlugin) {
        this.H = templeTrekkingPlugin;
    }

    private static String lIllIIIIIIllIlI(String llllllllllllllIllllIIIIIIIIlIIll, String llllllllllllllIllllIIIIIIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIIlllllI[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIlllllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIIIIlIlII) {
            llllllllllllllIllllIIIIIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIIlllll() {
        lIIllIIlllllI = new int[4];
        lIIllIIlllllI[0] = ((44 ^ 18) ^ (((74 + 121) - 83) + 15)) & (((44 ^ 8) ^ (29 ^ 120)) ^ (-" ".length()));
        lIIllIIlllllI[1] = " ".length();
        lIIllIIlllllI[2] = (179 ^ 180) ^ (54 ^ 57);
        lIIllIIlllllI[3] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (lIllIIIIIlIIIII(Inventory.isFull() ? 1 : 0)) {
            return lIIllIIlllllI[0];
        }
        String[] strArr = new String[lIIllIIlllllI[1]];
        strArr[lIIllIIlllllI[0]] = lIIllIIllllII[lIIllIIlllllI[0]];
        return Inventory.dropAll(strArr);
    }
}
