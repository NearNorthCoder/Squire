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
package gg.squire.thieving.tasks;

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
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Using Shadow Veil", priority=350, register=true, blocking=true)
public class UsingShadowVeilTask
extends ThievingManager {
    private static final  Logger ao;

    private static boolean var2(Object object) {
        return object == null;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new int[4];
        z.var1[0] = (0x57 ^ 0x68 ^ (0x74 ^ 0x56)) & (90 + 128 - 196 + 152 ^ 47 + 82 - 1 + 51 ^ -1);
        z.var1[1] = 0xFFFFF643 & 0x39BF;
        z.var1[2] = 1;
        z.var1[3] = 0xFFFFF9FE & 0x367F;
    }

    @Override
    public boolean l() {
        z var5;
        if (z.var6(this.p.shadowVeil() ? 1 : 0)) {
            return var1[0];
        }
        if (z.var3(var5.o.j() ? 1 : 0)) {
            return var1[0];
        }
        if (!z.var7(SpellBook.getCurrent(), SpellBook.NECROMANCY) || z.var6(SpellBook.Necromancy.SHADOW_VEIL.canCast() ? 1 : 0)) {
            return var1[0];
        }
        NPC var8 = var5.a(var5.p.pickpocketTarget());
        if (z.var2(var8)) {
            return var1[0];
        }
        if (z.var9(Vars.getBit((int)var1[1]), var1[2])) {
            return var1[0];
        }
        if (z.var9(Vars.getBit((int)var1[3]), var1[2])) {
            return var1[0];
        }
        Magic.cast((SpeSpellBook.Necromancy.SHADOW_VEIL, (int)var1[2], (boolean)var1[2]);
        return var1[2];
    }

    private static boolean var9(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var7(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public UsingShadowVeilTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    static {
        z.var4();
        ao = LoggerFactory.getLogger(UsingShadowVeilTask.class);
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }
}

