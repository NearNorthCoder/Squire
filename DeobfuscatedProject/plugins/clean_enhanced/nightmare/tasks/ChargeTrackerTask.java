/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.events.FakeXpDrop
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.FakeXpDrop;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Charge Tracker", register=true)
public class ChargeTrackerTask
extends Task {

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public ChargeTrackerTask() {
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        return var2[0];
    }

    private static void var5() {
        var1 = new String[var2[1]];
        P.var1[P.var2[0]] = "totem";
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(FakeXpDrop fakeXpDrop) {
        Actor actor = Players.getLocal().getInteracting();
        if (P.var4(actor instanceof NPC) && P.var6(actor.getName()) && P.var4(actor.getName().toLowerCase().contains(var1[var2[0]]) ? 1 : 0) && P.var3(fakeXpDrop.getSkill(), Skill.HITPOINTS)) {
            N.p(N.ch() - var2[1]);
        }
    }

    private static void var7() {
        var2 = new int[4];
        P.var2[0] = (98 + 91 - 162 + 115 ^ 147 + 79 - 220 + 173) & (0xC ^ 0x5F ^ (0x20 ^ 0x4E) ^ -1);
        P.var2[1] = 1;
        P.var2[2] = 0x44 ^ 0x4C;
        P.var2[3] = 2;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    static {
        P.var7();
        P.var5();
    }
}

