/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Enter Olm Room", priority=21000, blocking=true)
public class EnterOlmRoomTask
extends CoxManager {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aI var9;
        if ((this.ct( != 0) ? 1 : 0)) {
            return 0;
        }
        if (((Object)u.bh() == (Object)u.bh()2)w.GET_OUT)) {
            return 0;
        }
        TileObject var10 = var9.dq();
        if var10 == null {
            return 0;
        }
        var1_1.interact(var2[0]);
        return 1;
    }

    @Inject
    protected EnterOlmRoomTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
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

