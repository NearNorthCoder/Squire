/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import gg.squire.skilling.tasks.GameEnum9;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Alching")
public class AlchingTask
extends Task {
    private final  BankStanderConfig x;

    @Inject
    public AlchingTask(BankStanderConfig bankStanderConfig) {
        this.x = bankStanderConfig;
    }

    private Spell S() {
        if (K.lIllIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lllIlIllIlI[3])) {
            return SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        }
        return SpellBook.Standard.LOW_LEVEL_ALCHEMY;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(Item item) {
        void var2;
        String[] stringArray;
        String[] stringArray2 = stringArray = this.x.alchItems().split(lllIlIllIIl[lllIlIllIlI[0]]);
        int n2 = stringArray2.length;
        int var3 = lllIlIllIlI[0];
        while (K.lIllIIIIIIlllI(var3, (int)var2)) {
            void var4;
            void var5;
            String var6 = var5[var3];
            if (!K.lIllIIIIIIllII((var6 = var6.trim()).equals(var4.getName()) ? 1 : 0) || K.lIllIIIIIIllll(var6.equals(String.valueOf(var4.getId())) ? 1 : 0)) {
                return lllIlIllIlI[2];
            }
            ++var3;

            return ((0x17 ^ 0x67 ^ (0x46 ^ 0x17)) & (0x2F ^ 0x1A ^ (0xB0 ^ 0xA4) ^ -1)) != 0;
        }
        return lllIlIllIlI[0];
    }

    static {
        K.lIllIIIIIIlIIl();
        K.lIllIIIIIIlIII();
    }

    private static boolean lIllIIIIIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIIllll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        K var7;
        if (K.lIllIIIIIIlIlI((Object)this.x.activity(), (Object)b.ALCHING)) {
            return lllIlIllIlI[0];
        }
        Item var8 = Inventory.getFirst(var7::d);
        if (K.lIllIIIIIIlIll(var8)) {
            return lllIlIllIlI[0];
        }
        Spell var9 = var7.S();
        if (K.lIllIIIIIIllII(var9.canCast() ? 1 : 0)) {
            return lllIlIllIlI[0];
        }
        var2_2.castOn((Interactable)var1_1);
        this.sleep(lllIlIllIlI[1]);
        return lllIlIllIlI[2];
    }

    private static boolean lIllIIIIIIlIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIIIIllII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIIIlIII() {
        lllIlIllIIl = new String[lllIlIllIlI[2]];
        K.lllIlIllIIl[K.lllIlIllIlI[0]] = ",";
    }
}

