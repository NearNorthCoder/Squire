/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@Singleton
public class a_Unknown {
    private static /* synthetic */ int[] lIllIIllIllIl;
    private /* synthetic */ int l;
    private final /* synthetic */ SquireZeahRunecrafter k;
    private static final /* synthetic */ int i;
    private static final /* synthetic */ int j;
    private static /* synthetic */ String[] lIllIIllIlIll;
    private static final /* synthetic */ int h;

    private static boolean llIIIllIllIlIll(Object object) {
        return object == null;
    }

    public int j() {
        return this.l;
    }

    /*
     * WARNING - void declaration
     */
    public void a(String string) {
        a var16;
        if (a.llIIIllIllIlIll(string)) {
            this.c(lIllIIllIllIl[3]);
            return;
        }
        try {
            void var1;
            int var10 = var16.b((String)var1);
            var16.c(var10);
            var16.k.a(lIllIIllIllIl[0]);
        }
        catch (NumberFormatException var10) {
            var16.c(lIllIIllIllIl[3]);
        }
        0;
        if (3 <= 0) {
            return;
        }
    }

    private static boolean llIIIllIllIllII(int n, int n2) {
        return n < n2;
    }

    public int h() {
        int n = this.i();
        return lIllIIllIllIl[5] - n;
    }

    private void e() {
        this.k.a(lIllIIllIllIl[0]);
        this.c(lIllIIllIllIl[1]);
    }

    static {
        a.llIIIllIllIIlll();
        a.llIIIllIlIlllll();
        i = lIllIIllIllIl[5];
        j = lIllIIllIllIl[10];
        h = lIllIIllIllIl[3];
    }

    private static String llIIIllIlIllllI(String var14, String var18) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIllIIllIllIl[11]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIllIIllIllIl[4], var5);
            return new String(var3.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private int b(String string) {
        String string2 = string.split(lIllIIllIlIll[lIllIIllIllIl[0]])[lIllIIllIllIl[1]];
        String string3 = string2.split(lIllIIllIlIll[lIllIIllIllIl[4]])[lIllIIllIllIl[0]];
        return Integer.parseInt(string3);
    }

    private static String llIIIllIlIlllIl(String var12, String var19) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var20 = var19.toCharArray();
        int var15 = lIllIIllIllIl[1];
        char[] var7 = var12.toCharArray();
        int var9 = var7.length;
        int var8 = lIllIIllIllIl[1];
        while (a.llIIIllIllIllII(var8, var9)) {
            char var11 = var7[var8];
            var17.append((char)(var11 ^ var20[var15 % var20.length]));
            0;
            ++var15;
            ++var8;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    @Inject
    public a(SquireZeahRunecrafter squireZeahRunecrafter) {
        this.k = squireZeahRunecrafter;
    }

    private boolean f() {
        boolean bl;
        if (a.llIIIllIllIlIlI(Widgets.get((WidgetInfo)WidgetInfo.DIALOG_SPRITE_TEXT))) {
            bl = lIllIIllIllIl[0];
            0;
            if (1 == ((0x3A ^ 0x1A) & ~(0x1F ^ 0x3F))) {
                return false;
            }
        } else {
            bl = lIllIIllIllIl[1];
        }
        return bl;
    }

    private static boolean llIIIllIllIlIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIllIllIlIII(int n) {
        return n == 0;
    }

    private int i() {
        int n = lIllIIllIllIl[1];
        int[] nArray = new int[lIllIIllIllIl[0]];
        nArray[a.lIllIIllIllIl[1]] = lIllIIllIllIl[6];
        if (a.llIIIllIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            n += 4;
        }
        if (a.llIIIllIllIlIIl(Inventory.contains(item -> item.getName().contains(lIllIIllIlIll[lIllIIllIllIl[9]])) ? 1 : 0)) {
            var2 += 4;
        }
        int[] nArray2 = new int[lIllIIllIllIl[0]];
        nArray2[a.lIllIIllIllIl[1]] = lIllIIllIllIl[7];
        if (a.llIIIllIllIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            var2 += 4;
        }
        int[] nArray3 = new int[lIllIIllIllIl[0]];
        nArray3[a.lIllIIllIllIl[1]] = lIllIIllIllIl[8];
        if (a.llIIIllIllIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            var2 += 4;
        }
        return n;
    }

    public void c(int n) {
        this.l = n;
    }

    public void d() {
        a var4;
        int[] nArray = new int[lIllIIllIllIl[0]];
        nArray[a.lIllIIllIllIl[1]] = lIllIIllIllIl[2];
        if (a.llIIIllIllIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.e();
            return;
        }
        if (a.llIIIllIllIlIIl(var4.f() ? 1 : 0)) {
            String var6 = Widgets.get((WidgetInfo)WidgetInfo.DIALOG_SPRITE_TEXT).getText();
            var4.a(var6);
            return;
        }
        this.g();
    }

    private static void llIIIllIllIIlll() {
        lIllIIllIllIl = new int[12];
        a.lIllIIllIllIl[0] = 1;
        a.lIllIIllIllIl[1] = (3 ^ 0x45 ^ (8 ^ 6)) & (31 + 38 - -85 + 58 ^ 84 + 35 - 106 + 143 ^ -1);
        a.lIllIIllIllIl[2] = -(207 + 30 - 55 + 48) & (0xFFFFDFEF & 0x3FF7);
        a.lIllIIllIllIl[3] = -(0x13 ^ 0x16);
        a.lIllIIllIllIl[4] = 2;
        a.lIllIIllIllIl[5] = 0xD8 ^ 0xB4;
        a.lIllIIllIllIl[6] = 0xFFFFD735 & 0x2AFF;
        a.lIllIIllIllIl[7] = 0xFFFFF75F & 0x6FB6;
        a.lIllIIllIllIl[8] = -(0x23 ^ 0x40) & (0xFFFFEFFB & 0x777E);
        a.lIllIIllIllIl[9] = 3;
        a.lIllIIllIllIl[10] = 0x73 ^ 0x77;
        a.lIllIIllIllIl[11] = 0x9C ^ 0x94;
    }

    private static boolean llIIIllIllIlIIl(int n) {
        return n != 0;
    }

    private void g() {
        int[] nArray = new int[lIllIIllIllIl[0]];
        nArray[a.lIllIIllIllIl[1]] = lIllIIllIllIl[2];
        Inventory.getFirst((int[])nArray).interact(lIllIIllIlIll[lIllIIllIllIl[1]]);
    }

    private static void llIIIllIlIlllll() {
        lIllIIllIlIll = new String[lIllIIllIllIl[10]];
        a.lIllIIllIlIll[a.lIllIIllIllIl[1]] = a."Count";
        a.lIllIIllIlIll[a.lIllIIllIllIl[0]] = a."<br>";
        a.lIllIIllIlIll[a.lIllIIllIllIl[4]] = a."to ";
        a.lIllIIllIlIll[a.lIllIIllIllIl[9]] = a."pickaxe";
    }
}

