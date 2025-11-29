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
import gg.squire.saradomin.SquireSaraConfig;
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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

@TaskDesc(name="Eating food", priority=8)
public class s
extends Task {
    private static /* synthetic */ int[] lIIlIIlllllII;
    private static /* synthetic */ String[] lIIlIIllllIll;
    private final /* synthetic */ a ad;
    private final /* synthetic */ SquireSaraConfig ae;
    private final /* synthetic */ l ac;
    private final /* synthetic */ g ab;

    private static boolean lIlIlIlIllIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIllIIlll(int n2) {
        return n2 != 0;
    }

    @Inject
    public s(g g2, l l2, a a2, SquireSaraConfig squireSaraConfig) {
        this.ab = g2;
        this.ac = l2;
        this.ad = a2;
        this.ae = squireSaraConfig;
    }

    private static String lIlIlIlIllIIIlI(String llllllllllllllIlllllIIlIIlIIIlIl, String llllllllllllllIlllllIIlIIlIIlIIl) {
        llllllllllllllIlllllIIlIIlIIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIIlIIlIIlIII = new StringBuilder();
        char[] llllllllllllllIlllllIIlIIlIIIlll = llllllllllllllIlllllIIlIIlIIlIIl.toCharArray();
        int llllllllllllllIlllllIIlIIlIIIllI = lIIlIIlllllII[0];
        char[] llllllllllllllIlllllIIlIIlIIIIII = llllllllllllllIlllllIIlIIlIIIlIl.toCharArray();
        int llllllllllllllIlllllIIlIIIllllll = llllllllllllllIlllllIIlIIlIIIIII.length;
        int llllllllllllllIlllllIIlIIIlllllI = lIIlIIlllllII[0];
        while (s.lIlIlIlIllIlIll(llllllllllllllIlllllIIlIIIlllllI, llllllllllllllIlllllIIlIIIllllll)) {
            char llllllllllllllIlllllIIlIIlIIlIll = llllllllllllllIlllllIIlIIlIIIIII[llllllllllllllIlllllIIlIIIlllllI];
            llllllllllllllIlllllIIlIIlIIlIII.append((char)(llllllllllllllIlllllIIlIIlIIlIll ^ llllllllllllllIlllllIIlIIlIIIlll[llllllllllllllIlllllIIlIIlIIIllI % llllllllllllllIlllllIIlIIlIIIlll.length]));
            "".length();
            ++llllllllllllllIlllllIIlIIlIIIllI;
            ++llllllllllllllIlllllIIlIIIlllllI;
            "".length();
            if (-(76 + 114 - 164 + 148 ^ 134 + 22 - 14 + 28) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllllIIlIIlIIlIII);
    }

    private static void lIlIlIlIllIIlII() {
        lIIlIIllllIll = new String[lIIlIIlllllII[4]];
        s.lIIlIIllllIll[s.lIIlIIlllllII[0]] = s.lIlIlIlIllIIIIl("rB7Qg2uFdjk=", "HFClW");
        s.lIIlIIllllIll[s.lIIlIIlllllII[1]] = s.lIlIlIlIllIIIlI("CAwg", "MmTnJ");
        s.lIIlIIllllIll[s.lIIlIIlllllII[2]] = s.lIlIlIlIllIIIlI("KTcJLQY=", "yRhNn");
        s.lIIlIIllllIll[s.lIIlIIlllllII[3]] = s.lIlIlIlIllIIIll("OZ/EqexQ80k=", "HOhrg");
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s llllllllllllllIlllllIIlIIlIllIIl;
        if (s.lIlIlIlIllIIllI(this.ab.m() ? 1 : 0)) {
            return lIIlIIlllllII[0];
        }
        if (s.lIlIlIlIllIIlll(llllllllllllllIlllllIIlIIlIllIIl.ab.l() ? 1 : 0) && s.lIlIlIlIllIlIII(llllllllllllllIlllllIIlIIlIllIIl.ac.M())) {
            return lIIlIIlllllII[0];
        }
        int llllllllllllllIlllllIIlIIlIllIII = llllllllllllllIlllllIIlIIlIllIIl.ae.eatFoodAt();
        if (!s.lIlIlIlIllIlIIl(Combat.getCurrentHealth(), llllllllllllllIlllllIIlIIlIllIII) || s.lIlIlIlIllIIllI(llllllllllllllIlllllIIlIIlIllIIl.ad.d() ? 1 : 0)) {
            return lIIlIIlllllII[0];
        }
        Item llllllllllllllIlllllIIlIIlIlIlll = Inventory.getFirst(item -> {
            int n2;
            if (s.lIlIlIlIllIIllI(item.getName().equals(lIIlIIllllIll[lIIlIIlllllII[2]]) ? 1 : 0) && s.lIlIlIlIllIIlll(item.hasAction(lIIlIIllllIll[lIIlIIlllllII[3]]::equals) ? 1 : 0)) {
                n2 = lIIlIIlllllII[1];
                "".length();
                if ("   ".length() < 0) {
                    return ((9 + 128 - 8 + 2 ^ 90 + 32 - 9 + 75) & (0x6B ^ 0x4E ^ (0x7F ^ 0x65) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIIlIIlllllII[0];
            }
            return n2 != 0;
        });
        if (s.lIlIlIlIllIlIlI(llllllllllllllIlllllIIlIIlIlIlll)) {
            String[] stringArray = new String[lIIlIIlllllII[1]];
            stringArray[s.lIIlIIlllllII[0]] = lIIlIIllllIll[lIIlIIlllllII[0]];
            llllllllllllllIlllllIIlIIlIlIlll = Inventory.getFirst((String[])stringArray);
        }
        if (s.lIlIlIlIllIlIlI(llllllllllllllIlllllIIlIIlIlIlll)) {
            return llllllllllllllIlllllIIlIIlIllIIl.U();
        }
        var2_2.interact(lIIlIIllllIll[lIIlIIlllllII[1]]);
        this.ad.c();
        return lIIlIIlllllII[1];
    }

    private boolean U() {
        return lIIlIIlllllII[0];
    }

    private static String lIlIlIlIllIIIIl(String llllllllllllllIlllllIIlIIIlIlIII, String llllllllllllllIlllllIIlIIIlIIlll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIlIIIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIlIIIlIlIlI.init(lIIlIIlllllII[2], llllllllllllllIlllllIIlIIIlIlIll);
            return new String(llllllllllllllIlllllIIlIIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIlIIIlIlIIl) {
            llllllllllllllIlllllIIlIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.lIlIlIlIllIIlIl();
        s.lIlIlIlIllIIlII();
    }

    private static void lIlIlIlIllIIlIl() {
        lIIlIIlllllII = new int[6];
        s.lIIlIIlllllII[0] = (0xB ^ 0x22) & ~(0x42 ^ 0x6B);
        s.lIIlIIlllllII[1] = " ".length();
        s.lIIlIIlllllII[2] = "  ".length();
        s.lIIlIIlllllII[3] = "   ".length();
        s.lIIlIIlllllII[4] = 0x78 ^ 0x7C;
        s.lIIlIIlllllII[5] = 0x91 ^ 0x89 ^ (0x4F ^ 0x5F);
    }

    private static boolean lIlIlIlIllIlIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIllIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlIlIllIIIll(String llllllllllllllIlllllIIlIIIllIIll, String llllllllllllllIlllllIIlIIIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIlllllII[5]), "DES");
            Cipher llllllllllllllIlllllIIlIIIllIlll = Cipher.getInstance("DES");
            llllllllllllllIlllllIIlIIIllIlll.init(lIIlIIlllllII[2], llllllllllllllIlllllIIlIIIlllIII);
            return new String(llllllllllllllIlllllIIlIIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIlIIIllIllI) {
            llllllllllllllIlllllIIlIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllIlIII(Object object) {
        return object != null;
    }
}

