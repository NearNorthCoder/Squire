/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum9;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Going to Zulrah (Deathwalk)")
public class GoingToZulrahDeathwalkTask
extends ZulrahTaskBase {

    static {
        N.var2();
    }

    @Override
    public boolean ac() {
        int[] nArray = new int[0];
        nArray[1] = 2;
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (!(this.ah( != 0) ? 1 : 0) || nPC == null) {
            if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
                Movement.walkTo((int)3, (int)4, (int)1);
                0;
            }
            return 0;
        }
        this.al.a(c.COLLECTING_ZULRAH);
        return 1;
    }

    @Inject
    public GoingToZulrahDeathwalkTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.TRANSPORTING_ZULRAH);
    }

}

