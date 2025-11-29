package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Handling rope swing")
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.y  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/y.class */
public class y extends x {
    private final /* synthetic */ List<TileObject> aj;
    private static /* synthetic */ String[] lIIllIIllIlll;
    private static /* synthetic */ int[] lIIllIIlllIll;

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected y(TempleTrekkingPlugin templeTrekkingPlugin) {
        super(templeTrekkingPlugin, r2);
        int[] iArr = new int[lIIllIIlllIll[0]];
        iArr[lIIllIIlllIll[1]] = lIIllIIlllIll[2];
        this.aj = new ArrayDeque();
    }

    private static boolean lIllIIIIIIlIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIIIIlIllI(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIllllllllllI(String llllllllllllllIllllIIIIIIllIIlIl, String llllllllllllllIllllIIIIIIllIIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIIIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIIIllIIlll.init(lIIllIIlllIll[3], llllllllllllllIllllIIIIIIllIlIII);
            return new String(llllllllllllllIllllIIIIIIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIIllIIllI) {
            llllllllllllllIllllIIIIIIllIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIIlIIIl() {
        lIIllIIlllIll = new int[18];
        lIIllIIlllIll[0] = " ".length();
        lIIllIIlllIll[1] = (154 ^ 159) & ((74 ^ 79) ^ (-1));
        lIIllIIlllIll[2] = 105 ^ 96;
        lIIllIIlllIll[3] = "  ".length();
        lIIllIIlllIll[4] = (((60 + 121) - 59) + 11) ^ (((76 + 87) - 131) + 96);
        lIIllIIlllIll[5] = "   ".length();
        lIIllIIlllIll[6] = (190 ^ 144) ^ (153 ^ 191);
        lIIllIIlllIll[7] = 111 ^ 107;
        lIIllIIlllIll[8] = 8 ^ 14;
        lIIllIIlllIll[9] = (((112 + 43) - 75) + 83) ^ (((119 + 148) - 221) + 118);
        lIIllIIlllIll[10] = 66 ^ 72;
        lIIllIIlllIll[11] = 170 ^ 161;
        lIIllIIlllIll[12] = (8 ^ 125) ^ (208 ^ 169);
        lIIllIIlllIll[13] = (94 ^ 55) ^ (239 ^ 139);
        lIIllIIlllIll[14] = 72 ^ 70;
        lIIllIIlllIll[15] = 131 ^ 140;
        lIIllIIlllIll[16] = (227 ^ 157) ^ (241 ^ 159);
        lIIllIIlllIll[17] = (((28 + 101) - 80) + 137) ^ (((58 + 170) - 177) + 120);
    }

    private static boolean lIllIIIIIIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIIIIlIlII(int i) {
        return i == 0;
    }

    private static void lIllIIIIIIIIlII() {
        lIIllIIllIlll = new String[lIIllIIlllIll[17]];
        lIIllIIllIlll[lIIllIIlllIll[1]] = lIlIllllllllllI("O4nWbjOH6i0pb9wwkHM3r+uj0WXYpdtB/rNnh/ornW9ZzWiq+mBp7Ig20qgaYJZ7MPPPgFKjTuDt1NgTdamOoA==", "mkAKm");
        lIIllIIllIlll[lIIllIIlllIll[0]] = lIllIIIIIIIIIII("EVseV7uCLA990206Z/60Qom8hq5D3Yuo4chBeSIKA8wtwGb5lj+223oTlOMR/vZgrzXoovFv1moT8qlu5zpNA8r+5CrZxzedTkG1PWV2xoDw1hvLUDx6IaZ97az+QgPMn1hRuRnWxthvlHy8VQ/nWw==", "bJcIs");
        lIIllIIllIlll[lIIllIIlllIll[3]] = lIlIllllllllllI("yd+etTZMEsOHzzOH/ajiPnjIXUn775zE+ql62VHRyNnuMReWLom5XmNq98P5A5Cc", "hFzVH");
        lIIllIIllIlll[lIIllIIlllIll[5]] = lIllIIIIIIIIIlI("GgUKBT43HwFcIysPDw==", "YjdqW");
        lIIllIIllIlll[lIIllIIlllIll[7]] = lIllIIIIIIIIIII("0Jc5BWqt7PvznmnPbvvXEA==", "SNRQD");
        lIIllIIllIlll[lIIllIIlllIll[4]] = lIlIllllllllllI("6uTxhXP/8dB91ASFBf5Waw==", "yhjtS");
        lIIllIIllIlll[lIIllIIlllIll[8]] = lIllIIIIIIIIIlI("LhgaC08UHhoJ", "bwtlo");
        lIIllIIllIlll[lIIllIIlllIll[9]] = lIllIIIIIIIIIII("Bqyyhp/j92C0RRcJLV1rBg==", "BwCgU");
        lIIllIIllIlll[lIIllIIlllIll[6]] = lIllIIIIIIIIIlI("Iy8HJyFQLBQvNFA6FCs/EzA=", "pXfJQ");
        lIIllIIllIlll[lIIllIIlllIll[2]] = lIllIIIIIIIIIlI("BwEFOCV0HwMkNA==", "TijJQ");
        lIIllIIllIlll[lIIllIIlllIll[10]] = lIlIllllllllllI("xhCXfakA42TjMTcfurhwVA==", "bZUaH");
        lIIllIIllIlll[lIIllIIlllIll[11]] = lIlIllllllllllI("xgWK+mPZGwx40mk4+Kf3Jw==", "DfYTc");
        lIIllIIllIlll[lIIllIIlllIll[12]] = lIllIIIIIIIIIII("CgTisyaWoRbaxgNgPZtvuQ==", "JdzUL");
        lIIllIIllIlll[lIIllIIlllIll[13]] = lIllIIIIIIIIIlI("BjsNZQcsIBw=", "ENyHq");
        lIIllIIllIlll[lIIllIIlllIll[14]] = lIllIIIIIIIIIlI("ETANPhxiMx42CWIlHjICIS8=", "BGlSl");
        lIIllIIllIlll[lIIllIIlllIll[15]] = lIlIllllllllllI("xpAbTqAslQdnfF7RvVaJ1w==", "CrvII");
        lIIllIIllIlll[lIIllIIlllIll[16]] = lIllIIIIIIIIIlI("FiAZOgE7OhJjHCcqHA==", "UOwNh");
    }

    private static String lIllIIIIIIIIIlI(String llllllllllllllIllllIIIIIIlIIlIII, String llllllllllllllIllllIIIIIIlIIIlll) {
        String llllllllllllllIllllIIIIIIlIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIIIlIIIllI = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIIIIlIIIlll.toCharArray();
        int llllllllllllllIllllIIIIIIlIIIlII = lIIllIIlllIll[1];
        char[] charArray2 = llllllllllllllIllllIIIIIIlIIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIlllIll[1];
        while (lIllIIIIIIllIIl(i, length)) {
            char llllllllllllllIllllIIIIIIlIIlIIl = charArray2[i];
            llllllllllllllIllllIIIIIIlIIIllI.append((char) (llllllllllllllIllllIIIIIIlIIlIIl ^ charArray[llllllllllllllIllllIIIIIIlIIIlII % charArray.length]));
            "".length();
            llllllllllllllIllllIIIIIIlIIIlII++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIIIIIlIIIllI);
    }

    private static boolean lIllIIIIIIllIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    @Override // e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.x
    public boolean z() {
        if (lIllIIIIIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
            String text = Dialog.getText();
            if (lIllIIIIIIlIIll(text.length()) && (!lIllIIIIIIlIlII(text.contains(lIIllIIllIlll[lIIllIIlllIll[1]]) ? 1 : 0) || !lIllIIIIIIlIlII(text.contains(lIIllIIllIlll[lIIllIIlllIll[0]]) ? 1 : 0) || lIllIIIIIIlIIlI(text.contains(lIIllIIllIlll[lIIllIIlllIll[3]]) ? 1 : 0))) {
                return lIIllIIlllIll[1];
            }
        }
        Player local = Players.getLocal();
        TileObject A = A();
        if (lIllIIIIIIlIlIl(A)) {
            return lIIllIIlllIll[1];
        }
        if (lIllIIIIIIlIllI(local.distanceTo(A), lIIllIIlllIll[4])) {
            this.aj.clear();
            A.interact(lIIllIIllIlll[lIIllIIlllIll[5]]);
            return lIIllIIlllIll[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[lIIllIIlllIll[0]];
            strArr[lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[16]];
            return tileObject.hasAction(strArr);
        });
        if (lIllIIIIIIlIlll(nearest) && lIllIIIIIIlIllI(nearest.distanceTo(local), lIIllIIlllIll[6])) {
            nearest.interact(lIIllIIllIlll[lIIllIIlllIll[7]]);
            return lIIllIIlllIll[0];
        }
        TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
            if (lIllIIIIIIlIIlI(tileObject2.getName().equals(lIIllIIllIlll[lIIllIIlllIll[14]]) ? 1 : 0)) {
                String[] strArr = new String[lIIllIIlllIll[0]];
                strArr[lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[15]];
                if (lIllIIIIIIlIIlI(tileObject2.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIllIIlllIll[0];
                    "".length();
                    return 0 != 0 ? ((248 ^ 179) ^ (105 ^ 23)) & (((115 ^ 93) ^ (81 ^ 74)) ^ (-" ".length())) : r0;
                }
            }
            return lIIllIIlllIll[1];
        });
        if (lIllIIIIIIlIlll(nearest2)) {
            nearest2.interact(lIIllIIllIlll[lIIllIIlllIll[4]]);
            return lIIllIIlllIll[0];
        }
        String[] strArr = new String[lIIllIIlllIll[0]];
        strArr[lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[8]];
        if (lIllIIIIIIlIIlI(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIllIIlllIll[0]];
            strArr2[lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[9]];
            Item first = Inventory.getFirst(strArr2);
            String[] strArr3 = new String[lIIllIIlllIll[0]];
            strArr3[lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[6]];
            TileObject nearest3 = TileObjects.getNearest(strArr3);
            if (lIllIIIIIIlIlll(first) && lIllIIIIIIlIlll(nearest3)) {
                first.useOn(nearest3);
                return lIIllIIlllIll[0];
            }
            return lIIllIIlllIll[1];
        }
        String[] strArr4 = new String[lIIllIIlllIll[0]];
        strArr4[lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[2]];
        if (!lIllIIIIIIllIII(Inventory.getCount(strArr4), lIIllIIlllIll[5])) {
            TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                if (lIllIIIIIIlIIlI(tileObject3.getName().equals(lIIllIIllIlll[lIIllIIlllIll[12]]) ? 1 : 0)) {
                    String[] strArr5 = new String[lIIllIIlllIll[0]];
                    strArr5[lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[13]];
                    if (lIllIIIIIIlIIlI(tileObject3.hasAction(strArr5) ? 1 : 0)) {
                        ?? r0 = lIIllIIlllIll[0];
                        "".length();
                        return (-(78 ^ 74)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIllIIlllIll[1];
            });
            if (lIllIIIIIIlIlll(nearest4)) {
                nearest4.interact(lIIllIIllIlll[lIIllIIlllIll[11]]);
                return lIIllIIlllIll[0];
            }
            return lIIllIIlllIll[1];
        }
        String[] strArr5 = new String[lIIllIIlllIll[0]];
        strArr5[lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[10]];
        List all = Inventory.getAll(strArr5);
        Item item = (Item) all.get(lIIllIIlllIll[1]);
        Item item2 = (Item) all.get(lIIllIIlllIll[0]);
        if (lIllIIIIIIlIlll(item) && lIllIIIIIIlIlll(item2)) {
            item.useOn(item2);
            return lIIllIIlllIll[0];
        }
        return lIIllIIlllIll[1];
    }

    static {
        lIllIIIIIIlIIIl();
        lIllIIIIIIIIlII();
    }

    private static boolean lIllIIIIIIlIIlI(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIIIIlIIll(int i) {
        return i > 0;
    }

    private static String lIllIIIIIIIIIII(String llllllllllllllIllllIIIIIIlIllIII, String llllllllllllllIllllIIIIIIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIIllIIlllIll[6]), "DES");
            Cipher llllllllllllllIllllIIIIIIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIIIlIllIlI.init(lIIllIIlllIll[3], secretKeySpec);
            return new String(llllllllllllllIllllIIIIIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIIlIllIIl) {
            llllllllllllllIllllIIIIIIlIllIIl.printStackTrace();
            return null;
        }
    }
}
