/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GameEnum;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Polishing sword", priority=43, blocking=true)
public class PolishingSwordTask
extends GiantsfoundryTaskBase {
    private static final  int ac;

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (n.lIIIIIllllIIlIl(player.getAnimation(), llIlIllIllII[0])) {
            this.sleep(llIlIllIllII[1]);
            return llIlIllIllII[2];
        }
        return this.N();
    }

    @Inject
    public PolishingSwordTask(a a2) {
        super(a2, g.POLISH);
    }

    private static boolean lIIIIIllllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIllllIIIll() {
        llIlIllIlIll = new String[llIlIllIllII[4]];
        n.llIlIllIlIll[n.llIlIllIllII[3]] = "Polishing wheel is null";
        n.llIlIllIlIll[n.llIlIllIllII[2]] = "Use";
    }

    static {
        n.lIIIIIllllIIlII();
        n.lIIIIIllllIIIll();
        ac = llIlIllIllII[0];
    }

    private static boolean lIIIIIllllIIllI(Object object) {
        return object == null;
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.q();
        if (n.lIIIIIllllIIllI(tileObject)) {
            Log.info((String)llIlIllIlIll[llIlIllIllII[3]]);
            return llIlIllIllII[3];
        }
        tileObject.interact(llIlIllIlIll[llIlIllIllII[2]]);
        this.sleep(llIlIllIllII[1]);
        return llIlIllIllII[2];
    }
}

