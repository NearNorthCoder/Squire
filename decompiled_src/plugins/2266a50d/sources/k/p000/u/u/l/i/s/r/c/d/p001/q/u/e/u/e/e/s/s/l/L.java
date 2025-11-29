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
@TaskDesc(name = "Walk To Arder Mushroom", priority = 89, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.L  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/L.class */
public class L extends Task {
    private static /* synthetic */ int[] lIllIlIIIIII;
    private static /* synthetic */ String[] lIllIIllllll;
    final /* synthetic */ C0000a bw;
    final /* synthetic */ SquireDukeSucellus bv;

    private static boolean lllIIllIlIIlII(int i, int i2) {
        return i < i2;
    }

    static {
        lllIIllIIllllI();
        lllIIllIIlllIl();
    }

    private static boolean lllIIllIlIIIll(int i) {
        return i == 0;
    }

    private static boolean lllIIllIlIIIlI(int i, int i2) {
        return i >= i2;
    }

    @Inject
    public L(SquireDukeSucellus squireDukeSucellus) {
        this.bv = squireDukeSucellus;
        this.bw = squireDukeSucellus.s();
    }

    private static String lllIIllIIllIlI(String lllllllllllllllIllIIIIIIIlIIlllI, String lllllllllllllllIllIIIIIIIlIIlIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIIIIlIIllII = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIIIIIlIIlIII.toCharArray();
        int lllllllllllllllIllIIIIIIIlIIlIlI = lIllIlIIIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIIIIII[0];
        while (lllIIllIlIIlII(i, length)) {
            lllllllllllllllIllIIIIIIIlIIllII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIIIIIIlIIlIlI % charArray.length]));
            "".length();
            lllllllllllllllIllIIIIIIIlIIlIlI++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIIIIIlIIllII);
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
        if (lllIIllIIlllll(this.bw.v())) {
            return lIllIlIIIIII[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIIllIIlllll(tileObject.getName().equals(lIllIIllllll[lIllIlIIIIII[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIIIIII[1]];
                strArr[lIllIlIIIIII[0]] = lIllIIllllll[lIllIlIIIIII[3]];
                if (lllIIllIIlllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIIIIII[1];
                    "".length();
                    return "   ".length() < "   ".length() ? ((((162 + 107) - 121) + 54) ^ (((30 + 19) - (-75)) + 29)) & (((89 ^ 75) ^ (17 ^ 80)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIlIIIIII[0];
        });
        if (lllIIllIlIIIII(nearest)) {
            return lIllIlIIIIII[0];
        }
        Player local = Players.getLocal();
        if (!lllIIllIlIIIII(local) && !lllIIllIIlllll(C0001b.b(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIllIlIIIIII[1]];
            strArr[lIllIlIIIIII[0]] = lIllIIllllll[lIllIlIIIIII[0]];
            Item first = Inventory.getFirst(strArr);
            if (lllIIllIlIIIIl(first) && lllIIllIlIIIlI(first.getQuantity(), lIllIlIIIIII[2])) {
                return lIllIlIIIIII[0];
            }
            if (!lllIIllIlIIIll(C0001b.d(nearest).contains(local) ? 1 : 0) || lllIIllIIlllll(C0001b.g(nearest).equals(local.getWorldLocation()) ? 1 : 0)) {
                Movement.setDestination(C0001b.e(nearest));
                return lIllIlIIIIII[1];
            }
            Movement.setDestination(C0001b.g(nearest));
            return lIllIlIIIIII[1];
        }
        return lIllIlIIIIII[0];
    }

    private static boolean lllIIllIlIIIII(Object obj) {
        return obj == null;
    }

    private static void lllIIllIIllllI() {
        lIllIlIIIIII = new int[6];
        lIllIlIIIIII[0] = " ".length() & (" ".length() ^ (-" ".length()));
        lIllIlIIIIII[1] = " ".length();
        lIllIlIIIIII[2] = 111 ^ 99;
        lIllIlIIIIII[3] = "  ".length();
        lIllIlIIIIII[4] = "   ".length();
        lIllIlIIIIII[5] = (((135 + 66) - 170) + 146) ^ (((2 + 81) - 69) + 171);
    }

    private static void lllIIllIIlllIl() {
        lIllIIllllll = new String[lIllIlIIIIII[4]];
        lIllIIllllll[lIllIlIIIIII[0]] = lllIIllIIllIlI("OSQdFSBYJhYHNh0k", "xVypR");
        lIllIIllllll[lIllIlIIIIII[1]] = lllIIllIIllIll("h9vmx/WsM7Y=", "pUglV");
        lIllIIllllll[lIllIlIIIIII[3]] = lllIIllIIlllII("zpr6kjKKUBUVwFRLd8ErAw==", "FrhCy");
    }

    private static boolean lllIIllIlIIIIl(Object obj) {
        return obj != null;
    }

    private static String lllIIllIIllIll(String lllllllllllllllIllIIIIIIIIlllIIl, String lllllllllllllllIllIIIIIIIIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIIIlllIII.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIII[5]), "DES");
            Cipher lllllllllllllllIllIIIIIIIIlllIll = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIIIIlllIll.init(lIllIlIIIIII[3], secretKeySpec);
            return new String(lllllllllllllllIllIIIIIIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIIIIlllIlI) {
            lllllllllllllllIllIIIIIIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIIlllll(int i) {
        return i != 0;
    }

    private static String lllIIllIIlllII(String lllllllllllllllIllIIIIIIIlIllllI, String lllllllllllllllIllIIIIIIIlIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIIIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIIIIIllIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIIIIIllIIIII.init(lIllIlIIIIII[3], lllllllllllllllIllIIIIIIIllIIIIl);
            return new String(lllllllllllllllIllIIIIIIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIIIlIlllll) {
            lllllllllllllllIllIIIIIIIlIlllll.printStackTrace();
            return null;
        }
    }
}
