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
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
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
public class DodgingFalligCrystalsTask
extends CoxTaskBase {

    private static  boolean d(List list, WorldPoint worldPoint) {
        int n2;
        if (aJ.llIlllIIllIIII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aJ.llIlllIIlIllll(list.contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIlIIlIIlI[2];

            if (3 != 3) {
                return false;
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
        aJ var1;
        if (aJ.llIlllIIlIllll(this.ct() ? 1 : 0)) {
            return lIlIlIIlIIlI[0];
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = var1.ec.getGraphicsObjects().iterator();
        while (aJ.llIlllIIllIIII(var3.hasNext() ? 1 : 0)) {
            GraphicsObject var4 = (GraphicsObject)var3.next();
            if (aJ.llIlllIIllIIIl(var4.getId(), lIlIlIIlIIlI[1])) {
                WorldPoint var5 = WorldPoint.fromLocal((Client)var1.ec, (LocalPoint)var4.getLocation());
                List var6 = var5.createWorldArea(lIlIlIIlIIlI[2]).toWorldPointList();
                var2.addAll(var6);

            }

            if (1 > ((4 ^ 0x11) & ~(0xC ^ 0x19))) continue;
            return false;
        }
        if (!aJ.llIlllIIlIllll(var2.isEmpty() ? 1 : 0) || aJ.llIlllIIlIllll(var2.contains(var1.bS.getWorldLocation()) ? 1 : 0)) {
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

        arrayList.addAll(list);

        return arrayList;
    }

    static {
        aJ.llIlllIIlIlllI();
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
    protected DodgingFalligCrystalsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }
}

