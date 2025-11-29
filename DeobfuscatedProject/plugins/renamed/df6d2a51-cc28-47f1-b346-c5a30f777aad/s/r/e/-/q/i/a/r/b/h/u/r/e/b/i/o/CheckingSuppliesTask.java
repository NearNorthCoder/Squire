/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.b_Unknown;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.CEnum;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.EEnum;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

/* TASK: Checking Supplies -> CheckingsuppliesTask */
@TaskDesc(name="Checking Supplies", priority=1337)
public class CheckingSuppliesTask
extends Task {
    private final /* synthetic */ b q;
    private final /* synthetic */ SquireHerbiboarPlugin o;
    private final /* synthetic */ SquireHerbiboarConfig p;
    private static /* synthetic */ String[] lllIIllIlIlI;
    private static /* synthetic */ int[] lllIIllIlIll;

    private static boolean lIIIlIlIlIlllII(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public d(SquireHerbiboarPlugin squireHerbiboarPlugin, SquireHerbiboarConfig squireHerbiboarConfig, b b2) {
        this.o = squireHerbiboarPlugin;
        this.p = squireHerbiboarConfig;
        this.q = b2;
    }

    private static void lIIIlIlIlIllIll() {
        lllIIllIlIll = new int[4];
        d.lllIIllIlIll[0] = (0x62 ^ 0x57) & ~(2 ^ 0x37);
        d.lllIIllIlIll[1] = 1;
        d.lllIIllIlIll[2] = 0xF ^ 0x2D ^ (0xBD ^ 0x9A);
        d.lllIIllIlIll[3] = 2;
    }

    private static boolean lIIIlIlIlIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIlIlIllIlI() {
        lllIIllIlIlI = new String[lllIIllIlIll[3]];
        d.lllIIllIlIlI[d.lllIIllIlIll[0]] = d."We need to withdraw energy potions from the bank";
        d.lllIIllIlIlI[d.lllIIllIlIll[1]] = d."We need to deposit stuff to the bank!";
    }

    private static String lIIIlIlIlIllIII(String var3, String var11) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var4 = var11.toCharArray();
        int var16 = lllIIllIlIll[0];
        char[] var14 = var3.toCharArray();
        int var5 = var14.length;
        int var1 = lllIIllIlIll[0];
        while (d.lIIIlIlIlIlllll(var1, var5)) {
            char var6 = var14[var1];
            var12.append((char)(var6 ^ var4[var16 % var4.length]));
            0;
            ++var16;
            ++var1;
            0;
            if ((0x50 ^ 0x55) > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean lIIIlIlIlIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIlIlIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean run() {
        int var17;
        d var8;
        if (d.lIIIlIlIlIlllII((Object)this.q.i(), (Object)c.STARTING)) {
            return lllIIllIlIll[0];
        }
        e var15 = var8.p.useEnergyRestoration();
        if (d.lIIIlIlIlIlllII((Object)var15, (Object)e.NONE) && d.lIIIlIlIlIlllIl(var17 = Inventory.getCount((int[])var15.j()))) {
            Log.info((String)lllIIllIlIlI[lllIIllIlIll[0]]);
            var8.o.a(lllIIllIlIll[1]);
            return lllIIllIlIll[0];
        }
        if (d.lIIIlIlIlIllllI(Inventory.getFreeSlots(), lllIIllIlIll[2])) {
            Log.info((String)lllIIllIlIlI[lllIIllIlIll[1]]);
            var8.o.a(lllIIllIlIll[1]);
        }
        return lllIIllIlIll[0];
    }

    private static String lIIIlIlIlIllIIl(String var10, String var2) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lllIIllIlIll[3], var13);
            return new String(var9.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    static {
        d.lIIIlIlIlIllIll();
        d.lIIIlIlIlIllIlI();
    }
}

