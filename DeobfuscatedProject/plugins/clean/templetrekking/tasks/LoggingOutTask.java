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
import gg.squire.templetrekking.tasks.BHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lIllIIIlIIIIIIl(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIlllllll() {
        lIIllIlIlllll = new String[lIIllIllIIIII[1]];
        n.lIIllIlIlllll[n.lIIllIllIIIII[0]] = "Logging out to reset 6h timer";
    }

    public boolean run() {
        n var1;
        if (n.lIllIIIlIIIIIIl(this.I.k() ? 1 : 0)) {
            return lIIllIllIIIII[0];
        }
        Player var2 = Players.getLocal();
        if (n.lIllIIIlIIIIIIl(var1.I.f().contains((Locatable)var2) ? 1 : 0) && n.lIllIIIlIIIIIIl(var1.I.g().contains((Locatable)var2) ? 1 : 0)) {
            return lIIllIllIIIII[0];
        }
        Game.logout();
        System.out.println(lIIllIlIlllll[lIIllIllIIIII[0]]);
        return lIIllIllIIIII[0];
    }

    static {
        n.lIllIIIlIIIIIII();
        n.lIllIIIIlllllll();
    }

    @Inject
    public LoggingOutTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.J = templeTrekkingConfig;
        this.K = b2;
        this.I = templeTrekkingPlugin;
    }

}

