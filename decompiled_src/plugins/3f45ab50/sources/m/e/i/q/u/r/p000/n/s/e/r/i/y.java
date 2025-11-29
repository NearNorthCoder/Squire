package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Doing ardy rocks", priority = 100, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.y  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/y.class */
public class y extends Task {
    private static /* synthetic */ int[] lllllllIIIll;
    private static /* synthetic */ String[] lllllllIIIlI;
    private final /* synthetic */ int[] O;
    @Inject
    private /* synthetic */ SquireMinerConfig f;

    private static boolean lIIlIlIlIIIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIlIlIlIIIIIll() {
        lllllllIIIll = new int[18];
        lllllllIIIll[0] = 8 ^ 12;
        lllllllIIIll[1] = "  ".length() & ("  ".length() ^ (-1));
        lllllllIIIll[2] = ((108 + 57) - 128) + 212;
        lllllllIIIll[3] = " ".length();
        lllllllIIIll[4] = ((211 + 110) - 156) + 86;
        lllllllIIIll[5] = "  ".length();
        lllllllIIIll[6] = (((18 ^ 33) + (((127 + 117) - 154) + 122)) - (((160 + 176) - 228) + 70)) + ((135 + 75) - 99) + 57;
        lllllllIIIll[7] = "   ".length();
        lllllllIIIll[8] = ((22 + 142) - 32) + 123;
        lllllllIIIll[9] = (-24129) & 24568;
        lllllllIIIll[10] = (-20553) & 22491;
        lllllllIIIll[11] = (-15365) & 16310;
        lllllllIIIll[12] = (-9217) & 15548;
        lllllllIIIll[13] = (-((-10513) & 28499)) & (-257) & 24575;
        lllllllIIIll[14] = ((24 + 115) - 81) + 175;
        lllllllIIIll[15] = (-((-24669) & 29149)) & (-3) & 15846;
        lllllllIIIll[16] = (-((-1061) & 5943)) & (-9) & 16255;
        lllllllIIIll[17] = (-((-10391) & 30911)) & (-9281) & 32511;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        if (lIIlIlIlIIIIlII(this.f.activity(), EnumC0000a.ARDY_IRON)) {
            return lllllllIIIll[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIlIlIlIIIIllI(List.of(Integer.valueOf(lllllllIIIll[15]), Integer.valueOf(lllllllIIIll[16])).contains(Integer.valueOf(tileObject.getId())) ? 1 : 0) && lIIlIlIlIIIIlll(tileObject.getWorldX(), lllllllIIIll[17])) {
                ?? r0 = lllllllIIIll[3];
                "".length();
                return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllllllIIIll[1];
        });
        if (lIIlIlIlIIIIlIl(nearest)) {
            return lllllllIIIll[1];
        }
        if (lIIlIlIlIIIIllI(Players.getLocal().getWorldLocation().toWorldArea().isInMeleeDistance(nearest.getWorldLocation()) ? 1 : 0)) {
            nearest.interact(lllllllIIIlI[lllllllIIIll[1]]);
            return lllllllIIIll[3];
        }
        int[] iArr = new int[lllllllIIIll[3]];
        iArr[lllllllIIIll[1]] = lllllllIIIll[9];
        int count = Inventory.getCount(iArr);
        if (lIIlIlIlIIIIlll(count, lllllllIIIll[3])) {
            int[] iArr2 = new int[lllllllIIIll[3]];
            iArr2[lllllllIIIll[1]] = lllllllIIIll[9];
            Inventory.getAll(iArr2).subList(lllllllIIIll[1], Math.min(lllllllIIIll[7], count)).forEach((v0) -> {
                v0.drop();
            });
        }
        if (lIIlIlIlIIIIllI(n() ? 1 : 0)) {
            r();
        }
        nearest.interact(lllllllIIIlI[lllllllIIIll[3]]);
        sleep(lllllllIIIll[3]);
        return lllllllIIIll[3];
    }

    private static boolean lIIlIlIlIIIIlll(int i, int i2) {
        return i > i2;
    }

    static {
        lIIlIlIlIIIIIll();
        lIIlIlIlIIIIIlI();
    }

    public y() {
        int[] iArr = new int[lllllllIIIll[0]];
        iArr[lllllllIIIll[1]] = lllllllIIIll[2];
        iArr[lllllllIIIll[3]] = lllllllIIIll[4];
        iArr[lllllllIIIll[5]] = lllllllIIIll[6];
        iArr[lllllllIIIll[7]] = lllllllIIIll[8];
        this.O = iArr;
    }

    private static boolean lIIlIlIlIIIlIII(int i) {
        return i == 0;
    }

    private void r() {
        if (lIIlIlIlIIIIllI(Inventory.contains(this.O) ? 1 : 0)) {
            Item first = Inventory.getFirst(this.O);
            int[] iArr = new int[lllllllIIIll[3]];
            iArr[lllllllIIIll[1]] = lllllllIIIll[10];
            first.useOn(Inventory.getFirst(iArr));
            "".length();
            if ((true ^ true) && ((true ^ true) ^ true)) {
                return;
            }
            return;
        }
        int[] iArr2 = new int[lllllllIIIll[3]];
        iArr2[lllllllIIIll[1]] = lllllllIIIll[11];
        Item first2 = Inventory.getFirst(iArr2);
        int[] iArr3 = new int[lllllllIIIll[5]];
        iArr3[lllllllIIIll[1]] = lllllllIIIll[12];
        iArr3[lllllllIIIll[3]] = lllllllIIIll[13];
        first2.useOn(Inventory.getFirst(iArr3));
    }

    private static boolean lIIlIlIlIIIIlIl(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIlIIIIIII(String lllllllllllllllIIlIIIlIlIlIlIlll, String lllllllllllllllIIlIIIlIlIlIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIlIlIlIlIllI.toCharArray();
        int lllllllllllllllIIlIIIlIlIlIlIIll = lllllllIIIll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIlIIIlIlIlIIlIll = lllllllIIIll[1];
        while (lIIlIlIlIIIlIIl(lllllllllllllllIIlIIIlIlIlIIlIll, length)) {
            char lllllllllllllllIIlIIIlIlIlIllIII = charArray2[lllllllllllllllIIlIIIlIlIlIIlIll];
            sb.append((char) (lllllllllllllllIIlIIIlIlIlIllIII ^ charArray[lllllllllllllllIIlIIIlIlIlIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIlIlIlIlIIll++;
            lllllllllllllllIIlIIIlIlIlIIlIll++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIlIlIIIlIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
        if (lIIlIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (lIIlIlIlIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean n() {
        if (lIIlIlIlIIIIllI(Inventory.contains(this.O) ? 1 : 0)) {
            int[] iArr = new int[lllllllIIIll[3]];
            iArr[lllllllIIIll[1]] = lllllllIIIll[10];
            if (lIIlIlIlIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllllIIIll[3]];
                iArr2[lllllllIIIll[1]] = lllllllIIIll[14];
            }
        }
        int[] iArr3 = new int[lllllllIIIll[3]];
        iArr3[lllllllIIIll[1]] = lllllllIIIll[11];
        if (lIIlIlIlIIIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lllllllIIIll[3]];
            iArr4[lllllllIIIll[1]] = lllllllIIIll[13];
            if (lIIlIlIlIIIlIII(Inventory.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lllllllIIIll[3]];
                iArr5[lllllllIIIll[1]] = lllllllIIIll[12];
            }
            ?? r0 = lllllllIIIll[3];
            "".length();
            return 0 != 0 ? ((111 ^ 79) ^ (13 ^ 55)) & (((((142 + 162) - 142) + 29) ^ (((26 + 21) - 24) + 142)) ^ (-" ".length())) : r0;
        }
        return lllllllIIIll[1];
    }

    private static boolean lIIlIlIlIIIIllI(int i) {
        return i != 0;
    }

    private static void lIIlIlIlIIIIIlI() {
        lllllllIIIlI = new String[lllllllIIIll[5]];
        lllllllIIIlI[lllllllIIIll[1]] = lIIlIlIlIIIIIII("IBs4NQ==", "mrVPV");
        lllllllIIIlI[lllllllIIIll[3]] = lIIlIlIlIIIIIIl("psAYMZe/Xmk=", "eaxcV");
    }

    private static String lIIlIlIlIIIIIIl(String lllllllllllllllIIlIIIlIlIllIIlll, String lllllllllllllllIIlIIIlIlIllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIlIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIlIllIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIlIllIlIIl.init(lllllllIIIll[5], secretKeySpec);
            return new String(lllllllllllllllIIlIIIlIlIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIlIllIlIII) {
            lllllllllllllllIIlIIIlIlIllIlIII.printStackTrace();
            return null;
        }
    }
}
