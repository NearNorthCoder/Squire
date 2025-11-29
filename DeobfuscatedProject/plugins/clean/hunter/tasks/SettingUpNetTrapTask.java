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
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum16;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Setting up net trap", priority=30, blocking=true)
public class SettingUpNetTrapTask
extends HunterTaskBase {

        return String.valueOf(var1);
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
        r.lllIlllllllI[r.lllIllllllll[0]] = "Set-trap";
        r.lllIlllllllI[r.lllIllllllll[1]] = "Release";
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
        r var2;
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
        TileObject var3 = var2.y().f();
        if (!r.lIIIlllIIlIlllI(var3) || r.lIIIlllIIlIllll(r.lIIIlllIIlIlIll(var3.getWorldLocation().distanceToHypotenuse(var2.y().k()), 12.0f))) {
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
            var2.y().d();

        }
        var1_1.interact(lllIlllllllI[lllIllllllll[0]]);
        return lllIllllllll[1];
    }

    @Inject
    public SettingUpNetTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }
}

