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

public class aK_Unknown {
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

    private static String lIllIIIllIlII(String var6, String var3) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var11 = var3.toCharArray();
        int var2 = llIlIIlIlI[2];
        char[] var4 = var6.toCharArray();
        int var14 = var4.length;
        int var8 = llIlIIlIlI[2];
        while (aK.lIllIIIlllIlI(var8, var14)) {
            char var1 = var4[var8];
            var9.append((char)(var1 ^ var11[var2 % var11.length]));
            0;
            ++var2;
            ++var8;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var9);
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
        aK.llIlIIlIIl[aK.llIlIIlIlI[2]] = aK."[0-9]+";
    }

    private static boolean lIllIIIlllIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void ad(int n2) {
        aK var19;
        void var5;
        if (aK.lIllIIIllIlll(n2)) {
            return;
        }
        void var17 = var5 * llIlIIlIlI[0];
        int var10 = var19.pQ - var17;
        if (aK.lIllIIIlllIll((int)var5, llIlIIlIlI[5]) && aK.lIllIIIllIlll(var10 % llIlIIlIlI[1])) {
            var19.pS = llIlIIlIlI[4];
            var19.gx = var5;
            var19.gy = var10 / llIlIIlIlI[1];
            0;
            if (-1 > (0x77 ^ 0x73)) {
                return;
            }
        } else {
            void var13 = var5 - llIlIIlIlI[4];
            var19.ad((int)var13);
        }
    }

    private static void lIllIIIllIllI() {
        llIlIIlIlI = new int[6];
        aK.llIlIIlIlI[0] = 0xF8 ^ 0x95 ^ (0x68 ^ 2);
        aK.llIlIIlIlI[1] = 83 + 148 - 124 + 88 ^ 31 + 187 - 73 + 54;
        aK.llIlIIlIlI[2] = (0x45 ^ 0x29 ^ (0x1E ^ 0x43)) & (0xE ^ 0x3E ^ 1 ^ -1);
        aK.llIlIIlIlI[3] = -(0xFFFFAEFF & 0x790F) & (0xFFFFFA7F & 0x2FFF);
        aK.llIlIIlIlI[4] = 1;
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
        void var7;
        boolean bl = llIlIIlIlI[2];
        Widget[] widgetArray = widget.getChildren();
        int n3 = widgetArray.length;
        int var12 = llIlIIlIlI[2];
        while (aK.lIllIIIlllIlI(var12, (int)var7)) {
            void var16;
            void var15;
            void var18 = var15[var12];
            if (aK.lIllIIIlllIIl(var18.getText().equals((int)var16 + " (current)") ? 1 : 0)) {
                int llllllllllllllllllIIlIIIllIlIIIl = llIlIIlIlI[4];
            }
            ++var12;
            0;
            
            return false;
        }
        return bl;
    }
}

