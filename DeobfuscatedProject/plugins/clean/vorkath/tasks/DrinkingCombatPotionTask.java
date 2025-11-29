/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Drinking Combat Potion", priority=109)
public class DrinkingCombatPotionTask
extends VorkathTaskBase {

    private static boolean lIllllllllIIIll(Object object) {
        return object != null;
    }

    @Override
    public boolean Q() {
        int[] nArray = new int[lIlIlIlllIIIl[0]];
        nArray[F.lIlIlIlllIIIl[1]] = lIlIlIlllIIIl[2];
        if (F.lIllllllllIIIll(Projectiles.getNearest((int[])nArray))) {
            return lIlIlIlllIIIl[1];
        }
        this.cg.a(this.cf.getTickCount());
        return Combat.drinkBoostingPotion((int)lIlIlIlllIIIl[3]);
    }

    static {
        F.lIllllllllIIIlI();
    }

    @Inject
    protected DrinkingCombatPotionTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }
}

