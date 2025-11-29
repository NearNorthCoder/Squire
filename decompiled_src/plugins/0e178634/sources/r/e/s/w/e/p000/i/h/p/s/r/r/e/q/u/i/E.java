package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Hiding behind pillar", priority = 50, blocking = true, register = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.E  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/E.class */
public class E extends u {
    private static /* synthetic */ int[] lIlIlllIIIIll;
    private /* synthetic */ int ak;
    private static final /* synthetic */ int aj;

    private static boolean llIIIIIllllllII(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (llIIIIIllllllll(graphicsObjectCreated.getGraphicsObject().getId(), lIlIlllIIIIll[3])) {
            this.ak = this.j.getTickCount();
        }
    }

    private List<NPC> x() {
        int[] iArr = new int[lIlIlllIIIIll[2]];
        iArr[lIlIlllIIIIll[0]] = lIlIlllIIIIll[4];
        return NPCs.getAll(iArr);
    }

    private static boolean llIIIIIlllllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIlIIIIIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIIlIIIIIIII(int i, int i2) {
        return i > i2;
    }

    static {
        llIIIIIlllllIll();
        aj = lIlIlllIIIIll[4];
    }

    private static boolean llIIIIIllllllIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIllllllll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        List<NPC> x = x();
        if (llIIIIIllllllII(x.isEmpty() ? 1 : 0)) {
            return lIlIlllIIIIll[0];
        }
        NPC orElse = x.stream().filter(npc -> {
            if (llIIIIlIIIIIIIl(npc.isDead() ? 1 : 0)) {
                ?? r0 = lIlIlllIIIIll[2];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlllIIIIll[0];
        }).max(Comparator.comparingInt((v0) -> {
            return v0.getHealthRatio();
        })).orElse(null);
        if (llIIIIIllllllIl(orElse)) {
            return lIlIlllIIIIll[0];
        }
        NPC orElse2 = x.stream().filter(npc2 -> {
            if (llIIIIlIIIIIIIl(npc2.isDead() ? 1 : 0)) {
                ?? r0 = lIlIlllIIIIll[2];
                "".length();
                return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlllIIIIll[0];
        }).min(Comparator.comparingInt((v0) -> {
            return v0.getHealthRatio();
        }).thenComparingInt(actor -> {
            return actor.distanceTo(orElse);
        })).orElse(null);
        if (llIIIIIllllllIl(orElse2)) {
            return lIlIlllIIIIll[0];
        }
        NPC npc3 = orElse2;
        if (llIIIIIlllllllI(this.j.getTickCount() - this.ak, lIlIlllIIIIll[1])) {
            npc3 = x.stream().filter(npc4 -> {
                if (llIIIIlIIIIIIIl(npc4.isDead() ? 1 : 0)) {
                    ?? r0 = lIlIlllIIIIll[2];
                    "".length();
                    return ((true ^ true) & ((true ^ true) ^ true)) == (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlllIIIIll[0];
            }).filter(npc5 -> {
                if (llIIIIlIIIIIIII(npc5.getHealthRatio(), orElse2.getHealthRatio())) {
                    ?? r0 = lIlIlllIIIIll[2];
                    "".length();
                    return (-"  ".length()) >= 0 ? ((11 ^ 85) ^ (228 ^ 189)) & (((((46 + 170) - 59) + 34) ^ (((34 + 23) - 42) + 169)) ^ (-" ".length())) : r0;
                }
                return lIlIlllIIIIll[0];
            }).min(Comparator.comparingInt((v0) -> {
                return v0.getHealthRatio();
            }).thenComparingInt(actor2 -> {
                return actor2.distanceTo(orElse);
            })).orElse(orElse2);
        }
        WorldPoint dy = npc3.getWorldLocation().dy(lIlIlllIIIIll[1]);
        if (llIIIIIllllllII(Players.getLocal().getWorldLocation().equals(dy) ? 1 : 0)) {
            return lIlIlllIIIIll[2];
        }
        Movement.setDestination(dy);
        return lIlIlllIIIIll[2];
    }

    private static void llIIIIIlllllIll() {
        lIlIlllIIIIll = new int[5];
        lIlIlllIIIIll[0] = ((((87 + 160) - 102) + 40) ^ (((63 + 172) - 216) + 164)) & (((((14 + 144) - 5) + 13) ^ (((132 + 142) - 240) + 134)) ^ (-" ".length()));
        lIlIlllIIIIll[1] = "  ".length();
        lIlIlllIIIIll[2] = " ".length();
        lIlIlllIIIIll[3] = (-22021) & 24471;
        lIlIlllIIIIll[4] = (-((-7451) & 23903)) & (-11) & 28671;
    }
}
