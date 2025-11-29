/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends ScurriusManager {

    private static void var2() {
        var1 = new int[6];
        x.var1[0] = (0xC9 ^ 0x85) & ~(0x63 ^ 0x2F);
        x.var1[1] = 0xFFFFB07F & 0x7FFD;
        x.var1[2] = 1;
        x.var1[3] = -(0xFFFFEF0F & 0x13F6) & (0xFFFFF7DF & 0x6FFF);
        x.var1[4] = 0x27 ^ 0x1E;
        x.var1[5] = 0x8F ^ 0x89;
    }

    private boolean y() {
        int n2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (x.var3(necromancy.canCast() ? 1 : 0) && x.var4(Skills.getBoostedLevel((SkiSkill.PRAYER), var1[5])) {
            n2 = var1[2];
            0;
            if null != null {
                return ((0x65 ^ 0x5E ^ (0xA5 ^ 0xC3)) & (187 + 17 - 111 + 106 ^ 1 + 105 - 24 + 72 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    @Override
    public boolean a() {
        x var5;
        if (x.var6(this.y() ? 1 : 0)) {
            return var1[0];
        }
        if (x.var3(Vars.getBit((int)var1[1]))) {
            return var1[0];
        }
        if (!x.var6(var5.f.isDead() ? 1 : 0) || x.var6(var5.g)) {
            return var1[0];
        }
        int[] nArray = new int[var1[2]];
        nArray[x.var1[0]] = var1[3];
        if (x.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[2]];
            nArray2[x.var1[0]] = var1[3];
            if (x.var6(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                return var1[0];
            }
        }
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        Magic.cast((Spenecromancy, (int)var1[0], (int)var1[4]);
        return var1[2];
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    static {
        x.var2();
    }

    @Inject
    protected UsingThrallTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}

