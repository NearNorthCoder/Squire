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
        q var3;
        if ((this.P( == 0) ? 1 : 0)) {
            return 0;
        }
        BankLoadout var4 = var3.Q();
        if var4 == null {
            Log.error((String)var2[0]);
            return 0;
        }
        if ((var4.needsToBank( == 0) ? 1 : 0)) {
            Log.info((String)var2[1]);
            var3.w.g(0);
            return 0;
        }
        if ((Bank.isOpen( == 0) ? 1 : 0)) {
            TileObject var5 = TileObjects.getNearest((WorldPoint)var3.ae.bank().H(), tileObject -> {
                boolean bl;
                String[] stringArray = new String[1];
                stringArray[0] = var2[6];
                if (!(tileObject.hasAction(stringArray == 0) ? 1 : 0) || (tileObject.getName( != 0).contains(var2[7]) ? 1 : 0)) {
                    bl = 1;
                    0;
                    if ((0x43 ^ 0x6B ^ (0x1A ^ 0x36)) == 0) {
                        return ((76 + 142 - 184 + 132 ^ 76 + 24 - 72 + 111) & (0x67 ^ 0x44 ^ (0x9D ^ 0x93) ^ -1)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            });
            if var5 == null {
                Movement.walkTo((WorldPoint)var3.ae.bank().H());
                0;
                return 1;
            }
            String[] stringArray = new String[2];
            stringArray[0] = var2[2];
            stringArray[1] = var2[3];
            var5.interact(stringArray);
            return 1;
        }
        if ((BankLoadouts.withdrawWithRetries((BankLoadout == 0)var4, (int)4).booleanValue() ? 1 : 0)) {
            Log.info((String)var2[5]);
        }
        return 1;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = 0;
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = 0;
        while (var26 < var25) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

