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

    private static String llIIIlIIlIIllIl(String llllllllllllllIllIIllIIIlIIIlIIl, String llllllllllllllIllIIllIIIlIIIlIII) {
        llllllllllllllIllIIllIIIlIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIIIlIIIIlll = new StringBuilder();
        char[] llllllllllllllIllIIllIIIlIIIIllI = llllllllllllllIllIIllIIIlIIIlIII.toCharArray();
        int llllllllllllllIllIIllIIIlIIIIlIl = lIllIIIlIIIII[0];
        char[] llllllllllllllIllIIllIIIIlllllll = llllllllllllllIllIIllIIIlIIIlIIl.toCharArray();
        int llllllllllllllIllIIllIIIIllllllI = llllllllllllllIllIIllIIIIlllllll.length;
        int llllllllllllllIllIIllIIIIlllllIl = lIllIIIlIIIII[0];
        while (l.llIIIlIIlIlIlIl(llllllllllllllIllIIllIIIIlllllIl, llllllllllllllIllIIllIIIIllllllI)) {
            char llllllllllllllIllIIllIIIlIIIlIlI = llllllllllllllIllIIllIIIIlllllll[llllllllllllllIllIIllIIIIlllllIl];
            llllllllllllllIllIIllIIIlIIIIlll.append((char)(llllllllllllllIllIIllIIIlIIIlIlI ^ llllllllllllllIllIIllIIIlIIIIllI[llllllllllllllIllIIllIIIlIIIIlIl % llllllllllllllIllIIllIIIlIIIIllI.length]));
            0;
            ++llllllllllllllIllIIllIIIlIIIIlIl;
            ++llllllllllllllIllIIllIIIIlllllIl;
            0;
            if ((0x71 ^ 0x75) > ((0xFA ^ 0xB6) & ~(0xE1 ^ 0xAD))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllIIIlIIIIlll);
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
        List llllllllllllllIllIIllIIIlIIlllll = TileObjects.getAll(tileObject -> tileObject.getName().contains(this.M.tree().r()));
        i llllllllllllllIllIIllIIIlIIllllI = null;
        if (l.llIIIlIIlIlIIIl(N.isEmpty() ? 1 : 0)) {
            llllllllllllllIllIIllIIIlIIllllI = N.get(lIllIIIlIIIII[0]);
        }
        if (l.llIIIlIIlIlIIlI(llllllllllllllIllIIllIIIlIIlllll) && l.llIIIlIIlIlIIll(llllllllllllllIllIIllIIIlIIllllI)) {
            WorldPoint llllllllllllllIllIIllIIIlIIlllIl = llllllllllllllIllIIllIIIlIIllllI.w().getNearest();
            Movement.setDestination((WorldPoint)llllllllllllllIllIIllIIIlIIlllIl);
            return lIllIIIlIIIII[1];
        }
        String[] stringArray = new String[lIllIIIlIIIII[1]];
        stringArray[l.lIllIIIlIIIII[0]] = lIllIIIIlllll[lIllIIIlIIIII[0]];
        TileObject llllllllllllllIllIIllIIIlIIlllIl = TileObjects.getNearest((String[])stringArray);
        if (l.llIIIlIIlIlIIlI(llllllllllllllIllIIllIIIlIIlllIl)) {
            N.clear();
            return lIllIIIlIIIII[0];
        }
        Object llllllllllllllIllIIllIIIlIIlllII = N.iterator();
        while (l.llIIIlIIlIlIIII(llllllllllllllIllIIllIIIlIIlllII.hasNext() ? 1 : 0)) {
            i llllllllllllllIllIIllIIIlIIllIll = llllllllllllllIllIIllIIIlIIlllII.next();
            TileObject llllllllllllllIllIIllIIIlIIllIlI = TileObjects.getNearest(tileObject -> {
                int n;
                if (l.llIIIlIIlIlIIII(tileObject.getName().contains(this.M.tree().r()) ? 1 : 0) && l.llIIIlIIlIlIlII(tileObject.getId(), llllllllllllllIllIIllIIIlIIllIll.v())) {
                    n = lIllIIIlIIIII[1];
                    0;
                    if (null != null) {
                        return ((0x64 ^ 0x42) & ~(0x49 ^ 0x6F)) != 0;
                    }
                } else {
                    n = lIllIIIlIIIII[0];
                }
                return n != 0;
            });
            if (l.llIIIlIIlIlIIlI(llllllllllllllIllIIllIIIlIIllIlI)) {
                0;
                if (2 != 1) continue;
                return ((0x77 ^ 0x16 ^ (0x52 ^ 0x70)) & (9 + 7 - -132 + 67 ^ 97 + 110 - 77 + 18 ^ -1)) != 0;
            }
            N.remove((Object)llllllllllllllIllIIllIIIlIIllIll);
            0;
            return lIllIIIlIIIII[0];
        }
        llllllllllllllIllIIllIIIlIIlllII = i.b(llllllllllllllIllIIllIIIlIIlllIl);
        if (l.llIIIlIIlIlIIII(N.contains(llllllllllllllIllIIllIIIlIIlllII) ? 1 : 0)) {
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

