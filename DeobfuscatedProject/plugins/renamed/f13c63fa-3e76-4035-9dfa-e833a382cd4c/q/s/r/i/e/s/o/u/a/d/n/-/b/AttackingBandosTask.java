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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

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
import q.s.r.i.e.s.o.u.a.d.n.-.b.d_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;

/* TASK: Attacking bandos -> AttackingbandosTask */
@TaskDesc(name="Attacking bandos", priority=10)
public class AttackingBandosTask
extends Task {
    private final /* synthetic */ e M;
    private final /* synthetic */ d N;
    private static /* synthetic */ int[] llIlllIlIII;
    private static /* synthetic */ String[] llIlllIIlll;

    @Inject
    public m(e e2, d d2) {
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
        if (m.lIlIlIllIlIlII(var1.N.m())) {
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

    private static String lIlIlIllIIllll(String var4, String var5) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llIlllIlIII[3], var3);
            return new String(var6.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    static {
        m.lIlIlIllIlIIIl();
        m.lIlIlIllIlIIII();
    }

    private static boolean lIlIlIllIlIlII(Object object) {
        return object == null;
    }

    private static void lIlIlIllIlIIIl() {
        llIlllIlIII = new int[4];
        m.llIlllIlIII[0] = 3 & (3 ^ -1);
        m.llIlllIlIII[1] = 3;
        m.llIlllIlIII[2] = 1;
        m.llIlllIlIII[3] = 2;
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
        m.llIlllIIlll[m.llIlllIlIII[0]] = m."Attack";
    }
}

