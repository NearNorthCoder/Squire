/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
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
import m.e.a.i.z.m.r.-.q.s.y.u.f_Unknown;
import m.e.a.i.z.m.r.-.q.s.y.u.l_Unknown;
import m.e.a.i.z.m.r.-.q.s.y.u.MovingToNextTileTask;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Drinking stamina dose -> DrinkingstaminadoseTask */
@TaskDesc(name="Drinking stamina dose", priority=8)
public class DrinkingStaminaDoseTask
extends Task {
    private static /* synthetic */ String[] lIllIIllIIIIl;
    private final /* synthetic */ f U;
    private final /* synthetic */ l S;
    private final /* synthetic */ c T;
    private final /* synthetic */ u V;
    private static /* synthetic */ int[] lIllIIllIIIlI;

    private static String llIIIllIIlllIlI(String var5, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIllIIllIIIlI[4], var1);
            return new String(var7.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void llIIIllIIllllII() {
        lIllIIllIIIlI = new int[5];
        q.lIllIIllIIIlI[0] = (0xC0 ^ 0x9E) & ~(0x52 ^ 0xC);
        q.lIllIIllIIIlI[1] = 0x27 ^ 0x39;
        q.lIllIIllIIIlI[2] = 3;
        q.lIllIIllIIIlI[3] = 1;
        q.lIllIIllIIIlI[4] = 2;
    }

    private static boolean llIIIllIlIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        q.llIIIllIIllllII();
        q.llIIIllIIlllIll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var2;
        if (!q.llIIIllIIllllIl(this.S.B() ? 1 : 0) || q.llIIIllIIlllllI(this.S.G() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        if (!q.llIIIllIIllllIl(var2.S.A() ? 1 : 0) || q.llIIIllIIllllll(var2.T.e())) {
            return lIllIIllIIIlI[0];
        }
        if (!q.llIIIllIlIIIIII(Movement.getRunEnergy(), lIllIIllIIIlI[1]) || q.llIIIllIIllllIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        if (q.llIIIllIIllllIl(var2.V.O() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        Item var4 = Inventory.getFirst(item -> item.getName().startsWith(lIllIIllIIIIl[lIllIIllIIIlI[3]]));
        if (!q.llIIIllIIllllll(var4) || q.llIIIllIIlllllI(var2.U.u() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        var1_1.interact(lIllIIllIIIIl[lIllIIllIIIlI[0]]);
        this.U.r();
        this.sleep(lIllIIllIIIlI[2]);
        return lIllIIllIIIlI[3];
    }

    private static boolean llIIIllIIllllll(Object object) {
        return object != null;
    }

    private static boolean llIIIllIIllllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public q(l l2, c c2, f f2, u u2) {
        this.S = l2;
        this.T = c2;
        this.U = f2;
        this.V = u2;
    }

    private static void llIIIllIIlllIll() {
        lIllIIllIIIIl = new String[lIllIIllIIIlI[4]];
        q.lIllIIllIIIIl[q.lIllIIllIIIlI[0]] = q."Drink";
        q.lIllIIllIIIIl[q.lIllIIllIIIlI[3]] = q."Stamina";
    }

    private static boolean llIIIllIIlllllI(int n2) {
        return n2 == 0;
    }
}

