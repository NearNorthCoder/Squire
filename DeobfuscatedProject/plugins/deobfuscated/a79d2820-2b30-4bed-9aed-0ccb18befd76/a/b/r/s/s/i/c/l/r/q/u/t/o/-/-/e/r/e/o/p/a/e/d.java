/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.corp.SquireCorp;
import gg.squire.corp.SquireCorpConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Checking if we should bank")
public class d
extends Task {
    private static /* synthetic */ String[] lIlIllllllII;
    @Inject
    private /* synthetic */ SquireCorp p;
    private static /* synthetic */ int[] lIlIllllllIl;
    @Inject
    private /* synthetic */ SquireCorpConfig o;

    private static String lllIIIlIlllIlI(String lllllllllllllllIllIIIllIIIlllIll, String lllllllllllllllIllIIIllIIIllllII) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIllIIIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIllIIIllllll.init(lIlIllllllIl[3], lllllllllllllllIllIIIllIIlIIIIII);
            return new String(lllllllllllllllIllIIIllIIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIllIIIlllllI) {
            lllllllllllllllIllIIIllIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIlllllI(Object object) {
        return object != null;
    }

    static {
        d.lllIIIlIllllIl();
        d.lllIIIlIllllII();
    }

    private static void lllIIIlIllllIl() {
        lIlIllllllIl = new int[10];
        d.lIlIllllllIl[0] = 1;
        d.lIlIllllllIl[1] = 3 & (3 ^ -1);
        d.lIlIllllllIl[2] = 7 ^ 0x19 ^ (0x86 ^ 0x92);
        d.lIlIllllllIl[3] = 2;
        d.lIlIllllllIl[4] = 3;
        d.lIlIllllllIl[5] = 2 + 32 - -20 + 141 ^ 15 + 157 - 26 + 53;
        d.lIlIllllllIl[6] = 0x75 ^ 0x70;
        d.lIlIllllllIl[7] = 0x49 ^ 0x4F;
        d.lIlIllllllIl[8] = 7 ^ 0;
        d.lIlIllllllIl[9] = 5 + 31 - -64 + 28 ^ 134 + 24 - 152 + 130;
    }

    public boolean run() {
        d lllllllllllllllIllIIIllIIlIIIlll;
        String[] stringArray = new String[lIlIllllllIl[0]];
        stringArray[d.lIlIllllllIl[1]] = lIlIllllllII[lIlIllllllIl[1]];
        if (d.lllIIIlIlllllI(NPCs.getNearest((String[])stringArray))) {
            this.sleep(lIlIllllllIl[2]);
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(lllllllllllllllIllIIIllIIlIIIlll.p.c() ? 1 : 0)) {
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(lllllllllllllllIllIIIllIIlIIIlll.p.b() ? 1 : 0)) {
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(Inventory.isFull() ? 1 : 0)) {
            Log.info((String)lIlIllllllII[lIlIllllllIl[0]]);
            lllllllllllllllIllIIIllIIlIIIlll.p.a(lIlIllllllIl[0]);
        }
        if (d.lllIIIllIIIIII(Inventory.getFirst(item -> this.a(item.getName()))) && d.lllIIIlIllllll(lllllllllllllllIllIIIllIIlIIIlll.i() ? 1 : 0)) {
            lllllllllllllllIllIIIllIIlIIIlll.p.a(lIlIllllllIl[0]);
        }
        if (d.lllIIIllIIIIII(Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIllllllIl[0]];
            stringArray[d.lIlIllllllIl[1]] = lIlIllllllII[lIlIllllllIl[7]];
            return item.hasAction(stringArray);
        })) && d.lllIIIlIllllll(lllllllllllllllIllIIIllIIlIIIlll.h() ? 1 : 0)) {
            Log.info((String)lIlIllllllII[lIlIllllllIl[3]]);
            lllllllllllllllIllIIIllIIlIIIlll.p.a(lIlIllllllIl[0]);
        }
        return lIlIllllllIl[1];
    }

    private boolean a(String string) {
        int n2;
        if (!d.lllIIIllIIIIIl(string.toLowerCase().contains(lIlIllllllII[lIlIllllllIl[5]]) ? 1 : 0) || d.lllIIIlIllllll(string.toLowerCase().contains(lIlIllllllII[lIlIllllllIl[6]]) ? 1 : 0)) {
            n2 = lIlIllllllIl[0];
            0;
            if (-3 >= 0) {
                return ((0xF3 ^ 0xB8) & ~(2 ^ 0x49)) != 0;
            }
        } else {
            n2 = lIlIllllllIl[1];
        }
        return n2 != 0;
    }

    private boolean i() {
        BankLoadout bankLoadout = (BankLoadout)this.o.bankLoadout().selected(BankLoadout.class);
        return Arrays.stream(bankLoadout.getInventorySetup().getIds()).mapToObj(n2 -> Static.getClient().getItemDefinition(n2)).anyMatch(itemComposition -> this.a(itemComposition.getName()));
    }

    private static void lllIIIlIllllII() {
        lIlIllllllII = new String[lIlIllllllIl[8]];
        d.lIlIllllllII[d.lIlIllllllIl[1]] = d."Corporeal Beast";
        d.lIlIllllllII[d.lIlIllllllIl[0]] = d."Setting banking to true invent full";
        d.lIlIllllllII[d.lIlIllllllIl[3]] = d."Setting banking to true out of food";
        d.lIlIllllllII[d.lIlIllllllIl[4]] = d."Eat";
        d.lIlIllllllII[d.lIlIllllllIl[5]] = d."combat";
        d.lIlIllllllII[d.lIlIllllllIl[6]] = d."super";
        d.lIlIllllllII[d.lIlIllllllIl[7]] = d."Eat";
    }

    private static String lllIIIlIlllIll(String lllllllllllllllIllIIIllIIIllIIII, String lllllllllllllllIllIIIllIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIIIlIllll.getBytes(StandardCharsets.UTF_8)), lIlIllllllIl[9]), "DES");
            Cipher lllllllllllllllIllIIIllIIIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIllIIIllIIlI.init(lIlIllllllIl[3], lllllllllllllllIllIIIllIIIllIIll);
            return new String(lllllllllllllllIllIIIllIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIllIIIllIIIl) {
            lllllllllllllllIllIIIllIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIllllll(int n2) {
        return n2 != 0;
    }

    private static String lllIIIlIlllIIl(String lllllllllllllllIllIIIllIIIIllIll, String lllllllllllllllIllIIIllIIIIllIlI) {
        lllllllllllllllIllIIIllIIIIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIllIIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIllIIIIllllI = new StringBuilder();
        char[] lllllllllllllllIllIIIllIIIIlllIl = lllllllllllllllIllIIIllIIIIllIlI.toCharArray();
        int lllllllllllllllIllIIIllIIIIlllII = lIlIllllllIl[1];
        char[] lllllllllllllllIllIIIllIIIIlIllI = lllllllllllllllIllIIIllIIIIllIll.toCharArray();
        int lllllllllllllllIllIIIllIIIIlIlIl = lllllllllllllllIllIIIllIIIIlIllI.length;
        int lllllllllllllllIllIIIllIIIIlIlII = lIlIllllllIl[1];
        while (d.lllIIIllIIIIlI(lllllllllllllllIllIIIllIIIIlIlII, lllllllllllllllIllIIIllIIIIlIlIl)) {
            char lllllllllllllllIllIIIllIIIlIIIIl = lllllllllllllllIllIIIllIIIIlIllI[lllllllllllllllIllIIIllIIIIlIlII];
            lllllllllllllllIllIIIllIIIIllllI.append((char)(lllllllllllllllIllIIIllIIIlIIIIl ^ lllllllllllllllIllIIIllIIIIlllIl[lllllllllllllllIllIIIllIIIIlllII % lllllllllllllllIllIIIllIIIIlllIl.length]));
            0;
            ++lllllllllllllllIllIIIllIIIIlllII;
            ++lllllllllllllllIllIIIllIIIIlIlII;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIllIIIIllllI);
    }

    private boolean h() {
        BankLoadout bankLoadout = (BankLoadout)this.o.bankLoadout().selected(BankLoadout.class);
        return Arrays.stream(bankLoadout.getInventorySetup().getIds()).mapToObj(n2 -> Static.getClient().getItemDefinition(n2)).flatMap(itemComposition -> Arrays.stream(itemComposition.getInventoryActions())).anyMatch(lIlIllllllII[lIlIllllllIl[4]]::equals);
    }

    private static boolean lllIIIllIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIllIIIIII(Object object) {
        return object == null;
    }
}

