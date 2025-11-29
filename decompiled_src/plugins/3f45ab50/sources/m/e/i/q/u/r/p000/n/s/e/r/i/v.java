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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Mining guild iron")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.v  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/v.class */
public class v extends Task {
    private static /* synthetic */ int[] llllllIlIllI;
    private static final /* synthetic */ int[] G;
    private final /* synthetic */ SquireMinerConfig H;
    private static /* synthetic */ String[] llllllIlIlIl;
    private static final /* synthetic */ WorldPoint F;

    private static void lIIlIlIIlIlIlII() {
        llllllIlIllI = new int[8];
        llllllIlIllI[0] = ((((134 + 114) - 170) + 83) ^ (((35 + 128) - 43) + 11)) & (((149 ^ 182) ^ " ".length()) ^ (-" ".length()));
        llllllIlIllI[1] = " ".length();
        llllllIlIllI[2] = "  ".length();
        llllllIlIllI[3] = (-((-37) & 29749)) & (-1) & 32733;
        llllllIlIllI[4] = (-((-18537) & 23151)) & (-1) & 14335;
        llllllIlIllI[5] = (-((-16667) & 21275)) & (-16530) & 32501;
        llllllIlIllI[6] = (-769) & 12133;
        llllllIlIllI[7] = 147 ^ 155;
    }

    private static boolean lIIlIlIIlIlIlll(int i) {
        return i == 0;
    }

    private static String lIIlIlIIlIlIIlI(String lllllllllllllllIIlIIIllIIlIIlllI, String lllllllllllllllIIlIIIllIIlIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIIlIIllIl.getBytes(StandardCharsets.UTF_8)), llllllIlIllI[7]), "DES");
            Cipher lllllllllllllllIIlIIIllIIlIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIllIIlIlIIII.init(llllllIlIllI[2], lllllllllllllllIIlIIIllIIlIlIIIl);
            return new String(lllllllllllllllIIlIIIllIIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIllIIlIIllll) {
            lllllllllllllllIIlIIIllIIlIIllll.printStackTrace();
            return null;
        }
    }

    @Inject
    public v(SquireMinerConfig squireMinerConfig) {
        this.H = squireMinerConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIIlIlIlIl(this.H.activity(), EnumC0000a.GUILD_IRON) && !lIIlIlIIlIlIllI(Inventory.isFull() ? 1 : 0)) {
            if (lIIlIlIIlIlIlll(F.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIIlIlIIlIlIllI(Movement.shouldWalk() ? 1 : 0)) {
                    Movement.walkTo(F);
                    "".length();
                }
                return llllllIlIllI[1];
            } else if (lIIlIlIIlIlIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                return llllllIlIllI[0];
            } else {
                TileObject firstSurrounding = TileObjects.getFirstSurrounding(F, llllllIlIllI[2], G);
                if (lIIlIlIIlIllIII(firstSurrounding)) {
                    return llllllIlIllI[0];
                }
                firstSurrounding.interact(llllllIlIlIl[llllllIlIllI[0]]);
                sleep(llllllIlIllI[2]);
                return llllllIlIllI[1];
            }
        }
        return llllllIlIllI[0];
    }

    private static boolean lIIlIlIIlIlIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIlIlIIlIlIIll() {
        llllllIlIlIl = new String[llllllIlIllI[1]];
        llllllIlIlIl[llllllIlIllI[0]] = lIIlIlIIlIlIIlI("H8D1aYni0kM=", "imtFg");
    }

    static {
        lIIlIlIIlIlIlII();
        lIIlIlIIlIlIIll();
        F = new WorldPoint(llllllIlIllI[3], llllllIlIllI[4], llllllIlIllI[0]);
        int[] iArr = new int[llllllIlIllI[2]];
        iArr[llllllIlIllI[0]] = llllllIlIllI[5];
        iArr[llllllIlIllI[1]] = llllllIlIllI[6];
        G = iArr;
    }

    private static boolean lIIlIlIIlIlIllI(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIlIllIII(Object obj) {
        return obj == null;
    }
}
