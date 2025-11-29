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
        q var2;
        if (q.var3(this.S() ? 1 : 0)) {
            return var1[0];
        }
        if (q.var4(var2.bU.c() ? 1 : 0)) {
            return var1[0];
        }
        if (q.var3(var2.R() ? 1 : 0)) {
            return var1[0];
        }
        if (q.var3(House.isInside() ? 1 : 0) && q.var5(House.getJewelryBox())) {
            return var1[0];
        }
        if (q.var4(Movement.shouldWalk() ? 1 : 0)) {
            return var1[1];
        }
        Movement.walkTo((WorldPoint)WorldLocation.FEROX_ENCLAVE.getWorldArea().getCenter());
        0;
        return var1[1];
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    @Inject
    protected WalkingToBankTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        q.var6();
    }

    private static void var6() {
        var1 = new int[2];
        q.var1[0] = (160 + 58 - 208 + 151 ^ 49 + 170 - 115 + 83) & (0xEA ^ 0xC6 ^ (0xA ^ 0x3C) ^ -1);
        q.var1[1] = 1;
    }

    @Override
    public boolean Q() {
        return var1[0];
    }
}

