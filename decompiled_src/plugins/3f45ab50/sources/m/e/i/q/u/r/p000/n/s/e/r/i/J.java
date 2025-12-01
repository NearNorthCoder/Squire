package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Mining sandstone")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.J  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/J.class */
public class J extends Task {
    private static /* synthetic */ int[] lllllIllllIl;
    private static /* synthetic */ String[] lllllIllllII;
    private final /* synthetic */ SquireMiner aj;
    private final /* synthetic */ SquireMinerConfig ak;
    public static final /* synthetic */ int ai;

    private static boolean lIIlIlIIIIIlIll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public J(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        this.aj = squireMiner;
        this.ak = squireMinerConfig;
    }

    private static String lIIlIIlllllllll(String lllllllllllllllIIlIIlIIIIlIIlIII, String lllllllllllllllIIlIIlIIIIlIIIlll) {
        String lllllllllllllllIIlIIlIIIIlIIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIlIIIIlIIIlll.toCharArray();
        int lllllllllllllllIIlIIlIIIIlIIIlII = lllllIllllIl[0];
        char[] charArray2 = lllllllllllllllIIlIIlIIIIlIIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lllllIllllIl[0];
        while (lIIlIlIIIIIlIll(i, length)) {
            char lllllllllllllllIIlIIlIIIIlIIlIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIIlIIIIlIIlIIl ^ charArray[lllllllllllllllIIlIIlIIIIlIIIlII % charArray.length]));
            "".length();
            lllllllllllllllIIlIIlIIIIlIIIlII++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIlIIIIIIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlIIIIIlIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIIIIIlIIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIlIIllllllllI(String lllllllllllllllIIlIIlIIIIIllIIll, String lllllllllllllllIIlIIlIIIIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lllllIllllIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIllllIl[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIIIIllIlII) {
            lllllllllllllllIIlIIlIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIIIllI(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIIIIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlIIIIIIlll(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIlIlIIIIIIIIl();
        lIIlIlIIIIIIIII();
        ai = lllllIllllIl[7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    public boolean run() {
        if (lIIlIlIIIIIIIlI(this.ak.activity(), EnumC0000a.SANDSTONE)) {
            return lllllIllllIl[0];
        }
        int[] iArr = new int[lllllIllllIl[1]];
        iArr[lllllIllllIl[0]] = lllllIllllIl[2];
        if (lIIlIlIIIIIIIll(Inventory.getCount(iArr), this.ak.waterskins())) {
            int[] iArr2 = new int[lllllIllllIl[1]];
            iArr2[lllllIllllIl[0]] = lllllIllllIl[2];
            Inventory.getFirst(iArr2).interact(lllllIllllII[lllllIllllIl[0]]);
        }
        Player local = Players.getLocal();
        if (lIIlIlIIIIIIlII(Inventory.isFull() ? 1 : 0) && lIIlIlIIIIIIlIl(local) && lIIlIlIIIIIIlII(local.isAnimating() ? 1 : 0) && !lIIlIlIIIIIIllI(local.isMoving() ? 1 : 0)) {
            if (lIIlIlIIIIIIlII(Movement.isRunEnabled() ? 1 : 0) && lIIlIlIIIIIIlll(Movement.getRunEnergy(), lllllIllllIl[3])) {
                Movement.toggleRun();
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIlIlIIIIIlIlI(tileObject.getId(), lllllIllllIl[7]) && lIIlIlIIIIIIllI(this.ak.area().a(tileObject.getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = lllllIllllIl[1];
                    "".length();
                    return (((((29 + 165) - 21) + 37) ^ (((90 + 111) - 193) + 137)) & (("   ".length() ^ (49 ^ 113)) ^ (-" ".length()))) != (((133 ^ 165) ^ (64 ^ 110)) & (((215 ^ 192) ^ (59 ^ 34)) ^ (-" ".length()))) ? ((230 ^ 157) ^ (75 ^ 0)) & (((40 ^ 35) ^ (49 ^ 10)) ^ (-" ".length())) : r0;
                }
                return lllllIllllIl[0];
            });
            if (lIIlIlIIIIIlIII(nearest)) {
                Movement.walkTo(new WorldPoint(lllllIllllIl[4], lllllIllllIl[5], lllllIllllIl[0]), (boolean) lllllIllllIl[0]);
                "".length();
                return lllllIllllIl[1];
            }
            if (lIIlIlIIIIIIllI(Movement.isRunEnabled() ? 1 : 0) && lIIlIlIIIIIlIIl(Players.getLocal().distanceTo(nearest), lllllIllllIl[6])) {
                this.aj.a();
            }
            nearest.interact(lllllIllllII[lllllIllllIl[1]]);
            return lllllIllllIl[1];
        }
        return lllllIllllIl[0];
    }

    private static boolean lIIlIlIIIIIlIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIIlIlIIIIIIIIl() {
        lllllIllllIl = new int[10];
        lllllIllllIl[0] = (140 ^ 131) & ((51 ^ 60) ^ (-1));
        lllllIllllIl[1] = " ".length();
        lllllIllllIl[2] = (-10241) & 12063;
        lllllIllllIl[3] = 86 ^ 79;
        lllllIllllIl[4] = (-((-19572) & 24319)) & (-24597) & 32511;
        lllllIllllIl[5] = (-((-17235) & 21490)) & (-25601) & 32767;
        lllllIllllIl[6] = (((150 + 54) - 64) + 34) ^ (((168 + 50) - 141) + 93);
        lllllIllllIl[7] = (-((-11283) & 32663)) & (-1) & 32766;
        lllllIllllIl[8] = "  ".length();
        lllllIllllIl[9] = (85 ^ 35) ^ (125 ^ 3);
    }

    private static boolean lIIlIlIIIIIIlII(int i) {
        return i == 0;
    }

    private static void lIIlIlIIIIIIIII() {
        lllllIllllII = new String[lllllIllllIl[8]];
        lllllIllllII[lllllIllllIl[0]] = lIIlIIllllllllI("vtJm/7+CzCY=", "THdxn");
        lllllIllllII[lllllIllllIl[1]] = lIIlIIlllllllll("KDM0MQ==", "eZZTC");
    }

    private static boolean lIIlIlIIIIIIlIl(Object obj) {
        return obj != null;
    }
}
