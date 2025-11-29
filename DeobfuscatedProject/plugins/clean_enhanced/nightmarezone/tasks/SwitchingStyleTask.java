/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponStyle
 *  gg.squire.api.combat.CombatOption
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.nightmarezone.tasks;

import com.openosrs.client.util.WeaponStyle;
import gg.squire.api.combat.CombatOption;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;

@TaskDesc(name="Switching style", priority=0x7FFFFFFF)
public class SwitchingStyleTask
extends Task {
    private final  SquireNightmareZone af;
    private final  SquireNightmareZoneConfig ag;
    
    private final  Client ah;

    private static void var2() {
        var1 = new int[5];
        l.var1[0] = (3 ^ 0x45) & ~(0x41 ^ 7);
        l.var1[1] = 0x7C ^ 0x27 ^ (0x59 ^ 0x61);
        l.var1[2] = 3;
        l.var1[3] = 1;
        l.var1[4] = 2;
    }

    static {
        l.var2();
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public SwitchingStyleTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.af = squireNightmareZone;
        this.ag = squireNightmareZoneConfig;
        this.ah = client;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (l.var4(this.ag.switchAttackStyle() ? 1 : 0)) {
            return var1[0];
        }
        if (l.var3(Combat.getCurrentWeaponStyle(), WeaponStyle.MELEE)) {
            return var1[0];
        }
        CombatOption var5 = CombatOptions.getCurrent();
        if (l.var6(var5)) {
            return var1[0];
        }
        Object var7 = var5.getCombatXP();
        int lllllllllllllllIIIIlllllIlIllIll22 = ((Skill[])var7).length;
        int var8 = var1[0];
        while (l.var9(var8, lllllllllllllllIIIIlllllIlIllIll22)) {
            Skill var10 = var7[var8];
            if (l.var9(Skills.getLevel((Skivar10), var1[1])) {
                return var1[0];
            }
            ++var8;
            0;
            if (-1 != (0x62 ^ 0x66)) continue;
            return ((0x5B ^ 0x63) & ~(0xF ^ 0x37)) != 0;
        }
        var7 = new ArrayList();
        Skill[] skillArray = new Skill[var1[2]];
        skillArray[l.var1[0]] = Skill.ATTACK;
        skillArray[l.var1[3]] = Skill.STRENGTH;
        skillArray[l.var1[4]] = Skill.DEFENCE;
        Skill[] lllllllllllllllIIIIlllllIlIllIll22 = skillArray;
        var8 = lllllllllllllllIIIIlllllIlIllIll22.length;
        int var10 = var1[0];
        while (l.var9(var10, var8)) {
            Skill var11 = lllllllllllllllIIIIlllllIlIllIll22[var10];
            if (l.var9(Skills.getLevel((Skivar11), var1[1])) {
                Skill[] skillArray2 = new Skill[var1[3]];
                skillArray2[l.var1[0]] = var11;
                List var12 = CombatOptions.getByCombatXP((Skill[])skillArray2);
                if (l.var13(var12.isEmpty() ? 1 : 0)) {
                    0;
                    if (2 >= 3) {
                        return ((3 + 47 - -164 + 29 ^ 161 + 143 - 247 + 111) & (0x91 ^ 0x87 ^ (0xE6 ^ 0xAB) ^ -1)) != 0;
                    }
                } else {
                    var7 = var12;
                }
            }
            ++var10;
            0;
            if (1 < 3) continue;
            return ((0xB1 ^ 0xAB ^ (0x10 ^ 0x2C)) & (32 + 46 - 12 + 122 ^ 88 + 61 - 24 + 29 ^ -1)) != 0;
        }
        if (l.var13(var7.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        ((CombatOption)var2_2.get(var1[0])).select();
        0;
        return var1[3];
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }
}

