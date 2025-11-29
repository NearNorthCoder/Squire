/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Withdrawing supplies", priority=5000, blocking=true)
public class WithdrawingSuppliesTask
extends AutotoaTaskBase {

    private final  C hK;

    private static boolean lIlIIIllIlIIII(Object object) {
        return object == null;
    }

    private static  boolean a(e e2, Item item) {
        return e2.p().contains(item.getId());
    }

    private static boolean lIlIIIllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIllIlIlIl(int n2) {
        return n2 > 0;
    }

    private static void lIlIIIllIIlllI() {
        llIIlllIIII = new String[llIIlllIIIl[8]];
        cd.llIIlllIIII[cd.llIIlllIIIl[1]] = "Supplies";
        cd.llIIlllIIII[cd.llIIlllIIIl[0]] = "Open";
        cd.llIIlllIIII[cd.llIIlllIIIl[2]] = "Withdraw All";
        cd.llIIlllIIII[cd.llIIlllIIIl[3]] = "Supplies";
        cd.llIIlllIIII[cd.llIIlllIIIl[4]] = "Open";
        cd.llIIlllIIII[cd.llIIlllIIIl[5]] = "restore";
        cd.llIIlllIIII[cd.llIIlllIIIl[6]] = "prayer";
        cd.llIIlllIIII[cd.llIIlllIIIl[7]] = "sanfew";
    }

    static {
        cd.lIlIIIllIIllll();
        cd.lIlIIIllIIlllI();
    }

    private static boolean lIlIIIllIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIlIlII(int n2) {
        return n2 <= 0;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(e e2) {
        void var2;
        cd var3;
        String[] stringArray = new String[llIIlllIIIl[0]];
        stringArray[cd.llIIlllIIIl[1]] = llIIlllIIII[llIIlllIIIl[3]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (cd.lIlIIIllIlIIII(item)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIlII(var3.hK.av().getOrDefault(var2, llIIlllIIIl[1]))) {
            return llIIlllIIIl[1];
        }
        Item var4 = Inventory.getFirst(arg_0 -> cd.a((GameEnum95) ar2, arg_0));
        if (cd.lIlIIIllIlIIII(var4)) {
            void var5;
            if (cd.lIlIIIllIlIIIl(Inventory.isFull() ? 1 : 0)) {
                return llIIlllIIIl[1];
            }
            if (cd.lIlIIIllIlIlIl(var3.aX())) {
                return llIIlllIIIl[1];
            }
            if (cd.lIlIIIllIlIIIl(var3.hK.au() ? 1 : 0)) {
                var3.hK.a((GameEnum95) ar2);
                return llIIlllIIIl[0];
            }
            var5.interact(llIIlllIIII[llIIlllIIIl[4]]);
            return llIIlllIIIl[0];
        }
        return llIIlllIIIl[1];
    }

    private static boolean lIlIIIllIlIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6;
        cd var7;
        String[] stringArray = new String[llIIlllIIIl[0]];
        stringArray[cd.llIIlllIIIl[1]] = llIIlllIIII[llIIlllIIIl[1]];
        Item item2 = Inventory.getFirst((String[])stringArray);
        if (cd.lIlIIIllIlIIII(item2)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIIIl(var7.hK.av().isEmpty() ? 1 : 0)) {
            var6.interact(llIIlllIIII[llIIlllIIIl[0]]);
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var7.b(e.SMELLING_SALTS) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIlI(var7.aq() ? 1 : 0)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIIIl(Inventory.isFull() ? 1 : 0) && cd.lIlIIIllIlIIlI(Inventory.contains(item -> e.LIQUID_ADRENALINE.d(item.getId())) ? 1 : 0)) {
            var7.b((Item item) -> {
                boolean bl2;
                if (!cd.lIlIIIllIlIIlI(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[5]]) ? 1 : 0) || !cd.lIlIIIllIlIIlI(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[6]]) ? 1 : 0) || cd.lIlIIIllIlIIIl(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[7]]) ? 1 : 0)) {
                    bl2 = llIIlllIIIl[0];

                    if (((0xB ^ 0x63 ^ (0x7F ^ 0x46)) & (2 ^ (0x6B ^ 0x38) ^ -1)) > 0) {
                        return ((0x2D ^ 1 ^ (0x43 ^ 0x48)) & (80 + 35 - 30 + 45 ^ 147 + 77 - 120 + 61 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlllIIIl[1];
                }
                return bl2;
            });
        }
        if (cd.lIlIIIllIlIIIl(var7.aq() ? 1 : 0) && cd.lIlIIIllIlIIll(Inventory.getFreeSlots(), llIIlllIIIl[0]) && cd.lIlIIIllIlIIIl(Prayers.anyActive() ? 1 : 0)) {
            var6.interact(llIIlllIIII[llIIlllIIIl[2]]);
        }
        if (cd.lIlIIIllIlIIIl(var7.b(e.LIQUID_ADRENALINE) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var7.b(e.AMBROSIA) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var7.b(e.NECTAR) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var7.b(e.SILK_DRESSING) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var7.b(e.TEARS_OF_ELIDINIS) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        return llIIlllIIIl[1];
    }

    @Inject
    protected WithdrawingSuppliesTask(Client client, C c2) {
        super(client);
        this.hK = c2;
    }
}

