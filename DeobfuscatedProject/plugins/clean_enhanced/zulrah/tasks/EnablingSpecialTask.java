/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;

@TaskDesc(name="Enabling special", priority=50)
public class EnablingSpecialTask
extends ad {

    @Override
    public boolean ac() {
        if ((Combat.isSpecEnabled( != 0) ? 1 : 0)) {
            return 0;
        }
        Item var2 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if var2 == null {
            return 0;
        }
        if ((var2.getId() != 1)) {
            return 0;
        }
        if (!(Combat.getMissingHealth() >= 2) || (Combat.getSpecEnergy() < 3)) {
            return 0;
        }
        Combat.toggleSpec();
        return 4;
    }

    @Inject
    protected EnablingSpecialTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    static {
        Y.var3();
    }
}

