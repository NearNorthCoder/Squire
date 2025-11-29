/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.GameEnum14;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Praying with bonemeal", priority=10, blocking=true)
public class PrayingWithBonemealTask
extends as {
    private static  int[] lIIIIIII;
    private  boolean dm;
    private static  String[] lllllll;

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bB() {
        void var1_2;
        au var6;
        int[] nArray = new int[0];
        nArray[1] = this.de.bonesToUse().groundItemId;
        nArray[2] = 3;
        if ((Inventory.containsAllOf((int[] == 0)nArray) ? 1 : 0)) {
            return 1;
        }
        if ((Dialog.isOpen( != 0) ? 1 : 0)) {
            var6.dm = 2;
            if ((Dialog.canContinue( != 0) ? 1 : 0)) {
                Dialog.continueSpace();
                return 2;
            }
            Log.info((String)lllllll[1]);
        }
        int[] nArray2 = new int[2];
        nArray2[1] = 4;
        if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0) && (var6.dm != 0)) {
            var6.dm = 1;
        }
        if (var6.dm != 0) {
            Item var7;
            if ((Inventory.isFull( != 0) ? 1 : 0) && (var7 = Inventory.getFirst(item -> {
                boolean bl2;
                if (!(item.getId( != null) != lIIIIIII[10]) || (item.getId() == 3)) {
                    bl2 = 2;
                    0;
                    if (3 <= -1) {
                        return ((149 + 142 - 264 + 198 ^ 26 + 185 - 17 + 1) & (0xE1 ^ 0xAE ^ (0x38 ^ 0x55) ^ -1)) != 0;
                    }
                } else {
                    bl2 = 1;
                }
                return bl2;
            }))) {
                var7.interact(lllllll[2]);
                return 2;
            }
            String[] stringArray = new String[2];
            stringArray[1] = lllllll[0];
            var7 = NPCs.getNearest((String[])stringArray);
            if var7 != null {
                var7.interact(lllllll[5]);
                return 2;
            }
            Log.info((String)lllllll[6]);
            return 1;
        }
        if ((am.ECTOFUNTUS.bo( == 0) ? 1 : 0)) {
            return var6.dd.bk();
        }
        String[] stringArray = new String[2];
        stringArray[1] = lllllll[7];
        TileObject var7 = TileObjects.getNearest((String[])stringArray);
        if var7 == null {
            Log.info((String)lllllll[8]);
            return 1;
        }
        var1_2.interact(lllllll[9]);
        return 2;
    }

    @Inject
    public PrayingWithBonemealTask(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }

    private static String llllIIllI(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 1;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 1;
        while (var15 < var14) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }
}

