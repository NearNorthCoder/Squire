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
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.pvm.tasks.CHelper;

@TaskDesc(name="Drinking Range Potion")
public class DrinkingRangePotionTask
extends Task {
    private final  c aa;

    private final  SquireShamanConfig Z;

    private static void lIlIlllIIIIlIlI() {
        lIIlIllllIlIl = new String[lIIlIllllIllI[2]];
        o.lIIlIllllIlIl[o.lIIlIllllIllI[0]] = "Drink";
    }

    static {
        o.lIlIlllIIIIlIll();
        o.lIlIlllIIIIlIlI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var1;
        if (o.lIlIlllIIIIllII(this.aa.s() ? 1 : 0)) {
            return lIIlIllllIllI[0];
        }
        if (o.lIlIlllIIIIllIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lIIlIllllIllI[1])) {
            return lIIlIllllIllI[0];
        }
        Item var2 = Inventory.getFirst(var1.Z.rangePotion().u());
        if (o.lIlIlllIIIIlllI(var2)) {
            return lIIlIllllIllI[0];
        }
        var1_1.interact(lIIlIllllIlIl[lIIlIllllIllI[0]]);
        return lIIlIllllIllI[2];
    }

    private static boolean lIlIlllIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIlllIIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIIIIlllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIIIIllII(int n2) {
        return n2 == 0;
    }

    @Inject
    public DrinkingRangePotionTask(SquireShamanConfig squireShamanConfig, c c2) {
        this.Z = squireShamanConfig;
        this.aa = c2;
    }
}

