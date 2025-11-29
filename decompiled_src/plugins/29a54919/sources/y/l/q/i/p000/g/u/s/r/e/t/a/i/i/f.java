package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.query.entities.TileItemQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
@TaskDesc(name = "Looting marks", priority = 1000, blocking = true)
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.f  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/f.class */
public class f extends Task {
    private final /* synthetic */ AgilityConfig u;
    private static /* synthetic */ int[] lIlIlllllll;
    private static /* synthetic */ String[] lIlIllllllI;

    private static boolean lIIlIlIIlIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIlIIlIIIlI(int i) {
        return i != 0;
    }

    static {
        lIIlIlIIlIIIII();
        lIIlIlIIIlllll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    public boolean run() {
        int i;
        Player local = Players.getLocal();
        if (!lIIlIlIIlIIIIl(local) || lIIlIlIIlIIIlI(local.isAnimating() ? 1 : 0)) {
            return lIlIlllllll[0];
        }
        int[] iArr = new int[lIlIlllllll[1]];
        iArr[lIlIlllllll[0]] = lIlIlllllll[2];
        if (lIIlIlIIlIIIIl(Inventory.getFirst(iArr))) {
            i = lIlIlllllll[1];
            "".length();
            if ("  ".length() >= (87 ^ 83)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIlIlllllll[0];
        }
        int i2 = i;
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIlIlllllll[1]];
            strArr[lIlIlllllll[0]] = lIlIllllllI[lIlIlllllll[5]];
            return item.hasAction(strArr);
        });
        if (lIIlIlIIlIIIlI(Inventory.isFull() ? 1 : 0) && lIIlIlIIlIIIll(i2) && lIIlIlIIlIIlII(first)) {
            return lIlIlllllll[0];
        }
        TileItem c = c(local.getPlane());
        if (lIIlIlIIlIIlII(c)) {
            return lIlIlllllll[0];
        }
        if (lIIlIlIIlIIIlI(local.isMoving() ? 1 : 0)) {
            return lIlIlllllll[1];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (lIIlIlIIlIIIlI(tileItem.getWorldLocation().equals(c.getWorldLocation()) ? 1 : 0) && lIIlIlIIlIIIlI(tileItem.getName().equals(lIlIllllllI[lIlIlllllll[4]]) ? 1 : 0)) {
                ?? r0 = lIlIlllllll[1];
                "".length();
                return "  ".length() <= ((158 ^ 148) & ((105 ^ 99) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlllllll[0];
        });
        if (lIIlIlIIlIIIIl(nearest)) {
            nearest.interact(lIlIllllllI[lIlIlllllll[0]]);
            return lIlIlllllll[1];
        } else if (lIIlIlIIlIIIll(v() ? 1 : 0)) {
            c.interact(lIlIllllllI[lIlIlllllll[1]]);
            return lIlIlllllll[1];
        } else if (lIIlIlIIlIIlIl(c.getQuantity(), this.u.markLootAmount())) {
            c.interact(lIlIllllllI[lIlIlllllll[3]]);
            return lIlIlllllll[1];
        } else {
            return lIlIlllllll[0];
        }
    }

    private TileItem c(int i) {
        return ((SceneEntityQueryResults) ((TileItemQuery) ((TileItemQuery) ((TileItemQuery) TileItems.query().filter(tileItem -> {
            if (lIIlIlIIlIlIII(tileItem.getPlane(), i)) {
                ?? r0 = lIlIlllllll[1];
                "".length();
                return ((102 ^ 65) ^ (133 ^ 166)) == " ".length() ? ((((99 + 91) - 67) + 84) ^ (((126 + 103) - 178) + 102)) & (((17 ^ 7) ^ (117 ^ 53)) ^ (-" ".length())) : r0;
            }
            return lIlIlllllll[0];
        })).filter(tileItem2 -> {
            if (lIIlIlIIlIlIII(tileItem2.getId(), lIlIlllllll[2])) {
                ?? r0 = lIlIlllllll[1];
                "".length();
                return (((127 ^ 56) ^ (166 ^ 188)) & (((135 ^ 183) ^ (197 ^ 168)) ^ (-" ".length()))) != 0 ? ((((148 + 47) - 141) + 192) ^ (((181 + 128) - 173) + 56)) & (((((130 + 130) - 119) + 0) ^ (((25 + 85) - 55) + 132)) ^ (-" ".length())) : r0;
            }
            return lIlIlllllll[0];
        })).filter((v0) -> {
            return Reachable.isInteractable(v0);
        })).results()).nearest();
    }

    private static boolean lIIlIlIIlIIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlIIlIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    public f(AgilityConfig agilityConfig) {
        this.u = agilityConfig;
    }

    private static void lIIlIlIIIlllll() {
        lIlIllllllI = new String[lIlIlllllll[6]];
        lIlIllllllI[lIlIlllllll[0]] = lIIlIlIIIlllIl("HwkyKw==", "KhYNC");
        lIlIllllllI[lIlIlllllll[1]] = lIIlIlIIIlllIl("PDsBDQ==", "hZjhh");
        lIlIllllllI[lIlIlllllll[3]] = lIIlIlIIIllllI("6CWyBUkxhIo=", "DHEHc");
        lIlIllllllI[lIlIlllllll[4]] = lIIlIlIIIllllI("VjIKArqZplE=", "YKXmR");
        lIlIllllllI[lIlIlllllll[5]] = lIIlIlIIIlllIl("BAsT", "AjgEq");
    }

    private static boolean lIIlIlIIlIIIll(int i) {
        return i == 0;
    }

    private static String lIIlIlIIIlllIl(String llllllllllllllllIlIlIllIIIlllIll, String llllllllllllllllIlIlIllIIIlllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIllIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIllIIIlllIIl = new StringBuilder();
        char[] llllllllllllllllIlIlIllIIIlllIII = llllllllllllllllIlIlIllIIIlllIlI.toCharArray();
        int llllllllllllllllIlIlIllIIIllIlll = lIlIlllllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllllll[0];
        while (lIIlIlIIlIlIIl(i, length)) {
            char llllllllllllllllIlIlIllIIIllllII = charArray[i];
            llllllllllllllllIlIlIllIIIlllIIl.append((char) (llllllllllllllllIlIlIllIIIllllII ^ llllllllllllllllIlIlIllIIIlllIII[llllllllllllllllIlIlIllIIIllIlll % llllllllllllllllIlIlIllIIIlllIII.length]));
            "".length();
            llllllllllllllllIlIlIllIIIllIlll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIllIIIlllIIl);
    }

    private static void lIIlIlIIlIIIII() {
        lIlIlllllll = new int[8];
        lIlIlllllll[0] = (46 ^ 25) & ((114 ^ 69) ^ (-1));
        lIlIlllllll[1] = " ".length();
        lIlIlllllll[2] = (-((-2345) & 18735)) & (-161) & 28399;
        lIlIlllllll[3] = "  ".length();
        lIlIlllllll[4] = "   ".length();
        lIlIlllllll[5] = (((35 + 74) - (-26)) + 9) ^ (((123 + 38) - 58) + 45);
        lIlIlllllll[6] = 190 ^ 187;
        lIlIlllllll[7] = 183 ^ 191;
    }

    private static boolean lIIlIlIIlIlIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    private boolean v() {
        b course;
        if (lIIlIlIIlIIIlI(this.u.progressive() ? 1 : 0)) {
            course = b.j();
            "".length();
            if ((162 ^ 166) <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            course = this.u.course();
        }
        b bVar = course;
        if (!lIIlIlIIlIIllI(bVar, b.ARDOUGNE) || lIIlIlIIlIIlll(bVar, b.POLLNIVNEACH)) {
            ?? r0 = lIlIlllllll[1];
            "".length();
            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllllll[0];
    }

    private static boolean lIIlIlIIlIIlII(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIIIllllI(String llllllllllllllllIlIlIllIIIlIIllI, String llllllllllllllllIlIlIllIIIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlllllll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIllIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIllIIIlIIlll) {
            llllllllllllllllIlIlIllIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIIIIl(Object obj) {
        return obj != null;
    }
}
