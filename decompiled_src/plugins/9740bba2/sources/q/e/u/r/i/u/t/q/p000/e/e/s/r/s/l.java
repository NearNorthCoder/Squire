package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.pathfinder.Walker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Collecting Items")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.l  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/l.class */
public class l extends Task {
    private static /* synthetic */ int[] lIIIllIlIllIl;
    private static /* synthetic */ String[] lIIIllIlIllII;
    private static final /* synthetic */ Logger ag;
    private final /* synthetic */ Client ah;
    private final /* synthetic */ SquireQuesterConfig ai;

    private int a(int i) {
        Client client = this.ah;
        Object[] objArr = new Object[lIIIllIlIllIl[8]];
        objArr[lIIIllIlIllIl[0]] = Integer.valueOf(lIIIllIlIllIl[21]);
        objArr[lIIIllIlIllIl[1]] = Integer.valueOf(i);
        client.runScript(objArr);
        return this.ah.getIntStack()[lIIIllIlIllIl[0]];
    }

    private static String lIlIIIlIlIlllII(String lllllllllllllllIIIIlIIIIllIIIlIl, String lllllllllllllllIIIIlIIIIllIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIIllIIIlII.getBytes(StandardCharsets.UTF_8)), lIIIllIlIllIl[22]), "DES");
            Cipher lllllllllllllllIIIIlIIIIllIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIIIllIIIlll.init(lIIIllIlIllIl[8], secretKeySpec);
            return new String(lllllllllllllllIIIIlIIIIllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIIIllIIIllI) {
            lllllllllllllllIIIIlIIIIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIlIllIIlII(Object obj) {
        return obj != null;
    }

    @Inject
    public l(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.ah = client;
        this.ai = squireQuesterConfig;
    }

    private static boolean lIlIIIlIllIIIlI(int i) {
        return i == 0;
    }

    private static String lIlIIIlIlIlllIl(String lllllllllllllllIIIIlIIIIllIllIlI, String lllllllllllllllIIIIlIIIIllIllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIlIIIIllIlIlll = lllllllllllllllIIIIlIIIIllIllIIl.toCharArray();
        int lllllllllllllllIIIIlIIIIllIlIllI = lIIIllIlIllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIllIlIllIl[0];
        while (lIlIIIlIllIIlIl(i, length)) {
            char lllllllllllllllIIIIlIIIIllIllIll = charArray[i];
            sb.append((char) (lllllllllllllllIIIIlIIIIllIllIll ^ lllllllllllllllIIIIlIIIIllIlIlll[lllllllllllllllIIIIlIIIIllIlIllI % lllllllllllllllIIIIlIIIIllIlIlll.length]));
            "".length();
            lllllllllllllllIIIIlIIIIllIlIllI++;
            i++;
            "".length();
            if ("   ".length() == ((89 ^ 77) ^ (140 ^ 156))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIIlIllIIlll(int i, int i2) {
        return i > i2;
    }

    private static void lIlIIIlIlIlllll() {
        lIIIllIlIllIl = new int[29];
        lIIIllIlIllIl[0] = "  ".length() & ("  ".length() ^ (-" ".length()));
        lIIIllIlIllIl[1] = " ".length();
        lIIIllIlIllIl[2] = (-((-12498) & 31967)) & (-4097) & 24511;
        lIIIllIlIllIl[3] = (-4915) & 8119;
        lIIIllIlIllIl[4] = (-(247 ^ 147)) & (-13057) & 16367;
        lIIIllIlIllIl[5] = (-((-7961) & 24377)) & (-13081) & 32702;
        lIIIllIlIllIl[6] = (-4770) & 6911;
        lIIIllIlIllIl[7] = (-25098) & 27231;
        lIIIllIlIllIl[8] = "  ".length();
        lIIIllIlIllIl[9] = "   ".length();
        lIIIllIlIllIl[10] = (11 ^ 82) ^ (57 ^ 100);
        lIIIllIlIllIl[11] = (-369) & 3579;
        lIIIllIlIllIl[12] = (-13057) & 16271;
        lIIIllIlIllIl[13] = (-((-14283) & 30687)) & (-9) & 17407;
        lIIIllIlIllIl[14] = (241 ^ 166) ^ (81 ^ 9);
        lIIIllIlIllIl[15] = (-1) & 22521;
        lIIIllIlIllIl[16] = 119 ^ 114;
        lIIIllIlIllIl[17] = (-((-1283) & 18403)) & (-1049) & 20477;
        lIIIllIlIllIl[18] = (136 ^ 192) ^ (69 ^ 11);
        lIIIllIlIllIl[19] = (-17467) & 20479;
        lIIIllIlIllIl[20] = (((88 + 110) - 41) + 2) ^ (((69 + 31) - 5) + 57);
        lIIIllIlIllIl[21] = (-28673) & 32696;
        lIIIllIlIllIl[22] = 28 ^ 20;
        lIIIllIlIllIl[23] = (84 ^ 46) ^ (55 ^ 68);
        lIIIllIlIllIl[24] = (((169 + 97) - 87) + 4) ^ (((156 + 124) - 190) + 99);
        lIIIllIlIllIl[25] = (176 ^ 192) ^ (239 ^ 148);
        lIIIllIlIllIl[26] = (-((-17543) & 22255)) & (-24578) & 32511;
        lIIIllIlIllIl[27] = (-((-9251) & 13935)) & (-257) & 8159;
        lIIIllIlIllIl[28] = 146 ^ 158;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v161, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (!lIlIIIlIllIIIII(this.ai.quest(), h.BELOW_ICE_MOUNTAIN) && !lIlIIIlIllIIIIl(a(Quest.BELOW_ICE_MOUNTAIN.getId()))) {
            int[] iArr = new int[lIIIllIlIllIl[1]];
            iArr[lIIIllIlIllIl[0]] = lIIIllIlIllIl[2];
            if (lIlIIIlIllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                WorldPoint worldPoint = new WorldPoint(lIIIllIlIllIl[3], lIIIllIlIllIl[4], lIIIllIlIllIl[0]);
                int[] iArr2 = new int[lIIIllIlIllIl[1]];
                iArr2[lIIIllIlIllIl[0]] = lIIIllIlIllIl[2];
                TileItem firstAt = TileItems.getFirstAt(worldPoint, iArr2);
                if (lIlIIIlIllIIIll(firstAt)) {
                    Walker.walkTo(new WorldPoint(lIIIllIlIllIl[5], lIIIllIlIllIl[4], lIIIllIlIllIl[0]));
                    "".length();
                    "".length();
                    if ((-" ".length()) >= ((191 ^ 154) & ((172 ^ 137) ^ (-1)))) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    firstAt.interact(lIIIllIlIllII[lIIIllIlIllIl[0]]);
                }
            }
            int[] iArr3 = new int[lIIIllIlIllIl[1]];
            iArr3[lIIIllIlIllIl[0]] = lIIIllIlIllIl[6];
            if (lIlIIIlIllIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIIllIlIllIl[1]];
                iArr4[lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
                if (lIlIIIlIllIIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                    String[] strArr = new String[lIIIllIlIllIl[1]];
                    strArr[lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[1]];
                    NPC nearest = NPCs.getNearest(strArr);
                    int[] iArr5 = new int[lIIIllIlIllIl[1]];
                    iArr5[lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
                    TileItem nearest2 = TileItems.getNearest(iArr5);
                    if (!lIlIIIlIllIIIll(nearest2)) {
                        nearest2.interact(lIIIllIlIllII[lIIIllIlIllIl[9]]);
                    } else if (lIlIIIlIllIIlII(nearest)) {
                        nearest.interact(lIIIllIlIllII[lIIIllIlIllIl[8]]);
                        "".length();
                        if ((((((22 + 55) - 60) + 135) ^ (((84 + 91) - 30) + 46)) & (((177 ^ 187) ^ (5 ^ 40)) ^ (-" ".length()))) != 0) {
                            return ((120 ^ 36) ^ (218 ^ 175)) & (((((16 + 56) - (-17)) + 55) ^ (((135 + 77) - 163) + 136)) ^ (-" ".length()));
                        }
                    }
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    String[] strArr2 = new String[lIIIllIlIllIl[1]];
                    strArr2[lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[10]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (lIlIIIlIllIIIll(nearest3)) {
                        Walker.walkTo(new WorldPoint(lIIIllIlIllIl[11], lIIIllIlIllIl[12], lIIIllIlIllIl[0]));
                        "".length();
                        "".length();
                        if (0 != 0) {
                            return ((84 ^ 23) ^ (53 ^ 62)) & (((56 ^ 68) ^ (189 ^ 137)) ^ (-" ".length()));
                        }
                    } else {
                        int[] iArr6 = new int[lIIIllIlIllIl[1]];
                        iArr6[lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
                        Inventory.getFirst(iArr6).useOn(nearest3);
                    }
                }
            }
            int[] iArr7 = new int[lIIIllIlIllIl[1]];
            iArr7[lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
            if (lIlIIIlIllIIIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                x();
            }
            ?? r0 = lIIIllIlIllIl[1];
            int[] iArr8 = new int[lIIIllIlIllIl[1]];
            iArr8[lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
            if (lIlIIIlIllIIlIl(Inventory.getCount((boolean) r0, iArr8), lIIIllIlIllIl[14])) {
                int[] iArr9 = new int[lIIIllIlIllIl[1]];
                iArr9[lIIIllIlIllIl[0]] = lIIIllIlIllIl[15];
                if (lIlIIIlIllIIIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIllIlIllIl[1]];
                    iArr10[lIIIllIlIllIl[0]] = lIIIllIlIllIl[15];
                    Inventory.getFirst(iArr10).interact(lIIIllIlIllII[lIIIllIlIllIl[16]]);
                }
                x();
            }
            int[] iArr11 = new int[lIIIllIlIllIl[1]];
            iArr11[lIIIllIlIllIl[0]] = lIIIllIlIllIl[17];
            if (lIlIIIlIllIIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                ?? r02 = lIIIllIlIllIl[1];
                int[] iArr12 = new int[lIIIllIlIllIl[1]];
                iArr12[lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
                if (lIlIIIlIllIIllI(Inventory.getCount((boolean) r02, iArr12), lIIIllIlIllIl[14])) {
                    String[] strArr3 = new String[lIIIllIlIllIl[1]];
                    strArr3[lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[18]];
                    NPC nearest4 = NPCs.getNearest(strArr3);
                    if (lIlIIIlIllIIIIl(Shop.isOpen() ? 1 : 0)) {
                        Shop.buyOne(lIIIllIlIllIl[17]);
                        "".length();
                        if ((((39 ^ 62) ^ (137 ^ 165)) & (((102 ^ 41) ^ (203 ^ 177)) ^ (-" ".length()))) != 0) {
                            return ((((66 + 0) - (-76)) + 87) ^ (((144 + 95) - 64) + 18)) & (((27 ^ 6) ^ (106 ^ 83)) ^ (-" ".length()));
                        }
                    } else if (lIlIIIlIllIIIll(nearest4)) {
                        Walker.walkTo(new WorldPoint(lIIIllIlIllIl[19], lIIIllIlIllIl[3], lIIIllIlIllIl[0]));
                        "".length();
                        "".length();
                        if ((((((187 + 101) - 158) + 82) ^ (((71 + 104) - 174) + 139)) & (((((90 + 164) - 153) + 145) ^ (((78 + 75) - 151) + 172)) ^ (-" ".length()))) >= ((83 ^ 46) ^ (53 ^ 76))) {
                            return ((211 ^ 128) ^ (226 ^ 174)) & (((((49 + 56) - 45) + 128) ^ (((11 + 24) - (-104)) + 24)) ^ (-" ".length()));
                        }
                    } else {
                        nearest4.interact(lIIIllIlIllII[lIIIllIlIllIl[20]]);
                    }
                }
            }
            return lIIIllIlIllIl[0];
        }
        return lIIIllIlIllIl[0];
    }

    private static boolean lIlIIIlIllIIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIlIllIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIlIIIlIlIllllI() {
        lIIIllIlIllII = new String[lIIIllIlIllIl[28]];
        lIIIllIlIllII[lIIIllIlIllIl[0]] = lIlIIIlIlIlllII("S0JyPn/DLeQ=", "KKakj");
        lIIIllIlIllII[lIIIllIlIllIl[1]] = lIlIIIlIlIlllII("YNgCMCe5jcs8h7Xb/18ztw==", "oCXgL");
        lIIIllIlIllII[lIIIllIlIllIl[8]] = lIlIIIlIlIlllIl("AxECLQAp", "BevLc");
        lIIIllIlIllII[lIIIllIlIllIl[9]] = lIlIIIlIlIlllII("Azha12nCLMk=", "Kunwn");
        lIIIllIlIllII[lIIIllIlIllIl[10]] = lIlIIIlIlIlllII("M41gr1j4D13G8bb6uIO5Cg==", "zrmlv");
        lIIIllIlIllII[lIIIllIlIllIl[16]] = lIlIIIlIlIlllIl("CCE9P38mPTQ=", "GQXQR");
        lIIIllIlIllII[lIIIllIlIllIl[18]] = lIlIIIlIlIlllIl("Mh8mEAM=", "efBym");
        lIIIllIlIllII[lIIIllIlIllIl[20]] = lIlIIIlIlIlllIl("AhktHQc=", "VkLyb");
        lIIIllIlIllII[lIIIllIlIllIl[22]] = lIlIIIlIlIlllII("F9o4clHXcN8=", "QtASy");
        lIIIllIlIllII[lIIIllIlIllIl[23]] = lIlIIIlIlIlllII("roWpDAp5+ZQ=", "JIvEH");
        lIIIllIlIllII[lIIIllIlIllIl[24]] = lIlIIIlIlIlllIl("PB0mOjcDFy40Mw==", "ltEQG");
        lIIIllIlIllII[lIIIllIlIllIl[25]] = lIlIIIlIlIlllIl("PwVvPQEQBjs9SFEdLjwQGAQodRAeSicwBR0=", "qjOUd");
    }

    static {
        lIlIIIlIlIlllll();
        lIlIIIlIlIllllI();
        ag = LoggerFactory.getLogger(l.class);
    }

    private static boolean lIlIIIlIllIIIll(Object obj) {
        return obj == null;
    }

    private void x() {
        String[] strArr = new String[lIIIllIlIllIl[8]];
        strArr[lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[22]];
        strArr[lIIIllIlIllIl[1]] = lIIIllIlIllII[lIIIllIlIllIl[23]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIlIIIlIllIIlII(nearest)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIllIl[26], lIIIllIlIllIl[27], lIIIllIlIllIl[0]));
            "".length();
        } else if (lIlIIIlIllIIlll(Combat.getCurrentHealth(), lIIIllIlIllIl[8])) {
            nearest.interact(lIIIllIlIllII[lIIIllIlIllIl[24]]);
            "".length();
            if ((true ^ true) && ((true ^ true) ^ true)) {
            }
        } else {
            System.out.println(lIIIllIlIllII[lIIIllIlIllIl[25]]);
            "".length();
            if ((((3 ^ 82) ^ (126 ^ 23)) & (((48 ^ 29) ^ (6 ^ 19)) ^ (-" ".length()))) != 0) {
            }
        }
    }

    private static boolean lIlIIIlIllIIIIl(int i) {
        return i != 0;
    }
}
