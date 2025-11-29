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
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

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
public class f
extends Task {
    private static /* synthetic */ int[] lIllIIIIIlllI;
    private static /* synthetic */ String[] lIllIIIIIllIl;
    private final /* synthetic */ SquireWoodcutterPlugin C;
    private final /* synthetic */ SquireWoodcutterConfig D;

    private static boolean llIIIlIIIIIlllI(int n, int n2) {
        return n >= n2;
    }

    private static boolean llIIIlIIIIIlIll(int n) {
        return n == 0;
    }

    private static void llIIIlIIIIIlIIl() {
        lIllIIIIIllIl = new String[lIllIIIIIlllI[3]];
        f.lIllIIIIIllIl[f.lIllIIIIIlllI[0]] = f."Take";
        f.lIllIIIIIllIl[f.lIllIIIIIlllI[2]] = f."nest";
    }

    private static String llIIIlIIIIIlIII(String llllllllllllllIllIIllIlIIlIlIIlI, String llllllllllllllIllIIllIlIIlIlIllI) {
        llllllllllllllIllIIllIlIIlIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIlIIlIlIlIl = new StringBuilder();
        char[] llllllllllllllIllIIllIlIIlIlIlII = llllllllllllllIllIIllIlIIlIlIllI.toCharArray();
        int llllllllllllllIllIIllIlIIlIlIIll = lIllIIIIIlllI[0];
        char[] llllllllllllllIllIIllIlIIlIIllIl = llllllllllllllIllIIllIlIIlIlIIlI.toCharArray();
        int llllllllllllllIllIIllIlIIlIIllII = llllllllllllllIllIIllIlIIlIIllIl.length;
        int llllllllllllllIllIIllIlIIlIIlIll = lIllIIIIIlllI[0];
        while (f.llIIIlIIIIIllll(llllllllllllllIllIIllIlIIlIIlIll, llllllllllllllIllIIllIlIIlIIllII)) {
            char llllllllllllllIllIIllIlIIlIllIII = llllllllllllllIllIIllIlIIlIIllIl[llllllllllllllIllIIllIlIIlIIlIll];
            llllllllllllllIllIIllIlIIlIlIlIl.append((char)(llllllllllllllIllIIllIlIIlIllIII ^ llllllllllllllIllIIllIlIIlIlIlII[llllllllllllllIllIIllIlIIlIlIIll % llllllllllllllIllIIllIlIIlIlIlII.length]));
            0;
            ++llllllllllllllIllIIllIlIIlIlIIll;
            ++llllllllllllllIllIIllIlIIlIIlIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllIlIIlIlIlIl);
    }

    private static void llIIIlIIIIIlIlI() {
        lIllIIIIIlllI = new int[4];
        f.lIllIIIIIlllI[0] = (0x3D ^ 0x7A) & ~(7 ^ 0x40);
        f.lIllIIIIIlllI[1] = 0x49 ^ 0x4F;
        f.lIllIIIIIlllI[2] = 1;
        f.lIllIIIIIlllI[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        f llllllllllllllIllIIllIlIIllIIIll;
        if (f.llIIIlIIIIIlIll(this.D.pickUpNest() ? 1 : 0)) {
            return lIllIIIIIlllI[0];
        }
        if (f.llIIIlIIIIIllII(llllllllllllllIllIIllIlIIllIIIll.C.b() ? 1 : 0)) {
            return lIllIIIIIlllI[0];
        }
        if (f.llIIIlIIIIIllII(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIIlllI[0];
        }
        TileItem llllllllllllllIllIIllIlIIllIIIlI = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lIllIIIIIllIl[lIllIIIIIlllI[2]]));
        if (f.llIIIlIIIIIllIl(llllllllllllllIllIIllIlIIllIIIlI)) {
            return lIllIIIIIlllI[0];
        }
        if (f.llIIIlIIIIIlllI(Players.getLocal().distanceTo((Locatable)llllllllllllllIllIIllIlIIllIIIlI), lIllIIIIIlllI[1])) {
            return lIllIIIIIlllI[0];
        }
        if (f.llIIIlIIIIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIllIIIIIlllI[2];
        }
        var1_1.interact(lIllIIIIIllIl[lIllIIIIIlllI[0]]);
        return lIllIIIIIlllI[2];
    }

    @Inject
    public f(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
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

