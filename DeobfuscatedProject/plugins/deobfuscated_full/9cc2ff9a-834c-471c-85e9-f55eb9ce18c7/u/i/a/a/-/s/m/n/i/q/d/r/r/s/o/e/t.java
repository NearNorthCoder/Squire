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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

/* TASK: Attacking Zilyana -> AttackingzilyanaTask */
@TaskDesc(name="Attacking Zilyana", priority=10)
public class t
extends Task {
    private static /* synthetic */ int[] lIIlIlIIIIllI;
    private static /* synthetic */ String[] lIIlIlIIIIlIl;
    private final /* synthetic */ l ag;
    private final /* synthetic */ g af;

    private static boolean lIlIlIllIIIlIII(Object object) {
        return object != null;
    }

    private static void lIlIlIllIIIIlII() {
        lIIlIlIIIIlIl = new String[lIIlIlIIIIllI[2]];
        t.lIIlIlIIIIlIl[t.lIIlIlIIIIllI[0]] = t."Attack";
    }

    private static boolean lIlIlIllIIIIlll(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIllIIIIlIl() {
        lIIlIlIIIIllI = new int[5];
        t.lIIlIlIIIIllI[0] = (0x25 ^ 0x3F) & ~(0xB2 ^ 0xA8);
        t.lIIlIlIIIIllI[1] = 3;
        t.lIIlIlIIIIllI[2] = 1;
        t.lIIlIlIIIIllI[3] = 8 ^ 0x7E ^ (0x7B ^ 5);
        t.lIIlIlIIIIllI[4] = 2;
    }

    public boolean run() {
        t var6;
        if (t.lIlIlIllIIIIllI(this.af.m() ? 1 : 0)) {
            return lIIlIlIIIIllI[0];
        }
        if (!t.lIlIlIllIIIIlll(var6.af.l() ? 1 : 0) || t.lIlIlIllIIIIllI(var6.ag.P() ? 1 : 0)) {
            return lIIlIlIIIIllI[0];
        }
        if (t.lIlIlIllIIIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (t.lIlIlIllIIIlIII(Players.getLocal().getInteracting())) {
            return lIIlIlIIIIllI[0];
        }
        NPC nPC = this.af.t().C();
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
    public t(g g2, l l2) {
        this.af = g2;
        this.ag = l2;
    }

    private static String lIlIlIllIIIIIll(String var2, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIIllI[3]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIIlIlIIIIllI[4], var5);
            return new String(var1.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }
}

