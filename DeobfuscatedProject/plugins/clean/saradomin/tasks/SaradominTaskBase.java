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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

    private static boolean lIlIllIIIIIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean T() {
        void var1;
        BankLoadout bankLoadout = (BankLoadout)this.N.bankLoadout().selected(BankLoadout.class);
        if (o.lIlIllIIIIIIllI(bankLoadout)) {
            return lIIlIlIlIlIIl[0];
        }
        InventorySetup var2 = var1.getInventorySetup();
        HashMap<Integer, Integer> var3 = new HashMap<Integer, Integer>();
        Object var4 = var2.getIds();
        int var5 = ((int[])var4).length;
        int var6 = lIIlIlIlIlIIl[0];
        while (o.lIlIllIIIIIIlll(var6, var5)) {
            int var7 = var4[var6];
            int var8 = var3.getOrDefault(var7, lIIlIlIlIlIIl[0]);
            var3.put(var7, var8 + lIIlIlIlIlIIl[1]);

            ++var6;

            return false;
        }
        var4 = var3.keySet().iterator();
        while (o.lIlIllIIIIIlIII(var4.hasNext() ? 1 : 0)) {
            var5 = (Integer)var4.next();
            if (o.lIlIllIIIIIlIIl(var5, lIIlIlIlIlIIl[2])) {

                if (2 > ((75 + 157 - 212 + 227 ^ 164 + 172 - 270 + 131) & (80 + 84 - 80 + 63 ^ 149 + 62 - 110 + 60 ^ -1))) continue;
                return ((0xCE ^ 0x8A ^ (0x51 ^ 5)) & (1 ^ (0x74 ^ 0x65) ^ -1)) != 0;
            }
            var6 = (Integer)var3.get(var5);
            int[] nArray = new int[lIIlIlIlIlIIl[1]];
            nArray[o.lIIlIlIlIlIIl[0]] = var5;
            if (o.lIlIllIIIIIIlll(Inventory.getCount((int[])nArray), var6)) {
                return lIIlIlIlIlIIl[1];
            }

            if ((0xC4 ^ 0x9A ^ (0xF1 ^ 0xAB)) >= 0) continue;
            return ((0xF3 ^ 0x94 ^ (0x7E ^ 0x2F)) & (0x75 ^ 0x31 ^ (0x16 ^ 0x64) ^ -1)) != 0;
        }
        return lIIlIlIlIlIIl[0];
    }

    private static boolean lIlIllIIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIllIIIIIIIlI() {
        lIIlIlIlIlIII = new String[lIIlIlIlIlIIl[1]];
        o.lIIlIlIlIlIII[o.lIIlIlIlIlIIl[0]] = "None";
    }

    static {
        o.lIlIllIIIIIIIll();
        o.lIlIllIIIIIIIlI();
    }

    /*
     * WARNING - void declaration
     */
    protected boolean a(int n2) {
        void var9;
        int[] nArray = this.P.getMapRegions();
        int n3 = nArray.length;
        int var10 = lIIlIlIlIlIIl[0];
        while (o.lIlIllIIIIIIlll(var10, (int)var9)) {
            void var11;
            void var12;
            void var13 = var12[var10];
            if (o.lIlIllIIIIIlIIl((int)var13, (int)var11)) {
                return lIIlIlIlIlIIl[1];
            }
            ++var10;

            if (2 >= -1) continue;
            return ((0x8C ^ 0x86 ^ (4 ^ 0x44)) & (81 + 123 - 48 + 62 ^ 17 + 17 - -50 + 60 ^ -1)) != 0;
        }
        return lIIlIlIlIlIIl[0];
    }

    protected boolean S() {
        int n2;
        if (o.lIlIllIIIIIIlII(this.N.bankLoadout().getSelected()) && o.lIlIllIIIIIIlIl(this.N.bankLoadout().getSelected().equals(lIIlIlIlIlIII[lIIlIlIlIlIIl[0]]) ? 1 : 0)) {
            n2 = lIIlIlIlIlIIl[1];

            if (((0xAB ^ 0xB8) & ~(0x67 ^ 0x74)) != 0) {
                return false;
            }
        } else {
            n2 = lIIlIlIlIlIIl[0];
        }
        return n2 != 0;
    }

        return String.valueOf(var14);
    }

    @Inject
    public SaradominTaskBase(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client) {
        this.N = squireSaraConfig;
        this.O = squireSaradomin;
        this.P = client;
    }

    private static boolean lIlIllIIIIIIlII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIIIIIIllI(Object object) {
        return object == null;
    }
}

