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
import gg.squire.skilling.tasks.GameEnum4;
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

    private static void var3() {
        var1 = new int[4];
        K.var1[0] = (0x79 ^ 0x3A ^ (4 ^ 0x4F)) & (69 + 60 - 117 + 192 ^ 130 + 96 - 182 + 152 ^ -1);
        K.var1[1] = 3;
        K.var1[2] = 1;
        K.var1[3] = 0x41 ^ 0x52 ^ (0x17 ^ 0x33);
    }

    private Spell S() {
        if (K.var4(Skills.getLevel((SkiSkill.MAGIC), var1[3])) {
            return SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        }
        return SpellBook.Standard.LOW_LEVEL_ALCHEMY;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (K.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0x48 ^ 0x40 ^ (0x6F ^ 0x62)) != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(Item item) {
        void var16;
        String[] stringArray;
        String[] stringArray2 = stringArray = this.x.alchItems().split(var2[var1[0]]);
        int n2 = stringArray2.length;
        int var17 = var1[0];
        while (K.var14(var17, (int)var16)) {
            void var18;
            void var19;
            String var20 = var19[var17];
            if (!K.var21((var20 = var20.trim()).equals(var18.getName()) ? 1 : 0) || K.var22(var20.equals(String.valueOf(var18.getId())) ? 1 : 0)) {
                return var1[2];
            }
            ++var17;
            0;
            if null == null continue;
            return ((0x17 ^ 0x67 ^ (0x46 ^ 0x17)) & (0x2F ^ 0x1A ^ (0xB0 ^ 0xA4) ^ -1)) != 0;
        }
        return var1[0];
    }

    static {
        K.var3();
        K.var23();
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var22(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        K var25;
        if (K.var26((Object)this.x.activity(), (Object)b.ALCHING)) {
            return var1[0];
        }
        Item var27 = Inventory.getFirst(var25::d);
        if (K.var24(var27)) {
            return var1[0];
        }
        Spell var28 = var25.S();
        if (K.var21(var28.canCast() ? 1 : 0)) {
            return var1[0];
        }
        var2_2.castOn((Interactable)var1_1);
        this.sleep(var1[1]);
        return var1[2];
    }

    private static boolean var26(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    private static void var23() {
        var2 = new String[var1[2]];
        K.var2[K.var1[0]] = ",";
    }
}

