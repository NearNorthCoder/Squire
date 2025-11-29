/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Pressing Continue", priority=15, blocking=true)
public class PressingContinueTask
extends Task {
    private static  int[] lllIIIl;

    public boolean run() {
        if ((Dialog.canContinue( == 0) ? 1 : 0)) {
            return 0;
        }
        Dialog.continueSpace();
        return 1;
    }
}

