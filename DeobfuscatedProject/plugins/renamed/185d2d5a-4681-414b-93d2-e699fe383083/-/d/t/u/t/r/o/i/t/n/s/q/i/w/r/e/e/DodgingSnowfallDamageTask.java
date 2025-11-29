/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

/* TASK: Dodging snowfall damage -> DodgingsnowfalldamageTask */
@TaskDesc(name="Dodging snowfall damage", priority=5, blocking=true)
public class DodgingSnowfallDamageTask
extends Task {
    private static /* synthetic */ int[] lIlIlllllIIll;
    private final /* synthetic */ b P;
    private final /* synthetic */ List<WorldPoint> O;

    private static boolean llIIIIllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.llIIIIllIlIIllI();
    }

    private static boolean llIIIIllIlIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public j(b b2) {
        this.O = new ArrayList<WorldPoint>();
        this.P = b2;
    }

    private static void llIIIIllIlIIllI() {
        lIlIlllllIIll = new int[5];
        j.lIlIlllllIIll[0] = 0xFFFF85F6 & 0x7BFF;
        j.lIlIlllllIIll[1] = -1;
        j.lIlIlllllIIll[2] = (0xD ^ 0x60 ^ (0xF4 ^ 0x9F)) & (0x3B ^ 0x1B ^ (0x8C ^ 0xAA) ^ -1);
        j.lIlIlllllIIll[3] = 1 + 67 - -44 + 83 ^ 103 + 59 - -28 + 8;
        j.lIlIlllllIIll[4] = 1;
    }

    private static boolean llIIIIllIlIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIllIlIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6;
        j var1;
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        Client client = Static.getClient();
        this.O.clear();
        Iterator var2 = client.getGraphicsObjects().iterator();
        while (j.llIIIIllIlIIlll(var2.hasNext() ? 1 : 0)) {
            void var4;
            GraphicsObject var3 = (GraphicsObject)var2.next();
            if (!j.llIIIIllIlIlIII(var3)) continue;
            if (j.llIIIIllIlIlIIl(var3.getId(), lIlIlllllIIll[0])) {
                0;
                if (-2 < 0) continue;
                return ((154 + 28 - 165 + 212 ^ 24 + 64 - 38 + 114) & (0x45 ^ 0x34 ^ (4 ^ 0x34) ^ -1)) != 0;
            }
            LocalPoint var7 = var3.getLocation();
            if (j.llIIIIllIlIlIlI(var7)) {
                0;
                if (-2 < 0) continue;
                return ((0xF7 ^ 0xC7 ^ (0xDF ^ 0xC7)) & (0xA ^ 0x25 ^ (0x85 ^ 0x82) ^ -1)) != 0;
            }
            WorldPoint var5 = WorldPoint.fromLocal((Client)var4, (LocalPoint)var7);
            var1.O.add(var5);
            0;
            0;
            if (3 >= 0) continue;
            return false;
        }
        if (j.llIIIIllIlIlIll(var1.O.contains(var6) ? 1 : 0)) {
            return var1.O.contains(var1.P.q().b());
        }
        var2 = var6.dy(lIlIlllllIIll[1]);
        int var3 = lIlIlllllIIll[2];
        while (j.llIIIIllIlIIlll(var1.O.contains(var2) ? 1 : 0) && j.llIIIIllIlIllII(var3, lIlIlllllIIll[3])) {
            var2 = var2.dy(lIlIlllllIIll[1]);
            ++var3;
            0;
            if (-2 <= 0) continue;
            return false;
        }
        return lIlIlllllIIll[4];
    }

    private static boolean llIIIIllIlIlIII(Object object) {
        return object != null;
    }

    public List<WorldPoint> D() {
        return this.O;
    }

    private static boolean llIIIIllIlIlIlI(Object object) {
        return object == null;
    }
}

