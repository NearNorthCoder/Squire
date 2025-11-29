/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
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
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking to net trap that is changing", priority=-1)
public class WalkingToNetTrapThatIsChangingTask
extends HunterTaskBase {

    static {
        s.var3();
        s.var4();
    }

    private static void var3() {
        var1 = new int[4];
        s.var1[0] = (7 ^ 9) & ~(0x6A ^ 0x64);
        s.var1[1] = 1;
        s.var1[2] = 0x99 ^ 0x91;
        s.var1[3] = 2;
    }

    @Inject
    public WalkingToNetTrapThatIsChangingTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var2 = new String[var1[1]];
        s.var2[s.var1[0]] = "tree";
    }

    private static boolean var13(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var14;
        Map<WorldPoint, f> map = this.y().h();
        if (s.var15(map.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        if (s.var12(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        f var16 = null;
        TileObject var17 = var14.keySet().iterator();
        while (s.var15(var17.hasNext() ? 1 : 0)) {
            WorldPoint var18 = (WorldPoint)var17.next();
            f var19 = (f)var14.get(var18);
            if (s.var13((Object)var19.q(), (Object)g.TRANSITION)) {
                var16 = var19;
                0;
                if (3 < 3) {
                    return ((0x62 ^ 0x5D ^ (0xA4 ^ 0x97)) & (0x2D ^ 0x1A ^ (0x4B ^ 0x70) ^ -1)) != 0;
                }
            } else if (s.var13((Object)var19.q(), (Object)g.FULL)) {
                return var1[0];
            }
            0;
            if (-1 < (0xA8 ^ 0xAC)) continue;
            return ((0xC9 ^ 0xAB) & ~(0xE5 ^ 0x87)) != 0;
        }
        if (s.var11(var16)) {
            return var1[0];
        }
        var17 = TileObjects.getNearest((WorldPoint)var16.o(), tileObject -> tileObject.getName().toLowerCase().contains(var2[var1[0]]));
        if (s.var11(var17)) {
            return var1[0];
        }
        LocalPoint localPoint = var3_3.getLocalLocation();
        Movement.setDestination((int)localPoint.getSceneX(), (int)localPoint.getSceneY());
        return var1[1];
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }
}

