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
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

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
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.AttackingGorillaTask;

/* TASK: Looting Gorilla -> LootinggorillaTask */
@TaskDesc(name="Looting Gorilla", priority=25, blocking=true, register=true)
@Singleton
public class LootingGorillaTask
extends Task {
    private final /* synthetic */ List<ItemStack> al;
    private final /* synthetic */ o an;
    private static final /* synthetic */ Set<Integer> ak;
    private /* synthetic */ ItemStack ap;
    private final /* synthetic */ SquireGorillaConfig am;
    private static /* synthetic */ String[] llIIllIIIlIl;
    private /* synthetic */ TileItem ao;
    private static /* synthetic */ int[] llIIllIIIllI;

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
        Iterator var13 = npcLootReceived.getItems().iterator();
        while (y.llllllIIIIlIlI(var13.hasNext() ? 1 : 0)) {
            y var17;
            int n2;
            ItemStack var4 = (ItemStack)var13.next();
            if (y.llllllIIIIllIl(Inventory.getFirst(item -> {
                int n2;
                if (y.llllllIIIlIIIl(item.getId(), var4.getId()) && y.llllllIIIIlIlI(item.isStackable() ? 1 : 0)) {
                    n2 = llIIllIIIllI[1];
                    0;
                    if (-(0x33 ^ 0x36) >= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIllIIIllI[0];
                }
                return n2 != 0;
            }))) {
                n2 = llIIllIIIllI[1];
                0;
                if (-1 >= (5 + 138 - 125 + 138 ^ 47 + 150 - 126 + 81)) {
                    return;
                }
            } else {
                n2 = llIIllIIIllI[0];
            }
            int var7 = n2;
            int var11 = Prices.getItemPrice((int)var4.getId()) * var4.getQuantity();
            if (y.llllllIIIIllII(var7) && y.llllllIIIIllII(ak.contains(var4.getId()) ? 1 : 0) && y.llllllIIIlIIII(var11, var17.am.lootValue())) {
                0;
                if (-2 < 0) continue;
                return;
            }
            var17.al.add(var4);
            0;
            0;
            if (-(0x8D ^ 0x89) < 0) continue;
            return;
        }
    }

    private static void llllllIIIIlIIl() {
        llIIllIIIllI = new int[19];
        y.llIIllIIIllI[0] = (0x20 ^ 0x49 ^ (0x10 ^ 0x2E)) & (110 + 202 - 177 + 98 ^ 30 + 10 - -92 + 58 ^ -1);
        y.llIIllIIIllI[1] = 1;
        y.llIIllIIIllI[2] = 0xFFFF93A5 & 0x6DDB;
        y.llIIllIIIllI[3] = 2;
        y.llIIllIIIllI[4] = 0xFFFFDFFF & 0x31EB;
        y.llIIllIIIllI[5] = 0xFFFFCDBB & 0x3B7F;
        y.llIIllIIIllI[6] = 0xFFFFD64F & 0x2DF5;
        y.llIIllIIIllI[7] = 0xFFFF8CFF & 0x7737;
        y.llIIllIIIllI[8] = -(0xFFFFF8AF & 0x2752) & (0xFFFFECBB & 0x7FDF);
        y.llIIllIIIllI[9] = -(0xFF ^ 0x9A) & (0xFFFFCCFC & 0x7FEF);
        y.llIIllIIIllI[10] = 0x85 ^ 0x83;
        y.llIIllIIIllI[11] = -(0xFFFFF7AF & 0x2879) & (0xFFFFECBB & 0x7FFD);
        y.llIIllIIIllI[12] = -(0xFFFFD31F & 0x3FE9) & (0xFFFFFFFD & 0x5F8F);
        y.llIIllIIIllI[13] = -(0xFFFFB7ED & 0x5B5F) & (0xFFFFDFCE & Short.MAX_VALUE);
        y.llIIllIIIllI[14] = 3;
        y.llIIllIIIllI[15] = 0xFFFF8F5D & 0x74FB;
        y.llIIllIIIllI[16] = 0xAB ^ 0xAF;
        y.llIIllIIIllI[17] = -(0xFFFFEFFF & 0x1185) & (0xFFFFFDFD & 0x4FCF);
        y.llIIllIIIllI[18] = 0x33 ^ 0x36;
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
    public y(SquireGorillaConfig squireGorillaConfig, o o2) {
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
        y var5;
        if (y.llllllIIIIlIlI(this.al.isEmpty() ? 1 : 0)) {
            return llIIllIIIllI[0];
        }
        ItemStack var19 = var5.al.iterator().next();
        TileItem var3 = TileItems.getNearest(tileItem -> {
            int n2;
            if (y.llllllIIIIlIlI(tileItem.canPickup() ? 1 : 0) && y.llllllIIIlIIIl(tileItem.getId(), var19.getId())) {
                n2 = llIIllIIIllI[1];
                0;
                if (-1 >= 3) {
                    return ((112 + 92 - 172 + 103 ^ 78 + 52 - 16 + 26) & (0x56 ^ 0x16 ^ (0x48 ^ 3) ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIIIllI[0];
            }
            return n2 != 0;
        });
        if (y.llllllIIIIlIll(var3)) {
            var5.al.remove(var19);
            0;
            return llIIllIIIllI[0];
        }
        if (y.llllllIIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[llIIllIIIllI[1]];
            nArray[y.llIIllIIIllI[0]] = var3.getId();
            if (!y.llllllIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0) || y.llllllIIIIllII(var3.isStackable() ? 1 : 0)) {
                Item var12 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llIIllIIIllI[1]];
                    stringArray[y.llIIllIIIllI[0]] = llIIllIIIlIl[llIIllIIIllI[3]];
                    return item.hasAction(stringArray);
                });
                if (y.llllllIIIIllIl(var12) && y.llllllIIIIlllI(var19.getId(), llIIllIIIllI[2])) {
                    var12.interact(llIIllIIIlIl[llIIllIIIllI[0]]);
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

    private static String llllllIIIIIlll(String var10, String var22) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var14 = var22.toCharArray();
        int var2 = llIIllIIIllI[0];
        char[] var18 = var10.toCharArray();
        int var16 = var18.length;
        int var9 = llIIllIIIllI[0];
        while (y.llllllIIIlIIII(var9, var16)) {
            char var21 = var18[var9];
            var1.append((char)(var21 ^ var14[var2 % var14.length]));
            0;
            ++var2;
            ++var9;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static void llllllIIIIlIII() {
        llIIllIIIlIl = new String[llIIllIIIllI[14]];
        y.llIIllIIIlIl[y.llIIllIIIllI[0]] = y."Eat";
        y.llIIllIIIlIl[y.llIIllIIIllI[1]] = y."Take";
        y.llIIllIIIlIl[y.llIIllIIIllI[3]] = y."Eat";
    }

    private static String llllllIIIIIllI(String var23, String var20) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llIIllIIIllI[3], var6);
            return new String(var15.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        if (y.llllllIIIIllIl(this.ao) && y.llllllIIIIllll(itemDespawned.getItem(), this.ao)) {
            this.al.remove(this.ap);
            0;
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

