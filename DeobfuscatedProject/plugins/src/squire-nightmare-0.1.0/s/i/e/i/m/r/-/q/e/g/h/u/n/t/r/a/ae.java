/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
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
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Attacking Husk", priority=0x7FFFFFF4, blocking=true)
public class ae
extends al {
    private static final /* synthetic */ Logger dP;
    private static /* synthetic */ int[] llllIIIllIlI;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var3_3;
        NPC nPC2;
        ae lllllllllllllllIIlIllllllIlIIlll;
        if (ae.lIIIllllIIlIllI(this.cK.assistantMode() ? 1 : 0)) {
            return llllIIIllIlI[0];
        }
        NPC lllllllllllllllIIlIllllllIlIIllI = NPCs.getNearest(nPC -> {
            int n2;
            if (ae.lIIIllllIIllIlI(nPC.isDead() ? 1 : 0) && (!ae.lIIIllllIIllIll(nPC.getId(), llllIIIllIlI[5]) || ae.lIIIllllIIlIlll(nPC.getId(), llllIIIllIlI[6]))) {
                n2 = llllIIIllIlI[4];
                "".length();
                if ("  ".length() < 0) {
                    return ((0 ^ 0x31) & ~(0xA9 ^ 0x98)) != 0;
                }
            } else {
                n2 = llllIIIllIlI[0];
            }
            return n2 != 0;
        });
        NPC lllllllllllllllIIlIllllllIlIIlIl = NPCs.getNearest(nPC -> {
            int n2;
            if (ae.lIIIllllIIllIlI(nPC.isDead() ? 1 : 0) && (!ae.lIIIllllIIllIll(nPC.getId(), llllIIIllIlI[2]) || ae.lIIIllllIIlIlll(nPC.getId(), llllIIIllIlI[3]))) {
                n2 = llllIIIllIlI[4];
                "".length();
                if (" ".length() <= 0) {
                    return ((0x24 ^ 0x2C) & ~(0x25 ^ 0x2D)) != 0;
                }
            } else {
                n2 = llllIIIllIlI[0];
            }
            return n2 != 0;
        });
        NPC lllllllllllllllIIlIllllllIlIIlII = null;
        if (ae.lIIIllllIIlIlll(lllllllllllllllIIlIllllllIlIIlll.cM.Q(), llllIIIllIlI[1])) {
            NPC nPC3;
            if (ae.lIIIllllIIllIII(lllllllllllllllIIlIllllllIlIIlIl)) {
                nPC3 = lllllllllllllllIIlIllllllIlIIlIl;
                "".length();
                if ("   ".length() == 0) {
                    return ((148 + 137 - 246 + 141 ^ 20 + 96 - 43 + 112) & (95 + 129 - 135 + 96 ^ 72 + 26 - 45 + 127 ^ -" ".length())) != 0;
                }
            } else {
                nPC3 = lllllllllllllllIIlIllllllIlIIllI;
            }
            lllllllllllllllIIlIllllllIlIIlII = nPC3;
            "".length();
            if (null != null) {
                return ((0x1E ^ 0x21) & ~(0x5B ^ 0x64)) != 0;
            }
        } else if (ae.lIIIllllIIllIII(lllllllllllllllIIlIllllllIlIIllI)) {
            nPC2 = lllllllllllllllIIlIllllllIlIIllI;
            "".length();
            if (((0xEF ^ 0xB2) & ~(0xD4 ^ 0x89)) > " ".length()) {
                return ((0xA4 ^ 0xBA) & ~(0x37 ^ 0x29)) != 0;
            }
        } else {
            nPC2 = lllllllllllllllIIlIllllllIlIIlII = lllllllllllllllIIlIllllllIlIIlIl;
        }
        if (ae.lIIIllllIIllIIl(lllllllllllllllIIlIllllllIlIIlII)) {
            return llllIIIllIlI[0];
        }
        return this.x((NPC)var3_3);
    }

    @Inject
    protected ae(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIIllllIIllIII(Object object) {
        return object != null;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.huskGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIIllllIIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIllllIIllIIl(Object object) {
        return object == null;
    }

    private static void lIIIllllIIlIlIl() {
        llllIIIllIlI = new int[7];
        ae.llllIIIllIlI[0] = (0xE ^ 0x3C) & ~(1 ^ 0x33);
        ae.llllIIIllIlI[1] = 0x7F ^ 0x7B;
        ae.llllIIIllIlI[2] = 0xFFFFBDFE & 0x66EF;
        ae.llllIIIllIlI[3] = -(0xFFFFBB5E & 0x57A7) & (0xFFFFBFFF & 0x77FF);
        ae.llllIIIllIlI[4] = " ".length();
        ae.llllIIIllIlI[5] = 0xFFFFB6FF & 0x6DEF;
        ae.llllIIIllIlI[6] = -(0x23 ^ 0x26) & (0xFFFFE5FF & 0x3EFF);
    }

    static {
        ae.lIIIllllIIlIlIl();
        dP = LoggerFactory.getLogger(ae.class);
    }

    private static boolean lIIIllllIIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllIIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllllIIlIllI(int n2) {
        return n2 != 0;
    }
}

