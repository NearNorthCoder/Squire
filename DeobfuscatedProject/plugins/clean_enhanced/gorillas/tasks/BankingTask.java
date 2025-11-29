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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public BankingTask(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public boolean run() {
        l var19;
        if ((Locations.isRegionLoaded((int == 0)0) ? 1 : 0)) {
            return 1;
        }
        BankLoadout var20 = (BankLoadout)var19.T.bankLoadout().selected(BankLoadout.class);
        if ((var19.J( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((Bank.isOpen( == 0) ? 1 : 0)) {
            String[] stringArray = new String[2];
            stringArray[1] = var1[1];
            TileObject var21 = TileObjects.getNearest((String[])stringArray);
            if var21 == null {
                Movement.walkTo((WorldPoint)R);
                0;
                return 2;
            }
            if ((Reachable.isInteractable((Locatable == 0)var21) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var21.getWorldLocation());
                0;
                return 2;
            }
            var21.interact(var1[2]);
            return 2;
        }
        if ((BankLoadouts.withdrawWithRetries((BankLoadout == 0)var20, (int)3).booleanValue() ? 1 : 0)) {
            Log.info((String)var1[4]);
            return 1;
        }
        return 2;
    }

}

