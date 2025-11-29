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
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.MiningTaskBase;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Casting humidify", priority=105, blocking=true)
public class CastingHumidifyTask
extends MiningTaskBase {

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
    protected CastingHumidifyTask(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }
}

