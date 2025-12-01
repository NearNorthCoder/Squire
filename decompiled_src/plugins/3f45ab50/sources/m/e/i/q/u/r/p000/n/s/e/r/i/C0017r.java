package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Doing gem rocks", priority = 100, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/r.class */
public class C0017r extends Task {
    private static /* synthetic */ int[] llllllIlIlII;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ String[] llllllIlIIll;
    private final /* synthetic */ int[] w;

    private static String lIIlIlIIlIIlIII(String lllllllllllllllIIlIIIllIIlllIlIl, String lllllllllllllllIIlIIIllIIlllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIlIlII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIllIIlllIllI) {
            lllllllllllllllIIlIIIllIIlllIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
        if (lIIlIlIIlIIllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (lIIlIlIIlIIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean n() {
        if (lIIlIlIIlIIllII(Inventory.contains(this.w) ? 1 : 0)) {
            int[] iArr = new int[llllllIlIlII[3]];
            iArr[llllllIlIlII[1]] = llllllIlIlII[9];
            if (lIIlIlIIlIIllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllllIlIlII[3]];
                iArr2[llllllIlIlII[1]] = llllllIlIlII[13];
            }
        }
        int[] iArr3 = new int[llllllIlIlII[3]];
        iArr3[llllllIlIlII[1]] = llllllIlIlII[10];
        if (lIIlIlIIlIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[llllllIlIlII[3]];
            iArr4[llllllIlIlII[1]] = llllllIlIlII[12];
            if (lIIlIlIIlIIlllI(Inventory.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llllllIlIlII[3]];
                iArr5[llllllIlIlII[1]] = llllllIlIlII[11];
            }
            ?? r0 = llllllIlIlII[3];
            "".length();
            return (-(176 ^ 180)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllllIlIlII[1];
    }

    private static boolean lIIlIlIIlIIllIl(Object obj) {
        return obj == null;
    }

    private static void lIIlIlIIlIIlIlI() {
        llllllIlIlII = new int[16];
        llllllIlIlII[0] = 10 ^ 14;
        llllllIlIlII[1] = ("   ".length() ^ (2 ^ 9)) & (((((93 + 128) - 171) + 105) ^ (((139 + 41) - 93) + 60)) ^ (-" ".length()));
        llllllIlIlII[2] = ((223 + 121) - 101) + 6;
        llllllIlIlII[3] = " ".length();
        llllllIlIlII[4] = ((121 + 66) - 10) + 74;
        llllllIlIlII[5] = "  ".length();
        llllllIlIlII[6] = ((204 + 54) - 109) + 104;
        llllllIlIlII[7] = "   ".length();
        llllllIlIlII[8] = ((32 + 184) - 43) + 82;
        llllllIlIlII[9] = (-((-18327) & 32767)) & (-5) & 16383;
        llllllIlIlII[10] = (-15361) & 16306;
        llllllIlIlII[11] = (-"  ".length()) & (-17475) & 23807;
        llllllIlIlII[12] = (-((-6829) & 8175)) & (-8705) & 16383;
        llllllIlIlII[13] = (((147 ^ 139) + (((66 + 190) - 140) + 104)) - (((101 + 144) - 171) + 76)) + ((113 + 86) - 145) + 85;
        llllllIlIlII[14] = (-((-9009) & 29628)) & (-257) & 32255;
        llllllIlIlII[15] = (-28865) & 31699;
    }

    static {
        lIIlIlIIlIIlIlI();
        lIIlIlIIlIIlIIl();
    }

    private static boolean lIIlIlIIlIIllII(int i) {
        return i != 0;
    }

    private void r() {
        if (lIIlIlIIlIIllII(Inventory.contains(this.w) ? 1 : 0)) {
            Item first = Inventory.getFirst(this.w);
            int[] iArr = new int[llllllIlIlII[3]];
            iArr[llllllIlIlII[1]] = llllllIlIlII[9];
            first.useOn(Inventory.getFirst(iArr));
            "".length();
            if (((211 ^ 164) ^ (71 ^ 52)) < "   ".length()) {
                return;
            }
            return;
        }
        int[] iArr2 = new int[llllllIlIlII[3]];
        iArr2[llllllIlIlII[1]] = llllllIlIlII[10];
        Item first2 = Inventory.getFirst(iArr2);
        int[] iArr3 = new int[llllllIlIlII[5]];
        iArr3[llllllIlIlII[1]] = llllllIlIlII[11];
        iArr3[llllllIlIlII[3]] = llllllIlIlII[12];
        first2.useOn(Inventory.getFirst(iArr3));
    }

    private static void lIIlIlIIlIIlIIl() {
        llllllIlIIll = new String[llllllIlIlII[5]];
        llllllIlIIll[llllllIlIlII[1]] = lIIlIlIIlIIIlll("PSIGMw==", "pKhVQ");
        llllllIlIIll[llllllIlIlII[3]] = lIIlIlIIlIIlIII("ID8DdQ6wARY=", "uMLLG");
    }

    private static boolean lIIlIlIIlIIllll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIIlIIlIll(this.f.activity(), EnumC0000a.GEM_ROCKS) && !lIIlIlIIlIIllII(Inventory.isFull() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIlIlIIlIIllll(tileObject.getId(), llllllIlIlII[14]) && lIIlIlIIlIlIIII(tileObject.getWorldX(), llllllIlIlII[15])) {
                    ?? r0 = llllllIlIlII[3];
                    "".length();
                    return "   ".length() <= "  ".length() ? ((110 ^ 37) ^ (3 ^ 119)) & (((51 ^ 83) ^ (7 ^ 88)) ^ (-" ".length())) : r0;
                }
                return llllllIlIlII[1];
            });
            if (lIIlIlIIlIIllIl(nearest)) {
                return llllllIlIlII[1];
            }
            if (lIIlIlIIlIIllII(Players.getLocal().getWorldLocation().toWorldArea().isInMeleeDistance(nearest.getWorldLocation()) ? 1 : 0)) {
                nearest.interact(llllllIlIIll[llllllIlIlII[1]]);
                return llllllIlIlII[3];
            }
            if (lIIlIlIIlIIllII(n() ? 1 : 0)) {
                r();
            }
            nearest.interact(llllllIlIIll[llllllIlIlII[3]]);
            sleep(llllllIlIlII[3]);
            return llllllIlIlII[3];
        }
        return llllllIlIlII[1];
    }

    private static boolean lIIlIlIIlIlIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlIIlIIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlIIlIlIIIl(int i, int i2) {
        return i < i2;
    }

    public C0017r() {
        int[] iArr = new int[llllllIlIlII[0]];
        iArr[llllllIlIlII[1]] = llllllIlIlII[2];
        iArr[llllllIlIlII[3]] = llllllIlIlII[4];
        iArr[llllllIlIlII[5]] = llllllIlIlII[6];
        iArr[llllllIlIlII[7]] = llllllIlIlII[8];
        this.w = iArr;
    }

    private static boolean lIIlIlIIlIIlllI(int i) {
        return i == 0;
    }

    private static String lIIlIlIIlIIIlll(String lllllllllllllllIIlIIIllIlIIIlIlI, String lllllllllllllllIIlIIIllIlIIIlIIl) {
        String lllllllllllllllIIlIIIllIlIIIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIIllIlIIIIlll = lllllllllllllllIIlIIIllIlIIIlIIl.toCharArray();
        int lllllllllllllllIIlIIIllIlIIIIllI = llllllIlIlII[1];
        char[] charArray = lllllllllllllllIIlIIIllIlIIIlIlI2.toCharArray();
        int length = charArray.length;
        int i = llllllIlIlII[1];
        while (lIIlIlIIlIlIIIl(i, length)) {
            char lllllllllllllllIIlIIIllIlIIIlIll = charArray[i];
            sb.append((char) (lllllllllllllllIIlIIIllIlIIIlIll ^ lllllllllllllllIIlIIIllIlIIIIlll[lllllllllllllllIIlIIIllIlIIIIllI % lllllllllllllllIIlIIIllIlIIIIlll.length]));
            "".length();
            lllllllllllllllIIlIIIllIlIIIIllI++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
