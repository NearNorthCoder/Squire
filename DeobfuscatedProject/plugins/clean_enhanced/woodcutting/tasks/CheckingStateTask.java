/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Checking state", priority=133337, register=true)
public class CheckingStateTask
extends Task {

    private final  SquireWoodcutterConfig H;
    private final  SquireWoodcutterPlugin G;

    public boolean run() {
        h var3;
        if ((this.G.g( != 0) ? 1 : 0) && (Bank.isOpen( != 0) ? 1 : 0)) {
            Log.info((String)var1[0]);
            this.G.a(0);
            Bank.close();
        }
        if ((var3.G.p( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0) && (var3.H.bank( != 0) ? 1 : 0)) {
            Log.info((String)var1[1]);
            var3.G.a(1);
            return 1;
        }
        if ((var3.G.d( == 0) ? 1 : 0) && (!(var3.H.fastTickChop( == 0) ? 1 : 0) || (var3.H.tickChop( != 0) ? 1 : 0))) {
            Log.info((String)var1[2]);
            var3.G.a(1);
            return 1;
        }
        return 0;
    }

    @Inject
    public CheckingStateTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.G = squireWoodcutterPlugin;
        this.H = squireWoodcutterConfig;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < llllllllllllllIllIIlIlllllllllll2) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((0xA4 ^ 0xA1) != 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

}

