package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aK  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aK.class */
public class aK {
    private /* synthetic */ int pQ;
    private /* synthetic */ int gy;
    private /* synthetic */ int gx;
    private static /* synthetic */ int[] llIlIIlIlI;
    private static /* synthetic */ String[] llIlIIlIIl;
    private final /* synthetic */ int pO = llIlIIlIlI[0];
    private final /* synthetic */ int pP = llIlIIlIlI[1];
    private /* synthetic */ boolean pR = llIlIIlIlI[2];
    private /* synthetic */ boolean pH = llIlIIlIlI[2];
    private /* synthetic */ boolean pS = llIlIIlIlI[2];
    private /* synthetic */ boolean pT = llIlIIlIlI[2];
    private /* synthetic */ boolean pU = llIlIIlIlI[2];

    private static boolean lIllIIIlllIII(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIlllIll(int i, int i2) {
        return i <= i2;
    }

    private static String lIllIIIllIlII(String llllllllllllllllllIIlIIIlIlllIII, String llllllllllllllllllIIlIIIlIllIlll) {
        String llllllllllllllllllIIlIIIlIlllIII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIIlIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIIIlIllIllI = new StringBuilder();
        char[] charArray = llllllllllllllllllIIlIIIlIllIlll.toCharArray();
        int llllllllllllllllllIIlIIIlIllIlII = llIlIIlIlI[2];
        char[] charArray2 = llllllllllllllllllIIlIIIlIlllIII2.toCharArray();
        int llllllllllllllllllIIlIIIlIlIllIl = charArray2.length;
        int i = llIlIIlIlI[2];
        while (lIllIIIlllIlI(i, llllllllllllllllllIIlIIIlIlIllIl)) {
            llllllllllllllllllIIlIIIlIllIllI.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIIlIIIlIllIlII % charArray.length]));
            "".length();
            llllllllllllllllllIIlIIIlIllIlII++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIlIIIlIllIllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public void gV() {
        Widget widget = Widgets.get(llIlIIlIlI[3], llIlIIlIlI[0]);
        if (lIllIIIllIlll(this.pR ? 1 : 0) && lIllIIIlllIII(widget)) {
            Matcher matcher = Pattern.compile(llIlIIlIIl[llIlIIlIlI[2]]).matcher(widget.getText());
            if (lIllIIIlllIIl(matcher.find() ? 1 : 0) && lIllIIIllIlll(this.pH ? 1 : 0)) {
                this.pR = llIlIIlIlI[4];
                this.pH = llIlIIlIlI[4];
                this.pQ = Integer.parseInt(matcher.group(llIlIIlIlI[2]));
                hc();
            }
        }
    }

    private void hc() {
        ad(this.pQ / llIlIIlIlI[0]);
    }

    private static void lIllIIIllIlIl() {
        llIlIIlIIl = new String[llIlIIlIlI[4]];
        llIlIIlIIl[llIlIIlIlI[2]] = lIllIIIllIlII("F2d9aQhn", "LWPPU");
    }

    private static boolean lIllIIIlllIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    private void ad(int i) {
        if (lIllIIIllIlll(i)) {
            return;
        }
        int i2 = this.pQ - (i * llIlIIlIlI[0]);
        if (!lIllIIIlllIll(i, llIlIIlIlI[5]) || !lIllIIIllIlll(i2 % llIlIIlIlI[1])) {
            ad(i - llIlIIlIlI[4]);
            return;
        }
        this.pS = llIlIIlIlI[4];
        this.gx = i;
        this.gy = i2 / llIlIIlIlI[1];
        "".length();
        if ((-" ".length()) > (119 ^ 115)) {
        }
    }

    private static void lIllIIIllIllI() {
        llIlIIlIlI = new int[6];
        llIlIIlIlI[0] = (248 ^ 149) ^ (104 ^ 2);
        llIlIIlIlI[1] = (((83 + 148) - 124) + 88) ^ (((31 + 187) - 73) + 54);
        llIlIIlIlI[2] = ((69 ^ 41) ^ (30 ^ 67)) & (((14 ^ 62) ^ " ".length()) ^ (-" ".length()));
        llIlIIlIlI[3] = (-((-20737) & 30991)) & (-1409) & 12287;
        llIlIIlIlI[4] = " ".length();
        llIlIIlIlI[5] = 196 ^ 193;
    }

    public int hb() {
        return this.gy;
    }

    public int ha() {
        return this.gx;
    }

    private static boolean lIllIIIllIlll(int i) {
        return i == 0;
    }

    static {
        lIllIIIllIllI();
        lIllIIIllIlIl();
    }

    private static boolean lIllIIIlllIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(Widget widget, int i) {
        int i2 = llIlIIlIlI[2];
        Widget[] children = widget.getChildren();
        int length = children.length;
        int i3 = llIlIIlIlI[2];
        while (lIllIIIlllIlI(i3, length)) {
            if (lIllIIIlllIIl(children[i3].getText().equals(i + " (current)") ? 1 : 0)) {
                i2 = llIlIIlIlI[4];
            }
            i3++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return i2;
    }
}
