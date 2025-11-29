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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Depositing ores", priority = 19, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.G  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/G.class */
public class G extends C {
    private static /* synthetic */ String[] lllllIlIIIll;
    private static /* synthetic */ int[] lllllIlIlIII;
    private final /* synthetic */ int[] ad;

    private static boolean lIIlIIllIlIlIIl(int i) {
        return i != 0;
    }

    static {
        lIIlIIllIlIIlll();
        lIIlIIllIIlIlll();
    }

    @Inject
    public G(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t) {
        super(squireMinerConfig, squireMiner, t);
        int[] iArr = new int[lllllIlIlIII[0]];
        iArr[lllllIlIlIII[1]] = lllllIlIlIII[2];
        iArr[lllllIlIlIII[3]] = lllllIlIlIII[4];
        iArr[lllllIlIlIII[5]] = lllllIlIlIII[6];
        iArr[lllllIlIlIII[7]] = lllllIlIlIII[8];
        iArr[lllllIlIlIII[9]] = lllllIlIlIII[10];
        iArr[lllllIlIlIII[11]] = lllllIlIlIII[12];
        iArr[lllllIlIlIII[13]] = lllllIlIlIII[14];
        iArr[lllllIlIlIII[15]] = lllllIlIlIII[16];
        iArr[lllllIlIlIII[17]] = lllllIlIlIII[18];
        iArr[lllllIlIlIII[19]] = lllllIlIlIII[20];
        iArr[lllllIlIlIII[21]] = lllllIlIlIII[22];
        this.ad = iArr;
    }

    private static void lIIlIIllIIlIlll() {
        lllllIlIIIll = new String[lllllIlIlIII[3]];
        lllllIlIIIll[lllllIlIlIII[1]] = lIIlIIllIIlIllI("BfPSa4esAjE=", "zxjZp");
    }

    private static boolean lIIlIIllIlIlIlI(Object obj) {
        return obj == null;
    }

    private static String lIIlIIllIIlIllI(String lllllllllllllllIIlIIlIlIlIIIllll, String lllllllllllllllIIlIIlIlIlIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIlIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlIlIIIlllI.getBytes(StandardCharsets.UTF_8)), lllllIlIlIII[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIlIlIII[5], lllllllllllllllIIlIIlIlIlIIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlIlIIlIIII) {
            lllllllllllllllIIlIIlIlIlIIlIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.C
    public boolean t() {
        if (lIIlIIllIlIlIII(this.Z.O() ? 1 : 0)) {
            return lllllIlIlIII[1];
        }
        if (lIIlIIllIlIlIII(Inventory.contains(item -> {
            return T.av.contains(Integer.valueOf(item.getId()));
        }) ? 1 : 0)) {
            if (lIIlIIllIlIlIII(this.Z.D())) {
                this.Z.a((boolean) lllllIlIlIII[1]);
            }
            return lllllIlIlIII[1];
        }
        int[] iArr = new int[lllllIlIlIII[3]];
        iArr[lllllIlIlIII[1]] = lllllIlIlIII[23];
        if (lIIlIIllIlIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllllIlIlIII[3]];
            iArr2[lllllIlIlIII[1]] = lllllIlIlIII[23];
            Inventory.dropAll(iArr2);
            "".length();
            return lllllIlIlIII[3];
        } else if (lIIlIIllIlIlIIl(DepositBox.isOpen() ? 1 : 0)) {
            DepositBox.depositAllItems(this.ad);
            return lllllIlIlIII[3];
        } else {
            int[] iArr3 = new int[lllllIlIlIII[3]];
            iArr3[lllllIlIlIII[1]] = lllllIlIlIII[24];
            TileObject nearest = TileObjects.getNearest(iArr3);
            if (lIIlIIllIlIlIlI(nearest)) {
                return lllllIlIlIII[1];
            }
            if (lIIlIIllIlIlIII(Reachable.isInteractable(nearest) ? 1 : 0)) {
                Movement.walkTo(nearest);
                "".length();
                return lllllIlIlIII[3];
            }
            if (lIIlIIllIlIlIIl(Movement.shouldWalk() ? 1 : 0)) {
                nearest.interact(lllllIlIIIll[lllllIlIlIII[1]]);
            }
            return lllllIlIlIII[3];
        }
    }

    private static void lIIlIIllIlIIlll() {
        lllllIlIlIII = new int[25];
        lllllIlIlIII[0] = 22 ^ 29;
        lllllIlIlIII[1] = ((110 ^ 83) ^ (168 ^ 184)) & (((((133 + 39) - 148) + 146) ^ (((134 + 128) - 209) + 82)) ^ (-" ".length()));
        lllllIlIlIII[2] = (-((-8397) & 9471)) & (-8713) & 10239;
        lllllIlIlIII[3] = " ".length();
        lllllIlIlIII[4] = (-20500) & 32511;
        lllllIlIlIII[5] = "  ".length();
        lllllIlIlIII[6] = (-6721) & 7164;
        lllllIlIlIII[7] = "   ".length();
        lllllIlIlIII[8] = (-4161) & 4607;
        lllllIlIlIII[9] = (84 ^ 117) ^ (45 ^ 8);
        lllllIlIlIII[10] = (-((-2241) & 31975)) & (-2561) & 32743;
        lllllIlIlIII[11] = 127 ^ 122;
        lllllIlIlIII[12] = (-15893) & 16343;
        lllllIlIlIII[13] = (77 ^ 65) ^ (123 ^ 113);
        lllllIlIlIII[14] = (-((-1047) & 9407)) & (-16385) & 26367;
        lllllIlIlIII[15] = 54 ^ 49;
        lllllIlIlIII[16] = (-30729) & 32349;
        lllllIlIlIII[17] = (182 ^ 151) ^ (185 ^ 144);
        lllllIlIlIII[18] = (-20493) & 22111;
        lllllIlIlIII[19] = 10 ^ 3;
        lllllIlIlIII[20] = (-((-9879) & 32415)) & (-8231) & 32383;
        lllllIlIlIII[21] = (((51 + 4) - (-67)) + 50) ^ (((51 + 27) - 47) + 135);
        lllllIlIlIII[22] = (-((-347) & 27131)) & (-4353) & 32767;
        lllllIlIlIII[23] = (-261) & 12271;
        lllllIlIlIII[24] = (-((-1107) & 3711)) & (-129) & 28669;
    }

    private static boolean lIIlIIllIlIlIII(int i) {
        return i == 0;
    }
}
