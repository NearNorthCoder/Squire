package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Withdrawing ores", priority = 20, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.H  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/H.class */
public class H extends C {
    private final /* synthetic */ WorldPoint af;
    private static /* synthetic */ int[] lllllIIIIIll;
    private static final /* synthetic */ int ae;
    private static /* synthetic */ String[] lllllIIIIIlI;

    private static boolean lIIlIIlIIIllIlI(int i) {
        return i == 0;
    }

    private static void lIIlIIlIIIllIII() {
        lllllIIIIIlI = new String[lllllIIIIIll[3]];
        lllllIIIIIlI[lllllIIIIIll[2]] = lIIlIIlIIIlIlll("Q0NW8AFx+8U=", "DMnhP");
    }

    private static boolean lIIlIIlIIIllIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.C
    public boolean t() {
        if (lIIlIIlIIIllIlI(this.Z.O() ? 1 : 0)) {
            return lllllIIIIIll[2];
        }
        int[] iArr = new int[lllllIIIIIll[3]];
        iArr[lllllIIIIIll[2]] = lllllIIIIIll[4];
        if (lIIlIIlIIIllIll(Inventory.contains(iArr) ? 1 : 0)) {
            return lllllIIIIIll[2];
        }
        if (lIIlIIlIIIllIlI(Inventory.isFull() ? 1 : 0) && lIIlIIlIIIllIll(this.Z.D()) && !lIIlIIlIIIlllII(this.Z.M(), lllllIIIIIll[3])) {
            int[] iArr2 = new int[lllllIIIIIll[3]];
            iArr2[lllllIIIIIll[2]] = lllllIIIIIll[5];
            TileObject nearest = TileObjects.getNearest(iArr2);
            if (lIIlIIlIIIlllIl(nearest)) {
                return lllllIIIIIll[2];
            }
            if (!lIIlIIlIIIlllII(nearest.distanceTo(Players.getLocal()), lllllIIIIIll[6])) {
                nearest.interact(lllllIIIIIlI[lllllIIIIIll[2]]);
                return lllllIIIIIll[3];
            }
            Movement.walkTo(this.af);
            "".length();
            return lllllIIIIIll[3];
        }
        return lllllIIIIIll[2];
    }

    private static boolean lIIlIIlIIIlllII(int i, int i2) {
        return i > i2;
    }

    @Inject
    public H(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t) {
        super(squireMinerConfig, squireMiner, t);
        this.af = new WorldPoint(lllllIIIIIll[0], lllllIIIIIll[1], lllllIIIIIll[2]);
    }

    private static String lIIlIIlIIIlIlll(String lllllllllllllllIIlIIllIllIIIlllI, String lllllllllllllllIIlIIllIllIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIllIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIllIIIllIl.getBytes(StandardCharsets.UTF_8)), lllllIIIIIll[7]), "DES");
            Cipher lllllllllllllllIIlIIllIllIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIllIIlIIII.init(lllllIIIIIll[8], lllllllllllllllIIlIIllIllIIlIIIl);
            return new String(lllllllllllllllIIlIIllIllIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIllIIIllll) {
            lllllllllllllllIIlIIllIllIIIllll.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIlIIIllIIl();
        lIIlIIlIIIllIII();
        ae = lllllIIIIIll[5];
    }

    private static void lIIlIIlIIIllIIl() {
        lllllIIIIIll = new int[9];
        lllllIIIIIll[0] = (-8273) & 12021;
        lllllIIIIIll[1] = (-((-5653) & 32629)) & (-1) & 32635;
        lllllIIIIIll[2] = (27 ^ 90) & ((52 ^ 117) ^ (-1));
        lllllIIIIIll[3] = " ".length();
        lllllIIIIIll[4] = (-257) & 12267;
        lllllIIIIIll[5] = (-((-6) & 5037)) & (-9) & 31727;
        lllllIIIIIll[6] = 134 ^ 131;
        lllllIIIIIll[7] = (((127 + 127) - 122) + 2) ^ (((50 + 63) - 36) + 65);
        lllllIIIIIll[8] = "  ".length();
    }

    private static boolean lIIlIIlIIIlllIl(Object obj) {
        return obj == null;
    }
}
