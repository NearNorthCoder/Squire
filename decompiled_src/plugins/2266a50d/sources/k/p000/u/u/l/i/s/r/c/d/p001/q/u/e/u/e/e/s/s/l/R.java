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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Deposit Salax Salt", priority = 79, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.R  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/R.class */
public class R extends Task {
    private static /* synthetic */ int[] lIllIlIlIlll;
    final /* synthetic */ SquireDukeSucellus bH;
    final /* synthetic */ C0000a bI;
    private static /* synthetic */ String[] lIllIlIlIllI;

    private static boolean lllIlIIIIIIlII(Object obj) {
        return obj != null;
    }

    @Inject
    public R(SquireDukeSucellus squireDukeSucellus) {
        this.bH = squireDukeSucellus;
        this.bI = squireDukeSucellus.s();
    }

    private static boolean lllIlIIIIIIIlI(Object obj) {
        return obj == null;
    }

    private static void lllIlIIIIIIIIl() {
        lIllIlIlIlll = new int[8];
        lIllIlIlIlll[0] = (61 ^ 115) & ((117 ^ 59) ^ (-1));
        lIllIlIlIlll[1] = "  ".length();
        lIllIlIlIlll[2] = " ".length();
        lIllIlIlIlll[3] = (6 ^ 59) ^ (180 ^ 143);
        lIllIlIlIlll[4] = "   ".length();
        lIllIlIlIlll[5] = 98 ^ 102;
        lIllIlIlIlll[6] = (((2 + 28) - (-75)) + 63) ^ (((124 + 69) - 77) + 57);
        lIllIlIlIlll[7] = 115 ^ 123;
    }

    private static boolean lllIlIIIIIlIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIlIIIIIIllI(int i) {
        return i != 0;
    }

    static {
        lllIlIIIIIIIIl();
        lllIlIIIIIIIII();
    }

    private static boolean lllIlIIIIIlIII(int i, int i2) {
        return i == i2;
    }

    private static String lllIIllllllllI(String lllllllllllllllIlIllllIlIllIIIlI, String lllllllllllllllIlIllllIlIlIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIlIlIlllll.getBytes(StandardCharsets.UTF_8)), lIllIlIlIlll[7]), "DES");
            Cipher lllllllllllllllIlIllllIlIllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIlIllIIlII.init(lIllIlIlIlll[1], secretKeySpec);
            return new String(lllllllllllllllIlIllllIlIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIlIllIIIll) {
            lllllllllllllllIlIllllIlIllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIIIIIlll(int i) {
        return i == 0;
    }

    private static String lllIIlllllllll(String lllllllllllllllIlIllllIlIllIllll, String lllllllllllllllIlIllllIlIllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIlIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIlIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllIlIlllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllIlIlllIIIl.init(lIllIlIlIlll[1], lllllllllllllllIlIllllIlIlllIIlI);
            return new String(lllllllllllllllIlIllllIlIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIlIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIlIlllIIII) {
            lllllllllllllllIlIllllIlIlllIIII.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIIIIIII() {
        lIllIlIlIllI = new String[lIllIlIlIlll[3]];
        lIllIlIlIllI[lIllIlIlIlll[0]] = lllIIlllllllIl("GDgZJAhrKhQpBA==", "KYuEp");
        lIllIlIlIllI[lIllIlIlIlll[2]] = lllIIlllllllIl("Fis/Bg==", "PBSjd");
        lIllIlIlIllI[lIllIlIlIlll[1]] = lllIIlllllllIl("NiIeAg==", "pKrnI");
        lIllIlIlIllI[lIllIlIlIlll[4]] = lllIIllllllllI("urrJ98pq+g/9HtdbscqJTHtejtjg3jmE", "ZnzHh");
        lIllIlIlIllI[lIllIlIlIlll[5]] = lllIIlllllllIl("FwUyAQ==", "PdFdP");
        lIllIlIlIllI[lIllIlIlIlll[6]] = lllIIlllllllll("dHOEYDCQi2kuprQob4dulg==", "SWxCd");
    }

    private static boolean lllIlIIIIIIIll(int i, int i2) {
        return i >= i2;
    }

    private static String lllIIlllllllIl(String lllllllllllllllIlIllllIlIlIlIIlI, String lllllllllllllllIlIllllIlIlIlIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllllIlIlIlIIIl.toCharArray();
        int lllllllllllllllIlIllllIlIlIIlllI = lIllIlIlIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIlIlll[0];
        while (lllIlIIIIIIlIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIllllIlIlIIlllI % charArray.length]));
            "".length();
            lllllllllllllllIlIllllIlIlIIlllI++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIlIIIIIIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    public boolean run() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIIIIIIllI(tileObject.getName().equals(lIllIlIlIllI[lIllIlIlIlll[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIlIlll[2]];
                strArr[lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[6]];
                if (lllIlIIIIIIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIlIlll[2];
                    "".length();
                    return " ".length() >= "  ".length() ? ((117 ^ 112) ^ (164 ^ 154)) & (((202 ^ 148) ^ (200 ^ 173)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIlIlIlll[0];
        });
        if (!lllIlIIIIIIIlI(nearest) && !lllIlIIIIIIIlI(Players.getLocal())) {
            int x = this.bI.x();
            if (lllIlIIIIIIIll(x, lIllIlIlIlll[1])) {
                return lIllIlIlIlll[0];
            }
            String[] strArr = new String[lIllIlIlIlll[2]];
            strArr[lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[0]];
            Item first = Inventory.getFirst(strArr);
            if (!lllIlIIIIIIlII(first) || lllIlIIIIIIlIl(first.getQuantity(), lIllIlIlIlll[3])) {
                return lIllIlIlIlll[0];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                String[] strArr2 = new String[lIllIlIlIlll[2]];
                strArr2[lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[1]];
                if (!lllIlIIIIIIllI(tileObject2.hasAction(strArr2) ? 1 : 0) || lllIlIIIIIIlll(tileObject2.getName().equals(lIllIlIlIllI[lIllIlIlIlll[4]]) ? 1 : 0)) {
                    return lIllIlIlIlll[0];
                }
                if (lllIlIIIIIlIII(x, lIllIlIlIlll[2])) {
                    if (lllIlIIIIIlIIl(tileObject2.getWorldX(), nearest.getWorldX())) {
                        ?? r0 = lIllIlIlIlll[2];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIlIlIlll[0];
                } else if (lllIlIIIIIIlIl(tileObject2.getWorldX(), nearest.getWorldX())) {
                    ?? r02 = lIllIlIlIlll[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                } else {
                    return lIllIlIlIlll[0];
                }
            });
            if (lllIlIIIIIIIlI(nearest2)) {
                return lIllIlIlIlll[0];
            }
            nearest2.interact(lIllIlIlIllI[lIllIlIlIlll[2]]);
            return lIllIlIlIlll[2];
        }
        return lIllIlIlIlll[0];
    }
}
