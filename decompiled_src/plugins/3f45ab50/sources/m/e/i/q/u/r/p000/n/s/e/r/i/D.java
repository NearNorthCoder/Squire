package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Repairing struts", priority = 25, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.D  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/D.class */
public class D extends C {
    private final /* synthetic */ WorldPoint aa;
    private final /* synthetic */ WorldPoint ab;
    private static /* synthetic */ int[] lllllIIlIllI;
    private static /* synthetic */ String[] lllllIIlIlIl;

    private static boolean lIIlIIlIllIlIII(Object obj) {
        return obj == null;
    }

    private static void lIIlIIlIllIIlII() {
        lllllIIlIllI = new int[13];
        lllllIIlIllI[0] = (-4434) & 8185;
        lllllIIlIllI[1] = (-215) & 5887;
        lllllIIlIllI[2] = (11 ^ 79) & ((20 ^ 80) ^ (-1));
        lllllIIlIllI[3] = (-97) & 3837;
        lllllIIlIllI[4] = (-((-4707) & 7151)) & (-8193) & 16303;
        lllllIIlIllI[5] = " ".length();
        lllllIIlIllI[6] = "  ".length();
        lllllIIlIllI[7] = (-133) & 2479;
        lllllIIlIllI[8] = (-1) & 12011;
        lllllIIlIllI[9] = "   ".length();
        lllllIIlIllI[10] = 84 ^ 92;
        lllllIIlIllI[11] = " ".length() ^ (199 ^ 194);
        lllllIIlIllI[12] = (107 ^ 59) ^ (108 ^ 57);
    }

    static {
        lIIlIIlIllIIlII();
        lIIlIIlIllIIIll();
    }

    @Inject
    public D(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t) {
        super(squireMinerConfig, squireMiner, t);
        this.aa = new WorldPoint(lllllIIlIllI[0], lllllIIlIllI[1], lllllIIlIllI[2]);
        this.ab = new WorldPoint(lllllIIlIllI[3], lllllIIlIllI[4], lllllIIlIllI[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.C
    public boolean t() {
        if (!lIIlIIlIllIIlIl(this.Z.M()) && !lIIlIIlIllIIlIl(this.Z.J() ? 1 : 0)) {
            String[] strArr = new String[lllllIIlIllI[5]];
            strArr[lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[2]];
            if (!lIIlIIlIllIIllI(TileObjects.getAll(strArr).size(), lllllIIlIllI[6]) && !lIIlIIlIllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
                Player local = Players.getLocal();
                int[] iArr = new int[lllllIIlIllI[5]];
                iArr[lllllIIlIllI[2]] = lllllIIlIllI[7];
                if (!lIIlIIlIllIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllllIIlIllI[5]];
                    strArr2[lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[9]];
                    TileObject nearest = TileObjects.getNearest(strArr2);
                    if (lIIlIIlIllIlIII(nearest)) {
                        return lllllIIlIllI[2];
                    }
                    if (!lIIlIIlIllIlIIl(nearest.distanceTo(local), lllllIIlIllI[10])) {
                        nearest.interact(lllllIIlIlIl[lllllIIlIllI[11]]);
                        return lllllIIlIllI[5];
                    }
                    Movement.walkTo(this.ab);
                    "".length();
                    return lllllIIlIllI[5];
                }
                if (lIIlIIlIllIIlll(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr2 = new int[lllllIIlIllI[5]];
                    iArr2[lllllIIlIllI[2]] = lllllIIlIllI[8];
                    if (lIIlIIlIllIIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lllllIIlIllI[5]];
                        iArr3[lllllIIlIllI[2]] = lllllIIlIllI[8];
                        Inventory.getFirst(iArr3).drop();
                        return lllllIIlIllI[5];
                    }
                }
                WorldPoint worldPoint = this.aa;
                String[] strArr3 = new String[lllllIIlIllI[5]];
                strArr3[lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[5]];
                TileObject nearest2 = TileObjects.getNearest(worldPoint, strArr3);
                if (lIIlIIlIllIlIII(nearest2)) {
                    return lllllIIlIllI[2];
                }
                if (!lIIlIIlIllIlIIl(nearest2.distanceTo(local), lllllIIlIllI[6])) {
                    nearest2.interact(lllllIIlIlIl[lllllIIlIllI[6]]);
                    return lllllIIlIllI[5];
                }
                Movement.walkTo(this.aa);
                "".length();
                return lllllIIlIllI[5];
            }
            return lllllIIlIllI[2];
        }
        return lllllIIlIllI[2];
    }

    private static boolean lIIlIIlIllIIlll(int i) {
        return i != 0;
    }

    private static boolean lIIlIIlIllIIllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIlIllIIIlI(String lllllllllllllllIIlIIlIllllIllIll, String lllllllllllllllIIlIIlIllllIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIllllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIllllIllIlI.getBytes(StandardCharsets.UTF_8)), lllllIIlIllI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIIlIllI[6], lllllllllllllllIIlIIlIllllIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIllllIlllII) {
            lllllllllllllllIIlIIlIllllIlllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlIllIIIll() {
        lllllIIlIlIl = new String[lllllIIlIllI[12]];
        lllllIIlIlIl[lllllIIlIllI[2]] = lIIlIIlIllIIIIl("KxgkBQQHSjgaExwe", "ijKna");
        lllllIIlIlIl[lllllIIlIllI[5]] = lIIlIIlIllIIIlI("/f3By3WFDok=", "mDljk");
        lllllIIlIlIl[lllllIIlIllI[6]] = lIIlIIlIllIIIIl("KzU5JgsQ", "xPXTh");
        lllllIIlIlIl[lllllIIlIllI[9]] = lIIlIIlIllIIIIl("EAENBg08UxEZGicH", "Rsbmh");
        lllllIIlIlIl[lllllIIlIllI[11]] = lIIlIIlIllIIIIl("CzgkOgox", "CYIWo");
    }

    private static boolean lIIlIIlIllIlIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIlIllIIlIl(int i) {
        return i == 0;
    }

    private static String lIIlIIlIllIIIIl(String lllllllllllllllIIlIIlIllllllIIII, String lllllllllllllllIIlIIlIlllllIllll) {
        String lllllllllllllllIIlIIlIllllllIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIlllllIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIIlIlllllIllIl = lllllllllllllllIIlIIlIlllllIllll.toCharArray();
        int lllllllllllllllIIlIIlIlllllIllII = lllllIIlIllI[2];
        char[] charArray = lllllllllllllllIIlIIlIllllllIIII2.toCharArray();
        int length = charArray.length;
        int i = lllllIIlIllI[2];
        while (lIIlIIlIllIIllI(i, length)) {
            lllllllllllllllIIlIIlIlllllIlllI.append((char) (charArray[i] ^ lllllllllllllllIIlIIlIlllllIllIl[lllllllllllllllIIlIIlIlllllIllII % lllllllllllllllIIlIIlIlllllIllIl.length]));
            "".length();
            lllllllllllllllIIlIIlIlllllIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIlIlllllIlllI);
    }
}
