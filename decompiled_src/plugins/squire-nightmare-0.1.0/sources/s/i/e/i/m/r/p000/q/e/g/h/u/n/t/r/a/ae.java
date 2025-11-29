package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

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
@TaskDesc(name = "Attacking Husk", priority = 2147483636, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ae  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ae.class */
public class ae extends al {
    private static final /* synthetic */ Logger dP;
    private static /* synthetic */ int[] llllIIIllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public boolean cr() {
        NPC npc;
        NPC npc2;
        NPC npc3;
        if (lIIIllllIIlIllI(this.cK.assistantMode() ? 1 : 0)) {
            return llllIIIllIlI[0];
        }
        NPC nearest = NPCs.getNearest(npc4 -> {
            if (!lIIIllllIIllIlI(npc4.isDead() ? 1 : 0) || (lIIIllllIIllIll(npc4.getId(), llllIIIllIlI[5]) && !lIIIllllIIlIlll(npc4.getId(), llllIIIllIlI[6]))) {
                return llllIIIllIlI[0];
            }
            ?? r0 = llllIIIllIlI[4];
            "".length();
            return "  ".length() < 0 ? (false ^ true) & ((true ^ true) ^ true) : r0;
        });
        NPC nearest2 = NPCs.getNearest(npc5 -> {
            if (!lIIIllllIIllIlI(npc5.isDead() ? 1 : 0) || (lIIIllllIIllIll(npc5.getId(), llllIIIllIlI[2]) && !lIIIllllIIlIlll(npc5.getId(), llllIIIllIlI[3]))) {
                return llllIIIllIlI[0];
            }
            ?? r0 = llllIIIllIlI[4];
            "".length();
            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
        if (lIIIllllIIlIlll(this.cM.Q(), llllIIIllIlI[1])) {
            if (lIIIllllIIllIII(nearest2)) {
                npc3 = nearest2;
                "".length();
                if ("   ".length() == 0) {
                    return ((((148 + 137) - 246) + 141) ^ (((20 + 96) - 43) + 112)) & (((((95 + 129) - 135) + 96) ^ (((72 + 26) - 45) + 127)) ^ (-" ".length()));
                }
            } else {
                npc3 = nearest;
            }
            npc2 = npc3;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            if (lIIIllllIIllIII(nearest)) {
                npc = nearest;
                "".length();
                if (((239 ^ 178) & ((212 ^ 137) ^ (-1))) > " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                npc = nearest2;
            }
            npc2 = npc;
        }
        return lIIIllllIIllIIl(npc2) ? llllIIIllIlI[0] : x(npc2);
    }

    @Inject
    protected ae(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0009f);
    }

    private static boolean lIIIllllIIllIII(Object obj) {
        return obj != null;
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public EquipmentSetup cq() {
        return (EquipmentSetup) this.cK.huskGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIIllllIIllIll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIllllIIllIIl(Object obj) {
        return obj == null;
    }

    private static void lIIIllllIIlIlIl() {
        llllIIIllIlI = new int[7];
        llllIIIllIlI[0] = (14 ^ 60) & ((1 ^ 51) ^ (-1));
        llllIIIllIlI[1] = 127 ^ 123;
        llllIIIllIlI[2] = (-16898) & 26351;
        llllIIIllIlI[3] = (-((-17570) & 22439)) & (-16385) & 30719;
        llllIIIllIlI[4] = " ".length();
        llllIIIllIlI[5] = (-18689) & 28143;
        llllIIIllIlI[6] = (-(35 ^ 38)) & (-6657) & 16127;
    }

    static {
        lIIIllllIIlIlIl();
        dP = LoggerFactory.getLogger(ae.class);
    }

    private static boolean lIIIllllIIllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIIllllIIlIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllllIIlIllI(int i) {
        return i != 0;
    }
}
