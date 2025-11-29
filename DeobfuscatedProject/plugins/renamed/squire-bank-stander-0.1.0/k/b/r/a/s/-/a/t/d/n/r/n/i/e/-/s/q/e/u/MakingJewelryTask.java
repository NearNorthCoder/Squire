/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a_Unknown;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Making Jewelry -> MakingjewelryTask */
@TaskDesc(name="Making Jewelry")
public class MakingJewelryTask
extends a_Unknown {
    private static /* synthetic */ int[] lllIIlIllll;
    private static /* synthetic */ String[] lllIIlIlllI;

    private static boolean lIlIlllIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public Map<Integer, Integer> g() {
        if (C.lIlIlllIIIllll(this.j.jewelryProduct().H(), lllIIlIllll[0])) {
            return Map.of(this.j.jewelryProduct().z(), lllIIlIllll[1], this.j.jewelryProduct().I(), lllIIlIllll[1]);
        }
        return Map.of(this.j.jewelryProduct().z(), lllIIlIllll[1], this.j.jewelryProduct().H(), lllIIlIllll[1], this.j.jewelryProduct().I(), lllIIlIllll[1]);
    }

    private static void lIlIlllIIIlllI() {
        lllIIlIllll = new int[8];
        C.lllIIlIllll[0] = -1;
        C.lllIIlIllll[1] = 1;
        C.lllIIlIllll[2] = 86 + 77 - 160 + 138 ^ 67 + 54 - 89 + 107;
        C.lllIIlIllll[3] = 0xFFFF97BF & 0x69FE;
        C.lllIIlIllll[4] = (0x36 ^ 7 ^ (0x60 ^ 0x66)) & (0x4F ^ 0x6A ^ (0x70 ^ 0x62) ^ -1);
        C.lllIIlIllll[5] = 77 + 23 - 39 + 128 ^ 51 + 162 - 195 + 166;
        C.lllIIlIllll[6] = 2;
        C.lllIIlIllll[7] = 0xB7 ^ 0xA9 ^ (0x89 ^ 0x9F);
    }

    @Inject
    public C(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.JEWELRY);
    }

    @Override
    public int i() {
        return lllIIlIllll[5];
    }

    static {
        C.lIlIlllIIIlllI();
        C.lIlIlllIIIllIl();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var14;
        void var16;
        Widget widget = Widgets.get((int)lllIIlIllll[2], (int)lllIIlIllll[1]);
        Widget widget2 = Widgets.get((int)lllIIlIllll[3], (int)lllIIlIllll[4]);
        if (C.lIlIlllIIlIIII(widget)) {
            System.out.println("Group: " + this.j.jewelryProduct().J());
            System.out.println("ID: " + this.j.jewelryProduct().K());
            System.out.println("Option: " + this.j.jewelryProduct().L());
            Widgets.get((int)this.j.jewelryProduct().J(), (int)this.j.jewelryProduct().K()).interact(this.j.jewelryProduct().L());
        }
        if (C.lIlIlllIIlIIII(var16)) {
            C var1;
            System.out.println("Group: " + var1.j.jewelryProduct().J());
            System.out.println("ID: " + var1.j.jewelryProduct().K());
            System.out.println("Option: " + var1.j.jewelryProduct().L());
            Widgets.get((int)var1.j.jewelryProduct().J(), (int)var1.j.jewelryProduct().K()).interact(lllIIlIllll[4]);
        }
        if (C.lIlIlllIIlIIIl(var14) && C.lIlIlllIIlIIIl(var16)) {
            TileObject var7 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (C.lIlIlllIIlIIII(tileObject.getActions())) {
                    String[] stringArray = new String[lllIIlIllll[1]];
                    stringArray[C.lllIIlIllll[4]] = lllIIlIlllI[lllIIlIllll[1]];
                    if (C.lIlIlllIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllIIlIllll[1];
                        0;
                        if (null == null) return n2 != 0;
                        return false;
                    }
                }
                n2 = lllIIlIllll[4];
                return n2 != 0;
            });
            if (C.lIlIlllIIlIIIl(var7)) {
                return lllIIlIllll[4];
            }
            var7.interact(lllIIlIlllI[lllIIlIllll[4]]);
        }
        return lllIIlIllll[1];
    }

    private static boolean lIlIlllIIlIIII(Object object) {
        return object != null;
    }

    private static void lIlIlllIIIllIl() {
        lllIIlIlllI = new String[lllIIlIllll[6]];
        C.lllIIlIlllI[C.lllIIlIllll[4]] = C."Smelt";
        C.lllIIlIlllI[C.lllIIlIllll[1]] = C."Smelt";
    }

    private static String lIlIlllIIIllII(String var5, String var9) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lllIIlIllll[7]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllIIlIllll[6], var13);
            return new String(var10.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlllIIIlIll(String var3, String var6) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var11 = var6.toCharArray();
        int var17 = lllIIlIllll[4];
        char[] var2 = var3.toCharArray();
        int var8 = var2.length;
        int var12 = lllIIlIllll[4];
        while (C.lIlIlllIIlIIll(var12, var8)) {
            char var18 = var2[var12];
            var15.append((char)(var18 ^ var11[var17 % var11.length]));
            0;
            ++var17;
            ++var12;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean lIlIlllIIlIIIl(Object object) {
        return object == null;
    }
}

