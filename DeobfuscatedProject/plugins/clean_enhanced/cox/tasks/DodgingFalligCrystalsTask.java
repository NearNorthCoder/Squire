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

import gg.squire.cox.tasks.CoxManager;
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
extends CoxManager {

    private static  boolean d(List list, WorldPoint worldPoint) {
        int n2;
        if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (list.contains(worldPoint == 0) ? 1 : 0)) {
            n2 = 2;
            0;
            if (3 != 3) {
                return ((0xA4 ^ 0x8F) & ~(0x98 ^ 0xB3)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aJ var2;
        if ((this.ct( == 0) ? 1 : 0)) {
            return 0;
        }
        ArrayList var3 = new ArrayList();
        Iterator var4 = var2.ec.getGraphicsObjects().iterator();
        while ((var4.hasNext( != 0) ? 1 : 0)) {
            GraphicsObject var5 = (GraphicsObject)var4.next();
            if ((var5.getId() == 1)) {
                WorldPoint var6 = WorldPoint.fromLocal((Client)var2.ec, (LocalPoint)var5.getLocation());
                List var7 = var6.createWorldArea(2).toWorldPointList();
                var3.addAll(var7);
                0;
            }
            0;
            if (1 > ((4 ^ 0x11) & ~(0xC ^ 0x19))) continue;
            return ((0x38 ^ 0xF) & ~(0x13 ^ 0x24)) != 0;
        }
        if (!(var3.isEmpty( == 0) ? 1 : 0) || (var3.contains(var2.bS.getWorldLocation( == 0)) ? 1 : 0)) {
            return 0;
        }
        List list = this.bS.getWorldLocation().createWorldArea(3).toWorldPointList();
        WorldPoint worldPoint2 = list.stream().filter(arg_0 -> aJ.d((List)var1_1, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        return 2;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if prayer == null {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    static {
        aJ.var8();
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

