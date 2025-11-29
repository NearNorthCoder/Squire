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
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

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
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.i_Unknown;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=1337, blocking=true)
public class BankingTask
extends i_Unknown {
    private static /* synthetic */ int[] llllIIlIllI;
    private /* synthetic */ CompletableFuture<Boolean> J;
    private static /* synthetic */ String[] llllIIlIIll;

    private static boolean lIllIlIIIlIlll(int n2) {
        return n2 == 0;
    }

    private static void lIllIlIIIlIlII() {
        llllIIlIIll = new String[llllIIlIllI[4]];
        j.llllIIlIIll[j.llllIIlIllI[0]] = j."No bank loadout selected";
        j.llllIIlIIll[j.llllIIlIllI[1]] = j."Loadout completed successfully!";
        j.llllIIlIIll[j.llllIIlIllI[2]] = j."Failed to withdraw loadout, we're probably out of ammo or staff charges. Stopping plugin, and logging out.";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean K() {
        j var15;
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
        if (j.lIllIlIIIlIlll(var15.L() ? 1 : 0)) {
            var15.G.a(llllIIlIllI[0]);
            return llllIIlIllI[0];
        }
        if (j.lIllIlIIIlIllI(var15.J)) {
            void var4;
            var15.J = BankLoadouts.withdraw((BankLoadout)var4, (boolean)llllIIlIllI[1]);
        }
        if (j.lIllIlIIIllIII(var15.J.isDone() ? 1 : 0)) {
            Boolean var21 = var15.J.join();
            if (j.lIllIlIIIllIII(var21.booleanValue() ? 1 : 0)) {
                Log.error((String)llllIIlIIll[llllIIlIllI[1]]);
                var15.G.a(llllIIlIllI[0]);
                var15.J = null;
                return llllIIlIllI[1];
            }
            Log.info((String)llllIIlIIll[llllIIlIllI[2]]);
            Squire.stop();
            return llllIIlIllI[0];
        }
        return llllIIlIllI[1];
    }

    private static String lIllIlIIIlIIll(String var9, String var14) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var2 = var14.toCharArray();
        int var19 = llllIIlIllI[0];
        char[] var17 = var9.toCharArray();
        int var18 = var17.length;
        int var7 = llllIIlIllI[0];
        while (j.lIllIlIIIllIIl(var7, var18)) {
            char var23 = var17[var7];
            var1.append((char)(var23 ^ var2[var19 % var2.length]));
            0;
            ++var19;
            ++var7;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIllIlIIIllIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean L() {
        void var13;
        BankLoadout bankLoadout = (BankLoadout)this.H.bankLoadout().selected(BankLoadout.class);
        if (j.lIllIlIIIlIllI(bankLoadout)) {
            return llllIIlIllI[0];
        }
        InventorySetup var25 = var13.getInventorySetup();
        HashMap<Integer, Integer> var10 = new HashMap<Integer, Integer>();
        Object var11 = var25.getIds();
        int var20 = ((int[])var11).length;
        int var24 = llllIIlIllI[0];
        while (j.lIllIlIIIllIIl(var24, var20)) {
            int var6 = var11[var24];
            int var8 = var10.getOrDefault(var6, llllIIlIllI[0]);
            var10.put(var6, var8 + llllIIlIllI[1]);
            0;
            ++var24;
            0;
            if ((3 & ~3) >= 0) continue;
            return false;
        }
        var11 = var10.keySet().iterator();
        while (j.lIllIlIIIllIII(var11.hasNext() ? 1 : 0)) {
            var20 = (Integer)var11.next();
            if (j.lIllIlIIIllIlI(var20, llllIIlIllI[3])) {
                0;
                if (((0x17 ^ 0x2B) & ~(0x98 ^ 0xA4)) == 0) continue;
                return false;
            }
            var24 = (Integer)var10.get(var20);
            int[] nArray = new int[llllIIlIllI[1]];
            nArray[j.llllIIlIllI[0]] = var20;
            if (j.lIllIlIIIllIIl(Inventory.getCount((int[])nArray), var24)) {
                int[] nArray2 = new int[llllIIlIllI[1]];
                nArray2[j.llllIIlIllI[0]] = var20;
                Log.info((String)("Need to bank, we're missing " + (var24 - Inventory.getCount((int[])nArray2)) + " " + Static.getClient().getItemDefinition(var20).getName() + "s"));
                return llllIIlIllI[1];
            }
            0;
            if (2 > 0) continue;
            return ((0x76 ^ 0x6E ^ (0xEA ^ 0xB3)) & (0x45 ^ 0x42 ^ (0xC ^ 0x4A) ^ -1)) != 0;
        }
        return llllIIlIllI[0];
    }

    private static String lIllIlIIIIlIIl(String var22, String var5) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llllIIlIllI[5]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(llllIIlIllI[2], var12);
            return new String(var3.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.lIllIlIIIlIlIl();
        j.lIllIlIIIlIlII();
    }

    @Inject
    public j(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        super(squireBarrows, squireBarrowsConfig);
        this.J = null;
    }

    private static boolean lIllIlIIIlIllI(Object object) {
        return object == null;
    }

    private static void lIllIlIIIlIlIl() {
        llllIIlIllI = new int[6];
        j.llllIIlIllI[0] = (0xEF ^ 0xC6) & ~(0xB7 ^ 0x9E);
        j.llllIIlIllI[1] = 1;
        j.llllIIlIllI[2] = 2;
        j.llllIIlIllI[3] = -1;
        j.llllIIlIllI[4] = 3;
        j.llllIIlIllI[5] = 0x20 ^ 0x66 ^ (0xE0 ^ 0xAE);
    }

    private static boolean lIllIlIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

