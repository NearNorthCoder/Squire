/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Walking to nightmare", priority=10, blocking=true)
public class WalkingToNightmareTask
extends NightmareTaskBase {
    
    private static final  Logger eL;

    @Inject
    protected WalkingToNightmareTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIIllIllIIlIll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static void lIIIllIllIIlIII() {
        lllIllIlllll = new String[lllIlllIIIII[3]];
        aD.lllIllIlllll[aD.lllIlllIIIII[0]] = "[WalkToNightmare]: We're already at the well";
        aD.lllIllIlllll[aD.lllIlllIIIII[2]] = "Pool of Nightmares";
    }

    static {
        aD.lIIIllIllIIlIIl();
        aD.lIIIllIllIIlIII();
        eL = LoggerFactory.getLogger(WalkingToNightmareTask.class);
    }

    private static boolean lIIIllIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIllIIllII(Object object) {
        return object != null;
    }

    private static boolean lIIIllIllIIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bY() {
        aD var2;
        if (aD.lIIIllIllIIlIlI(this.cW.ae() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIlI(var2.cW.s() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIlI(var2.cW.ad() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllIllIlllll[lllIlllIIIII[2]]));
        Player var4 = Players.getLocal();
        if (aD.lIIIllIllIIllII(var3) && aD.lIIIllIllIIllIl(var4.distanceTo((Locatable)var3), lllIlllIIIII[1])) {
            Log.info((String)lllIllIlllll[lllIlllIIIII[0]]);
            return lllIlllIIIII[0];
        }
        Movement.walkTo((WorldPoint)cU);

        return lllIlllIIIII[2];
    }
}

