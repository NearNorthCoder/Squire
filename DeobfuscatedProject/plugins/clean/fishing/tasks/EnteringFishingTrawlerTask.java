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
package gg.squire.fishing.tasks;

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

@TaskDesc(name="Entering Fishing Trawler")
public class EnteringFishingTrawlerTask
extends Task {
    
    private final  SquireFisherPlugin A;
    private final  SquireFisherConfig B;
    private  int q;
    
    private static final  Logger z;

    private static boolean lllIllIIIlIIII(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        e var1;
        if (e.lllIllIIIIllII(this.B.fishingTrawler() ? 1 : 0)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIllIl(var1.A.EnteringFishingTrawlerTask() ? 1 : 0)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIlllI(var1.q)) {
            var1.q -= lIlllIlllIll[1];
            return lIlllIlllIll[0];
        }
        int[] nArray = new int[lIlllIlllIll[2]];
        nArray[e.lIlllIlllIll[0]] = lIlllIlllIll[3];
        nArray[e.lIlllIlllIll[1]] = lIlllIlllIll[4];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlllIlllIll[1]];
        nArray2[e.lIlllIlllIll[0]] = lIlllIlllIll[5];
        TileObject var3 = TileObjects.getNearest((int[])nArray2);
        if (e.lllIllIIIIllll(var2)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIllIl(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIllIl(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_TIMER)) ? 1 : 0)) {
            return lIlllIlllIll[0];
        }
        if (e.lllIllIIIIllII(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIlllIlllIll[6], lIlllIlllIll[7], lIlllIlllIll[0]));

            return lIlllIlllIll[1];
        }
        var2_2.interact(lIlllIlllIlI[lIlllIlllIll[0]]);
        return lIlllIlllIll[1];
    }

    private static void lllIllIIIIlIlI() {
        lIlllIlllIlI = new String[lIlllIlllIll[1]];
        e.lIlllIlllIlI[e.lIlllIlllIll[0]] = "Cross";
    }

    private static boolean lllIllIIIIllII(int n) {
        return n == 0;
    }

    private static boolean lllIllIIIIllll(Object object) {
        return object == null;
    }

        return String.valueOf(var4);
    }

    @Inject
    public EnteringFishingTrawlerTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.A = squireFisherPlugin;
        this.B = squireFisherConfig;
    }

    private static boolean lllIllIIIIllIl(int n) {
        return n != 0;
    }

    private static boolean lllIllIIIIlllI(int n) {
        return n >= 0;
    }

    static {
        e.lllIllIIIIlIll();
        e.lllIllIIIIlIlI();
        z = LoggerFactory.getLogger(EnteringFishingTrawlerTask.class);
    }
}

