package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Runnin up on a Totem", priority = 1)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.am  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/am.class */
public class am extends al {
    private static final /* synthetic */ Logger ed;
    private static /* synthetic */ int[] llllIllIIIII;

    private static boolean lIIlIIIlIlIIIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public boolean cr() {
        return llllIllIIIII[0];
    }

    private static boolean lIIlIIIlIIlllIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIlIIllllI(int i) {
        return i > 0;
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public EquipmentSetup cq() {
        return (EquipmentSetup) this.cK.totemGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIIIlIlIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIlIlIIIIl(Object obj) {
        return obj == null;
    }

    @Inject
    protected am(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0009f);
    }

    private static boolean lIIlIIIlIlIIIII(int i) {
        return i != 0;
    }

    static {
        lIIlIIIlIIlllII();
        ed = LoggerFactory.getLogger(am.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al, s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        int i;
        int i2;
        if (!lIIlIIIlIIlllIl(cu() ? 1 : 0) && !lIIlIIIlIIllllI(this.cM.at()) && !lIIlIIIlIIlllIl(C0008e.ax().isEmpty() ? 1 : 0)) {
            if (lIIlIIIlIIlllll(this.cJ.aX())) {
                i = llllIllIIIII[1];
                "".length();
                if ((-(179 ^ 183)) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i = llllIllIIIII[0];
            }
            if (lIIlIIIlIlIIIII(i)) {
                return llllIllIIIII[0];
            }
            if (lIIlIIIlIIlllll(this.cJ.aY())) {
                i2 = llllIllIIIII[1];
                "".length();
                if (0 != 0) {
                    return ((114 ^ 92) ^ (151 ^ 179)) & (((1 ^ 22) ^ (140 ^ 145)) ^ (-" ".length()));
                }
            } else {
                i2 = llllIllIIIII[0];
            }
            int lllllllllllllllIIlIllIIIlIllIllI = i2;
            if (lIIlIIIlIlIIIII(lllllllllllllllIIlIllIIIlIllIllI)) {
                return llllIllIIIII[0];
            }
            Player local = Players.getLocal();
            if (lIIlIIIlIlIIIIl(local.getInteracting())) {
                return llllIllIIIII[0];
            }
            List all = NPCs.getAll(npc -> {
                if (lIIlIIIlIlIIIII(SquireNightmarePlugin.q.contains(Integer.valueOf(npc.getId())) ? 1 : 0) && lIIlIIIlIlIIIII(this.cM.ag.containsKey(Integer.valueOf(npc.getId())) ? 1 : 0) && lIIlIIIlIlIIIll(this.cM.ag.get(Integer.valueOf(npc.getId())).intValue(), llllIllIIIII[4])) {
                    ?? r0 = llllIllIIIII[1];
                    "".length();
                    return (-" ".length()) > ((((34 + 93) - (-41)) + 8) ^ (((73 + 15) - 45) + 137)) ? ((((29 + 162) - 111) + 152) ^ (((173 + 71) - 161) + 91)) & (((((64 + 63) - 112) + 231) ^ (((174 + 79) - 121) + 44)) ^ (-" ".length())) : r0;
                }
                return llllIllIIIII[0];
            });
            if (!lIIlIIIlIlIIIII(all.isEmpty() ? 1 : 0) && !lIIlIIIlIlIIIlI(all.size(), llllIllIIIII[1])) {
                RectangularArea ay = C0008e.ay();
                NPC npc2 = (NPC) all.get(llllIllIIIII[0]);
                if (lIIlIIIlIIlllll(ay) && lIIlIIIlIIlllIl(ay.contains(npc2.getWorldLocation()) ? 1 : 0)) {
                    return llllIllIIIII[0];
                }
                WorldArea worldArea = npc2.getWorldLocation().toWorldArea(llllIllIIIII[2], llllIllIIIII[2]);
                if (lIIlIIIlIlIIIlI(npc2.getWorldArea().distanceTo(local), llllIllIIIII[3])) {
                    Movement.setDestination(worldArea.getCenter());
                    return llllIllIIIII[1];
                }
                return llllIllIIIII[0];
            }
            return llllIllIIIII[0];
        }
        return llllIllIIIII[0];
    }

    private static boolean lIIlIIIlIIlllll(Object obj) {
        return obj != null;
    }

    private static void lIIlIIIlIIlllII() {
        llllIllIIIII = new int[5];
        llllIllIIIII[0] = (67 ^ 77) & ((0 ^ 14) ^ (-1));
        llllIllIIIII[1] = " ".length();
        llllIllIIIII[2] = "   ".length();
        llllIllIIIII[3] = 26 ^ 30;
        llllIllIIIII[4] = ((52 + 153) - 58) + 53;
    }
}
