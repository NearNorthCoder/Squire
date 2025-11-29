/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import gg.squire.mining.tasks.GameEnum29;
import gg.squire.mining.tasks.GameEnum;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Banking at guild")
public class BankingAtGuildTask
extends Task {

    private final  SquireMinerConfig E;

        return String.valueOf(var1);
    }

    static {
        u.lIIlIIllIIllIII();
        u.lIIlIIlIlIllIll();
    }

    private static boolean lIIlIIllIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIllIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIIllIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIllIIllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIIlIlIllIll() {
        lllllIIlIIlI = new String[lllllIlIIlII[1]];
        u.lllllIIlIIlI[u.lllllIlIIlII[0]] = "pickaxe";
    }

    private static boolean lIIlIIllIIllIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public BankingAtGuildTask(SquireMinerConfig squireMinerConfig) {
        this.E = squireMinerConfig;
    }

    public boolean run() {
        u var2;
        if (u.lIIlIIllIIllIIl((Object)this.E.activity(), (Object)a.AMETHYST) && u.lIIlIIllIIllIIl((Object)this.E.activity(), (Object)a.GUILD_IRON)) {
            return lllllIlIIlII[0];
        }
        if (u.lIIlIIllIIllIIl((Object)var2.E.craft(), (Object)b.DISABLE) && u.lIIlIIllIIllIlI((Object)var2.E.activity(), (Object)a.AMETHYST)) {
            return lllllIlIIlII[0];
        }
        if (u.lIIlIIllIIllIll(Inventory.isFull() ? 1 : 0)) {
            return lllllIlIIlII[0];
        }
        if (u.lIIlIIllIIllIll(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return lllllIlIIlII[1];
        }
        HashSet<Item> var3 = new HashSet<Item>();
        Iterator var4 = Inventory.getAll().iterator();
        while (u.lIIlIIllIIlllII(var4.hasNext() ? 1 : 0)) {
            Item var5 = (Item)var4.next();
            if (u.lIIlIIllIIlllII(var3.contains(var5) ? 1 : 0)) {

                if (1 != 2) continue;
                return ((8 ^ 0x3F ^ (0x78 ^ 0xA)) & (197 + 127 - 216 + 98 ^ 80 + 94 - 137 + 102 ^ -1)) != 0;
            }
            if (u.lIIlIIllIIlllII(var5.getName().contains(lllllIIlIIlI[lllllIlIIlII[0]]) ? 1 : 0)) {

                return false;
            }
            var3.add(var5);

            int[] nArray = new int[lllllIlIIlII[1]];
            nArray[u.lllllIlIIlII[0]] = var5.getId();
            Bank.depositAll((int[])nArray);

            if ((0x70 ^ 0x53 ^ (0x80 ^ 0xA7)) != -1) continue;
            return ((81 + 109 - 48 + 15 ^ 10 + 100 - -7 + 29) & (0xCC ^ 0xC3 ^ (0x5C ^ 0x5A) & ~(0x30 ^ 0x36) ^ -1)) != 0;
        }
        return lllllIlIIlII[1];
    }
}

