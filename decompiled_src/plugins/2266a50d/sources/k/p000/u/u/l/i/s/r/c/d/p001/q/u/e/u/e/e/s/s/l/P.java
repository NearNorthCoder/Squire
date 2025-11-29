package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walk To Musca Mushroom", priority = 99, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.P  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/P.class */
public class P extends Task {
    private static /* synthetic */ String[] lIllIllIllII;
    final /* synthetic */ SquireDukeSucellus bD;
    final /* synthetic */ C0000a bE;
    private static /* synthetic */ int[] lIllIllIllIl;

    private static void lllIlIIlIlllII() {
        lIllIllIllII = new String[lIllIllIllIl[4]];
        lIllIllIllII[lIllIllIllIl[0]] = lllIlIIlIllIlI("LyyI1ydihcq7SFcEc1JN6g==", "wEvfa");
        lIllIllIllII[lIllIllIllIl[1]] = lllIlIIlIllIlI("YaMd8tWn0CY=", "GLYid");
        lIllIllIllII[lIllIllIllIl[3]] = lllIlIIlIllIll("FwvRB7Ik+SeIVyVoJ/AESQ==", "xGmNu");
    }

    private static boolean lllIlIIllIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIlIIllIIIll(int i) {
        return i == 0;
    }

    private static boolean lllIlIIlIlllll(int i) {
        return i != 0;
    }

    private static String lllIlIIlIllIll(String lllllllllllllllIlIlllIlIlllIIlII, String lllllllllllllllIlIlllIlIlllIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), lIllIllIllIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIllIllIl[3], lllllllllllllllIlIlllIlIlllIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIlllIIlIl) {
            lllllllllllllllIlIlllIlIlllIIlIl.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIIlIllllI();
        lllIlIIlIlllII();
    }

    @Inject
    public P(SquireDukeSucellus squireDukeSucellus) {
        this.bD = squireDukeSucellus;
        this.bE = squireDukeSucellus.s();
    }

    private static boolean lllIlIIllIIIIl(Object obj) {
        return obj != null;
    }

    private static String lllIlIIlIllIlI(String lllllllllllllllIlIlllIlIllIlIlll, String lllllllllllllllIlIlllIlIllIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIlIllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIlIllIllIIl.init(lIllIllIllIl[3], secretKeySpec);
            return new String(lllllllllllllllIlIlllIlIllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIllIllIII) {
            lllllllllllllllIlIlllIlIllIllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    public boolean run() {
        if (lllIlIIlIlllll(this.bE.w())) {
            return lIllIllIllIl[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIIlIlllll(tileObject.getName().equals(lIllIllIllII[lIllIllIllIl[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIllIllIl[1]];
                strArr[lIllIllIllIl[0]] = lIllIllIllII[lIllIllIllIl[3]];
                if (lllIlIIlIlllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIllIllIl[1];
                    "".length();
                    return (((((193 + 128) - 271) + 168) ^ (((61 + 126) - 100) + 51)) & (((((94 + 5) - (-72)) + 22) ^ (((81 + 126) - 77) + 15)) ^ (-" ".length()))) < (((((38 + 44) - (-87)) + 21) ^ (((125 + 18) - 94) + 137)) & (((((95 + 58) - 135) + 114) ^ (((119 + 7) - 28) + 30)) ^ (-" ".length()))) ? ((((127 ^ 50) & ((73 ^ 4) ^ (-1))) & (((50 ^ 111) & ((44 ^ 113) ^ (-1))) ^ (-1))) ^ (143 ^ 164)) & (((38 ^ 93) ^ (66 ^ 18)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIllIllIl[0];
        });
        if (lllIlIIllIIIII(nearest)) {
            return lIllIllIllIl[0];
        }
        Player local = Players.getLocal();
        if (!lllIlIIllIIIII(local) && !lllIlIIlIlllll(C0007h.t(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIllIllIllIl[1]];
            strArr[lIllIllIllIl[0]] = lIllIllIllII[lIllIllIllIl[0]];
            Item first = Inventory.getFirst(strArr);
            if (lllIlIIllIIIIl(first) && lllIlIIllIIIlI(first.getQuantity(), lIllIllIllIl[2])) {
                return lIllIllIllIl[0];
            }
            if (!lllIlIIllIIIll(C0007h.d(nearest).contains(local) ? 1 : 0) || lllIlIIlIlllll(C0007h.g(nearest).equals(local.getWorldLocation()) ? 1 : 0)) {
                Movement.setDestination(C0007h.e(nearest));
                return lIllIllIllIl[1];
            }
            Movement.setDestination(C0007h.g(nearest));
            return lIllIllIllIl[1];
        }
        return lIllIllIllIl[0];
    }

    private static boolean lllIlIIllIIIII(Object obj) {
        return obj == null;
    }

    private static void lllIlIIlIllllI() {
        lIllIllIllIl = new int[6];
        lIllIllIllIl[0] = (39 ^ 69) & ((92 ^ 62) ^ (-1));
        lIllIllIllIl[1] = " ".length();
        lIllIllIllIl[2] = (166 ^ 168) ^ "  ".length();
        lIllIllIllIl[3] = "  ".length();
        lIllIllIllIl[4] = "   ".length();
        lIllIllIllIl[5] = (193 ^ 140) ^ (127 ^ 58);
    }
}
