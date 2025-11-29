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
package gg.squire.hunter.tasks;

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
import gg.squire.hunter.tasks.BHelper;
import gg.squire.hunter.tasks.GameEnum7;
import gg.squire.hunter.tasks.GameEnum9;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

@TaskDesc(name="Checking Supplies", priority=1337)
public class CheckingSuppliesTask
extends Task {
    private final  b q;
    private final  SquireHerbiboarPlugin o;
    private final  SquireHerbiboarConfig p;

    private static boolean lIIIlIlIlIlllII(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public CheckingSuppliesTask(SquireHerbiboarPlugin squireHerbiboarPlugin, SquireHerbiboarConfig squireHerbiboarConfig, b b2) {
        this.o = squireHerbiboarPlugin;
        this.p = squireHerbiboarConfig;
        this.q = b2;
    }

    private static boolean lIIIlIlIlIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIlIlIllIlI() {
        lllIIllIlIlI = new String[lllIIllIlIll[3]];
        d.lllIIllIlIlI[d.lllIIllIlIll[0]] = "We need to withdraw energy potions from the bank";
        d.lllIIllIlIlI[d.lllIIllIlIll[1]] = "We need to deposit stuff to the bank!";
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIlIlIlIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIlIlIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean run() {
        int var2;
        d var3;
        if (d.lIIIlIlIlIlllII((Object)this.q.i(), (Object)c.STARTING)) {
            return lllIIllIlIll[0];
        }
        e var4 = var3.p.useEnergyRestoration();
        if (d.lIIIlIlIlIlllII((Object)var4, (Object)e.NONE) && d.lIIIlIlIlIlllIl(var2 = Inventory.getCount((int[])var4.j()))) {
            Log.info((String)lllIIllIlIlI[lllIIllIlIll[0]]);
            var3.o.a(lllIIllIlIll[1]);
            return lllIIllIlIll[0];
        }
        if (d.lIIIlIlIlIllllI(Inventory.getFreeSlots(), lllIIllIlIll[2])) {
            Log.info((String)lllIIllIlIlI[lllIIllIlIll[1]]);
            var3.o.a(lllIIllIlIll[1]);
        }
        return lllIIllIlIll[0];
    }

    static {
        d.lIIIlIlIlIllIll();
        d.lIIIlIlIlIllIlI();
    }
}

