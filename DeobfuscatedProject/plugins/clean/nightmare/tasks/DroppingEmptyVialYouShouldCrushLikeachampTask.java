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

    private static boolean lIIIllIlIIlllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIlIIlllII(Object object) {
        return object == null;
    }

    static {
        ac.lIIIllIlIIllIlI();
        dH = LoggerFactory.getLogger(DroppingEmptyVialYouShouldCrushLikeachampTask.class);
    }

    private static boolean lIIIllIlIIllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (ac.lIIIllIlIIllIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lllIllIlIlII[0];
        }
        NPC var1 = SquireNightmarePlugin.d();
        if (ac.lIIIllIlIIlllII(var1)) {
            return lllIllIlIlII[0];
        }
        int[] nArray = new int[lllIllIlIlII[1]];
        nArray[ac.lllIllIlIlII[0]] = lllIllIlIlII[2];
        List var2 = Inventory.getAll((int[])nArray);
        if (ac.lIIIllIlIIlllIl(var2.isEmpty() ? 1 : 0)) {
            return lllIllIlIlII[0];
        }
        ((Item)var2_2.get(lllIllIlIlII[0])).drop();
        return lllIllIlIlII[1];
    }

    @Inject
    public DroppingEmptyVialYouShouldCrushLikeachampTask(SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dI = squireNightmareConfig;
        this.dJ = h2;
    }
}

