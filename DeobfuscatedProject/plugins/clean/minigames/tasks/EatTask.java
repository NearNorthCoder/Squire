/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.minigames.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.tasks.FHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Eat Task", priority=100)
public class EatTask
extends Task {

    private static boolean llllIllIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIllIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllIllIIIIlll() {
        llIIIllIlIIl = new String[llIIIllIlIll[17]];
        i.llIIIllIlIIl[i.llIIIllIlIll[1]] = "Vial";
        i.llIIIllIlIIl[i.llIIIllIlIll[0]] = "Vial";
        i.llIIIllIlIIl[i.llIIIllIlIll[2]] = "Drop";
        i.llIIIllIlIIl[i.llIIIllIlIll[4]] = "Eat";
        i.llIIIllIlIIl[i.llIIIllIlIll[5]] = "Drink";
        i.llIIIllIlIIl[i.llIIIllIlIll[7]] = "Drink";
        i.llIIIllIlIIl[i.llIIIllIlIll[6]] = "Drink";
        i.llIIIllIlIIl[i.llIIIllIlIll[9]] = "Eat";
        i.llIIIllIlIIl[i.llIIIllIlIll[10]] = "Eat";
        i.llIIIllIlIIl[i.llIIIllIlIll[11]] = "Ranging";
        i.llIIIllIlIIl[i.llIIIllIlIll[12]] = "ranging";
        i.llIIIllIlIIl[i.llIIIllIlIll[13]] = "restore";
        i.llIIIllIlIIl[i.llIIIllIlIll[14]] = "Prayer";
        i.llIIIllIlIIl[i.llIIIllIlIll[15]] = "Eat";
        i.llIIIllIlIIl[i.llIIIllIlIll[16]] = "brew";
    }

    private static boolean llllIllIIlIlII(int n2) {
        return n2 >= 0;
    }

    public boolean run() {
        String[] stringArray = new String[llIIIllIlIll[0]];
        stringArray[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[1]];
        if (i.llllIllIIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIllIlIll[0]];
            stringArray2[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[0]];
            Inventory.getFirst((String[])stringArray2).interact(llIIIllIlIIl[llIIIllIlIll[2]]);
            return llIIIllIlIll[1];
        }
        Item var1 = Inventory.getFirst(item -> item.getName().contains(llIIIllIlIIl[llIIIllIlIll[16]]));
        if (i.llllIllIIIllll(var1) && (!i.llllIllIIlIIII(Combat.getMissingHealth(), llIIIllIlIll[3]) || i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.ATTACK), Skills.getLevel((Skill)Skill.ATTACK)) && i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS)))) {
            Item var2 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIIllIlIll[0]];
                stringArray[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[15]];
                return item.hasAction(stringArray);
            });
            if (i.llllIllIIIllll(var2)) {
                i var3;
                var2.interact(llIIIllIlIIl[llIIIllIlIll[4]]);
                var3.sleep(llIIIllIlIll[0]);
            }
            var1.interact(llIIIllIlIIl[llIIIllIlIll[5]]);
            return llIIIllIlIll[1];
        }
        Item var2 = Inventory.getFirst(item -> {
            boolean bl;
            if (!i.llllIllIIlIlIl(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[13]]) ? 1 : 0) || i.llllIllIIIlllI(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[14]]) ? 1 : 0)) {
                bl = llIIIllIlIll[0];

                if (1 >= (0x99 ^ 0x9D)) {
                    return false;
                }
            } else {
                bl = llIIIllIlIll[1];
            }
            return bl;
        });
        if (i.llllIllIIIllll(var2) && (!i.llllIllIIlIIIl(Prayers.getPoints(), llIIIllIlIll[6]) || i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED)))) {
            var2.interact(llIIIllIlIIl[llIIIllIlIll[7]]);
            return llIIIllIlIll[1];
        }
        Item var4 = Inventory.getFirst(item -> {
            boolean bl;
            if (!i.llllIllIIlIlIl(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[11]]) ? 1 : 0) || i.llllIllIIIlllI(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[12]]) ? 1 : 0)) {
                bl = llIIIllIlIll[0];

                if (3 < -1) {
                    return false;
                }
            } else {
                bl = llIIIllIlIll[1];
            }
            return bl;
        });
        if (i.llllIllIIIllll(var4) && i.llllIllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && i.llllIllIIlIIlI(f.p(), llIIIllIlIll[8]) && i.llllIllIIlIIll(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED) + llIIIllIlIll[5])) {
            var4.interact(llIIIllIlIIl[llIIIllIlIll[6]]);
            return llIIIllIlIll[1];
        }
        if (i.llllIllIIlIlII(i.llllIllIIIllIl(Combat.getHealthPercent(), 58.0))) {
            return llIIIllIlIll[1];
        }
        Item var5 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIIIllIlIll[0]];
            stringArray[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[10]];
            return item.hasAction(stringArray);
        });
        if (i.llllIllIIIllll(var5)) {
            var5.interact(llIIIllIlIIl[llIIIllIlIll[9]]);
            return llIIIllIlIll[1];
        }
        return llIIIllIlIll[1];
    }

    private static int llllIllIIIllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean llllIllIIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIllIIIllll(Object object) {
        return object != null;
    }

    static {
        i.llllIllIIIllII();
        i.llllIllIIIIlll();
    }

    private static boolean llllIllIIlIlIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var6);
    }

    private static boolean llllIllIIIlllI(int n2) {
        return n2 != 0;
    }
}

