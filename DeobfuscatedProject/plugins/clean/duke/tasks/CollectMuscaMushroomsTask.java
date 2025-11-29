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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Musca Mushrooms", priority=100, blocking=true)
public class CollectMuscaMushroomsTask
extends Task {
    
    final  SquireDukeSucellus bh;
    final  a bi;

    private static boolean lllIIlIllIIIII(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static void lllIIlIlIllllI() {
        lIllIIlIlIll = new String[lIllIIlIllII[0]];
        E.lIllIIlIlIll[E.lIllIIlIllII[1]] = "Musca mushroom";
        E.lIllIIlIlIll[E.lIllIIlIllII[2]] = "Arder mushroom";
    }

    @Inject
    public CollectMuscaMushroomsTask(SquireDukeSucellus squireDukeSucellus) {
        this.bh = squireDukeSucellus;
        this.bi = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        String[] stringArray = new String[lIllIIlIllII[0]];
        stringArray[E.lIllIIlIllII[1]] = lIllIIlIlIll[lIllIIlIllII[1]];
        stringArray[E.lIllIIlIllII[2]] = lIllIIlIlIll[lIllIIlIllII[2]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (E.lllIIlIllIIIII(item)) {
            return lIllIIlIllII[1];
        }
        int[] nArray = new int[lIllIIlIllII[2]];
        nArray[E.lIllIIlIllII[1]] = lIllIIlIllII[3];
        Item var2 = Inventory.getFirst((int[])nArray);
        if (E.lllIIlIllIIIII(var2)) {
            return lIllIIlIllII[1];
        }
        var2_2.useOn(item);
        return lIllIIlIllII[2];
    }

    static {
        E.lllIIlIlIlllll();
        E.lllIIlIlIllllI();
    }

    private static boolean lllIIlIllIIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

