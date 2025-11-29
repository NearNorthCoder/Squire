/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
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
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=8)
public class EatingFoodTask
extends Task {
    private final  SquireZammyConfig aa;
    
    private final  u Z;
    private final  c X;
    private final  f Y;
    
    private final  l W;

    private static boolean llIIIlIlIlIIIII(int n2) {
        return n2 != 0;
    }

    static {
        r.llIIIlIlIIlllll();
        r.llIIIlIlIIllIll();
    }

    private static boolean llIIIlIlIlIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIlIlIlIIlIl(Object object) {
        return object == null;
    }

    private static boolean llIIIlIlIlIIlII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public EatingFoodTask(l l2, c c2, f f2, u u2, SquireZammyConfig squireZammyConfig) {
        this.W = l2;
        this.X = c2;
        this.Y = f2;
        this.Z = u2;
        this.aa = squireZammyConfig;
    }

    private boolean N() {
        return lIllIIIllIlll[0];
    }

    private static boolean llIIIlIlIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIlIlIIllIll() {
        lIllIIIllIlII = new String[lIllIIIllIlll[5]];
        r.lIllIIIllIlII[r.lIllIIIllIlll[0]] = "Peach";
        r.lIllIIIllIlII[r.lIllIIIllIlll[2]] = "Eat";
        r.lIllIIIllIlII[r.lIllIIIllIlll[3]] = "Peach";
        r.lIllIIIllIlII[r.lIllIIIllIlll[4]] = "Eat";
    }

    private static boolean llIIIlIlIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlIlIlIIIll(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var2;
        if (!r.llIIIlIlIlIIIII(this.W.B() ? 1 : 0) || r.llIIIlIlIlIIIIl(this.W.G() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (r.llIIIlIlIlIIIII(var2.W.A() ? 1 : 0) && r.llIIIlIlIlIIIlI(var2.X.e())) {
            return lIllIIIllIlll[0];
        }
        if (!r.llIIIlIlIlIIIll(Combat.getCurrentHealth(), var2.aa.eatFoodAt()) || r.llIIIlIlIlIIIIl(var2.Y.t() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (r.llIIIlIlIlIIIII(var2.Z.O() ? 1 : 0) && r.llIIIlIlIlIIIII(var2.W.A() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (r.llIIIlIlIlIIIII(var2.W.D() ? 1 : 0) && r.llIIIlIlIlIIIIl(var2.W.A() ? 1 : 0) && r.llIIIlIlIlIIlII(Combat.getCurrentHealth(), lIllIIIllIlll[1])) {
            return lIllIIIllIlll[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (r.llIIIlIlIlIIIIl(item.getName().equals(lIllIIIllIlII[lIllIIIllIlll[3]]) ? 1 : 0) && r.llIIIlIlIlIIIII(item.hasAction(lIllIIIllIlII[lIllIIIllIlll[4]]::equals) ? 1 : 0)) {
                n2 = lIllIIIllIlll[2];

                }
            } else {
                n2 = lIllIIIllIlll[0];
            }
            return n2 != 0;
        });
        if (r.llIIIlIlIlIIlIl(var3)) {
            String[] stringArray = new String[lIllIIIllIlll[2]];
            stringArray[r.lIllIIIllIlll[0]] = lIllIIIllIlII[lIllIIIllIlll[0]];
            var3 = Inventory.getFirst((String[])stringArray);
        }
        if (r.llIIIlIlIlIIlIl(var3)) {
            return var2.N();
        }
        var1_1.interact(lIllIIIllIlII[lIllIIIllIlll[2]]);
        this.Y.s();
        return lIllIIIllIlll[2];
    }
}

