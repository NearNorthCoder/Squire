/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Restoring prayer", priority=30000)
public class RestoringPrayerTask
extends Task {
    
     int cD;
    private final  int cS = 5417;
    
    private final  SquireChambersPlugin cR;
     boolean cE;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ak var1;
        if (ak.llIlIllIIIllIl(this.cR.E() ? 1 : 0)) {
            return lIlIIIlIlIIl[0];
        }
        if (ak.llIlIllIIIlllI(Prayers.getPoints(), lIlIIIlIlIIl[2])) {
            return lIlIIIlIlIIl[0];
        }
        if (ak.llIlIllIIIllll(var1.cR.L().a((Locatable)Players.getLocal()) ? 1 : 0) && ak.llIlIllIIlIIII(Static.getClient().getVarbitValue(lIlIIIlIlIIl[1])) && ak.llIlIllIIlIIIl((Object)var1.cR.L().aM(), (Object)N.VESPULA)) {
            return lIlIIIlIlIIl[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (!ak.llIlIllIIIllIl(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[4]]) ? 1 : 0) || !ak.llIlIllIIIllIl(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[5]]) ? 1 : 0) || ak.llIlIllIIIllll(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[3]]) ? 1 : 0)) {
                n2 = lIlIIIlIlIIl[4];

                if (1 <= 0) {
                    return ((0x3E ^ 0x68 ^ (1 ^ 0x7A)) & (0x64 ^ 0x43 ^ (0x62 ^ 0x68) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIlIlIIl[0];
            }
            return n2 != 0;
        });
        if (ak.llIlIllIIlIIlI(var2)) {
            return lIlIIIlIlIIl[0];
        }
        var1_1.interact(lIlIIIlIlIII[lIlIIIlIlIIl[0]]);
        this.sleep(lIlIIIlIlIIl[3]);
        return lIlIIIlIlIIl[4];
    }

    private static void llIlIllIIIlIll() {
        lIlIIIlIlIII = new String[lIlIIIlIlIIl[6]];
        ak.lIlIIIlIlIII[ak.lIlIIIlIlIIl[0]] = "Drink";
        ak.lIlIIIlIlIII[ak.lIlIIIlIlIIl[4]] = "Prayer potion";
        ak.lIlIIIlIlIII[ak.lIlIIIlIlIIl[5]] = "Super restore";
        ak.lIlIIIlIlIII[ak.lIlIIIlIlIIl[3]] = "Revitalisation";
    }

    private static boolean llIlIllIIIllIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public RestoringPrayerTask(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIIIlIlIIl[0];
        this.cE = lIlIIIlIlIIl[0];
        this.cS = lIlIIIlIlIIl[1];
        this.cR = squireChambersPlugin;
    }

    private static boolean llIlIllIIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIllIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIllIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIIlIIlI(Object object) {
        return object == null;
    }

    static {
        ak.llIlIllIIIllII();
        ak.llIlIllIIIlIll();
    }

    private static boolean llIlIllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIllIIlIIIl(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var3);
    }
}

