/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handing in sword", priority=10, blocking=true)
public class HandingInSwordTask
extends Task {
    private final  a aa;

    public boolean run() {
        l var3;
        if (l.var4(this.aa.f() ? 1 : 0)) {
            return var1[0];
        }
        if (l.var5((Object)var3.aa.k())) {
            return var1[0];
        }
        if (l.var6(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var1[0];
        }
        if (l.var6(Dialog.getText().contains(var2[var1[0]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[var1[1]];
            dialogOptionArray[l.var1[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[l.var1[2]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArray[l.var1[3]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[l.var1[4]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[l.var1[5]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return var1[2];
        }
        Player var7 = Players.getLocal();
        if (l.var5(var7.getInteracting())) {
            return var1[0];
        }
        this.aa.a(var2[var1[2]]);
        0;
        this.sleep(var1[3]);
        return var1[2];
    }

    static {
        l.var8();
        l.var9();
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static void var8() {
        var1 = new int[7];
        l.var1[0] = (0xFB ^ 0x9A ^ (0xF ^ 0x37)) & (0xE8 ^ 0x93 ^ (0x34 ^ 0x16) ^ -1);
        l.var1[1] = 104 + 56 - -30 + 6 ^ 1 + 156 - 5 + 41;
        l.var1[2] = 1;
        l.var1[3] = 2;
        l.var1[4] = 3;
        l.var1[5] = 0xCF ^ 0x86 ^ (0x8A ^ 0xC7);
        l.var1[6] = 20 + 177 - 149 + 159 ^ 78 + 42 - -20 + 59;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new String[var1[3]];
        l.var2[l.var1[0]] = "Hand over.";
        l.var2[l.var1[2]] = "Hand-in";
    }

    @Inject
    public HandingInSwordTask(a a2) {
        this.aa = a2;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }
}

