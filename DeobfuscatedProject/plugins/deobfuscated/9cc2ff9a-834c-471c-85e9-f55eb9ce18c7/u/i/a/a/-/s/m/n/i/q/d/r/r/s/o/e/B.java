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
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.a;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Consuming peaches", priority=5, blocking=true)
public class B
extends Task {
    private final /* synthetic */ g aA;
    private static /* synthetic */ int[] lIIlIIllllIlI;
    private final /* synthetic */ a aB;
    private static /* synthetic */ String[] lIIlIIlllIlll;

    private static boolean lIlIlIlIlIlllll(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIlIlIlllII() {
        lIIlIIllllIlI = new int[4];
        B.lIIlIIllllIlI[0] = (0x7B ^ 0x63) & ~(0x8C ^ 0x94);
        B.lIIlIIllllIlI[1] = 0x6F ^ 0x67;
        B.lIIlIIllllIlI[2] = 1;
        B.lIIlIIllllIlI[3] = 2;
    }

    private static void lIlIlIlIlIlIllI() {
        lIIlIIlllIlll = new String[lIIlIIllllIlI[3]];
        B.lIIlIIlllIlll[B.lIIlIIllllIlI[0]] = B."Eat";
        B.lIIlIIlllIlll[B.lIIlIIllllIlI[2]] = B."peach";
    }

    static {
        B.lIlIlIlIlIlllII();
        B.lIlIlIlIlIlIllI();
    }

    private static boolean lIlIlIlIllIIIII(Object object) {
        return object == null;
    }

    @Inject
    public B(g g2, a a2) {
        this.aA = g2;
        this.aB = a2;
    }

    private static boolean lIlIlIlIlIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIlIlIlIlIIlI(String llllllllllllllIlllllIIlIIllllIIl, String llllllllllllllIlllllIIlIIllllIII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIlIIllllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIlIIllllIll.init(lIIlIIllllIlI[3], llllllllllllllIlllllIIlIIlllllII);
            return new String(llllllllllllllIlllllIIlIIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIlIIllllIlI) {
            llllllllllllllIlllllIIlIIllllIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        B llllllllllllllIlllllIIlIlIIIIIlI;
        if (!B.lIlIlIlIlIlllIl(this.aA.m() ? 1 : 0) || B.lIlIlIlIlIlllIl(this.aA.l() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        if (!B.lIlIlIlIlIllllI(Combat.getMissingHealth(), lIIlIIllllIlI[1]) || B.lIlIlIlIlIlllll(llllllllllllllIlllllIIlIlIIIIIlI.aB.d() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        if (B.lIlIlIlIlIlllIl(llllllllllllllIlllllIIlIlIIIIIlI.aA.o() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        Item llllllllllllllIlllllIIlIlIIIIIIl = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIIlIIlllIlll[lIIlIIllllIlI[2]]));
        if (B.lIlIlIlIllIIIII(llllllllllllllIlllllIIlIlIIIIIIl)) {
            return lIIlIIllllIlI[0];
        }
        var1_1.interact(lIIlIIlllIlll[lIIlIIllllIlI[0]]);
        this.aB.c();
        return lIIlIIllllIlI[2];
    }

    private static boolean lIlIlIlIlIlllIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIlIlIlIlIl(String llllllllllllllIlllllIIlIIllIlIlI, String llllllllllllllIlllllIIlIIllIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIIllIlIll.getBytes(StandardCharsets.UTF_8)), lIIlIIllllIlI[1]), "DES");
            Cipher llllllllllllllIlllllIIlIIllIlllI = Cipher.getInstance("DES");
            llllllllllllllIlllllIIlIIllIlllI.init(lIIlIIllllIlI[3], llllllllllllllIlllllIIlIIllIllll);
            return new String(llllllllllllllIlllllIIlIIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIlIIllIllIl) {
            llllllllllllllIlllllIIlIIllIllIl.printStackTrace();
            return null;
        }
    }
}

