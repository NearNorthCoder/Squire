/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(priority=5, name="Traversing home")
public class J
extends n {
    private static /* synthetic */ String[] llIIllIIIIII;
    private static /* synthetic */ int[] llIIllIIIIIl;

    private static void llllllIIlIIlII() {
        llIIllIIIIII = new String[llIIllIIIIIl[0]];
        J.llIIllIIIIII[J.llIIllIIIIIl[1]] = J.llllllIIlIIIlI("XYxZK6wCoIJD2khSYKuSekHh7uLJWLtSv0UYbycNfUXNEd0E8ZnaHw==", "hnKTP");
        J.llIIllIIIIII[J.llIIllIIIIIl[2]] = J.llllllIIlIIIll("Lg4yLz0OGSM=", "omFFK");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var4_4;
        int n2;
        J lllllllllllllllIlIIlIllllIlIllll;
        Player player = Players.getLocal();
        if (J.llllllIIlIIllI(player)) {
            return llIIllIIIIIl[1];
        }
        g lllllllllllllllIlIIlIllllIlIllIl = lllllllllllllllIlIIlIllllIlIllll.ba.J();
        if (J.llllllIIlIIlll((Object)lllllllllllllllIlIIlIllllIlIllIl) && J.llllllIIlIlIII(i.CRYSTAL_ORB.aC())) {
            return llIIllIIIIIl[1];
        }
        if (!J.llllllIIlIlIII(lllllllllllllllIlIIlIllllIlIllll.ba.N() ? 1 : 0) || J.llllllIIlIlIIl(lllllllllllllllIlIIlIllllIlIllll.ba.a(f.TIER_3_STAFF) ? 1 : 0) && J.llllllIIlIlIIl(lllllllllllllllIlIIlIllllIlIllll.bB() ? 1 : 0)) {
            n2 = llIIllIIIIIl[2];
            "".length();
            if ("   ".length() >= (72 + 109 - 70 + 26 ^ 100 + 0 - 38 + 79)) {
                return (("  ".length() ^ (0x88 ^ 0xB0)) & (23 + 91 - -17 + 49 ^ 111 + 61 - 81 + 51 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIllIIIIIl[1];
        }
        int lllllllllllllllIlIIlIllllIlIllII = n2;
        Item lllllllllllllllIlIIlIllllIlIlIll = Inventory.getFirst(item -> e.ab.contains(item.getId()));
        if (J.llllllIIlIlIII(lllllllllllllllIlIIlIllllIlIllII) && J.llllllIIlIlIlI(lllllllllllllllIlIIlIllllIlIllll.ba.M(), llIIllIIIIIl[3]) && J.llllllIIlIlIII(Inventory.isFull() ? 1 : 0)) {
            return llIIllIIIIIl[1];
        }
        if (J.llllllIIlIIllI(lllllllllllllllIlIIlIllllIlIlIll)) {
            void lllllllllllllllIlIIlIllllIlIlllI;
            Log.info((String)llIIllIIIIII[llIIllIIIIIl[1]]);
            return lllllllllllllllIlIIlIllllIlIllll.ba.a((l)lllllllllllllllIlIIlIllllIlIllll.ba.V().av(), lllllllllllllllIlIIlIllllIlIlllI.getWorldLocation());
        }
        var4_4.interact(llIIllIIIIII[llIIllIIIIIl[2]]);
        return llIIllIIIIIl[2];
    }

    private static boolean llllllIIlIIlll(Object object) {
        return object != null;
    }

    private static String llllllIIlIIIlI(String lllllllllllllllIlIIlIllllIIIlIIl, String lllllllllllllllIlIIlIllllIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllllIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllllIIIlIII.getBytes(StandardCharsets.UTF_8)), llIIllIIIIIl[4]), "DES");
            Cipher lllllllllllllllIlIIlIllllIIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIllllIIIlIll.init(llIIllIIIIIl[0], lllllllllllllllIlIIlIllllIIIllII);
            return new String(lllllllllllllllIlIIlIllllIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllllIIIlIlI) {
            lllllllllllllllIlIIlIllllIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIlIIllI(Object object) {
        return object == null;
    }

    private static boolean llllllIIlIlIIl(int n2) {
        return n2 != 0;
    }

    private boolean bB() {
        int n2;
        if (J.llllllIIlIlIIl(this.ba.h().makeT3Offhand() ? 1 : 0) && J.llllllIIlIlIIl(this.ba.h().goHomeT3() ? 1 : 0)) {
            n2 = llIIllIIIIIl[2];
            "".length();
            if (((26 + 82 - 9 + 28 ^ (0xEC ^ 0x80)) & (0xDD ^ 0xA9 ^ (0xF0 ^ 0x97) ^ -" ".length())) >= (110 + 83 - 89 + 55 ^ 105 + 149 - 119 + 20)) {
                return ((0x1E ^ 0x1B ^ (0x19 ^ 0x17)) & (128 + 198 - 191 + 65 ^ 80 + 20 - -33 + 62 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIllIIIIIl[1];
        }
        return n2 != 0;
    }

    @Inject
    public J(c c2) {
        d[] dArray = new d[llIIllIIIIIl[0]];
        dArray[J.llIIllIIIIIl[1]] = d.DEMI_BOSS_EXPLORE;
        dArray[J.llIIllIIIIIl[2]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static String llllllIIlIIIll(String lllllllllllllllIlIIlIllllIIllllI, String lllllllllllllllIlIIlIllllIIlllIl) {
        lllllllllllllllIlIIlIllllIIllllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllllIIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIlIllllIIllIll = lllllllllllllllIlIIlIllllIIlllIl.toCharArray();
        int lllllllllllllllIlIIlIllllIIllIlI = llIIllIIIIIl[1];
        char[] lllllllllllllllIlIIlIllllIIlIlII = lllllllllllllllIlIIlIllllIIllllI.toCharArray();
        int lllllllllllllllIlIIlIllllIIlIIll = lllllllllllllllIlIIlIllllIIlIlII.length;
        int lllllllllllllllIlIIlIllllIIlIIlI = llIIllIIIIIl[1];
        while (J.llllllIIlIlIll(lllllllllllllllIlIIlIllllIIlIIlI, lllllllllllllllIlIIlIllllIIlIIll)) {
            char lllllllllllllllIlIIlIllllIIlllll = lllllllllllllllIlIIlIllllIIlIlII[lllllllllllllllIlIIlIllllIIlIIlI];
            lllllllllllllllIlIIlIllllIIlllII.append((char)(lllllllllllllllIlIIlIllllIIlllll ^ lllllllllllllllIlIIlIllllIIllIll[lllllllllllllllIlIIlIllllIIllIlI % lllllllllllllllIlIIlIllllIIllIll.length]));
            "".length();
            ++lllllllllllllllIlIIlIllllIIllIlI;
            ++lllllllllllllllIlIIlIllllIIlIIlI;
            "".length();
            if ("   ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIllllIIlllII);
    }

    private static void llllllIIlIIlIl() {
        llIIllIIIIIl = new int[5];
        J.llIIllIIIIIl[0] = "  ".length();
        J.llIIllIIIIIl[1] = (0x48 ^ 0x55) & ~(0x97 ^ 0x8A);
        J.llIIllIIIIIl[2] = " ".length();
        J.llIIllIIIIIl[3] = 0x4D ^ 6 ^ (0xC4 ^ 0x91);
        J.llIIllIIIIIl[4] = 0xF0 ^ 0x8E ^ (0x15 ^ 0x63);
    }

    static {
        J.llllllIIlIIlIl();
        J.llllllIIlIIlII();
    }

    private static boolean llllllIIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIlIlIII(int n2) {
        return n2 == 0;
    }
}

