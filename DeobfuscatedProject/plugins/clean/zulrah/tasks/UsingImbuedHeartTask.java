/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using imbued heart", priority=5)
public class UsingImbuedHeartTask
extends Task {
    
    @Inject
    private  SquireZulrah E;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (an.llIIlIIlIIIllll(this.E.d() ? 1 : 0)) {
            return lIllIllIlIlIl[0];
        }
        int[] nArray = new int[lIllIllIlIlIl[1]];
        nArray[an.lIllIllIlIlIl[0]] = lIllIllIlIlIl[2];
        nArray[an.lIllIllIlIlIl[3]] = lIllIllIlIlIl[4];
        Item var1 = Inventory.getFirst((int[])nArray);
        if (an.llIIlIIlIIlIIII(var1)) {
            return lIllIllIlIlIl[0];
        }
        int var2 = Vars.getBit((int)lIllIllIlIlIl[5]);
        if (an.llIIlIIlIIlIIIl(var2)) {
            return lIllIllIlIlIl[0];
        }
        var1_1.interact(lIllIllIlIlII[lIllIllIlIlIl[0]]);
        return lIllIllIlIlIl[3];
    }

    private static boolean llIIlIIlIIlIIIl(int n2) {
        return n2 > 0;
    }

    static {
        an.llIIlIIlIIIlllI();
        an.llIIlIIlIIIllIl();
    }

    private static boolean llIIlIIlIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIlIIlIIII(Object object) {
        return object == null;
    }

    private static void llIIlIIlIIIllIl() {
        lIllIllIlIlII = new String[lIllIllIlIlIl[3]];
        an.lIllIllIlIlII[an.lIllIllIlIlIl[0]] = "Invigorate";
    }
}

