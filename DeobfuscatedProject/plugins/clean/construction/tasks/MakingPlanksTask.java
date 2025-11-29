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

    private static boolean lIIlIIlllIllIIl(int n) {
        return n == 0;
    }

    private static boolean lIIlIIlllIllIlI(int n) {
        return n != 0;
    }

    public boolean run() {
        d var1;
        if (d.lIIlIIlllIllIIl(Dialog.isOpen() ? 1 : 0)) {
            return lllllIlllIll[0];
        }
        if (d.lIIlIIlllIllIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lllllIlllIll[1]];
            dialogOptionArray[d.lllllIlllIll[0]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.lllllIlllIll[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[d.lllllIlllIll[3]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.lllllIlllIll[4]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return lllllIlllIll[2];
        }
        if (d.lIIlIIlllIllIlI(Dialog.canContinue() ? 1 : 0)) {
            if (d.lIIlIIlllIllIlI(Dialog.canContinuePlayer() ? 1 : 0)) {
                Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                var1.sleep(lllllIlllIll[3]);
                return lllllIlllIll[2];
            }
            DialogOption[] dialogOptionArray = new DialogOption[lllllIlllIll[5]];
            dialogOptionArray[d.lllllIlllIll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[d.lllllIlllIll[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.lllllIlllIll[3]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[d.lllllIlllIll[4]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.lllllIlllIll[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[d.lllllIlllIll[6]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[d.lllllIlllIll[7]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return lllllIlllIll[2];
        }
        if (d.lIIlIIlllIllIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
            int[] nArray = new int[lllllIlllIll[2]];
            nArray[d.lllllIlllIll[0]] = var1.n.plank().MakingPlanksTask();
            SquirePlankerPlugin.b += Inventory.getCount((int[])nArray);
            Dialog.enterAmount((int)lllllIlllIll[8]);
        }
        return lllllIlllIll[2];
    }

    @Inject
    public MakingPlanksTask(SquirePlankerConfig squirePlankerConfig) {
        this.n = squirePlankerConfig;
    }

    static {
        d.lIIlIIlllIllIII();
    }
}

