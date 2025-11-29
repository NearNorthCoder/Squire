/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Entering Fishing Trawler -> EnteringfishingtrawlerTask */
@TaskDesc(name="Entering Fishing Trawler")
public class e
extends Task {
    private static /* synthetic */ int[] lIlllIlllIll;
    private final /* synthetic */ SquireFisherPlugin A;
    private final /* synthetic */ SquireFisherConfig B;
    private /* synthetic */ int q;
    private static /* synthetic */ String[] lIlllIlllIlI;
    private static final /* synthetic */ Logger z;

    private static boolean lllIllIIIlIIII(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        e var5;
        if (e.lllIllIIIIllII(this.B.fishingTrawler() ? 1 : 0)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIllIl(var5.A.e() ? 1 : 0)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIlllI(var5.q)) {
            var5.q -= lIlllIlllIll[1];
            return lIlllIlllIll[0];
        }
        int[] nArray = new int[lIlllIlllIll[2]];
        nArray[e.lIlllIlllIll[0]] = lIlllIlllIll[3];
        nArray[e.lIlllIlllIll[1]] = lIlllIlllIll[4];
        TileObject var6 = TileObjects.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlllIlllIll[1]];
        nArray2[e.lIlllIlllIll[0]] = lIlllIlllIll[5];
        TileObject var4 = TileObjects.getNearest((int[])nArray2);
        if (e.lllIllIIIIllll(var6)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIllIl(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIllIl(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_TIMER)) ? 1 : 0)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIllII(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIlllIlllIll[6], lIlllIlllIll[7], lIlllIlllIll[0]));
            0;
            return lIlllIlllIll[1];
        }
        var2_2.interact(lIlllIlllIlI[lIlllIlllIll[0]]);
        return lIlllIlllIll[1];
    }

    private static void lllIllIIIIlIlI() {
        lIlllIlllIlI = new String[lIlllIlllIll[1]];
        e.lIlllIlllIlI[e.lIlllIlllIll[0]] = e."Cross";
    }

    private static boolean lllIllIIIIllII(int n) {
        return n == 0;
    }

    private static boolean lllIllIIIIllll(Object object) {
        return object == null;
    }

    private static String lllIllIIIIlIIl(String var10, String var3) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var8 = var3.toCharArray();
        int var2 = lIlllIlllIll[0];
        char[] var1 = var10.toCharArray();
        int var7 = var1.length;
        int var11 = lIlllIlllIll[0];
        while (e.lllIllIIIlIIII(var11, var7)) {
            char var9 = var1[var11];
            var12.append((char)(var9 ^ var8[var2 % var8.length]));
            0;
            ++var2;
            ++var11;
            0;
            if (((112 + 115 - 128 + 63 ^ 85 + 73 - 76 + 85) & (0x4C ^ 0x5E ^ (0x34 ^ 0x23) ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    public e(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.A = squireFisherPlugin;
        this.B = squireFisherConfig;
    }

    private static boolean lllIllIIIIllIl(int n) {
        return n != 0;
    }

    private static void lllIllIIIIlIll() {
        lIlllIlllIll = new int[8];
        e.lIlllIlllIll[0] = (0x99 ^ 0xC6) & ~(0x4E ^ 0x11);
        e.lIlllIlllIll[1] = 1;
        e.lIlllIlllIll[2] = 2;
        e.lIlllIlllIll[3] = -(0xFFFFDBB3 & 0x6FCD) & (0xFFFFDBEB & 0x7FBF);
        e.lIlllIlllIll[4] = -2 & (0xFFFFCFDF & 0x3FFD);
        e.lIlllIlllIll[5] = 0xFFFF9B79 & 0x77F7;
        e.lIlllIlllIll[6] = 0xFFFFBEF7 & 0x4B7C;
        e.lIlllIlllIll[7] = 0xFFFF9DE6 & 0x6E7B;
    }

    private static boolean lllIllIIIIlllI(int n) {
        return n >= 0;
    }

    static {
        e.lllIllIIIIlIll();
        e.lllIllIIIIlIlI();
        z = LoggerFactory.getLogger(e.class);
    }
}

