/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Recharging trident", priority=1000, blocking=true, register=true)
public class RechargingTridentTask
extends AutotoaTaskBase {

    private  boolean hZ;

    @Inject
    protected RechargingTridentTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
        this.hZ = llIIlIIllII[0];
    }

    private static boolean lIlIIIIIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (cl.lIlIIIIIlIlIII(this.cu.isInInstancedRegion() ? 1 : 0)) {
            this.hZ = llIIlIIllII[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var1_1;
        void var5_5;
        int var1;
        int n2;
        cl var2;
        int n3;
        if (cl.lIlIIIIIlIlIII(this.hZ ? 1 : 0)) {
            return llIIlIIllII[0];
        }
        if (cl.lIlIIIIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            var2.hZ = llIIlIIllII[1];
        }
        if (cl.lIlIIIIIlIlIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)llIIlIIllII[2]);
            return llIIlIIllII[1];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[7]]));
        if (cl.lIlIIIIIlIlIIl(var3)) {
            return llIIlIIllII[0];
        }
        if (cl.lIlIIIIIlIlIlI(var3.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[0]]) ? 1 : 0) && cl.lIlIIIIIlIlIlI(var3.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[1]]) ? 1 : 0)) {
            n3 = llIIlIIllII[1];

            if ((0x60 ^ 0x65) == 0) {
                return false;
            }
        } else {
            n3 = llIIlIIllII[0];
        }
        int var4 = n3;
        int var5 = var2.g(var4 != 0);
        if (cl.lIlIIIIIlIlIII(var4)) {
            n2 = llIIlIIllII[3];

            }
        } else {
            n2 = var1 = llIIlIIllII[4];
        }
        if (cl.lIlIIIIIlIlIll(var5, llIIlIIllII[5])) {
            if (cl.lIlIIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[llIIlIIllII[1]];
                nArray[cl.llIIlIIllII[0]] = var5;
                if (cl.lIlIIIIIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var2.hZ = llIIlIIllII[1];
                }
                if (cl.lIlIIIIIlIllII(Inventory.getFreeSlots(), llIIlIIllII[6])) {
                    int[] nArray2 = new int[llIIlIIllII[6]];
                    nArray2[cl.llIIlIIllII[0]] = var3.getId();
                    nArray2[cl.llIIlIIllII[1]] = var1;
                    nArray2[cl.llIIlIIllII[7]] = llIIlIIllII[8];
                    nArray2[cl.llIIlIIllII[9]] = llIIlIIllII[10];
                    nArray2[cl.llIIlIIllII[11]] = llIIlIIllII[12];
                    Bank.depositAllExcept((int[])nArray2);
                    return llIIlIIllII[1];
                }
                Bank.withdrawAll((int)var5, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return llIIlIIllII[1];
            }
            return llIIlIIllII[0];
        }
        int[] nArray = new int[llIIlIIllII[1]];
        nArray[cl.llIIlIIllII[0]] = var1;
        Item var6 = Inventory.getFirst((int[])nArray);
        if (cl.lIlIIIIIlIlIIl(var6)) {
            return llIIlIIllII[0];
        }
        var5_5.useOn((Item)var1_1);
        return llIIlIIllII[1];
    }

    static {
        cl.lIlIIIIIlIIlll();
        cl.lIlIIIIIlIIllI();
    }

    private static boolean lIlIIIIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIIIlIIllI() {
        llIIlIIlIll = new String[llIIlIIllII[9]];
        cl.llIIlIIlIll[cl.llIIlIIllII[0]] = "toxic";
        cl.llIIlIIlIll[cl.llIIlIIllII[1]] = "swamp";
        cl.llIIlIIlIll[cl.llIIlIIllII[7]] = "trident";
    }

        return String.valueOf(var7);
    }

    private static boolean lIlIIIIIlIlIIl(Object object) {
        return object == null;
    }

    public int g(boolean bl2) {
        int n2;
        if (cl.lIlIIIIIlIlIII(bl2 ? 1 : 0)) {
            n2 = llIIlIIllII[3];

        } else {
            n2 = llIIlIIllII[4];
        }
        int var8 = n2;
        int[] nArray = new int[llIIlIIllII[1]];
        nArray[cl.llIIlIIllII[0]] = var8;
        if (cl.lIlIIIIIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var8;
        }
        int[] nArray2 = new int[llIIlIIllII[1]];
        nArray2[cl.llIIlIIllII[0]] = llIIlIIllII[8];
        if (cl.lIlIIIIIlIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return llIIlIIllII[8];
        }
        int[] nArray3 = new int[llIIlIIllII[1]];
        nArray3[cl.llIIlIIllII[0]] = llIIlIIllII[10];
        if (cl.lIlIIIIIlIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return llIIlIIllII[10];
        }
        int[] nArray4 = new int[llIIlIIllII[1]];
        nArray4[cl.llIIlIIllII[0]] = llIIlIIllII[12];
        if (cl.lIlIIIIIlIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return llIIlIIllII[12];
        }
        return llIIlIIllII[5];
    }

    private static boolean lIlIIIIIlIlIlI(int n2) {
        return n2 == 0;
    }

}

