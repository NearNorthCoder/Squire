/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Dialog Spacebar", priority=100)
public class DialogSpacebar
extends Task {
    public boolean run() {
        if (Dialog.canContinueNPC() || Dialog.canContinuePlayer()) {
            return false;
        }
        if (Dialog.canContinue()) {
            Dialog.continueSpace();
            return true;
        }
        return false;
    }
}

