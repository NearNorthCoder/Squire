package k.p.n.s.r.a.p000.q.e.l.r.e.i.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Making Planks")
/* renamed from: k.p.n.s.r.a.-.q.e.l.r.e.i.u.c  reason: invalid package */
/* loaded from: squire-planker-0.0.5.jar:k/p/n/s/r/a/-/q/e/l/r/e/i/u/c.class */
public class c extends Task {
    private final /* synthetic */ SquirePlankerConfig m;
    private static /* synthetic */ int[] llllllIIIIII;
    private static /* synthetic */ String[] lllllIllllll;

    @Inject
    public c(SquirePlankerConfig squirePlankerConfig) {
        this.m = squirePlankerConfig;
    }

    private static boolean lIIlIIllllIIllI(int i) {
        return i != 0;
    }

    static {
        lIIlIIllllIIIll();
        lIIlIIllllIIIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[llllllIIIIII[0]];
        strArr[llllllIIIIII[1]] = lllllIllllll[llllllIIIIII[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        String[] strArr2 = new String[llllllIIIIII[0]];
        strArr2[llllllIIIIII[1]] = lllllIllllll[llllllIIIIII[0]];
        NPC nearest2 = NPCs.getNearest(strArr2);
        int[] iArr = new int[llllllIIIIII[0]];
        iArr[llllllIIIIII[1]] = this.m.plank().d();
        Item first = Inventory.getFirst(iArr);
        String[] strArr3 = new String[llllllIIIIII[0]];
        strArr3[llllllIIIIII[1]] = lllllIllllll[llllllIIIIII[2]];
        TileObject nearest3 = TileObjects.getNearest(strArr3);
        if (!lIIlIIllllIIlII(nearest) && !lIIlIIllllIIlIl(nearest3) && !lIIlIIllllIIllI(Players.getLocal().isAnimating() ? 1 : 0) && !lIIlIIllllIIllI(Dialog.isOpen() ? 1 : 0)) {
            if (lIIlIIllllIIlII(nearest2) && lIIlIIllllIIlll(nearest2.distanceTo(Players.getLocal()), llllllIIIIII[0]) && lIIlIIllllIlIII(nearest2.distanceTo(Players.getLocal()), llllllIIIIII[3])) {
                first.useOn(nearest2);
            }
            if (lIIlIIllllIIlII(Widgets.get(llllllIIIIII[4], llllllIIIIII[1]))) {
                if (!lIIlIIllllIIlII(nearest2) || lIIlIIllllIlIIl(nearest2.distanceTo(Players.getLocal()), llllllIIIIII[5])) {
                    Widgets.get(llllllIIIIII[4], llllllIIIIII[6]).interact(lllllIllllll[llllllIIIIII[5]]);
                    sleep(llllllIIIIII[7]);
                    "".length();
                    if ((-" ".length()) >= "   ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            } else if (lIIlIIllllIIlII(first)) {
                Widgets.get(llllllIIIIII[8], llllllIIIIII[9]).interact(lllllIllllll[llllllIIIIII[7]]);
            }
            return llllllIIIIII[0];
        }
        return llllllIIIIII[1];
    }

    private static boolean lIIlIIllllIlIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIllllIIIIl(String lllllllllllllllIIlIlIIIIIIIIlllI, String lllllllllllllllIIlIlIIIIIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIIIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIIIIIIIllll) {
            lllllllllllllllIIlIlIIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllllIIlII(Object obj) {
        return obj != null;
    }

    private static void lIIlIIllllIIIll() {
        llllllIIIIII = new int[10];
        llllllIIIIII[0] = " ".length();
        llllllIIIIII[1] = ((3 ^ 32) ^ (31 ^ 124)) & (((((3 + 60) - (-83)) + 91) ^ (((125 + 42) - 82) + 88)) ^ (-" ".length()));
        llllllIIIIII[2] = "  ".length();
        llllllIIIIII[3] = 144 ^ 149;
        llllllIIIIII[4] = (-((-8201) & 15369)) & (-16525) & 24062;
        llllllIIIIII[5] = "   ".length();
        llllllIIIIII[6] = (110 ^ 50) ^ (80 ^ 26);
        llllllIIIIII[7] = 122 ^ 126;
        llllllIIIIII[8] = 48 ^ 68;
        llllllIIIIII[9] = 112 ^ 111;
    }

    private static boolean lIIlIIllllIIlll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIlIIllllIIIII(String lllllllllllllllIIlIIlllllllllllI, String lllllllllllllllIIlIIllllllllllIl) {
        String lllllllllllllllIIlIIlllllllllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllllllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllllllllllII = new StringBuilder();
        char[] lllllllllllllllIIlIIlllllllllIll = lllllllllllllllIIlIIllllllllllIl.toCharArray();
        int lllllllllllllllIIlIIlllllllllIlI = llllllIIIIII[1];
        char[] charArray = lllllllllllllllIIlIIlllllllllllI2.toCharArray();
        int length = charArray.length;
        int i = llllllIIIIII[1];
        while (lIIlIIllllIlIII(i, length)) {
            lllllllllllllllIIlIIllllllllllII.append((char) (charArray[i] ^ lllllllllllllllIIlIIlllllllllIll[lllllllllllllllIIlIIlllllllllIlI % lllllllllllllllIIlIIlllllllllIll.length]));
            "".length();
            lllllllllllllllIIlIIlllllllllIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIllllllllllII);
    }

    private static boolean lIIlIIllllIlIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIllllIIlIl(Object obj) {
        return obj == null;
    }

    private static void lIIlIIllllIIIlI() {
        lllllIllllll = new String[llllllIIIIII[3]];
        lllllIllllll[llllllIIIIII[1]] = lIIlIIllllIIIII("JRUUJ0wEHB8/GA==", "gtzLl");
        lllllIllllll[llllllIIIIII[0]] = lIIlIIllllIIIIl("N4YViLqWXC2pqSeUZTgDBw==", "DHEbq");
        lllllIllllll[llllllIIIIII[2]] = lIIlIIllllIIIIl("YyfmI0Lo4wI=", "aaaSc");
        lllllIllllll[llllllIIIIII[5]] = lIIlIIllllIIIII("OxgrBksrHDUcChYN", "xyGjk");
        lllllIllllll[llllllIIIIII[7]] = lIIlIIllllIIIIl("TN8RBQy6q3dPV2R5NuWJnVLUIhUM65mk", "AZLRd");
    }
}
