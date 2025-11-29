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
package u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n;

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

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking")
public class BankingTask
extends Task {
    private static /* synthetic */ int[] lIlIlIIIIIl;
    private final /* synthetic */ SquireAccountCleanerConfig d;
    private static /* synthetic */ String[] lIlIlIIIIII;

    private static boolean lIIlIIIIllIlII(Object object) {
        return object != null;
    }

    private static String lIIlIIIIlIlllI(String var25, String var13) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var3 = var13.toCharArray();
        int var15 = lIlIlIIIIIl[1];
        char[] var12 = var25.toCharArray();
        int var6 = var12.length;
        int var11 = lIlIlIIIIIl[1];
        while (a.lIIlIIIIllIllI(var11, var6)) {
            char var22 = var12[var11];
            var7.append((char)(var22 ^ var3[var15 % var3.length]));
            0;
            ++var15;
            ++var11;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void lIIlIIIIllIIIl() {
        lIlIlIIIIII = new String[lIlIlIIIIIl[6]];
        a.lIlIlIIIIII[a.lIlIlIIIIIl[1]] = a."Banker";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[0]] = a."Bank";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[2]] = a.",";
        a.lIlIlIIIIII[a.lIlIlIIIIIl[4]] = a."Members";
    }

    private static boolean lIIlIIIIlllIII(int n, int n2) {
        return n != n2;
    }

    private static String lIIlIIIIllIIII(String var26, String var10) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIl[3]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIlIlIIIIIl[2], var21);
            return new String(var16.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    @Inject
    public a(SquireAccountCleanerConfig squireAccountCleanerConfig) {
        this.d = squireAccountCleanerConfig;
    }

    private static void lIIlIIIIllIIlI() {
        lIlIlIIIIIl = new int[7];
        a.lIlIlIIIIIl[0] = 1;
        a.lIlIlIIIIIl[1] = (0x71 ^ 0x6D) & ~(0x98 ^ 0x84);
        a.lIlIlIIIIIl[2] = 2;
        a.lIlIlIIIIIl[3] = 113 + 62 - 137 + 131 ^ 118 + 58 - 78 + 63;
        a.lIlIlIIIIIl[4] = 3;
        a.lIlIlIIIIIl[5] = -(0xFFFFF99D & 0x6E6F) & (0xFFFFEFEF & 0x7BFF);
        a.lIlIlIIIIIl[6] = 3 ^ (0x5C ^ 0x5B);
    }

    private boolean a(Item item) {
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
        Object var4;
        a var19;
        if (a.lIIlIIIIllIIll(Inventory.contains(item -> {
            boolean bl;
            if (a.lIIlIIIIlllIII(item.getId(), lIlIlIIIIIl[5])) {
                bl = lIlIlIIIIIl[0];
                0;
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
        String var5 = var19.d.ignoreList();
        ArrayList<Integer> var18 = new ArrayList<Integer>();
        if (a.lIIlIIIIllIIll(var5.isEmpty() ? 1 : 0)) {
            var4 = var5.split(lIlIlIIIIII[lIlIlIIIIIl[2]]);
            String[] var27 = var4;
            int var24 = var27.length;
            int var20 = lIlIlIIIIIl[1];
            while (a.lIIlIIIIllIllI(var20, var24)) {
                String var14 = var27[var20];
                Integer var8 = Integer.parseInt(var14);
                var18.add(var8);
                0;
                ++var20;
                0;
                if (3 == 3) continue;
                return false;
            }
        }
        if (a.lIIlIIIIllIlIl(Bank.isOpen() ? 1 : 0) && a.lIIlIIIIllIIll(Inventory.isFull() ? 1 : 0)) {
            var4 = Bank.getAll(item -> {
                int n;
                if (a.lIIlIIIIllIlll(this.b((Item)item), this.d.sellValue()) && a.lIIlIIIIllIIll(var18.contains(item.getId()) ? 1 : 0) && (!a.lIIlIIIIllIIll(item.isTradable() ? 1 : 0) || a.lIIlIIIIllIlIl(this.a((Item)item) ? 1 : 0))) {
                    n = lIlIlIIIIIl[0];
                    0;
                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n = lIlIlIIIIIl[1];
                }
                return n != 0;
            });
            int var27 = lIlIlIIIIIl[1];
            Iterator var24 = var4.iterator();
            while (a.lIIlIIIIllIlIl(var24.hasNext() ? 1 : 0)) {
                Item var20 = (Item)var24.next();
                if (a.lIIlIIIIllIlll(var27, lIlIlIIIIIl[3])) {
                    0;
                    if ((0x29 ^ 0x2C) > 0) break;
                    return false;
                }
                ++var27;
                Bank.withdrawAll((int)var20.getId(), (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                0;
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

    private static String lIIlIIIIlIllll(String var1, String var17) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIlIlIIIIIl[2], var2);
            return new String(var23.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
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

