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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.a;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

@TaskDesc(name="Drinking stamina dose", priority=8)
public class r
extends Task {
    private static /* synthetic */ int[] lIIlIlIIlllIl;
    private static /* synthetic */ String[] lIIlIlIIlllII;
    private final /* synthetic */ a aa;
    private final /* synthetic */ l Z;
    private final /* synthetic */ g Y;

    private static void lIlIlIlllIlIlll() {
        lIIlIlIIlllIl = new int[6];
        r.lIIlIlIIlllIl[0] = (0x76 ^ 0x36 ^ (0x6A ^ 0x35)) & (125 + 101 - 198 + 163 ^ 22 + 20 - -68 + 50 ^ -" ".length());
        r.lIIlIlIIlllIl[1] = 0xB1 ^ 0xAF;
        r.lIIlIlIIlllIl[2] = "   ".length();
        r.lIIlIlIIlllIl[3] = " ".length();
        r.lIIlIlIIlllIl[4] = "  ".length();
        r.lIIlIlIIlllIl[5] = 108 + 15 - 107 + 129 ^ 39 + 146 - 103 + 71;
    }

    private static boolean lIlIlIlllIllIlI(Object object) {
        return object != null;
    }

    private static String lIlIlIlllIlIlII(String llllllllllllllIllllIlllllIIIIllI, String llllllllllllllIllllIlllllIIIlIlI) {
        llllllllllllllIllllIlllllIIIIllI = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllllIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlllllIIIlIIl = new StringBuilder();
        char[] llllllllllllllIllllIlllllIIIlIII = llllllllllllllIllllIlllllIIIlIlI.toCharArray();
        int llllllllllllllIllllIlllllIIIIlll = lIIlIlIIlllIl[0];
        char[] llllllllllllllIllllIlllllIIIIIIl = llllllllllllllIllllIlllllIIIIllI.toCharArray();
        int llllllllllllllIllllIlllllIIIIIII = llllllllllllllIllllIlllllIIIIIIl.length;
        int llllllllllllllIllllIllllIlllllll = lIIlIlIIlllIl[0];
        while (r.lIlIlIlllIllIll(llllllllllllllIllllIllllIlllllll, llllllllllllllIllllIlllllIIIIIII)) {
            char llllllllllllllIllllIlllllIIIllII = llllllllllllllIllllIlllllIIIIIIl[llllllllllllllIllllIllllIlllllll];
            llllllllllllllIllllIlllllIIIlIIl.append((char)(llllllllllllllIllllIlllllIIIllII ^ llllllllllllllIllllIlllllIIIlIII[llllllllllllllIllllIlllllIIIIlll % llllllllllllllIllllIlllllIIIlIII.length]));
            "".length();
            ++llllllllllllllIllllIlllllIIIIlll;
            ++llllllllllllllIllllIllllIlllllll;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlllllIIIlIIl);
    }

    private static boolean lIlIlIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r llllllllllllllIllllIlllllIIlIlll;
        if (r.lIlIlIlllIllIII(this.Y.m() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        if (!r.lIlIlIlllIllIIl(llllllllllllllIllllIlllllIIlIlll.Y.l() ? 1 : 0) || r.lIlIlIlllIllIlI(llllllllllllllIllllIlllllIIlIlll.Z.M())) {
            return lIIlIlIIlllIl[0];
        }
        if (!r.lIlIlIlllIllIll(Movement.getRunEnergy(), lIIlIlIIlllIl[1]) || r.lIlIlIlllIllIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        Item llllllllllllllIllllIlllllIIlIllI = Inventory.getFirst(item -> item.getName().startsWith(lIIlIlIIlllII[lIIlIlIIlllIl[3]]));
        if (!r.lIlIlIlllIllIlI(llllllllllllllIllllIlllllIIlIllI) || r.lIlIlIlllIllIII(llllllllllllllIllllIlllllIIlIlll.aa.e() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        var1_1.interact(lIIlIlIIlllII[lIIlIlIIlllIl[0]]);
        this.aa.b();
        this.sleep(lIIlIlIIlllIl[2]);
        return lIIlIlIIlllIl[3];
    }

    private static boolean lIlIlIlllIllIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public r(g g2, l l2, a a2) {
        this.Y = g2;
        this.Z = l2;
        this.aa = a2;
    }

    static {
        r.lIlIlIlllIlIlll();
        r.lIlIlIlllIlIllI();
    }

    private static boolean lIlIlIlllIllIIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIlllIlIlIl(String llllllllllllllIllllIllllIlllIllI, String llllllllllllllIllllIllllIlllIlIl) {
        try {
            SecretKeySpec llllllllllllllIllllIllllIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllllIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIIlllIl[5]), "DES");
            Cipher llllllllllllllIllllIllllIllllIII = Cipher.getInstance("DES");
            llllllllllllllIllllIllllIllllIII.init(lIIlIlIIlllIl[4], llllllllllllllIllllIllllIllllIIl);
            return new String(llllllllllllllIllllIllllIllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllllIlllIlll) {
            llllllllllllllIllllIllllIlllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlllIlIllI() {
        lIIlIlIIlllII = new String[lIIlIlIIlllIl[4]];
        r.lIIlIlIIlllII[r.lIIlIlIIlllIl[0]] = r.lIlIlIlllIlIlII("Fh46Gi0=", "RlStF");
        r.lIIlIlIIlllII[r.lIIlIlIIlllIl[3]] = r.lIlIlIlllIlIlIl("1oNu0JYjjvM=", "sKqmh");
    }
}

