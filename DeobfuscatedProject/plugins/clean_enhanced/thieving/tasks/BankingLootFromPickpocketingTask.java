/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.thieving.tasks;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Banking loot from pickpocketing", priority=2000, blocking=true, register=true)
public class BankingLootFromPickpocketingTask
extends ThievingManager {
    
    private static final  Logger au;

    static {
        C.var3();
        C.var4();
        au = LoggerFactory.getLogger(BankingLootFromPickpocketingTask.class);
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var1_1;
        Item var6;
        C var7;
        if (C.var8(this.p.depositSeedVault() ? 1 : 0)) {
            return var1[0];
        }
        if (C.var9(var7.o.j() ? 1 : 0)) {
            return var1[0];
        }
        if (C.var9(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        InventorySetup var10 = var7.o.g();
        if (C.var8(var10.matchesInventory() ? 1 : 0)) {
            var7.o.b(var1[0]);
        }
        if (C.var8(var7.p.gemBag() ? 1 : 0) && C.var9(var7.o.k() ? 1 : 0) && C.var11(var6 = Bank.Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[2]])))) {
            var6.interact(var2[var1[0]]);
            return var1[1];
        }
        var1_1.withdraw();
        0;
        this.sleep(var1[2]);
        return var1[1];
    }

    @Inject
    public BankingLootFromPickpocketingTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[5];
        C.var1[0] = (0x54 ^ 0x2A ^ (0x14 ^ 0x7F)) & (0x44 ^ 0xA ^ (0xCF ^ 0x94) ^ -1);
        C.var1[1] = 1;
        C.var1[2] = 2;
        C.var1[3] = 3;
        C.var1[4] = 0xB7 ^ 0xBF ^ (0x30 ^ 0x78) & ~(0x8B ^ 0xC3);
    }

    private static void var4() {
        var2 = new String[var1[3]];
        C.var2[C.var1[0]] = "Empty";
        C.var2[C.var1[1]] = "gem bag is empty";
        C.var2[C.var1[2]] = "gem bag";
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (C.var5(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            
            return null;
        }
        return String.valueOf(var21);
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var34(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void var35;
        if (C.var34(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var36 = var35.getMessage();
        if (C.var8(var36.contains(var2[var1[1]]) ? 1 : 0)) {
            C var37;
            var37.o.c(var1[1]);
        }
    }
}

