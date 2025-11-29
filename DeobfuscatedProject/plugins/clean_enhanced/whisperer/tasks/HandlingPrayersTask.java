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

    @Override
    public boolean run() {
        boolean bl = super.run();
        if (bl == 0) {
            Prayers.disableAll();
        }
        return bl;
    }

    @Override
    public boolean p() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.W.k();
        arrayList.add(prayer);
        0;
        arrayList.add(this.s());
        0;
        if ((Prayers.flickarrayList)) {
            this.sleep(0);
        }
        return 0;
    }

    private Prayer s() {
        if ((Vars.getBit((int > 0)1)) && (Skills.getLevel((SkiSkill.PRAYER) >= 2)) {
            return Prayer.AUGURY;
        }
        return Prayer.MYSTIC_MIGHT;
    }

    static {
        q.var2();
    }
}

