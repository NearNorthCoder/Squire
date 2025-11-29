/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b;

@TaskDesc(name="Traversing to Turael", blocking=true)
public class n
extends Task {
    private final /* synthetic */ SquireSkipperPlugin K;
    private static /* synthetic */ int[] lIlIIlIlIlIII;
    private final /* synthetic */ SquireSkipperConfig L;

    static {
        n.lIlllIllIIIlIlI();
    }

    @Inject
    public n(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.K = squireSkipperPlugin;
        this.L = squireSkipperConfig;
    }

    private static boolean lIlllIllIIIllII(int n2) {
        return n2 == 0;
    }

    private static void lIlllIllIIIlIlI() {
        lIlIIlIlIlIII = new int[5];
        n.lIlIIlIlIlIII[0] = (9 ^ 0x39) & ~(0x5B ^ 0x6B);
        n.lIlIIlIlIlIII[1] = " ".length();
        n.lIlIIlIlIlIII[2] = -(0xFFFFF3CF & 0x4E37) & (0xFFFFFF7F & 0x76FF);
        n.lIlIIlIlIlIII[3] = 0xFFFFDF77 & 0x2BFA;
        n.lIlIIlIlIlIII[4] = 0xFFFFFFFE & 0xDD1;
    }

    private static boolean lIlllIllIIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIllIIIllIl(Object object) {
        return object == null;
    }

    public boolean run() {
        n llllllllllllllIllIlllIIIlllIIIIl;
        if (n.lIlllIllIIIlIll(this.K.h() ? 1 : 0)) {
            return lIlIIlIlIlIII[0];
        }
        if (n.lIlllIllIIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIlIlIII[0];
        }
        b llllllllllllllIllIlllIIIlllIIIII = llllllllllllllIllIlllIIIlllIIIIl.K.b();
        if (n.lIlllIllIIIllIl((Object)llllllllllllllIllIlllIIIlllIIIII)) {
            int[] nArray = new int[lIlIIlIlIlIII[1]];
            nArray[n.lIlIIlIlIlIII[0]] = lIlIIlIlIlIII[2];
            NPC llllllllllllllIllIlllIIIllIlllll = NPCs.getNearest((int[])nArray);
            if (n.lIlllIllIIIllIl(llllllllllllllIllIlllIIIllIlllll)) {
                Movement.walkTo((WorldPoint)new WorldPoint(lIlIIlIlIlIII[3], lIlIIlIlIlIII[4], lIlIIlIlIlIII[0]));
                "".length();
                return lIlIIlIlIlIII[1];
            }
        }
        return lIlIIlIlIlIII[0];
    }
}

