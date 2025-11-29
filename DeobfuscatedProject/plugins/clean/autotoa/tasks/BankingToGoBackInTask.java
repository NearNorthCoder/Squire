/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Banking to go back in", priority=10, blocking=true)
public class BankingToGoBackInTask
extends AutotoaTaskBase {

    private static boolean lIIllllIlIlIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var1;
        BankLoadout bankLoadout = (BankLoadout)this.hY.loadout().selected(BankLoadout.class);
        if (ce.lIIllllIlIlIIl(bankLoadout.needsToBank() ? 1 : 0)) {
            Log.info((String)llIIIlIllll[llIIIllIIII[0]]);
            return llIIIllIIII[0];
        }
        if (ce.lIIllllIlIlIlI(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)llIIIlIllll[llIIIllIIII[1]]);
            return llIIIllIIII[0];
        }
        if (ce.lIIllllIlIlIIl(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIIIllIIII[1]];
            stringArray[ce.llIIIllIIII[0]] = llIIIlIllll[llIIIllIIII[2]];
            TileObject var2 = TileObjects.getNearest((String[])stringArray);
            if (ce.lIIllllIlIlIll(var2)) {
                return llIIIllIIII[0];
            }
            var2.interact(llIIIlIllll[llIIIllIIII[3]]);
            return llIIIllIIII[1];
        }
        if (ce.lIIllllIlIlIIl(BankLoadouts.withdrawWithRetries((BankLoadout)var1, (int)llIIIllIIII[4]).booleanValue() ? 1 : 0)) {
            Log.info((String)llIIIlIllll[llIIIllIIII[5]]);
            return llIIIllIIII[0];
        }
        return llIIIllIIII[1];
    }

        return String.valueOf(var3);
    }

    private static void lIIllllIlIIlll() {
        llIIIlIllll = new String[llIIIllIIII[4]];
        ce.llIIIlIllll[ce.llIIIllIIII[0]] = "[BankForItems] We don't need to bank";
        ce.llIIIlIllll[ce.llIIIllIIII[1]] = "[BankForItems] Pin window is open... waiting";
        ce.llIIIlIllll[ce.llIIIllIIII[2]] = "Bank Camel";
        ce.llIIIlIllll[ce.llIIIllIIII[3]] = "Bank";
        ce.llIIIlIllll[ce.llIIIllIIII[5]] = "[BankForItems] After 5 tries, still not equipping the right stuff";
    }

    private static boolean lIIllllIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIlIlIIl(int n2) {
        return n2 == 0;
    }

    static {
        ce.lIIllllIlIlIII();
        ce.lIIllllIlIIlll();
    }

    @Inject
    protected BankingToGoBackInTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean lIIllllIlIllII(int n2, int n3) {
        return n2 < n3;
    }
}

