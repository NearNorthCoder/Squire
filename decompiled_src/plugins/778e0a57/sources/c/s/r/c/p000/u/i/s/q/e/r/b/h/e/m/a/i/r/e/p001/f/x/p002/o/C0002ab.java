package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

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
@TaskDesc(name = "Drink Overload", priority = 30000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ab  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ab.class */
public class C0002ab extends Task {
    private final /* synthetic */ SquireChambersPlugin cA;
    private static /* synthetic */ String[] lIlIIlIIIIII;
    private static /* synthetic */ int[] lIlIIlIIIIIl;
    private final /* synthetic */ SquireChambersConfig cB;

    private static boolean llIlIlllllllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlIlllllIIlI(String lllllllllllllllIllIlllIlIlIIIlII, String lllllllllllllllIllIlllIlIlIIIIll) {
        String lllllllllllllllIllIlllIlIlIIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlllIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlllIlIlIIIIll.toCharArray();
        int lllllllllllllllIllIlllIlIlIIIIII = lIlIIlIIIIIl[0];
        char[] charArray2 = lllllllllllllllIllIlllIlIlIIIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIIIIIl[0];
        while (llIlIlllllllII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIlllIlIlIIIIII % charArray.length]));
            "".length();
            lllllllllllllllIllIlllIlIlIIIIII++;
            i++;
            "".length();
            if ((148 ^ 145) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIllllllIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    private boolean cu() {
        if (llIlIlllllIllI(Players.getLocal().getPlane())) {
            return lIlIIlIIIIIl[0];
        }
        C0039n L = this.cA.L();
        if (llIlIlllllIlll(L)) {
            return lIlIIlIIIIIl[0];
        }
        List<N> e = this.cA.C().e();
        int i = lIlIIlIIIIIl[0];
        int i2 = lIlIIlIIIIIl[0];
        while (llIlIlllllllII(i2, e.size())) {
            N n = e.get(i2);
            if (llIlIlllllllIl(n) && llIlIllllllllI(n, N.SCAVENGERS) && llIlIllllllllI(n, N.CRABS) && llIlIllllllllI(n, N.END) && llIlIllllllllI(n, N.START) && llIlIllllllllI(n, N.FARMING)) {
                if (llIlIlllllllll(n, N.THIEVING)) {
                    "".length();
                    if (" ".length() < 0) {
                        return ((108 ^ 14) ^ (6 ^ 50)) & (((126 ^ 117) ^ (238 ^ 179)) ^ (-" ".length()));
                    }
                } else if (llIlIllllllIll(i) && llIlIllllllIll(this.cA.C().a(n) ? 1 : 0)) {
                    return lIlIIlIIIIIl[3];
                } else {
                    if (llIlIlllllllll(n, L.aM())) {
                        i = lIlIIlIIIIIl[3];
                    }
                }
            }
            i2++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return ((122 ^ 119) ^ (53 ^ 62)) & (((227 ^ 192) ^ (134 ^ 163)) ^ (-" ".length()));
            }
        }
        return lIlIIlIIIIIl[0];
    }

    private static boolean llIlIllllllIll(int i) {
        return i != 0;
    }

    private static boolean llIlIlllllIlll(Object obj) {
        return obj == null;
    }

    private static String llIlIlllllIIIl(String lllllllllllllllIllIlllIlIlIlIlII, String lllllllllllllllIllIlllIlIlIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIlIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIIIIl[5], lllllllllllllllIllIlllIlIlIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllIlIlIlIlIl) {
            lllllllllllllllIllIlllIlIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllllllIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (llIlIlllllIllI(ct() ? 1 : 0) && llIlIlllllIllI(cu() ? 1 : 0)) {
            return lIlIIlIIIIIl[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIlIIlIIIIII[lIlIIlIIIIIl[6]]);
        });
        if (!llIlIlllllIlll(first) && !llIlIllllllIII(Static.getClient().getVarbitValue(lIlIIlIIIIIl[1])) && !llIlIllllllIIl(Combat.getCurrentHealth(), lIlIIlIIIIIl[2])) {
            first.interact(lIlIIlIIIIII[lIlIIlIIIIIl[0]]);
            return lIlIIlIIIIIl[3];
        }
        return lIlIIlIIIIIl[0];
    }

    private static boolean llIlIllllllllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void llIlIlllllIlIl() {
        lIlIIlIIIIIl = new int[8];
        lIlIIlIIIIIl[0] = (170 ^ 156) & ((121 ^ 79) ^ (-1));
        lIlIIlIIIIIl[1] = (-((-22035) & 32467)) & (-16917) & 32766;
        lIlIIlIIIIIl[2] = 126 ^ 76;
        lIlIIlIIIIIl[3] = " ".length();
        lIlIIlIIIIIl[4] = (115 ^ 52) ^ (49 ^ 114);
        lIlIIlIIIIIl[5] = "  ".length();
        lIlIIlIIIIIl[6] = "   ".length();
        lIlIIlIIIIIl[7] = 117 ^ 125;
    }

    private static void llIlIlllllIlII() {
        lIlIIlIIIIII = new String[lIlIIlIIIIIl[4]];
        lIlIIlIIIIII[lIlIIlIIIIIl[0]] = llIlIlllllIIIl("8dEmNzjWlkw=", "saduN");
        lIlIIlIIIIII[lIlIIlIIIIIl[3]] = llIlIlllllIIlI("DyMwDj8hOy9aNCMoMRMzMA==", "BZCzV");
        lIlIIlIIIIII[lIlIIlIIIIIl[5]] = llIlIlllllIIll("P+Ix1FYnmE0BYqJ5lOtyKQ==", "nHaHw");
        lIlIIlIIIIII[lIlIIlIIIIIl[6]] = llIlIlllllIIIl("A3DFSq1wT3LFqwVQWWs0eg==", "SREzD");
    }

    private static boolean llIlIlllllllIl(Object obj) {
        return obj != null;
    }

    private static String llIlIlllllIIll(String lllllllllllllllIllIlllIlIllIIIIl, String lllllllllllllllIllIlllIlIllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIlIllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIlIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllIlIllIIIlI) {
            lllllllllllllllIllIlllIlIllIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean ct() {
        if (llIlIlllllIllI(C0046u.be() ? 1 : 0)) {
            return lIlIIlIIIIIl[0];
        }
        Player local = Players.getLocal();
        if (!llIlIllllllIlI(C0046u.bg(), lIlIIlIIIIIl[4]) || llIlIllllllIll(local.getPlane())) {
            return lIlIIlIIIIIl[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlIllllllIll(tileObject.getName().contains(lIlIIlIIIIII[lIlIIlIIIIIl[3]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIIIIIl[3]];
                strArr[lIlIIlIIIIIl[0]] = lIlIIlIIIIII[lIlIIlIIIIIl[5]];
                if (llIlIllllllIll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIlIIIIIl[3];
                    "".length();
                    return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIlIIIIIl[0];
        });
        if (!llIlIlllllIlll(nearest) && !llIlIllllllIIl(local.getWorldY(), nearest.getWorldY())) {
            return lIlIIlIIIIIl[3];
        }
        return lIlIIlIIIIIl[0];
    }

    @Inject
    public C0002ab(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cA = squireChambersPlugin;
        this.cB = squireChambersConfig;
    }

    static {
        llIlIlllllIlIl();
        llIlIlllllIlII();
    }

    private static boolean llIlIllllllIII(int i) {
        return i > 0;
    }

    private static boolean llIlIlllllIllI(int i) {
        return i == 0;
    }

    private static boolean llIlIlllllllII(int i, int i2) {
        return i < i2;
    }
}
