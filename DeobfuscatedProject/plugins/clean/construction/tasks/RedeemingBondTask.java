/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.membership.SquireMembershipBuyer;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Redeeming Bond")
public class RedeemingBondTask
extends Task {
    
    private final  SquireMembershipBuyer fi;

    private static void llIllIIIIl() {
        llllIlll = new String[lllllIII[4]];
        aY.llllIlll[aY.lllllIII[1]] = "Close";
        aY.llllIlll[aY.lllllIII[0]] = "Redeem";
    }

    private static boolean llIllIIlIl(Object object) {
        return object != null;
    }

        return String.valueOf(llIlIIIIllllIlI);
    }

    public boolean run() {
        int[] nArray = new int[lllllIII[0]];
        nArray[aY.lllllIII[1]] = lllllIII[2];
        if (aY.llIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllIII[1];
        }
        if (aY.llIllIIlII(GrandExchange.isOpen() ? 1 : 0)) {
            Widgets.get((int)lllllIII[3], (int)lllllIII[4]).getChild(lllllIII[5]).interact(llllIlll[lllllIII[1]]);
        }
        if (aY.llIllIIlIl(Widgets.get((int)lllllIII[6], (int)lllllIII[0])) && aY.llIllIIlII(Widgets.get((int)lllllIII[6], (int)lllllIII[7]).isVisible() ? 1 : 0)) {
            if (aY.llIllIIlIl(Widgets.get((int)lllllIII[6], (int)lllllIII[8])) && aY.llIllIIlII(Widgets.get((int)lllllIII[6], (int)lllllIII[8]).isVisible() ? 1 : 0)) {
                Widgets.get((int)lllllIII[6], (int)lllllIII[8]).interact(lllllIII[1]);
                Widgets.get((int)lllllIII[9], (int)lllllIII[10]).interact(lllllIII[1]);
                return lllllIII[0];
            }
        } else {
            int[] nArray2 = new int[lllllIII[0]];
            nArray2[aY.lllllIII[1]] = lllllIII[2];
            Inventory.getFirst((int[])nArray2).interact(llllIlll[lllllIII[0]]);
        }
        return lllllIII[0];
    }

    @Inject
    public RedeemingBondTask(SquireMembershipBuyer squireMembershipBuyer) {
        this.fi = squireMembershipBuyer;
    }

    private static boolean llIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aY.llIllIIIlI();
        aY.llIllIIIIl();
    }

    private static boolean llIllIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIlII(int n2) {
        return n2 != 0;
    }
}

