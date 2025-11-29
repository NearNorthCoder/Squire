/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Setting up net trap", priority=30, blocking=true)
public class r
extends j {
    private static /* synthetic */ int[] lllIllllllll;
    private static /* synthetic */ String[] lllIlllllllI;

    private static String lIIIlllIIlIlIII(String lllllllllllllllIIlIllIlIllIllIll, String lllllllllllllllIIlIllIlIllIllIlI) {
        lllllllllllllllIIlIllIlIllIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIlIllIllllI = new StringBuilder();
        char[] lllllllllllllllIIlIllIlIllIlllIl = lllllllllllllllIIlIllIlIllIllIlI.toCharArray();
        int lllllllllllllllIIlIllIlIllIlllII = lllIllllllll[0];
        char[] lllllllllllllllIIlIllIlIllIlIllI = lllllllllllllllIIlIllIlIllIllIll.toCharArray();
        int lllllllllllllllIIlIllIlIllIlIlIl = lllllllllllllllIIlIllIlIllIlIllI.length;
        int lllllllllllllllIIlIllIlIllIlIlII = lllIllllllll[0];
        while (r.lIIIlllIIllIIIl(lllllllllllllllIIlIllIlIllIlIlII, lllllllllllllllIIlIllIlIllIlIlIl)) {
            char lllllllllllllllIIlIllIlIlllIIIIl = lllllllllllllllIIlIllIlIllIlIllI[lllllllllllllllIIlIllIlIllIlIlII];
            lllllllllllllllIIlIllIlIllIllllI.append((char)(lllllllllllllllIIlIllIlIlllIIIIl ^ lllllllllllllllIIlIllIlIllIlllIl[lllllllllllllllIIlIllIlIllIlllII % lllllllllllllllIIlIllIlIllIlllIl.length]));
            0;
            ++lllllllllllllllIIlIllIlIllIlllII;
            ++lllllllllllllllIIlIllIlIllIlIlII;
            0;
            if ((0x22 ^ 0x26) != 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIlIllIllllI);
    }

    private static boolean lIIIlllIIlIlllI(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIllIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlllIIlIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        r.lIIIlllIIlIlIlI();
        r.lIIIlllIIlIlIIl();
    }

    private static void lIIIlllIIlIlIIl() {
        lllIlllllllI = new String[lllIllllllll[5]];
        r.lllIlllllllI[r.lllIllllllll[0]] = r."Set-trap";
        r.lllIlllllllI[r.lllIllllllll[1]] = r."Release";
    }

    private static boolean lIIIlllIIlIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIIlIllll(int n2) {
        return n2 > 0;
    }

    private static int lIIIlllIIlIlIll(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var1_1;
        r lllllllllllllllIIlIllIlIlllIllII;
        block8: {
            block7: {
                if (!r.lIIIlllIIlIllII(this.y().c() ? 1 : 0) || r.lIIIlllIIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
                    return lllIllllllll[0];
                }
                int[] nArray = new int[lllIllllllll[1]];
                nArray[r.lllIllllllll[0]] = lllIllllllll[2];
                if (!r.lIIIlllIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray2 = new int[lllIllllllll[1]];
                nArray2[r.lllIllllllll[0]] = lllIllllllll[3];
                if (!r.lIIIlllIIlIllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block8;
            }
            return lllIllllllll[0];
        }
        TileObject lllllllllllllllIIlIllIlIlllIlIll = lllllllllllllllIIlIllIlIlllIllII.y().f();
        if (!r.lIIIlllIIlIlllI(lllllllllllllllIIlIllIlIlllIlIll) || r.lIIIlllIIlIllll(r.lIIIlllIIlIlIll(lllllllllllllllIIlIllIlIlllIlIll.getWorldLocation().distanceToHypotenuse(lllllllllllllllIIlIllIlIlllIllII.y().k()), 12.0f))) {
            return lllIllllllll[0];
        }
        if (r.lIIIlllIIlIllIl(Movement.isRunEnabled() ? 1 : 0) && r.lIIIlllIIllIIII(Movement.getRunEnergy(), lllIllllllll[4])) {
            Movement.toggleRun();
        }
        if (r.lIIIlllIIlIlllI(Inventory.getFirst(item -> {
            String[] stringArray = new String[lllIllllllll[1]];
            stringArray[r.lllIllllllll[0]] = lllIlllllllI[lllIllllllll[1]];
            return item.hasAction(stringArray);
        }))) {
            lllllllllllllllIIlIllIlIlllIllII.y().d();
            0;
        }
        var1_1.interact(lllIlllllllI[lllIllllllll[0]]);
        return lllIllllllll[1];
    }

    private static void lIIIlllIIlIlIlI() {
        lllIllllllll = new int[6];
        r.lllIllllllll[0] = (0xC0 ^ 0x9F) & ~(0x79 ^ 0x26);
        r.lllIllllllll[1] = 1;
        r.lllIllllllll[2] = 0xFFFFE9EF & 0x173F;
        r.lllIllllllll[3] = 0xFFFFB3BF & 0x4FFA;
        r.lllIllllllll[4] = 0x77 ^ 0x78;
        r.lllIllllllll[5] = 2;
    }

    @Inject
    public r(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }
}

