package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Keep Back Akkha", register = true, priority = 100, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.au  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/au.class */
public class C0021au extends AbstractC0016ap {
    private /* synthetic */ int dj;
    private static /* synthetic */ int[] llIIIIlIIlI;

    private static boolean lIIlllIlIIlIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlllIlIIIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        int i;
        if (!lIIlllIlIIIlII(this.cW.keepBack() ? 1 : 0) && !lIIlllIlIIIllI(bu() ? 1 : 0)) {
            NPC J = J();
            if (lIIlllIlIIIlll(J)) {
                return llIIIIlIIlI[0];
            }
            Log.info((this.cu.getTickCount() - this.dj) + " since akkha attack");
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (lIIlllIlIIIlII(this.cu.getTickCount() - this.dj)) {
                i = llIIIIlIIlI[1];
                "".length();
                if ((((58 ^ 91) ^ (16 ^ 43)) & (((26 ^ 114) ^ (67 ^ 113)) ^ (-" ".length()))) == "   ".length()) {
                    return ((219 ^ 182) ^ (((69 + 79) - 134) + 113)) & (((22 ^ 106) ^ (39 ^ 73)) ^ (-" ".length()));
                }
            } else {
                i = llIIIIlIIlI[0];
            }
            boolean z = i;
            if (lIIlllIlIIIlII(J.getWorldArea().isInMeleeDistance(worldLocation) ? 1 : 0) && lIIlllIlIIIlII(z ? 1 : 0)) {
                return llIIIIlIIlI[0];
            }
            if (lIIlllIlIIlIII(this.cu.getTickCount() - this.dj, llIIIIlIIlI[2]) && lIIlllIlIIIlII(z ? 1 : 0)) {
                return llIIIIlIIlI[0];
            }
            if (!lIIlllIlIIlIIl(J.getId(), llIIIIlIIlI[3]) || lIIlllIlIIlIlI(J.getId(), llIIIIlIIlI[4])) {
                return llIIIIlIIlI[0];
            }
            WorldPoint worldPoint = (WorldPoint) worldLocation.createWorldArea(llIIIIlIIlI[1]).toWorldPointList().stream().filter(worldPoint2 -> {
                if (lIIlllIlIIIlII(worldPoint2.equals(worldLocation) ? 1 : 0)) {
                    ?? r0 = llIIIIlIIlI[1];
                    "".length();
                    return "  ".length() == (((81 ^ 108) ^ (201 ^ 161)) & (((149 ^ 146) ^ (201 ^ 155)) ^ (-" ".length()))) ? ((153 ^ 168) ^ (122 ^ 83)) & (((50 ^ 18) ^ (166 ^ 158)) ^ (-" ".length())) : r0;
                }
                return llIIIIlIIlI[0];
            }).filter(worldPoint3 -> {
                if (lIIlllIlIIIllI(z ? 1 : 0)) {
                    boolean isInMeleeDistance = J.getWorldArea().isInMeleeDistance(worldPoint3);
                    "".length();
                    return (-(160 ^ 164)) >= 0 ? "   ".length() & ("   ".length() ^ (-1)) : isInMeleeDistance;
                } else if (lIIlllIlIIllII(J.getWorldArea().distanceTo(worldPoint3), llIIIIlIIlI[1])) {
                    ?? r0 = llIIIIlIIlI[1];
                    "".length();
                    return (108 ^ 104) <= ((123 ^ 65) & ((124 ^ 70) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                } else {
                    return llIIIIlIIlI[0];
                }
            }).filter(worldPoint4 -> {
                return NPCs.getAll(npc -> {
                    return npc.getWorldLocation().equals(worldPoint4);
                }).isEmpty();
            }).filter(worldPoint5 -> {
                if (lIIlllIlIIIlII(J.getWorldArea().contains(worldPoint5) ? 1 : 0)) {
                    ?? r0 = llIIIIlIIlI[1];
                    "".length();
                    return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIIlIIlI[0];
            }).filter(Reachable::isWalkable).filter(worldPoint6 -> {
                if (!lIIlllIlIIlIIl(worldPoint6.getWorldX(), worldLocation.getWorldX()) || lIIlllIlIIlIlI(worldPoint6.getWorldY(), worldLocation.getWorldY())) {
                    ?? r0 = llIIIIlIIlI[1];
                    "".length();
                    return (-" ".length()) >= "  ".length() ? ((6 ^ 106) ^ (8 ^ 115)) & (((((193 + 45) - 228) + 201) ^ (((139 + 23) - 23) + 57)) ^ (-" ".length())) : r0;
                }
                return llIIIIlIIlI[0];
            }).min(Comparator.comparingInt(worldPoint7 -> {
                return worldPoint7.distanceTo(J.getWorldLocation());
            })).orElse(null);
            if (lIIlllIlIIIlll(worldPoint)) {
                return llIIIIlIIlI[0];
            }
            Movement.setDestination(worldPoint);
            sleep(llIIIIlIIlI[1]);
            return llIIIIlIIlI[1];
        }
        return llIIIIlIIlI[0];
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC J = J();
        if (lIIlllIlIIlIll(animationChanged.getActor(), J) || lIIlllIlIIlIlI(J.getAnimation(), llIIIIlIIlI[5])) {
            return;
        }
        this.dj = this.cu.getTickCount();
    }

    @Inject
    protected C0021au(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIIlllIlIIIlII(int i) {
        return i == 0;
    }

    private static boolean lIIlllIlIIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlllIlIIlIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlllIlIIlIII(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlllIlIIIIll();
    }

    private static boolean lIIlllIlIIIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllIlIIllII(int i, int i2) {
        return i > i2;
    }

    private static void lIIlllIlIIIIll() {
        llIIIIlIIlI = new int[6];
        llIIIIlIIlI[0] = ((89 ^ 82) ^ (9 ^ 65)) & (((151 ^ 177) ^ (246 ^ 147)) ^ (-" ".length()));
        llIIIIlIIlI[1] = " ".length();
        llIIIIlIIlI[2] = 46 ^ 42;
        llIIIIlIIlI[3] = (-((-9317) & 30181)) & (-33) & 32686;
        llIIIIlIIlI[4] = (-((-2847) & 7039)) & (-16513) & 32499;
        llIIIIlIIlI[5] = -" ".length();
    }
}
