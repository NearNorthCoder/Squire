/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining essenece")
public class MiningEsseneceTask
extends Task {
    @Inject
    private  SquireMinerConfig f;

    static {
        p.lIIlIlIIIIlllll();
        p.lIIlIlIIIIllllI();
    }

    private static boolean lIIlIlIIIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIlIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIIIIllllI() {
        llllllIIIlII = new String[llllllIIIlIl[3]];
        p.llllllIIIlII[p.llllllIIIlIl[0]] = "Mine";
    }

    private static boolean lIIlIlIIIlIIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (p.lIIlIlIIIlIIIII((Object)this.f.activity(), (Object)a.ESSENCE)) {
            return llllllIIIlIl[0];
        }
        if (p.lIIlIlIIIlIIIIl(Inventory.isFull() ? 1 : 0)) {
            return llllllIIIlIl[0];
        }
        if (p.lIIlIlIIIlIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIIIlIl[0];
        }
        int[] nArray = new int[llllllIIIlIl[1]];
        nArray[p.llllllIIIlIl[0]] = llllllIIIlIl[2];
        nArray[p.llllllIIIlIl[3]] = llllllIIIlIl[4];
        nArray[p.llllllIIIlIl[5]] = llllllIIIlIl[6];
        TileObject var1 = TileObjects.getNearest((int[])nArray);
        if (p.lIIlIlIIIlIIIlI(var1)) {
            return llllllIIIlIl[0];
        }
        var1_1.interact(llllllIIIlII[llllllIIIlIl[0]]);
        return llllllIIIlIl[3];
    }

}

