package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Mining amethyst")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.x  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/x.class */
public class x extends Task {
    private static final /* synthetic */ List<Integer> M;
    private static final /* synthetic */ WorldPoint K;
    private static /* synthetic */ String[] lllllIIIIlII;
    private final /* synthetic */ SquireMinerConfig N;
    private static final /* synthetic */ WorldPoint L;
    private static /* synthetic */ int[] lllllIIIIlIl;

    private static void lIIlIIlIIIlllll() {
        lllllIIIIlII = new String[lllllIIIIlIl[4]];
        lllllIIIIlII[lllllIIIIlIl[0]] = lIIlIIlIIIllllI("xzU77gbcrQY=", "TsRVQ");
    }

    private static boolean lIIlIIlIIlIIIlI(int i) {
        return i != 0;
    }

    private static int lIIlIIlIIlIIlIl(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    private static String lIIlIIlIIIllllI(String lllllllllllllllIIlIIllIlIllIlIll, String lllllllllllllllIIlIIllIlIllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIlIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), lllllIIIIlIl[1]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIIIIlIl[11], lllllllllllllllIIlIIllIlIllIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlIllIllII) {
            lllllllllllllllIIlIIllIlIllIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public boolean run() {
        WorldPoint worldPoint;
        if (!lIIlIIlIIlIIIIl(this.N.activity(), EnumC0000a.AMETHYST) && !lIIlIIlIIlIIIlI(Inventory.isFull() ? 1 : 0)) {
            if (lIIlIIlIIlIIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
                sleep(Rand.nextInt(lllllIIIIlIl[1], lllllIIIIlIl[2]));
                return lllllIIIIlIl[0];
            }
            if (lIIlIIlIIlIIIll(Vars.getBit(lllllIIIIlIl[3]))) {
                worldPoint = K;
                "".length();
                if (((35 ^ 41) & ((66 ^ 72) ^ (-1))) > "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                worldPoint = L;
            }
            TileObject nearest = TileObjects.getNearest(worldPoint, tileObject -> {
                if (lIIlIIlIIlIIIlI(M.contains(Integer.valueOf(tileObject.getId())) ? 1 : 0) && lIIlIIlIIlIIIlI(Players.getAll(player -> {
                    if (lIIlIIlIIlIIIlI(player.isAnimating() ? 1 : 0) && lIIlIIlIIlIIllI(lIIlIIlIIlIIlIl(player.getWorldLocation().distanceToHypotenuse(tileObject.getWorldLocation()), 1.0f))) {
                        ?? r0 = lllllIIIIlIl[4];
                        "".length();
                        return "   ".length() == " ".length() ? ((64 ^ 10) ^ (175 ^ 187)) & (((((191 + 63) - 248) + 219) ^ (((110 + 46) - 145) + 180)) ^ (-" ".length())) : r0;
                    }
                    return lllllIIIIlIl[0];
                }).isEmpty() ? 1 : 0) && lIIlIIlIIlIIIlI(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                    ?? r0 = lllllIIIIlIl[4];
                    "".length();
                    return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllllIIIIlIl[0];
            });
            if (lIIlIIlIIlIIlII(nearest)) {
                return lllllIIIIlIl[0];
            }
            nearest.interact(lllllIIIIlII[lllllIIIIlIl[0]]);
            return lllllIIIIlIl[4];
        }
        return lllllIIIIlIl[0];
    }

    private static boolean lIIlIIlIIlIIllI(int i) {
        return i == 0;
    }

    private static boolean lIIlIIlIIlIIIll(int i) {
        return i > 0;
    }

    private static boolean lIIlIIlIIlIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lIIlIIlIIlIIIII();
        lIIlIIlIIIlllll();
        K = new WorldPoint(lllllIIIIlIl[5], lllllIIIIlIl[6], lllllIIIIlIl[0]);
        L = new WorldPoint(lllllIIIIlIl[7], lllllIIIIlIl[8], lllllIIIIlIl[0]);
        M = List.of(Integer.valueOf(lllllIIIIlIl[9]), Integer.valueOf(lllllIIIIlIl[10]));
    }

    private static void lIIlIIlIIlIIIII() {
        lllllIIIIlIl = new int[12];
        lllllIIIIlIl[0] = (133 ^ 197) & ((135 ^ 199) ^ (-1));
        lllllIIIIlIl[1] = 64 ^ 72;
        lllllIIIIlIl[2] = 155 ^ 148;
        lllllIIIIlIl[3] = (-((-8589) & 28557)) & (-139) & 24571;
        lllllIIIIlIl[4] = " ".length();
        lllllIIIIlIl[5] = (-9281) & 12287;
        lllllIIIIlIl[6] = (-((-2097) & 22588)) & (-2053) & 32255;
        lllllIIIIlIl[7] = (-41) & 3067;
        lllllIIIIlIl[8] = (-2577) & 12280;
        lllllIIIIlIl[9] = (-17028) & 28415;
        lllllIIIIlIl[10] = (-((-3925) & 20437)) & (-4609) & 32509;
        lllllIIIIlIl[11] = "  ".length();
    }

    private static boolean lIIlIIlIIlIIlII(Object obj) {
        return obj == null;
    }

    @Inject
    public x(SquireMinerConfig squireMinerConfig) {
        this.N = squireMinerConfig;
    }
}
