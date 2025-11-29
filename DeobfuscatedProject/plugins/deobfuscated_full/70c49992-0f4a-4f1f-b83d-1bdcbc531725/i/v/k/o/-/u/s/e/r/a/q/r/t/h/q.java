/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.WorldLocation
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.movement.Movement
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import com.openosrs.client.game.WorldLocation;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.o;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;

/* TASK: Walking to bank -> WalkToBankTask */
@TaskDesc(name="Walking to bank", priority=79)
public class q
extends o {
    private static /* synthetic */ int[] lIlIlIlllIIll;

    @Override
    public boolean run() {
        q var1;
        if (q.lIllllllllIIlIl(this.S() ? 1 : 0)) {
            return lIlIlIlllIIll[0];
        }
        if (q.lIllllllllIIllI(var1.bU.c() ? 1 : 0)) {
            return lIlIlIlllIIll[0];
        }
        if (q.lIllllllllIIlIl(var1.R() ? 1 : 0)) {
            return lIlIlIlllIIll[0];
        }
        if (q.lIllllllllIIlIl(House.isInside() ? 1 : 0) && q.lIllllllllIIlll(House.getJewelryBox())) {
            return lIlIlIlllIIll[0];
        }
        if (q.lIllllllllIIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIlIlllIIll[1];
        }
        Movement.walkTo((WorldPoint)WorldLocation.FEROX_ENCLAVE.getWorldArea().getCenter());
        0;
        return lIlIlIlllIIll[1];
    }

    private static boolean lIllllllllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllllIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllllIIlll(Object object) {
        return object != null;
    }

    @Inject
    protected q(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        q.lIllllllllIIlII();
    }

    private static void lIllllllllIIlII() {
        lIlIlIlllIIll = new int[2];
        q.lIlIlIlllIIll[0] = (160 + 58 - 208 + 151 ^ 49 + 170 - 115 + 83) & (0xEA ^ 0xC6 ^ (0xA ^ 0x3C) ^ -1);
        q.lIlIlIlllIIll[1] = 1;
    }

    @Override
    public boolean Q() {
        return lIlIlIlllIIll[0];
    }
}

