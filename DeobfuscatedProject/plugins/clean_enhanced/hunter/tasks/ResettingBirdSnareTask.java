/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.FHelper;
import gg.squire.hunter.tasks.GameEnum2;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Resetting bird snare", priority=15, blocking=true)
public class ResettingBirdSnareTask
extends HunterTaskBase {

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public ResettingBirdSnareTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var5;
        Map<WorldPoint, f> map = this.y().h();
        if (!B.var6(map.isEmpty() ? 1 : 0) || !B.var6(Players.getLocal().isAnimating() ? 1 : 0) || B.var4(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        f var7 = null;
        TileObject var8 = var5.keySet().iterator();
        while (B.var4(var8.hasNext() ? 1 : 0)) {
            WorldPoint var9 = (WorldPoint)var8.next();
            f var10 = (f)var5.get(var9);
            if (B.var3((Object)var10.q(), (Object)g.EMPTY)) {
                var7 = var10;
            }
            0;
            
            return ((0x54 ^ 1 ^ (0xA8 ^ 0xB0)) & (0x6C ^ 0x49 ^ (0x1A ^ 0x72) ^ -1)) != 0;
        }
        if (B.var11(var7)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[B.var1[0]] = var1[2];
        var8 = TileObjects.getNearest((int[])nArray);
        if (B.var11(var8)) {
            return var1[0];
        }
        var3_3.interact(var2[var1[0]]);
        return var1[1];
    }

    private static void var12() {
        var1 = new int[4];
        B.var1[0] = (0x50 ^ 0x6C) & ~(0xA7 ^ 0x9B);
        B.var1[1] = 1;
        B.var1[2] = 0xFFFFBCFF & 0x6780;
        B.var1[3] = 2;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    static {
        B.var12();
        B.var13();
    }

    private static void var13() {
        var2 = new String[var1[1]];
        B.var2[B.var1[0]] = "Dismantle";
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }
}

