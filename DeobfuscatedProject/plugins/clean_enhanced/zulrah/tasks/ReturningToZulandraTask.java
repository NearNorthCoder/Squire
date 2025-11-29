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
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum2;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Returning to Zul'Andra", priority=10, blocking=true)
public class ReturningToZulandraTask
extends ag {

    @Inject
    protected ReturningToZulandraTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
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
            if (((0x60 ^ 0x69 ^ (0xC4 ^ 0x91)) & (0x72 ^ 0x5D ^ (0x6D ^ 0x1E) ^ -1)) == ((0xC ^ 0x15 ^ (0xC0 ^ 0x9D)) & (0x5B ^ 0x4F ^ (0x37 ^ 0x67) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var3_3;
        int var13;
        int n2;
        ah var14;
        int n3 = Inventory.getCount(item -> {
            String[] stringArray = new String[1];
            stringArray[0] = var2[3];
            return item.hasAction(stringArray);
        });
        if (!(this.aC.multiple( >= this.aC.multiple()) || (this.aC.multiple( == 0))) {
            return 0;
        }
        if (!(Inventory.contains(item -> item.getName( == 0).startsWith(this.aC.cure().k())) ? 1 : 0) || !((Object)var14.aC.cure() != (Object)var14.aC.cure()2)o.CURE_SELF) || ((Object)var14.aC.cure() == (Object)var14.aC.cure()2)o.IGNORE)) {
            n2 = 1;
            0;
            if (((0x3E ^ 5) & ~(0x8B ^ 0xB0)) != 0) {
                return ((0x76 ^ 0x6A) & ~(9 ^ 0x15)) != 0;
            }
        } else {
            n2 = 0;
        }
        if (var13 = n2 == 0) {
            return 0;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0)) {
            String[] stringArray = new String[1];
            stringArray[0] = var2[0];
            Dialog.chooseOption((String[])stringArray);
            0;
            return 1;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        TileObject var15 = TileObjects.getNearest((int[])nArray);
        if var15 == null {
            return 0;
        }
        var3_3.interact(var2[1]);
        return 1;
    }
}

