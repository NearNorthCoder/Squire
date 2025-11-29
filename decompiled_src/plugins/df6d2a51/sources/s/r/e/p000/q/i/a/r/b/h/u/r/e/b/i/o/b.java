package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.b  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/b.class */
public class b {
    public static final /* synthetic */ String k;
    public static final /* synthetic */ List<WorldPoint> m;
    @Inject
    private /* synthetic */ i n;
    private static /* synthetic */ int[] lllIIllllIlI;
    public static final /* synthetic */ List<Integer> l;
    private static /* synthetic */ String[] lllIIllllIIl;

    private static String lIIIlIllIIlIlII(String lllllllllllllllIIllIIlIlllllllll, String lllllllllllllllIIllIIlIllllllllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllllllllI.getBytes(StandardCharsets.UTF_8)), lllIIllllIlI[33]), "DES");
            Cipher lllllllllllllllIIllIIllIIIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIllIIIIIIIIl.init(lllIIllllIlI[2], lllllllllllllllIIllIIllIIIIIIIlI);
            return new String(lllllllllllllllIIllIIllIIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllIIIIIIIII) {
            lllllllllllllllIIllIIllIIIIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllIIlllII(int i) {
        return i == 0;
    }

    private static boolean lIIIlIllIIlllIl(int i) {
        return i > 0;
    }

    private static boolean lIIIlIllIIllIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIlIllIIllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIllIIllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlIllIIlIlll(Object obj) {
        return obj == null;
    }

    private static void lIIIlIllIIlIlIl() {
        lllIIllllIIl = new String[lllIIllllIlI[13]];
        lllIIllllIIl[lllIIllllIlI[0]] = lIIIlIllIIlIIlI("jOU1EoAc8m0/c8IU1mrUog==", "WIOjD");
        lllIIllllIIl[lllIIllllIlI[1]] = lIIIlIllIIlIIll("HiMHBTM0OQ==", "WMtuV");
        lllIIllllIIl[lllIIllllIlI[2]] = lIIIlIllIIlIlII("Yshhd/wkrfw=", "jMBRA");
        lllIIllllIIl[lllIIllllIlI[7]] = lIIIlIllIIlIIlI("tzzl9gedERi18f6oE48nHg==", "KirJM");
    }

    public a h() {
        a[] values = a.values();
        int length = values.length;
        int i = lllIIllllIlI[0];
        while (lIIIlIllIIllIII(i, length)) {
            a aVar = values[i];
            int bit = Vars.getBit(aVar.b());
            if (!lIIIlIllIIllIIl(bit, lllIIllllIlI[1]) || lIIIlIllIIllIlI(bit, lllIIllllIlI[2])) {
                aVar.a(bit);
                return aVar;
            }
            aVar.a(lllIIllllIlI[3]);
            i++;
            "".length();
            if (((232 ^ 160) ^ (126 ^ 50)) == " ".length()) {
                return null;
            }
        }
        return null;
    }

    private static boolean lIIIlIllIIllllI(int i, int i2) {
        return i > i2;
    }

    public c i() {
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().equals(lllIIllllIIl[lllIIllllIlI[0]]);
        });
        if (lIIIlIllIIllIll(nearest) && lIIIlIllIIllIIl(nearest.getAnimation(), lllIIllllIlI[4])) {
            return c.HARVESTING;
        }
        g F = this.n.F();
        this.n.E();
        int G = this.n.G();
        if (lIIIlIllIIlIlll(F) && lIIIlIllIIlllII(G)) {
            return c.STARTING;
        }
        if (lIIIlIllIIlllIl(Vars.getBit(lllIIllllIlI[5]))) {
            return c.FINISHING;
        }
        a h = h();
        if (lIIIlIllIIlIlll(h)) {
            return c.STARTING;
        }
        WorldPoint[] d = h.d();
        WorldPoint worldPoint = d[lllIIllllIlI[0]];
        if (lIIIlIllIIlIlll(worldPoint)) {
            worldPoint = d[lllIIllllIlI[1]];
        }
        return lIIIlIllIIllllI(worldPoint.distanceTo(Players.getLocal()), lllIIllllIlI[6]) ? c.PATHING : c.INSPECTING;
    }

    private static boolean lIIIlIllIIlllll(int i) {
        return i != 0;
    }

    static {
        lIIIlIllIIlIllI();
        lIIIlIllIIlIlIl();
        k = lllIIllllIIl[lllIIllllIlI[7]];
        Integer[] numArr = new Integer[lllIIllllIlI[8]];
        numArr[lllIIllllIlI[0]] = Integer.valueOf(lllIIllllIlI[9]);
        numArr[lllIIllllIlI[1]] = Integer.valueOf(lllIIllllIlI[10]);
        numArr[lllIIllllIlI[2]] = Integer.valueOf(lllIIllllIlI[11]);
        numArr[lllIIllllIlI[7]] = Integer.valueOf(lllIIllllIlI[12]);
        numArr[lllIIllllIlI[13]] = Integer.valueOf(lllIIllllIlI[14]);
        l = Arrays.asList(numArr);
        WorldPoint[] worldPointArr = new WorldPoint[lllIIllllIlI[15]];
        worldPointArr[lllIIllllIlI[0]] = new WorldPoint(lllIIllllIlI[16], lllIIllllIlI[17], lllIIllllIlI[0]);
        worldPointArr[lllIIllllIlI[1]] = new WorldPoint(lllIIllllIlI[18], lllIIllllIlI[19], lllIIllllIlI[0]);
        worldPointArr[lllIIllllIlI[2]] = new WorldPoint(lllIIllllIlI[20], lllIIllllIlI[21], lllIIllllIlI[0]);
        worldPointArr[lllIIllllIlI[7]] = new WorldPoint(lllIIllllIlI[22], lllIIllllIlI[23], lllIIllllIlI[0]);
        worldPointArr[lllIIllllIlI[13]] = new WorldPoint(lllIIllllIlI[24], lllIIllllIlI[25], lllIIllllIlI[0]);
        worldPointArr[lllIIllllIlI[8]] = new WorldPoint(lllIIllllIlI[26], lllIIllllIlI[27], lllIIllllIlI[0]);
        worldPointArr[lllIIllllIlI[28]] = new WorldPoint(lllIIllllIlI[29], lllIIllllIlI[30], lllIIllllIlI[0]);
        worldPointArr[lllIIllllIlI[6]] = new WorldPoint(lllIIllllIlI[31], lllIIllllIlI[32], lllIIllllIlI[0]);
        worldPointArr[lllIIllllIlI[33]] = new WorldPoint(lllIIllllIlI[34], lllIIllllIlI[35], lllIIllllIlI[0]);
        m = Arrays.asList(worldPointArr);
    }

    private static String lIIIlIllIIlIIlI(String lllllllllllllllIIllIIllIIIIIllII, String lllllllllllllllIIllIIllIIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllIIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllIIIIIlllI.init(lllIIllllIlI[2], lllllllllllllllIIllIIllIIIIIllll);
            return new String(lllllllllllllllIIllIIllIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllIIIIIllIl) {
            lllllllllllllllIIllIIllIIIIIllIl.printStackTrace();
            return null;
        }
    }

    public TileObject a(WorldPoint worldPoint) {
        if (lIIIlIllIIlIlll(worldPoint)) {
            return null;
        }
        return TileObjects.getFirstAt(worldPoint, tileObject -> {
            if (lIIIlIllIIlllll(tileObject.getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                String[] strArr = new String[lllIIllllIlI[2]];
                strArr[lllIIllllIlI[0]] = lllIIllllIIl[lllIIllllIlI[1]];
                strArr[lllIIllllIlI[1]] = lllIIllllIIl[lllIIllllIlI[2]];
                if (lIIIlIllIIlllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllIIllllIlI[1];
                    "".length();
                    return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lllIIllllIlI[0];
        });
    }

    private static boolean lIIIlIllIIllIll(Object obj) {
        return obj != null;
    }

    private static String lIIIlIllIIlIIll(String lllllllllllllllIIllIIllIIIlIIIIl, String lllllllllllllllIIllIIllIIIlIIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllIIIIlllll = new StringBuilder();
        char[] lllllllllllllllIIllIIllIIIIllllI = lllllllllllllllIIllIIllIIIlIIIII.toCharArray();
        int lllllllllllllllIIllIIllIIIIlllIl = lllIIllllIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIllllIlI[0];
        while (lIIIlIllIIllIII(i, length)) {
            lllllllllllllllIIllIIllIIIIlllll.append((char) (charArray[i] ^ lllllllllllllllIIllIIllIIIIllllI[lllllllllllllllIIllIIllIIIIlllIl % lllllllllllllllIIllIIllIIIIllllI.length]));
            "".length();
            lllllllllllllllIIllIIllIIIIlllIl++;
            i++;
            "".length();
            if ((-(10 ^ 14)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIllIIIIlllll);
    }

    private static void lIIIlIllIIlIllI() {
        lllIIllllIlI = new int[36];
        lllIIllllIlI[0] = (130 ^ 134) & ((63 ^ 59) ^ (-1));
        lllIIllllIlI[1] = " ".length();
        lllIIllllIlI[2] = "  ".length();
        lllIIllllIlI[3] = -" ".length();
        lllIIllllIlI[4] = (-(((65 + 80) - 67) + 147)) & (-24853) & 32766;
        lllIIllllIlI[5] = (-((-16466) & 27003)) & (-65) & 16367;
        lllIIllllIlI[6] = (((17 + 177) - 94) + 82) ^ (((69 + 175) - 117) + 50);
        lllIIllllIlI[7] = "   ".length();
        lllIIllllIlI[8] = 128 ^ 133;
        lllIIllllIlI[9] = (-137) & 30655;
        lllIIllllIlI[10] = (-200) & 30719;
        lllIIllllIlI[11] = (-(((93 + 56) - 36) + 16)) & (-2119) & 32767;
        lllIIllllIlI[12] = (-2181) & 32702;
        lllIIllllIlI[13] = 34 ^ 38;
        lllIIllllIlI[14] = (-2053) & 32575;
        lllIIllllIlI[15] = 200 ^ 193;
        lllIIllllIlI[16] = (-((-2415) & 31231)) & (-259) & 32767;
        lllIIllllIlI[17] = (-((-1233) & 30202)) & (-1) & 32767;
        lllIIllllIlI[18] = (-((-577) & 25546)) & (-1) & 28671;
        lllIIllllIlI[19] = (-((-1449) & 30142)) & (-1) & 32501;
        lllIIllllIlI[20] = (-28681) & 32383;
        lllIIllllIlI[21] = (-((-3729) & 20382)) & (-8193) & 28671;
        lllIIllllIlI[22] = (-((-50) & 20787)) & (-8193) & 32639;
        lllIIllllIlI[23] = (-24721) & 28601;
        lllIIllllIlI[24] = (-24972) & 28671;
        lllIIllllIlI[25] = (-16475) & 20351;
        lllIIllllIlI[26] = (-((-3539) & 15859)) & (-16725) & 32759;
        lllIIllllIlI[27] = (-20590) & 24429;
        lllIIllllIlI[28] = (((21 + 43) - 48) + 129) ^ (((146 + 145) - 156) + 16);
        lllIIllllIlI[29] = (-((-1059) & 29811)) & (-257) & 32759;
        lllIIllllIlI[30] = (-((-1801) & 6123)) & (-8197) & 16367;
        lllIIllllIlI[31] = (-4105) & 7789;
        lllIIllllIlI[32] = (-(((156 + 107) - 84) + 14)) & (-35) & 4095;
        lllIIllllIlI[33] = 185 ^ 177;
        lllIIllllIlI[34] = (-((-3681) & 32767)) & (-1) & 32767;
        lllIIllllIlI[35] = (-((-5463) & 21855)) & (-12385) & 32639;
    }
}
