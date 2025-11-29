/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

/* TASK: Walking to bank -> WalkToBankTask */
@TaskDesc(name="Walking to bank", priority=10, blocking=true)
public class A
extends Task {
    public static final /* synthetic */ WorldPoint aL;
    private static /* synthetic */ int[] lIIlIlllIIIlI;
    private final /* synthetic */ c aM;
    private final /* synthetic */ SquireShamanConfig aN;
    public static final /* synthetic */ WorldPoint aK;

    private static boolean lIlIllIllIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private boolean G() {
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        int n2 = worldPoint.getRegionID();
        if (!A.lIlIllIllIIllII(n2, lIIlIlllIIIlI[4]) || A.lIlIllIllIIllIl(n2, lIIlIlllIIIlI[5])) {
            Movement.walkTo((WorldPoint)aL);
            0;
            0;
            if (-3 >= 0) {
                return ((0x30 ^ 0x2B ^ (0xF ^ 0x2F)) & (0xA ^ 0x41 ^ (0x20 ^ 0x50) ^ -1)) != 0;
            }
        } else {
            Movement.walkTo((WorldPoint)aK);
            0;
        }
        return lIIlIlllIIIlI[0];
    }

    private static boolean lIlIllIllIIlIIl(Object object) {
        return object != null;
    }

    private static boolean lIlIllIllIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIllIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIllIIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIllIllIIIlll() {
        lIIlIlllIIIlI = new int[10];
        A.lIIlIlllIIIlI[0] = (136 + 180 - 240 + 115 ^ 129 + 148 - 156 + 32) & (55 + 92 - 122 + 147 ^ 23 + 120 - 109 + 104 ^ -1);
        A.lIIlIlllIIIlI[1] = 1;
        A.lIIlIlllIIIlI[2] = -(0xFFFFBF3F & 0x51C9) & (0xFFFFFD5F & 0x7BFF);
        A.lIIlIlllIIIlI[3] = 0x16 ^ 0x10 ^ (0x8B ^ 0x87);
        A.lIIlIlllIIIlI[4] = -(0xFFFFC7AD & 0x7857) & (0xFFFFEB77 & 0x7CBE);
        A.lIIlIlllIIIlI[5] = 0xFFFFBDFB & 0x6B36;
        A.lIIlIlllIIIlI[6] = -(0xFFFFFBD7 & 0x2729) & (0xFFFFB7DF & 0x6FFF);
        A.lIIlIlllIIIlI[7] = -(0xFFFFED65 & 0x33BB) & (0xFFFFAFBF & 0x7FFB);
        A.lIIlIlllIIIlI[8] = 0xFFFFBD1E & 0x47F7;
        A.lIIlIlllIIIlI[9] = 0xFFFFCEFE & 0x3FB3;
    }

    static {
        A.lIlIllIllIIIlll();
        aK = new WorldPoint(lIIlIlllIIIlI[6], lIIlIlllIIIlI[7], lIIlIlllIIIlI[0]);
        aL = new WorldPoint(lIIlIlllIIIlI[8], lIIlIlllIIIlI[9], lIIlIlllIIIlI[0]);
    }

    private static boolean lIlIllIllIIlIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public A(c c2, SquireShamanConfig squireShamanConfig) {
        this.aM = c2;
        this.aN = squireShamanConfig;
    }

    public boolean run() {
        A var1;
        if (A.lIlIllIllIIlIII(this.aM.s() ? 1 : 0)) {
            return lIIlIlllIIIlI[0];
        }
        InventorySetup var3 = var1.aM.r();
        if (A.lIlIllIllIIlIII(var3.matchesInventory() ? 1 : 0)) {
            return lIIlIlllIIIlI[0];
        }
        int[] nArray = new int[lIIlIlllIIIlI[1]];
        nArray[A.lIIlIlllIIIlI[0]] = lIIlIlllIIIlI[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (A.lIlIllIllIIlIIl(var2) && A.lIlIllIllIIlIlI(var2.distanceTo((Locatable)Players.getLocal()), lIIlIlllIIIlI[3])) {
            return lIIlIlllIIIlI[0];
        }
        if (A.lIlIllIllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlIlllIIIlI[0];
        }
        return Movement.walkTo((WorldPoint)aK);
    }
}

