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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Depositing into grinder")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.I  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/I.class */
public class I extends Task {
    private final /* synthetic */ SquireMinerConfig ag;
    private static /* synthetic */ String[] lllllIIllIll;
    private static /* synthetic */ int[] lllllIIlllII;
    private /* synthetic */ int ah;

    private static boolean lIIlIIlIlllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIlIllllIll(int i) {
        return i == 0;
    }

    private static void lIIlIIlIllllIII() {
        lllllIIlllII = new int[5];
        lllllIIlllII[0] = (143 ^ 192) & ((69 ^ 10) ^ (-1));
        lllllIIlllII[1] = (107 ^ 127) ^ (86 ^ 70);
        lllllIIlllII[2] = " ".length();
        lllllIIlllII[3] = "  ".length();
        lllllIIlllII[4] = (173 ^ 149) ^ (85 ^ 101);
    }

    private static boolean lIIlIIlIllllIlI(int i) {
        return i != 0;
    }

    private static String lIIlIIlIlllIllI(String lllllllllllllllIIlIIlIllIllIlIll, String lllllllllllllllIIlIIlIllIllIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIllIllIlIlI.getBytes(StandardCharsets.UTF_8)), lllllIIlllII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIIlllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIllIllIllII) {
            lllllllllllllllIIlIIlIllIllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIlllllII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIIlIllllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIIlIIlIllllIIl(this.ag.activity(), EnumC0000a.SANDSTONE)) {
            return lllllIIlllII[0];
        }
        if (!lIIlIIlIllllIlI(this.ag.deposit() ? 1 : 0) || lIIlIIlIllllIll(Inventory.isFull() ? 1 : 0)) {
            return lllllIIlllII[0];
        }
        int tickCount = Static.getClient().getTickCount();
        if (lIIlIIlIlllllII(tickCount - this.ah, lllllIIlllII[1])) {
            return lllllIIlllII[2];
        }
        if (lIIlIIlIllllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lllllIIlllII[2];
        }
        String[] strArr = new String[lllllIIlllII[2]];
        strArr[lllllIIlllII[0]] = lllllIIllIll[lllllIIlllII[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIlIIlIlllllIl(nearest) && lIIlIIlIllllIll(Players.getLocal().isMoving() ? 1 : 0)) {
            nearest.interact(lllllIIllIll[lllllIIlllII[2]]);
            this.ah = tickCount;
        }
        return lllllIIlllII[2];
    }

    static {
        lIIlIIlIllllIII();
        lIIlIIlIlllIlll();
    }

    private static void lIIlIIlIlllIlll() {
        lllllIIllIll = new String[lllllIIlllII[3]];
        lllllIIllIll[lllllIIlllII[0]] = lIIlIIlIlllIllI("o4h3ddHSS38=", "cuqTP");
        lllllIIllIll[lllllIIlllII[2]] = lIIlIIlIlllIllI("HtH/oUMr2nI=", "ECDDl");
    }

    @Inject
    public I(SquireMinerConfig squireMinerConfig) {
        this.ag = squireMinerConfig;
    }
}
