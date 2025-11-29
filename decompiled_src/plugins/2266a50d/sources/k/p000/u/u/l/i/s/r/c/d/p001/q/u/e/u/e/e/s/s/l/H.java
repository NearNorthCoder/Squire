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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Start Fight", priority = 201, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.H  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/H.class */
public class H extends Task {
    private static /* synthetic */ int[] lIllIllllIII;
    final /* synthetic */ C0000a bo;
    private static /* synthetic */ String[] lIllIlllIIIl;
    final /* synthetic */ SquireDukeSucellus bn;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    public boolean run() {
        if (lllIlIIlllllll(this.bo.y(), lIllIllllIII[0])) {
            return lIllIllllIII[1];
        }
        Player local = Players.getLocal();
        if (lllIlIlIIIIIII(local)) {
            return lIllIllllIII[1];
        }
        String[] strArr = new String[lIllIllllIII[2]];
        strArr[lIllIllllIII[1]] = lIllIlllIIIl[lIllIllllIII[1]];
        if (lllIlIlIIIIIIl(Inventory.getCount(strArr), lIllIllllIII[0])) {
            return lIllIllllIII[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIlIIIIIlI(tileObject.getName().equals(lIllIlllIIIl[lIllIllllIII[2]]) ? 1 : 0)) {
                String[] strArr2 = new String[lIllIllllIII[2]];
                strArr2[lIllIllllIII[1]] = lIllIlllIIIl[lIllIllllIII[0]];
                if (lllIlIlIIIIIlI(tileObject.hasAction(strArr2) ? 1 : 0)) {
                    ?? r0 = lIllIllllIII[2];
                    "".length();
                    return " ".length() < 0 ? ((250 ^ 137) ^ (223 ^ 170)) & (((6 ^ 30) ^ (83 ^ 77)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIllllIII[1];
        });
        if (!lllIlIlIIIIIII(nearest) && !lllIlIlIIIIIlI(C0004e.l(nearest).contains(local) ? 1 : 0)) {
            if (lllIlIlIIIIIll(NPCs.getNearest(npc -> {
                if (lllIlIlIIIIlII(npc.getId(), C0004e.I) && lllIlIlIIIIIIl(npc.getGraphic(), lIllIllllIII[3])) {
                    ?? r0 = lIllIllllIII[2];
                    "".length();
                    return (((3 ^ 127) ^ (51 ^ 68)) & (((((38 + 60) - 89) + 140) ^ (((37 + 11) - 43) + 153)) ^ (-" ".length()))) < (-" ".length()) ? ((184 ^ 173) ^ (110 ^ 48)) & (("   ".length() ^ (86 ^ 30)) ^ (-" ".length())) : r0;
                }
                return lIllIllllIII[1];
            }))) {
                return lIllIllllIII[2];
            }
            Movement.setDestination(C0004e.g(nearest));
            return lIllIllllIII[2];
        }
        return lIllIllllIII[1];
    }

    private static void lllIlIIllIlIll() {
        lIllIlllIIIl = new String[lIllIllllIII[4]];
        lIllIlllIIIl[lIllIllllIII[1]] = lllIlIIllIlIII("gCn2xHE9JcVx3EXGl5hzXN8HQk7HhmGa", "SKuak");
        lIllIlllIIIl[lIllIllllIII[2]] = lllIlIIllIlIIl("ISYDAg==", "fGwgH");
        lIllIlllIIIl[lIllIllllIII[0]] = lllIlIIllIlIlI("Oi02o88sl4y0nBBTU/Unng==", "eAkmU");
    }

    private static boolean lllIlIlIIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIlllllll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlIlIIIIlII(int i, int i2) {
        return i == i2;
    }

    private static String lllIlIIllIlIII(String lllllllllllllllIlIlllIlIIIIIlIlI, String lllllllllllllllIlIlllIlIIIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllllIII[0], lllllllllllllllIlIlllIlIIIIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIIIIIlIll) {
            lllllllllllllllIlIlllIlIIIIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public H(SquireDukeSucellus squireDukeSucellus) {
        this.bn = squireDukeSucellus;
        this.bo = squireDukeSucellus.s();
    }

    private static String lllIlIIllIlIlI(String lllllllllllllllIlIlllIlIIIlIllll, String lllllllllllllllIlIlllIlIIIlIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIIlIlllI.getBytes(StandardCharsets.UTF_8)), lIllIllllIII[5]), "DES");
            Cipher lllllllllllllllIlIlllIlIIIllIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlIIIllIIIl.init(lIllIllllIII[0], secretKeySpec);
            return new String(lllllllllllllllIlIlllIlIIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIIIllIIII) {
            lllllllllllllllIlIlllIlIIIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIIIIIll(Object obj) {
        return obj != null;
    }

    static {
        lllIlIIllllllI();
        lllIlIIllIlIll();
    }

    private static void lllIlIIllllllI() {
        lIllIllllIII = new int[6];
        lIllIllllIII[0] = "  ".length();
        lIllIllllIII[1] = (211 ^ 179) & ((53 ^ 85) ^ (-1));
        lIllIllllIII[2] = " ".length();
        lIllIllllIII[3] = -" ".length();
        lIllIllllIII[4] = "   ".length();
        lIllIllllIII[5] = (127 ^ 34) ^ (44 ^ 121);
    }

    private static boolean lllIlIlIIIIIIl(int i, int i2) {
        return i != i2;
    }

    private static String lllIlIIllIlIIl(String lllllllllllllllIlIlllIlIIIIlllll, String lllllllllllllllIlIlllIlIIIIllllI) {
        String lllllllllllllllIlIlllIlIIIIlllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlIIIIlllIl = new StringBuilder();
        char[] lllllllllllllllIlIlllIlIIIIlllII = lllllllllllllllIlIlllIlIIIIllllI.toCharArray();
        int lllllllllllllllIlIlllIlIIIIllIll = lIllIllllIII[1];
        char[] charArray = lllllllllllllllIlIlllIlIIIIlllll2.toCharArray();
        int length = charArray.length;
        int i = lIllIllllIII[1];
        while (lllIlIIlllllll(i, length)) {
            lllllllllllllllIlIlllIlIIIIlllIl.append((char) (charArray[i] ^ lllllllllllllllIlIlllIlIIIIlllII[lllllllllllllllIlIlllIlIIIIllIll % lllllllllllllllIlIlllIlIIIIlllII.length]));
            "".length();
            lllllllllllllllIlIlllIlIIIIllIll++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIlIIIIlllIl);
    }

    private static boolean lllIlIlIIIIIlI(int i) {
        return i != 0;
    }
}
