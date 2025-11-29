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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.EHelper;
import gg.squire.bandos.tasks.FHelper;
import gg.squire.bandos.tasks.MovingToNextTileTask;

@TaskDesc(name="Drinking stamina dose", priority=8)
public class DrinkingStaminaDoseTask
extends Task {
    private final  f Q;
    
    private final  r R;
    
    private final  e O;
    private final  d P;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n var1;
        if (!n.lIlIllIlIllIIl(this.O.t() ? 1 : 0) || n.lIlIllIlIllIlI(this.O.y() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        if (!n.lIlIllIlIllIIl(var1.O.s() ? 1 : 0) || n.lIlIllIlIllIll(var1.P.m())) {
            return lllIIIIlllI[0];
        }
        if (!n.lIlIllIlIlllII(Movement.getRunEnergy(), lllIIIIlllI[1]) || n.lIlIllIlIllIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        if (n.lIlIllIlIllIIl(var1.R.O() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        Item var2 = Inventory.getFirst(item -> item.getName().startsWith(lllIIIIllIl[lllIIIIlllI[3]]));
        if (!n.lIlIllIlIllIll(var2) || n.lIlIllIlIllIlI(var1.Q.E() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        var1_1.interact(lllIIIIllIl[lllIIIIlllI[0]]);
        this.Q.B();
        this.sleep(lllIIIIlllI[2]);
        return lllIIIIlllI[3];
    }

    private static boolean lIlIllIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var3);
    }

    private static void lIlIllIlIlIlll() {
        lllIIIIllIl = new String[lllIIIIlllI[4]];
        n.lllIIIIllIl[n.lllIIIIlllI[0]] = "Drink";
        n.lllIIIIllIl[n.lllIIIIlllI[3]] = "Stamina";
    }

    @Inject
    public DrinkingStaminaDoseTask(e e2, d d2, f f2, r r2) {
        this.O = e2;
        this.P = d2;
        this.Q = f2;
        this.R = r2;
    }

    private static boolean lIlIllIlIllIlI(int n2) {
        return n2 == 0;
    }

    static {
        n.lIlIllIlIllIII();
        n.lIlIllIlIlIlll();
    }

    private static boolean lIlIllIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlIllIll(Object object) {
        return object != null;
    }
}

