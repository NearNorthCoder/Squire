/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Prayers
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

/* TASK: Handling prayers -> PrayerFlickingTask */
@TaskDesc(name="Handling prayers", priority=0x7FFFFFFF, instant=true)
public class q
extends u {
    private static /* synthetic */ int[] lIlIllIllllIl;

    private static boolean llIIIIIlllIIlII(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIIlllIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean run() {
        boolean bl = super.run();
        if (q.llIIIIIlllIIIlI(bl ? 1 : 0)) {
            Prayers.disableAll();
        }
        return bl;
    }

    private static void llIIIIIlllIIIIl() {
        lIlIllIllllIl = new int[3];
        q.lIlIllIllllIl[0] = 1;
        q.lIlIllIllllIl[1] = -(0xFFFFEFBC & 0x7AD7) & (0xFFFFFFDF & Short.MAX_VALUE);
        q.lIlIllIllllIl[2] = 0xF6 ^ 0xA9 ^ (0x93 ^ 0x81);
    }

    private static boolean llIIIIIlllIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIlllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean p() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.W.k();
        arrayList.add(prayer);
        0;
        arrayList.add(this.s());
        0;
        if (q.llIIIIIlllIIIll(Prayers.flick(arrayList) ? 1 : 0)) {
            this.sleep(lIlIllIllllIl[0]);
        }
        return lIlIllIllllIl[0];
    }

    private Prayer s() {
        if (q.llIIIIIlllIIlII(Vars.getBit((int)lIlIllIllllIl[1])) && q.llIIIIIlllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIlIllIllllIl[2])) {
            return Prayer.AUGURY;
        }
        return Prayer.MYSTIC_MIGHT;
    }

    static {
        q.llIIIIIlllIIIIl();
    }
}

