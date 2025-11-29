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
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

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

/* TASK: Switching style -> SwitchingstyleTask */
@TaskDesc(name="Switching style", priority=0x7FFFFFFF)
public class l
extends Task {
    private final /* synthetic */ SquireNightmareZone af;
    private final /* synthetic */ SquireNightmareZoneConfig ag;
    private static /* synthetic */ int[] lIIIlIIlIllll;
    private final /* synthetic */ Client ah;

    private static void lIIlllllIIIllll() {
        lIIIlIIlIllll = new int[5];
        l.lIIIlIIlIllll[0] = (3 ^ 0x45) & ~(0x41 ^ 7);
        l.lIIIlIIlIllll[1] = 0x7C ^ 0x27 ^ (0x59 ^ 0x61);
        l.lIIIlIIlIllll[2] = 3;
        l.lIIIlIIlIllll[3] = 1;
        l.lIIIlIIlIllll[4] = 2;
    }

    static {
        l.lIIlllllIIIllll();
    }

    private static boolean lIIlllllIIlIIIl(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public l(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
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
        CombatOption var3 = CombatOptions.getCurrent();
        if (l.lIIlllllIIlIIlI(var3)) {
            return lIIIlIIlIllll[0];
        }
        Object var6 = var3.getCombatXP();
        int lllllllllllllllIIIIlllllIlIllIll22 = ((Skill[])var6).length;
        int var2 = lIIIlIIlIllll[0];
        while (l.lIIlllllIIlIIll(var2, lllllllllllllllIIIIlllllIlIllIll22)) {
            Skill var5 = var6[var2];
            if (l.lIIlllllIIlIIll(Skills.getLevel((Skill)var5), lIIIlIIlIllll[1])) {
                return lIIIlIIlIllll[0];
            }
            ++var2;
            0;
            if (-1 != (0x62 ^ 0x66)) continue;
            return false;
        }
        var6 = new ArrayList();
        Skill[] skillArray = new Skill[lIIIlIIlIllll[2]];
        skillArray[l.lIIIlIIlIllll[0]] = Skill.ATTACK;
        skillArray[l.lIIIlIIlIllll[3]] = Skill.STRENGTH;
        skillArray[l.lIIIlIIlIllll[4]] = Skill.DEFENCE;
        Skill[] lllllllllllllllIIIIlllllIlIllIll22 = skillArray;
        var2 = lllllllllllllllIIIIlllllIlIllIll22.length;
        int var5 = lIIIlIIlIllll[0];
        while (l.lIIlllllIIlIIll(var5, var2)) {
            Skill var1 = lllllllllllllllIIIIlllllIlIllIll22[var5];
            if (l.lIIlllllIIlIIll(Skills.getLevel((Skill)var1), lIIIlIIlIllll[1])) {
                Skill[] skillArray2 = new Skill[lIIIlIIlIllll[3]];
                skillArray2[l.lIIIlIIlIllll[0]] = var1;
                List var4 = CombatOptions.getByCombatXP((Skill[])skillArray2);
                if (l.lIIlllllIIlIlII(var4.isEmpty() ? 1 : 0)) {
                    0;
                    if (2 >= 3) {
                        return ((3 + 47 - -164 + 29 ^ 161 + 143 - 247 + 111) & (0x91 ^ 0x87 ^ (0xE6 ^ 0xAB) ^ -1)) != 0;
                    }
                } else {
                    var6 = var4;
                }
            }
            ++var5;
            0;
            if (1 < 3) continue;
            return ((0xB1 ^ 0xAB ^ (0x10 ^ 0x2C)) & (32 + 46 - 12 + 122 ^ 88 + 61 - 24 + 29 ^ -1)) != 0;
        }
        if (l.lIIlllllIIlIlII(var6.isEmpty() ? 1 : 0)) {
            return lIIIlIIlIllll[0];
        }
        ((CombatOption)var2_2.get(lIIIlIIlIllll[0])).select();
        0;
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

