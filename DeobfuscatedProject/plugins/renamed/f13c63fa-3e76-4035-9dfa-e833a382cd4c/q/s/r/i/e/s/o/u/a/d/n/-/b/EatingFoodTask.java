/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.s.r.i.e.s.o.u.a.d.n.-.b.d_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.f_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.MovingToNextTileTask;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=8)
public class EatingFoodTask
extends Task {
    private final /* synthetic */ f U;
    private final /* synthetic */ d T;
    private static /* synthetic */ int[] llIllllIlII;
    private final /* synthetic */ e S;
    private final /* synthetic */ r V;
    private static /* synthetic */ String[] llIllllIIll;

    static {
        o.lIlIllIIIIIllI();
        o.lIlIllIIIIIlIl();
    }

    @Inject
    public o(e e2, d d2, f f2, r r2) {
        this.S = e2;
        this.T = d2;
        this.U = f2;
        this.V = r2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var12;
        if (!o.lIlIllIIIIIlll(this.S.t() ? 1 : 0) || o.lIlIllIIIIlIII(this.S.y() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        if (o.lIlIllIIIIIlll(var12.S.s() ? 1 : 0) && o.lIlIllIIIIlIIl(var12.T.m())) {
            return llIllllIlII[0];
        }
        if (!o.lIlIllIIIIlIlI(Combat.getCurrentHealth(), llIllllIlII[1]) || o.lIlIllIIIIlIII(var12.U.D() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        if (o.lIlIllIIIIIlll(var12.V.O() ? 1 : 0) && o.lIlIllIIIIIlll(var12.S.s() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        Item var6 = Inventory.getFirst(item -> {
            int n2;
            if (o.lIlIllIIIIlIII(item.getName().equals(llIllllIIll[llIllllIlII[3]]) ? 1 : 0) && o.lIlIllIIIIIlll(item.hasAction(llIllllIIll[llIllllIlII[4]]::equals) ? 1 : 0)) {
                n2 = llIllllIlII[2];
                0;
                if ((89 + 46 - 50 + 89 ^ 166 + 6 - 111 + 109) <= -1) {
                    return ((101 + 218 - 248 + 159 ^ 6 + 24 - -62 + 81) & (0x43 ^ 0 ^ (0xBB ^ 0xB3) ^ -1)) != 0;
                }
            } else {
                n2 = llIllllIlII[0];
            }
            return n2 != 0;
        });
        if (o.lIlIllIIIIlIll(var6)) {
            String[] stringArray = new String[llIllllIlII[2]];
            stringArray[o.llIllllIlII[0]] = llIllllIIll[llIllllIlII[0]];
            var6 = Inventory.getFirst((String[])stringArray);
        }
        if (o.lIlIllIIIIlIll(var6)) {
            return var12.M();
        }
        var1_1.interact(llIllllIIll[llIllllIlII[2]]);
        this.U.C();
        return llIllllIlII[2];
    }

    private static boolean lIlIllIIIIlIII(int n2) {
        return n2 == 0;
    }

    private boolean M() {
        return llIllllIlII[0];
    }

    private static boolean lIlIllIIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllIIIIlIIl(Object object) {
        return object != null;
    }

    private static void lIlIllIIIIIllI() {
        llIllllIlII = new int[7];
        o.llIllllIlII[0] = (1 ^ 0x32) & ~(0xA4 ^ 0x97);
        o.llIllllIlII[1] = 0xC5 ^ 0x84;
        o.llIllllIlII[2] = 1;
        o.llIllllIlII[3] = 2;
        o.llIllllIlII[4] = 3;
        o.llIllllIlII[5] = 93 + 93 - 41 + 9 ^ 98 + 51 - 131 + 140;
        o.llIllllIlII[6] = 88 + 99 - 71 + 75 ^ 79 + 121 - 92 + 75;
    }

    private static String lIlIllIIIIIlII(String var5, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llIllllIlII[6]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIllllIlII[3], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIIIIlIl() {
        llIllllIIll = new String[llIllllIlII[5]];
        o.llIllllIIll[o.llIllllIlII[0]] = o."Peach";
        o.llIllllIIll[o.llIllllIlII[2]] = o."Eat";
        o.llIllllIIll[o.llIllllIlII[3]] = o."Peach";
        o.llIllllIIll[o.llIllllIlII[4]] = o."Eat";
    }

    private static boolean lIlIllIIIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIIIIlll(int n2) {
        return n2 != 0;
    }

    private static String lIlIllIIIIIIll(String var3, String var8) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(llIllllIlII[3], var7);
            return new String(var11.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }
}

