/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import m.e.i.q.u.r.-.n.s.e.r.i.S_Unknown;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Casting humidify -> CastinghumidifyTask */
@TaskDesc(name="Casting humidify", priority=105, blocking=true)
public class CastingHumidifyTask
extends S_Unknown {
    private static /* synthetic */ int[] llllllIIlIIl;

    private static void lIIlIlIIIlIlIIl() {
        llllllIIlIIl = new int[2];
        Q.llllllIIlIIl[0] = (0x5F ^ 0x18 ^ (0xD5 ^ 0x96)) & (33 + 129 - 32 + 2 ^ 46 + 64 - 100 + 118 ^ -1);
        Q.llllllIIlIIl[1] = 1;
    }

    private static boolean lIIlIlIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (Q.lIIlIlIIIlIlIlI(this.au.humidify() ? 1 : 0)) {
            return llllllIIlIIl[0];
        }
        SpellBook.Lunar var1 = SpellBook.Lunar.HUMIDIFY;
        if (Q.lIIlIlIIIlIlIlI(var1.canCast() ? 1 : 0)) {
            return llllllIIlIIl[0];
        }
        if (Q.lIIlIlIIIlIlIll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIIlIIl[1];
        }
        Magic.cast((Spell)var1_1, (int)llllllIIlIIl[1], (boolean)llllllIIlIIl[1]);
        return llllllIIlIIl[1];
    }

    private static boolean lIIlIlIIIlIlIll(int n2) {
        return n2 != 0;
    }

    static {
        Q.lIIlIlIIIlIlIIl();
    }

    @Inject
    protected Q(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }
}

