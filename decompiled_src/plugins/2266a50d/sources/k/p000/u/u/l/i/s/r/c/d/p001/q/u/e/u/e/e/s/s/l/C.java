package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Thralls;
@TaskDesc(name = "Using thrall", priority = 4999)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.C  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/C.class */
public class C extends Task {
    private static /* synthetic */ String[] lIllIIllllIl;
    private static /* synthetic */ int[] lIllIIlllllI;
    private final /* synthetic */ C0000a be;
    private final /* synthetic */ SquireDukeSucellus bd;

    private static String lllIIllIIlIIll(String lllllllllllllllIllIIIIIIlIIlIlII, String lllllllllllllllIllIIIIIIlIIlIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIIIlIIlIIlI = new StringBuilder();
        char[] lllllllllllllllIllIIIIIIlIIlIIIl = lllllllllllllllIllIIIIIIlIIlIIll.toCharArray();
        int lllllllllllllllIllIIIIIIlIIlIIII = lIllIIlllllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIllIIIIIIlIIIlIII = lIllIIlllllI[0];
        while (lllIIllIIllIIl(lllllllllllllllIllIIIIIIlIIIlIII, length)) {
            char lllllllllllllllIllIIIIIIlIIlIlIl = charArray[lllllllllllllllIllIIIIIIlIIIlIII];
            lllllllllllllllIllIIIIIIlIIlIIlI.append((char) (lllllllllllllllIllIIIIIIlIIlIlIl ^ lllllllllllllllIllIIIIIIlIIlIIIl[lllllllllllllllIllIIIIIIlIIlIIII % lllllllllllllllIllIIIIIIlIIlIIIl.length]));
            "".length();
            lllllllllllllllIllIIIIIIlIIlIIII++;
            lllllllllllllllIllIIIIIIlIIIlIII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIIIIlIIlIIlI);
    }

    private static void lllIIllIIlIlII() {
        lIllIIllllIl = new String[lIllIIlllllI[4]];
        lIllIIllllIl[lIllIIlllllI[0]] = lllIIllIIlIIlI("U/pYLS/akwE=", "ScqhY");
        lIllIIllllIl[lIllIIlllllI[1]] = lllIIllIIlIIlI("nv1gdKX5tXrtk1LLWwi5rA==", "wgzKo");
        lIllIIllllIl[lIllIIlllllI[2]] = lllIIllIIlIIll("FjQ9HGsBNDUcJz40JQ==", "RAVyK");
        lIllIIllllIl[lIllIIlllllI[3]] = lllIIllIIlIIll("LRIMJykH", "lfxFJ");
    }

    private static boolean lllIIllIIlIllI(int i) {
        return i == 0;
    }

    @Inject
    public C(SquireDukeSucellus squireDukeSucellus, C0000a c0000a) {
        this.bd = squireDukeSucellus;
        this.be = c0000a;
    }

    private static boolean lllIIllIIllIII(int i) {
        return i != 0;
    }

    static {
        lllIIllIIlIlIl();
        lllIIllIIlIlII();
    }

    private static boolean lllIIllIIllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (!lllIIllIIlIllI(Thralls.canUse() ? 1 : 0) && !lllIIllIIlIlll(NPCs.getNearest(npc -> {
            if (lllIIllIIllIII(npc.getName().equals(lIllIIllllIl[lIllIIlllllI[2]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIIlllllI[1]];
                strArr[lIllIIlllllI[0]] = lIllIIllllIl[lIllIIlllllI[3]];
                if (lllIIllIIllIII(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIlllllI[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIIlllllI[0];
        }))) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lllIIllIIllIII(tileObject.getName().equals(lIllIIllllIl[lIllIIlllllI[0]]) ? 1 : 0)) {
                    String[] strArr = new String[lIllIIlllllI[1]];
                    strArr[lIllIIlllllI[0]] = lIllIIllllIl[lIllIIlllllI[1]];
                    if (lllIIllIIllIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIllIIlllllI[1];
                        "".length();
                        return (((103 ^ 57) ^ (86 ^ 42)) & (((216 ^ 193) ^ (43 ^ 16)) ^ (-" ".length()))) > ((((242 ^ 175) & ((102 ^ 59) ^ (-1))) ^ (158 ^ 196)) & (((118 ^ 56) ^ (0 ^ 20)) ^ (-" ".length()))) ? ((((11 + 53) - (-20)) + 96) ^ (((35 + 87) - 24) + 64)) & (((190 ^ 154) ^ (165 ^ 151)) ^ (-" ".length())) : r0;
                    }
                }
                return lIllIIlllllI[0];
            });
            if (lllIIllIIlIlll(nearest)) {
                return lIllIIlllllI[0];
            }
            Player local = Players.getLocal();
            return lllIIllIIlIlll(local) ? lIllIIlllllI[0] : (lllIIllIIlIllI(C0004e.l(nearest).contains(local) ? 1 : 0) && lllIIllIIlIllI(C0004e.q(nearest) ? 1 : 0) && lllIIllIIlIllI(C0004e.r(nearest) ? 1 : 0)) ? lIllIIlllllI[0] : Thralls.useBestThrall();
        }
        return lIllIIlllllI[0];
    }

    private static String lllIIllIIlIIlI(String lllllllllllllllIllIIIIIIIlllllll, String lllllllllllllllIllIIIIIIIllllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIIllllllI.getBytes(StandardCharsets.UTF_8)), lIllIIlllllI[5]), "DES");
            Cipher lllllllllllllllIllIIIIIIlIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIIlIIIIIIl.init(lIllIIlllllI[2], secretKeySpec);
            return new String(lllllllllllllllIllIIIIIIlIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIIlIIIIIII) {
            lllllllllllllllIllIIIIIIlIIIIIII.printStackTrace();
            return null;
        }
    }

    private static void lllIIllIIlIlIl() {
        lIllIIlllllI = new int[6];
        lIllIIlllllI[0] = (131 ^ 146) & ((145 ^ 128) ^ (-1));
        lIllIIlllllI[1] = " ".length();
        lIllIIlllllI[2] = "  ".length();
        lIllIIlllllI[3] = "   ".length();
        lIllIIlllllI[4] = 9 ^ 13;
        lIllIIlllllI[5] = (29 ^ 106) ^ (((85 + 31) - (-5)) + 6);
    }

    private static boolean lllIIllIIlIlll(Object obj) {
        return obj == null;
    }
}
