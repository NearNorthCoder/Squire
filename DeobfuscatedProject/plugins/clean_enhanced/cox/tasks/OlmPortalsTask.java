/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Olm Portals", priority=25000, blocking=true)
public class OlmPortalsTask
extends CoxManager {

    static {
        aP.var2();
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    @Inject
    protected OlmPortalsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aP var3;
        if ((this.ct( == 0) ? 1 : 0)) {
            return 0;
        }
        List<WorldPoint> var4 = var3.ed.ao();
        if ((var3.ed.ao( != 0).isEmpty() ? 1 : 0)) {
            return 0;
        }
        if ((var3.bS.getWorldLocation( != 0).equals((Object)var4.get(0)) ? 1 : 0)) {
            return 1;
        }
        Movement.setDestination((WorldPoint)((WorldPoint)var1_1.get(0)));
        return 1;
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
}

