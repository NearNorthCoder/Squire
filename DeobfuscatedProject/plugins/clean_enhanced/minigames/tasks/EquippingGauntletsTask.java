/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping Gauntlets")
public class EquippingGauntletsTask
extends MinigamesTaskBase<v> {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(v v2, o o2) {
        void var3_3;
        Item var3;
        Item item;
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            item = Bank.Inventory.getFirst((int[])v2.I());
            0;
            if (-3 >= 0) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else {
            void var4;
            item = Inventory.getFirst((int[])var4.I());
        }
        if (var3 = item == null) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        stringArray[2] = var2[2];
        stringArray[3] = var2[3];
        var3_3.interact(stringArray);
        return 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    public EquippingGauntletsTask(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, MinigamesManager.class, string -> {
            int n2;
            if (!(string.equals(I.bf == 0) ? 1 : 0) || !(string.equals(I.bd == 0) ? 1 : 0) || !(string.equals(I.bi == 0) ? 1 : 0) || (string.equals(I.bj != 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if (-1 > 0) {
                    return ((0xD9 ^ 0x83) & ~(0x3E ^ 0x64)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
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

}

