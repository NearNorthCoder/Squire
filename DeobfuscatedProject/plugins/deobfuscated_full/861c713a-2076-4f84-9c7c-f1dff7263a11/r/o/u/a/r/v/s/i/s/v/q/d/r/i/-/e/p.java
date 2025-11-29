/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

/* TASK: Start Fight -> StartfightTask */
@TaskDesc(name="Start Fight", priority=10000, blocking=true)
public class p
extends a {
    private static /* synthetic */ int[] lIlIlIIlllIll;
    private static /* synthetic */ String[] lIlIlIIlllIlI;

    @Override
    public boolean l() {
        p var4;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIlllII(this.z ? 1 : 0)) {
            return lIlIlIIlllIll[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIlllIl(var4.x.getInteracting()) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIlllII(var4.x.getInteracting().getName().equals(lIlIlIIlllIlI[lIlIlIIlllIll[0]]) ? 1 : 0)) {
            return lIlIlIIlllIll[1];
        }
        int var8 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIlIIlllIll[1]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[0]] = lIlIlIIlllIlI[lIlIlIIlllIll[2]];
            return item.hasAction(stringArray);
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIllllI(var8, var4.t.food())) {
            var4.s.c(lIlIlIIlllIll[1]);
            return lIlIlIIlllIll[0];
        }
        this.y.interact(lIlIlIIlllIlI[lIlIlIIlllIll[1]]);
        return lIlIlIIlllIll[1];
    }

    private static void lIlllllIIIllIll() {
        lIlIlIIlllIll = new int[4];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[0] = (0x2E ^ 0x32) & ~(6 ^ 0x1A);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[1] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[2] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[3] = 3;
    }

    private static boolean lIlllllIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllllIIIllIIl(String var5, String var11) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var7 = var11.toCharArray();
        int var10 = lIlIlIIlllIll[0];
        char[] var6 = var5.toCharArray();
        int var2 = var6.length;
        int var1 = lIlIlIIlllIll[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIllllI(var1, var2)) {
            char var9 = var6[var1];
            var3.append((char)(var9 ^ var7[var10 % var7.length]));
            0;
            ++var10;
            ++var1;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    private static void lIlllllIIIllIlI() {
        lIlIlIIlllIlI = new String[lIlIlIIlllIll[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p."Vardorvis";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p."Attack";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlIlIIlllIll[2]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p."Eat";
    }

    @Inject
    protected p(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIllIll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.lIlllllIIIllIlI();
    }

    private static boolean lIlllllIIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllIIIlllIl(Object object) {
        return object != null;
    }
}

