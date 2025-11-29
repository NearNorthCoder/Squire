/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Depositing Guardian Stone", priority=3, blocking=true)
public class DepositingGuardianStoneTask
extends RunecraftingTaskBase {

    @Override
    protected boolean aj() {
        return 2;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        if ((this.aV.g( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((SquireGOTRPlugin.g.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 3;
        nArray[2] = 4;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 1;
        }
        int[] nArray2 = new int[2];
        nArray2[1] = 5;
        NPC var19 = NPCs.getNearest((int[])nArray2);
        if (!var19 != null || (var19.hasAction(string -> {
            int n2;
            if ((string != null == 0) && (string.equals(var2[2] != 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if (3 < 1) {
                    return ((0xD5 ^ 0xC6) & ~(0x9C ^ 0x8F)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return 1;
        }
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 2;
        }
        var1_1.interact(var2[1]);
        return 2;
    }

    @Inject
    public DepositingGuardianStoneTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        cArray[2] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

}

