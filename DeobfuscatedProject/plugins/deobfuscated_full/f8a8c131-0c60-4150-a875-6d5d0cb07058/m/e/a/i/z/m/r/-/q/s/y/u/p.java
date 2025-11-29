/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.c;
import m.e.a.i.z.m.r.-.q.s.y.u.f;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import m.e.a.i.z.m.r.-.q.s.y.u.u;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Drinking Poison Cure -> DrinkingpoisoncureTask */
@TaskDesc(name="Drinking Poison Cure", priority=8)
public class p
extends Task {
    private static /* synthetic */ String[] lIllIIlIIIIlI;
    private final /* synthetic */ c P;
    private static /* synthetic */ int[] lIllIIlIIIIll;
    private final /* synthetic */ l O;
    private final /* synthetic */ u R;
    private final /* synthetic */ f Q;

    private static String llIIIlIllIlIlII(String var10, String var6) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var7 = var6.toCharArray();
        int var14 = lIllIIlIIIIll[0];
        char[] var1 = var10.toCharArray();
        int var5 = var1.length;
        int var11 = lIllIIlIIIIll[0];
        while (p.llIIIlIllIlllII(var11, var5)) {
            char var13 = var1[var11];
            var4.append((char)(var13 ^ var7[var14 % var7.length]));
            0;
            ++var14;
            ++var11;
            0;
            if (((34 + 61 - -33 + 49 ^ 14 + 23 - -50 + 67) & (0xD6 ^ 0xB3 ^ (2 ^ 0x4C) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var8;
        if (!p.llIIIlIllIllIII(this.O.B() ? 1 : 0) || p.llIIIlIllIllIIl(this.O.G() ? 1 : 0)) {
            return lIllIIlIIIIll[0];
        }
        if (p.llIIIlIllIllIlI(var8.P.e())) {
            return lIllIIlIIIIll[0];
        }
        if (p.llIIIlIllIllIII(var8.R.O() ? 1 : 0)) {
            return lIllIIlIIIIll[0];
        }
        if (p.llIIIlIllIllIIl(Combat.isPoisoned() ? 1 : 0) && p.llIIIlIllIllIIl(Combat.isVenomed() ? 1 : 0)) {
            return lIllIIlIIIIll[0];
        }
        Item var15 = Inventory.getFirst(item -> {
            int n2;
            if (!p.llIIIlIllIllIIl(item.getName().toLowerCase().contains(lIllIIlIIIIlI[lIllIIlIIIIll[2]]) ? 1 : 0) || p.llIIIlIllIllIII(item.getName().toLowerCase().contains(lIllIIlIIIIlI[lIllIIlIIIIll[3]]) ? 1 : 0)) {
                n2 = lIllIIlIIIIll[1];
                0;
                if (-1 == 1) {
                    return false;
                }
            } else {
                n2 = lIllIIlIIIIll[0];
            }
            return n2 != 0;
        });
        if (p.llIIIlIllIllIll(var15)) {
            return var8.O.a(lIllIIlIIIIlI[lIllIIlIIIIll[0]]);
        }
        var1_1.interact(lIllIIlIIIIlI[lIllIIlIIIIll[1]]);
        this.Q.r();
        return lIllIIlIIIIll[1];
    }

    private static boolean llIIIlIllIllIll(Object object) {
        return object == null;
    }

    @Inject
    public p(l l2, c c2, f f2, u u2) {
        this.O = l2;
        this.P = c2;
        this.Q = f2;
        this.R = u2;
    }

    private static boolean llIIIlIllIllIlI(Object object) {
        return object != null;
    }

    private static void llIIIlIllIlIlll() {
        lIllIIlIIIIll = new int[5];
        p.lIllIIlIIIIll[0] = (75 + 72 - -27 + 77 ^ 143 + 11 - 4 + 14) & (0x39 ^ 0x1F ^ (0xFC ^ 0x85) ^ -1);
        p.lIllIIlIIIIll[1] = 1;
        p.lIllIIlIIIIll[2] = 2;
        p.lIllIIlIIIIll[3] = 3;
        p.lIllIIlIIIIll[4] = 0x6A ^ 0x6E;
    }

    private static void llIIIlIllIlIllI() {
        lIllIIlIIIIlI = new String[lIllIIlIIIIll[4]];
        p.lIllIIlIIIIlI[p.lIllIIlIIIIll[0]] = p."Out of poison cures";
        p.lIllIIlIIIIlI[p.lIllIIlIIIIll[1]] = p."Drink";
        p.lIllIIlIIIIlI[p.lIllIIlIIIIll[2]] = p."anti";
        p.lIllIIlIIIIlI[p.lIllIIlIIIIll[3]] = p."sanfew";
    }

    private static boolean llIIIlIllIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIllIllIIl(int n2) {
        return n2 == 0;
    }

    private static String llIIIlIllIlIlIl(String var12, String var9) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIllIIlIIIIll[2], var16);
            return new String(var3.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    static {
        p.llIIIlIllIlIlll();
        p.llIIIlIllIlIllI();
    }

    private static boolean llIIIlIllIlllII(int n2, int n3) {
        return n2 < n3;
    }
}

