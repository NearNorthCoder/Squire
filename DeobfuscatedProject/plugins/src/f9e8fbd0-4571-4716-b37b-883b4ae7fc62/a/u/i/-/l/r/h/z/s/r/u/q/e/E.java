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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import a.u.i.-.l.r.h.z.s.r.u.q.e.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@TaskDesc(name="Banking", priority=1000, blocking=true)
public abstract class E
extends Task {
    protected final /* synthetic */ t Y;
    protected final /* synthetic */ Client Z;
    protected final /* synthetic */ SquireZulrah aa;
    private static /* synthetic */ int[] lIllIlllllIII;
    protected final /* synthetic */ SquireZulrahConfig X;
    @Inject
    protected /* synthetic */ u ab;

    private static boolean llIIlIIllllIllI(int n2) {
        return n2 == 0;
    }

    public int af() {
        return lIllIlllllIII[1];
    }

    private static void llIIlIIllllIIll() {
        lIllIlllllIII = new int[2];
        E.lIllIlllllIII[0] = (0xCB ^ 0x99 ^ (0x66 ^ 0xA)) & (0xFC ^ 0x95 ^ (0x33 ^ 0x64) ^ -" ".length());
        E.lIllIlllllIII[1] = -" ".length();
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

    protected E(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        this.aa = squireZulrah;
        this.X = squireZulrahConfig;
        this.Z = client;
        this.Y = t2;
    }

    public boolean run() {
        E llllllllllllllIllIIIlIIIIIIlIllI;
        if (!E.llIIlIIllllIlII(this.X.bank() ? 1 : 0) || E.llIIlIIllllIlIl((Object)this.aa.a(), (Object)c.DONE)) {
            return lIllIlllllIII[0];
        }
        if (E.llIIlIIllllIlII(llllllllllllllIllIIIlIIIIIIlIllI.ad() ? 1 : 0)) {
            llllllllllllllIllIIIlIIIIIIlIllI.aa.a(llllllllllllllIllIIIlIIIIIIlIllI.ae().needsToBank());
        }
        if (E.llIIlIIllllIllI(llllllllllllllIllIIIlIIIIIIlIllI.aa.d() ? 1 : 0)) {
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

