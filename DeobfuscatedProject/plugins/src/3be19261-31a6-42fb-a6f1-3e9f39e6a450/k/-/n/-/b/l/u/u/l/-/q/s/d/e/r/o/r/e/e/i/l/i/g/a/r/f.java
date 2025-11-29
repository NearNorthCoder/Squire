/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Banking for items")
public class f
extends Task {
    private final /* synthetic */ SquireBlueDragonKillerConfig w;
    private /* synthetic */ Player y;
    private static /* synthetic */ int[] lIIlllIllIll;
    private final /* synthetic */ SquireBlueDragonKiller x;

    private static boolean llIlIIIlIIllIl(int n) {
        return n == 0;
    }

    private static void llIlIIIlIIllII() {
        lIIlllIllIll = new int[3];
        f.lIIlllIllIll[0] = (0xBB ^ 0x9F) & ~(0xBB ^ 0x9F);
        f.lIIlllIllIll[1] = " ".length();
        f.lIIlllIllIll[2] = 0xB6 ^ 0xB3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        f lllllllllllllllIlllIlIlIlIIIllII;
        if (f.llIlIIIlIIllIl(this.x.h() ? 1 : 0)) {
            return lIIlllIllIll[0];
        }
        lllllllllllllllIlllIlIlIlIIIllII.y = Players.getLocal();
        if (f.llIlIIIlIIlllI(lllllllllllllllIlllIlIlIlIIIllII.y)) {
            return lIIlllIllIll[0];
        }
        if (f.llIlIIIlIIllIl(lllllllllllllllIlllIlIlIlIIIllII.w.bankLocation().getArea().contains((Locatable)lllllllllllllllIlllIlIlIlIIIllII.y) ? 1 : 0)) {
            return lIIlllIllIll[0];
        }
        if (f.llIlIIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            "".length();
            return lIIlllIllIll[1];
        }
        BankLoadout lllllllllllllllIlllIlIlIlIIIlIll = (BankLoadout)lllllllllllllllIlllIlIlIlIIIllII.w.loadout().selected(BankLoadout.class);
        if (f.llIlIIIlIIllIl(lllllllllllllllIlllIlIlIlIIIlIll.needsToBank() ? 1 : 0)) {
            lllllllllllllllIlllIlIlIlIIIllII.x.a(lIIlllIllIll[0]);
            return lIIlllIllIll[0];
        }
        BankLoadouts.withdrawWithRetries((BankLoadout)var1_1, (int)lIIlllIllIll[2]);
        "".length();
        return lIIlllIllIll[1];
    }

    @Inject
    public f(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, SquireBlueDragonKiller squireBlueDragonKiller) {
        this.w = squireBlueDragonKillerConfig;
        this.x = squireBlueDragonKiller;
    }

    private static boolean llIlIIIlIIlllI(Object object) {
        return object == null;
    }

    static {
        f.llIlIIIlIIllII();
    }
}

