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
package gg.squire.corp.tasks;

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
public class CheckingIfWeShouldBankTask
extends Task {
    
    @Inject
    private  SquireCorp p;
    
    @Inject
    private  SquireCorpConfig o;

    private static boolean lllIIIlIlllllI(Object object) {
        return object != null;
    }

    static {
        d.lllIIIlIllllIl();
        d.lllIIIlIllllII();
    }

    public boolean run() {
        d var1;
        String[] stringArray = new String[lIlIllllllIl[0]];
        stringArray[d.lIlIllllllIl[1]] = lIlIllllllII[lIlIllllllIl[1]];
        if (d.lllIIIlIlllllI(NPCs.getNearest((String[])stringArray))) {
            this.sleep(lIlIllllllIl[2]);
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(var1.p.c() ? 1 : 0)) {
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(var1.p.b() ? 1 : 0)) {
            return lIlIllllllIl[1];
        }
        if (d.lllIIIlIllllll(Inventory.isFull() ? 1 : 0)) {
            Log.info((String)lIlIllllllII[lIlIllllllIl[0]]);
            var1.p.a(lIlIllllllIl[0]);
        }
        if (d.lllIIIllIIIIII(Inventory.getFirst(item -> this.a(item.getName()))) && d.lllIIIlIllllll(var1.i() ? 1 : 0)) {
            var1.p.a(lIlIllllllIl[0]);
        }
        if (d.lllIIIllIIIIII(Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIllllllIl[0]];
            stringArray[d.lIlIllllllIl[1]] = lIlIllllllII[lIlIllllllIl[7]];
            return item.hasAction(stringArray);
        })) && d.lllIIIlIllllll(var1.h() ? 1 : 0)) {
            Log.info((String)lIlIllllllII[lIlIllllllIl[3]]);
            var1.p.a(lIlIllllllIl[0]);
        }
        return lIlIllllllIl[1];
    }

    private boolean a(String string) {
        int n2;
        if (!d.lllIIIllIIIIIl(string.toLowerCase().contains(lIlIllllllII[lIlIllllllIl[5]]) ? 1 : 0) || d.lllIIIlIllllll(string.toLowerCase().contains(lIlIllllllII[lIlIllllllIl[6]]) ? 1 : 0)) {
            n2 = lIlIllllllIl[0];

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
        d.lIlIllllllII[d.lIlIllllllIl[1]] = "Corporeal Beast";
        d.lIlIllllllII[d.lIlIllllllIl[0]] = "Setting banking to true invent full";
        d.lIlIllllllII[d.lIlIllllllIl[3]] = "Setting banking to true out of food";
        d.lIlIllllllII[d.lIlIllllllIl[4]] = "Eat";
        d.lIlIllllllII[d.lIlIllllllIl[5]] = "combat";
        d.lIlIllllllII[d.lIlIllllllIl[6]] = "super";
        d.lIlIllllllII[d.lIlIllllllIl[7]] = "Eat";
    }

    private static boolean lllIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIllllll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var2);
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

