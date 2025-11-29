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

/* TASK: Checking if we should bank -> CheckingifweshouldbankTask */
@TaskDesc(name="Checking if we should bank")
public class CheckingIfWeShouldBankTask
extends Task {
    private static /* synthetic */ String[] lIlIllllllII;
    @Inject
    private /* synthetic */ SquireCorp p;
    private static /* synthetic */ int[] lIlIllllllIl;
    @Inject
    private /* synthetic */ SquireCorpConfig o;

    private static String lllIIIlIlllIlI(String var17, String var7) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIlIllllllIl[3], var4);
            return new String(var18.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
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
        d var6;
        String[] stringArray = new String[lIlIllllllIl[0]];
        stringArray[d.lIlIllllllIl[1]] = lIlIllllllII[lIlIllllllIl[1]];
        if (d.lllIIIlIlllllI(NPCs.getNearest((String[])stringArray))) {
            this.sleep(lIlIllllllIl[2]);
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(var6.p.c() ? 1 : 0)) {
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(var6.p.b() ? 1 : 0)) {
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(Inventory.isFull() ? 1 : 0)) {
            Log.info((String)lIlIllllllII[lIlIllllllIl[0]]);
            var6.p.a(lIlIllllllIl[0]);
        }
        if (d.lllIIIllIIIIII(Inventory.getFirst(item -> this.a(item.getName()))) && d.lllIIIlIllllll(var6.i() ? 1 : 0)) {
            var6.p.a(lIlIllllllIl[0]);
        }
        if (d.lllIIIllIIIIII(Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIllllllIl[0]];
            stringArray[d.lIlIllllllIl[1]] = lIlIllllllII[lIlIllllllIl[7]];
            return item.hasAction(stringArray);
        })) && d.lllIIIlIllllll(var6.h() ? 1 : 0)) {
            Log.info((String)lIlIllllllII[lIlIllllllIl[3]]);
            var6.p.a(lIlIllllllIl[0]);
        }
        return lIlIllllllIl[1];
    }

    private boolean a(String string) {
        int n2;
        if (!d.lllIIIllIIIIIl(string.toLowerCase().contains(lIlIllllllII[lIlIllllllIl[5]]) ? 1 : 0) || d.lllIIIlIllllll(string.toLowerCase().contains(lIlIllllllII[lIlIllllllIl[6]]) ? 1 : 0)) {
            n2 = lIlIllllllIl[0];
            0;
            if (-3 >= 0) {
                return false;
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

    private static String lllIIIlIlllIll(String var14, String var5) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIllllllIl[9]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIllllllIl[3], var13);
            return new String(var1.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIllllll(int n2) {
        return n2 != 0;
    }

    private static String lllIIIlIlllIIl(String var9, String var15) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var20 = var15.toCharArray();
        int var8 = lIlIllllllIl[1];
        char[] var3 = var9.toCharArray();
        int var11 = var3.length;
        int var12 = lIlIllllllIl[1];
        while (d.lllIIIllIIIIlI(var12, var11)) {
            char var2 = var3[var12];
            var10.append((char)(var2 ^ var20[var8 % var20.length]));
            0;
            ++var8;
            ++var12;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var10);
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

