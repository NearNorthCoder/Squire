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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N_Unknown;

/* TASK: Charge Tracker -> ChargetrackerTask */
@TaskDesc(name="Charge Tracker", register=true)
public class ChargeTrackerTask
extends Task {
    private static /* synthetic */ String[] lllIlllIlIIl;
    private static /* synthetic */ int[] lllIlllIlIlI;

    private static boolean lIIIllIllllIIlI(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public P() {
    }

    private static boolean lIIIllIllllIIII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        return lllIlllIlIlI[0];
    }

    private static void lIIIllIlllIlllI() {
        lllIlllIlIIl = new String[lllIlllIlIlI[1]];
        P.lllIlllIlIIl[P.lllIlllIlIlI[0]] = P."totem";
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

    private static void lIIIllIlllIllll() {
        lllIlllIlIlI = new int[4];
        P.lllIlllIlIlI[0] = (98 + 91 - 162 + 115 ^ 147 + 79 - 220 + 173) & (0xC ^ 0x5F ^ (0x20 ^ 0x4E) ^ -1);
        P.lllIlllIlIlI[1] = 1;
        P.lllIlllIlIlI[2] = 0x44 ^ 0x4C;
        P.lllIlllIlIlI[3] = 2;
    }

    private static String lIIIllIlllIllIl(String var4, String var3) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lllIlllIlIlI[2]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllIlllIlIlI[3], var2);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    static {
        P.lIIIllIlllIllll();
        P.lIIIllIlllIlllI();
    }
}

