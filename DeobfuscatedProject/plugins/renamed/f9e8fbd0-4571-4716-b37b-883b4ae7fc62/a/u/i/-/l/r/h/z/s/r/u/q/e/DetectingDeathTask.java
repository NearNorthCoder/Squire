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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;

/* TASK: Detecting death -> DetectingdeathTask */
@TaskDesc(name="Detecting death", priority=0x7FFFFFFF)
public class DetectingDeathTask
extends Task {
    private final /* synthetic */ Client ao;
    private final /* synthetic */ SquireZulrah an;
    private static /* synthetic */ int[] lIllIlIIIlIlI;

    static {
        Q.llIIIlllIlllIIl();
    }

    @Inject
    public Q(SquireZulrah squireZulrah, Client client) {
        this.an = squireZulrah;
        this.ao = client;
    }

    private static boolean llIIIlllIlllIlI(int n2) {
        return n2 != 0;
    }

    private static void llIIIlllIlllIIl() {
        lIllIlIIIlIlI = new int[1];
        Q.lIllIlIIIlIlI[0] = (0x62 ^ 0x41) & ~(0xB8 ^ 0x9B);
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

