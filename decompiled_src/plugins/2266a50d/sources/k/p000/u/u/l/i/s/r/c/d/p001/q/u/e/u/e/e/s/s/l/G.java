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
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Start Fight", priority = 201, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.G  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/G.class */
public class G extends Task {
    final /* synthetic */ C0000a bm;
    private static /* synthetic */ String[] lIllIIllIIll;
    private static /* synthetic */ int[] lIllIIllIlII;
    final /* synthetic */ SquireDukeSucellus bl;

    private static void lllIIlIllllllI() {
        lIllIIllIlII = new int[6];
        lIllIIllIlII[0] = "  ".length();
        lIllIIllIlII[1] = (7 ^ 40) & ((150 ^ 185) ^ (-1));
        lIllIIllIlII[2] = " ".length();
        lIllIIllIlII[3] = "   ".length();
        lIllIIllIlII[4] = (((55 + 118) - 145) + 116) ^ (((68 + 73) - 37) + 44);
        lIllIIllIlII[5] = 9 ^ 1;
    }

    private static String lllIIlIlllllII(String lllllllllllllllIllIIIIIlIIIllllI, String lllllllllllllllIllIIIIIlIIIlllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIIIlIIIlllIl.toCharArray();
        int lllllllllllllllIllIIIIIlIIIllIlI = lIllIIllIlII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIllIlII[1];
        while (lllIIlIlllllll(i, length)) {
            char lllllllllllllllIllIIIIIlIIIlllll = charArray2[i];
            sb.append((char) (lllllllllllllllIllIIIIIlIIIlllll ^ charArray[lllllllllllllllIllIIIIIlIIIllIlI % charArray.length]));
            "".length();
            lllllllllllllllIllIIIIIlIIIllIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lllIIlIllllIll(String lllllllllllllllIllIIIIIlIIIIlIIl, String lllllllllllllllIllIIIIIlIIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIlIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIllIIllIlII[5]), "DES");
            Cipher lllllllllllllllIllIIIIIlIIIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIlIIIIlIll.init(lIllIIllIlII[0], lllllllllllllllIllIIIIIlIIIIllII);
            return new String(lllllllllllllllIllIIIIIlIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIlIIIIlIlI) {
            lllllllllllllllIllIIIIIlIIIIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        if (lllIIlIlllllll(this.bm.y(), lIllIIllIlII[0])) {
            return lIllIIllIlII[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIIllIIIIIlI(tileObject.getName().equals(lIllIIllIIll[lIllIIllIlII[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIIllIlII[2]];
                strArr[lIllIIllIlII[1]] = lIllIIllIIll[lIllIIllIlII[3]];
                if (lllIIllIIIIIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIllIlII[2];
                    "".length();
                    return (-"  ".length()) >= 0 ? ((((26 + 47) - 65) + 149) ^ (((113 + 10) - (-1)) + 10)) & (((((28 + 127) - 126) + 136) ^ (((123 + 68) - 76) + 75)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIIllIlII[1];
        });
        if (lllIIllIIIIIII(nearest)) {
            return lIllIIllIlII[1];
        }
        Player local = Players.getLocal();
        if (!lllIIllIIIIIII(local) && !lllIIllIIIIIIl(C0004e.l(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIllIIllIlII[2]];
            strArr[lIllIIllIlII[1]] = lIllIIllIIll[lIllIIllIlII[1]];
            Item first = Inventory.getFirst(strArr);
            if (lllIIllIIIIIII(first)) {
                return lIllIIllIlII[1];
            }
            String[] strArr2 = new String[lIllIIllIlII[2]];
            strArr2[lIllIIllIlII[1]] = lIllIIllIIll[lIllIIllIlII[2]];
            NPC nearest2 = NPCs.getNearest(strArr2);
            if (lllIIllIIIIIII(nearest2)) {
                return lIllIIllIlII[1];
            }
            first.useOn(nearest2);
            return lIllIIllIlII[2];
        }
        return lIllIIllIlII[1];
    }

    @Inject
    public G(SquireDukeSucellus squireDukeSucellus) {
        this.bl = squireDukeSucellus;
        this.bm = squireDukeSucellus.s();
    }

    private static boolean lllIIllIIIIIII(Object obj) {
        return obj == null;
    }

    static {
        lllIIlIllllllI();
        lllIIlIlllllIl();
    }

    private static boolean lllIIlIlllllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIllIIIIIlI(int i) {
        return i != 0;
    }

    private static String lllIIlIllllIlI(String lllllllllllllllIllIIIIIlIIlIlllI, String lllllllllllllllIllIIIIIlIIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIlIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIIIlIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIIIlIIllIIII.init(lIllIIllIlII[0], lllllllllllllllIllIIIIIlIIllIIIl);
            return new String(lllllllllllllllIllIIIIIlIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIlIIlIllll) {
            lllllllllllllllIllIIIIIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static void lllIIlIlllllIl() {
        lIllIIllIIll = new String[lIllIIllIlII[4]];
        lIllIIllIIll[lIllIIllIlII[1]] = lllIIlIllllIlI("3QlbIUwXAst8m67W+yiDZFvPypYuzZJs", "mfNkp");
        lIllIIllIIll[lIllIIllIlII[2]] = lllIIlIllllIll("sWkJ7EbmHA6GWJXOd1ouZg==", "ufSdj");
        lIllIIllIIll[lIllIIllIlII[0]] = lllIIlIllllIll("XyAfSP00fko=", "ptebh");
        lIllIIllIIll[lIllIIllIlII[3]] = lllIIlIlllllII("OhgCAhpGCBgCEBsI", "kmkaq");
    }

    private static boolean lllIIllIIIIIIl(int i) {
        return i == 0;
    }
}
