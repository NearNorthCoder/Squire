/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Looting -> LootingTask */
@TaskDesc(name="Looting")
public class LootingTask
extends Task {
    private final /* synthetic */ SquireFisherConfig v;
    private static /* synthetic */ int[] lIlllIlIlIll;
    private /* synthetic */ int q;
    private final /* synthetic */ SquireFisherPlugin u;
    private static final /* synthetic */ Logger t;
    private static /* synthetic */ String[] lIlllIlIlIlI;

    static {
        c.lllIlIllIIlIIl();
        c.lllIlIllIIlIII();
        t = LoggerFactory.getLogger(c.class);
    }

    private static void lllIlIllIIlIII() {
        lIlllIlIlIlI = new String[lIlllIlIlIll[0]];
        c.lIlllIlIlIlI[c.lIlllIlIlIll[1]] = c."Inspect";
    }

    @Inject
    public c(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.u = squireFisherPlugin;
        this.v = squireFisherConfig;
    }

    private static boolean lllIlIllIIlllI(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIlIllIIlIll(int n) {
        return n != 0;
    }

    private static void lllIlIllIIlIIl() {
        lIlllIlIlIll = new int[6];
        c.lIlllIlIlIll[0] = 1;
        c.lIlllIlIlIll[1] = (0x5C ^ 0x77) & ~(0xB3 ^ 0x98);
        c.lIlllIlIlIll[2] = -(0xFFFFBFD9 & 0x6E37) & (0xFFFFAF7F & Short.MAX_VALUE);
        c.lIlllIlIlIll[3] = 7 ^ 0x48 ^ (0x4D ^ 0x14);
        c.lIlllIlIlIll[4] = -(0xFFFF931F & 0x7EED) & (0xFFFFDBFF & 0x3FBF);
        c.lIlllIlIlIll[5] = 7 ^ 0x35;
    }

    private static boolean lllIlIllIIlIlI(int n) {
        return n >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        c var7;
        if (c.lllIlIllIIlIlI(this.q)) {
            this.q -= lIlllIlIlIll[0];
            return lIlllIlIlIll[1];
        }
        if (c.lllIlIllIIlIll(Widgets.isVisible((Widget)Widgets.get((int)lIlllIlIlIll[2], (int)lIlllIlIlIll[3])) ? 1 : 0)) {
            return lIlllIlIlIll[1];
        }
        if (c.lllIlIllIIllII(var7.v.fishingTrawler() ? 1 : 0)) {
            return lIlllIlIlIll[1];
        }
        if (c.lllIlIllIIllII(var7.u.e() ? 1 : 0)) {
            return lIlllIlIlIll[1];
        }
        int[] nArray = new int[lIlllIlIlIll[0]];
        nArray[c.lIlllIlIlIll[1]] = lIlllIlIlIll[4];
        TileObject var1 = TileObjects.getNearest((int[])nArray);
        if (c.lllIlIllIIllIl(var1)) {
            return lIlllIlIlIll[1];
        }
        var1_1.interact(lIlllIlIlIlI[lIlllIlIlIll[1]]);
        this.q = lIlllIlIlIll[5];
        return lIlllIlIlIll[0];
    }

    private static boolean lllIlIllIIllII(int n) {
        return n == 0;
    }

    private static boolean lllIlIllIIllIl(Object object) {
        return object == null;
    }

    private static String lllIlIllIIIlll(String var11, String var4) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var9 = var4.toCharArray();
        int var2 = lIlllIlIlIll[1];
        char[] var8 = var11.toCharArray();
        int var3 = var8.length;
        int var5 = lIlllIlIlIll[1];
        while (c.lllIlIllIIlllI(var5, var3)) {
            char var10 = var8[var5];
            var6.append((char)(var10 ^ var9[var2 % var9.length]));
            0;
            ++var2;
            ++var5;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }
}

