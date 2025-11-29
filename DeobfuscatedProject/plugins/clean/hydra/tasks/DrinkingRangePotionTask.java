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

@TaskDesc(name="Drinking range potion", priority=20)
public class DrinkingRangePotionTask
extends Task {

    private final  a at;
    private final  SquireAlchemicalHydraConfig au;

    private static boolean lIIIlllllllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIllllllIlllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q var1;
        if (q.lIIIllllllIlllI(this.at.g() ? 1 : 0)) {
            return llllIIlIlIll[0];
        }
        int var2 = Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED);
        if (q.lIIIllllllIllll(var2, llllIIlIlIll[1])) {
            return llllIIlIlIll[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (!q.lIIIllllllIlllI(item.getName().toLowerCase().contains(llllIIlIIIll[llllIIlIlIll[5]]) ? 1 : 0) || q.lIIIlllllllIIIl(item.getName().toLowerCase().contains(llllIIlIIIll[llllIIlIlIll[6]]) ? 1 : 0)) {
                n2 = llllIIlIlIll[2];

                if (3 == 0) {
                    return false;
                }
            } else {
                n2 = llllIIlIlIll[0];
            }
            return n2 != 0;
        });
        if (q.lIIIlllllllIIII(var3)) {
            return llllIIlIlIll[0];
        }
        if (q.lIIIllllllIlllI(var3.getName().contains(llllIIlIIIll[llllIIlIlIll[0]]) ? 1 : 0) && q.lIIIlllllllIIIl(var1.au.makeDivines() ? 1 : 0)) {
            String[] stringArray = new String[llllIIlIlIll[2]];
            stringArray[q.llllIIlIlIll[0]] = llllIIlIIIll[llllIIlIlIll[2]];
            if (q.lIIIlllllllIIlI(Inventory.getCount((boolean)llllIIlIlIll[2], (String[])stringArray), llllIIlIlIll[3])) {
                String[] stringArray2 = new String[llllIIlIlIll[2]];
                stringArray2[q.llllIIlIlIll[0]] = llllIIlIIIll[llllIIlIlIll[4]];
                Inventory.getFirst((String[])stringArray2).useOn(var3);
                return llllIIlIlIll[2];
            }
        }
        var2_2.interact(llllIIlIIIll[llllIIlIlIll[3]]);
        return llllIIlIlIll[2];
    }

    private static boolean lIIIllllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public DrinkingRangePotionTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.at = a2;
        this.au = squireAlchemicalHydraConfig;
    }

    private static boolean lIIIlllllllIIIl(int n2) {
        return n2 != 0;
    }

    static {
        q.lIIIllllllIllIl();
        q.lIIIlllllIIlIll();
    }

    private static void lIIIlllllIIlIll() {
        llllIIlIIIll = new String[llllIIlIlIll[1]];
        q.llllIIlIIIll[q.llllIIlIlIll[0]] = "Divine";
        q.llllIIlIIIll[q.llllIIlIlIll[2]] = "Crystal dust";
        q.llllIIlIIIll[q.llllIIlIlIll[4]] = "Crystal dust";
        q.llllIIlIIIll[q.llllIIlIlIll[3]] = "Drink";
        q.llllIIlIIIll[q.llllIIlIlIll[5]] = "ranging potion";
        q.llllIIlIIIll[q.llllIIlIlIll[6]] = "bastion potion";
    }

    private static boolean lIIIlllllllIIII(Object object) {
        return object == null;
    }

}

