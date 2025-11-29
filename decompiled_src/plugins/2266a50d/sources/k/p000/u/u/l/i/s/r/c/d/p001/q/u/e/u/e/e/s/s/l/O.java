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
@TaskDesc(name = "Exit Musca Area", priority = 97, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.O  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/O.class */
public class O extends Task {
    private static /* synthetic */ int[] lIllIlIIllII;
    final /* synthetic */ C0000a bC;
    final /* synthetic */ SquireDukeSucellus bB;
    private static /* synthetic */ String[] lIllIlIIlIll;

    static {
        lllIIlllIIllll();
        lllIIlllIIlllI();
    }

    private static void lllIIlllIIllll() {
        lIllIlIIllII = new int[6];
        lIllIlIIllII[0] = ((((77 + 102) - 92) + 63) ^ (((15 + 144) - 90) + 107)) & (((253 ^ 190) ^ (91 ^ 62)) ^ (-" ".length()));
        lIllIlIIllII[1] = " ".length();
        lIllIlIIllII[2] = 191 ^ 179;
        lIllIlIIllII[3] = "  ".length();
        lIllIlIIllII[4] = "   ".length();
        lIllIlIIllII[5] = (((180 + 1) - 131) + 136) ^ (((51 + 148) - 165) + 144);
    }

    private static String lllIIlllIIllIl(String lllllllllllllllIlIlllllIlIlIlIlI, String lllllllllllllllIlIlllllIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIllII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIllII[3], lllllllllllllllIlIlllllIlIlIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllllIlIlIlIll) {
            lllllllllllllllIlIlllllIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllIlIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    public boolean run() {
        if (lllIIlllIlIIII(this.bC.w())) {
            return lIllIlIIllII[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIIlllIlIIII(tileObject.getName().equals(lIllIlIIlIll[lIllIlIIllII[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIIllII[1]];
                strArr[lIllIlIIllII[0]] = lIllIlIIlIll[lIllIlIIllII[3]];
                if (lllIIlllIlIIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIIllII[1];
                    "".length();
                    return (((((34 + 145) - 58) + 31) ^ (((126 + 90) - 99) + 21)) & (((149 ^ 180) ^ (130 ^ 177)) ^ (-" ".length()))) >= ((208 ^ 146) ^ (65 ^ 7)) ? ((46 ^ 30) ^ (82 ^ 57)) & (((42 ^ 98) ^ (43 ^ 56)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIlIIllII[0];
        });
        if (lllIIlllIlIIIl(nearest)) {
            return lIllIlIIllII[0];
        }
        Player local = Players.getLocal();
        if (!lllIIlllIlIIIl(local) && !lllIIlllIlIIII(C0007h.i(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIllIlIIllII[1]];
            strArr[lIllIlIIllII[0]] = lIllIlIIlIll[lIllIlIIllII[0]];
            Item first = Inventory.getFirst(strArr);
            if (!lllIIlllIlIIlI(first) || lllIIlllIlIIll(first.getQuantity(), lIllIlIIllII[2])) {
                return lIllIlIIllII[0];
            }
            if (lllIIlllIlIIII(C0007h.t(nearest).contains(local) ? 1 : 0) && lllIIlllIlIlII(C0007h.f(nearest).equals(local.getWorldLocation()) ? 1 : 0)) {
                Movement.setDestination(C0007h.f(nearest));
                return lIllIlIIllII[1];
            }
            Movement.setDestination(C0007h.j(nearest));
            return lIllIlIIllII[1];
        }
        return lIllIlIIllII[0];
    }

    private static boolean lllIIlllIlIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIlllIlIIlI(Object obj) {
        return obj != null;
    }

    private static String lllIIlllIIllII(String lllllllllllllllIlIlllllIlIllllll, String lllllllllllllllIlIlllllIlIlllllI) {
        String lllllllllllllllIlIlllllIlIllllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllllIlIllllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllllIlIlllllI.toCharArray();
        int lllllllllllllllIlIlllllIlIlllIll = lIllIlIIllII[0];
        char[] charArray2 = lllllllllllllllIlIlllllIlIllllll2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIIllII[0];
        while (lllIIlllIlIIll(i, length)) {
            char lllllllllllllllIlIlllllIllIIIIII = charArray2[i];
            lllllllllllllllIlIlllllIlIllllIl.append((char) (lllllllllllllllIlIlllllIllIIIIII ^ charArray[lllllllllllllllIlIlllllIlIlllIll % charArray.length]));
            "".length();
            lllllllllllllllIlIlllllIlIlllIll++;
            i++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllllIlIllllIl);
    }

    private static boolean lllIIlllIlIIIl(Object obj) {
        return obj == null;
    }

    private static String lllIIlllIIlIll(String lllllllllllllllIlIlllllIlIIlllIl, String lllllllllllllllIlIlllllIlIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllllIlIIllllI) {
            lllllllllllllllIlIlllllIlIIllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public O(SquireDukeSucellus squireDukeSucellus) {
        this.bB = squireDukeSucellus;
        this.bC = squireDukeSucellus.s();
    }

    private static boolean lllIIlllIlIIII(int i) {
        return i != 0;
    }

    private static void lllIIlllIIlllI() {
        lIllIlIIlIll = new String[lIllIlIIllII[4]];
        lIllIlIIlIll[lIllIlIIllII[0]] = lllIIlllIIlIll("JcZ4PRYfRaGAVmXKoDMKGw==", "NvVai");
        lIllIlIIlIll[lIllIlIIllII[1]] = lllIIlllIIllII("AjsRCw==", "EZenI");
        lIllIlIIlIll[lIllIlIIllII[3]] = lllIIlllIIllIl("d00POq84vZje8VmY/RYJ6g==", "nxfKc");
    }
}
