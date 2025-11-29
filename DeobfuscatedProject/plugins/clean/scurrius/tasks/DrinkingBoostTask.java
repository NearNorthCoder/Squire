/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import gg.squire.scurrius.tasks.ScurriusTaskBase;
import gg.squire.scurrius.tasks.BHelper;

@TaskDesc(name="Drinking boost", priority=10000)
public class DrinkingBoostTask
extends ScurriusTaskBase {

    static {
        o.lIlIllIIIlIIllI();
    }

    @Override
    public boolean a() {
        return Combat.drinkBoostingPotion((int)lIIlIlIllIIll[0]);
    }

    @Inject
    protected DrinkingBoostTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }
}

