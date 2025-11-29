/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.woodcutting.tasks.GameEnum;

@Singleton
@TaskDesc(name="Tracking the tree", priority=420)
public class TrackingTheTreeTask
extends Task {
    private  long chopTimestamp;
    private final  SquireWoodcutterConfig M;
    
    private static final  List<i> N;

    private static boolean llIIIlIIlIlIIIl(int n) {
        return n == 0;
    }

    static {
        l.llIIIlIIlIIllll();
        l.llIIIlIIlIIlllI();
        N = new ArrayList<i>();
    }

    private static boolean llIIIlIIlIlIIlI(Object object) {
        return object == null;
    }

    public static i x() {
        if (l.llIIIlIIlIlIIII(N.isEmpty() ? 1 : 0)) {
            return null;
        }
        return N.get(lIllIIIlIIIII[0]);
    }

    @Inject
    public TrackingTheTreeTask(SquireWoodcutterConfig squireWoodcutterConfig) {
        this.M = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIlIlIlII(int n, int n2) {
        return n == n2;
    }

        return String.valueOf(var1);
    }

    private static boolean llIIIlIIlIlIIll(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIlIlIlIl(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_5;
        l var2;
        if (!l.llIIIlIIlIlIIII(this.M.fastTickChop() ? 1 : 0) || l.llIIIlIIlIlIIII(this.M.bank() ? 1 : 0)) {
            return lIllIIIlIIIII[0];
        }
        List var3 = TileObjects.getAll(tileObject -> tileObject.getName().contains(this.M.tree().r()));
        i var4 = null;
        if (l.llIIIlIIlIlIIIl(N.isEmpty() ? 1 : 0)) {
            var4 = N.get(lIllIIIlIIIII[0]);
        }
        if (l.llIIIlIIlIlIIlI(var3) && l.llIIIlIIlIlIIll(var4)) {
            WorldPoint var5 = var4.w().getNearest();
            Movement.setDestination((WorldPoint)var5);
            return lIllIIIlIIIII[1];
        }
        String[] stringArray = new String[lIllIIIlIIIII[1]];
        stringArray[l.lIllIIIlIIIII[0]] = lIllIIIIlllll[lIllIIIlIIIII[0]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray);
        if (l.llIIIlIIlIlIIlI(var5)) {
            N.clear();
            return lIllIIIlIIIII[0];
        }
        Object var6 = N.iterator();
        while (l.llIIIlIIlIlIIII(var6.hasNext() ? 1 : 0)) {
            i var7 = var6.next();
            TileObject var8 = TileObjects.getNearest(tileObject -> {
                int n;
                if (l.llIIIlIIlIlIIII(tileObject.getName().contains(this.M.tree().r()) ? 1 : 0) && l.llIIIlIIlIlIlII(tileObject.getId(), var7.v())) {
                    n = lIllIIIlIIIII[1];

                    }
                } else {
                    n = lIllIIIlIIIII[0];
                }
                return n != 0;
            });
            if (l.llIIIlIIlIlIIlI(var8)) {

                if (2 != 1) continue;
                return ((0x77 ^ 0x16 ^ (0x52 ^ 0x70)) & (9 + 7 - -132 + 67 ^ 97 + 110 - 77 + 18 ^ -1)) != 0;
            }
            N.remove((Object)var7);

            return lIllIIIlIIIII[0];
        }
        var6 = i.b(var5);
        if (l.llIIIlIIlIlIIII(N.contains(var6) ? 1 : 0)) {
            return lIllIIIlIIIII[0];
        }
        N.add((GameEnum) ar4_5);

        return lIllIIIlIIIII[1];
    }

    private static boolean llIIIlIIlIlIIII(int n) {
        return n != 0;
    }

    private static void llIIIlIIlIIlllI() {
        lIllIIIIlllll = new String[lIllIIIlIIIII[1]];
        l.lIllIIIIlllll[l.lIllIIIlIIIII[0]] = "Tree stump";
    }
}

