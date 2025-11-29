/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Prayer Flicking", priority=21000, blocking=true)
public class aS
extends aR {
    private static /* synthetic */ int[] lIlIIlllIIIl;

    static {
        aS.llIllIlIlllIlI();
    }

    private static boolean llIllIlIllllIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllIlIllllII(int n2) {
        return n2 != 0;
    }

    private static void llIllIlIlllIlI() {
        lIlIIlllIIIl = new int[6];
        aS.lIlIIlllIIIl[0] = " ".length();
        aS.lIlIIlllIIIl[1] = (0xE4 ^ 0xA2) & ~(0x41 ^ 7);
        aS.lIlIIlllIIIl[2] = 0xFFFFFFA7 & 0x5FF;
        aS.lIlIIlllIIIl[3] = -(0xFFFFB6CF & 0x7B31) & (0xFFFFFF5E & 0x37EF);
        aS.lIlIIlllIIIl[4] = "  ".length();
        aS.lIlIIlllIIIl[5] = 0x9F ^ 0xB7 ^ (0x3D ^ 0x1F);
    }

    private static boolean llIllIlIlllIll(int n2) {
        return n2 == 0;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aS.llIllIlIllllll(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }

    private static boolean llIllIlIlllllI(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected aS(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private /* synthetic */ boolean d(List list, WorldPoint worldPoint) {
        int n2;
        if (aS.llIllIlIllllII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aS.llIllIlIlllIll(list.contains(worldPoint) ? 1 : 0) && aS.llIllIlIlllIll(this.ed.ap().contains(this.bS.getWorldLocation()) ? 1 : 0)) {
            n2 = lIlIIlllIIIl[0];
            "".length();
            if (((0x11 ^ 0x3C ^ (0x9D ^ 0xBD)) & (125 + 7 - 16 + 23 ^ 109 + 33 - 18 + 10 ^ -" ".length())) != ((0x3D ^ 0x71 ^ (0x68 ^ 0x3E)) & (0x1B ^ 0x26 ^ (0x70 ^ 0x57) ^ -" ".length()))) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIlIIlllIIIl[1];
        }
        return n2 != 0;
    }

    private WorldPoint dW() {
        switch (this.ed.aI()) {
            case 0: {
                aS lllllllllllllllIllIlIlllIllIlIIl;
                return lllllllllllllllIllIlIlllIllIlIIl.dP();
            }
            case 1: {
                aS lllllllllllllllIllIlIlllIllIlIIl;
                return lllllllllllllllIllIlIlllIllIlIIl.dN();
            }
        }
        return this.dq().getWorldLocation().dy(lIlIIlllIIIl[5]);
    }

    private static boolean llIllIlIllllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aS lllllllllllllllIllIlIlllIlllIIII;
        if (aS.llIllIlIlllIll(this.ct() ? 1 : 0)) {
            if (aS.llIllIlIllllII(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIIlllIIIl[0];
            }
            return lIlIIlllIIIl[1];
        }
        if (aS.llIllIlIllllII(lllllllllllllllIllIlIlllIlllIIII.ed.at() ? 1 : 0)) {
            return lIlIIlllIIIl[1];
        }
        ArrayList lllllllllllllllIllIlIlllIllIllll = new ArrayList();
        Iterator lllllllllllllllIllIlIlllIllIlllI = lllllllllllllllIllIlIlllIlllIIII.ec.getGraphicsObjects().iterator();
        while (aS.llIllIlIllllII(lllllllllllllllIllIlIlllIllIlllI.hasNext() ? 1 : 0)) {
            GraphicsObject lllllllllllllllIllIlIlllIllIllIl = (GraphicsObject)lllllllllllllllIllIlIlllIllIlllI.next();
            if (!aS.llIllIlIllllIl(lllllllllllllllIllIlIlllIllIllIl.getId(), lIlIIlllIIIl[2]) || aS.llIllIlIlllllI(lllllllllllllllIllIlIlllIllIllIl.getId(), lIlIIlllIIIl[3])) {
                WorldPoint lllllllllllllllIllIlIlllIllIllII = WorldPoint.fromLocal((Client)lllllllllllllllIllIlIlllIlllIIII.ec, (LocalPoint)lllllllllllllllIllIlIlllIllIllIl.getLocation());
                List lllllllllllllllIllIlIlllIllIlIll = lllllllllllllllIllIlIlllIllIllII.createWorldArea(lIlIIlllIIIl[0]).toWorldPointList();
                lllllllllllllllIllIlIlllIllIllll.addAll(lllllllllllllllIllIlIlllIllIlIll);
                "".length();
            }
            "".length();
            if ((0x78 ^ 0x16 ^ (0xD ^ 0x67)) > 0) continue;
            return ((0x2F ^ 0x13 ^ (0x9B ^ 0xAB)) & (0xBA ^ 0xA4 ^ (9 ^ 0x1B) ^ -" ".length())) != 0;
        }
        if (aS.llIllIlIllllII(lllllllllllllllIllIlIlllIllIllll.isEmpty() ? 1 : 0)) {
            if (aS.llIllIlIllllll(lllllllllllllllIllIlIlllIlllIIII.ed.ax())) {
                if (aS.llIllIlIllllII(lllllllllllllllIllIlIlllIlllIIII.bS.getWorldLocation().equals((Object)lllllllllllllllIllIlIlllIlllIIII.dW()) ? 1 : 0)) {
                    return lIlIIlllIIIl[1];
                }
                Movement.setDestination((WorldPoint)lllllllllllllllIllIlIlllIlllIIII.dW());
                return lIlIIlllIIIl[0];
            }
            return lIlIIlllIIIl[1];
        }
        if (aS.llIllIlIlllIll(lllllllllllllllIllIlIlllIllIllll.contains(lllllllllllllllIllIlIlllIlllIIII.bS.getWorldLocation()) ? 1 : 0) && aS.llIllIlIlllIll(lllllllllllllllIllIlIlllIlllIIII.ed.ap().contains(lllllllllllllllIllIlIlllIlllIIII.bS.getWorldLocation()) ? 1 : 0)) {
            return lIlIIlllIIIl[1];
        }
        List list = this.bS.getWorldLocation().createWorldArea(lIlIIlllIIIl[4]).toWorldPointList();
        WorldPoint worldPoint = this.dW();
        WorldPoint worldPoint2 = list.stream().filter(arg_0 -> this.d((List)var1_1, arg_0)).min(Comparator.comparingInt(object -> ((WorldPoint)object).distanceTo((Locatable)this.bS)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint))).orElse(null);
        Movement.setDestination((WorldPoint)worldPoint2);
        return lIlIIlllIIIl[0];
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }
}

