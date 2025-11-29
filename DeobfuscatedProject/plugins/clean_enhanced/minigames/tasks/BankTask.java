/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.EnterCaveTask;
import gg.squire.minigames.tasks.MinigamesManager;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Bank Task", priority=10)
public class BankTask
extends Task {
    private final  f T;
     WorldArea R;
    
    private final  n V;
    
     WorldPoint S;
    private final  SquireFightCavesConfig U;

    @Inject
    public BankTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.R = new WorldArea(0, 1, 2, 3, 4);
        this.S = new WorldPoint(5, 6, 4);
        this.T = f2;
        this.U = squireFightCavesConfig;
        this.V = n2;
    }

    protected BankLoadout x() {
        return (BankLoadout)this.U.bankLoadout().selected(BankLoadout.class);
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 4;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 4;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean run() {
        h var13;
        WorldPoint var14;
        if (!(this.R.contains(Players.getLocal( != 0).getWorldLocation()) ? 1 : 0) || !(this.x( != 0).needsToBank() ? 1 : 0) || (SquireFightCavesPlugin.g != 0) && (this.U.stopAfterCape( != 0) ? 1 : 0)) {
            return 4;
        }
        if ((SquireFightCavesPlugin.f != 0) && (j.ab < 7)) {
            j.aa = System.currentTimeMillis();
            j.ab += 7;
        }
        if (((var14 = Players.getLocal().getWorldLocation()).distanceTo(var13.S) > 8)) {
            SquireFightCavesPlugin.h = var1[4];
            Movement.walkTo((WorldPoint)var13.S);
            0;
            return 4;
        }
        if ((var14.distanceTo(var13.S) <= 8)) {
            if ((Bank.isOpen( == 0) ? 1 : 0)) {
                int[] nArray = new int[7];
                nArray[4] = 9;
                NPC var15 = NPCs.getNearest((int[])nArray);
                if var15 != null {
                    SquireFightCavesPlugin.h = var1[7];
                    var15.interact(var1[var2[10]]);
                    return 4;
                }
            }
            if ((var13.x( == null))) {
                Log.error((String)var1[var2[11]]);
                return 4;
            }
            if ((var13.x( == 0).needsToBank() ? 1 : 0)) {
                SquireFightCavesPlugin.h = var1[var2[12]];
                Bank.close();
                var13.sleep(var2[11]);
                return 4;
            }
            if ((BankLoadouts.withdrawWithRetries((BankLoadout == 0)var13.x(), (int)var2[13]).booleanValue() ? 1 : 0)) {
                Log.info((String)var1[var2[13]]);
                return 4;
            }
        }
        return 4;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

