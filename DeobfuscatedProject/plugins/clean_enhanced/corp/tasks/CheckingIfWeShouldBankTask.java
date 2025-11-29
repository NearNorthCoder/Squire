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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        d var9;
        String[] stringArray = new String[0];
        stringArray[1] = var1[1];
        if ((NPCs.getNearest((String[] != nustringArray))) {
            this.sleep(2);
            return 1;
        }
        if ((var9.p.c( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((var9.p.b( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            Log.info((String)var1[0]);
            var9.p.a(0);
        }
        if ((Inventory.getFirst(item -> this.a(item.getName( == null)))) && (var9.i( != 0) ? 1 : 0)) {
            var9.p.a(0);
        }
        if ((Inventory.getFirst(item -> {
            String[] stringArray = new String[0];
            stringArray[1] = var1[7];
            return item.hasActionstringArray == null;
        })) && (var9.h( != 0) ? 1 : 0)) {
            Log.info((String)var1[3]);
            var9.p.a(0);
        }
        return 1;
    }

    private boolean a(String string) {
        int n2;
        if (!(string.toLowerCase( == 0).contains(var1[5]) ? 1 : 0) || (string.toLowerCase( != 0).contains(var1[6]) ? 1 : 0)) {
            n2 = 0;
            0;
            if (-3 >= 0) {
                return ((0xF3 ^ 0xB8) & ~(2 ^ 0x49)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    private boolean i() {
        BankLoadout bankLoadout = (BankLoadout)this.o.bankLoadout().selected(BankLoadout.class);
        return Arrays.stream(bankLoadout.getInventorySetup().getIds()).mapToObj(n2 -> Static.getClient().getItemDefinition(n2)).anyMatch(itemComposition -> this.a(itemComposition.getName()));
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 1;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 1;
        while (var24 < var23) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private boolean h() {
        BankLoadout bankLoadout = (BankLoadout)this.o.bankLoadout().selected(BankLoadout.class);
        return Arrays.stream(bankLoadout.getInventorySetup().getIds()).mapToObj(n2 -> Static.getClient().getItemDefinition(n2)).flatMap(itemComposition -> Arrays.stream(itemComposition.getInventoryActions())).anyMatch(var1[4]::equals);
    }

}

