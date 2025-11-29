/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

public class aK {
    private final  int pP = 4;
    private  boolean pS;
    private  int pQ;
    private  int gy;
    private  int gx;
    private  boolean pT;
    private final  int pO = 7;
    private  boolean pU;
    private  boolean pH;
    
    private  boolean pR;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[2];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[2];
        while (aK.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public void gV() {
        Matcher matcher;
        int n2;
        Widget widget = Widgets.get((int)var1[3], (int)var1[0]);
        if (aK.var16(this.pR) && aK.var3(widget) && aK.var17(n2 = (matcher = Pattern.compile(var2[var1[2]]).matcher(widget.getText())).find()) && aK.var16(this.pH)) {
            this.pR = var1[4];
            this.pH = var1[4];
            this.pQ = Integer.parseInt(matcher.group(var1[2]));
            this.hc();
        }
    }

    private void hc() {
        int n2 = this.pQ / var1[0];
        this.ad(n2);
    }

    public aK() {
        this.pO = var1[0];
        this.pP = var1[1];
        this.pR = var1[2];
        this.pH = var1[2];
        this.pS = var1[2];
        this.pT = var1[2];
        this.pU = var1[2];
    }

    private static void var18() {
        var2 = new String[var1[4]];
        aK.var2[aK.var1[2]] = "[0-9]+";
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void ad(int n2) {
        aK var19;
        void var20;
        if (aK.var16(n2)) {
            return;
        }
        void var21 = var20 * var1[0];
        int var22 = var19.pQ - var21;
        if (aK.var4((int)var20, var1[5]) && aK.var16(var22 % var1[1])) {
            var19.pS = var1[4];
            var19.gx = var20;
            var19.gy = var22 / var1[1];
            0;
            if (-1 > (0x77 ^ 0x73)) {
                return;
            }
        } else {
            void var23 = var20 - var1[4];
            var19.ad((int)var23);
        }
    }

    private static void var24() {
        var1 = new int[6];
        aK.var1[0] = 0xF8 ^ 0x95 ^ (0x68 ^ 2);
        aK.var1[1] = 83 + 148 - 124 + 88 ^ 31 + 187 - 73 + 54;
        aK.var1[2] = (0x45 ^ 0x29 ^ (0x1E ^ 0x43)) & (0xE ^ 0x3E ^ 1 ^ -1);
        aK.var1[3] = -(0xFFFFAEFF & 0x790F) & (0xFFFFFA7F & 0x2FFF);
        aK.var1[4] = 1;
        aK.var1[5] = 0xC4 ^ 0xC1;
    }

    public int hb() {
        return this.gy;
    }

    public int ha() {
        return this.gx;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    static {
        aK.var24();
        aK.var18();
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Widget widget, int n2) {
        void var25;
        boolean bl = var1[2];
        Widget[] widgetArray = widget.getChildren();
        int n3 = widgetArray.length;
        int var26 = var1[2];
        while (aK.var14(var26, (int)var25)) {
            void var27;
            void var28;
            void var29 = var28[var26];
            if (aK.var17(var29.getText().equals((int)var27 + " (current)") ? 1 : 0)) {
                int var30 = var1[4];
            }
            ++var26;
            0;
            if null == null continue;
            return ((0x51 ^ 0x1B) & ~(0x36 ^ 0x7C)) != 0;
        }
        return bl;
    }
}

