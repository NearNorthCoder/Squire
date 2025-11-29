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
 *  net.unethicalite.client.Static
 */
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Eating food", priority=20)
public class EatingFoodTask
extends Task {
    private final  SquireSepulchre ak;
    private final  SquireSepulchreConfig al;

    private static boolean lIIIlIlIIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        O.lIIIlIlIIIIIlII();
        O.lIIIlIlIIIIIIll();
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIlIlIIIIIlIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        O var2;
        if (O.lIIIlIlIIIIIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lllIIlIIllll[0];
        }
        String[] stringArray = new String[lllIIlIIllll[1]];
        stringArray[O.lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[0]];
        if (O.lIIIlIlIIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            Item var3 = Inventory.getFirst(item -> {
                int n2;
                String[] stringArray = new String[lllIIlIIllll[1]];
                stringArray[O.lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[4]];
                if (O.lIIIlIlIIIIIllI(item.hasAction(stringArray) ? 1 : 0) && O.lIIIlIlIIIIIllI(item.getName().equals(lllIIlIIlllI[lllIIlIIllll[5]]) ? 1 : 0)) {
                    n2 = lllIIlIIllll[1];

                    if (1 < 0) {
                        return false;
                    }
                } else {
                    n2 = lllIIlIIllll[0];
                }
                return n2 != 0;
            });
            var3.interact(lllIIlIIlllI[lllIIlIIllll[1]]);
            var2.sleep(lllIIlIIllll[2]);
            return lllIIlIIllll[1];
        }
        if (O.lIIIlIlIIIIIlll(Combat.getCurrentHealth(), var2.al.hpToEatAt())) {
            return lllIIlIIllll[0];
        }
        Item item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lllIIlIIllll[1]];
            stringArray[O.lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[2]];
            return item.hasAction(stringArray);
        });
        item2.interact(lllIIlIIlllI[lllIIlIIllll[3]]);
        this.sleep(lllIIlIIllll[2]);
        return lllIIlIIllll[1];
    }

    private static boolean lIIIlIlIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIlIIIIIIll() {
        lllIIlIIlllI = new String[lllIIlIIllll[6]];
        O.lllIIlIIlllI[O.lllIIlIIllll[0]] = "Monkfish";
        O.lllIIlIIlllI[O.lllIIlIIllll[1]] = "Eat";
        O.lllIIlIIlllI[O.lllIIlIIllll[3]] = "Eat";
        O.lllIIlIIlllI[O.lllIIlIIllll[2]] = "Eat";
        O.lllIIlIIlllI[O.lllIIlIIllll[4]] = "Eat";
        O.lllIIlIIlllI[O.lllIIlIIllll[5]] = "Monkfish";
    }

    @Inject
    public EatingFoodTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.ak = squireSepulchre;
        this.al = squireSepulchreConfig;
    }

    private static boolean lIIIlIlIIIIIllI(int n2) {
        return n2 != 0;
    }
}

