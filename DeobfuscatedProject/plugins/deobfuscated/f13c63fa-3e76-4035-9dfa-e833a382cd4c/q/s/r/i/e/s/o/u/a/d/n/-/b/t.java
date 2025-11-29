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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.f;

@TaskDesc(name="Consuming peaches", priority=5, blocking=true)
public class t
extends Task {
    private static /* synthetic */ String[] llIlllIllIl;
    private final /* synthetic */ e aj;
    private static /* synthetic */ int[] llIllllIIIl;
    private final /* synthetic */ f ak;

    private static void lIlIlIllllIIIl() {
        llIlllIllIl = new String[llIllllIIIl[3]];
        t.llIlllIllIl[t.llIllllIIIl[0]] = t."Eat";
        t.llIlllIllIl[t.llIllllIIIl[2]] = t."peach";
    }

    private static String lIlIlIlllIlIlI(String llllllllllllllllIIlIlIlIIIlIIlII, String llllllllllllllllIIlIlIlIIIlIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIIIlIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIIIlIIllI.init(llIllllIIIl[3], llllllllllllllllIIlIlIlIIIlIIlll);
            return new String(llllllllllllllllIIlIlIlIIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIIIlIIlIl) {
            llllllllllllllllIIlIlIlIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIllllIIII(String llllllllllllllllIIlIlIlIIIIIllll, String llllllllllllllllIIlIlIlIIIIIlllI) {
        llllllllllllllllIIlIlIlIIIIIllll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIlIIIIlIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIlIlIIIIlIIIl = llllllllllllllllIIlIlIlIIIIIlllI.toCharArray();
        int llllllllllllllllIIlIlIlIIIIlIIII = llIllllIIIl[0];
        char[] llllllllllllllllIIlIlIlIIIIIlIlI = llllllllllllllllIIlIlIlIIIIIllll.toCharArray();
        int llllllllllllllllIIlIlIlIIIIIlIIl = llllllllllllllllIIlIlIlIIIIIlIlI.length;
        int llllllllllllllllIIlIlIlIIIIIlIII = llIllllIIIl[0];
        while (t.lIlIlIlllllIll(llllllllllllllllIIlIlIlIIIIIlIII, llllllllllllllllIIlIlIlIIIIIlIIl)) {
            char llllllllllllllllIIlIlIlIIIIlIlIl = llllllllllllllllIIlIlIlIIIIIlIlI[llllllllllllllllIIlIlIlIIIIIlIII];
            llllllllllllllllIIlIlIlIIIIlIIlI.append((char)(llllllllllllllllIIlIlIlIIIIlIlIl ^ llllllllllllllllIIlIlIlIIIIlIIIl[llllllllllllllllIIlIlIlIIIIlIIII % llllllllllllllllIIlIlIlIIIIlIIIl.length]));
            0;
            ++llllllllllllllllIIlIlIlIIIIlIIII;
            ++llllllllllllllllIIlIlIlIIIIIlIII;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIlIIIIlIIlI);
    }

    private static boolean lIlIlIlllllIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlllllIIl(int n2) {
        return n2 == 0;
    }

    static {
        t.lIlIlIllllIllI();
        t.lIlIlIllllIIIl();
    }

    private static boolean lIlIlIlllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t llllllllllllllllIIlIlIlIIIlIllIl;
        if (!t.lIlIlIllllIlll(this.aj.t() ? 1 : 0) || t.lIlIlIllllIlll(this.aj.s() ? 1 : 0)) {
            return llIllllIIIl[0];
        }
        if (!t.lIlIlIlllllIII(Combat.getMissingHealth(), llIllllIIIl[1]) || t.lIlIlIlllllIIl(llllllllllllllllIIlIlIlIIIlIllIl.ak.D() ? 1 : 0)) {
            return llIllllIIIl[0];
        }
        Item llllllllllllllllIIlIlIlIIIlIllII = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlllIllIl[llIllllIIIl[2]]));
        if (t.lIlIlIlllllIlI(llllllllllllllllIIlIlIlIIIlIllII)) {
            return llIllllIIIl[0];
        }
        var1_1.interact(llIlllIllIl[llIllllIIIl[0]]);
        this.ak.C();
        return llIllllIIIl[2];
    }

    private static void lIlIlIllllIllI() {
        llIllllIIIl = new int[4];
        t.llIllllIIIl[0] = (0x3A ^ 0x7C) & ~(0xE8 ^ 0xAE);
        t.llIllllIIIl[1] = 0xDD ^ 0xBD ^ (0xE9 ^ 0x81);
        t.llIllllIIIl[2] = 1;
        t.llIllllIIIl[3] = 2;
    }

    private static boolean lIlIlIllllIlll(int n2) {
        return n2 != 0;
    }

    @Inject
    public t(e e2, f f2) {
        this.aj = e2;
        this.ak = f2;
    }
}

