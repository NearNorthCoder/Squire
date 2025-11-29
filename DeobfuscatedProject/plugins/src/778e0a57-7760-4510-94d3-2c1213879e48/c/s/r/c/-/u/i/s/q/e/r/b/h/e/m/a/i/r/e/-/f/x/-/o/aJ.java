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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Dodging Fallig Crystals", priority=21000)
public class aJ
extends aR {
    private static /* synthetic */ int[] lIlIlIIlIIlI;

    private static /* synthetic */ boolean d(List list, WorldPoint worldPoint) {
        int n2;
        if (aJ.llIlllIIllIIII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aJ.llIlllIIlIllll(list.contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIlIIlIIlI[2];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0xA4 ^ 0x8F) & ~(0x98 ^ 0xB3)) != 0;
            }
        } else {
            n2 = lIlIlIIlIIlI[0];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aJ lllllllllllllllIllIlIIllIIlIIlll;
        if (aJ.llIlllIIlIllll(this.ct() ? 1 : 0)) {
            return lIlIlIIlIIlI[0];
        }
        ArrayList lllllllllllllllIllIlIIllIIlIIllI = new ArrayList();
        Iterator lllllllllllllllIllIlIIllIIlIIlIl = lllllllllllllllIllIlIIllIIlIIlll.ec.getGraphicsObjects().iterator();
        while (aJ.llIlllIIllIIII(lllllllllllllllIllIlIIllIIlIIlIl.hasNext() ? 1 : 0)) {
            GraphicsObject lllllllllllllllIllIlIIllIIlIIlII = (GraphicsObject)lllllllllllllllIllIlIIllIIlIIlIl.next();
            if (aJ.llIlllIIllIIIl(lllllllllllllllIllIlIIllIIlIIlII.getId(), lIlIlIIlIIlI[1])) {
                WorldPoint lllllllllllllllIllIlIIllIIlIIIll = WorldPoint.fromLocal((Client)lllllllllllllllIllIlIIllIIlIIlll.ec, (LocalPoint)lllllllllllllllIllIlIIllIIlIIlII.getLocation());
                List lllllllllllllllIllIlIIllIIlIIIlI = lllllllllllllllIllIlIIllIIlIIIll.createWorldArea(lIlIlIIlIIlI[2]).toWorldPointList();
                lllllllllllllllIllIlIIllIIlIIllI.addAll(lllllllllllllllIllIlIIllIIlIIIlI);
                "".length();
            }
            "".length();
            if (" ".length() > ((4 ^ 0x11) & ~(0xC ^ 0x19))) continue;
            return ((0x38 ^ 0xF) & ~(0x13 ^ 0x24)) != 0;
        }
        if (!aJ.llIlllIIlIllll(lllllllllllllllIllIlIIllIIlIIllI.isEmpty() ? 1 : 0) || aJ.llIlllIIlIllll(lllllllllllllllIllIlIIllIIlIIllI.contains(lllllllllllllllIllIlIIllIIlIIlll.bS.getWorldLocation()) ? 1 : 0)) {
            return lIlIlIIlIIlI[0];
        }
        List list = this.bS.getWorldLocation().createWorldArea(lIlIlIIlIIlI[3]).toWorldPointList();
        WorldPoint worldPoint2 = list.stream().filter(arg_0 -> aJ.d((List)var1_1, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        return lIlIlIIlIIlI[2];
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aJ.llIlllIIllIIlI(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }

    static {
        aJ.llIlllIIlIlllI();
    }

    private static void llIlllIIlIlllI() {
        lIlIlIIlIIlI = new int[4];
        aJ.lIlIlIIlIIlI[0] = (127 + 33 - 109 + 84 ^ 89 + 0 - 82 + 150) & (0x72 ^ 0x74 ^ (0x7A ^ 0x66) ^ -" ".length());
        aJ.lIlIlIIlIIlI[1] = -(0xFFFF9AF7 & 0x6F3B) & (0xFFFFEFFB & 0x1F7F);
        aJ.lIlIlIIlIIlI[2] = " ".length();
        aJ.lIlIlIIlIIlI[3] = 0xA ^ 0x46 ^ (0xD2 ^ 0x9A);
    }

    private static boolean llIlllIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlllIIlIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllIIllIIlI(Object object) {
        return object == null;
    }

    private static boolean llIlllIIllIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected aJ(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }
}

