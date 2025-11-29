/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

public abstract class am
extends Task {
    private static /* synthetic */ int[] lIlllIIIIIIII;
    @Inject
    private /* synthetic */ u ab;
    private static final /* synthetic */ int aI;
    protected final /* synthetic */ SquireZulrahConfig aJ;
    private final /* synthetic */ Client aK;
    @Inject
    protected /* synthetic */ SquireZulrah E;

    public abstract boolean ac();

    protected am(Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aK = client;
        this.aJ = squireZulrahConfig;
    }

    static {
        am.llIIlIlIIIlIIlI();
        aI = lIlllIIIIIIII[1];
    }

    private static boolean llIIlIlIIIlIlII(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        am llllllllllllllIllIIIIlllIIllIllI;
        if (am.llIIlIlIIIlIIll(this.aK.isInInstancedRegion() ? 1 : 0)) {
            return lIlllIIIIIIII[0];
        }
        if (am.llIIlIlIIIlIIll(llllllllllllllIllIIIIlllIIllIllI.E.d() ? 1 : 0)) {
            return lIlllIIIIIIII[0];
        }
        if (am.llIIlIlIIIlIlII(llllllllllllllIllIIIIlllIIllIllI.ab.h(lIlllIIIIIIII[1]) ? 1 : 0)) {
            return lIlllIIIIIIII[0];
        }
        return this.ac();
    }

    private static void llIIlIlIIIlIIlI() {
        lIlllIIIIIIII = new int[2];
        am.lIlllIIIIIIII[0] = (0x17 ^ 0x34 ^ (0x29 ^ 7)) & (0xED ^ 0xB8 ^ (0x62 ^ 0x3A) ^ -" ".length());
        am.lIlllIIIIIIII[1] = -(0xFFFFCF9B & 0x7575) & (0xFFFFEF3F & 0x77FF);
    }

    private static boolean llIIlIlIIIlIIll(int n2) {
        return n2 != 0;
    }
}

