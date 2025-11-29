package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Opening the barrel")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.i  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/i.class */
public class i extends Task {
    private static final /* synthetic */ int M;
    private final /* synthetic */ SquireFisherConfig N;
    private static /* synthetic */ String[] lIlllIlIllII;
    private static /* synthetic */ int[] lIlllIlIllIl;

    private static String lllIlIllIIllll(String lllllllllllllllIlIlllIllIIlIlIII, String lllllllllllllllIlIlllIllIIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlIllIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIllIIlIIlII) {
            lllllllllllllllIlIlllIllIIlIIlII.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIllIlIIIl();
        lllIlIllIlIIII();
        M = lIlllIlIllIl[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lllIlIllIlIIlI(this.N.fishBarrel() ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        if (!lllIlIllIlIIlI(this.N.fishingTrawler() ? 1 : 0) || lllIlIllIlIIll(this.N.fish().h().equals(lIlllIlIllII[lIlllIlIllIl[0]]) ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        if (lllIlIllIlIIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        int[] iArr = new int[lIlllIlIllIl[1]];
        iArr[lIlllIlIllIl[0]] = lIlllIlIllIl[2];
        Item first = Inventory.getFirst(iArr);
        if (lllIlIllIlIlII(first)) {
            first.interact(lIlllIlIllII[lIlllIlIllIl[1]]);
            return lIlllIlIllIl[1];
        }
        return lIlllIlIllIl[0];
    }

    private static boolean lllIlIllIlIIlI(int i2) {
        return i2 == 0;
    }

    private static void lllIlIllIlIIII() {
        lIlllIlIllII = new String[lIlllIlIllIl[4]];
        lIlllIlIllII[lIlllIlIllIl[0]] = lllIlIllIIllll("RWOF1gZawE/hk2HPDIqsBwV6tbeI1ULw", "uHJwl");
        lIlllIlIllII[lIlllIlIllIl[1]] = lllIlIllIIllll("QqqEWQ0Ooco=", "eBdUc");
    }

    private static boolean lllIlIllIlIlII(Object obj) {
        return obj != null;
    }

    private static void lllIlIllIlIIIl() {
        lIlllIlIllIl = new int[5];
        lIlllIlIllIl[0] = (84 ^ 4) & ((239 ^ 191) ^ (-1));
        lIlllIlIllIl[1] = " ".length();
        lIlllIlIllIl[2] = (-6161) & 31742;
        lIlllIlIllIl[3] = (-((-9891) & 30695)) & (-10) & 32751;
        lIlllIlIllIl[4] = "  ".length();
    }

    @Inject
    public i(SquireFisherConfig squireFisherConfig) {
        this.N = squireFisherConfig;
    }

    private static boolean lllIlIllIlIIll(int i2) {
        return i2 != 0;
    }
}
