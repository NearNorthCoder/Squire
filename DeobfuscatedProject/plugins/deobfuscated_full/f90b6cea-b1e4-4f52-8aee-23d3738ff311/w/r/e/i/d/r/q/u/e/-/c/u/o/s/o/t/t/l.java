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
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

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
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.i;

@Singleton
/* TASK: Tracking the tree -> TrackingthetreeTask */
@TaskDesc(name="Tracking the tree", priority=420)
public class l
extends Task {
    private /* synthetic */ long chopTimestamp;
    private final /* synthetic */ SquireWoodcutterConfig M;
    private static /* synthetic */ int[] lIllIIIlIIIII;
    private static final /* synthetic */ List<i> N;
    private static /* synthetic */ String[] lIllIIIIlllll;

    private static void llIIIlIIlIIllll() {
        lIllIIIlIIIII = new int[2];
        l.lIllIIIlIIIII[0] = (0x69 ^ 0x7C) & ~(0x71 ^ 0x64);
        l.lIllIIIlIIIII[1] = 1;
    }

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
    public l(SquireWoodcutterConfig squireWoodcutterConfig) {
        this.M = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIlIlIlII(int n, int n2) {
        return n == n2;
    }

    private static String llIIIlIIlIIllIl(String var6, String var10) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var2 = var10.toCharArray();
        int var9 = lIllIIIlIIIII[0];
        char[] var15 = var6.toCharArray();
        int var1 = var15.length;
        int var7 = lIllIIIlIIIII[0];
        while (l.llIIIlIIlIlIlIl(var7, var1)) {
            char var5 = var15[var7];
            var14.append((char)(var5 ^ var2[var9 % var2.length]));
            0;
            ++var9;
            ++var7;
            0;
            if ((0x71 ^ 0x75) > ((0xFA ^ 0xB6) & ~(0xE1 ^ 0xAD))) continue;
            return null;
        }
        return String.valueOf(var14);
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
        l llllllllllllllIllIIllIIIlIlIIIII;
        if (!l.llIIIlIIlIlIIII(this.M.fastTickChop() ? 1 : 0) || l.llIIIlIIlIlIIII(this.M.bank() ? 1 : 0)) {
            return lIllIIIlIIIII[0];
        }
        List var3 = TileObjects.getAll(tileObject -> tileObject.getName().contains(this.M.tree().r()));
        i var4 = null;
        if (l.llIIIlIIlIlIIIl(N.isEmpty() ? 1 : 0)) {
            var4 = N.get(lIllIIIlIIIII[0]);
        }
        if (l.llIIIlIIlIlIIlI(var3) && l.llIIIlIIlIlIIll(var4)) {
            WorldPoint var11 = var4.w().getNearest();
            Movement.setDestination((WorldPoint)var11);
            return lIllIIIlIIIII[1];
        }
        String[] stringArray = new String[lIllIIIlIIIII[1]];
        stringArray[l.lIllIIIlIIIII[0]] = lIllIIIIlllll[lIllIIIlIIIII[0]];
        TileObject var11 = TileObjects.getNearest((String[])stringArray);
        if (l.llIIIlIIlIlIIlI(var11)) {
            N.clear();
            return lIllIIIlIIIII[0];
        }
        Object var13 = N.iterator();
        while (l.llIIIlIIlIlIIII(var13.hasNext() ? 1 : 0)) {
            i var8 = var13.next();
            TileObject var12 = TileObjects.getNearest(tileObject -> {
                int n;
                if (l.llIIIlIIlIlIIII(tileObject.getName().contains(this.M.tree().r()) ? 1 : 0) && l.llIIIlIIlIlIlII(tileObject.getId(), var8.v())) {
                    n = lIllIIIlIIIII[1];
                    0;
                    
                    }
                } else {
                    n = lIllIIIlIIIII[0];
                }
                return n != 0;
            });
            if (l.llIIIlIIlIlIIlI(var12)) {
                0;
                if (2 != 1) continue;
                return ((0x77 ^ 0x16 ^ (0x52 ^ 0x70)) & (9 + 7 - -132 + 67 ^ 97 + 110 - 77 + 18 ^ -1)) != 0;
            }
            N.remove((Object)var8);
            0;
            return lIllIIIlIIIII[0];
        }
        var13 = i.b(var11);
        if (l.llIIIlIIlIlIIII(N.contains(var13) ? 1 : 0)) {
            return lIllIIIlIIIII[0];
        }
        N.add((i)var4_5);
        0;
        return lIllIIIlIIIII[1];
    }

    private static boolean llIIIlIIlIlIIII(int n) {
        return n != 0;
    }

    private static void llIIIlIIlIIlllI() {
        lIllIIIIlllll = new String[lIllIIIlIIIII[1]];
        l.lIllIIIIlllll[l.lIllIIIlIIIII[0]] = l."Tree stump";
    }
}

