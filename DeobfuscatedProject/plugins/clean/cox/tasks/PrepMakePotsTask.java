/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Prep Make Pots", priority=21001, blocking=true)
public class PrepMakePotsTask
extends CoxTaskBase {
    
     boolean ei;

    private static boolean llIllIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIllIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIllIlIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected PrepMakePotsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ei = lIlIIlllIlIl[0];
    }

        return String.valueOf(var1);
    }

    private static boolean llIllIllIlIIIl(int n2) {
        return n2 <= 0;
    }

    private static void llIllIllIIlIll() {
        lIlIIlllIlII = new String[lIlIIlllIlIl[7]];
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[0]] = "Clean";
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[1]] = "Revitalisation";
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[5]] = "Xeric's";
    }

    private static boolean llIllIllIlIIll(Object object) {
        return object == null;
    }

    private static boolean llIllIllIIllll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        bd.llIllIllIIllII();
        bd.llIllIllIIlIll();
    }

    private static boolean llIllIllIlIIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_3;
        void var3_5;
        bd var2;
        if (bd.llIllIllIIllIl(this.eh(), this.ed())) {
            return lIlIIlllIlIl[0];
        }
        int[] nArray = new int[lIlIIlllIlIl[1]];
        nArray[bd.lIlIIlllIlIl[0]] = em;
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if (bd.llIllIllIIlllI(Inventory.isFull() ? 1 : 0) && bd.llIllIllIIllll(var2.eg(), var2.ek())) {
            int[] nArray2 = new int[lIlIIlllIlIl[1]];
            nArray2[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[2];
            if (bd.llIllIllIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                return lIlIIlllIlIl[0];
            }
        }
        int[] nArray3 = new int[lIlIIlllIlIl[1]];
        nArray3[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[3];
        if (bd.llIllIllIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIlIIlllIlIl[1]];
            nArray4[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[3];
            List var4 = Inventory.getAll((int[])nArray4);
            int var5 = lIlIIlllIlIl[4];
            Iterator var6 = var4.iterator();
            while (bd.llIllIllIlIIII(var6.hasNext() ? 1 : 0)) {
                Item var7 = (Item)var6.next();
                if (bd.llIllIllIlIIIl(var5)) {

                    if (null == null) break;
                    return false;
                }
                --var5;
                var7.interact(lIlIIlllIlII[lIlIIlllIlIl[0]]);

                if (2 != 0) continue;
                return ((0x50 ^ 0x4B ^ (0x51 ^ 0x57)) & (13 + 60 - -29 + 25 ^ (0xEC ^ 0x8E) ^ -1)) != 0;
            }
            return lIlIIlllIlIl[1];
        }
        if (bd.llIllIllIlIIII(Production.isOpen() ? 1 : 0)) {
            if (bd.llIllIllIIllIl(var2.cq(), var2.el)) {
                var2.ei = lIlIIlllIlIl[1];
                Production.chooseOption((String)lIlIIlllIlII[lIlIIlllIlIl[1]]);
                var2.sleep(lIlIIlllIlIl[5]);
                return lIlIIlllIlIl[1];
            }
            var2.ei = lIlIIlllIlIl[0];
            Production.chooseOption((String)lIlIIlllIlII[lIlIIlllIlIl[5]]);
            var2.sleep(lIlIIlllIlIl[5]);
            return lIlIIlllIlIl[1];
        }
        int[] nArray5 = new int[lIlIIlllIlIl[1]];
        nArray5[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[6];
        Item var4 = Inventory.getFirst((int[])nArray5);
        int[] nArray6 = new int[lIlIIlllIlIl[1]];
        nArray6[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[2];
        Item var5 = Inventory.getFirst((int[])nArray6);
        if (!bd.llIllIllIlIIlI(var5) || bd.llIllIllIlIIll(var4)) {
            return lIlIIlllIlIl[0];
        }
        System.out.println("CraftRestore: " + var2.ei + " | count: " + var2.cq());
        if (bd.llIllIllIIlllI(var2.ei ? 1 : 0) && bd.llIllIllIlIIII(var2.bS.isAnimating() ? 1 : 0)) {
            return lIlIIlllIlIl[1];
        }
        if (bd.llIllIllIlIIII(var2.ei ? 1 : 0) && bd.llIllIllIlIIII(var2.bS.isAnimating() ? 1 : 0) && bd.llIllIllIIllIl(var2.cq(), var2.el)) {
            return lIlIIlllIlIl[1];
        }
        var3_5.useOn((Item)var2_3);
        return lIlIIlllIlIl[1];
    }
}

