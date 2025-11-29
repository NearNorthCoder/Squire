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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Equipping Bowfa")
public class EquippingBowfaTask
extends Task {
    
    private final  SquireBandosConfig ay;
    
    private final  e az;

    private static boolean lIlIlIlllIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlllIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIllIlllII() {
        llIlllIlIlI = new String[llIlllIllII[3]];
        y.llIlllIlIlI[y.llIlllIllII[0]] = "Wield";
        y.llIlllIlIlI[y.llIlllIllII[1]] = "faerdhinen";
        y.llIlllIlIlI[y.llIlllIllII[2]] = "Crystal bow";
    }

    @Inject
    public EquippingBowfaTask(SquireBandosConfig squireBandosConfig, e e2) {
        this.ay = squireBandosConfig;
        this.az = e2;
    }

    static {
        y.lIlIlIlllIIllI();
        y.lIlIlIllIlllII();
    }

    public boolean run() {
        y var1;
        if (y.lIlIlIlllIIlll(this.ay.useBlowpipe() ? 1 : 0)) {
            return llIlllIllII[0];
        }
        if (y.lIlIlIlllIlIII(var1.az.v() ? 1 : 0) && y.lIlIlIlllIIlll(var1.az.s() ? 1 : 0)) {
            return llIlllIllII[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            boolean bl;
            if (!y.lIlIlIlllIIlll(item.getName().contains(llIlllIlIlI[llIlllIllII[1]]) ? 1 : 0) || y.lIlIlIlllIlIII(item.getName().contains(llIlllIlIlI[llIlllIllII[2]]) ? 1 : 0)) {
                bl = llIlllIllII[1];

                if (((0x56 ^ 0x75) & ~(0x74 ^ 0x57)) != ((0xB9 ^ 0xA6) & ~(0x6C ^ 0x73))) {
                    return false;
                }
            } else {
                bl = llIlllIllII[0];
            }
            return bl;
        });
        if (y.lIlIlIlllIlIIl(var2)) {
            var2.interact(llIlllIlIlI[llIlllIllII[0]]);
            return llIlllIllII[1];
        }
        return llIlllIllII[0];
    }

    private static boolean lIlIlIlllIlIIl(Object object) {
        return object != null;
    }
}

