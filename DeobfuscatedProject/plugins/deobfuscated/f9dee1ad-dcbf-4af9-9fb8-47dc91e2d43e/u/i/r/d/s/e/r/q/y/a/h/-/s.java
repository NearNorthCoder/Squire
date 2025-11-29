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
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.e;
import u.i.r.d.s.e.r.q.y.a.h.-.h;

@TaskDesc(name="Attacking hydra")
public class s
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

    private static String lIIIlllllIIlllI(String lllllllllllllllIIlIlIllIIIllIlll, String lllllllllllllllIIlIlIllIIIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIllIIIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIllIIIlllIll.init(llllIIlIIllI[3], lllllllllllllllIIlIlIllIIIllllII);
            return new String(lllllllllllllllIIlIlIllIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIllIIIlllIlI) {
            lllllllllllllllIIlIlIllIIIlllIlI.printStackTrace();
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
        s lllllllllllllllIIlIlIllIIlIIIIll;
        if (s.lIIIlllllIlIIIl(this.az.attack() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        h lllllllllllllllIIlIlIllIIlIIIIlI = lllllllllllllllIIlIlIllIIlIIIIll.ax.k();
        if (!s.lIIIlllllIlIIlI(lllllllllllllllIIlIlIllIIlIIIIlI) || s.lIIIlllllIlIIIl(lllllllllllllllIIlIlIllIIlIIIIll.ax.g() ? 1 : 0)) {
            return llllIIlIIllI[0];
        }
        NPC lllllllllllllllIIlIlIllIIlIIIIIl = lllllllllllllllIIlIlIllIIlIIIIlI.K();
        if (s.lIIIlllllIlIIll(lllllllllllllllIIlIlIllIIlIIIIlI.K())) {
            return llllIIlIIllI[0];
        }
        if (s.lIIIlllllIlIIlI(Players.getLocal().getInteracting())) {
            return llllIIlIIllI[0];
        }
        if (s.lIIIlllllIlIlII(lllllllllllllllIIlIlIllIIlIIIIlI.Q() ? 1 : 0) && s.lIIIlllllIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
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

