/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Pressing continue", priority=0x7FFFFFFD, blocking=true)
public class PressingContinueTask
extends Task {
    
    private final  v W;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public PressingContinueTask(v v2) {
        this.W = v2;
    }

    public boolean run() {
        if ((Dialog.canContinue( != 0) ? 1 : 0)) {
            if ((Dialog.getText( != 0).contains(var1[0]) ? 1 : 0)) {
                this.W.R();
            }
            Dialog.continueSpace();
            return 1;
        }
        return 0;
    }

}

