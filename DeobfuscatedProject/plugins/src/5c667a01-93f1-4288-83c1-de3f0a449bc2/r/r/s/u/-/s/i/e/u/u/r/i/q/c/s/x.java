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
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

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
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;

@TaskDesc(name="Using thrall", priority=4999)
public class x
extends a {
    private static /* synthetic */ int[] lIIlIlIllllll;

    private static void lIlIllIIlIIIllI() {
        lIIlIlIllllll = new int[6];
        x.lIIlIlIllllll[0] = (0xC9 ^ 0x85) & ~(0x63 ^ 0x2F);
        x.lIIlIlIllllll[1] = 0xFFFFB07F & 0x7FFD;
        x.lIIlIlIllllll[2] = " ".length();
        x.lIIlIlIllllll[3] = -(0xFFFFEF0F & 0x13F6) & (0xFFFFF7DF & 0x6FFF);
        x.lIIlIlIllllll[4] = 0x27 ^ 0x1E;
        x.lIIlIlIllllll[5] = 0x8F ^ 0x89;
    }

    private boolean y() {
        int n2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (x.lIlIllIIlIIlIII(necromancy.canCast() ? 1 : 0) && x.lIlIllIIlIIlIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), lIIlIlIllllll[5])) {
            n2 = lIIlIlIllllll[2];
            "".length();
            if (null != null) {
                return ((0x65 ^ 0x5E ^ (0xA5 ^ 0xC3)) & (187 + 17 - 111 + 106 ^ 1 + 105 - 24 + 72 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIlIlIllllll[0];
        }
        return n2 != 0;
    }

    @Override
    public boolean a() {
        x llllllllllllllIllllIllIIlIIIlIlI;
        if (x.lIlIllIIlIIIlll(this.y() ? 1 : 0)) {
            return lIIlIlIllllll[0];
        }
        if (x.lIlIllIIlIIlIII(Vars.getBit((int)lIIlIlIllllll[1]))) {
            return lIIlIlIllllll[0];
        }
        if (!x.lIlIllIIlIIIlll(llllllllllllllIllllIllIIlIIIlIlI.f.isDead() ? 1 : 0) || x.lIlIllIIlIIIlll(llllllllllllllIllllIllIIlIIIlIlI.g ? 1 : 0)) {
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
    protected x(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    private static boolean lIlIllIIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIlIIlIII(int n2) {
        return n2 != 0;
    }
}

