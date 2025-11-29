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

    @Inject
    protected LoggingOutBefore6hTimerTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIlIIIlllIllII(int n2) {
        return n2 == 0;
    }

    static {
        aC.lIIlIIIlllIlIll();
    }

    private static boolean lIIlIIIlllIllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bY() {
        if (aC.lIIlIIIlllIllII(this.cW.G() ? 1 : 0)) {
            return llllIlllIIlI[0];
        }
        if (aC.lIIlIIIlllIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIlllIIlI[0];
        }
        Game.logout();
        return llllIlllIIlI[1];
    }
}

