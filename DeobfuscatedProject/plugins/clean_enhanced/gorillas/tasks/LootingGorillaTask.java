/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.game.ItemStack
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gorillas.tasks;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.game.ItemStack;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import gg.squire.gorillas.tasks.AttackingGorillaTask;

@TaskDesc(name="Looting Gorilla", priority=25, blocking=true, register=true)
@Singleton
public class LootingGorillaTask
extends Task {
    private final  List<ItemStack> al;
    private final  o an;
    private static final  Set<Integer> ak;
    private  ItemStack ap;
    private final  SquireGorillaConfig am;
    
    private  TileItem ao;

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        Iterator var3 = npcLootReceived.getItems().iterator();
        while ((var3.hasNext( != 0) ? 1 : 0)) {
            y var4;
            int n2;
            ItemStack var5 = (ItemStack)var3.next();
            if ((Inventory.getFirst(item -> {
                int n2;
                if ((item.getId( != null) == var5.getId()) && (item.isStackable( != 0) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (-(0x33 ^ 0x36) >= 0) {
                        return ((0x79 ^ 0x40) & ~(0xFC ^ 0xC5)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            }))) {
                n2 = 1;
                0;
                if (-1 >= (5 + 138 - 125 + 138 ^ 47 + 150 - 126 + 81)) {
                    return;
                }
            } else {
                n2 = 0;
            }
            int var6 = n2;
            int var7 = Prices.getItemPrice((int)var5.getId()) * var5.getQuantity();
            if ((var6 == 0) && (ak.contains(var5.getId( == 0)) ? 1 : 0) && (var7 < var4.am.lootValue())) {
                0;
                if (-2 < 0) continue;
                return;
            }
            var4.al.add(var5);
            0;
            0;
            if (-(0x8D ^ 0x89) < 0) continue;
            return;
        }
    }

    static {
        y.var8();
        y.var9();
        Object[] objectArray = new Integer[var2[10]];
        objectArray[0] = var2[11];
        objectArray[1] = var2[12];
        objectArray[3] = var2[13];
        objectArray[y.var2[14]] = var2[15];
        objectArray[y.var2[16]] = var2[17];
        objectArray[y.var2[18]] = 2;
        ak = ImmutableSet.of((Object)4, (Object)5, (Object)6, (Object)7, (Object)8, (Object)9, (Object[])objectArray);
    }

    @Inject
    public LootingGorillaTask(SquireGorillaConfig squireGorillaConfig, o o2) {
        this.al = new ArrayList<ItemStack>();
        this.am = squireGorillaConfig;
        this.an = o2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        y var10;
        if ((this.al.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        ItemStack var11 = var10.al.iterator().next();
        TileItem var12 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.canPickup( != 0) ? 1 : 0) && (tileItem.getId() == var11.getId())) {
                n2 = 1;
                0;
                if (-1 >= 3) {
                    return ((112 + 92 - 172 + 103 ^ 78 + 52 - 16 + 26) & (0x56 ^ 0x16 ^ (0x48 ^ 3) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var12 == null {
            var10.al.remove(var11);
            0;
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[0] = var12.getId();
            if (!(Inventory.contains((int[] != 0)nArray) ? 1 : 0) || (var12.isStackable( == 0) ? 1 : 0)) {
                Item var13 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[1];
                    stringArray[0] = var1[3];
                    return item.hasAction(stringArray);
                });
                if (var13 != null && (var11.getId() != 2)) {
                    var13.interact(var1[0]);
                    return 1;
                }
                return 0;
            }
        }
        var2_2.interact(var1[1]);
        this.ao = var2_2;
        this.ap = var1_1;
        this.an.sleep(3);
        return 1;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = 0;
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = 0;
        while (var22 < var21) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        if ((this.ao != null) && (itemDespawned.getItem() == itemDespawned.getItem()2)) {
            this.al.remove(this.ap);
            0;
            this.ao = null;
            this.ap = null;
        }
    }

    public List<ItemStack> P() {
        return this.al;
    }

}

