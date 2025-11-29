/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

public class aK {
    private final /* synthetic */ int pP = 4;
    private /* synthetic */ boolean pS;
    private /* synthetic */ int pQ;
    private /* synthetic */ int gy;
    private /* synthetic */ int gx;
    private /* synthetic */ boolean pT;
    private final /* synthetic */ int pO = 7;
    private /* synthetic */ boolean pU;
    private /* synthetic */ boolean pH;
    private static /* synthetic */ int[] llIlIIlIlI;
    private /* synthetic */ boolean pR;
    private static /* synthetic */ String[] llIlIIlIIl;

    private static boolean lIllIIIlllIII(Object object) {
        return object != null;
    }

    private static boolean lIllIIIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllIIIllIlII(String llllllllllllllllllIIlIIIlIllIIll, String llllllllllllllllllIIlIIIlIllIIlI) {
        llllllllllllllllllIIlIIIlIllIIll = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIIlIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIIIlIllIllI = new StringBuilder();
        char[] llllllllllllllllllIIlIIIlIllIlIl = llllllllllllllllllIIlIIIlIllIIlI.toCharArray();
        int llllllllllllllllllIIlIIIlIllIlII = llIlIIlIlI[2];
        char[] llllllllllllllllllIIlIIIlIlIlllI = llllllllllllllllllIIlIIIlIllIIll.toCharArray();
        int llllllllllllllllllIIlIIIlIlIllIl = llllllllllllllllllIIlIIIlIlIlllI.length;
        int llllllllllllllllllIIlIIIlIlIllII = llIlIIlIlI[2];
        while (aK.lIllIIIlllIlI(llllllllllllllllllIIlIIIlIlIllII, llllllllllllllllllIIlIIIlIlIllIl)) {
            char llllllllllllllllllIIlIIIlIlllIIl = llllllllllllllllllIIlIIIlIlIlllI[llllllllllllllllllIIlIIIlIlIllII];
            llllllllllllllllllIIlIIIlIllIllI.append((char)(llllllllllllllllllIIlIIIlIlllIIl ^ llllllllllllllllllIIlIIIlIllIlIl[llllllllllllllllllIIlIIIlIllIlII % llllllllllllllllllIIlIIIlIllIlIl.length]));
            "".length();
            ++llllllllllllllllllIIlIIIlIllIlII;
            ++llllllllllllllllllIIlIIIlIlIllII;
            "".length();
            if ("  ".length() == "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIlIIIlIllIllI);
    }

    public void gV() {
        Matcher matcher;
        int n2;
        Widget widget = Widgets.get((int)llIlIIlIlI[3], (int)llIlIIlIlI[0]);
        if (aK.lIllIIIllIlll(this.pR ? 1 : 0) && aK.lIllIIIlllIII(widget) && aK.lIllIIIlllIIl(n2 = (matcher = Pattern.compile(llIlIIlIIl[llIlIIlIlI[2]]).matcher(widget.getText())).find()) && aK.lIllIIIllIlll(this.pH ? 1 : 0)) {
            this.pR = llIlIIlIlI[4];
            this.pH = llIlIIlIlI[4];
            this.pQ = Integer.parseInt(matcher.group(llIlIIlIlI[2]));
            this.hc();
        }
    }

    private void hc() {
        int n2 = this.pQ / llIlIIlIlI[0];
        this.ad(n2);
    }

    public aK() {
        this.pO = llIlIIlIlI[0];
        this.pP = llIlIIlIlI[1];
        this.pR = llIlIIlIlI[2];
        this.pH = llIlIIlIlI[2];
        this.pS = llIlIIlIlI[2];
        this.pT = llIlIIlIlI[2];
        this.pU = llIlIIlIlI[2];
    }

    private static void lIllIIIllIlIl() {
        llIlIIlIIl = new String[llIlIIlIlI[4]];
        aK.llIlIIlIIl[aK.llIlIIlIlI[2]] = aK.lIllIIIllIlII("F2d9aQhn", "LWPPU");
    }

    private static boolean lIllIIIlllIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void ad(int n2) {
        aK llllllllllllllllllIIlIIIllIIIlll;
        void llllllllllllllllllIIlIIIllIIIllI;
        if (aK.lIllIIIllIlll(n2)) {
            return;
        }
        void llllllllllllllllllIIlIIIllIIIlIl = llllllllllllllllllIIlIIIllIIIllI * llIlIIlIlI[0];
        int llllllllllllllllllIIlIIIllIIIlII = llllllllllllllllllIIlIIIllIIIlll.pQ - llllllllllllllllllIIlIIIllIIIlIl;
        if (aK.lIllIIIlllIll((int)llllllllllllllllllIIlIIIllIIIllI, llIlIIlIlI[5]) && aK.lIllIIIllIlll(llllllllllllllllllIIlIIIllIIIlII % llIlIIlIlI[1])) {
            llllllllllllllllllIIlIIIllIIIlll.pS = llIlIIlIlI[4];
            llllllllllllllllllIIlIIIllIIIlll.gx = llllllllllllllllllIIlIIIllIIIllI;
            llllllllllllllllllIIlIIIllIIIlll.gy = llllllllllllllllllIIlIIIllIIIlII / llIlIIlIlI[1];
            "".length();
            if (-" ".length() > (0x77 ^ 0x73)) {
                return;
            }
        } else {
            void llllllllllllllllllIIlIIIllIIIIll = llllllllllllllllllIIlIIIllIIIllI - llIlIIlIlI[4];
            llllllllllllllllllIIlIIIllIIIlll.ad((int)llllllllllllllllllIIlIIIllIIIIll);
        }
    }

    private static void lIllIIIllIllI() {
        llIlIIlIlI = new int[6];
        aK.llIlIIlIlI[0] = 0xF8 ^ 0x95 ^ (0x68 ^ 2);
        aK.llIlIIlIlI[1] = 83 + 148 - 124 + 88 ^ 31 + 187 - 73 + 54;
        aK.llIlIIlIlI[2] = (0x45 ^ 0x29 ^ (0x1E ^ 0x43)) & (0xE ^ 0x3E ^ " ".length() ^ -" ".length());
        aK.llIlIIlIlI[3] = -(0xFFFFAEFF & 0x790F) & (0xFFFFFA7F & 0x2FFF);
        aK.llIlIIlIlI[4] = " ".length();
        aK.llIlIIlIlI[5] = 0xC4 ^ 0xC1;
    }

    public int hb() {
        return this.gy;
    }

    public int ha() {
        return this.gx;
    }

    private static boolean lIllIIIllIlll(int n2) {
        return n2 == 0;
    }

    static {
        aK.lIllIIIllIllI();
        aK.lIllIIIllIlIl();
    }

    private static boolean lIllIIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Widget widget, int n2) {
        void llllllllllllllllllIIlIIIllIIllll;
        boolean bl = llIlIIlIlI[2];
        Widget[] widgetArray = widget.getChildren();
        int n3 = widgetArray.length;
        int llllllllllllllllllIIlIIIllIIlllI = llIlIIlIlI[2];
        while (aK.lIllIIIlllIlI(llllllllllllllllllIIlIIIllIIlllI, (int)llllllllllllllllllIIlIIIllIIllll)) {
            void llllllllllllllllllIIlIIIllIlIIlI;
            void llllllllllllllllllIIlIIIllIlIIII;
            void llllllllllllllllllIIlIIIllIIllIl = llllllllllllllllllIIlIIIllIlIIII[llllllllllllllllllIIlIIIllIIlllI];
            if (aK.lIllIIIlllIIl(llllllllllllllllllIIlIIIllIIllIl.getText().equals((int)llllllllllllllllllIIlIIIllIlIIlI + " (current)") ? 1 : 0)) {
                int llllllllllllllllllIIlIIIllIlIIIl = llIlIIlIlI[4];
            }
            ++llllllllllllllllllIIlIIIllIIlllI;
            "".length();
            if (null == null) continue;
            return ((0x51 ^ 0x1B) & ~(0x36 ^ 0x7C)) != 0;
        }
        return bl;
    }
}

