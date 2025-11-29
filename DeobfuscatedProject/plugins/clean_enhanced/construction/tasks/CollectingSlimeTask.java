/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import net.runelite.api.coords.WorldArea;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Collecting slime", priority=10, blocking=true, register=true)
public class CollectingSlimeTask
extends as {
    private static  String[] lIIIIIIll;
    private static  int[] lIIIIIlII;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        void var7;
        if ((am.SLIME_COLLECTION.bo( == 0) ? 1 : 0)) {
            return;
        }
        if ((var7.getChangeType() == var7.getChangeType()2) && (var7.getItemId() == lIIIIIlII[12])) {
            ar var8;
            var8.dd.s(var8.dd.bn() + 1);
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (((231 + 242 - 458 + 234 ^ 78 + 20 - 79 + 133) & (0xF3 ^ 0x88 ^ (0x20 ^ 0x3A) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bB() {
        void var2_2;
        void var3_3;
        block12: {
            block11: {
                if ((this.dd.r( != 0) ? 1 : 0)) {
                    return 0;
                }
                int[] nArray = new int[1];
                nArray[0] = 2;
                if (!(Inventory.contains((int[] != 0)nArray) ? 1 : 0)) break block11;
                int[] nArray2 = new int[1];
                nArray2[0] = 3;
                if (!(Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) break block12;
            }
            return 0;
        }
        TileObject var25 = TileObjects.getNearest(tileObject -> tileObject.getName().equals(lIIIIIIll[lIIIIIlII[13]]));
        if ((am.ECTOFUNTUS.bo( != 0) ? 1 : 0) && var25 != null) {
            String[] stringArray = new String[1];
            stringArray[0] = lIIIIIIll[0];
            if ((var25.hasActionstringArray)) {
                Log.info((String)lIIIIIIll[1]);
                var25.interact(lIIIIIIll[4]);
                return 1;
            }
            String[] stringArray2 = new String[1];
            stringArray2[0] = lIIIIIIll[5];
            if ((var25.hasActionstringArray2)) {
                Log.info((String)lIIIIIIll[6]);
                var25.interact(lIIIIIIll[7]);
                return 1;
            }
            Log.info((String)lIIIIIIll[8]);
            return 0;
        }
        if ((am.SLIME_COLLECTION.bo( == 0) ? 1 : 0)) {
            if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
                return 0;
            }
            Log.info((String)lIIIIIIll[9]);
            return Movement.walkTo((WorldArea)am.SLIME_COLLECTION.bp());
        }
        String[] stringArray = new String[1];
        stringArray[0] = lIIIIIIll[lIIIIIlII[10]];
        TileObject var26 = TileObjects.getNearest((String[])stringArray);
        if var26 == null {
            Log.info((String)lIIIIIIll[lIIIIIlII[11]]);
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        Item var27 = Inventory.getFirst((int[])nArray);
        if var27 == null {
            return 0;
        }
        var3_3.useOn((TileObject)var2_2);
        return 1;
    }

    @Inject
    public CollectingSlimeTask(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }
}

