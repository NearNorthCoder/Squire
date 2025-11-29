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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Banking loot from pickpocketing", priority=2000, blocking=true, register=true)
public class BankingLootFromPickpocketingTask
extends ThievingTaskBase {
    
    private static final  Logger au;

    static {
        C.lIllIIIllllIIll();
        C.lIllIIIllllIIlI();
        au = LoggerFactory.getLogger(BankingLootFromPickpocketingTask.class);
    }

    private static boolean lIllIIIlllllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var1_1;
        Item var1;
        C var2;
        if (C.lIllIIIllllIlII(this.p.depositSeedVault() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        if (C.lIllIIIllllIlIl(var2.o.j() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        if (C.lIllIIIllllIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        InventorySetup var3 = var2.o.g();
        if (C.lIllIIIllllIlII(var3.matchesInventory() ? 1 : 0)) {
            var2.o.b(lIIllIlllIlll[0]);
        }
        if (C.lIllIIIllllIlII(var2.p.gemBag() ? 1 : 0) && C.lIllIIIllllIlIl(var2.o.k() ? 1 : 0) && C.lIllIIIllllIllI(var1 = Bank.Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIlllIlll[2]])))) {
            var1.interact(lIIllIlllIllI[lIIllIlllIlll[0]]);
            return lIIllIlllIlll[1];
        }
        var1_1.withdraw();

        this.sleep(lIIllIlllIlll[2]);
        return lIIllIlllIlll[1];
    }

    @Inject
    public BankingLootFromPickpocketingTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIIllllIlII(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIllllIIlI() {
        lIIllIlllIllI = new String[lIIllIlllIlll[3]];
        C.lIIllIlllIllI[C.lIIllIlllIlll[0]] = "Empty";
        C.lIIllIlllIllI[C.lIIllIlllIlll[1]] = "gem bag is empty";
        C.lIIllIlllIllI[C.lIIllIlllIlll[2]] = "gem bag";
    }

        return String.valueOf(var4);
    }

    private static boolean lIllIIIllllIllI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIllllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIllllIlll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void var5;
        if (C.lIllIIIllllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var6 = var5.getMessage();
        if (C.lIllIIIllllIlII(var6.contains(lIIllIlllIllI[lIIllIlllIlll[1]]) ? 1 : 0)) {
            C var7;
            var7.o.c(lIIllIlllIlll[1]);
        }
    }
}

