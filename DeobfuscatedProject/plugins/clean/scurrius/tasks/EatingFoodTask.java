/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.scurrius.tasks.ScurriusTaskBase;
import gg.squire.scurrius.tasks.BHelper;

@TaskDesc(name="Eating food", priority=10000)
public class EatingFoodTask
extends ScurriusTaskBase {

    private static boolean lIlIllIIIlIIlII(Object object) {
        return object == null;
    }

    @Inject
    protected EatingFoodTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a() {
        void var1_1;
        if (q.lIlIllIIIlIIIll(Combat.getCurrentHealth(), this.b.eatAt())) {
            return lIIlIlIllIIII[0];
        }
        Item var1 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIIlIlIllIIII[1]];
            stringArray[q.lIIlIlIllIIII[0]] = lIIlIlIlIllIl[lIIlIlIllIIII[3]];
            return item.hasAction(stringArray);
        });
        if (q.lIlIllIIIlIIlII(var1)) {
            q var2;
            Log.error((String)lIIlIlIlIllIl[lIIlIlIllIIII[0]]);
            var2.a.e(lIIlIlIllIIII[1]);
            return lIIlIlIllIIII[0];
        }
        var1_1.interact(lIIlIlIlIllIl[lIIlIlIllIIII[1]]);
        this.sleep(lIIlIlIllIIII[2]);
        return lIIlIlIllIIII[1];
    }

    private static void lIlIllIIIlIIIIl() {
        lIIlIlIlIllIl = new String[lIIlIlIllIIII[2]];
        q.lIIlIlIlIllIl[q.lIIlIlIllIIII[0]] = "No food";
        q.lIIlIlIlIllIl[q.lIIlIlIllIIII[1]] = "Eat";
        q.lIIlIlIlIllIl[q.lIIlIlIllIIII[3]] = "Eat";
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIllIIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIIlIIIll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        q.lIlIllIIIlIIIlI();
        q.lIlIllIIIlIIIIl();
    }
}

