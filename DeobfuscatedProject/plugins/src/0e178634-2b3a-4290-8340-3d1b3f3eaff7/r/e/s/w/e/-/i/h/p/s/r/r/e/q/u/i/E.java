/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

@TaskDesc(name="Hiding behind pillar", priority=50, blocking=true, register=true)
public class E
extends u {
    private static /* synthetic */ int[] lIlIlllIIIIll;
    private /* synthetic */ int ak;
    private static final /* synthetic */ int aj;

    private static boolean llIIIIIllllllII(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (E.llIIIIIllllllll(graphicsObjectCreated.getGraphicsObject().getId(), lIlIlllIIIIll[3])) {
            this.ak = this.j.getTickCount();
        }
    }

    private List<NPC> x() {
        int[] nArray = new int[lIlIlllIIIIll[2]];
        nArray[E.lIlIlllIIIIll[0]] = lIlIlllIIIIll[4];
        return NPCs.getAll((int[])nArray);
    }

    private static boolean llIIIIIlllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIlIIIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        E.llIIIIIlllllIll();
        aj = lIlIlllIIIIll[4];
    }

    private static boolean llIIIIIllllllIl(Object object) {
        return object == null;
    }

    private static boolean llIIIIIllllllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var5_5;
        E llllllllllllllIllIlIIIIlIIIIlIlI;
        void llllllllllllllIllIlIIIIlIIIIlIIl;
        List<NPC> list = this.x();
        if (E.llIIIIIllllllII(list.isEmpty() ? 1 : 0)) {
            return lIlIlllIIIIll[0];
        }
        NPC llllllllllllllIllIlIIIIlIIIIlIII = llllllllllllllIllIlIIIIlIIIIlIIl.stream().filter(nPC -> {
            boolean bl;
            if (E.llIIIIlIIIIIIIl(nPC.isDead() ? 1 : 0)) {
                bl = lIlIlllIIIIll[2];
                "".length();
                if (((0xDF ^ 0x98) & ~(0x10 ^ 0x57)) != 0) {
                    return ((0x47 ^ 0x5A) & ~(0x54 ^ 0x49)) != 0;
                }
            } else {
                bl = lIlIlllIIIIll[0];
            }
            return bl;
        }).max(Comparator.comparingInt(Actor::getHealthRatio)).orElse(null);
        if (E.llIIIIIllllllIl(llllllllllllllIllIlIIIIlIIIIlIII)) {
            return lIlIlllIIIIll[0];
        }
        NPC llllllllllllllIllIlIIIIlIIIIIlll = llllllllllllllIllIlIIIIlIIIIlIIl.stream().filter(nPC -> {
            boolean bl;
            if (E.llIIIIlIIIIIIIl(nPC.isDead() ? 1 : 0)) {
                bl = lIlIlllIIIIll[2];
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return ((0x5C ^ 0x40) & ~(0x16 ^ 0xA)) != 0;
                }
            } else {
                bl = lIlIlllIIIIll[0];
            }
            return bl;
        }).min(Comparator.comparingInt(Actor::getHealthRatio).thenComparingInt(actor -> actor.distanceTo((Locatable)llllllllllllllIllIlIIIIlIIIIlIII))).orElse(null);
        if (E.llIIIIIllllllIl(llllllllllllllIllIlIIIIlIIIIIlll)) {
            return lIlIlllIIIIll[0];
        }
        NPC llllllllllllllIllIlIIIIlIIIIIllI = llllllllllllllIllIlIIIIlIIIIIlll;
        if (E.llIIIIIlllllllI(llllllllllllllIllIlIIIIlIIIIlIlI.j.getTickCount() - llllllllllllllIllIlIIIIlIIIIlIlI.ak, lIlIlllIIIIll[1])) {
            llllllllllllllIllIlIIIIlIIIIIllI = (NPC)llllllllllllllIllIlIIIIlIIIIlIIl.stream().filter(nPC -> {
                boolean bl;
                if (E.llIIIIlIIIIIIIl(nPC.isDead() ? 1 : 0)) {
                    bl = lIlIlllIIIIll[2];
                    "".length();
                    if (((0x13 ^ 0x5E) & ~(0xD6 ^ 0x9B)) == (0x35 ^ 0x31)) {
                        return ((0x7D ^ 0x70) & ~(4 ^ 9)) != 0;
                    }
                } else {
                    bl = lIlIlllIIIIll[0];
                }
                return bl;
            }).filter(nPC2 -> {
                boolean bl;
                if (E.llIIIIlIIIIIIII(nPC2.getHealthRatio(), llllllllllllllIllIlIIIIlIIIIIlll.getHealthRatio())) {
                    bl = lIlIlllIIIIll[2];
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((0xB ^ 0x55 ^ (0xE4 ^ 0xBD)) & (46 + 170 - 59 + 34 ^ 34 + 23 - 42 + 169 ^ -" ".length())) != 0;
                    }
                } else {
                    bl = lIlIlllIIIIll[0];
                }
                return bl;
            }).min(Comparator.comparingInt(Actor::getHealthRatio).thenComparingInt(actor -> actor.distanceTo((Locatable)llllllllllllllIllIlIIIIlIIIIlIII))).orElse((Actor)llllllllllllllIllIlIIIIlIIIIIlll);
        }
        WorldPoint llllllllllllllIllIlIIIIlIIIIIlIl = llllllllllllllIllIlIIIIlIIIIIllI.getWorldLocation().dy(lIlIlllIIIIll[1]);
        if (E.llIIIIIllllllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIllIlIIIIlIIIIIlIl) ? 1 : 0)) {
            return lIlIlllIIIIll[2];
        }
        Movement.setDestination((WorldPoint)var5_5);
        return lIlIlllIIIIll[2];
    }

    private static void llIIIIIlllllIll() {
        lIlIlllIIIIll = new int[5];
        E.lIlIlllIIIIll[0] = (87 + 160 - 102 + 40 ^ 63 + 172 - 216 + 164) & (14 + 144 - 5 + 13 ^ 132 + 142 - 240 + 134 ^ -" ".length());
        E.lIlIlllIIIIll[1] = "  ".length();
        E.lIlIlllIIIIll[2] = " ".length();
        E.lIlIlllIIIIll[3] = 0xFFFFA9FB & 0x5F97;
        E.lIlIlllIIIIll[4] = -(0xFFFFE2E5 & 0x5D5F) & (0xFFFFFFF5 & 0x6FFF);
    }
}

