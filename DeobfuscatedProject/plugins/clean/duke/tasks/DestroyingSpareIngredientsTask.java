/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Destroying Spare Ingredients", priority=250)
public class DestroyingSpareIngredientsTask
extends Task {
    final  a bk;

    final  SquireDukeSucellus bj;

    @Inject
    public DestroyingSpareIngredientsTask(SquireDukeSucellus squireDukeSucellus) {
        this.bj = squireDukeSucellus;
        this.bk = squireDukeSucellus.s();
    }

    private static void lllIlIIIIIllIl() {
        lIllIlIllIII = new String[lIllIlIllIIl[8]];
        F.lIllIlIllIII[F.lIllIlIllIIl[2]] = "Musca powder";
        F.lIllIlIllIII[F.lIllIlIllIIl[1]] = "Destroy";
        F.lIllIlIllIII[F.lIllIlIllIIl[0]] = "Arder powder";
        F.lIllIlIllIII[F.lIllIlIllIIl[3]] = "Destroy";
        F.lIllIlIllIII[F.lIllIlIllIIl[4]] = "Salax salt";
        F.lIllIlIllIII[F.lIllIlIllIIl[5]] = "Destroy";
        F.lIllIlIllIII[F.lIllIlIllIIl[6]] = "Eat";
        F.lIllIlIllIII[F.lIllIlIllIIl[7]] = "Eat";
    }

    public boolean run() {
        int lllllllllllllllIlIllllIlIIlIlIII2;
        Item lllllllllllllllIlIllllIlIIlIlIII2;
        F var1;
        if (F.lllIlIIIIIllll(this.bk.w(), lIllIlIllIIl[0])) {
            String[] stringArray = new String[lIllIlIllIIl[1]];
            stringArray[F.lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[2]];
            Item item2 = Inventory.getFirst((String[])stringArray);
            if (F.lllIlIIIIlIIII(item2)) {
                item2.interact(lIllIlIllIII[lIllIlIllIIl[1]]);
                return lIllIlIllIIl[1];
            }
        }
        if (F.lllIlIIIIIllll(var1.bk.v(), lIllIlIllIIl[0])) {
            String[] stringArray = new String[lIllIlIllIIl[1]];
            stringArray[F.lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[0]];
            lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getFirst((String[])stringArray);
            if (F.lllIlIIIIlIIII(lllllllllllllllIlIllllIlIIlIlIII2)) {
                lllllllllllllllIlIllllIlIIlIlIII2.interact(lIllIlIllIII[lIllIlIllIIl[3]]);
                return lIllIlIllIIl[1];
            }
        }
        if (F.lllIlIIIIIllll(var1.bk.x(), lIllIlIllIIl[0])) {
            String[] stringArray = new String[lIllIlIllIIl[1]];
            stringArray[F.lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[4]];
            lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getFirst((String[])stringArray);
            if (F.lllIlIIIIlIIII(lllllllllllllllIlIllllIlIIlIlIII2)) {
                lllllllllllllllIlIllllIlIIlIlIII2.interact(lIllIlIllIII[lIllIlIllIIl[5]]);
                return lIllIlIllIIl[1];
            }
        }
        if (F.lllIlIIIIlIIIl((lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getCount((boolean)lIllIlIllIIl[2], item -> e.U.contains(item.getName()))) + Inventory.getFreeSlots(), lIllIlIllIIl[0])) {
            Item var2 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIllIlIllIIl[1]];
                stringArray[F.lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[7]];
                return item.hasAction(stringArray);
            });
            if (F.lllIlIIIIlIIlI(var2)) {
                var1.bj.f(lIllIlIllIIl[2]);
                var1.bj.g(lIllIlIllIIl[1]);
                return lIllIlIllIIl[2];
            }
            var2.interact(lIllIlIllIII[lIllIlIllIIl[6]]);
            return lIllIlIllIIl[1];
        }
        return lIllIlIllIIl[2];
    }

        return String.valueOf(var3);
    }

    static {
        F.lllIlIIIIIlllI();
        F.lllIlIIIIIllIl();
    }

    private static boolean lllIlIIIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lllIlIIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

}

