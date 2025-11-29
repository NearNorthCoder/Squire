/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import gg.squire.runecrafting.tasks.AHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining Essence Blocks")
public class MiningEssenceBlocksTask
extends Task {

    private static final  WorldArea C;
    private static final  WorldPoint A;
    private static final  WorldPoint B;
    private final  a E;
    private final  SquireZeahRunecrafter F;
    private static final  WorldArea D;

    static {
        g.llIIIllIllIIIII();
        g.llIIIllIlIlllII();
        A = new WorldPoint(lIllIIllIllII[9], lIllIIllIllII[10], lIllIIllIllII[0]);
        B = new WorldPoint(lIllIIllIllII[9], lIllIIllIllII[11], lIllIIllIllII[0]);
        C = new WorldArea(lIllIIllIllII[12], lIllIIllIllII[13], lIllIIllIllII[14], lIllIIllIllII[15], lIllIIllIllII[0]);
        D = new WorldArea(lIllIIllIllII[16], lIllIIllIllII[17], lIllIIllIllII[18], lIllIIllIllII[15], lIllIIllIllII[0]);
    }

    public boolean run() {
        if (g.llIIIllIllIIIIl(this.v() ? 1 : 0)) {
            return lIllIIllIllII[0];
        }
        this.A();
        return lIllIIllIllII[1];
    }

    private TileObject B() {
        TileObject tileObject2;
        TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
            int n;
            if (g.llIIIllIllIIIll(tileObject.getActualId(), lIllIIllIllII[7]) && g.llIIIllIllIIllI(tileObject.distanceTo(Players.getLocal().getWorldLocation()), lIllIIllIllII[8])) {
                n = lIllIIllIllII[1];

                if ((0x8E ^ 0x8A) == 0) {
                    return false;
                }
            } else {
                n = lIllIIllIllII[0];
            }
            return n != 0;
        });
        if (g.llIIIllIllIIlII(tileObject3) && g.llIIIllIllIIIIl(Reachable.isInteractable((Locatable)tileObject3) ? 1 : 0)) {
            tileObject2 = tileObject3;

            if (2 <= 0) {
                return null;
            }
        } else {
            tileObject2 = null;
        }
        return tileObject2;
    }

    @Inject
    public MiningEssenceBlocksTask(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.E = a2;
        this.F = squireZeahRunecrafter;
    }

    private static boolean llIIIllIllIIIIl(int n) {
        return n != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean x() {
        int n;
        block2: {
            block3: {
                if (!g.llIIIllIllIIIIl(C.contains((Locatable)Players.getLocal()) ? 1 : 0)) break block2;
                int[] nArray = new int[lIllIIllIllII[1]];
                nArray[g.lIllIIllIllII[0]] = lIllIIllIllII[2];
                if (!g.llIIIllIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
                int[] nArray2 = new int[lIllIIllIllII[1]];
                nArray2[g.lIllIIllIllII[0]] = lIllIIllIllII[3];
                if (!g.llIIIllIllIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
            }
            n = lIllIIllIllII[1];

            if (2 > -1) return n != 0;
            return ((0x64 ^ 0x76 ^ (0xC2 ^ 0x9C)) & (232 + 41 - 57 + 38 ^ 9 + 166 - 46 + 49 ^ -1)) != 0;
        }
        n = lIllIIllIllII[0];
        return n != 0;
    }

    private void c(TileObject tileObject) {
        if (g.llIIIllIllIIIll(Players.getLocal().getAnimation(), lIllIIllIllII[4])) {
            tileObject.interact(lIllIIllIlIlI[lIllIIllIllII[0]]);
        }
    }

    private static boolean llIIIllIllIIIlI(int n) {
        return n == 0;
    }

    private static boolean llIIIllIllIIIll(int n, int n2) {
        return n == n2;
    }

    private boolean w() {
        boolean bl;
        if (g.llIIIllIllIIIlI(this.F.a() ? 1 : 0)) {
            bl = lIllIIllIllII[1];

            if (1 >= (0xDB ^ 0x8A ^ (0xC ^ 0x59))) {
                return false;
            }
        } else {
            bl = lIllIIllIllII[0];
        }
        return bl;
    }

    private boolean y() {
        return Inventory.isFull();
    }

    private static void llIIIllIlIlllII() {
        lIllIIllIlIlI = new String[lIllIIllIllII[19]];
        g.lIllIIllIlIlI[g.lIllIIllIllII[0]] = "Chip";
        g.lIllIIllIlIlI[g.lIllIIllIllII[1]] = "Climb";
    }

    private boolean v() {
        boolean bl;
        if (!g.llIIIllIllIIIlI(this.w() ? 1 : 0) || !g.llIIIllIllIIIlI(this.x() ? 1 : 0) || !g.llIIIllIllIIIlI(this.y() ? 1 : 0) || g.llIIIllIllIIIIl(this.z() ? 1 : 0)) {
            bl = lIllIIllIllII[1];

            if (-(0x7B ^ 0x29 ^ (0x18 ^ 0x4F)) >= 0) {
                return ((0x52 ^ 0x17 ^ (0xD ^ 0x4C)) & (0xE ^ 0x26 ^ (0x2D ^ 1) ^ -1)) != 0;
            }
        } else {
            bl = lIllIIllIllII[0];
        }
        return bl;
    }

    private boolean z() {
        int n;
        if (g.llIIIllIllIIIll(this.E.j(), this.E.h()) && g.llIIIllIllIIIIl(Inventory.isFull() ? 1 : 0)) {
            n = lIllIIllIllII[1];

            }
        } else {
            n = lIllIIllIllII[0];
        }
        return n != 0;
    }

    private static boolean llIIIllIllIIllI(int n, int n2) {
        return n <= n2;
    }

    private boolean D() {
        boolean bl;
        if (g.llIIIllIllIIlIl(A.distanceTo(Players.getLocal().getWorldLocation()), lIllIIllIllII[5])) {
            bl = lIllIIllIllII[1];

            if (3 < 3) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            bl = lIllIIllIllII[0];
        }
        return bl;
    }

    private static boolean llIIIllIllIIlIl(int n, int n2) {
        return n > n2;
    }

    private void A() {
        TileObject tileObject = this.B();
        if (g.llIIIllIllIIlII(tileObject)) {
            this.c(tileObject);

        } else {
            g var1;
            var1.C();
        }
    }

    private void C() {
        if (g.llIIIllIllIIIIl(this.D() ? 1 : 0) && g.llIIIllIllIIIIl(D.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            this.E();

            if (-1 == 2) {
                return;
            }
        } else {
            Movement.walkTo((WorldPoint)A);

        }
    }

    private void E() {
        int[] nArray = new int[lIllIIllIllII[1]];
        nArray[g.lIllIIllIllII[0]] = lIllIIllIllII[6];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (g.llIIIllIllIIlII(tileObject)) {
            tileObject.interact(lIllIIllIlIlI[lIllIIllIllII[1]]);

            if ((0x5E ^ 6 ^ (0x7F ^ 0x23)) == 0) {
                return;
            }
        } else {
            Movement.walkTo((WorldPoint)B);

        }
    }

    private static boolean llIIIllIllIIlII(Object object) {
        return object != null;
    }
}

