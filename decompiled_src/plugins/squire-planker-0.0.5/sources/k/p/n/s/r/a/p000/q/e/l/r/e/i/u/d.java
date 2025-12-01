package k.p.n.s.r.a.p000.q.e.l.r.e.i.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import gg.squire.construction.SquirePlankerPlugin;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Making Planks")
/* renamed from: k.p.n.s.r.a.-.q.e.l.r.e.i.u.d  reason: invalid package */
/* loaded from: squire-planker-0.0.5.jar:k/p/n/s/r/a/-/q/e/l/r/e/i/u/d.class */
public class d extends Task {
    private final /* synthetic */ SquirePlankerConfig n;
    private static /* synthetic */ int[] lllllIlllIll;

    private static boolean lIIlIIlllIllIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIIlllIllIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIIlIIlllIllIIl(Dialog.isOpen() ? 1 : 0)) {
            return lllllIlllIll[0];
        }
        if (lIIlIIlllIllIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            DialogOption[] dialogOptionArr = new DialogOption[lllllIlllIll[1]];
            dialogOptionArr[lllllIlllIll[0]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lllllIlllIll[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lllllIlllIll[3]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lllllIlllIll[4]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            return lllllIlllIll[2];
        } else if (!lIIlIIlllIllIlI(Dialog.canContinue() ? 1 : 0)) {
            if (lIIlIIlllIllIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                int i = SquirePlankerPlugin.b;
                int[] iArr = new int[lllllIlllIll[2]];
                iArr[lllllIlllIll[0]] = this.n.plank().d();
                SquirePlankerPlugin.b = i + Inventory.getCount(iArr);
                Dialog.enterAmount(lllllIlllIll[8]);
            }
            return lllllIlllIll[2];
        } else if (lIIlIIlllIllIlI(Dialog.canContinuePlayer() ? 1 : 0)) {
            Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
            sleep(lllllIlllIll[3]);
            return lllllIlllIll[2];
        } else {
            DialogOption[] dialogOptionArr2 = new DialogOption[lllllIlllIll[5]];
            dialogOptionArr2[lllllIlllIll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lllllIlllIll[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr2[lllllIlllIll[3]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lllllIlllIll[4]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr2[lllllIlllIll[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr2[lllllIlllIll[6]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr2[lllllIlllIll[7]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr2);
            return lllllIlllIll[2];
        }
    }

    private static void lIIlIIlllIllIII() {
        lllllIlllIll = new int[9];
        lllllIlllIll[0] = ((16 ^ 73) ^ (49 ^ 46)) & (((244 ^ 152) ^ (67 ^ 105)) ^ (-" ".length())) & ((((243 ^ 148) ^ (84 ^ 46)) & (((((146 + 116) - 152) + 39) ^ (((5 + 73) - (-18)) + 40)) ^ (-" ".length()))) ^ (-" ".length()));
        lllllIlllIll[1] = 186 ^ 190;
        lllllIlllIll[2] = " ".length();
        lllllIlllIll[3] = "  ".length();
        lllllIlllIll[4] = "   ".length();
        lllllIlllIll[5] = 7 ^ 0;
        lllllIlllIll[6] = (51 ^ 31) ^ (163 ^ 138);
        lllllIlllIll[7] = 77 ^ 75;
        lllllIlllIll[8] = (((72 + 155) - 98) + 44) ^ (((139 + 134) - 168) + 78);
    }

    @Inject
    public d(SquirePlankerConfig squirePlankerConfig) {
        this.n = squirePlankerConfig;
    }

    static {
        lIIlIIlllIllIII();
    }
}
