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

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        e var3;
        if ((this.B.fishingTrawler( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.A.EnteringFishingTrawlerTask( != 0) ? 1 : 0)) {
            return 0;
        }
        if (var3.q >= 0) {
            var3.q -= 1;
            return 0;
        }
        int[] nArray = new int[2];
        nArray[0] = 3;
        nArray[1] = 4;
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        int[] nArray2 = new int[1];
        nArray2[0] = 5;
        TileObject var5 = TileObjects.getNearest((int[])nArray2);
        if var4 == null {
            return 0;
        }
        if ((Reachable.isInteractable(LocatablelllllllllllllllIlIlllIIlllIllllI) ? 1 : 0)) {
            return 0;
        }
        if ((Widgets.isVisible(WidgetWidgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_TIMER)) ? 1 : 0)) {
            return 0;
        }
        if ((Reachable.isInteractable((Locatable == 0)var5) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(6, 7, 0));
            0;
            return 1;
        }
        var2_2.interact(var2[0]);
        return 1;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = 0;
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = 0;
        while (var14 < lllllllllllllllIlIlllIIlllIIIllI2) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (((112 + 115 - 128 + 63 ^ 85 + 73 - 76 + 85) & (0x4C ^ 0x5E ^ (0x34 ^ 0x23) ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    @Inject
    public EnteringFishingTrawlerTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.A = squireFisherPlugin;
        this.B = squireFisherConfig;
    }

    static {
        e.var16();
        e.var17();
        z = LoggerFactory.getLogger(EnteringFishingTrawlerTask.class);
    }
}

