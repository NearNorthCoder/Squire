/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a;

/* TASK: Using Shadow Veil -> UsingshadowveilTask */
@TaskDesc(name="Using Shadow Veil", priority=350, register=true, blocking=true)
public class z
extends a {
    private static final /* synthetic */ Logger ao;
    private static /* synthetic */ int[] lIIllIlIlIIIl;

    private static boolean lIllIIIIIlllIIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIIIllIlIl() {
        lIIllIlIlIIIl = new int[4];
        z.lIIllIlIlIIIl[0] = (0x57 ^ 0x68 ^ (0x74 ^ 0x56)) & (90 + 128 - 196 + 152 ^ 47 + 82 - 1 + 51 ^ -1);
        z.lIIllIlIlIIIl[1] = 0xFFFFF643 & 0x39BF;
        z.lIIllIlIlIIIl[2] = 1;
        z.lIIllIlIlIIIl[3] = 0xFFFFF9FE & 0x367F;
    }

    @Override
    public boolean l() {
        z var1;
        if (z.lIllIIIIIllIllI(this.p.shadowVeil() ? 1 : 0)) {
            return lIIllIlIlIIIl[0];
        }
        if (z.lIllIIIIIllIlll(var1.o.j() ? 1 : 0)) {
            return lIIllIlIlIIIl[0];
        }
        if (!z.lIllIIIIIlllIII(SpellBook.getCurrent(), SpellBook.NECROMANCY) || z.lIllIIIIIllIllI(SpellBook.Necromancy.SHADOW_VEIL.canCast() ? 1 : 0)) {
            return lIIllIlIlIIIl[0];
        }
        NPC var2 = var1.a(var1.p.pickpocketTarget());
        if (z.lIllIIIIIlllIIl(var2)) {
            return lIIllIlIlIIIl[0];
        }
        if (z.lIllIIIIIlllIlI(Vars.getBit((int)lIIllIlIlIIIl[1]), lIIllIlIlIIIl[2])) {
            return lIIllIlIlIIIl[0];
        }
        if (z.lIllIIIIIlllIlI(Vars.getBit((int)lIIllIlIlIIIl[3]), lIIllIlIlIIIl[2])) {
            return lIIllIlIlIIIl[0];
        }
        Magic.cast((Spell)SpellBook.Necromancy.SHADOW_VEIL, (int)lIIllIlIlIIIl[2], (boolean)lIIllIlIlIIIl[2]);
        return lIIllIlIlIIIl[2];
    }

    private static boolean lIllIIIIIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIIIlllIII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public z(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    static {
        z.lIllIIIIIllIlIl();
        ao = LoggerFactory.getLogger(z.class);
    }

    private static boolean lIllIIIIIllIllI(int n2) {
        return n2 == 0;
    }
}

