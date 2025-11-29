/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.BHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Eating", priority=0x7FFFFFFF, blocking=true)
public class EatingTask
extends Task {
    private final  b Q;
    private final  SquireWintertodtConfig R;

    private static boolean llIIIIlllIIIllI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static boolean llIIIIlllIIlIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public EatingTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.Q = b2;
        this.R = squireWintertodtConfig;
    }

    private static boolean llIIIIlllIIIlll(Object object) {
        return object == null;
    }

    static {
        l.llIIIIlllIIIlIl();
        l.llIIIIlllIIIIlI();
    }

    private static boolean llIIIIlllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIlllIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        l var2;
        if (!l.llIIIIlllIIIllI(this.Q.j() ? 1 : 0) || l.llIIIIlllIIIllI(this.Q.i() ? 1 : 0)) {
            return lIlIlllllllII[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            block3: {
                block2: {
                    String[] stringArray = new String[lIlIlllllllII[2]];
                    stringArray[l.lIlIlllllllII[0]] = lIlIllllllIlI[lIlIlllllllII[3]];
                    if (!l.llIIIIlllIIIllI(item.hasAction(stringArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[lIlIlllllllII[2]];
                    stringArray2[l.lIlIlllllllII[0]] = lIlIllllllIlI[lIlIlllllllII[4]];
                    if (!l.llIIIIlllIIlIII(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                }
                n2 = lIlIlllllllII[2];

                if (-3 < 0) return n2 != 0;
                return (3 & (3 ^ -1)) != 0;
            }
            n2 = lIlIlllllllII[0];
            return n2 != 0;
        });
        if (l.llIIIIlllIIIlll(var3) && l.llIIIIlllIIlIII(var2.Q.d() ? 1 : 0)) {
            return lIlIlllllllII[0];
        }
        if (l.llIIIIlllIIlIIl(var2.Q.h(), lIlIlllllllII[1])) {
            return lIlIlllllllII[0];
        }
        if (l.llIIIIlllIIIlll(var3)) {
            Movement.walk((WorldPoint)var2.Q.e());
            return lIlIlllllllII[2];
        }
        var1_1.interact(string -> {
            boolean bl;
            if (!l.llIIIIlllIIIllI(lIlIllllllIlI[lIlIlllllllII[0]].equalsIgnoreCase((String)string) ? 1 : 0) || l.llIIIIlllIIlIII(lIlIllllllIlI[lIlIlllllllII[2]].equalsIgnoreCase((String)string) ? 1 : 0)) {
                bl = lIlIlllllllII[2];

                if (((0xC ^ 0x70 ^ (0x70 ^ 3)) & (30 + 58 - 53 + 171 ^ 103 + 72 - 173 + 191 ^ -1)) != 0) {
                    return ((50 + 107 - 153 + 174 ^ 7 + 68 - 10 + 63) & (0xFC ^ 0xA2 ^ (0xB ^ 0x67) ^ -1)) != 0;
                }
            } else {
                bl = lIlIlllllllII[0];
            }
            return bl;
        });
        this.sleep(lIlIlllllllII[2]);
        return lIlIlllllllII[2];
    }

    private static void llIIIIlllIIIIlI() {
        lIlIllllllIlI = new String[lIlIlllllllII[5]];
        l.lIlIllllllIlI[l.lIlIlllllllII[0]] = "Eat";
        l.lIlIllllllIlI[l.lIlIlllllllII[2]] = "5";
        l.lIlIllllllIlI[l.lIlIlllllllII[3]] = "Eat";
        l.lIlIllllllIlI[l.lIlIlllllllII[4]] = "Drink";
    }

}

