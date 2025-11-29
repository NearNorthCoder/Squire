package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Collect Musca Mushroom", priority = 98, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.M  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/M.class */
public class M extends Task {
    private static /* synthetic */ String[] lIllIllIIllI;
    private final /* synthetic */ C0000a by;
    private static /* synthetic */ int[] lIllIllIlIIl;
    private final /* synthetic */ SquireDukeSucellus bx;

    private static boolean lllIlIIlIlIIIl(int i) {
        return i != 0;
    }

    private static void lllIlIIlIlIIII() {
        lIllIllIlIIl = new int[7];
        lIllIllIlIIl[0] = (15 ^ 43) & ((31 ^ 59) ^ (-1));
        lIllIllIlIIl[1] = " ".length();
        lIllIllIlIIl[2] = (101 ^ 37) ^ (41 ^ 101);
        lIllIllIlIIl[3] = "  ".length();
        lIllIllIlIIl[4] = "   ".length();
        lIllIllIlIIl[5] = 180 ^ 176;
        lIllIllIlIIl[6] = (140 ^ 129) ^ (95 ^ 87);
    }

    private static boolean lllIlIIlIlIIll(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIlIlIlll(int i, int i2) {
        return i < i2;
    }

    static {
        lllIlIIlIlIIII();
        lllIlIIlIIllIl();
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
        if (lllIlIIlIlIIIl(this.by.w())) {
            return lIllIllIlIIl[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIIlIlIIIl(tileObject.getName().equals(lIllIllIIllI[lIllIllIlIIl[4]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIllIlIIl[1]];
                strArr[lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[5]];
                if (lllIlIIlIlIIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIllIlIIl[1];
                    "".length();
                    return ((68 ^ 29) & ((227 ^ 186) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIllIlIIl[0];
        });
        if (lllIlIIlIlIIll(nearest)) {
            return lIllIllIlIIl[0];
        }
        Player local = Players.getLocal();
        if (!lllIlIIlIlIIll(local) && !lllIlIIlIlIlII(C0007h.t(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIllIllIlIIl[1]];
            strArr[lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[0]];
            Item first = Inventory.getFirst(strArr);
            if (lllIlIIlIlIlIl(first) && lllIlIIlIlIllI(first.getQuantity(), lIllIllIlIIl[2])) {
                return lIllIllIlIIl[0];
            }
            String[] strArr2 = new String[lIllIllIlIIl[1]];
            strArr2[lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[1]];
            TileObject nearest2 = TileObjects.getNearest(strArr2);
            if (lllIlIIlIlIIll(nearest2)) {
                return lIllIllIlIIl[0];
            }
            nearest2.interact(lIllIllIIllI[lIllIllIlIIl[3]]);
            return lIllIllIlIIl[1];
        }
        return lIllIllIlIIl[0];
    }

    private static boolean lllIlIIlIlIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIIlIlIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIlIIlIlIlII(int i) {
        return i == 0;
    }

    private static String lllIlIIlIIIlll(String lllllllllllllllIlIlllIllIIlIIlII, String lllllllllllllllIlIlllIllIIIllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIllIIlIIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIllIIIllllI.toCharArray();
        int lllllllllllllllIlIlllIllIIlIIIII = lIllIllIlIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIllIlIIl[0];
        while (lllIlIIlIlIlll(i, length)) {
            char lllllllllllllllIlIlllIllIIlIIlIl = charArray2[i];
            lllllllllllllllIlIlllIllIIlIIIlI.append((char) (lllllllllllllllIlIlllIllIIlIIlIl ^ charArray[lllllllllllllllIlIlllIllIIlIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIllIIlIIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIllIIlIIIlI);
    }

    private static void lllIlIIlIIllIl() {
        lIllIllIIllI = new String[lIllIllIlIIl[6]];
        lIllIllIIllI[lIllIllIlIIl[0]] = lllIlIIlIIIllI("jKeAVP0IFMQsB8Hf4GBxTg==", "fQGkP");
        lIllIllIIllI[lIllIllIlIIl[1]] = lllIlIIlIIIlll("FB8nICV5ByEwLCsFOy43", "YjTCD");
        lIllIllIIllI[lIllIllIlIIl[3]] = lllIlIIlIIIlll("JAUtOw==", "tlNPw");
        lIllIllIIllI[lIllIllIlIIl[4]] = lllIlIIlIIIlll("CwwlHQ==", "LmQxZ");
        lIllIllIIllI[lIllIllIlIIl[5]] = lllIlIIlIIIllI("OuSXVoRvrtIE5Wj2MTO7gw==", "AMIvi");
    }

    private static String lllIlIIlIIIllI(String lllllllllllllllIlIlllIllIIIIllll, String lllllllllllllllIlIlllIllIIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIllIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIlIIl[3], lllllllllllllllIlIlllIllIIIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIllIIIlIIII) {
            lllllllllllllllIlIlllIllIIIlIIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public M(SquireDukeSucellus squireDukeSucellus) {
        this.bx = squireDukeSucellus;
        this.by = squireDukeSucellus.s();
    }
}
