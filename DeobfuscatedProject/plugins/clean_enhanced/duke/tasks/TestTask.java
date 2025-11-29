/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;

@TaskDesc(name="Test Task", priority=0x7FFFFFFF)
public class TestTask
extends Task {
    
    final  SquireDukeSucellus an;
    final  a ao;

    static {
        m.var2();
    }

    public boolean run() {
        return 0;
    }

    @Inject
    public TestTask(SquireDukeSucellus squireDukeSucellus) {
        this.an = squireDukeSucellus;
        this.ao = squireDukeSucellus.s();
    }
}

