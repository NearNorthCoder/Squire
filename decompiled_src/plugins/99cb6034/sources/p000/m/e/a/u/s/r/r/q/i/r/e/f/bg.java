package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
@TaskDesc(name = "Picking up seaweed spores", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.bg  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/bg.class */
public class bg extends Task {
    private static /* synthetic */ String[] lIlllllIllIl;
    private final /* synthetic */ SquireFarmerConfig cT;
    private static /* synthetic */ int[] lIlllllIlllI;

    private static String lllIllllllIlII(String lllllllllllllllIlIllIIIIIIIIIlII, String lllllllllllllllIlIllIIIIIIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllIlllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIIIIIIIlIl) {
            lllllllllllllllIlIllIIIIIIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllIllllllIlIl() {
        lIlllllIllIl = new String[lIlllllIlllI[1]];
        lIlllllIllIl[lIlllllIlllI[0]] = lllIllllllIlII("7qWy+T/5m+k=", "caOMj");
    }

    private static boolean lllIllllllIlll(int i) {
        return i == 0;
    }

    static {
        lllIllllllIllI();
        lllIllllllIlIl();
    }

    private static boolean lllIlllllllIIl(int i, int i2) {
        return i != i2;
    }

    @Inject
    public bg(SquireFarmerConfig squireFarmerConfig) {
        this.cT = squireFarmerConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        if (lllIllllllIlll(this.cT.fossil_island_underwaterSpores() ? 1 : 0)) {
            return lIlllllIlllI[0];
        }
        int[] iArr = new int[lIlllllIlllI[1]];
        iArr[lIlllllIlllI[0]] = lIlllllIlllI[2];
        TileItem nearest = TileItems.getNearest(iArr);
        if (!lllIlllllllIII(nearest) || lllIlllllllIIl(nearest.getWorldLocation().getRegionID(), EnumC0041p.FOSSIL_ISLAND_UNDERWATER.X())) {
            return lIlllllIlllI[0];
        }
        nearest.interact(lIlllllIllIl[lIlllllIlllI[0]]);
        return lIlllllIlllI[1];
    }

    private static void lllIllllllIllI() {
        lIlllllIlllI = new int[4];
        lIlllllIlllI[0] = (172 ^ 155) & ((126 ^ 73) ^ (-1));
        lIlllllIlllI[1] = " ".length();
        lIlllllIlllI[2] = (-((-662) & 11935)) & (-1) & 32763;
        lIlllllIlllI[3] = "  ".length();
    }

    private static boolean lllIlllllllIII(Object obj) {
        return obj != null;
    }
}
