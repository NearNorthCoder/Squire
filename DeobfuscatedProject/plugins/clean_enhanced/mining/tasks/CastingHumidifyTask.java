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

    private static void var2() {
        var1 = new int[2];
        Q.var1[0] = (0x5F ^ 0x18 ^ (0xD5 ^ 0x96)) & (33 + 129 - 32 + 2 ^ 46 + 64 - 100 + 118 ^ -1);
        Q.var1[1] = 1;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (Q.var3(this.au.humidify() ? 1 : 0)) {
            return var1[0];
        }
        SpellBook.Lunar var4 = SpellBook.Lunar.HUMIDIFY;
        if (Q.var3(var4.canCast() ? 1 : 0)) {
            return var1[0];
        }
        if (Q.var5(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var1[1];
        }
        Magic.cast((Spevar1_1, (int)var1[1], (boolean)var1[1]);
        return var1[1];
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    static {
        Q.var2();
    }

    @Inject
    protected CastingHumidifyTask(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }
}

