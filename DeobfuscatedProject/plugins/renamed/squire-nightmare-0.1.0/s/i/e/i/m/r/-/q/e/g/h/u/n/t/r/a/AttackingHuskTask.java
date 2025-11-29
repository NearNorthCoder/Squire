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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j_Unknown;

/* TASK: Attacking Husk -> AttackinghuskTask */
@TaskDesc(name="Attacking Husk", priority=0x7FFFFFF4, blocking=true)
public class AttackingHuskTask
extends al_Unknown {
    private static final /* synthetic */ Logger dP;
    private static /* synthetic */ int[] llllIIIllIlI;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var3_3;
        NPC nPC2;
        ae var1;
        if (ae.lIIIllllIIlIllI(this.cK.assistantMode() ? 1 : 0)) {
            return llllIIIllIlI[0];
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (ae.lIIIllllIIllIlI(nPC.isDead() ? 1 : 0) && (!ae.lIIIllllIIllIll(nPC.getId(), llllIIIllIlI[5]) || ae.lIIIllllIIlIlll(nPC.getId(), llllIIIllIlI[6]))) {
                n2 = llllIIIllIlI[4];
                0;
                if (2 < 0) {
                    return false;
                }
            } else {
                n2 = llllIIIllIlI[0];
            }
            return n2 != 0;
        });
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if (ae.lIIIllllIIllIlI(nPC.isDead() ? 1 : 0) && (!ae.lIIIllllIIllIll(nPC.getId(), llllIIIllIlI[2]) || ae.lIIIllllIIlIlll(nPC.getId(), llllIIIllIlI[3]))) {
                n2 = llllIIIllIlI[4];
                0;
                if (1 <= 0) {
                    return false;
                }
            } else {
                n2 = llllIIIllIlI[0];
            }
            return n2 != 0;
        });
        NPC var3 = null;
        if (ae.lIIIllllIIlIlll(var1.cM.Q(), llllIIIllIlI[1])) {
            NPC nPC3;
            if (ae.lIIIllllIIllIII(var4)) {
                nPC3 = var4;
                0;
                if (3 == 0) {
                    return false;
                }
            } else {
                nPC3 = var2;
            }
            var3 = nPC3;
            0;
            
            }
        } else if (ae.lIIIllllIIllIII(var2)) {
            nPC2 = var2;
            0;
            if (((0xEF ^ 0xB2) & ~(0xD4 ^ 0x89)) > 1) {
                return false;
            }
        } else {
            nPC2 = var3 = var4;
        }
        if (ae.lIIIllllIIllIIl(var3)) {
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
        ae.llllIIIllIlI[4] = 1;
        ae.llllIIIllIlI[5] = 0xFFFFB6FF & 0x6DEF;
        ae.llllIIIllIlI[6] = -(0x23 ^ 0x26) & (0xFFFFE5FF & 0x3EFF);
    }

    static {
        ae.lIIIllllIIlIlIl();
        dP = LoggerFactory.getLogger(AttackingHuskTask.class);
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

