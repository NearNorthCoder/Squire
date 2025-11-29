/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.hunter.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;

@TaskDesc(name="Idling")
public class IdlingTask
extends Task {

    private static void var2() {
        var1 = new int[1];
        k.var1[0] = (0xF4 ^ 0xAC) & ~(0x63 ^ 0x3B);
    }

    static {
        k.var2();
    }

    public boolean run() {
        return var1[0];
    }
}

