package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Dialog Spacebar", priority = 100)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/DialogSpacebar.class */
public class DialogSpacebar extends Task {
    public boolean run() {
        if (!Dialog.canContinueNPC() && !Dialog.canContinuePlayer() && Dialog.canContinue()) {
            Dialog.continueSpace();
            return true;
        }
        return false;
    }
}
