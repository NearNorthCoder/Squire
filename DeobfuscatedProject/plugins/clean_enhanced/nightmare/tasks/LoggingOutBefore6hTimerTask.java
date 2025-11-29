/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Logging out before 6h timer", priority=2147482309, blocking=true, register=true)
public class LoggingOutBefore6hTimerTask
extends NightmareTaskBase {

    private static void var2() {
        var1 = new int[2];
        aC.var1[0] = (0x1E ^ 0x4A ^ (0x56 ^ 0x5C)) & (0x29 ^ 0x11 ^ (0x32 ^ 0x54) ^ -1);
        aC.var1[1] = 1;
    }

    @Inject
    protected LoggingOutBefore6hTimerTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        aC.var2();
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bY() {
        if (aC.var3(this.cW.G() ? 1 : 0)) {
            return var1[0];
        }
        if (aC.var4(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        Game.logout();
        return var1[1];
    }
}

