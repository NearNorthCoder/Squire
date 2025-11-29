/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.saradomin.tasks.SaradominManager;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

@TaskDesc(name="Attacking Zilyana", priority=10)
public class AttackingZilyanaTask
extends Task {

    private final  l ag;
    private final  g af;

    private static boolean lIlIlIllIIIlIII(Object object) {
        return object != null;
    }

    private static void lIlIlIllIIIIlII() {
        lIIlIlIIIIlIl = new String[lIIlIlIIIIllI[2]];
        t.lIIlIlIIIIlIl[t.lIIlIlIIIIllI[0]] = "Attack";
    }

    private static boolean lIlIlIllIIIIlll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        t var1;
        if (t.lIlIlIllIIIIllI(this.af.m() ? 1 : 0)) {
            return lIIlIlIIIIllI[0];
        }
        if (!t.lIlIlIllIIIIlll(var1.af.l() ? 1 : 0) || t.lIlIlIllIIIIllI(var1.ag.P() ? 1 : 0)) {
            return lIIlIlIIIIllI[0];
        }
        if (t.lIlIlIllIIIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (t.lIlIlIllIIIlIII(Players.getLocal().getInteracting())) {
            return lIIlIlIIIIllI[0];
        }
        NPC nPC = this.af.AttackingZilyanaTask().C();
        nPC.interact(lIIlIlIIIIlIl[lIIlIlIIIIllI[0]]);
        this.sleep(lIIlIlIIIIllI[1]);
        return lIIlIlIIIIllI[2];
    }

    static {
        t.lIlIlIllIIIIlIl();
        t.lIlIlIllIIIIlII();
    }

    private static boolean lIlIlIllIIIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public AttackingZilyanaTask(g g2, l l2) {
        this.af = g2;
        this.ag = l2;
    }

}

