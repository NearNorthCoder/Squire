/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;

@TaskDesc(name="Stop Diving", priority=40, blocking=true)
public class StopDivingTask
extends Task {
    private final  SquireDriftNet Q;
    private final  Client R;
    private  Player r;

    private static void llIlIlIIIIIIIl() {
        lIlIIIIlIlIl = new String[lIlIIIIlIllI[2]];
        j.lIlIIIIlIlIl[j.lIlIIIIlIllI[0]] = "Anchor rope";
        j.lIlIIIIlIlIl[j.lIlIIIIlIllI[1]] = "Climb";
    }

    private static boolean llIlIlIIIIIIll(int n) {
        return n != 0;
    }

    private static boolean llIlIlIIIIIlIl(int n, int n2) {
        return n != n2;
    }

    static {
        j.llIlIlIIIIIIlI();
        j.llIlIlIIIIIIIl();
    }

    public boolean run() {
        j var1;
        if (j.llIlIlIIIIIIll(this.R.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIlIllI[0];
        }
        var1.r = Players.getLocal();
        if (!j.llIlIlIIIIIlII(var1.r) || j.llIlIlIIIIIlIl(var1.r.getPlane(), lIlIIIIlIllI[1])) {
            return lIlIIIIlIllI[0];
        }
        String[] stringArray = new String[lIlIIIIlIllI[1]];
        stringArray[j.lIlIIIIlIllI[0]] = lIlIIIIlIlIl[lIlIIIIlIllI[0]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        if (j.llIlIlIIIIIlII(var2) && j.llIlIlIIIIIlII(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON))) {
            var2.interact(lIlIIIIlIlIl[lIlIIIIlIllI[1]]);
            return lIlIIIIlIllI[1];
        }
        return lIlIIIIlIllI[0];
    }

    @Inject
    public StopDivingTask(SquireDriftNet squireDriftNet, Client client) {
        this.Q = squireDriftNet;
        this.R = client;
    }

    private static boolean llIlIlIIIIIlII(Object object) {
        return object != null;
    }
}

