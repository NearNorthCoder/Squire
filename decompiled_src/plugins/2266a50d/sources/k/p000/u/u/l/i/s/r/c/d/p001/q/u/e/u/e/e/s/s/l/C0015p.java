package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
@TaskDesc(name = "Pathing to Boss", priority = 2147483547, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/p.class */
public class C0015p extends AbstractC0013n {
    private final /* synthetic */ C0000a ar;
    private final /* synthetic */ SquireDukeSucellus aq;
    private final /* synthetic */ SquireDukeSucellusConfig as;
    private static /* synthetic */ int[] lIllIIllIIlI;
    private static final /* synthetic */ int ap;
    private static /* synthetic */ String[] lIllIIllIIIl;
    private /* synthetic */ WorldArea at = new WorldArea(new WorldPoint(lIllIIllIIlI[0], lIllIIllIIlI[1], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[3], lIllIIllIIlI[4], lIllIIllIIlI[2]));
    private /* synthetic */ WorldArea au = new WorldArea(new WorldPoint(lIllIIllIIlI[5], lIllIIllIIlI[6], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[7], lIllIIllIIlI[8], lIllIIllIIlI[2]));
    private /* synthetic */ WorldArea av = new WorldArea(new WorldPoint(lIllIIllIIlI[7], lIllIIllIIlI[9], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[10], lIllIIllIIlI[11], lIllIIllIIlI[2]));
    private /* synthetic */ WorldArea aw = new WorldArea(new WorldPoint(lIllIIllIIlI[12], lIllIIllIIlI[13], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[14], lIllIIllIIlI[15], lIllIIllIIlI[2]));
    private /* synthetic */ WorldArea ax = new WorldArea(new WorldPoint(lIllIIllIIlI[16], lIllIIllIIlI[17], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[18], lIllIIllIIlI[19], lIllIIllIIlI[2]));
    private /* synthetic */ WorldArea ay = new WorldArea(new WorldPoint(lIllIIllIIlI[20], lIllIIllIIlI[21], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[22], lIllIIllIIlI[23], lIllIIllIIlI[2]));
    private /* synthetic */ WorldPoint az = new WorldPoint(lIllIIllIIlI[24], lIllIIllIIlI[25], lIllIIllIIlI[2]);
    private /* synthetic */ WorldPoint aA = new WorldPoint(lIllIIllIIlI[24], lIllIIllIIlI[26], lIllIIllIIlI[2]);
    private /* synthetic */ WorldPoint aB = new WorldPoint(lIllIIllIIlI[27], lIllIIllIIlI[28], lIllIIllIIlI[2]);

    private static String lllIIlIlllIIIl(String lllllllllllllllIllIIIIIlIllIllll, String lllllllllllllllIllIIIIIlIllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIlIlllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlIllIlllI.getBytes(StandardCharsets.UTF_8)), lIllIIllIIlI[39]), "DES");
            Cipher lllllllllllllllIllIIIIIlIlllIIIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIlIlllIIIl.init(lIllIIllIIlI[31], lllllllllllllllIllIIIIIlIlllIIlI);
            return new String(lllllllllllllllIllIIIIIlIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIlIlllIIII) {
            lllllllllllllllIllIIIIIlIlllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlIllllIIl(int i, int i2) {
        return i < i2;
    }

    private static String lllIIlIlllIIII(String lllllllllllllllIllIIIIIlIlIlllll, String lllllllllllllllIllIIIIIlIlIllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIIIlIlIllllI.toCharArray();
        int lllllllllllllllIllIIIIIlIlIllIll = lIllIIllIIlI[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIllIIlI[2];
        while (lllIIlIllllIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIIIIlIlIllIll % charArray.length]));
            "".length();
            lllllllllllllllIllIIIIIlIlIllIll++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllIIlIlllIIlI() {
        lIllIIllIIIl = new String[lIllIIllIIlI[45]];
        lIllIIllIIIl[lIllIIllIIlI[2]] = lllIIlIllIllll("TUiPueVVb7s=", "IqEEx");
        lIllIIllIIIl[lIllIIllIIlI[29]] = lllIIlIllIllll("qGqzMqWxlJM=", "XWYkw");
        lIllIIllIIIl[lIllIIllIIlI[31]] = lllIIlIlllIIII("LRQOHgMBRgcQCAwD", "ofauf");
        lIllIIllIIIl[lIllIIllIIlI[32]] = lllIIlIlllIIIl("iI99FnqlVuzqrA9mHKjYYg==", "IMzRU");
        lIllIIllIIIl[lIllIIllIIlI[35]] = lllIIlIlllIIII("KBEqHw==", "gaOqZ");
        lIllIIllIIIl[lIllIIllIIlI[36]] = lllIIlIlllIIIl("Zo+OMe+aljT7EB2sDKBdmMWsSZwB9I/0/xVyl1+HLoI=", "HfKCm");
        lIllIIllIIIl[lIllIIllIIlI[37]] = lllIIlIlllIIIl("Vv9PvGzqNCg=", "cdSUj");
        lIllIIllIIIl[lIllIIllIIlI[38]] = lllIIlIlllIIII("AiAgPQ==", "EATXa");
        lIllIIllIIIl[lIllIIllIIlI[39]] = lllIIlIlllIIIl("BIrcooGcke4=", "moURe");
        lIllIIllIIIl[lIllIIllIIlI[41]] = lllIIlIlllIIIl("nVBiEc/1feZ1GPCjM3Ye1w==", "unlcU");
        lIllIIllIIIl[lIllIIllIIlI[43]] = lllIIlIlllIIIl("7S2GVqN0Spe2wLC2vLS2lQ==", "avRPb");
        lIllIIllIIIl[lIllIIllIIlI[44]] = lllIIlIllIllll("R0dFQSUIU5KcuU32poMB2Q==", "gSEpA");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    @Override // k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.AbstractC0013n
    public boolean R() {
        if (lllIIlIlllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0) && lllIIlIlllIlIl(House.isInside() ? 1 : 0)) {
            return lIllIIllIIlI[2];
        }
        if (lllIIlIlllIlII(this.aq.m() ? 1 : 0)) {
            this.aq.forceStop();
            return lIllIIllIIlI[29];
        }
        this.ar.t();
        Player local = Players.getLocal();
        if (lllIIlIlllIllI(local)) {
            return lIllIIllIIlI[2];
        }
        if (lllIIlIlllIlII(this.av.contains(local) ? 1 : 0)) {
            a(lIllIIllIIIl[lIllIIllIIlI[2]], lIllIIllIIIl[lIllIIllIIlI[29]], lIllIIllIIlI[30], local);
            return lIllIIllIIlI[29];
        } else if (lllIIlIlllIlII(this.au.contains(local) ? 1 : 0)) {
            a(lIllIIllIIIl[lIllIIllIIlI[31]], lIllIIllIIIl[lIllIIllIIlI[32]], lIllIIllIIlI[33], local);
            return lIllIIllIIlI[29];
        } else {
            WorldPoint worldPoint = this.aA;
            int[] iArr = new int[lIllIIllIIlI[29]];
            iArr[lIllIIllIIlI[2]] = lIllIIllIIlI[34];
            TileObject firstAt = TileObjects.getFirstAt(worldPoint, iArr);
            if (lllIIlIlllIlll(firstAt)) {
                firstAt.interact(lIllIIllIIIl[lIllIIllIIlI[35]]);
                return lIllIIllIIlI[29];
            } else if (lllIIlIlllIlII(this.ay.contains(local) ? 1 : 0)) {
                if (!lllIIlIlllIlII(Dialog.getName().contains(lIllIIllIIIl[lIllIIllIIlI[36]]) ? 1 : 0)) {
                    a(lIllIIllIIIl[lIllIIllIIlI[38]], lIllIIllIIIl[lIllIIllIIlI[39]], lIllIIllIIlI[40], local);
                    return lIllIIllIIlI[29];
                }
                String[] strArr = new String[lIllIIllIIlI[29]];
                strArr[lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[37]];
                Dialog.chooseOption(strArr);
                "".length();
                return lIllIIllIIlI[29];
            } else {
                if (lllIIlIlllIlIl(this.ax.contains(local) ? 1 : 0) && lllIIlIlllIlIl(this.ay.contains(local) ? 1 : 0)) {
                    String[] strArr2 = new String[lIllIIllIIlI[29]];
                    strArr2[lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[41]];
                    if (lllIIlIlllIlII(Inventory.contains(strArr2) ? 1 : 0) && lllIIlIllllIII(Vars.getBit(lIllIIllIIlI[42]), lIllIIllIIlI[29])) {
                        if (lllIIlIlllIlII(Dialog.isOpen() ? 1 : 0) && lllIIlIlllIlII(Dialog.isViewingOptions() ? 1 : 0)) {
                            Dialog.chooseOption(lIllIIllIIlI[31]);
                            "".length();
                        }
                        String[] strArr3 = new String[lIllIIllIIlI[29]];
                        strArr3[lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[43]];
                        Inventory.getFirst(strArr3).interact(lIllIIllIIIl[lIllIIllIIlI[44]]);
                        return lIllIIllIIlI[29];
                    }
                }
                Movement.walkTo(this.aB);
                "".length();
                return lIllIIllIIlI[29];
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.AbstractC0013n
    public boolean run() {
        return lllIIlIlllIlII(this.aq.p() ? 1 : 0) ? lIllIIllIIlI[2] : R();
    }

    static {
        lllIIlIlllIIll();
        lllIIlIlllIIlI();
        ap = lIllIIllIIlI[42];
    }

    private static String lllIIlIllIllll(String lllllllllllllllIllIIIIIlIlllllII, String lllllllllllllllIllIIIIIlIllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlIllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIIIlIllllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIIIlIllllllI.init(lIllIIllIIlI[31], secretKeySpec);
            return new String(lllllllllllllllIllIIIIIlIllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIlIlllllIl) {
            lllllllllllllllIllIIIIIlIlllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlIlllIlII(int i) {
        return i != 0;
    }

    private static boolean lllIIlIlllIllI(Object obj) {
        return obj == null;
    }

    private static boolean lllIIlIllllIII(int i, int i2) {
        return i == i2;
    }

    @Inject
    public C0015p(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aq = squireDukeSucellus;
        this.ar = squireDukeSucellus.s();
        this.as = squireDukeSucellusConfig;
    }

    private static boolean lllIIlIlllIlll(Object obj) {
        return obj != null;
    }

    private static void lllIIlIlllIIll() {
        lIllIIllIIlI = new int[46];
        lIllIIllIIlI[0] = (-8291) & 11127;
        lIllIIllIIlI[1] = (-28673) & 32599;
        lIllIIllIIlI[2] = ((181 ^ 187) ^ (130 ^ 170)) & (((123 ^ 95) ^ "  ".length()) ^ (-" ".length()));
        lIllIIllIIlI[3] = (-((-4385) & 30077)) & (-4097) & 32639;
        lIllIIllIIlI[4] = (-(((8 + 112) - 23) + 33)) & (-24583) & 28655;
        lIllIIllIIlI[5] = (-((-770) & 14173)) & (-16513) & 32767;
        lIllIIllIIlI[6] = (-28709) & 32639;
        lIllIIllIIlI[7] = (-29825) & 32690;
        lIllIIllIIlI[8] = (-4097) & 8037;
        lIllIIllIIlI[9] = (-((-2145) & 30821)) & (-130) & 32735;
        lIllIIllIIlI[10] = (-13441) & 16319;
        lIllIIllIIlI[11] = (-((-11541) & 15637)) & (-129) & 8167;
        lIllIIllIIlI[12] = (-1185) & 4009;
        lIllIIllIIlI[13] = (-((-18445) & 24495)) & (-9) & 16382;
        lIllIIllIIlI[14] = (-12429) & 15295;
        lIllIIllIIlI[15] = (-1417) & 11774;
        lIllIIllIIlI[16] = (-21638) & 24533;
        lIllIIllIIlI[17] = (-21382) & 31711;
        lIllIIllIIlI[18] = (-((-19222) & 24471)) & (-16387) & 24571;
        lIllIIllIIlI[19] = (-1033) & 11389;
        lIllIIllIIlI[20] = (-((-16411) & 29759)) & (-16387) & 32758;
        lIllIIllIIlI[21] = (-((-443) & 2043)) & (-8337) & 16350;
        lIllIIllIIlI[22] = (-25617) & 28670;
        lIllIIllIIlI[23] = (-((-1027) & 9431)) & (-1033) & 15869;
        lIllIIllIIlI[24] = (-17) & 2943;
        lIllIIllIIlI[25] = (-"   ".length()) & (-1669) & 12023;
        lIllIIllIIlI[26] = (-17923) & 28263;
        lIllIIllIIlI[27] = (-13313) & 16351;
        lIllIIllIIlI[28] = (-((-20353) & 28551)) & (-65) & 14679;
        lIllIIllIIlI[29] = " ".length();
        lIllIIllIIlI[30] = (-27149) & 60382;
        lIllIIllIIlI[31] = "  ".length();
        lIllIIllIIlI[32] = "   ".length();
        lIllIIllIIlI[33] = (-((-12445) & 14749)) & (-16417) & 65535;
        lIllIIllIIlI[34] = (-170) & 46827;
        lIllIIllIIlI[35] = 33 ^ 37;
        lIllIIllIIlI[36] = (39 ^ 100) ^ (135 ^ 193);
        lIllIIllIIlI[37] = 131 ^ 133;
        lIllIIllIIlI[38] = (69 ^ 8) ^ (196 ^ 142);
        lIllIIllIIlI[39] = 46 ^ 38;
        lIllIIllIIlI[40] = (-5) & 49142;
        lIllIIllIIlI[41] = (119 ^ 89) ^ (38 ^ 1);
        lIllIIllIIlI[42] = (-((-13059) & 14275)) & (-16402) & 32759;
        lIllIIllIIlI[43] = (96 ^ 68) ^ (48 ^ 30);
        lIllIIllIIlI[44] = (128 ^ 147) ^ (218 ^ 194);
        lIllIIllIIlI[45] = 184 ^ 180;
    }

    private static boolean lllIIlIlllIlIl(int i) {
        return i == 0;
    }

    private void a(String str, String str2, int i, Player player) {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIIlIllllIII(tileObject.getId(), i) && lllIIlIlllIlII(tileObject.getName().equals(str) ? 1 : 0)) {
                String[] strArr = new String[lIllIIllIIlI[29]];
                strArr[lIllIIllIIlI[2]] = str2;
                if (lllIIlIlllIlII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIllIIlI[29];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                }
            }
            return lIllIIllIIlI[2];
        });
        if (lllIIlIlllIllI(nearest) || lllIIlIlllIlII(player.isMoving() ? 1 : 0)) {
            return;
        }
        nearest.interact(str2);
    }
}
