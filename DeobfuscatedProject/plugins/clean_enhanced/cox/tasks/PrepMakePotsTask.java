/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Prep Make Pots", priority=21001, blocking=true)
public class PrepMakePotsTask
extends CoxManager {
    
     boolean ei;

    @Inject
    protected PrepMakePotsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ei = 0;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 == -1) continue;
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
    public boolean dY() {
        void var2_3;
        void var3_5;
        bd var19;
        if ((this.eh() < this.ed())) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = em;
        TileObject var20 = TileObjects.getNearest((int[])nArray);
        if ((Inventory.isFull( == 0) ? 1 : 0) && (var19.eg() > var19.ek())) {
            int[] nArray2 = new int[1];
            nArray2[0] = 2;
            if ((Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) {
                return 0;
            }
        }
        int[] nArray3 = new int[1];
        nArray3[0] = 3;
        if ((Inventory.contains((int[] != 0)nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[1];
            nArray4[0] = 3;
            List var21 = Inventory.getAll((int[])nArray4);
            int var22 = 4;
            Iterator var23 = var21.iterator();
            while ((var23.hasNext( != 0) ? 1 : 0)) {
                Item var24 = (Item)var23.next();
                if (var22 <= 0) {
                    0;
                    if null == null break;
                    return ((0x3E ^ 0x79) & ~(0xFF ^ 0xB8)) != 0;
                }
                --var22;
                var24.interact(var1[0]);
                0;
                if (2 != 0) continue;
                return ((0x50 ^ 0x4B ^ (0x51 ^ 0x57)) & (13 + 60 - -29 + 25 ^ (0xEC ^ 0x8E) ^ -1)) != 0;
            }
            return 1;
        }
        if ((Production.isOpen( != 0) ? 1 : 0)) {
            if ((var19.cq() < var19.el)) {
                var19.ei = 1;
                Production.chooseOption((String)var1[1]);
                var19.sleep(5);
                return 1;
            }
            var19.ei = 0;
            Production.chooseOption((String)var1[5]);
            var19.sleep(5);
            return 1;
        }
        int[] nArray5 = new int[1];
        nArray5[0] = 6;
        Item var21 = Inventory.getFirst((int[])nArray5);
        int[] nArray6 = new int[1];
        nArray6[0] = 2;
        Item var22 = Inventory.getFirst((int[])nArray6);
        if (!var22 != null || var21 == null) {
            return 0;
        }
        System.out.println("CraftRestore: " + var19.ei + " | count: " + var19.cq());
        if ((var19.ei == 0) && (var19.bS.isAnimating( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((var19.ei != 0) && (var19.bS.isAnimating( != 0) ? 1 : 0) && (var19.cq() < var19.el)) {
            return 1;
        }
        var3_5.useOn((Item)var2_3);
        return 1;
    }
}

