/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.Squire
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.nightmarezone.tasks.BHelper;

@TaskDesc(name="Enter Dream", priority=1, blocking=true)
public class EnterDreamTask
extends Task {
    private final  SquireNightmareZone ar;
    private final  SquireNightmareZoneConfig as;

    private final  Client at;

    private static void lIIllllIIlIllIl() {
        lIIIlIIIIllll = new String[lIIIlIIIlIIII[8]];
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[0]] = "We have less than 26k - stopping";
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[2]] = "Entering dream!";
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[5]] = "Drink";
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[6]] = "Potion";
        p.lIIIlIIIIllll[p.lIIIlIIIlIIII[7]] = "Drink";
    }

    private static boolean lIIllllIIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllllIIlIllll(int n2) {
        return n2 != 0;
    }

    @Inject
    public EnterDreamTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ar = squireNightmareZone;
        this.as = squireNightmareZoneConfig;
        this.at = client;
    }

    private static boolean lIIllllIIllIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIllllIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIllllIIllIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        p var2;
        if (p.lIIllllIIlIllll(this.at.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIIII[0];
        }
        int var3 = Static.getClient().getVarbitValue(b.u);
        if (p.lIIllllIIllIIII(var3)) {
            return lIIIlIIIlIIII[0];
        }
        int var4 = var2.ar.b();
        if (p.lIIllllIIllIIIl(var4, var2.as.absorption())) {
            return lIIIlIIIlIIII[0];
        }
        int var5 = var2.ar.a();
        if (p.lIIllllIIllIIIl(var5, var2.as.overload())) {
            return lIIIlIIIlIIII[0];
        }
        int var6 = Static.getClient().getVarbitValue(b.x);
        if (p.lIIllllIIllIIIl(var6, lIIIlIIIlIIII[1])) {
            Log.error((String)lIIIlIIIIllll[lIIIlIIIlIIII[0]]);
            Squire.stop();
            return lIIIlIIIlIIII[2];
        }
        if (p.lIIllllIIllIIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIlIIIlIIII[0];
        }
        Widget var7 = Widgets.get((int)b.v, (int)b.w);
        if (p.lIIllllIIllIIlI(var7) && p.lIIllllIIlIllll(var7.isVisible() ? 1 : 0)) {
            var7.interact(lIIIlIIIlIIII[0], lIIIlIIIlIIII[3], lIIIlIIIlIIII[4], var7.getId());
            System.out.println(lIIIlIIIIllll[lIIIlIIIlIIII[2]]);
            return lIIIlIIIlIIII[2];
        }
        TileObject var8 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (p.lIIllllIIlIllll(tileObject.getName().contains(lIIIlIIIIllll[lIIIlIIIlIIII[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIlIIIlIIII[2]];
                stringArray[p.lIIIlIIIlIIII[0]] = lIIIlIIIIllll[lIIIlIIIlIIII[7]];
                if (p.lIIllllIIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIIlIIIlIIII[2];

                    if (1 != 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIIlIIIlIIII[0];
            return n2 != 0;
        });
        if (p.lIIllllIIllIIll(var8)) {
            return lIIIlIIIlIIII[0];
        }
        var6_6.interact(lIIIlIIIIllll[lIIIlIIIlIIII[5]]);
        return lIIIlIIIlIIII[2];
    }

    static {
        p.lIIllllIIlIlllI();
        p.lIIllllIIlIllIl();
    }
}

