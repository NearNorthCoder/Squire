/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Handling Elidinis P3 Prayers", priority=0x7FFFFFFF, register=true)
public class I
extends z {
    private static /* synthetic */ int[] lIlIIIIIlIllI;
    private /* synthetic */ Prayer ba;

    private static boolean lIllIllIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public I(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = null;
    }

    private static boolean lIllIllIIIlllll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void llllllllllllllIlllIIllIIIIlIIlll;
        Actor actor = animationChanged.getActor();
        if (I.lIllIllIIIlllIl(actor instanceof Player)) {
            return;
        }
        if (I.lIllIllIIIllllI(llllllllllllllIlllIIllIIIIlIIlll.getAnimation(), lIlIIIIIlIllI[6])) {
            Prayer prayer;
            I llllllllllllllIlllIIllIIIIlIlIIl;
            if (I.lIllIllIIIlllll(llllllllllllllIlllIIllIIIIlIlIIl.ba, Prayer.PROTECT_FROM_MISSILES)) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            llllllllllllllIlllIIllIIIIlIlIIl.ba = prayer;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } else if (I.lIllIllIIIllllI(llllllllllllllIlllIIllIIIIlIIlll.getAnimation(), lIlIIIIIlIllI[7])) {
            llllllllllllllIlllIIllIIIIlIlIIl.ba = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        } else if (I.lIllIllIIIllllI(llllllllllllllIlllIIllIIIIlIIlll.getAnimation(), lIlIIIIIlIllI[8])) {
            llllllllllllllIlllIIllIIIIlIlIIl.ba = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    @Override
    public int F() {
        return lIlIIIIIlIllI[0];
    }

    static {
        I.lIllIllIIIllIll();
    }

    @Override
    public List<Prayer> E() {
        if (I.lIllIllIIIlllII(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (I.lIllIllIIIllllI(nPC.getId(), lIlIIIIIlIllI[9])) {
            this.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static void lIllIllIIIllIll() {
        lIlIIIIIlIllI = new int[10];
        I.lIlIIIIIlIllI[0] = -(0xFFFFC5DB & 0x7A27) & (0xFFFFFDF6 & 0x7F5B);
        I.lIlIIIIIlIllI[1] = "  ".length();
        I.lIlIIIIIlIllI[2] = (0x55 ^ 0x4D) & ~(0x1C ^ 4);
        I.lIlIIIIIlIllI[3] = -(0xFFFFBA0D & 0x57FF) & (0xFFFFFFFF & 0x3FFD);
        I.lIlIIIIIlIllI[4] = " ".length();
        I.lIlIIIIIlIllI[5] = 0xFFFFEFFF & 0x3DF3;
        I.lIlIIIIIlIllI[6] = -(0xFFFFF4A9 & 0x4BD7) & (0xFFFFF7F5 & 0x6EBB);
        I.lIlIIIIIlIllI[7] = -(0xFFFFE359 & 0x5DF7) & (0xFFFFF77E & 0x6FFD);
        I.lIlIIIIIlIllI[8] = 0xFFFFBFBE & 0x666F;
        I.lIlIIIIIlIllI[9] = -(0xFFFFFF7F & 0x519B) & (0xFFFFFFBF & 0x7F5B);
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIlIIIIIlIllI[1]];
        nArray[I.lIlIIIIIlIllI[2]] = lIlIIIIIlIllI[3];
        nArray[I.lIlIIIIIlIllI[4]] = lIlIIIIIlIllI[5];
        return this.aS.a(nArray);
    }

    @Override
    public n J() {
        return this.aT.prayFlickLastWarden();
    }

    private static boolean lIllIllIIIlllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIIIlllII(Object object) {
        return object == null;
    }

    @Override
    public boolean I() {
        return this.C();
    }
}

