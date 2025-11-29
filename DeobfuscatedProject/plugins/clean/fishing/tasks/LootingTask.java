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
package gg.squire.fishing.tasks;

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

@TaskDesc(name="Looting")
public class LootingTask
extends Task {
    private final  SquireFisherConfig v;
    
    private  int q;
    private final  SquireFisherPlugin u;
    private static final  Logger t;

    static {
        c.lllIlIllIIlIIl();
        c.lllIlIllIIlIII();
        t = LoggerFactory.getLogger(LootingTask.class);
    }

    private static void lllIlIllIIlIII() {
        lIlllIlIlIlI = new String[lIlllIlIlIll[0]];
        c.lIlllIlIlIlI[c.lIlllIlIlIll[1]] = "Inspect";
    }

    @Inject
    public LootingTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.u = squireFisherPlugin;
        this.v = squireFisherConfig;
    }

    private static boolean lllIlIllIIlllI(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIlIllIIlIll(int n) {
        return n != 0;
    }

    private static boolean lllIlIllIIlIlI(int n) {
        return n >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        c var1;
        if (c.lllIlIllIIlIlI(this.q)) {
            this.q -= lIlllIlIlIll[0];
            return lIlllIlIlIll[1];
        }
        if (c.lllIlIllIIlIll(Widgets.isVisible((Widget)Widgets.get((int)lIlllIlIlIll[2], (int)lIlllIlIlIll[3])) ? 1 : 0)) {
            return lIlllIlIlIll[1];
        }
        if (c.lllIlIllIIllII(var1.v.fishingTrawler() ? 1 : 0)) {
            return lIlllIlIlIll[1];
        }
        if (c.lllIlIllIIllII(var1.u.e() ? 1 : 0)) {
            return lIlllIlIlIll[1];
        }
        int[] nArray = new int[lIlllIlIlIll[0]];
        nArray[c.lIlllIlIlIll[1]] = lIlllIlIlIll[4];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (c.lllIlIllIIllIl(var2)) {
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

        return String.valueOf(var3);
    }
}

