/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import u.i.r.d.s.e.r.q.y.a.h.-.a_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.e_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.h_Unknown;

/* TASK: Attacking hydra -> AttackinghydraTask */
@TaskDesc(name="Attacking hydra")
public class AttackingHydraTask
extends Task {
    private final /* synthetic */ e ay;
    private static /* synthetic */ int[] llllIIlIIllI;
    private static /* synthetic */ String[] llllIIlIIlIl;
    private final /* synthetic */ SquireAlchemicalHydraConfig az;
    private final /* synthetic */ a ax;

    private static void lIIIlllllIIllll() {
        llllIIlIIlIl = new String[llllIIlIIllI[1]];
        s.llllIIlIIlIl[s.llllIIlIIllI[0]] = s."Attack";
    }

    static {
        s.lIIIlllllIlIIII();
        s.lIIIlllllIIllll();
    }

    private static boolean lIIIlllllIlIIll(Object object) {
        return object == null;
    }

    private static String lIIIlllllIIlllI(String var5, String var6) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llllIIlIIllI[3], var7);
            return new String(var4.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllIlIIlI(Object object) {
        return object != null;
    }

    @Inject
    public s(a a2, e e2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ax = a2;
        this.ay = e2;
        this.az = squireAlchemicalHydraConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var2;
        if (s.lIIIlllllIlIIIl(this.az.attack() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        h var1 = var2.ax.k();
        if (!s.lIIIlllllIlIIlI(var1) || s.lIIIlllllIlIIIl(var2.ax.g() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        NPC lllllllllllllllIIlIlIllIIlIIIIIl = var1.K();
        if (s.lIIIlllllIlIIll(var1.K())) {
            return llllIIlIIllI[0];
        }
        if (s.lIIIlllllIlIIlI(Players.getLocal().getInteracting())) {
            return llllIIlIIllI[0];
        }
        if (s.lIIIlllllIlIlII(var1.Q() ? 1 : 0) && s.lIIIlllllIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        var2_2.interact(llllIIlIIlIl[llllIIlIIllI[0]]);
        this.sleep(Math.min(this.ay.w() - llllIIlIIllI[1], llllIIlIIllI[2]));
        return llllIIlIIllI[1];
    }

    private static void lIIIlllllIlIIII() {
        llllIIlIIllI = new int[4];
        s.llllIIlIIllI[0] = (108 + 109 - 146 + 184 ^ 28 + 101 - -3 + 30) & (19 + 91 - -50 + 95 ^ 93 + 149 - 140 + 60 ^ -1);
        s.llllIIlIIllI[1] = 1;
        s.llllIIlIIllI[2] = 85 + 117 - 92 + 35 ^ 16 + 4 - -27 + 102;
        s.llllIIlIIllI[3] = 2;
    }

    private static boolean lIIIlllllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllllIlIlII(int n2) {
        return n2 != 0;
    }
}

