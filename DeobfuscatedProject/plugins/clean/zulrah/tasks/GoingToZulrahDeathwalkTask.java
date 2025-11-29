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
import gg.squire.zulrah.tasks.GameEnum40;
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
        N.llIIIlllIIIlIIl();
    }

    private static boolean llIIIlllIIIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        int[] nArray = new int[lIllIIllllIIl[0]];
        nArray[N.lIllIIllllIIl[1]] = lIllIIllllIIl[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (!N.llIIIlllIIIlIlI(this.ah() ? 1 : 0) || N.llIIIlllIIIlIll(nPC)) {
            if (N.llIIIlllIIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)lIllIIllllIIl[3], (int)lIllIIllllIIl[4], (int)lIllIIllllIIl[1]);

            }
            return lIllIIllllIIl[0];
        }
        this.al.a(c.COLLECTING_ZULRAH);
        return lIllIIllllIIl[1];
    }

    @Inject
    public GoingToZulrahDeathwalkTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.TRANSPORTING_ZULRAH);
    }

    private static boolean llIIIlllIIIlIll(Object object) {
        return object == null;
    }
}

