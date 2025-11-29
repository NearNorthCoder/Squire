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

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a_Unknown;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=100, blocking=true)
public class EatingFoodTask
extends a_Unknown {
    private static /* synthetic */ int[] lIlIlllIllII;
    @Inject
    private /* synthetic */ s a;
    private static /* synthetic */ String[] lIlIlllIlIll;

    static {
        g.lllIIIIlllIlII();
        g.lllIIIIlllIIll();
    }

    private static String lllIIIIlllIIlI(String var6, String var10) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var1 = var10.toCharArray();
        int var11 = lIlIlllIllII[1];
        char[] var2 = var6.toCharArray();
        int var9 = var2.length;
        int var3 = lIlIlllIllII[1];
        while (g.lllIIIIllllIII(var3, var9)) {
            char var4 = var2[var3];
            var5.append((char)(var4 ^ var1[var11 % var1.length]));
            0;
            ++var11;
            ++var3;
            0;
            if (((0xBC ^ 0x89 ^ (0x80 ^ 0x8A)) & (0x88 ^ 0xC4 ^ (0xFB ^ 0x88) ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var5);
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
        g var7;
        if (g.lllIIIIlllIlIl(this.a.u(), lIlIlllIllII[0])) {
            return lIlIlllIllII[1];
        }
        Item var8 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlllIllII[2]];
            stringArray[g.lIlIlllIllII[1]] = lIlIlllIlIll[lIlIlllIllII[2]];
            return item.hasAction(stringArray);
        });
        if (g.lllIIIIlllIllI(var8)) {
            return lIlIlllIllII[1];
        }
        if (g.lllIIIIlllIlll(Combat.getCurrentHealth(), var7.o.eatAt())) {
            return lIlIlllIllII[1];
        }
        var1_1.interact(lIlIlllIlIll[lIlIlllIllII[1]]);
        return lIlIlllIllII[2];
    }

    private static boolean lllIIIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }
}

