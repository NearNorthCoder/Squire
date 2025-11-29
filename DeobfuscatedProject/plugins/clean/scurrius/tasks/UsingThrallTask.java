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
import gg.squire.scurrius.tasks.ScurriusTaskBase;
import gg.squire.scurrius.tasks.BHelper;

@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends ScurriusTaskBase {

    private boolean y() {
        int n2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (x.lIlIllIIlIIlIII(necromancy.canCast() ? 1 : 0) && x.lIlIllIIlIIlIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), lIIlIlIllllll[5])) {
            n2 = lIIlIlIllllll[2];

            }
        } else {
            n2 = lIIlIlIllllll[0];
        }
        return n2 != 0;
    }

    @Override
    public boolean a() {
        x var1;
        if (x.lIlIllIIlIIIlll(this.y() ? 1 : 0)) {
            return lIIlIlIllllll[0];
        }
        if (x.lIlIllIIlIIlIII(Vars.getBit((int)lIIlIlIllllll[1]))) {
            return lIIlIlIllllll[0];
        }
        if (!x.lIlIllIIlIIIlll(var1.f.isDead() ? 1 : 0) || x.lIlIllIIlIIIlll(var1.g ? 1 : 0)) {
            return lIIlIlIllllll[0];
        }
        int[] nArray = new int[lIIlIlIllllll[2]];
        nArray[x.lIIlIlIllllll[0]] = lIIlIlIllllll[3];
        if (x.lIlIllIIlIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIlIlIllllll[2]];
            nArray2[x.lIIlIlIllllll[0]] = lIIlIlIllllll[3];
            if (x.lIlIllIIlIIIlll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                return lIIlIlIllllll[0];
            }
        }
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        Magic.cast((Spell)necromancy, (int)lIIlIlIllllll[0], (int)lIIlIlIllllll[4]);
        return lIIlIlIllllll[2];
    }

    private static boolean lIlIllIIlIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        x.lIlIllIIlIIIllI();
    }

    @Inject
    protected UsingThrallTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    private static boolean lIlIllIIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIlIIlIII(int n2) {
        return n2 != 0;
    }
}

