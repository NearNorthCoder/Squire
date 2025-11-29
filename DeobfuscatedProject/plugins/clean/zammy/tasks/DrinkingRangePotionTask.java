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
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking range potion")
public class DrinkingRangePotionTask
extends Task {
    private final  l aF;

    @Inject
    public DrinkingRangePotionTask(l l2) {
        this.aF = l2;
    }

    private static boolean llIIIllIIIIllIl(Object object) {
        return object == null;
    }

    private static boolean llIIIllIIIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        C.llIIIllIIIIlIIl();
        C.llIIIllIIIIIlIl();
    }

    private static void llIIIllIIIIIlIl() {
        lIllIIlIlIIII = new String[lIllIIlIlIlII[5]];
        C.lIllIIlIlIIII[C.lIllIIlIlIlII[0]] = "Drink";
        C.lIllIIlIlIIII[C.lIllIIlIlIlII[3]] = "ranging";
        C.lIllIIlIlIIII[C.lIllIIlIlIlII[4]] = "bastion";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        C var1;
        if (!C.llIIIllIIIIlIlI(this.aF.B() ? 1 : 0) || C.llIIIllIIIIlIlI(this.aF.A() ? 1 : 0)) {
            return lIllIIlIlIlII[0];
        }
        if (C.llIIIllIIIIlIll(var1.aF.z(), lIllIIlIlIlII[1])) {
            return lIllIIlIlIlII[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (!C.llIIIllIIIIlllI(item.getName().toLowerCase().contains(lIllIIlIlIIII[lIllIIlIlIlII[3]]) ? 1 : 0) || C.llIIIllIIIIlIlI(item.getName().toLowerCase().contains(lIllIIlIlIIII[lIllIIlIlIlII[4]]) ? 1 : 0)) {
                n2 = lIllIIlIlIlII[3];

                }
            } else {
                n2 = lIllIIlIlIlII[0];
            }
            return n2 != 0;
        });
        if (C.llIIIllIIIIllIl(var2)) {
            return lIllIIlIlIlII[0];
        }
        if (C.llIIIllIIIIlIll(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lIllIIlIlIlII[2])) {
            return lIllIIlIlIlII[0];
        }
        var1_1.interact(lIllIIlIlIIII[lIllIIlIlIlII[0]]);
        return lIllIIlIlIlII[3];
    }

        return String.valueOf(var3);
    }

    private static boolean llIIIllIIIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllIIIIlIll(int n2, int n3) {
        return n2 > n3;
    }
}

