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

@TaskDesc(name="Checking Snare", priority=1)
public class CheckingSnareTask
extends HunterTaskBase {

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var11;
        Map<WorldPoint, f> map = this.y().h();
        if (!A.var4(map.isEmpty() ? 1 : 0) || !A.var4(Players.getLocal().isAnimating() ? 1 : 0) || A.var12(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        f var13 = null;
        TileObject var14 = var11.keySet().iterator();
        while (A.var12(var14.hasNext() ? 1 : 0)) {
            WorldPoint var15 = (WorldPoint)var14.next();
            f var16 = (f)var11.get(var15);
            if (A.var3((Object)var16.q(), (Object)g.FULL)) {
                var13 = var16;
            }
            0;
            if (2 > ((0x13 ^ 0x14) & ~(0x76 ^ 0x71))) continue;
            return ((0x25 ^ 0x2E) & ~(0x5C ^ 0x57)) != 0;
        }
        if (A.var17(var13)) {
            return var1[0];
        }
        var14 = TileObjects.getNearest(tileObject -> {
            boolean bl;
            if (!A.var18(tileObject.getId(), var1[2]) || !A.var18(tileObject.getId(), var1[3]) || A.var19(tileObject.getId(), var1[4])) {
                bl = var1[1];
                0;
                if (((0x92 ^ 0xC4) & ~(0x38 ^ 0x6E)) >= 2) {
                    return ((0x22 ^ 0xE) & ~(0xA ^ 0x26)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
        if (A.var17(var14)) {
            return var1[0];
        }
        var3_3.interact(var2[var1[0]]);
        return var1[1];
    }

    private static boolean var19(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    @Inject
    public CheckingSnareTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static void var20() {
        var2 = new String[var1[1]];
        A.var2[A.var1[0]] = "Check";
    }

    private static boolean var18(int n2, int n3) {
        return n2 != n3;
    }

    static {
        A.var21();
        A.var20();
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    private static void var21() {
        var1 = new int[6];
        A.var1[0] = (0x4D ^ 0xC ^ (0xAE ^ 0xB3)) & (0x1F ^ 0x53 ^ (0xA0 ^ 0xB0) ^ -1);
        A.var1[1] = 1;
        A.var1[2] = -(0xFFFFF7EF & 0x5B1A) & (0xFFFFFFCD & 0x77BF);
        A.var1[3] = 0xFFFFAD9F & 0x76FD;
        A.var1[4] = -(0xFFFFD15F & 0x7EE5) & (0xFFFFFEF7 & 0x75EF);
        A.var1[5] = 2;
    }
}

