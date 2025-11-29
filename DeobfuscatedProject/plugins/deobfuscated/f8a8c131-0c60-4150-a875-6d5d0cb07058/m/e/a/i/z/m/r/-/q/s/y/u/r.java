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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.c;
import m.e.a.i.z.m.r.-.q.s.y.u.f;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import m.e.a.i.z.m.r.-.q.s.y.u.u;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=8)
public class r
extends Task {
    private final /* synthetic */ SquireZammyConfig aa;
    private static /* synthetic */ String[] lIllIIIllIlII;
    private final /* synthetic */ u Z;
    private final /* synthetic */ c X;
    private final /* synthetic */ f Y;
    private static /* synthetic */ int[] lIllIIIllIlll;
    private final /* synthetic */ l W;

    private static boolean llIIIlIlIlIIIII(int n2) {
        return n2 != 0;
    }

    static {
        r.llIIIlIlIIlllll();
        r.llIIIlIlIIllIll();
    }

    private static boolean llIIIlIlIlIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIlIlIlIIlIl(Object object) {
        return object == null;
    }

    private static boolean llIIIlIlIlIIlII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public r(l l2, c c2, f f2, u u2, SquireZammyConfig squireZammyConfig) {
        this.W = l2;
        this.X = c2;
        this.Y = f2;
        this.Z = u2;
        this.aa = squireZammyConfig;
    }

    private boolean N() {
        return lIllIIIllIlll[0];
    }

    private static boolean llIIIlIlIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIlIlIIllIll() {
        lIllIIIllIlII = new String[lIllIIIllIlll[5]];
        r.lIllIIIllIlII[r.lIllIIIllIlll[0]] = r."Peach";
        r.lIllIIIllIlII[r.lIllIIIllIlll[2]] = r."Eat";
        r.lIllIIIllIlII[r.lIllIIIllIlll[3]] = r."Peach";
        r.lIllIIIllIlII[r.lIllIIIllIlll[4]] = r."Eat";
    }

    private static void llIIIlIlIIlllll() {
        lIllIIIllIlll = new int[6];
        r.lIllIIIllIlll[0] = (0xCA ^ 0xC0) & ~(0x86 ^ 0x8C);
        r.lIllIIIllIlll[1] = 16 + 65 - -76 + 0 ^ 75 + 99 - 52 + 10;
        r.lIllIIIllIlll[2] = 1;
        r.lIllIIIllIlll[3] = 2;
        r.lIllIIIllIlll[4] = 3;
        r.lIllIIIllIlll[5] = 64 + 92 - 72 + 115 ^ 5 + 167 - 143 + 166;
    }

    private static boolean llIIIlIlIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlIlIlIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIIIlIlIIlIlll(String llllllllllllllIllIIlIllIIlllIllI, String llllllllllllllIllIIlIllIIllllIlI) {
        llllllllllllllIllIIlIllIIlllIllI = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIllIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIllIIllllIIl = new StringBuilder();
        char[] llllllllllllllIllIIlIllIIllllIII = llllllllllllllIllIIlIllIIllllIlI.toCharArray();
        int llllllllllllllIllIIlIllIIlllIlll = lIllIIIllIlll[0];
        char[] llllllllllllllIllIIlIllIIlllIIIl = llllllllllllllIllIIlIllIIlllIllI.toCharArray();
        int llllllllllllllIllIIlIllIIlllIIII = llllllllllllllIllIIlIllIIlllIIIl.length;
        int llllllllllllllIllIIlIllIIllIllll = lIllIIIllIlll[0];
        while (r.llIIIlIlIlIIllI(llllllllllllllIllIIlIllIIllIllll, llllllllllllllIllIIlIllIIlllIIII)) {
            char llllllllllllllIllIIlIllIIlllllII = llllllllllllllIllIIlIllIIlllIIIl[llllllllllllllIllIIlIllIIllIllll];
            llllllllllllllIllIIlIllIIllllIIl.append((char)(llllllllllllllIllIIlIllIIlllllII ^ llllllllllllllIllIIlIllIIllllIII[llllllllllllllIllIIlIllIIlllIlll % llllllllllllllIllIIlIllIIllllIII.length]));
            0;
            ++llllllllllllllIllIIlIllIIlllIlll;
            ++llllllllllllllIllIIlIllIIllIllll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIllIIllllIIl);
    }

    private static String llIIIlIlIIllIIl(String llllllllllllllIllIIlIllIlIIIlIll, String llllllllllllllIllIIlIllIlIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllIlIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIllIlIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIllIlIIIllIl.init(lIllIIIllIlll[3], llllllllllllllIllIIlIllIlIIIlllI);
            return new String(llllllllllllllIllIIlIllIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIllIlIIIllII) {
            llllllllllllllIllIIlIllIlIIIllII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r llllllllllllllIllIIlIllIlIIlIllI;
        if (!r.llIIIlIlIlIIIII(this.W.B() ? 1 : 0) || r.llIIIlIlIlIIIIl(this.W.G() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (r.llIIIlIlIlIIIII(llllllllllllllIllIIlIllIlIIlIllI.W.A() ? 1 : 0) && r.llIIIlIlIlIIIlI(llllllllllllllIllIIlIllIlIIlIllI.X.e())) {
            return lIllIIIllIlll[0];
        }
        if (!r.llIIIlIlIlIIIll(Combat.getCurrentHealth(), llllllllllllllIllIIlIllIlIIlIllI.aa.eatFoodAt()) || r.llIIIlIlIlIIIIl(llllllllllllllIllIIlIllIlIIlIllI.Y.t() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (r.llIIIlIlIlIIIII(llllllllllllllIllIIlIllIlIIlIllI.Z.O() ? 1 : 0) && r.llIIIlIlIlIIIII(llllllllllllllIllIIlIllIlIIlIllI.W.A() ? 1 : 0)) {
            return lIllIIIllIlll[0];
        }
        if (r.llIIIlIlIlIIIII(llllllllllllllIllIIlIllIlIIlIllI.W.D() ? 1 : 0) && r.llIIIlIlIlIIIIl(llllllllllllllIllIIlIllIlIIlIllI.W.A() ? 1 : 0) && r.llIIIlIlIlIIlII(Combat.getCurrentHealth(), lIllIIIllIlll[1])) {
            return lIllIIIllIlll[0];
        }
        Item llllllllllllllIllIIlIllIlIIlIlIl = Inventory.getFirst(item -> {
            int n2;
            if (r.llIIIlIlIlIIIIl(item.getName().equals(lIllIIIllIlII[lIllIIIllIlll[3]]) ? 1 : 0) && r.llIIIlIlIlIIIII(item.hasAction(lIllIIIllIlII[lIllIIIllIlll[4]]::equals) ? 1 : 0)) {
                n2 = lIllIIIllIlll[2];
                0;
                if (null != null) {
                    return ((2 ^ 0x26 ^ (0xFA ^ 0x97)) & (0x6F ^ 0xC ^ (0xAB ^ 0x81) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIIIllIlll[0];
            }
            return n2 != 0;
        });
        if (r.llIIIlIlIlIIlIl(llllllllllllllIllIIlIllIlIIlIlIl)) {
            String[] stringArray = new String[lIllIIIllIlll[2]];
            stringArray[r.lIllIIIllIlll[0]] = lIllIIIllIlII[lIllIIIllIlll[0]];
            llllllllllllllIllIIlIllIlIIlIlIl = Inventory.getFirst((String[])stringArray);
        }
        if (r.llIIIlIlIlIIlIl(llllllllllllllIllIIlIllIlIIlIlIl)) {
            return llllllllllllllIllIIlIllIlIIlIllI.N();
        }
        var1_1.interact(lIllIIIllIlII[lIllIIIllIlll[2]]);
        this.Y.s();
        return lIllIIIllIlll[2];
    }
}

