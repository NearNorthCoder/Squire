package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Mining volcanic ash", priority = 5)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.N  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/N.class */
public class N extends Task {
    private static /* synthetic */ int[] llllllIlIIlI;
    private final /* synthetic */ SquireMinerConfig aq;
    private static /* synthetic */ String[] llllllIlIIIl;

    private static String lIIlIlIIIllllIl(String lllllllllllllllIIlIIIllIllIlIIIl, String lllllllllllllllIIlIIIllIllIlIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIllIllIIllll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIllIllIlIIII.toCharArray();
        int lllllllllllllllIIlIIIllIllIIllIl = llllllIlIIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllllIlIIlI[0];
        while (lIIlIlIIlIIIllI(i, length)) {
            char lllllllllllllllIIlIIIllIllIlIIlI = charArray2[i];
            lllllllllllllllIIlIIIllIllIIllll.append((char) (lllllllllllllllIIlIIIllIllIlIIlI ^ charArray[lllllllllllllllIIlIIIllIllIIllIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIllIllIIllIl++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIIllIllIIllll);
    }

    private static boolean lIIlIlIIlIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIlIIIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIIlIlIIlIIIIII(this.aq.activity(), EnumC0000a.VOLCANIC_ASH)) {
            return llllllIlIIlI[0];
        }
        Player local = Players.getLocal();
        if (lIIlIlIIlIIIIIl(Inventory.isFull() ? 1 : 0) && lIIlIlIIlIIIIlI(local) && lIIlIlIIlIIIIIl(local.isAnimating() ? 1 : 0) && !lIIlIlIIlIIIIll(local.isMoving() ? 1 : 0)) {
            if (lIIlIlIIlIIIIIl(Movement.isRunEnabled() ? 1 : 0) && lIIlIlIIlIIIlII(Movement.getRunEnergy(), llllllIlIIlI[1])) {
                Movement.toggleRun();
            }
            int[] iArr = new int[llllllIlIIlI[2]];
            iArr[llllllIlIIlI[0]] = llllllIlIIlI[3];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIlIlIIlIIIlIl(nearest)) {
                System.out.println(llllllIlIIIl[llllllIlIIlI[0]]);
                return llllllIlIIlI[0];
            }
            nearest.interact(llllllIlIIIl[llllllIlIIlI[2]]);
            return llllllIlIIlI[2];
        }
        return llllllIlIIlI[0];
    }

    private static String lIIlIlIIIllllII(String lllllllllllllllIIlIIIllIlIllllII, String lllllllllllllllIIlIIIllIlIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIlIlllIll.getBytes(StandardCharsets.UTF_8)), llllllIlIIlI[5]), "DES");
            Cipher lllllllllllllllIIlIIIllIlIlllllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIllIlIlllllI.init(llllllIlIIlI[4], secretKeySpec);
            return new String(lllllllllllllllIIlIIIllIlIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIllIlIllllIl) {
            lllllllllllllllIIlIIIllIlIllllIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public N(SquireMinerConfig squireMinerConfig) {
        this.aq = squireMinerConfig;
    }

    private static boolean lIIlIlIIlIIIlIl(Object obj) {
        return obj == null;
    }

    private static void lIIlIlIIIlllllI() {
        llllllIlIIIl = new String[llllllIlIIlI[4]];
        llllllIlIIIl[llllllIlIIlI[0]] = lIIlIlIIIllllII("w1oGlJotXGu9wKLS0l0PiUOgMb8NQatLuxtuHu6Dv9Q=", "KbmaV");
        llllllIlIIIl[llllllIlIIlI[2]] = lIIlIlIIIllllIl("CgwvFQ==", "GeApq");
    }

    private static boolean lIIlIlIIlIIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlIIlIIIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIlIIIllllll() {
        llllllIlIIlI = new int[6];
        llllllIlIIlI[0] = (6 ^ 76) & ((243 ^ 185) ^ (-1));
        llllllIlIIlI[1] = (((132 + 81) - 109) + 75) ^ (((147 + 94) - 171) + 100);
        llllllIlIIlI[2] = " ".length();
        llllllIlIIlI[3] = (-((-6201) & 7295)) & (-673) & 32751;
        llllllIlIIlI[4] = "  ".length();
        llllllIlIIlI[5] = (102 ^ 67) ^ (130 ^ 175);
    }

    static {
        lIIlIlIIIllllll();
        lIIlIlIIIlllllI();
    }

    private static boolean lIIlIlIIlIIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIIlIIIIIl(int i) {
        return i == 0;
    }
}
