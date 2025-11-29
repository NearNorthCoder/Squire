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
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Handling prayers", priority=0x7FFFFFFF, instant=true)
public class HandlingPrayersTask
extends WhispererTaskBase {

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

        arrayList.add(this.s());

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

