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
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Collect Salax Salt", priority = 80, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.Q  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/Q.class */
public class Q extends Task {
    private final /* synthetic */ C0000a bG;
    private final /* synthetic */ SquireDukeSucellus bF;
    private static /* synthetic */ int[] lIllIIlllIlI;
    private static /* synthetic */ String[] lIllIIlllIIl;

    static {
        lllIIllIIIlIIl();
        lllIIllIIIlIII();
    }

    private static String lllIIllIIIIlll(String lllllllllllllllIllIIIIIIllIIllII, String lllllllllllllllIllIIIIIIllIIlIll) {
        String lllllllllllllllIllIIIIIIllIIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIIIIIllIIlIIl = lllllllllllllllIllIIIIIIllIIlIll.toCharArray();
        int lllllllllllllllIllIIIIIIllIIlIII = lIllIIlllIlI[0];
        char[] charArray = lllllllllllllllIllIIIIIIllIIllII2.toCharArray();
        int length = charArray.length;
        int i = lIllIIlllIlI[0];
        while (lllIIllIIlIIII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIIIIIIllIIlIIl[lllllllllllllllIllIIIIIIllIIlIII % lllllllllllllllIllIIIIIIllIIlIIl.length]));
            "".length();
            lllllllllllllllIllIIIIIIllIIlIII++;
            i++;
            "".length();
            if ("  ".length() <= ((171 ^ 135) & ((73 ^ 101) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lllIIllIIIIllI(String lllllllllllllllIllIIIIIIllIlllII, String lllllllllllllllIllIIIIIIllIllIll) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIllIllIll.getBytes(StandardCharsets.UTF_8)), lIllIIlllIlI[8]), "DES");
            Cipher lllllllllllllllIllIIIIIIllIllllI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIIllIllllI.init(lIllIIlllIlI[3], lllllllllllllllIllIIIIIIllIlllll);
            return new String(lllllllllllllllIllIIIIIIllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIIllIllIII) {
            lllllllllllllllIllIIIIIIllIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIIIllIl(int i, int i2) {
        return i >= i2;
    }

    private static void lllIIllIIIlIII() {
        lIllIIlllIIl = new String[lIllIIlllIlI[7]];
        lIllIIlllIIl[lIllIIlllIlI[0]] = lllIIllIIIIllI("YrfywlJ0avDRCFgwm6E07A==", "IbuMC");
        lIllIIlllIIl[lIllIIlllIlI[1]] = lllIIllIIIIlll("MDU5JEonMSU/GQog", "cTUPj");
        lIllIIlllIIl[lIllIIlllIlI[3]] = lllIIllIIIIllI("lmrofGK4kTA=", "bnvzP");
        lIllIIlllIIl[lIllIIlllIlI[5]] = lllIIllIIIIlll("MiYnPQ==", "uGSXM");
        lIllIIlllIIl[lIllIIlllIlI[6]] = lllIIllIIIIllI("GGPxUBuGEhDxgPjYmoru+Q==", "zBtvR");
    }

    private static boolean lllIIllIIlIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIllIIIlIll(Object obj) {
        return obj == null;
    }

    @Inject
    public Q(SquireDukeSucellus squireDukeSucellus) {
        this.bF = squireDukeSucellus;
        this.bG = squireDukeSucellus.s();
    }

    private static boolean lllIIllIIIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIIllIIIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public boolean run() {
        if (lllIIllIIIlIlI(this.bG.x())) {
            return lIllIIlllIlI[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIIllIIIlIlI(tileObject.getName().equals(lIllIIlllIIl[lIllIIlllIlI[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIIlllIlI[1]];
                strArr[lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[6]];
                if (lllIIllIIIlIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIlllIlI[1];
                    "".length();
                    return (true ^ true) != (true ^ true) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                }
            }
            return lIllIIlllIlI[0];
        });
        if (lllIIllIIIlIll(nearest)) {
            return lIllIIlllIlI[0];
        }
        Player local = Players.getLocal();
        if (lllIIllIIIlIll(local)) {
            return lIllIIlllIlI[0];
        }
        String[] strArr = new String[lIllIIlllIlI[1]];
        strArr[lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[0]];
        Item first = Inventory.getFirst(strArr);
        if (lllIIllIIIllII(first) && lllIIllIIIllIl(first.getQuantity(), lIllIIlllIlI[2])) {
            return lIllIIlllIlI[0];
        }
        String[] strArr2 = new String[lIllIIlllIlI[1]];
        strArr2[lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[1]];
        TileObject nearest2 = TileObjects.getNearest(strArr2);
        if (lllIIllIIIlIll(nearest2)) {
            return lIllIIlllIlI[0];
        }
        if (lllIIllIIIlIlI(C0004e.i(nearest).contains(local) ? 1 : 0) && lllIIllIIIllII(NPCs.getNearest(npc -> {
            if (lllIIllIIIlllI(npc.getId(), C0004e.I) && lllIIllIIIllll(npc.getGraphic(), lIllIIlllIlI[4])) {
                ?? r0 = lIllIIlllIlI[1];
                "".length();
                return (-(5 ^ 1)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIlllIlI[0];
        }))) {
            return lIllIIlllIlI[1];
        }
        nearest2.interact(lIllIIlllIIl[lIllIIlllIlI[3]]);
        return lIllIIlllIlI[1];
    }

    private static boolean lllIIllIIIllII(Object obj) {
        return obj != null;
    }

    private static boolean lllIIllIIIllll(int i, int i2) {
        return i != i2;
    }

    private static void lllIIllIIIlIIl() {
        lIllIIlllIlI = new int[9];
        lIllIIlllIlI[0] = ((47 ^ 91) ^ (110 ^ 71)) & (((((127 + 173) - 248) + 203) ^ (((87 + 121) - 129) + 83)) ^ (-" ".length()));
        lIllIIlllIlI[1] = " ".length();
        lIllIIlllIlI[2] = 126 ^ 114;
        lIllIIlllIlI[3] = "  ".length();
        lIllIIlllIlI[4] = -" ".length();
        lIllIIlllIlI[5] = "   ".length();
        lIllIIlllIlI[6] = 191 ^ 187;
        lIllIIlllIlI[7] = 94 ^ 91;
        lIllIIlllIlI[8] = (((89 + 110) - 171) + 106) ^ (((70 + 67) - 30) + 35);
    }
}
