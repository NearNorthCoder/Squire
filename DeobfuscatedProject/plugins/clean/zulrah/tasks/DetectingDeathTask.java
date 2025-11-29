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

import gg.squire.zulrah.tasks.GameEnum40;
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
        Q.llIIIlllIlllIIl();
    }

    @Inject
    public DetectingDeathTask(SquireZulrah squireZulrah, Client client) {
        this.an = squireZulrah;
        this.ao = client;
    }

    private static boolean llIIIlllIlllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllIlllIll(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        Q var1;
        if (Q.llIIIlllIlllIlI(this.ao.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIIlIlI[0];
        }
        if (Q.llIIIlllIlllIlI(Bank.isOpen() ? 1 : 0)) {
            return lIllIlIIIlIlI[0];
        }
        if (Q.llIIIlllIlllIll((Object)var1.an.a(), (Object)c.DONE)) {
            return lIllIlIIIlIlI[0];
        }
        return lIllIlIIIlIlI[0];
    }
}

