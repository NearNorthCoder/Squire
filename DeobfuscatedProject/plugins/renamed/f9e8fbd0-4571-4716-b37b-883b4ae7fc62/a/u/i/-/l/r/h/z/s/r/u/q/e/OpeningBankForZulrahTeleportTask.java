/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Prayers
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.P_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Opening bank for zulrah teleport -> OpeningbankforzulrahteleportTask */
@TaskDesc(name="Opening bank for zulrah teleport", priority=0x7FFFFFFD, blocking=true)
public class OpeningBankForZulrahTeleportTask
extends P_Unknown {
    private static /* synthetic */ int[] lIllIlllIlIll;

    @Override
    public boolean ac() {
        O var1;
        int[] nArray = new int[lIllIlllIlIll[0]];
        nArray[O.lIllIlllIlIll[1]] = lIllIlllIlIll[2];
        Item item = Inventory.getFirst((int[])nArray);
        if (O.llIIlIIllIIlIll(item)) {
            this.al.a(c.TRANSPORTING_ZULRAH);
            return lIllIlllIlIll[1];
        }
        if (O.llIIlIIllIIllII(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIllIlllIlIll[0];
        }
        if (O.llIIlIIllIIllII(var1.ah() ? 1 : 0)) {
            return lIllIlllIlIll[1];
        }
        if (O.llIIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
            return lIllIlllIlIll[1];
        }
        BankLocation var2 = BankLocation.getNearest();
        if (O.llIIlIIllIIllIl(var2)) {
            return lIllIlllIlIll[1];
        }
        if (O.llIIlIIllIIllII(Bank.open() ? 1 : 0)) {
            return lIllIlllIlIll[0];
        }
        if (O.llIIlIIllIIllII(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldArea)var2.getArea());
            0;
        }
        return lIllIlllIlIll[0];
    }

    private static boolean llIIlIIllIIllIl(Object object) {
        return object == null;
    }

    private static boolean llIIlIIllIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIllIIlIll(Object object) {
        return object != null;
    }

    private static void llIIlIIllIIlIlI() {
        lIllIlllIlIll = new int[3];
        O.lIllIlllIlIll[0] = 1;
        O.lIllIlllIlIll[1] = (0xF ^ 0x27) & ~(0x97 ^ 0xBF);
        O.lIllIlllIlIll[2] = -(0xFFFFFCF7 & 0x4B3E) & (0xFFFFFEFF & 0x7BBF);
    }

    static {
        O.llIIlIIllIIlIlI();
    }

    @Inject
    public O(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.BANKING);
    }
}

