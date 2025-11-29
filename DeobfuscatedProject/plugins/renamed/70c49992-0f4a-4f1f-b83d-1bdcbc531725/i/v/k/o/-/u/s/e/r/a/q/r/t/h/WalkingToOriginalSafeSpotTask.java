/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w_Unknown;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

/* TASK: Walking to original safe spot -> WalkingtooriginalsafespotTask */
@TaskDesc(name="Walking to original safe spot", priority=25, blocking=true)
public class WalkingToOriginalSafeSpotTask
extends w_Unknown {
    private static final /* synthetic */ int cm;
    private static /* synthetic */ int[] lIlIlIllIIIll;

    @Inject
    protected D(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean lIlllllllIIIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        D var1;
        void var2;
        int[] nArray = new int[lIlIlIllIIIll[0]];
        nArray[D.lIlIlIllIIIll[1]] = lIlIlIllIIIll[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (D.lIlllllllIIIIlI(nPC)) {
            return lIlIlIllIIIll[1];
        }
        WorldPoint var3 = var2.getWorldArea().getCenter().dy(lIlIlIllIIIll[3]);
        if (D.lIlllllllIIIIll(var1.l.q().equals((Object)var3) ? 1 : 0)) {
            return lIlIlIllIIIll[1];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return lIlIlIllIIIll[0];
    }

    private static boolean lIlllllllIIIIll(int n2) {
        return n2 != 0;
    }

    private static void lIlllllllIIIIIl() {
        lIlIlIllIIIll = new int[4];
        D.lIlIlIllIIIll[0] = 1;
        D.lIlIlIllIIIll[1] = (0x90 ^ 0x8A) & ~(0x45 ^ 0x5F);
        D.lIlIlIllIIIll[2] = 0xFFFF9FFE & 0x7F7B;
        D.lIlIlIllIIIll[3] = -(0xC ^ 0xA);
    }

    static {
        D.lIlllllllIIIIIl();
        cm = lIlIlIllIIIll[2];
    }
}

