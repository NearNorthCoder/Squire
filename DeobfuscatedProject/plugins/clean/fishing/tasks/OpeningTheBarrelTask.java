/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening the barrel")
public class OpeningTheBarrelTask
extends Task {
    private static final  int M;
    private final  SquireFisherConfig N;

    static {
        i.lllIlIllIlIIIl();
        i.lllIlIllIlIIII();
        M = lIlllIlIllIl[3];
    }

    public boolean run() {
        i var1;
        if (i.lllIlIllIlIIlI(this.N.fishBarrel() ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        if (!i.lllIlIllIlIIlI(var1.N.fishingTrawler() ? 1 : 0) || i.lllIlIllIlIIll(var1.N.fish().h().equals(lIlllIlIllII[lIlllIlIllIl[0]]) ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        if (i.lllIlIllIlIIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        int[] nArray = new int[lIlllIlIllIl[1]];
        nArray[i.lIlllIlIllIl[0]] = lIlllIlIllIl[2];
        Item var2 = Inventory.getFirst((int[])nArray);
        if (i.lllIlIllIlIlII(var2)) {
            var2.interact(lIlllIlIllII[lIlllIlIllIl[1]]);
            return lIlllIlIllIl[1];
        }
        return lIlllIlIllIl[0];
    }

    private static boolean lllIlIllIlIIlI(int n) {
        return n == 0;
    }

    private static void lllIlIllIlIIII() {
        lIlllIlIllII = new String[lIlllIlIllIl[4]];
        i.lIlllIlIllII[i.lIlllIlIllIl[0]] = "Barbarian Fishing";
        i.lIlllIlIllII[i.lIlllIlIllIl[1]] = "Open";
    }

    private static boolean lllIlIllIlIlII(Object object) {
        return object != null;
    }

    @Inject
    public OpeningTheBarrelTask(SquireFisherConfig squireFisherConfig) {
        this.N = squireFisherConfig;
    }

    private static boolean lllIlIllIlIIll(int n) {
        return n != 0;
    }
}

