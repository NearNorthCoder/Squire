/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum16;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Returning to Zul'Andra", priority=10, blocking=true)
public class ReturningToZulandraTask
extends ZulrahTaskBase {

    private static boolean llIIlIIIIllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    protected ReturningToZulandraTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

        return String.valueOf(var1);
    }

    static {
        ah.llIIlIIIIllIlIl();
        ah.llIIlIIIIllIlII();
    }

    private static boolean llIIlIIIIlllIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIIlIIIIlllIll(Object object) {
        return object == null;
    }

    private static boolean llIIlIIIIlllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIIlllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static void llIIlIIIIllIlII() {
        lIllIlIlllIlI = new String[lIllIlIlllIll[4]];
        ah.lIllIlIlllIlI[ah.lIllIlIlllIll[0]] = "Yes";
        ah.lIllIlIlllIlI[ah.lIllIlIlllIll[1]] = "Read";
        ah.lIllIlIlllIlI[ah.lIllIlIlllIll[3]] = "Eat";
    }

    private static boolean llIIlIIIIllllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var3_3;
        int var2;
        int n2;
        ah var3;
        int n3 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIlIlllIll[1]];
            stringArray[ah.lIllIlIlllIll[0]] = lIllIlIlllIlI[lIllIlIlllIll[3]];
            return item.hasAction(stringArray);
        });
        if (!ah.llIIlIIIIllIllI(n3, this.aC.multiple()) || ah.llIIlIIIIllIlll(this.aC.multiple())) {
            return lIllIlIlllIll[0];
        }
        if (!ah.llIIlIIIIllIlll(Inventory.contains(item -> item.getName().startsWith(this.aC.cure().k())) ? 1 : 0) || !ah.llIIlIIIIlllIII((Object)var3.aC.cure(), (Object)o.CURE_SELF) || ah.llIIlIIIIlllIIl((Object)var3.aC.cure(), (Object)o.IGNORE)) {
            n2 = lIllIlIlllIll[1];

            if (((0x3E ^ 5) & ~(0x8B ^ 0xB0)) != 0) {
                return false;
            }
        } else {
            n2 = lIllIlIlllIll[0];
        }
        if (ah.llIIlIIIIllIlll(var2 = n2)) {
            return lIllIlIlllIll[0];
        }
        if (ah.llIIlIIIIlllIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIllIlIlllIll[1]];
            stringArray[ah.lIllIlIlllIll[0]] = lIllIlIlllIlI[lIllIlIlllIll[0]];
            Dialog.chooseOption((String[])stringArray);

            return lIllIlIlllIll[1];
        }
        int[] nArray = new int[lIllIlIlllIll[1]];
        nArray[ah.lIllIlIlllIll[0]] = lIllIlIlllIll[2];
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if (ah.llIIlIIIIlllIll(var4)) {
            return lIllIlIlllIll[0];
        }
        var3_3.interact(lIllIlIlllIlI[lIllIlIlllIll[1]]);
        return lIllIlIlllIll[1];
    }
}

