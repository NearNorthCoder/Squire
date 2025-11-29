/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.WorldLocation
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import com.openosrs.client.game.WorldLocation;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.BankingTask;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking to bank", priority=79)
public class WalkingToBankTask
extends BankingTask {

    @Override
    public boolean run() {
        q var1;
        if (q.lIllllllllIIlIl(this.S() ? 1 : 0)) {
            return lIlIlIlllIIll[0];
        }
        if (q.lIllllllllIIllI(var1.bU.c() ? 1 : 0)) {
            return lIlIlIlllIIll[0];
        }
        if (q.lIllllllllIIlIl(var1.R() ? 1 : 0)) {
            return lIlIlIlllIIll[0];
        }
        if (q.lIllllllllIIlIl(House.isInside() ? 1 : 0) && q.lIllllllllIIlll(House.getJewelryBox())) {
            return lIlIlIlllIIll[0];
        }
        if (q.lIllllllllIIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIlIlllIIll[1];
        }
        Movement.walkTo((WorldPoint)WorldLocation.FEROX_ENCLAVE.getWorldArea().getCenter());

        return lIlIlIlllIIll[1];
    }

    private static boolean lIllllllllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllllIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllllIIlll(Object object) {
        return object != null;
    }

    @Inject
    protected WalkingToBankTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        q.lIllllllllIIlII();
    }

    @Override
    public boolean Q() {
        return lIlIlIlllIIll[0];
    }
}

