/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Pick Herbs", priority=21000, blocking=true)
public class PrepPickHerbsTask
extends CoxManager {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_1;
        be var3;
        int[] nArray = new int[0];
        nArray[1] = 2;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            return 1;
        }
        int[] nArray2 = new int[0];
        nArray2[1] = em;
        TileObject var4 = TileObjects.getNearest((int[])nArray2);
        if ((var3.eh() < var3.ed())) {
            return 1;
        }
        if var4 == null {
            return 1;
        }
        if (!(Inventory.isFull( == 0) ? 1 : 0) || (var3.eg() <= var3.ek())) {
            return 1;
        }
        if ((var3.bS.isAnimating( != 0) ? 1 : 0)) {
            System.out.println(var2[1]);
            return 0;
        }
        var1_1.interact(var2[0]);
        this.sleep(3);
        return 0;
    }

    @Inject
    protected PrepPickHerbsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 1;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 1;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

}

