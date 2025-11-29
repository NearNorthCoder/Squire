/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.a;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.c;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering Boat")
public class g
extends Task {
    private static /* synthetic */ String[] lIIIlIlIIlIIl;
    private final /* synthetic */ a q;
    private /* synthetic */ int r;
    private static /* synthetic */ int[] lIIIlIlIIlIlI;

    private static boolean lIIlllllllIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIlllllllIllII(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(c c2) {
        void var2_2;
        void lllllllllllllllIIIIlllIIllIllIII;
        if (g.lIIlllllllIlIll((Object)c2)) {
            return lIIIlIlIIlIlI[0];
        }
        int[] nArray = new int[lIIIlIlIIlIlI[1]];
        nArray[g.lIIIlIlIIlIlI[0]] = lllllllllllllllIIIIlllIIllIllIII.l();
        TileObject lllllllllllllllIIIIlllIIllIlIlll = TileObjects.getNearest((int[])nArray);
        if (g.lIIlllllllIlIll(lllllllllllllllIIIIlllIIllIlIlll)) {
            return lIIIlIlIIlIlI[0];
        }
        var2_2.interact(lIIIlIlIIlIIl[lIIIlIlIIlIlI[0]]);
        this.r = lIIIlIlIIlIlI[1];
        a.l = this.q.h();
        return lIIIlIlIIlIlI[1];
    }

    private static void lIIlllllllIIlll() {
        lIIIlIlIIlIIl = new String[lIIIlIlIIlIlI[1]];
        g.lIIIlIlIIlIIl[g.lIIIlIlIIlIlI[0]] = g."Cross";
    }

    static {
        g.lIIlllllllIlIII();
        g.lIIlllllllIIlll();
    }

    private static String lIIlllllllIIllI(String lllllllllllllllIIIIlllIIllIIIlIl, String lllllllllllllllIIIIlllIIllIIIlII) {
        lllllllllllllllIIIIlllIIllIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIIllIIlIII = new StringBuilder();
        char[] lllllllllllllllIIIIlllIIllIIIlll = lllllllllllllllIIIIlllIIllIIIlII.toCharArray();
        int lllllllllllllllIIIIlllIIllIIIllI = lIIIlIlIIlIlI[0];
        char[] lllllllllllllllIIIIlllIIllIIIIII = lllllllllllllllIIIIlllIIllIIIlIl.toCharArray();
        int lllllllllllllllIIIIlllIIlIllllll = lllllllllllllllIIIIlllIIllIIIIII.length;
        int lllllllllllllllIIIIlllIIlIlllllI = lIIIlIlIIlIlI[0];
        while (g.lIIlllllllIllIl(lllllllllllllllIIIIlllIIlIlllllI, lllllllllllllllIIIIlllIIlIllllll)) {
            char lllllllllllllllIIIIlllIIllIIlIll = lllllllllllllllIIIIlllIIllIIIIII[lllllllllllllllIIIIlllIIlIlllllI];
            lllllllllllllllIIIIlllIIllIIlIII.append((char)(lllllllllllllllIIIIlllIIllIIlIll ^ lllllllllllllllIIIIlllIIllIIIlll[lllllllllllllllIIIIlllIIllIIIllI % lllllllllllllllIIIIlllIIllIIIlll.length]));
            0;
            ++lllllllllllllllIIIIlllIIllIIIllI;
            ++lllllllllllllllIIIIlllIIlIlllllI;
            0;
            if ((0x10 ^ 0x1F ^ (0x1E ^ 0x14)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlllIIllIIlIII);
    }

    public boolean run() {
        if (g.lIIlllllllIlIIl(this.t() ? 1 : 0)) {
            return lIIIlIlIIlIlI[0];
        }
        return this.a(this.q.g());
    }

    private static boolean lIIlllllllIllIl(int n, int n2) {
        return n < n2;
    }

    @Inject
    public g(a a2) {
        this.q = a2;
    }

    private static boolean lIIlllllllIlIIl(int n) {
        return n == 0;
    }

    private static void lIIlllllllIlIII() {
        lIIIlIlIIlIlI = new int[2];
        g.lIIIlIlIIlIlI[0] = (0xF7 ^ 0x95) & ~(0xE4 ^ 0x86);
        g.lIIIlIlIIlIlI[1] = 1;
    }

    private boolean t() {
        int n;
        if (g.lIIlllllllIlIIl(this.q.f() ? 1 : 0) && g.lIIlllllllIlIlI(Movement.shouldWalk() ? 1 : 0) && g.lIIlllllllIlIlI(this.u() ? 1 : 0) && g.lIIlllllllIlIIl(this.q.e() ? 1 : 0)) {
            n = lIIIlIlIIlIlI[1];
            0;
            if ((0x64 ^ 0x61) == 0) {
                return ((0xFB ^ 0xBD) & ~(0x23 ^ 0x65)) != 0;
            }
        } else {
            n = lIIIlIlIIlIlI[0];
        }
        return n != 0;
    }

    private boolean u() {
        if (g.lIIlllllllIllII(this.r, lIIIlIlIIlIlI[1])) {
            this.r -= lIIIlIlIIlIlI[1];
            return lIIIlIlIIlIlI[0];
        }
        return lIIIlIlIIlIlI[1];
    }

    private static boolean lIIlllllllIlIlI(int n) {
        return n != 0;
    }
}

