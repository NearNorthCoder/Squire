/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=10000)
public class EatingFoodTask
extends Task {
    private final  a aR;

    private final  SquireDukeSucellus aP;
    private final  SquireDukeSucellusConfig aQ;

    private static boolean lllIIlIllIIlll(Object object) {
        return object == null;
    }

    private static boolean lllIIlIllIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIlIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    @Inject
    public EatingFoodTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aP = squireDukeSucellus;
        this.aQ = squireDukeSucellusConfig;
        this.aR = squireDukeSucellus.s();
    }

    private static void lllIIlIllIIlII() {
        lIllIIlIllIl = new String[lIllIIlIlllI[2]];
        w.lIllIIlIllIl[w.lIllIIlIlllI[0]] = "No food";
        w.lIllIIlIllIl[w.lIllIIlIlllI[1]] = "Eat";
        w.lIllIIlIllIl[w.lIllIIlIlllI[3]] = "Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (w.lllIIlIllIIllI(Combat.getCurrentHealth(), this.aQ.eatAt())) {
            return lIllIIlIlllI[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIllIIlIlllI[1]];
            stringArray[w.lIllIIlIlllI[0]] = lIllIIlIllIl[lIllIIlIlllI[3]];
            return item.hasAction(stringArray);
        });
        if (w.lllIIlIllIIlll(var2)) {
            w var3;
            Log.error((String)lIllIIlIllIl[lIllIIlIlllI[0]]);
            var3.aP.g(lIllIIlIlllI[1]);
            return lIllIIlIlllI[0];
        }
        var1_1.interact(lIllIIlIllIl[lIllIIlIlllI[1]]);
        this.sleep(lIllIIlIlllI[2]);
        return lIllIIlIlllI[1];
    }

    static {
        w.lllIIlIllIIlIl();
        w.lllIIlIllIIlII();
    }

}

