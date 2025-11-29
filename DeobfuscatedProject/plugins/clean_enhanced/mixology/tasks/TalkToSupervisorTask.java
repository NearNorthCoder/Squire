/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.mixology.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.mixology.tasks.MixologyManager;

@TaskDesc(name="talk to supervisor")
public class TalkToSupervisorTask
extends Task {

    static {
        p.var3();
        p.var4();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if (p.var11(Vars.getBit((int)var2[0]), var2[1])) {
            return var2[2];
        }
        if (p.var12(s.e() ? 1 : 0)) {
            return var2[2];
        }
        if (p.var12(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[var2[1]];
            stringArray[p.var2[2]] = var1[var2[2]];
            NPCs.getNearest((String[])stringArray).interact(var1[var2[1]]);
            return var2[2];
        }
        if (p.var13(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        return var2[2];
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void var3() {
        var2 = new int[5];
        p.var2[0] = 0xFFFFAF5F & 0x7CE8;
        p.var2[1] = 1;
        p.var2[2] = (0xFB ^ 0xB3 ^ (0x67 ^ 0x7D)) & (0x1A ^ 0x7F ^ (0x51 ^ 0x66) ^ -1);
        p.var2[3] = 2;
        p.var2[4] = 78 + 175 - 152 + 77 ^ 99 + 27 - 47 + 107;
    }

    private static boolean var11(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new String[var2[3]];
        p.var1[p.var2[2]] = "Supervisor Lalo";
        p.var1[p.var2[1]] = "Talk-to";
    }
}

