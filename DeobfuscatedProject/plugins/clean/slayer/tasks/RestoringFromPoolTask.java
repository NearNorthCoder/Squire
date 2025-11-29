/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.House
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.unethicalite.api.game.House;

@TaskDesc(name="Restoring from pool", priority=0x7FFFFFFF, blocking=true)
public class RestoringFromPoolTask
extends Task {
    private final  Client J;

    public boolean run() {
        if (m.lIlllIlIlllIlll(House.isInside() ? 1 : 0)) {
            return lIlIIlIlIIIll[0];
        }
        if (m.lIlllIlIlllIlll(House.isPoolDrinkUseful() ? 1 : 0)) {
            return lIlIIlIlIIIll[0];
        }
        return House.drinkFromPool();
    }

    @Inject
    public RestoringFromPoolTask(Client client) {
        this.J = client;
    }

    static {
        m.lIlllIlIlllIllI();
    }

    private static boolean lIlllIlIlllIlll(int n2) {
        return n2 == 0;
    }
}

