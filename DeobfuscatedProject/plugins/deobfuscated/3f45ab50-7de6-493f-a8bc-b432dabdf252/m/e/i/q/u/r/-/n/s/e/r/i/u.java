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

@TaskDesc(name="Banking at guild")
public class u
extends Task {
    private static /* synthetic */ String[] lllllIIlIIlI;
    private static /* synthetic */ int[] lllllIlIIlII;
    private final /* synthetic */ SquireMinerConfig E;

    private static String lIIlIIlIlIllIlI(String lllllllllllllllIIlIIlIlIllIIIlll, String lllllllllllllllIIlIIlIlIllIIlIll) {
        lllllllllllllllIIlIIlIlIllIIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIlIllIIlIlI = new StringBuilder();
        char[] lllllllllllllllIIlIIlIlIllIIlIIl = lllllllllllllllIIlIIlIlIllIIlIll.toCharArray();
        int lllllllllllllllIIlIIlIlIllIIlIII = lllllIlIIlII[0];
        char[] lllllllllllllllIIlIIlIlIllIIIIlI = lllllllllllllllIIlIIlIlIllIIIlll.toCharArray();
        int lllllllllllllllIIlIIlIlIllIIIIIl = lllllllllllllllIIlIIlIlIllIIIIlI.length;
        int lllllllllllllllIIlIIlIlIllIIIIII = lllllIlIIlII[0];
        while (u.lIIlIIllIIlllIl(lllllllllllllllIIlIIlIlIllIIIIII, lllllllllllllllIIlIIlIlIllIIIIIl)) {
            char lllllllllllllllIIlIIlIlIllIIllIl = lllllllllllllllIIlIIlIlIllIIIIlI[lllllllllllllllIIlIIlIlIllIIIIII];
            lllllllllllllllIIlIIlIlIllIIlIlI.append((char)(lllllllllllllllIIlIIlIlIllIIllIl ^ lllllllllllllllIIlIIlIlIllIIlIIl[lllllllllllllllIIlIIlIlIllIIlIII % lllllllllllllllIIlIIlIlIllIIlIIl.length]));
            0;
            ++lllllllllllllllIIlIIlIlIllIIlIII;
            ++lllllllllllllllIIlIIlIlIllIIIIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlIlIllIIlIlI);
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
        u lllllllllllllllIIlIIlIlIllIllIlI;
        if (u.lIIlIIllIIllIIl((Object)this.E.activity(), (Object)a.AMETHYST) && u.lIIlIIllIIllIIl((Object)this.E.activity(), (Object)a.GUILD_IRON)) {
            return lllllIlIIlII[0];
        }
        if (u.lIIlIIllIIllIIl((Object)lllllllllllllllIIlIIlIlIllIllIlI.E.craft(), (Object)b.DISABLE) && u.lIIlIIllIIllIlI((Object)lllllllllllllllIIlIIlIlIllIllIlI.E.activity(), (Object)a.AMETHYST)) {
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
        HashSet<Item> lllllllllllllllIIlIIlIlIllIllIIl = new HashSet<Item>();
        Iterator lllllllllllllllIIlIIlIlIllIllIII = Inventory.getAll().iterator();
        while (u.lIIlIIllIIlllII(lllllllllllllllIIlIIlIlIllIllIII.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIIlIIlIlIllIlIlll = (Item)lllllllllllllllIIlIIlIlIllIllIII.next();
            if (u.lIIlIIllIIlllII(lllllllllllllllIIlIIlIlIllIllIIl.contains(lllllllllllllllIIlIIlIlIllIlIlll) ? 1 : 0)) {
                0;
                if (1 != 2) continue;
                return ((8 ^ 0x3F ^ (0x78 ^ 0xA)) & (197 + 127 - 216 + 98 ^ 80 + 94 - 137 + 102 ^ -1)) != 0;
            }
            if (u.lIIlIIllIIlllII(lllllllllllllllIIlIIlIlIllIlIlll.getName().contains(lllllIIlIIlI[lllllIlIIlII[0]]) ? 1 : 0)) {
                0;
                if (null == null) continue;
                return ((0x3D ^ 7) & ~(0xC ^ 0x36)) != 0;
            }
            lllllllllllllllIIlIIlIlIllIllIIl.add(lllllllllllllllIIlIIlIlIllIlIlll);
            0;
            int[] nArray = new int[lllllIlIIlII[1]];
            nArray[u.lllllIlIIlII[0]] = lllllllllllllllIIlIIlIlIllIlIlll.getId();
            Bank.depositAll((int[])nArray);
            0;
            if ((0x70 ^ 0x53 ^ (0x80 ^ 0xA7)) != -1) continue;
            return ((81 + 109 - 48 + 15 ^ 10 + 100 - -7 + 29) & (0xCC ^ 0xC3 ^ (0x5C ^ 0x5A) & ~(0x30 ^ 0x36) ^ -1)) != 0;
        }
        return lllllIlIIlII[1];
    }
}

