package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Empty Private Storage", priority = 2147483546, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.au  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/au.class */
public class C0021au extends AbstractC0026az {
    private static /* synthetic */ String[] lIlIlIIIlIIl;
    private static /* synthetic */ int[] lIlIlIIIlIlI;
    private final /* synthetic */ int ds = lIlIlIIIlIlI[0];

    private static void llIlllIIIIIlll() {
        lIlIlIIIlIlI = new int[19];
        lIlIlIIIlIlI[0] = (-((-4129) & 15346)) & (-16421) & 15756287;
        lIlIlIIIlIlI[1] = (200 ^ 149) & ((29 ^ 64) ^ (-1));
        lIlIlIIIlIlI[2] = (-((-20681) & 24313)) & (-20545) & 24447;
        lIlIlIIIlIlI[3] = " ".length();
        lIlIlIIIlIlI[4] = (-((-17299) & 28563)) & (-385) & 32675;
        lIlIlIIIlIlI[5] = "  ".length();
        lIlIlIIIlIlI[6] = "   ".length();
        lIlIlIIIlIlI[7] = " ".length() ^ (71 ^ 66);
        lIlIlIIIlIlI[8] = ((172 + 185) - 269) + 152;
        lIlIlIIIlIlI[9] = 152 ^ 130;
        lIlIlIIIlIlI[10] = (((176 + 55) - 70) + 37) ^ (((36 + 88) - (-33)) + 38);
        lIlIlIIIlIlI[11] = 44 ^ 42;
        lIlIlIIIlIlI[12] = 172 ^ 149;
        lIlIlIIIlIlI[13] = -" ".length();
        lIlIlIIIlIlI[14] = 97 ^ 102;
        lIlIlIIIlIlI[15] = 104 ^ 96;
        lIlIlIIIlIlI[16] = 161 ^ 168;
        lIlIlIIIlIlI[17] = 112 ^ 122;
        lIlIlIIIlIlI[18] = 83 ^ 88;
    }

    static {
        llIlllIIIIIlll();
        llIlllIIIIIllI();
    }

    private static String llIlllIIIIIlIl(String lllllllllllllllIllIlIlIIIIlIIlll, String lllllllllllllllIllIlIlIIIIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIlI[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIlIlI[5], lllllllllllllllIllIlIlIIIIlIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlIIIIlIlIII) {
            lllllllllllllllIllIlIlIIIIlIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.AbstractC0026az
    public boolean cg() {
        if (!llIlllIIIlIIll(C0046u.bn() ? 1 : 0) && !llIlllIIIlIlII(D.bC().bH() ? 1 : 0)) {
            Widget widget = Widgets.get(lIlIlIIIlIlI[2], widget2 -> {
                String[] strArr = new String[lIlIlIIIlIlI[3]];
                strArr[lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[17]];
                return widget2.hasAction(strArr);
            });
            if (llIlllIIIlIlIl(widget) && llIlllIIIlIlII(widget.isVisible() ? 1 : 0)) {
                widget.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[1]]);
                return lIlIlIIIlIlI[3];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIlllIIIlIlII(tileObject.getName().contains(lIlIlIIIlIIl[lIlIlIIIlIlI[15]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIlIIIlIlI[3]];
                    strArr[lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[16]];
                    if (llIlllIIIlIlII(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIlIIIlIlI[3];
                        "".length();
                        return ((52 ^ 73) ^ (90 ^ 35)) < "  ".length() ? ((82 ^ 74) ^ (9 ^ 32)) & (((((47 + 60) - 5) + 79) ^ (((83 + 49) - 43) + 43)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIlIIIlIlI[1];
            });
            if (!llIlllIIIlIllI(nearest)) {
                nearest.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[3]]);
                return lIlIlIIIlIlI[3];
            }
            Movement.walkTo(this.cy);
            "".length();
            return lIlIlIIIlIlI[1];
        }
        return lIlIlIIIlIlI[1];
    }

    private static void llIlllIIIIIllI() {
        lIlIlIIIlIIl = new String[lIlIlIIIlIlI[18]];
        lIlIlIIIlIIl[lIlIlIIIlIlI[1]] = llIlllIIIIIIll("MwkGB3IQBAQ=", "qhhlR");
        lIlIlIIIlIIl[lIlIlIIIlIlI[3]] = llIlllIIIIIIll("Jxk9ERE=", "bwItc");
        lIlIlIIIlIIl[lIlIlIIIlIlI[5]] = llIlllIIIIIlII("uZB9pXyJceA=", "eGqGK");
        lIlIlIIIlIIl[lIlIlIIIlIlI[6]] = llIlllIIIIIlIl("Qt1X0FXG8LZtejLIdjdqfw==", "WggXd");
        lIlIlIIIlIIl[lIlIlIIIlIlI[7]] = llIlllIIIIIIll("IA4JHCgV", "amjyX");
        lIlIlIIIlIIl[lIlIlIIIlIlI[10]] = llIlllIIIIIIll("CTI+KgUuJSk=", "AWLHi");
        lIlIlIIIlIIl[lIlIlIIIlIlI[11]] = llIlllIIIIIIll("KyE7MQgaIw==", "hNUWa");
        lIlIlIIIlIIl[lIlIlIIIlIlI[14]] = llIlllIIIIIlII("n1yV48bGiCI=", "tkbdu");
        lIlIlIIIlIIl[lIlIlIIIlIlI[15]] = llIlllIIIIIlIl("eiYdB2p5Lk0IKOA0P72cHlDnH3vKb6NI", "HGwPb");
        lIlIlIIIlIIl[lIlIlIIIlIlI[16]] = llIlllIIIIIIll("KToNKBg=", "lTyMj");
        lIlIlIIIlIIl[lIlIlIIIlIlI[17]] = llIlllIIIIIlII("0Vh/p+G6G0Gr/lfDa2nJcw==", "yXlbs");
    }

    private static String llIlllIIIIIIll(String lllllllllllllllIllIlIlIIIIIIlIlI, String lllllllllllllllIllIlIlIIIIIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIlIIIIIIlIII = new StringBuilder();
        char[] lllllllllllllllIllIlIlIIIIIIIlll = lllllllllllllllIllIlIlIIIIIIlIIl.toCharArray();
        int lllllllllllllllIllIlIlIIIIIIIllI = lIlIlIIIlIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIIlIlI[1];
        while (llIlllIIIlIlll(i, length)) {
            char lllllllllllllllIllIlIlIIIIIIlIll = charArray[i];
            lllllllllllllllIllIlIlIIIIIIlIII.append((char) (lllllllllllllllIllIlIlIIIIIIlIll ^ lllllllllllllllIllIlIlIIIIIIIlll[lllllllllllllllIllIlIlIIIIIIIllI % lllllllllllllllIllIlIlIIIIIIIlll.length]));
            "".length();
            lllllllllllllllIllIlIlIIIIIIIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIlIIIIIIlIII);
    }

    private static String llIlllIIIIIlII(String lllllllllllllllIllIlIlIIIIIllIlI, String lllllllllllllllIllIlIlIIIIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIlIIIIIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIlIIIIIlllII.init(lIlIlIIIlIlI[5], secretKeySpec);
            return new String(lllllllllllllllIllIlIlIIIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlIIIIIllIll) {
            lllllllllllllllIllIlIlIIIIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIIIlIlII(int i) {
        return i != 0;
    }

    private static boolean llIlllIIIlIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlllIIIlIlIl(Object obj) {
        return obj != null;
    }

    private static boolean llIlllIIIlIIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    private boolean cs() {
        int[] iArr = new int[lIlIlIIIlIlI[3]];
        iArr[lIlIlIIIlIlI[1]] = lIlIlIIIlIlI[4];
        if (llIlllIIIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIlIIIlIlI[1];
        }
        if (llIlllIIIlIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIlIIIlIlI[3];
        } else if (llIlllIIIlIlII(Dialog.isViewingOptions() ? 1 : 0) && llIlllIIIlIlII(Dialog.hasOption(lIlIlIIIlIIl[lIlIlIIIlIlI[5]]) ? 1 : 0) && llIlllIIIlIlII(Dialog.hasOption(lIlIlIIIlIIl[lIlIlIIIlIlI[6]]) ? 1 : 0)) {
            String[] strArr = new String[lIlIlIIIlIlI[3]];
            strArr[lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[7]];
            Dialog.chooseOption(strArr);
            "".length();
            return lIlIlIIIlIlI[3];
        } else {
            Widget widget = Widgets.get(lIlIlIIIlIlI[8], lIlIlIIIlIlI[9], lIlIlIIIlIlI[1]);
            if (llIlllIIIlIlIl(widget) && llIlllIIIlIlII(widget.isVisible() ? 1 : 0) && llIlllIIIlIlII(widget.getText().contains(lIlIlIIIlIIl[lIlIlIIIlIlI[10]]) ? 1 : 0)) {
                Widget widget2 = Widgets.get(lIlIlIIIlIlI[8], lIlIlIIIlIlI[9]);
                if (llIlllIIIlIllI(widget2)) {
                    return lIlIlIIIlIlI[1];
                }
                widget2.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[11]]);
                return lIlIlIIIlIlI[3];
            }
            Widget widget3 = Static.getClient().getWidget(lIlIlIIIlIlI[0]);
            if (llIlllIIIlIlIl(widget3)) {
                widget3.interact(lIlIlIIIlIlI[3], lIlIlIIIlIlI[12], lIlIlIIIlIlI[13], lIlIlIIIlIlI[0]);
                return lIlIlIIIlIlI[3];
            }
            int[] iArr2 = new int[lIlIlIIIlIlI[3]];
            iArr2[lIlIlIIIlIlI[1]] = lIlIlIIIlIlI[4];
            Item first = Inventory.getFirst(iArr2);
            if (llIlllIIIlIllI(first)) {
                return lIlIlIIIlIlI[1];
            }
            first.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[14]]);
            return lIlIlIIIlIlI[3];
        }
    }

    private static boolean llIlllIIIlIllI(Object obj) {
        return obj == null;
    }
}
