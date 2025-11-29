/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNetConfig;
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
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Placing net", priority=15, blocking=true)
public class PlacingNetTask
extends Task {
    private final  Client F;

    private static final  int E;
    private final  SquireDriftNetConfig G;
    private static final  int D;

    static {
        h.llIlIIllIlllIl();
        h.llIlIIllIllIll();
        D = lIlIIIIIllIl[4];
        E = lIlIIIIIllIl[5];
    }

    private static boolean llIlIIllIlllll(int n) {
        return n != 0;
    }

    private static boolean llIlIIlllIIIII(Object object) {
        return object != null;
    }

    private static void llIlIIllIllIll() {
        lIlIIIIIllII = new String[lIlIIIIIllIl[8]];
        h.lIlIIIIIllII[h.lIlIIIIIllIl[0]] = "Set up";
        h.lIlIIIIIllII[h.lIlIIIIIllIl[6]] = "Something weird is going on!";
        h.lIlIIIIIllII[h.lIlIIIIIllIl[2]] = "Drift net anchors";
        h.lIlIIIIIllII[h.lIlIIIIIllIl[7]] = "Set up";
    }

    @Inject
    public PlacingNetTask(Client client, SquireDriftNetConfig squireDriftNetConfig) {
        this.F = client;
        this.G = squireDriftNetConfig;
    }

    public boolean run() {
        Widget lllllllllllllllIlllIlIIIIlIIllII22;
        h var1;
        if (h.llIlIIllIllllI(this.F.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIllIl[0];
        }
        if (h.llIlIIllIlllll(var1.G.depositFish() ? 1 : 0) && h.llIlIIlllIIIII(lllllllllllllllIlllIlIIIIlIIllII22 = Widgets.get((int)lIlIIIIIllIl[1], (int)lIlIIIIIllIl[2], (int)lIlIIIIIllIl[3]))) {
            return lIlIIIIIllIl[0];
        }
        int lllllllllllllllIlllIlIIIIlIIllII22 = Static.getClient().getVarbitValue(lIlIIIIIllIl[4]);
        int var2 = Static.getClient().getVarbitValue(lIlIIIIIllIl[5]);
        if (h.llIlIIllIlllll(lllllllllllllllIlllIlIIIIlIIllII22) && h.llIlIIllIlllll(var2)) {
            return lIlIIIIIllIl[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n;
            if (h.llIlIIllIlllll(tileObject.getName().equals(lIlIIIIIllII[lIlIIIIIllIl[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIllIl[6]];
                stringArray[h.lIlIIIIIllIl[0]] = lIlIIIIIllII[lIlIIIIIllIl[7]];
                if (h.llIlIIllIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIlIIIIIllIl[6];

                    if (null == null) return n != 0;
                    return ((0x6C ^ 0x51 ^ (0xEF ^ 0x8E)) & (213 + 81 - 244 + 178 ^ 128 + 87 - 207 + 176 ^ -1)) != 0;
                }
            }
            n = lIlIIIIIllIl[0];
            return n != 0;
        });
        if (h.llIlIIlllIIIII(var3)) {
            var3.interact(lIlIIIIIllII[lIlIIIIIllIl[0]]);
            return lIlIIIIIllIl[6];
        }
        Log.error((String)lIlIIIIIllII[lIlIIIIIllIl[6]]);
        return lIlIIIIIllIl[0];
    }

    private static boolean llIlIIlllIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIIllIllllI(int n) {
        return n == 0;
    }

        return String.valueOf(var4);
    }
}

