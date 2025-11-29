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

@TaskDesc(name="Looting box trap", priority=1)
public class LootingBoxTrapTask
extends HunterTaskBase {

    private static void var3() {
        var1 = new int[6];
        m.var1[0] = 3;
        m.var1[1] = 1;
        m.var1[2] = (0x5F ^ 0x7D) & ~(0x64 ^ 0x46);
        m.var1[3] = 0xFFFFAFFE & 0x7719;
        m.var1[4] = 47 + 17 - -81 + 10 ^ 7 + 125 - 131 + 146;
        m.var1[5] = 2;
    }

    private static void var4() {
        var2 = new String[var1[1]];
        m.var2[m.var1[2]] = "Take";
    }

    static {
        m.var3();
        m.var4();
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootingBoxTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean x() {
        int[] nArray = new int[var1[1]];
        nArray[m.var1[2]] = var1[3];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)var1[0], (int[])nArray);
        if (!m.var12(list) || m.var5(list.isEmpty() ? 1 : 0)) {
            return var1[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(var2[var1[2]]));
        return var1[1];
    }

    private static boolean var12(Object object) {
        return object != null;
    }
}

