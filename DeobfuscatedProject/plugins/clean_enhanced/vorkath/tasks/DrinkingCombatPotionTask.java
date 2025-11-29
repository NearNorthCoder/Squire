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
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Drinking Combat Potion", priority=109)
public class DrinkingCombatPotionTask
extends VorkathManager {

    private static boolean var2(Object object) {
        return object != null;
    }

    @Override
    public boolean Q() {
        int[] nArray = new int[var1[0]];
        nArray[F.var1[1]] = var1[2];
        if (F.var2(Projectiles.getNearest((int[])nArray))) {
            return var1[1];
        }
        this.cg.a(this.cf.getTickCount());
        return Combat.drinkBoostingPotion((int)var1[3]);
    }

    static {
        F.var3();
    }

    private static void var3() {
        var1 = new int[4];
        F.var1[0] = 1;
        F.var1[1] = (0xDC ^ 0x84) & ~(0xCE ^ 0x96);
        F.var1[2] = -(0xFFFFAF67 & 0x72BD) & (0xFFFFEFEF & 0x37FD);
        F.var1[3] = 0x49 ^ 0x13;
    }

    @Inject
    protected DrinkingCombatPotionTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }
}

