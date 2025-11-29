package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Scattering ashes", priority = 9990)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.x  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/x.class */
public class C0075x extends Task {
    private static /* synthetic */ String[] llIlIIl;
    private static /* synthetic */ int[] llIlIlI;
    private final /* synthetic */ SquireCerberusConfig aL;

    private static void llIlIlllI() {
        llIlIIl = new String[llIlIlI[1]];
        llIlIIl[llIlIlI[0]] = llIlIllIl("6dH7jS181BM=", "ayupD");
    }

    private static void llIlIllll() {
        llIlIlI = new int[4];
        llIlIlI[0] = ((229 ^ 137) ^ (95 ^ 23)) & (((64 ^ 110) ^ (68 ^ 78)) ^ (-" ".length()));
        llIlIlI[1] = " ".length();
        llIlIlI[2] = (-6726) & 32503;
        llIlIlI[3] = "  ".length();
    }

    private static boolean llIllIIII(int i2) {
        return i2 == 0;
    }

    private static boolean llIllIIIl(Object obj) {
        return obj == null;
    }

    private static String llIlIllIl(String lllIlIIIlIlIIlI, String lllIlIIIlIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIIlIlIlII = Cipher.getInstance("Blowfish");
            lllIlIIIlIlIlII.init(llIlIlI[3], secretKeySpec);
            return new String(lllIlIIIlIlIlII.doFinal(Base64.getDecoder().decode(lllIlIIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIIlIlIIll) {
            lllIlIIIlIlIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean run() {
        if (llIllIIII(this.aL.scatterAshes() ? 1 : 0)) {
            return llIlIlI[0];
        }
        int[] iArr = new int[llIlIlI[1]];
        iArr[llIlIlI[0]] = llIlIlI[2];
        Item first = Inventory.getFirst(iArr);
        if (llIllIIIl(first)) {
            return llIlIlI[0];
        }
        first.interact(llIlIIl[llIlIlI[0]]);
        return llIlIlI[1];
    }

    static {
        llIlIllll();
        llIlIlllI();
    }

    @Inject
    public C0075x(SquireCerberusConfig squireCerberusConfig) {
        this.aL = squireCerberusConfig;
    }
}
