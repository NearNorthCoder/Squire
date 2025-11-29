/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Tick-eating boss trample", priority=10)
public class TickeatingBossTrampleTask
extends GauntletTaskBase {
    private final  b bI;
    
    private  int bJ;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var11;
        z var12;
        Player player = Players.getLocal();
        if (z.var13(player)) {
            return var2[1];
        }
        Item var14 = Inventory.getFirst(item -> e.aH.contains(item.getId()));
        if (z.var13(var14)) {
            return var2[1];
        }
        NPC var15 = var12.ba.X().aI();
        if (z.var13(var15)) {
            return var2[1];
        }
        if (z.var9(var15.getWorldArea().contains(var11.getWorldLocation()) ? 1 : 0)) {
            var12.bJ = Static.getClient().getTickCount();
            return var2[1];
        }
        if (z.var16(var15.getAnimation(), var2[2])) {
            return var2[1];
        }
        if (z.var10(Static.getClient().getTickCount() - var12.bJ, var2[3])) {
            var14.interact(var1[var2[1]]);
            var12.bI.u();
            return var2[0];
        }
        return var2[1];
    }

    static {
        z.var17();
        z.var18();
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

    private static void var18() {
        var1 = new String[var2[0]];
        z.var1[z.var2[1]] = "Eat";
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    private static void var17() {
        var2 = new int[6];
        z.var2[0] = 1;
        z.var2[1] = (0x2F ^ 0x71) & ~(0xDD ^ 0x83);
        z.var2[2] = -(0xFFFFF73F & 0x4EDD) & (0xFFFFE7FF & 0x7EFE);
        z.var2[3] = 0xB8 ^ 0xB2;
        z.var2[4] = 0x7A ^ 0x28 ^ (0x1B ^ 0x41);
        z.var2[5] = 2;
    }

    @Inject
    public TickeatingBossTrampleTask(c c2, b b2) {
        d[] dArray = new d[var2[0]];
        dArray[z.var2[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bI = b2;
    }
}

