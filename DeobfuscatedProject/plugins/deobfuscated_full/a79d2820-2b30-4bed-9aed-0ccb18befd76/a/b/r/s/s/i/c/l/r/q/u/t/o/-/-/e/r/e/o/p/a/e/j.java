/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.m;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Drinking from pool -> DrinkingfrompoolTask */
@TaskDesc(name="Drinking from pool")
public class j
extends m {
    private static /* synthetic */ int[] lIllIIIIIlIl;
    private static /* synthetic */ String[] lIllIIIIIlII;

    private static String lllIIIllIlllll(String var7, String var1) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var10 = var1.toCharArray();
        int var11 = lIllIIIIIlIl[0];
        char[] var3 = var7.toCharArray();
        int var9 = var3.length;
        int var6 = lIllIIIIIlIl[0];
        while (j.lllIIIlllIIlII(var6, var9)) {
            char var2 = var3[var6];
            var4.append((char)(var2 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var6;
            0;
            if (1 != 3) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean lllIIIlllIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIIIlllIIIII() {
        lIllIIIIIlII = new String[lIllIIIIIlIl[2]];
        j.lIllIIIIIlII[j.lIllIIIIIlIl[0]] = j."Ornate pool of Rejuvenation";
        j.lIllIIIIIlII[j.lIllIIIIIlIl[1]] = j."Drink";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        j var8;
        if (j.lllIIIlllIIIlI(this.l() ? 1 : 0)) {
            return lIllIIIIIlIl[0];
        }
        if (j.lllIIIlllIIIlI(var8.m() ? 1 : 0)) {
            return lIllIIIIIlIl[0];
        }
        String[] stringArray = new String[lIllIIIIIlIl[1]];
        stringArray[j.lIllIIIIIlIl[0]] = lIllIIIIIlII[lIllIIIIIlIl[0]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray);
        if (j.lllIIIlllIIIll(var5)) {
            return lIllIIIIIlIl[0];
        }
        var1_1.interact(lIllIIIIIlII[lIllIIIIIlIl[1]]);
        return lIllIIIIIlIl[1];
    }

    private static boolean lllIIIlllIIIll(Object object) {
        return object == null;
    }

    private static void lllIIIlllIIIIl() {
        lIllIIIIIlIl = new int[3];
        j.lIllIIIIIlIl[0] = (0x75 ^ 0x60 ^ (0xD0 ^ 0xA5)) & (92 + 145 - 40 + 58 ^ 2 + 30 - -84 + 43 ^ -1);
        j.lIllIIIIIlIl[1] = 1;
        j.lIllIIIIIlIl[2] = 2;
    }

    static {
        j.lllIIIlllIIIIl();
        j.lllIIIlllIIIII();
    }
}

