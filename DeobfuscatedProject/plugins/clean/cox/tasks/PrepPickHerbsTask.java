/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Pick Herbs", priority=21000, blocking=true)
public class PrepPickHerbsTask
extends CoxTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_1;
        be var1;
        int[] nArray = new int[lIlIIIIIlIII[0]];
        nArray[be.lIlIIIIIlIII[1]] = lIlIIIIIlIII[2];
        if (be.llIlIlIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIIIIlIII[1];
        }
        int[] nArray2 = new int[lIlIIIIIlIII[0]];
        nArray2[be.lIlIIIIIlIII[1]] = em;
        TileObject var2 = TileObjects.getNearest((int[])nArray2);
        if (be.llIlIlIIIIlIIl(var1.eh(), var1.ed())) {
            return lIlIIIIIlIII[1];
        }
        if (be.llIlIlIIIIlIlI(var2)) {
            return lIlIIIIIlIII[1];
        }
        if (!be.llIlIlIIIIlIll(Inventory.isFull() ? 1 : 0) || be.llIlIlIIIIllII(var1.eg(), var1.ek())) {
            return lIlIIIIIlIII[1];
        }
        if (be.llIlIlIIIIlIII(var1.bS.isAnimating() ? 1 : 0)) {
            System.out.println(lIlIIIIIIlll[lIlIIIIIlIII[1]]);
            return lIlIIIIIlIII[0];
        }
        var1_1.interact(lIlIIIIIIlll[lIlIIIIIlIII[0]]);
        this.sleep(lIlIIIIIlIII[3]);
        return lIlIIIIIlIII[0];
    }

    private static boolean llIlIlIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIIIIlIlI(Object object) {
        return object == null;
    }

    @Inject
    protected PrepPickHerbsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

        return String.valueOf(var3);
    }

    private static void llIlIlIIIIIllI() {
        lIlIIIIIIlll = new String[lIlIIIIIlIII[3]];
        be.lIlIIIIIIlll[be.lIlIIIIIlIII[1]] = "Picking up herbs";
        be.lIlIIIIIIlll[be.lIlIIIIIlIII[0]] = "Pick";
    }

    static {
        be.llIlIlIIIIIlll();
        be.llIlIlIIIIIllI();
    }

    private static boolean llIlIlIIIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIIIllII(int n2, int n3) {
        return n2 <= n3;
    }
}

