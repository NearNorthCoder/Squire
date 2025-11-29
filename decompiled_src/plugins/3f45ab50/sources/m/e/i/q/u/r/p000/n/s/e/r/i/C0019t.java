package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Restocking")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/t.class */
public class C0019t extends Task {
    private static /* synthetic */ int[] lllllIIllllI;
    private static /* synthetic */ String[] lllllIIlllIl;
    private final /* synthetic */ SquireMinerConfig D;

    private static boolean lIIlIIllIIIIlll(Object obj) {
        return obj != null;
    }

    static {
        lIIlIIllIIIIIIl();
        lIIlIIllIIIIIII();
    }

    @Inject
    public C0019t(SquireMinerConfig squireMinerConfig) {
        this.D = squireMinerConfig;
    }

    private static boolean lIIlIIllIIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIllIIIIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    public boolean run() {
        if (lIIlIIllIIIIIlI(this.D.activity(), EnumC0000a.GRANITE)) {
            return lllllIIllllI[0];
        }
        int[] iArr = new int[lllllIIllllI[1]];
        iArr[lllllIIllllI[0]] = lllllIIllllI[2];
        iArr[lllllIIllllI[3]] = lllllIIllllI[4];
        iArr[lllllIIllllI[5]] = lllllIIllllI[6];
        iArr[lllllIIllllI[7]] = lllllIIllllI[8];
        if (lIIlIIllIIIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return lllllIIllllI[0];
        }
        int[] iArr2 = new int[lllllIIllllI[3]];
        iArr2[lllllIIllllI[0]] = lllllIIllllI[2];
        if (lIIlIIllIIIIlII(Inventory.getCount(iArr2), lllllIIllllI[9])) {
            int[] iArr3 = new int[lllllIIllllI[3]];
            iArr3[lllllIIllllI[0]] = lllllIIllllI[2];
            Inventory.getFirst(iArr3).interact(lllllIIlllIl[lllllIIllllI[0]]);
            return lllllIIllllI[0];
        }
        int[] iArr4 = new int[lllllIIllllI[3]];
        iArr4[lllllIIllllI[0]] = lllllIIllllI[10];
        NPC nearest = NPCs.getNearest(iArr4);
        if (lIIlIIllIIIIIll(Shop.isOpen() ? 1 : 0)) {
            if (lIIlIIllIIIIlIl(Shop.getStock(lllllIIllllI[2]), lllllIIllllI[9])) {
                Shop.sellFive(lllllIIllllI[11]);
                return lllllIIllllI[0];
            } else if (lIIlIIllIIIIllI(Shop.getStock(lllllIIllllI[2]), lllllIIllllI[9])) {
                Shop.buyFifty(lllllIIllllI[2]);
                return lllllIIllllI[0];
            }
        }
        if (lIIlIIllIIIIlll(nearest) && lIIlIIllIIIIIll(Reachable.isInteractable(nearest) ? 1 : 0) && lIIlIIllIIIlIII(Shop.isOpen() ? 1 : 0)) {
            nearest.interact(lllllIIlllIl[lllllIIllllI[3]]);
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : lllllIIllllI[3];
        }
        int[] iArr5 = new int[lllllIIllllI[3]];
        iArr5[lllllIIllllI[0]] = lllllIIllllI[12];
        if (!lIIlIIllIIIIIll(Inventory.contains(iArr5) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(lllllIIllllI[13], lllllIIllllI[14], lllllIIllllI[0]));
            "".length();
            return lllllIIllllI[3];
        }
        int[] iArr6 = new int[lllllIIllllI[3]];
        iArr6[lllllIIllllI[0]] = lllllIIllllI[12];
        Inventory.getFirst(iArr6).interact(lllllIIlllIl[lllllIIllllI[5]]);
        return lllllIIllllI[3];
    }

    private static String lIIlIIlIlllllll(String lllllllllllllllIIlIIlIllIIllllII, String lllllllllllllllIIlIIlIllIIllIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllIIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIlIllIIlllIIl = lllllllllllllllIIlIIlIllIIllIllI.toCharArray();
        int lllllllllllllllIIlIIlIllIIlllIII = lllllIIllllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllllIIllllI[0];
        while (lIIlIIllIIIIlIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIlIIlIllIIlllIIl[lllllllllllllllIIlIIlIllIIlllIII % lllllllllllllllIIlIIlIllIIlllIIl.length]));
            "".length();
            lllllllllllllllIIlIIlIllIIlllIII++;
            i++;
            "".length();
            if ((63 ^ 58) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIlIIlIllllllI(String lllllllllllllllIIlIIlIllIlIIllII, String lllllllllllllllIIlIIlIllIlIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIllIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIIllllI[5], lllllllllllllllIIlIIlIllIlIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIllIlIIllIl) {
            lllllllllllllllIIlIIlIllIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllIIIIllI(int i, int i2) {
        return i >= i2;
    }

    private static void lIIlIIllIIIIIII() {
        lllllIIlllIl = new String[lllllIIllllI[7]];
        lllllIIlllIl[lllllIIllllI[0]] = lIIlIIlIllllllI("xUBHJ4CynH0=", "duCxJ");
        lllllIIlllIl[lllllIIllllI[3]] = lIIlIIlIlllllll("GRUyBRc=", "MgSar");
        lllllIIlllIl[lllllIIllllI[5]] = lIIlIIlIllllllI("sE+YqPO7wBw=", "cDiNn");
    }

    private static void lIIlIIllIIIIIIl() {
        lllllIIllllI = new int[15];
        lllllIIllllI[0] = ((188 ^ 169) ^ (185 ^ 182)) & (((((56 + 46) - (-54)) + 34) ^ (((91 + 23) - 112) + 162)) ^ (-" ".length()));
        lllllIIllllI[1] = 10 ^ 14;
        lllllIIllllI[2] = (-28705) & 30527;
        lllllIIllllI[3] = " ".length();
        lllllIIllllI[4] = (-14351) & 16175;
        lllllIIllllI[5] = "  ".length();
        lllllIIllllI[6] = (-20609) & 22435;
        lllllIIllllI[7] = "   ".length();
        lllllIIllllI[8] = (-16539) & 18367;
        lllllIIllllI[9] = (((36 + 181) - 57) + 53) ^ (((170 + 166) - 168) + 25);
        lllllIIllllI[10] = (-16385) & 18217;
        lllllIIllllI[11] = (-((-16497) & 28792)) & (-16585) & 30703;
        lllllIIllllI[12] = (-((-18211) & 32675)) & (-16473) & 32767;
        lllllIIllllI[13] = (-20616) & 23791;
        lllllIIllllI[14] = (-((-11139) & 28611)) & (-17) & 20475;
    }

    private static boolean lIIlIIllIIIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIllIIIlIII(int i) {
        return i == 0;
    }

    private static boolean lIIlIIllIIIIlII(int i, int i2) {
        return i > i2;
    }
}
