/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.inventory.InventorySetup
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.saradomin.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.util.HashMap;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Inventory;

public abstract class SaradominTaskBase
extends Task {
    
    protected final  SquireSaraConfig N;
    protected final  Client P;
    protected final  SquireSaradomin O;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean T() {
        void var4;
        BankLoadout bankLoadout = (BankLoadout)this.N.bankLoadout().selected(BankLoadout.class);
        if (o.var5(bankLoadout)) {
            return var1[0];
        }
        InventorySetup var6 = var4.getInventorySetup();
        HashMap<Integer, Integer> var7 = new HashMap<Integer, Integer>();
        Object var8 = var6.getIds();
        int var9 = ((int[])var8).length;
        int var10 = var1[0];
        while (o.var11(var10, var9)) {
            int var12 = var8[var10];
            int var13 = var7.getOrDefault(var12, var1[0]);
            var7.put(var12, var13 + var1[1]);
            0;
            ++var10;
            0;
            if null == null continue;
            return ((0xBC ^ 0x96) & ~(0x50 ^ 0x7A)) != 0;
        }
        var8 = var7.keySet().iterator();
        while (o.var3(var8.hasNext() ? 1 : 0)) {
            var9 = (Integer)var8.next();
            if (o.var14(var9, var1[2])) {
                0;
                if (2 > ((75 + 157 - 212 + 227 ^ 164 + 172 - 270 + 131) & (80 + 84 - 80 + 63 ^ 149 + 62 - 110 + 60 ^ -1))) continue;
                return ((0xCE ^ 0x8A ^ (0x51 ^ 5)) & (1 ^ (0x74 ^ 0x65) ^ -1)) != 0;
            }
            var10 = (Integer)var7.get(var9);
            int[] nArray = new int[var1[1]];
            nArray[o.var1[0]] = var9;
            if (o.var11(Inventory.getCount((int[])nArray), var10)) {
                return var1[1];
            }
            0;
            if ((0xC4 ^ 0x9A ^ (0xF1 ^ 0xAB)) >= 0) continue;
            return ((0xF3 ^ 0x94 ^ (0x7E ^ 0x2F)) & (0x75 ^ 0x31 ^ (0x16 ^ 0x64) ^ -1)) != 0;
        }
        return var1[0];
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    private static void var16() {
        var2 = new String[var1[1]];
        o.var2[o.var1[0]] = "None";
    }

    static {
        o.var17();
        o.var16();
    }

    /*
     * WARNING - void declaration
     */
    protected boolean a(int n2) {
        void var18;
        int[] nArray = this.P.getMapRegions();
        int n3 = nArray.length;
        int var19 = var1[0];
        while (o.var11(var19, (int)var18)) {
            void var20;
            void var21;
            void var22 = var21[var19];
            if (o.var14((int)var22, (int)var20)) {
                return var1[1];
            }
            ++var19;
            0;
            
            return ((0x8C ^ 0x86 ^ (4 ^ 0x44)) & (81 + 123 - 48 + 62 ^ 17 + 17 - -50 + 60 ^ -1)) != 0;
        }
        return var1[0];
    }

    protected boolean S() {
        int n2;
        if (o.var23(this.N.bankLoadout().getSelected()) && o.var15(this.N.bankLoadout().getSelected().equals(var2[var1[0]]) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (((0xAB ^ 0xB8) & ~(0x67 ^ 0x74)) != 0) {
                return ((0xF5 ^ 0xA3) & ~(0xF9 ^ 0xAF)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var1[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var1[0];
        while (o.var11(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    @Inject
    public SaradominTaskBase(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client) {
        this.N = squireSaraConfig;
        this.O = squireSaradomin;
        this.P = client;
    }

    private static boolean var23(Object object) {
        return object != null;
    }

    private static void var17() {
        var1 = new int[3];
        o.var1[0] = (0x77 ^ 0x3F ^ (0x32 ^ 0x5A)) & (0x7F ^ 0x48 ^ (0x62 ^ 0x75) ^ -1);
        o.var1[1] = 1;
        o.var1[2] = -1;
    }

    private static boolean var5(Object object) {
        return object == null;
    }
}

