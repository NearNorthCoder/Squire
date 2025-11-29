/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import gg.squire.nightmarezone.tasks.BHelper;

@TaskDesc(name="Start Dream", priority=100, blocking=true)
public class StartDreamTask
extends Task {
    
    private final  SquireNightmareZone ao;
    
    private final  SquireNightmareZoneConfig ap;
    private final  Client aq;

    private static void var3() {
        var1 = new int[9];
        o.var1[0] = (0xCA ^ 0x91 ^ (0x59 ^ 0x11)) & (0x93 ^ 0x81 ^ 1 ^ -1);
        o.var1[1] = 1;
        o.var1[2] = 2;
        o.var1[3] = 3;
        o.var1[4] = 0x27 ^ 0x55 ^ (0x69 ^ 0x1F);
        o.var1[5] = 0x20 ^ 0x25;
        o.var1[6] = 0x52 ^ 3 ^ (0xC0 ^ 0x97);
        o.var1[7] = 0xC5 ^ 0x81 ^ (0xF4 ^ 0xB7);
        o.var1[8] = 0x45 ^ 0x4D;
    }

    @Inject
    public StartDreamTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ao = squireNightmareZone;
        this.ap = squireNightmareZoneConfig;
        this.aq = client;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[0];
        while (o.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        o.var3();
        o.var22();
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    private static void var22() {
        var2 = new String[var1[7]];
        o.var2[o.var1[0]] = "Yes";
        o.var2[o.var1[1]] = "Yes";
        o.var2[o.var1[2]] = "Choosing previous";
        o.var2[o.var1[3]] = "Previous";
        o.var2[o.var1[4]] = "Dominic Onion";
        o.var2[o.var1[5]] = "Dream";
        o.var2[o.var1[6]] = "Previous";
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (o.var15(this.aq.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        int var30 = Static.getClient().getVarbitValue(b.u);
        if (o.var15(var30)) {
            return var1[0];
        }
        if (o.var15(Dialog.canContinue() ? 1 : 0)) {
            return var1[1];
        }
        if (o.var15(Dialog.isViewingOptions() ? 1 : 0) && o.var15(Dialog.hasOption((String)var2[var1[0]]) ? 1 : 0)) {
            System.out.println("Option text:" + Dialog.getText());
            String[] stringArray = new String[var1[1]];
            stringArray[o.var1[0]] = var2[var1[1]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return var1[1];
        }
        if (o.var15(Dialog.isOpen() ? 1 : 0) && o.var15(Dialog.hasOption(string -> string.startsWith(var2[var1[6]])) ? 1 : 0)) {
            System.out.println(var2[var1[2]]);
            String[] stringArray = new String[var1[1]];
            stringArray[o.var1[0]] = var2[var1[3]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return var1[1];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[o.var1[0]] = var2[var1[4]];
        NPC var31 = NPCs.getNearest((String[])stringArray);
        if (o.var23(var31)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[5]]);
        return var1[1];
    }
}

