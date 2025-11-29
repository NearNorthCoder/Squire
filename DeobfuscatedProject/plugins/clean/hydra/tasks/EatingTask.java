/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.AHelper;

@TaskDesc(name="Eating", priority=10)
public class EatingTask
extends Task {
    private final  a av;
    
    private final  SquireAlchemicalHydraConfig aw;

    private static boolean lIIlIIIIlIlllll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public EatingTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.av = a2;
        this.aw = squireAlchemicalHydraConfig;
    }

    private static void lIIlIIIIlIlllII() {
        llllIlIIllII = new String[llllIlIIllIl[3]];
        r.llllIlIIllII[r.llllIlIIllIl[0]] = "Eat";
        r.llllIlIIllII[r.llllIlIIllIl[2]] = "Eat";
    }

    static {
        r.lIIlIIIIlIlllIl();
        r.lIIlIIIIlIlllII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var1;
        if (r.lIIlIIIIlIllllI(this.av.g() ? 1 : 0)) {
            return llllIlIIllIl[0];
        }
        if (r.lIIlIIIIlIlllll(Combat.getCurrentHealth(), var1.aw.eatAt())) {
            return llllIlIIllIl[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIlIIllIl[2]];
            stringArray[r.llllIlIIllIl[0]] = llllIlIIllII[llllIlIIllIl[2]];
            return item.hasAction(stringArray);
        });
        if (r.lIIlIIIIllIIIII(var2)) {
            return llllIlIIllIl[0];
        }
        var1_1.interact(llllIlIIllII[llllIlIIllIl[0]]);
        this.sleep(llllIlIIllIl[1]);
        return llllIlIIllIl[2];
    }

    private static boolean lIIlIIIIllIIIII(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIlIllllI(int n2) {
        return n2 == 0;
    }
}

