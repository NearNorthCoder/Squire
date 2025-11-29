/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

@TaskDesc(name="Drinking boost", priority=10000)
public class x
extends a {
    private static /* synthetic */ int[] lIlIIlllllllI;

    @Inject
    protected x(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static void lIllllIIllIIIlI() {
        lIlIIlllllllI = new int[1];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.x.lIlIIlllllllI[0] = 0x25 ^ 0x17;
    }

    @Override
    public boolean l() {
        return Combat.drinkBoostingPotion((int)lIlIIlllllllI[0]);
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.x.lIllllIIllIIIlI();
    }
}

