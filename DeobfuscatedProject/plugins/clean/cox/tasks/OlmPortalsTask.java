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

import gg.squire.cox.tasks.CoxTaskBase;
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
extends CoxTaskBase {

    static {
        aP.llIllIllllIlIl();
    }

    private static boolean llIllIlllllIII(Object object) {
        return object == null;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIllllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIllllIlll(int n2) {
        return n2 != 0;
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
        aP var1;
        if (aP.llIllIllllIllI(this.ct() ? 1 : 0)) {
            return lIlIlIIIIlII[0];
        }
        List<WorldPoint> var2 = var1.ed.ao();
        if (aP.llIllIllllIlll(var1.ed.ao().isEmpty() ? 1 : 0)) {
            return lIlIlIIIIlII[0];
        }
        if (aP.llIllIllllIlll(var1.bS.getWorldLocation().equals((Object)var2.get(lIlIlIIIIlII[0])) ? 1 : 0)) {
            return lIlIlIIIIlII[1];
        }
        Movement.setDestination((WorldPoint)((WorldPoint)var1_1.get(lIlIlIIIIlII[0])));
        return lIlIlIIIIlII[1];
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aP.llIllIlllllIII(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);

        arrayList.addAll(list);

        return arrayList;
    }
}

