/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum32;

@TaskDesc(name="Depositing seeds", priority=100, blocking=true)
public class DepositingSeedsTask
extends Task {
    private static final  int ah;
    private final  Client ak;
    
    private final  SquireThievingConfig ai;
    private final  SquireThieving aj;

    private static boolean lIllIIllIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIllIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIllIIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIllIIllIIlIIll() {
        lIIlllIIllIll = new String[lIIlllIIlllII[2]];
        x.lIIlllIIllIll[x.lIIlllIIlllII[0]] = "Open";
    }

    static {
        x.lIllIIllIIlIlII();
        x.lIllIIllIIlIIll();
        ah = lIIlllIIlllII[1];
    }

    private static boolean lIllIIllIIlIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIllIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        x var1;
        if (!x.lIllIIllIIlIlIl((Object)this.ai.method(), (Object)b.PICKPOCKETING) || x.lIllIIllIIlIllI((Object)this.ai.pickpocketTarget(), (Object)f.MASTER_FARMER)) {
            return lIIlllIIlllII[0];
        }
        if (x.lIllIIllIIlIlll(var1.ai.depositSeedVault() ? 1 : 0)) {
            return lIIlllIIlllII[0];
        }
        if (x.lIllIIllIIlIlll(Inventory.isFull() ? 1 : 0)) {
            return lIIlllIIlllII[0];
        }
        Widget var2 = var1.ak.getWidget(lIIlllIIlllII[1]);
        if (!x.lIllIIllIIllIII(var2) || x.lIllIIllIIllIIl(var2.isHidden() ? 1 : 0)) {
            int[] nArray = new int[lIIlllIIlllII[2]];
            nArray[x.lIIlllIIlllII[0]] = lIIlllIIlllII[3];
            TileObject var3 = TileObjects.getNearest((int[])nArray);
            if (x.lIllIIllIIllIlI(var3)) {
                return lIIlllIIlllII[0];
            }
            var3.interact(lIIlllIIllIll[lIIlllIIlllII[0]]);
            var1.sleep(lIIlllIIlllII[4]);
            return lIIlllIIlllII[2];
        }
        var1_1.interact(lIIlllIIlllII[0]);
        this.sleep(lIIlllIIlllII[5]);
        return lIIlllIIlllII[2];
    }

    private static boolean lIllIIllIIllIlI(Object object) {
        return object == null;
    }

    @Inject
    public DepositingSeedsTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving, Client client) {
        this.ai = squireThievingConfig;
        this.aj = squireThieving;
        this.ak = client;
    }

        return String.valueOf(var4);
    }

    private static boolean lIllIIllIIllIII(Object object) {
        return object != null;
    }
}

