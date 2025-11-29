/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;

@TaskDesc(name="Tethering to mast", priority=0x7FFFFFFE, blocking=true)
public class TetheringToMastTask
extends Task {
    
    private final  SquireTempoross aw;
    private final  SquireTemporossConfig ax;
    private final  a av;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        n var3;
        if (n.var4(this.av.K() ? 1 : 0)) {
            return var1[0];
        }
        if (n.var5(var3.av.k() ? 1 : 0)) {
            return var1[0];
        }
        c var6 = var3.av.N();
        TileObject var7 = var6.W();
        if (n.var8(var7)) {
            return var1[0];
        }
        NPC var9 = var3.aw.a((SceneEntity)var7);
        if (n.var10(var9)) {
            return var3.aw.b((SceneEntity)var7);
        }
        var2_2.interact(var2[var1[0]]);
        return var1[1];
    }

    @Inject
    public TetheringToMastTask(a a2, SquireTemporossConfig squireTemporossConfig, SquireTempoross squireTempoross) {
        this.av = a2;
        this.ax = squireTemporossConfig;
        this.aw = squireTempoross;
    }

    private static void var11() {
        var2 = new String[var1[1]];
        n.var2[n.var1[0]] = "Tether";
    }

    static {
        n.var12();
        n.var11();
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void var12() {
        var1 = new int[3];
        n.var1[0] = (0x8B ^ 0xA1) & ~(0x2B ^ 1);
        n.var1[1] = 1;
        n.var1[2] = 2;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }
}

