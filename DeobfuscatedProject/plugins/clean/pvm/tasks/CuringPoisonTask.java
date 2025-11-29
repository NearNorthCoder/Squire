/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Curing Poison", priority=2)
public class CuringPoisonTask
extends Task {

    private static final  Logger X;

    private static boolean lIlIlllIlIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        m.lIlIlllIlIIIIlI();
        m.lIlIlllIlIIIIIl();
        X = LoggerFactory.getLogger(CuringPoisonTask.class);
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlllIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIlIIIlII(Object object) {
        return object == null;
    }

    private static void lIlIlllIlIIIIIl() {
        lIIllIIIIIlII = new String[lIIllIIIIIlIl[3]];
        m.lIIllIIIIIlII[m.lIIllIIIIIlIl[0]] = "Drink";
        m.lIIllIIIIIlII[m.lIIllIIIIIlIl[1]] = "anti";
        m.lIIllIIIIIlII[m.lIIllIIIIIlIl[2]] = "Drink";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.lIlIlllIlIIIIll(Combat.isPoisoned() ? 1 : 0)) {
            return lIIllIIIIIlIl[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (m.lIlIlllIlIIIlIl(item.getName().toLowerCase().contains(lIIllIIIIIlII[lIIllIIIIIlIl[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIIIIIlIl[1]];
                stringArray[m.lIIllIIIIIlIl[0]] = lIIllIIIIIlII[lIIllIIIIIlIl[2]];
                if (m.lIlIlllIlIIIlIl(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIIIIIlIl[1];

                    if ((3 ^ 0x1D ^ (0x62 ^ 0x79)) > 0) return n2 != 0;
                    return ((2 ^ (0x82 ^ 0xC4)) & (0x8C ^ 0xB8 ^ (0x32 ^ 0x42) ^ -1)) != 0;
                }
            }
            n2 = lIIllIIIIIlIl[0];
            return n2 != 0;
        });
        if (m.lIlIlllIlIIIlII(var2)) {
            return lIIllIIIIIlIl[0];
        }
        var1_1.interact(lIIllIIIIIlII[lIIllIIIIIlIl[0]]);
        return lIIllIIIIIlIl[1];
    }

    private static boolean lIlIlllIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

