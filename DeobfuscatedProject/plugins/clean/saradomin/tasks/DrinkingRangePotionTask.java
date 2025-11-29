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
package gg.squire.saradomin.tasks;

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
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Drinking range potion")
public class DrinkingRangePotionTask
extends Task {
    private final  g aP;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        H var1;
        if (!H.lIlIlIlllllIllI(this.aP.m() ? 1 : 0) || H.lIlIlIlllllIllI(this.aP.l() ? 1 : 0)) {
            return lIIlIlIlIIlIl[0];
        }
        if (H.lIlIlIlllllIlll(var1.aP.k(), lIIlIlIlIIlIl[1])) {
            return lIIlIlIlIIlIl[0];
        }
        if (H.lIlIlIllllllIII(var1.aP.t()) && H.lIlIlIlllllIllI(var1.aP.t().B() ? 1 : 0)) {
            return lIIlIlIlIIlIl[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (!H.lIlIlIllllllIlI(item.getName().toLowerCase().contains(lIIlIlIlIIlII[lIIlIlIlIIlIl[3]]) ? 1 : 0) || H.lIlIlIlllllIllI(item.getName().toLowerCase().contains(lIIlIlIlIIlII[lIIlIlIlIIlIl[4]]) ? 1 : 0)) {
                n2 = lIIlIlIlIIlIl[3];

                if (1 != 1) {
                    return ((110 + 96 - 203 + 135 ^ 30 + 7 - 3 + 144) & (9 ^ 0x16 ^ (0x7B ^ 0x5C) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlIlIlIIlIl[0];
            }
            return n2 != 0;
        });
        if (H.lIlIlIllllllIIl(var2)) {
            return lIIlIlIlIIlIl[0];
        }
        if (H.lIlIlIlllllIlll(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lIIlIlIlIIlIl[2])) {
            return lIIlIlIlIIlIl[0];
        }
        var1_1.interact(lIIlIlIlIIlII[lIIlIlIlIIlIl[0]]);
        return lIIlIlIlIIlIl[3];
    }

    private static boolean lIlIlIllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIllllllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllllllIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlIllllllIIl(Object object) {
        return object == null;
    }

    @Inject
    public DrinkingRangePotionTask(g g2) {
        this.aP = g2;
    }

    static {
        H.lIlIlIlllllIlIl();
        H.lIlIlIlllllIlII();
    }

    private static boolean lIlIlIlllllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIlIlllllIlII() {
        lIIlIlIlIIlII = new String[lIIlIlIlIIlIl[5]];
        H.lIIlIlIlIIlII[H.lIIlIlIlIIlIl[0]] = "Drink";
        H.lIIlIlIlIIlII[H.lIIlIlIlIIlIl[3]] = "ranging";
        H.lIIlIlIlIIlII[H.lIIlIlIlIIlIl[4]] = "bastion";
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIlIlllllIllI(int n2) {
        return n2 != 0;
    }
}

