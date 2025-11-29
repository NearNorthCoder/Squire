package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Filling the bellows")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bd  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bd.class */
public class C0031bd extends Task {
    private /* synthetic */ boolean fo;
    private static /* synthetic */ String[] lIllIIIII;
    private static /* synthetic */ int[] lIllIIIIl;

    private static String lIIllIlIllI(String lIllllIlllIIIll, String lIllllIlllIIIlI) {
        try {
            SecretKeySpec lIllllIlllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIlllIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIIIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIIl[1], lIllllIlllIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIlllIIllI) {
            lIllllIlllIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIllIllIII() {
        lIllIIIII = new String[lIllIIIIl[1]];
        lIllIIIII[lIllIIIIl[0]] = lIIllIlIllI("0jb6Wbh/Pic=", "JJPtN");
        lIllIIIII[lIllIIIIl[2]] = lIIllIlIlll("h/EBFQn7ekQ=", "WSwfu");
    }

    static {
        lIIllIllIIl();
        lIIllIllIII();
    }

    private static boolean lIIllIllIlI(int i2) {
        return i2 == 0;
    }

    private static String lIIllIlIlll(String lIllllIllllIIlI, String lIllllIllllIIIl) {
        try {
            SecretKeySpec lIllllIllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllllIllllIlII = Cipher.getInstance("Blowfish");
            lIllllIllllIlII.init(lIllIIIIl[1], lIllllIllllIlIl);
            return new String(lIllllIllllIlII.doFinal(Base64.getDecoder().decode(lIllllIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIllllIIll) {
            lIllllIllllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlllII(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean run() {
        if (!lIIllIllIlI(Players.getLocal().isAnimating() ? 1 : 0) || lIIllIllIll(Players.getLocal().getInteracting())) {
            return lIllIIIIl[0];
        }
        if (!lIIllIllIlI(Movement.shouldWalk() ? 1 : 0) && !lIIllIlllII(ct() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                String[] strArr = new String[lIllIIIIl[2]];
                strArr[lIllIIIIl[0]] = lIllIIIII[lIllIIIIl[2]];
                return tileObject.hasAction(strArr);
            });
            if (lIIllIlllIl(nearest)) {
                return lIllIIIIl[0];
            }
            nearest.interact(lIllIIIII[lIllIIIIl[0]]);
            sleep(lIllIIIIl[1]);
            return lIllIIIIl[2];
        }
        return lIllIIIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean ct() {
        int[] iArr = new int[lIllIIIIl[2]];
        iArr[lIllIIIIl[0]] = lIllIIIIl[3];
        if (lIIllIllIlI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIllIIIIl[2]];
            iArr2[lIllIIIIl[0]] = lIllIIIIl[4];
            if (lIIllIllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIllIIIIl[2]];
                iArr3[lIllIIIIl[0]] = lIllIIIIl[5];
                if (!lIIllIlllII(Inventory.contains(iArr3) ? 1 : 0)) {
                    return lIllIIIIl[0];
                }
            }
        }
        ?? r0 = lIllIIIIl[2];
        "".length();
        return ((207 ^ 145) ^ (45 ^ 119)) < 0 ? ((48 ^ 54) ^ (0 ^ 25)) & (((((95 + 77) - 167) + 143) ^ (((133 + 26) - 34) + 14)) ^ (-" ".length())) : r0;
    }

    private static boolean lIIllIlllIl(Object obj) {
        return obj == null;
    }

    private static void lIIllIllIIl() {
        lIllIIIIl = new int[7];
        lIllIIIIl[0] = (111 ^ 42) & ((193 ^ 132) ^ (-1));
        lIllIIIIl[1] = "  ".length();
        lIllIIIIl[2] = " ".length();
        lIllIIIIl[3] = (-17474) & 20347;
        lIllIIIIl[4] = (-4167) & 7039;
        lIllIIIIl[5] = (-(((11 + 95) - (-17)) + 6)) & (-25670) & 28669;
        lIllIIIIl[6] = (205 ^ 159) ^ (37 ^ 127);
    }

    private static boolean lIIllIllIll(Object obj) {
        return obj != null;
    }
}
