/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Checking net trap", priority=20, blocking=true)
public class CheckingNetTrapTask
extends HunterTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new int[11];
        p.var2[0] = (0xC5 ^ 0xA6) & ~(0x57 ^ 0x34);
        p.var2[1] = 149 + 2 - 82 + 118 ^ 164 + 40 - 156 + 142;
        p.var2[2] = 0xFFFFAF2E & 0x73FD;
        p.var2[3] = 1;
        p.var2[4] = -(0xFFFFEEAF & 0x5172) & (0xFFFFE37F & 0x7FBB);
        p.var2[5] = 2;
        p.var2[6] = -(0xFFFFD8AB & 0x7FF6) & (0xFFFFFAFF & 0x7FBF);
        p.var2[7] = 3;
        p.var2[8] = -(0xFFFFF987 & 0x5EFA) & (0xFFFFFBBF & 0x7FE5);
        p.var2[9] = 5 ^ 1;
        p.var2[10] = 0xFFFFFEDF & 0xC73D;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var10;
        p var11;
        Map<WorldPoint, f> map = this.y().h();
        if (p.var12(map.isEmpty() ? 1 : 0) && p.var13(Movement.shouldWalk() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var12(var11.y().c() ? 1 : 0)) {
            return var2[0];
        }
        f var14 = null;
        TileObject var15 = var10.keySet().iterator();
        while (p.var12(var15.hasNext() ? 1 : 0)) {
            WorldPoint var16 = (WorldPoint)var15.next();
            f var17 = (f)var10.get(var16);
            if (p.var18((Object)var17.q(), (Object)g.FULL)) {
                var14 = var17;
            }
            0;
            if null == null continue;
            return ((0x25 ^ 0x37 ^ (0xD0 ^ 0x98)) & (0x52 ^ 5 ^ (0xA3 ^ 0xAE) ^ -1)) != 0;
        }
        if (p.var19(var14)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[p.var2[0]] = var2[2];
        nArray[p.var2[3]] = var2[4];
        nArray[p.var2[5]] = var2[6];
        nArray[p.var2[7]] = var2[8];
        nArray[p.var2[9]] = var2[10];
        var15 = TileObjects.getNearest((int[])nArray);
        if (p.var19(var15)) {
            return var2[0];
        }
        var3_3.interact(var1[var2[0]]);
        this.sleep(var2[3]);
        return var2[3];
    }

    private static void var20() {
        var1 = new String[var2[3]];
        p.var1[p.var2[0]] = "Check";
    }

    private static boolean var18(Object object, Object object2) {
        return object == object2;
    }

    static {
        p.var9();
        p.var20();
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    @Inject
    public CheckingNetTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }
}

