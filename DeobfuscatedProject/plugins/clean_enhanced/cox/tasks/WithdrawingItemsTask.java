/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Withdrawing items", priority=19000, blocking=true)
public class WithdrawingItemsTask
extends CoxTaskBase {

    private final  int cz = 0xF0000A;

    public WithdrawingItemsTask() {
        this.cz = 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cs() {
        void var3_4;
        int[] nArray = new int[3];
        nArray[1] = 4;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 1;
        }
        if ((Dialog.canContinue( != 0) ? 1 : 0)) {
            Dialog.continueSpace();
            return 3;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0) && (Dialog.hasOption(StringlIlIIllIIllI[7]) ? 1 : 0) && (Dialog.hasOption(StringlIlIIllIIllI[5]) ? 1 : 0)) {
            String[] stringArray = new String[3];
            stringArray[1] = var2[8];
            Dialog.chooseOption((String[])stringArray);
            0;
            return 3;
        }
        Widget var3 = Widgets.get((int)9, (int)var1[10], (int)1);
        if (var3 != null && (var3.isVisible( != 0) ? 1 : 0) && (var3.getText( != 0).contains(var2[6]) ? 1 : 0)) {
            Widget var4 = Widgets.get((int)9, (int)var1[10]);
            if var4 == null {
                return 1;
            }
            var4.interact(var2[2]);
            return 3;
        }
        Widget var4 = Static.getClient().getWidget(0);
        if var4 != null {
            var4.interact(3, var1[11], var1[12], 0);
            return 3;
        }
        int[] nArray2 = new int[3];
        nArray2[1] = 4;
        Item var5 = Inventory.getFirst((int[])nArray2);
        if var5 == null {
            return 1;
        }
        var3_4.interact(var2[var1[13]]);
        return 3;
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

    @Override
    public boolean cg() {
        aa var18;
        if ((this.cr( == 0) ? 1 : 0)) {
            return 1;
        }
        if (cw == 0) {
            return 1;
        }
        TileObject var19 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[var1[14]]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[1] = var2[var1[15]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if (-1 <= 0) return n2 != 0;
                    return ((24 + 237 - 182 + 160 ^ 79 + 15 - -12 + 73) & (0x25 ^ 0x6A ^ (0xA ^ 0x19) ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if (var19 != null && (Players.getLocal().distanceTo((Locatable)var19) > 2)) {
            Movement.setDestination((WorldPoint)var19.getWorldLocation());
            return 3;
        }
        int[] nArray = new int[3];
        nArray[1] = 4;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            var18.cs();
            0;
            return 3;
        }
        if ((var18.q( == null))) {
            Log.error((String)var2[1]);
            return 1;
        }
        if ((var18.q( == 0).needsToBank() ? 1 : 0)) {
            if ((Bank.isOpen( == 0) ? 1 : 0)) {
                var18.v.b(1);
                return 1;
            }
            Bank.close();
            var18.sleep(5);
            return 3;
        }
        if ((BankLoadouts.withdrawWithRetries((BankLoadout == 0)var18.q(), (int)6).booleanValue() ? 1 : 0)) {
            Log.info((String)var2[3]);
            return 1;
        }
        this.sleep(7);
        return 3;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = 1;
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = 1;
        while (var28 < var27) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if ((0x1B ^ 0x1F) == (0x4D ^ 0x49)) continue;
            return null;
        }
        return String.valueOf(var23);
    }

}

