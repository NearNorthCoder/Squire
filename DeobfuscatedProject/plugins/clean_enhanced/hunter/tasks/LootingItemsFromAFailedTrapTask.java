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

@TaskDesc(name="Looting items from a failed trap", priority=50, blocking=true)
public class LootingItemsFromAFailedTrapTask
extends HunterTaskBase {

    @Override
    public boolean x() {
        int[] nArray = new int[var2[1]];
        nArray[q.var2[2]] = var2[3];
        nArray[q.var2[4]] = var2[5];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)var2[0], (int[])nArray);
        if (!q.var3(list) || q.var4(list.isEmpty() ? 1 : 0)) {
            return var2[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(var1[var2[2]]));
        return var2[4];
    }

    private static void var5() {
        var1 = new String[var2[4]];
        q.var1[q.var2[2]] = "Take";
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootingItemsFromAFailedTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }

    static {
        q.var6();
        q.var5();
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    private static void var6() {
        var2 = new int[7];
        q.var2[0] = 0x7C ^ 0x70;
        q.var2[1] = 2;
        q.var2[2] = (147 + 88 - 218 + 169 ^ 97 + 140 - 175 + 102) & (11 + 42 - -1 + 87 ^ 132 + 25 - 81 + 71 ^ -1);
        q.var2[3] = -(0xFFFFBDED & 0x4E17) & (0xFFFFAFFE & 0x5FBF);
        q.var2[4] = 1;
        q.var2[5] = 0xFFFFC96F & 0x37BF;
        q.var2[6] = 0x85 ^ 0x8C ^ 1;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

