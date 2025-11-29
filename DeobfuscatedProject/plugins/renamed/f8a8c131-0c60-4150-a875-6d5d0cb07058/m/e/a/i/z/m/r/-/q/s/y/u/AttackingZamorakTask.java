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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.c_Unknown;
import m.e.a.i.z.m.r.-.q.s.y.u.l_Unknown;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/* TASK: Attacking zamorak -> AttackingzamorakTask */
@TaskDesc(name="Attacking zamorak", priority=10)
public class AttackingZamorakTask
extends Task {
    private static /* synthetic */ int[] lIllIIIlIllll;
    private final /* synthetic */ l M;
    private static /* synthetic */ String[] lIllIIIlIlllI;
    private final /* synthetic */ c N;

    private static boolean llIIIlIlIIIllII(int n2) {
        return n2 != 0;
    }

    private static void llIIIlIlIIIlIlI() {
        lIllIIIlIlllI = new String[lIllIIIlIllll[2]];
        o.lIllIIIlIlllI[o.lIllIIIlIllll[0]] = o."Attack";
    }

    @Inject
    public o(l l2, c c2) {
        this.M = l2;
        this.N = c2;
    }

    public boolean run() {
        o var5;
        if (!o.llIIIlIlIIIllII(this.M.B() ? 1 : 0) || o.llIIIlIlIIIllIl(this.M.G() ? 1 : 0)) {
            return lIllIIIlIllll[0];
        }
        if (o.llIIIlIlIIIllIl(var5.M.A() ? 1 : 0)) {
            return lIllIIIlIllll[0];
        }
        if (o.llIIIlIlIIIllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (o.llIIIlIlIIIlllI(var5.N.e())) {
            return lIllIIIlIllll[0];
        }
        if (o.llIIIlIlIIIllll(Players.getLocal().getInteracting())) {
            return lIllIIIlIllll[0];
        }
        NPC nPC = this.M.I().m();
        nPC.interact(lIllIIIlIlllI[lIllIIIlIllll[0]]);
        this.sleep(lIllIIIlIllll[1]);
        return lIllIIIlIllll[2];
    }

    private static String llIIIlIlIIIIllI(String var4, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllIIIlIllll[3], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIlIIIllll(Object object) {
        return object != null;
    }

    private static void llIIIlIlIIIlIll() {
        lIllIIIlIllll = new int[4];
        o.lIllIIIlIllll[0] = (0x47 ^ 0x26 ^ (0x10 ^ 0x63)) & (0xE2 ^ 0x8D ^ (0xFC ^ 0x81) ^ -1);
        o.lIllIIIlIllll[1] = 3;
        o.lIllIIIlIllll[2] = 1;
        o.lIllIIIlIllll[3] = 2;
    }

    private static boolean llIIIlIlIIIllIl(int n2) {
        return n2 == 0;
    }

    static {
        o.llIIIlIlIIIlIll();
        o.llIIIlIlIIIlIlI();
    }

    private static boolean llIIIlIlIIIlllI(Object object) {
        return object == null;
    }
}

