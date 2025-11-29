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
import q.s.r.i.e.s.o.u.a.d.n.-.b.d;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.f;
import q.s.r.i.e.s.o.u.a.d.n.-.b.r;

@TaskDesc(name="Eating food", priority=8)
public class o
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
        o llllllllllllllllIIlIlIIlllllIllI;
        if (!o.lIlIllIIIIIlll(this.S.t() ? 1 : 0) || o.lIlIllIIIIlIII(this.S.y() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        if (o.lIlIllIIIIIlll(llllllllllllllllIIlIlIIlllllIllI.S.s() ? 1 : 0) && o.lIlIllIIIIlIIl(llllllllllllllllIIlIlIIlllllIllI.T.m())) {
            return llIllllIlII[0];
        }
        if (!o.lIlIllIIIIlIlI(Combat.getCurrentHealth(), llIllllIlII[1]) || o.lIlIllIIIIlIII(llllllllllllllllIIlIlIIlllllIllI.U.D() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        if (o.lIlIllIIIIIlll(llllllllllllllllIIlIlIIlllllIllI.V.O() ? 1 : 0) && o.lIlIllIIIIIlll(llllllllllllllllIIlIlIIlllllIllI.S.s() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        Item llllllllllllllllIIlIlIIlllllIlIl = Inventory.getFirst(item -> {
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
        if (o.lIlIllIIIIlIll(llllllllllllllllIIlIlIIlllllIlIl)) {
            String[] stringArray = new String[llIllllIlII[2]];
            stringArray[o.llIllllIlII[0]] = llIllllIIll[llIllllIlII[0]];
            llllllllllllllllIIlIlIIlllllIlIl = Inventory.getFirst((String[])stringArray);
        }
        if (o.lIlIllIIIIlIll(llllllllllllllllIIlIlIIlllllIlIl)) {
            return llllllllllllllllIIlIlIIlllllIllI.M();
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

    private static String lIlIllIIIIIlII(String llllllllllllllllIIlIlIIlllIllllI, String llllllllllllllllIIlIlIIlllIllIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlllIllIll.getBytes(StandardCharsets.UTF_8)), llIllllIlII[6]), "DES");
            Cipher llllllllllllllllIIlIlIIllllIIIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIllllIIIII.init(llIllllIlII[3], llllllllllllllllIIlIlIIllllIIIIl);
            return new String(llllllllllllllllIIlIlIIllllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIlllIlllll) {
            llllllllllllllllIIlIlIIlllIlllll.printStackTrace();
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

    private static String lIlIllIIIIIIll(String llllllllllllllllIIlIlIIllllIlIll, String llllllllllllllllIIlIlIIllllIlIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIllllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIllllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIllllIllIl.init(llIllllIlII[3], llllllllllllllllIIlIlIIllllIlllI);
            return new String(llllllllllllllllIIlIlIIllllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIllllIllII) {
            llllllllllllllllIIlIlIIllllIllII.printStackTrace();
            return null;
        }
    }
}

