/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
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
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.AHelper;

@TaskDesc(name="Restoring prayer", priority=20)
public class RestoringPrayerTask
extends Task {
    private final  SquireAlchemicalHydraConfig as;

    private final  a ar;

    private static boolean lIIlIIIIIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIIlIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public RestoringPrayerTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ar = a2;
        this.as = squireAlchemicalHydraConfig;
    }

        return String.valueOf(var1);
    }

    private static void lIIlIIIIIIllllI() {
        llllIIlllIlI = new String[llllIIlllIll[4]];
        p.llllIIlllIlI[p.llllIIlllIll[0]] = "Drink";
        p.llllIIlllIlI[p.llllIIlllIll[1]] = "Drink";
        p.llllIIlllIlI[p.llllIIlllIll[2]] = "prayer";
        p.llllIIlllIlI[p.llllIIlllIll[3]] = "restore";
    }

    static {
        p.lIIlIIIIIIlllll();
        p.lIIlIIIIIIllllI();
    }

    private static boolean lIIlIIIIIlIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var2;
        if (p.lIIlIIIIIlIIIII(this.ar.g() ? 1 : 0)) {
            return llllIIlllIll[0];
        }
        if (p.lIIlIIIIIlIIIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), var2.as.restorePrayAt())) {
            return llllIIlllIll[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIIlllIll[1]];
            stringArray[p.llllIIlllIll[0]] = llllIIlllIlI[llllIIlllIll[1]];
            if (p.lIIlIIIIIlIIIll(item.hasAction(stringArray) ? 1 : 0) && (!p.lIIlIIIIIlIIIII(item.getName().toLowerCase().contains(llllIIlllIlI[llllIIlllIll[2]]) ? 1 : 0) || p.lIIlIIIIIlIIIll(item.getName().toLowerCase().contains(llllIIlllIlI[llllIIlllIll[3]]) ? 1 : 0))) {
                n2 = llllIIlllIll[1];

                if ((0x4A ^ 0x2D ^ (0x1A ^ 0x79)) < ((0xEA ^ 0x9D ^ (0x49 ^ 0x37)) & (0x8F ^ 0xAE ^ (0xEA ^ 0xC2) ^ -1))) {
                    return ((0x9B ^ 0xA2 ^ (0x43 ^ 0x63)) & (54 + 115 - 107 + 72 ^ 0 + 133 - 77 + 103 ^ -1)) != 0;
                }
            } else {
                n2 = llllIIlllIll[0];
            }
            return n2 != 0;
        });
        if (p.lIIlIIIIIlIIIlI(var3)) {
            return llllIIlllIll[0];
        }
        var1_1.interact(llllIIlllIlI[llllIIlllIll[0]]);
        return llllIIlllIll[1];
    }

    private static boolean lIIlIIIIIlIIIll(int n2) {
        return n2 != 0;
    }

}

