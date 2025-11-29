/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.Squire
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.inventory.InventorySetup
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import gg.squire.barrows.tasks.BarrowsTaskBase;

@TaskDesc(name="Banking", priority=1337, blocking=true)
public class BankingTask
extends BarrowsTaskBase {
    
    private  CompletableFuture<Boolean> J;

    private static boolean lIllIlIIIlIlll(int n2) {
        return n2 == 0;
    }

    private static void lIllIlIIIlIlII() {
        llllIIlIIll = new String[llllIIlIllI[4]];
        j.llllIIlIIll[j.llllIIlIllI[0]] = "No bank loadout selected";
        j.llllIIlIIll[j.llllIIlIllI[1]] = "Loadout completed successfully!";
        j.llllIIlIIll[j.llllIIlIllI[2]] = "Failed to withdraw loadout, we're probably out of ammo or staff charges. Stopping plugin, and logging out.";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean K() {
        j var1;
        BankLoadout bankLoadout = this.I.A();
        if (j.lIllIlIIIlIllI(bankLoadout)) {
            Log.error((String)llllIIlIIll[llllIIlIllI[0]]);
            return llllIIlIllI[0];
        }
        if (j.lIllIlIIIlIlll(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        }
        if (j.lIllIlIIIllIII(Inventory.isFull() ? 1 : 0)) {
            Bank.depositInventory();
        }
        if (j.lIllIlIIIlIlll(var1.L() ? 1 : 0)) {
            var1.G.a(llllIIlIllI[0]);
            return llllIIlIllI[0];
        }
        if (j.lIllIlIIIlIllI(var1.J)) {
            void var2;
            var1.J = BankLoadouts.withdraw((BankLoadout)var2, (boolean)llllIIlIllI[1]);
        }
        if (j.lIllIlIIIllIII(var1.J.isDone() ? 1 : 0)) {
            Boolean var3 = var1.J.join();
            if (j.lIllIlIIIllIII(var3.booleanValue() ? 1 : 0)) {
                Log.error((String)llllIIlIIll[llllIIlIllI[1]]);
                var1.G.a(llllIIlIllI[0]);
                var1.J = null;
                return llllIIlIllI[1];
            }
            Log.info((String)llllIIlIIll[llllIIlIllI[2]]);
            Squire.stop();
            return llllIIlIllI[0];
        }
        return llllIIlIllI[1];
    }

        return String.valueOf(var4);
    }

    private static boolean lIllIlIIIllIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean L() {
        void var5;
        BankLoadout bankLoadout = (BankLoadout)this.H.bankLoadout().selected(BankLoadout.class);
        if (j.lIllIlIIIlIllI(bankLoadout)) {
            return llllIIlIllI[0];
        }
        InventorySetup var6 = var5.getInventorySetup();
        HashMap<Integer, Integer> var7 = new HashMap<Integer, Integer>();
        Object var8 = var6.getIds();
        int var9 = ((int[])var8).length;
        int var10 = llllIIlIllI[0];
        while (j.lIllIlIIIllIIl(var10, var9)) {
            int var11 = var8[var10];
            int var12 = var7.getOrDefault(var11, llllIIlIllI[0]);
            var7.put(var11, var12 + llllIIlIllI[1]);

            ++var10;

            if ((3 & ~3) >= 0) continue;
            return false;
        }
        var8 = var7.keySet().iterator();
        while (j.lIllIlIIIllIII(var8.hasNext() ? 1 : 0)) {
            var9 = (Integer)var8.next();
            if (j.lIllIlIIIllIlI(var9, llllIIlIllI[3])) {

                if (((0x17 ^ 0x2B) & ~(0x98 ^ 0xA4)) == 0) continue;
                return false;
            }
            var10 = (Integer)var7.get(var9);
            int[] nArray = new int[llllIIlIllI[1]];
            nArray[j.llllIIlIllI[0]] = var9;
            if (j.lIllIlIIIllIIl(Inventory.getCount((int[])nArray), var10)) {
                int[] nArray2 = new int[llllIIlIllI[1]];
                nArray2[j.llllIIlIllI[0]] = var9;
                Log.info((String)("Need to bank, we're missing " + (var10 - Inventory.getCount((int[])nArray2)) + " " + Static.getClient().getItemDefinition(var9).getName() + "s"));
                return llllIIlIllI[1];
            }

            if (2 > 0) continue;
            return ((0x76 ^ 0x6E ^ (0xEA ^ 0xB3)) & (0x45 ^ 0x42 ^ (0xC ^ 0x4A) ^ -1)) != 0;
        }
        return llllIIlIllI[0];
    }

    private static boolean lIllIlIIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.lIllIlIIIlIlIl();
        j.lIllIlIIIlIlII();
    }

    @Inject
    public BankingTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        super(squireBarrows, squireBarrowsConfig);
        this.J = null;
    }

    private static boolean lIllIlIIIlIllI(Object object) {
        return object == null;
    }

    private static boolean lIllIlIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

