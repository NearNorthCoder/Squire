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
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNet;
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Removing net", priority=20, blocking=true)
public class RemovingNetTask
extends Task {
    
    private static final  int S;
    private final  Client X;
    private static final  int V;
    private final  SquireDriftNet W;
    private static final  int U;
    private static final  int T;

    private static boolean llIlIIllIIIlIl(Object object) {
        return object != null;
    }

    static {
        k.llIlIIllIIIIlI();
        k.llIlIIllIIIIIl();
        V = lIlIIIIIIlll[2];
        U = lIlIIIIIIlll[0];
        S = lIlIIIIIIlll[3];
        T = lIlIIIIIIlll[4];
    }

    private static boolean llIlIIllIIIIll(int n) {
        return n == 0;
    }

    private static boolean llIlIIllIIIllI(int n, int n2) {
        return n < n2;
    }

        return String.valueOf(var1);
    }

    public boolean run() {
        if (k.llIlIIllIIIIll(this.X.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIIlll[0];
        }
        String[] stringArray = new String[lIlIIIIIIlll[1]];
        stringArray[k.lIlIIIIIIlll[0]] = lIlIIIIIIllI[lIlIIIIIIlll[0]];
        if (k.llIlIIllIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lIlIIIIIIlll[0];
        }
        int var2 = Static.getClient().getVarbitValue(lIlIIIIIIlll[2]);
        if (k.llIlIIllIIIIll(var2)) {
            k var3;
            Log.error((String)lIlIIIIIIllI[lIlIIIIIIlll[1]]);
            var3.W.forceStop();
            return lIlIIIIIIlll[0];
        }
        Widget var4 = Widgets.get((int)lIlIIIIIIlll[3], (int)lIlIIIIIIlll[4], (int)lIlIIIIIIlll[0]);
        if (k.llIlIIllIIIlIl(var4)) {
            var4.interact(lIlIIIIIIllI[lIlIIIIIIlll[5]]);
            return lIlIIIIIIlll[1];
        }
        String[] stringArray2 = new String[lIlIIIIIIlll[1]];
        stringArray2[k.lIlIIIIIIlll[0]] = lIlIIIIIIllI[lIlIIIIIIlll[6]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray2);
        if (k.llIlIIllIIIlIl(var5)) {
            var5.interact(lIlIIIIIIllI[lIlIIIIIIlll[7]]);
            return lIlIIIIIIlll[1];
        }
        return lIlIIIIIIlll[0];
    }

    private static void llIlIIllIIIIIl() {
        lIlIIIIIIllI = new String[lIlIIIIIIlll[4]];
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[0]] = "Drift net";
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[1]] = "Out of Drift net";
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[5]] = "Withdraw-All";
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[6]] = "Annette";
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[7]] = "Nets";
    }

    private static boolean llIlIIllIIIlII(int n) {
        return n != 0;
    }

    @Inject
    public RemovingNetTask(SquireDriftNet squireDriftNet, Client client) {
        this.W = squireDriftNet;
        this.X = client;
    }
}

