/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;

@TaskDesc(name="Looting bird snare", priority=1)
public class LootingBirdSnareTask
extends HunterTaskBase {

    private static boolean var3(Object object) {
        return object != null;
    }

    static {
        D.var4();
        D.var5();
    }

    private static void var4() {
        var1 = new int[5];
        D.var1[0] = 3;
        D.var1[1] = 1;
        D.var1[2] = (0xC3 ^ 0x8C) & ~(0x1D ^ 0x52);
        D.var1[3] = 0xFFFFBFBF & 0x6756;
        D.var1[4] = 2;
    }

    private static void var5() {
        var2 = new String[var1[1]];
        D.var2[D.var1[2]] = "Take";
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean x() {
        int[] nArray = new int[var1[1]];
        nArray[D.var1[2]] = var1[3];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)var1[0], (int[])nArray);
        if (!D.var3(list) || D.var12(list.isEmpty() ? 1 : 0)) {
            return var1[2];
        }
        if (D.var12(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var1[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(var2[var1[2]]));
        return var1[1];
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootingBirdSnareTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }
}

