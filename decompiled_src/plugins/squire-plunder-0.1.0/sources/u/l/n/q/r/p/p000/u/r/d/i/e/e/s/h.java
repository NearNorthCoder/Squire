package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Passing Trap", priority = 15)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.h  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/h.class */
public class h extends Task {
    private static /* synthetic */ int[] llllllIlllll;
    private static /* synthetic */ String[] llllllIllllI;
    private final /* synthetic */ Client B;

    private static String lIIlIlIIlIlIlll(String lllllllllllllllIIlIIllIlIIIIIIll, String lllllllllllllllIIlIIllIlIIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIlIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIlllll[4], lllllllllllllllIIlIIllIlIIIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlIIIIIlII) {
            lllllllllllllllIIlIIllIlIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIlllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIIlIllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIIlIllIll(int i, int i2) {
        return i != i2;
    }

    private static void lIIlIlIIlIllIIl() {
        llllllIlllll = new int[7];
        llllllIlllll[0] = (-9217) & 11581;
        llllllIlllll[1] = "   ".length() & ("   ".length() ^ (-1));
        llllllIlllll[2] = (-((-12317) & 28991)) & (-17) & 24439;
        llllllIlllll[3] = " ".length();
        llllllIlllll[4] = "  ".length();
        llllllIlllll[5] = "   ".length();
        llllllIlllll[6] = 80 ^ 88;
    }

    private static void lIIlIlIIlIllIII() {
        llllllIllllI = new String[llllllIlllll[5]];
        llllllIllllI[llllllIlllll[1]] = lIIlIlIIlIlIllI("jHYYBGCtTtE=", "ULiyO");
        llllllIllllI[llllllIlllll[3]] = lIIlIlIIlIlIlll("ipcDJSweqkJYWkIskLqBiA==", "YpDGu");
        llllllIllllI[llllllIlllll[4]] = lIIlIlIIlIlIlll("mcVHdazcsTo=", "LXVyd");
    }

    static {
        lIIlIlIIlIllIIl();
        lIIlIlIIlIllIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIIlIllIlI(this.B.getVarbitValue(llllllIlllll[0])) && !lIIlIlIIlIllIll(Players.getLocal().getWorldLocation().getRegionID(), llllllIlllll[2])) {
            if (!lIIlIlIIlIllIlI(Players.getLocal().isMoving() ? 1 : 0) || lIIlIlIIlIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
                return llllllIlllll[1];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIlIlIIlIlllII(tileObject.getName().contains(llllllIllllI[llllllIlllll[3]]) ? 1 : 0)) {
                    String[] strArr = new String[llllllIlllll[3]];
                    strArr[llllllIlllll[1]] = llllllIllllI[llllllIlllll[4]];
                    if (lIIlIlIIlIlllII(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = llllllIlllll[3];
                        "".length();
                        return !((true ^ true) ^ (true ^ true)) ? ((((110 + 99) - 89) + 69) ^ (((15 + 121) - 104) + 103)) & (((((95 + 75) - 141) + 127) ^ (((95 + 86) - 117) + 102)) ^ (-" ".length())) : r0;
                    }
                }
                return llllllIlllll[1];
            });
            if (lIIlIlIIlIlllIl(nearest)) {
                return llllllIlllll[1];
            }
            nearest.interact(llllllIllllI[llllllIlllll[1]]);
            return llllllIlllll[3];
        }
        return llllllIlllll[1];
    }

    @Inject
    public h(Client client) {
        this.B = client;
    }

    private static String lIIlIlIIlIlIllI(String lllllllllllllllIIlIIllIlIIIlIIII, String lllllllllllllllIIlIIllIlIIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIIIIllll.getBytes(StandardCharsets.UTF_8)), llllllIlllll[6]), "DES");
            Cipher lllllllllllllllIIlIIllIlIIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIlIIIlIIlI.init(llllllIlllll[4], secretKeySpec);
            return new String(lllllllllllllllIIlIIllIlIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlIIIlIIIl) {
            lllllllllllllllIIlIIllIlIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIlllII(int i) {
        return i != 0;
    }
}
