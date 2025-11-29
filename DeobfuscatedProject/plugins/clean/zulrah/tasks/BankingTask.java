/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum40;
import gg.squire.zulrah.tasks.THelper;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@TaskDesc(name="Banking", priority=1000, blocking=true)
public abstract class BankingTask
extends Task {
    protected final  t Y;
    protected final  Client Z;
    protected final  SquireZulrah aa;
    
    protected final  SquireZulrahConfig X;
    @Inject
    protected  u ab;

    private static boolean llIIlIIllllIllI(int n2) {
        return n2 == 0;
    }

    public int af() {
        return lIllIlllllIII[1];
    }

    protected BankLoadout ae() {
        return (BankLoadout)this.X.bankLoadout().selected(BankLoadout.class);
    }

    public abstract boolean ac();

    private static boolean llIIlIIllllIlIl(Object object, Object object2) {
        return object != object2;
    }

    protected boolean ad() {
        return this.X.bankLocation().g().stream().anyMatch(n2 -> this.ab.h((int)n2));
    }

    protected BankingTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        this.aa = squireZulrah;
        this.X = squireZulrahConfig;
        this.Z = client;
        this.Y = t2;
    }

    public boolean run() {
        E var1;
        if (!E.llIIlIIllllIlII(this.X.bank() ? 1 : 0) || E.llIIlIIllllIlIl((Object)this.aa.a(), (Object)c.DONE)) {
            return lIllIlllllIII[0];
        }
        if (E.llIIlIIllllIlII(var1.ad() ? 1 : 0)) {
            var1.aa.a(var1.ae().needsToBank());
        }
        if (E.llIIlIIllllIllI(var1.aa.d() ? 1 : 0)) {
            return lIllIlllllIII[0];
        }
        return this.ac();
    }

    static {
        E.llIIlIIllllIIll();
    }

    private static boolean llIIlIIllllIlII(int n2) {
        return n2 != 0;
    }
}

