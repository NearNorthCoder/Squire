/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Climbing Up Ladder")
public class ClimbingUpLadderTask
extends Task {
    private static final  Logger r;
    private final  SquireFisherConfig s;

    @Inject
    public ClimbingUpLadderTask(SquireFisherConfig squireFisherConfig) {
        this.s = squireFisherConfig;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if ((this.s.fishingTrawler( == 0) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        NPC var9 = NPCs.getNearest((String[])stringArray);
        if ((Widgets.isVisible((Widget == 0)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0)) {
            return 0;
        }
        if var9 == null {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        tileObject.interact(var2[1]);
        return 1;
    }

    static {
        b.var10();
        b.var11();
        r = LoggerFactory.getLogger(ClimbingUpLadderTask.class);
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = 0;
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = 0;
        while (var20 < lllllllllllllllIlIlllIIlIIlllIII2) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (((0x23 ^ 0x38) & ~(0x3D ^ 0x26)) <= 1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

}

