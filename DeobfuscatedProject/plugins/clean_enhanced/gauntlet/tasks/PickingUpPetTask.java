/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.gauntlet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import gg.squire.gauntlet.tasks.GauntletManager;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Picking up pet", priority=250, blocking=true)
public class PickingUpPetTask
extends Task {
    private final  c bw;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.bw.A( != 0) ? 1 : 0)) {
            return 0;
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            if ((Players.getLocal( != 0).equals(nPC.getInteracting()) ? 1 : 0) && (nPC.hasAction(var2[1]::equals != 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if (((115 + 126 - 192 + 123 ^ 79 + 77 - 60 + 58) & (0xF0 ^ 0xA6 ^ (0xD6 ^ 0xB6) ^ -1)) > 0) {
                    return ((0x7F ^ 0x4F ^ (0xA8 ^ 0xC2)) & (0x86 ^ 0xB0 ^ (0x66 ^ 0xA) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var3 == null {
            return 0;
        }
        var1_1.interact(var2[0]);
        return 1;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public PickingUpPetTask(c c2) {
        this.bw = c2;
    }
}

