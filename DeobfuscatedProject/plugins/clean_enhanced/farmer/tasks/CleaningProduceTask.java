/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Iterator;
import java.util.function.Predicate;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Cleaning produce", priority=21)
public class CleaningProduceTask
extends az {

    @Inject
    public CleaningProduceTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    public boolean run() {
        if ((Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            this.sleep(3);
            return 1;
        }
        Item var3 = Inventory.getFirst(item -> item.hasAction(var1[3]::equals));
        if var3 == null {
            return 1;
        }
        bd.a(item -> item.hasAction(var1[2]::equals));
        0;
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(Predicate<Item> predicate) {
        boolean bl;
        void var4;
        int n2 = 0;
        Iterator var5 = Inventory.getAll(predicate).iterator();
        while ((var5.hasNext( != 0) ? 1 : 0)) {
            Item var6 = (Item)var5.next();
            var6.interact(var1[1]);
            if (((int <= 0)(--var4))) {
                return 2;
            }
            0;
            if (-(0xFC ^ 0xAF ^ (0x4D ^ 0x1B)) < 0) continue;
            return ((0x2D ^ 0x1B ^ (0xDA ^ 0xAF)) & (0x2A ^ 0x31 ^ (0x5A ^ 2) ^ -1)) != 0;
        }
        if (((int)var4 < 0)) {
            bl = 2;
            0;
            if (3 >= (0x8E ^ 0x9D ^ (0x61 ^ 0x76))) {
                return ((0xC4 ^ 0x8C ^ (0x94 ^ 0x87)) & (55 + 99 - 81 + 138 ^ 131 + 29 - 121 + 97 ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    private static String var7(String var8, String var9) {
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
            if ((0x79 ^ 0x7C) > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

}

