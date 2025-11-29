/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.zulrah.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Drinking potions", priority=5)
public class DrinkingPotionsTask
extends am {

    @Inject
    protected DrinkingPotionsTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        ak.var2();
    }

    @Override
    public boolean ac() {
        return Combat.drinkBoostingPotion((int)0);
    }
}

