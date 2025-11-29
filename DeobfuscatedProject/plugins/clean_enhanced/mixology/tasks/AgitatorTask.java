/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.mixology.tasks.GameEnum6;
import gg.squire.mixology.tasks.GameEnum7;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="Agitator task")
public class AgitatorTask
extends Task {
    
    private final  SquireMixologyConfig R;
    
    final  int Q = 5674;

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public AgitatorTask(SquireMixologyConfig squireMixologyConfig) {
        this.Q = var1[0];
        this.R = squireMixologyConfig;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    static {
        j.var5();
        j.var6();
    }

    private static boolean var7(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        j var8;
        if (j.var4(s.e() ? 1 : 0)) {
            return var1[1];
        }
        if (j.var7((Object)var8.R.pluginMode(), (Object)d.MINIGAME)) {
            return var1[1];
        }
        if (j.var4(s.a(var1[2], var1[3], var1[4]) ? 1 : 0)) {
            return var1[1];
        }
        if (j.var4(Players.getLocal().isIdle() ? 1 : 0)) {
            return var1[1];
        }
        if (j.var9((Object)var8.R.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (j.var4(s.g() ? 1 : 0) && j.var10(Vars.getBit((int)var1[3]), var1[5])) {
                return var1[1];
            }
            s.AgitatorTask();
            if (j.var3(SquireMixology.x, var1[0])) {
                return var1[1];
            }
        }
        if (j.var7((Object)var8.R.potionStrategy(), (Object)f.MULTI_ORDER) && j.var3(SquireMixology.r, var1[0])) {
            return var1[1];
        }
        SquireMixology.g = var2[var1[1]];
        int[] nArray = new int[var1[5]];
        nArray[j.var1[1]] = var1[4];
        TileObjects.getNearest((int[])nArray).interact(var1[1]);
        return var1[1];
    }

    private static void var6() {
        var2 = new String[var1[5]];
        j.var2[j.var1[1]] = "Homogenising";
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var9(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var1 = new int[7];
        j.var1[0] = -(0xFFFFEFE2 & 0x719F) & (0xFFFFFFFB & 0x77AF);
        j.var1[1] = (0x7A ^ 0x2D) & ~(0xFD ^ 0xAA);
        j.var1[2] = 0xFFFF8F8A & 0x7BFF;
        j.var1[3] = 0xFFFFAC49 & 0x7FF7;
        j.var1[4] = 0xFFFFFCDF & 0xDB7E;
        j.var1[5] = 1;
        j.var1[6] = 2;
    }
}

