/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;

public abstract class k
extends Task {
    private static /* synthetic */ int[] llllllIlIIlI;
    protected final /* synthetic */ a D;
    protected final /* synthetic */ Client C;

    public abstract boolean j();

    private static boolean lIIlIlIIIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    protected k(a a2, Client client) {
        this.D = a2;
        this.C = client;
    }

    private static boolean lIIlIlIIIlIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIlIlIll(Object object) {
        return object != null;
    }

    public boolean run() {
        k lllllllllllllllIIlIIlllIIIllIIII;
        if (k.lIIlIlIIIlIlIII(this.C.getVarbitValue(llllllIlIIlI[0]))) {
            return llllllIlIIlI[1];
        }
        if (k.lIIlIlIIIlIlIIl(lllllllllllllllIIlIIlllIIIllIIII.C.getVarbitValue(llllllIlIIlI[2]), llllllIlIIlI[3])) {
            return llllllIlIIlI[1];
        }
        NPC lllllllllllllllIIlIIlllIIIlIllll = NPCs.getNearest(nPC -> {
            boolean bl;
            if (k.lIIlIlIIIlIlllI(nPC.getInteracting(), Players.getLocal())) {
                bl = llllllIlIIlI[3];
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return ((0xB6 ^ 0xAD) & ~(0x99 ^ 0x82)) != 0;
                }
            } else {
                bl = llllllIlIIlI[1];
            }
            return bl;
        });
        if (k.lIIlIlIIIlIlIII(Movement.isRunEnabled() ? 1 : 0) && (!k.lIIlIlIIIlIlIlI(Movement.getRunEnergy(), llllllIlIIlI[4]) || k.lIIlIlIIIlIlIll(lllllllllllllllIIlIIlllIIIlIllll) && k.lIIlIlIIIlIllII(Movement.getRunEnergy(), llllllIlIIlI[5]))) {
            Movement.toggleRun();
        }
        if (k.lIIlIlIIIlIlIII(Movement.isRunEnabled() ? 1 : 0) && k.lIIlIlIIIlIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllllIlIIlI[1];
        }
        return this.j();
    }

    private static boolean lIIlIlIIIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        k.lIIlIlIIIlIIlll();
    }

    private static boolean lIIlIlIIIlIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlIlIIIlIIlll() {
        llllllIlIIlI = new int[6];
        k.llllllIlIIlI[0] = 0xFFFFCBC7 & 0x3D7F;
        k.llllllIlIIlI[1] = (0x7C ^ 0xE ^ (0x15 ^ 0x50)) & (0x7B ^ 0x29 ^ (0xFD ^ 0x98) ^ -" ".length());
        k.llllllIlIIlI[2] = 0xFFFFFBFD & 0xD3F;
        k.llllllIlIIlI[3] = " ".length();
        k.llllllIlIIlI[4] = 0x5B ^ 0x42;
        k.llllllIlIIlI[5] = 0xB1 ^ 0x81 ^ (0x3D ^ 8);
    }

    private static boolean lIIlIlIIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIIlIlllI(Object object, Object object2) {
        return object == object2;
    }
}

