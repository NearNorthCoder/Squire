/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

@TaskDesc(name="Looting Valuables")
public class LootingValuablesTask
extends Task {
    private final  SquireLooter eG;
    private static  int[] lIlIlIIlI;
    private static  String[] lIlIlIIIl;
    private final  LooterConfig eH;

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    private boolean b(TileItem tileItem) {
        String string = Static.getClient().getItemDefinition(tileItem.getId()).getName().toLowerCase();
        int n2 = Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity();
        return tileItem.getWorldLocation().equals((Object)this.eG.cj());
    }

    private static String var2(String var3, String var4) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var6 = var4.toCharArray();
        int var7 = lIlIlIIlI[0];
        char[] var8 = var3.toCharArray();
        int var9 = var8.length;
        int var10 = lIlIlIIlI[0];
        while (aO.var11(var10, var9)) {
            char var12 = var8[var10];
            var5.append((char)(var12 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var10;
            0;
            if (1 < (0x4F ^ 0x4B)) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    @Inject
    public LootingValuablesTask(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eG = squireLooter;
        this.eH = looterConfig;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        aO var14;
        if (aO.var13(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIlIIlI[0];
        }
        if (aO.var13(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIlIlIIlI[0];
        }
        Iterator<aH> var15 = var14.eG.p().iterator();
        while (aO.var13(var15.hasNext() ? 1 : 0)) {
            aH var16 = var15.next();
            int[] nArray = new int[lIlIlIIlI[1]];
            nArray[aO.lIlIlIIlI[0]] = var16.P();
            TileItem var17 = TileItems.getFirstAt((WorldPoint)var16.cd(), (int[])nArray);
            if (aO.var18(var17)) {
                if (aO.var19(var17.distanceTo(Players.getLocal().getWorldLocation()), var14.eH.lootRange())) {
                    0;
                    if (-(0xB0 ^ 0xB5) < 0) continue;
                    return ((0x21 ^ 0x1D) & ~(0x1C ^ 0x20)) != 0;
                }
                if (aO.var1(Inventory.isFull() ? 1 : 0)) {
                    var17.interact(lIlIlIIIl[lIlIlIIlI[0]]);
                }
                if (aO.var13(Inventory.isFull() ? 1 : 0)) {
                    Item var20;
                    if (aO.var13(var17.isStackable() ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIlIIlI[1]];
                        nArray2[aO.lIlIlIIlI[0]] = var17.getId();
                        if (aO.var13(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            var17.interact(lIlIlIIIl[lIlIlIIlI[1]]);
                        }
                    }
                    if (aO.var21(var20 = Inventory.getFirst(item -> {
                        String[] stringArray = new String[lIlIlIIlI[1]];
                        stringArray[aO.lIlIlIIlI[0]] = lIlIlIIIl[lIlIlIIlI[3]];
                        return item.hasAction(stringArray);
                    }))) {
                        return lIlIlIIlI[0];
                    }
                    var20.interact(lIlIlIIIl[lIlIlIIlI[2]]);
                    return lIlIlIIlI[1];
                }
            }
            0;
            if (3 <= 3) continue;
            return ((0xD9 ^ 0x86 ^ (0x2C ^ 0x2B)) & (104 + 208 - 83 + 13 ^ 45 + 84 - 80 + 121 ^ -1)) != 0;
        }
        return lIlIlIIlI[1];
    }

    private static void var22() {
        lIlIlIIIl = new String[lIlIlIIlI[4]];
        aO.lIlIlIIIl[aO.lIlIlIIlI[0]] = "Take";
        aO.lIlIlIIIl[aO.lIlIlIIlI[1]] = "Take";
        aO.lIlIlIIIl[aO.lIlIlIIlI[2]] = "Eat";
        aO.lIlIlIIIl[aO.lIlIlIIlI[3]] = "Eat";
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var18(Object object) {
        return object != null;
    }

    private static void var29() {
        lIlIlIIlI = new int[5];
        aO.lIlIlIIlI[0] = (215 + 210 - 390 + 187 ^ 149 + 134 - 111 + 21) & (7 + 36 - -86 + 19 ^ 23 + 2 - -46 + 68 ^ -1);
        aO.lIlIlIIlI[1] = 1;
        aO.lIlIlIIlI[2] = 2;
        aO.lIlIlIIlI[3] = 3;
        aO.lIlIlIIlI[4] = 0xBF ^ 0xBB;
    }

    private static boolean var19(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aO.var29();
        aO.var22();
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var21(Object object) {
        return object == null;
    }
}

