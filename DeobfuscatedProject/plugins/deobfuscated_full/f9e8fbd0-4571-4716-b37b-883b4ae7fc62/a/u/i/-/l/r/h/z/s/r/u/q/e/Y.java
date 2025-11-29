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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;

/* TASK: Enabling special -> EnablingspecialTask */
@TaskDesc(name="Enabling special", priority=50)
public class Y
extends ad {
    private static /* synthetic */ int[] lIllIlllIllIl;

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
    protected Y(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static boolean llIIlIIllIlIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIllIlIIIl(Object object) {
        return object == null;
    }

    private static void llIIlIIllIIllll() {
        lIllIlllIllIl = new int[5];
        Y.lIllIlllIllIl[0] = (1 ^ (0x92 ^ 0x85)) & (16 + 92 - 59 + 112 ^ 138 + 180 - 233 + 98 ^ -1);
        Y.lIllIlllIllIl[1] = 0xFFFFF7FE & 0x3A7F;
        Y.lIllIlllIllIl[2] = 0x48 ^ 0x35 ^ (0x45 ^ 0x32);
        Y.lIllIlllIllIl[3] = 0x80 ^ 0x91 ^ (0xE3 ^ 0xC0);
        Y.lIllIlllIllIl[4] = 1;
    }

    private static boolean llIIlIIllIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        Y.llIIlIIllIIllll();
    }
}

