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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

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

public abstract class o
extends Task {
    private static /* synthetic */ int[] lIIlIlIlIlIIl;
    protected final /* synthetic */ SquireSaraConfig N;
    protected final /* synthetic */ Client P;
    protected final /* synthetic */ SquireSaradomin O;
    private static /* synthetic */ String[] lIIlIlIlIlIII;

    private static boolean lIlIllIIIIIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean T() {
        void llllllllllllllIllllIlllIIllIlIlI;
        BankLoadout bankLoadout = (BankLoadout)this.N.bankLoadout().selected(BankLoadout.class);
        if (o.lIlIllIIIIIIllI(bankLoadout)) {
            return lIIlIlIlIlIIl[0];
        }
        InventorySetup llllllllllllllIllllIlllIIllIlIIl = llllllllllllllIllllIlllIIllIlIlI.getInventorySetup();
        HashMap<Integer, Integer> llllllllllllllIllllIlllIIllIlIII = new HashMap<Integer, Integer>();
        Object llllllllllllllIllllIlllIIllIIlll = llllllllllllllIllllIlllIIllIlIIl.getIds();
        int llllllllllllllIllllIlllIIllIIllI = ((int[])llllllllllllllIllllIlllIIllIIlll).length;
        int llllllllllllllIllllIlllIIllIIlIl = lIIlIlIlIlIIl[0];
        while (o.lIlIllIIIIIIlll(llllllllllllllIllllIlllIIllIIlIl, llllllllllllllIllllIlllIIllIIllI)) {
            int llllllllllllllIllllIlllIIllIIlII = llllllllllllllIllllIlllIIllIIlll[llllllllllllllIllllIlllIIllIIlIl];
            int llllllllllllllIllllIlllIIllIIIll = llllllllllllllIllllIlllIIllIlIII.getOrDefault(llllllllllllllIllllIlllIIllIIlII, lIIlIlIlIlIIl[0]);
            llllllllllllllIllllIlllIIllIlIII.put(llllllllllllllIllllIlllIIllIIlII, llllllllllllllIllllIlllIIllIIIll + lIIlIlIlIlIIl[1]);
            0;
            ++llllllllllllllIllllIlllIIllIIlIl;
            0;
            if (null == null) continue;
            return ((0xBC ^ 0x96) & ~(0x50 ^ 0x7A)) != 0;
        }
        llllllllllllllIllllIlllIIllIIlll = llllllllllllllIllllIlllIIllIlIII.keySet().iterator();
        while (o.lIlIllIIIIIlIII(llllllllllllllIllllIlllIIllIIlll.hasNext() ? 1 : 0)) {
            llllllllllllllIllllIlllIIllIIllI = (Integer)llllllllllllllIllllIlllIIllIIlll.next();
            if (o.lIlIllIIIIIlIIl(llllllllllllllIllllIlllIIllIIllI, lIIlIlIlIlIIl[2])) {
                0;
                if (2 > ((75 + 157 - 212 + 227 ^ 164 + 172 - 270 + 131) & (80 + 84 - 80 + 63 ^ 149 + 62 - 110 + 60 ^ -1))) continue;
                return ((0xCE ^ 0x8A ^ (0x51 ^ 5)) & (1 ^ (0x74 ^ 0x65) ^ -1)) != 0;
            }
            llllllllllllllIllllIlllIIllIIlIl = (Integer)llllllllllllllIllllIlllIIllIlIII.get(llllllllllllllIllllIlllIIllIIllI);
            int[] nArray = new int[lIIlIlIlIlIIl[1]];
            nArray[o.lIIlIlIlIlIIl[0]] = llllllllllllllIllllIlllIIllIIllI;
            if (o.lIlIllIIIIIIlll(Inventory.getCount((int[])nArray), llllllllllllllIllllIlllIIllIIlIl)) {
                return lIIlIlIlIlIIl[1];
            }
            0;
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
        o.lIIlIlIlIlIII[o.lIIlIlIlIlIIl[0]] = o."None";
    }

    static {
        o.lIlIllIIIIIIIll();
        o.lIlIllIIIIIIIlI();
    }

    /*
     * WARNING - void declaration
     */
    protected boolean a(int n2) {
        void llllllllllllllIllllIlllIIlIllIIl;
        int[] nArray = this.P.getMapRegions();
        int n3 = nArray.length;
        int llllllllllllllIllllIlllIIlIllIII = lIIlIlIlIlIIl[0];
        while (o.lIlIllIIIIIIlll(llllllllllllllIllllIlllIIlIllIII, (int)llllllllllllllIllllIlllIIlIllIIl)) {
            void llllllllllllllIllllIlllIIlIllIll;
            void llllllllllllllIllllIlllIIlIllIlI;
            void llllllllllllllIllllIlllIIlIlIlll = llllllllllllllIllllIlllIIlIllIlI[llllllllllllllIllllIlllIIlIllIII];
            if (o.lIlIllIIIIIlIIl((int)llllllllllllllIllllIlllIIlIlIlll, (int)llllllllllllllIllllIlllIIlIllIll)) {
                return lIIlIlIlIlIIl[1];
            }
            ++llllllllllllllIllllIlllIIlIllIII;
            0;
            if (2 >= -1) continue;
            return ((0x8C ^ 0x86 ^ (4 ^ 0x44)) & (81 + 123 - 48 + 62 ^ 17 + 17 - -50 + 60 ^ -1)) != 0;
        }
        return lIIlIlIlIlIIl[0];
    }

    protected boolean S() {
        int n2;
        if (o.lIlIllIIIIIIlII(this.N.bankLoadout().getSelected()) && o.lIlIllIIIIIIlIl(this.N.bankLoadout().getSelected().equals(lIIlIlIlIlIII[lIIlIlIlIlIIl[0]]) ? 1 : 0)) {
            n2 = lIIlIlIlIlIIl[1];
            0;
            if (((0xAB ^ 0xB8) & ~(0x67 ^ 0x74)) != 0) {
                return ((0xF5 ^ 0xA3) & ~(0xF9 ^ 0xAF)) != 0;
            }
        } else {
            n2 = lIIlIlIlIlIIl[0];
        }
        return n2 != 0;
    }

    private static String lIlIllIIIIIIIIl(String llllllllllllllIllllIlllIIlIIllII, String llllllllllllllIllllIlllIIlIIlIll) {
        llllllllllllllIllllIlllIIlIIllII = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlllIIlIIlIlI = new StringBuilder();
        char[] llllllllllllllIllllIlllIIlIIlIIl = llllllllllllllIllllIlllIIlIIlIll.toCharArray();
        int llllllllllllllIllllIlllIIlIIlIII = lIIlIlIlIlIIl[0];
        char[] llllllllllllllIllllIlllIIlIIIIlI = llllllllllllllIllllIlllIIlIIllII.toCharArray();
        int llllllllllllllIllllIlllIIlIIIIIl = llllllllllllllIllllIlllIIlIIIIlI.length;
        int llllllllllllllIllllIlllIIlIIIIII = lIIlIlIlIlIIl[0];
        while (o.lIlIllIIIIIIlll(llllllllllllllIllllIlllIIlIIIIII, llllllllllllllIllllIlllIIlIIIIIl)) {
            char llllllllllllllIllllIlllIIlIIllIl = llllllllllllllIllllIlllIIlIIIIlI[llllllllllllllIllllIlllIIlIIIIII];
            llllllllllllllIllllIlllIIlIIlIlI.append((char)(llllllllllllllIllllIlllIIlIIllIl ^ llllllllllllllIllllIlllIIlIIlIIl[llllllllllllllIllllIlllIIlIIlIII % llllllllllllllIllllIlllIIlIIlIIl.length]));
            0;
            ++llllllllllllllIllllIlllIIlIIlIII;
            ++llllllllllllllIllllIlllIIlIIIIII;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlllIIlIIlIlI);
    }

    @Inject
    public o(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client) {
        this.N = squireSaraConfig;
        this.O = squireSaradomin;
        this.P = client;
    }

    private static boolean lIlIllIIIIIIlII(Object object) {
        return object != null;
    }

    private static void lIlIllIIIIIIIll() {
        lIIlIlIlIlIIl = new int[3];
        o.lIIlIlIlIlIIl[0] = (0x77 ^ 0x3F ^ (0x32 ^ 0x5A)) & (0x7F ^ 0x48 ^ (0x62 ^ 0x75) ^ -1);
        o.lIIlIlIlIlIIl[1] = 1;
        o.lIIlIlIlIlIIl[2] = -1;
    }

    private static boolean lIlIllIIIIIIllI(Object object) {
        return object == null;
    }
}

