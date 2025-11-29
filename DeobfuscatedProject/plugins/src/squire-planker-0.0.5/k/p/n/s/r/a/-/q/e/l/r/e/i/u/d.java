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
package k.p.n.s.r.a.-.q.e.l.r.e.i.u;

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
public class d
extends Task {
    private final /* synthetic */ SquirePlankerConfig n;
    private static /* synthetic */ int[] lllllIlllIll;

    private static boolean lIIlIIlllIllIIl(int n) {
        return n == 0;
    }

    private static boolean lIIlIIlllIllIlI(int n) {
        return n != 0;
    }

    public boolean run() {
        d lllllllllllllllIIlIlIIIIIlIIllIl;
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
                lllllllllllllllIIlIlIIIIIlIIllIl.sleep(lllllIlllIll[3]);
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
            nArray[d.lllllIlllIll[0]] = lllllllllllllllIIlIlIIIIIlIIllIl.n.plank().d();
            SquirePlankerPlugin.b += Inventory.getCount((int[])nArray);
            Dialog.enterAmount((int)lllllIlllIll[8]);
        }
        return lllllIlllIll[2];
    }

    private static void lIIlIIlllIllIII() {
        lllllIlllIll = new int[9];
        d.lllllIlllIll[0] = (0x10 ^ 0x49 ^ (0x31 ^ 0x2E)) & (0xF4 ^ 0x98 ^ (0x43 ^ 0x69) ^ -" ".length()) & ((0xF3 ^ 0x94 ^ (0x54 ^ 0x2E)) & (146 + 116 - 152 + 39 ^ 5 + 73 - -18 + 40 ^ -" ".length()) ^ -" ".length());
        d.lllllIlllIll[1] = 0xBA ^ 0xBE;
        d.lllllIlllIll[2] = " ".length();
        d.lllllIlllIll[3] = "  ".length();
        d.lllllIlllIll[4] = "   ".length();
        d.lllllIlllIll[5] = 7 ^ 0;
        d.lllllIlllIll[6] = 0x33 ^ 0x1F ^ (0xA3 ^ 0x8A);
        d.lllllIlllIll[7] = 0x4D ^ 0x4B;
        d.lllllIlllIll[8] = 72 + 155 - 98 + 44 ^ 139 + 134 - 168 + 78;
    }

    @Inject
    public d(SquirePlankerConfig squirePlankerConfig) {
        this.n = squirePlankerConfig;
    }

    static {
        d.lIIlIIlllIllIII();
    }
}

