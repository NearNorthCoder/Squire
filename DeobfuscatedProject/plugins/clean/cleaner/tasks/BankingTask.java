/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.cleaner.tasks;

import com.google.inject.Inject;
import gg.squire.cleaner.SquireAccountCleanerConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    
    private final  SquireAccountCleanerConfig d;

    private static boolean lIIlIIIIllIlII(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    private static void lIIlIIIIllIIIl() {
        lIlIlIIIIII = new String[lIlIlIIIIIl[6]];
        a.lIlIlIIIIII[a.lIlIlIIIIIl[1]] = "Banker";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[0]] = "Bank";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[2]] = ",";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[4]] = "Members";
    }

    private static boolean lIIlIIIIlllIII(int n, int n2) {
        return n != n2;
    }

    @Inject
    public BankingTask(SquireAccountCleanerConfig squireAccountCleanerConfig) {
        this.d = squireAccountCleanerConfig;
    }

    private boolean BankingTask(Item item) {
        if (a.lIIlIIIIllIIll(item.getName().contains(lIlIlIIIIII[lIlIlIIIIIl[4]]) ? 1 : 0)) {
            return lIlIlIIIIIl[1];
        }
        ItemComposition itemComposition = Static.getClient().getItemComposition(item.getId());
        return itemComposition.isTradeable();
    }

    private int b(Item item) {
        ItemComposition itemComposition = Static.getClient().getItemDefinition(item.getId());
        String string = itemComposition.getName().toLowerCase();
        int n = Prices.getItemPrice((int)item.getId()) * item.getQuantity();
        return n;
    }

    public boolean run() {
        Object var2;
        a var3;
        if (a.lIIlIIIIllIIll(Inventory.contains(item -> {
            boolean bl;
            if (a.lIIlIIIIlllIII(item.getId(), lIlIlIIIIIl[5])) {
                bl = lIlIlIIIIIl[0];

                if ((0x55 ^ 0x5C ^ (0xCE ^ 0xC2)) <= 0) {
                    return ((0xA8 ^ 0xB7 ^ (0x54 ^ 0x28)) & (0xE2 ^ 0x8A ^ (0x50 ^ 0x5B) ^ -1)) != 0;
                }
            } else {
                bl = lIlIlIIIIIl[1];
            }
            return bl;
        }) ? 1 : 0) && a.lIIlIIIIllIIll(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIIIIIl[0]];
            stringArray[a.lIlIlIIIIIl[1]] = lIlIlIIIIII[lIlIlIIIIIl[1]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (a.lIIlIIIIllIlII(nPC) && a.lIIlIIIIllIlIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIlIlIIIIII[lIlIlIIIIIl[0]]);
                return lIlIlIIIIIl[1];
            }
        }
        String var4 = var3.d.ignoreList();
        ArrayList<Integer> var5 = new ArrayList<Integer>();
        if (a.lIIlIIIIllIIll(var4.isEmpty() ? 1 : 0)) {
            var2 = var4.split(lIlIlIIIIII[lIlIlIIIIIl[2]]);
            String[] var6 = var2;
            int var7 = var6.length;
            int var8 = lIlIlIIIIIl[1];
            while (a.lIIlIIIIllIllI(var8, var7)) {
                String var9 = var6[var8];
                Integer var10 = Integer.parseInt(var9);
                var5.add(var10);

                ++var8;

                if (3 == 3) continue;
                return false;
            }
        }
        if (a.lIIlIIIIllIlIl(Bank.isOpen() ? 1 : 0) && a.lIIlIIIIllIIll(Inventory.isFull() ? 1 : 0)) {
            var2 = Bank.getAll(item -> {
                int n;
                if (a.lIIlIIIIllIlll(this.b((Item)item), this.d.sellValue()) && a.lIIlIIIIllIIll(var5.contains(item.getId()) ? 1 : 0) && (!a.lIIlIIIIllIIll(item.isTradable() ? 1 : 0) || a.lIIlIIIIllIlIl(this.BankingTask((Item)item) ? 1 : 0))) {
                    n = lIlIlIIIIIl[0];

                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n = lIlIlIIIIIl[1];
                }
                return n != 0;
            });
            int var6 = lIlIlIIIIIl[1];
            Iterator var7 = var2.iterator();
            while (a.lIIlIIIIllIlIl(var7.hasNext() ? 1 : 0)) {
                Item var8 = (Item)var7.next();
                if (a.lIIlIIIIllIlll(var6, lIlIlIIIIIl[3])) {

                    if ((0x29 ^ 0x2C) > 0) break;
                    return false;
                }
                ++var6;
                Bank.withdrawAll((int)var8.getId(), (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);

                if (1 == 1) continue;
                return false;
            }
        }
        return lIlIlIIIIIl[0];
    }

    private static boolean lIIlIIIIllIIll(int n) {
        return n == 0;
    }

    private static boolean lIIlIIIIllIlll(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIIIIllIllI(int n, int n2) {
        return n < n2;
    }

    static {
        a.lIIlIIIIllIIlI();
        a.lIIlIIIIllIIIl();
    }

    private static boolean lIIlIIIIllIlIl(int n) {
        return n != 0;
    }
}

