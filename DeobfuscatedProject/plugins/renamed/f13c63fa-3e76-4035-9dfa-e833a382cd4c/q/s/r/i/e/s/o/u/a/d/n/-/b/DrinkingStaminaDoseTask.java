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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.s.r.i.e.s.o.u.a.d.n.-.b.d_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.f_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.MovingToNextTileTask;

/* TASK: Drinking stamina dose -> DrinkingstaminadoseTask */
@TaskDesc(name="Drinking stamina dose", priority=8)
public class DrinkingStaminaDoseTask
extends Task {
    private final /* synthetic */ f Q;
    private static /* synthetic */ String[] lllIIIIllIl;
    private final /* synthetic */ r R;
    private static /* synthetic */ int[] lllIIIIlllI;
    private final /* synthetic */ e O;
    private final /* synthetic */ d P;

    private static String lIlIllIlIlIllI(String var5, String var12) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lllIIIIlllI[4], var14);
            return new String(var4.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n var1;
        if (!n.lIlIllIlIllIIl(this.O.t() ? 1 : 0) || n.lIlIllIlIllIlI(this.O.y() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        if (!n.lIlIllIlIllIIl(var1.O.s() ? 1 : 0) || n.lIlIllIlIllIll(var1.P.m())) {
            return lllIIIIlllI[0];
        }
        if (!n.lIlIllIlIlllII(Movement.getRunEnergy(), lllIIIIlllI[1]) || n.lIlIllIlIllIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        if (n.lIlIllIlIllIIl(var1.R.O() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        Item var15 = Inventory.getFirst(item -> item.getName().startsWith(lllIIIIllIl[lllIIIIlllI[3]]));
        if (!n.lIlIllIlIllIll(var15) || n.lIlIllIlIllIlI(var1.Q.E() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        var1_1.interact(lllIIIIllIl[lllIIIIlllI[0]]);
        this.Q.B();
        this.sleep(lllIIIIlllI[2]);
        return lllIIIIlllI[3];
    }

    private static boolean lIlIllIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIlIlIlIl(String var16, String var11) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var8 = lllIIIIlllI[0];
        char[] var9 = var16.toCharArray();
        int var6 = var9.length;
        int var10 = lllIIIIlllI[0];
        while (n.lIlIllIlIlllII(var10, var6)) {
            char var3 = var9[var10];
            var7.append((char)(var3 ^ var13[var8 % var13.length]));
            0;
            ++var8;
            ++var10;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void lIlIllIlIlIlll() {
        lllIIIIllIl = new String[lllIIIIlllI[4]];
        n.lllIIIIllIl[n.lllIIIIlllI[0]] = n."Drink";
        n.lllIIIIllIl[n.lllIIIIlllI[3]] = n."Stamina";
    }

    @Inject
    public n(e e2, d d2, f f2, r r2) {
        this.O = e2;
        this.P = d2;
        this.Q = f2;
        this.R = r2;
    }

    private static boolean lIlIllIlIllIlI(int n2) {
        return n2 == 0;
    }

    static {
        n.lIlIllIlIllIII();
        n.lIlIllIlIlIlll();
    }

    private static boolean lIlIllIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIlIllIII() {
        lllIIIIlllI = new int[5];
        n.lllIIIIlllI[0] = (0x5D ^ 0x3C ^ (0xB4 ^ 0x86)) & (129 + 69 - 125 + 166 ^ 138 + 135 - 135 + 50 ^ -1);
        n.lllIIIIlllI[1] = 0x88 ^ 0x96;
        n.lllIIIIlllI[2] = 3;
        n.lllIIIIlllI[3] = 1;
        n.lllIIIIlllI[4] = 2;
    }

    private static boolean lIlIllIlIllIll(Object object) {
        return object != null;
    }
}

