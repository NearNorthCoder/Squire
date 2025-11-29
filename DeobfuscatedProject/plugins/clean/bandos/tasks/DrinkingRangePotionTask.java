/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Drinking range potion")
public class DrinkingRangePotionTask
extends Task {

    private final  e ax;

    private static boolean lIlIllIllIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    public DrinkingRangePotionTask(e e2) {
        this.ax = e2;
    }

    private static boolean lIlIllIllIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIllIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIllIIllI(Object object) {
        return object == null;
    }

    private static void lIlIllIllIIIlI() {
        lllIIIIllll = new String[lllIIIlIIIl[5]];
        x.lllIIIIllll[x.lllIIIlIIIl[0]] = "Drink";
        x.lllIIIIllll[x.lllIIIlIIIl[3]] = "ranging";
        x.lllIIIIllll[x.lllIIIlIIIl[4]] = "bastion";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        x var1;
        if (!x.lIlIllIllIIlII(this.ax.t() ? 1 : 0) || x.lIlIllIllIIlII(this.ax.s() ? 1 : 0)) {
            return lllIIIlIIIl[0];
        }
        if (x.lIlIllIllIIlIl(var1.ax.r(), lllIIIlIIIl[1])) {
            return lllIIIlIIIl[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (!x.lIlIllIllIIlll(item.getName().toLowerCase().contains(lllIIIIllll[lllIIIlIIIl[3]]) ? 1 : 0) || x.lIlIllIllIIlII(item.getName().toLowerCase().contains(lllIIIIllll[lllIIIlIIIl[4]]) ? 1 : 0)) {
                n2 = lllIIIlIIIl[3];

                if ((0xAB ^ 0xAF) < 3) {
                    return false;
                }
            } else {
                n2 = lllIIIlIIIl[0];
            }
            return n2 != 0;
        });
        if (x.lIlIllIllIIllI(var2)) {
            return lllIIIlIIIl[0];
        }
        if (x.lIlIllIllIIlIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lllIIIlIIIl[2])) {
            return lllIIIlIIIl[0];
        }
        var1_1.interact(lllIIIIllll[lllIIIlIIIl[0]]);
        return lllIIIlIIIl[3];
    }

    static {
        x.lIlIllIllIIIll();
        x.lIlIllIllIIIlI();
    }

}

