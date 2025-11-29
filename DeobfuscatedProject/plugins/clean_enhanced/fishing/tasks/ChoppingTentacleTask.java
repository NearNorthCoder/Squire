/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
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
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Chopping Tentacle")
public class ChoppingTentacleTask
extends Task {
    
    private  int q;
    
    private static final  Logger o;
    private final  SquireFisherConfig p;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        a var9;
        if ((this.p.fishingTrawler( == 0) ? 1 : 0)) {
            return 0;
        }
        if (var9.q >= 0) {
            var9.q -= 1;
            return 0;
        }
        if ((Widgets.isVisible((Widget == 0)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        NPC var10 = NPCs.getNearest((String[])stringArray);
        String[] stringArray2 = new String[1];
        stringArray2[0] = var2[1];
        NPC var11 = NPCs.getNearest((String[])stringArray2);
        if var10 != null {
            return 0;
        }
        if var11 == null {
            return 0;
        }
        if ((var11.getAnimation() == var11.getAnimation()2)) {
            return 0;
        }
        String[] stringArray3 = new String[1];
        stringArray3[0] = var2[3];
        if ((var11.hasAction(stringArray3 == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Players.getLocal().getAnimation() == Players.getLocal().getAnimation()2)) {
            return 0;
        }
        var2_2.interact(var2[5]);
        return 1;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    static {
        a.var18();
        a.var19();
        o = LoggerFactory.getLogger(ChoppingTentacleTask.class);
    }

    @Inject
    public ChoppingTentacleTask(SquireFisherConfig squireFisherConfig) {
        this.p = squireFisherConfig;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = 0;
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = 0;
        while (var28 < lllllllllllllllIlIlllIlllIlIlllI2) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (((121 + 116 - 232 + 172 ^ 79 + 30 - 77 + 143) & (0xE5 ^ 0xBD ^ (0x2D ^ 0x6B) ^ -1) & (2 & (2 ^ -1) ^ -1)) == (2 & (2 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var23);
    }

}

