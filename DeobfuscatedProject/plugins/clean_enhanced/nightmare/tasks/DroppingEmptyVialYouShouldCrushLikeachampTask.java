/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Dropping Empty Vial (you should crush likeachamp)", priority=0x7FFFFFFF, blocking=false)
public class DroppingEmptyVialYouShouldCrushLikeachampTask
extends Task {
    private static final  Logger dH;
    private final  h dJ;
    
    private final  SquireNightmareConfig dI;

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[3];
        ac.var1[0] = (0xC8 ^ 0x8E) & ~(0x1B ^ 0x5D);
        ac.var1[1] = 1;
        ac.var1[2] = (0xB ^ 0x43) + (0xA2 ^ 0xC2) - (6 ^ 0x45) + (123 + 53 - 106 + 58);
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    static {
        ac.var3();
        dH = LoggerFactory.getLogger(DroppingEmptyVialYouShouldCrushLikeachampTask.class);
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (ac.var5(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        NPC var6 = SquireNightmarePlugin.d();
        if (ac.var4(var6)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[ac.var1[0]] = var1[2];
        List var7 = Inventory.getAll((int[])nArray);
        if (ac.var2(var7.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        ((Item)var2_2.get(var1[0])).drop();
        return var1[1];
    }

    @Inject
    public DroppingEmptyVialYouShouldCrushLikeachampTask(SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dI = squireNightmareConfig;
        this.dJ = h2;
    }
}

