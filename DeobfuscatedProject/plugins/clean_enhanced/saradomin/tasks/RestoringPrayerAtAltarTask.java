/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Restoring Prayer at Altar", priority=30)
public class RestoringPrayerAtAltarTask
extends Task {
    private final  g aJ;
    
    private final  SquireSaraConfig aI;

    public boolean run() {
        return var1[0];
    }

    static {
        E.var2();
    }

    @Inject
    public RestoringPrayerAtAltarTask(SquireSaraConfig squireSaraConfig, g g2) {
        this.aI = squireSaraConfig;
        this.aJ = g2;
    }

    private static void var2() {
        var1 = new int[1];
        E.var1[0] = (106 + 96 - 103 + 40 ^ 61 + 60 - -12 + 32) & (8 ^ 0x66 ^ (8 ^ 0x48) ^ -1);
    }
}

