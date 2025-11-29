package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Mining essenece")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/p.class */
public class C0015p extends Task {
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ String[] llllllIIIlII;
    private static /* synthetic */ int[] llllllIIIlIl;

    static {
        lIIlIlIIIIlllll();
        lIIlIlIIIIllllI();
    }

    private static boolean lIIlIlIIIlIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIIlIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIlIlIIIIllllI() {
        llllllIIIlII = new String[llllllIIIlIl[3]];
        llllllIIIlII[llllllIIIlIl[0]] = lIIlIlIIIIlllIl("vHgQleUkhXw=", "EXwYD");
    }

    private static boolean lIIlIlIIIlIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIIIIlllIl(String lllllllllllllllIIlIIIllllIlIllll, String lllllllllllllllIIlIIIllllIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllllIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllllIlIllII.getBytes(StandardCharsets.UTF_8)), llllllIIIlIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIIIlIl[5], lllllllllllllllIIlIIIllllIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIllllIllIIII) {
            lllllllllllllllIIlIIIllllIllIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIIIlIIIII(this.f.activity(), EnumC0000a.ESSENCE) && !lIIlIlIIIlIIIIl(Inventory.isFull() ? 1 : 0) && !lIIlIlIIIlIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            int[] iArr = new int[llllllIIIlIl[1]];
            iArr[llllllIIIlIl[0]] = llllllIIIlIl[2];
            iArr[llllllIIIlIl[3]] = llllllIIIlIl[4];
            iArr[llllllIIIlIl[5]] = llllllIIIlIl[6];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIlIlIIIlIIIlI(nearest)) {
                return llllllIIIlIl[0];
            }
            nearest.interact(llllllIIIlII[llllllIIIlIl[0]]);
            return llllllIIIlIl[3];
        }
        return llllllIIIlIl[0];
    }

    private static void lIIlIlIIIIlllll() {
        llllllIIIlIl = new int[8];
        llllllIIIlIl[0] = ((47 ^ 88) ^ (82 ^ 8)) & (((242 ^ 174) ^ (180 ^ 197)) ^ (-" ".length()));
        llllllIIIlIl[1] = "   ".length();
        llllllIIIlIl[2] = (-" ".length()) & (-17098) & 32507;
        llllllIIIlIl[3] = " ".length();
        llllllIIIlIl[4] = (-26657) & 61429;
        llllllIIIlIl[5] = "  ".length();
        llllllIIIlIl[6] = (-7825) & 24511;
        llllllIIIlIl[7] = (97 ^ 15) ^ (251 ^ 157);
    }
}
