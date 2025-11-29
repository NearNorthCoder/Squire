/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Drink Overload", priority=30000)
public class ab
extends Task {
    private final /* synthetic */ SquireChambersPlugin cA;
    private static /* synthetic */ String[] lIlIIlIIIIII;
    private static /* synthetic */ int[] lIlIIlIIIIIl;
    private final /* synthetic */ SquireChambersConfig cB;

    private static boolean llIlIlllllllll(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIlllllIIlI(String lllllllllllllllIllIlllIlIIllllll, String lllllllllllllllIllIlllIlIlIIIIll) {
        lllllllllllllllIllIlllIlIIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIllIlllIlIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlllIlIlIIIIlI = new StringBuilder();
        char[] lllllllllllllllIllIlllIlIlIIIIIl = lllllllllllllllIllIlllIlIlIIIIll.toCharArray();
        int lllllllllllllllIllIlllIlIlIIIIII = lIlIIlIIIIIl[0];
        char[] lllllllllllllllIllIlllIlIIlllIlI = lllllllllllllllIllIlllIlIIllllll.toCharArray();
        int lllllllllllllllIllIlllIlIIlllIIl = lllllllllllllllIllIlllIlIIlllIlI.length;
        int lllllllllllllllIllIlllIlIIlllIII = lIlIIlIIIIIl[0];
        while (ab.llIlIlllllllII(lllllllllllllllIllIlllIlIIlllIII, lllllllllllllllIllIlllIlIIlllIIl)) {
            char lllllllllllllllIllIlllIlIlIIIlIl = lllllllllllllllIllIlllIlIIlllIlI[lllllllllllllllIllIlllIlIIlllIII];
            lllllllllllllllIllIlllIlIlIIIIlI.append((char)(lllllllllllllllIllIlllIlIlIIIlIl ^ lllllllllllllllIllIlllIlIlIIIIIl[lllllllllllllllIllIlllIlIlIIIIII % lllllllllllllllIllIlllIlIlIIIIIl.length]));
            "".length();
            ++lllllllllllllllIllIlllIlIlIIIIII;
            ++lllllllllllllllIllIlllIlIIlllIII;
            "".length();
            if ((0x94 ^ 0x91) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlllIlIlIIIIlI);
    }

    private static boolean llIlIllllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private boolean cu() {
        ab lllllllllllllllIllIlllIlIlllIIII;
        if (ab.llIlIlllllIllI(Players.getLocal().getPlane())) {
            return lIlIIlIIIIIl[0];
        }
        n lllllllllllllllIllIlllIlIllIllll = lllllllllllllllIllIlllIlIlllIIII.cA.L();
        if (ab.llIlIlllllIlll(lllllllllllllllIllIlllIlIllIllll)) {
            return lIlIIlIIIIIl[0];
        }
        List<N> lllllllllllllllIllIlllIlIllIlllI = lllllllllllllllIllIlllIlIlllIIII.cA.C().e();
        int lllllllllllllllIllIlllIlIllIllIl = lIlIIlIIIIIl[0];
        int lllllllllllllllIllIlllIlIllIllII = lIlIIlIIIIIl[0];
        while (ab.llIlIlllllllII(lllllllllllllllIllIlllIlIllIllII, lllllllllllllllIllIlllIlIllIlllI.size())) {
            N lllllllllllllllIllIlllIlIllIlIll = lllllllllllllllIllIlllIlIllIlllI.get(lllllllllllllllIllIlllIlIllIllII);
            if (ab.llIlIlllllllIl((Object)lllllllllllllllIllIlllIlIllIlIll) && ab.llIlIllllllllI((Object)lllllllllllllllIllIlllIlIllIlIll, (Object)N.SCAVENGERS) && ab.llIlIllllllllI((Object)lllllllllllllllIllIlllIlIllIlIll, (Object)N.CRABS) && ab.llIlIllllllllI((Object)lllllllllllllllIllIlllIlIllIlIll, (Object)N.END) && ab.llIlIllllllllI((Object)lllllllllllllllIllIlllIlIllIlIll, (Object)N.START) && ab.llIlIllllllllI((Object)lllllllllllllllIllIlllIlIllIlIll, (Object)N.FARMING)) {
                if (ab.llIlIlllllllll((Object)lllllllllllllllIllIlllIlIllIlIll, (Object)N.THIEVING)) {
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x6C ^ 0xE ^ (6 ^ 0x32)) & (0x7E ^ 0x75 ^ (0xEE ^ 0xB3) ^ -" ".length())) != 0;
                    }
                } else {
                    if (ab.llIlIllllllIll(lllllllllllllllIllIlllIlIllIllIl) && ab.llIlIllllllIll(lllllllllllllllIllIlllIlIlllIIII.cA.C().a(lllllllllllllllIllIlllIlIllIlIll) ? 1 : 0)) {
                        return lIlIIlIIIIIl[3];
                    }
                    if (ab.llIlIlllllllll((Object)lllllllllllllllIllIlllIlIllIlIll, (Object)lllllllllllllllIllIlllIlIllIllll.aM())) {
                        lllllllllllllllIllIlllIlIllIllIl = lIlIIlIIIIIl[3];
                    }
                }
            }
            ++lllllllllllllllIllIlllIlIllIllII;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return ((0x7A ^ 0x77 ^ (0x35 ^ 0x3E)) & (0xE3 ^ 0xC0 ^ (0x86 ^ 0xA3) ^ -" ".length())) != 0;
        }
        return lIlIIlIIIIIl[0];
    }

    private static boolean llIlIllllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlllllIlll(Object object) {
        return object == null;
    }

    private static String llIlIlllllIIIl(String lllllllllllllllIllIlllIlIlIlIlII, String lllllllllllllllIllIlllIlIlIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIlIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlllIlIlIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlllIlIlIlIllI.init(lIlIIlIIIIIl[5], lllllllllllllllIllIlllIlIlIlIlll);
            return new String(lllllllllllllllIllIlllIlIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllIlIlIlIlIl) {
            lllllllllllllllIllIlllIlIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllllllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ab.llIlIlllllIllI(this.ct() ? 1 : 0) && ab.llIlIlllllIllI(this.cu() ? 1 : 0)) {
            return lIlIIlIIIIIl[0];
        }
        Item lllllllllllllllIllIlllIlIlllllII = Inventory.getFirst(item -> item.getName().startsWith(lIlIIlIIIIII[lIlIIlIIIIIl[6]]));
        if (ab.llIlIlllllIlll(lllllllllllllllIllIlllIlIlllllII)) {
            return lIlIIlIIIIIl[0];
        }
        int lllllllllllllllIllIlllIlIllllIll = Static.getClient().getVarbitValue(lIlIIlIIIIIl[1]);
        if (ab.llIlIllllllIII(lllllllllllllllIllIlllIlIllllIll)) {
            return lIlIIlIIIIIl[0];
        }
        if (ab.llIlIllllllIIl(Combat.getCurrentHealth(), lIlIIlIIIIIl[2])) {
            return lIlIIlIIIIIl[0];
        }
        var1_1.interact(lIlIIlIIIIII[lIlIIlIIIIIl[0]]);
        return lIlIIlIIIIIl[3];
    }

    private static boolean llIlIllllllllI(Object object, Object object2) {
        return object != object2;
    }

    private static void llIlIlllllIlIl() {
        lIlIIlIIIIIl = new int[8];
        ab.lIlIIlIIIIIl[0] = (0xAA ^ 0x9C) & ~(0x79 ^ 0x4F);
        ab.lIlIIlIIIIIl[1] = -(0xFFFFA9ED & 0x7ED3) & (0xFFFFBDEB & 0x7FFE);
        ab.lIlIIlIIIIIl[2] = 0x7E ^ 0x4C;
        ab.lIlIIlIIIIIl[3] = " ".length();
        ab.lIlIIlIIIIIl[4] = 0x73 ^ 0x34 ^ (0x31 ^ 0x72);
        ab.lIlIIlIIIIIl[5] = "  ".length();
        ab.lIlIIlIIIIIl[6] = "   ".length();
        ab.lIlIIlIIIIIl[7] = 0x75 ^ 0x7D;
    }

    private static void llIlIlllllIlII() {
        lIlIIlIIIIII = new String[lIlIIlIIIIIl[4]];
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[0]] = ab.llIlIlllllIIIl("8dEmNzjWlkw=", "saduN");
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[3]] = ab.llIlIlllllIIlI("DyMwDj8hOy9aNCMoMRMzMA==", "BZCzV");
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[5]] = ab.llIlIlllllIIll("P+Ix1FYnmE0BYqJ5lOtyKQ==", "nHaHw");
        ab.lIlIIlIIIIII[ab.lIlIIlIIIIIl[6]] = ab.llIlIlllllIIIl("A3DFSq1wT3LFqwVQWWs0eg==", "SREzD");
    }

    private static boolean llIlIlllllllIl(Object object) {
        return object != null;
    }

    private static String llIlIlllllIIll(String lllllllllllllllIllIlllIlIllIIIIl, String lllllllllllllllIllIlllIlIllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIlIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIlIllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIIl[7]), "DES");
            Cipher lllllllllllllllIllIlllIlIllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIllIlllIlIllIIIll.init(lIlIIlIIIIIl[5], lllllllllllllllIllIlllIlIllIIlII);
            return new String(lllllllllllllllIllIlllIlIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIlIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllIlIllIIIlI) {
            lllllllllllllllIllIlllIlIllIIIlI.printStackTrace();
            return null;
        }
    }

    private boolean ct() {
        if (ab.llIlIlllllIllI(u.be() ? 1 : 0)) {
            return lIlIIlIIIIIl[0];
        }
        Player lllllllllllllllIllIlllIlIllllIII = Players.getLocal();
        if (!ab.llIlIllllllIlI(u.bg(), lIlIIlIIIIIl[4]) || ab.llIlIllllllIll(lllllllllllllllIllIlllIlIllllIII.getPlane())) {
            return lIlIIlIIIIIl[0];
        }
        TileObject lllllllllllllllIllIlllIlIlllIlll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ab.llIlIllllllIll(tileObject.getName().contains(lIlIIlIIIIII[lIlIIlIIIIIl[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIIIl[3]];
                stringArray[ab.lIlIIlIIIIIl[0]] = lIlIIlIIIIII[lIlIIlIIIIIl[5]];
                if (ab.llIlIllllllIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIIIIl[3];
                    "".length();
                    if ("  ".length() == "  ".length()) return n2 != 0;
                    return ((0xE9 ^ 0xAD) & ~(0x82 ^ 0xC6)) != 0;
                }
            }
            n2 = lIlIIlIIIIIl[0];
            return n2 != 0;
        });
        if (ab.llIlIlllllIlll(lllllllllllllllIllIlllIlIlllIlll)) {
            return lIlIIlIIIIIl[0];
        }
        if (ab.llIlIllllllIIl(lllllllllllllllIllIlllIlIllllIII.getWorldY(), lllllllllllllllIllIlllIlIlllIlll.getWorldY())) {
            return lIlIIlIIIIIl[0];
        }
        return lIlIIlIIIIIl[3];
    }

    @Inject
    public ab(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cA = squireChambersPlugin;
        this.cB = squireChambersConfig;
    }

    static {
        ab.llIlIlllllIlIl();
        ab.llIlIlllllIlII();
    }

    private static boolean llIlIllllllIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlllllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlllllllII(int n2, int n3) {
        return n2 < n3;
    }
}

