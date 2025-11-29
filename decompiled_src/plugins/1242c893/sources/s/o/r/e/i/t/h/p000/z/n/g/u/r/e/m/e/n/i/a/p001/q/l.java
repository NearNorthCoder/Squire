package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

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
@TaskDesc(name = "Switching style", priority = Integer.MAX_VALUE)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.l  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/l.class */
public class l extends Task {
    private final /* synthetic */ SquireNightmareZone af;
    private final /* synthetic */ SquireNightmareZoneConfig ag;
    private static /* synthetic */ int[] lIIIlIIlIllll;
    private final /* synthetic */ Client ah;

    private static void lIIlllllIIIllll() {
        lIIIlIIlIllll = new int[5];
        lIIIlIIlIllll[0] = (3 ^ 69) & ((65 ^ 7) ^ (-1));
        lIIIlIIlIllll[1] = (124 ^ 39) ^ (89 ^ 97);
        lIIIlIIlIllll[2] = "   ".length();
        lIIIlIIlIllll[3] = " ".length();
        lIIIlIIlIllll[4] = "  ".length();
    }

    static {
        lIIlllllIIIllll();
    }

    private static boolean lIIlllllIIlIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Inject
    public l(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.af = squireNightmareZone;
        this.ag = squireNightmareZoneConfig;
        this.ah = client;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    public boolean run() {
        if (!lIIlllllIIlIIII(this.ag.switchAttackStyle() ? 1 : 0) && !lIIlllllIIlIIIl(Combat.getCurrentWeaponStyle(), WeaponStyle.MELEE)) {
            CombatOption current = CombatOptions.getCurrent();
            if (lIIlllllIIlIIlI(current)) {
                return lIIIlIIlIllll[0];
            }
            Skill[] combatXP = current.getCombatXP();
            int length = combatXP.length;
            int lllllllllllllllIIIIlllllIlIllIlI = lIIIlIIlIllll[0];
            while (lIIlllllIIlIIll(lllllllllllllllIIIIlllllIlIllIlI, length)) {
                if (lIIlllllIIlIIll(Skills.getLevel(combatXP[lllllllllllllllIIIIlllllIlIllIlI]), lIIIlIIlIllll[1])) {
                    return lIIIlIIlIllll[0];
                }
                lllllllllllllllIIIIlllllIlIllIlI++;
                "".length();
                if ((-" ".length()) == (98 ^ 102)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            List arrayList = new ArrayList();
            Skill[] skillArr = new Skill[lIIIlIIlIllll[2]];
            skillArr[lIIIlIIlIllll[0]] = Skill.ATTACK;
            skillArr[lIIIlIIlIllll[3]] = Skill.STRENGTH;
            skillArr[lIIIlIIlIllll[4]] = Skill.DEFENCE;
            int lllllllllllllllIIIIlllllIlIllIlI2 = skillArr.length;
            int i = lIIIlIIlIllll[0];
            while (lIIlllllIIlIIll(i, lllllllllllllllIIIIlllllIlIllIlI2)) {
                Skill skill = skillArr[i];
                if (lIIlllllIIlIIll(Skills.getLevel(skill), lIIIlIIlIllll[1])) {
                    Skill[] skillArr2 = new Skill[lIIIlIIlIllll[3]];
                    skillArr2[lIIIlIIlIllll[0]] = skill;
                    List byCombatXP = CombatOptions.getByCombatXP(skillArr2);
                    if (lIIlllllIIlIlII(byCombatXP.isEmpty() ? 1 : 0)) {
                        "".length();
                        if ("  ".length() >= "   ".length()) {
                            return ((((3 + 47) - (-164)) + 29) ^ (((161 + 143) - 247) + 111)) & (((145 ^ 135) ^ (230 ^ 171)) ^ (-" ".length()));
                        }
                    } else {
                        arrayList = byCombatXP;
                    }
                }
                i++;
                "".length();
                if (" ".length() >= "   ".length()) {
                    return ((177 ^ 171) ^ (16 ^ 44)) & (((((32 + 46) - 12) + 122) ^ (((88 + 61) - 24) + 29)) ^ (-" ".length()));
                }
            }
            if (lIIlllllIIlIlII(arrayList.isEmpty() ? 1 : 0)) {
                return lIIIlIIlIllll[0];
            }
            ((CombatOption) arrayList.get(lIIIlIIlIllll[0])).select();
            "".length();
            return lIIIlIIlIllll[3];
        }
        return lIIIlIIlIllll[0];
    }

    private static boolean lIIlllllIIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIIlllllIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllllIIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllllIIlIlII(int i) {
        return i != 0;
    }
}
