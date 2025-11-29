/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
import gg.squire.mining.tasks.GameEnum3;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Mining Daeyalt Essence")
public class MiningDaeyaltEssenceTask
extends Task {
    @Inject
    private  SquireMinerConfig f;

    private static void var3() {
        var1 = new int[5];
        m.var1[0] = 2 & (2 ^ -1);
        m.var1[1] = 0x99 ^ 0x9D;
        m.var1[2] = 1;
        m.var1[3] = 0x72 ^ 0x7A;
        m.var1[4] = 2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.var10((Object)this.f.activity(), (Object)a.DAEYALT)) {
            return var1[0];
        }
        TileObject var11 = g.h();
        if (m.var12(var11)) {
            return var1[0];
        }
        if (m.var13(Players.getLocal().isAnimating() ? 1 : 0)) {
            m var14;
            var14.sleep(var1[1]);
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        this.sleep(var1[1]);
        return var1[2];
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static boolean var10(Object object, Object object2) {
        return object != object2;
    }

    static {
        m.var3();
        m.var15();
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    private static void var15() {
        var2 = new String[var1[2]];
        m.var2[m.var1[0]] = "Mine";
    }
}

