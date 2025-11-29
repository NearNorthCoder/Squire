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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.f;

/* TASK: Consuming peaches -> ConsumingpeachesTask */
@TaskDesc(name="Consuming peaches", priority=5, blocking=true)
public class t
extends Task {
    private static /* synthetic */ String[] llIlllIllIl;
    private final /* synthetic */ e aj;
    private static /* synthetic */ int[] llIllllIIIl;
    private final /* synthetic */ f ak;

    private static void lIlIlIllllIIIl() {
        llIlllIllIl = new String[llIllllIIIl[3]];
        t.llIlllIllIl[t.llIllllIIIl[0]] = t."Eat";
        t.llIlllIllIl[t.llIllllIIIl[2]] = t."peach";
    }

    private static String lIlIlIlllIlIlI(String var2, String var5) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(llIllllIIIl[3], var8);
            return new String(var11.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIllllIIII(String var15, String var6) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var9 = var6.toCharArray();
        int var12 = llIllllIIIl[0];
        char[] var3 = var15.toCharArray();
        int var13 = var3.length;
        int var7 = llIllllIIIl[0];
        while (t.lIlIlIlllllIll(var7, var13)) {
            char var16 = var3[var7];
            var14.append((char)(var16 ^ var9[var12 % var9.length]));
            0;
            ++var12;
            ++var7;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIlIlIlllllIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlllllIIl(int n2) {
        return n2 == 0;
    }

    static {
        t.lIlIlIllllIllI();
        t.lIlIlIllllIIIl();
    }

    private static boolean lIlIlIlllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t var1;
        if (!t.lIlIlIllllIlll(this.aj.t() ? 1 : 0) || t.lIlIlIllllIlll(this.aj.s() ? 1 : 0)) {
            return llIllllIIIl[0];
        }
        if (!t.lIlIlIlllllIII(Combat.getMissingHealth(), llIllllIIIl[1]) || t.lIlIlIlllllIIl(var1.ak.D() ? 1 : 0)) {
            return llIllllIIIl[0];
        }
        Item var4 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlllIllIl[llIllllIIIl[2]]));
        if (t.lIlIlIlllllIlI(var4)) {
            return llIllllIIIl[0];
        }
        var1_1.interact(llIlllIllIl[llIllllIIIl[0]]);
        this.ak.C();
        return llIllllIIIl[2];
    }

    private static void lIlIlIllllIllI() {
        llIllllIIIl = new int[4];
        t.llIllllIIIl[0] = (0x3A ^ 0x7C) & ~(0xE8 ^ 0xAE);
        t.llIllllIIIl[1] = 0xDD ^ 0xBD ^ (0xE9 ^ 0x81);
        t.llIllllIIIl[2] = 1;
        t.llIllllIIIl[3] = 2;
    }

    private static boolean lIlIlIllllIlll(int n2) {
        return n2 != 0;
    }

    @Inject
    public t(e e2, f f2) {
        this.aj = e2;
        this.ak = f2;
    }
}

