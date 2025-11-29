/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.tasks.GameEnum3;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Killing last minion with ranged")
public class KillingLastMinionWithRangedTask
extends Task {
    private final  Client aw;
    private final  SquireZammyConfig av;
    private final  l au;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z var3;
        if (!(this.au.B( != 0) ? 1 : 0) || (this.au.A( != 0) ? 1 : 0)) {
            return 0;
        }
        if (!(var3.au.H( == 0) ? 1 : 0) || (var3.au.KillingLastMinionWithRangedTask() <= 1)) {
            return 0;
        }
        if ((Players.getLocal( != null).getInteracting())) {
            return 0;
        }
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.isDead( == 0) ? 1 : 0) && (Object != nulle.a(nPC))) {
                n2 = 2;
                0;
                if ((0x48 ^ 0x4C) == ((0x49 ^ 0x45) & ~(0x8B ^ 0x87))) {
                    return ((0x72 ^ 0x75) & ~(9 ^ 0xE)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var4 == null {
            return 0;
        }
        var1_1.interact(var2[0]);
        return 2;
    }

    @Inject
    public KillingLastMinionWithRangedTask(l l2, SquireZammyConfig squireZammyConfig, Client client) {
        this.au = l2;
        this.av = squireZammyConfig;
        this.aw = client;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

}

