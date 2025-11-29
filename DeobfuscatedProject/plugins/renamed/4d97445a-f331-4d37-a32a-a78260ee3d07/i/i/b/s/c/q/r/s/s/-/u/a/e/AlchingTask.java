/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.basics.magic.stunalchtp.StunAlchTeleport;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Alching -> AlchingTask */
@TaskDesc(name="Alching", priority=2)
public class AlchingTask
extends Task {
    private final /* synthetic */ SquireAlchTeleportConfig eP;
    private static /* synthetic */ int[] lIllIlI;
    private final /* synthetic */ StunAlchTeleport eO;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        SpellBook.Standard standard;
        aS lllIllIlIIIIIll;
        if (aS.lIllIlIII(this.eO.cl() ? 1 : 0) && aS.lIllIlIII(this.eP.stunAlchOnly() ? 1 : 0)) {
            return lIllIlI[0];
        }
        if (aS.lIllIlIIl(lllIllIlIIIIIll.eP.stunAlchOnly() ? 1 : 0) && aS.lIllIlIlI(Players.getLocal().getAnimation(), lIllIlI[1])) {
            return lIllIlI[0];
        }
        Item lllIllIlIIIIIlI = Inventory.getFirst(Item::isNoted);
        if (aS.lIllIlIll(lllIllIlIIIIIlI) && aS.lIllIlIll(lllIllIlIIIIIlI = Inventory.getFirst(item -> {
            boolean bl2;
            if (aS.lIllIllIl(item.getSlot(), lIllIlI[4])) {
                bl2 = lIllIlI[3];
                0;
                if (2 != 2) {
                    return ((0x3E ^ 0x14 ^ (0xF3 ^ 0x80)) & (90 + 55 - 134 + 212 ^ 95 + 0 - 69 + 108 ^ -1)) != 0;
                }
            } else {
                bl2 = lIllIlI[0];
            }
            return bl2;
        }))) {
            return lIllIlI[0];
        }
        if (aS.lIllIllII(Skills.getLevel((Skill)Skill.MAGIC), lIllIlI[2])) {
            standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            0;
            if (((0x1E ^ 0x5B) & ~(0x39 ^ 0x7C)) != 0) {
                return false;
            }
        } else {
            standard = SpellBook.Standard.LOW_LEVEL_ALCHEMY;
        }
        SpellBook.Standard standard2 = standard;
        Magic.cast((Spell)standard2, (Item)var1_1);
        return lIllIlI[3];
    }

    private static boolean lIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public aS(StunAlchTeleport stunAlchTeleport, SquireAlchTeleportConfig squireAlchTeleportConfig) {
        this.eO = stunAlchTeleport;
        this.eP = squireAlchTeleportConfig;
    }

    private static boolean lIllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIll(Object object) {
        return object == null;
    }

    private static boolean lIllIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        aS.lIllIIlll();
    }

    private static void lIllIIlll() {
        lIllIlI = new int[5];
        aS.lIllIlI[0] = (0x43 ^ 0x64) & ~(0x21 ^ 6);
        aS.lIllIlI[1] = -1;
        aS.lIllIlI[2] = 0xBC ^ 0x8B;
        aS.lIllIlI[3] = 1;
        aS.lIllIlI[4] = 93 + 56 - 119 + 97 ^ (0x13 ^ 0x63);
    }
}

