/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Prep Getting Tools", priority=21003, blocking=true)
public class PrepGettingToolsTask
extends CoxManager {
    
    private final  int eh = 7603;
    
    private final  int eg = 29742;

    @Inject
    protected PrepGettingToolsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.eg = 0;
        this.eh = 1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_1;
        if ((this.cq() >= this.el)) {
            return 2;
        }
        int[] nArray = new int[3];
        nArray[2] = 4;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            int[] nArray2 = new int[3];
            nArray2[2] = 5;
            if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) {
                return 2;
            }
        }
        int[] nArray3 = new int[3];
        nArray3[2] = 6;
        TileObject var3 = TileObjects.getNearest((int[])nArray3);
        if var3 == null {
            bb var4;
            System.out.println(var1[2]);
            Movement.setDestination((WorldPoint)var4.ak.bq.dx(7).dy(7));
            return 3;
        }
        int[] nArray4 = new int[3];
        nArray4[2] = 4;
        if ((Inventory.contains((int[] == 0)nArray4) ? 1 : 0)) {
            System.out.println(var1[3]);
            var3.interact(var1[8]);
            return 3;
        }
        int[] nArray5 = new int[3];
        nArray5[2] = 9;
        if ((Inventory.contains((int[] == 0)nArray5) ? 1 : 0)) {
            System.out.println(var1[var2[10]]);
            var3.interact(var1[var2[11]]);
            return 3;
        }
        System.out.println(var1[var2[12]]);
        var1_1.interact(var1[var2[13]]);
        return 3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 2;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 2;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

}

