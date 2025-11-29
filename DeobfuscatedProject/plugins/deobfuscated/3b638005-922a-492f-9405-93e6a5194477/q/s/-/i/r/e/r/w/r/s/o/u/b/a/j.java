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
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.i;

@TaskDesc(name="Banking", priority=1337, blocking=true)
public class j
extends i {
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
        j llllllllllllllllIIIlllIIIIllIIIl;
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
        if (j.lIllIlIIIlIlll(llllllllllllllllIIIlllIIIIllIIIl.L() ? 1 : 0)) {
            llllllllllllllllIIIlllIIIIllIIIl.G.a(llllIIlIllI[0]);
            return llllIIlIllI[0];
        }
        if (j.lIllIlIIIlIllI(llllllllllllllllIIIlllIIIIllIIIl.J)) {
            void llllllllllllllllIIIlllIIIIllIIII;
            llllllllllllllllIIIlllIIIIllIIIl.J = BankLoadouts.withdraw((BankLoadout)llllllllllllllllIIIlllIIIIllIIII, (boolean)llllIIlIllI[1]);
        }
        if (j.lIllIlIIIllIII(llllllllllllllllIIIlllIIIIllIIIl.J.isDone() ? 1 : 0)) {
            Boolean llllllllllllllllIIIlllIIIIlIllll = llllllllllllllllIIIlllIIIIllIIIl.J.join();
            if (j.lIllIlIIIllIII(llllllllllllllllIIIlllIIIIlIllll.booleanValue() ? 1 : 0)) {
                Log.error((String)llllIIlIIll[llllIIlIllI[1]]);
                llllllllllllllllIIIlllIIIIllIIIl.G.a(llllIIlIllI[0]);
                llllllllllllllllIIIlllIIIIllIIIl.J = null;
                return llllIIlIllI[1];
            }
            Log.info((String)llllIIlIIll[llllIIlIllI[2]]);
            Squire.stop();
            return llllIIlIllI[0];
        }
        return llllIIlIllI[1];
    }

    private static String lIllIlIIIlIIll(String llllllllllllllllIIIlllIIIIIIllIl, String llllllllllllllllIIIlllIIIIIlIIIl) {
        llllllllllllllllIIIlllIIIIIIllIl = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIlllIIIIIlIIII = new StringBuilder();
        char[] llllllllllllllllIIIlllIIIIIIllll = llllllllllllllllIIIlllIIIIIlIIIl.toCharArray();
        int llllllllllllllllIIIlllIIIIIIlllI = llllIIlIllI[0];
        char[] llllllllllllllllIIIlllIIIIIIlIII = llllllllllllllllIIIlllIIIIIIllIl.toCharArray();
        int llllllllllllllllIIIlllIIIIIIIlll = llllllllllllllllIIIlllIIIIIIlIII.length;
        int llllllllllllllllIIIlllIIIIIIIllI = llllIIlIllI[0];
        while (j.lIllIlIIIllIIl(llllllllllllllllIIIlllIIIIIIIllI, llllllllllllllllIIIlllIIIIIIIlll)) {
            char llllllllllllllllIIIlllIIIIIlIIll = llllllllllllllllIIIlllIIIIIIlIII[llllllllllllllllIIIlllIIIIIIIllI];
            llllllllllllllllIIIlllIIIIIlIIII.append((char)(llllllllllllllllIIIlllIIIIIlIIll ^ llllllllllllllllIIIlllIIIIIIllll[llllllllllllllllIIIlllIIIIIIlllI % llllllllllllllllIIIlllIIIIIIllll.length]));
            0;
            ++llllllllllllllllIIIlllIIIIIIlllI;
            ++llllllllllllllllIIIlllIIIIIIIllI;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIlllIIIIIlIIII);
    }

    private static boolean lIllIlIIIllIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean L() {
        void llllllllllllllllIIIlllIIIIlIIlII;
        BankLoadout bankLoadout = (BankLoadout)this.H.bankLoadout().selected(BankLoadout.class);
        if (j.lIllIlIIIlIllI(bankLoadout)) {
            return llllIIlIllI[0];
        }
        InventorySetup llllllllllllllllIIIlllIIIIlIIIll = llllllllllllllllIIIlllIIIIlIIlII.getInventorySetup();
        HashMap<Integer, Integer> llllllllllllllllIIIlllIIIIlIIIlI = new HashMap<Integer, Integer>();
        Object llllllllllllllllIIIlllIIIIlIIIIl = llllllllllllllllIIIlllIIIIlIIIll.getIds();
        int llllllllllllllllIIIlllIIIIlIIIII = ((int[])llllllllllllllllIIIlllIIIIlIIIIl).length;
        int llllllllllllllllIIIlllIIIIIlllll = llllIIlIllI[0];
        while (j.lIllIlIIIllIIl(llllllllllllllllIIIlllIIIIIlllll, llllllllllllllllIIIlllIIIIlIIIII)) {
            int llllllllllllllllIIIlllIIIIIllllI = llllllllllllllllIIIlllIIIIlIIIIl[llllllllllllllllIIIlllIIIIIlllll];
            int llllllllllllllllIIIlllIIIIIlllIl = llllllllllllllllIIIlllIIIIlIIIlI.getOrDefault(llllllllllllllllIIIlllIIIIIllllI, llllIIlIllI[0]);
            llllllllllllllllIIIlllIIIIlIIIlI.put(llllllllllllllllIIIlllIIIIIllllI, llllllllllllllllIIIlllIIIIIlllIl + llllIIlIllI[1]);
            0;
            ++llllllllllllllllIIIlllIIIIIlllll;
            0;
            if ((3 & ~3) >= 0) continue;
            return ((0x42 ^ 0x69) & ~(0x7D ^ 0x56)) != 0;
        }
        llllllllllllllllIIIlllIIIIlIIIIl = llllllllllllllllIIIlllIIIIlIIIlI.keySet().iterator();
        while (j.lIllIlIIIllIII(llllllllllllllllIIIlllIIIIlIIIIl.hasNext() ? 1 : 0)) {
            llllllllllllllllIIIlllIIIIlIIIII = (Integer)llllllllllllllllIIIlllIIIIlIIIIl.next();
            if (j.lIllIlIIIllIlI(llllllllllllllllIIIlllIIIIlIIIII, llllIIlIllI[3])) {
                0;
                if (((0x17 ^ 0x2B) & ~(0x98 ^ 0xA4)) == 0) continue;
                return ((0xAF ^ 0xA4) & ~(0x62 ^ 0x69)) != 0;
            }
            llllllllllllllllIIIlllIIIIIlllll = (Integer)llllllllllllllllIIIlllIIIIlIIIlI.get(llllllllllllllllIIIlllIIIIlIIIII);
            int[] nArray = new int[llllIIlIllI[1]];
            nArray[j.llllIIlIllI[0]] = llllllllllllllllIIIlllIIIIlIIIII;
            if (j.lIllIlIIIllIIl(Inventory.getCount((int[])nArray), llllllllllllllllIIIlllIIIIIlllll)) {
                int[] nArray2 = new int[llllIIlIllI[1]];
                nArray2[j.llllIIlIllI[0]] = llllllllllllllllIIIlllIIIIlIIIII;
                Log.info((String)("Need to bank, we're missing " + (llllllllllllllllIIIlllIIIIIlllll - Inventory.getCount((int[])nArray2)) + " " + Static.getClient().getItemDefinition(llllllllllllllllIIIlllIIIIlIIIII).getName() + "s"));
                return llllIIlIllI[1];
            }
            0;
            if (2 > 0) continue;
            return ((0x76 ^ 0x6E ^ (0xEA ^ 0xB3)) & (0x45 ^ 0x42 ^ (0xC ^ 0x4A) ^ -1)) != 0;
        }
        return llllIIlIllI[0];
    }

    private static String lIllIlIIIIlIIl(String llllllllllllllllIIIllIlllllllIll, String llllllllllllllllIIIllIllllllllII) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIllllllllII.getBytes(StandardCharsets.UTF_8)), llllIIlIllI[5]), "DES");
            Cipher llllllllllllllllIIIllIllllllllll = Cipher.getInstance("DES");
            llllllllllllllllIIIllIllllllllll.init(llllIIlIllI[2], llllllllllllllllIIIlllIIIIIIIIII);
            return new String(llllllllllllllllIIIllIllllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIlllllllllI) {
            llllllllllllllllIIIllIlllllllllI.printStackTrace();
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

