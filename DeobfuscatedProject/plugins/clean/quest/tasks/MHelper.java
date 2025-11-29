/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.quest.tasks;

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

public class MHelper {

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
        void var1;
        int n3 = M.a(lIlIIlIIIIlII[0], lIlIIlIIIIlII[2]);
        System.out.println(lIlIIlIIIIIll[lIlIIlIIIIlII[1]]);
        int var2 = lIlIIlIIIIlII[1];
        while (M.lIlllIIIllIllll(var2, (int)var1)) {
            int var3;
            Widget var4 = Widgets.get((int)lIlIIlIIIIlII[3], (int)var3);
            System.out.println(var3);
            if (M.lIlllIIIllIllIl(var4)) {
                var4.interact(lIlIIlIIIIIll[lIlIIlIIIIlII[0]]);
            }
            ++var2;

            if (-1 < 0) continue;
            return;
        }
    }

    private static boolean lIlllIIIlllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlllIIIllIlIll() {
        lIlIIlIIIIIll = new String[lIlIIlIIIIlII[6]];
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[1]] = "Selecting feature";
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[0]] = "Select";
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[4]] = "max must be greater than min";
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[5]] = "[ANTI-BAN] - Adding random delay. ";
        M.lIlIIlIIIIIll[M.lIlIIlIIIIlII[7]] = "Arguments must be in triplets of (int parent, int child, String action).";
    }

    public static boolean I() {
        boolean bl;
        if (!M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland() ? 1 : 0) || !M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland2() ? 1 : 0) || !M.lIlllIIIlllIIIl(Dialog.canContinueTutIsland3() ? 1 : 0) || M.lIlllIIIllIlllI(Dialog.canContinue() ? 1 : 0)) {
            bl = lIlIIlIIIIlII[0];

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
        Object[] var5;
        if (M.lIlllIIIllIlllI(objectArray.length % lIlIIlIIIIlII[5])) {
            throw new IllegalArgumentException(lIlIIlIIIIIll[lIlIIlIIIIlII[7]]);
        }
        int var6 = lIlIIlIIIIlII[1];
        while (M.lIlllIIIllIllll(var6, var5.length)) {
            int var7 = (Integer)var5[var6];
            int var8 = (Integer)var5[var6 + lIlIIlIIIIlII[0]];
            String var9 = (String)var5[var6 + lIlIIlIIIIlII[4]];
            if (M.lIlllIIIllIlllI(M.c(var7, var8) ? 1 : 0)) {
                M.a(var7, var8, var9);

                return lIlIIlIIIIlII[0];
            }
            var6 += 3;

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

    public static boolean c(int n2, int n3) {
        int n4;
        if (M.lIlllIIIllIllIl(Widgets.get((int)n2, (int)n3)) && M.lIlllIIIllIlllI(Widgets.get((int)n2, (int)n3).isVisible() ? 1 : 0)) {
            n4 = lIlIIlIIIIlII[0];

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

        return String.valueOf(var10);
    }
}

