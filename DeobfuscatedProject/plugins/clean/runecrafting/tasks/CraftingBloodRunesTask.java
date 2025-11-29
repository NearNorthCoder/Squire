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
import java.util.Base64;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Crafting Blood Runes")
public class CraftingBloodRunesTask
extends Task {
    
    private final  SquireZeahRunecrafter v;
    private static final  WorldPoint t;
    
    private final  a u;
    private static final  WorldArea s;

    @Inject
    public CraftingBloodRunesTask(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.u = a2;
        this.v = squireZeahRunecrafter;
    }

    public boolean run() {
        d var1;
        if (!d.llIIIlllIIIIlII(this.v.a() ? 1 : 0) || d.llIIIlllIIIIlIl(this.m() ? 1 : 0)) {
            return lIllIIlllIlll[0];
        }
        TileObject var2 = var1.p();
        if (d.llIIIlllIIIIllI(var2)) {
            var1.a(var2);

            if (3 == 0) {
                return ((0xF8 ^ 0xB2 ^ (0x7D ^ 0x19)) & (18 + 90 - 23 + 59 ^ 79 + 110 - 132 + 133 ^ -1)) != 0;
            }
        } else {
            var1.q();
        }
        return lIllIIlllIlll[1];
    }

    private static boolean llIIIlllIIIIlIl(int n) {
        return n == 0;
    }

    private static boolean llIIIlllIIIIlll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIlllIIIlIII(int n, int n2) {
        return n < n2;
    }

        return String.valueOf(var3);
    }

    private boolean m() {
        boolean bl;
        if (!d.llIIIlllIIIIlIl(this.n() ? 1 : 0) || d.llIIIlllIIIIlII(this.o() ? 1 : 0)) {
            bl = lIllIIlllIlll[1];

            if (((0x61 ^ 9 ^ (0xDF ^ 0xA1)) & (5 ^ 0x59 ^ (0xEB ^ 0xA1) ^ -1)) < 0) {
                return false;
            }
        } else {
            bl = lIllIIlllIlll[0];
        }
        return bl;
    }

    private void a(TileObject tileObject) {
        tileObject.interact(lIllIIlllIlIl[lIllIIlllIlll[0]]);
    }

    private TileObject p() {
        TileObject tileObject;
        int[] nArray = new int[lIllIIlllIlll[1]];
        nArray[d.lIllIIlllIlll[0]] = lIllIIlllIlll[5];
        TileObject tileObject2 = TileObjects.getNearest((int[])nArray);
        if (d.llIIIlllIIIIllI(tileObject2) && d.llIIIlllIIIIlII(Reachable.isInteractable((Locatable)tileObject2) ? 1 : 0)) {
            tileObject = tileObject2;

            if (((0x78 ^ 0x1A) & ~(0xC3 ^ 0xA1)) > ((0xBB ^ 0x92) & ~(0x94 ^ 0xBD))) {
                return null;
            }
        } else {
            tileObject = null;
        }
        return tileObject;
    }

    private static boolean llIIIlllIIIIllI(Object object) {
        return object != null;
    }

    private boolean n() {
        int n;
        int[] nArray = new int[lIllIIlllIlll[1]];
        nArray[d.lIllIIlllIlll[0]] = lIllIIlllIlll[2];
        if (d.llIIIlllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && d.llIIIlllIIIIlll(this.u.h(), this.u.j()) && d.llIIIlllIIIIlII(Inventory.isFull() ? 1 : 0)) {
            n = lIllIIlllIlll[1];

            if (2 <= 0) {
                return false;
            }
        } else {
            n = lIllIIlllIlll[0];
        }
        return n != 0;
    }

    private static void llIIIllIllllllI() {
        lIllIIlllIlIl = new String[lIllIIlllIlll[1]];
        d.lIllIIlllIlIl[d.lIllIIlllIlll[0]] = "Bind";
    }

    private void q() {
        Movement.walkTo((WorldPoint)t);

    }

    private static boolean llIIIlllIIIIlII(int n) {
        return n != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean o() {
        int n;
        if (d.llIIIlllIIIIlII(s.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            int[] nArray = new int[lIllIIlllIlll[1]];
            nArray[d.lIllIIlllIlll[0]] = lIllIIlllIlll[3];
            if (d.llIIIlllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIlllIlll[1]];
                nArray2[d.lIllIIlllIlll[0]] = lIllIIlllIlll[4];
                if (d.llIIIlllIIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n = lIllIIlllIlll[1];

                    if (-1 < 2) return n != 0;
                    return false;
                }
            }
        }
        n = lIllIIlllIlll[0];
        return n != 0;
    }

    static {
        d.llIIIlllIIIIIll();
        d.llIIIllIllllllI();
        s = new WorldArea(lIllIIlllIlll[6], lIllIIlllIlll[7], lIllIIlllIlll[8], lIllIIlllIlll[9], lIllIIlllIlll[0]);
        t = new WorldPoint(lIllIIlllIlll[10], lIllIIlllIlll[11], lIllIIlllIlll[0]);
    }
}

