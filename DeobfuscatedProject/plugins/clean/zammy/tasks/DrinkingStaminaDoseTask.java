/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.LHelper;
import gg.squire.zammy.tasks.MovingToNextTileTask;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking stamina dose", priority=8)
public class DrinkingStaminaDoseTask
extends Task {
    
    private final  f U;
    private final  l S;
    private final  c T;
    private final  u V;

    private static boolean llIIIllIlIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        q.llIIIllIIllllII();
        q.llIIIllIIlllIll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var1;
        if (!q.llIIIllIIllllIl(this.S.B() ? 1 : 0) || q.llIIIllIIlllllI(this.S.G() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        if (!q.llIIIllIIllllIl(var1.S.A() ? 1 : 0) || q.llIIIllIIllllll(var1.T.e())) {
            return lIllIIllIIIlI[0];
        }
        if (!q.llIIIllIlIIIIII(Movement.getRunEnergy(), lIllIIllIIIlI[1]) || q.llIIIllIIllllIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        if (q.llIIIllIIllllIl(var1.V.O() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        Item var2 = Inventory.getFirst(item -> item.getName().startsWith(lIllIIllIIIIl[lIllIIllIIIlI[3]]));
        if (!q.llIIIllIIllllll(var2) || q.llIIIllIIlllllI(var1.U.u() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        var1_1.interact(lIllIIllIIIIl[lIllIIllIIIlI[0]]);
        this.U.r();
        this.sleep(lIllIIllIIIlI[2]);
        return lIllIIllIIIlI[3];
    }

    private static boolean llIIIllIIllllll(Object object) {
        return object != null;
    }

    private static boolean llIIIllIIllllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public DrinkingStaminaDoseTask(l l2, c c2, f f2, u u2) {
        this.S = l2;
        this.T = c2;
        this.U = f2;
        this.V = u2;
    }

    private static void llIIIllIIlllIll() {
        lIllIIllIIIIl = new String[lIllIIllIIIlI[4]];
        q.lIllIIllIIIIl[q.lIllIIllIIIlI[0]] = "Drink";
        q.lIllIIllIIIIl[q.lIllIIllIIIlI[3]] = "Stamina";
    }

    private static boolean llIIIllIIlllllI(int n2) {
        return n2 == 0;
    }
}

