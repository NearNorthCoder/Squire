/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.whisperer.tasks.WhispererTaskBase;
import gg.squire.whisperer.tasks.GameEnum;

@TaskDesc(name="Drinking brews", priority=25)
public class DrinkingBrewsTask
extends WhispererTaskBase {
    private  w ae;

    public DrinkingBrewsTask() {
        this.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x64 ^ 0x60) > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        v var13;
        if ((Combat.getCurrentHealth() < this.i.eatAt())) {
            this.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.BREWING;
            0;
            if (((30 + 177 - 99 + 145 ^ 22 + 29 - -37 + 93) & (150 + 177 - 280 + 185 ^ 105 + 118 - 186 + 123 ^ -1)) != 0) {
                return ((0x6D ^ 1 ^ (0xC0 ^ 0xAB)) & (158 + 147 - 140 + 1 ^ 102 + 67 - 80 + 72 ^ -1)) != 0;
            }
        } else if ((Combat.getMissingHealth( <= 0)) && (Skills.getLevel((SkiSkill.STRENGTH) > Skills.getBoostedLevel((SkiSkill.STRENGTH))) {
            var13.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.RESTORING;
            0;
            if (-(0x7A ^ 0x72 ^ (0x23 ^ 0x2F)) > 0) {
                return ((0x1A ^ 0x7E ^ (0x46 ^ 0x1E)) & (0x1A ^ 0x74 ^ (0x32 ^ 0x60) ^ -1)) != 0;
            }
        } else if (((Object)var13.ae == (Object)var13.ae2)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.RESTORING)) {
            var13.ae = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE;
        }
        if (((Object)var13.ae == (Object)var13.ae2)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.NONE)) {
            return 0;
        }
        Item var14 = Inventory.getFirst(item -> {
            String string;
            String string2 = item.getName();
            if (((Object)this.ae == (Object)this.ae2)r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.w.BREWING)) {
                string = var1[1];
                0;
                if (1 <= -1) {
                    return ((173 + 173 - 312 + 162 ^ 157 + 138 - 111 + 11) & (0x63 ^ 0x64 ^ (0x2F ^ 9) & ~(0x7B ^ 0x5D) ^ -1)) != 0;
                }
            } else {
                string = var1[2];
            }
            return string2.contains(string);
        });
        if var14 == null {
            return 0;
        }
        var1_1.interact(var1[0]);
        return 1;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

}

