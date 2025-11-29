/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;

public class WHelper
extends Task {
    private static  int[] lIlllIII;

    static {
        W.var1();
    }

    private static void var1() {
        lIlllIII = new int[1];
        W.lIlllIII[0] = (0x1E ^ 0x15 ^ (0xBD ^ 0x8D)) & (0x52 ^ 7 ^ (0x19 ^ 0x77) ^ -1);
    }

    public boolean run() {
        return lIlllIII[0];
    }
}

