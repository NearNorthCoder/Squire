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

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
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

@TaskDesc(name="Dodging snowfall damage", priority=5, blocking=true)
public class j
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
        j.lIlIlllllIIll[1] = -" ".length();
        j.lIlIlllllIIll[2] = (0xD ^ 0x60 ^ (0xF4 ^ 0x9F)) & (0x3B ^ 0x1B ^ (0x8C ^ 0xAA) ^ -" ".length());
        j.lIlIlllllIIll[3] = 1 + 67 - -44 + 83 ^ 103 + 59 - -28 + 8;
        j.lIlIlllllIIll[4] = " ".length();
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
        void llllllllllllllIllIIlllIIllIllIIl;
        j llllllllllllllIllIIlllIIllIllIlI;
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        Client client = Static.getClient();
        this.O.clear();
        Iterator llllllllllllllIllIIlllIIllIlIlll = client.getGraphicsObjects().iterator();
        while (j.llIIIIllIlIIlll(llllllllllllllIllIIlllIIllIlIlll.hasNext() ? 1 : 0)) {
            void llllllllllllllIllIIlllIIllIllIII;
            GraphicsObject llllllllllllllIllIIlllIIllIlIllI = (GraphicsObject)llllllllllllllIllIIlllIIllIlIlll.next();
            if (!j.llIIIIllIlIlIII(llllllllllllllIllIIlllIIllIlIllI)) continue;
            if (j.llIIIIllIlIlIIl(llllllllllllllIllIIlllIIllIlIllI.getId(), lIlIlllllIIll[0])) {
                "".length();
                if (-"  ".length() < 0) continue;
                return ((154 + 28 - 165 + 212 ^ 24 + 64 - 38 + 114) & (0x45 ^ 0x34 ^ (4 ^ 0x34) ^ -" ".length())) != 0;
            }
            LocalPoint llllllllllllllIllIIlllIIllIlIlIl = llllllllllllllIllIIlllIIllIlIllI.getLocation();
            if (j.llIIIIllIlIlIlI(llllllllllllllIllIIlllIIllIlIlIl)) {
                "".length();
                if (-"  ".length() < 0) continue;
                return ((0xF7 ^ 0xC7 ^ (0xDF ^ 0xC7)) & (0xA ^ 0x25 ^ (0x85 ^ 0x82) ^ -" ".length())) != 0;
            }
            WorldPoint llllllllllllllIllIIlllIIllIlIlII = WorldPoint.fromLocal((Client)llllllllllllllIllIIlllIIllIllIII, (LocalPoint)llllllllllllllIllIIlllIIllIlIlIl);
            llllllllllllllIllIIlllIIllIllIlI.O.add(llllllllllllllIllIIlllIIllIlIlII);
            "".length();
            "".length();
            if ("   ".length() >= 0) continue;
            return ((0x59 ^ 0x14) & ~(0xF3 ^ 0xBE)) != 0;
        }
        if (j.llIIIIllIlIlIll(llllllllllllllIllIIlllIIllIllIlI.O.contains(llllllllllllllIllIIlllIIllIllIIl) ? 1 : 0)) {
            return llllllllllllllIllIIlllIIllIllIlI.O.contains(llllllllllllllIllIIlllIIllIllIlI.P.q().b());
        }
        llllllllllllllIllIIlllIIllIlIlll = llllllllllllllIllIIlllIIllIllIIl.dy(lIlIlllllIIll[1]);
        int llllllllllllllIllIIlllIIllIlIllI = lIlIlllllIIll[2];
        while (j.llIIIIllIlIIlll(llllllllllllllIllIIlllIIllIllIlI.O.contains(llllllllllllllIllIIlllIIllIlIlll) ? 1 : 0) && j.llIIIIllIlIllII(llllllllllllllIllIIlllIIllIlIllI, lIlIlllllIIll[3])) {
            llllllllllllllIllIIlllIIllIlIlll = llllllllllllllIllIIlllIIllIlIlll.dy(lIlIlllllIIll[1]);
            ++llllllllllllllIllIIlllIIllIlIllI;
            "".length();
            if (-"  ".length() <= 0) continue;
            return ((0xAA ^ 0x9F) & ~(0x59 ^ 0x6C)) != 0;
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

