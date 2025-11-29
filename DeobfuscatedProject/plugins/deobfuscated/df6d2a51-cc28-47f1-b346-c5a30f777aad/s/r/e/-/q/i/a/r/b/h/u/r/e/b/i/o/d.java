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
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.b;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.c;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.e;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

@TaskDesc(name="Checking Supplies", priority=1337)
public class d
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

    private static String lIIIlIlIlIllIII(String lllllllllllllllIIllIIlllllllIIII, String lllllllllllllllIIllIIllllllIllll) {
        lllllllllllllllIIllIIlllllllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllllllIlllI = new StringBuilder();
        char[] lllllllllllllllIIllIIllllllIllIl = lllllllllllllllIIllIIllllllIllll.toCharArray();
        int lllllllllllllllIIllIIllllllIllII = lllIIllIlIll[0];
        char[] lllllllllllllllIIllIIllllllIIllI = lllllllllllllllIIllIIlllllllIIII.toCharArray();
        int lllllllllllllllIIllIIllllllIIlIl = lllllllllllllllIIllIIllllllIIllI.length;
        int lllllllllllllllIIllIIllllllIIlII = lllIIllIlIll[0];
        while (d.lIIIlIlIlIlllll(lllllllllllllllIIllIIllllllIIlII, lllllllllllllllIIllIIllllllIIlIl)) {
            char lllllllllllllllIIllIIlllllllIIIl = lllllllllllllllIIllIIllllllIIllI[lllllllllllllllIIllIIllllllIIlII];
            lllllllllllllllIIllIIllllllIlllI.append((char)(lllllllllllllllIIllIIlllllllIIIl ^ lllllllllllllllIIllIIllllllIllIl[lllllllllllllllIIllIIllllllIllII % lllllllllllllllIIllIIllllllIllIl.length]));
            0;
            ++lllllllllllllllIIllIIllllllIllII;
            ++lllllllllllllllIIllIIllllllIIlII;
            0;
            if ((0x50 ^ 0x55) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIllllllIlllI);
    }

    private static boolean lIIIlIlIlIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIlIlIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean run() {
        int lllllllllllllllIIllIIllllllllIll;
        d lllllllllllllllIIllIIlllllllllIl;
        if (d.lIIIlIlIlIlllII((Object)this.q.i(), (Object)c.STARTING)) {
            return lllIIllIlIll[0];
        }
        e lllllllllllllllIIllIIlllllllllII = lllllllllllllllIIllIIlllllllllIl.p.useEnergyRestoration();
        if (d.lIIIlIlIlIlllII((Object)lllllllllllllllIIllIIlllllllllII, (Object)e.NONE) && d.lIIIlIlIlIlllIl(lllllllllllllllIIllIIllllllllIll = Inventory.getCount((int[])lllllllllllllllIIllIIlllllllllII.j()))) {
            Log.info((String)lllIIllIlIlI[lllIIllIlIll[0]]);
            lllllllllllllllIIllIIlllllllllIl.o.a(lllIIllIlIll[1]);
            return lllIIllIlIll[0];
        }
        if (d.lIIIlIlIlIllllI(Inventory.getFreeSlots(), lllIIllIlIll[2])) {
            Log.info((String)lllIIllIlIlI[lllIIllIlIll[1]]);
            lllllllllllllllIIllIIlllllllllIl.o.a(lllIIllIlIll[1]);
        }
        return lllIIllIlIll[0];
    }

    private static String lIIIlIlIlIllIIl(String lllllllllllllllIIllIIlllllIllIll, String lllllllllllllllIIllIIlllllIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlllllIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlllllIlllIl.init(lllIIllIlIll[3], lllllllllllllllIIllIIlllllIllllI);
            return new String(lllllllllllllllIIllIIlllllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlllllIlllII) {
            lllllllllllllllIIllIIlllllIlllII.printStackTrace();
            return null;
        }
    }

    static {
        d.lIIIlIlIlIllIll();
        d.lIIIlIlIlIllIlI();
    }
}

