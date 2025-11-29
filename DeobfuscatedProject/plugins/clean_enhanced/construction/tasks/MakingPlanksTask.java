/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import gg.squire.construction.SquirePlankerPlugin;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Making Planks")
public class MakingPlanksTask
extends Task {
    private final  SquirePlankerConfig n;

    private static boolean var2(int n) {
        return n == 0;
    }

    private static boolean var3(int n) {
        return n != 0;
    }

    public boolean run() {
        d var4;
        if (d.var2(Dialog.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (d.var3(Dialog.isViewingOptions() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[var1[1]];
            dialogOptionArray[d.var1[0]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.var1[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[d.var1[3]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.var1[4]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return var1[2];
        }
        if (d.var3(Dialog.canContinue() ? 1 : 0)) {
            if (d.var3(Dialog.canContinuePlayer() ? 1 : 0)) {
                Magic.cast((SpeSpellBook.Standard.CAMELOT_TELEPORT);
                var4.sleep(var1[3]);
                return var1[2];
            }
            DialogOption[] dialogOptionArray = new DialogOption[var1[5]];
            dialogOptionArray[d.var1[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[d.var1[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.var1[3]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[d.var1[4]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.var1[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[d.var1[6]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.var1[7]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return var1[2];
        }
        if (d.var3(Dialog.isEnterInputOpen() ? 1 : 0)) {
            int[] nArray = new int[var1[2]];
            nArray[d.var1[0]] = var4.n.plank().MakingPlanksTask();
            SquirePlankerPlugin.b += Inventory.getCount((int[])nArray);
            Dialog.enterAmount((int)var1[8]);
        }
        return var1[2];
    }

    private static void var5() {
        var1 = new int[9];
        d.var1[0] = (0x10 ^ 0x49 ^ (0x31 ^ 0x2E)) & (0xF4 ^ 0x98 ^ (0x43 ^ 0x69) ^ -1) & ((0xF3 ^ 0x94 ^ (0x54 ^ 0x2E)) & (146 + 116 - 152 + 39 ^ 5 + 73 - -18 + 40 ^ -1) ^ -1);
        d.var1[1] = 0xBA ^ 0xBE;
        d.var1[2] = 1;
        d.var1[3] = 2;
        d.var1[4] = 3;
        d.var1[5] = 7 ^ 0;
        d.var1[6] = 0x33 ^ 0x1F ^ (0xA3 ^ 0x8A);
        d.var1[7] = 0x4D ^ 0x4B;
        d.var1[8] = 72 + 155 - 98 + 44 ^ 139 + 134 - 168 + 78;
    }

    @Inject
    public MakingPlanksTask(SquirePlankerConfig squirePlankerConfig) {
        this.n = squirePlankerConfig;
    }

    static {
        d.var5();
    }
}

