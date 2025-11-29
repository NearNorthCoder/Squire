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
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
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

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var2 = new String[var1[4]];
        j.var2[j.var1[0]] = "No bank loadout selected";
        j.var2[j.var1[1]] = "Loadout completed successfully!";
        j.var2[j.var1[2]] = "Failed to withdraw loadout, we're probably out of ammo or staff charges. Stopping plugin, and logging out.";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean K() {
        j var5;
        BankLoadout bankLoadout = this.I.A();
        if (j.var6(bankLoadout)) {
            Log.error((String)var2[var1[0]]);
            return var1[0];
        }
        if (j.var3(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        }
        if (j.var7(Inventory.isFull() ? 1 : 0)) {
            Bank.depositInventory();
        }
        if (j.var3(var5.L() ? 1 : 0)) {
            var5.G.a(var1[0]);
            return var1[0];
        }
        if (j.var6(var5.J)) {
            void var8;
            var5.J = BankLoadouts.withdraw((BankLoadout)var8, (boolean)var1[1]);
        }
        if (j.var7(var5.J.isDone() ? 1 : 0)) {
            Boolean var9 = var5.J.join();
            if (j.var7(var9.booleanValue() ? 1 : 0)) {
                Log.error((String)var2[var1[1]]);
                var5.G.a(var1[0]);
                var5.J = null;
                return var1[1];
            }
            Log.info((String)var2[var1[2]]);
            Squire.stop();
            return var1[0];
        }
        return var1[1];
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (j.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean L() {
        void var21;
        BankLoadout bankLoadout = (BankLoadout)this.H.bankLoadout().selected(BankLoadout.class);
        if (j.var6(bankLoadout)) {
            return var1[0];
        }
        InventorySetup var22 = var21.getInventorySetup();
        HashMap<Integer, Integer> var23 = new HashMap<Integer, Integer>();
        Object var24 = var22.getIds();
        int var25 = ((int[])var24).length;
        int var26 = var1[0];
        while (j.var19(var26, var25)) {
            int var27 = var24[var26];
            int var28 = var23.getOrDefault(var27, var1[0]);
            var23.put(var27, var28 + var1[1]);
            0;
            ++var26;
            0;
            if ((3 & ~3) >= 0) continue;
            return ((0x42 ^ 0x69) & ~(0x7D ^ 0x56)) != 0;
        }
        var24 = var23.keySet().iterator();
        while (j.var7(var24.hasNext() ? 1 : 0)) {
            var25 = (Integer)var24.next();
            if (j.var29(var25, var1[3])) {
                0;
                if (((0x17 ^ 0x2B) & ~(0x98 ^ 0xA4)) == 0) continue;
                return ((0xAF ^ 0xA4) & ~(0x62 ^ 0x69)) != 0;
            }
            var26 = (Integer)var23.get(var25);
            int[] nArray = new int[var1[1]];
            nArray[j.var1[0]] = var25;
            if (j.var19(Inventory.getCount((int[])nArray), var26)) {
                int[] nArray2 = new int[var1[1]];
                nArray2[j.var1[0]] = var25;
                Log.info((String)("Need to bank, we're missing " + (var26 - Inventory.getCount((int[])nArray2)) + " " + Static.getClient().getItemDefinition(var25).getName() + "s"));
                return var1[1];
            }
            0;
            if (2 > 0) continue;
            return ((0x76 ^ 0x6E ^ (0xEA ^ 0xB3)) & (0x45 ^ 0x42 ^ (0xC ^ 0x4A) ^ -1)) != 0;
        }
        return var1[0];
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var29(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.var36();
        j.var4();
    }

    @Inject
    public BankingTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        super(squireBarrows, squireBarrowsConfig);
        this.J = null;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static void var36() {
        var1 = new int[6];
        j.var1[0] = (0xEF ^ 0xC6) & ~(0xB7 ^ 0x9E);
        j.var1[1] = 1;
        j.var1[2] = 2;
        j.var1[3] = -1;
        j.var1[4] = 3;
        j.var1[5] = 0x20 ^ 0x66 ^ (0xE0 ^ 0xAE);
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }
}

