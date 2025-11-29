/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.tasks.AHelper;

@TaskDesc(name="Initialization")
public class InitializationTask
extends Task {
    private final  a z;

    static {
        f.llIIIllIllllIIl();
    }

    private static boolean llIIIllIllllIlI(int n, int n2) {
        return n != n2;
    }

    public boolean run() {
        if (f.llIIIllIllllIlI(this.z.j(), lIllIIlllIIll[0])) {
            return lIllIIlllIIll[1];
        }
        this.z.d();
        return lIllIIlllIIll[2];
    }

    @Inject
    public InitializationTask(a a2) {
        this.z = a2;
    }
}

