/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.gorillas.tasks.GorillasTaskBase;

@TaskDesc(name="Banking", priority=100, blocking=true)
public class BankingTask
extends GorillasTaskBase {
    
    @Inject
    private  SquireGorillaPlugin P;

    private static boolean lllllIllllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIllllIllI(Object object) {
        return object == null;
    }

    @Inject
    public BankingTask(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    static {
        l.lllllIllllIlII();
        l.lllllIllllIIll();
    }

        return String.valueOf(var1);
    }

    private static void lllllIllllIIll() {
        llIIlIllllll = new String[llIIllIIIIII[5]];
        l.llIIlIllllll[l.llIIllIIIIII[1]] = "Bank booth";
        l.llIIlIllllll[l.llIIllIIIIII[2]] = "Bank";
        l.llIIlIllllll[l.llIIllIIIIII[4]] = "Something going wrong banking stopping plugin";
    }

    public boolean run() {
        l var2;
        if (l.lllllIllllIlIl(Locations.isRegionLoaded((int)llIIllIIIIII[0]) ? 1 : 0)) {
            return llIIllIIIIII[1];
        }
        BankLoadout var3 = (BankLoadout)var2.T.bankLoadout().selected(BankLoadout.class);
        if (l.lllllIllllIlIl(var2.J() ? 1 : 0)) {
            return llIIllIIIIII[1];
        }
        if (l.lllllIllllIlIl(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIIllIIIIII[2]];
            stringArray[l.llIIllIIIIII[1]] = llIIlIllllll[llIIllIIIIII[1]];
            TileObject var4 = TileObjects.getNearest((String[])stringArray);
            if (l.lllllIllllIllI(var4)) {
                Movement.walkTo((WorldPoint)R);

                return llIIllIIIIII[2];
            }
            if (l.lllllIllllIlIl(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var4.getWorldLocation());

                return llIIllIIIIII[2];
            }
            var4.interact(llIIlIllllll[llIIllIIIIII[2]]);
            return llIIllIIIIII[2];
        }
        if (l.lllllIllllIlIl(BankLoadouts.withdrawWithRetries((BankLoadout)var3, (int)llIIllIIIIII[3]).booleanValue() ? 1 : 0)) {
            Log.info((String)llIIlIllllll[llIIllIIIIII[4]]);
            return llIIllIIIIII[1];
        }
        return llIIllIIIIII[2];
    }

    private static boolean lllllIllllIlll(int n2, int n3) {
        return n2 < n3;
    }
}

