/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.TempletrekkingManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;

@TaskDesc(name="Logging out", priority=0x7FFFFFFE, blocking=true)
public class LoggingOutTask
extends Task {
    private final  b K;
    
    private  Player G;
    private final  TempleTrekkingPlugin I;
    private final  TempleTrekkingConfig J;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var1 = new int[3];
        n.var1[0] = (0x41 ^ 0x36 ^ (0x6F ^ 9)) & (0x40 ^ 0x37 ^ (0xC4 ^ 0xA2) ^ -1);
        n.var1[1] = 1;
        n.var1[2] = 2;
    }

    private static void var5() {
        var2 = new String[var1[1]];
        n.var2[n.var1[0]] = "Logging out to reset 6h timer";
    }

    public boolean run() {
        n var6;
        if (n.var3(this.I.k() ? 1 : 0)) {
            return var1[0];
        }
        Player var7 = Players.getLocal();
        if (n.var3(var6.I.f().contains((Locatable)var7) ? 1 : 0) && n.var3(var6.I.g().contains((Locatable)var7) ? 1 : 0)) {
            return var1[0];
        }
        Game.logout();
        System.out.println(var2[var1[0]]);
        return var1[0];
    }

    static {
        n.var4();
        n.var5();
    }

    @Inject
    public LoggingOutTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.J = templeTrekkingConfig;
        this.K = b2;
        this.I = templeTrekkingPlugin;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }
}

