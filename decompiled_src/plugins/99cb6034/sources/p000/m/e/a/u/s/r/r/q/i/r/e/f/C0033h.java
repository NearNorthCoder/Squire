package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@Singleton
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/h.class */
public class C0033h {
    private static /* synthetic */ int[] lIlllIIlIIlI;
    private static /* synthetic */ String[] lIlllIIIlIlI;
    private static final /* synthetic */ int ao;

    private static boolean lllIlIllIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static String lllIlIllIIIlll(String lllllllllllllllIlIllIllllIlIllIl, String lllllllllllllllIlIllIllllIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIllllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllllIlIllII.getBytes(StandardCharsets.UTF_8)), lIlllIIlIIlI[11]), "DES");
            Cipher lllllllllllllllIlIllIllllIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIllllIlIllll.init(lIlllIIlIIlI[5], lllllllllllllllIlIllIllllIllIIII);
            return new String(lllllllllllllllIlIllIllllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIllllIlIlllI) {
            lllllllllllllllIlIllIllllIlIlllI.printStackTrace();
            return null;
        }
    }

    public boolean G() {
        return Widgets.isVisible(H());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean K() {
        if (lllIlIllIIllll(I())) {
            ?? r0 = lIlllIIlIIlI[2];
            "".length();
            return "  ".length() == 0 ? ((((47 + 87) - 84) + 105) ^ (((170 + 31) - 101) + 80)) & (((((1 + 8) - (-99)) + 37) ^ (((155 + 114) - 232) + 153)) ^ (-" ".length())) : r0;
        }
        return lIlllIIlIIlI[1];
    }

    private static void lllIlIllIIllII() {
        lIlllIIlIIlI = new int[12];
        lIlllIIlIIlI[0] = 77 ^ 48;
        lIlllIIlIIlI[1] = (145 ^ 131) & ((66 ^ 80) ^ (-1));
        lIlllIIlIIlI[2] = " ".length();
        lIlllIIlIIlI[3] = (219 ^ 176) ^ (137 ^ 156);
        lIlllIIlIIlI[4] = 12 ^ 9;
        lIlllIIlIIlI[5] = "  ".length();
        lIlllIIlIIlI[6] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIlllIIlIIlI[7] = "   ".length();
        lIlllIIlIIlI[8] = 13 ^ 9;
        lIlllIIlIIlI[9] = 112 ^ 118;
        lIlllIIlIIlI[10] = (180 ^ 136) ^ (176 ^ 139);
        lIlllIIlIIlI[11] = 11 ^ 3;
    }

    private static String lllIlIllIIIIIl(String lllllllllllllllIlIllIllllIIlllIl, String lllllllllllllllIlIllIllllIIlllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIllllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIllllIIllIll = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIllllIIlllII.toCharArray();
        int lllllllllllllllIlIllIllllIIllIIl = lIlllIIlIIlI[1];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIlIllIllllIIlIIlI = charArray2.length;
        int i = lIlllIIlIIlI[1];
        while (lllIlIllIlIlII(i, lllllllllllllllIlIllIllllIIlIIlI)) {
            lllllllllllllllIlIllIllllIIllIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIllIllllIIllIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIllIllllIIllIIl++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIllllIIllIll);
    }

    public void h(K k, Integer num) {
        if (lllIlIllIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(num.intValue());
            return;
        }
        Widget widget = Widgets.get(lIlllIIlIIlI[0], k.aF());
        if (lllIlIllIIlllI(widget)) {
            return;
        }
        String str = lIlllIIIlIlI[lIlllIIlIIlI[8]];
        if (!lllIlIllIlIIIl(num.intValue(), lIlllIIlIIlI[2]) || lllIlIllIlIIlI(num.intValue(), lIlllIIlIIlI[4])) {
            str = "Remove-" + num;
        }
        if (lllIlIllIlIIlI(num.intValue(), lIlllIIlIIlI[6])) {
            str = lIlllIIIlIlI[lIlllIIlIIlI[4]];
        }
        if (lllIlIllIlIIll(k, K.BOTTOMLESS_BUCKET)) {
            str = lIlllIIIlIlI[lIlllIIlIIlI[9]];
        }
        widget.interact(str);
    }

    public void c(Item item) {
        NPC I = I();
        if (lllIlIllIIlllI(I)) {
            return;
        }
        item.useOn(I);
    }

    private static boolean lllIlIllIIllll(Object obj) {
        return obj != null;
    }

    static {
        lllIlIllIIllII();
        lllIlIllIIlIII();
        ao = lIlllIIlIIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean J() {
        int lllllllllllllllIlIllIllllllIIIII = lIlllIIlIIlI[1];
        for (Item item : Inventory.getAll()) {
            if (lllIlIllIIllIl(L.bq.contains(Integer.valueOf(item.getId())) ? 1 : 0)) {
                c(item);
                lllllllllllllllIlIllIllllllIIIII = lIlllIIlIIlI[2];
            }
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllllllllllllllIlIllIllllllIIIII;
    }

    private static boolean lllIlIllIlIlII(int i, int i2) {
        return i < i2;
    }

    public void L() {
        NPC I = I();
        if (lllIlIllIIlllI(I)) {
            return;
        }
        I.interact(lIlllIIIlIlI[lIlllIIlIIlI[10]]);
    }

    public Widget H() {
        return Widgets.get(lIlllIIlIIlI[0], lIlllIIlIIlI[1]);
    }

    private static boolean lllIlIllIIlllI(Object obj) {
        return obj == null;
    }

    private static void lllIlIllIIlIII() {
        lIlllIIIlIlI = new String[lIlllIIlIIlI[11]];
        lIlllIIIlIlI[lIlllIIlIIlI[1]] = lllIlIllIIIIIl("ETstGEwJMTIGCSY8IwEC", "ETBtl");
        lIlllIIIlIlI[lIlllIIlIIlI[2]] = lllIlIllIIIIlI("hUphOyudoHE=", "yOsMx");
        lIlllIIIlIlI[lIlllIIlIIlI[5]] = lllIlIllIIIIlI("gXJ2Jio5up0=", "jPmfK");
        lIlllIIIlIlI[lIlllIIlIIlI[7]] = lllIlIllIIIIIl("FA4mEzdqOyUN", "GzIaR");
        lIlllIIIlIlI[lIlllIIlIIlI[8]] = lllIlIllIIIlll("LQ/f4Jd70vX/dDu7MeK8FA==", "FmTOv");
        lIlllIIIlIlI[lIlllIIlIIlI[4]] = lllIlIllIIIIIl("MDMoIjwHewQhJg==", "bVEMJ");
        lIlllIIIlIlI[lIlllIIlIIlI[9]] = lllIlIllIIIIIl("OCkmHxUP", "jLKpc");
        lIlllIIIlIlI[lIlllIIlIIlI[10]] = lllIlIllIIIlll("iGfh+svknm2vUww8GoPH0A==", "nrgaM");
    }

    private static boolean lllIlIllIlIIII(int i) {
        return i == 0;
    }

    public NPC I() {
        String[] strArr = new String[lIlllIIlIIlI[2]];
        strArr[lIlllIIlIIlI[1]] = lIlllIIIlIlI[lIlllIIlIIlI[1]];
        return NPCs.getNearest(strArr);
    }

    public void g(K k, Integer num) {
        if (lllIlIllIlIIII(Inventory.contains(k.aH()) ? 1 : 0)) {
            return;
        }
        if (lllIlIllIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(num.intValue());
            return;
        }
        Widget widget = Widgets.get(lIlllIIlIIlI[3], k.aG());
        if (lllIlIllIIlllI(widget)) {
            return;
        }
        String str = lIlllIIIlIlI[lIlllIIlIIlI[2]];
        if (!lllIlIllIlIIIl(num.intValue(), lIlllIIlIIlI[2]) || lllIlIllIlIIlI(num.intValue(), lIlllIIlIIlI[4])) {
            str = "Store-" + num;
        }
        if (lllIlIllIlIIll(k, K.BOTTOMLESS_BUCKET)) {
            str = lIlllIIIlIlI[lIlllIIlIIlI[5]];
        }
        if (lllIlIllIlIIlI(num.intValue(), lIlllIIlIIlI[6])) {
            str = lIlllIIIlIlI[lIlllIIlIIlI[7]];
        }
        widget.interact(str);
    }

    private static String lllIlIllIIIIlI(String lllllllllllllllIlIllIllllIlllIlI, String lllllllllllllllIlIllIllllIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIllllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIllllIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIllllIllllII.init(lIlllIIlIIlI[5], lllllllllllllllIlIllIllllIllllIl);
            return new String(lllllllllllllllIlIllIllllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIllllIlllIll) {
            lllllllllllllllIlIllIllllIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllIIllIl(int i) {
        return i != 0;
    }

    private static boolean lllIlIllIlIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIlIllIlIIIl(int i, int i2) {
        return i != i2;
    }
}
