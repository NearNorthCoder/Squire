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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean llllllIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllIIIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIIIlllI(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        Iterator var1 = npcLootReceived.getItems().iterator();
        while (y.llllllIIIIlIlI(var1.hasNext() ? 1 : 0)) {
            y var2;
            int n2;
            ItemStack var3 = (ItemStack)var1.next();
            if (y.llllllIIIIllIl(Inventory.getFirst(item -> {
                int n2;
                if (y.llllllIIIlIIIl(item.getId(), var3.getId()) && y.llllllIIIIlIlI(item.isStackable() ? 1 : 0)) {
                    n2 = llIIllIIIllI[1];

                    if (-(0x33 ^ 0x36) >= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIllIIIllI[0];
                }
                return n2 != 0;
            }))) {
                n2 = llIIllIIIllI[1];

                if (-1 >= (5 + 138 - 125 + 138 ^ 47 + 150 - 126 + 81)) {
                    return;
                }
            } else {
                n2 = llIIllIIIllI[0];
            }
            int var4 = n2;
            int var5 = Prices.getItemPrice((int)var3.getId()) * var3.getQuantity();
            if (y.llllllIIIIllII(var4) && y.llllllIIIIllII(ak.contains(var3.getId()) ? 1 : 0) && y.llllllIIIlIIII(var5, var2.am.lootValue())) {

                if (-2 < 0) continue;
                return;
            }
            var2.al.add(var3);

            if (-(0x8D ^ 0x89) < 0) continue;
            return;
        }
    }

    private static boolean llllllIIIIlIlI(int n2) {
        return n2 != 0;
    }

    static {
        y.llllllIIIIlIIl();
        y.llllllIIIIlIII();
        Object[] objectArray = new Integer[llIIllIIIllI[10]];
        objectArray[y.llIIllIIIllI[0]] = llIIllIIIllI[11];
        objectArray[y.llIIllIIIllI[1]] = llIIllIIIllI[12];
        objectArray[y.llIIllIIIllI[3]] = llIIllIIIllI[13];
        objectArray[y.llIIllIIIllI[14]] = llIIllIIIllI[15];
        objectArray[y.llIIllIIIllI[16]] = llIIllIIIllI[17];
        objectArray[y.llIIllIIIllI[18]] = llIIllIIIllI[2];
        ak = ImmutableSet.of((Object)llIIllIIIllI[4], (Object)llIIllIIIllI[5], (Object)llIIllIIIllI[6], (Object)llIIllIIIllI[7], (Object)llIIllIIIllI[8], (Object)llIIllIIIllI[9], (Object[])objectArray);
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
        y var6;
        if (y.llllllIIIIlIlI(this.al.isEmpty() ? 1 : 0)) {
            return llIIllIIIllI[0];
        }
        ItemStack var7 = var6.al.iterator().next();
        TileItem var8 = TileItems.getNearest(tileItem -> {
            int n2;
            if (y.llllllIIIIlIlI(tileItem.canPickup() ? 1 : 0) && y.llllllIIIlIIIl(tileItem.getId(), var7.getId())) {
                n2 = llIIllIIIllI[1];

                if (-1 >= 3) {
                    return ((112 + 92 - 172 + 103 ^ 78 + 52 - 16 + 26) & (0x56 ^ 0x16 ^ (0x48 ^ 3) ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIIIllI[0];
            }
            return n2 != 0;
        });
        if (y.llllllIIIIlIll(var8)) {
            var6.al.remove(var7);

            return llIIllIIIllI[0];
        }
        if (y.llllllIIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[llIIllIIIllI[1]];
            nArray[y.llIIllIIIllI[0]] = var8.getId();
            if (!y.llllllIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0) || y.llllllIIIIllII(var8.isStackable() ? 1 : 0)) {
                Item var9 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llIIllIIIllI[1]];
                    stringArray[y.llIIllIIIllI[0]] = llIIllIIIlIl[llIIllIIIllI[3]];
                    return item.hasAction(stringArray);
                });
                if (y.llllllIIIIllIl(var9) && y.llllllIIIIlllI(var7.getId(), llIIllIIIllI[2])) {
                    var9.interact(llIIllIIIlIl[llIIllIIIllI[0]]);
                    return llIIllIIIllI[1];
                }
                return llIIllIIIllI[0];
            }
        }
        var2_2.interact(llIIllIIIlIl[llIIllIIIllI[1]]);
        this.ao = var2_2;
        this.ap = var1_1;
        this.an.sleep(llIIllIIIllI[3]);
        return llIIllIIIllI[1];
    }

    private static boolean llllllIIIIllll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllllIIIIllIl(Object object) {
        return object != null;
    }

    private static boolean llllllIIIIlIll(Object object) {
        return object == null;
    }

        return String.valueOf(var10);
    }

    private static void llllllIIIIlIII() {
        llIIllIIIlIl = new String[llIIllIIIllI[14]];
        y.llIIllIIIlIl[y.llIIllIIIllI[0]] = "Eat";
        y.llIIllIIIlIl[y.llIIllIIIllI[1]] = "Take";
        y.llIIllIIIlIl[y.llIIllIIIllI[3]] = "Eat";
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        if (y.llllllIIIIllIl(this.ao) && y.llllllIIIIllll(itemDespawned.getItem(), this.ao)) {
            this.al.remove(this.ap);

            this.ao = null;
            this.ap = null;
        }
    }

    public List<ItemStack> P() {
        return this.al;
    }

    private static boolean llllllIIIlIIII(int n2, int n3) {
        return n2 < n3;
    }
}

