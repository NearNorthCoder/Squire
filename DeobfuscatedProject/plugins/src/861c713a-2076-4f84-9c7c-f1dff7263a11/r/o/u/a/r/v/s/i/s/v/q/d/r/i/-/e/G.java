/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.E;

@TaskDesc(name="Grabbing fairy ring item [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class G
extends E {
    private static /* synthetic */ int[] lIlIlIIlIlIll;
    private /* synthetic */ BankLocation ay;

    private static boolean lIllllIlllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIllllllII(Object object) {
        return object == null;
    }

    @Override
    public boolean l() {
        G llllllllllllllIllIlIllllIIllIIll;
        if (G.lIllllIlllllIll(this.X() ? 1 : 0)) {
            return lIlIlIIlIlIll[0];
        }
        if (G.lIllllIllllllII(llllllllllllllIllIlIllllIIllIIll.ay)) {
            llllllllllllllIllIlIllllIIllIIll.ay = BankLocation.getNearest();
        }
        if (G.lIllllIlllllIll(llllllllllllllIllIlIllllIIllIIll.ay.getArea().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            if (G.lIllllIlllllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw((int)lIlIlIIlIlIll[1], (int)lIlIlIIlIlIll[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                return lIlIlIIlIlIll[2];
            }
            if (G.lIllllIlllllIll(Bank.open() ? 1 : 0)) {
                return lIlIlIIlIlIll[2];
            }
        }
        Movement.walkTo((WorldArea)this.ay.getArea());
        "".length();
        return lIlIlIIlIlIll[2];
    }

    private static void lIllllIlllllIlI() {
        lIlIlIIlIlIll = new int[3];
        G.lIlIlIIlIlIll[0] = (140 + 167 - 103 + 3 ^ 3 + 58 - 40 + 177) & (0x55 ^ 0x68 ^ (0xBE ^ 0x8A) ^ -" ".length());
        G.lIlIlIIlIlIll[1] = -(0xFFFF9DFE & 0x660D) & (0xFFFFEF6F & 0x179F);
        G.lIlIlIIlIlIll[2] = " ".length();
    }

    static {
        G.lIllllIlllllIlI();
    }
}

