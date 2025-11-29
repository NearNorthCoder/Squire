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
        c.var3();
        c.var4();
        t = LoggerFactory.getLogger(LootingTask.class);
    }

    @Inject
    public LootingTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.u = squireFisherPlugin;
        this.v = squireFisherConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        c var5;
        if (this.q >= 0) {
            this.q -= 0;
            return 1;
        }
        if ((Widgets.isVisible(WidgetWidgets.get((int)2, (int)3)) ? 1 : 0)) {
            return 1;
        }
        if ((var5.v.fishingTrawler( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((var5.u.e( == 0) ? 1 : 0)) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 4;
        TileObject var6 = TileObjects.getNearest((int[])nArray);
        if var6 == null {
            return 1;
        }
        var1_1.interact(var2[1]);
        this.q = 5;
        return 0;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 1;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 1;
        while (var15 < lllllllllllllllIlIlllIllIlIIIIIl2) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }
}

