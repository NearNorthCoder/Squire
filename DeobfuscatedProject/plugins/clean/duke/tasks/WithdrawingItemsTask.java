/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeTaskBase;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class WithdrawingItemsTask
extends DukeTaskBase {

    @Override
    public boolean R() {
        q var1;
        if (q.lllIlIIIlIIllI(this.P() ? 1 : 0)) {
            return lIllIlIllllI[0];
        }
        BankLoadout var2 = var1.Q();
        if (q.lllIlIIIlIIlll(var2)) {
            Log.error((String)lIllIlIlllIl[lIllIlIllllI[0]]);
            return lIllIlIllllI[0];
        }
        if (q.lllIlIIIlIIllI(var2.needsToBank() ? 1 : 0)) {
            Log.info((String)lIllIlIlllIl[lIllIlIllllI[1]]);
            var1.w.g(lIllIlIllllI[0]);
            return lIllIlIllllI[0];
        }
        if (q.lllIlIIIlIIllI(Bank.isOpen() ? 1 : 0)) {
            TileObject var3 = TileObjects.getNearest((WorldPoint)var1.ae.bank().H(), tileObject -> {
                boolean bl;
                String[] stringArray = new String[lIllIlIllllI[1]];
                stringArray[q.lIllIlIllllI[0]] = lIllIlIlllIl[lIllIlIllllI[6]];
                if (!q.lllIlIIIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0) || q.lllIlIIIlIlIII(tileObject.getName().contains(lIllIlIlllIl[lIllIlIllllI[7]]) ? 1 : 0)) {
                    bl = lIllIlIllllI[1];

                    if ((0x43 ^ 0x6B ^ (0x1A ^ 0x36)) == 0) {
                        return ((76 + 142 - 184 + 132 ^ 76 + 24 - 72 + 111) & (0x67 ^ 0x44 ^ (0x9D ^ 0x93) ^ -1)) != 0;
                    }
                } else {
                    bl = lIllIlIllllI[0];
                }
                return bl;
            });
            if (q.lllIlIIIlIIlll(var3)) {
                Movement.walkTo((WorldPoint)var1.ae.bank().H());

                return lIllIlIllllI[1];
            }
            String[] stringArray = new String[lIllIlIllllI[2]];
            stringArray[q.lIllIlIllllI[0]] = lIllIlIlllIl[lIllIlIllllI[2]];
            stringArray[q.lIllIlIllllI[1]] = lIllIlIlllIl[lIllIlIllllI[3]];
            var3.interact(stringArray);
            return lIllIlIllllI[1];
        }
        if (q.lllIlIIIlIIllI(BankLoadouts.withdrawWithRetries((BankLoadout)var2, (int)lIllIlIllllI[4]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIllIlIlllIl[lIllIlIllllI[5]]);
        }
        return lIllIlIllllI[1];
    }

    private static boolean lllIlIIIlIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIlIIlll(Object object) {
        return object == null;
    }

    static {
        q.lllIlIIIlIIlIl();
        q.lllIlIIIlIIlII();
    }

    private static void lllIlIIIlIIlII() {
        lIllIlIlllIl = new String[lIllIlIllllI[8]];
        q.lIllIlIlllIl[q.lIllIlIllllI[0]] = "No bank loadout selected";
        q.lIllIlIlllIl[q.lIllIlIllllI[1]] = "No need to bank";
        q.lIllIlIlllIl[q.lIllIlIllllI[2]] = "Use";
        q.lIllIlIlllIl[q.lIllIlIllllI[3]] = "Bank";
        q.lIllIlIlllIl[q.lIllIlIllllI[5]] = "failed to withdraw bankloadout 10 times";
        q.lIllIlIlllIl[q.lIllIlIllllI[6]] = "Bank";
        q.lIllIlIlllIl[q.lIllIlIllllI[7]] = "Bank";
    }

        return String.valueOf(var4);
    }
}

