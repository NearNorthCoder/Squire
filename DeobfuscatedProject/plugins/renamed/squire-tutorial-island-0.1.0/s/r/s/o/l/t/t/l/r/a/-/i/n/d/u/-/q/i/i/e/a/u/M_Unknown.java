/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class M_Unknown {
    private static /* synthetic */ int[] lIlIIlIIIIlII;
    private static /* synthetic */ String[] lIlIIlIIIIIll;

    private static String lIlllIIIllIlIlI(String var25, String var17) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIlII[2]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIlIIlIIIIlII[4], var16);
            return new String(var4.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static int a(int n2, int n3) {
        if (M.lIlllIIIlllIIII(n2, n3)) {
            throw new IllegalArgumentException(lIlIIlIIIIIll[lIlIIlIIIIlII[4]]);
        }
        Random random = new Random();
        return random.nextInt(n3 - n2 + lIlIIlIIIIlII[0]) + n2;
    }

    static {
        M.lIlllIIIllIllII();
        M.lIlllIIIllIlIll();
    }

    public static boolean J() {
        return Dialog.isViewingOptions();
    }

    public static boolean a(int n2, int n3, String string) {
        Widget widget = Widgets.get((int)n2, (int)n3);
        if (M.lIlllIIIllIllIl(widget) && M.lIlllIIIllIlllI(widget.isVisible() ? 1 : 0)) {
            widget.interact(string);
            return lIlIIlIIIIlII[0];
        }
        return lIlIIlIIIIlII[1];
    }

    /*
     * WARNING - void declaration
     */
    public static void b(int n2) {
        void var11;
        int n3 = M.a(lIlIIlIIIIlII[0], lIlIIlIIIIlII[2]);
        System.out.println(lIlIIlIIIIIll[lIlIIlIIIIlII[1]]);
        int var12 = lIlIIlIIIIlII[1];
        while (M.lIlllIIIllIllll(var12, (int)var11)) {
            int var19;
            Widget var20 = Widgets.get((int)lIlIIlIIIIlII[3], (int)var19);
            System.out.println(var19);
            if (M.lIlllIIIllIllIl(var20)) {
                var20.interact(lIlIIlIIIIIll[lIlIIlIIIIlII[0]]);
            }
            ++var12;
            0;
            if (-1 < 0) continue;
            return;
        }
    }

    private static boolean lIlllIIIlllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlllIIIllIlIll() {
        lIlIIlIIIIIll = new String[lIlIIlIIIIlII[6]];
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[1]] = M."Selecting feature";
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[0]] = M."Select";
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[4]] = M."max must be greater than min";
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[5]] = M."[ANTI-BAN] - Adding random delay. ";
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[7]] = M."Arguments must be in triplets of (int parent, int child, String action).";
    }

    private static void lIlllIIIllIllII() {
        lIlIIlIIIIlII = new int[8];
        M.lIlIIlIIIIlII[0] = 1;
        M.lIlIIlIIIIlII[1] = (0x2D ^ 8) & ~(0x10 ^ 0x35);
        M.lIlIIlIIIIlII[2] = 0x50 ^ 0x3D ^ (0x74 ^ 0x11);
        M.lIlIIlIIIIlII[3] = 0xFFFFCEB7 & 0x33EF;
        M.lIlIIlIIIIlII[4] = 2;
        M.lIlIIlIIIIlII[5] = 3;
        M.lIlIIlIIIIlII[6] = 72 + 73 - 9 + 10 ^ 103 + 111 - 110 + 47;
        M.lIlIIlIIIIlII[7] = 0x2F ^ 0x2B;
    }

    public static boolean I() {
        boolean bl;
        if (!M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland() ? 1 : 0) || !M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland2() ? 1 : 0) || !M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland3() ? 1 : 0) || M.lIlllIIIllIlllI(Dialog.canContinue() ? 1 : 0)) {
            bl = lIlIIlIIIIlII[0];
            0;
            if (2 > (0x60 ^ 0x37 ^ (0x21 ^ 0x72))) {
                return ((0x78 ^ 0x1A ^ (0x71 ^ 0x1E)) & (0x6A ^ 0x6E ^ (0x94 ^ 0x9D) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIIIIlII[1];
        }
        return bl;
    }

    private static boolean lIlllIIIlllIIIl(int n2) {
        return n2 == 0;
    }

    public static boolean b(Object ... objectArray) {
        Object[] var28;
        if (M.lIlllIIIllIlllI(objectArray.length % lIlIIlIIIIlII[5])) {
            throw new IllegalArgumentException(lIlIIlIIIIIll[lIlIIlIIIIlII[7]]);
        }
        int var27 = lIlIIlIIIIlII[1];
        while (M.lIlllIIIllIllll(var27, var28.length)) {
            int var5 = (Integer)var28[var27];
            int var6 = (Integer)var28[var27 + lIlIIlIIIIlII[0]];
            String var10 = (String)var28[var27 + lIlIIlIIIIlII[4]];
            if (M.lIlllIIIllIlllI(M.c(var5, var6) ? 1 : 0)) {
                M.a(var5, var6, var10);
                0;
                return lIlIIlIIIIlII[0];
            }
            var27 += 3;
            0;
            if (((0xC2 ^ 0xC6) & ~(0x3D ^ 0x39)) < 1) continue;
            return false;
        }
        return lIlIIlIIIIlII[1];
    }

    private static boolean lIlllIIIllIlllI(int n2) {
        return n2 != 0;
    }

    public static int G() {
        System.out.println(lIlIIlIIIIIll[lIlIIlIIIIlII[5]]);
        return M.a(lIlIIlIIIIlII[0], lIlIIlIIIIlII[6]);
    }

    public static String b(int n2, int n3) {
        Widget widget = Widgets.get((int)n2, (int)n3);
        if (M.lIlllIIIllIllIl(widget) && M.lIlllIIIllIlllI(widget.isVisible() ? 1 : 0)) {
            return widget.getText();
        }
        return null;
    }

    private static boolean lIlllIIIllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlllIIIllIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllIIIllIlIIl(String var9, String var23) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlIIlIIIIlII[4], var21);
            return new String(var3.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public static boolean c(int n2, int n3) {
        int n4;
        if (M.lIlllIIIllIllIl(Widgets.get((int)n2, (int)n3)) && M.lIlllIIIllIlllI(Widgets.get((int)n2, (int)n3).isVisible() ? 1 : 0)) {
            n4 = lIlIIlIIIIlII[0];
            0;
            if ((0x41 ^ 0x32 ^ (0x1A ^ 0x6D)) <= 0) {
                return ((0 ^ 0x26 ^ (0x5B ^ 0x69)) & (54 + 143 - 113 + 103 ^ 57 + 46 - 40 + 112 ^ -1)) != 0;
            }
        } else {
            n4 = lIlIIlIIIIlII[1];
        }
        return n4 != 0;
    }

    public static boolean H() {
        return Dialog.isOpen();
    }

    private static String lIlllIIIllIlIII(String var2, String var24) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var14 = var24.toCharArray();
        int var13 = lIlIIlIIIIlII[1];
        char[] var7 = var2.toCharArray();
        int var1 = var7.length;
        int var22 = lIlIIlIIIIlII[1];
        while (M.lIlllIIIllIllll(var22, var1)) {
            char var8 = var7[var22];
            var15.append((char)(var8 ^ var14[var13 % var14.length]));
            0;
            ++var13;
            ++var22;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var15);
    }
}

