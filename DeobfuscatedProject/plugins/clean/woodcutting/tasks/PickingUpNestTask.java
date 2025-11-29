/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Picking up nest", priority=500, blocking=true)
public class PickingUpNestTask
extends Task {

    private final  SquireWoodcutterPlugin C;
    private final  SquireWoodcutterConfig D;

    private static boolean llIIIlIIIIIlllI(int n, int n2) {
        return n >= n2;
    }

    private static boolean llIIIlIIIIIlIll(int n) {
        return n == 0;
    }

    private static void llIIIlIIIIIlIIl() {
        lIllIIIIIllIl = new String[lIllIIIIIlllI[3]];
        f.lIllIIIIIllIl[f.lIllIIIIIlllI[0]] = "Take";
        f.lIllIIIIIllIl[f.lIllIIIIIlllI[2]] = "nest";
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        f var2;
        if (f.llIIIlIIIIIlIll(this.D.pickUpNest() ? 1 : 0)) {
            return lIllIIIIIlllI[0];
        }
        if (f.llIIIlIIIIIllII(var2.C.b() ? 1 : 0)) {
            return lIllIIIIIlllI[0];
        }
        if (f.llIIIlIIIIIllII(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIIlllI[0];
        }
        TileItem var3 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lIllIIIIIllIl[lIllIIIIIlllI[2]]));
        if (f.llIIIlIIIIIllIl(var3)) {
            return lIllIIIIIlllI[0];
        }
        if (f.llIIIlIIIIIlllI(Players.getLocal().distanceTo((Locatable)var3), lIllIIIIIlllI[1])) {
            return lIllIIIIIlllI[0];
        }
        if (f.llIIIlIIIIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIllIIIIIlllI[2];
        }
        var1_1.interact(lIllIIIIIllIl[lIllIIIIIlllI[0]]);
        return lIllIIIIIlllI[2];
    }

    @Inject
    public PickingUpNestTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.C = squireWoodcutterPlugin;
        this.D = squireWoodcutterConfig;
    }

    static {
        f.llIIIlIIIIIlIlI();
        f.llIIIlIIIIIlIIl();
    }

    private static boolean llIIIlIIIIIllII(int n) {
        return n != 0;
    }

    private static boolean llIIIlIIIIIllIl(Object object) {
        return object == null;
    }

    private static boolean llIIIlIIIIIllll(int n, int n2) {
        return n < n2;
    }
}

