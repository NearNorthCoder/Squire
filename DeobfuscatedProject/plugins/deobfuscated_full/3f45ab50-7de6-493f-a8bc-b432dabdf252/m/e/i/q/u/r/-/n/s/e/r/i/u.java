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
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import m.e.i.q.u.r.-.n.s.e.r.i.b;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Banking at guild -> BankingatguildTask */
@TaskDesc(name="Banking at guild")
public class u
extends Task {
    private static /* synthetic */ String[] lllllIIlIIlI;
    private static /* synthetic */ int[] lllllIlIIlII;
    private final /* synthetic */ SquireMinerConfig E;

    private static String lIIlIIlIlIllIlI(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var2 = var7.toCharArray();
        int var9 = lllllIlIIlII[0];
        char[] var11 = var6.toCharArray();
        int var8 = var11.length;
        int var12 = lllllIlIIlII[0];
        while (u.lIIlIIllIIlllIl(var12, var8)) {
            char var3 = var11[var12];
            var10.append((char)(var3 ^ var2[var9 % var2.length]));
            0;
            ++var9;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var10);
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
        u.lllllIIlIIlI[u.lllllIlIIlII[0]] = u."pickaxe";
    }

    private static void lIIlIIllIIllIII() {
        lllllIlIIlII = new int[2];
        u.lllllIlIIlII[0] = (114 + 55 - 31 + 68 ^ 36 + 29 - -7 + 56) & (0x92 ^ 0x96 ^ (0x5F ^ 0x15) ^ -1);
        u.lllllIlIIlII[1] = 1;
    }

    private static boolean lIIlIIllIIllIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public u(SquireMinerConfig squireMinerConfig) {
        this.E = squireMinerConfig;
    }

    public boolean run() {
        u var13;
        if (u.lIIlIIllIIllIIl((Object)this.E.activity(), (Object)a.AMETHYST) && u.lIIlIIllIIllIIl((Object)this.E.activity(), (Object)a.GUILD_IRON)) {
            return lllllIlIIlII[0];
        }
        if (u.lIIlIIllIIllIIl((Object)var13.E.craft(), (Object)b.DISABLE) && u.lIIlIIllIIllIlI((Object)var13.E.activity(), (Object)a.AMETHYST)) {
            return lllllIlIIlII[0];
        }
        if (u.lIIlIIllIIllIll(Inventory.isFull() ? 1 : 0)) {
            return lllllIlIIlII[0];
        }
        if (u.lIIlIIllIIllIll(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return lllllIlIIlII[1];
        }
        HashSet<Item> var5 = new HashSet<Item>();
        Iterator var1 = Inventory.getAll().iterator();
        while (u.lIIlIIllIIlllII(var1.hasNext() ? 1 : 0)) {
            Item var4 = (Item)var1.next();
            if (u.lIIlIIllIIlllII(var5.contains(var4) ? 1 : 0)) {
                0;
                if (1 != 2) continue;
                return ((8 ^ 0x3F ^ (0x78 ^ 0xA)) & (197 + 127 - 216 + 98 ^ 80 + 94 - 137 + 102 ^ -1)) != 0;
            }
            if (u.lIIlIIllIIlllII(var4.getName().contains(lllllIIlIIlI[lllllIlIIlII[0]]) ? 1 : 0)) {
                0;
                
                return false;
            }
            var5.add(var4);
            0;
            int[] nArray = new int[lllllIlIIlII[1]];
            nArray[u.lllllIlIIlII[0]] = var4.getId();
            Bank.depositAll((int[])nArray);
            0;
            if ((0x70 ^ 0x53 ^ (0x80 ^ 0xA7)) != -1) continue;
            return ((81 + 109 - 48 + 15 ^ 10 + 100 - -7 + 29) & (0xCC ^ 0xC3 ^ (0x5C ^ 0x5A) & ~(0x30 ^ 0x36) ^ -1)) != 0;
        }
        return lllllIlIIlII[1];
    }
}

