/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Prayers
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.P;
import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Walking to bank (death) -> Walkingtobank(Death)Task */
@TaskDesc(name="Walking to bank (death)", priority=0x7FFFFFFA, blocking=true)
public class M
extends P {
    private static /* synthetic */ int[] lIllIlIlllIII;

    @Inject
    public M(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.BANKING);
    }

    private static boolean llIIlIIIIllIIII(Object object) {
        return object == null;
    }

    static {
        M.llIIlIIIIlIlllI();
    }

    private static boolean llIIlIIIIlIllll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        if (M.llIIlIIIIlIllll(this.ah() ? 1 : 0)) {
            return lIllIlIlllIII[0];
        }
        if (M.llIIlIIIIlIllll(Bank.isOpen() ? 1 : 0)) {
            return lIllIlIlllIII[0];
        }
        BankLocation var2 = BankLocation.getNearest();
        if (M.llIIlIIIIllIIII(var2)) {
            return lIllIlIlllIII[0];
        }
        WorldPoint var1 = Players.getLocal().getWorldLocation();
        if (M.llIIlIIIIlIllll(var2.getArea().contains2D(var1) ? 1 : 0)) {
            return lIllIlIlllIII[0];
        }
        if (M.llIIlIIIIlIllll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIllIlIlllIII[1];
        }
        if (M.llIIlIIIIlIllll(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldArea)var2.getArea());
            0;
        }
        return lIllIlIlllIII[1];
    }

    private static void llIIlIIIIlIlllI() {
        lIllIlIlllIII = new int[2];
        M.lIllIlIlllIII[0] = (0xF1 ^ 0xA0) & ~(0x10 ^ 0x41);
        M.lIllIlIlllIII[1] = 1;
    }
}

