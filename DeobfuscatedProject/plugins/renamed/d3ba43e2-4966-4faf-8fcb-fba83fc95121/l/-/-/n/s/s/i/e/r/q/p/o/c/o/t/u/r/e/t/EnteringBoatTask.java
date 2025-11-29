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
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.a_Unknown;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.CEnum;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/* TASK: Entering Boat -> EnteringboatTask */
@TaskDesc(name="Entering Boat")
public class EnteringBoatTask
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
        void var6;
        if (g.lIIlllllllIlIll((Object)c2)) {
            return lIIIlIlIIlIlI[0];
        }
        int[] nArray = new int[lIIIlIlIIlIlI[1]];
        nArray[g.lIIIlIlIIlIlI[0]] = var6.l();
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (g.lIIlllllllIlIll(var2)) {
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

    private static String lIIlllllllIIllI(String var4, String var9) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var1 = lIIIlIlIIlIlI[0];
        char[] var3 = var4.toCharArray();
        int var5 = var3.length;
        int var7 = lIIIlIlIIlIlI[0];
        while (g.lIIlllllllIllIl(var7, var5)) {
            char var10 = var3[var7];
            var8.append((char)(var10 ^ var11[var1 % var11.length]));
            0;
            ++var1;
            ++var7;
            0;
            if ((0x10 ^ 0x1F ^ (0x1E ^ 0x14)) > 0) continue;
            return null;
        }
        return String.valueOf(var8);
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
                return false;
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

