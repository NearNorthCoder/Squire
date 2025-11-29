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

@TaskDesc(name="Hammering sword", priority=100, blocking=true)
public class HammeringSwordTask
extends GiantsfoundryTaskBase {
    private static final  int ab;

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (m.lIIIIIllIlIIlll(player.getAnimation(), llIlIlIllIlI[0])) {
            return llIlIlIllIlI[1];
        }
        return this.N();
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.r();
        if (m.lIIIIIllIlIlIII(tileObject)) {
            Log.info((String)llIlIlIllIIl[llIlIlIllIlI[2]]);
            return llIlIlIllIlI[2];
        }
        tileObject.interact(llIlIlIllIIl[llIlIlIllIlI[1]]);
        return llIlIlIllIlI[1];
    }

    private static boolean lIIIIIllIlIIlll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public HammeringSwordTask(a a2) {
        super(a2, g.HAMMER);
    }

    private static boolean lIIIIIllIlIlIII(Object object) {
        return object == null;
    }

    private static void lIIIIIllIlIIlIl() {
        llIlIlIllIIl = new String[llIlIlIllIlI[3]];
        m.llIlIlIllIIl[m.llIlIlIllIlI[2]] = "Hammer is null";
        m.llIlIlIllIIl[m.llIlIlIllIlI[1]] = "Use";
    }

    static {
        m.lIIIIIllIlIIllI();
        m.lIIIIIllIlIIlIl();
        ab = llIlIlIllIlI[0];
    }

}

