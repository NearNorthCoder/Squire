/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=100, blocking=true)
public class g
extends a {
    private static /* synthetic */ int[] lIlIlllIllII;
    @Inject
    private /* synthetic */ s a;
    private static /* synthetic */ String[] lIlIlllIlIll;

    static {
        g.lllIIIIlllIlII();
        g.lllIIIIlllIIll();
    }

    private static String lllIIIIlllIIlI(String lllllllllllllllIllIIIlllllllIIII, String lllllllllllllllIllIIIllllllIllll) {
        lllllllllllllllIllIIIlllllllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlllllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIlllllllIIll = new StringBuilder();
        char[] lllllllllllllllIllIIIlllllllIIlI = lllllllllllllllIllIIIllllllIllll.toCharArray();
        int lllllllllllllllIllIIIlllllllIIIl = lIlIlllIllII[1];
        char[] lllllllllllllllIllIIIllllllIlIll = lllllllllllllllIllIIIlllllllIIII.toCharArray();
        int lllllllllllllllIllIIIllllllIlIlI = lllllllllllllllIllIIIllllllIlIll.length;
        int lllllllllllllllIllIIIllllllIlIIl = lIlIlllIllII[1];
        while (g.lllIIIIllllIII(lllllllllllllllIllIIIllllllIlIIl, lllllllllllllllIllIIIllllllIlIlI)) {
            char lllllllllllllllIllIIIlllllllIllI = lllllllllllllllIllIIIllllllIlIll[lllllllllllllllIllIIIllllllIlIIl];
            lllllllllllllllIllIIIlllllllIIll.append((char)(lllllllllllllllIllIIIlllllllIllI ^ lllllllllllllllIllIIIlllllllIIlI[lllllllllllllllIllIIIlllllllIIIl % lllllllllllllllIllIIIlllllllIIlI.length]));
            0;
            ++lllllllllllllllIllIIIlllllllIIIl;
            ++lllllllllllllllIllIIIllllllIlIIl;
            0;
            if (((0xBC ^ 0x89 ^ (0x80 ^ 0x8A)) & (0x88 ^ 0xC4 ^ (0xFB ^ 0x88) ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIlllllllIIll);
    }

    private static void lllIIIIlllIIll() {
        lIlIlllIlIll = new String[lIlIlllIllII[3]];
        g.lIlIlllIlIll[g.lIlIlllIllII[1]] = g."Eat";
        g.lIlIlllIlIll[g.lIlIlllIllII[2]] = g."Eat";
    }

    private static boolean lllIIIIlllIllI(Object object) {
        return object == null;
    }

    private static boolean lllIIIIlllIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIIIIlllIlII() {
        lIlIlllIllII = new int[4];
        g.lIlIlllIllII[0] = -1;
        g.lIlIlllIllII[1] = (134 + 167 - 212 + 134 ^ 121 + 73 - 132 + 89) & (0xDA ^ 0xB9 ^ (0x38 ^ 0x13) ^ -1);
        g.lIlIlllIllII[2] = 1;
        g.lIlIlllIllII[3] = 2;
    }

    private static boolean lllIIIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        g lllllllllllllllIllIIlIIIIIIIIIIl;
        if (g.lllIIIIlllIlIl(this.a.u(), lIlIlllIllII[0])) {
            return lIlIlllIllII[1];
        }
        Item lllllllllllllllIllIIlIIIIIIIIIII = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlllIllII[2]];
            stringArray[g.lIlIlllIllII[1]] = lIlIlllIlIll[lIlIlllIllII[2]];
            return item.hasAction(stringArray);
        });
        if (g.lllIIIIlllIllI(lllllllllllllllIllIIlIIIIIIIIIII)) {
            return lIlIlllIllII[1];
        }
        if (g.lllIIIIlllIlll(Combat.getCurrentHealth(), lllllllllllllllIllIIlIIIIIIIIIIl.o.eatAt())) {
            return lIlIlllIllII[1];
        }
        var1_1.interact(lIlIlllIlIll[lIlIlllIllII[1]]);
        return lIlIlllIllII[2];
    }

    private static boolean lllIIIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }
}

