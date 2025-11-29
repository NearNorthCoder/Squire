/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.magic.Thralls
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import net.runelite.api.NPC;
import net.unethicalite.api.magic.Thralls;

@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends Task {
    private static  int[] lllIlllll;
    private static  String[] lllIllllI;
    private final  a aP;

    @Inject
    public UsingThrallTask(a a2) {
        this.aP = a2;
    }

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        z var7;
        if ((Thralls.canUse( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var7.aP.k( == null))) {
            return 0;
        }
        NPC var8 = var7.aP.k().y();
        if var8 != null {
            String[] stringArray = new String[1];
            stringArray[0] = lllIllllI[0];
            if ((var8.hasAction(stringArray == 0) ? 1 : 0)) {
                return 0;
            }
        }
        return Thralls.useBestThrall();
    }

}

