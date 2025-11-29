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

    static {
        l.lIIlllllIIIllll();
    }

    private static boolean lIIlllllIIlIIIl(Object object, Object object2) {
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
        if (l.lIIlllllIIlIIII(this.ag.switchAttackStyle() ? 1 : 0)) {
            return lIIIlIIlIllll[0];
        }
        if (l.lIIlllllIIlIIIl(Combat.getCurrentWeaponStyle(), WeaponStyle.MELEE)) {
            return lIIIlIIlIllll[0];
        }
        CombatOption var1 = CombatOptions.getCurrent();
        if (l.lIIlllllIIlIIlI(var1)) {
            return lIIIlIIlIllll[0];
        }
        Object var2 = var1.getCombatXP();
        int lllllllllllllllIIIIlllllIlIllIll22 = ((Skill[])var2).length;
        int var3 = lIIIlIIlIllll[0];
        while (l.lIIlllllIIlIIll(var3, lllllllllllllllIIIIlllllIlIllIll22)) {
            Skill var4 = var2[var3];
            if (l.lIIlllllIIlIIll(Skills.getLevel((Skill)var4), lIIIlIIlIllll[1])) {
                return lIIIlIIlIllll[0];
            }
            ++var3;

            if (-1 != (0x62 ^ 0x66)) continue;
            return false;
        }
        var2 = new ArrayList();
        Skill[] skillArray = new Skill[lIIIlIIlIllll[2]];
        skillArray[l.lIIIlIIlIllll[0]] = Skill.ATTACK;
        skillArray[l.lIIIlIIlIllll[3]] = Skill.STRENGTH;
        skillArray[l.lIIIlIIlIllll[4]] = Skill.DEFENCE;
        Skill[] lllllllllllllllIIIIlllllIlIllIll22 = skillArray;
        var3 = lllllllllllllllIIIIlllllIlIllIll22.length;
        int var4 = lIIIlIIlIllll[0];
        while (l.lIIlllllIIlIIll(var4, var3)) {
            Skill var5 = lllllllllllllllIIIIlllllIlIllIll22[var4];
            if (l.lIIlllllIIlIIll(Skills.getLevel((Skill)var5), lIIIlIIlIllll[1])) {
                Skill[] skillArray2 = new Skill[lIIIlIIlIllll[3]];
                skillArray2[l.lIIIlIIlIllll[0]] = var5;
                List var6 = CombatOptions.getByCombatXP((Skill[])skillArray2);
                if (l.lIIlllllIIlIlII(var6.isEmpty() ? 1 : 0)) {

                    if (2 >= 3) {
                        return ((3 + 47 - -164 + 29 ^ 161 + 143 - 247 + 111) & (0x91 ^ 0x87 ^ (0xE6 ^ 0xAB) ^ -1)) != 0;
                    }
                } else {
                    var2 = var6;
                }
            }
            ++var4;

            if (1 < 3) continue;
            return ((0xB1 ^ 0xAB ^ (0x10 ^ 0x2C)) & (32 + 46 - 12 + 122 ^ 88 + 61 - 24 + 29 ^ -1)) != 0;
        }
        if (l.lIIlllllIIlIlII(var2.isEmpty() ? 1 : 0)) {
            return lIIIlIIlIllll[0];
        }
        ((CombatOption)var2_2.get(lIIIlIIlIllll[0])).select();

        return lIIIlIIlIllll[3];
    }

    private static boolean lIIlllllIIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllllIIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlllllIIlIlII(int n2) {
        return n2 != 0;
    }
}

