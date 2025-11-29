/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Drinking boost", priority=10000)
public class DrinkingBoostTask
extends VardorvisTaskBase {

    @Inject
    protected DrinkingBoostTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static void var2() {
        var1 = new int[1];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.x.var1[0] = 0x25 ^ 0x17;
    }

    @Override
    public boolean l() {
        return Combat.drinkBoostingPotion((int)var1[0]);
    }

}

