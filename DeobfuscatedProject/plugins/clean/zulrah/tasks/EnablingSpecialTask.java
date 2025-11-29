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

import gg.squire.zulrah.tasks.ZulrahTaskBase;
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
extends ZulrahTaskBase {

    @Override
    public boolean ac() {
        if (Y.llIIlIIllIlIIII(Combat.isSpecEnabled() ? 1 : 0)) {
            return lIllIlllIllIl[0];
        }
        Item var1 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (Y.llIIlIIllIlIIIl(var1)) {
            return lIllIlllIllIl[0];
        }
        if (Y.llIIlIIllIlIIlI(var1.getId(), lIllIlllIllIl[1])) {
            return lIllIlllIllIl[0];
        }
        if (!Y.llIIlIIllIlIIll(Combat.getMissingHealth(), lIllIlllIllIl[2]) || Y.llIIlIIllIlIlII(Combat.getSpecEnergy(), lIllIlllIllIl[3])) {
            return lIllIlllIllIl[0];
        }
        Combat.toggleSpec();
        return lIllIlllIllIl[4];
    }

    private static boolean llIIlIIllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIllIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected EnablingSpecialTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static boolean llIIlIIllIlIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIllIlIIIl(Object object) {
        return object == null;
    }

    private static boolean llIIlIIllIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        Y.llIIlIIllIIllll();
    }
}

