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
@TaskDesc(name = "Deposit Arder Mushroom", priority = 91, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.J  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/J.class */
public class J extends Task {
    final /* synthetic */ SquireDukeSucellus br;
    private static /* synthetic */ int[] lIllIlIlIlIl;
    final /* synthetic */ C0000a bs;
    private static /* synthetic */ String[] lIllIlIlIlII;

    private static boolean lllIIlllllIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lllIIllllllIII(Object obj) {
        return obj != null;
    }

    private static String lllIIlllllIIII(String lllllllllllllllIlIllllIllIllllIl, String lllllllllllllllIlIllllIllIllllII) {
        String lllllllllllllllIlIllllIllIllllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIllIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllIllIlllIll = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllllIllIllllII.toCharArray();
        int lllllllllllllllIlIllllIllIlllIIl = lIllIlIlIlIl[0];
        char[] charArray2 = lllllllllllllllIlIllllIllIllllIl2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIlIlIl[0];
        while (lllIIllllllIIl(i, length)) {
            lllllllllllllllIlIllllIllIlllIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIllllIllIlllIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIllllIllIlllIIl++;
            i++;
            "".length();
            if (((161 ^ 133) & ((176 ^ 148) ^ (-1))) > ((43 ^ 75) & ((81 ^ 49) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllllIllIlllIll);
    }

    @Inject
    public J(SquireDukeSucellus squireDukeSucellus) {
        this.br = squireDukeSucellus;
        this.bs = squireDukeSucellus.s();
    }

    private static boolean lllIIllllllIll(int i, int i2) {
        return i == i2;
    }

    static {
        lllIIlllllIlII();
        lllIIlllllIIll();
    }

    private static boolean lllIIlllllIlll(int i) {
        return i == 0;
    }

    private static void lllIIlllllIlII() {
        lIllIlIlIlIl = new int[8];
        lIllIlIlIlIl[0] = ((((52 + 36) - 56) + 98) ^ (((90 + 5) - (-11)) + 53)) & (((((87 + 18) - (-27)) + 34) ^ (((17 + 44) - (-35)) + 91)) ^ (-" ".length()));
        lIllIlIlIlIl[1] = "  ".length();
        lIllIlIlIlIl[2] = " ".length();
        lIllIlIlIlIl[3] = 114 ^ 116;
        lIllIlIlIlIl[4] = "   ".length();
        lIllIlIlIlIl[5] = 79 ^ 75;
        lIllIlIlIlIl[6] = 176 ^ 181;
        lIllIlIlIlIl[7] = (((117 + 128) - 92) + 14) ^ (((21 + 108) - (-43)) + 3);
    }

    private static boolean lllIIlllllllII(int i, int i2) {
        return i > i2;
    }

    private static String lllIIlllllIIlI(String lllllllllllllllIlIllllIllIlIlIII, String lllllllllllllllIlIllllIllIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIllIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIllIlIIlll.getBytes(StandardCharsets.UTF_8)), lIllIlIlIlIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIlIlIl[1], lllllllllllllllIlIllllIllIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIllIlIlIIl) {
            lllllllllllllllIlIllllIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllllllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIllllllIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIIllllllIlI(tileObject.getName().equals(lIllIlIlIlII[lIllIlIlIlIl[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIlIlIl[2]];
                strArr[lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[6]];
                if (lllIIllllllIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIlIlIl[2];
                    "".length();
                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIlIlIlIl[0];
        });
        if (lllIIlllllIlIl(nearest)) {
            return lIllIlIlIlIl[0];
        }
        Player local = Players.getLocal();
        if (lllIIlllllIlIl(local)) {
            return lIllIlIlIlIl[0];
        }
        int lllllllllllllllIlIllllIlllIlllll = this.bs.v();
        if (!lllIIlllllIllI(lllllllllllllllIlIllllIlllIlllll, lIllIlIlIlIl[1]) && !lllIIlllllIlll(C0001b.i(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIllIlIlIlIl[2]];
            strArr[lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[0]];
            Item first = Inventory.getFirst(strArr);
            if (!lllIIllllllIII(first) || lllIIllllllIIl(first.getQuantity(), lIllIlIlIlIl[3])) {
                return lIllIlIlIlIl[0];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                String[] strArr2 = new String[lIllIlIlIlIl[2]];
                strArr2[lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[1]];
                if (!lllIIllllllIlI(tileObject2.hasAction(strArr2) ? 1 : 0) || lllIIlllllIlll(tileObject2.getName().equals(lIllIlIlIlII[lIllIlIlIlIl[4]]) ? 1 : 0)) {
                    return lIllIlIlIlIl[0];
                }
                if (lllIIllllllIll(lllllllllllllllIlIllllIlllIlllll, lIllIlIlIlIl[2])) {
                    if (lllIIlllllllII(tileObject2.getWorldX(), nearest.getWorldX())) {
                        ?? r0 = lIllIlIlIlIl[2];
                        "".length();
                        return (-" ".length()) > " ".length() ? ((198 ^ 192) ^ (38 ^ 60)) & (((122 ^ 14) ^ (242 ^ 154)) ^ (-" ".length())) : r0;
                    }
                    return lIllIlIlIlIl[0];
                } else if (lllIIllllllIIl(tileObject2.getWorldX(), nearest.getWorldX())) {
                    ?? r02 = lIllIlIlIlIl[2];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                } else {
                    return lIllIlIlIlIl[0];
                }
            });
            if (lllIIlllllIlIl(nearest2)) {
                return lIllIlIlIlIl[0];
            }
            nearest2.interact(lIllIlIlIlII[lIllIlIlIlIl[2]]);
            return lIllIlIlIlIl[2];
        }
        return lIllIlIlIlIl[0];
    }

    private static void lllIIlllllIIll() {
        lIllIlIlIlII = new String[lIllIlIlIlIl[3]];
        lIllIlIlIlII[lIllIlIlIlIl[0]] = lllIIlllllIIII("OBcLBjRZFQAUIhwX", "yeocF");
        lIllIlIlIlII[lIllIlIlIlIl[2]] = lllIIlllllIIIl("8tEy5RtHOlQ=", "lJeke");
        lIllIlIlIlII[lIllIlIlIlIl[1]] = lllIIlllllIIIl("M31H+kjIZ88=", "QGDPb");
        lIllIlIlIlII[lIllIlIlIlIl[4]] = lllIIlllllIIlI("Wb/Rza5dOH5Bl2MNhDmBaPhjRkTeTh/C", "HCtnO");
        lIllIlIlIlII[lIllIlIlIlIl[5]] = lllIIlllllIIII("JAQuAA==", "ceZeX");
        lIllIlIlIlII[lIllIlIlIlIl[6]] = lllIIlllllIIII("FSQ6NQJpNCA1CDQ0", "DQSVi");
    }

    private static String lllIIlllllIIIl(String lllllllllllllllIlIllllIlllIIllIl, String lllllllllllllllIlIllllIlllIIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIlllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIlllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIlIlIl[1], lllllllllllllllIlIllllIlllIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIlllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIlllIIlllI) {
            lllllllllllllllIlIllllIlllIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllllIllI(int i, int i2) {
        return i >= i2;
    }
}
