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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Attacking bandos", priority=10)
public class AttackingBandosTask
extends Task {
    private final  e M;
    private final  d N;

    @Inject
    public AttackingBandosTask(e e2, d d2) {
        this.M = e2;
        this.N = d2;
    }

    public boolean run() {
        m var1;
        if (!m.lIlIlIllIlIIlI(this.M.t() ? 1 : 0) || m.lIlIlIllIlIIll(this.M.y() ? 1 : 0)) {
            return llIlllIlIII[0];
        }
        if (m.lIlIlIllIlIIll(var1.M.s() ? 1 : 0)) {
            return llIlllIlIII[0];
        }
        if (m.lIlIlIllIlIIll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (m.lIlIlIllIlIlII(var1.N.AttackingBandosTask())) {
            return llIlllIlIII[0];
        }
        if (m.lIlIlIllIlIlIl(Players.getLocal().getInteracting())) {
            return llIlllIlIII[0];
        }
        NPC nPC = this.M.z().c();
        nPC.interact(llIlllIIlll[llIlllIlIII[0]]);
        this.sleep(llIlllIlIII[1]);
        return llIlllIlIII[2];
    }

    static {
        m.lIlIlIllIlIIIl();
        m.lIlIlIllIlIIII();
    }

    private static boolean lIlIlIllIlIlII(Object object) {
        return object == null;
    }

    private static boolean lIlIlIllIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllIlIlIl(Object object) {
        return object != null;
    }

    private static void lIlIlIllIlIIII() {
        llIlllIIlll = new String[llIlllIlIII[2]];
        m.llIlllIIlll[m.llIlllIlIII[0]] = "Attack";
    }
}

