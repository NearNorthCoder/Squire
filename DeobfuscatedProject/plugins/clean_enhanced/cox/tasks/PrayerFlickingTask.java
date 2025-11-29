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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Prayer Flicking", priority=21000, blocking=true)
public class PrayerFlickingTask
extends CoxManager {

    static {
        aS.var2();
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

    @Inject
    protected PrayerFlickingTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private  boolean d(List list, WorldPoint worldPoint) {
        int n2;
        if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (list.contains(worldPoint == 0) ? 1 : 0) && (this.ed.ap( == 0).contains(this.bS.getWorldLocation()) ? 1 : 0)) {
            n2 = 0;
            0;
            if (((0x11 ^ 0x3C ^ (0x9D ^ 0xBD)) & (125 + 7 - 16 + 23 ^ 109 + 33 - 18 + 10 ^ -1)) != ((0x3D ^ 0x71 ^ (0x68 ^ 0x3E)) & (0x1B ^ 0x26 ^ (0x70 ^ 0x57) ^ -1))) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    private WorldPoint dW() {
        switch (this.ed.aI()) {
            case 0: {
                aS var3;
                return var3.dP();
            }
            case 1: {
                aS var3;
                return var3.dN();
            }
        }
        return this.dq().getWorldLocation().dy(5);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aS var4;
        if ((this.ct( == 0) ? 1 : 0)) {
            if ((Prayers.anyActive( != 0) ? 1 : 0)) {
                Prayers.disableAll();
                return 0;
            }
            return 1;
        }
        if ((var4.ed.at( != 0) ? 1 : 0)) {
            return 1;
        }
        ArrayList var5 = new ArrayList();
        Iterator var6 = var4.ec.getGraphicsObjects().iterator();
        while ((var6.hasNext( != 0) ? 1 : 0)) {
            GraphicsObject var7 = (GraphicsObject)var6.next();
            if (!(var7.getId() != 2) || (var7.getId() == 3)) {
                WorldPoint var8 = WorldPoint.fromLocal((Client)var4.ec, (LocalPoint)var7.getLocation());
                List var9 = var8.createWorldArea(0).toWorldPointList();
                var5.addAll(var9);
                0;
            }
            0;
            if ((0x78 ^ 0x16 ^ (0xD ^ 0x67)) > 0) continue;
            return ((0x2F ^ 0x13 ^ (0x9B ^ 0xAB)) & (0xBA ^ 0xA4 ^ (9 ^ 0x1B) ^ -1)) != 0;
        }
        if ((var5.isEmpty( != 0) ? 1 : 0)) {
            if ((var4.ed.ax( == null))) {
                if ((var4.bS.getWorldLocation( != 0).equals((Object)var4.dW()) ? 1 : 0)) {
                    return 1;
                }
                Movement.setDestination((WorldPoint)var4.dW());
                return 0;
            }
            return 1;
        }
        if ((var5.contains(var4.bS.getWorldLocation( == 0)) ? 1 : 0) && (var4.ed.ap( == 0).contains(var4.bS.getWorldLocation()) ? 1 : 0)) {
            return 1;
        }
        List list = this.bS.getWorldLocation().createWorldArea(4).toWorldPointList();
        WorldPoint worldPoint = this.dW();
        WorldPoint worldPoint2 = list.stream().filter(arg_0 -> this.d((List)var1_1, arg_0)).min(Comparator.comparingInt(object -> ((WorldPoint)object).distanceTo((Locatable)this.bS)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint))).orElse(null);
        Movement.setDestination((WorldPoint)worldPoint2);
        return 0;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }
}

