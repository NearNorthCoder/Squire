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
@TaskDesc(name = "Collect Arder Mushroom", priority = 88, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.I  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/I.class */
public class I extends Task {
    private final /* synthetic */ C0000a bq;
    private final /* synthetic */ SquireDukeSucellus bp;
    private static /* synthetic */ int[] lIllIlllllIl;
    private static /* synthetic */ String[] lIllIlllllII;

    private static String lllIlIlIIIIllI(String lllllllllllllllIlIlllIIllIIlllll, String lllllllllllllllIlIlllIIllIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIllIIllllI.getBytes(StandardCharsets.UTF_8)), lIllIlllllIl[7]), "DES");
            Cipher lllllllllllllllIlIlllIIllIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIIllIlIIIIl.init(lIllIlllllIl[3], secretKeySpec);
            return new String(lllllllllllllllIlIlllIIllIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIllIlIIIII) {
            lllllllllllllllIlIlllIIllIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lllIlIlIIIlIII(String lllllllllllllllIlIlllIIllIIIIIlI, String lllllllllllllllIlIlllIIllIIIIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlllIIlIlllllll = lllllllllllllllIlIlllIIllIIIIIIl.toCharArray();
        int lllllllllllllllIlIlllIIlIllllllI = lIllIlllllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIlllllIl[0];
        while (lllIlIlIIlIIIl(i, length)) {
            char lllllllllllllllIlIlllIIllIIIIIll = charArray[i];
            sb.append((char) (lllllllllllllllIlIlllIIllIIIIIll ^ lllllllllllllllIlIlllIIlIlllllll[lllllllllllllllIlIlllIIlIllllllI % lllllllllllllllIlIlllIIlIlllllll.length]));
            "".length();
            lllllllllllllllIlIlllIIlIllllllI++;
            i++;
            "".length();
            if ((((180 ^ 146) ^ (45 ^ 18)) & (((((182 + 45) - 86) + 43) ^ (((15 + 36) - (-98)) + 12)) ^ (-" ".length()))) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public I(SquireDukeSucellus squireDukeSucellus) {
        this.bp = squireDukeSucellus;
        this.bq = squireDukeSucellus.s();
    }

    private static boolean lllIlIlIIlIIII(int i, int i2) {
        return i >= i2;
    }

    private static void lllIlIlIIIlIlI() {
        lIllIlllllIl = new int[8];
        lIllIlllllIl[0] = (197 ^ 153) & ((195 ^ 159) ^ (-1));
        lIllIlllllIl[1] = " ".length();
        lIllIlllllIl[2] = 155 ^ 151;
        lIllIlllllIl[3] = "  ".length();
        lIllIlllllIl[4] = "   ".length();
        lIllIlllllIl[5] = 80 ^ 84;
        lIllIlllllIl[6] = 136 ^ 141;
        lIllIlllllIl[7] = (35 ^ 74) ^ (200 ^ 169);
    }

    static {
        lllIlIlIIIlIlI();
        lllIlIlIIIlIIl();
    }

    private static boolean lllIlIlIIIllll(Object obj) {
        return obj != null;
    }

    private static void lllIlIlIIIlIIl() {
        lIllIlllllII = new String[lIllIlllllIl[6]];
        lIllIlllllII[lIllIlllllIl[0]] = lllIlIlIIIIllI("awPf27T+i8Z2AhxE7dHYMw==", "XPWCG");
        lIllIlllllII[lIllIlllllIl[1]] = lllIlIlIIIIlll("a5biJ1witI9eSU3JZ5ml0Q==", "EcBzH");
        lIllIlllllII[lIllIlllllIl[3]] = lllIlIlIIIlIII("IiESAw==", "rHqhw");
        lIllIlllllII[lIllIlllllIl[4]] = lllIlIlIIIlIII("FBcBHA==", "Svuyj");
        lIllIlllllII[lIllIlllllIl[5]] = lllIlIlIIIIllI("gdxsDYLYUGbxnk0JiEMI/g==", "gWPqA");
    }

    private static boolean lllIlIlIIIlIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        if (lllIlIlIIIlIll(this.bq.v())) {
            return lIllIlllllIl[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIlIIIlIll(tileObject.getName().equals(lIllIlllllII[lIllIlllllIl[4]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlllllIl[1]];
                strArr[lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[5]];
                if (lllIlIlIIIlIll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlllllIl[1];
                    "".length();
                    return (-((((132 + 71) - 26) + 22) ^ (((127 + 103) - 121) + 86))) > 0 ? ((((100 + 200) - 84) + 4) ^ (((2 + 118) - 23) + 92)) & (((((87 + 141) - 179) + 152) ^ (((132 + 127) - 220) + 129)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIlllllIl[0];
        });
        if (lllIlIlIIIllII(nearest)) {
            return lIllIlllllIl[0];
        }
        Player local = Players.getLocal();
        if (!lllIlIlIIIllII(local) && !lllIlIlIIIlllI(C0001b.b(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIllIlllllIl[1]];
            strArr[lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[0]];
            Item first = Inventory.getFirst(strArr);
            if (lllIlIlIIIllll(first) && lllIlIlIIlIIII(first.getQuantity(), lIllIlllllIl[2])) {
                return lIllIlllllIl[0];
            }
            String[] strArr2 = new String[lIllIlllllIl[1]];
            strArr2[lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[1]];
            TileObject nearest2 = TileObjects.getNearest(strArr2);
            if (lllIlIlIIIllII(nearest2)) {
                return lIllIlllllIl[0];
            }
            nearest2.interact(lIllIlllllII[lIllIlllllIl[3]]);
            return lIllIlllllIl[1];
        }
        return lIllIlllllIl[0];
    }

    private static boolean lllIlIlIIIllII(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIlIIIlllI(int i) {
        return i == 0;
    }

    private static String lllIlIlIIIIlll(String lllllllllllllllIlIlllIIllIIlIIlI, String lllllllllllllllIlIlllIIllIIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIllIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlllllIl[3], lllllllllllllllIlIlllIIllIIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIllIIlIIll) {
            lllllllllllllllIlIlllIIllIIlIIll.printStackTrace();
            return null;
        }
    }
}
