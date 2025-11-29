/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.input.Keyboard
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.debug.typer.SquireTyperConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.input.Keyboard;

@TaskDesc(name="Typing")
public class TypingTask
extends Task {
    
    @Inject
    private  SquireTyperConfig cR;

    private static boolean llIIllllllI(int n2) {
        return n2 != 0;
    }

    static {
        al.llIIlllllIl();
    }

    public boolean run() {
        if (al.llIIllllllI(this.cR.msg().isEmpty() ? 1 : 0)) {
            return llllIIlll[0];
        }
        Keyboard.type((String)this.cR.msg(), (boolean)llllIIlll[1]);
        int n2 = this.cR.tickDelay();
        int n3 = (int)((double)n2 * 0.1);
        this.sleep(Rand.nextInt((int)(this.cR.tickDelay() - n3), (int)(this.cR.tickDelay() + n3)));
        return llllIIlll[1];
    }

}

