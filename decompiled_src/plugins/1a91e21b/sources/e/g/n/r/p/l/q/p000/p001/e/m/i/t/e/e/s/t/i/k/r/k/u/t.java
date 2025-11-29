package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Handling bog")
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.t  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/t.class */
public class t extends x {
    private static /* synthetic */ int[] lIIllIIlllIlI;
    private static /* synthetic */ String[] lIIllIIlllIIl;
    private /* synthetic */ List<TileObject> ad;

    private static String lIllIIIIIIIIIIl(String llllllllllllllIllllIIIIIlIllIIIl, String llllllllllllllIllllIIIIIlIllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIlIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIlllIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIlIllIIlI) {
            llllllllllllllIllllIIIIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIIIIlIl() {
        lIIllIIlllIlI = new int[14];
        lIIllIIlllIlI[0] = " ".length();
        lIIllIIlllIlI[1] = (141 ^ 184) & ((42 ^ 31) ^ (-1));
        lIIllIIlllIlI[2] = (30 ^ 1) ^ (111 ^ 119);
        lIIllIIlllIlI[3] = "  ".length();
        lIIllIIlllIlI[4] = 154 ^ 159;
        lIIllIIlllIlI[5] = "   ".length();
        lIIllIIlllIlI[6] = 161 ^ 165;
        lIIllIIlllIlI[7] = (((98 + 76) - 40) + 1) ^ (((101 + 109) - 134) + 105);
        lIIllIIlllIlI[8] = (130 ^ 159) ^ (136 ^ 159);
        lIIllIIlllIlI[9] = (-18593) & 32430;
        lIIllIIlllIlI[10] = 114 ^ 116;
        lIIllIIlllIlI[11] = (133 ^ 131) ^ (5 ^ 10);
        lIIllIIlllIlI[12] = 118 ^ 94;
        lIIllIIlllIlI[13] = (67 ^ 80) ^ (97 ^ 122);
    }

    private static void lIllIIIIIIIIIll() {
        lIIllIIlllIIl = new String[lIIllIIlllIlI[13]];
        lIIllIIlllIIl[lIIllIIlllIlI[1]] = lIlIlllllllllll("qsznc4/Y8weoNKtt+4qHpY1H8Xf9NeJgdHwi7wqkGN5NPImmgQsScnvBdURSxM1A9Apz76At18rx5/pktWr/6w==", "bazPi");
        lIIllIIlllIIl[lIIllIIlllIlI[0]] = lIlIlllllllllll("/4GgymguIcK3i/nvLF7mYS9pRswHLB7RAD9eL93+94T3IVEgn1nP/jB9Wp+bRZU7c6UMu5el6VQAYeXpmWG9h8tFelgSkPOiV2AfGEnH+25mleY0z79YGRVsoxabv5a7a9uOQCgeMT3HBO7IPHJ4vw==", "AilEX");
        lIIllIIlllIIl[lIIllIIlllIlI[3]] = lIlIlllllllllll("8YdXu8hOz7He08zCxv12t9EHvlRYARz/lhqBXhnmkhMHh7Dcw6/DYIeU+RQC0tA9", "pzwQF");
        lIIllIIlllIIl[lIIllIIlllIlI[5]] = lIllIIIIIIIIIIl("QitVgSePBh9EVTA+Kcd+jQ==", "HZuOL");
        lIIllIIlllIIl[lIIllIIlllIlI[6]] = lIllIIIIIIIIIIl("TF2J4Zrn26JxyFsTQhjnnw==", "hRURq");
        lIIllIIlllIIl[lIIllIIlllIlI[4]] = lIlIlllllllllll("ex7IP3CX6xUvhDNbvzSGj9JRBwuUcCOV", "dTNnN");
        lIIllIIlllIIl[lIIllIIlllIlI[10]] = lIlIlllllllllll("zshM7oNlq6c=", "qVvVu");
        lIIllIIlllIIl[lIIllIIlllIlI[2]] = lIllIIIIIIIIIIl("Y1pAmrzG3SL4xOh+SKH/+A==", "PalsD");
    }

    private static boolean lIllIIIIIIIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIIIIIIllI(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIIIlIIII(int i) {
        return i >= 0;
    }

    public int[][] a(List<TileObject> list) {
        int[][] iArr = new int[lIIllIIlllIlI[8]][lIIllIIlllIlI[8]];
        int i = lIIllIIlllIlI[1];
        while (lIllIIIIIIIlllI(i, list.size())) {
            TileObject tileObject = list.get(i);
            if (lIllIIIIIIIlIll(tileObject) && lIllIIIIIIIllll(tileObject.getId(), lIIllIIlllIlI[9])) {
                iArr[(i / lIIllIIlllIlI[8]) + lIIllIIlllIlI[0]][i % lIIllIIlllIlI[8]] = lIIllIIlllIlI[0];
            }
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        int i2 = lIIllIIlllIlI[1];
        while (lIllIIIIIIIlllI(i2, iArr[lIIllIIlllIlI[1]].length)) {
            iArr[lIIllIIlllIlI[1]][i2] = lIIllIIlllIlI[0];
            iArr[lIIllIIlllIlI[10]][i2] = lIIllIIlllIlI[0];
            i2++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        int i3 = lIIllIIlllIlI[1];
        while (lIllIIIIIIIlllI(i3, lIIllIIlllIlI[5])) {
            iArr[lIIllIIlllIlI[2] + i3][lIIllIIlllIlI[11]] = lIIllIIlllIlI[0];
            i3++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return iArr;
    }

    private static boolean lIllIIIIIIIllIl(int i, int i2) {
        return i > i2;
    }

    public TileObject b(List<TileObject> list) {
        int i = lIIllIIlllIlI[1];
        while (lIllIIIIIIIlllI(i, list.size())) {
            TileObject tileObject = list.get(i);
            if (lIllIIIIIIIlIll(tileObject) && lIllIIIIIIIIllI(tileObject.getWorldLocation().equals(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIIIIIlllI(i + lIIllIIlllIlI[0], list.size())) {
                return list.get(i + lIIllIIlllIlI[0]);
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return list.get(lIIllIIlllIlI[1]);
    }

    private static boolean lIllIIIIIIIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIIIIIIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    @Override // e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.x
    public boolean z() {
        if (lIllIIIIIIIIllI(Dialog.isOpen() ? 1 : 0)) {
            String text = Dialog.getText();
            if (lIllIIIIIIIIlll(text.length()) && (!lIllIIIIIIIlIII(text.contains(lIIllIIlllIIl[lIIllIIlllIlI[1]]) ? 1 : 0) || !lIllIIIIIIIlIII(text.contains(lIIllIIlllIIl[lIIllIIlllIlI[0]]) ? 1 : 0) || lIllIIIIIIIIllI(text.contains(lIIllIIlllIIl[lIIllIIlllIlI[3]]) ? 1 : 0))) {
                return lIIllIIlllIlI[1];
            }
        }
        Player local = Players.getLocal();
        if (lIllIIIIIIIlIIl(local)) {
            return lIIllIIlllIlI[1];
        }
        TileObject A = A();
        if (lIllIIIIIIIlIIl(A)) {
            return lIIllIIlllIlI[1];
        }
        if (lIllIIIIIIIlIlI(local.distanceTo(A), lIIllIIlllIlI[4])) {
            this.ad.clear();
            A.interact(lIIllIIlllIIl[lIIllIIlllIlI[5]]);
            return lIIllIIlllIlI[0];
        }
        if (lIllIIIIIIIlIII(this.ad.isEmpty() ? 1 : 0)) {
            TileObject b = b(this.ad);
            if (lIllIIIIIIIlIll(b)) {
                b.interact(lIIllIIlllIIl[lIIllIIlllIlI[6]]);
                return lIIllIIlllIlI[0];
            }
        }
        if (lIllIIIIIIIIllI(this.ad.isEmpty() ? 1 : 0)) {
            List<TileObject> all = TileObjects.getAll(tileObject -> {
                if (lIllIIIIIIIIllI(tileObject.getName().equals(lIIllIIlllIIl[lIIllIIlllIlI[10]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIllIIlllIlI[0]];
                    strArr[lIIllIIlllIlI[1]] = lIIllIIlllIIl[lIIllIIlllIlI[2]];
                    if (lIllIIIIIIIIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIIllIIlllIlI[0];
                        "".length();
                        return ((83 ^ 33) ^ (245 ^ 131)) <= 0 ? ((42 ^ 70) ^ (78 ^ 18)) & (((((84 + 7) - 37) + 73) ^ (31 ^ 80)) ^ (-" ".length())) : r0;
                    }
                }
                return lIIllIIlllIlI[1];
            });
            all.sort(new u(this));
            if (lIllIIIIIIIllII(all.size(), lIIllIIlllIlI[7])) {
                this.ad = a(a.b(a(all)), all);
                if (lIllIIIIIIIllIl(A.getWorldY(), Players.getLocal().getWorldY())) {
                    Collections.reverse(this.ad);
                }
            }
        }
        return lIIllIIlllIlI[1];
    }

    public List<TileObject> a(int[][] iArr, List<TileObject> list) {
        ArrayList arrayList = new ArrayList();
        int llllllllllllllIllllIIIIIllIIIIll = lIIllIIlllIlI[1];
        int i = lIIllIIlllIlI[1];
        do {
            if (lIllIIIIIIIlllI(i, iArr[lIIllIIlllIlI[1]].length)) {
                if (lIllIIIIIIIllll(iArr[lIIllIIlllIlI[1]][i], lIIllIIlllIlI[0])) {
                    llllllllllllllIllllIIIIIllIIIIll = i;
                    arrayList.add(Integer.valueOf(llllllllllllllIllllIIIIIllIIIIll));
                    "".length();
                    "".length();
                    if ("   ".length() < (((53 ^ 80) ^ (118 ^ 23)) & (((90 ^ 95) ^ " ".length()) ^ (-" ".length())))) {
                        return null;
                    }
                } else {
                    i++;
                    "".length();
                }
            }
            while (lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIll, lIIllIIlllIlI[12])) {
                int i2 = llllllllllllllIllllIIIIIllIIIIll / lIIllIIlllIlI[8];
                int i3 = llllllllllllllIllllIIIIIllIIIIll % lIIllIIlllIlI[8];
                if (lIllIIIIIIIlllI(i2 + lIIllIIlllIlI[0], lIIllIIlllIlI[4]) && lIllIIIIIIIllll(iArr[i2 + lIIllIIlllIlI[0]][i3], lIIllIIlllIlI[0]) && lIllIIIIIIIlIII(arrayList.contains(Integer.valueOf(((i2 + lIIllIIlllIlI[0]) * lIIllIIlllIlI[8]) + i3)) ? 1 : 0)) {
                    llllllllllllllIllllIIIIIllIIIIll = ((i2 + lIIllIIlllIlI[0]) * lIIllIIlllIlI[8]) + i3;
                    arrayList.add(Integer.valueOf(llllllllllllllIllllIIIIIllIIIIll));
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else if (lIllIIIIIIlIIII(i2 - lIIllIIlllIlI[0]) && lIllIIIIIIIllll(iArr[i2 - lIIllIIlllIlI[0]][i3], lIIllIIlllIlI[0]) && lIllIIIIIIIlIII(arrayList.contains(Integer.valueOf(((i2 - lIIllIIlllIlI[0]) * lIIllIIlllIlI[8]) + i3)) ? 1 : 0)) {
                    llllllllllllllIllllIIIIIllIIIIll = ((i2 - lIIllIIlllIlI[0]) * lIIllIIlllIlI[8]) + i3;
                    arrayList.add(Integer.valueOf(llllllllllllllIllllIIIIIllIIIIll));
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else if (lIllIIIIIIlIIII(i3 - lIIllIIlllIlI[0]) && lIllIIIIIIIllll(iArr[i2][i3 - lIIllIIlllIlI[0]], lIIllIIlllIlI[0]) && lIllIIIIIIIlIII(arrayList.contains(Integer.valueOf(((i2 * lIIllIIlllIlI[8]) + i3) - lIIllIIlllIlI[0])) ? 1 : 0)) {
                    llllllllllllllIllllIIIIIllIIIIll = ((i2 * lIIllIIlllIlI[8]) + i3) - lIIllIIlllIlI[0];
                    arrayList.add(Integer.valueOf(llllllllllllllIllllIIIIIllIIIIll));
                    "".length();
                    "".length();
                    if ("  ".length() <= 0) {
                        return null;
                    }
                } else if (lIllIIIIIIIlllI(i3 + lIIllIIlllIlI[0], lIIllIIlllIlI[8]) && lIllIIIIIIIllll(iArr[i2][i3 + lIIllIIlllIlI[0]], lIIllIIlllIlI[0]) && lIllIIIIIIIlIII(arrayList.contains(Integer.valueOf(((i2 * lIIllIIlllIlI[8]) + i3) + lIIllIIlllIlI[0])) ? 1 : 0)) {
                    llllllllllllllIllllIIIIIllIIIIll = (i2 * lIIllIIlllIlI[8]) + i3 + lIIllIIlllIlI[0];
                    arrayList.add(Integer.valueOf(llllllllllllllIllllIIIIIllIIIIll));
                    "".length();
                }
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i4 = lIIllIIlllIlI[1];
            while (lIllIIIIIIIlllI(i4, arrayList.size())) {
                arrayList2.add(list.get(((Integer) arrayList.get(i4)).intValue()));
                "".length();
                i4++;
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            System.out.println(lIIllIIlllIIl[lIIllIIlllIlI[4]]);
            return arrayList2;
        } while (!((true ^ true) & ((true ^ true) ^ true)));
        return null;
    }

    private static boolean lIllIIIIIIIlIII(int i) {
        return i == 0;
    }

    private static boolean lIllIIIIIIIlllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected t(TempleTrekkingPlugin templeTrekkingPlugin) {
        super(templeTrekkingPlugin, r2);
        int[] iArr = new int[lIIllIIlllIlI[0]];
        iArr[lIIllIIlllIlI[1]] = lIIllIIlllIlI[2];
        this.ad = new ArrayDeque();
    }

    private static boolean lIllIIIIIIIllll(int i, int i2) {
        return i == i2;
    }

    static {
        lIllIIIIIIIIlIl();
        lIllIIIIIIIIIll();
    }

    private static boolean lIllIIIIIIIIlll(int i) {
        return i > 0;
    }

    private static String lIlIlllllllllll(String llllllllllllllIllllIIIIIlIlIIlII, String llllllllllllllIllllIIIIIlIlIIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIlIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIlIlIIIll.getBytes(StandardCharsets.UTF_8)), lIIllIIlllIlI[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIlllIlI[3], llllllllllllllIllllIIIIIlIlIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIlIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIlIlIIlIl) {
            llllllllllllllIllllIIIIIlIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIIIlIll(Object obj) {
        return obj != null;
    }
}
