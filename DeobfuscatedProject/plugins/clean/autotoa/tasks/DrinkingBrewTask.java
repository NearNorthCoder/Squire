/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Drinking brew", priority=100)
public class DrinkingBrewTask
extends AutotoaTaskBase {
    private final  SquireAutoTOA cH;
    
    private final  C cG;

    private static boolean lIlIlIlIIIIIll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        int llllllllllllllllIIlIllIlIIIlIIIl2;
        int n2;
        ae var1;
        if (ae.lIlIlIlIIIIIII(this.cH.e() ? 1 : 0)) {
            return llIllIlIllI[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (!ae.lIlIlIlIIIIIlI(e.NECTAR.d(item.getId()) ? 1 : 0) || ae.lIlIlIlIIIIIII(item.getName().contains(llIllIlIlIl[llIllIlIllI[1]]) ? 1 : 0)) {
                n2 = llIllIlIllI[1];

                if (2 != 2) {
                    return false;
                }
            } else {
                n2 = llIllIlIllI[0];
            }
            return n2 != 0;
        });
        if (ae.lIlIlIlIIIIIIl(var2)) {
            return llIllIlIllI[0];
        }
        if (ae.lIlIlIlIIIIIlI(var1.aq() ? 1 : 0)) {
            int[] nArray = new int[llIllIlIllI[1]];
            nArray[ae.llIllIlIllI[0]] = llIllIlIllI[2];
            Item llllllllllllllllIIlIllIlIIIlIIIl2 = Inventory.getFirst((int[])nArray);
            if (ae.lIlIlIlIIIIIll(llllllllllllllllIIlIllIlIIIlIIIl2) && ae.lIlIlIlIIIIlII(Combat.getSpecEnergy(), llIllIlIllI[3]) && ae.lIlIlIlIIIIlII(Combat.getCurrentHealth(), llIllIlIllI[4])) {
                return llIllIlIllI[0];
            }
        }
        if (ae.lIlIlIlIIIIIII(var1.bf() ? 1 : 0) && !ae.lIlIlIlIIIIlIl(Combat.getCurrentHealth(), llIllIlIllI[5]) || ae.lIlIlIlIIIIIII(var1.cG.ap() ? 1 : 0)) {
            n2 = llIllIlIllI[1];

            if (3 == 0) {
                return false;
            }
        } else {
            n2 = llllllllllllllllIIlIllIlIIIlIIIl2 = llIllIlIllI[0];
        }
        if (!ae.lIlIlIlIIIIIII(var1.cG.am() ? 1 : 0) || ae.lIlIlIlIIIIIlI(llllllllllllllllIIlIllIlIIIlIIIl2)) {
            return llIllIlIllI[0];
        }
        var1_1.interact(llIllIlIlIl[llIllIlIllI[0]]);
        this.cG.ao();
        return llIllIlIllI[1];
    }

    private static void lIlIlIIllllllI() {
        llIllIlIlIl = new String[llIllIlIllI[6]];
        ae.llIllIlIlIl[ae.llIllIlIllI[0]] = "Drink";
        ae.llIllIlIlIl[ae.llIllIlIllI[1]] = "brew";
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIlIlIIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIlIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        ae.lIlIlIIlllllll();
        ae.lIlIlIIllllllI();
    }

    @Inject
    protected DrinkingBrewTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cG = c2;
        this.cH = squireAutoTOA;
    }
}

