/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h_Unknown;

/* TASK: Dropping Empty Vial (you should crush likeachamp) -> Droppingemptyvial(Youshouldcrushlikeachamp)Task */
@TaskDesc(name="Dropping Empty Vial (you should crush likeachamp)", priority=0x7FFFFFFF, blocking=false)
public class DroppingEmptyVialYouShouldCrushLikeachampTask
extends Task {
    private static final /* synthetic */ Logger dH;
    private final /* synthetic */ h dJ;
    private static /* synthetic */ int[] lllIllIlIlII;
    private final /* synthetic */ SquireNightmareConfig dI;

    private static boolean lIIIllIlIIlllIl(int n2) {
        return n2 != 0;
    }

    private static void lIIIllIlIIllIlI() {
        lllIllIlIlII = new int[3];
        ac.lllIllIlIlII[0] = (0xC8 ^ 0x8E) & ~(0x1B ^ 0x5D);
        ac.lllIllIlIlII[1] = 1;
        ac.lllIllIlIlII[2] = (0xB ^ 0x43) + (0xA2 ^ 0xC2) - (6 ^ 0x45) + (123 + 53 - 106 + 58);
    }

    private static boolean lIIIllIlIIlllII(Object object) {
        return object == null;
    }

    static {
        ac.lIIIllIlIIllIlI();
        dH = LoggerFactory.getLogger(DroppingEmptyVialYouShouldCrushLikeachampTask.class);
    }

    private static boolean lIIIllIlIIllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (ac.lIIIllIlIIllIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lllIllIlIlII[0];
        }
        NPC var1 = SquireNightmarePlugin.d();
        if (ac.lIIIllIlIIlllII(var1)) {
            return lllIllIlIlII[0];
        }
        int[] nArray = new int[lllIllIlIlII[1]];
        nArray[ac.lllIllIlIlII[0]] = lllIllIlIlII[2];
        List var2 = Inventory.getAll((int[])nArray);
        if (ac.lIIIllIlIIlllIl(var2.isEmpty() ? 1 : 0)) {
            return lllIllIlIlII[0];
        }
        ((Item)var2_2.get(lllIllIlIlII[0])).drop();
        return lllIllIlIlII[1];
    }

    @Inject
    public ac(SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dI = squireNightmareConfig;
        this.dJ = h2;
    }
}

