/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.whisperer.tasks.WhispererManager;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Disturbing Odd Figure")
public class DisturbingOddFigureTask
extends WhispererTaskBase {
    
    private static final  int V;
    
    @Inject
    private  d W;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        String[] stringArray = new String[0];
        stringArray[1] = var1[1];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if nPC == null {
            return 1;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0)) {
            String[] stringArray2 = new String[0];
            stringArray2[1] = var1[0];
            Dialog.chooseOption((String[])stringArray2);
            0;
            return 0;
        }
        this.W.e();
        nPC.interact(var1[2]);
        return 0;
    }

    static {
        o.var9();
        o.var10();
        V = 3;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 1;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 1;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }
}

