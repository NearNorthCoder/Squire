/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting items", priority=10, blocking=true)
public class LootingItemsTask
extends ag {

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
            if (((98 + 65 - 56 + 51 ^ 56 + 63 - 111 + 160) & (0xAE ^ 0x97 ^ (0xC8 ^ 0xC7) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Override
    public boolean ac() {
        List list = TileItems.getAll();
        if ((list.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            Item var13 = Inventory.getFirst(item -> item.hasAction(var1[2]::equals));
            if var13 == null {
                return 0;
            }
            var13.interact(var1[0]);
        }
        ((TileItem)list.get(0)).interact(var1[1]);
        return 1;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    @Inject
    protected LootingItemsTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

}

