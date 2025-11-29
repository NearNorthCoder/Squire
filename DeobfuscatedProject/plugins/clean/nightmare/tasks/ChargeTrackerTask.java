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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.FakeXpDrop;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import gg.squire.nightmare.tasks.NightmareTaskBase;

@TaskDesc(name="Charge Tracker", register=true)
public class ChargeTrackerTask
extends Task {

    private static boolean lIIIllIllllIIlI(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public ChargeTrackerTask() {
    }

    private static boolean lIIIllIllllIIII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        return lllIlllIlIlI[0];
    }

    private static void lIIIllIlllIlllI() {
        lllIlllIlIIl = new String[lllIlllIlIlI[1]];
        P.lllIlllIlIIl[P.lllIlllIlIlI[0]] = "totem";
    }

    private static boolean lIIIllIllllIIIl(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(FakeXpDrop fakeXpDrop) {
        Actor actor = Players.getLocal().getInteracting();
        if (P.lIIIllIllllIIII(actor instanceof NPC) && P.lIIIllIllllIIIl(actor.getName()) && P.lIIIllIllllIIII(actor.getName().toLowerCase().contains(lllIlllIlIIl[lllIlllIlIlI[0]]) ? 1 : 0) && P.lIIIllIllllIIlI(fakeXpDrop.getSkill(), Skill.HITPOINTS)) {
            N.p(N.ch() - lllIlllIlIlI[1]);
        }
    }

    static {
        P.lIIIllIlllIllll();
        P.lIIIllIlllIlllI();
    }
}

