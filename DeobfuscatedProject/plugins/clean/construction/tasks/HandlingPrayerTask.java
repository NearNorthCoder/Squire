/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.ConstructionManager;
import i.i.b.s.c.q.r.s.s.-.u.a.e.f;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Handling prayer", priority=100)
public class HandlingPrayerTask
extends Task {
    private final  a aF;

    @Inject
    private HandlingPrayerTask(a a2) {
        this.aF = a2;
    }

    private static boolean lIIIIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIlIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIllll(Object object) {
        return object == null;
    }

    static {
        u.lIIIIIIllIl();
        u.lIIIIIIllII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Prayer prayer;
        Prayer llIIlIIIIllIIII;
        u llIIlIIIIllIIlI;
        if (!u.lIIIIIIlllI(this.aF.k()) || u.lIIIIIIllll(this.aF.k().y())) {
            Prayers.disableAll();
            return lIIlIlIll[0];
        }
        List<f> llIIlIIIIllIIIl = llIIlIIIIllIIlI.aF.i();
        if (!u.lIIIIIIlllI(llIIlIIIIllIIIl) || u.lIIIIIlIIII(llIIlIIIIllIIIl.isEmpty() ? 1 : 0)) {
            llIIlIIIIllIIII = llIIlIIIIllIIlI.aF.j();

            if (3 == 1) {
                return false;
            }
        } else {
            f llIIlIIIIlIllll = llIIlIIIIllIIIl.get(lIIlIlIll[1]);
            llIIlIIIIllIIII = llIIlIIIIlIllll.J().j();
        }
        if (u.lIIIIIIllll(llIIlIIIIllIIII)) {
            Log.info((String)lIIlIlIlI[lIIlIlIll[1]]);
            Prayers.disableAll();
            return lIIlIlIll[0];
        }
        if (u.lIIIIIlIIII(llIIlIIIIllIIlI.W() ? 1 : 0)) {
            prayer = Prayer.PIETY;

            if (((0xF0 ^ 0xC7) & ~(0xF2 ^ 0xC5)) < -1) {
                return false;
            }
        } else {
            prayer = Prayer.MYSTIC_MIGHT;
        }
        Prayer prayer2 = prayer;
        return Prayers.flick(List.of(prayer2, var2_2));
    }

    private static boolean lIIIIIIlllI(Object object) {
        return object != null;
    }

        return String.valueOf(llIIlIIIIlIIIlI);
    }

    public boolean W() {
        int n2;
        if (u.lIIIIIlIIIl(Skills.getLevel((Skill)Skill.PRAYER), lIIlIlIll[2]) && u.lIIIIIlIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIlIll[2]) && u.lIIIIIlIIIl(Vars.getBit((int)lIIlIlIll[3]), lIIlIlIll[4])) {
            n2 = lIIlIlIll[0];

            if (3 != 3) {
                return ((0xA1 ^ 0x8E ^ (0x16 ^ 0x63)) & (143 + 9 - -37 + 60 ^ 73 + 129 - 102 + 63 ^ -1)) != 0;
            }
        } else {
            n2 = lIIlIlIll[1];
        }
        return n2 != 0;
    }

    private static void lIIIIIIllII() {
        lIIlIlIlI = new String[lIIlIlIll[0]];
        u.lIIlIlIlI[u.lIIlIlIll[1]] = "No prayer to flick, disabling all";
    }
}

