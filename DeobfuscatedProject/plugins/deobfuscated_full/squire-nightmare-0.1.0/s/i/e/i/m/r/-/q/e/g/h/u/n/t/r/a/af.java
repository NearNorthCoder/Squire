/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

/* TASK: Attacking Nightmare -> AttackingnightmareTask */
@TaskDesc(name="Attacking Nightmare", priority=1)
public class af
extends al {
    private static final /* synthetic */ Logger dQ;
    private static /* synthetic */ int[] lllIllllIllI;
    protected final /* synthetic */ e dR;

    protected boolean ct() {
        int n2;
        if (af.lIIIlllIIlIIIII(this.cO ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cx() ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cw() ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cP ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cR ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cQ ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cM.T() ? 1 : 0) && af.lIIIlllIIlIIIIl(this.cM.at()) && af.lIIIlllIIlIIIII(this.cu() ? 1 : 0) && af.lIIIlllIIlIIlIl(this.cS.getAnimation(), lllIllllIllI[3]) && af.lIIIlllIIlIIlIl(this.cS.getId(), lllIllllIllI[4])) {
            n2 = lllIllllIllI[2];
            0;
            if ((0xC ^ 8) < 3) {
                return false;
            }
        } else {
            n2 = lllIllllIllI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlllIIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean cr() {
        af var2;
        if (af.lIIIlllIIlIIIII(this.cK.assistantMode() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIIl(var2.cs() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIlI(var2.cS.getId(), lllIllllIllI[1])) {
            if (af.lIIIlllIIlIIIII(var2.cu() ? 1 : 0)) {
                return var2.x(var2.cS);
            }
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIII(var2.ct() ? 1 : 0)) {
            return var2.x(var2.cS);
        }
        return lllIllllIllI[0];
    }

    private static boolean lIIIlllIIlIIIIl(int n2) {
        return n2 == 0;
    }

    protected boolean cs() {
        boolean bl;
        af var1;
        NPC nPC = SquireNightmarePlugin.d();
        if (af.lIIIlllIIlIIIll(nPC)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIIl(var1.cu() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIII(var1.cw() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIII(var1.cx() ? 1 : 0)) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIlII(var1.cM.at())) {
            return lllIllllIllI[0];
        }
        if (af.lIIIlllIIlIIIIl(var1.cM.aq() ? 1 : 0)) {
            bl = lllIllllIllI[2];
            0;
            if (1 == ((0x33 ^ 0x72) & ~(0x5D ^ 0x1C))) {
                return false;
            }
        } else {
            bl = lllIllllIllI[0];
        }
        return bl;
    }

    @Override
    public EquipmentSetup cq() {
        return ((BankLoadout)this.cK.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
    }

    static {
        af.lIIIlllIIIlllll();
        dQ = LoggerFactory.getLogger(af.class);
    }

    private static void lIIIlllIIIlllll() {
        lllIllllIllI = new int[5];
        af.lllIllllIllI[0] = (0x81 ^ 0x8B) & ~(9 ^ 3);
        af.lllIllllIllI[1] = -(0xFFFFDFEF & 0x7435) & (0xFFFFFFF6 & 0x7FBF);
        af.lllIllllIllI[2] = 1;
        af.lllIllllIllI[3] = -(0xFFFFDFDF & 0x3A63) & (0xFFFFFFDF & 0x3BFE);
        af.lllIllllIllI[4] = 0xFFFFB5EF & 0x6EDE;
    }

    private static boolean lIIIlllIIlIIlII(int n2) {
        return n2 > 0;
    }

    @Inject
    public af(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
        this.dR = e2;
    }

    private static boolean lIIIlllIIlIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIIlIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }
}

