package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving towards Shantay", priority = 10, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.R  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/R.class */
public class R extends S {
    private static /* synthetic */ String[] llllllIllIIl;
    private static /* synthetic */ int[] llllllIllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.S
    public boolean t() {
        if (!lIIlIlIIllIIlIl(z() ? 1 : 0) || lIIlIlIIllIIllI(y())) {
            return llllllIllIlI[0];
        }
        int[] iArr = new int[llllllIllIlI[1]];
        iArr[llllllIllIlI[0]] = llllllIllIlI[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!lIIlIlIIllIIlll(nearest)) {
            nearest.interact(llllllIllIIl[llllllIllIlI[0]]);
            return llllllIllIlI[1];
        } else if (lIIlIlIIllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(llllllIllIlI[3], llllllIllIlI[4], llllllIllIlI[0]));
            "".length();
            return llllllIllIlI[1];
        } else {
            int[] iArr2 = new int[llllllIllIlI[1]];
            iArr2[llllllIllIlI[0]] = llllllIllIlI[5];
            Item first = Inventory.getFirst(iArr2);
            if (lIIlIlIIllIlIII(first)) {
                first.drop();
                return llllllIllIlI[1];
            }
            return llllllIllIlI[0];
        }
    }

    private static boolean lIIlIlIIllIIlIl(int i) {
        return i != 0;
    }

    private static void lIIlIlIIllIIIll() {
        llllllIllIIl = new String[llllllIllIlI[1]];
        llllllIllIIl[llllllIllIlI[0]] = lIIlIlIIllIIIlI("Jz8WxIyfU6knDwfjefP4dg==", "zeqap");
    }

    private static boolean lIIlIlIIllIIlll(Object obj) {
        return obj == null;
    }

    private static void lIIlIlIIllIIlII() {
        llllllIllIlI = new int[7];
        llllllIllIlI[0] = ((1 ^ 109) ^ (229 ^ 144)) & (((((155 + 5) - 156) + 178) ^ (((83 + 146) - 144) + 90)) ^ (-" ".length()));
        llllllIllIlI[1] = " ".length();
        llllllIllIlI[2] = (-23554) & 64879;
        llllllIllIlI[3] = (-((-110) & 29551)) & (-1) & 32639;
        llllllIllIlI[4] = (-8257) & 11099;
        llllllIllIlI[5] = (-2049) & 3879;
        llllllIllIlI[6] = "  ".length();
    }

    static {
        lIIlIlIIllIIlII();
        lIIlIlIIllIIIll();
    }

    private static boolean lIIlIlIIllIIllI(int i) {
        return i > 0;
    }

    private static boolean lIIlIlIIllIlIII(Object obj) {
        return obj != null;
    }

    private static String lIIlIlIIllIIIlI(String lllllllllllllllIIlIIIlIlllllllIl, String lllllllllllllllIIlIIIlIlllllllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIlllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIlllllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIlllllllll.init(llllllIllIlI[6], lllllllllllllllIIlIIIllIIIIIIIII);
            return new String(lllllllllllllllIIlIIIlIlllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIllllllllI) {
            lllllllllllllllIIlIIIlIllllllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected R(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }
}
