/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum9;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Detecting death", priority=0x7FFFFFFF)
public class DetectingDeathTask
extends Task {
    private final  Client ao;
    private final  SquireZulrah an;

    static {
        Q.var2();
    }

    @Inject
    public DetectingDeathTask(SquireZulrah squireZulrah, Client client) {
        this.an = squireZulrah;
        this.ao = client;
    }

    public boolean run() {
        Q var3;
        if ((this.ao.isInInstancedRegion( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 0;
        }
        if (((Object)var3.an.a() != (Object)var3.an.a()2)c.DONE)) {
            return 0;
        }
        return 0;
    }
}

